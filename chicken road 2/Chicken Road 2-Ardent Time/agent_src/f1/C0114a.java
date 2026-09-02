package f1;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0114a implements W0.b {

    /* renamed from: a, reason: collision with root package name */
    public android.content.SharedPreferences f2828a;

    /* renamed from: b, reason: collision with root package name */
    public final m0.j f2829b = new m0.j(28, false);

    public static void d(a1.f fVar, final f1.C0114a c0114a) {
        m0.j f2 = fVar.f(new a1.i());
        f1.C0115b c0115b = f1.C0115b.f2830b;
        F.C0014n c0014n = new F.C0014n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", c0115b, f2);
        if (c0114a != null) {
            final int i2 = 0;
            c0014n.h(new a1.InterfaceC0062b(c0114a) { // from class: f1.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f1.C0114a f2833b;

                {
                    this.f2833b = c0114a;
                }

                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    switch (i2) {
                        case 0:
                            f1.C0114a c0114a2 = this.f2833b;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, java.lang.Boolean.valueOf(c0114a2.f2828a.edit().remove((java.lang.String) ((java.util.ArrayList) obj).get(0)).commit()));
                            } catch (java.lang.Throwable th) {
                                arrayList = Q1.d.C(th);
                            }
                            eVar.f(arrayList);
                            break;
                        case 1:
                            f1.C0114a c0114a3 = this.f2833b;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            try {
                                arrayList2.add(0, java.lang.Boolean.valueOf(c0114a3.f2828a.edit().putBoolean((java.lang.String) arrayList3.get(0), ((java.lang.Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = Q1.d.C(th2);
                            }
                            eVar.f(arrayList2);
                            break;
                        case 2:
                            f1.C0114a c0114a4 = this.f2833b;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c0114a4.c((java.lang.String) arrayList5.get(0), (java.lang.String) arrayList5.get(1)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = Q1.d.C(th3);
                            }
                            eVar.f(arrayList4);
                            break;
                        case 3:
                            f1.C0114a c0114a5 = this.f2833b;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            try {
                                arrayList6.add(0, java.lang.Boolean.valueOf(c0114a5.f2828a.edit().putLong((java.lang.String) arrayList7.get(0), ((java.lang.Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = Q1.d.C(th4);
                            }
                            eVar.f(arrayList6);
                            break;
                        case 4:
                            f1.C0114a c0114a6 = this.f2833b;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList9.get(0);
                            java.lang.Double d2 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0114a6.getClass();
                                java.lang.String d3 = java.lang.Double.toString(d2.doubleValue());
                                arrayList8.add(0, java.lang.Boolean.valueOf(c0114a6.f2828a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (java.lang.Throwable th5) {
                                arrayList8 = Q1.d.C(th5);
                            }
                            eVar.f(arrayList8);
                            break;
                        case 5:
                            f1.C0114a c0114a7 = this.f2833b;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            try {
                                arrayList10.add(0, java.lang.Boolean.valueOf(c0114a7.f2828a.edit().putString((java.lang.String) arrayList11.get(0), (java.lang.String) arrayList11.get(1)).commit()));
                            } catch (java.lang.Throwable th6) {
                                arrayList10 = Q1.d.C(th6);
                            }
                            eVar.f(arrayList10);
                            break;
                        case 6:
                            f1.C0114a c0114a8 = this.f2833b;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.util.ArrayList arrayList13 = (java.util.ArrayList) obj;
                            java.lang.String str2 = (java.lang.String) arrayList13.get(0);
                            java.util.List list = (java.util.List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, java.lang.Boolean.valueOf(c0114a8.f2828a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0114a8.f2829b.h(list)).commit()));
                            } catch (java.lang.Throwable th7) {
                                arrayList12 = Q1.d.C(th7);
                            }
                            eVar.f(arrayList12);
                            break;
                        case 7:
                            f1.C0114a c0114a9 = this.f2833b;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            try {
                                arrayList14.add(0, c0114a9.a((java.lang.String) arrayList15.get(0), (java.util.List) arrayList15.get(1)));
                            } catch (java.lang.Throwable th8) {
                                arrayList14 = Q1.d.C(th8);
                            }
                            eVar.f(arrayList14);
                            break;
                        default:
                            f1.C0114a c0114a10 = this.f2833b;
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            java.util.ArrayList arrayList17 = (java.util.ArrayList) obj;
                            try {
                                arrayList16.add(0, c0114a10.b((java.lang.String) arrayList17.get(0), (java.util.List) arrayList17.get(1)));
                            } catch (java.lang.Throwable th9) {
                                arrayList16 = Q1.d.C(th9);
                            }
                            eVar.f(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0014n.h(null);
        }
        F.C0014n c0014n2 = new F.C0014n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", c0115b, f2);
        if (c0114a != null) {
            final int i3 = 1;
            c0014n2.h(new a1.InterfaceC0062b(c0114a) { // from class: f1.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f1.C0114a f2833b;

                {
                    this.f2833b = c0114a;
                }

                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    switch (i3) {
                        case 0:
                            f1.C0114a c0114a2 = this.f2833b;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, java.lang.Boolean.valueOf(c0114a2.f2828a.edit().remove((java.lang.String) ((java.util.ArrayList) obj).get(0)).commit()));
                            } catch (java.lang.Throwable th) {
                                arrayList = Q1.d.C(th);
                            }
                            eVar.f(arrayList);
                            break;
                        case 1:
                            f1.C0114a c0114a3 = this.f2833b;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            try {
                                arrayList2.add(0, java.lang.Boolean.valueOf(c0114a3.f2828a.edit().putBoolean((java.lang.String) arrayList3.get(0), ((java.lang.Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = Q1.d.C(th2);
                            }
                            eVar.f(arrayList2);
                            break;
                        case 2:
                            f1.C0114a c0114a4 = this.f2833b;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c0114a4.c((java.lang.String) arrayList5.get(0), (java.lang.String) arrayList5.get(1)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = Q1.d.C(th3);
                            }
                            eVar.f(arrayList4);
                            break;
                        case 3:
                            f1.C0114a c0114a5 = this.f2833b;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            try {
                                arrayList6.add(0, java.lang.Boolean.valueOf(c0114a5.f2828a.edit().putLong((java.lang.String) arrayList7.get(0), ((java.lang.Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = Q1.d.C(th4);
                            }
                            eVar.f(arrayList6);
                            break;
                        case 4:
                            f1.C0114a c0114a6 = this.f2833b;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList9.get(0);
                            java.lang.Double d2 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0114a6.getClass();
                                java.lang.String d3 = java.lang.Double.toString(d2.doubleValue());
                                arrayList8.add(0, java.lang.Boolean.valueOf(c0114a6.f2828a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (java.lang.Throwable th5) {
                                arrayList8 = Q1.d.C(th5);
                            }
                            eVar.f(arrayList8);
                            break;
                        case 5:
                            f1.C0114a c0114a7 = this.f2833b;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            try {
                                arrayList10.add(0, java.lang.Boolean.valueOf(c0114a7.f2828a.edit().putString((java.lang.String) arrayList11.get(0), (java.lang.String) arrayList11.get(1)).commit()));
                            } catch (java.lang.Throwable th6) {
                                arrayList10 = Q1.d.C(th6);
                            }
                            eVar.f(arrayList10);
                            break;
                        case 6:
                            f1.C0114a c0114a8 = this.f2833b;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.util.ArrayList arrayList13 = (java.util.ArrayList) obj;
                            java.lang.String str2 = (java.lang.String) arrayList13.get(0);
                            java.util.List list = (java.util.List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, java.lang.Boolean.valueOf(c0114a8.f2828a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0114a8.f2829b.h(list)).commit()));
                            } catch (java.lang.Throwable th7) {
                                arrayList12 = Q1.d.C(th7);
                            }
                            eVar.f(arrayList12);
                            break;
                        case 7:
                            f1.C0114a c0114a9 = this.f2833b;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            try {
                                arrayList14.add(0, c0114a9.a((java.lang.String) arrayList15.get(0), (java.util.List) arrayList15.get(1)));
                            } catch (java.lang.Throwable th8) {
                                arrayList14 = Q1.d.C(th8);
                            }
                            eVar.f(arrayList14);
                            break;
                        default:
                            f1.C0114a c0114a10 = this.f2833b;
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            java.util.ArrayList arrayList17 = (java.util.ArrayList) obj;
                            try {
                                arrayList16.add(0, c0114a10.b((java.lang.String) arrayList17.get(0), (java.util.List) arrayList17.get(1)));
                            } catch (java.lang.Throwable th9) {
                                arrayList16 = Q1.d.C(th9);
                            }
                            eVar.f(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0014n2.h(null);
        }
        F.C0014n c0014n3 = new F.C0014n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", c0115b, f2);
        if (c0114a != null) {
            final int i4 = 2;
            c0014n3.h(new a1.InterfaceC0062b(c0114a) { // from class: f1.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f1.C0114a f2833b;

                {
                    this.f2833b = c0114a;
                }

                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    switch (i4) {
                        case 0:
                            f1.C0114a c0114a2 = this.f2833b;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, java.lang.Boolean.valueOf(c0114a2.f2828a.edit().remove((java.lang.String) ((java.util.ArrayList) obj).get(0)).commit()));
                            } catch (java.lang.Throwable th) {
                                arrayList = Q1.d.C(th);
                            }
                            eVar.f(arrayList);
                            break;
                        case 1:
                            f1.C0114a c0114a3 = this.f2833b;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            try {
                                arrayList2.add(0, java.lang.Boolean.valueOf(c0114a3.f2828a.edit().putBoolean((java.lang.String) arrayList3.get(0), ((java.lang.Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = Q1.d.C(th2);
                            }
                            eVar.f(arrayList2);
                            break;
                        case 2:
                            f1.C0114a c0114a4 = this.f2833b;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c0114a4.c((java.lang.String) arrayList5.get(0), (java.lang.String) arrayList5.get(1)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = Q1.d.C(th3);
                            }
                            eVar.f(arrayList4);
                            break;
                        case 3:
                            f1.C0114a c0114a5 = this.f2833b;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            try {
                                arrayList6.add(0, java.lang.Boolean.valueOf(c0114a5.f2828a.edit().putLong((java.lang.String) arrayList7.get(0), ((java.lang.Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = Q1.d.C(th4);
                            }
                            eVar.f(arrayList6);
                            break;
                        case 4:
                            f1.C0114a c0114a6 = this.f2833b;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList9.get(0);
                            java.lang.Double d2 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0114a6.getClass();
                                java.lang.String d3 = java.lang.Double.toString(d2.doubleValue());
                                arrayList8.add(0, java.lang.Boolean.valueOf(c0114a6.f2828a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (java.lang.Throwable th5) {
                                arrayList8 = Q1.d.C(th5);
                            }
                            eVar.f(arrayList8);
                            break;
                        case 5:
                            f1.C0114a c0114a7 = this.f2833b;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            try {
                                arrayList10.add(0, java.lang.Boolean.valueOf(c0114a7.f2828a.edit().putString((java.lang.String) arrayList11.get(0), (java.lang.String) arrayList11.get(1)).commit()));
                            } catch (java.lang.Throwable th6) {
                                arrayList10 = Q1.d.C(th6);
                            }
                            eVar.f(arrayList10);
                            break;
                        case 6:
                            f1.C0114a c0114a8 = this.f2833b;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.util.ArrayList arrayList13 = (java.util.ArrayList) obj;
                            java.lang.String str2 = (java.lang.String) arrayList13.get(0);
                            java.util.List list = (java.util.List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, java.lang.Boolean.valueOf(c0114a8.f2828a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0114a8.f2829b.h(list)).commit()));
                            } catch (java.lang.Throwable th7) {
                                arrayList12 = Q1.d.C(th7);
                            }
                            eVar.f(arrayList12);
                            break;
                        case 7:
                            f1.C0114a c0114a9 = this.f2833b;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            try {
                                arrayList14.add(0, c0114a9.a((java.lang.String) arrayList15.get(0), (java.util.List) arrayList15.get(1)));
                            } catch (java.lang.Throwable th8) {
                                arrayList14 = Q1.d.C(th8);
                            }
                            eVar.f(arrayList14);
                            break;
                        default:
                            f1.C0114a c0114a10 = this.f2833b;
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            java.util.ArrayList arrayList17 = (java.util.ArrayList) obj;
                            try {
                                arrayList16.add(0, c0114a10.b((java.lang.String) arrayList17.get(0), (java.util.List) arrayList17.get(1)));
                            } catch (java.lang.Throwable th9) {
                                arrayList16 = Q1.d.C(th9);
                            }
                            eVar.f(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0014n3.h(null);
        }
        F.C0014n c0014n4 = new F.C0014n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", c0115b, f2);
        if (c0114a != null) {
            final int i5 = 3;
            c0014n4.h(new a1.InterfaceC0062b(c0114a) { // from class: f1.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f1.C0114a f2833b;

                {
                    this.f2833b = c0114a;
                }

                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    switch (i5) {
                        case 0:
                            f1.C0114a c0114a2 = this.f2833b;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, java.lang.Boolean.valueOf(c0114a2.f2828a.edit().remove((java.lang.String) ((java.util.ArrayList) obj).get(0)).commit()));
                            } catch (java.lang.Throwable th) {
                                arrayList = Q1.d.C(th);
                            }
                            eVar.f(arrayList);
                            break;
                        case 1:
                            f1.C0114a c0114a3 = this.f2833b;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            try {
                                arrayList2.add(0, java.lang.Boolean.valueOf(c0114a3.f2828a.edit().putBoolean((java.lang.String) arrayList3.get(0), ((java.lang.Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = Q1.d.C(th2);
                            }
                            eVar.f(arrayList2);
                            break;
                        case 2:
                            f1.C0114a c0114a4 = this.f2833b;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c0114a4.c((java.lang.String) arrayList5.get(0), (java.lang.String) arrayList5.get(1)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = Q1.d.C(th3);
                            }
                            eVar.f(arrayList4);
                            break;
                        case 3:
                            f1.C0114a c0114a5 = this.f2833b;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            try {
                                arrayList6.add(0, java.lang.Boolean.valueOf(c0114a5.f2828a.edit().putLong((java.lang.String) arrayList7.get(0), ((java.lang.Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = Q1.d.C(th4);
                            }
                            eVar.f(arrayList6);
                            break;
                        case 4:
                            f1.C0114a c0114a6 = this.f2833b;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList9.get(0);
                            java.lang.Double d2 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0114a6.getClass();
                                java.lang.String d3 = java.lang.Double.toString(d2.doubleValue());
                                arrayList8.add(0, java.lang.Boolean.valueOf(c0114a6.f2828a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (java.lang.Throwable th5) {
                                arrayList8 = Q1.d.C(th5);
                            }
                            eVar.f(arrayList8);
                            break;
                        case 5:
                            f1.C0114a c0114a7 = this.f2833b;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            try {
                                arrayList10.add(0, java.lang.Boolean.valueOf(c0114a7.f2828a.edit().putString((java.lang.String) arrayList11.get(0), (java.lang.String) arrayList11.get(1)).commit()));
                            } catch (java.lang.Throwable th6) {
                                arrayList10 = Q1.d.C(th6);
                            }
                            eVar.f(arrayList10);
                            break;
                        case 6:
                            f1.C0114a c0114a8 = this.f2833b;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.util.ArrayList arrayList13 = (java.util.ArrayList) obj;
                            java.lang.String str2 = (java.lang.String) arrayList13.get(0);
                            java.util.List list = (java.util.List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, java.lang.Boolean.valueOf(c0114a8.f2828a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0114a8.f2829b.h(list)).commit()));
                            } catch (java.lang.Throwable th7) {
                                arrayList12 = Q1.d.C(th7);
                            }
                            eVar.f(arrayList12);
                            break;
                        case 7:
                            f1.C0114a c0114a9 = this.f2833b;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            try {
                                arrayList14.add(0, c0114a9.a((java.lang.String) arrayList15.get(0), (java.util.List) arrayList15.get(1)));
                            } catch (java.lang.Throwable th8) {
                                arrayList14 = Q1.d.C(th8);
                            }
                            eVar.f(arrayList14);
                            break;
                        default:
                            f1.C0114a c0114a10 = this.f2833b;
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            java.util.ArrayList arrayList17 = (java.util.ArrayList) obj;
                            try {
                                arrayList16.add(0, c0114a10.b((java.lang.String) arrayList17.get(0), (java.util.List) arrayList17.get(1)));
                            } catch (java.lang.Throwable th9) {
                                arrayList16 = Q1.d.C(th9);
                            }
                            eVar.f(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0014n4.h(null);
        }
        F.C0014n c0014n5 = new F.C0014n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", c0115b, f2);
        if (c0114a != null) {
            final int i6 = 4;
            c0014n5.h(new a1.InterfaceC0062b(c0114a) { // from class: f1.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f1.C0114a f2833b;

                {
                    this.f2833b = c0114a;
                }

                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    switch (i6) {
                        case 0:
                            f1.C0114a c0114a2 = this.f2833b;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, java.lang.Boolean.valueOf(c0114a2.f2828a.edit().remove((java.lang.String) ((java.util.ArrayList) obj).get(0)).commit()));
                            } catch (java.lang.Throwable th) {
                                arrayList = Q1.d.C(th);
                            }
                            eVar.f(arrayList);
                            break;
                        case 1:
                            f1.C0114a c0114a3 = this.f2833b;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            try {
                                arrayList2.add(0, java.lang.Boolean.valueOf(c0114a3.f2828a.edit().putBoolean((java.lang.String) arrayList3.get(0), ((java.lang.Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = Q1.d.C(th2);
                            }
                            eVar.f(arrayList2);
                            break;
                        case 2:
                            f1.C0114a c0114a4 = this.f2833b;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c0114a4.c((java.lang.String) arrayList5.get(0), (java.lang.String) arrayList5.get(1)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = Q1.d.C(th3);
                            }
                            eVar.f(arrayList4);
                            break;
                        case 3:
                            f1.C0114a c0114a5 = this.f2833b;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            try {
                                arrayList6.add(0, java.lang.Boolean.valueOf(c0114a5.f2828a.edit().putLong((java.lang.String) arrayList7.get(0), ((java.lang.Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = Q1.d.C(th4);
                            }
                            eVar.f(arrayList6);
                            break;
                        case 4:
                            f1.C0114a c0114a6 = this.f2833b;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList9.get(0);
                            java.lang.Double d2 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0114a6.getClass();
                                java.lang.String d3 = java.lang.Double.toString(d2.doubleValue());
                                arrayList8.add(0, java.lang.Boolean.valueOf(c0114a6.f2828a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (java.lang.Throwable th5) {
                                arrayList8 = Q1.d.C(th5);
                            }
                            eVar.f(arrayList8);
                            break;
                        case 5:
                            f1.C0114a c0114a7 = this.f2833b;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            try {
                                arrayList10.add(0, java.lang.Boolean.valueOf(c0114a7.f2828a.edit().putString((java.lang.String) arrayList11.get(0), (java.lang.String) arrayList11.get(1)).commit()));
                            } catch (java.lang.Throwable th6) {
                                arrayList10 = Q1.d.C(th6);
                            }
                            eVar.f(arrayList10);
                            break;
                        case 6:
                            f1.C0114a c0114a8 = this.f2833b;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.util.ArrayList arrayList13 = (java.util.ArrayList) obj;
                            java.lang.String str2 = (java.lang.String) arrayList13.get(0);
                            java.util.List list = (java.util.List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, java.lang.Boolean.valueOf(c0114a8.f2828a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0114a8.f2829b.h(list)).commit()));
                            } catch (java.lang.Throwable th7) {
                                arrayList12 = Q1.d.C(th7);
                            }
                            eVar.f(arrayList12);
                            break;
                        case 7:
                            f1.C0114a c0114a9 = this.f2833b;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            try {
                                arrayList14.add(0, c0114a9.a((java.lang.String) arrayList15.get(0), (java.util.List) arrayList15.get(1)));
                            } catch (java.lang.Throwable th8) {
                                arrayList14 = Q1.d.C(th8);
                            }
                            eVar.f(arrayList14);
                            break;
                        default:
                            f1.C0114a c0114a10 = this.f2833b;
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            java.util.ArrayList arrayList17 = (java.util.ArrayList) obj;
                            try {
                                arrayList16.add(0, c0114a10.b((java.lang.String) arrayList17.get(0), (java.util.List) arrayList17.get(1)));
                            } catch (java.lang.Throwable th9) {
                                arrayList16 = Q1.d.C(th9);
                            }
                            eVar.f(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0014n5.h(null);
        }
        F.C0014n c0014n6 = new F.C0014n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList", c0115b, f2);
        if (c0114a != null) {
            final int i7 = 5;
            c0014n6.h(new a1.InterfaceC0062b(c0114a) { // from class: f1.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f1.C0114a f2833b;

                {
                    this.f2833b = c0114a;
                }

                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    switch (i7) {
                        case 0:
                            f1.C0114a c0114a2 = this.f2833b;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, java.lang.Boolean.valueOf(c0114a2.f2828a.edit().remove((java.lang.String) ((java.util.ArrayList) obj).get(0)).commit()));
                            } catch (java.lang.Throwable th) {
                                arrayList = Q1.d.C(th);
                            }
                            eVar.f(arrayList);
                            break;
                        case 1:
                            f1.C0114a c0114a3 = this.f2833b;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            try {
                                arrayList2.add(0, java.lang.Boolean.valueOf(c0114a3.f2828a.edit().putBoolean((java.lang.String) arrayList3.get(0), ((java.lang.Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = Q1.d.C(th2);
                            }
                            eVar.f(arrayList2);
                            break;
                        case 2:
                            f1.C0114a c0114a4 = this.f2833b;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c0114a4.c((java.lang.String) arrayList5.get(0), (java.lang.String) arrayList5.get(1)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = Q1.d.C(th3);
                            }
                            eVar.f(arrayList4);
                            break;
                        case 3:
                            f1.C0114a c0114a5 = this.f2833b;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            try {
                                arrayList6.add(0, java.lang.Boolean.valueOf(c0114a5.f2828a.edit().putLong((java.lang.String) arrayList7.get(0), ((java.lang.Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = Q1.d.C(th4);
                            }
                            eVar.f(arrayList6);
                            break;
                        case 4:
                            f1.C0114a c0114a6 = this.f2833b;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList9.get(0);
                            java.lang.Double d2 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0114a6.getClass();
                                java.lang.String d3 = java.lang.Double.toString(d2.doubleValue());
                                arrayList8.add(0, java.lang.Boolean.valueOf(c0114a6.f2828a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (java.lang.Throwable th5) {
                                arrayList8 = Q1.d.C(th5);
                            }
                            eVar.f(arrayList8);
                            break;
                        case 5:
                            f1.C0114a c0114a7 = this.f2833b;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            try {
                                arrayList10.add(0, java.lang.Boolean.valueOf(c0114a7.f2828a.edit().putString((java.lang.String) arrayList11.get(0), (java.lang.String) arrayList11.get(1)).commit()));
                            } catch (java.lang.Throwable th6) {
                                arrayList10 = Q1.d.C(th6);
                            }
                            eVar.f(arrayList10);
                            break;
                        case 6:
                            f1.C0114a c0114a8 = this.f2833b;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.util.ArrayList arrayList13 = (java.util.ArrayList) obj;
                            java.lang.String str2 = (java.lang.String) arrayList13.get(0);
                            java.util.List list = (java.util.List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, java.lang.Boolean.valueOf(c0114a8.f2828a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0114a8.f2829b.h(list)).commit()));
                            } catch (java.lang.Throwable th7) {
                                arrayList12 = Q1.d.C(th7);
                            }
                            eVar.f(arrayList12);
                            break;
                        case 7:
                            f1.C0114a c0114a9 = this.f2833b;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            try {
                                arrayList14.add(0, c0114a9.a((java.lang.String) arrayList15.get(0), (java.util.List) arrayList15.get(1)));
                            } catch (java.lang.Throwable th8) {
                                arrayList14 = Q1.d.C(th8);
                            }
                            eVar.f(arrayList14);
                            break;
                        default:
                            f1.C0114a c0114a10 = this.f2833b;
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            java.util.ArrayList arrayList17 = (java.util.ArrayList) obj;
                            try {
                                arrayList16.add(0, c0114a10.b((java.lang.String) arrayList17.get(0), (java.util.List) arrayList17.get(1)));
                            } catch (java.lang.Throwable th9) {
                                arrayList16 = Q1.d.C(th9);
                            }
                            eVar.f(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0014n6.h(null);
        }
        F.C0014n c0014n7 = new F.C0014n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList", c0115b, f2);
        if (c0114a != null) {
            final int i8 = 6;
            c0014n7.h(new a1.InterfaceC0062b(c0114a) { // from class: f1.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f1.C0114a f2833b;

                {
                    this.f2833b = c0114a;
                }

                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    switch (i8) {
                        case 0:
                            f1.C0114a c0114a2 = this.f2833b;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, java.lang.Boolean.valueOf(c0114a2.f2828a.edit().remove((java.lang.String) ((java.util.ArrayList) obj).get(0)).commit()));
                            } catch (java.lang.Throwable th) {
                                arrayList = Q1.d.C(th);
                            }
                            eVar.f(arrayList);
                            break;
                        case 1:
                            f1.C0114a c0114a3 = this.f2833b;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            try {
                                arrayList2.add(0, java.lang.Boolean.valueOf(c0114a3.f2828a.edit().putBoolean((java.lang.String) arrayList3.get(0), ((java.lang.Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = Q1.d.C(th2);
                            }
                            eVar.f(arrayList2);
                            break;
                        case 2:
                            f1.C0114a c0114a4 = this.f2833b;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c0114a4.c((java.lang.String) arrayList5.get(0), (java.lang.String) arrayList5.get(1)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = Q1.d.C(th3);
                            }
                            eVar.f(arrayList4);
                            break;
                        case 3:
                            f1.C0114a c0114a5 = this.f2833b;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            try {
                                arrayList6.add(0, java.lang.Boolean.valueOf(c0114a5.f2828a.edit().putLong((java.lang.String) arrayList7.get(0), ((java.lang.Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = Q1.d.C(th4);
                            }
                            eVar.f(arrayList6);
                            break;
                        case 4:
                            f1.C0114a c0114a6 = this.f2833b;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList9.get(0);
                            java.lang.Double d2 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0114a6.getClass();
                                java.lang.String d3 = java.lang.Double.toString(d2.doubleValue());
                                arrayList8.add(0, java.lang.Boolean.valueOf(c0114a6.f2828a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (java.lang.Throwable th5) {
                                arrayList8 = Q1.d.C(th5);
                            }
                            eVar.f(arrayList8);
                            break;
                        case 5:
                            f1.C0114a c0114a7 = this.f2833b;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            try {
                                arrayList10.add(0, java.lang.Boolean.valueOf(c0114a7.f2828a.edit().putString((java.lang.String) arrayList11.get(0), (java.lang.String) arrayList11.get(1)).commit()));
                            } catch (java.lang.Throwable th6) {
                                arrayList10 = Q1.d.C(th6);
                            }
                            eVar.f(arrayList10);
                            break;
                        case 6:
                            f1.C0114a c0114a8 = this.f2833b;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.util.ArrayList arrayList13 = (java.util.ArrayList) obj;
                            java.lang.String str2 = (java.lang.String) arrayList13.get(0);
                            java.util.List list = (java.util.List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, java.lang.Boolean.valueOf(c0114a8.f2828a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0114a8.f2829b.h(list)).commit()));
                            } catch (java.lang.Throwable th7) {
                                arrayList12 = Q1.d.C(th7);
                            }
                            eVar.f(arrayList12);
                            break;
                        case 7:
                            f1.C0114a c0114a9 = this.f2833b;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            try {
                                arrayList14.add(0, c0114a9.a((java.lang.String) arrayList15.get(0), (java.util.List) arrayList15.get(1)));
                            } catch (java.lang.Throwable th8) {
                                arrayList14 = Q1.d.C(th8);
                            }
                            eVar.f(arrayList14);
                            break;
                        default:
                            f1.C0114a c0114a10 = this.f2833b;
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            java.util.ArrayList arrayList17 = (java.util.ArrayList) obj;
                            try {
                                arrayList16.add(0, c0114a10.b((java.lang.String) arrayList17.get(0), (java.util.List) arrayList17.get(1)));
                            } catch (java.lang.Throwable th9) {
                                arrayList16 = Q1.d.C(th9);
                            }
                            eVar.f(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0014n7.h(null);
        }
        F.C0014n c0014n8 = new F.C0014n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", c0115b, f2);
        if (c0114a != null) {
            final int i9 = 7;
            c0014n8.h(new a1.InterfaceC0062b(c0114a) { // from class: f1.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f1.C0114a f2833b;

                {
                    this.f2833b = c0114a;
                }

                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    switch (i9) {
                        case 0:
                            f1.C0114a c0114a2 = this.f2833b;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, java.lang.Boolean.valueOf(c0114a2.f2828a.edit().remove((java.lang.String) ((java.util.ArrayList) obj).get(0)).commit()));
                            } catch (java.lang.Throwable th) {
                                arrayList = Q1.d.C(th);
                            }
                            eVar.f(arrayList);
                            break;
                        case 1:
                            f1.C0114a c0114a3 = this.f2833b;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            try {
                                arrayList2.add(0, java.lang.Boolean.valueOf(c0114a3.f2828a.edit().putBoolean((java.lang.String) arrayList3.get(0), ((java.lang.Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = Q1.d.C(th2);
                            }
                            eVar.f(arrayList2);
                            break;
                        case 2:
                            f1.C0114a c0114a4 = this.f2833b;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c0114a4.c((java.lang.String) arrayList5.get(0), (java.lang.String) arrayList5.get(1)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = Q1.d.C(th3);
                            }
                            eVar.f(arrayList4);
                            break;
                        case 3:
                            f1.C0114a c0114a5 = this.f2833b;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            try {
                                arrayList6.add(0, java.lang.Boolean.valueOf(c0114a5.f2828a.edit().putLong((java.lang.String) arrayList7.get(0), ((java.lang.Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = Q1.d.C(th4);
                            }
                            eVar.f(arrayList6);
                            break;
                        case 4:
                            f1.C0114a c0114a6 = this.f2833b;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList9.get(0);
                            java.lang.Double d2 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0114a6.getClass();
                                java.lang.String d3 = java.lang.Double.toString(d2.doubleValue());
                                arrayList8.add(0, java.lang.Boolean.valueOf(c0114a6.f2828a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (java.lang.Throwable th5) {
                                arrayList8 = Q1.d.C(th5);
                            }
                            eVar.f(arrayList8);
                            break;
                        case 5:
                            f1.C0114a c0114a7 = this.f2833b;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            try {
                                arrayList10.add(0, java.lang.Boolean.valueOf(c0114a7.f2828a.edit().putString((java.lang.String) arrayList11.get(0), (java.lang.String) arrayList11.get(1)).commit()));
                            } catch (java.lang.Throwable th6) {
                                arrayList10 = Q1.d.C(th6);
                            }
                            eVar.f(arrayList10);
                            break;
                        case 6:
                            f1.C0114a c0114a8 = this.f2833b;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.util.ArrayList arrayList13 = (java.util.ArrayList) obj;
                            java.lang.String str2 = (java.lang.String) arrayList13.get(0);
                            java.util.List list = (java.util.List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, java.lang.Boolean.valueOf(c0114a8.f2828a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0114a8.f2829b.h(list)).commit()));
                            } catch (java.lang.Throwable th7) {
                                arrayList12 = Q1.d.C(th7);
                            }
                            eVar.f(arrayList12);
                            break;
                        case 7:
                            f1.C0114a c0114a9 = this.f2833b;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            try {
                                arrayList14.add(0, c0114a9.a((java.lang.String) arrayList15.get(0), (java.util.List) arrayList15.get(1)));
                            } catch (java.lang.Throwable th8) {
                                arrayList14 = Q1.d.C(th8);
                            }
                            eVar.f(arrayList14);
                            break;
                        default:
                            f1.C0114a c0114a10 = this.f2833b;
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            java.util.ArrayList arrayList17 = (java.util.ArrayList) obj;
                            try {
                                arrayList16.add(0, c0114a10.b((java.lang.String) arrayList17.get(0), (java.util.List) arrayList17.get(1)));
                            } catch (java.lang.Throwable th9) {
                                arrayList16 = Q1.d.C(th9);
                            }
                            eVar.f(arrayList16);
                            break;
                    }
                }
            });
        } else {
            c0014n8.h(null);
        }
        F.C0014n c0014n9 = new F.C0014n(fVar, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", c0115b, f2);
        if (c0114a == null) {
            c0014n9.h(null);
        } else {
            final int i10 = 8;
            c0014n9.h(new a1.InterfaceC0062b(c0114a) { // from class: f1.c

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f1.C0114a f2833b;

                {
                    this.f2833b = c0114a;
                }

                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    switch (i10) {
                        case 0:
                            f1.C0114a c0114a2 = this.f2833b;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            try {
                                arrayList.add(0, java.lang.Boolean.valueOf(c0114a2.f2828a.edit().remove((java.lang.String) ((java.util.ArrayList) obj).get(0)).commit()));
                            } catch (java.lang.Throwable th) {
                                arrayList = Q1.d.C(th);
                            }
                            eVar.f(arrayList);
                            break;
                        case 1:
                            f1.C0114a c0114a3 = this.f2833b;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.ArrayList arrayList3 = (java.util.ArrayList) obj;
                            try {
                                arrayList2.add(0, java.lang.Boolean.valueOf(c0114a3.f2828a.edit().putBoolean((java.lang.String) arrayList3.get(0), ((java.lang.Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (java.lang.Throwable th2) {
                                arrayList2 = Q1.d.C(th2);
                            }
                            eVar.f(arrayList2);
                            break;
                        case 2:
                            f1.C0114a c0114a4 = this.f2833b;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.util.ArrayList arrayList5 = (java.util.ArrayList) obj;
                            try {
                                arrayList4.add(0, c0114a4.c((java.lang.String) arrayList5.get(0), (java.lang.String) arrayList5.get(1)));
                            } catch (java.lang.Throwable th3) {
                                arrayList4 = Q1.d.C(th3);
                            }
                            eVar.f(arrayList4);
                            break;
                        case 3:
                            f1.C0114a c0114a5 = this.f2833b;
                            java.util.ArrayList arrayList6 = new java.util.ArrayList();
                            java.util.ArrayList arrayList7 = (java.util.ArrayList) obj;
                            try {
                                arrayList6.add(0, java.lang.Boolean.valueOf(c0114a5.f2828a.edit().putLong((java.lang.String) arrayList7.get(0), ((java.lang.Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (java.lang.Throwable th4) {
                                arrayList6 = Q1.d.C(th4);
                            }
                            eVar.f(arrayList6);
                            break;
                        case 4:
                            f1.C0114a c0114a6 = this.f2833b;
                            java.util.ArrayList arrayList8 = new java.util.ArrayList();
                            java.util.ArrayList arrayList9 = (java.util.ArrayList) obj;
                            java.lang.String str = (java.lang.String) arrayList9.get(0);
                            java.lang.Double d2 = (java.lang.Double) arrayList9.get(1);
                            try {
                                c0114a6.getClass();
                                java.lang.String d3 = java.lang.Double.toString(d2.doubleValue());
                                arrayList8.add(0, java.lang.Boolean.valueOf(c0114a6.f2828a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (java.lang.Throwable th5) {
                                arrayList8 = Q1.d.C(th5);
                            }
                            eVar.f(arrayList8);
                            break;
                        case 5:
                            f1.C0114a c0114a7 = this.f2833b;
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            java.util.ArrayList arrayList11 = (java.util.ArrayList) obj;
                            try {
                                arrayList10.add(0, java.lang.Boolean.valueOf(c0114a7.f2828a.edit().putString((java.lang.String) arrayList11.get(0), (java.lang.String) arrayList11.get(1)).commit()));
                            } catch (java.lang.Throwable th6) {
                                arrayList10 = Q1.d.C(th6);
                            }
                            eVar.f(arrayList10);
                            break;
                        case 6:
                            f1.C0114a c0114a8 = this.f2833b;
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            java.util.ArrayList arrayList13 = (java.util.ArrayList) obj;
                            java.lang.String str2 = (java.lang.String) arrayList13.get(0);
                            java.util.List list = (java.util.List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, java.lang.Boolean.valueOf(c0114a8.f2828a.edit().putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c0114a8.f2829b.h(list)).commit()));
                            } catch (java.lang.Throwable th7) {
                                arrayList12 = Q1.d.C(th7);
                            }
                            eVar.f(arrayList12);
                            break;
                        case 7:
                            f1.C0114a c0114a9 = this.f2833b;
                            java.util.ArrayList arrayList14 = new java.util.ArrayList();
                            java.util.ArrayList arrayList15 = (java.util.ArrayList) obj;
                            try {
                                arrayList14.add(0, c0114a9.a((java.lang.String) arrayList15.get(0), (java.util.List) arrayList15.get(1)));
                            } catch (java.lang.Throwable th8) {
                                arrayList14 = Q1.d.C(th8);
                            }
                            eVar.f(arrayList14);
                            break;
                        default:
                            f1.C0114a c0114a10 = this.f2833b;
                            java.util.ArrayList arrayList16 = new java.util.ArrayList();
                            java.util.ArrayList arrayList17 = (java.util.ArrayList) obj;
                            try {
                                arrayList16.add(0, c0114a10.b((java.lang.String) arrayList17.get(0), (java.util.List) arrayList17.get(1)));
                            } catch (java.lang.Throwable th9) {
                                arrayList16 = Q1.d.C(th9);
                            }
                            eVar.f(arrayList16);
                            break;
                    }
                }
            });
        }
    }

    public final java.lang.Boolean a(java.lang.String str, java.util.List list) {
        android.content.SharedPreferences.Editor edit = this.f2828a.edit();
        java.util.Map<java.lang.String, ?> all = this.f2828a.getAll();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((java.lang.String) it.next());
        }
        return java.lang.Boolean.valueOf(edit.commit());
    }

    public final java.util.HashMap b(java.lang.String str, java.util.List list) {
        java.lang.Object obj;
        java.util.Set hashSet = list == null ? null : new java.util.HashSet(list);
        java.util.Map<java.lang.String, ?> all = this.f2828a.getAll();
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str2 : all.keySet()) {
            if (str2.startsWith(str) && (hashSet == null || hashSet.contains(str2))) {
                java.lang.Object obj2 = all.get(str2);
                java.util.Objects.requireNonNull(obj2);
                boolean z2 = obj2 instanceof java.lang.String;
                m0.j jVar = this.f2829b;
                if (z2) {
                    java.lang.String str3 = (java.lang.String) obj2;
                    if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                            obj2 = jVar.f(str3.substring(40));
                        }
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        obj = new java.math.BigInteger(str3.substring(44), 36);
                        obj2 = obj;
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        obj2 = java.lang.Double.valueOf(str3.substring(40));
                    }
                    hashMap.put(str2, obj2);
                } else {
                    if (obj2 instanceof java.util.Set) {
                        java.util.ArrayList arrayList = new java.util.ArrayList((java.util.Set) obj2);
                        this.f2828a.edit().remove(str2).putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + jVar.h(arrayList)).apply();
                        obj = arrayList;
                        obj2 = obj;
                    }
                    hashMap.put(str2, obj2);
                }
            }
        }
        return hashMap;
    }

    public final java.lang.Boolean c(java.lang.String str, java.lang.String str2) {
        if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            throw new java.lang.RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return java.lang.Boolean.valueOf(this.f2828a.edit().putString(str, str2).commit());
    }

    @Override // W0.b
    public final void onAttachedToEngine(W0.a aVar) {
        a1.f fVar = aVar.f1828b;
        this.f2828a = aVar.f1827a.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            d(fVar, this);
        } catch (java.lang.Exception e2) {
            android.util.Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e2);
        }
    }

    @Override // W0.b
    public final void onDetachedFromEngine(W0.a aVar) {
        d(aVar.f1828b, null);
    }
}
