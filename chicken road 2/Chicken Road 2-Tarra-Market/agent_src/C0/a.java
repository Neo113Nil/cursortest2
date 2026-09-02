package C0;

import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import b.AbstractDialogC0012a;
import com.google.android.gms.tasks.Task;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import n.AbstractC0789c;
import n.AbstractC0790d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u0.C0840b;

/* loaded from: classes.dex */
public final class a implements D0.b, D0.j, P.h, h0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50a;

    /* renamed from: b, reason: collision with root package name */
    public Object f51b;

    public /* synthetic */ a(int i2, Object obj) {
        this.f50a = i2;
        this.f51b = obj;
    }

    public static int e(int i2, a aVar) {
        aVar.getClass();
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0175 A[Catch: JSONException -> 0x002a, TryCatch #10 {JSONException -> 0x002a, blocks: (B:7:0x0014, B:8:0x001a, B:13:0x00cf, B:15:0x00d4, B:17:0x0103, B:20:0x0127, B:22:0x011a, B:25:0x0121, B:26:0x0136, B:28:0x015a, B:38:0x015e, B:31:0x016b, B:33:0x0175, B:35:0x0182, B:40:0x0163, B:41:0x0187, B:43:0x0197, B:45:0x019f, B:47:0x01a7, B:49:0x01b9, B:50:0x01bc, B:52:0x01e3, B:54:0x01f3, B:71:0x02b4, B:78:0x02ce, B:80:0x02de, B:81:0x02ef, B:84:0x02ec, B:114:0x01da, B:107:0x0227, B:100:0x0245, B:68:0x0289, B:93:0x02ac, B:75:0x02c6, B:86:0x02f4, B:116:0x001f, B:119:0x002d, B:122:0x0038, B:125:0x0044, B:128:0x0050, B:131:0x005b, B:134:0x0067, B:137:0x0071, B:140:0x007b, B:143:0x0085, B:146:0x008f, B:149:0x0099, B:152:0x00a4, B:155:0x00af, B:158:0x00ba, B:57:0x024e, B:59:0x0258, B:60:0x025b, B:62:0x0271, B:63:0x0283, B:66:0x027a), top: B:6:0x0014, inners: #3, #6, #8, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0182 A[Catch: JSONException -> 0x002a, TryCatch #10 {JSONException -> 0x002a, blocks: (B:7:0x0014, B:8:0x001a, B:13:0x00cf, B:15:0x00d4, B:17:0x0103, B:20:0x0127, B:22:0x011a, B:25:0x0121, B:26:0x0136, B:28:0x015a, B:38:0x015e, B:31:0x016b, B:33:0x0175, B:35:0x0182, B:40:0x0163, B:41:0x0187, B:43:0x0197, B:45:0x019f, B:47:0x01a7, B:49:0x01b9, B:50:0x01bc, B:52:0x01e3, B:54:0x01f3, B:71:0x02b4, B:78:0x02ce, B:80:0x02de, B:81:0x02ef, B:84:0x02ec, B:114:0x01da, B:107:0x0227, B:100:0x0245, B:68:0x0289, B:93:0x02ac, B:75:0x02c6, B:86:0x02f4, B:116:0x001f, B:119:0x002d, B:122:0x0038, B:125:0x0044, B:128:0x0050, B:131:0x005b, B:134:0x0067, B:137:0x0071, B:140:0x007b, B:143:0x0085, B:146:0x008f, B:149:0x0099, B:152:0x00a4, B:155:0x00af, B:158:0x00ba, B:57:0x024e, B:59:0x0258, B:60:0x025b, B:62:0x0271, B:63:0x0283, B:66:0x027a), top: B:6:0x0014, inners: #3, #6, #8, #12 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void i(Y.e eVar, p pVar) {
        char c2;
        i a2;
        CharSequence o2;
        ClipDescription primaryClipDescription;
        Y.e eVar2 = (Y.e) this.f51b;
        if (((io.flutter.plugin.editing.a) eVar2.f524c) == null) {
            return;
        }
        String str = (String) eVar.f523b;
        try {
            boolean z2 = false;
            switch (str.hashCode()) {
                case -1501580720:
                    if (str.equals("SystemNavigator.setFrameworkHandlesBack")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -931781241:
                    if (str.equals("Share.invoke")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -766342101:
                    if (str.equals("SystemNavigator.pop")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -720677196:
                    if (str.equals("Clipboard.setData")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -577225884:
                    if (str.equals("SystemChrome.setSystemUIChangeListener")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -548468504:
                    if (str.equals("SystemChrome.setApplicationSwitcherDescription")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -247230243:
                    if (str.equals("HapticFeedback.vibrate")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -215273374:
                    if (str.equals("SystemSound.play")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 241845679:
                    if (str.equals("SystemChrome.restoreSystemUIOverlays")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 875995648:
                    if (str.equals("Clipboard.hasStrings")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1128339786:
                    if (str.equals("SystemChrome.setEnabledSystemUIMode")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1390477857:
                    if (str.equals("SystemChrome.setSystemUIOverlayStyle")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1514180520:
                    if (str.equals("Clipboard.getData")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1674312266:
                    if (str.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2119655719:
                    if (str.equals("SystemChrome.setPreferredOrientations")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            Object obj = eVar.f524c;
            switch (c2) {
                case 0:
                    try {
                        int c3 = g.c((String) obj);
                        io.flutter.plugin.platform.e eVar3 = (io.flutter.plugin.platform.e) ((io.flutter.plugin.editing.a) eVar2.f524c).f5792b;
                        if (c3 == 1) {
                            eVar3.f5858a.getWindow().getDecorView().playSoundEffect(0);
                        } else {
                            eVar3.getClass();
                        }
                        pVar.c(null);
                        return;
                    } catch (NoSuchFieldException e2) {
                        pVar.a("error", e2.getMessage(), null);
                        return;
                    }
                case 1:
                    try {
                        ((io.flutter.plugin.editing.a) eVar2.f524c).w(g.b((String) obj));
                        pVar.c(null);
                        return;
                    } catch (NoSuchFieldException e3) {
                        pVar.a("error", e3.getMessage(), null);
                        return;
                    }
                case 2:
                    try {
                        ((io.flutter.plugin.platform.e) ((io.flutter.plugin.editing.a) eVar2.f524c).f5792b).f5858a.setRequestedOrientation(Y.e.i(eVar2, (JSONArray) obj));
                        pVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e4) {
                        pVar.a("error", e4.getMessage(), null);
                        return;
                    }
                case 3:
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        int i2 = jSONObject.getInt("primaryColor");
                        if (i2 != 0) {
                            i2 |= -16777216;
                        }
                        String string = jSONObject.getString("label");
                        io.flutter.plugin.editing.a aVar = (io.flutter.plugin.editing.a) eVar2.f524c;
                        int i3 = Build.VERSION.SDK_INT;
                        s0.d dVar = ((io.flutter.plugin.platform.e) aVar.f5792b).f5858a;
                        if (i3 < 28) {
                            dVar.setTaskDescription(new ActivityManager.TaskDescription(string, (Bitmap) null, i2));
                        } else {
                            dVar.setTaskDescription(A.o.d(i2, string));
                        }
                        pVar.c(null);
                        return;
                    } catch (JSONException e5) {
                        pVar.a("error", e5.getMessage(), null);
                        return;
                    }
                case 4:
                    try {
                        ((io.flutter.plugin.editing.a) eVar2.f524c).u(Y.e.j(eVar2, (JSONArray) obj));
                        pVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e6) {
                        pVar.a("error", e6.getMessage(), null);
                        return;
                    }
                case 5:
                    try {
                        ((io.flutter.plugin.editing.a) eVar2.f524c).v(Y.e.k(eVar2, (String) obj));
                        pVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e7) {
                        pVar.a("error", e7.getMessage(), null);
                        return;
                    }
                case 6:
                    io.flutter.plugin.platform.e eVar4 = (io.flutter.plugin.platform.e) ((io.flutter.plugin.editing.a) eVar2.f524c).f5792b;
                    View decorView = eVar4.f5858a.getWindow().getDecorView();
                    decorView.setOnSystemUiVisibilityChangeListener(new io.flutter.plugin.platform.d(eVar4, decorView));
                    pVar.c(null);
                    return;
                case 7:
                    ((io.flutter.plugin.platform.e) ((io.flutter.plugin.editing.a) eVar2.f524c).f5792b).b();
                    pVar.c(null);
                    return;
                case '\b':
                    try {
                        ((io.flutter.plugin.platform.e) ((io.flutter.plugin.editing.a) eVar2.f524c).f5792b).a(Y.e.l(eVar2, (JSONObject) obj));
                        pVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e8) {
                        pVar.a("error", e8.getMessage(), null);
                        return;
                    }
                case '\t':
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    s0.d dVar2 = ((io.flutter.plugin.platform.e) ((io.flutter.plugin.editing.a) eVar2.f524c).f5792b).f5860c;
                    if (dVar2 != null) {
                        dVar2.i(booleanValue);
                    }
                    pVar.c(null);
                    return;
                case '\n':
                    io.flutter.plugin.platform.e eVar5 = (io.flutter.plugin.platform.e) ((io.flutter.plugin.editing.a) eVar2.f524c).f5792b;
                    s0.d dVar3 = eVar5.f5860c;
                    s0.d dVar4 = eVar5.f5858a;
                    if (dVar4 instanceof b.b) {
                        ((AbstractDialogC0012a) ((b.b) dVar4)).getClass();
                        throw null;
                    }
                    dVar4.finish();
                    pVar.c(null);
                    return;
                case 11:
                    String str2 = (String) obj;
                    if (str2 != null) {
                        try {
                            a2 = i.a(str2);
                        } catch (NoSuchFieldException unused) {
                            pVar.a("error", "No such clipboard content format: ".concat(str2), null);
                        }
                        o2 = ((io.flutter.plugin.editing.a) eVar2.f524c).o(a2);
                        if (o2 != null) {
                            pVar.c(null);
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("text", o2);
                        pVar.c(jSONObject2);
                        return;
                    }
                    a2 = null;
                    o2 = ((io.flutter.plugin.editing.a) eVar2.f524c).o(a2);
                    if (o2 != null) {
                    }
                case '\f':
                    ((ClipboardManager) ((io.flutter.plugin.platform.e) ((io.flutter.plugin.editing.a) eVar2.f524c).f5792b).f5858a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj).getString("text")));
                    pVar.c(null);
                    return;
                case '\r':
                    ClipboardManager clipboardManager = (ClipboardManager) ((io.flutter.plugin.platform.e) ((io.flutter.plugin.editing.a) eVar2.f524c).f5792b).f5858a.getSystemService("clipboard");
                    if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                        z2 = primaryClipDescription.hasMimeType("text/*");
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("value", z2);
                    pVar.c(jSONObject3);
                    return;
                case 14:
                    io.flutter.plugin.platform.e eVar6 = (io.flutter.plugin.platform.e) ((io.flutter.plugin.editing.a) eVar2.f524c).f5792b;
                    eVar6.getClass();
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", (String) obj);
                    eVar6.f5858a.startActivity(Intent.createChooser(intent, null));
                    pVar.c(null);
                    return;
                default:
                    pVar.b();
                    return;
            }
        } catch (JSONException e9) {
            pVar.a("error", "JSON error: " + e9.getMessage(), null);
        }
        pVar.a("error", "JSON error: " + e9.getMessage(), null);
    }

    private final void j(Y.e eVar, p pVar) {
        Object obj;
        a aVar = (a) this.f51b;
        if (((io.flutter.plugin.editing.a) aVar.f51b) == null) {
            return;
        }
        String str = (String) eVar.f523b;
        str.getClass();
        obj = eVar.f524c;
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
                    if (((io.flutter.plugin.platform.i) ((io.flutter.plugin.editing.a) aVar.f51b).f5792b).f5864a.f6692a.get(str2) != null) {
                        throw new ClassCastException();
                    }
                    throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str2);
                } catch (IllegalStateException e2) {
                    pVar.a("error", Log.getStackTraceString(e2), null);
                    return;
                }
            case "clearFocus":
                int intValue = ((Integer) obj).intValue();
                try {
                    g.j(((io.flutter.plugin.platform.i) ((io.flutter.plugin.editing.a) aVar.f51b).f5792b).f5870g.get(intValue));
                    Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + intValue);
                    pVar.c(null);
                    return;
                } catch (IllegalStateException e3) {
                    pVar.a("error", Log.getStackTraceString(e3), null);
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
                    io.flutter.plugin.editing.a aVar2 = (io.flutter.plugin.editing.a) aVar.f51b;
                    aVar2.getClass();
                    io.flutter.plugin.platform.i iVar = (io.flutter.plugin.platform.i) aVar2.f5792b;
                    float f2 = iVar.f5865b.getResources().getDisplayMetrics().density;
                    if (iVar.f5870g.get(intValue2) != null) {
                        throw new ClassCastException();
                    }
                    Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + intValue2);
                    pVar.c(null);
                    return;
                } catch (IllegalStateException e4) {
                    pVar.a("error", Log.getStackTraceString(e4), null);
                    return;
                }
            case "setDirection":
                Map map2 = (Map) obj;
                int intValue3 = ((Integer) map2.get("id")).intValue();
                ((Integer) map2.get("direction")).getClass();
                try {
                    if (((io.flutter.plugin.platform.i) ((io.flutter.plugin.editing.a) aVar.f51b).f5792b).f5870g.get(intValue3) != null) {
                        throw new ClassCastException();
                    }
                    Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + intValue3);
                    pVar.c(null);
                    return;
                } catch (IllegalStateException e5) {
                    pVar.a("error", Log.getStackTraceString(e5), null);
                    return;
                }
            case "isSurfaceControlEnabled":
                FlutterJNI flutterJNI = ((io.flutter.plugin.platform.i) ((io.flutter.plugin.editing.a) aVar.f51b).f5792b).f5867d;
                pVar.c(Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                return;
            case "dispose":
                try {
                    ((io.flutter.plugin.editing.a) aVar.f51b).n(((Integer) ((Map) obj).get("id")).intValue());
                    pVar.c(null);
                    return;
                } catch (IllegalStateException e6) {
                    pVar.a("error", Log.getStackTraceString(e6), null);
                    return;
                }
            default:
                pVar.b();
                return;
        }
    }

    private final void k(Y.e eVar, p pVar) {
        boolean isStylusHandwritingAvailable;
        boolean isStylusHandwritingAvailable2;
        boolean z2 = true;
        a aVar = (a) this.f51b;
        if (((Y.e) aVar.f51b) == null) {
        }
        String str = (String) eVar.f523b;
        str.getClass();
        switch (str) {
            case "Scribe.isFeatureAvailable":
                try {
                    Y.e eVar2 = (Y.e) aVar.f51b;
                    if (Build.VERSION.SDK_INT >= 34) {
                        isStylusHandwritingAvailable = ((InputMethodManager) eVar2.f523b).isStylusHandwritingAvailable();
                        if (isStylusHandwritingAvailable) {
                            pVar.c(Boolean.valueOf(z2));
                            break;
                        }
                    } else {
                        eVar2.getClass();
                    }
                    z2 = false;
                    pVar.c(Boolean.valueOf(z2));
                } catch (IllegalStateException e2) {
                    pVar.a("error", e2.getMessage(), null);
                    return;
                }
            case "Scribe.startStylusHandwriting":
                if (Build.VERSION.SDK_INT < 33) {
                    pVar.a("error", "Requires API level 33 or higher.", null);
                    break;
                } else {
                    try {
                        Y.e eVar3 = (Y.e) aVar.f51b;
                        ((InputMethodManager) eVar3.f523b).startStylusHandwriting((s0.o) eVar3.f524c);
                        pVar.c(null);
                        break;
                    } catch (IllegalStateException e3) {
                        pVar.a("error", e3.getMessage(), null);
                        return;
                    }
                }
            case "Scribe.isStylusHandwritingAvailable":
                if (Build.VERSION.SDK_INT < 34) {
                    pVar.a("error", "Requires API level 34 or higher.", null);
                    break;
                } else {
                    try {
                        isStylusHandwritingAvailable2 = ((InputMethodManager) ((Y.e) aVar.f51b).f523b).isStylusHandwritingAvailable();
                        pVar.c(Boolean.valueOf(isStylusHandwritingAvailable2));
                        break;
                    } catch (IllegalStateException e4) {
                        pVar.a("error", e4.getMessage(), null);
                        return;
                    }
                }
            default:
                pVar.b();
                break;
        }
    }

    private final void l(Y.e eVar, p pVar) {
        int i2 = 2;
        a aVar = (a) this.f51b;
        if (((H0.b) aVar.f51b) == null) {
        }
        String str = (String) eVar.f523b;
        str.getClass();
        switch (str) {
            case "SensitiveContent.getContentSensitivity":
                try {
                    int e2 = ((H0.b) aVar.f51b).e();
                    if (e2 == 0) {
                        i2 = 0;
                    } else if (e2 == 1) {
                        i2 = 1;
                    } else if (e2 != 2) {
                        i2 = 3;
                    }
                    pVar.c(Integer.valueOf(i2));
                    break;
                } catch (IllegalArgumentException | IllegalStateException e3) {
                    pVar.a("error", e3.getMessage(), null);
                    return;
                }
            case "SensitiveContent.setContentSensitivity":
                try {
                    ((H0.b) aVar.f51b).g(e(((Integer) eVar.f524c).intValue(), aVar));
                    break;
                } catch (IllegalArgumentException | IllegalStateException e4) {
                    pVar.a("error", e4.getMessage(), null);
                    return;
                }
            case "SensitiveContent.isSupported":
                ((H0.b) aVar.f51b).getClass();
                pVar.c(Boolean.valueOf(Build.VERSION.SDK_INT >= 35));
                break;
            default:
                pVar.b();
                break;
        }
    }

    @Override // D0.b
    public void a(Object obj, Y.e eVar) {
        HashMap hashMap;
        HashMap hashMap2;
        b bVar = (b) this.f51b;
        if (((io.flutter.view.b) bVar.f56d) == null) {
            eVar.e(null);
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
                    io.flutter.view.b bVar2 = (io.flutter.view.b) bVar.f56d;
                    if (Build.VERSION.SDK_INT < 28) {
                        io.flutter.view.i iVar = (io.flutter.view.i) bVar2.f5909a;
                        AccessibilityEvent d2 = iVar.d(0, 32);
                        d2.getText().add(str2);
                        iVar.h(d2);
                        break;
                    } else {
                        bVar2.getClass();
                        break;
                    }
                }
                break;
            case "announce":
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    io.flutter.view.b bVar3 = (io.flutter.view.b) bVar.f56d;
                    if (Build.VERSION.SDK_INT >= 36) {
                        bVar3.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.i) bVar3.f5909a).f5999a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    io.flutter.view.b bVar4 = (io.flutter.view.b) bVar.f56d;
                    ((io.flutter.view.i) bVar4.f5909a).g(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.b bVar5 = (io.flutter.view.b) bVar.f56d;
                    ((io.flutter.view.i) bVar5.f5909a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.b bVar6 = (io.flutter.view.b) bVar.f56d;
                    ((io.flutter.view.i) bVar6.f5909a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        eVar.e(null);
    }

    @Override // h0.c
    public void b(String str, HashMap hashMap) {
        ((p) this.f51b).a("sqlite_error", str, hashMap);
    }

    @Override // h0.c
    public void c(Serializable serializable) {
        ((p) this.f51b).c(serializable);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // D0.j
    public void d(Y.e eVar, p pVar) {
        char c2;
        char c3;
        Bundle bundle;
        int i2 = 0;
        switch (this.f50a) {
            case 1:
                ((N.i) this.f51b).getClass();
                return;
            case 2:
            case 5:
            case 9:
            case 10:
            case 14:
            case 16:
            default:
                Y.e eVar2 = (Y.e) this.f51b;
                if (((io.flutter.plugin.editing.j) eVar2.f524c) == null) {
                    return;
                }
                String str = (String) eVar.f523b;
                str.getClass();
                Object obj = eVar.f524c;
                switch (str.hashCode()) {
                    case -1779068172:
                        if (str.equals("TextInput.setPlatformViewClient")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1015421462:
                        if (str.equals("TextInput.setEditingState")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -37561188:
                        if (str.equals("TextInput.setClient")) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 270476819:
                        if (str.equals("TextInput.hide")) {
                            c3 = 3;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 270803918:
                        if (str.equals("TextInput.show")) {
                            c3 = 4;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 649192816:
                        if (str.equals("TextInput.sendAppPrivateCommand")) {
                            c3 = 5;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1204752139:
                        if (str.equals("TextInput.setEditableSizeAndTransform")) {
                            c3 = 6;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1727570905:
                        if (str.equals("TextInput.finishAutofillContext")) {
                            c3 = 7;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1904427655:
                        if (str.equals("TextInput.clearClient")) {
                            c3 = '\b';
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 2113369584:
                        if (str.equals("TextInput.requestAutofill")) {
                            c3 = '\t';
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
                            JSONObject jSONObject = (JSONObject) obj;
                            int i3 = jSONObject.getInt("platformViewId");
                            boolean optBoolean = jSONObject.optBoolean("usesVirtualDisplay", false);
                            io.flutter.plugin.editing.l lVar = ((io.flutter.plugin.editing.j) eVar2.f524c).f5833a;
                            if (optBoolean) {
                                s0.o oVar = lVar.f5836a;
                                oVar.requestFocus();
                                lVar.f5840e = new io.flutter.plugin.editing.k(3, i3);
                                lVar.f5837b.restartInput(oVar);
                                lVar.f5844i = false;
                            } else {
                                lVar.getClass();
                                lVar.f5840e = new io.flutter.plugin.editing.k(4, i3);
                                lVar.f5845j = null;
                            }
                            pVar.c(null);
                            return;
                        } catch (JSONException e2) {
                            pVar.a("error", e2.getMessage(), null);
                            return;
                        }
                    case 1:
                        try {
                            ((io.flutter.plugin.editing.j) eVar2.f524c).c(w.a((JSONObject) obj));
                            pVar.c(null);
                            return;
                        } catch (JSONException e3) {
                            pVar.a("error", e3.getMessage(), null);
                            return;
                        }
                    case 2:
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            ((io.flutter.plugin.editing.j) eVar2.f524c).a(jSONArray.getInt(0), u.a(jSONArray.getJSONObject(1)));
                            pVar.c(null);
                            return;
                        } catch (NoSuchFieldException | JSONException e4) {
                            pVar.a("error", e4.getMessage(), null);
                            return;
                        }
                    case 3:
                        io.flutter.plugin.editing.l lVar2 = ((io.flutter.plugin.editing.j) eVar2.f524c).f5833a;
                        if (lVar2.f5840e.f5834a == 4) {
                            lVar2.c();
                        } else {
                            lVar2.c();
                            lVar2.f5837b.hideSoftInputFromWindow(lVar2.f5836a.getApplicationWindowToken(), 0);
                        }
                        pVar.c(null);
                        return;
                    case 4:
                        io.flutter.plugin.editing.l lVar3 = ((io.flutter.plugin.editing.j) eVar2.f524c).f5833a;
                        s0.o oVar2 = lVar3.f5836a;
                        u uVar = lVar3.f5841f;
                        InputMethodManager inputMethodManager = lVar3.f5837b;
                        if (uVar == null || uVar.f126g.f134b != 11) {
                            oVar2.requestFocus();
                            inputMethodManager.showSoftInput(oVar2, 0);
                        } else {
                            lVar3.c();
                            inputMethodManager.hideSoftInputFromWindow(oVar2.getApplicationWindowToken(), 0);
                        }
                        pVar.c(null);
                        return;
                    case 5:
                        try {
                            JSONObject jSONObject2 = (JSONObject) obj;
                            String string = jSONObject2.getString("action");
                            String string2 = jSONObject2.getString("data");
                            if (string2 == null || string2.isEmpty()) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("data", string2);
                            }
                            io.flutter.plugin.editing.l lVar4 = ((io.flutter.plugin.editing.j) eVar2.f524c).f5833a;
                            lVar4.f5837b.sendAppPrivateCommand(lVar4.f5836a, string, bundle);
                            pVar.c(null);
                            return;
                        } catch (JSONException e5) {
                            pVar.a("error", e5.getMessage(), null);
                            return;
                        }
                    case 6:
                        try {
                            JSONObject jSONObject3 = (JSONObject) obj;
                            double d2 = jSONObject3.getDouble("width");
                            double d3 = jSONObject3.getDouble("height");
                            JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                            double[] dArr = new double[16];
                            while (i2 < 16) {
                                dArr[i2] = jSONArray2.getDouble(i2);
                                i2++;
                            }
                            ((io.flutter.plugin.editing.j) eVar2.f524c).b(d2, d3, dArr);
                            pVar.c(null);
                            return;
                        } catch (JSONException e6) {
                            pVar.a("error", e6.getMessage(), null);
                            return;
                        }
                    case 7:
                        io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) eVar2.f524c;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (Build.VERSION.SDK_INT >= 26) {
                            AutofillManager autofillManager = jVar.f5833a.f5838c;
                            if (autofillManager != null) {
                                if (booleanValue) {
                                    autofillManager.commit();
                                } else {
                                    autofillManager.cancel();
                                }
                            }
                        } else {
                            jVar.getClass();
                        }
                        pVar.c(null);
                        return;
                    case '\b':
                        io.flutter.plugin.editing.l lVar5 = ((io.flutter.plugin.editing.j) eVar2.f524c).f5833a;
                        if (lVar5.f5840e.f5834a != 3) {
                            lVar5.f5843h.e(lVar5);
                            lVar5.c();
                            lVar5.f5841f = null;
                            lVar5.d(null);
                            lVar5.f5840e = new io.flutter.plugin.editing.k(1, 0);
                            lVar5.f5848m = null;
                            int i4 = AbstractC0790d.f6147a;
                            s0.o oVar3 = lVar5.f5836a;
                            n.r a2 = AbstractC0789c.a(oVar3);
                            if (a2 != null && !a2.f6171a.m(8)) {
                                lVar5.f5837b.restartInput(oVar3);
                            }
                        }
                        pVar.c(null);
                        return;
                    case '\t':
                        io.flutter.plugin.editing.j jVar2 = (io.flutter.plugin.editing.j) eVar2.f524c;
                        int i5 = Build.VERSION.SDK_INT;
                        io.flutter.plugin.editing.l lVar6 = jVar2.f5833a;
                        if (i5 < 26) {
                            lVar6.getClass();
                        } else if (lVar6.f5838c != null && lVar6.f5842g != null) {
                            String str2 = (String) lVar6.f5841f.f129j.f116a;
                            int[] iArr = new int[2];
                            s0.o oVar4 = lVar6.f5836a;
                            oVar4.getLocationOnScreen(iArr);
                            Rect rect = new Rect(lVar6.f5848m);
                            rect.offset(iArr[0], iArr[1]);
                            lVar6.f5838c.notifyViewEntered(oVar4, str2.hashCode(), rect);
                        }
                        pVar.c(null);
                        return;
                    default:
                        pVar.b();
                        return;
                }
            case 3:
                Y.e eVar3 = (Y.e) this.f51b;
                if (((a) eVar3.f524c) == null) {
                    return;
                }
                String str3 = (String) eVar.f523b;
                str3.getClass();
                if (!str3.equals("Localization.getStringResource")) {
                    pVar.b();
                    return;
                }
                JSONObject jSONObject4 = (JSONObject) eVar.f524c;
                try {
                    pVar.c(((a) eVar3.f524c).h(jSONObject4.getString("key"), jSONObject4.has(CommonUrlParts.LOCALE) ? jSONObject4.getString(CommonUrlParts.LOCALE) : null));
                    return;
                } catch (JSONException e7) {
                    pVar.a("error", e7.getMessage(), null);
                    return;
                }
            case 4:
                a aVar = (a) this.f51b;
                if (((a) aVar.f51b) == null) {
                    return;
                }
                String str4 = (String) eVar.f523b;
                try {
                    if (str4.hashCode() == -1307105544 && str4.equals("activateSystemCursor")) {
                        try {
                            ((a) aVar.f51b).g((String) ((HashMap) eVar.f524c).get("kind"));
                            pVar.c(Boolean.TRUE);
                        } catch (Exception e8) {
                            pVar.a("error", "Error when setting cursors: " + e8.getMessage(), null);
                        }
                    }
                    return;
                } catch (Exception e9) {
                    pVar.a("error", "Unhandled error: " + e9.getMessage(), null);
                    return;
                }
            case 6:
                i(eVar, pVar);
                return;
            case 7:
                a aVar2 = (a) this.f51b;
                if (((Y.e) aVar2.f51b) == null) {
                    return;
                }
                String str5 = (String) eVar.f523b;
                str5.getClass();
                Object obj2 = eVar.f524c;
                switch (str5.hashCode()) {
                    case -1352294148:
                        if (str5.equals("create")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1019779949:
                        if (str5.equals("offset")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -934437708:
                        if (str5.equals("resize")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -756050293:
                        if (str5.equals("clearFocus")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -308988850:
                        if (str5.equals("synchronizeToNativeViewHierarchy")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 110550847:
                        if (str5.equals("touch")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 576796989:
                        if (str5.equals("setDirection")) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1671767583:
                        if (str5.equals("dispose")) {
                            c2 = 7;
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
                        Map map = (Map) obj2;
                        boolean z2 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                        ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                        try {
                            FlutterJNI flutterJNI = ((io.flutter.plugin.platform.i) ((Y.e) aVar2.f51b).f524c).f5867d;
                            if (!(flutterJNI == null ? false : flutterJNI.IsSurfaceControlEnabled())) {
                                if (z2) {
                                    ((io.flutter.plugin.platform.j) ((Y.e) aVar2.f51b).f523b).f5898u.k(new l(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, ((Integer) map.get("direction")).intValue(), 3, wrap));
                                    throw null;
                                }
                                ((io.flutter.plugin.platform.j) ((Y.e) aVar2.f51b).f523b).f5898u.l(new l(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue() ? 2 : 1, wrap));
                                throw null;
                            }
                            ((Integer) map.get("id")).getClass();
                            String str6 = (String) map.get("viewType");
                            ((Integer) map.get("direction")).getClass();
                            if (((io.flutter.plugin.platform.i) ((io.flutter.plugin.platform.i) ((Y.e) aVar2.f51b).f524c).f5877n.f5792b).f5864a.f6692a.get(str6) != null) {
                                throw new ClassCastException();
                            }
                            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str6);
                        } catch (IllegalStateException e10) {
                            pVar.a("error", Log.getStackTraceString(e10), null);
                            return;
                        }
                    case 1:
                        Map map2 = (Map) obj2;
                        try {
                            Y.e eVar4 = (Y.e) aVar2.f51b;
                            int intValue = ((Integer) map2.get("id")).intValue();
                            double doubleValue = ((Double) map2.get("top")).doubleValue();
                            double doubleValue2 = ((Double) map2.get("left")).doubleValue();
                            ((io.flutter.plugin.platform.i) eVar4.f524c).g(intValue);
                            ((io.flutter.plugin.platform.j) eVar4.f523b).f5898u.q(intValue, doubleValue, doubleValue2);
                            pVar.c(null);
                            return;
                        } catch (IllegalStateException e11) {
                            pVar.a("error", Log.getStackTraceString(e11), null);
                            return;
                        }
                    case 2:
                        Map map3 = (Map) obj2;
                        int intValue2 = ((Integer) map3.get("id")).intValue();
                        o oVar5 = new o(intValue2, ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue());
                        try {
                            Y.e eVar5 = (Y.e) aVar2.f51b;
                            n nVar = new n(i2, pVar);
                            eVar5.getClass();
                            ((io.flutter.plugin.platform.i) eVar5.f524c).g(intValue2);
                            ((io.flutter.plugin.platform.j) eVar5.f523b).f5898u.s(oVar5, nVar);
                            return;
                        } catch (IllegalStateException e12) {
                            pVar.a("error", Log.getStackTraceString(e12), null);
                            return;
                        }
                    case 3:
                        int intValue3 = ((Integer) obj2).intValue();
                        try {
                            Y.e eVar6 = (Y.e) aVar2.f51b;
                            ((io.flutter.plugin.platform.i) eVar6.f524c).g(intValue3);
                            ((io.flutter.plugin.platform.j) eVar6.f523b).f5898u.i(intValue3);
                            pVar.c(null);
                            return;
                        } catch (IllegalStateException e13) {
                            pVar.a("error", Log.getStackTraceString(e13), null);
                            return;
                        }
                    case 4:
                        try {
                            ((io.flutter.plugin.platform.j) ((io.flutter.plugin.platform.j) ((Y.e) aVar2.f51b).f523b).f5898u.f5792b).f5894q = ((Boolean) obj2).booleanValue();
                            pVar.c(null);
                            return;
                        } catch (IllegalStateException e14) {
                            pVar.a("error", Log.getStackTraceString(e14), null);
                            return;
                        }
                    case 5:
                        List list = (List) obj2;
                        int intValue4 = ((Integer) list.get(0)).intValue();
                        m mVar = new m(intValue4, (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue());
                        try {
                            Y.e eVar7 = (Y.e) aVar2.f51b;
                            eVar7.getClass();
                            ((io.flutter.plugin.platform.i) eVar7.f524c).g(intValue4);
                            ((io.flutter.plugin.platform.j) eVar7.f523b).f5898u.r(mVar);
                            pVar.c(null);
                            return;
                        } catch (IllegalStateException e15) {
                            pVar.a("error", Log.getStackTraceString(e15), null);
                            return;
                        }
                    case 6:
                        Map map4 = (Map) obj2;
                        int intValue5 = ((Integer) map4.get("id")).intValue();
                        int intValue6 = ((Integer) map4.get("direction")).intValue();
                        try {
                            Y.e eVar8 = (Y.e) aVar2.f51b;
                            ((io.flutter.plugin.platform.i) eVar8.f524c).g(intValue5);
                            ((io.flutter.plugin.platform.j) eVar8.f523b).f5898u.t(intValue5, intValue6);
                            pVar.c(null);
                            return;
                        } catch (IllegalStateException e16) {
                            pVar.a("error", Log.getStackTraceString(e16), null);
                            return;
                        }
                    case 7:
                        int intValue7 = ((Integer) ((Map) obj2).get("id")).intValue();
                        try {
                            Y.e eVar9 = (Y.e) aVar2.f51b;
                            ((io.flutter.plugin.platform.i) eVar9.f524c).g(intValue7);
                            ((io.flutter.plugin.platform.j) eVar9.f523b).f5898u.n(intValue7);
                            pVar.c(null);
                            return;
                        } catch (IllegalStateException e17) {
                            pVar.a("error", Log.getStackTraceString(e17), null);
                            return;
                        }
                    default:
                        pVar.b();
                        return;
                }
            case 8:
                j(eVar, pVar);
                return;
            case 11:
                Y.e eVar10 = (Y.e) this.f51b;
                if (((G0.b) eVar10.f524c) == null) {
                    return;
                }
                String str7 = (String) eVar.f523b;
                Object obj3 = eVar.f524c;
                str7.getClass();
                if (str7.equals("ProcessText.processTextAction")) {
                    try {
                        ArrayList arrayList = (ArrayList) obj3;
                        ((G0.b) eVar10.f524c).a((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), pVar);
                        return;
                    } catch (IllegalStateException e18) {
                        pVar.a("error", e18.getMessage(), null);
                        return;
                    }
                }
                if (!str7.equals("ProcessText.queryTextActions")) {
                    pVar.b();
                    return;
                }
                try {
                    pVar.c(((G0.b) eVar10.f524c).b());
                    return;
                } catch (IllegalStateException e19) {
                    pVar.a("error", e19.getMessage(), null);
                    return;
                }
            case 12:
                String str8 = (String) eVar.f523b;
                str8.getClass();
                q qVar = (q) this.f51b;
                if (!str8.equals("get")) {
                    if (!str8.equals("put")) {
                        pVar.b();
                        return;
                    } else {
                        qVar.f106b = (byte[]) eVar.f524c;
                        pVar.c(null);
                        return;
                    }
                }
                qVar.f110f = true;
                if (qVar.f109e || !qVar.f105a) {
                    pVar.c(q.a(qVar.f106b));
                    return;
                } else {
                    qVar.f108d = pVar;
                    return;
                }
            case 13:
                k(eVar, pVar);
                return;
            case 15:
                l(eVar, pVar);
                return;
            case 17:
                a aVar3 = (a) this.f51b;
                if (((io.flutter.plugin.editing.h) aVar3.f51b) == null) {
                    return;
                }
                String str9 = (String) eVar.f523b;
                Object obj4 = eVar.f524c;
                str9.getClass();
                if (!str9.equals("SpellCheck.initiateSpellCheck")) {
                    pVar.b();
                    return;
                }
                try {
                    ArrayList arrayList2 = (ArrayList) obj4;
                    ((io.flutter.plugin.editing.h) aVar3.f51b).a((String) arrayList2.get(0), (String) arrayList2.get(1), pVar);
                    return;
                } catch (IllegalStateException e20) {
                    pVar.a("error", e20.getMessage(), null);
                    return;
                }
        }
    }

    @Override // P.h
    public void f(Object obj, Object obj2) {
        e0.d dVar = (e0.d) obj2;
        S.a aVar = (S.a) ((S.d) obj).q();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar.f531b);
        int i2 = Z.b.f532a;
        Q.j jVar = (Q.j) this.f51b;
        if (jVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            jVar.writeToParcel(obtain, 0);
        }
        try {
            aVar.f530a.transact(1, obtain, null, 1);
            obtain.recycle();
            dVar.f954a.f(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public void g(String str) {
        Y.e eVar = (Y.e) this.f51b;
        s0.o oVar = (s0.o) eVar.f523b;
        F0.a aVar = Y.e.f520e;
        Integer valueOf = Integer.valueOf(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
        if (aVar == null) {
            F0.a aVar2 = new F0.a();
            aVar2.put("alias", 1010);
            aVar2.put("allScroll", 1013);
            aVar2.put("basic", valueOf);
            aVar2.put("cell", 1006);
            aVar2.put("click", 1002);
            aVar2.put("contextMenu", 1001);
            aVar2.put("copy", 1011);
            aVar2.put("forbidden", 1012);
            aVar2.put("grab", 1020);
            aVar2.put("grabbing", 1021);
            aVar2.put("help", 1003);
            aVar2.put("move", 1013);
            aVar2.put("none", 0);
            aVar2.put("noDrop", 1012);
            aVar2.put("precise", 1007);
            aVar2.put("text", 1008);
            aVar2.put("resizeColumn", 1014);
            aVar2.put("resizeDown", 1015);
            aVar2.put("resizeUpLeft", 1016);
            aVar2.put("resizeDownRight", 1017);
            aVar2.put("resizeLeft", 1014);
            aVar2.put("resizeLeftRight", 1014);
            aVar2.put("resizeRight", 1014);
            aVar2.put("resizeRow", 1015);
            aVar2.put("resizeUp", 1015);
            aVar2.put("resizeUpDown", 1015);
            aVar2.put("resizeUpLeft", 1017);
            aVar2.put("resizeUpRight", 1016);
            aVar2.put("resizeUpLeftDownRight", 1017);
            aVar2.put("resizeUpRightDownLeft", 1016);
            aVar2.put("verticalText", 1009);
            aVar2.put("wait", 1004);
            aVar2.put("zoomIn", 1018);
            aVar2.put("zoomOut", 1019);
            Y.e.f520e = aVar2;
        }
        oVar.setPointerIcon(PointerIcon.getSystemIcon(((s0.o) eVar.f523b).getContext(), ((Integer) Y.e.f520e.getOrDefault(str, valueOf)).intValue()));
    }

    public String h(String str, String str2) {
        E0.b bVar = (E0.b) this.f51b;
        Context context = bVar.f173b;
        s0.d dVar = bVar.f173b;
        if (str2 != null) {
            Locale a2 = E0.b.a(str2);
            Configuration configuration = new Configuration(dVar.getResources().getConfiguration());
            configuration.setLocale(a2);
            context = dVar.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", dVar.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    public Task m(Task task) {
        Y.e eVar = (Y.e) this.f51b;
        if (!task.d() && !((e0.k) task).f971d) {
            Exception b2 = task.b();
            if (b2 instanceof O.d) {
                int i2 = ((O.d) b2).f263a.f727a;
                if (i2 == 43001 || i2 == 43002 || i2 == 43003 || i2 == 17) {
                    Y.e eVar2 = (Y.e) eVar.f524c;
                    eVar2.getClass();
                    e0.d dVar = new e0.d();
                    ((ExecutorService) eVar2.f524c).execute(new P.q(eVar2, dVar));
                    task = dVar.f954a;
                } else if (i2 == 43000) {
                    Exception exc = new Exception("Failed to get app set ID due to an internal error. Please try again later.");
                    e0.k kVar = new e0.k();
                    kVar.e(exc);
                    task = kVar;
                } else if (i2 == 15) {
                    Exception exc2 = new Exception("The operation to get app set ID timed out. Please try again later.");
                    e0.k kVar2 = new e0.k();
                    kVar2.e(exc2);
                    return kVar2;
                }
            }
        }
        return task;
    }

    public String toString() {
        switch (this.f50a) {
            case 28:
                return "<" + ((String) this.f51b) + '>';
            default:
                return super.toString();
        }
    }

    public a(C0840b c0840b, int i2) {
        this.f50a = i2;
        switch (i2) {
            case 9:
                new t(c0840b, "flutter/platform_views_2", D0.n.f167b, null).j(new a(8, this));
                break;
            case 10:
                new t(c0840b, "flutter/platform_views", D0.n.f167b, null).j(new a(7, this));
                break;
            case 14:
                new t(c0840b, "flutter/scribe", D0.h.f166b, null).j(new a(13, this));
                break;
            case 16:
                new t(c0840b, "flutter/sensitivecontent", D0.n.f167b, null).j(new a(15, this));
                break;
            case 18:
                new t(c0840b, "flutter/spellcheck", D0.n.f167b, null).j(new a(17, this));
                break;
            default:
                new t(c0840b, "flutter/mousecursor", D0.n.f167b, null).j(new a(4, this));
                break;
        }
    }

    public a(D0.f fVar) {
        this.f50a = 2;
        new t(fVar, "flutter/keyboard", D0.n.f167b, null).j(new Y.e(this));
    }
}
