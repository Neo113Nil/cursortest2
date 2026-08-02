package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Bt {
    public static final HashMap f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f7904a;

    /* renamed from: b, reason: collision with root package name */
    public final C0742a5 f7905b;

    /* renamed from: c, reason: collision with root package name */
    public final P.W f7906c;

    /* renamed from: d, reason: collision with root package name */
    public C1071hd f7907d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7908e = new Object();

    public Bt(Context context, C0742a5 c0742a5, P.W w5, C1543s1 c1543s1) {
        this.f7904a = context;
        this.f7905b = c0742a5;
        this.f7906c = w5;
    }

    public final C1071hd a() {
        C1071hd c1071hd;
        synchronized (this.f7908e) {
            c1071hd = this.f7907d;
        }
        return c1071hd;
    }

    public final C0375o b() {
        synchronized (this.f7908e) {
            try {
                C1071hd c1071hd = this.f7907d;
                if (c1071hd == null) {
                    return null;
                }
                return (C0375o) c1071hd.f13762m;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(C0375o c0375o) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                C1071hd c1071hd = new C1071hd(d(c0375o).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f7904a, "msa-r", c0375o.S(), null, new Bundle(), 2), c0375o, this.f7905b, this.f7906c, 15);
                if (!c1071hd.E()) {
                    throw new At("init failed", 4000);
                }
                int B5 = c1071hd.B();
                if (B5 != 0) {
                    throw new At("ci: " + B5, 4001);
                }
                synchronized (this.f7908e) {
                    C1071hd c1071hd2 = this.f7907d;
                    if (c1071hd2 != null) {
                        try {
                            c1071hd2.D();
                        } catch (At e3) {
                            this.f7906c.g(e3.f7737k, -1L, e3);
                        }
                    }
                    this.f7907d = c1071hd;
                }
                this.f7906c.h(3000, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e5) {
                throw new At(2004, e5);
            }
        } catch (At e6) {
            this.f7906c.g(e6.f7737k, System.currentTimeMillis() - currentTimeMillis, e6);
            return false;
        } catch (Exception e7) {
            this.f7906c.g(4010, System.currentTimeMillis() - currentTimeMillis, e7);
            return false;
        }
    }

    public final synchronized Class d(C0375o c0375o) {
        try {
            String E5 = ((B5) c0375o.f5042l).E();
            HashMap hashMap = f;
            Class cls = (Class) hashMap.get(E5);
            if (cls != null) {
                return cls;
            }
            try {
                if (!C1543s1.t((File) c0375o.f5043m)) {
                    throw new At("VM did not pass signature verification", 2026);
                }
                try {
                    File file = (File) c0375o.f5044n;
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    Class<?> loadClass = new DexClassLoader(((File) c0375o.f5043m).getAbsolutePath(), file.getAbsolutePath(), null, this.f7904a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(E5, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException e3) {
                    e = e3;
                    throw new At(2008, e);
                } catch (IllegalArgumentException e5) {
                    e = e5;
                    throw new At(2008, e);
                } catch (SecurityException e6) {
                    e = e6;
                    throw new At(2008, e);
                }
            } catch (GeneralSecurityException e7) {
                throw new At(2026, e7);
            }
        } finally {
        }
    }
}
