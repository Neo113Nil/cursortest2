package w1;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: w1.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1702h0 extends G2 {

    /* renamed from: A, reason: collision with root package name */
    public AtomicLong f17722A;

    /* renamed from: B, reason: collision with root package name */
    public AtomicLong f17723B;

    /* renamed from: C, reason: collision with root package name */
    public AtomicBoolean f17724C;

    /* renamed from: D, reason: collision with root package name */
    public long f17725D;

    /* renamed from: E, reason: collision with root package name */
    public long f17726E;

    /* renamed from: F, reason: collision with root package name */
    public ArrayList f17727F;

    public static /* synthetic */ void j(int i7, int i8, C1702h0 c1702h0, boolean z4) {
        long currentTimeMillis = System.currentTimeMillis();
        if (c1702h0.f17726E == Long.MIN_VALUE) {
            c1702h0.f17726E = currentTimeMillis;
            AbstractC1707i1.f("initial_run_time", currentTimeMillis);
        }
        c1702h0.h(new C1686d0(i7, currentTimeMillis, c1702h0.f17726E, t.e.b(i7, 2) ? c1702h0.f17725D : 60000L, i8, z4));
    }
}
