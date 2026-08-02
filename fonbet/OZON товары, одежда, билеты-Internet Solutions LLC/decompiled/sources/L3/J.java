package L3;

import L3.K;
import io.sentry.A1;
import io.sentry.W2;
import t3.C9737c;
import v3.o;

/* loaded from: classes.dex */
public final /* synthetic */ class J implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16270c;

    public /* synthetic */ J(int i11, Object obj, Object obj2) {
        this.f16268a = i11;
        this.f16269b = obj;
        this.f16270c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16268a) {
            case 0:
                K.a.d((K.a) this.f16269b, (C9737c) this.f16270c);
                break;
            case 1:
                ((A1) this.f16269b).b(((W2) this.f16270c).getFlushTimeoutMillis());
                break;
            default:
                o.a.c((o.a) this.f16269b, (C9737c) this.f16270c);
                break;
        }
    }
}
