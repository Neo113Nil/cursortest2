package z0;

import a3.AbstractC0467k;
import g0.InterfaceC1966k;

/* renamed from: z0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2750g implements InterfaceC1966k {

    /* renamed from: a, reason: collision with root package name */
    public static final C2750g f21816a = new C2750g();

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f21817b;

    @Override // g0.InterfaceC1966k
    public final boolean a() {
        Boolean bool = f21817b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw AbstractC0467k.u("canFocus is read before it is written");
    }

    @Override // g0.InterfaceC1966k
    public final void b(boolean z3) {
        f21817b = Boolean.valueOf(z3);
    }

    @Override // g0.InterfaceC1966k
    public final /* synthetic */ void c(Z0.n nVar) {
    }

    @Override // g0.InterfaceC1966k
    public final /* synthetic */ void d(Z0.n nVar) {
    }
}
