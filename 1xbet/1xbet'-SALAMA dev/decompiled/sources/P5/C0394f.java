package P5;

import B4.V;
import java.util.List;
import p155w1.F0;
import p155w1.V0;

/* JADX INFO: renamed from: P5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0394f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0394f f5649a = new C0394f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p044f6.g f5650b = Y4.D.C(new C0392d(0));

    public static A5.n a() {
        return (A5.n) f5650b.getValue();
    }

    public static void b(A5.f fVar, final InterfaceC0395g interfaceC0395g, String str) {
        t6.h.e(fVar, "binaryMessenger");
        String strConcat = str.length() > 0 ? ".".concat(str) : "";
        V vE = fVar.e();
        F0 f7 = new F0(fVar, p155w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", strConcat), a(), vE, 1);
        if (interfaceC0395g != null) {
            final int i7 = 6;
            f7.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    List listC;
                    List listC2;
                    List listC3;
                    List listC4;
                    List listC5;
                    List listC6;
                    List listC7;
                    List listC8;
                    List listC9;
                    List listC10;
                    List listC11;
                    List listC12;
                    List listC13;
                    List listC14;
                    List listC15;
                    switch (i7) {
                        case 0:
                            InterfaceC0395g interfaceC0395g2 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g2.B(str2, str3, (C0396h) obj4);
                                listC = Y4.D.D(null);
                            } catch (Throwable th) {
                                listC = p003a.a.c(th);
                            }
                            v6.f(listC);
                            break;
                        case 1:
                            InterfaceC0395g interfaceC0395g3 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            t6.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g3.O(str4, list3, (C0396h) obj7);
                                listC2 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listC2 = p003a.a.c(th2);
                            }
                            v6.f(listC2);
                            break;
                        case 2:
                            InterfaceC0395g interfaceC0395g4 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC3 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                listC3 = p003a.a.c(th3);
                            }
                            v6.f(listC3);
                            break;
                        case 3:
                            InterfaceC0395g interfaceC0395g5 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC4 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                listC4 = p003a.a.c(th4);
                            }
                            v6.f(listC4);
                            break;
                        case 4:
                            InterfaceC0395g interfaceC0395g6 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC5 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                listC5 = p003a.a.c(th5);
                            }
                            v6.f(listC5);
                            break;
                        case 5:
                            InterfaceC0395g interfaceC0395g7 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC6 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                listC6 = p003a.a.c(th6);
                            }
                            v6.f(listC6);
                            break;
                        case 6:
                            InterfaceC0395g interfaceC0395g8 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, zBooleanValue, (C0396h) obj18);
                                listC7 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listC7 = p003a.a.c(th7);
                            }
                            v6.f(listC7);
                            break;
                        case 7:
                            InterfaceC0395g interfaceC0395g9 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            t6.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC8 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                listC8 = p003a.a.c(th8);
                            }
                            v6.f(listC8);
                            break;
                        case 8:
                            InterfaceC0395g interfaceC0395g10 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            t6.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC9 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                listC9 = p003a.a.c(th9);
                            }
                            v6.f(listC9);
                            break;
                        case 9:
                            InterfaceC0395g interfaceC0395g11 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g11.h(list12, (C0396h) obj23);
                                listC10 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listC10 = p003a.a.c(th10);
                            }
                            v6.f(listC10);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC11 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                listC11 = p003a.a.c(th11);
                            }
                            v6.f(listC11);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC12 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                listC12 = p003a.a.c(th12);
                            }
                            v6.f(listC12);
                            break;
                        case 12:
                            InterfaceC0395g interfaceC0395g14 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            t6.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g14.j(str12, str13, (C0396h) obj28);
                                listC13 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listC13 = p003a.a.c(th13);
                            }
                            v6.f(listC13);
                            break;
                        case 13:
                            InterfaceC0395g interfaceC0395g15 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, jLongValue, (C0396h) obj31);
                                listC14 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                listC14 = p003a.a.c(th14);
                            }
                            v6.f(listC14);
                            break;
                        default:
                            InterfaceC0395g interfaceC0395g16 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            t6.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, dDoubleValue, (C0396h) obj34);
                                listC15 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listC15 = p003a.a.c(th15);
                            }
                            v6.f(listC15);
                            break;
                    }
                }
            });
        } else {
            f7.M(null);
        }
        F0 f8 = new F0(fVar, p155w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", strConcat), a(), vE, 1);
        if (interfaceC0395g != null) {
            final int i8 = 12;
            f8.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    List listC;
                    List listC2;
                    List listC3;
                    List listC4;
                    List listC5;
                    List listC6;
                    List listC7;
                    List listC8;
                    List listC9;
                    List listC10;
                    List listC11;
                    List listC12;
                    List listC13;
                    List listC14;
                    List listC15;
                    switch (i8) {
                        case 0:
                            InterfaceC0395g interfaceC0395g2 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g2.B(str2, str3, (C0396h) obj4);
                                listC = Y4.D.D(null);
                            } catch (Throwable th) {
                                listC = p003a.a.c(th);
                            }
                            v6.f(listC);
                            break;
                        case 1:
                            InterfaceC0395g interfaceC0395g3 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            t6.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g3.O(str4, list3, (C0396h) obj7);
                                listC2 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listC2 = p003a.a.c(th2);
                            }
                            v6.f(listC2);
                            break;
                        case 2:
                            InterfaceC0395g interfaceC0395g4 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC3 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                listC3 = p003a.a.c(th3);
                            }
                            v6.f(listC3);
                            break;
                        case 3:
                            InterfaceC0395g interfaceC0395g5 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC4 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                listC4 = p003a.a.c(th4);
                            }
                            v6.f(listC4);
                            break;
                        case 4:
                            InterfaceC0395g interfaceC0395g6 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC5 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                listC5 = p003a.a.c(th5);
                            }
                            v6.f(listC5);
                            break;
                        case 5:
                            InterfaceC0395g interfaceC0395g7 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC6 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                listC6 = p003a.a.c(th6);
                            }
                            v6.f(listC6);
                            break;
                        case 6:
                            InterfaceC0395g interfaceC0395g8 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, zBooleanValue, (C0396h) obj18);
                                listC7 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listC7 = p003a.a.c(th7);
                            }
                            v6.f(listC7);
                            break;
                        case 7:
                            InterfaceC0395g interfaceC0395g9 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            t6.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC8 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                listC8 = p003a.a.c(th8);
                            }
                            v6.f(listC8);
                            break;
                        case 8:
                            InterfaceC0395g interfaceC0395g10 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            t6.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC9 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                listC9 = p003a.a.c(th9);
                            }
                            v6.f(listC9);
                            break;
                        case 9:
                            InterfaceC0395g interfaceC0395g11 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g11.h(list12, (C0396h) obj23);
                                listC10 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listC10 = p003a.a.c(th10);
                            }
                            v6.f(listC10);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC11 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                listC11 = p003a.a.c(th11);
                            }
                            v6.f(listC11);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC12 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                listC12 = p003a.a.c(th12);
                            }
                            v6.f(listC12);
                            break;
                        case 12:
                            InterfaceC0395g interfaceC0395g14 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            t6.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g14.j(str12, str13, (C0396h) obj28);
                                listC13 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listC13 = p003a.a.c(th13);
                            }
                            v6.f(listC13);
                            break;
                        case 13:
                            InterfaceC0395g interfaceC0395g15 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, jLongValue, (C0396h) obj31);
                                listC14 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                listC14 = p003a.a.c(th14);
                            }
                            v6.f(listC14);
                            break;
                        default:
                            InterfaceC0395g interfaceC0395g16 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            t6.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, dDoubleValue, (C0396h) obj34);
                                listC15 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listC15 = p003a.a.c(th15);
                            }
                            v6.f(listC15);
                            break;
                    }
                }
            });
        } else {
            f8.M(null);
        }
        F0 f9 = new F0(fVar, p155w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", strConcat), a(), vE, 1);
        if (interfaceC0395g != null) {
            final int i9 = 13;
            f9.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    List listC;
                    List listC2;
                    List listC3;
                    List listC4;
                    List listC5;
                    List listC6;
                    List listC7;
                    List listC8;
                    List listC9;
                    List listC10;
                    List listC11;
                    List listC12;
                    List listC13;
                    List listC14;
                    List listC15;
                    switch (i9) {
                        case 0:
                            InterfaceC0395g interfaceC0395g2 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g2.B(str2, str3, (C0396h) obj4);
                                listC = Y4.D.D(null);
                            } catch (Throwable th) {
                                listC = p003a.a.c(th);
                            }
                            v6.f(listC);
                            break;
                        case 1:
                            InterfaceC0395g interfaceC0395g3 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            t6.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g3.O(str4, list3, (C0396h) obj7);
                                listC2 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listC2 = p003a.a.c(th2);
                            }
                            v6.f(listC2);
                            break;
                        case 2:
                            InterfaceC0395g interfaceC0395g4 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC3 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                listC3 = p003a.a.c(th3);
                            }
                            v6.f(listC3);
                            break;
                        case 3:
                            InterfaceC0395g interfaceC0395g5 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC4 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                listC4 = p003a.a.c(th4);
                            }
                            v6.f(listC4);
                            break;
                        case 4:
                            InterfaceC0395g interfaceC0395g6 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC5 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                listC5 = p003a.a.c(th5);
                            }
                            v6.f(listC5);
                            break;
                        case 5:
                            InterfaceC0395g interfaceC0395g7 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC6 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                listC6 = p003a.a.c(th6);
                            }
                            v6.f(listC6);
                            break;
                        case 6:
                            InterfaceC0395g interfaceC0395g8 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, zBooleanValue, (C0396h) obj18);
                                listC7 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listC7 = p003a.a.c(th7);
                            }
                            v6.f(listC7);
                            break;
                        case 7:
                            InterfaceC0395g interfaceC0395g9 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            t6.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC8 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                listC8 = p003a.a.c(th8);
                            }
                            v6.f(listC8);
                            break;
                        case 8:
                            InterfaceC0395g interfaceC0395g10 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            t6.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC9 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                listC9 = p003a.a.c(th9);
                            }
                            v6.f(listC9);
                            break;
                        case 9:
                            InterfaceC0395g interfaceC0395g11 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g11.h(list12, (C0396h) obj23);
                                listC10 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listC10 = p003a.a.c(th10);
                            }
                            v6.f(listC10);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC11 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                listC11 = p003a.a.c(th11);
                            }
                            v6.f(listC11);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC12 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                listC12 = p003a.a.c(th12);
                            }
                            v6.f(listC12);
                            break;
                        case 12:
                            InterfaceC0395g interfaceC0395g14 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            t6.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g14.j(str12, str13, (C0396h) obj28);
                                listC13 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listC13 = p003a.a.c(th13);
                            }
                            v6.f(listC13);
                            break;
                        case 13:
                            InterfaceC0395g interfaceC0395g15 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, jLongValue, (C0396h) obj31);
                                listC14 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                listC14 = p003a.a.c(th14);
                            }
                            v6.f(listC14);
                            break;
                        default:
                            InterfaceC0395g interfaceC0395g16 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            t6.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, dDoubleValue, (C0396h) obj34);
                                listC15 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listC15 = p003a.a.c(th15);
                            }
                            v6.f(listC15);
                            break;
                    }
                }
            });
        } else {
            f9.M(null);
        }
        F0 f10 = new F0(fVar, p155w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", strConcat), a(), vE, 1);
        if (interfaceC0395g != null) {
            final int i10 = 14;
            f10.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    List listC;
                    List listC2;
                    List listC3;
                    List listC4;
                    List listC5;
                    List listC6;
                    List listC7;
                    List listC8;
                    List listC9;
                    List listC10;
                    List listC11;
                    List listC12;
                    List listC13;
                    List listC14;
                    List listC15;
                    switch (i10) {
                        case 0:
                            InterfaceC0395g interfaceC0395g2 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g2.B(str2, str3, (C0396h) obj4);
                                listC = Y4.D.D(null);
                            } catch (Throwable th) {
                                listC = p003a.a.c(th);
                            }
                            v6.f(listC);
                            break;
                        case 1:
                            InterfaceC0395g interfaceC0395g3 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            t6.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g3.O(str4, list3, (C0396h) obj7);
                                listC2 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listC2 = p003a.a.c(th2);
                            }
                            v6.f(listC2);
                            break;
                        case 2:
                            InterfaceC0395g interfaceC0395g4 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC3 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                listC3 = p003a.a.c(th3);
                            }
                            v6.f(listC3);
                            break;
                        case 3:
                            InterfaceC0395g interfaceC0395g5 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC4 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                listC4 = p003a.a.c(th4);
                            }
                            v6.f(listC4);
                            break;
                        case 4:
                            InterfaceC0395g interfaceC0395g6 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC5 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                listC5 = p003a.a.c(th5);
                            }
                            v6.f(listC5);
                            break;
                        case 5:
                            InterfaceC0395g interfaceC0395g7 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC6 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                listC6 = p003a.a.c(th6);
                            }
                            v6.f(listC6);
                            break;
                        case 6:
                            InterfaceC0395g interfaceC0395g8 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, zBooleanValue, (C0396h) obj18);
                                listC7 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listC7 = p003a.a.c(th7);
                            }
                            v6.f(listC7);
                            break;
                        case 7:
                            InterfaceC0395g interfaceC0395g9 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            t6.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC8 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                listC8 = p003a.a.c(th8);
                            }
                            v6.f(listC8);
                            break;
                        case 8:
                            InterfaceC0395g interfaceC0395g10 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            t6.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC9 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                listC9 = p003a.a.c(th9);
                            }
                            v6.f(listC9);
                            break;
                        case 9:
                            InterfaceC0395g interfaceC0395g11 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g11.h(list12, (C0396h) obj23);
                                listC10 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listC10 = p003a.a.c(th10);
                            }
                            v6.f(listC10);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC11 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                listC11 = p003a.a.c(th11);
                            }
                            v6.f(listC11);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC12 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                listC12 = p003a.a.c(th12);
                            }
                            v6.f(listC12);
                            break;
                        case 12:
                            InterfaceC0395g interfaceC0395g14 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            t6.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g14.j(str12, str13, (C0396h) obj28);
                                listC13 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listC13 = p003a.a.c(th13);
                            }
                            v6.f(listC13);
                            break;
                        case 13:
                            InterfaceC0395g interfaceC0395g15 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, jLongValue, (C0396h) obj31);
                                listC14 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                listC14 = p003a.a.c(th14);
                            }
                            v6.f(listC14);
                            break;
                        default:
                            InterfaceC0395g interfaceC0395g16 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            t6.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, dDoubleValue, (C0396h) obj34);
                                listC15 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listC15 = p003a.a.c(th15);
                            }
                            v6.f(listC15);
                            break;
                    }
                }
            });
        } else {
            f10.M(null);
        }
        F0 f11 = new F0(fVar, p155w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", strConcat), a(), vE, 1);
        if (interfaceC0395g != null) {
            final int i11 = 0;
            f11.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    List listC;
                    List listC2;
                    List listC3;
                    List listC4;
                    List listC5;
                    List listC6;
                    List listC7;
                    List listC8;
                    List listC9;
                    List listC10;
                    List listC11;
                    List listC12;
                    List listC13;
                    List listC14;
                    List listC15;
                    switch (i11) {
                        case 0:
                            InterfaceC0395g interfaceC0395g2 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g2.B(str2, str3, (C0396h) obj4);
                                listC = Y4.D.D(null);
                            } catch (Throwable th) {
                                listC = p003a.a.c(th);
                            }
                            v6.f(listC);
                            break;
                        case 1:
                            InterfaceC0395g interfaceC0395g3 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            t6.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g3.O(str4, list3, (C0396h) obj7);
                                listC2 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listC2 = p003a.a.c(th2);
                            }
                            v6.f(listC2);
                            break;
                        case 2:
                            InterfaceC0395g interfaceC0395g4 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC3 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                listC3 = p003a.a.c(th3);
                            }
                            v6.f(listC3);
                            break;
                        case 3:
                            InterfaceC0395g interfaceC0395g5 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC4 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                listC4 = p003a.a.c(th4);
                            }
                            v6.f(listC4);
                            break;
                        case 4:
                            InterfaceC0395g interfaceC0395g6 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC5 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                listC5 = p003a.a.c(th5);
                            }
                            v6.f(listC5);
                            break;
                        case 5:
                            InterfaceC0395g interfaceC0395g7 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC6 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                listC6 = p003a.a.c(th6);
                            }
                            v6.f(listC6);
                            break;
                        case 6:
                            InterfaceC0395g interfaceC0395g8 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, zBooleanValue, (C0396h) obj18);
                                listC7 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listC7 = p003a.a.c(th7);
                            }
                            v6.f(listC7);
                            break;
                        case 7:
                            InterfaceC0395g interfaceC0395g9 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            t6.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC8 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                listC8 = p003a.a.c(th8);
                            }
                            v6.f(listC8);
                            break;
                        case 8:
                            InterfaceC0395g interfaceC0395g10 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            t6.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC9 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                listC9 = p003a.a.c(th9);
                            }
                            v6.f(listC9);
                            break;
                        case 9:
                            InterfaceC0395g interfaceC0395g11 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g11.h(list12, (C0396h) obj23);
                                listC10 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listC10 = p003a.a.c(th10);
                            }
                            v6.f(listC10);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC11 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                listC11 = p003a.a.c(th11);
                            }
                            v6.f(listC11);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC12 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                listC12 = p003a.a.c(th12);
                            }
                            v6.f(listC12);
                            break;
                        case 12:
                            InterfaceC0395g interfaceC0395g14 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            t6.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g14.j(str12, str13, (C0396h) obj28);
                                listC13 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listC13 = p003a.a.c(th13);
                            }
                            v6.f(listC13);
                            break;
                        case 13:
                            InterfaceC0395g interfaceC0395g15 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, jLongValue, (C0396h) obj31);
                                listC14 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                listC14 = p003a.a.c(th14);
                            }
                            v6.f(listC14);
                            break;
                        default:
                            InterfaceC0395g interfaceC0395g16 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            t6.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, dDoubleValue, (C0396h) obj34);
                                listC15 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listC15 = p003a.a.c(th15);
                            }
                            v6.f(listC15);
                            break;
                    }
                }
            });
        } else {
            f11.M(null);
        }
        F0 f12 = new F0(fVar, p155w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", strConcat), a(), vE, 1);
        if (interfaceC0395g != null) {
            final int i12 = 1;
            f12.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    List listC;
                    List listC2;
                    List listC3;
                    List listC4;
                    List listC5;
                    List listC6;
                    List listC7;
                    List listC8;
                    List listC9;
                    List listC10;
                    List listC11;
                    List listC12;
                    List listC13;
                    List listC14;
                    List listC15;
                    switch (i12) {
                        case 0:
                            InterfaceC0395g interfaceC0395g2 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g2.B(str2, str3, (C0396h) obj4);
                                listC = Y4.D.D(null);
                            } catch (Throwable th) {
                                listC = p003a.a.c(th);
                            }
                            v6.f(listC);
                            break;
                        case 1:
                            InterfaceC0395g interfaceC0395g3 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            t6.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g3.O(str4, list3, (C0396h) obj7);
                                listC2 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listC2 = p003a.a.c(th2);
                            }
                            v6.f(listC2);
                            break;
                        case 2:
                            InterfaceC0395g interfaceC0395g4 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC3 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                listC3 = p003a.a.c(th3);
                            }
                            v6.f(listC3);
                            break;
                        case 3:
                            InterfaceC0395g interfaceC0395g5 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC4 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                listC4 = p003a.a.c(th4);
                            }
                            v6.f(listC4);
                            break;
                        case 4:
                            InterfaceC0395g interfaceC0395g6 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC5 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                listC5 = p003a.a.c(th5);
                            }
                            v6.f(listC5);
                            break;
                        case 5:
                            InterfaceC0395g interfaceC0395g7 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC6 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                listC6 = p003a.a.c(th6);
                            }
                            v6.f(listC6);
                            break;
                        case 6:
                            InterfaceC0395g interfaceC0395g8 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, zBooleanValue, (C0396h) obj18);
                                listC7 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listC7 = p003a.a.c(th7);
                            }
                            v6.f(listC7);
                            break;
                        case 7:
                            InterfaceC0395g interfaceC0395g9 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            t6.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC8 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                listC8 = p003a.a.c(th8);
                            }
                            v6.f(listC8);
                            break;
                        case 8:
                            InterfaceC0395g interfaceC0395g10 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            t6.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC9 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                listC9 = p003a.a.c(th9);
                            }
                            v6.f(listC9);
                            break;
                        case 9:
                            InterfaceC0395g interfaceC0395g11 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g11.h(list12, (C0396h) obj23);
                                listC10 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listC10 = p003a.a.c(th10);
                            }
                            v6.f(listC10);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC11 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                listC11 = p003a.a.c(th11);
                            }
                            v6.f(listC11);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC12 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                listC12 = p003a.a.c(th12);
                            }
                            v6.f(listC12);
                            break;
                        case 12:
                            InterfaceC0395g interfaceC0395g14 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            t6.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g14.j(str12, str13, (C0396h) obj28);
                                listC13 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listC13 = p003a.a.c(th13);
                            }
                            v6.f(listC13);
                            break;
                        case 13:
                            InterfaceC0395g interfaceC0395g15 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, jLongValue, (C0396h) obj31);
                                listC14 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                listC14 = p003a.a.c(th14);
                            }
                            v6.f(listC14);
                            break;
                        default:
                            InterfaceC0395g interfaceC0395g16 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            t6.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, dDoubleValue, (C0396h) obj34);
                                listC15 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listC15 = p003a.a.c(th15);
                            }
                            v6.f(listC15);
                            break;
                    }
                }
            });
        } else {
            f12.M(null);
        }
        F0 f13 = new F0(fVar, p155w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", strConcat), a(), vE, 1);
        if (interfaceC0395g != null) {
            final int i13 = 2;
            f13.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    List listC;
                    List listC2;
                    List listC3;
                    List listC4;
                    List listC5;
                    List listC6;
                    List listC7;
                    List listC8;
                    List listC9;
                    List listC10;
                    List listC11;
                    List listC12;
                    List listC13;
                    List listC14;
                    List listC15;
                    switch (i13) {
                        case 0:
                            InterfaceC0395g interfaceC0395g2 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g2.B(str2, str3, (C0396h) obj4);
                                listC = Y4.D.D(null);
                            } catch (Throwable th) {
                                listC = p003a.a.c(th);
                            }
                            v6.f(listC);
                            break;
                        case 1:
                            InterfaceC0395g interfaceC0395g3 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            t6.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g3.O(str4, list3, (C0396h) obj7);
                                listC2 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listC2 = p003a.a.c(th2);
                            }
                            v6.f(listC2);
                            break;
                        case 2:
                            InterfaceC0395g interfaceC0395g4 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC3 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                listC3 = p003a.a.c(th3);
                            }
                            v6.f(listC3);
                            break;
                        case 3:
                            InterfaceC0395g interfaceC0395g5 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC4 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                listC4 = p003a.a.c(th4);
                            }
                            v6.f(listC4);
                            break;
                        case 4:
                            InterfaceC0395g interfaceC0395g6 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC5 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                listC5 = p003a.a.c(th5);
                            }
                            v6.f(listC5);
                            break;
                        case 5:
                            InterfaceC0395g interfaceC0395g7 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC6 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                listC6 = p003a.a.c(th6);
                            }
                            v6.f(listC6);
                            break;
                        case 6:
                            InterfaceC0395g interfaceC0395g8 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, zBooleanValue, (C0396h) obj18);
                                listC7 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listC7 = p003a.a.c(th7);
                            }
                            v6.f(listC7);
                            break;
                        case 7:
                            InterfaceC0395g interfaceC0395g9 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            t6.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC8 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                listC8 = p003a.a.c(th8);
                            }
                            v6.f(listC8);
                            break;
                        case 8:
                            InterfaceC0395g interfaceC0395g10 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            t6.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC9 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                listC9 = p003a.a.c(th9);
                            }
                            v6.f(listC9);
                            break;
                        case 9:
                            InterfaceC0395g interfaceC0395g11 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g11.h(list12, (C0396h) obj23);
                                listC10 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listC10 = p003a.a.c(th10);
                            }
                            v6.f(listC10);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC11 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                listC11 = p003a.a.c(th11);
                            }
                            v6.f(listC11);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC12 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                listC12 = p003a.a.c(th12);
                            }
                            v6.f(listC12);
                            break;
                        case 12:
                            InterfaceC0395g interfaceC0395g14 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            t6.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g14.j(str12, str13, (C0396h) obj28);
                                listC13 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listC13 = p003a.a.c(th13);
                            }
                            v6.f(listC13);
                            break;
                        case 13:
                            InterfaceC0395g interfaceC0395g15 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, jLongValue, (C0396h) obj31);
                                listC14 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                listC14 = p003a.a.c(th14);
                            }
                            v6.f(listC14);
                            break;
                        default:
                            InterfaceC0395g interfaceC0395g16 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            t6.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, dDoubleValue, (C0396h) obj34);
                                listC15 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listC15 = p003a.a.c(th15);
                            }
                            v6.f(listC15);
                            break;
                    }
                }
            });
        } else {
            f13.M(null);
        }
        F0 f14 = new F0(fVar, p155w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", strConcat), a(), vE, 1);
        if (interfaceC0395g != null) {
            final int i14 = 3;
            f14.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    List listC;
                    List listC2;
                    List listC3;
                    List listC4;
                    List listC5;
                    List listC6;
                    List listC7;
                    List listC8;
                    List listC9;
                    List listC10;
                    List listC11;
                    List listC12;
                    List listC13;
                    List listC14;
                    List listC15;
                    switch (i14) {
                        case 0:
                            InterfaceC0395g interfaceC0395g2 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g2.B(str2, str3, (C0396h) obj4);
                                listC = Y4.D.D(null);
                            } catch (Throwable th) {
                                listC = p003a.a.c(th);
                            }
                            v6.f(listC);
                            break;
                        case 1:
                            InterfaceC0395g interfaceC0395g3 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            t6.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g3.O(str4, list3, (C0396h) obj7);
                                listC2 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listC2 = p003a.a.c(th2);
                            }
                            v6.f(listC2);
                            break;
                        case 2:
                            InterfaceC0395g interfaceC0395g4 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC3 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                listC3 = p003a.a.c(th3);
                            }
                            v6.f(listC3);
                            break;
                        case 3:
                            InterfaceC0395g interfaceC0395g5 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC4 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                listC4 = p003a.a.c(th4);
                            }
                            v6.f(listC4);
                            break;
                        case 4:
                            InterfaceC0395g interfaceC0395g6 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC5 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                listC5 = p003a.a.c(th5);
                            }
                            v6.f(listC5);
                            break;
                        case 5:
                            InterfaceC0395g interfaceC0395g7 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC6 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                listC6 = p003a.a.c(th6);
                            }
                            v6.f(listC6);
                            break;
                        case 6:
                            InterfaceC0395g interfaceC0395g8 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, zBooleanValue, (C0396h) obj18);
                                listC7 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listC7 = p003a.a.c(th7);
                            }
                            v6.f(listC7);
                            break;
                        case 7:
                            InterfaceC0395g interfaceC0395g9 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            t6.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC8 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                listC8 = p003a.a.c(th8);
                            }
                            v6.f(listC8);
                            break;
                        case 8:
                            InterfaceC0395g interfaceC0395g10 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            t6.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC9 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                listC9 = p003a.a.c(th9);
                            }
                            v6.f(listC9);
                            break;
                        case 9:
                            InterfaceC0395g interfaceC0395g11 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g11.h(list12, (C0396h) obj23);
                                listC10 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listC10 = p003a.a.c(th10);
                            }
                            v6.f(listC10);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC11 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                listC11 = p003a.a.c(th11);
                            }
                            v6.f(listC11);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC12 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                listC12 = p003a.a.c(th12);
                            }
                            v6.f(listC12);
                            break;
                        case 12:
                            InterfaceC0395g interfaceC0395g14 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            t6.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g14.j(str12, str13, (C0396h) obj28);
                                listC13 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listC13 = p003a.a.c(th13);
                            }
                            v6.f(listC13);
                            break;
                        case 13:
                            InterfaceC0395g interfaceC0395g15 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, jLongValue, (C0396h) obj31);
                                listC14 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                listC14 = p003a.a.c(th14);
                            }
                            v6.f(listC14);
                            break;
                        default:
                            InterfaceC0395g interfaceC0395g16 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            t6.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, dDoubleValue, (C0396h) obj34);
                                listC15 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listC15 = p003a.a.c(th15);
                            }
                            v6.f(listC15);
                            break;
                    }
                }
            });
        } else {
            f14.M(null);
        }
        F0 f15 = new F0(fVar, p155w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", strConcat), a(), vE, 1);
        if (interfaceC0395g != null) {
            final int i15 = 4;
            f15.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    List listC;
                    List listC2;
                    List listC3;
                    List listC4;
                    List listC5;
                    List listC6;
                    List listC7;
                    List listC8;
                    List listC9;
                    List listC10;
                    List listC11;
                    List listC12;
                    List listC13;
                    List listC14;
                    List listC15;
                    switch (i15) {
                        case 0:
                            InterfaceC0395g interfaceC0395g2 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g2.B(str2, str3, (C0396h) obj4);
                                listC = Y4.D.D(null);
                            } catch (Throwable th) {
                                listC = p003a.a.c(th);
                            }
                            v6.f(listC);
                            break;
                        case 1:
                            InterfaceC0395g interfaceC0395g3 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            t6.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g3.O(str4, list3, (C0396h) obj7);
                                listC2 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listC2 = p003a.a.c(th2);
                            }
                            v6.f(listC2);
                            break;
                        case 2:
                            InterfaceC0395g interfaceC0395g4 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC3 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                listC3 = p003a.a.c(th3);
                            }
                            v6.f(listC3);
                            break;
                        case 3:
                            InterfaceC0395g interfaceC0395g5 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC4 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                listC4 = p003a.a.c(th4);
                            }
                            v6.f(listC4);
                            break;
                        case 4:
                            InterfaceC0395g interfaceC0395g6 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC5 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                listC5 = p003a.a.c(th5);
                            }
                            v6.f(listC5);
                            break;
                        case 5:
                            InterfaceC0395g interfaceC0395g7 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC6 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                listC6 = p003a.a.c(th6);
                            }
                            v6.f(listC6);
                            break;
                        case 6:
                            InterfaceC0395g interfaceC0395g8 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, zBooleanValue, (C0396h) obj18);
                                listC7 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listC7 = p003a.a.c(th7);
                            }
                            v6.f(listC7);
                            break;
                        case 7:
                            InterfaceC0395g interfaceC0395g9 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            t6.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC8 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                listC8 = p003a.a.c(th8);
                            }
                            v6.f(listC8);
                            break;
                        case 8:
                            InterfaceC0395g interfaceC0395g10 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            t6.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC9 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                listC9 = p003a.a.c(th9);
                            }
                            v6.f(listC9);
                            break;
                        case 9:
                            InterfaceC0395g interfaceC0395g11 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g11.h(list12, (C0396h) obj23);
                                listC10 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listC10 = p003a.a.c(th10);
                            }
                            v6.f(listC10);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC11 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                listC11 = p003a.a.c(th11);
                            }
                            v6.f(listC11);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC12 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                listC12 = p003a.a.c(th12);
                            }
                            v6.f(listC12);
                            break;
                        case 12:
                            InterfaceC0395g interfaceC0395g14 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            t6.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g14.j(str12, str13, (C0396h) obj28);
                                listC13 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listC13 = p003a.a.c(th13);
                            }
                            v6.f(listC13);
                            break;
                        case 13:
                            InterfaceC0395g interfaceC0395g15 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, jLongValue, (C0396h) obj31);
                                listC14 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                listC14 = p003a.a.c(th14);
                            }
                            v6.f(listC14);
                            break;
                        default:
                            InterfaceC0395g interfaceC0395g16 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            t6.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, dDoubleValue, (C0396h) obj34);
                                listC15 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listC15 = p003a.a.c(th15);
                            }
                            v6.f(listC15);
                            break;
                    }
                }
            });
        } else {
            f15.M(null);
        }
        F0 f16 = new F0(fVar, p155w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", strConcat), a(), vE, 1);
        if (interfaceC0395g != null) {
            final int i16 = 5;
            f16.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    List listC;
                    List listC2;
                    List listC3;
                    List listC4;
                    List listC5;
                    List listC6;
                    List listC7;
                    List listC8;
                    List listC9;
                    List listC10;
                    List listC11;
                    List listC12;
                    List listC13;
                    List listC14;
                    List listC15;
                    switch (i16) {
                        case 0:
                            InterfaceC0395g interfaceC0395g2 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g2.B(str2, str3, (C0396h) obj4);
                                listC = Y4.D.D(null);
                            } catch (Throwable th) {
                                listC = p003a.a.c(th);
                            }
                            v6.f(listC);
                            break;
                        case 1:
                            InterfaceC0395g interfaceC0395g3 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            t6.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g3.O(str4, list3, (C0396h) obj7);
                                listC2 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listC2 = p003a.a.c(th2);
                            }
                            v6.f(listC2);
                            break;
                        case 2:
                            InterfaceC0395g interfaceC0395g4 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC3 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                listC3 = p003a.a.c(th3);
                            }
                            v6.f(listC3);
                            break;
                        case 3:
                            InterfaceC0395g interfaceC0395g5 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC4 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                listC4 = p003a.a.c(th4);
                            }
                            v6.f(listC4);
                            break;
                        case 4:
                            InterfaceC0395g interfaceC0395g6 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC5 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                listC5 = p003a.a.c(th5);
                            }
                            v6.f(listC5);
                            break;
                        case 5:
                            InterfaceC0395g interfaceC0395g7 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC6 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                listC6 = p003a.a.c(th6);
                            }
                            v6.f(listC6);
                            break;
                        case 6:
                            InterfaceC0395g interfaceC0395g8 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, zBooleanValue, (C0396h) obj18);
                                listC7 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listC7 = p003a.a.c(th7);
                            }
                            v6.f(listC7);
                            break;
                        case 7:
                            InterfaceC0395g interfaceC0395g9 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            t6.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC8 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                listC8 = p003a.a.c(th8);
                            }
                            v6.f(listC8);
                            break;
                        case 8:
                            InterfaceC0395g interfaceC0395g10 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            t6.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC9 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                listC9 = p003a.a.c(th9);
                            }
                            v6.f(listC9);
                            break;
                        case 9:
                            InterfaceC0395g interfaceC0395g11 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g11.h(list12, (C0396h) obj23);
                                listC10 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listC10 = p003a.a.c(th10);
                            }
                            v6.f(listC10);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC11 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                listC11 = p003a.a.c(th11);
                            }
                            v6.f(listC11);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC12 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                listC12 = p003a.a.c(th12);
                            }
                            v6.f(listC12);
                            break;
                        case 12:
                            InterfaceC0395g interfaceC0395g14 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            t6.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g14.j(str12, str13, (C0396h) obj28);
                                listC13 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listC13 = p003a.a.c(th13);
                            }
                            v6.f(listC13);
                            break;
                        case 13:
                            InterfaceC0395g interfaceC0395g15 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, jLongValue, (C0396h) obj31);
                                listC14 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                listC14 = p003a.a.c(th14);
                            }
                            v6.f(listC14);
                            break;
                        default:
                            InterfaceC0395g interfaceC0395g16 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            t6.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, dDoubleValue, (C0396h) obj34);
                                listC15 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listC15 = p003a.a.c(th15);
                            }
                            v6.f(listC15);
                            break;
                    }
                }
            });
        } else {
            f16.M(null);
        }
        F0 f17 = new F0(fVar, p155w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", strConcat), a(), vE, 1);
        if (interfaceC0395g != null) {
            final int i17 = 7;
            f17.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    List listC;
                    List listC2;
                    List listC3;
                    List listC4;
                    List listC5;
                    List listC6;
                    List listC7;
                    List listC8;
                    List listC9;
                    List listC10;
                    List listC11;
                    List listC12;
                    List listC13;
                    List listC14;
                    List listC15;
                    switch (i17) {
                        case 0:
                            InterfaceC0395g interfaceC0395g2 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g2.B(str2, str3, (C0396h) obj4);
                                listC = Y4.D.D(null);
                            } catch (Throwable th) {
                                listC = p003a.a.c(th);
                            }
                            v6.f(listC);
                            break;
                        case 1:
                            InterfaceC0395g interfaceC0395g3 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            t6.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g3.O(str4, list3, (C0396h) obj7);
                                listC2 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listC2 = p003a.a.c(th2);
                            }
                            v6.f(listC2);
                            break;
                        case 2:
                            InterfaceC0395g interfaceC0395g4 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC3 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                listC3 = p003a.a.c(th3);
                            }
                            v6.f(listC3);
                            break;
                        case 3:
                            InterfaceC0395g interfaceC0395g5 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC4 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                listC4 = p003a.a.c(th4);
                            }
                            v6.f(listC4);
                            break;
                        case 4:
                            InterfaceC0395g interfaceC0395g6 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC5 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                listC5 = p003a.a.c(th5);
                            }
                            v6.f(listC5);
                            break;
                        case 5:
                            InterfaceC0395g interfaceC0395g7 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC6 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                listC6 = p003a.a.c(th6);
                            }
                            v6.f(listC6);
                            break;
                        case 6:
                            InterfaceC0395g interfaceC0395g8 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, zBooleanValue, (C0396h) obj18);
                                listC7 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listC7 = p003a.a.c(th7);
                            }
                            v6.f(listC7);
                            break;
                        case 7:
                            InterfaceC0395g interfaceC0395g9 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            t6.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC8 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                listC8 = p003a.a.c(th8);
                            }
                            v6.f(listC8);
                            break;
                        case 8:
                            InterfaceC0395g interfaceC0395g10 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            t6.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC9 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                listC9 = p003a.a.c(th9);
                            }
                            v6.f(listC9);
                            break;
                        case 9:
                            InterfaceC0395g interfaceC0395g11 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g11.h(list12, (C0396h) obj23);
                                listC10 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listC10 = p003a.a.c(th10);
                            }
                            v6.f(listC10);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC11 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                listC11 = p003a.a.c(th11);
                            }
                            v6.f(listC11);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC12 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                listC12 = p003a.a.c(th12);
                            }
                            v6.f(listC12);
                            break;
                        case 12:
                            InterfaceC0395g interfaceC0395g14 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            t6.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g14.j(str12, str13, (C0396h) obj28);
                                listC13 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listC13 = p003a.a.c(th13);
                            }
                            v6.f(listC13);
                            break;
                        case 13:
                            InterfaceC0395g interfaceC0395g15 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, jLongValue, (C0396h) obj31);
                                listC14 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                listC14 = p003a.a.c(th14);
                            }
                            v6.f(listC14);
                            break;
                        default:
                            InterfaceC0395g interfaceC0395g16 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            t6.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, dDoubleValue, (C0396h) obj34);
                                listC15 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listC15 = p003a.a.c(th15);
                            }
                            v6.f(listC15);
                            break;
                    }
                }
            });
        } else {
            f17.M(null);
        }
        F0 f18 = new F0(fVar, p155w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", strConcat), a(), vE, 1);
        if (interfaceC0395g != null) {
            final int i18 = 8;
            f18.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    List listC;
                    List listC2;
                    List listC3;
                    List listC4;
                    List listC5;
                    List listC6;
                    List listC7;
                    List listC8;
                    List listC9;
                    List listC10;
                    List listC11;
                    List listC12;
                    List listC13;
                    List listC14;
                    List listC15;
                    switch (i18) {
                        case 0:
                            InterfaceC0395g interfaceC0395g2 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g2.B(str2, str3, (C0396h) obj4);
                                listC = Y4.D.D(null);
                            } catch (Throwable th) {
                                listC = p003a.a.c(th);
                            }
                            v6.f(listC);
                            break;
                        case 1:
                            InterfaceC0395g interfaceC0395g3 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            t6.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g3.O(str4, list3, (C0396h) obj7);
                                listC2 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listC2 = p003a.a.c(th2);
                            }
                            v6.f(listC2);
                            break;
                        case 2:
                            InterfaceC0395g interfaceC0395g4 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC3 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                listC3 = p003a.a.c(th3);
                            }
                            v6.f(listC3);
                            break;
                        case 3:
                            InterfaceC0395g interfaceC0395g5 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC4 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                listC4 = p003a.a.c(th4);
                            }
                            v6.f(listC4);
                            break;
                        case 4:
                            InterfaceC0395g interfaceC0395g6 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC5 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                listC5 = p003a.a.c(th5);
                            }
                            v6.f(listC5);
                            break;
                        case 5:
                            InterfaceC0395g interfaceC0395g7 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC6 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                listC6 = p003a.a.c(th6);
                            }
                            v6.f(listC6);
                            break;
                        case 6:
                            InterfaceC0395g interfaceC0395g8 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, zBooleanValue, (C0396h) obj18);
                                listC7 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listC7 = p003a.a.c(th7);
                            }
                            v6.f(listC7);
                            break;
                        case 7:
                            InterfaceC0395g interfaceC0395g9 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            t6.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC8 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                listC8 = p003a.a.c(th8);
                            }
                            v6.f(listC8);
                            break;
                        case 8:
                            InterfaceC0395g interfaceC0395g10 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            t6.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC9 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                listC9 = p003a.a.c(th9);
                            }
                            v6.f(listC9);
                            break;
                        case 9:
                            InterfaceC0395g interfaceC0395g11 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g11.h(list12, (C0396h) obj23);
                                listC10 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listC10 = p003a.a.c(th10);
                            }
                            v6.f(listC10);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC11 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                listC11 = p003a.a.c(th11);
                            }
                            v6.f(listC11);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC12 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                listC12 = p003a.a.c(th12);
                            }
                            v6.f(listC12);
                            break;
                        case 12:
                            InterfaceC0395g interfaceC0395g14 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            t6.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g14.j(str12, str13, (C0396h) obj28);
                                listC13 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listC13 = p003a.a.c(th13);
                            }
                            v6.f(listC13);
                            break;
                        case 13:
                            InterfaceC0395g interfaceC0395g15 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, jLongValue, (C0396h) obj31);
                                listC14 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                listC14 = p003a.a.c(th14);
                            }
                            v6.f(listC14);
                            break;
                        default:
                            InterfaceC0395g interfaceC0395g16 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            t6.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, dDoubleValue, (C0396h) obj34);
                                listC15 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listC15 = p003a.a.c(th15);
                            }
                            v6.f(listC15);
                            break;
                    }
                }
            });
        } else {
            f18.M(null);
        }
        F0 f19 = new F0(fVar, p155w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", strConcat), a(), vE, 1);
        if (interfaceC0395g != null) {
            final int i19 = 9;
            f19.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    List listC;
                    List listC2;
                    List listC3;
                    List listC4;
                    List listC5;
                    List listC6;
                    List listC7;
                    List listC8;
                    List listC9;
                    List listC10;
                    List listC11;
                    List listC12;
                    List listC13;
                    List listC14;
                    List listC15;
                    switch (i19) {
                        case 0:
                            InterfaceC0395g interfaceC0395g2 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g2.B(str2, str3, (C0396h) obj4);
                                listC = Y4.D.D(null);
                            } catch (Throwable th) {
                                listC = p003a.a.c(th);
                            }
                            v6.f(listC);
                            break;
                        case 1:
                            InterfaceC0395g interfaceC0395g3 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            t6.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g3.O(str4, list3, (C0396h) obj7);
                                listC2 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listC2 = p003a.a.c(th2);
                            }
                            v6.f(listC2);
                            break;
                        case 2:
                            InterfaceC0395g interfaceC0395g4 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC3 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                listC3 = p003a.a.c(th3);
                            }
                            v6.f(listC3);
                            break;
                        case 3:
                            InterfaceC0395g interfaceC0395g5 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC4 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                listC4 = p003a.a.c(th4);
                            }
                            v6.f(listC4);
                            break;
                        case 4:
                            InterfaceC0395g interfaceC0395g6 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC5 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                listC5 = p003a.a.c(th5);
                            }
                            v6.f(listC5);
                            break;
                        case 5:
                            InterfaceC0395g interfaceC0395g7 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC6 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                listC6 = p003a.a.c(th6);
                            }
                            v6.f(listC6);
                            break;
                        case 6:
                            InterfaceC0395g interfaceC0395g8 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, zBooleanValue, (C0396h) obj18);
                                listC7 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listC7 = p003a.a.c(th7);
                            }
                            v6.f(listC7);
                            break;
                        case 7:
                            InterfaceC0395g interfaceC0395g9 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            t6.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC8 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                listC8 = p003a.a.c(th8);
                            }
                            v6.f(listC8);
                            break;
                        case 8:
                            InterfaceC0395g interfaceC0395g10 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            t6.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC9 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                listC9 = p003a.a.c(th9);
                            }
                            v6.f(listC9);
                            break;
                        case 9:
                            InterfaceC0395g interfaceC0395g11 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g11.h(list12, (C0396h) obj23);
                                listC10 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listC10 = p003a.a.c(th10);
                            }
                            v6.f(listC10);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC11 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                listC11 = p003a.a.c(th11);
                            }
                            v6.f(listC11);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC12 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                listC12 = p003a.a.c(th12);
                            }
                            v6.f(listC12);
                            break;
                        case 12:
                            InterfaceC0395g interfaceC0395g14 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            t6.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g14.j(str12, str13, (C0396h) obj28);
                                listC13 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listC13 = p003a.a.c(th13);
                            }
                            v6.f(listC13);
                            break;
                        case 13:
                            InterfaceC0395g interfaceC0395g15 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, jLongValue, (C0396h) obj31);
                                listC14 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                listC14 = p003a.a.c(th14);
                            }
                            v6.f(listC14);
                            break;
                        default:
                            InterfaceC0395g interfaceC0395g16 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            t6.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, dDoubleValue, (C0396h) obj34);
                                listC15 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listC15 = p003a.a.c(th15);
                            }
                            v6.f(listC15);
                            break;
                    }
                }
            });
        } else {
            f19.M(null);
        }
        F0 f20 = new F0(fVar, p155w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", strConcat), a(), vE, 1);
        if (interfaceC0395g != null) {
            final int i20 = 10;
            f20.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    List listC;
                    List listC2;
                    List listC3;
                    List listC4;
                    List listC5;
                    List listC6;
                    List listC7;
                    List listC8;
                    List listC9;
                    List listC10;
                    List listC11;
                    List listC12;
                    List listC13;
                    List listC14;
                    List listC15;
                    switch (i20) {
                        case 0:
                            InterfaceC0395g interfaceC0395g2 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g2.B(str2, str3, (C0396h) obj4);
                                listC = Y4.D.D(null);
                            } catch (Throwable th) {
                                listC = p003a.a.c(th);
                            }
                            v6.f(listC);
                            break;
                        case 1:
                            InterfaceC0395g interfaceC0395g3 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            t6.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g3.O(str4, list3, (C0396h) obj7);
                                listC2 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listC2 = p003a.a.c(th2);
                            }
                            v6.f(listC2);
                            break;
                        case 2:
                            InterfaceC0395g interfaceC0395g4 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC3 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                listC3 = p003a.a.c(th3);
                            }
                            v6.f(listC3);
                            break;
                        case 3:
                            InterfaceC0395g interfaceC0395g5 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC4 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                listC4 = p003a.a.c(th4);
                            }
                            v6.f(listC4);
                            break;
                        case 4:
                            InterfaceC0395g interfaceC0395g6 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC5 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                listC5 = p003a.a.c(th5);
                            }
                            v6.f(listC5);
                            break;
                        case 5:
                            InterfaceC0395g interfaceC0395g7 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC6 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                listC6 = p003a.a.c(th6);
                            }
                            v6.f(listC6);
                            break;
                        case 6:
                            InterfaceC0395g interfaceC0395g8 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, zBooleanValue, (C0396h) obj18);
                                listC7 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listC7 = p003a.a.c(th7);
                            }
                            v6.f(listC7);
                            break;
                        case 7:
                            InterfaceC0395g interfaceC0395g9 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            t6.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC8 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                listC8 = p003a.a.c(th8);
                            }
                            v6.f(listC8);
                            break;
                        case 8:
                            InterfaceC0395g interfaceC0395g10 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            t6.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC9 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                listC9 = p003a.a.c(th9);
                            }
                            v6.f(listC9);
                            break;
                        case 9:
                            InterfaceC0395g interfaceC0395g11 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g11.h(list12, (C0396h) obj23);
                                listC10 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listC10 = p003a.a.c(th10);
                            }
                            v6.f(listC10);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC11 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                listC11 = p003a.a.c(th11);
                            }
                            v6.f(listC11);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC12 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                listC12 = p003a.a.c(th12);
                            }
                            v6.f(listC12);
                            break;
                        case 12:
                            InterfaceC0395g interfaceC0395g14 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            t6.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g14.j(str12, str13, (C0396h) obj28);
                                listC13 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listC13 = p003a.a.c(th13);
                            }
                            v6.f(listC13);
                            break;
                        case 13:
                            InterfaceC0395g interfaceC0395g15 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, jLongValue, (C0396h) obj31);
                                listC14 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                listC14 = p003a.a.c(th14);
                            }
                            v6.f(listC14);
                            break;
                        default:
                            InterfaceC0395g interfaceC0395g16 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            t6.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, dDoubleValue, (C0396h) obj34);
                                listC15 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listC15 = p003a.a.c(th15);
                            }
                            v6.f(listC15);
                            break;
                    }
                }
            });
        } else {
            f20.M(null);
        }
        F0 f21 = new F0(fVar, p155w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", strConcat), a(), vE, 1);
        if (interfaceC0395g == null) {
            f21.M(null);
        } else {
            final int i21 = 11;
            f21.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v6) {
                    List listC;
                    List listC2;
                    List listC3;
                    List listC4;
                    List listC5;
                    List listC6;
                    List listC7;
                    List listC8;
                    List listC9;
                    List listC10;
                    List listC11;
                    List listC12;
                    List listC13;
                    List listC14;
                    List listC15;
                    switch (i21) {
                        case 0:
                            InterfaceC0395g interfaceC0395g2 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g2.B(str2, str3, (C0396h) obj4);
                                listC = Y4.D.D(null);
                            } catch (Throwable th) {
                                listC = p003a.a.c(th);
                            }
                            v6.f(listC);
                            break;
                        case 1:
                            InterfaceC0395g interfaceC0395g3 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            t6.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g3.O(str4, list3, (C0396h) obj7);
                                listC2 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listC2 = p003a.a.c(th2);
                            }
                            v6.f(listC2);
                            break;
                        case 2:
                            InterfaceC0395g interfaceC0395g4 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC3 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                listC3 = p003a.a.c(th3);
                            }
                            v6.f(listC3);
                            break;
                        case 3:
                            InterfaceC0395g interfaceC0395g5 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC4 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                listC4 = p003a.a.c(th4);
                            }
                            v6.f(listC4);
                            break;
                        case 4:
                            InterfaceC0395g interfaceC0395g6 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC5 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                listC5 = p003a.a.c(th5);
                            }
                            v6.f(listC5);
                            break;
                        case 5:
                            InterfaceC0395g interfaceC0395g7 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC6 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                listC6 = p003a.a.c(th6);
                            }
                            v6.f(listC6);
                            break;
                        case 6:
                            InterfaceC0395g interfaceC0395g8 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, zBooleanValue, (C0396h) obj18);
                                listC7 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listC7 = p003a.a.c(th7);
                            }
                            v6.f(listC7);
                            break;
                        case 7:
                            InterfaceC0395g interfaceC0395g9 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            t6.h.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC8 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                listC8 = p003a.a.c(th8);
                            }
                            v6.f(listC8);
                            break;
                        case 8:
                            InterfaceC0395g interfaceC0395g10 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            t6.h.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC9 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                listC9 = p003a.a.c(th9);
                            }
                            v6.f(listC9);
                            break;
                        case 9:
                            InterfaceC0395g interfaceC0395g11 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g11.h(list12, (C0396h) obj23);
                                listC10 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listC10 = p003a.a.c(th10);
                            }
                            v6.f(listC10);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC11 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                listC11 = p003a.a.c(th11);
                            }
                            v6.f(listC11);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                listC12 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                listC12 = p003a.a.c(th12);
                            }
                            v6.f(listC12);
                            break;
                        case 12:
                            InterfaceC0395g interfaceC0395g14 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            t6.h.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g14.j(str12, str13, (C0396h) obj28);
                                listC13 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listC13 = p003a.a.c(th13);
                            }
                            v6.f(listC13);
                            break;
                        case 13:
                            InterfaceC0395g interfaceC0395g15 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, jLongValue, (C0396h) obj31);
                                listC14 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                listC14 = p003a.a.c(th14);
                            }
                            v6.f(listC14);
                            break;
                        default:
                            InterfaceC0395g interfaceC0395g16 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            t6.h.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double dDoubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, dDoubleValue, (C0396h) obj34);
                                listC15 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listC15 = p003a.a.c(th15);
                            }
                            v6.f(listC15);
                            break;
                    }
                }
            });
        }
    }
}
