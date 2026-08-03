package com.fyber.inneractive.sdk.player.exoplayer2;

/* loaded from: classes3.dex */
public final class l implements android.os.Handler.Callback, com.fyber.inneractive.sdk.player.exoplayer2.source.r, com.fyber.inneractive.sdk.player.exoplayer2.source.t {
    public com.fyber.inneractive.sdk.player.exoplayer2.h A;
    public com.fyber.inneractive.sdk.player.exoplayer2.h B;
    public com.fyber.inneractive.sdk.player.exoplayer2.x C;

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.a[] f4034a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.a[] b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i c;
    public final com.fyber.inneractive.sdk.player.exoplayer2.c d;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.u e;
    public final android.os.Handler f;
    public final android.os.HandlerThread g;
    public final android.os.Handler h;
    public final com.fyber.inneractive.sdk.player.exoplayer2.w i;
    public final com.fyber.inneractive.sdk.player.exoplayer2.v j;
    public com.fyber.inneractive.sdk.player.exoplayer2.i k;
    public com.fyber.inneractive.sdk.player.exoplayer2.s l;
    public com.fyber.inneractive.sdk.player.exoplayer2.a m;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.h n;
    public com.fyber.inneractive.sdk.player.exoplayer2.source.u o;
    public com.fyber.inneractive.sdk.player.exoplayer2.a[] p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u = 1;
    public long v;
    public int w;
    public com.fyber.inneractive.sdk.player.exoplayer2.j x;
    public long y;
    public com.fyber.inneractive.sdk.player.exoplayer2.h z;

    public l(com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.c cVar, boolean z, com.fyber.inneractive.sdk.player.exoplayer2.f fVar, com.fyber.inneractive.sdk.player.exoplayer2.i iVar, com.fyber.inneractive.sdk.player.exoplayer2.g gVar) {
        this.f4034a = aVarArr;
        this.c = dVar;
        this.d = cVar;
        this.r = z;
        this.h = fVar;
        this.k = iVar;
        this.b = new com.fyber.inneractive.sdk.player.exoplayer2.a[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            com.fyber.inneractive.sdk.player.exoplayer2.a aVar = aVarArr[i];
            aVar.getClass();
            this.b[i] = aVar;
        }
        this.e = new com.fyber.inneractive.sdk.player.exoplayer2.util.u();
        this.p = new com.fyber.inneractive.sdk.player.exoplayer2.a[0];
        this.i = new com.fyber.inneractive.sdk.player.exoplayer2.w();
        this.j = new com.fyber.inneractive.sdk.player.exoplayer2.v();
        this.l = com.fyber.inneractive.sdk.player.exoplayer2.s.d;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.g = handlerThread;
        handlerThread.start();
        this.f = new android.os.Handler(handlerThread.getLooper(), this);
    }

    public static void a(com.fyber.inneractive.sdk.player.exoplayer2.a aVar) {
        int i = aVar.c;
        if (i == 2) {
            if (i != 2) {
                throw new java.lang.IllegalStateException();
            }
            aVar.c = 1;
            aVar.j();
        }
    }

