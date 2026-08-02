package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Py {

    /* renamed from: b, reason: collision with root package name */
    public static final Py f11138b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11139a = new HashMap();

    static {
        Ax ax = new Ax(9);
        Py py = new Py();
        try {
            py.b(ax, Ly.class);
            f11138b = py;
        } catch (GeneralSecurityException e3) {
            throw new IllegalStateException("unexpected error.", e3);
        }
    }

    public final AbstractC1400ot a(AbstractC1314mx abstractC1314mx, Integer num) {
        AbstractC1400ot a5;
        synchronized (this) {
            Ax ax = (Ax) this.f11139a.get(abstractC1314mx.getClass());
            if (ax == null) {
                throw new GeneralSecurityException("Cannot create a new key for parameters " + abstractC1314mx.toString() + ": no key creator for this class was registered.");
            }
            a5 = ax.a(abstractC1314mx, num);
        }
        return a5;
    }

    public final synchronized void b(Ax ax, Class cls) {
        try {
            Ax ax2 = (Ax) this.f11139a.get(cls);
            if (ax2 != null && !ax2.equals(ax)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
            }
            this.f11139a.put(cls, ax);
        } catch (Throwable th) {
            throw th;
        }
    }
}
