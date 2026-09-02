package F;

import F.t;
import G.m;
import a.AbstractC0018a;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Size;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import o.AbstractC0071c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t implements P.f, P.b, P.j, O.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f113b;

    /* renamed from: c, reason: collision with root package name */
    public Object f114c;

    public /* synthetic */ t() {
        this.f113b = 3;
    }

    private final void A(C.a aVar, O.l lVar) {
        boolean z2;
        boolean isStylusHandwritingAvailable;
        boolean isStylusHandwritingAvailable2;
        t tVar = (t) this.f114c;
        if (((C.a) tVar.f114c) == null) {
            return;
        }
        String str = (String) aVar.f4c;
        str.getClass();
        z2 = true;
        switch (str) {
            case "Scribe.isFeatureAvailable":
                try {
                    C.a aVar2 = (C.a) tVar.f114c;
                    if (Build.VERSION.SDK_INT >= 34) {
                        isStylusHandwritingAvailable = ((InputMethodManager) aVar2.f4c).isStylusHandwritingAvailable();
                        if (isStylusHandwritingAvailable) {
                            lVar.d(Boolean.valueOf(z2));
                            break;
                        }
                    } else {
                        aVar2.getClass();
                    }
                    z2 = false;
                    lVar.d(Boolean.valueOf(z2));
                } catch (IllegalStateException e2) {
                    lVar.a("error", e2.getMessage(), null);
                    return;
                }
            case "Scribe.startStylusHandwriting":
                if (Build.VERSION.SDK_INT < 33) {
                    lVar.a("error", "Requires API level 33 or higher.", null);
                    break;
                } else {
                    try {
                        C.a aVar3 = (C.a) tVar.f114c;
                        ((InputMethodManager) aVar3.f4c).startStylusHandwriting((View) aVar3.f5d);
                        lVar.d(null);
                        break;
                    } catch (IllegalStateException e3) {
                        lVar.a("error", e3.getMessage(), null);
                        return;
                    }
                }
            case "Scribe.isStylusHandwritingAvailable":
                if (Build.VERSION.SDK_INT < 34) {
                    lVar.a("error", "Requires API level 34 or higher.", null);
                    break;
                } else {
                    try {
                        isStylusHandwritingAvailable2 = ((InputMethodManager) ((C.a) tVar.f114c).f4c).isStylusHandwritingAvailable();
                        lVar.d(Boolean.valueOf(isStylusHandwritingAvailable2));
                        break;
                    } catch (IllegalStateException e4) {
                        lVar.a("error", e4.getMessage(), null);
                        return;
                    }
                }
            default:
                lVar.b();
                break;
        }
    }

    private final void B(C.a aVar, O.l lVar) {
        int i2;
        t tVar = (t) this.f114c;
        if (((T.a) tVar.f114c) == null) {
            return;
        }
        String str = (String) aVar.f4c;
        str.getClass();
        i2 = 2;
        switch (str) {
            case "SensitiveContent.getContentSensitivity":
                try {
                    int a2 = ((T.a) tVar.f114c).a();
                    if (a2 == 0) {
                        i2 = 0;
                    } else if (a2 == 1) {
                        i2 = 1;
                    } else if (a2 != 2) {
                        i2 = 3;
                    }
                    lVar.d(Integer.valueOf(i2));
                    break;
                } catch (IllegalArgumentException | IllegalStateException e2) {
                    lVar.a("error", e2.getMessage(), null);
                    return;
                }
            case "SensitiveContent.setContentSensitivity":
                try {
                    ((T.a) tVar.f114c).b(m(tVar, ((Integer) aVar.f5d).intValue()));
                    break;
                } catch (IllegalArgumentException | IllegalStateException e3) {
                    lVar.a("error", e3.getMessage(), null);
                    return;
                }
            case "SensitiveContent.isSupported":
                ((T.a) tVar.f114c).getClass();
                lVar.d(Boolean.valueOf(Build.VERSION.SDK_INT >= 35));
                break;
            default:
                lVar.b();
                break;
        }
    }

    private final void C(C.a aVar, O.l lVar) {
        t tVar = (t) this.f114c;
        if (((io.flutter.plugin.editing.g) tVar.f114c) == null) {
            return;
        }
        String str = (String) aVar.f4c;
        Object obj = aVar.f5d;
        str.getClass();
        if (!str.equals("SpellCheck.initiateSpellCheck")) {
            lVar.b();
            return;
        }
        try {
            ArrayList arrayList = (ArrayList) obj;
            ((io.flutter.plugin.editing.g) tVar.f114c).a((String) arrayList.get(0), (String) arrayList.get(1), lVar);
        } catch (IllegalStateException e2) {
            lVar.a("error", e2.getMessage(), null);
        }
    }

    public static int m(t tVar, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 2;
        }
        throw new IllegalArgumentException("contentSensitivityIndex " + i2 + " not known to the SensitiveContentChannel.");
    }

    public static boolean w(int i2) {
        return (48 <= i2 && i2 <= 57) || i2 == 35 || i2 == 42;
    }

    private final void x(C.a aVar, O.l lVar) {
        Object obj;
        t tVar = (t) this.f114c;
        if (((O.k) tVar.f114c) == null) {
            return;
        }
        String str = (String) aVar.f4c;
        obj = aVar.f5d;
        str.getClass();
        switch (str) {
            case "create":
                Map map = (Map) obj;
                boolean z2 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                try {
                    if (((O.k) tVar.f114c).s()) {
                        ((O.k) tVar.f114c).n(new O.h(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 0, wrap));
                        throw null;
                    }
                    if (z2) {
                        ((O.k) tVar.f114c).k(new O.h(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 3, wrap));
                        throw null;
                    }
                    ((O.k) tVar.f114c).f(new O.h(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue() ? 2 : 1, wrap));
                    throw null;
                } catch (IllegalStateException e2) {
                    lVar.a("error", Log.getStackTraceString(e2), null);
                    return;
                }
            case "offset":
                Map map2 = (Map) obj;
                try {
                    ((O.k) tVar.f114c).g(((Integer) map2.get("id")).intValue(), ((Double) map2.get("top")).doubleValue(), ((Double) map2.get("left")).doubleValue());
                    lVar.d(null);
                    return;
                } catch (IllegalStateException e3) {
                    lVar.a("error", Log.getStackTraceString(e3), null);
                    return;
                }
            case "resize":
                Map map3 = (Map) obj;
                try {
                    ((O.k) tVar.f114c).p(new O.j(((Integer) map3.get("id")).intValue(), ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue()), new G.l());
                    return;
                } catch (IllegalStateException e4) {
                    lVar.a("error", Log.getStackTraceString(e4), null);
                    return;
                }
            case "clearFocus":
                try {
                    ((O.k) tVar.f114c).a(((Integer) obj).intValue());
                    lVar.d(null);
                    return;
                } catch (IllegalStateException e5) {
                    lVar.a("error", Log.getStackTraceString(e5), null);
                    return;
                }
            case "synchronizeToNativeViewHierarchy":
                try {
                    ((O.k) tVar.f114c).d(((Boolean) obj).booleanValue());
                    lVar.d(null);
                    return;
                } catch (IllegalStateException e6) {
                    lVar.a("error", Log.getStackTraceString(e6), null);
                    return;
                }
            case "touch":
                List list = (List) obj;
                try {
                    ((O.k) tVar.f114c).q(new O.i(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                    lVar.d(null);
                    return;
                } catch (IllegalStateException e7) {
                    lVar.a("error", Log.getStackTraceString(e7), null);
                    return;
                }
            case "setDirection":
                Map map4 = (Map) obj;
                try {
                    ((O.k) tVar.f114c).h(((Integer) map4.get("id")).intValue(), ((Integer) map4.get("direction")).intValue());
                    lVar.d(null);
                    return;
                } catch (IllegalStateException e8) {
                    lVar.a("error", Log.getStackTraceString(e8), null);
                    return;
                }
            case "dispose":
                try {
                    ((O.k) tVar.f114c).l(((Integer) ((Map) obj).get("id")).intValue());
                    lVar.d(null);
                    return;
                } catch (IllegalStateException e9) {
                    lVar.a("error", Log.getStackTraceString(e9), null);
                    return;
                }
            default:
                lVar.b();
                return;
        }
    }

    private final void y(C.a aVar, O.l lVar) {
        Object obj;
        t tVar = (t) this.f114c;
        if (((io.flutter.plugin.platform.i) tVar.f114c) == null) {
            return;
        }
        String str = (String) aVar.f4c;
        obj = aVar.f5d;
        str.getClass();
        switch (str) {
            case "create":
                Map map = (Map) obj;
                if (map.containsKey("params")) {
                    ByteBuffer.wrap((byte[]) map.get("params"));
                }
                try {
                    ((Integer) map.get("id")).intValue();
                    String str2 = (String) map.get("viewType");
                    ((Integer) map.get("direction")).intValue();
                    if (((io.flutter.plugin.platform.j) ((io.flutter.plugin.platform.i) tVar.f114c).f675c).f676b.f215a.get(str2) != null) {
                        throw new ClassCastException();
                    }
                    throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str2);
                } catch (IllegalStateException e2) {
                    lVar.a("error", Log.getStackTraceString(e2), null);
                    return;
                }
            case "clearFocus":
                int intValue = ((Integer) obj).intValue();
                try {
                    if (((io.flutter.plugin.platform.j) ((io.flutter.plugin.platform.i) tVar.f114c).f675c).f682h.get(intValue) != null) {
                        throw new ClassCastException();
                    }
                    Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + intValue);
                    lVar.d(null);
                    return;
                } catch (IllegalStateException e3) {
                    lVar.a("error", Log.getStackTraceString(e3), null);
                    return;
                }
            case "touch":
                List list = (List) obj;
                int intValue2 = ((Integer) list.get(0)).intValue();
                ((Integer) list.get(3)).getClass();
                ((Integer) list.get(4)).getClass();
                list.get(5);
                list.get(6);
                ((Integer) list.get(7)).getClass();
                ((Integer) list.get(8)).getClass();
                ((Double) list.get(9)).getClass();
                ((Double) list.get(10)).getClass();
                ((Integer) list.get(11)).getClass();
                ((Integer) list.get(12)).getClass();
                ((Integer) list.get(13)).getClass();
                ((Integer) list.get(14)).getClass();
                ((Number) list.get(15)).longValue();
                try {
                    io.flutter.plugin.platform.i iVar = (io.flutter.plugin.platform.i) tVar.f114c;
                    iVar.getClass();
                    io.flutter.plugin.platform.j jVar = (io.flutter.plugin.platform.j) iVar.f675c;
                    float f2 = jVar.f677c.getResources().getDisplayMetrics().density;
                    if (jVar.f682h.get(intValue2) != null) {
                        throw new ClassCastException();
                    }
                    Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + intValue2);
                    lVar.d(null);
                    return;
                } catch (IllegalStateException e4) {
                    lVar.a("error", Log.getStackTraceString(e4), null);
                    return;
                }
            case "setDirection":
                Map map2 = (Map) obj;
                int intValue3 = ((Integer) map2.get("id")).intValue();
                ((Integer) map2.get("direction")).getClass();
                try {
                    if (((io.flutter.plugin.platform.j) ((io.flutter.plugin.platform.i) tVar.f114c).f675c).f682h.get(intValue3) != null) {
                        throw new ClassCastException();
                    }
                    Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + intValue3);
                    lVar.d(null);
                    return;
                } catch (IllegalStateException e5) {
                    lVar.a("error", Log.getStackTraceString(e5), null);
                    return;
                }
            case "isSurfaceControlEnabled":
                FlutterJNI flutterJNI = ((io.flutter.plugin.platform.j) ((io.flutter.plugin.platform.i) tVar.f114c).f675c).f679e;
                lVar.d(Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                return;
            case "dispose":
                try {
                    ((io.flutter.plugin.platform.i) tVar.f114c).d(((Integer) ((Map) obj).get("id")).intValue());
                    lVar.d(null);
                    return;
                } catch (IllegalStateException e6) {
                    lVar.a("error", Log.getStackTraceString(e6), null);
                    return;
                }
            default:
                lVar.b();
                return;
        }
    }

    private final void z(C.a aVar, O.l lVar) {
        C.a aVar2 = (C.a) this.f114c;
        if (((S.a) aVar2.f5d) == null) {
            return;
        }
        String str = (String) aVar.f4c;
        Object obj = aVar.f5d;
        str.getClass();
        if (!str.equals("ProcessText.processTextAction")) {
            if (!str.equals("ProcessText.queryTextActions")) {
                lVar.b();
                return;
            }
            try {
                lVar.d(((S.a) aVar2.f5d).d());
                return;
            } catch (IllegalStateException e2) {
                lVar.a("error", e2.getMessage(), null);
                return;
            }
        }
        try {
            ArrayList arrayList = (ArrayList) obj;
            ((S.a) aVar2.f5d).c((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), lVar);
        } catch (IllegalStateException e3) {
            lVar.a("error", e3.getMessage(), null);
        }
    }

    public void D(ArrayList arrayList) {
        io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) this.f114c;
        if (eVar.f673f) {
            eVar.f673f = false;
            AbstractC0018a.A(eVar.f668a.getWindow(), true);
        }
        int i2 = arrayList.isEmpty() ? 5894 : 1798;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int ordinal = ((O.g) arrayList.get(i3)).ordinal();
            if (ordinal == 0) {
                i2 &= -5;
            } else if (ordinal == 1) {
                i2 &= -515;
            }
        }
        eVar.f672e = i2;
        eVar.b();
    }

    public void E(int i2) {
        int i3;
        io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) this.f114c;
        Activity activity = eVar.f668a;
        if (i2 != 4 && eVar.f673f) {
            eVar.f673f = false;
            AbstractC0018a.A(activity.getWindow(), true);
        }
        if (i2 == 1) {
            i3 = 1798;
        } else if (i2 == 2) {
            i3 = 3846;
        } else {
            if (i2 != 3) {
                if (i2 != 4 || Build.VERSION.SDK_INT < 29) {
                    return;
                }
                eVar.f673f = true;
                AbstractC0018a.A(activity.getWindow(), false);
                O.f fVar = eVar.f671d;
                if (fVar != null) {
                    eVar.a(fVar);
                    return;
                }
                return;
            }
            i3 = 5894;
        }
        eVar.f672e = i3;
        eVar.b();
    }

    public void F(int i2) {
        View decorView = ((io.flutter.plugin.platform.e) this.f114c).f668a.getWindow().getDecorView();
        switch (AbstractC0071c.a(i2)) {
            case 0:
                decorView.performHapticFeedback(0);
                break;
            case 1:
                decorView.performHapticFeedback(1);
                break;
            case 2:
                decorView.performHapticFeedback(3);
                break;
            case 3:
                decorView.performHapticFeedback(6);
                break;
            case 4:
                decorView.performHapticFeedback(4);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(16);
                    break;
                }
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(3);
                    break;
                }
                break;
            case 7:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(17);
                    break;
                }
                break;
        }
    }

    @Override // O.k
    public void a(int i2) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f114c;
        if (kVar.j(i2)) {
            ((io.flutter.plugin.platform.q) kVar.f698j.get(Integer.valueOf(i2))).getClass();
            Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i2);
            return;
        }
        if (kVar.f700l.get(i2) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i2);
    }

    @Override // P.f
    public void b(String str, ByteBuffer byteBuffer, P.e eVar) {
        ((H.j) this.f114c).b(str, byteBuffer, eVar);
    }

    @Override // P.f
    public C.b c(P.h hVar) {
        return ((H.j) this.f114c).c(hVar);
    }

    @Override // O.k
    public void d(boolean z2) {
        ((io.flutter.plugin.platform.k) this.f114c).f706r = z2;
    }

    @Override // P.b
    public void e(Object obj, C.a aVar) {
        HashMap hashMap;
        HashMap hashMap2;
        E.b bVar = (E.b) this.f114c;
        if (((io.flutter.view.c) bVar.f20c) == null) {
            aVar.m(null);
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
                    io.flutter.view.i iVar = (io.flutter.view.i) ((io.flutter.view.c) bVar.f20c).f720a;
                    if (Build.VERSION.SDK_INT < 28) {
                        AccessibilityEvent d2 = iVar.d(0, 32);
                        d2.getText().add(str2);
                        iVar.h(d2);
                        break;
                    }
                }
                break;
            case "announce":
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    io.flutter.view.c cVar = (io.flutter.view.c) bVar.f20c;
                    if (Build.VERSION.SDK_INT >= 36) {
                        cVar.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.i) cVar.f720a).f808a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    io.flutter.view.c cVar2 = (io.flutter.view.c) bVar.f20c;
                    ((io.flutter.view.i) cVar2.f720a).g(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.c cVar3 = (io.flutter.view.c) bVar.f20c;
                    ((io.flutter.view.i) cVar3.f720a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.c cVar4 = (io.flutter.view.c) bVar.f20c;
                    ((io.flutter.view.i) cVar4.f720a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        aVar.m(null);
    }

    @Override // O.k
    public long f(O.h hVar) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f114c;
        io.flutter.plugin.platform.k.a(kVar, hVar);
        int i2 = hVar.f302a;
        if (kVar.f703o.get(i2) != null) {
            throw new IllegalStateException("Trying to create an already created platform view, view id: " + i2);
        }
        if (kVar.f694f == null) {
            throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i2);
        }
        if (kVar.f692d == null) {
            throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i2);
        }
        G.k kVar2 = kVar.f690b;
        String str = hVar.f303b;
        if (kVar2.f215a.get(str) != null) {
            throw new ClassCastException();
        }
        throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
    }

    @Override // O.k
    public void g(int i2, double d2, double d3) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f114c;
        if (kVar.j(i2)) {
            return;
        }
        Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i2);
    }

    @Override // O.k
    public void h(int i2, int i3) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f114c;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalStateException("Trying to set unknown direction value: " + i3 + "(view id: " + i2 + ")");
        }
        if (kVar.j(i2)) {
            ((io.flutter.plugin.platform.q) kVar.f698j.get(Integer.valueOf(i2))).getClass();
            Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i2);
            return;
        }
        if (kVar.f700l.get(i2) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i2);
    }

    @Override // P.f
    public void i(String str, P.d dVar) {
        ((H.j) this.f114c).j(str, dVar, null);
    }

    @Override // P.f
    public void j(String str, P.d dVar, C.b bVar) {
        ((H.j) this.f114c).j(str, dVar, bVar);
    }

    @Override // O.k
    public void k(O.h hVar) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f114c;
        io.flutter.plugin.platform.k.a(kVar, hVar);
        if (kVar.f693e.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
        G.k kVar2 = kVar.f690b;
        String str = hVar.f303b;
        if (kVar2.f215a.get(str) != null) {
            throw new ClassCastException();
        }
        throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
    }

    @Override // O.k
    public void l(int i2) {
        if (((io.flutter.plugin.platform.k) this.f114c).f700l.get(i2) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i2);
    }

    @Override // O.k
    public void n(O.h hVar) {
        throw new IllegalStateException("Trying to create an HC++ platform view from within PlatformViewsController1. Request: " + hVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0468 A[Catch: JSONException -> 0x0325, TryCatch #3 {JSONException -> 0x0325, blocks: (B:169:0x0311, B:170:0x0315, B:175:0x03c5, B:177:0x03ca, B:179:0x03f6, B:182:0x041a, B:184:0x040d, B:187:0x0414, B:188:0x0429, B:190:0x044d, B:200:0x0451, B:193:0x045e, B:195:0x0468, B:197:0x0475, B:202:0x0456, B:203:0x047a, B:205:0x048c, B:207:0x049e, B:208:0x04a3, B:210:0x04ca, B:212:0x04da, B:215:0x059b, B:222:0x05b5, B:224:0x05c5, B:225:0x05d2, B:264:0x04c1, B:257:0x050e, B:250:0x052c, B:243:0x0570, B:271:0x0593, B:219:0x05ad, B:229:0x05d7, B:273:0x031a, B:276:0x0328, B:279:0x0333, B:282:0x033d, B:285:0x0348, B:288:0x0353, B:291:0x035f, B:294:0x0369, B:297:0x0373, B:300:0x037d, B:303:0x0387, B:306:0x0391, B:309:0x039c, B:312:0x03a7, B:315:0x03b2, B:232:0x0535, B:234:0x053f, B:235:0x0542, B:237:0x0558, B:238:0x056a, B:241:0x0561), top: B:168:0x0311, inners: #4, #18, #20, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0475 A[Catch: JSONException -> 0x0325, TryCatch #3 {JSONException -> 0x0325, blocks: (B:169:0x0311, B:170:0x0315, B:175:0x03c5, B:177:0x03ca, B:179:0x03f6, B:182:0x041a, B:184:0x040d, B:187:0x0414, B:188:0x0429, B:190:0x044d, B:200:0x0451, B:193:0x045e, B:195:0x0468, B:197:0x0475, B:202:0x0456, B:203:0x047a, B:205:0x048c, B:207:0x049e, B:208:0x04a3, B:210:0x04ca, B:212:0x04da, B:215:0x059b, B:222:0x05b5, B:224:0x05c5, B:225:0x05d2, B:264:0x04c1, B:257:0x050e, B:250:0x052c, B:243:0x0570, B:271:0x0593, B:219:0x05ad, B:229:0x05d7, B:273:0x031a, B:276:0x0328, B:279:0x0333, B:282:0x033d, B:285:0x0348, B:288:0x0353, B:291:0x035f, B:294:0x0369, B:297:0x0373, B:300:0x037d, B:303:0x0387, B:306:0x0391, B:309:0x039c, B:312:0x03a7, B:315:0x03b2, B:232:0x0535, B:234:0x053f, B:235:0x0542, B:237:0x0558, B:238:0x056a, B:241:0x0561), top: B:168:0x0311, inners: #4, #18, #20, #21 }] */
    @Override // P.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(C.a aVar, O.l lVar) {
        O.e a2;
        CharSequence u2;
        ClipDescription primaryClipDescription;
        char c2;
        Bundle bundle;
        char c3 = 11;
        boolean z2 = false;
        z2 = false;
        switch (this.f113b) {
            case 7:
                C.a aVar2 = (C.a) this.f114c;
                if (((t) aVar2.f5d) != null) {
                    String str = (String) aVar.f4c;
                    str.getClass();
                    if (!str.equals("Localization.getStringResource")) {
                        lVar.b();
                        break;
                    } else {
                        JSONObject jSONObject = (JSONObject) aVar.f5d;
                        try {
                            lVar.d(((t) aVar2.f5d).v(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                            break;
                        } catch (JSONException e2) {
                            lVar.a("error", e2.getMessage(), null);
                            return;
                        }
                    }
                }
                break;
            case 8:
                t tVar = (t) this.f114c;
                if (((t) tVar.f114c) != null) {
                    String str2 = (String) aVar.f4c;
                    try {
                        if (str2.hashCode() == -1307105544 && str2.equals("activateSystemCursor")) {
                            try {
                                ((t) tVar.f114c).r((String) ((HashMap) aVar.f5d).get("kind"));
                                lVar.d(Boolean.TRUE);
                            } catch (Exception e3) {
                                lVar.a("error", "Error when setting cursors: " + e3.getMessage(), null);
                            }
                        }
                    } catch (Exception e4) {
                        lVar.a("error", "Unhandled error: " + e4.getMessage(), null);
                        return;
                    }
                }
                break;
            case 9:
            case 13:
            case 14:
            case 18:
            case 20:
            default:
                C.a aVar3 = (C.a) this.f114c;
                if (((io.flutter.plugin.editing.i) aVar3.f5d) != null) {
                    String str3 = (String) aVar.f4c;
                    Object obj = aVar.f5d;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -1779068172:
                            if (str3.equals("TextInput.setPlatformViewClient")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1015421462:
                            if (str3.equals("TextInput.setEditingState")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -37561188:
                            if (str3.equals("TextInput.setClient")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 270476819:
                            if (str3.equals("TextInput.hide")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 270803918:
                            if (str3.equals("TextInput.show")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 649192816:
                            if (str3.equals("TextInput.sendAppPrivateCommand")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1204752139:
                            if (str3.equals("TextInput.setEditableSizeAndTransform")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1727570905:
                            if (str3.equals("TextInput.finishAutofillContext")) {
                                c2 = 7;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1904427655:
                            if (str3.equals("TextInput.clearClient")) {
                                c2 = '\b';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2113369584:
                            if (str3.equals("TextInput.requestAutofill")) {
                                c2 = '\t';
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            try {
                                JSONObject jSONObject2 = (JSONObject) obj;
                                int i2 = jSONObject2.getInt("platformViewId");
                                boolean optBoolean = jSONObject2.optBoolean("usesVirtualDisplay", false);
                                io.flutter.plugin.editing.l lVar2 = ((io.flutter.plugin.editing.i) aVar3.f5d).f640a;
                                View view = lVar2.f646a;
                                if (optBoolean) {
                                    view.requestFocus();
                                    lVar2.f650e = new io.flutter.plugin.editing.k(3, i2);
                                    lVar2.f647b.restartInput(view);
                                    lVar2.f654i = false;
                                } else {
                                    lVar2.f650e = new io.flutter.plugin.editing.k(4, i2);
                                    lVar2.f655j = null;
                                }
                                lVar.d(null);
                                break;
                            } catch (JSONException e5) {
                                lVar.a("error", e5.getMessage(), null);
                            }
                        case 1:
                            try {
                                ((io.flutter.plugin.editing.i) aVar3.f5d).c(O.r.a((JSONObject) obj));
                                lVar.d(null);
                                break;
                            } catch (JSONException e6) {
                                lVar.a("error", e6.getMessage(), null);
                                return;
                            }
                        case 2:
                            try {
                                JSONArray jSONArray = (JSONArray) obj;
                                ((io.flutter.plugin.editing.i) aVar3.f5d).a(jSONArray.getInt(0), O.p.a(jSONArray.getJSONObject(1)));
                                lVar.d(null);
                                break;
                            } catch (NoSuchFieldException | JSONException e7) {
                                lVar.a("error", e7.getMessage(), null);
                                return;
                            }
                        case 3:
                            io.flutter.plugin.editing.l lVar3 = ((io.flutter.plugin.editing.i) aVar3.f5d).f640a;
                            if (lVar3.f650e.f644a == 4) {
                                lVar3.c();
                            } else {
                                View view2 = lVar3.f646a;
                                lVar3.c();
                                lVar3.f647b.hideSoftInputFromWindow(view2.getApplicationWindowToken(), 0);
                            }
                            lVar.d(null);
                            break;
                        case 4:
                            io.flutter.plugin.editing.l lVar4 = ((io.flutter.plugin.editing.i) aVar3.f5d).f640a;
                            InputMethodManager inputMethodManager = lVar4.f647b;
                            View view3 = lVar4.f646a;
                            O.p pVar = lVar4.f651f;
                            if (pVar == null || pVar.f344g.f351a != 11) {
                                view3.requestFocus();
                                inputMethodManager.showSoftInput(view3, 0);
                            } else {
                                lVar4.c();
                                inputMethodManager.hideSoftInputFromWindow(view3.getApplicationWindowToken(), 0);
                            }
                            lVar.d(null);
                            break;
                        case 5:
                            try {
                                JSONObject jSONObject3 = (JSONObject) obj;
                                String string = jSONObject3.getString("action");
                                String string2 = jSONObject3.getString("data");
                                if (string2 == null || string2.isEmpty()) {
                                    bundle = null;
                                } else {
                                    bundle = new Bundle();
                                    bundle.putString("data", string2);
                                }
                                io.flutter.plugin.editing.l lVar5 = ((io.flutter.plugin.editing.i) aVar3.f5d).f640a;
                                lVar5.f647b.sendAppPrivateCommand(lVar5.f646a, string, bundle);
                                lVar.d(null);
                                break;
                            } catch (JSONException e8) {
                                lVar.a("error", e8.getMessage(), null);
                                return;
                            }
                            break;
                        case 6:
                            try {
                                JSONObject jSONObject4 = (JSONObject) obj;
                                double d2 = jSONObject4.getDouble("width");
                                double d3 = jSONObject4.getDouble("height");
                                JSONArray jSONArray2 = jSONObject4.getJSONArray("transform");
                                double[] dArr = new double[16];
                                for (int i3 = 0; i3 < 16; i3++) {
                                    dArr[i3] = jSONArray2.getDouble(i3);
                                }
                                ((io.flutter.plugin.editing.i) aVar3.f5d).b(d2, d3, dArr);
                                lVar.d(null);
                                break;
                            } catch (JSONException e9) {
                                lVar.a("error", e9.getMessage(), null);
                                return;
                            }
                        case 7:
                            io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) aVar3.f5d;
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            if (Build.VERSION.SDK_INT >= 26) {
                                AutofillManager autofillManager = iVar.f640a.f648c;
                                if (autofillManager != null) {
                                    if (booleanValue) {
                                        autofillManager.commit();
                                    } else {
                                        autofillManager.cancel();
                                    }
                                }
                            } else {
                                iVar.getClass();
                            }
                            lVar.d(null);
                            break;
                        case '\b':
                            io.flutter.plugin.editing.l lVar6 = ((io.flutter.plugin.editing.i) aVar3.f5d).f640a;
                            View view4 = lVar6.f646a;
                            if (lVar6.f650e.f644a != 3) {
                                lVar6.f653h.e(lVar6);
                                lVar6.c();
                                lVar6.f651f = null;
                                lVar6.d(null);
                                lVar6.f650e = new io.flutter.plugin.editing.k(1, 0);
                                lVar6.f658m = null;
                                int i4 = m.d.f857a;
                                m.r a3 = m.c.a(view4);
                                if (a3 != null && !a3.f881a.m(8)) {
                                    lVar6.f647b.restartInput(view4);
                                }
                            }
                            lVar.d(null);
                            break;
                        case '\t':
                            io.flutter.plugin.editing.l lVar7 = ((io.flutter.plugin.editing.i) aVar3.f5d).f640a;
                            View view5 = lVar7.f646a;
                            if (Build.VERSION.SDK_INT >= 26 && lVar7.f648c != null && lVar7.f652g != null) {
                                String str4 = (String) lVar7.f651f.f347j.f8a;
                                int[] iArr = new int[2];
                                view5.getLocationOnScreen(iArr);
                                Rect rect = new Rect(lVar7.f658m);
                                rect.offset(iArr[0], iArr[1]);
                                lVar7.f648c.notifyViewEntered(view5, str4.hashCode(), rect);
                            }
                            lVar.d(null);
                            break;
                        default:
                            lVar.b();
                            break;
                    }
                }
                break;
            case 10:
                C.a aVar4 = (C.a) this.f114c;
                if (((t) aVar4.f5d) != null) {
                    String str5 = (String) aVar.f4c;
                    Object obj2 = aVar.f5d;
                    try {
                        switch (str5.hashCode()) {
                            case -1501580720:
                                if (str5.equals("SystemNavigator.setFrameworkHandlesBack")) {
                                    c3 = '\t';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -931781241:
                                if (str5.equals("Share.invoke")) {
                                    c3 = 14;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -766342101:
                                if (str5.equals("SystemNavigator.pop")) {
                                    c3 = '\n';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -720677196:
                                if (str5.equals("Clipboard.setData")) {
                                    c3 = '\f';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -577225884:
                                if (str5.equals("SystemChrome.setSystemUIChangeListener")) {
                                    c3 = 6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -548468504:
                                if (str5.equals("SystemChrome.setApplicationSwitcherDescription")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -247230243:
                                if (str5.equals("HapticFeedback.vibrate")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -215273374:
                                if (str5.equals("SystemSound.play")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 241845679:
                                if (str5.equals("SystemChrome.restoreSystemUIOverlays")) {
                                    c3 = 7;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 875995648:
                                if (str5.equals("Clipboard.hasStrings")) {
                                    c3 = '\r';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1128339786:
                                if (str5.equals("SystemChrome.setEnabledSystemUIMode")) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1390477857:
                                if (str5.equals("SystemChrome.setSystemUIOverlayStyle")) {
                                    c3 = '\b';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1514180520:
                                if (str5.equals("Clipboard.getData")) {
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1674312266:
                                if (str5.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2119655719:
                                if (str5.equals("SystemChrome.setPreferredOrientations")) {
                                    c3 = 2;
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
                                try {
                                    int c4 = AbstractC0010k.c((String) obj2);
                                    io.flutter.plugin.platform.e eVar = (io.flutter.plugin.platform.e) ((t) aVar4.f5d).f114c;
                                    if (c4 == 1) {
                                        eVar.f668a.getWindow().getDecorView().playSoundEffect(0);
                                    }
                                    lVar.d(null);
                                    break;
                                } catch (NoSuchFieldException e10) {
                                    lVar.a("error", e10.getMessage(), null);
                                    return;
                                }
                            case 1:
                                try {
                                    ((t) aVar4.f5d).F(AbstractC0010k.b((String) obj2));
                                    lVar.d(null);
                                    break;
                                } catch (NoSuchFieldException e11) {
                                    lVar.a("error", e11.getMessage(), null);
                                    return;
                                }
                            case 2:
                                try {
                                    ((io.flutter.plugin.platform.e) ((t) aVar4.f5d).f114c).f668a.setRequestedOrientation(C.a.t(aVar4, (JSONArray) obj2));
                                    lVar.d(null);
                                    break;
                                } catch (NoSuchFieldException | JSONException e12) {
                                    lVar.a("error", e12.getMessage(), null);
                                    return;
                                }
                            case 3:
                                try {
                                    JSONObject jSONObject5 = (JSONObject) obj2;
                                    int i5 = jSONObject5.getInt("primaryColor");
                                    if (i5 != 0) {
                                        i5 |= -16777216;
                                    }
                                    String string3 = jSONObject5.getString("label");
                                    Activity activity = ((io.flutter.plugin.platform.e) ((t) aVar4.f5d).f114c).f668a;
                                    if (Build.VERSION.SDK_INT < 28) {
                                        activity.setTaskDescription(new ActivityManager.TaskDescription(string3, (Bitmap) null, i5));
                                    } else {
                                        activity.setTaskDescription(A.c.b(string3, i5));
                                    }
                                    lVar.d(null);
                                    break;
                                } catch (JSONException e13) {
                                    lVar.a("error", e13.getMessage(), null);
                                    return;
                                }
                            case 4:
                                try {
                                    ((t) aVar4.f5d).D(C.a.u(aVar4, (JSONArray) obj2));
                                    lVar.d(null);
                                    break;
                                } catch (NoSuchFieldException | JSONException e14) {
                                    lVar.a("error", e14.getMessage(), null);
                                    return;
                                }
                            case 5:
                                try {
                                    ((t) aVar4.f5d).E(C.a.v(aVar4, (String) obj2));
                                    lVar.d(null);
                                    break;
                                } catch (NoSuchFieldException | JSONException e15) {
                                    lVar.a("error", e15.getMessage(), null);
                                    return;
                                }
                            case 6:
                                io.flutter.plugin.platform.e eVar2 = (io.flutter.plugin.platform.e) ((t) aVar4.f5d).f114c;
                                View decorView = eVar2.f668a.getWindow().getDecorView();
                                decorView.setOnSystemUiVisibilityChangeListener(new io.flutter.plugin.platform.d(eVar2, decorView));
                                lVar.d(null);
                                break;
                            case 7:
                                ((io.flutter.plugin.platform.e) ((t) aVar4.f5d).f114c).b();
                                lVar.d(null);
                                break;
                            case '\b':
                                try {
                                    ((io.flutter.plugin.platform.e) ((t) aVar4.f5d).f114c).a(C.a.w(aVar4, (JSONObject) obj2));
                                    lVar.d(null);
                                    break;
                                } catch (NoSuchFieldException | JSONException e16) {
                                    lVar.a("error", e16.getMessage(), null);
                                    return;
                                }
                            case '\t':
                                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                                InterfaceC0008i interfaceC0008i = ((io.flutter.plugin.platform.e) ((t) aVar4.f5d).f114c).f670c;
                                if (interfaceC0008i != null) {
                                    ((AbstractActivityC0005f) interfaceC0008i).h(booleanValue2);
                                }
                                lVar.d(null);
                                break;
                            case '\n':
                                ((io.flutter.plugin.platform.e) ((t) aVar4.f5d).f114c).f668a.finish();
                                lVar.d(null);
                                break;
                            case 11:
                                String str6 = (String) obj2;
                                if (str6 != null) {
                                    try {
                                        a2 = O.e.a(str6);
                                    } catch (NoSuchFieldException unused) {
                                        lVar.a("error", "No such clipboard content format: ".concat(str6), null);
                                    }
                                    u2 = ((t) aVar4.f5d).u(a2);
                                    if (u2 == null) {
                                        JSONObject jSONObject6 = new JSONObject();
                                        jSONObject6.put("text", u2);
                                        lVar.d(jSONObject6);
                                        break;
                                    } else {
                                        lVar.d(null);
                                        break;
                                    }
                                }
                                a2 = null;
                                u2 = ((t) aVar4.f5d).u(a2);
                                if (u2 == null) {
                                }
                            case '\f':
                                ((ClipboardManager) ((io.flutter.plugin.platform.e) ((t) aVar4.f5d).f114c).f668a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj2).getString("text")));
                                lVar.d(null);
                                break;
                            case '\r':
                                ClipboardManager clipboardManager = (ClipboardManager) ((io.flutter.plugin.platform.e) ((t) aVar4.f5d).f114c).f668a.getSystemService("clipboard");
                                if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                                    z2 = primaryClipDescription.hasMimeType("text/*");
                                }
                                JSONObject jSONObject7 = new JSONObject();
                                jSONObject7.put("value", z2);
                                lVar.d(jSONObject7);
                                break;
                            case 14:
                                io.flutter.plugin.platform.e eVar3 = (io.flutter.plugin.platform.e) ((t) aVar4.f5d).f114c;
                                Intent intent = new Intent();
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", (String) obj2);
                                eVar3.f668a.startActivity(Intent.createChooser(intent, null));
                                lVar.d(null);
                                break;
                            default:
                                lVar.b();
                                break;
                        }
                    } catch (JSONException e17) {
                        lVar.a("error", "JSON error: " + e17.getMessage(), null);
                        return;
                    }
                    lVar.a("error", "JSON error: " + e17.getMessage(), null);
                }
                break;
            case 11:
                x(aVar, lVar);
                break;
            case 12:
                y(aVar, lVar);
                break;
            case 15:
                z(aVar, lVar);
                break;
            case 16:
                O.m mVar = (O.m) this.f114c;
                String str7 = (String) aVar.f4c;
                Object obj3 = aVar.f5d;
                str7.getClass();
                if (str7.equals("get")) {
                    mVar.f332f = true;
                    if (mVar.f331e || !mVar.f327a) {
                        lVar.d(O.m.a(mVar.f328b));
                        break;
                    } else {
                        mVar.f330d = lVar;
                        break;
                    }
                } else if (str7.equals("put")) {
                    mVar.f328b = (byte[]) obj3;
                    lVar.d(null);
                    break;
                } else {
                    lVar.b();
                    break;
                }
            case 17:
                A(aVar, lVar);
                break;
            case 19:
                B(aVar, lVar);
                break;
            case 21:
                C(aVar, lVar);
                break;
        }
    }

    @Override // O.k
    public void p(O.j jVar, G.l lVar) {
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f114c;
        int g2 = kVar.g(jVar.f322b);
        int g3 = kVar.g(jVar.f323c);
        int i2 = jVar.f321a;
        if (!kVar.j(i2)) {
            if (kVar.f700l.get(i2) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i2);
            return;
        }
        float f2 = kVar.f691c.getResources().getDisplayMetrics().density;
        io.flutter.plugin.platform.q qVar = (io.flutter.plugin.platform.q) kVar.f698j.get(Integer.valueOf(i2));
        io.flutter.plugin.editing.l lVar2 = kVar.f695g;
        if (lVar2 != null) {
            if (lVar2.f650e.f644a == 3) {
                lVar2.f661p = true;
            }
            qVar.getClass();
        }
        qVar.getClass();
        if (g2 == 0 && g3 == 0) {
            throw null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw null;
        }
        throw null;
    }

    @Override // O.k
    public void q(O.i iVar) {
        int i2 = iVar.f305a;
        io.flutter.plugin.platform.k kVar = (io.flutter.plugin.platform.k) this.f114c;
        float f2 = kVar.f691c.getResources().getDisplayMetrics().density;
        if (!kVar.j(i2)) {
            if (kVar.f700l.get(i2) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i2);
            return;
        }
        io.flutter.plugin.platform.q qVar = (io.flutter.plugin.platform.q) kVar.f698j.get(Integer.valueOf(i2));
        long j2 = iVar.f320p;
        int i3 = iVar.f309e;
        C.a aVar = kVar.f709u;
        aVar.getClass();
        LongSparseArray longSparseArray = (LongSparseArray) aVar.f4c;
        PriorityQueue priorityQueue = (PriorityQueue) aVar.f5d;
        while (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() < j2) {
            longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j2) {
            priorityQueue.poll();
        }
        longSparseArray.remove(j2);
        List<List> list = (List) iVar.f311g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d2 = f2;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d2);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d2);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d2);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d2);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d2);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d2);
            arrayList.add(pointerCoords);
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i3]);
        List<List> list3 = (List) iVar.f310f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        MotionEvent.obtain(iVar.f306b.longValue(), iVar.f307c.longValue(), iVar.f308d, iVar.f309e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i3]), pointerCoordsArr, iVar.f312h, iVar.f313i, iVar.f314j, iVar.f315k, iVar.f316l, iVar.f317m, iVar.f318n, iVar.f319o);
        qVar.getClass();
    }

    public void r(String str) {
        R.a aVar = (R.a) ((C.a) this.f114c).f4c;
        if (C.a.f2f == null) {
            J j2 = new J();
            j2.put("alias", 1010);
            j2.put("allScroll", 1013);
            j2.put("basic", 1000);
            j2.put("cell", 1006);
            j2.put("click", 1002);
            j2.put("contextMenu", 1001);
            j2.put("copy", 1011);
            j2.put("forbidden", 1012);
            j2.put("grab", 1020);
            j2.put("grabbing", 1021);
            j2.put("help", 1003);
            j2.put("move", 1013);
            j2.put("none", 0);
            j2.put("noDrop", 1012);
            j2.put("precise", 1007);
            j2.put("text", 1008);
            j2.put("resizeColumn", 1014);
            j2.put("resizeDown", 1015);
            j2.put("resizeUpLeft", 1016);
            j2.put("resizeDownRight", 1017);
            j2.put("resizeLeft", 1014);
            j2.put("resizeLeftRight", 1014);
            j2.put("resizeRight", 1014);
            j2.put("resizeRow", 1015);
            j2.put("resizeUp", 1015);
            j2.put("resizeUpDown", 1015);
            j2.put("resizeUpLeft", 1017);
            j2.put("resizeUpRight", 1016);
            j2.put("resizeUpLeftDownRight", 1017);
            j2.put("resizeUpRightDownLeft", 1016);
            j2.put("verticalText", 1009);
            j2.put("wait", 1004);
            j2.put("zoomIn", 1018);
            j2.put("zoomOut", 1019);
            C.a.f2f = j2;
        }
        aVar.setPointerIcon(PointerIcon.getSystemIcon(((x) aVar).getContext(), ((Integer) C.a.f2f.getOrDefault(str, 1000)).intValue()));
    }

    @Override // O.k
    public boolean s() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [J.a] */
    public Bitmap t(ByteBuffer byteBuffer, J.d dVar) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        createSource = ImageDecoder.createSource(byteBuffer);
        try {
            decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: J.a
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    ColorSpace colorSpace;
                    Size size;
                    ColorSpace.Named unused;
                    t tVar = t.this;
                    unused = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    imageDecoder.setAllocator(1);
                    m mVar = (m) tVar.f114c;
                    if (mVar != null) {
                        size = imageInfo.getSize();
                        FlutterJNI.nativeImageHeaderCallback(mVar.f216a, size.getWidth(), size.getHeight());
                    }
                }
            });
            return decodeBitmap;
        } catch (IOException e2) {
            Log.e("FlutterImageDecoderImplDefault", "Failed to decode image", e2);
            return null;
        }
    }

    public CharSequence u(O.e eVar) {
        Activity activity = ((io.flutter.plugin.platform.e) this.f114c).f668a;
        ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (clipboardManager.hasPrimaryClip()) {
            try {
                try {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null) {
                        if (eVar != null) {
                            if (eVar == O.e.f289b) {
                            }
                        }
                        ClipData.Item itemAt = primaryClip.getItemAt(0);
                        CharSequence text = itemAt.getText();
                        if (text != null) {
                            return text;
                        }
                        try {
                            Uri uri = itemAt.getUri();
                            if (uri == null) {
                                Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                                return null;
                            }
                            String scheme = uri.getScheme();
                            if (!scheme.equals("content")) {
                                Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                                return null;
                            }
                            AssetFileDescriptor openTypedAssetFileDescriptor = activity.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence coerceToText = itemAt.coerceToText(activity);
                            if (openTypedAssetFileDescriptor == null) {
                                return coerceToText;
                            }
                            try {
                                openTypedAssetFileDescriptor.close();
                                return coerceToText;
                            } catch (IOException e2) {
                                charSequence = coerceToText;
                                e = e2;
                                Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                return charSequence;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            charSequence = text;
                        }
                    }
                } catch (IOException e4) {
                    e = e4;
                }
            } catch (FileNotFoundException unused) {
                Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
                return charSequence;
            } catch (SecurityException e5) {
                Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e5);
                return charSequence;
            }
        }
        return null;
    }

    public String v(String str, String str2) {
        Q.a aVar = (Q.a) this.f114c;
        Context context = aVar.f373b;
        if (str2 != null) {
            Locale a2 = Q.a.a(str2);
            Configuration configuration = new Configuration(aVar.f373b.getResources().getConfiguration());
            configuration.setLocale(a2);
            context = aVar.f373b.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", aVar.f373b.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    public /* synthetic */ t(int i2, Object obj) {
        this.f113b = i2;
        this.f114c = obj;
    }

    public t(H.b bVar, int i2) {
        this.f113b = i2;
        switch (i2) {
            case 13:
                new E.b(bVar, "flutter/platform_views_2", P.n.f369a).h(new t(12, this));
                break;
            case 14:
                new E.b(bVar, "flutter/platform_views", P.n.f369a).h(new t(11, this));
                break;
            case 18:
                new E.b(bVar, "flutter/scribe", P.h.f365b).h(new t(17, this));
                break;
            case 20:
                new E.b(bVar, "flutter/sensitivecontent", P.n.f369a).h(new t(19, this));
                break;
            case 22:
                new E.b(bVar, "flutter/spellcheck", P.n.f369a).h(new t(21, this));
                break;
            default:
                new E.b(bVar, "flutter/mousecursor", P.n.f369a).h(new t(8, this));
                break;
        }
    }

    public t(P.f fVar) {
        this.f113b = 6;
        new E.b(fVar, "flutter/keyboard", P.n.f369a).h(new C.a(this));
    }
}
