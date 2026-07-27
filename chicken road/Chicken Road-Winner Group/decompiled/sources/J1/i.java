package J1;

import H0.f;
import I1.AbstractActivityC0027d;
import I1.H;
import I1.I;
import J1.i;
import K.C0036d;
import K.C0051t;
import K.InterfaceC0041i;
import K.a0;
import K.c0;
import K.j0;
import K.k0;
import T1.l;
import T1.m;
import T1.n;
import T1.o;
import T1.s;
import U.O;
import U.u;
import U.v;
import Y1.A;
import Y1.C0077a;
import Y1.C0082f;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import b0.p;
import d0.C0263c;
import d0.C0264d;
import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import i0.C0329b;
import io.appmetrica.analytics.impl.C0644l9;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import m0.C1120h;
import m0.r;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public class i implements C0.b, H, T1.f, InterfaceC0041i, T1.b, m, O, r, z2.d, p {

    /* renamed from: c, reason: collision with root package name */
    public static volatile i f727c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f728a;

    /* renamed from: b, reason: collision with root package name */
    public Object f729b;

    public /* synthetic */ i(int i3, Object obj) {
        this.f728a = i3;
        this.f729b = obj;
    }

    public static int v(int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            i5++;
            if (i5 == i4) {
                i6++;
                i5 = 0;
            } else if (i5 > i4) {
                i6++;
                i5 = 1;
            }
        }
        return i5 + 1 > i4 ? i6 + 1 : i6;
    }

    @Override // b0.p
    public String[] a() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f729b).getSupportedFeatures();
    }

    @Override // K.InterfaceC0041i
    public Object b(o2.p pVar, i2.g gVar) {
        return ((InterfaceC0041i) this.f729b).b(new N.c(pVar, null), gVar);
    }

    @Override // U.O
    public int c() {
        u uVar = (u) this.f729b;
        return uVar.f - uVar.t();
    }

    @Override // b0.p
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) F2.b.j(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f729b).createWebView(webView));
    }

    @Override // I1.H
    public void d() {
        ((I) this.f729b).f584b = null;
    }

    @Override // T1.b
    public void e(Object obj, a1.e eVar) {
        HashMap hashMap;
        HashMap hashMap2;
        A0.j jVar = (A0.j) this.f729b;
        if (((io.flutter.view.c) jVar.f68d) == null) {
            eVar.l(null);
            return;
        }
        hashMap = (HashMap) obj;
        String str = (String) hashMap.get("type");
        hashMap2 = (HashMap) hashMap.get("data");
        str.getClass();
        switch (str) {
            case "tooltip":
                String str2 = (String) hashMap2.get("message");
                if (str2 != null) {
                    io.flutter.view.c cVar = (io.flutter.view.c) jVar.f68d;
                    if (Build.VERSION.SDK_INT < 28) {
                        io.flutter.view.i iVar = (io.flutter.view.i) cVar.f9340a;
                        AccessibilityEvent e3 = iVar.e(0, 32);
                        e3.getText().add(str2);
                        iVar.i(e3);
                        break;
                    } else {
                        cVar.getClass();
                        break;
                    }
                }
                break;
            case "announce":
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    io.flutter.view.c cVar2 = (io.flutter.view.c) jVar.f68d;
                    if (Build.VERSION.SDK_INT >= 36) {
                        cVar2.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.i) cVar2.f9340a).f9427a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    io.flutter.view.c cVar3 = (io.flutter.view.c) jVar.f68d;
                    ((io.flutter.view.i) cVar3.f9340a).h(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.c cVar4 = (io.flutter.view.c) jVar.f68d;
                    ((io.flutter.view.i) cVar4.f9340a).h(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.c cVar5 = (io.flutter.view.c) jVar.f68d;
                    ((io.flutter.view.i) cVar5.f9340a).h(num3.intValue(), 2);
                    break;
                }
                break;
        }
        eVar.l(null);
    }

    @Override // U.O
    public int f(View view) {
        v vVar = (v) view.getLayoutParams();
        ((u) this.f729b).getClass();
        return (view.getLeft() - ((v) view.getLayoutParams()).f1591a.left) - ((ViewGroup.MarginLayoutParams) vVar).leftMargin;
    }

    @Override // c2.a
    public Object get() {
        return new H0.k((Context) ((b0.i) this.f729b).f2461b, "com.google.android.datatransport.events", Integer.valueOf(H0.k.f505d).intValue());
    }

    @Override // K.InterfaceC0041i
    public z2.d getData() {
        return ((InterfaceC0041i) this.f729b).getData();
    }

    @Override // b0.p
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) F2.b.j(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f729b).getStatics());
    }

    @Override // T1.f
    public void h(String str, T1.d dVar) {
        ((K1.i) this.f729b).o(str, dVar, null);
    }

    @Override // T1.f
    public void i(String str, ByteBuffer byteBuffer, T1.e eVar) {
        ((K1.i) this.f729b).i(str, byteBuffer, eVar);
    }

    @Override // T1.f
    public P0.j j(T1.j jVar) {
        return ((K1.i) this.f729b).j(jVar);
    }

    @Override // T1.f
    public void k(String str, ByteBuffer byteBuffer) {
        ((K1.i) this.f729b).i(str, byteBuffer, null);
    }

    @Override // z2.d
    public Object l(z2.e eVar, InterfaceC0319c interfaceC0319c) {
        Object l3 = ((z2.d) this.f729b).l(new C0051t(eVar, 1), interfaceC0319c);
        return l3 == EnumC0326a.f4994a ? l3 : C0279i.f4852a;
    }

    @Override // U.O
    public View m(int i3) {
        return ((u) this.f729b).o(i3);
    }

    @Override // U.O
    public int n() {
        return ((u) this.f729b).s();
    }

    @Override // T1.f
    public void o(String str, T1.d dVar, P0.j jVar) {
        ((K1.i) this.f729b).o(str, dVar, jVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // T1.m
    public void onMethodCall(l lVar, n nVar) {
        char c3;
        char c4;
        boolean isStylusHandwritingAvailable;
        boolean isStylusHandwritingAvailable2;
        char c5;
        int i3 = 2;
        boolean z3 = false;
        switch (this.f728a) {
            case 13:
                ((P0.j) this.f729b).getClass();
                return;
            case 14:
            case 16:
            default:
                b0.i iVar = (b0.i) this.f729b;
                if (((io.flutter.plugin.editing.i) iVar.f2461b) == null) {
                    return;
                }
                String str = lVar.f1468a;
                Object obj = lVar.f1469b;
                str.getClass();
                if (!str.equals("SpellCheck.initiateSpellCheck")) {
                    ((S1.i) nVar).a();
                    return;
                }
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    ((io.flutter.plugin.editing.i) iVar.f2461b).a((String) arrayList.get(0), (String) arrayList.get(1), (S1.i) nVar);
                    return;
                } catch (IllegalStateException e3) {
                    ((S1.i) nVar).b("error", e3.getMessage(), null);
                    return;
                }
            case 15:
                b0.i iVar2 = (b0.i) this.f729b;
                if (((b0.i) iVar2.f2461b) == null) {
                    return;
                }
                String str2 = lVar.f1468a;
                try {
                    if (str2.hashCode() == -1307105544 && str2.equals("activateSystemCursor")) {
                        try {
                            ((b0.i) iVar2.f2461b).e((String) ((HashMap) lVar.f1469b).get("kind"));
                            ((S1.i) nVar).success(Boolean.TRUE);
                        } catch (Exception e4) {
                            ((S1.i) nVar).b("error", "Error when setting cursors: " + e4.getMessage(), null);
                        }
                    }
                    return;
                } catch (Exception e5) {
                    ((S1.i) nVar).b("error", "Unhandled error: " + e5.getMessage(), null);
                    return;
                }
            case 17:
                a1.e eVar = (a1.e) this.f729b;
                if (((S1.h) eVar.f1789c) == null) {
                    return;
                }
                String str3 = lVar.f1468a;
                str3.getClass();
                Object obj2 = lVar.f1469b;
                switch (str3.hashCode()) {
                    case -1352294148:
                        if (str3.equals("create")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1019779949:
                        if (str3.equals("offset")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -934437708:
                        if (str3.equals("resize")) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -756050293:
                        if (str3.equals("clearFocus")) {
                            c3 = 3;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -308988850:
                        if (str3.equals("synchronizeToNativeViewHierarchy")) {
                            c3 = 4;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 110550847:
                        if (str3.equals("touch")) {
                            c3 = 5;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 576796989:
                        if (str3.equals("setDirection")) {
                            c3 = 6;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1671767583:
                        if (str3.equals("dispose")) {
                            c3 = 7;
                            break;
                        }
                        c3 = 65535;
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                switch (c3) {
                    case 0:
                        Map map = (Map) obj2;
                        boolean z4 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                        ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                        try {
                            if (((S1.h) eVar.f1789c).q()) {
                                ((S1.h) eVar.f1789c).g(new S1.e(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 0, wrap));
                                ((S1.i) nVar).success(null);
                                return;
                            }
                            if (z4) {
                                ((S1.h) eVar.f1789c).m(new S1.e(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 3, wrap));
                                ((S1.i) nVar).success(null);
                                return;
                            }
                            if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                                z3 = true;
                            }
                            long a3 = ((S1.h) eVar.f1789c).a(new S1.e(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z3 ? 2 : 1, wrap));
                            if (a3 != -2) {
                                ((S1.i) nVar).success(Long.valueOf(a3));
                                return;
                            } else {
                                if (!z3) {
                                    throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                                }
                                ((S1.i) nVar).success(null);
                                return;
                            }
                        } catch (IllegalStateException e6) {
                            ((S1.i) nVar).b("error", Log.getStackTraceString(e6), null);
                            return;
                        }
                    case 1:
                        Map map2 = (Map) obj2;
                        try {
                            ((S1.h) eVar.f1789c).d(((Integer) map2.get("id")).intValue(), ((Double) map2.get("top")).doubleValue(), ((Double) map2.get("left")).doubleValue());
                            ((S1.i) nVar).success(null);
                            return;
                        } catch (IllegalStateException e7) {
                            ((S1.i) nVar).b("error", Log.getStackTraceString(e7), null);
                            return;
                        }
                    case 2:
                        Map map3 = (Map) obj2;
                        try {
                            ((S1.h) eVar.f1789c).o(new S1.g(((Integer) map3.get("id")).intValue(), ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue()), new F1.b(7, (S1.i) nVar));
                            return;
                        } catch (IllegalStateException e8) {
                            ((S1.i) nVar).b("error", Log.getStackTraceString(e8), null);
                            return;
                        }
                    case 3:
                        try {
                            ((S1.h) eVar.f1789c).i(((Integer) obj2).intValue());
                            ((S1.i) nVar).success(null);
                            return;
                        } catch (IllegalStateException e9) {
                            ((S1.i) nVar).b("error", Log.getStackTraceString(e9), null);
                            return;
                        }
                    case 4:
                        try {
                            ((S1.h) eVar.f1789c).b(((Boolean) obj2).booleanValue());
                            ((S1.i) nVar).success(null);
                            return;
                        } catch (IllegalStateException e10) {
                            ((S1.i) nVar).b("error", Log.getStackTraceString(e10), null);
                            return;
                        }
                    case 5:
                        List list = (List) obj2;
                        try {
                            ((S1.h) eVar.f1789c).j(new S1.f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                            ((S1.i) nVar).success(null);
                            return;
                        } catch (IllegalStateException e11) {
                            ((S1.i) nVar).b("error", Log.getStackTraceString(e11), null);
                            return;
                        }
                    case 6:
                        Map map4 = (Map) obj2;
                        try {
                            ((S1.h) eVar.f1789c).e(((Integer) map4.get("id")).intValue(), ((Integer) map4.get("direction")).intValue());
                            ((S1.i) nVar).success(null);
                            return;
                        } catch (IllegalStateException e12) {
                            ((S1.i) nVar).b("error", Log.getStackTraceString(e12), null);
                            return;
                        }
                    case 7:
                        try {
                            ((S1.h) eVar.f1789c).n(((Integer) ((Map) obj2).get("id")).intValue());
                            ((S1.i) nVar).success(null);
                            return;
                        } catch (IllegalStateException e13) {
                            ((S1.i) nVar).b("error", Log.getStackTraceString(e13), null);
                            return;
                        }
                    default:
                        ((S1.i) nVar).a();
                        return;
                }
            case 18:
                a1.e eVar2 = (a1.e) this.f729b;
                if (((W1.a) eVar2.f1789c) == null) {
                    return;
                }
                String str4 = lVar.f1468a;
                Object obj3 = lVar.f1469b;
                str4.getClass();
                if (str4.equals("ProcessText.processTextAction")) {
                    try {
                        ArrayList arrayList2 = (ArrayList) obj3;
                        ((W1.a) eVar2.f1789c).a((String) arrayList2.get(0), (String) arrayList2.get(1), ((Boolean) arrayList2.get(2)).booleanValue(), (S1.i) nVar);
                        return;
                    } catch (IllegalStateException e14) {
                        ((S1.i) nVar).b("error", e14.getMessage(), null);
                        return;
                    }
                }
                if (!str4.equals("ProcessText.queryTextActions")) {
                    ((S1.i) nVar).a();
                    return;
                }
                try {
                    ((S1.i) nVar).success(((W1.a) eVar2.f1789c).b());
                    return;
                } catch (IllegalStateException e15) {
                    ((S1.i) nVar).b("error", e15.getMessage(), null);
                    return;
                }
            case C0644l9.f7759C /* 19 */:
                b0.i iVar3 = (b0.i) this.f729b;
                if (((V1.b) iVar3.f2461b) == null) {
                    return;
                }
                String str5 = lVar.f1468a;
                str5.getClass();
                switch (str5.hashCode()) {
                    case -705821951:
                        if (str5.equals("Scribe.isFeatureAvailable")) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1759284829:
                        if (str5.equals("Scribe.startStylusHandwriting")) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 2119738044:
                        if (str5.equals("Scribe.isStylusHandwritingAvailable")) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                switch (c4) {
                    case 0:
                        try {
                            V1.b bVar = (V1.b) iVar3.f2461b;
                            if (Build.VERSION.SDK_INT >= 34) {
                                isStylusHandwritingAvailable = ((InputMethodManager) bVar.f1614b).isStylusHandwritingAvailable();
                                if (isStylusHandwritingAvailable) {
                                    ((S1.i) nVar).success(Boolean.valueOf(r11));
                                    return;
                                }
                            } else {
                                bVar.getClass();
                            }
                            r11 = false;
                            ((S1.i) nVar).success(Boolean.valueOf(r11));
                            return;
                        } catch (IllegalStateException e16) {
                            ((S1.i) nVar).b("error", e16.getMessage(), null);
                            return;
                        }
                    case 1:
                        if (Build.VERSION.SDK_INT < 33) {
                            ((S1.i) nVar).b("error", "Requires API level 33 or higher.", null);
                            return;
                        }
                        try {
                            V1.b bVar2 = (V1.b) iVar3.f2461b;
                            ((InputMethodManager) bVar2.f1614b).startStylusHandwriting((View) bVar2.f1615c);
                            ((S1.i) nVar).success(null);
                            return;
                        } catch (IllegalStateException e17) {
                            ((S1.i) nVar).b("error", e17.getMessage(), null);
                            return;
                        }
                    case 2:
                        if (Build.VERSION.SDK_INT < 34) {
                            ((S1.i) nVar).b("error", "Requires API level 34 or higher.", null);
                            return;
                        }
                        try {
                            isStylusHandwritingAvailable2 = ((InputMethodManager) ((V1.b) iVar3.f2461b).f1614b).isStylusHandwritingAvailable();
                            ((S1.i) nVar).success(Boolean.valueOf(isStylusHandwritingAvailable2));
                            return;
                        } catch (IllegalStateException e18) {
                            ((S1.i) nVar).b("error", e18.getMessage(), null);
                            return;
                        }
                    default:
                        ((S1.i) nVar).a();
                        return;
                }
            case C0644l9.f7760D /* 20 */:
                b0.i iVar4 = (b0.i) this.f729b;
                if (((X1.a) iVar4.f2461b) == null) {
                    return;
                }
                String str6 = lVar.f1468a;
                str6.getClass();
                switch (str6.hashCode()) {
                    case -1937987631:
                        if (str6.equals("SensitiveContent.getContentSensitivity")) {
                            c5 = 0;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 598223325:
                        if (str6.equals("SensitiveContent.setContentSensitivity")) {
                            c5 = 1;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1615625817:
                        if (str6.equals("SensitiveContent.isSupported")) {
                            c5 = 2;
                            break;
                        }
                        c5 = 65535;
                        break;
                    default:
                        c5 = 65535;
                        break;
                }
                switch (c5) {
                    case 0:
                        try {
                            int a4 = ((X1.a) iVar4.f2461b).a();
                            ((S1.i) nVar).success(Integer.valueOf(a4 != 0 ? a4 != 1 ? a4 != 2 ? 3 : 2 : 1 : 0));
                            return;
                        } catch (IllegalArgumentException | IllegalStateException e19) {
                            ((S1.i) nVar).b("error", e19.getMessage(), null);
                            return;
                        }
                    case 1:
                        int intValue = ((Integer) lVar.f1469b).intValue();
                        try {
                            X1.a aVar = (X1.a) iVar4.f2461b;
                            iVar4.getClass();
                            if (intValue == 0) {
                                i3 = 0;
                            } else if (intValue == 1) {
                                i3 = 1;
                            } else if (intValue != 2) {
                                throw new IllegalArgumentException(B0.c.i(intValue, "contentSensitivityIndex ", " not known to the SensitiveContentChannel."));
                            }
                            aVar.b(i3);
                            return;
                        } catch (IllegalArgumentException | IllegalStateException e20) {
                            ((S1.i) nVar).b("error", e20.getMessage(), null);
                            return;
                        }
                    case 2:
                        ((X1.a) iVar4.f2461b).getClass();
                        ((S1.i) nVar).success(Boolean.valueOf(Build.VERSION.SDK_INT >= 35));
                        return;
                    default:
                        ((S1.i) nVar).a();
                        return;
                }
        }
    }

    @Override // m0.r
    public void onPurchasesUpdated(C1120h c1120h, List list) {
        Y1.n s3 = F2.b.s(c1120h);
        List t3 = F2.b.t(list);
        A a3 = new A();
        a3.f1636a = s3;
        if (t3 == null) {
            throw new IllegalStateException("Nonnull field \"purchases\" is null.");
        }
        a3.f1637b = t3;
        C0077a c0077a = new C0077a(3);
        b0.i iVar = (b0.i) this.f729b;
        iVar.getClass();
        new D0.a((T1.f) iVar.f2461b, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onPurchasesUpdated", (T1.k) C0082f.f1677a, (P0.j) null).f(new ArrayList(Collections.singletonList(a3)), new G0.j(c0077a, 5, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onPurchasesUpdated"));
    }

    @Override // U.O
    public int q(View view) {
        v vVar = (v) view.getLayoutParams();
        ((u) this.f729b).getClass();
        return view.getRight() + ((v) view.getLayoutParams()).f1591a.right + ((ViewGroup.MarginLayoutParams) vVar).rightMargin;
    }

    @Override // I1.H
    public void r(io.flutter.embedding.engine.renderer.j jVar) {
        ((I) this.f729b).f584b = jVar;
    }

    public C0264d s(Object obj, kotlin.jvm.internal.e eVar, Activity activity, C0329b c0329b) {
        C0263c c0263c = new C0263c(eVar, c0329b);
        Object newProxyInstance = Proxy.newProxyInstance((ClassLoader) this.f729b, new Class[]{y()}, c0263c);
        kotlin.jvm.internal.j.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, y()).invoke(obj, activity, newProxyInstance);
        return new C0264d(obj.getClass().getMethod("removeWindowLayoutInfoListener", y()), obj, newProxyInstance);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [M1.a] */
    public Bitmap t(ByteBuffer byteBuffer, M1.d dVar) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        createSource = ImageDecoder.createSource(byteBuffer);
        try {
            decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: M1.a
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    ColorSpace colorSpace;
                    Size size;
                    ColorSpace.Named unused;
                    i iVar = i.this;
                    iVar.getClass();
                    unused = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    imageDecoder.setAllocator(1);
                    f fVar = (f) iVar.f729b;
                    if (fVar != null) {
                        size = imageInfo.getSize();
                        FlutterJNI.nativeImageHeaderCallback(fVar.f495a, size.getWidth(), size.getHeight());
                    }
                }
            });
            return decodeBitmap;
        } catch (IOException e3) {
            Log.e("FlutterImageDecoderImplDefault", "Failed to decode image", e3);
            return null;
        }
    }

    public j0 u() {
        z2.p pVar = (z2.p) this.f729b;
        pVar.getClass();
        B2.v vVar = A2.l.f108a;
        Object obj = z2.p.f10747e.get(pVar);
        if (obj == vVar) {
            obj = null;
        }
        return (j0) obj;
    }

    public String w(String str, String str2) {
        U1.a aVar = (U1.a) this.f729b;
        Context context = aVar.f1598b;
        AbstractActivityC0027d abstractActivityC0027d = aVar.f1598b;
        if (str2 != null) {
            Locale a3 = U1.a.a(str2);
            Configuration configuration = new Configuration(abstractActivityC0027d.getResources().getConfiguration());
            configuration.setLocale(a3);
            context = abstractActivityC0027d.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", abstractActivityC0027d.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7.f862a > r3.f862a) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x(j0 newState) {
        z2.p pVar;
        Object obj;
        Object obj2;
        kotlin.jvm.internal.j.e(newState, "newState");
        do {
            pVar = (z2.p) this.f729b;
            pVar.getClass();
            obj = A2.l.f108a;
            Object obj3 = z2.p.f10747e.get(pVar);
            obj2 = obj3;
            if (obj3 == obj) {
                obj2 = null;
            }
            j0 j0Var = (j0) obj2;
            if (!(j0Var instanceof c0 ? true : kotlin.jvm.internal.j.a(j0Var, k0.f870b))) {
                if (!(j0Var instanceof C0036d)) {
                    if (!(j0Var instanceof a0)) {
                        throw new T0.b();
                    }
                }
                if (obj2 == null) {
                    obj2 = obj;
                }
                if (j0Var != null) {
                    obj = j0Var;
                }
            }
            j0Var = newState;
            if (obj2 == null) {
            }
            if (j0Var != null) {
            }
        } while (!pVar.b(obj2, obj));
    }

    public Class y() {
        Class<?> loadClass = ((ClassLoader) this.f729b).loadClass("java.util.function.Consumer");
        kotlin.jvm.internal.j.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }

    public i(K1.b bVar, int i3) {
        this.f728a = i3;
        switch (i3) {
            case 22:
                this.f729b = new D0.a((T1.f) bVar, "flutter/system", (T1.k) T1.i.f1466a, (P0.j) null);
                break;
            default:
                P0.j jVar = new P0.j(23);
                o oVar = new o(bVar, "flutter/navigation", T1.j.f1467a);
                this.f729b = oVar;
                oVar.b(jVar);
                break;
        }
    }

    public i(int i3) {
        this.f728a = i3;
        switch (i3) {
            case 6:
                this.f729b = new AtomicInteger(0);
                break;
            case 7:
                this.f729b = new z2.p(k0.f870b);
                break;
            case 23:
                this.f729b = new SparseIntArray();
                break;
            default:
                this.f729b = new HashMap();
                break;
        }
    }

    public i(T1.f fVar) {
        this.f728a = 14;
        new o(fVar, "flutter/keyboard", s.f1473b).b(new a1.e(this));
    }

    public i(G0.m mVar) {
        this.f728a = 1;
        this.f729b = new CopyOnWriteArrayList();
        new HashMap();
    }

    @Override // I1.H
    public void g() {
    }
}
