package financial.atomic.muppet.a;

/* loaded from: classes17.dex */
public final class h0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.SafeContinuation f6771a;

    public h0(kotlin.coroutines.SafeContinuation safeContinuation) {
        this.f6771a = safeContinuation;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(java.lang.Object obj) {
        kotlin.coroutines.SafeContinuation safeContinuation = this.f6771a;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        safeContinuation.resumeWith(kotlin.Result.m23436constructorimpl((java.lang.Boolean) obj));
    }
}
