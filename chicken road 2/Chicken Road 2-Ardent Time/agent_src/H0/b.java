package H0;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements a1.InterfaceC0062b, io.appmetrica.analytics.impl.Rd, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable, io.appmetrica.analytics.impl.InterfaceC0427i6, io.appmetrica.analytics.impl.InterfaceC0469jn, io.appmetrica.analytics.impl.zo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f612a;

    public /* synthetic */ b(int i2) {
        this.f612a = i2;
    }

    @Override // io.appmetrica.analytics.impl.Rd
    public io.appmetrica.analytics.impl.InterfaceC0235al a(io.appmetrica.analytics.impl.G0 g02) {
        switch (this.f612a) {
            case 12:
                return io.appmetrica.analytics.impl.Id.a(g02);
            default:
                return io.appmetrica.analytics.impl.Id.b(g02);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public java.lang.Object apply(java.lang.Object obj) {
        java.util.List a2;
        java.lang.Boolean a3;
        switch (this.f612a) {
            case 14:
                return io.appmetrica.analytics.impl.N7.a((android.app.UiModeManager) obj);
            case 15:
            default:
                a3 = io.appmetrica.analytics.impl.C0733u2.a((android.app.ActivityManager) obj);
                return a3;
            case 16:
                return io.appmetrica.analytics.impl.C0392gn.b((android.app.Activity) obj);
            case 17:
                a2 = io.appmetrica.analytics.impl.C0597ol.a((android.telephony.SubscriptionManager) obj);
                return a2;
        }
    }

    @Override // a1.InterfaceC0062b
    public void g(java.lang.Object obj, x0.e eVar) {
        java.lang.Long valueOf;
        switch (this.f612a) {
            case 0:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
                try {
                    com.yandex.varioqub.config.Varioqub.putClientFeature((java.lang.String) arrayList2.get(0), (java.lang.String) arrayList2.get(1));
                    arrayList.add(0, null);
                } catch (java.lang.Throwable th) {
                    arrayList = Q1.l.D(th);
                }
                eVar.f(arrayList);
                break;
            case 1:
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                try {
                    com.yandex.varioqub.config.Varioqub.clearClientFeatures();
                    arrayList3.add(0, null);
                } catch (java.lang.Throwable th2) {
                    arrayList3 = Q1.l.D(th2);
                }
                eVar.f(arrayList3);
                break;
            case 2:
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                try {
                    arrayList4.add(0, new java.util.ArrayList(com.yandex.varioqub.config.Varioqub.getAllKeys()));
                } catch (java.lang.Throwable th3) {
                    arrayList4 = Q1.l.D(th3);
                }
                eVar.f(arrayList4);
                break;
            case 3:
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                try {
                    com.yandex.varioqub.config.Varioqub.setDefaults((java.util.Map) ((java.util.ArrayList) obj).get(0));
                    arrayList5.add(0, null);
                } catch (java.lang.Throwable th4) {
                    arrayList5 = Q1.l.D(th4);
                }
                eVar.f(arrayList5);
                break;
            case 4:
                com.yandex.varioqub.config.Varioqub.fetchConfig(new C.j(7, new x0.e(4, new java.util.ArrayList(), eVar)));
                break;
            case 5:
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                try {
                    com.yandex.varioqub.config.Varioqub.activateConfig(null);
                    arrayList6.add(0, null);
                } catch (java.lang.Throwable th5) {
                    arrayList6 = Q1.l.D(th5);
                }
                eVar.f(arrayList6);
                break;
            case 6:
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.util.ArrayList arrayList8 = (java.util.ArrayList) obj;
                try {
                    arrayList7.add(0, com.yandex.varioqub.config.Varioqub.getString((java.lang.String) arrayList8.get(0), (java.lang.String) arrayList8.get(1)));
                } catch (java.lang.Throwable th6) {
                    arrayList7 = Q1.l.D(th6);
                }
                eVar.f(arrayList7);
                break;
            case 7:
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.util.ArrayList arrayList10 = (java.util.ArrayList) obj;
                try {
                    arrayList9.add(0, java.lang.Boolean.valueOf(com.yandex.varioqub.config.Varioqub.getBoolean((java.lang.String) arrayList10.get(0), ((java.lang.Boolean) arrayList10.get(1)).booleanValue())));
                } catch (java.lang.Throwable th7) {
                    arrayList9 = Q1.l.D(th7);
                }
                eVar.f(arrayList9);
                break;
            case 8:
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                java.util.ArrayList arrayList12 = (java.util.ArrayList) obj;
                java.lang.String str = (java.lang.String) arrayList12.get(0);
                java.lang.Number number = (java.lang.Number) arrayList12.get(1);
                if (number == null) {
                    valueOf = null;
                } else {
                    try {
                        valueOf = java.lang.Long.valueOf(number.longValue());
                    } catch (java.lang.Throwable th8) {
                        arrayList11 = Q1.l.D(th8);
                    }
                }
                arrayList11.add(0, java.lang.Long.valueOf(com.yandex.varioqub.config.Varioqub.getLong(str, valueOf.longValue())));
                eVar.f(arrayList11);
                break;
            case 9:
                java.util.ArrayList arrayList13 = new java.util.ArrayList();
                java.util.ArrayList arrayList14 = (java.util.ArrayList) obj;
                try {
                    arrayList13.add(0, java.lang.Double.valueOf(com.yandex.varioqub.config.Varioqub.getDouble((java.lang.String) arrayList14.get(0), ((java.lang.Double) arrayList14.get(1)).doubleValue())));
                } catch (java.lang.Throwable th9) {
                    arrayList13 = Q1.l.D(th9);
                }
                eVar.f(arrayList13);
                break;
            default:
                java.util.ArrayList arrayList15 = new java.util.ArrayList();
                try {
                    arrayList15.add(0, com.yandex.varioqub.config.Varioqub.getId());
                } catch (java.lang.Throwable th10) {
                    arrayList15 = Q1.l.D(th10);
                }
                eVar.f(arrayList15);
                break;
        }
    }

    public /* synthetic */ b(int i2, java.lang.Object obj) {
        this.f612a = i2;
    }

    @Override // io.appmetrica.analytics.impl.zo
    public org.json.JSONObject a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        switch (this.f612a) {
            case io.appmetrica.analytics.impl.C0326e9.f5792D /* 20 */:
                return io.appmetrica.analytics.impl.C0807wo.a(jSONObject, jSONObject2);
            default:
                return io.appmetrica.analytics.impl.C0833xo.a(jSONObject, jSONObject2);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0469jn
    public boolean a(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        return io.appmetrica.analytics.impl.C0699sk.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0427i6
    public boolean a(java.lang.Throwable th) {
        return io.appmetrica.analytics.impl.C0345f2.a(th);
    }
}
