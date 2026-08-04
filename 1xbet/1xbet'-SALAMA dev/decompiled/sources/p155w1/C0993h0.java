package p155w1;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p136t.e;

/* JADX INFO: renamed from: w1.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0993h0 extends G2 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AtomicLong f17728A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public AtomicLong f17729B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public AtomicBoolean f17730C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f17731D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f17732E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ArrayList f17733F;

    public static /* synthetic */ void j(int i7, int i8, C0993h0 c0993h0, boolean z4) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c0993h0.f17732E == Long.MIN_VALUE) {
            c0993h0.f17732E = jCurrentTimeMillis;
            AbstractC0998i1.f("initial_run_time", jCurrentTimeMillis);
        }
        c0993h0.h(new C0977d0(i7, jCurrentTimeMillis, c0993h0.f17732E, e.b(i7, 2) ? c0993h0.f17731D : 60000L, i8, z4));
    }
}
