package com.facetec.sdk;

/* loaded from: classes8.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    private android.content.Context f3775a;
    private int c = 50;
    private int d = 3;
    private com.facetec.sdk.ag e = new com.facetec.sdk.ag();
    private com.facetec.sdk.ab b = null;
    private com.facetec.sdk.ac h = com.facetec.sdk.ac.INITIALIZED;
    private com.facetec.sdk.q j = new com.facetec.sdk.q();
    private java.util.List<com.facetec.sdk.q> f = new java.util.ArrayList();
    private java.util.List<com.facetec.sdk.q> g = new java.util.ArrayList();
    private int i = -1;
    private int m = 0;
    private boolean k = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f3776o = false;
    private boolean l = false;
    private int n = 0;

    z(android.content.Context context) {
        this.f3775a = context;
    }

    final void c(boolean z) {
        synchronized (this) {
            if (this.h != com.facetec.sdk.ac.STARTED && !this.l) {
                this.h = com.facetec.sdk.ac.STARTED;
                this.k = false;
                this.f3776o = false;
                this.i++;
                this.e.d(false);
                int i = this.i;
                if (i != 0) {
                    if (!z && i > 0 && this.j.e.size() > 0) {
                        this.m = 0;
                        if (this.f.size() == 50) {
                            this.f.remove(0);
                        }
                        this.j.f3758a = new java.util.ArrayList();
                        this.f.add(this.j);
                        this.j = new com.facetec.sdk.q();
                    }
                    return;
                }
                if (this.b == null) {
                    this.b = com.facetec.sdk.d.e(this.f3775a);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.facetec.sdk.v vVar : this.b.f3375a) {
                    if (vVar.f3768a.size() > 0) {
                        arrayList.add(vVar.f3768a);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    com.facetec.sdk.q qVar = new com.facetec.sdk.q();
                    qVar.e = (java.util.List) arrayList.get(i2);
                    for (int i3 = 0; i3 < qVar.e.size(); i3++) {
                        for (int i4 = 0; i4 < qVar.e.get(i3).size(); i4++) {
                            com.facetec.sdk.aa aaVar = new com.facetec.sdk.aa();
                            aaVar.d = i3;
                            aaVar.b = qVar.e.get(i3).get(i4).intValue();
                            arrayList3.add(aaVar);
                        }
                    }
                    qVar.b = arrayList3;
                    arrayList2.add(qVar);
                }
                this.g.addAll(arrayList2);
            }
        }
    }

    final void a(boolean z, final java.lang.Runnable runnable) {
        synchronized (this) {
            if (this.h != com.facetec.sdk.ac.ENDED && !this.l) {
                this.h = com.facetec.sdk.ac.ENDED;
                if (!z) {
                    int i = this.n + 1;
                    this.n = i;
                    if (i > 3) {
                        this.j = new com.facetec.sdk.q();
                        this.e.d(true);
                        return;
                    }
                } else {
                    this.n = 0;
                }
                com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.z$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facetec.sdk.z.this.a(runnable);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(java.lang.Runnable runnable) {
        synchronized (this) {
            e(0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i = 0;
            int i2 = -1;
            while (i < this.j.b.size()) {
                com.facetec.sdk.aa aaVar = this.j.b.get(i);
                if (i2 == -1 || i2 != aaVar.d) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    int i3 = aaVar.d;
                    int i4 = i;
                    while (i < this.j.b.size() && this.j.b.get(i).d == i3) {
                        arrayList2.add(java.lang.Integer.valueOf(this.j.b.get(i).b));
                        i4 = i;
                        i++;
                    }
                    arrayList.add(arrayList2);
                    i2 = i3;
                    i = i4;
                }
                i++;
            }
            this.j.e = arrayList;
            com.facetec.sdk.y yVar = new com.facetec.sdk.y();
            com.facetec.sdk.q qVar = this.j;
            java.util.List<com.facetec.sdk.q> list = this.f;
            java.util.List<com.facetec.sdk.q> list2 = this.g;
            yVar.d = qVar;
            com.facetec.sdk.w wVar = yVar.b;
            wVar.d = new java.util.ArrayList(list2);
            wVar.c = new java.util.ArrayList(list);
            wVar.c.add(qVar);
            wVar.b = com.facetec.sdk.ad.a(wVar.c);
            wVar.e = new java.util.ArrayList(qVar.e);
            wVar.f3772a = com.facetec.sdk.ad.a(list).size();
            wVar.h = new java.util.ArrayList();
            wVar.h.add(wVar.b);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                wVar.h.add(list2.get(i5).e);
            }
            wVar.g = new java.util.ArrayList();
            for (int i6 = 0; i6 < wVar.h.size(); i6++) {
                wVar.g.addAll(wVar.h.get(i6));
            }
            yVar.e = yVar.e(yVar.b.e, 0, com.facetec.sdk.u.INTRA_SESSION);
            yVar.f3774a = yVar.e(yVar.b.b, yVar.b.f3772a, com.facetec.sdk.u.INTRA_FACETEC_SESSION);
            yVar.c = yVar.e(yVar.b.g, yVar.b.b.size(), com.facetec.sdk.u.INTER_FACETEC_SESSION);
            yVar.d.i = yVar.e ? com.facetec.sdk.x.DETECTED : com.facetec.sdk.x.NOT_DETECTED;
            yVar.d.j = yVar.f3774a ? com.facetec.sdk.x.DETECTED : com.facetec.sdk.x.NOT_DETECTED;
            yVar.d.f = yVar.c ? com.facetec.sdk.x.DETECTED : com.facetec.sdk.x.NOT_DETECTED;
            yVar.b = new com.facetec.sdk.w();
            this.j = yVar.d;
            if (runnable != null) {
                runnable.run();
            }
            this.e.d(true);
            com.facetec.sdk.dk.e(new java.lang.Runnable() { // from class: com.facetec.sdk.z$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.z.this.i();
                }
            });
        }
    }

    final void c() {
        synchronized (this) {
            this.f = null;
            this.g = null;
            this.b = null;
            this.l = true;
            this.e.d(true);
        }
    }

    final com.facetec.sdk.q a() {
        com.facetec.sdk.q qVar;
        synchronized (this) {
            qVar = this.j;
        }
        return qVar;
    }

    final boolean d() {
        com.facetec.sdk.ac acVar;
        com.facetec.sdk.ac acVar2;
        synchronized (this) {
            acVar = this.h;
            acVar2 = com.facetec.sdk.ac.STARTED;
        }
        return acVar == acVar2;
    }

    final boolean e() {
        com.facetec.sdk.ac acVar;
        com.facetec.sdk.ac acVar2;
        synchronized (this) {
            acVar = this.h;
            acVar2 = com.facetec.sdk.ac.ENDED;
        }
        return acVar == acVar2;
    }

    final boolean b() {
        synchronized (this) {
            if (this.h == com.facetec.sdk.ac.STARTED) {
                if (!this.l) {
                    return true;
                }
            }
            return false;
        }
    }

    final void a(byte[] bArr) {
        synchronized (this) {
            if (b() && bArr.length != 0) {
                com.facetec.sdk.aa aaVar = new com.facetec.sdk.aa();
                aaVar.e = bArr;
                aaVar.f3374a = this.j.b.size();
                aaVar.d = this.i;
                this.j.b.add(aaVar);
                if (this.j.b.size() % 20 == 0) {
                    this.f3776o = true;
                }
                if (this.f3776o && !this.k) {
                    e(this.m);
                }
            }
        }
    }

    private void e(int i) {
        if (i == 0 || (!this.k && this.f3776o)) {
            this.k = true;
            this.f3776o = false;
            while (i < this.j.b.size()) {
                if (this.j.b.get(i).e.length != 0) {
                    this.j.b.get(i).b = java.util.Arrays.hashCode(this.j.b.get(i).e);
                    this.j.b.get(i).e = new byte[0];
                    this.m = i + 1;
                }
                i++;
            }
            this.k = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        synchronized (this) {
            if (this.l) {
                com.facetec.sdk.t.c(this.f3775a, com.facetec.sdk.c.F2F_ERROR, "Error 4472", (java.lang.Throwable) null);
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (this.f.size() > 0) {
                java.util.List<com.facetec.sdk.q> list = this.f;
                arrayList = new java.util.ArrayList(java.util.Arrays.asList(list.get(list.size() - 1)));
            }
            arrayList.add(this.j);
            java.util.ArrayList<com.facetec.sdk.q> arrayList2 = new java.util.ArrayList(java.util.Arrays.asList(com.facetec.sdk.ad.d(arrayList)));
            arrayList2.addAll(this.g);
            com.facetec.sdk.ab abVar = new com.facetec.sdk.ab(this.f3775a);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (com.facetec.sdk.q qVar : arrayList2) {
                com.facetec.sdk.v vVar = new com.facetec.sdk.v();
                vVar.f3768a = qVar.e;
                vVar.d = qVar.e.size();
                vVar.b = qVar.i;
                vVar.e = qVar.j;
                vVar.h = qVar.f;
                vVar.c = com.facetec.sdk.ad.d(vVar.b().toString());
                arrayList3.add(vVar);
            }
            abVar.f3375a = arrayList3;
            abVar.d = arrayList2.size();
            abVar.e = com.facetec.sdk.ad.d(abVar.e().toString());
            abVar.e = com.facetec.sdk.ad.d(abVar.e().toString());
            if (abVar.e > 4500) {
                abVar.f3375a.remove(abVar.f3375a.size() - 1);
                abVar.e = com.facetec.sdk.ad.d(abVar.e().toString());
                java.util.List<com.facetec.sdk.ab.e> c = abVar.c();
                for (int size = c.size() - 1; size >= 0 && abVar.e > 4500; size--) {
                    abVar.f3375a.remove(c.get(size).d);
                    abVar.e = com.facetec.sdk.ad.d(abVar.e().toString());
                }
            }
            this.b = abVar;
            com.facetec.sdk.d.c(this.f3775a, abVar);
        }
    }

    final void h() {
        if (e()) {
            com.facetec.sdk.ag agVar = this.e;
            synchronized (agVar.f3383a) {
                if (agVar.e) {
                    return;
                }
                try {
                    agVar.f3383a.wait(5000L);
                    if (!com.facetec.sdk.ag.c && !agVar.e) {
                        throw new java.lang.AssertionError();
                    }
                } catch (java.lang.InterruptedException unused) {
                }
            }
        }
    }
}
