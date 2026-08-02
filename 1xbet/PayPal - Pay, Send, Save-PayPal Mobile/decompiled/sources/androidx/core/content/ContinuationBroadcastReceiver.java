package androidx.core.content;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B4\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u001f\u0010\b\u001a\u001b\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR-\u0010\u0010\u001a\u001b\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/core/content/ContinuationBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Lkotlin/coroutines/Continuation;", "p0", "Lkotlin/Function2;", "Landroid/content/Intent;", "", "Lkotlin/ExtensionFunctionType;", "p1", "<init>", "(Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function2;)V", "Landroid/content/Context;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function2;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Lkotlin/coroutines/Continuation;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ContinuationBroadcastReceiver extends android.content.BroadcastReceiver {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<android.content.BroadcastReceiver, android.content.Intent, kotlin.Unit> Camera2StreamConfigurationMap;
    private kotlin.coroutines.Continuation<?> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationBroadcastReceiver(kotlin.coroutines.Continuation<?> continuation, kotlin.jvm.functions.Function2<? super android.content.BroadcastReceiver, ? super android.content.Intent, kotlin.Unit> function2) {
        this.Camera2StreamConfigurationMap = function2;
        this.getHighSpeedVideoSizes = continuation;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context p0, android.content.Intent p1) {
        try {
            this.Camera2StreamConfigurationMap.invoke(this, p1);
        } catch (java.lang.Throwable th) {
            kotlin.coroutines.Continuation<?> continuation = this.getHighSpeedVideoSizes;
            if (continuation == null) {
                throw th;
            }
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th)));
            this.getHighSpeedVideoSizes = null;
        }
    }
}
