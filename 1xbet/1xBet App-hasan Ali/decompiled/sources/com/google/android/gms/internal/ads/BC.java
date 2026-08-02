package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class BC {

    /* renamed from: l, reason: collision with root package name */
    public static MessageDigest f7793l;

    /* renamed from: k, reason: collision with root package name */
    public final Object f7794k;

    public BC(int i) {
        switch (i) {
            case 5:
                this.f7794k = new C0603Ha();
                break;
            default:
                this.f7794k = new Object();
                break;
        }
    }

    public abstract byte W0(long j5);

    public MessageDigest X0() {
        synchronized (this.f7794k) {
            MessageDigest messageDigest = f7793l;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f7793l = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f7793l;
        }
    }

    public abstract void Y0(int i, long j5);

    public abstract double Z0(long j5, Object obj);

    public abstract float a1(long j5, Object obj);

    public abstract int b1();

    public abstract void c1(long j5, byte[] bArr, long j6, long j7);

    public abstract void e1(Object obj, long j5, boolean z3);

    public abstract void f1(Object obj, long j5, byte b3);

    public abstract void g();

    public abstract void g1(Object obj, long j5, double d5);

    public abstract void i1(Object obj, long j5, float f);

    public abstract boolean j1(long j5, Object obj);

    public synchronized void k1(Si si) {
        m1(si.f11577a, si.f11578b);
    }

    public abstract AbstractC0715Xa l1();

    public synchronized void m1(Object obj, Executor executor) {
        ((HashMap) this.f7794k).put(obj, executor);
    }

    public synchronized void n1(Ei ei) {
        for (Map.Entry entry : ((HashMap) this.f7794k).entrySet()) {
            ((Executor) entry.getValue()).execute(new Kw(21, ei, entry.getKey()));
        }
    }

    public abstract void o1();

    public BC(View view) {
        this.f7794k = new WeakReference(view);
    }

    public BC(Set set) {
        this.f7794k = new HashMap();
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                k1((Si) it.next());
            }
        }
    }
}
