package C;

/* loaded from: classes.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f67b;

    public /* synthetic */ b(int i2, java.lang.Object obj) {
        this.f66a = i2;
        this.f67b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L1.a c2;
        long j2;
        h.C0151i c0151i;
        switch (this.f66a) {
            case 0:
                C.g gVar = (C.g) this.f67b;
                if (gVar.f84o) {
                    boolean z2 = gVar.f82m;
                    C.a aVar = gVar.f70a;
                    if (z2) {
                        gVar.f82m = false;
                        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
                        aVar.f61e = currentAnimationTimeMillis;
                        aVar.f63g = -1L;
                        aVar.f62f = currentAnimationTimeMillis;
                        aVar.f64h = 0.5f;
                    }
                    if ((aVar.f63g > 0 && android.view.animation.AnimationUtils.currentAnimationTimeMillis() > aVar.f63g + aVar.f65i) || !gVar.e()) {
                        gVar.f84o = false;
                        return;
                    }
                    boolean z3 = gVar.f83n;
                    android.widget.ListView listView = gVar.f72c;
                    if (z3) {
                        gVar.f83n = false;
                        long uptimeMillis = android.os.SystemClock.uptimeMillis();
                        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f62f == 0) {
                        throw new java.lang.RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar.f62f;
                    aVar.f62f = currentAnimationTimeMillis2;
                    gVar.f86q.scrollListBy((int) (j3 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.f60d));
                    java.lang.reflect.Field field = y.x.f8478a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                synchronized (((D0.h) this.f67b).f206c) {
                    D0.g gVar2 = ((D0.h) this.f67b).f207d;
                    if (gVar2 != null) {
                        D0.m mVar = (D0.m) gVar2.f203d;
                        synchronized (mVar.f213a) {
                            try {
                                if (!mVar.f215c) {
                                    mVar.f215c = true;
                                    mVar.f216d = true;
                                    mVar.f214b.d(mVar);
                                }
                            } finally {
                            }
                        }
                    }
                }
                return;
            case 2:
                ((I0.b) this.f67b).getClass();
                throw new java.lang.IllegalStateException("FragmentManager has not been attached to a host.");
            case 3:
                break;
            case 4:
                P.C0033f c0033f = (P.C0033f) this.f67b;
                int i2 = c0033f.f1268v;
                android.animation.ValueAnimator valueAnimator = c0033f.f1267u;
                if (i2 == 1) {
                    valueAnimator.cancel();
                } else if (i2 != 2) {
                    return;
                }
                c0033f.f1268v = 3;
                valueAnimator.setFloatValues(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 5:
                P.t tVar = ((androidx.recyclerview.widget.RecyclerView) this.f67b).f2449D;
                if (tVar != null) {
                    P.C0029b c0029b = (P.C0029b) tVar;
                    java.util.ArrayList arrayList = c0029b.f1232e;
                    boolean isEmpty = arrayList.isEmpty();
                    java.util.ArrayList arrayList2 = c0029b.f1234g;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    java.util.ArrayList arrayList3 = c0029b.f1235h;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    java.util.ArrayList arrayList4 = c0029b.f1233f;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
                        return;
                    }
                    java.util.Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new java.lang.ClassCastException();
                    }
                    arrayList.clear();
                    if (!isEmpty2) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        arrayList5.addAll(arrayList2);
                        java.util.ArrayList arrayList6 = c0029b.f1237j;
                        arrayList6.add(arrayList5);
                        arrayList2.clear();
                        if (!isEmpty) {
                            B1.a.m(arrayList5.get(0));
                            throw null;
                        }
                        java.util.Iterator it2 = arrayList5.iterator();
                        if (it2.hasNext()) {
                            B1.a.m(it2.next());
                            throw null;
                        }
                        arrayList5.clear();
                        arrayList6.remove(arrayList5);
                    }
                    if (!isEmpty3) {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        arrayList7.addAll(arrayList3);
                        java.util.ArrayList arrayList8 = c0029b.f1238k;
                        arrayList8.add(arrayList7);
                        arrayList3.clear();
                        if (!isEmpty) {
                            B1.a.m(arrayList7.get(0));
                            throw null;
                        }
                        java.util.Iterator it3 = arrayList7.iterator();
                        if (it3.hasNext()) {
                            B1.a.m(it3.next());
                            throw null;
                        }
                        arrayList7.clear();
                        arrayList8.remove(arrayList7);
                    }
                    if (isEmpty4) {
                        return;
                    }
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    arrayList9.addAll(arrayList4);
                    java.util.ArrayList arrayList10 = c0029b.f1236i;
                    arrayList10.add(arrayList9);
                    arrayList4.clear();
                    if (!isEmpty || !isEmpty2 || !isEmpty3) {
                        java.lang.Math.max(!isEmpty2 ? c0029b.f1298c : 0L, isEmpty3 ? 0L : c0029b.f1299d);
                        arrayList9.get(0).getClass();
                        throw new java.lang.ClassCastException();
                    }
                    java.util.Iterator it4 = arrayList9.iterator();
                    if (it4.hasNext()) {
                        it4.next().getClass();
                        throw new java.lang.ClassCastException();
                    }
                    arrayList9.clear();
                    arrayList10.remove(arrayList9);
                    return;
                }
                return;
            case 6:
                ((androidx.recyclerview.widget.StaggeredGridLayoutManager) this.f67b).J();
                return;
            case 7:
                h.AbstractC0167z abstractC0167z = (h.AbstractC0167z) this.f67b;
                abstractC0167z.f3293m = null;
                abstractC0167z.drawableStateChanged();
                return;
            case 8:
                androidx.appcompat.widget.ActionMenuView actionMenuView = ((androidx.appcompat.widget.Toolbar) this.f67b).f2133a;
                if (actionMenuView == null || (c0151i = actionMenuView.f2030s) == null) {
                    return;
                }
                c0151i.j();
                return;
            case 9:
                ((o0.m) this.f67b).h();
                return;
            case 10:
                n0.InterfaceC0939c interfaceC0939c = ((o0.m) ((Z0.h) this.f67b).f1903b).f8154b;
                interfaceC0939c.h(interfaceC0939c.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 11:
                ((o0.v) this.f67b).f8196h.b(new m0.b(4));
                return;
            case 12:
                throw null;
            case 13:
                java.lang.Object obj = ((Z0.h) this.f67b).f1903b;
                return;
            default:
                x0.e eVar = (x0.e) this.f67b;
                long j4 = x0.e.t((android.content.Context) eVar.f8409b).getLong("app_set_id_last_used_time", -1L);
                long j5 = j4 != -1 ? j4 + 33696000000L : -1L;
                if (j5 == -1 || java.lang.System.currentTimeMillis() <= j5) {
                    return;
                }
                android.content.Context context = (android.content.Context) eVar.f8409b;
                if (!x0.e.t(context).edit().remove(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_SET_ID).commit()) {
                    java.lang.String valueOf = java.lang.String.valueOf(context.getPackageName());
                    android.util.Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new java.lang.String("Failed to clear app set ID generated for App "));
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                java.lang.String valueOf2 = java.lang.String.valueOf(context.getPackageName());
                android.util.Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new java.lang.String("Failed to clear app set ID last used time for App "));
                return;
        }
        while (true) {
            L1.d dVar = (L1.d) this.f67b;
            synchronized (dVar) {
                c2 = dVar.c();
            }
            if (c2 == null) {
                return;
            }
            L1.c cVar = c2.f987c;
            kotlin.jvm.internal.i.b(cVar);
            L1.d dVar2 = (L1.d) this.f67b;
            boolean isLoggable = L1.d.f998i.isLoggable(java.util.logging.Level.FINE);
            if (isLoggable) {
                C.j jVar = cVar.f991a.f999a;
                j2 = java.lang.System.nanoTime();
                Q1.d.a(c2, cVar, "starting");
            } else {
                j2 = -1;
            }
            try {
                L1.d.a(dVar2, c2);
                if (isLoggable) {
                    C.j jVar2 = cVar.f991a.f999a;
                    Q1.d.a(c2, cVar, kotlin.jvm.internal.i.h(Q1.d.j(java.lang.System.nanoTime() - j2), "finished run in "));
                }
            } catch (java.lang.Throwable th) {
                try {
                    ((java.util.concurrent.ThreadPoolExecutor) dVar2.f999a.f88b).execute(this);
                    throw th;
                } catch (java.lang.Throwable th2) {
                    if (isLoggable) {
                        C.j jVar3 = cVar.f991a.f999a;
                        Q1.d.a(c2, cVar, kotlin.jvm.internal.i.h(Q1.d.j(java.lang.System.nanoTime() - j2), "failed a run in "));
                    }
                    throw th2;
                }
            }
        }
    }

    public b(o0.j jVar, M1.n nVar) {
        this.f66a = 12;
        this.f67b = nVar;
    }

    public b(Z0.h hVar, int i2) {
        this.f66a = 13;
        this.f67b = hVar;
    }
}
