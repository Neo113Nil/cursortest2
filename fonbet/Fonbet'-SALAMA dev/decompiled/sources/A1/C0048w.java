package A1;

import io.sentry.IScope;
import io.sentry.ScopeCallback;
import io.sentry.Scopes;
import io.sentry.hints.Retryable;
import io.sentry.util.HintUtils;

/* renamed from: A1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0048w implements v2.e, ScopeCallback, HintUtils.SentryConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f604b;

    public /* synthetic */ C0048w(boolean z4, int i7) {
        this.f603a = i7;
        this.f604b = z4;
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(Object obj) {
        switch (this.f603a) {
            case 6:
                ((Retryable) obj).setRetry(this.f604b);
                break;
            default:
                ((Retryable) obj).setRetry(this.f604b);
                break;
        }
    }

    @Override // v2.e
    public void invoke(Object obj) {
        z0 z0Var = (z0) obj;
        switch (this.f603a) {
            case 0:
                z0Var.p(this.f604b);
                break;
            case 1:
                z0Var.B(this.f604b);
                break;
            default:
                z0Var.B(this.f604b);
                break;
        }
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        switch (this.f603a) {
            case 3:
                Scopes.lambda$close$3(this.f604b, iScope);
                break;
            case 4:
                Scopes.lambda$close$4(this.f604b, iScope);
                break;
            default:
                Scopes.lambda$close$5(this.f604b, iScope);
                break;
        }
    }
}
