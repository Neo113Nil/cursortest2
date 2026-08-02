package g0;

import w0.AbstractC2540a;
import z0.AbstractC2749f;
import z0.AbstractC2756m;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final o f17049b = new o();

    /* renamed from: c, reason: collision with root package name */
    public static final o f17050c = new o();

    /* renamed from: d, reason: collision with root package name */
    public static final o f17051d = new o();

    /* renamed from: a, reason: collision with root package name */
    public final R.e f17052a = new R.e(new p[16]);

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0046, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(i4.c cVar) {
        if (this == f17049b) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == f17050c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        R.e eVar = this.f17052a;
        int i = eVar.f5108m;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        Object[] objArr = eVar.f5106k;
        boolean z3 = false;
        for (int i5 = 0; i5 < i; i5++) {
            b0.o oVar = (b0.o) ((p) objArr[i5]);
            if (!oVar.f7162k.f7175x) {
                AbstractC2540a.b("visitChildren called on an unattached node");
            }
            R.e eVar2 = new R.e(new b0.o[16]);
            b0.o oVar2 = oVar.f7162k;
            b0.o oVar3 = oVar2.f7167p;
            if (oVar3 == null) {
                AbstractC2749f.b(eVar2, oVar2);
            } else {
                eVar2.c(oVar3);
            }
            while (true) {
                int i6 = eVar2.f5108m;
                if (i6 != 0) {
                    b0.o oVar4 = (b0.o) eVar2.l(i6 - 1);
                    if ((oVar4.f7165n & 1024) == 0) {
                        AbstractC2749f.b(eVar2, oVar4);
                    } else {
                        while (true) {
                            if (oVar4 == null) {
                                break;
                            }
                            if ((oVar4.f7164m & 1024) != 0) {
                                R.e eVar3 = null;
                                while (oVar4 != null) {
                                    if (oVar4 instanceof s) {
                                        s sVar = (s) oVar4;
                                        if (sVar.z0().f17040a ? ((Boolean) cVar.c(sVar)).booleanValue() : AbstractC1961f.i(sVar, 7, cVar)) {
                                            z3 = true;
                                            break;
                                        }
                                    } else if (((oVar4.f7164m & 1024) != 0) && (oVar4 instanceof AbstractC2756m)) {
                                        int i7 = 0;
                                        for (b0.o oVar5 = ((AbstractC2756m) oVar4).f21839z; oVar5 != null; oVar5 = oVar5.f7167p) {
                                            if ((oVar5.f7164m & 1024) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    oVar4 = oVar5;
                                                } else {
                                                    if (eVar3 == null) {
                                                        eVar3 = new R.e(new b0.o[16]);
                                                    }
                                                    if (oVar4 != null) {
                                                        eVar3.c(oVar4);
                                                        oVar4 = null;
                                                    }
                                                    eVar3.c(oVar5);
                                                }
                                            }
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    oVar4 = AbstractC2749f.f(eVar3);
                                }
                            } else {
                                oVar4 = oVar4.f7167p;
                            }
                        }
                    }
                }
            }
        }
        return z3;
    }
}