    public final void b(boolean z) {
        if (this.t != z) {
            this.t = z;
            this.h.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    public final void c(boolean z) {
        this.s = false;
        this.r = z;
        if (!z) {
            g();
            h();
            a(false);
            return;
        }
        int i = this.u;
        if (i != 3) {
            if (i == 2) {
                this.f.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.s = false;
        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.e;
        if (!uVar.f4117a) {
            uVar.c = android.os.SystemClock.elapsedRealtime();
            uVar.f4117a = true;
        }
        for (com.fyber.inneractive.sdk.player.exoplayer2.a aVar : this.p) {
            if (aVar.c != 1) {
                throw new java.lang.IllegalStateException();
            }
            aVar.c = 2;
            aVar.i();
        }
        this.f.sendEmptyMessage(2);
    }

    public final synchronized void d() {
        if (this.q) {
            return;
        }
        this.f.sendEmptyMessage(6);
        while (!this.q) {
            try {
                wait();
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            }
        }
        this.g.quit();
    }

    public final void e() {
        a(true);
        this.d.a(true);
        a(1);
        synchronized (this) {
            this.q = true;
            notifyAll();
        }
    }

    public final void f() {
        com.fyber.inneractive.sdk.player.exoplayer2.h hVar = this.B;
        if (hVar == null) {
            return;
        }
        boolean z = true;
        while (hVar != null && hVar.i) {
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j a2 = hVar.p.a(hVar.o, hVar.f4030a.a());
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = hVar.s;
            if (jVar != null) {
                for (int i = 0; i < a2.b.f4071a; i++) {
                    if (a2.a(jVar, i)) {
                    }
                }
                if (hVar == this.A) {
                    z = false;
                }
                hVar = hVar.k;
            }
            hVar.m = a2;
            if (z) {
                com.fyber.inneractive.sdk.player.exoplayer2.h hVar2 = this.A;
                com.fyber.inneractive.sdk.player.exoplayer2.h hVar3 = this.B;
                boolean z2 = hVar2 != hVar3;
                for (com.fyber.inneractive.sdk.player.exoplayer2.h hVar4 = hVar3.k; hVar4 != null; hVar4 = hVar4.k) {
                    hVar4.a();
                }
                com.fyber.inneractive.sdk.player.exoplayer2.h hVar5 = this.B;
                hVar5.k = null;
                this.z = hVar5;
                this.A = hVar5;
                boolean[] zArr = new boolean[this.f4034a.length];
                long a3 = hVar5.a(this.k.c, z2, zArr);
                if (a3 != this.k.c) {
                    this.k.c = a3;
                    a(a3);
                }
                boolean[] zArr2 = new boolean[this.f4034a.length];
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = this.f4034a;
                    if (i2 >= aVarArr.length) {
                        break;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.a aVar = aVarArr[i2];
                    boolean z3 = aVar.c != 0;
                    zArr2[i2] = z3;
                    com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar = this.B.c[i2];
                    if (vVar != null) {
                        i3++;
                    }
                    if (z3) {
                        if (vVar != aVar.d) {
                            if (aVar == this.m) {
                                if (vVar == null) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.e;
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar6 = this.n;
                                    uVar.getClass();
                                    uVar.a(hVar6.b());
                                    uVar.d = hVar6.a();
                                }
                                this.n = null;
                                this.m = null;
                            }
                            a(aVar);
                            aVar.c();
                        } else if (zArr[i2]) {
                            long j = this.y;
                            aVar.g = false;
                            aVar.f = false;
                            aVar.a(false, j);
                        }
                    }
                    i2++;
                }
                this.h.obtainMessage(3, hVar.m).sendToTarget();
                a(zArr2, i3);
            } else {
                this.z = hVar;
                for (com.fyber.inneractive.sdk.player.exoplayer2.h hVar7 = hVar.k; hVar7 != null; hVar7 = hVar7.k) {
                    hVar7.a();
                }
                com.fyber.inneractive.sdk.player.exoplayer2.h hVar8 = this.z;
                hVar8.k = null;
                if (hVar8.i) {
                    long j2 = hVar8.g;
                    long max = java.lang.Math.max(j2, java.lang.Math.abs(this.y - (hVar8.e - j2)));
                    com.fyber.inneractive.sdk.player.exoplayer2.h hVar9 = this.z;
                    hVar9.a(max, false, new boolean[hVar9.n.length]);
                }
            }
            b();
            h();
            this.f.sendEmptyMessage(2);
            return;
        }
    }

    public final void g() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.e;
        if (uVar.f4117a) {
            uVar.a(uVar.b());
            uVar.f4117a = false;
        }
        for (com.fyber.inneractive.sdk.player.exoplayer2.a aVar : this.p) {
            a(aVar);
        }
    }

    public final void h() {
        com.fyber.inneractive.sdk.player.exoplayer2.h hVar = this.B;
        if (hVar == null) {
            return;
        }
        long g = hVar.f4030a.g();
        if (g != -9223372036854775807L) {
            a(g);
        } else {
            com.fyber.inneractive.sdk.player.exoplayer2.a aVar = this.m;
            if (aVar == null || aVar.e()) {
                this.y = this.e.b();
            } else {
                long b = this.n.b();
                this.y = b;
                this.e.a(b);
            }
            com.fyber.inneractive.sdk.player.exoplayer2.h hVar2 = this.B;
            g = java.lang.Math.abs(this.y - (hVar2.e - hVar2.g));
        }
        this.k.c = g;
        this.v = android.os.SystemClock.elapsedRealtime() * 1000;
        long c = this.p.length == 0 ? Long.MIN_VALUE : this.B.f4030a.c();
        com.fyber.inneractive.sdk.player.exoplayer2.i iVar = this.k;
        if (c == Long.MIN_VALUE) {
            long j = this.C.a(this.B.f, this.j, false).d;
        }
        iVar.getClass();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        try {
            switch (message.what) {
                case 0:
                    a((com.fyber.inneractive.sdk.player.exoplayer2.source.u) message.obj, message.arg1 != 0);
                    return true;
                case 1:
                    c(message.arg1 != 0);
                    return true;
                case 2:
                    a();
                    return true;
                case 3:
                    b((com.fyber.inneractive.sdk.player.exoplayer2.j) message.obj);
                    return true;
                case 4:
                    a((com.fyber.inneractive.sdk.player.exoplayer2.s) message.obj);
                    return true;
                case 5:
                    a(true);
                    this.d.a(true);
                    a(1);
                    return true;
                case 6:
                    e();
                    return true;
                case 7:
                    a((android.util.Pair) message.obj);
                    return true;
                case 8:
                    a((com.fyber.inneractive.sdk.player.exoplayer2.source.s) message.obj);
                    return true;
                case 9:
                    com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.s) message.obj;
                    com.fyber.inneractive.sdk.player.exoplayer2.h hVar = this.z;
                    if (hVar != null && hVar.f4030a == sVar) {
                        b();
                    }
                    return true;
                case 10:
                    f();
                    return true;
                case 11:
                    a((com.fyber.inneractive.sdk.player.exoplayer2.e[]) message.obj);
                    return true;
                default:
                    return false;
            }
        } catch (com.fyber.inneractive.sdk.player.exoplayer2.d e) {
            android.util.Log.e("ExoPlayerImplInternal", "Renderer error.", e);
            this.h.obtainMessage(8, e).sendToTarget();
            a(true);
            this.d.a(true);
            a(1);
            return true;
        } catch (java.io.IOException e2) {
            android.util.Log.e("ExoPlayerImplInternal", "Source error.", e2);
            this.h.obtainMessage(8, new com.fyber.inneractive.sdk.player.exoplayer2.d(e2)).sendToTarget();
            a(true);
            this.d.a(true);
            a(1);
            return true;
        } catch (java.lang.RuntimeException e3) {
            android.util.Log.e("ExoPlayerImplInternal", "Internal runtime error.", e3);
            this.h.obtainMessage(8, new com.fyber.inneractive.sdk.player.exoplayer2.d(e3)).sendToTarget();
            a(true);
            this.d.a(true);
            a(1);
            return true;
        }
    }

    public final void b(com.fyber.inneractive.sdk.player.exoplayer2.j jVar) {
        if (this.C == null) {
            this.w++;
            this.x = jVar;
            return;
        }
        android.util.Pair a2 = a(jVar);
        if (a2 == null) {
            com.fyber.inneractive.sdk.player.exoplayer2.i iVar = new com.fyber.inneractive.sdk.player.exoplayer2.i(0, 0L);
            this.k = iVar;
            this.h.obtainMessage(4, 1, 0, iVar).sendToTarget();
            this.k = new com.fyber.inneractive.sdk.player.exoplayer2.i(0, -9223372036854775807L);
            a(4);
            a(false);
            return;
        }
        int i = jVar.c == -9223372036854775807L ? 1 : 0;
        int intValue = ((java.lang.Integer) a2.first).intValue();
        long longValue = ((java.lang.Long) a2.second).longValue();
        try {
            com.fyber.inneractive.sdk.player.exoplayer2.i iVar2 = this.k;
            if (intValue == iVar2.f4031a && longValue / 1000 == iVar2.c / 1000) {
                return;
            }
            long a3 = a(intValue, longValue);
            int i2 = i | (longValue == a3 ? 0 : 1);
            com.fyber.inneractive.sdk.player.exoplayer2.i iVar3 = new com.fyber.inneractive.sdk.player.exoplayer2.i(intValue, a3);
            this.k = iVar3;
            this.h.obtainMessage(4, i2, 0, iVar3).sendToTarget();
        } finally {
            com.fyber.inneractive.sdk.player.exoplayer2.i iVar4 = new com.fyber.inneractive.sdk.player.exoplayer2.i(intValue, longValue);
            this.k = iVar4;
            this.h.obtainMessage(4, i, 0, iVar4).sendToTarget();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.t
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.x xVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g gVar) {
        this.f.obtainMessage(7, android.util.Pair.create(xVar, gVar)).sendToTarget();
    }

    public final void a(int i) {
        if (this.u != i) {
            this.u = i;
            this.h.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar, boolean z) {
        this.h.sendEmptyMessage(0);
        a(true);
        this.d.a(false);
        if (z) {
            this.k = new com.fyber.inneractive.sdk.player.exoplayer2.i(0, -9223372036854775807L);
        }
        this.o = uVar;
        uVar.a(this);
        a(2);
        this.f.sendEmptyMessage(2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x03a1, code lost:
    
        if (r5 < r1) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03c0, code lost:
    
        if (r1.i == false) goto L198;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x017f A[LOOP:3: B:151:0x017f->B:155:0x018f, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.h hVar;
        int i;
        boolean z;
        boolean z2;
        com.fyber.inneractive.sdk.player.exoplayer2.h hVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.h hVar3;
        long j;
        com.fyber.inneractive.sdk.player.exoplayer2.h hVar4;
        com.fyber.inneractive.sdk.player.exoplayer2.h hVar5;
        int i2;
        int i3;
        long c;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.C == null) {
            this.o.a();
        } else {
            com.fyber.inneractive.sdk.player.exoplayer2.h hVar6 = this.z;
            if (hVar6 == null) {
                i = this.k.f4031a;
            } else {
                int i4 = hVar6.f;
                if (!hVar6.h && hVar6.i && ((!hVar6.j || hVar6.f4030a.c() == Long.MIN_VALUE) && this.C.a(i4, this.j, false).d != -9223372036854775807L && ((hVar = this.B) == null || i4 - hVar.f != 100))) {
                    i = this.z.f + 1;
                }
                z2 = false;
                z = true;
                hVar2 = this.z;
                if (hVar2 == null && (!hVar2.i || (hVar2.j && hVar2.f4030a.c() != Long.MIN_VALUE))) {
                    com.fyber.inneractive.sdk.player.exoplayer2.h hVar7 = this.z;
                    if (hVar7 != null && hVar7.l) {
                        b();
                    }
                } else {
                    b(z2);
                }
                if (this.B != null) {
                    while (true) {
                        com.fyber.inneractive.sdk.player.exoplayer2.h hVar8 = this.B;
                        hVar3 = this.A;
                        if (hVar8 == hVar3 || this.y < hVar8.k.e) {
                            break;
                        }
                        hVar8.a();
                        a(this.B.k);
                        com.fyber.inneractive.sdk.player.exoplayer2.h hVar9 = this.B;
                        this.k = new com.fyber.inneractive.sdk.player.exoplayer2.i(hVar9.f, hVar9.g);
                        h();
                        this.h.obtainMessage(5, this.k).sendToTarget();
                    }
                    if (hVar3.h) {
                        int i5 = 0;
                        while (true) {
                            com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = this.f4034a;
                            if (i5 >= aVarArr.length) {
                                break;
                            }
                            com.fyber.inneractive.sdk.player.exoplayer2.a aVar = aVarArr[i5];
                            com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar = this.A.c[i5];
                            if (vVar != null && aVar.d == vVar && aVar.f) {
                                aVar.g = z;
                            }
                            i5++;
                        }
                    } else {
                        int i6 = 0;
                        while (true) {
                            com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr2 = this.f4034a;
                            if (i6 < aVarArr2.length) {
                                com.fyber.inneractive.sdk.player.exoplayer2.a aVar2 = aVarArr2[i6];
                                com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar2 = this.A.c[i6];
                                if (aVar2.d != vVar2 || (vVar2 != null && !aVar2.f)) {
                                    break;
                                } else {
                                    i6++;
                                }
                            } else {
                                com.fyber.inneractive.sdk.player.exoplayer2.h hVar10 = this.A;
                                com.fyber.inneractive.sdk.player.exoplayer2.h hVar11 = hVar10.k;
                                if (hVar11 != null && hVar11.i) {
                                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = hVar10.m;
                                    this.A = hVar11;
                                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar2 = hVar11.m;
                                    boolean z3 = hVar11.f4030a.g() != -9223372036854775807L;
                                    int i7 = 0;
                                    while (true) {
                                        com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr3 = this.f4034a;
                                        if (i7 >= aVarArr3.length) {
                                            break;
                                        }
                                        com.fyber.inneractive.sdk.player.exoplayer2.a aVar3 = aVarArr3[i7];
                                        if (jVar.b.b[i7] != null) {
                                            if (z3) {
                                                aVar3.g = z;
                                            } else if (aVar3.g) {
                                                continue;
                                            } else {
                                                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = jVar2.b.b[i7];
                                                com.fyber.inneractive.sdk.player.exoplayer2.t tVar = jVar.d[i7];
                                                com.fyber.inneractive.sdk.player.exoplayer2.t tVar2 = jVar2.d[i7];
                                                if (bVar != null && tVar2.equals(tVar)) {
                                                    int length = bVar.c.length;
                                                    com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.o[length];
                                                    for (int i8 = 0; i8 < length; i8++) {
                                                        oVarArr[i8] = bVar.d[i8];
                                                    }
                                                    com.fyber.inneractive.sdk.player.exoplayer2.h hVar12 = this.A;
                                                    com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar3 = hVar12.c[i7];
                                                    long j2 = hVar12.e - hVar12.g;
                                                    if (!aVar3.g) {
                                                        aVar3.d = vVar3;
                                                        aVar3.f = false;
                                                        aVar3.e = j2;
                                                        aVar3.a(oVarArr);
                                                    } else {
                                                        throw new java.lang.IllegalStateException();
                                                    }
                                                } else {
                                                    aVar3.g = true;
                                                }
                                            }
                                        }
                                        i7++;
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i >= this.C.a()) {
                this.o.a();
                z2 = false;
                z = true;
                hVar2 = this.z;
                if (hVar2 == null) {
                }
                b(z2);
                if (this.B != null) {
                }
            } else {
                if (this.z == null) {
                    j = this.k.c;
                } else {
                    int i9 = this.C.a(i, this.j, false).c;
                    if (i != this.C.a(i9, this.i, 0L).c) {
                        j = 0;
                    } else {
                        com.fyber.inneractive.sdk.player.exoplayer2.h hVar13 = this.z;
                        z2 = false;
                        z = true;
                        z = true;
                        android.util.Pair a2 = a(this.C, i9, -9223372036854775807L, java.lang.Math.max(0L, ((hVar13.e - hVar13.g) + this.C.a(hVar13.f, this.j, false).d) - this.y));
                        if (a2 != null) {
                            int intValue = ((java.lang.Integer) a2.first).intValue();
                            long longValue = ((java.lang.Long) a2.second).longValue();
                            i = intValue;
                            j = longValue;
                            com.fyber.inneractive.sdk.player.exoplayer2.h hVar14 = this.z;
                            long j3 = hVar14 != null ? j + 60000000 : (hVar14.e - hVar14.g) + this.C.a(hVar14.f, this.j, z2).d;
                            this.C.a(i, this.j, z);
                            com.fyber.inneractive.sdk.player.exoplayer2.h hVar15 = new com.fyber.inneractive.sdk.player.exoplayer2.h(this.f4034a, this.b, j3, this.c, this.d, this.o, this.j.b, i, (i == this.C.a() - (z ? 1 : 0) || this.C.a(this.j.c, this.i, 0L).b) ? false : true, j);
                            hVar4 = this.z;
                            if (hVar4 != null) {
                                hVar4.k = hVar15;
                            }
                            this.z = hVar15;
                            hVar15.f4030a.a(this);
                            b(z);
                        }
                        hVar2 = this.z;
                        if (hVar2 == null) {
                        }
                        b(z2);
                        if (this.B != null) {
                        }
                    }
                }
                z2 = false;
                z = true;
                com.fyber.inneractive.sdk.player.exoplayer2.h hVar142 = this.z;
                if (hVar142 != null) {
                }
                this.C.a(i, this.j, z);
                com.fyber.inneractive.sdk.player.exoplayer2.h hVar152 = new com.fyber.inneractive.sdk.player.exoplayer2.h(this.f4034a, this.b, j3, this.c, this.d, this.o, this.j.b, i, (i == this.C.a() - (z ? 1 : 0) || this.C.a(this.j.c, this.i, 0L).b) ? false : true, j);
                hVar4 = this.z;
                if (hVar4 != null) {
                }
                this.z = hVar152;
                hVar152.f4030a.a(this);
                b(z);
                hVar2 = this.z;
                if (hVar2 == null) {
                }
                b(z2);
                if (this.B != null) {
                }
            }
        }
        if (this.B == null) {
            c();
            a(elapsedRealtime, 10L);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.w.a("doSomeWork");
        h();
        com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar = this.B.f4030a;
        long j4 = this.k.c;
        sVar.getClass();
        boolean z4 = true;
        boolean z5 = true;
        for (com.fyber.inneractive.sdk.player.exoplayer2.a aVar4 : this.p) {
            aVar4.a(this.y, this.v);
            z4 = z4 && aVar4.e();
            boolean z6 = aVar4.f() || aVar4.e();
            if (!z6) {
                aVar4.d.a();
            }
            z5 = z5 && z6;
        }
        if (!z5) {
            c();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar16 = this.n;
        if (hVar16 != null) {
            com.fyber.inneractive.sdk.player.exoplayer2.s a3 = hVar16.a();
            if (!a3.equals(this.l)) {
                this.l = a3;
                com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.e;
                com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar17 = this.n;
                uVar.getClass();
                uVar.a(hVar17.b());
                uVar.d = hVar17.a();
                this.h.obtainMessage(7, a3).sendToTarget();
            }
        }
        long j5 = this.C.a(this.B.f, this.j, false).d;
        if (z4 && ((j5 == -9223372036854775807L || j5 <= this.k.c) && this.B.h)) {
            a(4);
            g();
        } else {
            int i10 = this.u;
            if (i10 == 2) {
                if (this.p.length <= 0) {
                    if (j5 != -9223372036854775807L) {
                        if (this.k.c >= j5) {
                            com.fyber.inneractive.sdk.player.exoplayer2.h hVar18 = this.B.k;
                            if (hVar18 != null) {
                            }
                        }
                    }
                    a(3);
                    if (this.r) {
                    }
                } else if (z5) {
                    boolean z7 = this.s;
                    com.fyber.inneractive.sdk.player.exoplayer2.h hVar19 = this.z;
                    if (!hVar19.i) {
                        c = hVar19.g;
                    } else {
                        c = hVar19.f4030a.c();
                    }
                    if (c == Long.MIN_VALUE) {
                        com.fyber.inneractive.sdk.player.exoplayer2.h hVar20 = this.z;
                        if (!hVar20.h) {
                            c = this.C.a(hVar20.f, this.j, false).d;
                        }
                        a(3);
                        if (this.r) {
                            this.s = false;
                            com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar2 = this.e;
                            if (uVar2.f4117a) {
                                i3 = 1;
                            } else {
                                uVar2.c = android.os.SystemClock.elapsedRealtime();
                                i3 = 1;
                                uVar2.f4117a = true;
                            }
                            for (com.fyber.inneractive.sdk.player.exoplayer2.a aVar5 : this.p) {
                                if (aVar5.c == i3) {
                                    aVar5.c = 2;
                                    aVar5.i();
                                } else {
                                    throw new java.lang.IllegalStateException();
                                }
                            }
                        }
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.c cVar = this.d;
                    com.fyber.inneractive.sdk.player.exoplayer2.h hVar21 = this.z;
                    long abs = c - java.lang.Math.abs(this.y - (hVar21.e - hVar21.g));
                    long j6 = z7 ? cVar.e : cVar.d;
                    if (j6 > 0) {
                    }
                    a(3);
                    if (this.r) {
                    }
                }
                if (this.u == i2) {
                    for (com.fyber.inneractive.sdk.player.exoplayer2.a aVar6 : this.p) {
                        aVar6.d.a();
                    }
                }
                if ((!this.r && this.u == 3) || this.u == 2) {
                    a(elapsedRealtime, 10L);
                } else if (this.p.length == 0) {
                    a(elapsedRealtime, 1000L);
                } else {
                    this.f.removeMessages(2);
                }
                com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
            }
            if (i10 == 3 && (this.p.length <= 0 ? !(j5 == -9223372036854775807L || this.k.c < j5 || ((hVar5 = this.B.k) != null && hVar5.i)) : !z5)) {
                this.s = this.r;
                i2 = 2;
                a(2);
                g();
                if (this.u == i2) {
                }
                if (!this.r) {
                }
                if (this.p.length == 0) {
                }
                com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
            }
            i2 = 2;
            if (this.u == i2) {
            }
            if (!this.r) {
            }
            if (this.p.length == 0) {
            }
            com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
        }
        i2 = 2;
        if (this.u == i2) {
        }
        if (!this.r) {
        }
        if (this.p.length == 0) {
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
    }

    public final void c() {
        com.fyber.inneractive.sdk.player.exoplayer2.h hVar = this.z;
        if (hVar == null || hVar.i) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.h hVar2 = this.A;
        if (hVar2 == null || hVar2.k == hVar) {
            for (com.fyber.inneractive.sdk.player.exoplayer2.a aVar : this.p) {
                if (!aVar.f) {
                    return;
                }
            }
            this.z.f4030a.d();
        }
    }

    public final void b() {
        int i;
        com.fyber.inneractive.sdk.player.exoplayer2.h hVar = this.z;
        long f = !hVar.i ? 0L : hVar.f4030a.f();
        if (f == Long.MIN_VALUE) {
            b(false);
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.h hVar2 = this.z;
        long abs = java.lang.Math.abs(this.y - (hVar2.e - hVar2.g));
        long j = f - abs;
        com.fyber.inneractive.sdk.player.exoplayer2.c cVar = this.d;
        char c = j > cVar.c ? (char) 0 : j < cVar.b ? (char) 2 : (char) 1;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = cVar.f3918a;
        synchronized (lVar) {
            i = lVar.c * 65536;
        }
        boolean z = c == 2 || (c == 1 && cVar.g && !(i >= cVar.f));
        cVar.g = z;
        b(z);
        if (z) {
            com.fyber.inneractive.sdk.player.exoplayer2.h hVar3 = this.z;
            hVar3.l = false;
            hVar3.f4030a.b(abs);
            return;
        }
        this.z.l = true;
    }

    public final void a(long j, long j2) {
        this.f.removeMessages(2);
        long elapsedRealtime = (j + j2) - android.os.SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f.sendEmptyMessage(2);
        } else {
            this.f.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    public final long a(int i, long j) {
        com.fyber.inneractive.sdk.player.exoplayer2.h hVar;
        g();
        this.s = false;
        a(2);
        com.fyber.inneractive.sdk.player.exoplayer2.h hVar2 = this.B;
        if (hVar2 == null) {
            com.fyber.inneractive.sdk.player.exoplayer2.h hVar3 = this.z;
            if (hVar3 != null) {
                hVar3.a();
            }
            hVar = null;
        } else {
            hVar = null;
            while (hVar2 != null) {
                if (hVar2.f == i && hVar2.i) {
                    hVar = hVar2;
                } else {
                    hVar2.a();
                }
                hVar2 = hVar2.k;
            }
        }
        com.fyber.inneractive.sdk.player.exoplayer2.h hVar4 = this.B;
        if (hVar4 != hVar || hVar4 != this.A) {
            for (com.fyber.inneractive.sdk.player.exoplayer2.a aVar : this.p) {
                aVar.c();
            }
            this.p = new com.fyber.inneractive.sdk.player.exoplayer2.a[0];
            this.n = null;
            this.m = null;
            this.B = null;
        }
        if (hVar != null) {
            hVar.k = null;
            this.z = hVar;
            this.A = hVar;
            a(hVar);
            com.fyber.inneractive.sdk.player.exoplayer2.h hVar5 = this.B;
            if (hVar5.j) {
                j = hVar5.f4030a.a(j);
            }
            a(j);
            b();
        } else {
            this.z = null;
            this.A = null;
            this.B = null;
            a(j);
        }
        this.f.sendEmptyMessage(2);
        return j;
    }

    public final void a(long j) {
        com.fyber.inneractive.sdk.player.exoplayer2.h hVar = this.B;
        long j2 = hVar == null ? j + 60000000 : j + (hVar.e - hVar.g);
        this.y = j2;
        this.e.a(j2);
        for (com.fyber.inneractive.sdk.player.exoplayer2.a aVar : this.p) {
            long j3 = this.y;
            aVar.g = false;
            aVar.f = false;
            aVar.a(false, j3);
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.s sVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.s a2;
        com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar = this.n;
        if (hVar != null) {
            a2 = hVar.a(sVar);
        } else {
            a2 = this.e.a(sVar);
        }
        this.l = a2;
        this.h.obtainMessage(7, a2).sendToTarget();
    }

    public final void a(boolean z) {
        this.f.removeMessages(2);
        this.s = false;
        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.e;
        if (uVar.f4117a) {
            uVar.a(uVar.b());
            uVar.f4117a = false;
        }
        this.n = null;
        this.m = null;
        this.y = 60000000L;
        for (com.fyber.inneractive.sdk.player.exoplayer2.a aVar : this.p) {
            try {
                a(aVar);
                aVar.c();
            } catch (com.fyber.inneractive.sdk.player.exoplayer2.d | java.lang.RuntimeException e) {
                android.util.Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.p = new com.fyber.inneractive.sdk.player.exoplayer2.a[0];
        com.fyber.inneractive.sdk.player.exoplayer2.h hVar = this.B;
        if (hVar == null) {
            hVar = this.z;
        }
        while (hVar != null) {
            hVar.a();
            hVar = hVar.k;
        }
        this.z = null;
        this.A = null;
        this.B = null;
        b(false);
        if (z) {
            com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar2 = this.o;
            if (uVar2 != null) {
                uVar2.b();
                this.o = null;
            }
            this.C = null;
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.e[] eVarArr) {
        try {
            for (com.fyber.inneractive.sdk.player.exoplayer2.e eVar : eVarArr) {
                eVar.f3924a.a(eVar.b, eVar.c);
            }
            if (this.o != null) {
                this.f.sendEmptyMessage(2);
            }
            synchronized (this) {
                notifyAll();
            }
        } catch (java.lang.Throwable th) {
            synchronized (this) {
                notifyAll();
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ec  */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(android.util.Pair pair) {
        boolean z;
        int i;
        int i2;
        ?? r12;
        com.fyber.inneractive.sdk.player.exoplayer2.h hVar;
        com.fyber.inneractive.sdk.player.exoplayer2.h hVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.x xVar = this.C;
        com.fyber.inneractive.sdk.player.exoplayer2.x xVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.x) pair.first;
        this.C = xVar2;
        java.lang.Object obj = pair.second;
        if (xVar == null) {
            if (this.w > 0) {
                android.util.Pair a2 = a(this.x);
                int i3 = this.w;
                this.w = 0;
                this.x = null;
                if (a2 == null) {
                    com.fyber.inneractive.sdk.player.exoplayer2.i iVar = new com.fyber.inneractive.sdk.player.exoplayer2.i(0, 0L);
                    this.k = iVar;
                    this.h.obtainMessage(6, new com.fyber.inneractive.sdk.player.exoplayer2.k(this.C, obj, iVar, i3)).sendToTarget();
                    this.k = new com.fyber.inneractive.sdk.player.exoplayer2.i(0, -9223372036854775807L);
                    a(4);
                    a(false);
                    return;
                }
                this.k = new com.fyber.inneractive.sdk.player.exoplayer2.i(((java.lang.Integer) a2.first).intValue(), ((java.lang.Long) a2.second).longValue());
                i2 = i3;
                r12 = 0;
                i = 6;
                hVar = this.B;
                if (hVar == null) {
                    hVar = this.z;
                }
                hVar2 = hVar;
                if (hVar2 == null) {
                    this.h.obtainMessage(i, new com.fyber.inneractive.sdk.player.exoplayer2.k(this.C, obj, this.k, i2)).sendToTarget();
                    return;
                }
                int a3 = this.C.a(hVar2.b);
                if (a3 == -1) {
                    int i4 = hVar2.f;
                    com.fyber.inneractive.sdk.player.exoplayer2.x xVar3 = this.C;
                    int i5 = -1;
                    while (i5 == -1 && i4 < xVar.a() - 1) {
                        i4++;
                        i5 = xVar3.a(xVar.a(i4, this.j, true).b);
                    }
                    if (i5 == -1) {
                        com.fyber.inneractive.sdk.player.exoplayer2.i iVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.i(r12, 0L);
                        this.k = iVar2;
                        this.h.obtainMessage(i, new com.fyber.inneractive.sdk.player.exoplayer2.k(this.C, obj, iVar2, i2)).sendToTarget();
                        this.k = new com.fyber.inneractive.sdk.player.exoplayer2.i(r12, -9223372036854775807L);
                        a(4);
                        a((boolean) r12);
                        return;
                    }
                    int i6 = this.C.a(i5, this.j, (boolean) r12).c;
                    android.util.Pair a4 = a(this.C, 0, -9223372036854775807L, 0L);
                    int intValue = ((java.lang.Integer) a4.first).intValue();
                    long longValue = ((java.lang.Long) a4.second).longValue();
                    this.C.a(intValue, this.j, true);
                    java.lang.Object obj2 = this.j.b;
                    hVar2.f = -1;
                    while (true) {
                        hVar2 = hVar2.k;
                        if (hVar2 != null) {
                            hVar2.f = hVar2.b.equals(obj2) ? intValue : -1;
                        } else {
                            com.fyber.inneractive.sdk.player.exoplayer2.i iVar3 = new com.fyber.inneractive.sdk.player.exoplayer2.i(intValue, a(intValue, longValue));
                            this.k = iVar3;
                            this.h.obtainMessage(i, new com.fyber.inneractive.sdk.player.exoplayer2.k(this.C, obj, iVar3, i2)).sendToTarget();
                            return;
                        }
                    }
                } else {
                    this.C.a(a3, this.j, (boolean) r12);
                    boolean z2 = a3 == this.C.a() - 1 && !this.C.a(this.j.c, this.i, 0L).b;
                    hVar2.f = a3;
                    hVar2.h = z2;
                    boolean z3 = hVar2 == this.A;
                    com.fyber.inneractive.sdk.player.exoplayer2.i iVar4 = this.k;
                    if (a3 != iVar4.f4031a) {
                        com.fyber.inneractive.sdk.player.exoplayer2.i iVar5 = new com.fyber.inneractive.sdk.player.exoplayer2.i(a3, iVar4.b);
                        iVar5.c = iVar4.c;
                        this.k = iVar5;
                    }
                    while (true) {
                        com.fyber.inneractive.sdk.player.exoplayer2.h hVar3 = hVar2.k;
                        if (hVar3 == null) {
                            break;
                        }
                        a3++;
                        this.C.a(a3, this.j, true);
                        boolean z4 = a3 == this.C.a() - 1 && !this.C.a(this.j.c, this.i, 0L).b;
                        if (hVar3.b.equals(this.j.b)) {
                            hVar3.f = a3;
                            hVar3.h = z4;
                            z3 |= hVar3 == this.A;
                            hVar2 = hVar3;
                        } else if (!z3) {
                            int i7 = this.B.f;
                            this.k = new com.fyber.inneractive.sdk.player.exoplayer2.i(i7, a(i7, this.k.c));
                        } else {
                            this.z = hVar2;
                            hVar2.k = null;
                            while (hVar3 != null) {
                                hVar3.a();
                                hVar3 = hVar3.k;
                            }
                        }
                    }
                    this.h.obtainMessage(i, new com.fyber.inneractive.sdk.player.exoplayer2.k(this.C, obj, this.k, i2)).sendToTarget();
                    return;
                }
            } else if (this.k.b == -9223372036854775807L) {
                if (xVar2.c()) {
                    com.fyber.inneractive.sdk.player.exoplayer2.i iVar6 = new com.fyber.inneractive.sdk.player.exoplayer2.i(0, 0L);
                    this.k = iVar6;
                    this.h.obtainMessage(6, new com.fyber.inneractive.sdk.player.exoplayer2.k(this.C, obj, iVar6, 0)).sendToTarget();
                    this.k = new com.fyber.inneractive.sdk.player.exoplayer2.i(0, -9223372036854775807L);
                    a(4);
                    a(false);
                    return;
                }
                z = false;
                i = 6;
                android.util.Pair a5 = a(this.C, 0, -9223372036854775807L, 0L);
                this.k = new com.fyber.inneractive.sdk.player.exoplayer2.i(((java.lang.Integer) a5.first).intValue(), ((java.lang.Long) a5.second).longValue());
                i2 = 0;
                r12 = z;
                hVar = this.B;
                if (hVar == null) {
                }
                hVar2 = hVar;
                if (hVar2 == null) {
                }
            }
        }
        z = false;
        i = 6;
        i2 = 0;
        r12 = z;
        hVar = this.B;
        if (hVar == null) {
        }
        hVar2 = hVar;
        if (hVar2 == null) {
        }
    }

    public final android.util.Pair a(com.fyber.inneractive.sdk.player.exoplayer2.j jVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.x xVar = jVar.f4032a;
        if (xVar.c()) {
            xVar = this.C;
        }
        try {
            android.util.Pair a2 = a(xVar, jVar.b, jVar.c, 0L);
            com.fyber.inneractive.sdk.player.exoplayer2.x xVar2 = this.C;
            if (xVar2 == xVar) {
                return a2;
            }
            int a3 = xVar2.a(xVar.a(((java.lang.Integer) a2.first).intValue(), this.j, true).b);
            if (a3 != -1) {
                return android.util.Pair.create(java.lang.Integer.valueOf(a3), (java.lang.Long) a2.second);
            }
            int intValue = ((java.lang.Integer) a2.first).intValue();
            com.fyber.inneractive.sdk.player.exoplayer2.x xVar3 = this.C;
            int i = -1;
            while (i == -1 && intValue < xVar.a() - 1) {
                intValue++;
                i = xVar3.a(xVar.a(intValue, this.j, true).b);
            }
            if (i == -1) {
                return null;
            }
            int i2 = this.C.a(i, this.j, false).c;
            return a(this.C, 0, -9223372036854775807L, 0L);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.q();
        }
    }

    public final android.util.Pair a(com.fyber.inneractive.sdk.player.exoplayer2.x xVar, int i, long j, long j2) {
        int b = xVar.b();
        if (i >= 0 && i < b) {
            xVar.a(i, this.i, j2);
            if (j == -9223372036854775807L) {
                j = this.i.e;
                if (j == -9223372036854775807L) {
                    return null;
                }
            }
            com.fyber.inneractive.sdk.player.exoplayer2.w wVar = this.i;
            int i2 = wVar.c;
            long j3 = wVar.g + j;
            long j4 = xVar.a(i2, this.j, false).d;
            while (j4 != -9223372036854775807L && j3 >= j4 && i2 < this.i.d) {
                j3 -= j4;
                i2++;
                j4 = xVar.a(i2, this.j, false).d;
            }
            return android.util.Pair.create(java.lang.Integer.valueOf(i2), java.lang.Long.valueOf(j3));
        }
        throw new java.lang.IndexOutOfBoundsException();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.h hVar = this.z;
        if (hVar == null || (sVar2 = hVar.f4030a) != sVar) {
            return;
        }
        hVar.i = true;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j a2 = hVar.p.a(hVar.o, sVar2.a());
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = hVar.s;
        if (jVar != null) {
            for (int i = 0; i < a2.b.f4071a; i++) {
                if (a2.a(jVar, i)) {
                }
            }
            hVar.g = hVar.a(hVar.g, false, new boolean[hVar.n.length]);
            if (this.B == null) {
                com.fyber.inneractive.sdk.player.exoplayer2.h hVar2 = this.z;
                this.A = hVar2;
                a(hVar2.g);
                a(this.A);
            }
            b();
        }
        hVar.m = a2;
        hVar.g = hVar.a(hVar.g, false, new boolean[hVar.n.length]);
        if (this.B == null) {
        }
        b();
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.h hVar) {
        if (this.B == hVar) {
            return;
        }
        boolean[] zArr = new boolean[this.f4034a.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = this.f4034a;
            if (i < aVarArr.length) {
                com.fyber.inneractive.sdk.player.exoplayer2.a aVar = aVarArr[i];
                boolean z = aVar.c != 0;
                zArr[i] = z;
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = hVar.m.b.b[i];
                if (bVar != null) {
                    i2++;
                }
                if (z && (bVar == null || (aVar.g && aVar.d == this.B.c[i]))) {
                    if (aVar == this.m) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.u uVar = this.e;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.h hVar2 = this.n;
                        uVar.getClass();
                        uVar.a(hVar2.b());
                        uVar.d = hVar2.a();
                        this.n = null;
                        this.m = null;
                    }
                    a(aVar);
                    aVar.c();
                }
                i++;
            } else {
                this.B = hVar;
                this.h.obtainMessage(3, hVar.m).sendToTarget();
                a(zArr, i2);
                return;
            }
        }
    }

    public final void a(boolean[] zArr, int i) {
        int i2;
        this.p = new com.fyber.inneractive.sdk.player.exoplayer2.a[i];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr = this.f4034a;
            if (i3 >= aVarArr.length) {
                return;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.a aVar = aVarArr[i3];
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = this.B.m;
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = jVar.b.b[i3];
            if (bVar != null) {
                int i5 = i4 + 1;
                this.p[i4] = aVar;
                if (aVar.c == 0) {
                    com.fyber.inneractive.sdk.player.exoplayer2.t tVar = jVar.d[i3];
                    boolean z = this.r && this.u == 3;
                    boolean z2 = !zArr[i3] && z;
                    int length = bVar.c.length;
                    com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.o[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        oVarArr[i6] = bVar.d[i6];
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.h hVar = this.B;
                    com.fyber.inneractive.sdk.player.exoplayer2.source.v vVar = hVar.c[i3];
                    long j = this.y;
                    i2 = i3;
                    long j2 = hVar.e - hVar.g;
                    if (aVar.c == 0) {
                        aVar.b = tVar;
                        aVar.c = 1;
                        aVar.h();
                        if (!aVar.g) {
                            aVar.d = vVar;
                            aVar.f = false;
                            aVar.e = j2;
                            aVar.a(oVarArr);
                            aVar.a(z2, j);
                            com.fyber.inneractive.sdk.player.exoplayer2.util.h d = aVar.d();
                            if (d != null) {
                                if (this.n == null) {
                                    this.n = d;
                                    this.m = aVar;
                                    ((com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer) d).Q.a(this.l);
                                } else {
                                    throw new com.fyber.inneractive.sdk.player.exoplayer2.d(new java.lang.IllegalStateException("Multiple renderer media clocks enabled."));
                                }
                            }
                            if (z) {
                                if (aVar.c == 1) {
                                    aVar.c = 2;
                                    aVar.i();
                                } else {
                                    throw new java.lang.IllegalStateException();
                                }
                            }
                        } else {
                            throw new java.lang.IllegalStateException();
                        }
                    } else {
                        throw new java.lang.IllegalStateException();
                    }
                } else {
                    i2 = i3;
                }
                i4 = i5;
            } else {
                i2 = i3;
            }
            i3 = i2 + 1;
        }
    }
}
