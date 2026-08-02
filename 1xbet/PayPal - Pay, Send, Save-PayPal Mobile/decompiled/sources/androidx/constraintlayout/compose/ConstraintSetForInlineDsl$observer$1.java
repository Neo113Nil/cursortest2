package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "p0", "getHighSpeedVideoSizes", "(Lkotlin/jvm/functions/Function0;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ConstraintSetForInlineDsl$observer$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function0<? extends kotlin.Unit>, kotlin.Unit> {
    final /* synthetic */ androidx.constraintlayout.compose.ConstraintSetForInlineDsl Camera2StreamConfigurationMap;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function0<? extends kotlin.Unit> function0) {
        getHighSpeedVideoSizes(function0);
        return kotlin.Unit.INSTANCE;
    }

    public final void getHighSpeedVideoSizes(final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        android.os.Handler handler;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            handler = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            if (handler == null) {
                handler = new android.os.Handler(android.os.Looper.getMainLooper());
                this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor = handler;
            }
            handler.post(new java.lang.Runnable() { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$observer$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    kotlin.jvm.functions.Function0.this.invoke();
                }
            });
            return;
        }
        function0.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConstraintSetForInlineDsl$observer$1(androidx.constraintlayout.compose.ConstraintSetForInlineDsl constraintSetForInlineDsl) {
        super(1);
        this.Camera2StreamConfigurationMap = constraintSetForInlineDsl;
    }
}
