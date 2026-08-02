package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.y5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractCallableC1817y5 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final C0965f5 f16391a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16392b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16393c;

    /* renamed from: d, reason: collision with root package name */
    public final C0919e4 f16394d;

    /* renamed from: e, reason: collision with root package name */
    public Method f16395e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16396g;

    public AbstractCallableC1817y5(C0965f5 c0965f5, String str, String str2, C0919e4 c0919e4, int i, int i5) {
        this.f16391a = c0965f5;
        this.f16392b = str;
        this.f16393c = str2;
        this.f16394d = c0919e4;
        this.f = i;
        this.f16396g = i5;
    }

    public abstract void a();

    public void b() {
        int i;
        C0965f5 c0965f5 = this.f16391a;
        try {
            long nanoTime = System.nanoTime();
            Method d5 = c0965f5.d(this.f16392b, this.f16393c);
            this.f16395e = d5;
            if (d5 == null) {
                return;
            }
            a();
            M4 m42 = c0965f5.f13448m;
            if (m42 == null || (i = this.f) == Integer.MIN_VALUE) {
                return;
            }
            m42.a(this.f16396g, i, (System.nanoTime() - nanoTime) / 1000, null, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}
