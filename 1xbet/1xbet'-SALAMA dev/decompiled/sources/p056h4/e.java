package p056h4;

import p155w1.C1010l1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f13555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f13556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1010l1 f13557d;

    public /* synthetic */ e(f fVar, Runnable runnable, C1010l1 c1010l1, int i7) {
        this.f13554a = i7;
        this.f13555b = fVar;
        this.f13556c = runnable;
        this.f13557d = c1010l1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13554a) {
            case 0:
                f fVar = this.f13555b;
                fVar.getClass();
                final C1010l1 c1010l1 = this.f13557d;
                final Runnable runnable = this.f13556c;
                final int i7 = 0;
                fVar.f13558a.execute(new Runnable() { // from class: h4.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i7) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) c1010l1.f17777a).t(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e8) {
                                    ((h) c1010l1.f17777a).t(e8);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) c1010l1.f17777a;
                                try {
                                    runnable2.run();
                                    hVar.p(null);
                                    return;
                                } catch (Exception e9) {
                                    hVar.t(e9);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                f fVar2 = this.f13555b;
                fVar2.getClass();
                final C1010l1 c1010l2 = this.f13557d;
                final Runnable runnable2 = this.f13556c;
                final int i8 = 2;
                fVar2.f13558a.execute(new Runnable() { // from class: h4.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i8) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) c1010l2.f17777a).t(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e8) {
                                    ((h) c1010l2.f17777a).t(e8);
                                    return;
                                }
                            default:
                                Runnable runnable3 = runnable2;
                                h hVar = (h) c1010l2.f17777a;
                                try {
                                    runnable3.run();
                                    hVar.p(null);
                                    return;
                                } catch (Exception e9) {
                                    hVar.t(e9);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                f fVar3 = this.f13555b;
                fVar3.getClass();
                final C1010l1 c1010l3 = this.f13557d;
                final Runnable runnable3 = this.f13556c;
                final int i9 = 1;
                fVar3.f13558a.execute(new Runnable() { // from class: h4.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i9) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((h) c1010l3.f17777a).t(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e8) {
                                    ((h) c1010l3.f17777a).t(e8);
                                    return;
                                }
                            default:
                                Runnable runnable4 = runnable3;
                                h hVar = (h) c1010l3.f17777a;
                                try {
                                    runnable4.run();
                                    hVar.p(null);
                                    return;
                                } catch (Exception e9) {
                                    hVar.t(e9);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
