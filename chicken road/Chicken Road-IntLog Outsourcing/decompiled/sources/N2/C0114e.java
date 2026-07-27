package N2;

import a.AbstractC0169a;
import android.util.Log;
import f4.C0434k;
import g4.AbstractC0466k;
import java.util.List;

/* renamed from: N2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0114e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0114e f2083a = new C0114e();

    /* renamed from: b, reason: collision with root package name */
    public static final C0434k f2084b = AbstractC0169a.A(new M0.a(1));

    public static H2.k a() {
        return (H2.k) f2084b.getValue();
    }

    public static void b(H2.f binaryMessenger, final InterfaceC0115f interfaceC0115f, String str) {
        kotlin.jvm.internal.i.e(binaryMessenger, "binaryMessenger");
        String concat = str.length() > 0 ? ".".concat(str) : "";
        s0.k d6 = binaryMessenger.d(new H2.j());
        f2.t tVar = new f2.t(binaryMessenger, B0.o.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", concat), a(), d6);
        if (interfaceC0115f != null) {
            final int i2 = 6;
            tVar.h(new H2.b() { // from class: N2.d
                @Override // H2.b
                public final void c(Object obj, B0.t tVar2) {
                    List A02;
                    List A03;
                    List A04;
                    List A05;
                    List A06;
                    List A07;
                    List A08;
                    List A09;
                    List A010;
                    List A011;
                    List A012;
                    List A013;
                    List A014;
                    List A015;
                    List A016;
                    switch (i2) {
                        case 0:
                            InterfaceC0115f interfaceC0115f2 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f2.g(str2, str3, (C0116g) obj4);
                                A02 = K1.b.W(null);
                            } catch (Throwable th) {
                                A02 = AbstractC0466k.A0(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            tVar2.b(A02);
                            break;
                        case 1:
                            InterfaceC0115f interfaceC0115f3 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f3.b(str4, list3, (C0116g) obj7);
                                A03 = K1.b.W(null);
                            } catch (Throwable th2) {
                                A03 = AbstractC0466k.A0(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            tVar2.b(A03);
                            break;
                        case 2:
                            InterfaceC0115f interfaceC0115f4 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A04 = K1.b.W(interfaceC0115f4.r(str5, (C0116g) obj9));
                            } catch (Throwable th3) {
                                A04 = AbstractC0466k.A0(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            tVar2.b(A04);
                            break;
                        case 3:
                            InterfaceC0115f interfaceC0115f5 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A05 = K1.b.W(interfaceC0115f5.f(str6, (C0116g) obj11));
                            } catch (Throwable th4) {
                                A05 = AbstractC0466k.A0(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            tVar2.b(A05);
                            break;
                        case 4:
                            InterfaceC0115f interfaceC0115f6 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A06 = K1.b.W(interfaceC0115f6.n(str7, (C0116g) obj13));
                            } catch (Throwable th5) {
                                A06 = AbstractC0466k.A0(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            tVar2.b(A06);
                            break;
                        case 5:
                            InterfaceC0115f interfaceC0115f7 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A07 = K1.b.W(interfaceC0115f7.c(str8, (C0116g) obj15));
                            } catch (Throwable th6) {
                                A07 = AbstractC0466k.A0(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            tVar2.b(A07);
                            break;
                        case 6:
                            InterfaceC0115f interfaceC0115f8 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f8.p(str9, booleanValue, (C0116g) obj18);
                                A08 = K1.b.W(null);
                            } catch (Throwable th7) {
                                A08 = AbstractC0466k.A0(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            tVar2.b(A08);
                            break;
                        case 7:
                            InterfaceC0115f interfaceC0115f9 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A09 = K1.b.W(interfaceC0115f9.u(str10, (C0116g) obj20));
                            } catch (Throwable th8) {
                                A09 = AbstractC0466k.A0(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            tVar2.b(A09);
                            break;
                        case 8:
                            InterfaceC0115f interfaceC0115f10 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A010 = K1.b.W(interfaceC0115f10.t(str11, (C0116g) obj22));
                            } catch (Throwable th9) {
                                A010 = AbstractC0466k.A0(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            tVar2.b(A010);
                            break;
                        case 9:
                            InterfaceC0115f interfaceC0115f11 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f11.k(list12, (C0116g) obj23);
                                A011 = K1.b.W(null);
                            } catch (Throwable th10) {
                                A011 = AbstractC0466k.A0(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            tVar2.b(A011);
                            break;
                        case 10:
                            InterfaceC0115f interfaceC0115f12 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A012 = K1.b.W(interfaceC0115f12.e(list14, (C0116g) obj24));
                            } catch (Throwable th11) {
                                A012 = AbstractC0466k.A0(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            tVar2.b(A012);
                            break;
                        case 11:
                            InterfaceC0115f interfaceC0115f13 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A013 = K1.b.W(interfaceC0115f13.h(list16, (C0116g) obj25));
                            } catch (Throwable th12) {
                                A013 = AbstractC0466k.A0(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            tVar2.b(A013);
                            break;
                        case 12:
                            InterfaceC0115f interfaceC0115f14 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f14.d(str12, str13, (C0116g) obj28);
                                A014 = K1.b.W(null);
                            } catch (Throwable th13) {
                                A014 = AbstractC0466k.A0(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            tVar2.b(A014);
                            break;
                        case 13:
                            InterfaceC0115f interfaceC0115f15 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f15.m(str14, longValue, (C0116g) obj31);
                                A015 = K1.b.W(null);
                            } catch (Throwable th14) {
                                A015 = AbstractC0466k.A0(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            tVar2.b(A015);
                            break;
                        default:
                            InterfaceC0115f interfaceC0115f16 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f16.j(str15, doubleValue, (C0116g) obj34);
                                A016 = K1.b.W(null);
                            } catch (Throwable th15) {
                                A016 = AbstractC0466k.A0(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            tVar2.b(A016);
                            break;
                    }
                }
            });
        } else {
            tVar.h(null);
        }
        f2.t tVar2 = new f2.t(binaryMessenger, B0.o.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", concat), a(), d6);
        if (interfaceC0115f != null) {
            final int i3 = 12;
            tVar2.h(new H2.b() { // from class: N2.d
                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    List A02;
                    List A03;
                    List A04;
                    List A05;
                    List A06;
                    List A07;
                    List A08;
                    List A09;
                    List A010;
                    List A011;
                    List A012;
                    List A013;
                    List A014;
                    List A015;
                    List A016;
                    switch (i3) {
                        case 0:
                            InterfaceC0115f interfaceC0115f2 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f2.g(str2, str3, (C0116g) obj4);
                                A02 = K1.b.W(null);
                            } catch (Throwable th) {
                                A02 = AbstractC0466k.A0(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            tVar22.b(A02);
                            break;
                        case 1:
                            InterfaceC0115f interfaceC0115f3 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f3.b(str4, list3, (C0116g) obj7);
                                A03 = K1.b.W(null);
                            } catch (Throwable th2) {
                                A03 = AbstractC0466k.A0(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            tVar22.b(A03);
                            break;
                        case 2:
                            InterfaceC0115f interfaceC0115f4 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A04 = K1.b.W(interfaceC0115f4.r(str5, (C0116g) obj9));
                            } catch (Throwable th3) {
                                A04 = AbstractC0466k.A0(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            tVar22.b(A04);
                            break;
                        case 3:
                            InterfaceC0115f interfaceC0115f5 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A05 = K1.b.W(interfaceC0115f5.f(str6, (C0116g) obj11));
                            } catch (Throwable th4) {
                                A05 = AbstractC0466k.A0(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            tVar22.b(A05);
                            break;
                        case 4:
                            InterfaceC0115f interfaceC0115f6 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A06 = K1.b.W(interfaceC0115f6.n(str7, (C0116g) obj13));
                            } catch (Throwable th5) {
                                A06 = AbstractC0466k.A0(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            tVar22.b(A06);
                            break;
                        case 5:
                            InterfaceC0115f interfaceC0115f7 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A07 = K1.b.W(interfaceC0115f7.c(str8, (C0116g) obj15));
                            } catch (Throwable th6) {
                                A07 = AbstractC0466k.A0(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            tVar22.b(A07);
                            break;
                        case 6:
                            InterfaceC0115f interfaceC0115f8 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f8.p(str9, booleanValue, (C0116g) obj18);
                                A08 = K1.b.W(null);
                            } catch (Throwable th7) {
                                A08 = AbstractC0466k.A0(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            tVar22.b(A08);
                            break;
                        case 7:
                            InterfaceC0115f interfaceC0115f9 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A09 = K1.b.W(interfaceC0115f9.u(str10, (C0116g) obj20));
                            } catch (Throwable th8) {
                                A09 = AbstractC0466k.A0(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            tVar22.b(A09);
                            break;
                        case 8:
                            InterfaceC0115f interfaceC0115f10 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A010 = K1.b.W(interfaceC0115f10.t(str11, (C0116g) obj22));
                            } catch (Throwable th9) {
                                A010 = AbstractC0466k.A0(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            tVar22.b(A010);
                            break;
                        case 9:
                            InterfaceC0115f interfaceC0115f11 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f11.k(list12, (C0116g) obj23);
                                A011 = K1.b.W(null);
                            } catch (Throwable th10) {
                                A011 = AbstractC0466k.A0(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            tVar22.b(A011);
                            break;
                        case 10:
                            InterfaceC0115f interfaceC0115f12 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A012 = K1.b.W(interfaceC0115f12.e(list14, (C0116g) obj24));
                            } catch (Throwable th11) {
                                A012 = AbstractC0466k.A0(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            tVar22.b(A012);
                            break;
                        case 11:
                            InterfaceC0115f interfaceC0115f13 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A013 = K1.b.W(interfaceC0115f13.h(list16, (C0116g) obj25));
                            } catch (Throwable th12) {
                                A013 = AbstractC0466k.A0(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            tVar22.b(A013);
                            break;
                        case 12:
                            InterfaceC0115f interfaceC0115f14 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f14.d(str12, str13, (C0116g) obj28);
                                A014 = K1.b.W(null);
                            } catch (Throwable th13) {
                                A014 = AbstractC0466k.A0(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            tVar22.b(A014);
                            break;
                        case 13:
                            InterfaceC0115f interfaceC0115f15 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f15.m(str14, longValue, (C0116g) obj31);
                                A015 = K1.b.W(null);
                            } catch (Throwable th14) {
                                A015 = AbstractC0466k.A0(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            tVar22.b(A015);
                            break;
                        default:
                            InterfaceC0115f interfaceC0115f16 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f16.j(str15, doubleValue, (C0116g) obj34);
                                A016 = K1.b.W(null);
                            } catch (Throwable th15) {
                                A016 = AbstractC0466k.A0(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            tVar22.b(A016);
                            break;
                    }
                }
            });
        } else {
            tVar2.h(null);
        }
        f2.t tVar3 = new f2.t(binaryMessenger, B0.o.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", concat), a(), d6);
        if (interfaceC0115f != null) {
            final int i6 = 13;
            tVar3.h(new H2.b() { // from class: N2.d
                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    List A02;
                    List A03;
                    List A04;
                    List A05;
                    List A06;
                    List A07;
                    List A08;
                    List A09;
                    List A010;
                    List A011;
                    List A012;
                    List A013;
                    List A014;
                    List A015;
                    List A016;
                    switch (i6) {
                        case 0:
                            InterfaceC0115f interfaceC0115f2 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f2.g(str2, str3, (C0116g) obj4);
                                A02 = K1.b.W(null);
                            } catch (Throwable th) {
                                A02 = AbstractC0466k.A0(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            tVar22.b(A02);
                            break;
                        case 1:
                            InterfaceC0115f interfaceC0115f3 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f3.b(str4, list3, (C0116g) obj7);
                                A03 = K1.b.W(null);
                            } catch (Throwable th2) {
                                A03 = AbstractC0466k.A0(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            tVar22.b(A03);
                            break;
                        case 2:
                            InterfaceC0115f interfaceC0115f4 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A04 = K1.b.W(interfaceC0115f4.r(str5, (C0116g) obj9));
                            } catch (Throwable th3) {
                                A04 = AbstractC0466k.A0(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            tVar22.b(A04);
                            break;
                        case 3:
                            InterfaceC0115f interfaceC0115f5 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A05 = K1.b.W(interfaceC0115f5.f(str6, (C0116g) obj11));
                            } catch (Throwable th4) {
                                A05 = AbstractC0466k.A0(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            tVar22.b(A05);
                            break;
                        case 4:
                            InterfaceC0115f interfaceC0115f6 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A06 = K1.b.W(interfaceC0115f6.n(str7, (C0116g) obj13));
                            } catch (Throwable th5) {
                                A06 = AbstractC0466k.A0(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            tVar22.b(A06);
                            break;
                        case 5:
                            InterfaceC0115f interfaceC0115f7 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A07 = K1.b.W(interfaceC0115f7.c(str8, (C0116g) obj15));
                            } catch (Throwable th6) {
                                A07 = AbstractC0466k.A0(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            tVar22.b(A07);
                            break;
                        case 6:
                            InterfaceC0115f interfaceC0115f8 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f8.p(str9, booleanValue, (C0116g) obj18);
                                A08 = K1.b.W(null);
                            } catch (Throwable th7) {
                                A08 = AbstractC0466k.A0(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            tVar22.b(A08);
                            break;
                        case 7:
                            InterfaceC0115f interfaceC0115f9 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A09 = K1.b.W(interfaceC0115f9.u(str10, (C0116g) obj20));
                            } catch (Throwable th8) {
                                A09 = AbstractC0466k.A0(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            tVar22.b(A09);
                            break;
                        case 8:
                            InterfaceC0115f interfaceC0115f10 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A010 = K1.b.W(interfaceC0115f10.t(str11, (C0116g) obj22));
                            } catch (Throwable th9) {
                                A010 = AbstractC0466k.A0(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            tVar22.b(A010);
                            break;
                        case 9:
                            InterfaceC0115f interfaceC0115f11 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f11.k(list12, (C0116g) obj23);
                                A011 = K1.b.W(null);
                            } catch (Throwable th10) {
                                A011 = AbstractC0466k.A0(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            tVar22.b(A011);
                            break;
                        case 10:
                            InterfaceC0115f interfaceC0115f12 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A012 = K1.b.W(interfaceC0115f12.e(list14, (C0116g) obj24));
                            } catch (Throwable th11) {
                                A012 = AbstractC0466k.A0(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            tVar22.b(A012);
                            break;
                        case 11:
                            InterfaceC0115f interfaceC0115f13 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A013 = K1.b.W(interfaceC0115f13.h(list16, (C0116g) obj25));
                            } catch (Throwable th12) {
                                A013 = AbstractC0466k.A0(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            tVar22.b(A013);
                            break;
                        case 12:
                            InterfaceC0115f interfaceC0115f14 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f14.d(str12, str13, (C0116g) obj28);
                                A014 = K1.b.W(null);
                            } catch (Throwable th13) {
                                A014 = AbstractC0466k.A0(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            tVar22.b(A014);
                            break;
                        case 13:
                            InterfaceC0115f interfaceC0115f15 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f15.m(str14, longValue, (C0116g) obj31);
                                A015 = K1.b.W(null);
                            } catch (Throwable th14) {
                                A015 = AbstractC0466k.A0(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            tVar22.b(A015);
                            break;
                        default:
                            InterfaceC0115f interfaceC0115f16 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f16.j(str15, doubleValue, (C0116g) obj34);
                                A016 = K1.b.W(null);
                            } catch (Throwable th15) {
                                A016 = AbstractC0466k.A0(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            tVar22.b(A016);
                            break;
                    }
                }
            });
        } else {
            tVar3.h(null);
        }
        f2.t tVar4 = new f2.t(binaryMessenger, B0.o.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", concat), a(), d6);
        if (interfaceC0115f != null) {
            final int i7 = 14;
            tVar4.h(new H2.b() { // from class: N2.d
                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    List A02;
                    List A03;
                    List A04;
                    List A05;
                    List A06;
                    List A07;
                    List A08;
                    List A09;
                    List A010;
                    List A011;
                    List A012;
                    List A013;
                    List A014;
                    List A015;
                    List A016;
                    switch (i7) {
                        case 0:
                            InterfaceC0115f interfaceC0115f2 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f2.g(str2, str3, (C0116g) obj4);
                                A02 = K1.b.W(null);
                            } catch (Throwable th) {
                                A02 = AbstractC0466k.A0(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            tVar22.b(A02);
                            break;
                        case 1:
                            InterfaceC0115f interfaceC0115f3 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f3.b(str4, list3, (C0116g) obj7);
                                A03 = K1.b.W(null);
                            } catch (Throwable th2) {
                                A03 = AbstractC0466k.A0(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            tVar22.b(A03);
                            break;
                        case 2:
                            InterfaceC0115f interfaceC0115f4 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A04 = K1.b.W(interfaceC0115f4.r(str5, (C0116g) obj9));
                            } catch (Throwable th3) {
                                A04 = AbstractC0466k.A0(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            tVar22.b(A04);
                            break;
                        case 3:
                            InterfaceC0115f interfaceC0115f5 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A05 = K1.b.W(interfaceC0115f5.f(str6, (C0116g) obj11));
                            } catch (Throwable th4) {
                                A05 = AbstractC0466k.A0(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            tVar22.b(A05);
                            break;
                        case 4:
                            InterfaceC0115f interfaceC0115f6 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A06 = K1.b.W(interfaceC0115f6.n(str7, (C0116g) obj13));
                            } catch (Throwable th5) {
                                A06 = AbstractC0466k.A0(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            tVar22.b(A06);
                            break;
                        case 5:
                            InterfaceC0115f interfaceC0115f7 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A07 = K1.b.W(interfaceC0115f7.c(str8, (C0116g) obj15));
                            } catch (Throwable th6) {
                                A07 = AbstractC0466k.A0(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            tVar22.b(A07);
                            break;
                        case 6:
                            InterfaceC0115f interfaceC0115f8 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f8.p(str9, booleanValue, (C0116g) obj18);
                                A08 = K1.b.W(null);
                            } catch (Throwable th7) {
                                A08 = AbstractC0466k.A0(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            tVar22.b(A08);
                            break;
                        case 7:
                            InterfaceC0115f interfaceC0115f9 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A09 = K1.b.W(interfaceC0115f9.u(str10, (C0116g) obj20));
                            } catch (Throwable th8) {
                                A09 = AbstractC0466k.A0(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            tVar22.b(A09);
                            break;
                        case 8:
                            InterfaceC0115f interfaceC0115f10 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A010 = K1.b.W(interfaceC0115f10.t(str11, (C0116g) obj22));
                            } catch (Throwable th9) {
                                A010 = AbstractC0466k.A0(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            tVar22.b(A010);
                            break;
                        case 9:
                            InterfaceC0115f interfaceC0115f11 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f11.k(list12, (C0116g) obj23);
                                A011 = K1.b.W(null);
                            } catch (Throwable th10) {
                                A011 = AbstractC0466k.A0(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            tVar22.b(A011);
                            break;
                        case 10:
                            InterfaceC0115f interfaceC0115f12 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A012 = K1.b.W(interfaceC0115f12.e(list14, (C0116g) obj24));
                            } catch (Throwable th11) {
                                A012 = AbstractC0466k.A0(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            tVar22.b(A012);
                            break;
                        case 11:
                            InterfaceC0115f interfaceC0115f13 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A013 = K1.b.W(interfaceC0115f13.h(list16, (C0116g) obj25));
                            } catch (Throwable th12) {
                                A013 = AbstractC0466k.A0(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            tVar22.b(A013);
                            break;
                        case 12:
                            InterfaceC0115f interfaceC0115f14 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f14.d(str12, str13, (C0116g) obj28);
                                A014 = K1.b.W(null);
                            } catch (Throwable th13) {
                                A014 = AbstractC0466k.A0(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            tVar22.b(A014);
                            break;
                        case 13:
                            InterfaceC0115f interfaceC0115f15 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f15.m(str14, longValue, (C0116g) obj31);
                                A015 = K1.b.W(null);
                            } catch (Throwable th14) {
                                A015 = AbstractC0466k.A0(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            tVar22.b(A015);
                            break;
                        default:
                            InterfaceC0115f interfaceC0115f16 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f16.j(str15, doubleValue, (C0116g) obj34);
                                A016 = K1.b.W(null);
                            } catch (Throwable th15) {
                                A016 = AbstractC0466k.A0(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            tVar22.b(A016);
                            break;
                    }
                }
            });
        } else {
            tVar4.h(null);
        }
        f2.t tVar5 = new f2.t(binaryMessenger, B0.o.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", concat), a(), d6);
        if (interfaceC0115f != null) {
            final int i8 = 0;
            tVar5.h(new H2.b() { // from class: N2.d
                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    List A02;
                    List A03;
                    List A04;
                    List A05;
                    List A06;
                    List A07;
                    List A08;
                    List A09;
                    List A010;
                    List A011;
                    List A012;
                    List A013;
                    List A014;
                    List A015;
                    List A016;
                    switch (i8) {
                        case 0:
                            InterfaceC0115f interfaceC0115f2 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f2.g(str2, str3, (C0116g) obj4);
                                A02 = K1.b.W(null);
                            } catch (Throwable th) {
                                A02 = AbstractC0466k.A0(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            tVar22.b(A02);
                            break;
                        case 1:
                            InterfaceC0115f interfaceC0115f3 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f3.b(str4, list3, (C0116g) obj7);
                                A03 = K1.b.W(null);
                            } catch (Throwable th2) {
                                A03 = AbstractC0466k.A0(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            tVar22.b(A03);
                            break;
                        case 2:
                            InterfaceC0115f interfaceC0115f4 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A04 = K1.b.W(interfaceC0115f4.r(str5, (C0116g) obj9));
                            } catch (Throwable th3) {
                                A04 = AbstractC0466k.A0(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            tVar22.b(A04);
                            break;
                        case 3:
                            InterfaceC0115f interfaceC0115f5 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A05 = K1.b.W(interfaceC0115f5.f(str6, (C0116g) obj11));
                            } catch (Throwable th4) {
                                A05 = AbstractC0466k.A0(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            tVar22.b(A05);
                            break;
                        case 4:
                            InterfaceC0115f interfaceC0115f6 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A06 = K1.b.W(interfaceC0115f6.n(str7, (C0116g) obj13));
                            } catch (Throwable th5) {
                                A06 = AbstractC0466k.A0(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            tVar22.b(A06);
                            break;
                        case 5:
                            InterfaceC0115f interfaceC0115f7 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A07 = K1.b.W(interfaceC0115f7.c(str8, (C0116g) obj15));
                            } catch (Throwable th6) {
                                A07 = AbstractC0466k.A0(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            tVar22.b(A07);
                            break;
                        case 6:
                            InterfaceC0115f interfaceC0115f8 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f8.p(str9, booleanValue, (C0116g) obj18);
                                A08 = K1.b.W(null);
                            } catch (Throwable th7) {
                                A08 = AbstractC0466k.A0(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            tVar22.b(A08);
                            break;
                        case 7:
                            InterfaceC0115f interfaceC0115f9 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A09 = K1.b.W(interfaceC0115f9.u(str10, (C0116g) obj20));
                            } catch (Throwable th8) {
                                A09 = AbstractC0466k.A0(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            tVar22.b(A09);
                            break;
                        case 8:
                            InterfaceC0115f interfaceC0115f10 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A010 = K1.b.W(interfaceC0115f10.t(str11, (C0116g) obj22));
                            } catch (Throwable th9) {
                                A010 = AbstractC0466k.A0(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            tVar22.b(A010);
                            break;
                        case 9:
                            InterfaceC0115f interfaceC0115f11 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f11.k(list12, (C0116g) obj23);
                                A011 = K1.b.W(null);
                            } catch (Throwable th10) {
                                A011 = AbstractC0466k.A0(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            tVar22.b(A011);
                            break;
                        case 10:
                            InterfaceC0115f interfaceC0115f12 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A012 = K1.b.W(interfaceC0115f12.e(list14, (C0116g) obj24));
                            } catch (Throwable th11) {
                                A012 = AbstractC0466k.A0(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            tVar22.b(A012);
                            break;
                        case 11:
                            InterfaceC0115f interfaceC0115f13 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A013 = K1.b.W(interfaceC0115f13.h(list16, (C0116g) obj25));
                            } catch (Throwable th12) {
                                A013 = AbstractC0466k.A0(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            tVar22.b(A013);
                            break;
                        case 12:
                            InterfaceC0115f interfaceC0115f14 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f14.d(str12, str13, (C0116g) obj28);
                                A014 = K1.b.W(null);
                            } catch (Throwable th13) {
                                A014 = AbstractC0466k.A0(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            tVar22.b(A014);
                            break;
                        case 13:
                            InterfaceC0115f interfaceC0115f15 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f15.m(str14, longValue, (C0116g) obj31);
                                A015 = K1.b.W(null);
                            } catch (Throwable th14) {
                                A015 = AbstractC0466k.A0(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            tVar22.b(A015);
                            break;
                        default:
                            InterfaceC0115f interfaceC0115f16 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f16.j(str15, doubleValue, (C0116g) obj34);
                                A016 = K1.b.W(null);
                            } catch (Throwable th15) {
                                A016 = AbstractC0466k.A0(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            tVar22.b(A016);
                            break;
                    }
                }
            });
        } else {
            tVar5.h(null);
        }
        f2.t tVar6 = new f2.t(binaryMessenger, B0.o.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", concat), a(), d6);
        if (interfaceC0115f != null) {
            final int i9 = 1;
            tVar6.h(new H2.b() { // from class: N2.d
                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    List A02;
                    List A03;
                    List A04;
                    List A05;
                    List A06;
                    List A07;
                    List A08;
                    List A09;
                    List A010;
                    List A011;
                    List A012;
                    List A013;
                    List A014;
                    List A015;
                    List A016;
                    switch (i9) {
                        case 0:
                            InterfaceC0115f interfaceC0115f2 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f2.g(str2, str3, (C0116g) obj4);
                                A02 = K1.b.W(null);
                            } catch (Throwable th) {
                                A02 = AbstractC0466k.A0(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            tVar22.b(A02);
                            break;
                        case 1:
                            InterfaceC0115f interfaceC0115f3 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f3.b(str4, list3, (C0116g) obj7);
                                A03 = K1.b.W(null);
                            } catch (Throwable th2) {
                                A03 = AbstractC0466k.A0(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            tVar22.b(A03);
                            break;
                        case 2:
                            InterfaceC0115f interfaceC0115f4 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A04 = K1.b.W(interfaceC0115f4.r(str5, (C0116g) obj9));
                            } catch (Throwable th3) {
                                A04 = AbstractC0466k.A0(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            tVar22.b(A04);
                            break;
                        case 3:
                            InterfaceC0115f interfaceC0115f5 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A05 = K1.b.W(interfaceC0115f5.f(str6, (C0116g) obj11));
                            } catch (Throwable th4) {
                                A05 = AbstractC0466k.A0(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            tVar22.b(A05);
                            break;
                        case 4:
                            InterfaceC0115f interfaceC0115f6 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A06 = K1.b.W(interfaceC0115f6.n(str7, (C0116g) obj13));
                            } catch (Throwable th5) {
                                A06 = AbstractC0466k.A0(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            tVar22.b(A06);
                            break;
                        case 5:
                            InterfaceC0115f interfaceC0115f7 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A07 = K1.b.W(interfaceC0115f7.c(str8, (C0116g) obj15));
                            } catch (Throwable th6) {
                                A07 = AbstractC0466k.A0(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            tVar22.b(A07);
                            break;
                        case 6:
                            InterfaceC0115f interfaceC0115f8 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f8.p(str9, booleanValue, (C0116g) obj18);
                                A08 = K1.b.W(null);
                            } catch (Throwable th7) {
                                A08 = AbstractC0466k.A0(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            tVar22.b(A08);
                            break;
                        case 7:
                            InterfaceC0115f interfaceC0115f9 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A09 = K1.b.W(interfaceC0115f9.u(str10, (C0116g) obj20));
                            } catch (Throwable th8) {
                                A09 = AbstractC0466k.A0(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            tVar22.b(A09);
                            break;
                        case 8:
                            InterfaceC0115f interfaceC0115f10 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A010 = K1.b.W(interfaceC0115f10.t(str11, (C0116g) obj22));
                            } catch (Throwable th9) {
                                A010 = AbstractC0466k.A0(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            tVar22.b(A010);
                            break;
                        case 9:
                            InterfaceC0115f interfaceC0115f11 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f11.k(list12, (C0116g) obj23);
                                A011 = K1.b.W(null);
                            } catch (Throwable th10) {
                                A011 = AbstractC0466k.A0(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            tVar22.b(A011);
                            break;
                        case 10:
                            InterfaceC0115f interfaceC0115f12 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A012 = K1.b.W(interfaceC0115f12.e(list14, (C0116g) obj24));
                            } catch (Throwable th11) {
                                A012 = AbstractC0466k.A0(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            tVar22.b(A012);
                            break;
                        case 11:
                            InterfaceC0115f interfaceC0115f13 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A013 = K1.b.W(interfaceC0115f13.h(list16, (C0116g) obj25));
                            } catch (Throwable th12) {
                                A013 = AbstractC0466k.A0(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            tVar22.b(A013);
                            break;
                        case 12:
                            InterfaceC0115f interfaceC0115f14 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f14.d(str12, str13, (C0116g) obj28);
                                A014 = K1.b.W(null);
                            } catch (Throwable th13) {
                                A014 = AbstractC0466k.A0(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            tVar22.b(A014);
                            break;
                        case 13:
                            InterfaceC0115f interfaceC0115f15 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f15.m(str14, longValue, (C0116g) obj31);
                                A015 = K1.b.W(null);
                            } catch (Throwable th14) {
                                A015 = AbstractC0466k.A0(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            tVar22.b(A015);
                            break;
                        default:
                            InterfaceC0115f interfaceC0115f16 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f16.j(str15, doubleValue, (C0116g) obj34);
                                A016 = K1.b.W(null);
                            } catch (Throwable th15) {
                                A016 = AbstractC0466k.A0(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            tVar22.b(A016);
                            break;
                    }
                }
            });
        } else {
            tVar6.h(null);
        }
        f2.t tVar7 = new f2.t(binaryMessenger, B0.o.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", concat), a(), d6);
        if (interfaceC0115f != null) {
            final int i10 = 2;
            tVar7.h(new H2.b() { // from class: N2.d
                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    List A02;
                    List A03;
                    List A04;
                    List A05;
                    List A06;
                    List A07;
                    List A08;
                    List A09;
                    List A010;
                    List A011;
                    List A012;
                    List A013;
                    List A014;
                    List A015;
                    List A016;
                    switch (i10) {
                        case 0:
                            InterfaceC0115f interfaceC0115f2 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f2.g(str2, str3, (C0116g) obj4);
                                A02 = K1.b.W(null);
                            } catch (Throwable th) {
                                A02 = AbstractC0466k.A0(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            tVar22.b(A02);
                            break;
                        case 1:
                            InterfaceC0115f interfaceC0115f3 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f3.b(str4, list3, (C0116g) obj7);
                                A03 = K1.b.W(null);
                            } catch (Throwable th2) {
                                A03 = AbstractC0466k.A0(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            tVar22.b(A03);
                            break;
                        case 2:
                            InterfaceC0115f interfaceC0115f4 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A04 = K1.b.W(interfaceC0115f4.r(str5, (C0116g) obj9));
                            } catch (Throwable th3) {
                                A04 = AbstractC0466k.A0(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            tVar22.b(A04);
                            break;
                        case 3:
                            InterfaceC0115f interfaceC0115f5 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A05 = K1.b.W(interfaceC0115f5.f(str6, (C0116g) obj11));
                            } catch (Throwable th4) {
                                A05 = AbstractC0466k.A0(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            tVar22.b(A05);
                            break;
                        case 4:
                            InterfaceC0115f interfaceC0115f6 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A06 = K1.b.W(interfaceC0115f6.n(str7, (C0116g) obj13));
                            } catch (Throwable th5) {
                                A06 = AbstractC0466k.A0(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            tVar22.b(A06);
                            break;
                        case 5:
                            InterfaceC0115f interfaceC0115f7 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A07 = K1.b.W(interfaceC0115f7.c(str8, (C0116g) obj15));
                            } catch (Throwable th6) {
                                A07 = AbstractC0466k.A0(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            tVar22.b(A07);
                            break;
                        case 6:
                            InterfaceC0115f interfaceC0115f8 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f8.p(str9, booleanValue, (C0116g) obj18);
                                A08 = K1.b.W(null);
                            } catch (Throwable th7) {
                                A08 = AbstractC0466k.A0(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            tVar22.b(A08);
                            break;
                        case 7:
                            InterfaceC0115f interfaceC0115f9 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A09 = K1.b.W(interfaceC0115f9.u(str10, (C0116g) obj20));
                            } catch (Throwable th8) {
                                A09 = AbstractC0466k.A0(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            tVar22.b(A09);
                            break;
                        case 8:
                            InterfaceC0115f interfaceC0115f10 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A010 = K1.b.W(interfaceC0115f10.t(str11, (C0116g) obj22));
                            } catch (Throwable th9) {
                                A010 = AbstractC0466k.A0(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            tVar22.b(A010);
                            break;
                        case 9:
                            InterfaceC0115f interfaceC0115f11 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f11.k(list12, (C0116g) obj23);
                                A011 = K1.b.W(null);
                            } catch (Throwable th10) {
                                A011 = AbstractC0466k.A0(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            tVar22.b(A011);
                            break;
                        case 10:
                            InterfaceC0115f interfaceC0115f12 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A012 = K1.b.W(interfaceC0115f12.e(list14, (C0116g) obj24));
                            } catch (Throwable th11) {
                                A012 = AbstractC0466k.A0(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            tVar22.b(A012);
                            break;
                        case 11:
                            InterfaceC0115f interfaceC0115f13 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A013 = K1.b.W(interfaceC0115f13.h(list16, (C0116g) obj25));
                            } catch (Throwable th12) {
                                A013 = AbstractC0466k.A0(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            tVar22.b(A013);
                            break;
                        case 12:
                            InterfaceC0115f interfaceC0115f14 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f14.d(str12, str13, (C0116g) obj28);
                                A014 = K1.b.W(null);
                            } catch (Throwable th13) {
                                A014 = AbstractC0466k.A0(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            tVar22.b(A014);
                            break;
                        case 13:
                            InterfaceC0115f interfaceC0115f15 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f15.m(str14, longValue, (C0116g) obj31);
                                A015 = K1.b.W(null);
                            } catch (Throwable th14) {
                                A015 = AbstractC0466k.A0(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            tVar22.b(A015);
                            break;
                        default:
                            InterfaceC0115f interfaceC0115f16 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f16.j(str15, doubleValue, (C0116g) obj34);
                                A016 = K1.b.W(null);
                            } catch (Throwable th15) {
                                A016 = AbstractC0466k.A0(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            tVar22.b(A016);
                            break;
                    }
                }
            });
        } else {
            tVar7.h(null);
        }
        f2.t tVar8 = new f2.t(binaryMessenger, B0.o.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", concat), a(), d6);
        if (interfaceC0115f != null) {
            final int i11 = 3;
            tVar8.h(new H2.b() { // from class: N2.d
                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    List A02;
                    List A03;
                    List A04;
                    List A05;
                    List A06;
                    List A07;
                    List A08;
                    List A09;
                    List A010;
                    List A011;
                    List A012;
                    List A013;
                    List A014;
                    List A015;
                    List A016;
                    switch (i11) {
                        case 0:
                            InterfaceC0115f interfaceC0115f2 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f2.g(str2, str3, (C0116g) obj4);
                                A02 = K1.b.W(null);
                            } catch (Throwable th) {
                                A02 = AbstractC0466k.A0(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            tVar22.b(A02);
                            break;
                        case 1:
                            InterfaceC0115f interfaceC0115f3 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f3.b(str4, list3, (C0116g) obj7);
                                A03 = K1.b.W(null);
                            } catch (Throwable th2) {
                                A03 = AbstractC0466k.A0(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            tVar22.b(A03);
                            break;
                        case 2:
                            InterfaceC0115f interfaceC0115f4 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A04 = K1.b.W(interfaceC0115f4.r(str5, (C0116g) obj9));
                            } catch (Throwable th3) {
                                A04 = AbstractC0466k.A0(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            tVar22.b(A04);
                            break;
                        case 3:
                            InterfaceC0115f interfaceC0115f5 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A05 = K1.b.W(interfaceC0115f5.f(str6, (C0116g) obj11));
                            } catch (Throwable th4) {
                                A05 = AbstractC0466k.A0(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            tVar22.b(A05);
                            break;
                        case 4:
                            InterfaceC0115f interfaceC0115f6 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A06 = K1.b.W(interfaceC0115f6.n(str7, (C0116g) obj13));
                            } catch (Throwable th5) {
                                A06 = AbstractC0466k.A0(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            tVar22.b(A06);
                            break;
                        case 5:
                            InterfaceC0115f interfaceC0115f7 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A07 = K1.b.W(interfaceC0115f7.c(str8, (C0116g) obj15));
                            } catch (Throwable th6) {
                                A07 = AbstractC0466k.A0(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            tVar22.b(A07);
                            break;
                        case 6:
                            InterfaceC0115f interfaceC0115f8 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f8.p(str9, booleanValue, (C0116g) obj18);
                                A08 = K1.b.W(null);
                            } catch (Throwable th7) {
                                A08 = AbstractC0466k.A0(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            tVar22.b(A08);
                            break;
                        case 7:
                            InterfaceC0115f interfaceC0115f9 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A09 = K1.b.W(interfaceC0115f9.u(str10, (C0116g) obj20));
                            } catch (Throwable th8) {
                                A09 = AbstractC0466k.A0(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            tVar22.b(A09);
                            break;
                        case 8:
                            InterfaceC0115f interfaceC0115f10 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A010 = K1.b.W(interfaceC0115f10.t(str11, (C0116g) obj22));
                            } catch (Throwable th9) {
                                A010 = AbstractC0466k.A0(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            tVar22.b(A010);
                            break;
                        case 9:
                            InterfaceC0115f interfaceC0115f11 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f11.k(list12, (C0116g) obj23);
                                A011 = K1.b.W(null);
                            } catch (Throwable th10) {
                                A011 = AbstractC0466k.A0(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            tVar22.b(A011);
                            break;
                        case 10:
                            InterfaceC0115f interfaceC0115f12 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A012 = K1.b.W(interfaceC0115f12.e(list14, (C0116g) obj24));
                            } catch (Throwable th11) {
                                A012 = AbstractC0466k.A0(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            tVar22.b(A012);
                            break;
                        case 11:
                            InterfaceC0115f interfaceC0115f13 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A013 = K1.b.W(interfaceC0115f13.h(list16, (C0116g) obj25));
                            } catch (Throwable th12) {
                                A013 = AbstractC0466k.A0(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            tVar22.b(A013);
                            break;
                        case 12:
                            InterfaceC0115f interfaceC0115f14 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f14.d(str12, str13, (C0116g) obj28);
                                A014 = K1.b.W(null);
                            } catch (Throwable th13) {
                                A014 = AbstractC0466k.A0(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            tVar22.b(A014);
                            break;
                        case 13:
                            InterfaceC0115f interfaceC0115f15 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f15.m(str14, longValue, (C0116g) obj31);
                                A015 = K1.b.W(null);
                            } catch (Throwable th14) {
                                A015 = AbstractC0466k.A0(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            tVar22.b(A015);
                            break;
                        default:
                            InterfaceC0115f interfaceC0115f16 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f16.j(str15, doubleValue, (C0116g) obj34);
                                A016 = K1.b.W(null);
                            } catch (Throwable th15) {
                                A016 = AbstractC0466k.A0(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            tVar22.b(A016);
                            break;
                    }
                }
            });
        } else {
            tVar8.h(null);
        }
        f2.t tVar9 = new f2.t(binaryMessenger, B0.o.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", concat), a(), d6);
        if (interfaceC0115f != null) {
            final int i12 = 4;
            tVar9.h(new H2.b() { // from class: N2.d
                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    List A02;
                    List A03;
                    List A04;
                    List A05;
                    List A06;
                    List A07;
                    List A08;
                    List A09;
                    List A010;
                    List A011;
                    List A012;
                    List A013;
                    List A014;
                    List A015;
                    List A016;
                    switch (i12) {
                        case 0:
                            InterfaceC0115f interfaceC0115f2 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f2.g(str2, str3, (C0116g) obj4);
                                A02 = K1.b.W(null);
                            } catch (Throwable th) {
                                A02 = AbstractC0466k.A0(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            tVar22.b(A02);
                            break;
                        case 1:
                            InterfaceC0115f interfaceC0115f3 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f3.b(str4, list3, (C0116g) obj7);
                                A03 = K1.b.W(null);
                            } catch (Throwable th2) {
                                A03 = AbstractC0466k.A0(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            tVar22.b(A03);
                            break;
                        case 2:
                            InterfaceC0115f interfaceC0115f4 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A04 = K1.b.W(interfaceC0115f4.r(str5, (C0116g) obj9));
                            } catch (Throwable th3) {
                                A04 = AbstractC0466k.A0(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            tVar22.b(A04);
                            break;
                        case 3:
                            InterfaceC0115f interfaceC0115f5 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A05 = K1.b.W(interfaceC0115f5.f(str6, (C0116g) obj11));
                            } catch (Throwable th4) {
                                A05 = AbstractC0466k.A0(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            tVar22.b(A05);
                            break;
                        case 4:
                            InterfaceC0115f interfaceC0115f6 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A06 = K1.b.W(interfaceC0115f6.n(str7, (C0116g) obj13));
                            } catch (Throwable th5) {
                                A06 = AbstractC0466k.A0(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            tVar22.b(A06);
                            break;
                        case 5:
                            InterfaceC0115f interfaceC0115f7 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A07 = K1.b.W(interfaceC0115f7.c(str8, (C0116g) obj15));
                            } catch (Throwable th6) {
                                A07 = AbstractC0466k.A0(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            tVar22.b(A07);
                            break;
                        case 6:
                            InterfaceC0115f interfaceC0115f8 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f8.p(str9, booleanValue, (C0116g) obj18);
                                A08 = K1.b.W(null);
                            } catch (Throwable th7) {
                                A08 = AbstractC0466k.A0(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            tVar22.b(A08);
                            break;
                        case 7:
                            InterfaceC0115f interfaceC0115f9 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A09 = K1.b.W(interfaceC0115f9.u(str10, (C0116g) obj20));
                            } catch (Throwable th8) {
                                A09 = AbstractC0466k.A0(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            tVar22.b(A09);
                            break;
                        case 8:
                            InterfaceC0115f interfaceC0115f10 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A010 = K1.b.W(interfaceC0115f10.t(str11, (C0116g) obj22));
                            } catch (Throwable th9) {
                                A010 = AbstractC0466k.A0(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            tVar22.b(A010);
                            break;
                        case 9:
                            InterfaceC0115f interfaceC0115f11 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f11.k(list12, (C0116g) obj23);
                                A011 = K1.b.W(null);
                            } catch (Throwable th10) {
                                A011 = AbstractC0466k.A0(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            tVar22.b(A011);
                            break;
                        case 10:
                            InterfaceC0115f interfaceC0115f12 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A012 = K1.b.W(interfaceC0115f12.e(list14, (C0116g) obj24));
                            } catch (Throwable th11) {
                                A012 = AbstractC0466k.A0(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            tVar22.b(A012);
                            break;
                        case 11:
                            InterfaceC0115f interfaceC0115f13 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A013 = K1.b.W(interfaceC0115f13.h(list16, (C0116g) obj25));
                            } catch (Throwable th12) {
                                A013 = AbstractC0466k.A0(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            tVar22.b(A013);
                            break;
                        case 12:
                            InterfaceC0115f interfaceC0115f14 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f14.d(str12, str13, (C0116g) obj28);
                                A014 = K1.b.W(null);
                            } catch (Throwable th13) {
                                A014 = AbstractC0466k.A0(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            tVar22.b(A014);
                            break;
                        case 13:
                            InterfaceC0115f interfaceC0115f15 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f15.m(str14, longValue, (C0116g) obj31);
                                A015 = K1.b.W(null);
                            } catch (Throwable th14) {
                                A015 = AbstractC0466k.A0(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            tVar22.b(A015);
                            break;
                        default:
                            InterfaceC0115f interfaceC0115f16 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f16.j(str15, doubleValue, (C0116g) obj34);
                                A016 = K1.b.W(null);
                            } catch (Throwable th15) {
                                A016 = AbstractC0466k.A0(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            tVar22.b(A016);
                            break;
                    }
                }
            });
        } else {
            tVar9.h(null);
        }
        f2.t tVar10 = new f2.t(binaryMessenger, B0.o.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", concat), a(), d6);
        if (interfaceC0115f != null) {
            final int i13 = 5;
            tVar10.h(new H2.b() { // from class: N2.d
                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    List A02;
                    List A03;
                    List A04;
                    List A05;
                    List A06;
                    List A07;
                    List A08;
                    List A09;
                    List A010;
                    List A011;
                    List A012;
                    List A013;
                    List A014;
                    List A015;
                    List A016;
                    switch (i13) {
                        case 0:
                            InterfaceC0115f interfaceC0115f2 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f2.g(str2, str3, (C0116g) obj4);
                                A02 = K1.b.W(null);
                            } catch (Throwable th) {
                                A02 = AbstractC0466k.A0(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            tVar22.b(A02);
                            break;
                        case 1:
                            InterfaceC0115f interfaceC0115f3 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f3.b(str4, list3, (C0116g) obj7);
                                A03 = K1.b.W(null);
                            } catch (Throwable th2) {
                                A03 = AbstractC0466k.A0(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            tVar22.b(A03);
                            break;
                        case 2:
                            InterfaceC0115f interfaceC0115f4 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A04 = K1.b.W(interfaceC0115f4.r(str5, (C0116g) obj9));
                            } catch (Throwable th3) {
                                A04 = AbstractC0466k.A0(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            tVar22.b(A04);
                            break;
                        case 3:
                            InterfaceC0115f interfaceC0115f5 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A05 = K1.b.W(interfaceC0115f5.f(str6, (C0116g) obj11));
                            } catch (Throwable th4) {
                                A05 = AbstractC0466k.A0(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            tVar22.b(A05);
                            break;
                        case 4:
                            InterfaceC0115f interfaceC0115f6 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A06 = K1.b.W(interfaceC0115f6.n(str7, (C0116g) obj13));
                            } catch (Throwable th5) {
                                A06 = AbstractC0466k.A0(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            tVar22.b(A06);
                            break;
                        case 5:
                            InterfaceC0115f interfaceC0115f7 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A07 = K1.b.W(interfaceC0115f7.c(str8, (C0116g) obj15));
                            } catch (Throwable th6) {
                                A07 = AbstractC0466k.A0(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            tVar22.b(A07);
                            break;
                        case 6:
                            InterfaceC0115f interfaceC0115f8 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f8.p(str9, booleanValue, (C0116g) obj18);
                                A08 = K1.b.W(null);
                            } catch (Throwable th7) {
                                A08 = AbstractC0466k.A0(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            tVar22.b(A08);
                            break;
                        case 7:
                            InterfaceC0115f interfaceC0115f9 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A09 = K1.b.W(interfaceC0115f9.u(str10, (C0116g) obj20));
                            } catch (Throwable th8) {
                                A09 = AbstractC0466k.A0(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            tVar22.b(A09);
                            break;
                        case 8:
                            InterfaceC0115f interfaceC0115f10 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A010 = K1.b.W(interfaceC0115f10.t(str11, (C0116g) obj22));
                            } catch (Throwable th9) {
                                A010 = AbstractC0466k.A0(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            tVar22.b(A010);
                            break;
                        case 9:
                            InterfaceC0115f interfaceC0115f11 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f11.k(list12, (C0116g) obj23);
                                A011 = K1.b.W(null);
                            } catch (Throwable th10) {
                                A011 = AbstractC0466k.A0(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            tVar22.b(A011);
                            break;
                        case 10:
                            InterfaceC0115f interfaceC0115f12 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A012 = K1.b.W(interfaceC0115f12.e(list14, (C0116g) obj24));
                            } catch (Throwable th11) {
                                A012 = AbstractC0466k.A0(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            tVar22.b(A012);
                            break;
                        case 11:
                            InterfaceC0115f interfaceC0115f13 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A013 = K1.b.W(interfaceC0115f13.h(list16, (C0116g) obj25));
                            } catch (Throwable th12) {
                                A013 = AbstractC0466k.A0(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            tVar22.b(A013);
                            break;
                        case 12:
                            InterfaceC0115f interfaceC0115f14 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f14.d(str12, str13, (C0116g) obj28);
                                A014 = K1.b.W(null);
                            } catch (Throwable th13) {
                                A014 = AbstractC0466k.A0(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            tVar22.b(A014);
                            break;
                        case 13:
                            InterfaceC0115f interfaceC0115f15 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f15.m(str14, longValue, (C0116g) obj31);
                                A015 = K1.b.W(null);
                            } catch (Throwable th14) {
                                A015 = AbstractC0466k.A0(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            tVar22.b(A015);
                            break;
                        default:
                            InterfaceC0115f interfaceC0115f16 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f16.j(str15, doubleValue, (C0116g) obj34);
                                A016 = K1.b.W(null);
                            } catch (Throwable th15) {
                                A016 = AbstractC0466k.A0(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            tVar22.b(A016);
                            break;
                    }
                }
            });
        } else {
            tVar10.h(null);
        }
        f2.t tVar11 = new f2.t(binaryMessenger, B0.o.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", concat), a(), d6);
        if (interfaceC0115f != null) {
            final int i14 = 7;
            tVar11.h(new H2.b() { // from class: N2.d
                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    List A02;
                    List A03;
                    List A04;
                    List A05;
                    List A06;
                    List A07;
                    List A08;
                    List A09;
                    List A010;
                    List A011;
                    List A012;
                    List A013;
                    List A014;
                    List A015;
                    List A016;
                    switch (i14) {
                        case 0:
                            InterfaceC0115f interfaceC0115f2 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f2.g(str2, str3, (C0116g) obj4);
                                A02 = K1.b.W(null);
                            } catch (Throwable th) {
                                A02 = AbstractC0466k.A0(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            tVar22.b(A02);
                            break;
                        case 1:
                            InterfaceC0115f interfaceC0115f3 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f3.b(str4, list3, (C0116g) obj7);
                                A03 = K1.b.W(null);
                            } catch (Throwable th2) {
                                A03 = AbstractC0466k.A0(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            tVar22.b(A03);
                            break;
                        case 2:
                            InterfaceC0115f interfaceC0115f4 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A04 = K1.b.W(interfaceC0115f4.r(str5, (C0116g) obj9));
                            } catch (Throwable th3) {
                                A04 = AbstractC0466k.A0(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            tVar22.b(A04);
                            break;
                        case 3:
                            InterfaceC0115f interfaceC0115f5 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A05 = K1.b.W(interfaceC0115f5.f(str6, (C0116g) obj11));
                            } catch (Throwable th4) {
                                A05 = AbstractC0466k.A0(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            tVar22.b(A05);
                            break;
                        case 4:
                            InterfaceC0115f interfaceC0115f6 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A06 = K1.b.W(interfaceC0115f6.n(str7, (C0116g) obj13));
                            } catch (Throwable th5) {
                                A06 = AbstractC0466k.A0(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            tVar22.b(A06);
                            break;
                        case 5:
                            InterfaceC0115f interfaceC0115f7 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A07 = K1.b.W(interfaceC0115f7.c(str8, (C0116g) obj15));
                            } catch (Throwable th6) {
                                A07 = AbstractC0466k.A0(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            tVar22.b(A07);
                            break;
                        case 6:
                            InterfaceC0115f interfaceC0115f8 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f8.p(str9, booleanValue, (C0116g) obj18);
                                A08 = K1.b.W(null);
                            } catch (Throwable th7) {
                                A08 = AbstractC0466k.A0(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            tVar22.b(A08);
                            break;
                        case 7:
                            InterfaceC0115f interfaceC0115f9 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A09 = K1.b.W(interfaceC0115f9.u(str10, (C0116g) obj20));
                            } catch (Throwable th8) {
                                A09 = AbstractC0466k.A0(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            tVar22.b(A09);
                            break;
                        case 8:
                            InterfaceC0115f interfaceC0115f10 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A010 = K1.b.W(interfaceC0115f10.t(str11, (C0116g) obj22));
                            } catch (Throwable th9) {
                                A010 = AbstractC0466k.A0(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            tVar22.b(A010);
                            break;
                        case 9:
                            InterfaceC0115f interfaceC0115f11 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f11.k(list12, (C0116g) obj23);
                                A011 = K1.b.W(null);
                            } catch (Throwable th10) {
                                A011 = AbstractC0466k.A0(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            tVar22.b(A011);
                            break;
                        case 10:
                            InterfaceC0115f interfaceC0115f12 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A012 = K1.b.W(interfaceC0115f12.e(list14, (C0116g) obj24));
                            } catch (Throwable th11) {
                                A012 = AbstractC0466k.A0(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            tVar22.b(A012);
                            break;
                        case 11:
                            InterfaceC0115f interfaceC0115f13 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A013 = K1.b.W(interfaceC0115f13.h(list16, (C0116g) obj25));
                            } catch (Throwable th12) {
                                A013 = AbstractC0466k.A0(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            tVar22.b(A013);
                            break;
                        case 12:
                            InterfaceC0115f interfaceC0115f14 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f14.d(str12, str13, (C0116g) obj28);
                                A014 = K1.b.W(null);
                            } catch (Throwable th13) {
                                A014 = AbstractC0466k.A0(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            tVar22.b(A014);
                            break;
                        case 13:
                            InterfaceC0115f interfaceC0115f15 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f15.m(str14, longValue, (C0116g) obj31);
                                A015 = K1.b.W(null);
                            } catch (Throwable th14) {
                                A015 = AbstractC0466k.A0(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            tVar22.b(A015);
                            break;
                        default:
                            InterfaceC0115f interfaceC0115f16 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f16.j(str15, doubleValue, (C0116g) obj34);
                                A016 = K1.b.W(null);
                            } catch (Throwable th15) {
                                A016 = AbstractC0466k.A0(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            tVar22.b(A016);
                            break;
                    }
                }
            });
        } else {
            tVar11.h(null);
        }
        f2.t tVar12 = new f2.t(binaryMessenger, B0.o.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", concat), a(), d6);
        if (interfaceC0115f != null) {
            final int i15 = 8;
            tVar12.h(new H2.b() { // from class: N2.d
                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    List A02;
                    List A03;
                    List A04;
                    List A05;
                    List A06;
                    List A07;
                    List A08;
                    List A09;
                    List A010;
                    List A011;
                    List A012;
                    List A013;
                    List A014;
                    List A015;
                    List A016;
                    switch (i15) {
                        case 0:
                            InterfaceC0115f interfaceC0115f2 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f2.g(str2, str3, (C0116g) obj4);
                                A02 = K1.b.W(null);
                            } catch (Throwable th) {
                                A02 = AbstractC0466k.A0(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            tVar22.b(A02);
                            break;
                        case 1:
                            InterfaceC0115f interfaceC0115f3 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f3.b(str4, list3, (C0116g) obj7);
                                A03 = K1.b.W(null);
                            } catch (Throwable th2) {
                                A03 = AbstractC0466k.A0(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            tVar22.b(A03);
                            break;
                        case 2:
                            InterfaceC0115f interfaceC0115f4 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A04 = K1.b.W(interfaceC0115f4.r(str5, (C0116g) obj9));
                            } catch (Throwable th3) {
                                A04 = AbstractC0466k.A0(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            tVar22.b(A04);
                            break;
                        case 3:
                            InterfaceC0115f interfaceC0115f5 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A05 = K1.b.W(interfaceC0115f5.f(str6, (C0116g) obj11));
                            } catch (Throwable th4) {
                                A05 = AbstractC0466k.A0(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            tVar22.b(A05);
                            break;
                        case 4:
                            InterfaceC0115f interfaceC0115f6 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A06 = K1.b.W(interfaceC0115f6.n(str7, (C0116g) obj13));
                            } catch (Throwable th5) {
                                A06 = AbstractC0466k.A0(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            tVar22.b(A06);
                            break;
                        case 5:
                            InterfaceC0115f interfaceC0115f7 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A07 = K1.b.W(interfaceC0115f7.c(str8, (C0116g) obj15));
                            } catch (Throwable th6) {
                                A07 = AbstractC0466k.A0(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            tVar22.b(A07);
                            break;
                        case 6:
                            InterfaceC0115f interfaceC0115f8 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f8.p(str9, booleanValue, (C0116g) obj18);
                                A08 = K1.b.W(null);
                            } catch (Throwable th7) {
                                A08 = AbstractC0466k.A0(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            tVar22.b(A08);
                            break;
                        case 7:
                            InterfaceC0115f interfaceC0115f9 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A09 = K1.b.W(interfaceC0115f9.u(str10, (C0116g) obj20));
                            } catch (Throwable th8) {
                                A09 = AbstractC0466k.A0(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            tVar22.b(A09);
                            break;
                        case 8:
                            InterfaceC0115f interfaceC0115f10 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A010 = K1.b.W(interfaceC0115f10.t(str11, (C0116g) obj22));
                            } catch (Throwable th9) {
                                A010 = AbstractC0466k.A0(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            tVar22.b(A010);
                            break;
                        case 9:
                            InterfaceC0115f interfaceC0115f11 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f11.k(list12, (C0116g) obj23);
                                A011 = K1.b.W(null);
                            } catch (Throwable th10) {
                                A011 = AbstractC0466k.A0(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            tVar22.b(A011);
                            break;
                        case 10:
                            InterfaceC0115f interfaceC0115f12 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A012 = K1.b.W(interfaceC0115f12.e(list14, (C0116g) obj24));
                            } catch (Throwable th11) {
                                A012 = AbstractC0466k.A0(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            tVar22.b(A012);
                            break;
                        case 11:
                            InterfaceC0115f interfaceC0115f13 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A013 = K1.b.W(interfaceC0115f13.h(list16, (C0116g) obj25));
                            } catch (Throwable th12) {
                                A013 = AbstractC0466k.A0(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            tVar22.b(A013);
                            break;
                        case 12:
                            InterfaceC0115f interfaceC0115f14 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f14.d(str12, str13, (C0116g) obj28);
                                A014 = K1.b.W(null);
                            } catch (Throwable th13) {
                                A014 = AbstractC0466k.A0(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            tVar22.b(A014);
                            break;
                        case 13:
                            InterfaceC0115f interfaceC0115f15 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f15.m(str14, longValue, (C0116g) obj31);
                                A015 = K1.b.W(null);
                            } catch (Throwable th14) {
                                A015 = AbstractC0466k.A0(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            tVar22.b(A015);
                            break;
                        default:
                            InterfaceC0115f interfaceC0115f16 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f16.j(str15, doubleValue, (C0116g) obj34);
                                A016 = K1.b.W(null);
                            } catch (Throwable th15) {
                                A016 = AbstractC0466k.A0(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            tVar22.b(A016);
                            break;
                    }
                }
            });
        } else {
            tVar12.h(null);
        }
        f2.t tVar13 = new f2.t(binaryMessenger, B0.o.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", concat), a(), d6);
        if (interfaceC0115f != null) {
            final int i16 = 9;
            tVar13.h(new H2.b() { // from class: N2.d
                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    List A02;
                    List A03;
                    List A04;
                    List A05;
                    List A06;
                    List A07;
                    List A08;
                    List A09;
                    List A010;
                    List A011;
                    List A012;
                    List A013;
                    List A014;
                    List A015;
                    List A016;
                    switch (i16) {
                        case 0:
                            InterfaceC0115f interfaceC0115f2 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f2.g(str2, str3, (C0116g) obj4);
                                A02 = K1.b.W(null);
                            } catch (Throwable th) {
                                A02 = AbstractC0466k.A0(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            tVar22.b(A02);
                            break;
                        case 1:
                            InterfaceC0115f interfaceC0115f3 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f3.b(str4, list3, (C0116g) obj7);
                                A03 = K1.b.W(null);
                            } catch (Throwable th2) {
                                A03 = AbstractC0466k.A0(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            tVar22.b(A03);
                            break;
                        case 2:
                            InterfaceC0115f interfaceC0115f4 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A04 = K1.b.W(interfaceC0115f4.r(str5, (C0116g) obj9));
                            } catch (Throwable th3) {
                                A04 = AbstractC0466k.A0(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            tVar22.b(A04);
                            break;
                        case 3:
                            InterfaceC0115f interfaceC0115f5 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A05 = K1.b.W(interfaceC0115f5.f(str6, (C0116g) obj11));
                            } catch (Throwable th4) {
                                A05 = AbstractC0466k.A0(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            tVar22.b(A05);
                            break;
                        case 4:
                            InterfaceC0115f interfaceC0115f6 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A06 = K1.b.W(interfaceC0115f6.n(str7, (C0116g) obj13));
                            } catch (Throwable th5) {
                                A06 = AbstractC0466k.A0(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            tVar22.b(A06);
                            break;
                        case 5:
                            InterfaceC0115f interfaceC0115f7 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A07 = K1.b.W(interfaceC0115f7.c(str8, (C0116g) obj15));
                            } catch (Throwable th6) {
                                A07 = AbstractC0466k.A0(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            tVar22.b(A07);
                            break;
                        case 6:
                            InterfaceC0115f interfaceC0115f8 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f8.p(str9, booleanValue, (C0116g) obj18);
                                A08 = K1.b.W(null);
                            } catch (Throwable th7) {
                                A08 = AbstractC0466k.A0(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            tVar22.b(A08);
                            break;
                        case 7:
                            InterfaceC0115f interfaceC0115f9 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A09 = K1.b.W(interfaceC0115f9.u(str10, (C0116g) obj20));
                            } catch (Throwable th8) {
                                A09 = AbstractC0466k.A0(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            tVar22.b(A09);
                            break;
                        case 8:
                            InterfaceC0115f interfaceC0115f10 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A010 = K1.b.W(interfaceC0115f10.t(str11, (C0116g) obj22));
                            } catch (Throwable th9) {
                                A010 = AbstractC0466k.A0(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            tVar22.b(A010);
                            break;
                        case 9:
                            InterfaceC0115f interfaceC0115f11 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f11.k(list12, (C0116g) obj23);
                                A011 = K1.b.W(null);
                            } catch (Throwable th10) {
                                A011 = AbstractC0466k.A0(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            tVar22.b(A011);
                            break;
                        case 10:
                            InterfaceC0115f interfaceC0115f12 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A012 = K1.b.W(interfaceC0115f12.e(list14, (C0116g) obj24));
                            } catch (Throwable th11) {
                                A012 = AbstractC0466k.A0(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            tVar22.b(A012);
                            break;
                        case 11:
                            InterfaceC0115f interfaceC0115f13 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A013 = K1.b.W(interfaceC0115f13.h(list16, (C0116g) obj25));
                            } catch (Throwable th12) {
                                A013 = AbstractC0466k.A0(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            tVar22.b(A013);
                            break;
                        case 12:
                            InterfaceC0115f interfaceC0115f14 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f14.d(str12, str13, (C0116g) obj28);
                                A014 = K1.b.W(null);
                            } catch (Throwable th13) {
                                A014 = AbstractC0466k.A0(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            tVar22.b(A014);
                            break;
                        case 13:
                            InterfaceC0115f interfaceC0115f15 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f15.m(str14, longValue, (C0116g) obj31);
                                A015 = K1.b.W(null);
                            } catch (Throwable th14) {
                                A015 = AbstractC0466k.A0(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            tVar22.b(A015);
                            break;
                        default:
                            InterfaceC0115f interfaceC0115f16 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f16.j(str15, doubleValue, (C0116g) obj34);
                                A016 = K1.b.W(null);
                            } catch (Throwable th15) {
                                A016 = AbstractC0466k.A0(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            tVar22.b(A016);
                            break;
                    }
                }
            });
        } else {
            tVar13.h(null);
        }
        f2.t tVar14 = new f2.t(binaryMessenger, B0.o.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", concat), a(), d6);
        if (interfaceC0115f != null) {
            final int i17 = 10;
            tVar14.h(new H2.b() { // from class: N2.d
                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    List A02;
                    List A03;
                    List A04;
                    List A05;
                    List A06;
                    List A07;
                    List A08;
                    List A09;
                    List A010;
                    List A011;
                    List A012;
                    List A013;
                    List A014;
                    List A015;
                    List A016;
                    switch (i17) {
                        case 0:
                            InterfaceC0115f interfaceC0115f2 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f2.g(str2, str3, (C0116g) obj4);
                                A02 = K1.b.W(null);
                            } catch (Throwable th) {
                                A02 = AbstractC0466k.A0(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            tVar22.b(A02);
                            break;
                        case 1:
                            InterfaceC0115f interfaceC0115f3 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f3.b(str4, list3, (C0116g) obj7);
                                A03 = K1.b.W(null);
                            } catch (Throwable th2) {
                                A03 = AbstractC0466k.A0(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            tVar22.b(A03);
                            break;
                        case 2:
                            InterfaceC0115f interfaceC0115f4 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A04 = K1.b.W(interfaceC0115f4.r(str5, (C0116g) obj9));
                            } catch (Throwable th3) {
                                A04 = AbstractC0466k.A0(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            tVar22.b(A04);
                            break;
                        case 3:
                            InterfaceC0115f interfaceC0115f5 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A05 = K1.b.W(interfaceC0115f5.f(str6, (C0116g) obj11));
                            } catch (Throwable th4) {
                                A05 = AbstractC0466k.A0(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            tVar22.b(A05);
                            break;
                        case 4:
                            InterfaceC0115f interfaceC0115f6 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A06 = K1.b.W(interfaceC0115f6.n(str7, (C0116g) obj13));
                            } catch (Throwable th5) {
                                A06 = AbstractC0466k.A0(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            tVar22.b(A06);
                            break;
                        case 5:
                            InterfaceC0115f interfaceC0115f7 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A07 = K1.b.W(interfaceC0115f7.c(str8, (C0116g) obj15));
                            } catch (Throwable th6) {
                                A07 = AbstractC0466k.A0(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            tVar22.b(A07);
                            break;
                        case 6:
                            InterfaceC0115f interfaceC0115f8 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f8.p(str9, booleanValue, (C0116g) obj18);
                                A08 = K1.b.W(null);
                            } catch (Throwable th7) {
                                A08 = AbstractC0466k.A0(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            tVar22.b(A08);
                            break;
                        case 7:
                            InterfaceC0115f interfaceC0115f9 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A09 = K1.b.W(interfaceC0115f9.u(str10, (C0116g) obj20));
                            } catch (Throwable th8) {
                                A09 = AbstractC0466k.A0(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            tVar22.b(A09);
                            break;
                        case 8:
                            InterfaceC0115f interfaceC0115f10 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A010 = K1.b.W(interfaceC0115f10.t(str11, (C0116g) obj22));
                            } catch (Throwable th9) {
                                A010 = AbstractC0466k.A0(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            tVar22.b(A010);
                            break;
                        case 9:
                            InterfaceC0115f interfaceC0115f11 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f11.k(list12, (C0116g) obj23);
                                A011 = K1.b.W(null);
                            } catch (Throwable th10) {
                                A011 = AbstractC0466k.A0(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            tVar22.b(A011);
                            break;
                        case 10:
                            InterfaceC0115f interfaceC0115f12 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A012 = K1.b.W(interfaceC0115f12.e(list14, (C0116g) obj24));
                            } catch (Throwable th11) {
                                A012 = AbstractC0466k.A0(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            tVar22.b(A012);
                            break;
                        case 11:
                            InterfaceC0115f interfaceC0115f13 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A013 = K1.b.W(interfaceC0115f13.h(list16, (C0116g) obj25));
                            } catch (Throwable th12) {
                                A013 = AbstractC0466k.A0(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            tVar22.b(A013);
                            break;
                        case 12:
                            InterfaceC0115f interfaceC0115f14 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f14.d(str12, str13, (C0116g) obj28);
                                A014 = K1.b.W(null);
                            } catch (Throwable th13) {
                                A014 = AbstractC0466k.A0(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            tVar22.b(A014);
                            break;
                        case 13:
                            InterfaceC0115f interfaceC0115f15 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f15.m(str14, longValue, (C0116g) obj31);
                                A015 = K1.b.W(null);
                            } catch (Throwable th14) {
                                A015 = AbstractC0466k.A0(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            tVar22.b(A015);
                            break;
                        default:
                            InterfaceC0115f interfaceC0115f16 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f16.j(str15, doubleValue, (C0116g) obj34);
                                A016 = K1.b.W(null);
                            } catch (Throwable th15) {
                                A016 = AbstractC0466k.A0(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            tVar22.b(A016);
                            break;
                    }
                }
            });
        } else {
            tVar14.h(null);
        }
        f2.t tVar15 = new f2.t(binaryMessenger, B0.o.i("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", concat), a(), d6);
        if (interfaceC0115f == null) {
            tVar15.h(null);
        } else {
            final int i18 = 11;
            tVar15.h(new H2.b() { // from class: N2.d
                @Override // H2.b
                public final void c(Object obj, B0.t tVar22) {
                    List A02;
                    List A03;
                    List A04;
                    List A05;
                    List A06;
                    List A07;
                    List A08;
                    List A09;
                    List A010;
                    List A011;
                    List A012;
                    List A013;
                    List A014;
                    List A015;
                    List A016;
                    switch (i18) {
                        case 0:
                            InterfaceC0115f interfaceC0115f2 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj2;
                            Object obj3 = list.get(1);
                            kotlin.jvm.internal.i.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj3;
                            Object obj4 = list.get(2);
                            kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f2.g(str2, str3, (C0116g) obj4);
                                A02 = K1.b.W(null);
                            } catch (Throwable th) {
                                A02 = AbstractC0466k.A0(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                            }
                            tVar22.b(A02);
                            break;
                        case 1:
                            InterfaceC0115f interfaceC0115f3 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            kotlin.jvm.internal.i.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f3.b(str4, list3, (C0116g) obj7);
                                A03 = K1.b.W(null);
                            } catch (Throwable th2) {
                                A03 = AbstractC0466k.A0(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                            }
                            tVar22.b(A03);
                            break;
                        case 2:
                            InterfaceC0115f interfaceC0115f4 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.i.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.i.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A04 = K1.b.W(interfaceC0115f4.r(str5, (C0116g) obj9));
                            } catch (Throwable th3) {
                                A04 = AbstractC0466k.A0(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                            }
                            tVar22.b(A04);
                            break;
                        case 3:
                            InterfaceC0115f interfaceC0115f5 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.i.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.i.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A05 = K1.b.W(interfaceC0115f5.f(str6, (C0116g) obj11));
                            } catch (Throwable th4) {
                                A05 = AbstractC0466k.A0(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                            }
                            tVar22.b(A05);
                            break;
                        case 4:
                            InterfaceC0115f interfaceC0115f6 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.i.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.i.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A06 = K1.b.W(interfaceC0115f6.n(str7, (C0116g) obj13));
                            } catch (Throwable th5) {
                                A06 = AbstractC0466k.A0(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                            }
                            tVar22.b(A06);
                            break;
                        case 5:
                            InterfaceC0115f interfaceC0115f7 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.i.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.i.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A07 = K1.b.W(interfaceC0115f7.c(str8, (C0116g) obj15));
                            } catch (Throwable th6) {
                                A07 = AbstractC0466k.A0(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + Log.getStackTraceString(th6));
                            }
                            tVar22.b(A07);
                            break;
                        case 6:
                            InterfaceC0115f interfaceC0115f8 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.i.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.i.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            kotlin.jvm.internal.i.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f8.p(str9, booleanValue, (C0116g) obj18);
                                A08 = K1.b.W(null);
                            } catch (Throwable th7) {
                                A08 = AbstractC0466k.A0(th7.getClass().getSimpleName(), th7.toString(), "Cause: " + th7.getCause() + ", Stacktrace: " + Log.getStackTraceString(th7));
                            }
                            tVar22.b(A08);
                            break;
                        case 7:
                            InterfaceC0115f interfaceC0115f9 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            kotlin.jvm.internal.i.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj19;
                            Object obj20 = list9.get(1);
                            kotlin.jvm.internal.i.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A09 = K1.b.W(interfaceC0115f9.u(str10, (C0116g) obj20));
                            } catch (Throwable th8) {
                                A09 = AbstractC0466k.A0(th8.getClass().getSimpleName(), th8.toString(), "Cause: " + th8.getCause() + ", Stacktrace: " + Log.getStackTraceString(th8));
                            }
                            tVar22.b(A09);
                            break;
                        case 8:
                            InterfaceC0115f interfaceC0115f10 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            kotlin.jvm.internal.i.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj21;
                            Object obj22 = list10.get(1);
                            kotlin.jvm.internal.i.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A010 = K1.b.W(interfaceC0115f10.t(str11, (C0116g) obj22));
                            } catch (Throwable th9) {
                                A010 = AbstractC0466k.A0(th9.getClass().getSimpleName(), th9.toString(), "Cause: " + th9.getCause() + ", Stacktrace: " + Log.getStackTraceString(th9));
                            }
                            tVar22.b(A010);
                            break;
                        case 9:
                            InterfaceC0115f interfaceC0115f11 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.i.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f11.k(list12, (C0116g) obj23);
                                A011 = K1.b.W(null);
                            } catch (Throwable th10) {
                                A011 = AbstractC0466k.A0(th10.getClass().getSimpleName(), th10.toString(), "Cause: " + th10.getCause() + ", Stacktrace: " + Log.getStackTraceString(th10));
                            }
                            tVar22.b(A011);
                            break;
                        case 10:
                            InterfaceC0115f interfaceC0115f12 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            kotlin.jvm.internal.i.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A012 = K1.b.W(interfaceC0115f12.e(list14, (C0116g) obj24));
                            } catch (Throwable th11) {
                                A012 = AbstractC0466k.A0(th11.getClass().getSimpleName(), th11.toString(), "Cause: " + th11.getCause() + ", Stacktrace: " + Log.getStackTraceString(th11));
                            }
                            tVar22.b(A012);
                            break;
                        case 11:
                            InterfaceC0115f interfaceC0115f13 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            kotlin.jvm.internal.i.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                A013 = K1.b.W(interfaceC0115f13.h(list16, (C0116g) obj25));
                            } catch (Throwable th12) {
                                A013 = AbstractC0466k.A0(th12.getClass().getSimpleName(), th12.toString(), "Cause: " + th12.getCause() + ", Stacktrace: " + Log.getStackTraceString(th12));
                            }
                            tVar22.b(A013);
                            break;
                        case 12:
                            InterfaceC0115f interfaceC0115f14 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            kotlin.jvm.internal.i.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj26;
                            Object obj27 = list17.get(1);
                            kotlin.jvm.internal.i.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj27;
                            Object obj28 = list17.get(2);
                            kotlin.jvm.internal.i.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f14.d(str12, str13, (C0116g) obj28);
                                A014 = K1.b.W(null);
                            } catch (Throwable th13) {
                                A014 = AbstractC0466k.A0(th13.getClass().getSimpleName(), th13.toString(), "Cause: " + th13.getCause() + ", Stacktrace: " + Log.getStackTraceString(th13));
                            }
                            tVar22.b(A014);
                            break;
                        case 13:
                            InterfaceC0115f interfaceC0115f15 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            kotlin.jvm.internal.i.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj29;
                            Object obj30 = list18.get(1);
                            kotlin.jvm.internal.i.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            kotlin.jvm.internal.i.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f15.m(str14, longValue, (C0116g) obj31);
                                A015 = K1.b.W(null);
                            } catch (Throwable th14) {
                                A015 = AbstractC0466k.A0(th14.getClass().getSimpleName(), th14.toString(), "Cause: " + th14.getCause() + ", Stacktrace: " + Log.getStackTraceString(th14));
                            }
                            tVar22.b(A015);
                            break;
                        default:
                            InterfaceC0115f interfaceC0115f16 = interfaceC0115f;
                            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            kotlin.jvm.internal.i.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj32;
                            Object obj33 = list19.get(1);
                            kotlin.jvm.internal.i.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            kotlin.jvm.internal.i.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0115f16.j(str15, doubleValue, (C0116g) obj34);
                                A016 = K1.b.W(null);
                            } catch (Throwable th15) {
                                A016 = AbstractC0466k.A0(th15.getClass().getSimpleName(), th15.toString(), "Cause: " + th15.getCause() + ", Stacktrace: " + Log.getStackTraceString(th15));
                            }
                            tVar22.b(A016);
                            break;
                    }
                }
            });
        }
    }
}
