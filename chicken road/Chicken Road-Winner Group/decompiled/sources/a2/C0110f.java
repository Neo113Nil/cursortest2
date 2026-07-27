package a2;

import android.util.Log;
import d2.C0277g;
import e2.AbstractC0293h;
import java.util.List;

/* renamed from: a2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0110f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0110f f1839a = new C0110f();

    /* renamed from: b, reason: collision with root package name */
    public static final C0277g f1840b = new C0277g(new C0108d(0));

    public static T1.k a() {
        return (T1.k) f1840b.a();
    }

    public static void b(T1.f binaryMessenger, final InterfaceC0111g interfaceC0111g, String str) {
        kotlin.jvm.internal.j.e(binaryMessenger, "binaryMessenger");
        String concat = str.length() > 0 ? ".".concat(str) : "";
        P0.j j3 = binaryMessenger.j(new T1.j());
        D0.a aVar = new D0.a(binaryMessenger, B0.c.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", concat), a(), j3);
        if (interfaceC0111g != null) {
            final int i3 = 6;
            aVar.g(new T1.b() { // from class: a2.e
                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    List S2;
                    List S3;
                    List S4;
                    List S5;
                    List S6;
                    List S7;
                    List S8;
                    List S9;
                    List S10;
                    List S11;
                    List S12;
                    List S13;
                    List S14;
                    List S15;
                    List S16;
                    switch (i3) {
                        case 0:
                            InterfaceC0111g interfaceC0111g2 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g2.e(str2, str3, (C0112h) obj4);
                                S2 = X0.a.z(null);
                            } catch (Throwable th) {
                                S2 = AbstractC0293h.S(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            eVar.l(S2);
                            break;
                        case 1:
                            InterfaceC0111g interfaceC0111g3 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g3.k(str4, list3, (C0112h) obj7);
                                S3 = X0.a.z(null);
                            } catch (Throwable th2) {
                                S3 = AbstractC0293h.S(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            eVar.l(S3);
                            break;
                        case 2:
                            InterfaceC0111g interfaceC0111g4 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S4 = X0.a.z(interfaceC0111g4.r(str5, (C0112h) obj9));
                            } catch (Throwable th3) {
                                S4 = AbstractC0293h.S(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            eVar.l(S4);
                            break;
                        case 3:
                            InterfaceC0111g interfaceC0111g5 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S5 = X0.a.z(interfaceC0111g5.m(str6, (C0112h) obj11));
                            } catch (Throwable th4) {
                                S5 = AbstractC0293h.S(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            eVar.l(S5);
                            break;
                        case 4:
                            InterfaceC0111g interfaceC0111g6 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S6 = X0.a.z(interfaceC0111g6.d(str7, (C0112h) obj13));
                            } catch (Throwable th5) {
                                S6 = AbstractC0293h.S(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            eVar.l(S6);
                            break;
                        case 5:
                            InterfaceC0111g interfaceC0111g7 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S7 = X0.a.z(interfaceC0111g7.i(str8, (C0112h) obj15));
                            } catch (Throwable th6) {
                                S7 = AbstractC0293h.S(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            eVar.l(S7);
                            break;
                        case 6:
                            InterfaceC0111g interfaceC0111g8 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g8.q(str9, booleanValue, (C0112h) obj18);
                                S8 = X0.a.z(null);
                            } catch (Throwable th7) {
                                S8 = AbstractC0293h.S(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            eVar.l(S8);
                            break;
                        case 7:
                            InterfaceC0111g interfaceC0111g9 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S9 = X0.a.z(interfaceC0111g9.n(str10, (C0112h) obj20));
                            } catch (Throwable th8) {
                                S9 = AbstractC0293h.S(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            eVar.l(S9);
                            break;
                        case 8:
                            InterfaceC0111g interfaceC0111g10 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S10 = X0.a.z(interfaceC0111g10.b(str11, (C0112h) obj22));
                            } catch (Throwable th9) {
                                S10 = AbstractC0293h.S(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            eVar.l(S10);
                            break;
                        case 9:
                            InterfaceC0111g interfaceC0111g11 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g11.c(list12, (C0112h) obj23);
                                S11 = X0.a.z(null);
                            } catch (Throwable th10) {
                                S11 = AbstractC0293h.S(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            eVar.l(S11);
                            break;
                        case 10:
                            InterfaceC0111g interfaceC0111g12 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S12 = X0.a.z(interfaceC0111g12.f(list14, (C0112h) obj24));
                            } catch (Throwable th11) {
                                S12 = AbstractC0293h.S(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            eVar.l(S12);
                            break;
                        case 11:
                            InterfaceC0111g interfaceC0111g13 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S13 = X0.a.z(interfaceC0111g13.h(list16, (C0112h) obj25));
                            } catch (Throwable th12) {
                                S13 = AbstractC0293h.S(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            eVar.l(S13);
                            break;
                        case 12:
                            InterfaceC0111g interfaceC0111g14 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g14.g(str12, str13, (C0112h) obj28);
                                S14 = X0.a.z(null);
                            } catch (Throwable th13) {
                                S14 = AbstractC0293h.S(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            eVar.l(S14);
                            break;
                        case 13:
                            InterfaceC0111g interfaceC0111g15 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g15.a(str14, longValue, (C0112h) obj31);
                                S15 = X0.a.z(null);
                            } catch (Throwable th14) {
                                S15 = AbstractC0293h.S(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            eVar.l(S15);
                            break;
                        default:
                            InterfaceC0111g interfaceC0111g16 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g16.j(str15, doubleValue, (C0112h) obj34);
                                S16 = X0.a.z(null);
                            } catch (Throwable th15) {
                                S16 = AbstractC0293h.S(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            eVar.l(S16);
                            break;
                    }
                }
            });
        } else {
            aVar.g(null);
        }
        D0.a aVar2 = new D0.a(binaryMessenger, B0.c.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", concat), a(), j3);
        if (interfaceC0111g != null) {
            final int i4 = 12;
            aVar2.g(new T1.b() { // from class: a2.e
                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    List S2;
                    List S3;
                    List S4;
                    List S5;
                    List S6;
                    List S7;
                    List S8;
                    List S9;
                    List S10;
                    List S11;
                    List S12;
                    List S13;
                    List S14;
                    List S15;
                    List S16;
                    switch (i4) {
                        case 0:
                            InterfaceC0111g interfaceC0111g2 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g2.e(str2, str3, (C0112h) obj4);
                                S2 = X0.a.z(null);
                            } catch (Throwable th) {
                                S2 = AbstractC0293h.S(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            eVar.l(S2);
                            break;
                        case 1:
                            InterfaceC0111g interfaceC0111g3 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g3.k(str4, list3, (C0112h) obj7);
                                S3 = X0.a.z(null);
                            } catch (Throwable th2) {
                                S3 = AbstractC0293h.S(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            eVar.l(S3);
                            break;
                        case 2:
                            InterfaceC0111g interfaceC0111g4 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S4 = X0.a.z(interfaceC0111g4.r(str5, (C0112h) obj9));
                            } catch (Throwable th3) {
                                S4 = AbstractC0293h.S(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            eVar.l(S4);
                            break;
                        case 3:
                            InterfaceC0111g interfaceC0111g5 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S5 = X0.a.z(interfaceC0111g5.m(str6, (C0112h) obj11));
                            } catch (Throwable th4) {
                                S5 = AbstractC0293h.S(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            eVar.l(S5);
                            break;
                        case 4:
                            InterfaceC0111g interfaceC0111g6 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S6 = X0.a.z(interfaceC0111g6.d(str7, (C0112h) obj13));
                            } catch (Throwable th5) {
                                S6 = AbstractC0293h.S(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            eVar.l(S6);
                            break;
                        case 5:
                            InterfaceC0111g interfaceC0111g7 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S7 = X0.a.z(interfaceC0111g7.i(str8, (C0112h) obj15));
                            } catch (Throwable th6) {
                                S7 = AbstractC0293h.S(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            eVar.l(S7);
                            break;
                        case 6:
                            InterfaceC0111g interfaceC0111g8 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g8.q(str9, booleanValue, (C0112h) obj18);
                                S8 = X0.a.z(null);
                            } catch (Throwable th7) {
                                S8 = AbstractC0293h.S(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            eVar.l(S8);
                            break;
                        case 7:
                            InterfaceC0111g interfaceC0111g9 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S9 = X0.a.z(interfaceC0111g9.n(str10, (C0112h) obj20));
                            } catch (Throwable th8) {
                                S9 = AbstractC0293h.S(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            eVar.l(S9);
                            break;
                        case 8:
                            InterfaceC0111g interfaceC0111g10 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S10 = X0.a.z(interfaceC0111g10.b(str11, (C0112h) obj22));
                            } catch (Throwable th9) {
                                S10 = AbstractC0293h.S(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            eVar.l(S10);
                            break;
                        case 9:
                            InterfaceC0111g interfaceC0111g11 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g11.c(list12, (C0112h) obj23);
                                S11 = X0.a.z(null);
                            } catch (Throwable th10) {
                                S11 = AbstractC0293h.S(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            eVar.l(S11);
                            break;
                        case 10:
                            InterfaceC0111g interfaceC0111g12 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S12 = X0.a.z(interfaceC0111g12.f(list14, (C0112h) obj24));
                            } catch (Throwable th11) {
                                S12 = AbstractC0293h.S(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            eVar.l(S12);
                            break;
                        case 11:
                            InterfaceC0111g interfaceC0111g13 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S13 = X0.a.z(interfaceC0111g13.h(list16, (C0112h) obj25));
                            } catch (Throwable th12) {
                                S13 = AbstractC0293h.S(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            eVar.l(S13);
                            break;
                        case 12:
                            InterfaceC0111g interfaceC0111g14 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g14.g(str12, str13, (C0112h) obj28);
                                S14 = X0.a.z(null);
                            } catch (Throwable th13) {
                                S14 = AbstractC0293h.S(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            eVar.l(S14);
                            break;
                        case 13:
                            InterfaceC0111g interfaceC0111g15 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g15.a(str14, longValue, (C0112h) obj31);
                                S15 = X0.a.z(null);
                            } catch (Throwable th14) {
                                S15 = AbstractC0293h.S(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            eVar.l(S15);
                            break;
                        default:
                            InterfaceC0111g interfaceC0111g16 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g16.j(str15, doubleValue, (C0112h) obj34);
                                S16 = X0.a.z(null);
                            } catch (Throwable th15) {
                                S16 = AbstractC0293h.S(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            eVar.l(S16);
                            break;
                    }
                }
            });
        } else {
            aVar2.g(null);
        }
        D0.a aVar3 = new D0.a(binaryMessenger, B0.c.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", concat), a(), j3);
        if (interfaceC0111g != null) {
            final int i5 = 13;
            aVar3.g(new T1.b() { // from class: a2.e
                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    List S2;
                    List S3;
                    List S4;
                    List S5;
                    List S6;
                    List S7;
                    List S8;
                    List S9;
                    List S10;
                    List S11;
                    List S12;
                    List S13;
                    List S14;
                    List S15;
                    List S16;
                    switch (i5) {
                        case 0:
                            InterfaceC0111g interfaceC0111g2 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g2.e(str2, str3, (C0112h) obj4);
                                S2 = X0.a.z(null);
                            } catch (Throwable th) {
                                S2 = AbstractC0293h.S(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            eVar.l(S2);
                            break;
                        case 1:
                            InterfaceC0111g interfaceC0111g3 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g3.k(str4, list3, (C0112h) obj7);
                                S3 = X0.a.z(null);
                            } catch (Throwable th2) {
                                S3 = AbstractC0293h.S(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            eVar.l(S3);
                            break;
                        case 2:
                            InterfaceC0111g interfaceC0111g4 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S4 = X0.a.z(interfaceC0111g4.r(str5, (C0112h) obj9));
                            } catch (Throwable th3) {
                                S4 = AbstractC0293h.S(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            eVar.l(S4);
                            break;
                        case 3:
                            InterfaceC0111g interfaceC0111g5 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S5 = X0.a.z(interfaceC0111g5.m(str6, (C0112h) obj11));
                            } catch (Throwable th4) {
                                S5 = AbstractC0293h.S(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            eVar.l(S5);
                            break;
                        case 4:
                            InterfaceC0111g interfaceC0111g6 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S6 = X0.a.z(interfaceC0111g6.d(str7, (C0112h) obj13));
                            } catch (Throwable th5) {
                                S6 = AbstractC0293h.S(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            eVar.l(S6);
                            break;
                        case 5:
                            InterfaceC0111g interfaceC0111g7 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S7 = X0.a.z(interfaceC0111g7.i(str8, (C0112h) obj15));
                            } catch (Throwable th6) {
                                S7 = AbstractC0293h.S(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            eVar.l(S7);
                            break;
                        case 6:
                            InterfaceC0111g interfaceC0111g8 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g8.q(str9, booleanValue, (C0112h) obj18);
                                S8 = X0.a.z(null);
                            } catch (Throwable th7) {
                                S8 = AbstractC0293h.S(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            eVar.l(S8);
                            break;
                        case 7:
                            InterfaceC0111g interfaceC0111g9 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S9 = X0.a.z(interfaceC0111g9.n(str10, (C0112h) obj20));
                            } catch (Throwable th8) {
                                S9 = AbstractC0293h.S(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            eVar.l(S9);
                            break;
                        case 8:
                            InterfaceC0111g interfaceC0111g10 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S10 = X0.a.z(interfaceC0111g10.b(str11, (C0112h) obj22));
                            } catch (Throwable th9) {
                                S10 = AbstractC0293h.S(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            eVar.l(S10);
                            break;
                        case 9:
                            InterfaceC0111g interfaceC0111g11 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g11.c(list12, (C0112h) obj23);
                                S11 = X0.a.z(null);
                            } catch (Throwable th10) {
                                S11 = AbstractC0293h.S(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            eVar.l(S11);
                            break;
                        case 10:
                            InterfaceC0111g interfaceC0111g12 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S12 = X0.a.z(interfaceC0111g12.f(list14, (C0112h) obj24));
                            } catch (Throwable th11) {
                                S12 = AbstractC0293h.S(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            eVar.l(S12);
                            break;
                        case 11:
                            InterfaceC0111g interfaceC0111g13 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S13 = X0.a.z(interfaceC0111g13.h(list16, (C0112h) obj25));
                            } catch (Throwable th12) {
                                S13 = AbstractC0293h.S(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            eVar.l(S13);
                            break;
                        case 12:
                            InterfaceC0111g interfaceC0111g14 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g14.g(str12, str13, (C0112h) obj28);
                                S14 = X0.a.z(null);
                            } catch (Throwable th13) {
                                S14 = AbstractC0293h.S(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            eVar.l(S14);
                            break;
                        case 13:
                            InterfaceC0111g interfaceC0111g15 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g15.a(str14, longValue, (C0112h) obj31);
                                S15 = X0.a.z(null);
                            } catch (Throwable th14) {
                                S15 = AbstractC0293h.S(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            eVar.l(S15);
                            break;
                        default:
                            InterfaceC0111g interfaceC0111g16 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g16.j(str15, doubleValue, (C0112h) obj34);
                                S16 = X0.a.z(null);
                            } catch (Throwable th15) {
                                S16 = AbstractC0293h.S(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            eVar.l(S16);
                            break;
                    }
                }
            });
        } else {
            aVar3.g(null);
        }
        D0.a aVar4 = new D0.a(binaryMessenger, B0.c.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", concat), a(), j3);
        if (interfaceC0111g != null) {
            final int i6 = 14;
            aVar4.g(new T1.b() { // from class: a2.e
                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    List S2;
                    List S3;
                    List S4;
                    List S5;
                    List S6;
                    List S7;
                    List S8;
                    List S9;
                    List S10;
                    List S11;
                    List S12;
                    List S13;
                    List S14;
                    List S15;
                    List S16;
                    switch (i6) {
                        case 0:
                            InterfaceC0111g interfaceC0111g2 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g2.e(str2, str3, (C0112h) obj4);
                                S2 = X0.a.z(null);
                            } catch (Throwable th) {
                                S2 = AbstractC0293h.S(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            eVar.l(S2);
                            break;
                        case 1:
                            InterfaceC0111g interfaceC0111g3 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g3.k(str4, list3, (C0112h) obj7);
                                S3 = X0.a.z(null);
                            } catch (Throwable th2) {
                                S3 = AbstractC0293h.S(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            eVar.l(S3);
                            break;
                        case 2:
                            InterfaceC0111g interfaceC0111g4 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S4 = X0.a.z(interfaceC0111g4.r(str5, (C0112h) obj9));
                            } catch (Throwable th3) {
                                S4 = AbstractC0293h.S(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            eVar.l(S4);
                            break;
                        case 3:
                            InterfaceC0111g interfaceC0111g5 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S5 = X0.a.z(interfaceC0111g5.m(str6, (C0112h) obj11));
                            } catch (Throwable th4) {
                                S5 = AbstractC0293h.S(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            eVar.l(S5);
                            break;
                        case 4:
                            InterfaceC0111g interfaceC0111g6 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S6 = X0.a.z(interfaceC0111g6.d(str7, (C0112h) obj13));
                            } catch (Throwable th5) {
                                S6 = AbstractC0293h.S(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            eVar.l(S6);
                            break;
                        case 5:
                            InterfaceC0111g interfaceC0111g7 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S7 = X0.a.z(interfaceC0111g7.i(str8, (C0112h) obj15));
                            } catch (Throwable th6) {
                                S7 = AbstractC0293h.S(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            eVar.l(S7);
                            break;
                        case 6:
                            InterfaceC0111g interfaceC0111g8 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g8.q(str9, booleanValue, (C0112h) obj18);
                                S8 = X0.a.z(null);
                            } catch (Throwable th7) {
                                S8 = AbstractC0293h.S(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            eVar.l(S8);
                            break;
                        case 7:
                            InterfaceC0111g interfaceC0111g9 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S9 = X0.a.z(interfaceC0111g9.n(str10, (C0112h) obj20));
                            } catch (Throwable th8) {
                                S9 = AbstractC0293h.S(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            eVar.l(S9);
                            break;
                        case 8:
                            InterfaceC0111g interfaceC0111g10 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S10 = X0.a.z(interfaceC0111g10.b(str11, (C0112h) obj22));
                            } catch (Throwable th9) {
                                S10 = AbstractC0293h.S(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            eVar.l(S10);
                            break;
                        case 9:
                            InterfaceC0111g interfaceC0111g11 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g11.c(list12, (C0112h) obj23);
                                S11 = X0.a.z(null);
                            } catch (Throwable th10) {
                                S11 = AbstractC0293h.S(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            eVar.l(S11);
                            break;
                        case 10:
                            InterfaceC0111g interfaceC0111g12 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S12 = X0.a.z(interfaceC0111g12.f(list14, (C0112h) obj24));
                            } catch (Throwable th11) {
                                S12 = AbstractC0293h.S(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            eVar.l(S12);
                            break;
                        case 11:
                            InterfaceC0111g interfaceC0111g13 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S13 = X0.a.z(interfaceC0111g13.h(list16, (C0112h) obj25));
                            } catch (Throwable th12) {
                                S13 = AbstractC0293h.S(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            eVar.l(S13);
                            break;
                        case 12:
                            InterfaceC0111g interfaceC0111g14 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g14.g(str12, str13, (C0112h) obj28);
                                S14 = X0.a.z(null);
                            } catch (Throwable th13) {
                                S14 = AbstractC0293h.S(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            eVar.l(S14);
                            break;
                        case 13:
                            InterfaceC0111g interfaceC0111g15 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g15.a(str14, longValue, (C0112h) obj31);
                                S15 = X0.a.z(null);
                            } catch (Throwable th14) {
                                S15 = AbstractC0293h.S(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            eVar.l(S15);
                            break;
                        default:
                            InterfaceC0111g interfaceC0111g16 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g16.j(str15, doubleValue, (C0112h) obj34);
                                S16 = X0.a.z(null);
                            } catch (Throwable th15) {
                                S16 = AbstractC0293h.S(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            eVar.l(S16);
                            break;
                    }
                }
            });
        } else {
            aVar4.g(null);
        }
        D0.a aVar5 = new D0.a(binaryMessenger, B0.c.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", concat), a(), j3);
        if (interfaceC0111g != null) {
            final int i7 = 0;
            aVar5.g(new T1.b() { // from class: a2.e
                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    List S2;
                    List S3;
                    List S4;
                    List S5;
                    List S6;
                    List S7;
                    List S8;
                    List S9;
                    List S10;
                    List S11;
                    List S12;
                    List S13;
                    List S14;
                    List S15;
                    List S16;
                    switch (i7) {
                        case 0:
                            InterfaceC0111g interfaceC0111g2 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g2.e(str2, str3, (C0112h) obj4);
                                S2 = X0.a.z(null);
                            } catch (Throwable th) {
                                S2 = AbstractC0293h.S(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            eVar.l(S2);
                            break;
                        case 1:
                            InterfaceC0111g interfaceC0111g3 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g3.k(str4, list3, (C0112h) obj7);
                                S3 = X0.a.z(null);
                            } catch (Throwable th2) {
                                S3 = AbstractC0293h.S(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            eVar.l(S3);
                            break;
                        case 2:
                            InterfaceC0111g interfaceC0111g4 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S4 = X0.a.z(interfaceC0111g4.r(str5, (C0112h) obj9));
                            } catch (Throwable th3) {
                                S4 = AbstractC0293h.S(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            eVar.l(S4);
                            break;
                        case 3:
                            InterfaceC0111g interfaceC0111g5 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S5 = X0.a.z(interfaceC0111g5.m(str6, (C0112h) obj11));
                            } catch (Throwable th4) {
                                S5 = AbstractC0293h.S(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            eVar.l(S5);
                            break;
                        case 4:
                            InterfaceC0111g interfaceC0111g6 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S6 = X0.a.z(interfaceC0111g6.d(str7, (C0112h) obj13));
                            } catch (Throwable th5) {
                                S6 = AbstractC0293h.S(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            eVar.l(S6);
                            break;
                        case 5:
                            InterfaceC0111g interfaceC0111g7 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S7 = X0.a.z(interfaceC0111g7.i(str8, (C0112h) obj15));
                            } catch (Throwable th6) {
                                S7 = AbstractC0293h.S(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            eVar.l(S7);
                            break;
                        case 6:
                            InterfaceC0111g interfaceC0111g8 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g8.q(str9, booleanValue, (C0112h) obj18);
                                S8 = X0.a.z(null);
                            } catch (Throwable th7) {
                                S8 = AbstractC0293h.S(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            eVar.l(S8);
                            break;
                        case 7:
                            InterfaceC0111g interfaceC0111g9 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S9 = X0.a.z(interfaceC0111g9.n(str10, (C0112h) obj20));
                            } catch (Throwable th8) {
                                S9 = AbstractC0293h.S(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            eVar.l(S9);
                            break;
                        case 8:
                            InterfaceC0111g interfaceC0111g10 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S10 = X0.a.z(interfaceC0111g10.b(str11, (C0112h) obj22));
                            } catch (Throwable th9) {
                                S10 = AbstractC0293h.S(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            eVar.l(S10);
                            break;
                        case 9:
                            InterfaceC0111g interfaceC0111g11 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g11.c(list12, (C0112h) obj23);
                                S11 = X0.a.z(null);
                            } catch (Throwable th10) {
                                S11 = AbstractC0293h.S(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            eVar.l(S11);
                            break;
                        case 10:
                            InterfaceC0111g interfaceC0111g12 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S12 = X0.a.z(interfaceC0111g12.f(list14, (C0112h) obj24));
                            } catch (Throwable th11) {
                                S12 = AbstractC0293h.S(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            eVar.l(S12);
                            break;
                        case 11:
                            InterfaceC0111g interfaceC0111g13 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S13 = X0.a.z(interfaceC0111g13.h(list16, (C0112h) obj25));
                            } catch (Throwable th12) {
                                S13 = AbstractC0293h.S(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            eVar.l(S13);
                            break;
                        case 12:
                            InterfaceC0111g interfaceC0111g14 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g14.g(str12, str13, (C0112h) obj28);
                                S14 = X0.a.z(null);
                            } catch (Throwable th13) {
                                S14 = AbstractC0293h.S(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            eVar.l(S14);
                            break;
                        case 13:
                            InterfaceC0111g interfaceC0111g15 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g15.a(str14, longValue, (C0112h) obj31);
                                S15 = X0.a.z(null);
                            } catch (Throwable th14) {
                                S15 = AbstractC0293h.S(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            eVar.l(S15);
                            break;
                        default:
                            InterfaceC0111g interfaceC0111g16 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g16.j(str15, doubleValue, (C0112h) obj34);
                                S16 = X0.a.z(null);
                            } catch (Throwable th15) {
                                S16 = AbstractC0293h.S(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            eVar.l(S16);
                            break;
                    }
                }
            });
        } else {
            aVar5.g(null);
        }
        D0.a aVar6 = new D0.a(binaryMessenger, B0.c.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", concat), a(), j3);
        if (interfaceC0111g != null) {
            final int i8 = 1;
            aVar6.g(new T1.b() { // from class: a2.e
                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    List S2;
                    List S3;
                    List S4;
                    List S5;
                    List S6;
                    List S7;
                    List S8;
                    List S9;
                    List S10;
                    List S11;
                    List S12;
                    List S13;
                    List S14;
                    List S15;
                    List S16;
                    switch (i8) {
                        case 0:
                            InterfaceC0111g interfaceC0111g2 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g2.e(str2, str3, (C0112h) obj4);
                                S2 = X0.a.z(null);
                            } catch (Throwable th) {
                                S2 = AbstractC0293h.S(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            eVar.l(S2);
                            break;
                        case 1:
                            InterfaceC0111g interfaceC0111g3 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g3.k(str4, list3, (C0112h) obj7);
                                S3 = X0.a.z(null);
                            } catch (Throwable th2) {
                                S3 = AbstractC0293h.S(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            eVar.l(S3);
                            break;
                        case 2:
                            InterfaceC0111g interfaceC0111g4 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S4 = X0.a.z(interfaceC0111g4.r(str5, (C0112h) obj9));
                            } catch (Throwable th3) {
                                S4 = AbstractC0293h.S(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            eVar.l(S4);
                            break;
                        case 3:
                            InterfaceC0111g interfaceC0111g5 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S5 = X0.a.z(interfaceC0111g5.m(str6, (C0112h) obj11));
                            } catch (Throwable th4) {
                                S5 = AbstractC0293h.S(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            eVar.l(S5);
                            break;
                        case 4:
                            InterfaceC0111g interfaceC0111g6 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S6 = X0.a.z(interfaceC0111g6.d(str7, (C0112h) obj13));
                            } catch (Throwable th5) {
                                S6 = AbstractC0293h.S(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            eVar.l(S6);
                            break;
                        case 5:
                            InterfaceC0111g interfaceC0111g7 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S7 = X0.a.z(interfaceC0111g7.i(str8, (C0112h) obj15));
                            } catch (Throwable th6) {
                                S7 = AbstractC0293h.S(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            eVar.l(S7);
                            break;
                        case 6:
                            InterfaceC0111g interfaceC0111g8 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g8.q(str9, booleanValue, (C0112h) obj18);
                                S8 = X0.a.z(null);
                            } catch (Throwable th7) {
                                S8 = AbstractC0293h.S(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            eVar.l(S8);
                            break;
                        case 7:
                            InterfaceC0111g interfaceC0111g9 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S9 = X0.a.z(interfaceC0111g9.n(str10, (C0112h) obj20));
                            } catch (Throwable th8) {
                                S9 = AbstractC0293h.S(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            eVar.l(S9);
                            break;
                        case 8:
                            InterfaceC0111g interfaceC0111g10 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S10 = X0.a.z(interfaceC0111g10.b(str11, (C0112h) obj22));
                            } catch (Throwable th9) {
                                S10 = AbstractC0293h.S(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            eVar.l(S10);
                            break;
                        case 9:
                            InterfaceC0111g interfaceC0111g11 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g11.c(list12, (C0112h) obj23);
                                S11 = X0.a.z(null);
                            } catch (Throwable th10) {
                                S11 = AbstractC0293h.S(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            eVar.l(S11);
                            break;
                        case 10:
                            InterfaceC0111g interfaceC0111g12 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S12 = X0.a.z(interfaceC0111g12.f(list14, (C0112h) obj24));
                            } catch (Throwable th11) {
                                S12 = AbstractC0293h.S(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            eVar.l(S12);
                            break;
                        case 11:
                            InterfaceC0111g interfaceC0111g13 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S13 = X0.a.z(interfaceC0111g13.h(list16, (C0112h) obj25));
                            } catch (Throwable th12) {
                                S13 = AbstractC0293h.S(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            eVar.l(S13);
                            break;
                        case 12:
                            InterfaceC0111g interfaceC0111g14 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g14.g(str12, str13, (C0112h) obj28);
                                S14 = X0.a.z(null);
                            } catch (Throwable th13) {
                                S14 = AbstractC0293h.S(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            eVar.l(S14);
                            break;
                        case 13:
                            InterfaceC0111g interfaceC0111g15 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g15.a(str14, longValue, (C0112h) obj31);
                                S15 = X0.a.z(null);
                            } catch (Throwable th14) {
                                S15 = AbstractC0293h.S(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            eVar.l(S15);
                            break;
                        default:
                            InterfaceC0111g interfaceC0111g16 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g16.j(str15, doubleValue, (C0112h) obj34);
                                S16 = X0.a.z(null);
                            } catch (Throwable th15) {
                                S16 = AbstractC0293h.S(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            eVar.l(S16);
                            break;
                    }
                }
            });
        } else {
            aVar6.g(null);
        }
        D0.a aVar7 = new D0.a(binaryMessenger, B0.c.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", concat), a(), j3);
        if (interfaceC0111g != null) {
            final int i9 = 2;
            aVar7.g(new T1.b() { // from class: a2.e
                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    List S2;
                    List S3;
                    List S4;
                    List S5;
                    List S6;
                    List S7;
                    List S8;
                    List S9;
                    List S10;
                    List S11;
                    List S12;
                    List S13;
                    List S14;
                    List S15;
                    List S16;
                    switch (i9) {
                        case 0:
                            InterfaceC0111g interfaceC0111g2 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g2.e(str2, str3, (C0112h) obj4);
                                S2 = X0.a.z(null);
                            } catch (Throwable th) {
                                S2 = AbstractC0293h.S(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            eVar.l(S2);
                            break;
                        case 1:
                            InterfaceC0111g interfaceC0111g3 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g3.k(str4, list3, (C0112h) obj7);
                                S3 = X0.a.z(null);
                            } catch (Throwable th2) {
                                S3 = AbstractC0293h.S(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            eVar.l(S3);
                            break;
                        case 2:
                            InterfaceC0111g interfaceC0111g4 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S4 = X0.a.z(interfaceC0111g4.r(str5, (C0112h) obj9));
                            } catch (Throwable th3) {
                                S4 = AbstractC0293h.S(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            eVar.l(S4);
                            break;
                        case 3:
                            InterfaceC0111g interfaceC0111g5 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S5 = X0.a.z(interfaceC0111g5.m(str6, (C0112h) obj11));
                            } catch (Throwable th4) {
                                S5 = AbstractC0293h.S(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            eVar.l(S5);
                            break;
                        case 4:
                            InterfaceC0111g interfaceC0111g6 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S6 = X0.a.z(interfaceC0111g6.d(str7, (C0112h) obj13));
                            } catch (Throwable th5) {
                                S6 = AbstractC0293h.S(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            eVar.l(S6);
                            break;
                        case 5:
                            InterfaceC0111g interfaceC0111g7 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S7 = X0.a.z(interfaceC0111g7.i(str8, (C0112h) obj15));
                            } catch (Throwable th6) {
                                S7 = AbstractC0293h.S(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            eVar.l(S7);
                            break;
                        case 6:
                            InterfaceC0111g interfaceC0111g8 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g8.q(str9, booleanValue, (C0112h) obj18);
                                S8 = X0.a.z(null);
                            } catch (Throwable th7) {
                                S8 = AbstractC0293h.S(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            eVar.l(S8);
                            break;
                        case 7:
                            InterfaceC0111g interfaceC0111g9 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S9 = X0.a.z(interfaceC0111g9.n(str10, (C0112h) obj20));
                            } catch (Throwable th8) {
                                S9 = AbstractC0293h.S(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            eVar.l(S9);
                            break;
                        case 8:
                            InterfaceC0111g interfaceC0111g10 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S10 = X0.a.z(interfaceC0111g10.b(str11, (C0112h) obj22));
                            } catch (Throwable th9) {
                                S10 = AbstractC0293h.S(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            eVar.l(S10);
                            break;
                        case 9:
                            InterfaceC0111g interfaceC0111g11 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g11.c(list12, (C0112h) obj23);
                                S11 = X0.a.z(null);
                            } catch (Throwable th10) {
                                S11 = AbstractC0293h.S(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            eVar.l(S11);
                            break;
                        case 10:
                            InterfaceC0111g interfaceC0111g12 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S12 = X0.a.z(interfaceC0111g12.f(list14, (C0112h) obj24));
                            } catch (Throwable th11) {
                                S12 = AbstractC0293h.S(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            eVar.l(S12);
                            break;
                        case 11:
                            InterfaceC0111g interfaceC0111g13 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S13 = X0.a.z(interfaceC0111g13.h(list16, (C0112h) obj25));
                            } catch (Throwable th12) {
                                S13 = AbstractC0293h.S(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            eVar.l(S13);
                            break;
                        case 12:
                            InterfaceC0111g interfaceC0111g14 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g14.g(str12, str13, (C0112h) obj28);
                                S14 = X0.a.z(null);
                            } catch (Throwable th13) {
                                S14 = AbstractC0293h.S(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            eVar.l(S14);
                            break;
                        case 13:
                            InterfaceC0111g interfaceC0111g15 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g15.a(str14, longValue, (C0112h) obj31);
                                S15 = X0.a.z(null);
                            } catch (Throwable th14) {
                                S15 = AbstractC0293h.S(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            eVar.l(S15);
                            break;
                        default:
                            InterfaceC0111g interfaceC0111g16 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g16.j(str15, doubleValue, (C0112h) obj34);
                                S16 = X0.a.z(null);
                            } catch (Throwable th15) {
                                S16 = AbstractC0293h.S(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            eVar.l(S16);
                            break;
                    }
                }
            });
        } else {
            aVar7.g(null);
        }
        D0.a aVar8 = new D0.a(binaryMessenger, B0.c.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", concat), a(), j3);
        if (interfaceC0111g != null) {
            final int i10 = 3;
            aVar8.g(new T1.b() { // from class: a2.e
                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    List S2;
                    List S3;
                    List S4;
                    List S5;
                    List S6;
                    List S7;
                    List S8;
                    List S9;
                    List S10;
                    List S11;
                    List S12;
                    List S13;
                    List S14;
                    List S15;
                    List S16;
                    switch (i10) {
                        case 0:
                            InterfaceC0111g interfaceC0111g2 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g2.e(str2, str3, (C0112h) obj4);
                                S2 = X0.a.z(null);
                            } catch (Throwable th) {
                                S2 = AbstractC0293h.S(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            eVar.l(S2);
                            break;
                        case 1:
                            InterfaceC0111g interfaceC0111g3 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g3.k(str4, list3, (C0112h) obj7);
                                S3 = X0.a.z(null);
                            } catch (Throwable th2) {
                                S3 = AbstractC0293h.S(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            eVar.l(S3);
                            break;
                        case 2:
                            InterfaceC0111g interfaceC0111g4 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S4 = X0.a.z(interfaceC0111g4.r(str5, (C0112h) obj9));
                            } catch (Throwable th3) {
                                S4 = AbstractC0293h.S(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            eVar.l(S4);
                            break;
                        case 3:
                            InterfaceC0111g interfaceC0111g5 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S5 = X0.a.z(interfaceC0111g5.m(str6, (C0112h) obj11));
                            } catch (Throwable th4) {
                                S5 = AbstractC0293h.S(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            eVar.l(S5);
                            break;
                        case 4:
                            InterfaceC0111g interfaceC0111g6 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S6 = X0.a.z(interfaceC0111g6.d(str7, (C0112h) obj13));
                            } catch (Throwable th5) {
                                S6 = AbstractC0293h.S(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            eVar.l(S6);
                            break;
                        case 5:
                            InterfaceC0111g interfaceC0111g7 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S7 = X0.a.z(interfaceC0111g7.i(str8, (C0112h) obj15));
                            } catch (Throwable th6) {
                                S7 = AbstractC0293h.S(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            eVar.l(S7);
                            break;
                        case 6:
                            InterfaceC0111g interfaceC0111g8 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g8.q(str9, booleanValue, (C0112h) obj18);
                                S8 = X0.a.z(null);
                            } catch (Throwable th7) {
                                S8 = AbstractC0293h.S(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            eVar.l(S8);
                            break;
                        case 7:
                            InterfaceC0111g interfaceC0111g9 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S9 = X0.a.z(interfaceC0111g9.n(str10, (C0112h) obj20));
                            } catch (Throwable th8) {
                                S9 = AbstractC0293h.S(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            eVar.l(S9);
                            break;
                        case 8:
                            InterfaceC0111g interfaceC0111g10 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S10 = X0.a.z(interfaceC0111g10.b(str11, (C0112h) obj22));
                            } catch (Throwable th9) {
                                S10 = AbstractC0293h.S(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            eVar.l(S10);
                            break;
                        case 9:
                            InterfaceC0111g interfaceC0111g11 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g11.c(list12, (C0112h) obj23);
                                S11 = X0.a.z(null);
                            } catch (Throwable th10) {
                                S11 = AbstractC0293h.S(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            eVar.l(S11);
                            break;
                        case 10:
                            InterfaceC0111g interfaceC0111g12 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S12 = X0.a.z(interfaceC0111g12.f(list14, (C0112h) obj24));
                            } catch (Throwable th11) {
                                S12 = AbstractC0293h.S(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            eVar.l(S12);
                            break;
                        case 11:
                            InterfaceC0111g interfaceC0111g13 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S13 = X0.a.z(interfaceC0111g13.h(list16, (C0112h) obj25));
                            } catch (Throwable th12) {
                                S13 = AbstractC0293h.S(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            eVar.l(S13);
                            break;
                        case 12:
                            InterfaceC0111g interfaceC0111g14 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g14.g(str12, str13, (C0112h) obj28);
                                S14 = X0.a.z(null);
                            } catch (Throwable th13) {
                                S14 = AbstractC0293h.S(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            eVar.l(S14);
                            break;
                        case 13:
                            InterfaceC0111g interfaceC0111g15 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g15.a(str14, longValue, (C0112h) obj31);
                                S15 = X0.a.z(null);
                            } catch (Throwable th14) {
                                S15 = AbstractC0293h.S(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            eVar.l(S15);
                            break;
                        default:
                            InterfaceC0111g interfaceC0111g16 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g16.j(str15, doubleValue, (C0112h) obj34);
                                S16 = X0.a.z(null);
                            } catch (Throwable th15) {
                                S16 = AbstractC0293h.S(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            eVar.l(S16);
                            break;
                    }
                }
            });
        } else {
            aVar8.g(null);
        }
        D0.a aVar9 = new D0.a(binaryMessenger, B0.c.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", concat), a(), j3);
        if (interfaceC0111g != null) {
            final int i11 = 4;
            aVar9.g(new T1.b() { // from class: a2.e
                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    List S2;
                    List S3;
                    List S4;
                    List S5;
                    List S6;
                    List S7;
                    List S8;
                    List S9;
                    List S10;
                    List S11;
                    List S12;
                    List S13;
                    List S14;
                    List S15;
                    List S16;
                    switch (i11) {
                        case 0:
                            InterfaceC0111g interfaceC0111g2 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g2.e(str2, str3, (C0112h) obj4);
                                S2 = X0.a.z(null);
                            } catch (Throwable th) {
                                S2 = AbstractC0293h.S(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            eVar.l(S2);
                            break;
                        case 1:
                            InterfaceC0111g interfaceC0111g3 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g3.k(str4, list3, (C0112h) obj7);
                                S3 = X0.a.z(null);
                            } catch (Throwable th2) {
                                S3 = AbstractC0293h.S(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            eVar.l(S3);
                            break;
                        case 2:
                            InterfaceC0111g interfaceC0111g4 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S4 = X0.a.z(interfaceC0111g4.r(str5, (C0112h) obj9));
                            } catch (Throwable th3) {
                                S4 = AbstractC0293h.S(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            eVar.l(S4);
                            break;
                        case 3:
                            InterfaceC0111g interfaceC0111g5 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S5 = X0.a.z(interfaceC0111g5.m(str6, (C0112h) obj11));
                            } catch (Throwable th4) {
                                S5 = AbstractC0293h.S(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            eVar.l(S5);
                            break;
                        case 4:
                            InterfaceC0111g interfaceC0111g6 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S6 = X0.a.z(interfaceC0111g6.d(str7, (C0112h) obj13));
                            } catch (Throwable th5) {
                                S6 = AbstractC0293h.S(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            eVar.l(S6);
                            break;
                        case 5:
                            InterfaceC0111g interfaceC0111g7 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S7 = X0.a.z(interfaceC0111g7.i(str8, (C0112h) obj15));
                            } catch (Throwable th6) {
                                S7 = AbstractC0293h.S(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            eVar.l(S7);
                            break;
                        case 6:
                            InterfaceC0111g interfaceC0111g8 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g8.q(str9, booleanValue, (C0112h) obj18);
                                S8 = X0.a.z(null);
                            } catch (Throwable th7) {
                                S8 = AbstractC0293h.S(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            eVar.l(S8);
                            break;
                        case 7:
                            InterfaceC0111g interfaceC0111g9 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S9 = X0.a.z(interfaceC0111g9.n(str10, (C0112h) obj20));
                            } catch (Throwable th8) {
                                S9 = AbstractC0293h.S(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            eVar.l(S9);
                            break;
                        case 8:
                            InterfaceC0111g interfaceC0111g10 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S10 = X0.a.z(interfaceC0111g10.b(str11, (C0112h) obj22));
                            } catch (Throwable th9) {
                                S10 = AbstractC0293h.S(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            eVar.l(S10);
                            break;
                        case 9:
                            InterfaceC0111g interfaceC0111g11 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g11.c(list12, (C0112h) obj23);
                                S11 = X0.a.z(null);
                            } catch (Throwable th10) {
                                S11 = AbstractC0293h.S(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            eVar.l(S11);
                            break;
                        case 10:
                            InterfaceC0111g interfaceC0111g12 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S12 = X0.a.z(interfaceC0111g12.f(list14, (C0112h) obj24));
                            } catch (Throwable th11) {
                                S12 = AbstractC0293h.S(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            eVar.l(S12);
                            break;
                        case 11:
                            InterfaceC0111g interfaceC0111g13 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S13 = X0.a.z(interfaceC0111g13.h(list16, (C0112h) obj25));
                            } catch (Throwable th12) {
                                S13 = AbstractC0293h.S(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            eVar.l(S13);
                            break;
                        case 12:
                            InterfaceC0111g interfaceC0111g14 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g14.g(str12, str13, (C0112h) obj28);
                                S14 = X0.a.z(null);
                            } catch (Throwable th13) {
                                S14 = AbstractC0293h.S(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            eVar.l(S14);
                            break;
                        case 13:
                            InterfaceC0111g interfaceC0111g15 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g15.a(str14, longValue, (C0112h) obj31);
                                S15 = X0.a.z(null);
                            } catch (Throwable th14) {
                                S15 = AbstractC0293h.S(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            eVar.l(S15);
                            break;
                        default:
                            InterfaceC0111g interfaceC0111g16 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g16.j(str15, doubleValue, (C0112h) obj34);
                                S16 = X0.a.z(null);
                            } catch (Throwable th15) {
                                S16 = AbstractC0293h.S(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            eVar.l(S16);
                            break;
                    }
                }
            });
        } else {
            aVar9.g(null);
        }
        D0.a aVar10 = new D0.a(binaryMessenger, B0.c.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", concat), a(), j3);
        if (interfaceC0111g != null) {
            final int i12 = 5;
            aVar10.g(new T1.b() { // from class: a2.e
                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    List S2;
                    List S3;
                    List S4;
                    List S5;
                    List S6;
                    List S7;
                    List S8;
                    List S9;
                    List S10;
                    List S11;
                    List S12;
                    List S13;
                    List S14;
                    List S15;
                    List S16;
                    switch (i12) {
                        case 0:
                            InterfaceC0111g interfaceC0111g2 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g2.e(str2, str3, (C0112h) obj4);
                                S2 = X0.a.z(null);
                            } catch (Throwable th) {
                                S2 = AbstractC0293h.S(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            eVar.l(S2);
                            break;
                        case 1:
                            InterfaceC0111g interfaceC0111g3 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g3.k(str4, list3, (C0112h) obj7);
                                S3 = X0.a.z(null);
                            } catch (Throwable th2) {
                                S3 = AbstractC0293h.S(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            eVar.l(S3);
                            break;
                        case 2:
                            InterfaceC0111g interfaceC0111g4 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S4 = X0.a.z(interfaceC0111g4.r(str5, (C0112h) obj9));
                            } catch (Throwable th3) {
                                S4 = AbstractC0293h.S(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            eVar.l(S4);
                            break;
                        case 3:
                            InterfaceC0111g interfaceC0111g5 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S5 = X0.a.z(interfaceC0111g5.m(str6, (C0112h) obj11));
                            } catch (Throwable th4) {
                                S5 = AbstractC0293h.S(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            eVar.l(S5);
                            break;
                        case 4:
                            InterfaceC0111g interfaceC0111g6 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S6 = X0.a.z(interfaceC0111g6.d(str7, (C0112h) obj13));
                            } catch (Throwable th5) {
                                S6 = AbstractC0293h.S(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            eVar.l(S6);
                            break;
                        case 5:
                            InterfaceC0111g interfaceC0111g7 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S7 = X0.a.z(interfaceC0111g7.i(str8, (C0112h) obj15));
                            } catch (Throwable th6) {
                                S7 = AbstractC0293h.S(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            eVar.l(S7);
                            break;
                        case 6:
                            InterfaceC0111g interfaceC0111g8 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g8.q(str9, booleanValue, (C0112h) obj18);
                                S8 = X0.a.z(null);
                            } catch (Throwable th7) {
                                S8 = AbstractC0293h.S(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            eVar.l(S8);
                            break;
                        case 7:
                            InterfaceC0111g interfaceC0111g9 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S9 = X0.a.z(interfaceC0111g9.n(str10, (C0112h) obj20));
                            } catch (Throwable th8) {
                                S9 = AbstractC0293h.S(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            eVar.l(S9);
                            break;
                        case 8:
                            InterfaceC0111g interfaceC0111g10 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S10 = X0.a.z(interfaceC0111g10.b(str11, (C0112h) obj22));
                            } catch (Throwable th9) {
                                S10 = AbstractC0293h.S(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            eVar.l(S10);
                            break;
                        case 9:
                            InterfaceC0111g interfaceC0111g11 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g11.c(list12, (C0112h) obj23);
                                S11 = X0.a.z(null);
                            } catch (Throwable th10) {
                                S11 = AbstractC0293h.S(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            eVar.l(S11);
                            break;
                        case 10:
                            InterfaceC0111g interfaceC0111g12 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S12 = X0.a.z(interfaceC0111g12.f(list14, (C0112h) obj24));
                            } catch (Throwable th11) {
                                S12 = AbstractC0293h.S(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            eVar.l(S12);
                            break;
                        case 11:
                            InterfaceC0111g interfaceC0111g13 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S13 = X0.a.z(interfaceC0111g13.h(list16, (C0112h) obj25));
                            } catch (Throwable th12) {
                                S13 = AbstractC0293h.S(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            eVar.l(S13);
                            break;
                        case 12:
                            InterfaceC0111g interfaceC0111g14 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g14.g(str12, str13, (C0112h) obj28);
                                S14 = X0.a.z(null);
                            } catch (Throwable th13) {
                                S14 = AbstractC0293h.S(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            eVar.l(S14);
                            break;
                        case 13:
                            InterfaceC0111g interfaceC0111g15 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g15.a(str14, longValue, (C0112h) obj31);
                                S15 = X0.a.z(null);
                            } catch (Throwable th14) {
                                S15 = AbstractC0293h.S(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            eVar.l(S15);
                            break;
                        default:
                            InterfaceC0111g interfaceC0111g16 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g16.j(str15, doubleValue, (C0112h) obj34);
                                S16 = X0.a.z(null);
                            } catch (Throwable th15) {
                                S16 = AbstractC0293h.S(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            eVar.l(S16);
                            break;
                    }
                }
            });
        } else {
            aVar10.g(null);
        }
        D0.a aVar11 = new D0.a(binaryMessenger, B0.c.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", concat), a(), j3);
        if (interfaceC0111g != null) {
            final int i13 = 7;
            aVar11.g(new T1.b() { // from class: a2.e
                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    List S2;
                    List S3;
                    List S4;
                    List S5;
                    List S6;
                    List S7;
                    List S8;
                    List S9;
                    List S10;
                    List S11;
                    List S12;
                    List S13;
                    List S14;
                    List S15;
                    List S16;
                    switch (i13) {
                        case 0:
                            InterfaceC0111g interfaceC0111g2 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g2.e(str2, str3, (C0112h) obj4);
                                S2 = X0.a.z(null);
                            } catch (Throwable th) {
                                S2 = AbstractC0293h.S(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            eVar.l(S2);
                            break;
                        case 1:
                            InterfaceC0111g interfaceC0111g3 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g3.k(str4, list3, (C0112h) obj7);
                                S3 = X0.a.z(null);
                            } catch (Throwable th2) {
                                S3 = AbstractC0293h.S(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            eVar.l(S3);
                            break;
                        case 2:
                            InterfaceC0111g interfaceC0111g4 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S4 = X0.a.z(interfaceC0111g4.r(str5, (C0112h) obj9));
                            } catch (Throwable th3) {
                                S4 = AbstractC0293h.S(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            eVar.l(S4);
                            break;
                        case 3:
                            InterfaceC0111g interfaceC0111g5 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S5 = X0.a.z(interfaceC0111g5.m(str6, (C0112h) obj11));
                            } catch (Throwable th4) {
                                S5 = AbstractC0293h.S(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            eVar.l(S5);
                            break;
                        case 4:
                            InterfaceC0111g interfaceC0111g6 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S6 = X0.a.z(interfaceC0111g6.d(str7, (C0112h) obj13));
                            } catch (Throwable th5) {
                                S6 = AbstractC0293h.S(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            eVar.l(S6);
                            break;
                        case 5:
                            InterfaceC0111g interfaceC0111g7 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S7 = X0.a.z(interfaceC0111g7.i(str8, (C0112h) obj15));
                            } catch (Throwable th6) {
                                S7 = AbstractC0293h.S(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            eVar.l(S7);
                            break;
                        case 6:
                            InterfaceC0111g interfaceC0111g8 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g8.q(str9, booleanValue, (C0112h) obj18);
                                S8 = X0.a.z(null);
                            } catch (Throwable th7) {
                                S8 = AbstractC0293h.S(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            eVar.l(S8);
                            break;
                        case 7:
                            InterfaceC0111g interfaceC0111g9 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S9 = X0.a.z(interfaceC0111g9.n(str10, (C0112h) obj20));
                            } catch (Throwable th8) {
                                S9 = AbstractC0293h.S(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            eVar.l(S9);
                            break;
                        case 8:
                            InterfaceC0111g interfaceC0111g10 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S10 = X0.a.z(interfaceC0111g10.b(str11, (C0112h) obj22));
                            } catch (Throwable th9) {
                                S10 = AbstractC0293h.S(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            eVar.l(S10);
                            break;
                        case 9:
                            InterfaceC0111g interfaceC0111g11 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g11.c(list12, (C0112h) obj23);
                                S11 = X0.a.z(null);
                            } catch (Throwable th10) {
                                S11 = AbstractC0293h.S(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            eVar.l(S11);
                            break;
                        case 10:
                            InterfaceC0111g interfaceC0111g12 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S12 = X0.a.z(interfaceC0111g12.f(list14, (C0112h) obj24));
                            } catch (Throwable th11) {
                                S12 = AbstractC0293h.S(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            eVar.l(S12);
                            break;
                        case 11:
                            InterfaceC0111g interfaceC0111g13 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S13 = X0.a.z(interfaceC0111g13.h(list16, (C0112h) obj25));
                            } catch (Throwable th12) {
                                S13 = AbstractC0293h.S(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            eVar.l(S13);
                            break;
                        case 12:
                            InterfaceC0111g interfaceC0111g14 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g14.g(str12, str13, (C0112h) obj28);
                                S14 = X0.a.z(null);
                            } catch (Throwable th13) {
                                S14 = AbstractC0293h.S(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            eVar.l(S14);
                            break;
                        case 13:
                            InterfaceC0111g interfaceC0111g15 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g15.a(str14, longValue, (C0112h) obj31);
                                S15 = X0.a.z(null);
                            } catch (Throwable th14) {
                                S15 = AbstractC0293h.S(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            eVar.l(S15);
                            break;
                        default:
                            InterfaceC0111g interfaceC0111g16 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g16.j(str15, doubleValue, (C0112h) obj34);
                                S16 = X0.a.z(null);
                            } catch (Throwable th15) {
                                S16 = AbstractC0293h.S(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            eVar.l(S16);
                            break;
                    }
                }
            });
        } else {
            aVar11.g(null);
        }
        D0.a aVar12 = new D0.a(binaryMessenger, B0.c.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", concat), a(), j3);
        if (interfaceC0111g != null) {
            final int i14 = 8;
            aVar12.g(new T1.b() { // from class: a2.e
                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    List S2;
                    List S3;
                    List S4;
                    List S5;
                    List S6;
                    List S7;
                    List S8;
                    List S9;
                    List S10;
                    List S11;
                    List S12;
                    List S13;
                    List S14;
                    List S15;
                    List S16;
                    switch (i14) {
                        case 0:
                            InterfaceC0111g interfaceC0111g2 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g2.e(str2, str3, (C0112h) obj4);
                                S2 = X0.a.z(null);
                            } catch (Throwable th) {
                                S2 = AbstractC0293h.S(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            eVar.l(S2);
                            break;
                        case 1:
                            InterfaceC0111g interfaceC0111g3 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g3.k(str4, list3, (C0112h) obj7);
                                S3 = X0.a.z(null);
                            } catch (Throwable th2) {
                                S3 = AbstractC0293h.S(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            eVar.l(S3);
                            break;
                        case 2:
                            InterfaceC0111g interfaceC0111g4 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S4 = X0.a.z(interfaceC0111g4.r(str5, (C0112h) obj9));
                            } catch (Throwable th3) {
                                S4 = AbstractC0293h.S(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            eVar.l(S4);
                            break;
                        case 3:
                            InterfaceC0111g interfaceC0111g5 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S5 = X0.a.z(interfaceC0111g5.m(str6, (C0112h) obj11));
                            } catch (Throwable th4) {
                                S5 = AbstractC0293h.S(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            eVar.l(S5);
                            break;
                        case 4:
                            InterfaceC0111g interfaceC0111g6 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S6 = X0.a.z(interfaceC0111g6.d(str7, (C0112h) obj13));
                            } catch (Throwable th5) {
                                S6 = AbstractC0293h.S(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            eVar.l(S6);
                            break;
                        case 5:
                            InterfaceC0111g interfaceC0111g7 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S7 = X0.a.z(interfaceC0111g7.i(str8, (C0112h) obj15));
                            } catch (Throwable th6) {
                                S7 = AbstractC0293h.S(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            eVar.l(S7);
                            break;
                        case 6:
                            InterfaceC0111g interfaceC0111g8 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g8.q(str9, booleanValue, (C0112h) obj18);
                                S8 = X0.a.z(null);
                            } catch (Throwable th7) {
                                S8 = AbstractC0293h.S(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            eVar.l(S8);
                            break;
                        case 7:
                            InterfaceC0111g interfaceC0111g9 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S9 = X0.a.z(interfaceC0111g9.n(str10, (C0112h) obj20));
                            } catch (Throwable th8) {
                                S9 = AbstractC0293h.S(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            eVar.l(S9);
                            break;
                        case 8:
                            InterfaceC0111g interfaceC0111g10 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S10 = X0.a.z(interfaceC0111g10.b(str11, (C0112h) obj22));
                            } catch (Throwable th9) {
                                S10 = AbstractC0293h.S(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            eVar.l(S10);
                            break;
                        case 9:
                            InterfaceC0111g interfaceC0111g11 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g11.c(list12, (C0112h) obj23);
                                S11 = X0.a.z(null);
                            } catch (Throwable th10) {
                                S11 = AbstractC0293h.S(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            eVar.l(S11);
                            break;
                        case 10:
                            InterfaceC0111g interfaceC0111g12 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S12 = X0.a.z(interfaceC0111g12.f(list14, (C0112h) obj24));
                            } catch (Throwable th11) {
                                S12 = AbstractC0293h.S(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            eVar.l(S12);
                            break;
                        case 11:
                            InterfaceC0111g interfaceC0111g13 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S13 = X0.a.z(interfaceC0111g13.h(list16, (C0112h) obj25));
                            } catch (Throwable th12) {
                                S13 = AbstractC0293h.S(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            eVar.l(S13);
                            break;
                        case 12:
                            InterfaceC0111g interfaceC0111g14 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g14.g(str12, str13, (C0112h) obj28);
                                S14 = X0.a.z(null);
                            } catch (Throwable th13) {
                                S14 = AbstractC0293h.S(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            eVar.l(S14);
                            break;
                        case 13:
                            InterfaceC0111g interfaceC0111g15 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g15.a(str14, longValue, (C0112h) obj31);
                                S15 = X0.a.z(null);
                            } catch (Throwable th14) {
                                S15 = AbstractC0293h.S(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            eVar.l(S15);
                            break;
                        default:
                            InterfaceC0111g interfaceC0111g16 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g16.j(str15, doubleValue, (C0112h) obj34);
                                S16 = X0.a.z(null);
                            } catch (Throwable th15) {
                                S16 = AbstractC0293h.S(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            eVar.l(S16);
                            break;
                    }
                }
            });
        } else {
            aVar12.g(null);
        }
        D0.a aVar13 = new D0.a(binaryMessenger, B0.c.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", concat), a(), j3);
        if (interfaceC0111g != null) {
            final int i15 = 9;
            aVar13.g(new T1.b() { // from class: a2.e
                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    List S2;
                    List S3;
                    List S4;
                    List S5;
                    List S6;
                    List S7;
                    List S8;
                    List S9;
                    List S10;
                    List S11;
                    List S12;
                    List S13;
                    List S14;
                    List S15;
                    List S16;
                    switch (i15) {
                        case 0:
                            InterfaceC0111g interfaceC0111g2 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g2.e(str2, str3, (C0112h) obj4);
                                S2 = X0.a.z(null);
                            } catch (Throwable th) {
                                S2 = AbstractC0293h.S(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            eVar.l(S2);
                            break;
                        case 1:
                            InterfaceC0111g interfaceC0111g3 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g3.k(str4, list3, (C0112h) obj7);
                                S3 = X0.a.z(null);
                            } catch (Throwable th2) {
                                S3 = AbstractC0293h.S(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            eVar.l(S3);
                            break;
                        case 2:
                            InterfaceC0111g interfaceC0111g4 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S4 = X0.a.z(interfaceC0111g4.r(str5, (C0112h) obj9));
                            } catch (Throwable th3) {
                                S4 = AbstractC0293h.S(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            eVar.l(S4);
                            break;
                        case 3:
                            InterfaceC0111g interfaceC0111g5 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S5 = X0.a.z(interfaceC0111g5.m(str6, (C0112h) obj11));
                            } catch (Throwable th4) {
                                S5 = AbstractC0293h.S(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            eVar.l(S5);
                            break;
                        case 4:
                            InterfaceC0111g interfaceC0111g6 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S6 = X0.a.z(interfaceC0111g6.d(str7, (C0112h) obj13));
                            } catch (Throwable th5) {
                                S6 = AbstractC0293h.S(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            eVar.l(S6);
                            break;
                        case 5:
                            InterfaceC0111g interfaceC0111g7 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S7 = X0.a.z(interfaceC0111g7.i(str8, (C0112h) obj15));
                            } catch (Throwable th6) {
                                S7 = AbstractC0293h.S(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            eVar.l(S7);
                            break;
                        case 6:
                            InterfaceC0111g interfaceC0111g8 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g8.q(str9, booleanValue, (C0112h) obj18);
                                S8 = X0.a.z(null);
                            } catch (Throwable th7) {
                                S8 = AbstractC0293h.S(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            eVar.l(S8);
                            break;
                        case 7:
                            InterfaceC0111g interfaceC0111g9 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S9 = X0.a.z(interfaceC0111g9.n(str10, (C0112h) obj20));
                            } catch (Throwable th8) {
                                S9 = AbstractC0293h.S(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            eVar.l(S9);
                            break;
                        case 8:
                            InterfaceC0111g interfaceC0111g10 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S10 = X0.a.z(interfaceC0111g10.b(str11, (C0112h) obj22));
                            } catch (Throwable th9) {
                                S10 = AbstractC0293h.S(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            eVar.l(S10);
                            break;
                        case 9:
                            InterfaceC0111g interfaceC0111g11 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g11.c(list12, (C0112h) obj23);
                                S11 = X0.a.z(null);
                            } catch (Throwable th10) {
                                S11 = AbstractC0293h.S(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            eVar.l(S11);
                            break;
                        case 10:
                            InterfaceC0111g interfaceC0111g12 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S12 = X0.a.z(interfaceC0111g12.f(list14, (C0112h) obj24));
                            } catch (Throwable th11) {
                                S12 = AbstractC0293h.S(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            eVar.l(S12);
                            break;
                        case 11:
                            InterfaceC0111g interfaceC0111g13 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S13 = X0.a.z(interfaceC0111g13.h(list16, (C0112h) obj25));
                            } catch (Throwable th12) {
                                S13 = AbstractC0293h.S(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            eVar.l(S13);
                            break;
                        case 12:
                            InterfaceC0111g interfaceC0111g14 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g14.g(str12, str13, (C0112h) obj28);
                                S14 = X0.a.z(null);
                            } catch (Throwable th13) {
                                S14 = AbstractC0293h.S(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            eVar.l(S14);
                            break;
                        case 13:
                            InterfaceC0111g interfaceC0111g15 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g15.a(str14, longValue, (C0112h) obj31);
                                S15 = X0.a.z(null);
                            } catch (Throwable th14) {
                                S15 = AbstractC0293h.S(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            eVar.l(S15);
                            break;
                        default:
                            InterfaceC0111g interfaceC0111g16 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g16.j(str15, doubleValue, (C0112h) obj34);
                                S16 = X0.a.z(null);
                            } catch (Throwable th15) {
                                S16 = AbstractC0293h.S(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            eVar.l(S16);
                            break;
                    }
                }
            });
        } else {
            aVar13.g(null);
        }
        D0.a aVar14 = new D0.a(binaryMessenger, B0.c.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", concat), a(), j3);
        if (interfaceC0111g != null) {
            final int i16 = 10;
            aVar14.g(new T1.b() { // from class: a2.e
                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    List S2;
                    List S3;
                    List S4;
                    List S5;
                    List S6;
                    List S7;
                    List S8;
                    List S9;
                    List S10;
                    List S11;
                    List S12;
                    List S13;
                    List S14;
                    List S15;
                    List S16;
                    switch (i16) {
                        case 0:
                            InterfaceC0111g interfaceC0111g2 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g2.e(str2, str3, (C0112h) obj4);
                                S2 = X0.a.z(null);
                            } catch (Throwable th) {
                                S2 = AbstractC0293h.S(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            eVar.l(S2);
                            break;
                        case 1:
                            InterfaceC0111g interfaceC0111g3 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g3.k(str4, list3, (C0112h) obj7);
                                S3 = X0.a.z(null);
                            } catch (Throwable th2) {
                                S3 = AbstractC0293h.S(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            eVar.l(S3);
                            break;
                        case 2:
                            InterfaceC0111g interfaceC0111g4 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S4 = X0.a.z(interfaceC0111g4.r(str5, (C0112h) obj9));
                            } catch (Throwable th3) {
                                S4 = AbstractC0293h.S(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            eVar.l(S4);
                            break;
                        case 3:
                            InterfaceC0111g interfaceC0111g5 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S5 = X0.a.z(interfaceC0111g5.m(str6, (C0112h) obj11));
                            } catch (Throwable th4) {
                                S5 = AbstractC0293h.S(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            eVar.l(S5);
                            break;
                        case 4:
                            InterfaceC0111g interfaceC0111g6 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S6 = X0.a.z(interfaceC0111g6.d(str7, (C0112h) obj13));
                            } catch (Throwable th5) {
                                S6 = AbstractC0293h.S(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            eVar.l(S6);
                            break;
                        case 5:
                            InterfaceC0111g interfaceC0111g7 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S7 = X0.a.z(interfaceC0111g7.i(str8, (C0112h) obj15));
                            } catch (Throwable th6) {
                                S7 = AbstractC0293h.S(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            eVar.l(S7);
                            break;
                        case 6:
                            InterfaceC0111g interfaceC0111g8 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g8.q(str9, booleanValue, (C0112h) obj18);
                                S8 = X0.a.z(null);
                            } catch (Throwable th7) {
                                S8 = AbstractC0293h.S(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            eVar.l(S8);
                            break;
                        case 7:
                            InterfaceC0111g interfaceC0111g9 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S9 = X0.a.z(interfaceC0111g9.n(str10, (C0112h) obj20));
                            } catch (Throwable th8) {
                                S9 = AbstractC0293h.S(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            eVar.l(S9);
                            break;
                        case 8:
                            InterfaceC0111g interfaceC0111g10 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S10 = X0.a.z(interfaceC0111g10.b(str11, (C0112h) obj22));
                            } catch (Throwable th9) {
                                S10 = AbstractC0293h.S(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            eVar.l(S10);
                            break;
                        case 9:
                            InterfaceC0111g interfaceC0111g11 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g11.c(list12, (C0112h) obj23);
                                S11 = X0.a.z(null);
                            } catch (Throwable th10) {
                                S11 = AbstractC0293h.S(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            eVar.l(S11);
                            break;
                        case 10:
                            InterfaceC0111g interfaceC0111g12 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S12 = X0.a.z(interfaceC0111g12.f(list14, (C0112h) obj24));
                            } catch (Throwable th11) {
                                S12 = AbstractC0293h.S(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            eVar.l(S12);
                            break;
                        case 11:
                            InterfaceC0111g interfaceC0111g13 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S13 = X0.a.z(interfaceC0111g13.h(list16, (C0112h) obj25));
                            } catch (Throwable th12) {
                                S13 = AbstractC0293h.S(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            eVar.l(S13);
                            break;
                        case 12:
                            InterfaceC0111g interfaceC0111g14 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g14.g(str12, str13, (C0112h) obj28);
                                S14 = X0.a.z(null);
                            } catch (Throwable th13) {
                                S14 = AbstractC0293h.S(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            eVar.l(S14);
                            break;
                        case 13:
                            InterfaceC0111g interfaceC0111g15 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g15.a(str14, longValue, (C0112h) obj31);
                                S15 = X0.a.z(null);
                            } catch (Throwable th14) {
                                S15 = AbstractC0293h.S(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            eVar.l(S15);
                            break;
                        default:
                            InterfaceC0111g interfaceC0111g16 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g16.j(str15, doubleValue, (C0112h) obj34);
                                S16 = X0.a.z(null);
                            } catch (Throwable th15) {
                                S16 = AbstractC0293h.S(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            eVar.l(S16);
                            break;
                    }
                }
            });
        } else {
            aVar14.g(null);
        }
        D0.a aVar15 = new D0.a(binaryMessenger, B0.c.j("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", concat), a(), j3);
        if (interfaceC0111g == null) {
            aVar15.g(null);
        } else {
            final int i17 = 11;
            aVar15.g(new T1.b() { // from class: a2.e
                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    List S2;
                    List S3;
                    List S4;
                    List S5;
                    List S6;
                    List S7;
                    List S8;
                    List S9;
                    List S10;
                    List S11;
                    List S12;
                    List S13;
                    List S14;
                    List S15;
                    List S16;
                    switch (i17) {
                        case 0:
                            InterfaceC0111g interfaceC0111g2 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.j.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g2.e(str2, str3, (C0112h) obj4);
                                S2 = X0.a.z(null);
                            } catch (Throwable th) {
                                S2 = AbstractC0293h.S(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            eVar.l(S2);
                            break;
                        case 1:
                            InterfaceC0111g interfaceC0111g3 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.j.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.j.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g3.k(str4, list3, (C0112h) obj7);
                                S3 = X0.a.z(null);
                            } catch (Throwable th2) {
                                S3 = AbstractC0293h.S(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            eVar.l(S3);
                            break;
                        case 2:
                            InterfaceC0111g interfaceC0111g4 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.j.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.j.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S4 = X0.a.z(interfaceC0111g4.r(str5, (C0112h) obj9));
                            } catch (Throwable th3) {
                                S4 = AbstractC0293h.S(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            eVar.l(S4);
                            break;
                        case 3:
                            InterfaceC0111g interfaceC0111g5 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.j.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.j.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S5 = X0.a.z(interfaceC0111g5.m(str6, (C0112h) obj11));
                            } catch (Throwable th4) {
                                S5 = AbstractC0293h.S(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            eVar.l(S5);
                            break;
                        case 4:
                            InterfaceC0111g interfaceC0111g6 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.j.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.j.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S6 = X0.a.z(interfaceC0111g6.d(str7, (C0112h) obj13));
                            } catch (Throwable th5) {
                                S6 = AbstractC0293h.S(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            eVar.l(S6);
                            break;
                        case 5:
                            InterfaceC0111g interfaceC0111g7 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.j.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.j.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S7 = X0.a.z(interfaceC0111g7.i(str8, (C0112h) obj15));
                            } catch (Throwable th6) {
                                S7 = AbstractC0293h.S(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            eVar.l(S7);
                            break;
                        case 6:
                            InterfaceC0111g interfaceC0111g8 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.j.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.j.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.j.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g8.q(str9, booleanValue, (C0112h) obj18);
                                S8 = X0.a.z(null);
                            } catch (Throwable th7) {
                                S8 = AbstractC0293h.S(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            eVar.l(S8);
                            break;
                        case 7:
                            InterfaceC0111g interfaceC0111g9 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.j.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.j.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S9 = X0.a.z(interfaceC0111g9.n(str10, (C0112h) obj20));
                            } catch (Throwable th8) {
                                S9 = AbstractC0293h.S(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            eVar.l(S9);
                            break;
                        case 8:
                            InterfaceC0111g interfaceC0111g10 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.j.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.j.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S10 = X0.a.z(interfaceC0111g10.b(str11, (C0112h) obj22));
                            } catch (Throwable th9) {
                                S10 = AbstractC0293h.S(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            eVar.l(S10);
                            break;
                        case 9:
                            InterfaceC0111g interfaceC0111g11 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.j.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g11.c(list12, (C0112h) obj23);
                                S11 = X0.a.z(null);
                            } catch (Throwable th10) {
                                S11 = AbstractC0293h.S(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            eVar.l(S11);
                            break;
                        case 10:
                            InterfaceC0111g interfaceC0111g12 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.j.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S12 = X0.a.z(interfaceC0111g12.f(list14, (C0112h) obj24));
                            } catch (Throwable th11) {
                                S12 = AbstractC0293h.S(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            eVar.l(S12);
                            break;
                        case 11:
                            InterfaceC0111g interfaceC0111g13 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.j.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                S13 = X0.a.z(interfaceC0111g13.h(list16, (C0112h) obj25));
                            } catch (Throwable th12) {
                                S13 = AbstractC0293h.S(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            eVar.l(S13);
                            break;
                        case 12:
                            InterfaceC0111g interfaceC0111g14 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.j.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.j.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.j.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g14.g(str12, str13, (C0112h) obj28);
                                S14 = X0.a.z(null);
                            } catch (Throwable th13) {
                                S14 = AbstractC0293h.S(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            eVar.l(S14);
                            break;
                        case 13:
                            InterfaceC0111g interfaceC0111g15 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.j.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.j.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.j.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g15.a(str14, longValue, (C0112h) obj31);
                                S15 = X0.a.z(null);
                            } catch (Throwable th14) {
                                S15 = AbstractC0293h.S(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            eVar.l(S15);
                            break;
                        default:
                            InterfaceC0111g interfaceC0111g16 = interfaceC0111g;
                            kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.j.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.j.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.j.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0111g16.j(str15, doubleValue, (C0112h) obj34);
                                S16 = X0.a.z(null);
                            } catch (Throwable th15) {
                                S16 = AbstractC0293h.S(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            eVar.l(S16);
                            break;
                    }
                }
            });
        }
    }
}
