package O1;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f2246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f2247c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B1.g f2248d;

    public /* synthetic */ e(g gVar, Runnable runnable, B1.g gVar2, int i2) {
        this.f2245a = i2;
        this.f2246b = gVar;
        this.f2247c = runnable;
        this.f2248d = gVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2245a) {
            case 0:
                g gVar = this.f2246b;
                gVar.getClass();
                final Runnable runnable = this.f2247c;
                final B1.g gVar2 = this.f2248d;
                final int i2 = 0;
                gVar.f2253a.execute(new Runnable() { // from class: O1.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e3) {
                                    gVar2.m(e3);
                                    throw e3;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e6) {
                                    gVar2.m(e6);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                B1.g gVar3 = gVar2;
                                try {
                                    runnable2.run();
                                    i iVar = (i) gVar3.f215b;
                                    iVar.getClass();
                                    if (s.g.f11743f.H(iVar, null, s.g.f11744g)) {
                                        s.g.e(iVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e7) {
                                    gVar3.m(e7);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                g gVar3 = this.f2246b;
                gVar3.getClass();
                final Runnable runnable2 = this.f2247c;
                final B1.g gVar4 = this.f2248d;
                final int i3 = 2;
                gVar3.f2253a.execute(new Runnable() { // from class: O1.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e3) {
                                    gVar4.m(e3);
                                    throw e3;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e6) {
                                    gVar4.m(e6);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                B1.g gVar32 = gVar4;
                                try {
                                    runnable22.run();
                                    i iVar = (i) gVar32.f215b;
                                    iVar.getClass();
                                    if (s.g.f11743f.H(iVar, null, s.g.f11744g)) {
                                        s.g.e(iVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e7) {
                                    gVar32.m(e7);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                g gVar5 = this.f2246b;
                gVar5.getClass();
                final Runnable runnable3 = this.f2247c;
                final B1.g gVar6 = this.f2248d;
                final int i6 = 1;
                gVar5.f2253a.execute(new Runnable() { // from class: O1.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i6) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e3) {
                                    gVar6.m(e3);
                                    throw e3;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e6) {
                                    gVar6.m(e6);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                B1.g gVar32 = gVar6;
                                try {
                                    runnable22.run();
                                    i iVar = (i) gVar32.f215b;
                                    iVar.getClass();
                                    if (s.g.f11743f.H(iVar, null, s.g.f11744g)) {
                                        s.g.e(iVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e7) {
                                    gVar32.m(e7);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
