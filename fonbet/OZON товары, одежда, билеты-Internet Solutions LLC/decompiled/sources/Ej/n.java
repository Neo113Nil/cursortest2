package Ej;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8016b;

    public /* synthetic */ n(Object obj, int i11) {
        this.f8015a = i11;
        this.f8016b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8015a) {
            case 0:
                o.b((o) this.f8016b);
                break;
            case 1:
                C2.r callback = (C2.r) this.f8016b;
                Intrinsics.checkNotNullParameter(callback, "$callback");
                callback.onResult(null);
                break;
            case 2:
                ((Function0) this.f8016b).invoke();
                break;
            case 3:
                ((io.sentry.android.core.internal.util.a) this.f8016b).s0(false);
                break;
            default:
                io.sentry.android.replay.screenshot.c.f((io.sentry.android.replay.screenshot.c) this.f8016b);
                break;
        }
    }
}
