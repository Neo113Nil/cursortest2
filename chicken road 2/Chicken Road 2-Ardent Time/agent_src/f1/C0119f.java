package f1;

/* renamed from: f1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f1.C0119f f2836a = new f1.C0119f();

    /* renamed from: b, reason: collision with root package name */
    public static final h1.C0175g f2837b = Q1.l.q(new f1.C0117d());

    public static a1.j a() {
        return (a1.j) f2837b.a();
    }

    public static void b(a1.f binaryMessenger, final f1.InterfaceC0120g interfaceC0120g, java.lang.String str) {
        kotlin.jvm.internal.i.e(binaryMessenger, "binaryMessenger");
        java.lang.String concat = str.length() > 0 ? ".".concat(str) : "";
        m0.j f2 = binaryMessenger.f(new a1.i());
        F.C0014n c0014n = new F.C0014n(binaryMessenger, B1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", concat), a(), f2);
        if (interfaceC0120g != null) {
            final int i2 = 6;
            c0014n.h(new a1.InterfaceC0062b() { // from class: f1.e
                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    java.util.List H2;
                    java.util.List H3;
                    java.util.List H4;
                    java.util.List H5;
                    java.util.List H6;
                    java.util.List H7;
                    java.util.List H8;
                    java.util.List H9;
                    java.util.List H10;
                    java.util.List H11;
                    java.util.List H12;
                    java.util.List H13;
                    java.util.List H14;
                    java.util.List H15;
                    java.util.List H16;
                    switch (i2) {
                        case 0:
                            f1.InterfaceC0120g interfaceC0120g2 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g2.e(str2, str3, (f1.C0121h) obj4);
                                H2 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th) {
                                H2 = i1.AbstractC0191j.H(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th));
                            }
                            eVar.f(H2);
                            break;
                        case 1:
                            f1.InterfaceC0120g interfaceC0120g3 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g3.f(str4, list3, (f1.C0121h) obj7);
                                H3 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th2) {
                                H3 = i1.AbstractC0191j.H(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th2));
                            }
                            eVar.f(H3);
                            break;
                        case 2:
                            f1.InterfaceC0120g interfaceC0120g4 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H4 = u0.AbstractC0995a.q(interfaceC0120g4.p(str5, (f1.C0121h) obj9));
                            } catch (java.lang.Throwable th3) {
                                H4 = i1.AbstractC0191j.H(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th3));
                            }
                            eVar.f(H4);
                            break;
                        case 3:
                            f1.InterfaceC0120g interfaceC0120g5 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H5 = u0.AbstractC0995a.q(interfaceC0120g5.q(str6, (f1.C0121h) obj11));
                            } catch (java.lang.Throwable th4) {
                                H5 = i1.AbstractC0191j.H(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th4));
                            }
                            eVar.f(H5);
                            break;
                        case 4:
                            f1.InterfaceC0120g interfaceC0120g6 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H6 = u0.AbstractC0995a.q(interfaceC0120g6.b(str7, (f1.C0121h) obj13));
                            } catch (java.lang.Throwable th5) {
                                H6 = i1.AbstractC0191j.H(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th5));
                            }
                            eVar.f(H6);
                            break;
                        case 5:
                            f1.InterfaceC0120g interfaceC0120g7 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H7 = u0.AbstractC0995a.q(interfaceC0120g7.c(str8, (f1.C0121h) obj15));
                            } catch (java.lang.Throwable th6) {
                                H7 = i1.AbstractC0191j.H(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th6));
                            }
                            eVar.f(H7);
                            break;
                        case 6:
                            f1.InterfaceC0120g interfaceC0120g8 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g8.a(str9, booleanValue, (f1.C0121h) obj18);
                                H8 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th7) {
                                H8 = i1.AbstractC0191j.H(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th7));
                            }
                            eVar.f(H8);
                            break;
                        case 7:
                            f1.InterfaceC0120g interfaceC0120g9 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H9 = u0.AbstractC0995a.q(interfaceC0120g9.d(str10, (f1.C0121h) obj20));
                            } catch (java.lang.Throwable th8) {
                                H9 = i1.AbstractC0191j.H(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th8));
                            }
                            eVar.f(H9);
                            break;
                        case 8:
                            f1.InterfaceC0120g interfaceC0120g10 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H10 = u0.AbstractC0995a.q(interfaceC0120g10.h(str11, (f1.C0121h) obj22));
                            } catch (java.lang.Throwable th9) {
                                H10 = i1.AbstractC0191j.H(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th9));
                            }
                            eVar.f(H10);
                            break;
                        case 9:
                            f1.InterfaceC0120g interfaceC0120g11 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g11.k(list12, (f1.C0121h) obj23);
                                H11 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th10) {
                                H11 = i1.AbstractC0191j.H(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th10));
                            }
                            eVar.f(H11);
                            break;
                        case 10:
                            f1.InterfaceC0120g interfaceC0120g12 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H12 = u0.AbstractC0995a.q(interfaceC0120g12.m(list14, (f1.C0121h) obj24));
                            } catch (java.lang.Throwable th11) {
                                H12 = i1.AbstractC0191j.H(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th11));
                            }
                            eVar.f(H12);
                            break;
                        case 11:
                            f1.InterfaceC0120g interfaceC0120g13 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H13 = u0.AbstractC0995a.q(interfaceC0120g13.l(list16, (f1.C0121h) obj25));
                            } catch (java.lang.Throwable th12) {
                                H13 = i1.AbstractC0191j.H(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th12));
                            }
                            eVar.f(H13);
                            break;
                        case 12:
                            f1.InterfaceC0120g interfaceC0120g14 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g14.j(str12, str13, (f1.C0121h) obj28);
                                H14 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th13) {
                                H14 = i1.AbstractC0191j.H(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th13));
                            }
                            eVar.f(H14);
                            break;
                        case 13:
                            f1.InterfaceC0120g interfaceC0120g15 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g15.r(str14, longValue, (f1.C0121h) obj31);
                                H15 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th14) {
                                H15 = i1.AbstractC0191j.H(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th14));
                            }
                            eVar.f(H15);
                            break;
                        default:
                            f1.InterfaceC0120g interfaceC0120g16 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g16.g(str15, doubleValue, (f1.C0121h) obj34);
                                H16 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th15) {
                                H16 = i1.AbstractC0191j.H(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th15));
                            }
                            eVar.f(H16);
                            break;
                    }
                }
            });
        } else {
            c0014n.h(null);
        }
        F.C0014n c0014n2 = new F.C0014n(binaryMessenger, B1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", concat), a(), f2);
        if (interfaceC0120g != null) {
            final int i3 = 12;
            c0014n2.h(new a1.InterfaceC0062b() { // from class: f1.e
                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    java.util.List H2;
                    java.util.List H3;
                    java.util.List H4;
                    java.util.List H5;
                    java.util.List H6;
                    java.util.List H7;
                    java.util.List H8;
                    java.util.List H9;
                    java.util.List H10;
                    java.util.List H11;
                    java.util.List H12;
                    java.util.List H13;
                    java.util.List H14;
                    java.util.List H15;
                    java.util.List H16;
                    switch (i3) {
                        case 0:
                            f1.InterfaceC0120g interfaceC0120g2 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g2.e(str2, str3, (f1.C0121h) obj4);
                                H2 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th) {
                                H2 = i1.AbstractC0191j.H(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th));
                            }
                            eVar.f(H2);
                            break;
                        case 1:
                            f1.InterfaceC0120g interfaceC0120g3 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g3.f(str4, list3, (f1.C0121h) obj7);
                                H3 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th2) {
                                H3 = i1.AbstractC0191j.H(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th2));
                            }
                            eVar.f(H3);
                            break;
                        case 2:
                            f1.InterfaceC0120g interfaceC0120g4 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H4 = u0.AbstractC0995a.q(interfaceC0120g4.p(str5, (f1.C0121h) obj9));
                            } catch (java.lang.Throwable th3) {
                                H4 = i1.AbstractC0191j.H(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th3));
                            }
                            eVar.f(H4);
                            break;
                        case 3:
                            f1.InterfaceC0120g interfaceC0120g5 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H5 = u0.AbstractC0995a.q(interfaceC0120g5.q(str6, (f1.C0121h) obj11));
                            } catch (java.lang.Throwable th4) {
                                H5 = i1.AbstractC0191j.H(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th4));
                            }
                            eVar.f(H5);
                            break;
                        case 4:
                            f1.InterfaceC0120g interfaceC0120g6 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H6 = u0.AbstractC0995a.q(interfaceC0120g6.b(str7, (f1.C0121h) obj13));
                            } catch (java.lang.Throwable th5) {
                                H6 = i1.AbstractC0191j.H(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th5));
                            }
                            eVar.f(H6);
                            break;
                        case 5:
                            f1.InterfaceC0120g interfaceC0120g7 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H7 = u0.AbstractC0995a.q(interfaceC0120g7.c(str8, (f1.C0121h) obj15));
                            } catch (java.lang.Throwable th6) {
                                H7 = i1.AbstractC0191j.H(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th6));
                            }
                            eVar.f(H7);
                            break;
                        case 6:
                            f1.InterfaceC0120g interfaceC0120g8 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g8.a(str9, booleanValue, (f1.C0121h) obj18);
                                H8 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th7) {
                                H8 = i1.AbstractC0191j.H(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th7));
                            }
                            eVar.f(H8);
                            break;
                        case 7:
                            f1.InterfaceC0120g interfaceC0120g9 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H9 = u0.AbstractC0995a.q(interfaceC0120g9.d(str10, (f1.C0121h) obj20));
                            } catch (java.lang.Throwable th8) {
                                H9 = i1.AbstractC0191j.H(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th8));
                            }
                            eVar.f(H9);
                            break;
                        case 8:
                            f1.InterfaceC0120g interfaceC0120g10 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H10 = u0.AbstractC0995a.q(interfaceC0120g10.h(str11, (f1.C0121h) obj22));
                            } catch (java.lang.Throwable th9) {
                                H10 = i1.AbstractC0191j.H(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th9));
                            }
                            eVar.f(H10);
                            break;
                        case 9:
                            f1.InterfaceC0120g interfaceC0120g11 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g11.k(list12, (f1.C0121h) obj23);
                                H11 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th10) {
                                H11 = i1.AbstractC0191j.H(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th10));
                            }
                            eVar.f(H11);
                            break;
                        case 10:
                            f1.InterfaceC0120g interfaceC0120g12 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H12 = u0.AbstractC0995a.q(interfaceC0120g12.m(list14, (f1.C0121h) obj24));
                            } catch (java.lang.Throwable th11) {
                                H12 = i1.AbstractC0191j.H(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th11));
                            }
                            eVar.f(H12);
                            break;
                        case 11:
                            f1.InterfaceC0120g interfaceC0120g13 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H13 = u0.AbstractC0995a.q(interfaceC0120g13.l(list16, (f1.C0121h) obj25));
                            } catch (java.lang.Throwable th12) {
                                H13 = i1.AbstractC0191j.H(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th12));
                            }
                            eVar.f(H13);
                            break;
                        case 12:
                            f1.InterfaceC0120g interfaceC0120g14 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g14.j(str12, str13, (f1.C0121h) obj28);
                                H14 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th13) {
                                H14 = i1.AbstractC0191j.H(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th13));
                            }
                            eVar.f(H14);
                            break;
                        case 13:
                            f1.InterfaceC0120g interfaceC0120g15 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g15.r(str14, longValue, (f1.C0121h) obj31);
                                H15 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th14) {
                                H15 = i1.AbstractC0191j.H(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th14));
                            }
                            eVar.f(H15);
                            break;
                        default:
                            f1.InterfaceC0120g interfaceC0120g16 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g16.g(str15, doubleValue, (f1.C0121h) obj34);
                                H16 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th15) {
                                H16 = i1.AbstractC0191j.H(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th15));
                            }
                            eVar.f(H16);
                            break;
                    }
                }
            });
        } else {
            c0014n2.h(null);
        }
        F.C0014n c0014n3 = new F.C0014n(binaryMessenger, B1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", concat), a(), f2);
        if (interfaceC0120g != null) {
            final int i4 = 13;
            c0014n3.h(new a1.InterfaceC0062b() { // from class: f1.e
                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    java.util.List H2;
                    java.util.List H3;
                    java.util.List H4;
                    java.util.List H5;
                    java.util.List H6;
                    java.util.List H7;
                    java.util.List H8;
                    java.util.List H9;
                    java.util.List H10;
                    java.util.List H11;
                    java.util.List H12;
                    java.util.List H13;
                    java.util.List H14;
                    java.util.List H15;
                    java.util.List H16;
                    switch (i4) {
                        case 0:
                            f1.InterfaceC0120g interfaceC0120g2 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g2.e(str2, str3, (f1.C0121h) obj4);
                                H2 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th) {
                                H2 = i1.AbstractC0191j.H(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th));
                            }
                            eVar.f(H2);
                            break;
                        case 1:
                            f1.InterfaceC0120g interfaceC0120g3 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g3.f(str4, list3, (f1.C0121h) obj7);
                                H3 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th2) {
                                H3 = i1.AbstractC0191j.H(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th2));
                            }
                            eVar.f(H3);
                            break;
                        case 2:
                            f1.InterfaceC0120g interfaceC0120g4 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H4 = u0.AbstractC0995a.q(interfaceC0120g4.p(str5, (f1.C0121h) obj9));
                            } catch (java.lang.Throwable th3) {
                                H4 = i1.AbstractC0191j.H(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th3));
                            }
                            eVar.f(H4);
                            break;
                        case 3:
                            f1.InterfaceC0120g interfaceC0120g5 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H5 = u0.AbstractC0995a.q(interfaceC0120g5.q(str6, (f1.C0121h) obj11));
                            } catch (java.lang.Throwable th4) {
                                H5 = i1.AbstractC0191j.H(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th4));
                            }
                            eVar.f(H5);
                            break;
                        case 4:
                            f1.InterfaceC0120g interfaceC0120g6 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H6 = u0.AbstractC0995a.q(interfaceC0120g6.b(str7, (f1.C0121h) obj13));
                            } catch (java.lang.Throwable th5) {
                                H6 = i1.AbstractC0191j.H(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th5));
                            }
                            eVar.f(H6);
                            break;
                        case 5:
                            f1.InterfaceC0120g interfaceC0120g7 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H7 = u0.AbstractC0995a.q(interfaceC0120g7.c(str8, (f1.C0121h) obj15));
                            } catch (java.lang.Throwable th6) {
                                H7 = i1.AbstractC0191j.H(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th6));
                            }
                            eVar.f(H7);
                            break;
                        case 6:
                            f1.InterfaceC0120g interfaceC0120g8 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g8.a(str9, booleanValue, (f1.C0121h) obj18);
                                H8 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th7) {
                                H8 = i1.AbstractC0191j.H(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th7));
                            }
                            eVar.f(H8);
                            break;
                        case 7:
                            f1.InterfaceC0120g interfaceC0120g9 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H9 = u0.AbstractC0995a.q(interfaceC0120g9.d(str10, (f1.C0121h) obj20));
                            } catch (java.lang.Throwable th8) {
                                H9 = i1.AbstractC0191j.H(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th8));
                            }
                            eVar.f(H9);
                            break;
                        case 8:
                            f1.InterfaceC0120g interfaceC0120g10 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H10 = u0.AbstractC0995a.q(interfaceC0120g10.h(str11, (f1.C0121h) obj22));
                            } catch (java.lang.Throwable th9) {
                                H10 = i1.AbstractC0191j.H(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th9));
                            }
                            eVar.f(H10);
                            break;
                        case 9:
                            f1.InterfaceC0120g interfaceC0120g11 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g11.k(list12, (f1.C0121h) obj23);
                                H11 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th10) {
                                H11 = i1.AbstractC0191j.H(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th10));
                            }
                            eVar.f(H11);
                            break;
                        case 10:
                            f1.InterfaceC0120g interfaceC0120g12 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H12 = u0.AbstractC0995a.q(interfaceC0120g12.m(list14, (f1.C0121h) obj24));
                            } catch (java.lang.Throwable th11) {
                                H12 = i1.AbstractC0191j.H(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th11));
                            }
                            eVar.f(H12);
                            break;
                        case 11:
                            f1.InterfaceC0120g interfaceC0120g13 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H13 = u0.AbstractC0995a.q(interfaceC0120g13.l(list16, (f1.C0121h) obj25));
                            } catch (java.lang.Throwable th12) {
                                H13 = i1.AbstractC0191j.H(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th12));
                            }
                            eVar.f(H13);
                            break;
                        case 12:
                            f1.InterfaceC0120g interfaceC0120g14 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g14.j(str12, str13, (f1.C0121h) obj28);
                                H14 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th13) {
                                H14 = i1.AbstractC0191j.H(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th13));
                            }
                            eVar.f(H14);
                            break;
                        case 13:
                            f1.InterfaceC0120g interfaceC0120g15 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g15.r(str14, longValue, (f1.C0121h) obj31);
                                H15 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th14) {
                                H15 = i1.AbstractC0191j.H(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th14));
                            }
                            eVar.f(H15);
                            break;
                        default:
                            f1.InterfaceC0120g interfaceC0120g16 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g16.g(str15, doubleValue, (f1.C0121h) obj34);
                                H16 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th15) {
                                H16 = i1.AbstractC0191j.H(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th15));
                            }
                            eVar.f(H16);
                            break;
                    }
                }
            });
        } else {
            c0014n3.h(null);
        }
        F.C0014n c0014n4 = new F.C0014n(binaryMessenger, B1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", concat), a(), f2);
        if (interfaceC0120g != null) {
            final int i5 = 14;
            c0014n4.h(new a1.InterfaceC0062b() { // from class: f1.e
                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    java.util.List H2;
                    java.util.List H3;
                    java.util.List H4;
                    java.util.List H5;
                    java.util.List H6;
                    java.util.List H7;
                    java.util.List H8;
                    java.util.List H9;
                    java.util.List H10;
                    java.util.List H11;
                    java.util.List H12;
                    java.util.List H13;
                    java.util.List H14;
                    java.util.List H15;
                    java.util.List H16;
                    switch (i5) {
                        case 0:
                            f1.InterfaceC0120g interfaceC0120g2 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g2.e(str2, str3, (f1.C0121h) obj4);
                                H2 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th) {
                                H2 = i1.AbstractC0191j.H(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th));
                            }
                            eVar.f(H2);
                            break;
                        case 1:
                            f1.InterfaceC0120g interfaceC0120g3 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g3.f(str4, list3, (f1.C0121h) obj7);
                                H3 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th2) {
                                H3 = i1.AbstractC0191j.H(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th2));
                            }
                            eVar.f(H3);
                            break;
                        case 2:
                            f1.InterfaceC0120g interfaceC0120g4 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H4 = u0.AbstractC0995a.q(interfaceC0120g4.p(str5, (f1.C0121h) obj9));
                            } catch (java.lang.Throwable th3) {
                                H4 = i1.AbstractC0191j.H(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th3));
                            }
                            eVar.f(H4);
                            break;
                        case 3:
                            f1.InterfaceC0120g interfaceC0120g5 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H5 = u0.AbstractC0995a.q(interfaceC0120g5.q(str6, (f1.C0121h) obj11));
                            } catch (java.lang.Throwable th4) {
                                H5 = i1.AbstractC0191j.H(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th4));
                            }
                            eVar.f(H5);
                            break;
                        case 4:
                            f1.InterfaceC0120g interfaceC0120g6 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H6 = u0.AbstractC0995a.q(interfaceC0120g6.b(str7, (f1.C0121h) obj13));
                            } catch (java.lang.Throwable th5) {
                                H6 = i1.AbstractC0191j.H(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th5));
                            }
                            eVar.f(H6);
                            break;
                        case 5:
                            f1.InterfaceC0120g interfaceC0120g7 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H7 = u0.AbstractC0995a.q(interfaceC0120g7.c(str8, (f1.C0121h) obj15));
                            } catch (java.lang.Throwable th6) {
                                H7 = i1.AbstractC0191j.H(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th6));
                            }
                            eVar.f(H7);
                            break;
                        case 6:
                            f1.InterfaceC0120g interfaceC0120g8 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g8.a(str9, booleanValue, (f1.C0121h) obj18);
                                H8 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th7) {
                                H8 = i1.AbstractC0191j.H(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th7));
                            }
                            eVar.f(H8);
                            break;
                        case 7:
                            f1.InterfaceC0120g interfaceC0120g9 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H9 = u0.AbstractC0995a.q(interfaceC0120g9.d(str10, (f1.C0121h) obj20));
                            } catch (java.lang.Throwable th8) {
                                H9 = i1.AbstractC0191j.H(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th8));
                            }
                            eVar.f(H9);
                            break;
                        case 8:
                            f1.InterfaceC0120g interfaceC0120g10 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H10 = u0.AbstractC0995a.q(interfaceC0120g10.h(str11, (f1.C0121h) obj22));
                            } catch (java.lang.Throwable th9) {
                                H10 = i1.AbstractC0191j.H(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th9));
                            }
                            eVar.f(H10);
                            break;
                        case 9:
                            f1.InterfaceC0120g interfaceC0120g11 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g11.k(list12, (f1.C0121h) obj23);
                                H11 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th10) {
                                H11 = i1.AbstractC0191j.H(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th10));
                            }
                            eVar.f(H11);
                            break;
                        case 10:
                            f1.InterfaceC0120g interfaceC0120g12 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H12 = u0.AbstractC0995a.q(interfaceC0120g12.m(list14, (f1.C0121h) obj24));
                            } catch (java.lang.Throwable th11) {
                                H12 = i1.AbstractC0191j.H(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th11));
                            }
                            eVar.f(H12);
                            break;
                        case 11:
                            f1.InterfaceC0120g interfaceC0120g13 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H13 = u0.AbstractC0995a.q(interfaceC0120g13.l(list16, (f1.C0121h) obj25));
                            } catch (java.lang.Throwable th12) {
                                H13 = i1.AbstractC0191j.H(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th12));
                            }
                            eVar.f(H13);
                            break;
                        case 12:
                            f1.InterfaceC0120g interfaceC0120g14 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g14.j(str12, str13, (f1.C0121h) obj28);
                                H14 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th13) {
                                H14 = i1.AbstractC0191j.H(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th13));
                            }
                            eVar.f(H14);
                            break;
                        case 13:
                            f1.InterfaceC0120g interfaceC0120g15 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g15.r(str14, longValue, (f1.C0121h) obj31);
                                H15 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th14) {
                                H15 = i1.AbstractC0191j.H(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th14));
                            }
                            eVar.f(H15);
                            break;
                        default:
                            f1.InterfaceC0120g interfaceC0120g16 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g16.g(str15, doubleValue, (f1.C0121h) obj34);
                                H16 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th15) {
                                H16 = i1.AbstractC0191j.H(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th15));
                            }
                            eVar.f(H16);
                            break;
                    }
                }
            });
        } else {
            c0014n4.h(null);
        }
        F.C0014n c0014n5 = new F.C0014n(binaryMessenger, B1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", concat), a(), f2);
        if (interfaceC0120g != null) {
            final int i6 = 0;
            c0014n5.h(new a1.InterfaceC0062b() { // from class: f1.e
                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    java.util.List H2;
                    java.util.List H3;
                    java.util.List H4;
                    java.util.List H5;
                    java.util.List H6;
                    java.util.List H7;
                    java.util.List H8;
                    java.util.List H9;
                    java.util.List H10;
                    java.util.List H11;
                    java.util.List H12;
                    java.util.List H13;
                    java.util.List H14;
                    java.util.List H15;
                    java.util.List H16;
                    switch (i6) {
                        case 0:
                            f1.InterfaceC0120g interfaceC0120g2 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g2.e(str2, str3, (f1.C0121h) obj4);
                                H2 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th) {
                                H2 = i1.AbstractC0191j.H(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th));
                            }
                            eVar.f(H2);
                            break;
                        case 1:
                            f1.InterfaceC0120g interfaceC0120g3 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g3.f(str4, list3, (f1.C0121h) obj7);
                                H3 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th2) {
                                H3 = i1.AbstractC0191j.H(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th2));
                            }
                            eVar.f(H3);
                            break;
                        case 2:
                            f1.InterfaceC0120g interfaceC0120g4 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H4 = u0.AbstractC0995a.q(interfaceC0120g4.p(str5, (f1.C0121h) obj9));
                            } catch (java.lang.Throwable th3) {
                                H4 = i1.AbstractC0191j.H(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th3));
                            }
                            eVar.f(H4);
                            break;
                        case 3:
                            f1.InterfaceC0120g interfaceC0120g5 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H5 = u0.AbstractC0995a.q(interfaceC0120g5.q(str6, (f1.C0121h) obj11));
                            } catch (java.lang.Throwable th4) {
                                H5 = i1.AbstractC0191j.H(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th4));
                            }
                            eVar.f(H5);
                            break;
                        case 4:
                            f1.InterfaceC0120g interfaceC0120g6 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H6 = u0.AbstractC0995a.q(interfaceC0120g6.b(str7, (f1.C0121h) obj13));
                            } catch (java.lang.Throwable th5) {
                                H6 = i1.AbstractC0191j.H(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th5));
                            }
                            eVar.f(H6);
                            break;
                        case 5:
                            f1.InterfaceC0120g interfaceC0120g7 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H7 = u0.AbstractC0995a.q(interfaceC0120g7.c(str8, (f1.C0121h) obj15));
                            } catch (java.lang.Throwable th6) {
                                H7 = i1.AbstractC0191j.H(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th6));
                            }
                            eVar.f(H7);
                            break;
                        case 6:
                            f1.InterfaceC0120g interfaceC0120g8 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g8.a(str9, booleanValue, (f1.C0121h) obj18);
                                H8 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th7) {
                                H8 = i1.AbstractC0191j.H(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th7));
                            }
                            eVar.f(H8);
                            break;
                        case 7:
                            f1.InterfaceC0120g interfaceC0120g9 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H9 = u0.AbstractC0995a.q(interfaceC0120g9.d(str10, (f1.C0121h) obj20));
                            } catch (java.lang.Throwable th8) {
                                H9 = i1.AbstractC0191j.H(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th8));
                            }
                            eVar.f(H9);
                            break;
                        case 8:
                            f1.InterfaceC0120g interfaceC0120g10 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H10 = u0.AbstractC0995a.q(interfaceC0120g10.h(str11, (f1.C0121h) obj22));
                            } catch (java.lang.Throwable th9) {
                                H10 = i1.AbstractC0191j.H(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th9));
                            }
                            eVar.f(H10);
                            break;
                        case 9:
                            f1.InterfaceC0120g interfaceC0120g11 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g11.k(list12, (f1.C0121h) obj23);
                                H11 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th10) {
                                H11 = i1.AbstractC0191j.H(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th10));
                            }
                            eVar.f(H11);
                            break;
                        case 10:
                            f1.InterfaceC0120g interfaceC0120g12 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H12 = u0.AbstractC0995a.q(interfaceC0120g12.m(list14, (f1.C0121h) obj24));
                            } catch (java.lang.Throwable th11) {
                                H12 = i1.AbstractC0191j.H(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th11));
                            }
                            eVar.f(H12);
                            break;
                        case 11:
                            f1.InterfaceC0120g interfaceC0120g13 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H13 = u0.AbstractC0995a.q(interfaceC0120g13.l(list16, (f1.C0121h) obj25));
                            } catch (java.lang.Throwable th12) {
                                H13 = i1.AbstractC0191j.H(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th12));
                            }
                            eVar.f(H13);
                            break;
                        case 12:
                            f1.InterfaceC0120g interfaceC0120g14 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g14.j(str12, str13, (f1.C0121h) obj28);
                                H14 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th13) {
                                H14 = i1.AbstractC0191j.H(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th13));
                            }
                            eVar.f(H14);
                            break;
                        case 13:
                            f1.InterfaceC0120g interfaceC0120g15 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g15.r(str14, longValue, (f1.C0121h) obj31);
                                H15 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th14) {
                                H15 = i1.AbstractC0191j.H(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th14));
                            }
                            eVar.f(H15);
                            break;
                        default:
                            f1.InterfaceC0120g interfaceC0120g16 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g16.g(str15, doubleValue, (f1.C0121h) obj34);
                                H16 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th15) {
                                H16 = i1.AbstractC0191j.H(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th15));
                            }
                            eVar.f(H16);
                            break;
                    }
                }
            });
        } else {
            c0014n5.h(null);
        }
        F.C0014n c0014n6 = new F.C0014n(binaryMessenger, B1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", concat), a(), f2);
        if (interfaceC0120g != null) {
            final int i7 = 1;
            c0014n6.h(new a1.InterfaceC0062b() { // from class: f1.e
                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    java.util.List H2;
                    java.util.List H3;
                    java.util.List H4;
                    java.util.List H5;
                    java.util.List H6;
                    java.util.List H7;
                    java.util.List H8;
                    java.util.List H9;
                    java.util.List H10;
                    java.util.List H11;
                    java.util.List H12;
                    java.util.List H13;
                    java.util.List H14;
                    java.util.List H15;
                    java.util.List H16;
                    switch (i7) {
                        case 0:
                            f1.InterfaceC0120g interfaceC0120g2 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g2.e(str2, str3, (f1.C0121h) obj4);
                                H2 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th) {
                                H2 = i1.AbstractC0191j.H(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th));
                            }
                            eVar.f(H2);
                            break;
                        case 1:
                            f1.InterfaceC0120g interfaceC0120g3 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g3.f(str4, list3, (f1.C0121h) obj7);
                                H3 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th2) {
                                H3 = i1.AbstractC0191j.H(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th2));
                            }
                            eVar.f(H3);
                            break;
                        case 2:
                            f1.InterfaceC0120g interfaceC0120g4 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H4 = u0.AbstractC0995a.q(interfaceC0120g4.p(str5, (f1.C0121h) obj9));
                            } catch (java.lang.Throwable th3) {
                                H4 = i1.AbstractC0191j.H(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th3));
                            }
                            eVar.f(H4);
                            break;
                        case 3:
                            f1.InterfaceC0120g interfaceC0120g5 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H5 = u0.AbstractC0995a.q(interfaceC0120g5.q(str6, (f1.C0121h) obj11));
                            } catch (java.lang.Throwable th4) {
                                H5 = i1.AbstractC0191j.H(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th4));
                            }
                            eVar.f(H5);
                            break;
                        case 4:
                            f1.InterfaceC0120g interfaceC0120g6 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H6 = u0.AbstractC0995a.q(interfaceC0120g6.b(str7, (f1.C0121h) obj13));
                            } catch (java.lang.Throwable th5) {
                                H6 = i1.AbstractC0191j.H(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th5));
                            }
                            eVar.f(H6);
                            break;
                        case 5:
                            f1.InterfaceC0120g interfaceC0120g7 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H7 = u0.AbstractC0995a.q(interfaceC0120g7.c(str8, (f1.C0121h) obj15));
                            } catch (java.lang.Throwable th6) {
                                H7 = i1.AbstractC0191j.H(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th6));
                            }
                            eVar.f(H7);
                            break;
                        case 6:
                            f1.InterfaceC0120g interfaceC0120g8 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g8.a(str9, booleanValue, (f1.C0121h) obj18);
                                H8 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th7) {
                                H8 = i1.AbstractC0191j.H(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th7));
                            }
                            eVar.f(H8);
                            break;
                        case 7:
                            f1.InterfaceC0120g interfaceC0120g9 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H9 = u0.AbstractC0995a.q(interfaceC0120g9.d(str10, (f1.C0121h) obj20));
                            } catch (java.lang.Throwable th8) {
                                H9 = i1.AbstractC0191j.H(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th8));
                            }
                            eVar.f(H9);
                            break;
                        case 8:
                            f1.InterfaceC0120g interfaceC0120g10 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H10 = u0.AbstractC0995a.q(interfaceC0120g10.h(str11, (f1.C0121h) obj22));
                            } catch (java.lang.Throwable th9) {
                                H10 = i1.AbstractC0191j.H(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th9));
                            }
                            eVar.f(H10);
                            break;
                        case 9:
                            f1.InterfaceC0120g interfaceC0120g11 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g11.k(list12, (f1.C0121h) obj23);
                                H11 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th10) {
                                H11 = i1.AbstractC0191j.H(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th10));
                            }
                            eVar.f(H11);
                            break;
                        case 10:
                            f1.InterfaceC0120g interfaceC0120g12 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H12 = u0.AbstractC0995a.q(interfaceC0120g12.m(list14, (f1.C0121h) obj24));
                            } catch (java.lang.Throwable th11) {
                                H12 = i1.AbstractC0191j.H(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th11));
                            }
                            eVar.f(H12);
                            break;
                        case 11:
                            f1.InterfaceC0120g interfaceC0120g13 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H13 = u0.AbstractC0995a.q(interfaceC0120g13.l(list16, (f1.C0121h) obj25));
                            } catch (java.lang.Throwable th12) {
                                H13 = i1.AbstractC0191j.H(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th12));
                            }
                            eVar.f(H13);
                            break;
                        case 12:
                            f1.InterfaceC0120g interfaceC0120g14 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g14.j(str12, str13, (f1.C0121h) obj28);
                                H14 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th13) {
                                H14 = i1.AbstractC0191j.H(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th13));
                            }
                            eVar.f(H14);
                            break;
                        case 13:
                            f1.InterfaceC0120g interfaceC0120g15 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g15.r(str14, longValue, (f1.C0121h) obj31);
                                H15 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th14) {
                                H15 = i1.AbstractC0191j.H(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th14));
                            }
                            eVar.f(H15);
                            break;
                        default:
                            f1.InterfaceC0120g interfaceC0120g16 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g16.g(str15, doubleValue, (f1.C0121h) obj34);
                                H16 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th15) {
                                H16 = i1.AbstractC0191j.H(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th15));
                            }
                            eVar.f(H16);
                            break;
                    }
                }
            });
        } else {
            c0014n6.h(null);
        }
        F.C0014n c0014n7 = new F.C0014n(binaryMessenger, B1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", concat), a(), f2);
        if (interfaceC0120g != null) {
            final int i8 = 2;
            c0014n7.h(new a1.InterfaceC0062b() { // from class: f1.e
                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    java.util.List H2;
                    java.util.List H3;
                    java.util.List H4;
                    java.util.List H5;
                    java.util.List H6;
                    java.util.List H7;
                    java.util.List H8;
                    java.util.List H9;
                    java.util.List H10;
                    java.util.List H11;
                    java.util.List H12;
                    java.util.List H13;
                    java.util.List H14;
                    java.util.List H15;
                    java.util.List H16;
                    switch (i8) {
                        case 0:
                            f1.InterfaceC0120g interfaceC0120g2 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g2.e(str2, str3, (f1.C0121h) obj4);
                                H2 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th) {
                                H2 = i1.AbstractC0191j.H(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th));
                            }
                            eVar.f(H2);
                            break;
                        case 1:
                            f1.InterfaceC0120g interfaceC0120g3 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g3.f(str4, list3, (f1.C0121h) obj7);
                                H3 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th2) {
                                H3 = i1.AbstractC0191j.H(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th2));
                            }
                            eVar.f(H3);
                            break;
                        case 2:
                            f1.InterfaceC0120g interfaceC0120g4 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H4 = u0.AbstractC0995a.q(interfaceC0120g4.p(str5, (f1.C0121h) obj9));
                            } catch (java.lang.Throwable th3) {
                                H4 = i1.AbstractC0191j.H(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th3));
                            }
                            eVar.f(H4);
                            break;
                        case 3:
                            f1.InterfaceC0120g interfaceC0120g5 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H5 = u0.AbstractC0995a.q(interfaceC0120g5.q(str6, (f1.C0121h) obj11));
                            } catch (java.lang.Throwable th4) {
                                H5 = i1.AbstractC0191j.H(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th4));
                            }
                            eVar.f(H5);
                            break;
                        case 4:
                            f1.InterfaceC0120g interfaceC0120g6 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H6 = u0.AbstractC0995a.q(interfaceC0120g6.b(str7, (f1.C0121h) obj13));
                            } catch (java.lang.Throwable th5) {
                                H6 = i1.AbstractC0191j.H(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th5));
                            }
                            eVar.f(H6);
                            break;
                        case 5:
                            f1.InterfaceC0120g interfaceC0120g7 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H7 = u0.AbstractC0995a.q(interfaceC0120g7.c(str8, (f1.C0121h) obj15));
                            } catch (java.lang.Throwable th6) {
                                H7 = i1.AbstractC0191j.H(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th6));
                            }
                            eVar.f(H7);
                            break;
                        case 6:
                            f1.InterfaceC0120g interfaceC0120g8 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g8.a(str9, booleanValue, (f1.C0121h) obj18);
                                H8 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th7) {
                                H8 = i1.AbstractC0191j.H(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th7));
                            }
                            eVar.f(H8);
                            break;
                        case 7:
                            f1.InterfaceC0120g interfaceC0120g9 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H9 = u0.AbstractC0995a.q(interfaceC0120g9.d(str10, (f1.C0121h) obj20));
                            } catch (java.lang.Throwable th8) {
                                H9 = i1.AbstractC0191j.H(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th8));
                            }
                            eVar.f(H9);
                            break;
                        case 8:
                            f1.InterfaceC0120g interfaceC0120g10 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H10 = u0.AbstractC0995a.q(interfaceC0120g10.h(str11, (f1.C0121h) obj22));
                            } catch (java.lang.Throwable th9) {
                                H10 = i1.AbstractC0191j.H(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th9));
                            }
                            eVar.f(H10);
                            break;
                        case 9:
                            f1.InterfaceC0120g interfaceC0120g11 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g11.k(list12, (f1.C0121h) obj23);
                                H11 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th10) {
                                H11 = i1.AbstractC0191j.H(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th10));
                            }
                            eVar.f(H11);
                            break;
                        case 10:
                            f1.InterfaceC0120g interfaceC0120g12 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H12 = u0.AbstractC0995a.q(interfaceC0120g12.m(list14, (f1.C0121h) obj24));
                            } catch (java.lang.Throwable th11) {
                                H12 = i1.AbstractC0191j.H(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th11));
                            }
                            eVar.f(H12);
                            break;
                        case 11:
                            f1.InterfaceC0120g interfaceC0120g13 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H13 = u0.AbstractC0995a.q(interfaceC0120g13.l(list16, (f1.C0121h) obj25));
                            } catch (java.lang.Throwable th12) {
                                H13 = i1.AbstractC0191j.H(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th12));
                            }
                            eVar.f(H13);
                            break;
                        case 12:
                            f1.InterfaceC0120g interfaceC0120g14 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g14.j(str12, str13, (f1.C0121h) obj28);
                                H14 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th13) {
                                H14 = i1.AbstractC0191j.H(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th13));
                            }
                            eVar.f(H14);
                            break;
                        case 13:
                            f1.InterfaceC0120g interfaceC0120g15 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g15.r(str14, longValue, (f1.C0121h) obj31);
                                H15 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th14) {
                                H15 = i1.AbstractC0191j.H(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th14));
                            }
                            eVar.f(H15);
                            break;
                        default:
                            f1.InterfaceC0120g interfaceC0120g16 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g16.g(str15, doubleValue, (f1.C0121h) obj34);
                                H16 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th15) {
                                H16 = i1.AbstractC0191j.H(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th15));
                            }
                            eVar.f(H16);
                            break;
                    }
                }
            });
        } else {
            c0014n7.h(null);
        }
        F.C0014n c0014n8 = new F.C0014n(binaryMessenger, B1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", concat), a(), f2);
        if (interfaceC0120g != null) {
            final int i9 = 3;
            c0014n8.h(new a1.InterfaceC0062b() { // from class: f1.e
                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    java.util.List H2;
                    java.util.List H3;
                    java.util.List H4;
                    java.util.List H5;
                    java.util.List H6;
                    java.util.List H7;
                    java.util.List H8;
                    java.util.List H9;
                    java.util.List H10;
                    java.util.List H11;
                    java.util.List H12;
                    java.util.List H13;
                    java.util.List H14;
                    java.util.List H15;
                    java.util.List H16;
                    switch (i9) {
                        case 0:
                            f1.InterfaceC0120g interfaceC0120g2 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g2.e(str2, str3, (f1.C0121h) obj4);
                                H2 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th) {
                                H2 = i1.AbstractC0191j.H(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th));
                            }
                            eVar.f(H2);
                            break;
                        case 1:
                            f1.InterfaceC0120g interfaceC0120g3 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g3.f(str4, list3, (f1.C0121h) obj7);
                                H3 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th2) {
                                H3 = i1.AbstractC0191j.H(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th2));
                            }
                            eVar.f(H3);
                            break;
                        case 2:
                            f1.InterfaceC0120g interfaceC0120g4 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H4 = u0.AbstractC0995a.q(interfaceC0120g4.p(str5, (f1.C0121h) obj9));
                            } catch (java.lang.Throwable th3) {
                                H4 = i1.AbstractC0191j.H(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th3));
                            }
                            eVar.f(H4);
                            break;
                        case 3:
                            f1.InterfaceC0120g interfaceC0120g5 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H5 = u0.AbstractC0995a.q(interfaceC0120g5.q(str6, (f1.C0121h) obj11));
                            } catch (java.lang.Throwable th4) {
                                H5 = i1.AbstractC0191j.H(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th4));
                            }
                            eVar.f(H5);
                            break;
                        case 4:
                            f1.InterfaceC0120g interfaceC0120g6 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H6 = u0.AbstractC0995a.q(interfaceC0120g6.b(str7, (f1.C0121h) obj13));
                            } catch (java.lang.Throwable th5) {
                                H6 = i1.AbstractC0191j.H(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th5));
                            }
                            eVar.f(H6);
                            break;
                        case 5:
                            f1.InterfaceC0120g interfaceC0120g7 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H7 = u0.AbstractC0995a.q(interfaceC0120g7.c(str8, (f1.C0121h) obj15));
                            } catch (java.lang.Throwable th6) {
                                H7 = i1.AbstractC0191j.H(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th6));
                            }
                            eVar.f(H7);
                            break;
                        case 6:
                            f1.InterfaceC0120g interfaceC0120g8 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g8.a(str9, booleanValue, (f1.C0121h) obj18);
                                H8 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th7) {
                                H8 = i1.AbstractC0191j.H(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th7));
                            }
                            eVar.f(H8);
                            break;
                        case 7:
                            f1.InterfaceC0120g interfaceC0120g9 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H9 = u0.AbstractC0995a.q(interfaceC0120g9.d(str10, (f1.C0121h) obj20));
                            } catch (java.lang.Throwable th8) {
                                H9 = i1.AbstractC0191j.H(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th8));
                            }
                            eVar.f(H9);
                            break;
                        case 8:
                            f1.InterfaceC0120g interfaceC0120g10 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H10 = u0.AbstractC0995a.q(interfaceC0120g10.h(str11, (f1.C0121h) obj22));
                            } catch (java.lang.Throwable th9) {
                                H10 = i1.AbstractC0191j.H(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th9));
                            }
                            eVar.f(H10);
                            break;
                        case 9:
                            f1.InterfaceC0120g interfaceC0120g11 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g11.k(list12, (f1.C0121h) obj23);
                                H11 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th10) {
                                H11 = i1.AbstractC0191j.H(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th10));
                            }
                            eVar.f(H11);
                            break;
                        case 10:
                            f1.InterfaceC0120g interfaceC0120g12 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H12 = u0.AbstractC0995a.q(interfaceC0120g12.m(list14, (f1.C0121h) obj24));
                            } catch (java.lang.Throwable th11) {
                                H12 = i1.AbstractC0191j.H(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th11));
                            }
                            eVar.f(H12);
                            break;
                        case 11:
                            f1.InterfaceC0120g interfaceC0120g13 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H13 = u0.AbstractC0995a.q(interfaceC0120g13.l(list16, (f1.C0121h) obj25));
                            } catch (java.lang.Throwable th12) {
                                H13 = i1.AbstractC0191j.H(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th12));
                            }
                            eVar.f(H13);
                            break;
                        case 12:
                            f1.InterfaceC0120g interfaceC0120g14 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g14.j(str12, str13, (f1.C0121h) obj28);
                                H14 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th13) {
                                H14 = i1.AbstractC0191j.H(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th13));
                            }
                            eVar.f(H14);
                            break;
                        case 13:
                            f1.InterfaceC0120g interfaceC0120g15 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g15.r(str14, longValue, (f1.C0121h) obj31);
                                H15 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th14) {
                                H15 = i1.AbstractC0191j.H(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th14));
                            }
                            eVar.f(H15);
                            break;
                        default:
                            f1.InterfaceC0120g interfaceC0120g16 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g16.g(str15, doubleValue, (f1.C0121h) obj34);
                                H16 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th15) {
                                H16 = i1.AbstractC0191j.H(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th15));
                            }
                            eVar.f(H16);
                            break;
                    }
                }
            });
        } else {
            c0014n8.h(null);
        }
        F.C0014n c0014n9 = new F.C0014n(binaryMessenger, B1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", concat), a(), f2);
        if (interfaceC0120g != null) {
            final int i10 = 4;
            c0014n9.h(new a1.InterfaceC0062b() { // from class: f1.e
                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    java.util.List H2;
                    java.util.List H3;
                    java.util.List H4;
                    java.util.List H5;
                    java.util.List H6;
                    java.util.List H7;
                    java.util.List H8;
                    java.util.List H9;
                    java.util.List H10;
                    java.util.List H11;
                    java.util.List H12;
                    java.util.List H13;
                    java.util.List H14;
                    java.util.List H15;
                    java.util.List H16;
                    switch (i10) {
                        case 0:
                            f1.InterfaceC0120g interfaceC0120g2 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g2.e(str2, str3, (f1.C0121h) obj4);
                                H2 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th) {
                                H2 = i1.AbstractC0191j.H(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th));
                            }
                            eVar.f(H2);
                            break;
                        case 1:
                            f1.InterfaceC0120g interfaceC0120g3 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g3.f(str4, list3, (f1.C0121h) obj7);
                                H3 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th2) {
                                H3 = i1.AbstractC0191j.H(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th2));
                            }
                            eVar.f(H3);
                            break;
                        case 2:
                            f1.InterfaceC0120g interfaceC0120g4 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H4 = u0.AbstractC0995a.q(interfaceC0120g4.p(str5, (f1.C0121h) obj9));
                            } catch (java.lang.Throwable th3) {
                                H4 = i1.AbstractC0191j.H(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th3));
                            }
                            eVar.f(H4);
                            break;
                        case 3:
                            f1.InterfaceC0120g interfaceC0120g5 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H5 = u0.AbstractC0995a.q(interfaceC0120g5.q(str6, (f1.C0121h) obj11));
                            } catch (java.lang.Throwable th4) {
                                H5 = i1.AbstractC0191j.H(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th4));
                            }
                            eVar.f(H5);
                            break;
                        case 4:
                            f1.InterfaceC0120g interfaceC0120g6 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H6 = u0.AbstractC0995a.q(interfaceC0120g6.b(str7, (f1.C0121h) obj13));
                            } catch (java.lang.Throwable th5) {
                                H6 = i1.AbstractC0191j.H(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th5));
                            }
                            eVar.f(H6);
                            break;
                        case 5:
                            f1.InterfaceC0120g interfaceC0120g7 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H7 = u0.AbstractC0995a.q(interfaceC0120g7.c(str8, (f1.C0121h) obj15));
                            } catch (java.lang.Throwable th6) {
                                H7 = i1.AbstractC0191j.H(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th6));
                            }
                            eVar.f(H7);
                            break;
                        case 6:
                            f1.InterfaceC0120g interfaceC0120g8 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g8.a(str9, booleanValue, (f1.C0121h) obj18);
                                H8 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th7) {
                                H8 = i1.AbstractC0191j.H(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th7));
                            }
                            eVar.f(H8);
                            break;
                        case 7:
                            f1.InterfaceC0120g interfaceC0120g9 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H9 = u0.AbstractC0995a.q(interfaceC0120g9.d(str10, (f1.C0121h) obj20));
                            } catch (java.lang.Throwable th8) {
                                H9 = i1.AbstractC0191j.H(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th8));
                            }
                            eVar.f(H9);
                            break;
                        case 8:
                            f1.InterfaceC0120g interfaceC0120g10 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H10 = u0.AbstractC0995a.q(interfaceC0120g10.h(str11, (f1.C0121h) obj22));
                            } catch (java.lang.Throwable th9) {
                                H10 = i1.AbstractC0191j.H(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th9));
                            }
                            eVar.f(H10);
                            break;
                        case 9:
                            f1.InterfaceC0120g interfaceC0120g11 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g11.k(list12, (f1.C0121h) obj23);
                                H11 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th10) {
                                H11 = i1.AbstractC0191j.H(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th10));
                            }
                            eVar.f(H11);
                            break;
                        case 10:
                            f1.InterfaceC0120g interfaceC0120g12 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H12 = u0.AbstractC0995a.q(interfaceC0120g12.m(list14, (f1.C0121h) obj24));
                            } catch (java.lang.Throwable th11) {
                                H12 = i1.AbstractC0191j.H(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th11));
                            }
                            eVar.f(H12);
                            break;
                        case 11:
                            f1.InterfaceC0120g interfaceC0120g13 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H13 = u0.AbstractC0995a.q(interfaceC0120g13.l(list16, (f1.C0121h) obj25));
                            } catch (java.lang.Throwable th12) {
                                H13 = i1.AbstractC0191j.H(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th12));
                            }
                            eVar.f(H13);
                            break;
                        case 12:
                            f1.InterfaceC0120g interfaceC0120g14 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g14.j(str12, str13, (f1.C0121h) obj28);
                                H14 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th13) {
                                H14 = i1.AbstractC0191j.H(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th13));
                            }
                            eVar.f(H14);
                            break;
                        case 13:
                            f1.InterfaceC0120g interfaceC0120g15 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g15.r(str14, longValue, (f1.C0121h) obj31);
                                H15 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th14) {
                                H15 = i1.AbstractC0191j.H(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th14));
                            }
                            eVar.f(H15);
                            break;
                        default:
                            f1.InterfaceC0120g interfaceC0120g16 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g16.g(str15, doubleValue, (f1.C0121h) obj34);
                                H16 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th15) {
                                H16 = i1.AbstractC0191j.H(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th15));
                            }
                            eVar.f(H16);
                            break;
                    }
                }
            });
        } else {
            c0014n9.h(null);
        }
        F.C0014n c0014n10 = new F.C0014n(binaryMessenger, B1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", concat), a(), f2);
        if (interfaceC0120g != null) {
            final int i11 = 5;
            c0014n10.h(new a1.InterfaceC0062b() { // from class: f1.e
                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    java.util.List H2;
                    java.util.List H3;
                    java.util.List H4;
                    java.util.List H5;
                    java.util.List H6;
                    java.util.List H7;
                    java.util.List H8;
                    java.util.List H9;
                    java.util.List H10;
                    java.util.List H11;
                    java.util.List H12;
                    java.util.List H13;
                    java.util.List H14;
                    java.util.List H15;
                    java.util.List H16;
                    switch (i11) {
                        case 0:
                            f1.InterfaceC0120g interfaceC0120g2 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g2.e(str2, str3, (f1.C0121h) obj4);
                                H2 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th) {
                                H2 = i1.AbstractC0191j.H(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th));
                            }
                            eVar.f(H2);
                            break;
                        case 1:
                            f1.InterfaceC0120g interfaceC0120g3 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g3.f(str4, list3, (f1.C0121h) obj7);
                                H3 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th2) {
                                H3 = i1.AbstractC0191j.H(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th2));
                            }
                            eVar.f(H3);
                            break;
                        case 2:
                            f1.InterfaceC0120g interfaceC0120g4 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H4 = u0.AbstractC0995a.q(interfaceC0120g4.p(str5, (f1.C0121h) obj9));
                            } catch (java.lang.Throwable th3) {
                                H4 = i1.AbstractC0191j.H(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th3));
                            }
                            eVar.f(H4);
                            break;
                        case 3:
                            f1.InterfaceC0120g interfaceC0120g5 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H5 = u0.AbstractC0995a.q(interfaceC0120g5.q(str6, (f1.C0121h) obj11));
                            } catch (java.lang.Throwable th4) {
                                H5 = i1.AbstractC0191j.H(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th4));
                            }
                            eVar.f(H5);
                            break;
                        case 4:
                            f1.InterfaceC0120g interfaceC0120g6 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H6 = u0.AbstractC0995a.q(interfaceC0120g6.b(str7, (f1.C0121h) obj13));
                            } catch (java.lang.Throwable th5) {
                                H6 = i1.AbstractC0191j.H(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th5));
                            }
                            eVar.f(H6);
                            break;
                        case 5:
                            f1.InterfaceC0120g interfaceC0120g7 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H7 = u0.AbstractC0995a.q(interfaceC0120g7.c(str8, (f1.C0121h) obj15));
                            } catch (java.lang.Throwable th6) {
                                H7 = i1.AbstractC0191j.H(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th6));
                            }
                            eVar.f(H7);
                            break;
                        case 6:
                            f1.InterfaceC0120g interfaceC0120g8 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g8.a(str9, booleanValue, (f1.C0121h) obj18);
                                H8 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th7) {
                                H8 = i1.AbstractC0191j.H(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th7));
                            }
                            eVar.f(H8);
                            break;
                        case 7:
                            f1.InterfaceC0120g interfaceC0120g9 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H9 = u0.AbstractC0995a.q(interfaceC0120g9.d(str10, (f1.C0121h) obj20));
                            } catch (java.lang.Throwable th8) {
                                H9 = i1.AbstractC0191j.H(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th8));
                            }
                            eVar.f(H9);
                            break;
                        case 8:
                            f1.InterfaceC0120g interfaceC0120g10 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H10 = u0.AbstractC0995a.q(interfaceC0120g10.h(str11, (f1.C0121h) obj22));
                            } catch (java.lang.Throwable th9) {
                                H10 = i1.AbstractC0191j.H(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th9));
                            }
                            eVar.f(H10);
                            break;
                        case 9:
                            f1.InterfaceC0120g interfaceC0120g11 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g11.k(list12, (f1.C0121h) obj23);
                                H11 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th10) {
                                H11 = i1.AbstractC0191j.H(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th10));
                            }
                            eVar.f(H11);
                            break;
                        case 10:
                            f1.InterfaceC0120g interfaceC0120g12 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H12 = u0.AbstractC0995a.q(interfaceC0120g12.m(list14, (f1.C0121h) obj24));
                            } catch (java.lang.Throwable th11) {
                                H12 = i1.AbstractC0191j.H(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th11));
                            }
                            eVar.f(H12);
                            break;
                        case 11:
                            f1.InterfaceC0120g interfaceC0120g13 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H13 = u0.AbstractC0995a.q(interfaceC0120g13.l(list16, (f1.C0121h) obj25));
                            } catch (java.lang.Throwable th12) {
                                H13 = i1.AbstractC0191j.H(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th12));
                            }
                            eVar.f(H13);
                            break;
                        case 12:
                            f1.InterfaceC0120g interfaceC0120g14 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g14.j(str12, str13, (f1.C0121h) obj28);
                                H14 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th13) {
                                H14 = i1.AbstractC0191j.H(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th13));
                            }
                            eVar.f(H14);
                            break;
                        case 13:
                            f1.InterfaceC0120g interfaceC0120g15 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g15.r(str14, longValue, (f1.C0121h) obj31);
                                H15 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th14) {
                                H15 = i1.AbstractC0191j.H(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th14));
                            }
                            eVar.f(H15);
                            break;
                        default:
                            f1.InterfaceC0120g interfaceC0120g16 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g16.g(str15, doubleValue, (f1.C0121h) obj34);
                                H16 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th15) {
                                H16 = i1.AbstractC0191j.H(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th15));
                            }
                            eVar.f(H16);
                            break;
                    }
                }
            });
        } else {
            c0014n10.h(null);
        }
        F.C0014n c0014n11 = new F.C0014n(binaryMessenger, B1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", concat), a(), f2);
        if (interfaceC0120g != null) {
            final int i12 = 7;
            c0014n11.h(new a1.InterfaceC0062b() { // from class: f1.e
                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    java.util.List H2;
                    java.util.List H3;
                    java.util.List H4;
                    java.util.List H5;
                    java.util.List H6;
                    java.util.List H7;
                    java.util.List H8;
                    java.util.List H9;
                    java.util.List H10;
                    java.util.List H11;
                    java.util.List H12;
                    java.util.List H13;
                    java.util.List H14;
                    java.util.List H15;
                    java.util.List H16;
                    switch (i12) {
                        case 0:
                            f1.InterfaceC0120g interfaceC0120g2 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g2.e(str2, str3, (f1.C0121h) obj4);
                                H2 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th) {
                                H2 = i1.AbstractC0191j.H(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th));
                            }
                            eVar.f(H2);
                            break;
                        case 1:
                            f1.InterfaceC0120g interfaceC0120g3 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g3.f(str4, list3, (f1.C0121h) obj7);
                                H3 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th2) {
                                H3 = i1.AbstractC0191j.H(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th2));
                            }
                            eVar.f(H3);
                            break;
                        case 2:
                            f1.InterfaceC0120g interfaceC0120g4 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H4 = u0.AbstractC0995a.q(interfaceC0120g4.p(str5, (f1.C0121h) obj9));
                            } catch (java.lang.Throwable th3) {
                                H4 = i1.AbstractC0191j.H(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th3));
                            }
                            eVar.f(H4);
                            break;
                        case 3:
                            f1.InterfaceC0120g interfaceC0120g5 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H5 = u0.AbstractC0995a.q(interfaceC0120g5.q(str6, (f1.C0121h) obj11));
                            } catch (java.lang.Throwable th4) {
                                H5 = i1.AbstractC0191j.H(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th4));
                            }
                            eVar.f(H5);
                            break;
                        case 4:
                            f1.InterfaceC0120g interfaceC0120g6 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H6 = u0.AbstractC0995a.q(interfaceC0120g6.b(str7, (f1.C0121h) obj13));
                            } catch (java.lang.Throwable th5) {
                                H6 = i1.AbstractC0191j.H(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th5));
                            }
                            eVar.f(H6);
                            break;
                        case 5:
                            f1.InterfaceC0120g interfaceC0120g7 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H7 = u0.AbstractC0995a.q(interfaceC0120g7.c(str8, (f1.C0121h) obj15));
                            } catch (java.lang.Throwable th6) {
                                H7 = i1.AbstractC0191j.H(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th6));
                            }
                            eVar.f(H7);
                            break;
                        case 6:
                            f1.InterfaceC0120g interfaceC0120g8 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g8.a(str9, booleanValue, (f1.C0121h) obj18);
                                H8 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th7) {
                                H8 = i1.AbstractC0191j.H(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th7));
                            }
                            eVar.f(H8);
                            break;
                        case 7:
                            f1.InterfaceC0120g interfaceC0120g9 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H9 = u0.AbstractC0995a.q(interfaceC0120g9.d(str10, (f1.C0121h) obj20));
                            } catch (java.lang.Throwable th8) {
                                H9 = i1.AbstractC0191j.H(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th8));
                            }
                            eVar.f(H9);
                            break;
                        case 8:
                            f1.InterfaceC0120g interfaceC0120g10 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H10 = u0.AbstractC0995a.q(interfaceC0120g10.h(str11, (f1.C0121h) obj22));
                            } catch (java.lang.Throwable th9) {
                                H10 = i1.AbstractC0191j.H(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th9));
                            }
                            eVar.f(H10);
                            break;
                        case 9:
                            f1.InterfaceC0120g interfaceC0120g11 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g11.k(list12, (f1.C0121h) obj23);
                                H11 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th10) {
                                H11 = i1.AbstractC0191j.H(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th10));
                            }
                            eVar.f(H11);
                            break;
                        case 10:
                            f1.InterfaceC0120g interfaceC0120g12 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H12 = u0.AbstractC0995a.q(interfaceC0120g12.m(list14, (f1.C0121h) obj24));
                            } catch (java.lang.Throwable th11) {
                                H12 = i1.AbstractC0191j.H(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th11));
                            }
                            eVar.f(H12);
                            break;
                        case 11:
                            f1.InterfaceC0120g interfaceC0120g13 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H13 = u0.AbstractC0995a.q(interfaceC0120g13.l(list16, (f1.C0121h) obj25));
                            } catch (java.lang.Throwable th12) {
                                H13 = i1.AbstractC0191j.H(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th12));
                            }
                            eVar.f(H13);
                            break;
                        case 12:
                            f1.InterfaceC0120g interfaceC0120g14 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g14.j(str12, str13, (f1.C0121h) obj28);
                                H14 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th13) {
                                H14 = i1.AbstractC0191j.H(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th13));
                            }
                            eVar.f(H14);
                            break;
                        case 13:
                            f1.InterfaceC0120g interfaceC0120g15 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g15.r(str14, longValue, (f1.C0121h) obj31);
                                H15 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th14) {
                                H15 = i1.AbstractC0191j.H(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th14));
                            }
                            eVar.f(H15);
                            break;
                        default:
                            f1.InterfaceC0120g interfaceC0120g16 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g16.g(str15, doubleValue, (f1.C0121h) obj34);
                                H16 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th15) {
                                H16 = i1.AbstractC0191j.H(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th15));
                            }
                            eVar.f(H16);
                            break;
                    }
                }
            });
        } else {
            c0014n11.h(null);
        }
        F.C0014n c0014n12 = new F.C0014n(binaryMessenger, B1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", concat), a(), f2);
        if (interfaceC0120g != null) {
            final int i13 = 8;
            c0014n12.h(new a1.InterfaceC0062b() { // from class: f1.e
                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    java.util.List H2;
                    java.util.List H3;
                    java.util.List H4;
                    java.util.List H5;
                    java.util.List H6;
                    java.util.List H7;
                    java.util.List H8;
                    java.util.List H9;
                    java.util.List H10;
                    java.util.List H11;
                    java.util.List H12;
                    java.util.List H13;
                    java.util.List H14;
                    java.util.List H15;
                    java.util.List H16;
                    switch (i13) {
                        case 0:
                            f1.InterfaceC0120g interfaceC0120g2 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g2.e(str2, str3, (f1.C0121h) obj4);
                                H2 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th) {
                                H2 = i1.AbstractC0191j.H(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th));
                            }
                            eVar.f(H2);
                            break;
                        case 1:
                            f1.InterfaceC0120g interfaceC0120g3 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g3.f(str4, list3, (f1.C0121h) obj7);
                                H3 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th2) {
                                H3 = i1.AbstractC0191j.H(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th2));
                            }
                            eVar.f(H3);
                            break;
                        case 2:
                            f1.InterfaceC0120g interfaceC0120g4 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H4 = u0.AbstractC0995a.q(interfaceC0120g4.p(str5, (f1.C0121h) obj9));
                            } catch (java.lang.Throwable th3) {
                                H4 = i1.AbstractC0191j.H(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th3));
                            }
                            eVar.f(H4);
                            break;
                        case 3:
                            f1.InterfaceC0120g interfaceC0120g5 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H5 = u0.AbstractC0995a.q(interfaceC0120g5.q(str6, (f1.C0121h) obj11));
                            } catch (java.lang.Throwable th4) {
                                H5 = i1.AbstractC0191j.H(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th4));
                            }
                            eVar.f(H5);
                            break;
                        case 4:
                            f1.InterfaceC0120g interfaceC0120g6 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H6 = u0.AbstractC0995a.q(interfaceC0120g6.b(str7, (f1.C0121h) obj13));
                            } catch (java.lang.Throwable th5) {
                                H6 = i1.AbstractC0191j.H(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th5));
                            }
                            eVar.f(H6);
                            break;
                        case 5:
                            f1.InterfaceC0120g interfaceC0120g7 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H7 = u0.AbstractC0995a.q(interfaceC0120g7.c(str8, (f1.C0121h) obj15));
                            } catch (java.lang.Throwable th6) {
                                H7 = i1.AbstractC0191j.H(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th6));
                            }
                            eVar.f(H7);
                            break;
                        case 6:
                            f1.InterfaceC0120g interfaceC0120g8 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g8.a(str9, booleanValue, (f1.C0121h) obj18);
                                H8 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th7) {
                                H8 = i1.AbstractC0191j.H(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th7));
                            }
                            eVar.f(H8);
                            break;
                        case 7:
                            f1.InterfaceC0120g interfaceC0120g9 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H9 = u0.AbstractC0995a.q(interfaceC0120g9.d(str10, (f1.C0121h) obj20));
                            } catch (java.lang.Throwable th8) {
                                H9 = i1.AbstractC0191j.H(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th8));
                            }
                            eVar.f(H9);
                            break;
                        case 8:
                            f1.InterfaceC0120g interfaceC0120g10 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H10 = u0.AbstractC0995a.q(interfaceC0120g10.h(str11, (f1.C0121h) obj22));
                            } catch (java.lang.Throwable th9) {
                                H10 = i1.AbstractC0191j.H(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th9));
                            }
                            eVar.f(H10);
                            break;
                        case 9:
                            f1.InterfaceC0120g interfaceC0120g11 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g11.k(list12, (f1.C0121h) obj23);
                                H11 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th10) {
                                H11 = i1.AbstractC0191j.H(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th10));
                            }
                            eVar.f(H11);
                            break;
                        case 10:
                            f1.InterfaceC0120g interfaceC0120g12 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H12 = u0.AbstractC0995a.q(interfaceC0120g12.m(list14, (f1.C0121h) obj24));
                            } catch (java.lang.Throwable th11) {
                                H12 = i1.AbstractC0191j.H(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th11));
                            }
                            eVar.f(H12);
                            break;
                        case 11:
                            f1.InterfaceC0120g interfaceC0120g13 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H13 = u0.AbstractC0995a.q(interfaceC0120g13.l(list16, (f1.C0121h) obj25));
                            } catch (java.lang.Throwable th12) {
                                H13 = i1.AbstractC0191j.H(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th12));
                            }
                            eVar.f(H13);
                            break;
                        case 12:
                            f1.InterfaceC0120g interfaceC0120g14 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g14.j(str12, str13, (f1.C0121h) obj28);
                                H14 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th13) {
                                H14 = i1.AbstractC0191j.H(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th13));
                            }
                            eVar.f(H14);
                            break;
                        case 13:
                            f1.InterfaceC0120g interfaceC0120g15 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g15.r(str14, longValue, (f1.C0121h) obj31);
                                H15 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th14) {
                                H15 = i1.AbstractC0191j.H(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th14));
                            }
                            eVar.f(H15);
                            break;
                        default:
                            f1.InterfaceC0120g interfaceC0120g16 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g16.g(str15, doubleValue, (f1.C0121h) obj34);
                                H16 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th15) {
                                H16 = i1.AbstractC0191j.H(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th15));
                            }
                            eVar.f(H16);
                            break;
                    }
                }
            });
        } else {
            c0014n12.h(null);
        }
        F.C0014n c0014n13 = new F.C0014n(binaryMessenger, B1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", concat), a(), f2);
        if (interfaceC0120g != null) {
            final int i14 = 9;
            c0014n13.h(new a1.InterfaceC0062b() { // from class: f1.e
                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    java.util.List H2;
                    java.util.List H3;
                    java.util.List H4;
                    java.util.List H5;
                    java.util.List H6;
                    java.util.List H7;
                    java.util.List H8;
                    java.util.List H9;
                    java.util.List H10;
                    java.util.List H11;
                    java.util.List H12;
                    java.util.List H13;
                    java.util.List H14;
                    java.util.List H15;
                    java.util.List H16;
                    switch (i14) {
                        case 0:
                            f1.InterfaceC0120g interfaceC0120g2 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g2.e(str2, str3, (f1.C0121h) obj4);
                                H2 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th) {
                                H2 = i1.AbstractC0191j.H(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th));
                            }
                            eVar.f(H2);
                            break;
                        case 1:
                            f1.InterfaceC0120g interfaceC0120g3 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g3.f(str4, list3, (f1.C0121h) obj7);
                                H3 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th2) {
                                H3 = i1.AbstractC0191j.H(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th2));
                            }
                            eVar.f(H3);
                            break;
                        case 2:
                            f1.InterfaceC0120g interfaceC0120g4 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H4 = u0.AbstractC0995a.q(interfaceC0120g4.p(str5, (f1.C0121h) obj9));
                            } catch (java.lang.Throwable th3) {
                                H4 = i1.AbstractC0191j.H(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th3));
                            }
                            eVar.f(H4);
                            break;
                        case 3:
                            f1.InterfaceC0120g interfaceC0120g5 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H5 = u0.AbstractC0995a.q(interfaceC0120g5.q(str6, (f1.C0121h) obj11));
                            } catch (java.lang.Throwable th4) {
                                H5 = i1.AbstractC0191j.H(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th4));
                            }
                            eVar.f(H5);
                            break;
                        case 4:
                            f1.InterfaceC0120g interfaceC0120g6 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H6 = u0.AbstractC0995a.q(interfaceC0120g6.b(str7, (f1.C0121h) obj13));
                            } catch (java.lang.Throwable th5) {
                                H6 = i1.AbstractC0191j.H(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th5));
                            }
                            eVar.f(H6);
                            break;
                        case 5:
                            f1.InterfaceC0120g interfaceC0120g7 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H7 = u0.AbstractC0995a.q(interfaceC0120g7.c(str8, (f1.C0121h) obj15));
                            } catch (java.lang.Throwable th6) {
                                H7 = i1.AbstractC0191j.H(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th6));
                            }
                            eVar.f(H7);
                            break;
                        case 6:
                            f1.InterfaceC0120g interfaceC0120g8 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g8.a(str9, booleanValue, (f1.C0121h) obj18);
                                H8 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th7) {
                                H8 = i1.AbstractC0191j.H(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th7));
                            }
                            eVar.f(H8);
                            break;
                        case 7:
                            f1.InterfaceC0120g interfaceC0120g9 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H9 = u0.AbstractC0995a.q(interfaceC0120g9.d(str10, (f1.C0121h) obj20));
                            } catch (java.lang.Throwable th8) {
                                H9 = i1.AbstractC0191j.H(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th8));
                            }
                            eVar.f(H9);
                            break;
                        case 8:
                            f1.InterfaceC0120g interfaceC0120g10 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H10 = u0.AbstractC0995a.q(interfaceC0120g10.h(str11, (f1.C0121h) obj22));
                            } catch (java.lang.Throwable th9) {
                                H10 = i1.AbstractC0191j.H(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th9));
                            }
                            eVar.f(H10);
                            break;
                        case 9:
                            f1.InterfaceC0120g interfaceC0120g11 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g11.k(list12, (f1.C0121h) obj23);
                                H11 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th10) {
                                H11 = i1.AbstractC0191j.H(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th10));
                            }
                            eVar.f(H11);
                            break;
                        case 10:
                            f1.InterfaceC0120g interfaceC0120g12 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H12 = u0.AbstractC0995a.q(interfaceC0120g12.m(list14, (f1.C0121h) obj24));
                            } catch (java.lang.Throwable th11) {
                                H12 = i1.AbstractC0191j.H(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th11));
                            }
                            eVar.f(H12);
                            break;
                        case 11:
                            f1.InterfaceC0120g interfaceC0120g13 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H13 = u0.AbstractC0995a.q(interfaceC0120g13.l(list16, (f1.C0121h) obj25));
                            } catch (java.lang.Throwable th12) {
                                H13 = i1.AbstractC0191j.H(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th12));
                            }
                            eVar.f(H13);
                            break;
                        case 12:
                            f1.InterfaceC0120g interfaceC0120g14 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g14.j(str12, str13, (f1.C0121h) obj28);
                                H14 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th13) {
                                H14 = i1.AbstractC0191j.H(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th13));
                            }
                            eVar.f(H14);
                            break;
                        case 13:
                            f1.InterfaceC0120g interfaceC0120g15 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g15.r(str14, longValue, (f1.C0121h) obj31);
                                H15 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th14) {
                                H15 = i1.AbstractC0191j.H(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th14));
                            }
                            eVar.f(H15);
                            break;
                        default:
                            f1.InterfaceC0120g interfaceC0120g16 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g16.g(str15, doubleValue, (f1.C0121h) obj34);
                                H16 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th15) {
                                H16 = i1.AbstractC0191j.H(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th15));
                            }
                            eVar.f(H16);
                            break;
                    }
                }
            });
        } else {
            c0014n13.h(null);
        }
        F.C0014n c0014n14 = new F.C0014n(binaryMessenger, B1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", concat), a(), f2);
        if (interfaceC0120g != null) {
            final int i15 = 10;
            c0014n14.h(new a1.InterfaceC0062b() { // from class: f1.e
                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    java.util.List H2;
                    java.util.List H3;
                    java.util.List H4;
                    java.util.List H5;
                    java.util.List H6;
                    java.util.List H7;
                    java.util.List H8;
                    java.util.List H9;
                    java.util.List H10;
                    java.util.List H11;
                    java.util.List H12;
                    java.util.List H13;
                    java.util.List H14;
                    java.util.List H15;
                    java.util.List H16;
                    switch (i15) {
                        case 0:
                            f1.InterfaceC0120g interfaceC0120g2 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g2.e(str2, str3, (f1.C0121h) obj4);
                                H2 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th) {
                                H2 = i1.AbstractC0191j.H(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th));
                            }
                            eVar.f(H2);
                            break;
                        case 1:
                            f1.InterfaceC0120g interfaceC0120g3 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g3.f(str4, list3, (f1.C0121h) obj7);
                                H3 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th2) {
                                H3 = i1.AbstractC0191j.H(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th2));
                            }
                            eVar.f(H3);
                            break;
                        case 2:
                            f1.InterfaceC0120g interfaceC0120g4 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H4 = u0.AbstractC0995a.q(interfaceC0120g4.p(str5, (f1.C0121h) obj9));
                            } catch (java.lang.Throwable th3) {
                                H4 = i1.AbstractC0191j.H(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th3));
                            }
                            eVar.f(H4);
                            break;
                        case 3:
                            f1.InterfaceC0120g interfaceC0120g5 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H5 = u0.AbstractC0995a.q(interfaceC0120g5.q(str6, (f1.C0121h) obj11));
                            } catch (java.lang.Throwable th4) {
                                H5 = i1.AbstractC0191j.H(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th4));
                            }
                            eVar.f(H5);
                            break;
                        case 4:
                            f1.InterfaceC0120g interfaceC0120g6 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H6 = u0.AbstractC0995a.q(interfaceC0120g6.b(str7, (f1.C0121h) obj13));
                            } catch (java.lang.Throwable th5) {
                                H6 = i1.AbstractC0191j.H(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th5));
                            }
                            eVar.f(H6);
                            break;
                        case 5:
                            f1.InterfaceC0120g interfaceC0120g7 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H7 = u0.AbstractC0995a.q(interfaceC0120g7.c(str8, (f1.C0121h) obj15));
                            } catch (java.lang.Throwable th6) {
                                H7 = i1.AbstractC0191j.H(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th6));
                            }
                            eVar.f(H7);
                            break;
                        case 6:
                            f1.InterfaceC0120g interfaceC0120g8 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g8.a(str9, booleanValue, (f1.C0121h) obj18);
                                H8 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th7) {
                                H8 = i1.AbstractC0191j.H(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th7));
                            }
                            eVar.f(H8);
                            break;
                        case 7:
                            f1.InterfaceC0120g interfaceC0120g9 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H9 = u0.AbstractC0995a.q(interfaceC0120g9.d(str10, (f1.C0121h) obj20));
                            } catch (java.lang.Throwable th8) {
                                H9 = i1.AbstractC0191j.H(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th8));
                            }
                            eVar.f(H9);
                            break;
                        case 8:
                            f1.InterfaceC0120g interfaceC0120g10 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H10 = u0.AbstractC0995a.q(interfaceC0120g10.h(str11, (f1.C0121h) obj22));
                            } catch (java.lang.Throwable th9) {
                                H10 = i1.AbstractC0191j.H(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th9));
                            }
                            eVar.f(H10);
                            break;
                        case 9:
                            f1.InterfaceC0120g interfaceC0120g11 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g11.k(list12, (f1.C0121h) obj23);
                                H11 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th10) {
                                H11 = i1.AbstractC0191j.H(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th10));
                            }
                            eVar.f(H11);
                            break;
                        case 10:
                            f1.InterfaceC0120g interfaceC0120g12 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H12 = u0.AbstractC0995a.q(interfaceC0120g12.m(list14, (f1.C0121h) obj24));
                            } catch (java.lang.Throwable th11) {
                                H12 = i1.AbstractC0191j.H(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th11));
                            }
                            eVar.f(H12);
                            break;
                        case 11:
                            f1.InterfaceC0120g interfaceC0120g13 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H13 = u0.AbstractC0995a.q(interfaceC0120g13.l(list16, (f1.C0121h) obj25));
                            } catch (java.lang.Throwable th12) {
                                H13 = i1.AbstractC0191j.H(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th12));
                            }
                            eVar.f(H13);
                            break;
                        case 12:
                            f1.InterfaceC0120g interfaceC0120g14 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g14.j(str12, str13, (f1.C0121h) obj28);
                                H14 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th13) {
                                H14 = i1.AbstractC0191j.H(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th13));
                            }
                            eVar.f(H14);
                            break;
                        case 13:
                            f1.InterfaceC0120g interfaceC0120g15 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g15.r(str14, longValue, (f1.C0121h) obj31);
                                H15 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th14) {
                                H15 = i1.AbstractC0191j.H(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th14));
                            }
                            eVar.f(H15);
                            break;
                        default:
                            f1.InterfaceC0120g interfaceC0120g16 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g16.g(str15, doubleValue, (f1.C0121h) obj34);
                                H16 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th15) {
                                H16 = i1.AbstractC0191j.H(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th15));
                            }
                            eVar.f(H16);
                            break;
                    }
                }
            });
        } else {
            c0014n14.h(null);
        }
        F.C0014n c0014n15 = new F.C0014n(binaryMessenger, B1.a.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", concat), a(), f2);
        if (interfaceC0120g == null) {
            c0014n15.h(null);
        } else {
            final int i16 = 11;
            c0014n15.h(new a1.InterfaceC0062b() { // from class: f1.e
                @Override // a1.InterfaceC0062b
                public final void g(java.lang.Object obj, x0.e eVar) {
                    java.util.List H2;
                    java.util.List H3;
                    java.util.List H4;
                    java.util.List H5;
                    java.util.List H6;
                    java.util.List H7;
                    java.util.List H8;
                    java.util.List H9;
                    java.util.List H10;
                    java.util.List H11;
                    java.util.List H12;
                    java.util.List H13;
                    java.util.List H14;
                    java.util.List H15;
                    java.util.List H16;
                    switch (i16) {
                        case 0:
                            f1.InterfaceC0120g interfaceC0120g2 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list = (java.util.List) obj;
                            java.lang.Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str2 = (java.lang.String) obj2;
                            java.lang.Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str3 = (java.lang.String) obj3;
                            java.lang.Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g2.e(str2, str3, (f1.C0121h) obj4);
                                H2 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th) {
                                H2 = i1.AbstractC0191j.H(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th));
                            }
                            eVar.f(H2);
                            break;
                        case 1:
                            f1.InterfaceC0120g interfaceC0120g3 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list2 = (java.util.List) obj;
                            java.lang.Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str4 = (java.lang.String) obj5;
                            java.lang.Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            java.util.List list3 = (java.util.List) obj6;
                            java.lang.Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g3.f(str4, list3, (f1.C0121h) obj7);
                                H3 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th2) {
                                H3 = i1.AbstractC0191j.H(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th2));
                            }
                            eVar.f(H3);
                            break;
                        case 2:
                            f1.InterfaceC0120g interfaceC0120g4 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list4 = (java.util.List) obj;
                            java.lang.Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str5 = (java.lang.String) obj8;
                            java.lang.Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H4 = u0.AbstractC0995a.q(interfaceC0120g4.p(str5, (f1.C0121h) obj9));
                            } catch (java.lang.Throwable th3) {
                                H4 = i1.AbstractC0191j.H(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th3));
                            }
                            eVar.f(H4);
                            break;
                        case 3:
                            f1.InterfaceC0120g interfaceC0120g5 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list5 = (java.util.List) obj;
                            java.lang.Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str6 = (java.lang.String) obj10;
                            java.lang.Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H5 = u0.AbstractC0995a.q(interfaceC0120g5.q(str6, (f1.C0121h) obj11));
                            } catch (java.lang.Throwable th4) {
                                H5 = i1.AbstractC0191j.H(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th4));
                            }
                            eVar.f(H5);
                            break;
                        case 4:
                            f1.InterfaceC0120g interfaceC0120g6 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list6 = (java.util.List) obj;
                            java.lang.Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str7 = (java.lang.String) obj12;
                            java.lang.Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H6 = u0.AbstractC0995a.q(interfaceC0120g6.b(str7, (f1.C0121h) obj13));
                            } catch (java.lang.Throwable th5) {
                                H6 = i1.AbstractC0191j.H(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th5));
                            }
                            eVar.f(H6);
                            break;
                        case 5:
                            f1.InterfaceC0120g interfaceC0120g7 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list7 = (java.util.List) obj;
                            java.lang.Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str8 = (java.lang.String) obj14;
                            java.lang.Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H7 = u0.AbstractC0995a.q(interfaceC0120g7.c(str8, (f1.C0121h) obj15));
                            } catch (java.lang.Throwable th6) {
                                H7 = i1.AbstractC0191j.H(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th6));
                            }
                            eVar.f(H7);
                            break;
                        case 6:
                            f1.InterfaceC0120g interfaceC0120g8 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list8 = (java.util.List) obj;
                            java.lang.Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str9 = (java.lang.String) obj16;
                            java.lang.Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((java.lang.Boolean) obj17).booleanValue();
                            java.lang.Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g8.a(str9, booleanValue, (f1.C0121h) obj18);
                                H8 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th7) {
                                H8 = i1.AbstractC0191j.H(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th7));
                            }
                            eVar.f(H8);
                            break;
                        case 7:
                            f1.InterfaceC0120g interfaceC0120g9 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list9 = (java.util.List) obj;
                            java.lang.Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str10 = (java.lang.String) obj19;
                            java.lang.Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H9 = u0.AbstractC0995a.q(interfaceC0120g9.d(str10, (f1.C0121h) obj20));
                            } catch (java.lang.Throwable th8) {
                                H9 = i1.AbstractC0191j.H(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th8));
                            }
                            eVar.f(H9);
                            break;
                        case 8:
                            f1.InterfaceC0120g interfaceC0120g10 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list10 = (java.util.List) obj;
                            java.lang.Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str11 = (java.lang.String) obj21;
                            java.lang.Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H10 = u0.AbstractC0995a.q(interfaceC0120g10.h(str11, (f1.C0121h) obj22));
                            } catch (java.lang.Throwable th9) {
                                H10 = i1.AbstractC0191j.H(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th9));
                            }
                            eVar.f(H10);
                            break;
                        case 9:
                            f1.InterfaceC0120g interfaceC0120g11 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list11 = (java.util.List) obj;
                            java.util.List list12 = (java.util.List) list11.get(0);
                            java.lang.Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g11.k(list12, (f1.C0121h) obj23);
                                H11 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th10) {
                                H11 = i1.AbstractC0191j.H(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th10));
                            }
                            eVar.f(H11);
                            break;
                        case 10:
                            f1.InterfaceC0120g interfaceC0120g12 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list13 = (java.util.List) obj;
                            java.util.List list14 = (java.util.List) list13.get(0);
                            java.lang.Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H12 = u0.AbstractC0995a.q(interfaceC0120g12.m(list14, (f1.C0121h) obj24));
                            } catch (java.lang.Throwable th11) {
                                H12 = i1.AbstractC0191j.H(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th11));
                            }
                            eVar.f(H12);
                            break;
                        case 11:
                            f1.InterfaceC0120g interfaceC0120g13 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list15 = (java.util.List) obj;
                            java.util.List list16 = (java.util.List) list15.get(0);
                            java.lang.Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                H13 = u0.AbstractC0995a.q(interfaceC0120g13.l(list16, (f1.C0121h) obj25));
                            } catch (java.lang.Throwable th12) {
                                H13 = i1.AbstractC0191j.H(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th12));
                            }
                            eVar.f(H13);
                            break;
                        case 12:
                            f1.InterfaceC0120g interfaceC0120g14 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list17 = (java.util.List) obj;
                            java.lang.Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str12 = (java.lang.String) obj26;
                            java.lang.Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str13 = (java.lang.String) obj27;
                            java.lang.Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g14.j(str12, str13, (f1.C0121h) obj28);
                                H14 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th13) {
                                H14 = i1.AbstractC0191j.H(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th13));
                            }
                            eVar.f(H14);
                            break;
                        case 13:
                            f1.InterfaceC0120g interfaceC0120g15 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list18 = (java.util.List) obj;
                            java.lang.Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str14 = (java.lang.String) obj29;
                            java.lang.Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((java.lang.Long) obj30).longValue();
                            java.lang.Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g15.r(str14, longValue, (f1.C0121h) obj31);
                                H15 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th14) {
                                H15 = i1.AbstractC0191j.H(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th14));
                            }
                            eVar.f(H15);
                            break;
                        default:
                            f1.InterfaceC0120g interfaceC0120g16 = interfaceC0120g;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            java.util.List list19 = (java.util.List) obj;
                            java.lang.Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            java.lang.String str15 = (java.lang.String) obj32;
                            java.lang.Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((java.lang.Double) obj33).doubleValue();
                            java.lang.Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0120g16.g(str15, doubleValue, (f1.C0121h) obj34);
                                H16 = u0.AbstractC0995a.q(null);
                            } catch (java.lang.Throwable th15) {
                                H16 = i1.AbstractC0191j.H(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th15));
                            }
                            eVar.f(H16);
                            break;
                    }
                }
            });
        }
    }
}
