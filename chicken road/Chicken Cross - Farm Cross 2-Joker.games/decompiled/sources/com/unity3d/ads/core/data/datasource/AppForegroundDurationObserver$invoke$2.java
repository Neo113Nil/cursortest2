package com.unity3d.ads.core.data.datasource;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: AppForegroundDurationObserver.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.datasource.AppForegroundDurationObserver$invoke$2", f = "AppForegroundDurationObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class AppForegroundDurationObserver$invoke$2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ AppForegroundDurationObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppForegroundDurationObserver$invoke$2(AppForegroundDurationObserver appForegroundDurationObserver, Continuation<? super AppForegroundDurationObserver$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = appForegroundDurationObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AppForegroundDurationObserver$invoke$2 appForegroundDurationObserver$invoke$2 = new AppForegroundDurationObserver$invoke$2(this.this$0, continuation);
        appForegroundDurationObserver$invoke$2.Z$0 = ((Boolean) obj).booleanValue();
        return appForegroundDurationObserver$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((AppForegroundDurationObserver$invoke$2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.Z$0) {
            this.this$0.onForeground();
        } else {
            this.this$0.onBackground();
        }
        return Unit.INSTANCE;
    }
}
