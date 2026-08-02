package i0;

import android.content.Context;
import android.os.Build;
import game.betting133.sports1xbet.R;
import k0.C2022b;
import l0.C2041b;
import l0.C2044e;
import l0.C2046g;
import l0.C2048i;
import l0.InterfaceC2043d;
import m0.AbstractC2081a;
import m0.C2082b;

/* renamed from: i0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2000e implements u {
    public static boolean f = true;

    /* renamed from: a, reason: collision with root package name */
    public final A0.F f17271a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17272b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public C2082b f17273c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17274d;

    /* renamed from: e, reason: collision with root package name */
    public final ComponentCallbacks2C1999d f17275e;

    public C2000e(A0.F f5) {
        this.f17271a = f5;
        ComponentCallbacks2C1999d componentCallbacks2C1999d = new ComponentCallbacks2C1999d(this);
        this.f17275e = componentCallbacks2C1999d;
        if (f5.isAttachedToWindow()) {
            Context context = f5.getContext();
            if (!this.f17274d) {
                context.getApplicationContext().registerComponentCallbacks(componentCallbacks2C1999d);
                this.f17274d = true;
            }
        }
        f5.addOnAttachStateChangeListener(new A0.I(3, this));
    }

    @Override // i0.u
    public final void a(C2041b c2041b) {
        synchronized (this.f17272b) {
            if (!c2041b.f17681s) {
                c2041b.f17681s = true;
                c2041b.b();
            }
        }
    }

    @Override // i0.u
    public final C2041b b() {
        InterfaceC2043d c2048i;
        C2041b c2041b;
        synchronized (this.f17272b) {
            try {
                A0.F f5 = this.f17271a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    f5.getUniqueDrawingId();
                }
                if (i >= 29) {
                    c2048i = new C2046g();
                } else if (f) {
                    try {
                        c2048i = new C2044e(this.f17271a, new o(), new C2022b());
                    } catch (Throwable unused) {
                        f = false;
                        c2048i = new C2048i(c(this.f17271a));
                    }
                } else {
                    c2048i = new C2048i(c(this.f17271a));
                }
                c2041b = new C2041b(c2048i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2041b;
    }

    public final AbstractC2081a c(A0.F f5) {
        C2082b c2082b = this.f17273c;
        if (c2082b != null) {
            return c2082b;
        }
        C2082b c2082b2 = new C2082b(f5.getContext());
        c2082b2.setClipChildren(false);
        c2082b2.setClipToPadding(false);
        c2082b2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        f5.addView(c2082b2, -1);
        this.f17273c = c2082b2;
        return c2082b2;
    }
}
