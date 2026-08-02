package A1;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import u2.C1642t;

/* renamed from: A1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0044t implements D3.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f563b;

    public /* synthetic */ C0044t(Context context, int i7) {
        this.f562a = i7;
        this.f563b = context;
    }

    @Override // D3.q
    public Object get() {
        C1642t c1642t;
        switch (this.f562a) {
            case 0:
                return new C0037p(this.f563b);
            case 1:
                new com.google.android.gms.common.internal.w(20);
                this.f563b.getApplicationContext();
                M4.e eVar = new M4.e();
                new HashMap();
                new HashSet();
                new HashMap().clear();
                return eVar;
            case 2:
                return new t2.p(this.f563b);
            default:
                Context context = this.f563b;
                E3.L l7 = C1642t.f16823n;
                synchronized (C1642t.class) {
                    try {
                        if (C1642t.f16829t == null) {
                            R1.b bVar = new R1.b(context);
                            C1642t.f16829t = new C1642t((Context) bVar.f5883c, (HashMap) bVar.f5884d, bVar.f5881a, (v2.p) bVar.f5885e, bVar.f5882b);
                        }
                        c1642t = C1642t.f16829t;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c1642t;
        }
    }
}
