package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: AndroidInstallReferrerDataSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2", f = "AndroidInstallReferrerDataSource.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class AndroidInstallReferrerDataSource$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InitializationRequestOuterClass.InstallReferrer>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ AndroidInstallReferrerDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidInstallReferrerDataSource$invoke$2(AndroidInstallReferrerDataSource androidInstallReferrerDataSource, Continuation<? super AndroidInstallReferrerDataSource$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = androidInstallReferrerDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AndroidInstallReferrerDataSource$invoke$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InitializationRequestOuterClass.InstallReferrer> continuation) {
        return ((AndroidInstallReferrerDataSource$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final AndroidInstallReferrerDataSource androidInstallReferrerDataSource = this.this$0;
            this.L$0 = androidInstallReferrerDataSource;
            this.label = 1;
            AndroidInstallReferrerDataSource$invoke$2 androidInstallReferrerDataSource$invoke$2 = this;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(androidInstallReferrerDataSource$invoke$2), 1);
            cancellableContinuationImpl.initCancellability();
            final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            try {
                context = androidInstallReferrerDataSource.appContext;
                final InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
                build.startConnection(new InstallReferrerStateListener() { // from class: com.unity3d.ads.core.data.datasource.AndroidInstallReferrerDataSource$invoke$2$1$1
                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public void onInstallReferrerSetupFinished(int responseCode) {
                        CoroutineScope coroutineScope;
                        Job launch$default;
                        if (responseCode == 0) {
                            coroutineScope = AndroidInstallReferrerDataSource.this.scope;
                            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AndroidInstallReferrerDataSource$invoke$2$1$1$onInstallReferrerSetupFinished$job$1(build, AndroidInstallReferrerDataSource.this, cancellableContinuationImpl2, null), 3, null);
                            if (launch$default.isActive()) {
                                return;
                            }
                            try {
                                build.endConnection();
                            } catch (Throwable unused) {
                            }
                            AndroidInstallReferrerDataSource.this.onError(cancellableContinuationImpl2);
                            return;
                        }
                        try {
                            build.endConnection();
                        } catch (Throwable unused2) {
                        }
                        AndroidInstallReferrerDataSource.this.onError(cancellableContinuationImpl2);
                    }

                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public void onInstallReferrerServiceDisconnected() {
                        AndroidInstallReferrerDataSource.this.onError(cancellableContinuationImpl2);
                    }
                });
            } catch (Throwable unused) {
                androidInstallReferrerDataSource.onError(cancellableContinuationImpl2);
            }
            obj = cancellableContinuationImpl.getResult();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(androidInstallReferrerDataSource$invoke$2);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
