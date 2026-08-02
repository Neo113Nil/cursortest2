package P5;

import B4.V;
import a.AbstractC0603a;
import f6.C1114g;
import java.util.List;
import w1.F0;
import w1.V0;

/* renamed from: P5.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0394f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0394f f5649a = new C0394f();

    /* renamed from: b, reason: collision with root package name */
    public static final C1114g f5650b = Y4.D.C(new C0392d(0));

    public static A5.n a() {
        return (A5.n) f5650b.getValue();
    }

    public static void b(A5.f fVar, final InterfaceC0395g interfaceC0395g, String str) {
        t6.h.e(fVar, "binaryMessenger");
        String concat = str.length() > 0 ? ".".concat(str) : "";
        V e7 = fVar.e();
        F0 f02 = new F0(fVar, w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", concat), a(), e7, 1);
        if (interfaceC0395g != null) {
            final int i7 = 6;
            f02.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    List c3;
                    List c4;
                    List c7;
                    List c8;
                    List c9;
                    List c10;
                    List c11;
                    List c12;
                    List c13;
                    List c14;
                    List c15;
                    List c16;
                    List c17;
                    List c18;
                    List c19;
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
                                c3 = Y4.D.D(null);
                            } catch (Throwable th) {
                                c3 = AbstractC0603a.c(th);
                            }
                            v02.f(c3);
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
                                c4 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                c4 = AbstractC0603a.c(th2);
                            }
                            v02.f(c4);
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
                                c7 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                c7 = AbstractC0603a.c(th3);
                            }
                            v02.f(c7);
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
                                c8 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                c8 = AbstractC0603a.c(th4);
                            }
                            v02.f(c8);
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
                                c9 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                c9 = AbstractC0603a.c(th5);
                            }
                            v02.f(c9);
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
                                c10 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                c10 = AbstractC0603a.c(th6);
                            }
                            v02.f(c10);
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
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, booleanValue, (C0396h) obj18);
                                c11 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                c11 = AbstractC0603a.c(th7);
                            }
                            v02.f(c11);
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
                                c12 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                c12 = AbstractC0603a.c(th8);
                            }
                            v02.f(c12);
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
                                c13 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                c13 = AbstractC0603a.c(th9);
                            }
                            v02.f(c13);
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
                                c14 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                c14 = AbstractC0603a.c(th10);
                            }
                            v02.f(c14);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c15 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                c15 = AbstractC0603a.c(th11);
                            }
                            v02.f(c15);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c16 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                c16 = AbstractC0603a.c(th12);
                            }
                            v02.f(c16);
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
                                c17 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                c17 = AbstractC0603a.c(th13);
                            }
                            v02.f(c17);
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
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, longValue, (C0396h) obj31);
                                c18 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                c18 = AbstractC0603a.c(th14);
                            }
                            v02.f(c18);
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
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, doubleValue, (C0396h) obj34);
                                c19 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                c19 = AbstractC0603a.c(th15);
                            }
                            v02.f(c19);
                            break;
                    }
                }
            });
        } else {
            f02.M(null);
        }
        F0 f03 = new F0(fVar, w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", concat), a(), e7, 1);
        if (interfaceC0395g != null) {
            final int i8 = 12;
            f03.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    List c3;
                    List c4;
                    List c7;
                    List c8;
                    List c9;
                    List c10;
                    List c11;
                    List c12;
                    List c13;
                    List c14;
                    List c15;
                    List c16;
                    List c17;
                    List c18;
                    List c19;
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
                                c3 = Y4.D.D(null);
                            } catch (Throwable th) {
                                c3 = AbstractC0603a.c(th);
                            }
                            v02.f(c3);
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
                                c4 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                c4 = AbstractC0603a.c(th2);
                            }
                            v02.f(c4);
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
                                c7 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                c7 = AbstractC0603a.c(th3);
                            }
                            v02.f(c7);
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
                                c8 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                c8 = AbstractC0603a.c(th4);
                            }
                            v02.f(c8);
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
                                c9 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                c9 = AbstractC0603a.c(th5);
                            }
                            v02.f(c9);
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
                                c10 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                c10 = AbstractC0603a.c(th6);
                            }
                            v02.f(c10);
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
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, booleanValue, (C0396h) obj18);
                                c11 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                c11 = AbstractC0603a.c(th7);
                            }
                            v02.f(c11);
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
                                c12 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                c12 = AbstractC0603a.c(th8);
                            }
                            v02.f(c12);
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
                                c13 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                c13 = AbstractC0603a.c(th9);
                            }
                            v02.f(c13);
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
                                c14 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                c14 = AbstractC0603a.c(th10);
                            }
                            v02.f(c14);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c15 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                c15 = AbstractC0603a.c(th11);
                            }
                            v02.f(c15);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c16 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                c16 = AbstractC0603a.c(th12);
                            }
                            v02.f(c16);
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
                                c17 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                c17 = AbstractC0603a.c(th13);
                            }
                            v02.f(c17);
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
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, longValue, (C0396h) obj31);
                                c18 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                c18 = AbstractC0603a.c(th14);
                            }
                            v02.f(c18);
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
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, doubleValue, (C0396h) obj34);
                                c19 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                c19 = AbstractC0603a.c(th15);
                            }
                            v02.f(c19);
                            break;
                    }
                }
            });
        } else {
            f03.M(null);
        }
        F0 f04 = new F0(fVar, w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", concat), a(), e7, 1);
        if (interfaceC0395g != null) {
            final int i9 = 13;
            f04.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    List c3;
                    List c4;
                    List c7;
                    List c8;
                    List c9;
                    List c10;
                    List c11;
                    List c12;
                    List c13;
                    List c14;
                    List c15;
                    List c16;
                    List c17;
                    List c18;
                    List c19;
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
                                c3 = Y4.D.D(null);
                            } catch (Throwable th) {
                                c3 = AbstractC0603a.c(th);
                            }
                            v02.f(c3);
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
                                c4 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                c4 = AbstractC0603a.c(th2);
                            }
                            v02.f(c4);
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
                                c7 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                c7 = AbstractC0603a.c(th3);
                            }
                            v02.f(c7);
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
                                c8 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                c8 = AbstractC0603a.c(th4);
                            }
                            v02.f(c8);
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
                                c9 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                c9 = AbstractC0603a.c(th5);
                            }
                            v02.f(c9);
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
                                c10 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                c10 = AbstractC0603a.c(th6);
                            }
                            v02.f(c10);
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
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, booleanValue, (C0396h) obj18);
                                c11 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                c11 = AbstractC0603a.c(th7);
                            }
                            v02.f(c11);
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
                                c12 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                c12 = AbstractC0603a.c(th8);
                            }
                            v02.f(c12);
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
                                c13 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                c13 = AbstractC0603a.c(th9);
                            }
                            v02.f(c13);
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
                                c14 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                c14 = AbstractC0603a.c(th10);
                            }
                            v02.f(c14);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c15 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                c15 = AbstractC0603a.c(th11);
                            }
                            v02.f(c15);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c16 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                c16 = AbstractC0603a.c(th12);
                            }
                            v02.f(c16);
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
                                c17 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                c17 = AbstractC0603a.c(th13);
                            }
                            v02.f(c17);
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
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, longValue, (C0396h) obj31);
                                c18 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                c18 = AbstractC0603a.c(th14);
                            }
                            v02.f(c18);
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
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, doubleValue, (C0396h) obj34);
                                c19 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                c19 = AbstractC0603a.c(th15);
                            }
                            v02.f(c19);
                            break;
                    }
                }
            });
        } else {
            f04.M(null);
        }
        F0 f05 = new F0(fVar, w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", concat), a(), e7, 1);
        if (interfaceC0395g != null) {
            final int i10 = 14;
            f05.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    List c3;
                    List c4;
                    List c7;
                    List c8;
                    List c9;
                    List c10;
                    List c11;
                    List c12;
                    List c13;
                    List c14;
                    List c15;
                    List c16;
                    List c17;
                    List c18;
                    List c19;
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
                                c3 = Y4.D.D(null);
                            } catch (Throwable th) {
                                c3 = AbstractC0603a.c(th);
                            }
                            v02.f(c3);
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
                                c4 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                c4 = AbstractC0603a.c(th2);
                            }
                            v02.f(c4);
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
                                c7 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                c7 = AbstractC0603a.c(th3);
                            }
                            v02.f(c7);
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
                                c8 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                c8 = AbstractC0603a.c(th4);
                            }
                            v02.f(c8);
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
                                c9 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                c9 = AbstractC0603a.c(th5);
                            }
                            v02.f(c9);
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
                                c10 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                c10 = AbstractC0603a.c(th6);
                            }
                            v02.f(c10);
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
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, booleanValue, (C0396h) obj18);
                                c11 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                c11 = AbstractC0603a.c(th7);
                            }
                            v02.f(c11);
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
                                c12 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                c12 = AbstractC0603a.c(th8);
                            }
                            v02.f(c12);
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
                                c13 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                c13 = AbstractC0603a.c(th9);
                            }
                            v02.f(c13);
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
                                c14 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                c14 = AbstractC0603a.c(th10);
                            }
                            v02.f(c14);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c15 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                c15 = AbstractC0603a.c(th11);
                            }
                            v02.f(c15);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c16 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                c16 = AbstractC0603a.c(th12);
                            }
                            v02.f(c16);
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
                                c17 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                c17 = AbstractC0603a.c(th13);
                            }
                            v02.f(c17);
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
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, longValue, (C0396h) obj31);
                                c18 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                c18 = AbstractC0603a.c(th14);
                            }
                            v02.f(c18);
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
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, doubleValue, (C0396h) obj34);
                                c19 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                c19 = AbstractC0603a.c(th15);
                            }
                            v02.f(c19);
                            break;
                    }
                }
            });
        } else {
            f05.M(null);
        }
        F0 f06 = new F0(fVar, w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", concat), a(), e7, 1);
        if (interfaceC0395g != null) {
            final int i11 = 0;
            f06.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    List c3;
                    List c4;
                    List c7;
                    List c8;
                    List c9;
                    List c10;
                    List c11;
                    List c12;
                    List c13;
                    List c14;
                    List c15;
                    List c16;
                    List c17;
                    List c18;
                    List c19;
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
                                c3 = Y4.D.D(null);
                            } catch (Throwable th) {
                                c3 = AbstractC0603a.c(th);
                            }
                            v02.f(c3);
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
                                c4 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                c4 = AbstractC0603a.c(th2);
                            }
                            v02.f(c4);
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
                                c7 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                c7 = AbstractC0603a.c(th3);
                            }
                            v02.f(c7);
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
                                c8 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                c8 = AbstractC0603a.c(th4);
                            }
                            v02.f(c8);
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
                                c9 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                c9 = AbstractC0603a.c(th5);
                            }
                            v02.f(c9);
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
                                c10 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                c10 = AbstractC0603a.c(th6);
                            }
                            v02.f(c10);
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
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, booleanValue, (C0396h) obj18);
                                c11 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                c11 = AbstractC0603a.c(th7);
                            }
                            v02.f(c11);
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
                                c12 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                c12 = AbstractC0603a.c(th8);
                            }
                            v02.f(c12);
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
                                c13 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                c13 = AbstractC0603a.c(th9);
                            }
                            v02.f(c13);
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
                                c14 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                c14 = AbstractC0603a.c(th10);
                            }
                            v02.f(c14);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c15 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                c15 = AbstractC0603a.c(th11);
                            }
                            v02.f(c15);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c16 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                c16 = AbstractC0603a.c(th12);
                            }
                            v02.f(c16);
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
                                c17 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                c17 = AbstractC0603a.c(th13);
                            }
                            v02.f(c17);
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
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, longValue, (C0396h) obj31);
                                c18 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                c18 = AbstractC0603a.c(th14);
                            }
                            v02.f(c18);
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
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, doubleValue, (C0396h) obj34);
                                c19 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                c19 = AbstractC0603a.c(th15);
                            }
                            v02.f(c19);
                            break;
                    }
                }
            });
        } else {
            f06.M(null);
        }
        F0 f07 = new F0(fVar, w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", concat), a(), e7, 1);
        if (interfaceC0395g != null) {
            final int i12 = 1;
            f07.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    List c3;
                    List c4;
                    List c7;
                    List c8;
                    List c9;
                    List c10;
                    List c11;
                    List c12;
                    List c13;
                    List c14;
                    List c15;
                    List c16;
                    List c17;
                    List c18;
                    List c19;
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
                                c3 = Y4.D.D(null);
                            } catch (Throwable th) {
                                c3 = AbstractC0603a.c(th);
                            }
                            v02.f(c3);
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
                                c4 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                c4 = AbstractC0603a.c(th2);
                            }
                            v02.f(c4);
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
                                c7 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                c7 = AbstractC0603a.c(th3);
                            }
                            v02.f(c7);
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
                                c8 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                c8 = AbstractC0603a.c(th4);
                            }
                            v02.f(c8);
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
                                c9 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                c9 = AbstractC0603a.c(th5);
                            }
                            v02.f(c9);
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
                                c10 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                c10 = AbstractC0603a.c(th6);
                            }
                            v02.f(c10);
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
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, booleanValue, (C0396h) obj18);
                                c11 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                c11 = AbstractC0603a.c(th7);
                            }
                            v02.f(c11);
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
                                c12 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                c12 = AbstractC0603a.c(th8);
                            }
                            v02.f(c12);
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
                                c13 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                c13 = AbstractC0603a.c(th9);
                            }
                            v02.f(c13);
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
                                c14 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                c14 = AbstractC0603a.c(th10);
                            }
                            v02.f(c14);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c15 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                c15 = AbstractC0603a.c(th11);
                            }
                            v02.f(c15);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c16 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                c16 = AbstractC0603a.c(th12);
                            }
                            v02.f(c16);
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
                                c17 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                c17 = AbstractC0603a.c(th13);
                            }
                            v02.f(c17);
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
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, longValue, (C0396h) obj31);
                                c18 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                c18 = AbstractC0603a.c(th14);
                            }
                            v02.f(c18);
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
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, doubleValue, (C0396h) obj34);
                                c19 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                c19 = AbstractC0603a.c(th15);
                            }
                            v02.f(c19);
                            break;
                    }
                }
            });
        } else {
            f07.M(null);
        }
        F0 f08 = new F0(fVar, w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", concat), a(), e7, 1);
        if (interfaceC0395g != null) {
            final int i13 = 2;
            f08.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    List c3;
                    List c4;
                    List c7;
                    List c8;
                    List c9;
                    List c10;
                    List c11;
                    List c12;
                    List c13;
                    List c14;
                    List c15;
                    List c16;
                    List c17;
                    List c18;
                    List c19;
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
                                c3 = Y4.D.D(null);
                            } catch (Throwable th) {
                                c3 = AbstractC0603a.c(th);
                            }
                            v02.f(c3);
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
                                c4 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                c4 = AbstractC0603a.c(th2);
                            }
                            v02.f(c4);
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
                                c7 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                c7 = AbstractC0603a.c(th3);
                            }
                            v02.f(c7);
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
                                c8 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                c8 = AbstractC0603a.c(th4);
                            }
                            v02.f(c8);
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
                                c9 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                c9 = AbstractC0603a.c(th5);
                            }
                            v02.f(c9);
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
                                c10 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                c10 = AbstractC0603a.c(th6);
                            }
                            v02.f(c10);
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
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, booleanValue, (C0396h) obj18);
                                c11 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                c11 = AbstractC0603a.c(th7);
                            }
                            v02.f(c11);
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
                                c12 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                c12 = AbstractC0603a.c(th8);
                            }
                            v02.f(c12);
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
                                c13 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                c13 = AbstractC0603a.c(th9);
                            }
                            v02.f(c13);
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
                                c14 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                c14 = AbstractC0603a.c(th10);
                            }
                            v02.f(c14);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c15 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                c15 = AbstractC0603a.c(th11);
                            }
                            v02.f(c15);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c16 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                c16 = AbstractC0603a.c(th12);
                            }
                            v02.f(c16);
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
                                c17 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                c17 = AbstractC0603a.c(th13);
                            }
                            v02.f(c17);
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
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, longValue, (C0396h) obj31);
                                c18 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                c18 = AbstractC0603a.c(th14);
                            }
                            v02.f(c18);
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
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, doubleValue, (C0396h) obj34);
                                c19 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                c19 = AbstractC0603a.c(th15);
                            }
                            v02.f(c19);
                            break;
                    }
                }
            });
        } else {
            f08.M(null);
        }
        F0 f09 = new F0(fVar, w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", concat), a(), e7, 1);
        if (interfaceC0395g != null) {
            final int i14 = 3;
            f09.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    List c3;
                    List c4;
                    List c7;
                    List c8;
                    List c9;
                    List c10;
                    List c11;
                    List c12;
                    List c13;
                    List c14;
                    List c15;
                    List c16;
                    List c17;
                    List c18;
                    List c19;
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
                                c3 = Y4.D.D(null);
                            } catch (Throwable th) {
                                c3 = AbstractC0603a.c(th);
                            }
                            v02.f(c3);
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
                                c4 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                c4 = AbstractC0603a.c(th2);
                            }
                            v02.f(c4);
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
                                c7 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                c7 = AbstractC0603a.c(th3);
                            }
                            v02.f(c7);
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
                                c8 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                c8 = AbstractC0603a.c(th4);
                            }
                            v02.f(c8);
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
                                c9 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                c9 = AbstractC0603a.c(th5);
                            }
                            v02.f(c9);
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
                                c10 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                c10 = AbstractC0603a.c(th6);
                            }
                            v02.f(c10);
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
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, booleanValue, (C0396h) obj18);
                                c11 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                c11 = AbstractC0603a.c(th7);
                            }
                            v02.f(c11);
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
                                c12 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                c12 = AbstractC0603a.c(th8);
                            }
                            v02.f(c12);
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
                                c13 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                c13 = AbstractC0603a.c(th9);
                            }
                            v02.f(c13);
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
                                c14 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                c14 = AbstractC0603a.c(th10);
                            }
                            v02.f(c14);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c15 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                c15 = AbstractC0603a.c(th11);
                            }
                            v02.f(c15);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c16 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                c16 = AbstractC0603a.c(th12);
                            }
                            v02.f(c16);
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
                                c17 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                c17 = AbstractC0603a.c(th13);
                            }
                            v02.f(c17);
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
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, longValue, (C0396h) obj31);
                                c18 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                c18 = AbstractC0603a.c(th14);
                            }
                            v02.f(c18);
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
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, doubleValue, (C0396h) obj34);
                                c19 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                c19 = AbstractC0603a.c(th15);
                            }
                            v02.f(c19);
                            break;
                    }
                }
            });
        } else {
            f09.M(null);
        }
        F0 f010 = new F0(fVar, w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", concat), a(), e7, 1);
        if (interfaceC0395g != null) {
            final int i15 = 4;
            f010.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    List c3;
                    List c4;
                    List c7;
                    List c8;
                    List c9;
                    List c10;
                    List c11;
                    List c12;
                    List c13;
                    List c14;
                    List c15;
                    List c16;
                    List c17;
                    List c18;
                    List c19;
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
                                c3 = Y4.D.D(null);
                            } catch (Throwable th) {
                                c3 = AbstractC0603a.c(th);
                            }
                            v02.f(c3);
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
                                c4 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                c4 = AbstractC0603a.c(th2);
                            }
                            v02.f(c4);
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
                                c7 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                c7 = AbstractC0603a.c(th3);
                            }
                            v02.f(c7);
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
                                c8 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                c8 = AbstractC0603a.c(th4);
                            }
                            v02.f(c8);
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
                                c9 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                c9 = AbstractC0603a.c(th5);
                            }
                            v02.f(c9);
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
                                c10 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                c10 = AbstractC0603a.c(th6);
                            }
                            v02.f(c10);
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
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, booleanValue, (C0396h) obj18);
                                c11 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                c11 = AbstractC0603a.c(th7);
                            }
                            v02.f(c11);
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
                                c12 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                c12 = AbstractC0603a.c(th8);
                            }
                            v02.f(c12);
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
                                c13 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                c13 = AbstractC0603a.c(th9);
                            }
                            v02.f(c13);
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
                                c14 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                c14 = AbstractC0603a.c(th10);
                            }
                            v02.f(c14);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c15 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                c15 = AbstractC0603a.c(th11);
                            }
                            v02.f(c15);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c16 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                c16 = AbstractC0603a.c(th12);
                            }
                            v02.f(c16);
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
                                c17 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                c17 = AbstractC0603a.c(th13);
                            }
                            v02.f(c17);
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
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, longValue, (C0396h) obj31);
                                c18 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                c18 = AbstractC0603a.c(th14);
                            }
                            v02.f(c18);
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
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, doubleValue, (C0396h) obj34);
                                c19 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                c19 = AbstractC0603a.c(th15);
                            }
                            v02.f(c19);
                            break;
                    }
                }
            });
        } else {
            f010.M(null);
        }
        F0 f011 = new F0(fVar, w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", concat), a(), e7, 1);
        if (interfaceC0395g != null) {
            final int i16 = 5;
            f011.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    List c3;
                    List c4;
                    List c7;
                    List c8;
                    List c9;
                    List c10;
                    List c11;
                    List c12;
                    List c13;
                    List c14;
                    List c15;
                    List c16;
                    List c17;
                    List c18;
                    List c19;
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
                                c3 = Y4.D.D(null);
                            } catch (Throwable th) {
                                c3 = AbstractC0603a.c(th);
                            }
                            v02.f(c3);
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
                                c4 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                c4 = AbstractC0603a.c(th2);
                            }
                            v02.f(c4);
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
                                c7 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                c7 = AbstractC0603a.c(th3);
                            }
                            v02.f(c7);
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
                                c8 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                c8 = AbstractC0603a.c(th4);
                            }
                            v02.f(c8);
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
                                c9 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                c9 = AbstractC0603a.c(th5);
                            }
                            v02.f(c9);
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
                                c10 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                c10 = AbstractC0603a.c(th6);
                            }
                            v02.f(c10);
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
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, booleanValue, (C0396h) obj18);
                                c11 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                c11 = AbstractC0603a.c(th7);
                            }
                            v02.f(c11);
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
                                c12 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                c12 = AbstractC0603a.c(th8);
                            }
                            v02.f(c12);
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
                                c13 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                c13 = AbstractC0603a.c(th9);
                            }
                            v02.f(c13);
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
                                c14 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                c14 = AbstractC0603a.c(th10);
                            }
                            v02.f(c14);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c15 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                c15 = AbstractC0603a.c(th11);
                            }
                            v02.f(c15);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c16 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                c16 = AbstractC0603a.c(th12);
                            }
                            v02.f(c16);
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
                                c17 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                c17 = AbstractC0603a.c(th13);
                            }
                            v02.f(c17);
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
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, longValue, (C0396h) obj31);
                                c18 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                c18 = AbstractC0603a.c(th14);
                            }
                            v02.f(c18);
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
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, doubleValue, (C0396h) obj34);
                                c19 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                c19 = AbstractC0603a.c(th15);
                            }
                            v02.f(c19);
                            break;
                    }
                }
            });
        } else {
            f011.M(null);
        }
        F0 f012 = new F0(fVar, w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", concat), a(), e7, 1);
        if (interfaceC0395g != null) {
            final int i17 = 7;
            f012.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    List c3;
                    List c4;
                    List c7;
                    List c8;
                    List c9;
                    List c10;
                    List c11;
                    List c12;
                    List c13;
                    List c14;
                    List c15;
                    List c16;
                    List c17;
                    List c18;
                    List c19;
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
                                c3 = Y4.D.D(null);
                            } catch (Throwable th) {
                                c3 = AbstractC0603a.c(th);
                            }
                            v02.f(c3);
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
                                c4 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                c4 = AbstractC0603a.c(th2);
                            }
                            v02.f(c4);
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
                                c7 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                c7 = AbstractC0603a.c(th3);
                            }
                            v02.f(c7);
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
                                c8 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                c8 = AbstractC0603a.c(th4);
                            }
                            v02.f(c8);
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
                                c9 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                c9 = AbstractC0603a.c(th5);
                            }
                            v02.f(c9);
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
                                c10 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                c10 = AbstractC0603a.c(th6);
                            }
                            v02.f(c10);
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
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, booleanValue, (C0396h) obj18);
                                c11 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                c11 = AbstractC0603a.c(th7);
                            }
                            v02.f(c11);
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
                                c12 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                c12 = AbstractC0603a.c(th8);
                            }
                            v02.f(c12);
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
                                c13 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                c13 = AbstractC0603a.c(th9);
                            }
                            v02.f(c13);
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
                                c14 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                c14 = AbstractC0603a.c(th10);
                            }
                            v02.f(c14);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c15 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                c15 = AbstractC0603a.c(th11);
                            }
                            v02.f(c15);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c16 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                c16 = AbstractC0603a.c(th12);
                            }
                            v02.f(c16);
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
                                c17 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                c17 = AbstractC0603a.c(th13);
                            }
                            v02.f(c17);
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
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, longValue, (C0396h) obj31);
                                c18 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                c18 = AbstractC0603a.c(th14);
                            }
                            v02.f(c18);
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
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, doubleValue, (C0396h) obj34);
                                c19 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                c19 = AbstractC0603a.c(th15);
                            }
                            v02.f(c19);
                            break;
                    }
                }
            });
        } else {
            f012.M(null);
        }
        F0 f013 = new F0(fVar, w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", concat), a(), e7, 1);
        if (interfaceC0395g != null) {
            final int i18 = 8;
            f013.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    List c3;
                    List c4;
                    List c7;
                    List c8;
                    List c9;
                    List c10;
                    List c11;
                    List c12;
                    List c13;
                    List c14;
                    List c15;
                    List c16;
                    List c17;
                    List c18;
                    List c19;
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
                                c3 = Y4.D.D(null);
                            } catch (Throwable th) {
                                c3 = AbstractC0603a.c(th);
                            }
                            v02.f(c3);
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
                                c4 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                c4 = AbstractC0603a.c(th2);
                            }
                            v02.f(c4);
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
                                c7 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                c7 = AbstractC0603a.c(th3);
                            }
                            v02.f(c7);
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
                                c8 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                c8 = AbstractC0603a.c(th4);
                            }
                            v02.f(c8);
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
                                c9 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                c9 = AbstractC0603a.c(th5);
                            }
                            v02.f(c9);
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
                                c10 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                c10 = AbstractC0603a.c(th6);
                            }
                            v02.f(c10);
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
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, booleanValue, (C0396h) obj18);
                                c11 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                c11 = AbstractC0603a.c(th7);
                            }
                            v02.f(c11);
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
                                c12 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                c12 = AbstractC0603a.c(th8);
                            }
                            v02.f(c12);
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
                                c13 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                c13 = AbstractC0603a.c(th9);
                            }
                            v02.f(c13);
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
                                c14 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                c14 = AbstractC0603a.c(th10);
                            }
                            v02.f(c14);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c15 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                c15 = AbstractC0603a.c(th11);
                            }
                            v02.f(c15);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c16 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                c16 = AbstractC0603a.c(th12);
                            }
                            v02.f(c16);
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
                                c17 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                c17 = AbstractC0603a.c(th13);
                            }
                            v02.f(c17);
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
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, longValue, (C0396h) obj31);
                                c18 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                c18 = AbstractC0603a.c(th14);
                            }
                            v02.f(c18);
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
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, doubleValue, (C0396h) obj34);
                                c19 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                c19 = AbstractC0603a.c(th15);
                            }
                            v02.f(c19);
                            break;
                    }
                }
            });
        } else {
            f013.M(null);
        }
        F0 f014 = new F0(fVar, w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", concat), a(), e7, 1);
        if (interfaceC0395g != null) {
            final int i19 = 9;
            f014.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    List c3;
                    List c4;
                    List c7;
                    List c8;
                    List c9;
                    List c10;
                    List c11;
                    List c12;
                    List c13;
                    List c14;
                    List c15;
                    List c16;
                    List c17;
                    List c18;
                    List c19;
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
                                c3 = Y4.D.D(null);
                            } catch (Throwable th) {
                                c3 = AbstractC0603a.c(th);
                            }
                            v02.f(c3);
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
                                c4 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                c4 = AbstractC0603a.c(th2);
                            }
                            v02.f(c4);
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
                                c7 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                c7 = AbstractC0603a.c(th3);
                            }
                            v02.f(c7);
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
                                c8 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                c8 = AbstractC0603a.c(th4);
                            }
                            v02.f(c8);
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
                                c9 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                c9 = AbstractC0603a.c(th5);
                            }
                            v02.f(c9);
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
                                c10 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                c10 = AbstractC0603a.c(th6);
                            }
                            v02.f(c10);
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
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, booleanValue, (C0396h) obj18);
                                c11 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                c11 = AbstractC0603a.c(th7);
                            }
                            v02.f(c11);
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
                                c12 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                c12 = AbstractC0603a.c(th8);
                            }
                            v02.f(c12);
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
                                c13 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                c13 = AbstractC0603a.c(th9);
                            }
                            v02.f(c13);
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
                                c14 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                c14 = AbstractC0603a.c(th10);
                            }
                            v02.f(c14);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c15 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                c15 = AbstractC0603a.c(th11);
                            }
                            v02.f(c15);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c16 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                c16 = AbstractC0603a.c(th12);
                            }
                            v02.f(c16);
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
                                c17 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                c17 = AbstractC0603a.c(th13);
                            }
                            v02.f(c17);
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
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, longValue, (C0396h) obj31);
                                c18 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                c18 = AbstractC0603a.c(th14);
                            }
                            v02.f(c18);
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
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, doubleValue, (C0396h) obj34);
                                c19 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                c19 = AbstractC0603a.c(th15);
                            }
                            v02.f(c19);
                            break;
                    }
                }
            });
        } else {
            f014.M(null);
        }
        F0 f015 = new F0(fVar, w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", concat), a(), e7, 1);
        if (interfaceC0395g != null) {
            final int i20 = 10;
            f015.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    List c3;
                    List c4;
                    List c7;
                    List c8;
                    List c9;
                    List c10;
                    List c11;
                    List c12;
                    List c13;
                    List c14;
                    List c15;
                    List c16;
                    List c17;
                    List c18;
                    List c19;
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
                                c3 = Y4.D.D(null);
                            } catch (Throwable th) {
                                c3 = AbstractC0603a.c(th);
                            }
                            v02.f(c3);
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
                                c4 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                c4 = AbstractC0603a.c(th2);
                            }
                            v02.f(c4);
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
                                c7 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                c7 = AbstractC0603a.c(th3);
                            }
                            v02.f(c7);
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
                                c8 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                c8 = AbstractC0603a.c(th4);
                            }
                            v02.f(c8);
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
                                c9 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                c9 = AbstractC0603a.c(th5);
                            }
                            v02.f(c9);
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
                                c10 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                c10 = AbstractC0603a.c(th6);
                            }
                            v02.f(c10);
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
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, booleanValue, (C0396h) obj18);
                                c11 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                c11 = AbstractC0603a.c(th7);
                            }
                            v02.f(c11);
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
                                c12 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                c12 = AbstractC0603a.c(th8);
                            }
                            v02.f(c12);
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
                                c13 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                c13 = AbstractC0603a.c(th9);
                            }
                            v02.f(c13);
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
                                c14 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                c14 = AbstractC0603a.c(th10);
                            }
                            v02.f(c14);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c15 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                c15 = AbstractC0603a.c(th11);
                            }
                            v02.f(c15);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c16 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                c16 = AbstractC0603a.c(th12);
                            }
                            v02.f(c16);
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
                                c17 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                c17 = AbstractC0603a.c(th13);
                            }
                            v02.f(c17);
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
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, longValue, (C0396h) obj31);
                                c18 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                c18 = AbstractC0603a.c(th14);
                            }
                            v02.f(c18);
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
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, doubleValue, (C0396h) obj34);
                                c19 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                c19 = AbstractC0603a.c(th15);
                            }
                            v02.f(c19);
                            break;
                    }
                }
            });
        } else {
            f015.M(null);
        }
        F0 f016 = new F0(fVar, w1.L.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", concat), a(), e7, 1);
        if (interfaceC0395g == null) {
            f016.M(null);
        } else {
            final int i21 = 11;
            f016.M(new A5.b() { // from class: P5.e
                @Override // A5.b
                public final void i(Object obj, V0 v02) {
                    List c3;
                    List c4;
                    List c7;
                    List c8;
                    List c9;
                    List c10;
                    List c11;
                    List c12;
                    List c13;
                    List c14;
                    List c15;
                    List c16;
                    List c17;
                    List c18;
                    List c19;
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
                                c3 = Y4.D.D(null);
                            } catch (Throwable th) {
                                c3 = AbstractC0603a.c(th);
                            }
                            v02.f(c3);
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
                                c4 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                c4 = AbstractC0603a.c(th2);
                            }
                            v02.f(c4);
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
                                c7 = Y4.D.D(interfaceC0395g4.K(str5, (C0396h) obj9));
                            } catch (Throwable th3) {
                                c7 = AbstractC0603a.c(th3);
                            }
                            v02.f(c7);
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
                                c8 = Y4.D.D(interfaceC0395g5.m(str6, (C0396h) obj11));
                            } catch (Throwable th4) {
                                c8 = AbstractC0603a.c(th4);
                            }
                            v02.f(c8);
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
                                c9 = Y4.D.D(interfaceC0395g6.v(str7, (C0396h) obj13));
                            } catch (Throwable th5) {
                                c9 = AbstractC0603a.c(th5);
                            }
                            v02.f(c9);
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
                                c10 = Y4.D.D(interfaceC0395g7.D(str8, (C0396h) obj15));
                            } catch (Throwable th6) {
                                c10 = AbstractC0603a.c(th6);
                            }
                            v02.f(c10);
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
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            t6.h.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g8.t(str9, booleanValue, (C0396h) obj18);
                                c11 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                c11 = AbstractC0603a.c(th7);
                            }
                            v02.f(c11);
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
                                c12 = Y4.D.D(interfaceC0395g9.H(str10, (C0396h) obj20));
                            } catch (Throwable th8) {
                                c12 = AbstractC0603a.c(th8);
                            }
                            v02.f(c12);
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
                                c13 = Y4.D.D(interfaceC0395g10.L(str11, (C0396h) obj22));
                            } catch (Throwable th9) {
                                c13 = AbstractC0603a.c(th9);
                            }
                            v02.f(c13);
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
                                c14 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                c14 = AbstractC0603a.c(th10);
                            }
                            v02.f(c14);
                            break;
                        case 10:
                            InterfaceC0395g interfaceC0395g12 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            t6.h.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c15 = Y4.D.D(interfaceC0395g12.M(list14, (C0396h) obj24));
                            } catch (Throwable th11) {
                                c15 = AbstractC0603a.c(th11);
                            }
                            v02.f(c15);
                            break;
                        case 11:
                            InterfaceC0395g interfaceC0395g13 = interfaceC0395g;
                            t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                c16 = Y4.D.D(interfaceC0395g13.y(list16, (C0396h) obj25));
                            } catch (Throwable th12) {
                                c16 = AbstractC0603a.c(th12);
                            }
                            v02.f(c16);
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
                                c17 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                c17 = AbstractC0603a.c(th13);
                            }
                            v02.f(c17);
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
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            t6.h.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g15.f(str14, longValue, (C0396h) obj31);
                                c18 = Y4.D.D(null);
                            } catch (Throwable th14) {
                                c18 = AbstractC0603a.c(th14);
                            }
                            v02.f(c18);
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
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            t6.h.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0395g16.A(str15, doubleValue, (C0396h) obj34);
                                c19 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                c19 = AbstractC0603a.c(th15);
                            }
                            v02.f(c19);
                            break;
                    }
                }
            });
        }
    }
}
