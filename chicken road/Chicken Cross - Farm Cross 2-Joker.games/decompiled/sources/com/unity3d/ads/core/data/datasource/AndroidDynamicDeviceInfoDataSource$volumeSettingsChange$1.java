package com.unity3d.ads.core.data.datasource;

import android.database.ContentObserver;
import android.provider.Settings;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* compiled from: AndroidDynamicDeviceInfoDataSource.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1", f = "AndroidDynamicDeviceInfoDataSource.kt", i = {}, l = {654}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 extends SuspendLambda implements Function2<ProducerScope<? super VolumeSettingsChange>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidDynamicDeviceInfoDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, Continuation<? super AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1> continuation) {
        super(2, continuation);
        this.this$0 = androidDynamicDeviceInfoDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1 = new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this.this$0, continuation);
        androidDynamicDeviceInfoDataSource$volumeSettingsChange$1.L$0 = obj;
        return androidDynamicDeviceInfoDataSource$volumeSettingsChange$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super VolumeSettingsChange> producerScope, Continuation<? super Unit> continuation) {
        return ((AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        double streamVolume;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final Ref.DoubleRef doubleRef = new Ref.DoubleRef();
            streamVolume = this.this$0.getStreamVolume(3);
            doubleRef.element = streamVolume;
            ProducerScope producerScope2 = producerScope;
            ChannelsKt.trySendBlocking(producerScope2, new VolumeSettingsChange.VolumeChange(doubleRef.element));
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = this.this$0.getRingerMode();
            ChannelsKt.trySendBlocking(producerScope2, new VolumeSettingsChange.MuteChange(intRef.element == 0));
            final AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource = this.this$0;
            final ?? r3 = new ContentObserver() { // from class: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(null);
                }

                @Override // android.database.ContentObserver
                public void onChange(boolean selfChange) {
                    double streamVolume2;
                    super.onChange(selfChange);
                    streamVolume2 = AndroidDynamicDeviceInfoDataSource.this.getStreamVolume(3);
                    if (streamVolume2 != doubleRef.element) {
                        doubleRef.element = streamVolume2;
                        ChannelsKt.trySendBlocking(producerScope, new VolumeSettingsChange.VolumeChange(streamVolume2));
                    }
                    int ringerMode = AndroidDynamicDeviceInfoDataSource.this.getRingerMode();
                    if (ringerMode != intRef.element) {
                        intRef.element = ringerMode;
                        ChannelsKt.trySendBlocking(producerScope, new VolumeSettingsChange.MuteChange(ringerMode == 0));
                    }
                }
            };
            this.this$0.getContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, (ContentObserver) r3);
            final AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource2 = this.this$0;
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, new Function0() { // from class: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1.invokeSuspend$lambda$0(AndroidDynamicDeviceInfoDataSource.this, r3);
                    return invokeSuspend$lambda$0;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1) {
        androidDynamicDeviceInfoDataSource.getContext().getContentResolver().unregisterContentObserver(androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1);
        return Unit.INSTANCE;
    }
}
