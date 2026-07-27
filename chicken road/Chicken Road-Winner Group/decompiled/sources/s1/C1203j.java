package s1;

import Y1.C0077a;
import android.os.Handler;

/* renamed from: s1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1203j implements InterfaceC1197d {

    /* renamed from: e, reason: collision with root package name */
    public static C1203j f10333e;

    /* renamed from: a, reason: collision with root package name */
    public float f10334a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public final C0077a f10335b;

    /* renamed from: c, reason: collision with root package name */
    public r1.b f10336c;

    /* renamed from: d, reason: collision with root package name */
    public C1196c f10337d;

    public C1203j(C0077a c0077a, C0077a c0077a2) {
        this.f10335b = c0077a2;
    }

    public static C1203j b() {
        if (f10333e == null) {
            f10333e = new C1203j(new C0077a(22), new C0077a(21));
        }
        return f10333e;
    }

    @Override // s1.InterfaceC1197d
    public final void a(boolean z3) {
        if (z3) {
            x1.b.f10545g.getClass();
            x1.b.b();
            return;
        }
        x1.b.f10545g.getClass();
        Handler handler = x1.b.f10547i;
        if (handler != null) {
            handler.removeCallbacks(x1.b.f10549k);
            x1.b.f10547i = null;
        }
    }
}
