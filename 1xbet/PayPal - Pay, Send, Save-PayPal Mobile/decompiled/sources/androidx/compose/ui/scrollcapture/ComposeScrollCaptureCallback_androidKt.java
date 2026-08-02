package androidx.compose.ui.scrollcapture;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposeScrollCaptureCallback_androidKt {
    public static final /* synthetic */ kotlinx.coroutines.Job access$launchWithCancellationSignal(kotlinx.coroutines.CoroutineScope coroutineScope, final android.os.CancellationSignal cancellationSignal, kotlin.jvm.functions.Function2 function2) {
        final kotlinx.coroutines.Job launch$default;
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, function2, 3, null);
        launch$default.invokeOnCompletion(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                getHighSpeedVideoFpsRanges(th);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoFpsRanges(java.lang.Throwable th) {
                if (th != null) {
                    cancellationSignal.cancel();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt$$ExternalSyntheticLambda0
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(kotlinx.coroutines.Job.this, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
        });
        return launch$default;
    }
}
