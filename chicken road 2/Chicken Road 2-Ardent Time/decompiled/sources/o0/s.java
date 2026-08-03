package o0;

/* loaded from: classes.dex */
public final class s implements D0.a {

    /* renamed from: a, reason: collision with root package name */
    public final o0.c f8177a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8178b;

    /* renamed from: c, reason: collision with root package name */
    public final o0.C0942a f8179c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8180d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8181e;

    public s(o0.c cVar, int i2, o0.C0942a c0942a, long j2, long j3) {
        this.f8177a = cVar;
        this.f8178b = i2;
        this.f8179c = c0942a;
        this.f8180d = j2;
        this.f8181e = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p0.C0951c a(o0.m mVar, com.google.android.gms.common.internal.a aVar, int i2) {
        p0.C0972x c0972x = aVar.f2618u;
        p0.C0951c c0951c = c0972x == null ? null : c0972x.f8299d;
        if (c0951c != null && c0951c.f8223b) {
            int[] iArr = c0951c.f8225d;
            int i3 = 0;
            if (iArr == null) {
                int[] iArr2 = c0951c.f8227f;
                if (iArr2 != null) {
                    while (i3 < iArr2.length) {
                        if (iArr2[i3] != i2) {
                            i3++;
                        }
                    }
                }
                if (mVar.f8164l >= c0951c.f8226e) {
                    return c0951c;
                }
                return null;
            }
            while (i3 < iArr.length) {
                if (iArr[i3] != i2) {
                    i3++;
                } else if (mVar.f8164l >= c0951c.f8226e) {
                }
            }
        }
        return null;
    }

    @Override // D0.a
    public final void onComplete(com.google.android.gms.tasks.Task task) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j2;
        int i8;
        if (this.f8177a.a()) {
            p0.C0956h c0956h = (p0.C0956h) p0.C0955g.b().f8255a;
            if (c0956h == null || c0956h.f8257b) {
                o0.m mVar = (o0.m) this.f8177a.f8142j.get(this.f8179c);
                if (mVar != null) {
                    n0.InterfaceC0939c interfaceC0939c = mVar.f8154b;
                    if (interfaceC0939c instanceof com.google.android.gms.common.internal.a) {
                        com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) interfaceC0939c;
                        long j3 = 0;
                        boolean z2 = this.f8180d > 0;
                        int i9 = aVar.f2614p;
                        if (c0956h != null) {
                            z2 &= c0956h.f8258c;
                            int i10 = c0956h.f8259d;
                            int i11 = c0956h.f8260e;
                            i2 = c0956h.f8256a;
                            if (aVar.f2618u != null && !aVar.a()) {
                                p0.C0951c a2 = a(mVar, aVar, this.f8178b);
                                if (a2 == null) {
                                    return;
                                }
                                boolean z3 = a2.f8224c && this.f8180d > 0;
                                i11 = a2.f8226e;
                                z2 = z3;
                            }
                            i4 = i10;
                            i3 = i11;
                        } else {
                            i2 = 0;
                            i3 = 100;
                            i4 = 5000;
                        }
                        o0.c cVar = this.f8177a;
                        if (task.d()) {
                            i6 = 0;
                            i7 = 0;
                        } else {
                            if (((D0.m) task).f216d) {
                                i6 = 100;
                            } else {
                                java.lang.Exception b2 = task.b();
                                if (b2 instanceof n0.d) {
                                    com.google.android.gms.common.api.Status status = ((n0.d) b2).f8084a;
                                    i5 = status.f2594a;
                                    m0.b bVar = status.f2597d;
                                    if (bVar != null) {
                                        i7 = bVar.f8043b;
                                        i6 = i5;
                                    }
                                } else {
                                    i5 = 101;
                                }
                                i6 = i5;
                            }
                            i7 = -1;
                        }
                        if (z2) {
                            long j4 = this.f8180d;
                            long j5 = this.f8181e;
                            long currentTimeMillis = java.lang.System.currentTimeMillis();
                            i8 = (int) (android.os.SystemClock.elapsedRealtime() - j5);
                            j2 = j4;
                            j3 = currentTimeMillis;
                        } else {
                            j2 = 0;
                            i8 = -1;
                        }
                        cVar.getClass();
                        o0.t tVar = new o0.t(new p0.C0954f(this.f8178b, i6, i7, j2, j3, null, null, i9, i8), i2, i4, i3);
                        A0.a aVar2 = cVar.f8145m;
                        aVar2.sendMessage(aVar2.obtainMessage(18, tVar));
                    }
                }
            }
        }
    }
}
