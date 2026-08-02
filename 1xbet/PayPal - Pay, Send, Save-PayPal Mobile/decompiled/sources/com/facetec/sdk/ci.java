package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class ci extends com.facetec.sdk.fd implements com.facetec.sdk.ha {

    /* renamed from: a, reason: collision with root package name */
    private com.facetec.sdk.gz f3463a;
    private com.facetec.sdk.gy d;
    private com.facetec.sdk.eo e;

    public ci(com.facetec.sdk.eo eoVar, com.facetec.sdk.gz gzVar, com.facetec.sdk.gy gyVar) {
        this.e = eoVar;
        this.f3463a = gzVar;
        this.d = gyVar;
    }

    @Override // com.facetec.sdk.fd
    public final void a(com.facetec.sdk.gu guVar, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            guVar.g();
            return;
        }
        com.facetec.sdk.o oVar = (com.facetec.sdk.o) obj;
        com.facetec.sdk.eo eoVar = this.e;
        com.facetec.sdk.gy gyVar = this.d;
        guVar.e();
        if (oVar != oVar.f3697a) {
            gyVar.e(guVar, 10);
            guVar.d(oVar.f3697a);
        }
        if (oVar != oVar.d) {
            gyVar.e(guVar, 4);
            com.facetec.sdk.p pVar = oVar.d;
            java.lang.reflect.Type b = com.facetec.sdk.gx.b(com.facetec.sdk.p.class, pVar);
            com.facetec.sdk.fd a2 = eoVar.a((com.facetec.sdk.gw) com.facetec.sdk.gw.d(b));
            if (com.facetec.sdk.p.class != b && !com.facetec.sdk.gx.a(a2)) {
                com.facetec.sdk.fd e = eoVar.e(com.facetec.sdk.p.class);
                if (com.facetec.sdk.gx.a(e)) {
                    a2 = e;
                }
            }
            a2.a(guVar, pVar);
        }
        if (oVar != oVar.e) {
            gyVar.e(guVar, 3);
            com.facetec.sdk.l lVar = new com.facetec.sdk.l();
            java.util.ArrayList<java.lang.String> arrayList = oVar.e;
            java.lang.reflect.Type b2 = lVar.b();
            java.lang.reflect.Type b3 = com.facetec.sdk.gx.b(b2, arrayList);
            com.facetec.sdk.fd a3 = eoVar.a((com.facetec.sdk.gw) com.facetec.sdk.gw.d(b3));
            if (b2 != b3 && !com.facetec.sdk.gx.a(a3)) {
                com.facetec.sdk.fd a4 = eoVar.a((com.facetec.sdk.gw) lVar);
                if (com.facetec.sdk.gx.a(a4)) {
                    a3 = a4;
                }
            }
            a3.a(guVar, arrayList);
        }
        if (oVar != oVar.c) {
            gyVar.e(guVar, 6);
            guVar.d(oVar.c);
        }
        if (oVar != oVar.b) {
            gyVar.e(guVar, 9);
            guVar.d(oVar.b);
        }
        if (oVar != oVar.i) {
            gyVar.e(guVar, 7);
            guVar.d(oVar.i);
        }
        if (oVar != oVar.h) {
            gyVar.e(guVar, 2);
            guVar.d(oVar.h);
        }
        if (oVar != oVar.g) {
            gyVar.e(guVar, 8);
            guVar.d(oVar.g);
        }
        gyVar.e(guVar, 1);
        guVar.b(oVar.j);
        gyVar.e(guVar, 12);
        guVar.e(java.lang.Integer.valueOf(oVar.f));
        guVar.d();
    }

    @Override // com.facetec.sdk.fd
    public final java.lang.Object b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
        if (gtVar.f() == com.facetec.sdk.gs.NULL) {
            gtVar.n();
            return null;
        }
        com.facetec.sdk.o oVar = new com.facetec.sdk.o();
        com.facetec.sdk.eo eoVar = this.e;
        com.facetec.sdk.gz gzVar = this.f3463a;
        gtVar.b();
        while (gtVar.d()) {
            int c = gzVar.c(gtVar);
            boolean z = gtVar.f() != com.facetec.sdk.gs.NULL;
            switch (c) {
                case 1:
                    if (!z) {
                        oVar.f3697a = null;
                        break;
                    } else {
                        oVar.f3697a = gtVar.f() != com.facetec.sdk.gs.BOOLEAN ? gtVar.g() : java.lang.Boolean.toString(gtVar.j());
                    }
                case 2:
                case 10:
                default:
                    gtVar.n();
                    continue;
                case 3:
                    if (!z) {
                        break;
                    } else {
                        try {
                            oVar.f = gtVar.o();
                        } catch (java.lang.NumberFormatException e) {
                            throw new com.facetec.sdk.ev(e);
                        }
                    }
                case 4:
                    if (!z) {
                        oVar.b = null;
                        break;
                    } else {
                        oVar.b = gtVar.f() != com.facetec.sdk.gs.BOOLEAN ? gtVar.g() : java.lang.Boolean.toString(gtVar.j());
                    }
                case 5:
                    if (!z) {
                        oVar.h = null;
                        break;
                    } else {
                        oVar.h = gtVar.f() != com.facetec.sdk.gs.BOOLEAN ? gtVar.g() : java.lang.Boolean.toString(gtVar.j());
                    }
                case 6:
                    if (!z) {
                        oVar.d = null;
                        break;
                    } else {
                        oVar.d = (com.facetec.sdk.p) eoVar.e(com.facetec.sdk.p.class).b(gtVar);
                    }
                case 7:
                    if (!z) {
                        oVar.i = null;
                        break;
                    } else {
                        oVar.i = gtVar.f() != com.facetec.sdk.gs.BOOLEAN ? gtVar.g() : java.lang.Boolean.toString(gtVar.j());
                    }
                case 8:
                    if (!z) {
                        oVar.g = null;
                        break;
                    } else {
                        oVar.g = gtVar.f() != com.facetec.sdk.gs.BOOLEAN ? gtVar.g() : java.lang.Boolean.toString(gtVar.j());
                    }
                case 9:
                    if (!z) {
                        oVar.e = null;
                        break;
                    } else {
                        oVar.e = (java.util.ArrayList) eoVar.a((com.facetec.sdk.gw) new com.facetec.sdk.l()).b(gtVar);
                    }
                case 11:
                    if (!z) {
                        oVar.c = null;
                        break;
                    } else {
                        oVar.c = gtVar.f() != com.facetec.sdk.gs.BOOLEAN ? gtVar.g() : java.lang.Boolean.toString(gtVar.j());
                    }
                case 12:
                    if (!z) {
                        break;
                    } else {
                        oVar.j = ((java.lang.Boolean) eoVar.e(java.lang.Boolean.class).b(gtVar)).booleanValue();
                    }
            }
            gtVar.k();
        }
        gtVar.c();
        return oVar;
    }
}
