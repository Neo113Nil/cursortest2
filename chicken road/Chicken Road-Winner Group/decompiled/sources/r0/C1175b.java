package r0;

import A0.h;
import T1.k;
import a2.C0108d;
import android.app.Activity;
import android.util.Log;
import androidx.lifecycle.z;
import d2.C0277g;
import e2.AbstractC0293h;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.j;
import u0.ServiceConnectionC1210a;

/* renamed from: r0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1175b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C1175b f10274a = new C1175b();

    /* renamed from: b, reason: collision with root package name */
    public static final C0277g f10275b = new C0277g(new C0108d(1));

    public static void a(C1175b c1175b, T1.f binaryMessenger, final InterfaceC1176c interfaceC1176c) {
        c1175b.getClass();
        j.e(binaryMessenger, "binaryMessenger");
        String concat = "".length() > 0 ? ".".concat("") : "";
        String j3 = B0.c.j("dev.flutter.pigeon.flutter_custom_tabs_android.CustomTabsApi.launch", concat);
        C0277g c0277g = f10275b;
        D0.a aVar = new D0.a(binaryMessenger, j3, (k) c0277g.a(), (P0.j) null);
        if (interfaceC1176c != null) {
            final int i3 = 0;
            aVar.g(new T1.b() { // from class: r0.a
                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    List S2;
                    List S3;
                    List S4;
                    List S5;
                    List S6;
                    switch (i3) {
                        case 0:
                            InterfaceC1176c interfaceC1176c2 = interfaceC1176c;
                            j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((h) interfaceC1176c2).g(str, ((Boolean) obj3).booleanValue(), (Map) list.get(2));
                                S2 = X0.a.z(null);
                            } catch (Throwable th) {
                                if (th instanceof C1178e) {
                                    C1178e c1178e = th;
                                    S2 = AbstractC0293h.S(c1178e.f10278a, c1178e.f10279b, null);
                                } else {
                                    S2 = AbstractC0293h.S(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                                }
                            }
                            eVar.l(S2);
                            break;
                        case 1:
                            try {
                                ((h) interfaceC1176c).d();
                                S3 = X0.a.z(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C1178e) {
                                    C1178e c1178e2 = th2;
                                    S3 = AbstractC0293h.S(c1178e2.f10278a, c1178e2.f10279b, null);
                                } else {
                                    S3 = AbstractC0293h.S(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                                }
                            }
                            eVar.l(S3);
                            break;
                        case 2:
                            InterfaceC1176c interfaceC1176c3 = interfaceC1176c;
                            j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            try {
                                S4 = X0.a.z(((h) interfaceC1176c3).l((Map) ((List) obj).get(0)));
                            } catch (Throwable th3) {
                                if (th3 instanceof C1178e) {
                                    C1178e c1178e3 = th3;
                                    S4 = AbstractC0293h.S(c1178e3.f10278a, c1178e3.f10279b, null);
                                } else {
                                    S4 = AbstractC0293h.S(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                                }
                            }
                            eVar.l(S4);
                            break;
                        case 3:
                            InterfaceC1176c interfaceC1176c4 = interfaceC1176c;
                            j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            j.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj4;
                            Object obj5 = list2.get(1);
                            j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            try {
                                ((h) interfaceC1176c4).h((String) obj5, list3);
                                S5 = X0.a.z(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C1178e) {
                                    C1178e c1178e4 = th4;
                                    S5 = AbstractC0293h.S(c1178e4.f10278a, c1178e4.f10279b, null);
                                } else {
                                    S5 = AbstractC0293h.S(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                                }
                            }
                            eVar.l(S5);
                            break;
                        default:
                            InterfaceC1176c interfaceC1176c5 = interfaceC1176c;
                            j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                h hVar = (h) interfaceC1176c5;
                                hVar.getClass();
                                z zVar = (z) hVar.f55c;
                                zVar.getClass();
                                LinkedHashMap linkedHashMap = zVar.f2346a;
                                ServiceConnectionC1210a serviceConnectionC1210a = (ServiceConnectionC1210a) linkedHashMap.get(str2);
                                if (serviceConnectionC1210a != null) {
                                    Activity activity = serviceConnectionC1210a.f10374c;
                                    if (activity != null) {
                                        activity.unbindService(serviceConnectionC1210a);
                                    }
                                    serviceConnectionC1210a.f10375d = null;
                                    serviceConnectionC1210a.f10376e = false;
                                    linkedHashMap.remove(str2);
                                }
                                S6 = X0.a.z(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C1178e) {
                                    C1178e c1178e5 = th5;
                                    S6 = AbstractC0293h.S(c1178e5.f10278a, c1178e5.f10279b, null);
                                } else {
                                    S6 = AbstractC0293h.S(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                                }
                            }
                            eVar.l(S6);
                            break;
                    }
                }
            });
        } else {
            aVar.g(null);
        }
        D0.a aVar2 = new D0.a(binaryMessenger, B0.c.j("dev.flutter.pigeon.flutter_custom_tabs_android.CustomTabsApi.closeAllIfPossible", concat), (k) c0277g.a(), (P0.j) null);
        if (interfaceC1176c != null) {
            final int i4 = 1;
            aVar2.g(new T1.b() { // from class: r0.a
                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    List S2;
                    List S3;
                    List S4;
                    List S5;
                    List S6;
                    switch (i4) {
                        case 0:
                            InterfaceC1176c interfaceC1176c2 = interfaceC1176c;
                            j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((h) interfaceC1176c2).g(str, ((Boolean) obj3).booleanValue(), (Map) list.get(2));
                                S2 = X0.a.z(null);
                            } catch (Throwable th) {
                                if (th instanceof C1178e) {
                                    C1178e c1178e = th;
                                    S2 = AbstractC0293h.S(c1178e.f10278a, c1178e.f10279b, null);
                                } else {
                                    S2 = AbstractC0293h.S(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                                }
                            }
                            eVar.l(S2);
                            break;
                        case 1:
                            try {
                                ((h) interfaceC1176c).d();
                                S3 = X0.a.z(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C1178e) {
                                    C1178e c1178e2 = th2;
                                    S3 = AbstractC0293h.S(c1178e2.f10278a, c1178e2.f10279b, null);
                                } else {
                                    S3 = AbstractC0293h.S(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                                }
                            }
                            eVar.l(S3);
                            break;
                        case 2:
                            InterfaceC1176c interfaceC1176c3 = interfaceC1176c;
                            j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            try {
                                S4 = X0.a.z(((h) interfaceC1176c3).l((Map) ((List) obj).get(0)));
                            } catch (Throwable th3) {
                                if (th3 instanceof C1178e) {
                                    C1178e c1178e3 = th3;
                                    S4 = AbstractC0293h.S(c1178e3.f10278a, c1178e3.f10279b, null);
                                } else {
                                    S4 = AbstractC0293h.S(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                                }
                            }
                            eVar.l(S4);
                            break;
                        case 3:
                            InterfaceC1176c interfaceC1176c4 = interfaceC1176c;
                            j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            j.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj4;
                            Object obj5 = list2.get(1);
                            j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            try {
                                ((h) interfaceC1176c4).h((String) obj5, list3);
                                S5 = X0.a.z(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C1178e) {
                                    C1178e c1178e4 = th4;
                                    S5 = AbstractC0293h.S(c1178e4.f10278a, c1178e4.f10279b, null);
                                } else {
                                    S5 = AbstractC0293h.S(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                                }
                            }
                            eVar.l(S5);
                            break;
                        default:
                            InterfaceC1176c interfaceC1176c5 = interfaceC1176c;
                            j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                h hVar = (h) interfaceC1176c5;
                                hVar.getClass();
                                z zVar = (z) hVar.f55c;
                                zVar.getClass();
                                LinkedHashMap linkedHashMap = zVar.f2346a;
                                ServiceConnectionC1210a serviceConnectionC1210a = (ServiceConnectionC1210a) linkedHashMap.get(str2);
                                if (serviceConnectionC1210a != null) {
                                    Activity activity = serviceConnectionC1210a.f10374c;
                                    if (activity != null) {
                                        activity.unbindService(serviceConnectionC1210a);
                                    }
                                    serviceConnectionC1210a.f10375d = null;
                                    serviceConnectionC1210a.f10376e = false;
                                    linkedHashMap.remove(str2);
                                }
                                S6 = X0.a.z(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C1178e) {
                                    C1178e c1178e5 = th5;
                                    S6 = AbstractC0293h.S(c1178e5.f10278a, c1178e5.f10279b, null);
                                } else {
                                    S6 = AbstractC0293h.S(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                                }
                            }
                            eVar.l(S6);
                            break;
                    }
                }
            });
        } else {
            aVar2.g(null);
        }
        D0.a aVar3 = new D0.a(binaryMessenger, B0.c.j("dev.flutter.pigeon.flutter_custom_tabs_android.CustomTabsApi.warmup", concat), (k) c0277g.a(), (P0.j) null);
        if (interfaceC1176c != null) {
            final int i5 = 2;
            aVar3.g(new T1.b() { // from class: r0.a
                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    List S2;
                    List S3;
                    List S4;
                    List S5;
                    List S6;
                    switch (i5) {
                        case 0:
                            InterfaceC1176c interfaceC1176c2 = interfaceC1176c;
                            j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((h) interfaceC1176c2).g(str, ((Boolean) obj3).booleanValue(), (Map) list.get(2));
                                S2 = X0.a.z(null);
                            } catch (Throwable th) {
                                if (th instanceof C1178e) {
                                    C1178e c1178e = th;
                                    S2 = AbstractC0293h.S(c1178e.f10278a, c1178e.f10279b, null);
                                } else {
                                    S2 = AbstractC0293h.S(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                                }
                            }
                            eVar.l(S2);
                            break;
                        case 1:
                            try {
                                ((h) interfaceC1176c).d();
                                S3 = X0.a.z(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C1178e) {
                                    C1178e c1178e2 = th2;
                                    S3 = AbstractC0293h.S(c1178e2.f10278a, c1178e2.f10279b, null);
                                } else {
                                    S3 = AbstractC0293h.S(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                                }
                            }
                            eVar.l(S3);
                            break;
                        case 2:
                            InterfaceC1176c interfaceC1176c3 = interfaceC1176c;
                            j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            try {
                                S4 = X0.a.z(((h) interfaceC1176c3).l((Map) ((List) obj).get(0)));
                            } catch (Throwable th3) {
                                if (th3 instanceof C1178e) {
                                    C1178e c1178e3 = th3;
                                    S4 = AbstractC0293h.S(c1178e3.f10278a, c1178e3.f10279b, null);
                                } else {
                                    S4 = AbstractC0293h.S(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                                }
                            }
                            eVar.l(S4);
                            break;
                        case 3:
                            InterfaceC1176c interfaceC1176c4 = interfaceC1176c;
                            j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            j.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj4;
                            Object obj5 = list2.get(1);
                            j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            try {
                                ((h) interfaceC1176c4).h((String) obj5, list3);
                                S5 = X0.a.z(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C1178e) {
                                    C1178e c1178e4 = th4;
                                    S5 = AbstractC0293h.S(c1178e4.f10278a, c1178e4.f10279b, null);
                                } else {
                                    S5 = AbstractC0293h.S(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                                }
                            }
                            eVar.l(S5);
                            break;
                        default:
                            InterfaceC1176c interfaceC1176c5 = interfaceC1176c;
                            j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                h hVar = (h) interfaceC1176c5;
                                hVar.getClass();
                                z zVar = (z) hVar.f55c;
                                zVar.getClass();
                                LinkedHashMap linkedHashMap = zVar.f2346a;
                                ServiceConnectionC1210a serviceConnectionC1210a = (ServiceConnectionC1210a) linkedHashMap.get(str2);
                                if (serviceConnectionC1210a != null) {
                                    Activity activity = serviceConnectionC1210a.f10374c;
                                    if (activity != null) {
                                        activity.unbindService(serviceConnectionC1210a);
                                    }
                                    serviceConnectionC1210a.f10375d = null;
                                    serviceConnectionC1210a.f10376e = false;
                                    linkedHashMap.remove(str2);
                                }
                                S6 = X0.a.z(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C1178e) {
                                    C1178e c1178e5 = th5;
                                    S6 = AbstractC0293h.S(c1178e5.f10278a, c1178e5.f10279b, null);
                                } else {
                                    S6 = AbstractC0293h.S(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                                }
                            }
                            eVar.l(S6);
                            break;
                    }
                }
            });
        } else {
            aVar3.g(null);
        }
        D0.a aVar4 = new D0.a(binaryMessenger, B0.c.j("dev.flutter.pigeon.flutter_custom_tabs_android.CustomTabsApi.mayLaunch", concat), (k) c0277g.a(), (P0.j) null);
        if (interfaceC1176c != null) {
            final int i6 = 3;
            aVar4.g(new T1.b() { // from class: r0.a
                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    List S2;
                    List S3;
                    List S4;
                    List S5;
                    List S6;
                    switch (i6) {
                        case 0:
                            InterfaceC1176c interfaceC1176c2 = interfaceC1176c;
                            j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((h) interfaceC1176c2).g(str, ((Boolean) obj3).booleanValue(), (Map) list.get(2));
                                S2 = X0.a.z(null);
                            } catch (Throwable th) {
                                if (th instanceof C1178e) {
                                    C1178e c1178e = th;
                                    S2 = AbstractC0293h.S(c1178e.f10278a, c1178e.f10279b, null);
                                } else {
                                    S2 = AbstractC0293h.S(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                                }
                            }
                            eVar.l(S2);
                            break;
                        case 1:
                            try {
                                ((h) interfaceC1176c).d();
                                S3 = X0.a.z(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C1178e) {
                                    C1178e c1178e2 = th2;
                                    S3 = AbstractC0293h.S(c1178e2.f10278a, c1178e2.f10279b, null);
                                } else {
                                    S3 = AbstractC0293h.S(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                                }
                            }
                            eVar.l(S3);
                            break;
                        case 2:
                            InterfaceC1176c interfaceC1176c3 = interfaceC1176c;
                            j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            try {
                                S4 = X0.a.z(((h) interfaceC1176c3).l((Map) ((List) obj).get(0)));
                            } catch (Throwable th3) {
                                if (th3 instanceof C1178e) {
                                    C1178e c1178e3 = th3;
                                    S4 = AbstractC0293h.S(c1178e3.f10278a, c1178e3.f10279b, null);
                                } else {
                                    S4 = AbstractC0293h.S(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                                }
                            }
                            eVar.l(S4);
                            break;
                        case 3:
                            InterfaceC1176c interfaceC1176c4 = interfaceC1176c;
                            j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            j.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj4;
                            Object obj5 = list2.get(1);
                            j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            try {
                                ((h) interfaceC1176c4).h((String) obj5, list3);
                                S5 = X0.a.z(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C1178e) {
                                    C1178e c1178e4 = th4;
                                    S5 = AbstractC0293h.S(c1178e4.f10278a, c1178e4.f10279b, null);
                                } else {
                                    S5 = AbstractC0293h.S(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                                }
                            }
                            eVar.l(S5);
                            break;
                        default:
                            InterfaceC1176c interfaceC1176c5 = interfaceC1176c;
                            j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                h hVar = (h) interfaceC1176c5;
                                hVar.getClass();
                                z zVar = (z) hVar.f55c;
                                zVar.getClass();
                                LinkedHashMap linkedHashMap = zVar.f2346a;
                                ServiceConnectionC1210a serviceConnectionC1210a = (ServiceConnectionC1210a) linkedHashMap.get(str2);
                                if (serviceConnectionC1210a != null) {
                                    Activity activity = serviceConnectionC1210a.f10374c;
                                    if (activity != null) {
                                        activity.unbindService(serviceConnectionC1210a);
                                    }
                                    serviceConnectionC1210a.f10375d = null;
                                    serviceConnectionC1210a.f10376e = false;
                                    linkedHashMap.remove(str2);
                                }
                                S6 = X0.a.z(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C1178e) {
                                    C1178e c1178e5 = th5;
                                    S6 = AbstractC0293h.S(c1178e5.f10278a, c1178e5.f10279b, null);
                                } else {
                                    S6 = AbstractC0293h.S(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                                }
                            }
                            eVar.l(S6);
                            break;
                    }
                }
            });
        } else {
            aVar4.g(null);
        }
        D0.a aVar5 = new D0.a(binaryMessenger, B0.c.j("dev.flutter.pigeon.flutter_custom_tabs_android.CustomTabsApi.invalidate", concat), (k) c0277g.a(), (P0.j) null);
        if (interfaceC1176c == null) {
            aVar5.g(null);
        } else {
            final int i7 = 4;
            aVar5.g(new T1.b() { // from class: r0.a
                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    List S2;
                    List S3;
                    List S4;
                    List S5;
                    List S6;
                    switch (i7) {
                        case 0:
                            InterfaceC1176c interfaceC1176c2 = interfaceC1176c;
                            j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            j.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            Object obj3 = list.get(1);
                            j.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                            try {
                                ((h) interfaceC1176c2).g(str, ((Boolean) obj3).booleanValue(), (Map) list.get(2));
                                S2 = X0.a.z(null);
                            } catch (Throwable th) {
                                if (th instanceof C1178e) {
                                    C1178e c1178e = th;
                                    S2 = AbstractC0293h.S(c1178e.f10278a, c1178e.f10279b, null);
                                } else {
                                    S2 = AbstractC0293h.S(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
                                }
                            }
                            eVar.l(S2);
                            break;
                        case 1:
                            try {
                                ((h) interfaceC1176c).d();
                                S3 = X0.a.z(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C1178e) {
                                    C1178e c1178e2 = th2;
                                    S3 = AbstractC0293h.S(c1178e2.f10278a, c1178e2.f10279b, null);
                                } else {
                                    S3 = AbstractC0293h.S(th2.getClass().getSimpleName(), th2.toString(), "Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
                                }
                            }
                            eVar.l(S3);
                            break;
                        case 2:
                            InterfaceC1176c interfaceC1176c3 = interfaceC1176c;
                            j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            try {
                                S4 = X0.a.z(((h) interfaceC1176c3).l((Map) ((List) obj).get(0)));
                            } catch (Throwable th3) {
                                if (th3 instanceof C1178e) {
                                    C1178e c1178e3 = th3;
                                    S4 = AbstractC0293h.S(c1178e3.f10278a, c1178e3.f10279b, null);
                                } else {
                                    S4 = AbstractC0293h.S(th3.getClass().getSimpleName(), th3.toString(), "Cause: " + th3.getCause() + ", Stacktrace: " + Log.getStackTraceString(th3));
                                }
                            }
                            eVar.l(S4);
                            break;
                        case 3:
                            InterfaceC1176c interfaceC1176c4 = interfaceC1176c;
                            j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj4 = list2.get(0);
                            j.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj4;
                            Object obj5 = list2.get(1);
                            j.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            try {
                                ((h) interfaceC1176c4).h((String) obj5, list3);
                                S5 = X0.a.z(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C1178e) {
                                    C1178e c1178e4 = th4;
                                    S5 = AbstractC0293h.S(c1178e4.f10278a, c1178e4.f10279b, null);
                                } else {
                                    S5 = AbstractC0293h.S(th4.getClass().getSimpleName(), th4.toString(), "Cause: " + th4.getCause() + ", Stacktrace: " + Log.getStackTraceString(th4));
                                }
                            }
                            eVar.l(S5);
                            break;
                        default:
                            InterfaceC1176c interfaceC1176c5 = interfaceC1176c;
                            j.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            j.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                h hVar = (h) interfaceC1176c5;
                                hVar.getClass();
                                z zVar = (z) hVar.f55c;
                                zVar.getClass();
                                LinkedHashMap linkedHashMap = zVar.f2346a;
                                ServiceConnectionC1210a serviceConnectionC1210a = (ServiceConnectionC1210a) linkedHashMap.get(str2);
                                if (serviceConnectionC1210a != null) {
                                    Activity activity = serviceConnectionC1210a.f10374c;
                                    if (activity != null) {
                                        activity.unbindService(serviceConnectionC1210a);
                                    }
                                    serviceConnectionC1210a.f10375d = null;
                                    serviceConnectionC1210a.f10376e = false;
                                    linkedHashMap.remove(str2);
                                }
                                S6 = X0.a.z(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C1178e) {
                                    C1178e c1178e5 = th5;
                                    S6 = AbstractC0293h.S(c1178e5.f10278a, c1178e5.f10279b, null);
                                } else {
                                    S6 = AbstractC0293h.S(th5.getClass().getSimpleName(), th5.toString(), "Cause: " + th5.getCause() + ", Stacktrace: " + Log.getStackTraceString(th5));
                                }
                            }
                            eVar.l(S6);
                            break;
                    }
                }
            });
        }
    }
}
