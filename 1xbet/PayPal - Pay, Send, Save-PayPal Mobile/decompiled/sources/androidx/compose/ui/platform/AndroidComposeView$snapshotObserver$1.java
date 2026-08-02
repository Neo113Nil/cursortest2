package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "p0", "getHighSpeedVideoFpsRanges", "(Lkotlin/jvm/functions/Function0;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AndroidComposeView$snapshotObserver$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function0<? extends kotlin.Unit>, kotlin.Unit> {
    final /* synthetic */ androidx.compose.ui.platform.AndroidComposeView getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function0<? extends kotlin.Unit> function0) {
        getHighSpeedVideoFpsRanges(function0);
        return kotlin.Unit.INSTANCE;
    }

    public final void getHighSpeedVideoFpsRanges(final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        final androidx.compose.ui.node.RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler = this.getHighSpeedVideoFpsRangesFor.getUncaughtExceptionHandler();
        if (uncaughtExceptionHandler != null) {
            function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$snapshotObserver$1$command$1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlin.Unit invoke() {
                    getHighSpeedVideoSizes();
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoSizes() {
                    try {
                        function0.invoke();
                    } catch (java.lang.Exception e) {
                        uncaughtExceptionHandler.onUncaughtException(e);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            };
        }
        android.os.Handler handler = this.getHighSpeedVideoFpsRangesFor.getHandler();
        if ((handler != null ? handler.getLooper() : null) == android.os.Looper.myLooper()) {
            function0.invoke();
            return;
        }
        android.os.Handler handler2 = this.getHighSpeedVideoFpsRangesFor.getHandler();
        if (handler2 != null) {
            handler2.post(new java.lang.Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$snapshotObserver$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.compose.ui.platform.AndroidComposeView$snapshotObserver$1.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function0.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidComposeView$snapshotObserver$1(androidx.compose.ui.platform.AndroidComposeView androidComposeView) {
        super(1);
        this.getHighSpeedVideoFpsRangesFor = androidComposeView;
    }
}
