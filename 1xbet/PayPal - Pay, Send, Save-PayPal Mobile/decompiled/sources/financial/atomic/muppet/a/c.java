package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class c implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.SafeContinuation f6755a;

    public c(kotlin.coroutines.SafeContinuation safeContinuation) {
        this.f6755a = safeContinuation;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(java.lang.Object obj) {
        kotlin.coroutines.SafeContinuation safeContinuation = this.f6755a;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        safeContinuation.resumeWith(kotlin.Result.m23436constructorimpl((java.lang.Boolean) obj));
    }
}
