package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Qy {

    /* renamed from: b, reason: collision with root package name */
    public static final Qy f11294b = new Qy();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11295a = new HashMap();

    public final synchronized void a(C1898zx c1898zx, Class cls) {
        try {
            C1898zx c1898zx2 = (C1898zx) this.f11295a.get(cls);
            if (c1898zx2 != null && !c1898zx2.equals(c1898zx)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f11295a.put(cls, c1898zx);
        } catch (Throwable th) {
            throw th;
        }
    }
}
