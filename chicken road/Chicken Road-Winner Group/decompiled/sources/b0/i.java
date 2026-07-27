package b0;

import D.C0009j;
import D.V;
import D.r;
import D.z;
import I1.AbstractActivityC0027d;
import I1.B;
import I1.H;
import I1.I;
import K.C0051t;
import T1.s;
import T1.t;
import U.O;
import U.u;
import U.v;
import Y1.C0077a;
import a0.C0087a;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.window.BackEvent;
import androidx.profileinstaller.ProfileInstallReceiver;
import c.q;
import com.google.android.gms.tasks.Task;
import com.startapp.sdk.internal.E;
import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import i1.C0335e;
import i1.C0341k;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.impl.C0644l9;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.ViewOnSystemUiVisibilityChangeListenerC1049e;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i implements WebMessageListenerBoundaryInterface, C0.b, H, z2.d, T1.d, S.d, T1.m, O, R0.h {

    /* renamed from: c, reason: collision with root package name */
    public static i f2459c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2460a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2461b;

    public /* synthetic */ i(int i3, Object obj) {
        this.f2460a = i3;
        this.f2461b = obj;
    }

    public static HashMap h(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        HashMap hashMap = new HashMap(3);
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        hashMap.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        progress = backEvent.getProgress();
        hashMap.put("progress", Float.valueOf(progress));
        swipeEdge = backEvent.getSwipeEdge();
        hashMap.put("swipeEdge", Integer.valueOf(swipeEdge));
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0183 A[Catch: JSONException -> 0x0029, TryCatch #9 {JSONException -> 0x0029, blocks: (B:5:0x0013, B:6:0x0019, B:11:0x00ce, B:14:0x00d6, B:16:0x0108, B:19:0x012c, B:21:0x011f, B:24:0x0126, B:25:0x013e, B:27:0x0165, B:37:0x0169, B:30:0x0179, B:32:0x0183, B:34:0x0193, B:39:0x016e, B:40:0x019b, B:42:0x01ab, B:43:0x01b8, B:45:0x01b5, B:46:0x01c0, B:48:0x01d2, B:49:0x01d5, B:51:0x0205, B:53:0x0218, B:56:0x02f5, B:77:0x0315, B:79:0x0325, B:80:0x0336, B:83:0x0333, B:113:0x01f9, B:99:0x0252, B:106:0x0276, B:74:0x02c0, B:92:0x02ea, B:60:0x030a, B:85:0x033e, B:115:0x001e, B:118:0x002c, B:121:0x0037, B:124:0x0043, B:127:0x004f, B:130:0x005a, B:133:0x0066, B:136:0x0070, B:139:0x007a, B:142:0x0084, B:145:0x008e, B:148:0x0098, B:151:0x00a3, B:154:0x00ae, B:157:0x00b9, B:63:0x0282, B:65:0x028c, B:66:0x028f, B:68:0x02a5, B:69:0x02b7, B:72:0x02ae), top: B:4:0x0013, inners: #0, #2, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0193 A[Catch: JSONException -> 0x0029, TryCatch #9 {JSONException -> 0x0029, blocks: (B:5:0x0013, B:6:0x0019, B:11:0x00ce, B:14:0x00d6, B:16:0x0108, B:19:0x012c, B:21:0x011f, B:24:0x0126, B:25:0x013e, B:27:0x0165, B:37:0x0169, B:30:0x0179, B:32:0x0183, B:34:0x0193, B:39:0x016e, B:40:0x019b, B:42:0x01ab, B:43:0x01b8, B:45:0x01b5, B:46:0x01c0, B:48:0x01d2, B:49:0x01d5, B:51:0x0205, B:53:0x0218, B:56:0x02f5, B:77:0x0315, B:79:0x0325, B:80:0x0336, B:83:0x0333, B:113:0x01f9, B:99:0x0252, B:106:0x0276, B:74:0x02c0, B:92:0x02ea, B:60:0x030a, B:85:0x033e, B:115:0x001e, B:118:0x002c, B:121:0x0037, B:124:0x0043, B:127:0x004f, B:130:0x005a, B:133:0x0066, B:136:0x0070, B:139:0x007a, B:142:0x0084, B:145:0x008e, B:148:0x0098, B:151:0x00a3, B:154:0x00ae, B:157:0x00b9, B:63:0x0282, B:65:0x028c, B:66:0x028f, B:68:0x02a5, B:69:0x02b7, B:72:0x02ae), top: B:4:0x0013, inners: #0, #2, #3, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void i(T1.l lVar, T1.n nVar) {
        char c3;
        S1.b a3;
        CharSequence h3;
        ClipDescription primaryClipDescription;
        a1.e eVar = (a1.e) this.f2461b;
        if (((io.flutter.plugin.platform.o) eVar.f1789c) == null) {
            return;
        }
        String str = lVar.f1468a;
        try {
            boolean z3 = false;
            switch (str.hashCode()) {
                case -1501580720:
                    if (str.equals("SystemNavigator.setFrameworkHandlesBack")) {
                        c3 = '\t';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -931781241:
                    if (str.equals("Share.invoke")) {
                        c3 = 14;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -766342101:
                    if (str.equals("SystemNavigator.pop")) {
                        c3 = '\n';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -720677196:
                    if (str.equals("Clipboard.setData")) {
                        c3 = '\f';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -577225884:
                    if (str.equals("SystemChrome.setSystemUIChangeListener")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -548468504:
                    if (str.equals("SystemChrome.setApplicationSwitcherDescription")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -247230243:
                    if (str.equals("HapticFeedback.vibrate")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -215273374:
                    if (str.equals("SystemSound.play")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 241845679:
                    if (str.equals("SystemChrome.restoreSystemUIOverlays")) {
                        c3 = 7;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 875995648:
                    if (str.equals("Clipboard.hasStrings")) {
                        c3 = '\r';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1128339786:
                    if (str.equals("SystemChrome.setEnabledSystemUIMode")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1390477857:
                    if (str.equals("SystemChrome.setSystemUIOverlayStyle")) {
                        c3 = '\b';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1514180520:
                    if (str.equals("Clipboard.getData")) {
                        c3 = 11;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1674312266:
                    if (str.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2119655719:
                    if (str.equals("SystemChrome.setPreferredOrientations")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            Object obj = lVar.f1469b;
            switch (c3) {
                case 0:
                    try {
                        int c4 = B0.c.c((String) obj);
                        io.flutter.plugin.platform.f fVar = (io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.o) eVar.f1789c).f9278b;
                        if (c4 == 1) {
                            fVar.f9256a.getWindow().getDecorView().playSoundEffect(0);
                        } else {
                            fVar.getClass();
                        }
                        ((S1.i) nVar).success(null);
                        return;
                    } catch (NoSuchFieldException e3) {
                        ((S1.i) nVar).b("error", e3.getMessage(), null);
                        return;
                    }
                case 1:
                    try {
                        ((io.flutter.plugin.platform.o) eVar.f1789c).p(B0.c.b((String) obj));
                        ((S1.i) nVar).success(null);
                        return;
                    } catch (NoSuchFieldException e4) {
                        ((S1.i) nVar).b("error", e4.getMessage(), null);
                        return;
                    }
                case 2:
                    try {
                        ((io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.o) eVar.f1789c).f9278b).f9256a.setRequestedOrientation(a1.e.q(eVar, (JSONArray) obj));
                        ((S1.i) nVar).success(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e5) {
                        ((S1.i) nVar).b("error", e5.getMessage(), null);
                        return;
                    }
                case 3:
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        int i3 = jSONObject.getInt("primaryColor");
                        if (i3 != 0) {
                            i3 |= -16777216;
                        }
                        String string = jSONObject.getString("label");
                        io.flutter.plugin.platform.o oVar = (io.flutter.plugin.platform.o) eVar.f1789c;
                        int i4 = Build.VERSION.SDK_INT;
                        AbstractActivityC0027d abstractActivityC0027d = ((io.flutter.plugin.platform.f) oVar.f9278b).f9256a;
                        if (i4 < 28) {
                            abstractActivityC0027d.setTaskDescription(new ActivityManager.TaskDescription(string, (Bitmap) null, i3));
                        } else {
                            abstractActivityC0027d.setTaskDescription(E.d(i3, string));
                        }
                        ((S1.i) nVar).success(null);
                        return;
                    } catch (JSONException e6) {
                        ((S1.i) nVar).b("error", e6.getMessage(), null);
                        return;
                    }
                case 4:
                    try {
                        ((io.flutter.plugin.platform.o) eVar.f1789c).k(a1.e.r(eVar, (JSONArray) obj));
                        ((S1.i) nVar).success(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e7) {
                        ((S1.i) nVar).b("error", e7.getMessage(), null);
                        return;
                    }
                case 5:
                    try {
                        ((io.flutter.plugin.platform.o) eVar.f1789c).l(a1.e.s(eVar, (String) obj));
                        ((S1.i) nVar).success(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e8) {
                        ((S1.i) nVar).b("error", e8.getMessage(), null);
                        return;
                    }
                case 6:
                    io.flutter.plugin.platform.f fVar2 = (io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.o) eVar.f1789c).f9278b;
                    View decorView = fVar2.f9256a.getWindow().getDecorView();
                    decorView.setOnSystemUiVisibilityChangeListener(new ViewOnSystemUiVisibilityChangeListenerC1049e(fVar2, decorView));
                    ((S1.i) nVar).success(null);
                    return;
                case 7:
                    ((io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.o) eVar.f1789c).f9278b).b();
                    ((S1.i) nVar).success(null);
                    return;
                case '\b':
                    try {
                        ((io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.o) eVar.f1789c).f9278b).a(a1.e.t(eVar, (JSONObject) obj));
                        ((S1.i) nVar).success(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e9) {
                        ((S1.i) nVar).b("error", e9.getMessage(), null);
                        return;
                    }
                case '\t':
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    AbstractActivityC0027d abstractActivityC0027d2 = ((io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.o) eVar.f1789c).f9278b).f9258c;
                    if (abstractActivityC0027d2 != null) {
                        abstractActivityC0027d2.j(booleanValue);
                    }
                    ((S1.i) nVar).success(null);
                    return;
                case '\n':
                    io.flutter.plugin.platform.f fVar3 = (io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.o) eVar.f1789c).f9278b;
                    AbstractActivityC0027d abstractActivityC0027d3 = fVar3.f9258c;
                    AbstractActivityC0027d abstractActivityC0027d4 = fVar3.f9256a;
                    if (abstractActivityC0027d4 instanceof q) {
                        ((q) abstractActivityC0027d4).a().b();
                    } else {
                        abstractActivityC0027d4.finish();
                    }
                    ((S1.i) nVar).success(null);
                    return;
                case 11:
                    String str2 = (String) obj;
                    if (str2 != null) {
                        try {
                            a3 = S1.b.a(str2);
                        } catch (NoSuchFieldException unused) {
                            ((S1.i) nVar).b("error", "No such clipboard content format: ".concat(str2), null);
                        }
                        h3 = ((io.flutter.plugin.platform.o) eVar.f1789c).h(a3);
                        if (h3 != null) {
                            ((S1.i) nVar).success(null);
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("text", h3);
                        ((S1.i) nVar).success(jSONObject2);
                        return;
                    }
                    a3 = null;
                    h3 = ((io.flutter.plugin.platform.o) eVar.f1789c).h(a3);
                    if (h3 != null) {
                    }
                case '\f':
                    ((ClipboardManager) ((io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.o) eVar.f1789c).f9278b).f9256a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj).getString("text")));
                    ((S1.i) nVar).success(null);
                    return;
                case '\r':
                    ClipboardManager clipboardManager = (ClipboardManager) ((io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.o) eVar.f1789c).f9278b).f9256a.getSystemService("clipboard");
                    if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                        z3 = primaryClipDescription.hasMimeType("text/*");
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("value", z3);
                    ((S1.i) nVar).success(jSONObject3);
                    return;
                case 14:
                    io.flutter.plugin.platform.f fVar4 = (io.flutter.plugin.platform.f) ((io.flutter.plugin.platform.o) eVar.f1789c).f9278b;
                    fVar4.getClass();
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", (String) obj);
                    fVar4.f9256a.startActivity(Intent.createChooser(intent, null));
                    ((S1.i) nVar).success(null);
                    return;
                default:
                    ((S1.i) nVar).a();
                    return;
            }
        } catch (JSONException e10) {
            ((S1.i) nVar).b("error", "JSON error: " + e10.getMessage(), null);
        }
        ((S1.i) nVar).b("error", "JSON error: " + e10.getMessage(), null);
    }

    @Override // S.d
    public void a(int i3, Serializable serializable) {
        String str;
        switch (i3) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i3 == 6 || i3 == 7 || i3 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f2461b).setResultCode(i3);
    }

    @Override // R0.h
    public void accept(Object obj, Object obj2) {
        C0335e c0335e = (C0335e) obj2;
        U0.a aVar = (U0.a) ((U0.d) obj).q();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar.f2473e);
        int i3 = b1.b.f2474a;
        S0.i iVar = (S0.i) this.f2461b;
        if (iVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            iVar.writeToParcel(obtain, 0);
        }
        try {
            aVar.f2472d.transact(1, obtain, null, 1);
            obtain.recycle();
            c0335e.f5011a.e(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    @Override // S.d
    public void b() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // U.O
    public int c() {
        u uVar = (u) this.f2461b;
        return uVar.f1590g - uVar.r();
    }

    @Override // I1.H
    public void d() {
        I i3 = (I) this.f2461b;
        i3.f583a.setAlpha(0.0f);
        io.flutter.embedding.engine.renderer.j jVar = i3.f584b;
        if (jVar != null) {
            jVar.g(i3.f586d);
        }
        i3.f584b = null;
    }

    public void e(String str) {
        V1.b bVar = (V1.b) this.f2461b;
        V1.a aVar = (V1.a) bVar.f1614b;
        B b3 = V1.b.f1612d;
        Integer valueOf = Integer.valueOf(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
        if (b3 == null) {
            B b4 = new B();
            b4.put("alias", 1010);
            b4.put("allScroll", 1013);
            b4.put("basic", valueOf);
            b4.put("cell", 1006);
            b4.put("click", 1002);
            b4.put("contextMenu", 1001);
            b4.put("copy", 1011);
            b4.put("forbidden", 1012);
            b4.put("grab", 1020);
            b4.put("grabbing", 1021);
            b4.put("help", 1003);
            b4.put("move", 1013);
            b4.put("none", 0);
            b4.put("noDrop", 1012);
            b4.put("precise", 1007);
            b4.put("text", 1008);
            b4.put("resizeColumn", 1014);
            b4.put("resizeDown", 1015);
            b4.put("resizeUpLeft", 1016);
            b4.put("resizeDownRight", 1017);
            b4.put("resizeLeft", 1014);
            b4.put("resizeLeftRight", 1014);
            b4.put("resizeRight", 1014);
            b4.put("resizeRow", 1015);
            b4.put("resizeUp", 1015);
            b4.put("resizeUpDown", 1015);
            b4.put("resizeUpLeft", 1017);
            b4.put("resizeUpRight", 1016);
            b4.put("resizeUpLeftDownRight", 1017);
            b4.put("resizeUpRightDownLeft", 1016);
            b4.put("verticalText", 1009);
            b4.put("wait", 1004);
            b4.put("zoomIn", 1018);
            b4.put("zoomOut", 1019);
            V1.b.f1612d = b4;
        }
        aVar.setPointerIcon(PointerIcon.getSystemIcon(((I1.q) ((V1.a) bVar.f1614b)).getContext(), ((Integer) V1.b.f1612d.getOrDefault(str, valueOf)).intValue()));
    }

    @Override // U.O
    public int f(View view) {
        v vVar = (v) view.getLayoutParams();
        ((u) this.f2461b).getClass();
        return (view.getTop() - ((v) view.getLayoutParams()).f1591a.top) - ((ViewGroup.MarginLayoutParams) vVar).topMargin;
    }

    @Override // I1.H
    public void g() {
        I i3 = (I) this.f2461b;
        io.flutter.embedding.engine.renderer.j jVar = i3.f584b;
        if (jVar != null) {
            jVar.a(i3.f586d);
        }
    }

    @Override // c2.a
    public Object get() {
        return this.f2461b;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public Task j(Task task) {
        V1.b bVar = (V1.b) this.f2461b;
        if (task.c() || ((C0341k) task).f5025d) {
            return task;
        }
        Exception a3 = task.a();
        if (!(a3 instanceof Q0.d)) {
            return task;
        }
        int i3 = ((Q0.d) a3).f1158a.f2567a;
        if (i3 == 43001 || i3 == 43002 || i3 == 43003 || i3 == 17) {
            a1.e eVar = (a1.e) bVar.f1615c;
            eVar.getClass();
            C0335e c0335e = new C0335e();
            ((ExecutorService) eVar.f1789c).execute(new A.a(eVar, 5, c0335e));
            return c0335e.f5011a;
        }
        if (i3 == 43000) {
            Exception exc = new Exception("Failed to get app set ID due to an internal error. Please try again later.");
            C0341k c0341k = new C0341k();
            c0341k.d(exc);
            return c0341k;
        }
        if (i3 != 15) {
            return task;
        }
        Exception exc2 = new Exception("The operation to get app set ID timed out. Please try again later.");
        C0341k c0341k2 = new C0341k();
        c0341k2.d(exc2);
        return c0341k2;
    }

    @Override // z2.d
    public Object l(z2.e eVar, InterfaceC0319c interfaceC0319c) {
        Object l3 = ((V1.b) this.f2461b).l(new C0051t(eVar, 0), interfaceC0319c);
        return l3 == EnumC0326a.f4994a ? l3 : C0279i.f4852a;
    }

    @Override // U.O
    public View m(int i3) {
        return ((u) this.f2461b).o(i3);
    }

    @Override // U.O
    public int n() {
        return ((u) this.f2461b).u();
    }

    @Override // T1.d
    public void o(ByteBuffer byteBuffer, K1.g gVar) {
        t.f1476b.getClass();
        t.a(byteBuffer);
        ((K1.b) this.f2461b).getClass();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // T1.m
    public void onMethodCall(T1.l lVar, T1.n nVar) {
        char c3;
        char c4;
        Bundle bundle;
        switch (this.f2460a) {
            case 14:
                a1.e eVar = (a1.e) this.f2461b;
                if (((J1.i) eVar.f1789c) != null) {
                    String str = lVar.f1468a;
                    str.getClass();
                    if (!str.equals("Localization.getStringResource")) {
                        ((S1.i) nVar).a();
                        break;
                    } else {
                        JSONObject jSONObject = (JSONObject) lVar.f1469b;
                        try {
                            ((S1.i) nVar).success(((J1.i) eVar.f1789c).w(jSONObject.getString("key"), jSONObject.has(CommonUrlParts.LOCALE) ? jSONObject.getString(CommonUrlParts.LOCALE) : null));
                            break;
                        } catch (JSONException e3) {
                            ((S1.i) nVar).b("error", e3.getMessage(), null);
                            return;
                        }
                    }
                }
                break;
            case 15:
            default:
                a1.e eVar2 = (a1.e) this.f2461b;
                if (((j) eVar2.f1789c) != null) {
                    String str2 = lVar.f1468a;
                    str2.getClass();
                    Object obj = lVar.f1469b;
                    switch (str2.hashCode()) {
                        case -1779068172:
                            if (str2.equals("TextInput.setPlatformViewClient")) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1015421462:
                            if (str2.equals("TextInput.setEditingState")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -37561188:
                            if (str2.equals("TextInput.setClient")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 270476819:
                            if (str2.equals("TextInput.hide")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 270803918:
                            if (str2.equals("TextInput.show")) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 649192816:
                            if (str2.equals("TextInput.sendAppPrivateCommand")) {
                                c4 = 5;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1204752139:
                            if (str2.equals("TextInput.setEditableSizeAndTransform")) {
                                c4 = 6;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1727570905:
                            if (str2.equals("TextInput.finishAutofillContext")) {
                                c4 = 7;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1904427655:
                            if (str2.equals("TextInput.clearClient")) {
                                c4 = '\b';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 2113369584:
                            if (str2.equals("TextInput.requestAutofill")) {
                                c4 = '\t';
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
                                JSONObject jSONObject2 = (JSONObject) obj;
                                int i3 = jSONObject2.getInt("platformViewId");
                                boolean optBoolean = jSONObject2.optBoolean("usesVirtualDisplay", false);
                                io.flutter.plugin.editing.l lVar2 = (io.flutter.plugin.editing.l) ((j) eVar2.f1789c).f2462a;
                                if (optBoolean) {
                                    View view = lVar2.f9217a;
                                    view.requestFocus();
                                    lVar2.f9221e = new C0009j(3, i3);
                                    lVar2.f9218b.restartInput(view);
                                    lVar2.f9224i = false;
                                } else {
                                    lVar2.getClass();
                                    lVar2.f9221e = new C0009j(4, i3);
                                    lVar2.f9225j = null;
                                }
                                ((S1.i) nVar).success(null);
                                break;
                            } catch (JSONException e4) {
                                ((S1.i) nVar).b("error", e4.getMessage(), null);
                            }
                        case 1:
                            try {
                                ((j) eVar2.f1789c).h(S1.o.a((JSONObject) obj));
                                ((S1.i) nVar).success(null);
                                break;
                            } catch (JSONException e5) {
                                ((S1.i) nVar).b("error", e5.getMessage(), null);
                                return;
                            }
                        case 2:
                            try {
                                JSONArray jSONArray = (JSONArray) obj;
                                ((j) eVar2.f1789c).f(jSONArray.getInt(0), S1.m.a(jSONArray.getJSONObject(1)));
                                ((S1.i) nVar).success(null);
                                break;
                            } catch (NoSuchFieldException | JSONException e6) {
                                ((S1.i) nVar).b("error", e6.getMessage(), null);
                                return;
                            }
                        case 3:
                            io.flutter.plugin.editing.l lVar3 = (io.flutter.plugin.editing.l) ((j) eVar2.f1789c).f2462a;
                            if (lVar3.f9221e.f245b == 4) {
                                lVar3.d();
                            } else {
                                lVar3.d();
                                lVar3.f9218b.hideSoftInputFromWindow(lVar3.f9217a.getApplicationWindowToken(), 0);
                            }
                            ((S1.i) nVar).success(null);
                            break;
                        case 4:
                            io.flutter.plugin.editing.l lVar4 = (io.flutter.plugin.editing.l) ((j) eVar2.f1789c).f2462a;
                            View view2 = lVar4.f9217a;
                            S1.m mVar = lVar4.f;
                            InputMethodManager inputMethodManager = lVar4.f9218b;
                            if (mVar == null || mVar.f1443g.f1450a != 11) {
                                view2.requestFocus();
                                inputMethodManager.showSoftInput(view2, 0);
                            } else {
                                lVar4.d();
                                inputMethodManager.hideSoftInputFromWindow(view2.getApplicationWindowToken(), 0);
                            }
                            ((S1.i) nVar).success(null);
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
                                io.flutter.plugin.editing.l lVar5 = (io.flutter.plugin.editing.l) ((j) eVar2.f1789c).f2462a;
                                lVar5.f9218b.sendAppPrivateCommand(lVar5.f9217a, string, bundle);
                                ((S1.i) nVar).success(null);
                                break;
                            } catch (JSONException e7) {
                                ((S1.i) nVar).b("error", e7.getMessage(), null);
                                return;
                            }
                            break;
                        case 6:
                            try {
                                JSONObject jSONObject4 = (JSONObject) obj;
                                double d3 = jSONObject4.getDouble("width");
                                double d4 = jSONObject4.getDouble("height");
                                JSONArray jSONArray2 = jSONObject4.getJSONArray("transform");
                                double[] dArr = new double[16];
                                for (int i4 = 0; i4 < 16; i4++) {
                                    dArr[i4] = jSONArray2.getDouble(i4);
                                }
                                ((j) eVar2.f1789c).g(d3, d4, dArr);
                                ((S1.i) nVar).success(null);
                                break;
                            } catch (JSONException e8) {
                                ((S1.i) nVar).b("error", e8.getMessage(), null);
                                return;
                            }
                        case 7:
                            j jVar = (j) eVar2.f1789c;
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            if (Build.VERSION.SDK_INT >= 26) {
                                AutofillManager autofillManager = ((io.flutter.plugin.editing.l) jVar.f2462a).f9219c;
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
                            ((S1.i) nVar).success(null);
                            break;
                        case '\b':
                            io.flutter.plugin.editing.l lVar6 = (io.flutter.plugin.editing.l) ((j) eVar2.f1789c).f2462a;
                            if (lVar6.f9221e.f245b != 3) {
                                lVar6.f9223h.e(lVar6);
                                lVar6.d();
                                lVar6.f = null;
                                lVar6.e(null);
                                lVar6.f9221e = new C0009j(1, 0);
                                lVar6.f9228m = null;
                                Field field = z.f259a;
                                View view3 = lVar6.f9217a;
                                V a3 = r.a(view3);
                                if (a3 != null && !a3.f223a.m(8)) {
                                    lVar6.f9218b.restartInput(view3);
                                }
                            }
                            ((S1.i) nVar).success(null);
                            break;
                        case '\t':
                            j jVar2 = (j) eVar2.f1789c;
                            int i5 = Build.VERSION.SDK_INT;
                            io.flutter.plugin.editing.l lVar7 = (io.flutter.plugin.editing.l) jVar2.f2462a;
                            if (i5 < 26) {
                                lVar7.getClass();
                            } else if (lVar7.f9219c != null && lVar7.f9222g != null) {
                                String str3 = (String) lVar7.f.f1446j.f264d;
                                int[] iArr = new int[2];
                                View view4 = lVar7.f9217a;
                                view4.getLocationOnScreen(iArr);
                                Rect rect = new Rect(lVar7.f9228m);
                                rect.offset(iArr[0], iArr[1]);
                                lVar7.f9219c.notifyViewEntered(view4, str3.hashCode(), rect);
                            }
                            ((S1.i) nVar).success(null);
                            break;
                        default:
                            ((S1.i) nVar).a();
                            break;
                    }
                }
                break;
            case 16:
                i(lVar, nVar);
                break;
            case 17:
                a1.e eVar3 = (a1.e) this.f2461b;
                if (((io.flutter.plugin.platform.o) eVar3.f1789c) != null) {
                    String str4 = lVar.f1468a;
                    str4.getClass();
                    Object obj2 = lVar.f1469b;
                    switch (str4.hashCode()) {
                        case -1352294148:
                            if (str4.equals("create")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -756050293:
                            if (str4.equals("clearFocus")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 110550847:
                            if (str4.equals("touch")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 576796989:
                            if (str4.equals("setDirection")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 751366695:
                            if (str4.equals("isSurfaceControlEnabled")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1671767583:
                            if (str4.equals("dispose")) {
                                c3 = 5;
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
                            try {
                                ((io.flutter.plugin.platform.o) eVar3.f1789c).f(new S1.e(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 0, map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null));
                                ((S1.i) nVar).success(null);
                                break;
                            } catch (IllegalStateException e9) {
                                ((S1.i) nVar).b("error", Log.getStackTraceString(e9), null);
                                return;
                            }
                        case 1:
                            try {
                                ((io.flutter.plugin.platform.o) eVar3.f1789c).i(((Integer) obj2).intValue());
                                ((S1.i) nVar).success(null);
                                break;
                            } catch (IllegalStateException e10) {
                                ((S1.i) nVar).b("error", Log.getStackTraceString(e10), null);
                                return;
                            }
                        case 2:
                            List list = (List) obj2;
                            try {
                                ((io.flutter.plugin.platform.o) eVar3.f1789c).j(new S1.f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                                ((S1.i) nVar).success(null);
                                break;
                            } catch (IllegalStateException e11) {
                                ((S1.i) nVar).b("error", Log.getStackTraceString(e11), null);
                                return;
                            }
                        case 3:
                            Map map2 = (Map) obj2;
                            try {
                                ((io.flutter.plugin.platform.o) eVar3.f1789c).e(((Integer) map2.get("id")).intValue(), ((Integer) map2.get("direction")).intValue());
                                ((S1.i) nVar).success(null);
                                break;
                            } catch (IllegalStateException e12) {
                                ((S1.i) nVar).b("error", Log.getStackTraceString(e12), null);
                                return;
                            }
                        case 4:
                            FlutterJNI flutterJNI = ((io.flutter.plugin.platform.q) ((io.flutter.plugin.platform.o) eVar3.f1789c).f9278b).f9288e;
                            ((S1.i) nVar).success(Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                            break;
                        case 5:
                            try {
                                ((io.flutter.plugin.platform.o) eVar3.f1789c).n(((Integer) ((Map) obj2).get("id")).intValue());
                                ((S1.i) nVar).success(null);
                                break;
                            } catch (IllegalStateException e13) {
                                ((S1.i) nVar).b("error", Log.getStackTraceString(e13), null);
                                return;
                            }
                        default:
                            ((S1.i) nVar).a();
                            break;
                    }
                }
                break;
            case 18:
                String str5 = lVar.f1468a;
                str5.getClass();
                S1.j jVar3 = (S1.j) this.f2461b;
                if (str5.equals("get")) {
                    jVar3.f = true;
                    if (jVar3.f1432e || !jVar3.f1428a) {
                        ((S1.i) nVar).success(S1.j.a(jVar3.f1429b));
                        break;
                    } else {
                        jVar3.f1431d = (S1.i) nVar;
                        break;
                    }
                } else if (str5.equals("put")) {
                    jVar3.f1429b = (byte[]) lVar.f1469b;
                    ((S1.i) nVar).success(null);
                    break;
                } else {
                    ((S1.i) nVar).a();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9 A[ORIG_RETURN, RETURN] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z3, InvocationHandler invocationHandler2) {
        C0087a c0087a;
        C0087a c0087a2;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) F2.b.j(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        j[] jVarArr = new j[ports.length];
        for (int i3 = 0; i3 < ports.length; i3++) {
            InvocationHandler invocationHandler3 = ports[i3];
            j jVar = new j();
            jVar.f2462a = (WebMessagePortBoundaryInterface) F2.b.j(WebMessagePortBoundaryInterface.class, invocationHandler3);
            jVarArr[i3] = jVar;
        }
        if (m.f2465a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) F2.b.j(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                c0087a = new C0087a(webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    c0087a2 = null;
                    if (c0087a2 == null) {
                        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) F2.b.j(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        j jVar2 = (j) this.f2461b;
                        int i4 = c0087a2.f1781b;
                        if (i4 != 0) {
                            StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
                            sb.append(i4 != 0 ? i4 != 1 ? "Unknown" : "ArrayBuffer" : "String");
                            sb.append(" expected, but got ");
                            sb.append("String");
                            throw new IllegalStateException(sb.toString());
                        }
                        String str = c0087a2.f1780a;
                        V1.b bVar = (V1.b) jVar2.f2462a;
                        try {
                            JSONObject jSONObject = new JSONObject(str);
                            String string = jSONObject.getString("method");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                            ((C0077a) bVar.f1615c).getClass();
                            C0077a.l(string, jSONObject2);
                            return;
                        } catch (JSONException unused) {
                            return;
                        }
                    }
                    return;
                }
                byte[] asArrayBuffer = webMessagePayloadBoundaryInterface.getAsArrayBuffer();
                c0087a = new C0087a();
                Objects.requireNonNull(asArrayBuffer);
                c0087a.f1780a = null;
                c0087a.f1781b = 1;
            }
        } else {
            c0087a = new C0087a(webMessageBoundaryInterface.getData());
        }
        c0087a2 = c0087a;
        if (c0087a2 == null) {
        }
    }

    @Override // U.O
    public int q(View view) {
        v vVar = (v) view.getLayoutParams();
        ((u) this.f2461b).getClass();
        return view.getBottom() + ((v) view.getLayoutParams()).f1591a.bottom + ((ViewGroup.MarginLayoutParams) vVar).bottomMargin;
    }

    @Override // I1.H
    public void r(io.flutter.embedding.engine.renderer.j jVar) {
        I i3 = (I) this.f2461b;
        io.flutter.embedding.engine.renderer.j jVar2 = i3.f584b;
        if (jVar2 != null) {
            jVar2.g(i3.f586d);
        }
        i3.f584b = jVar;
    }

    public i(boolean z3) {
        this.f2460a = 9;
        this.f2461b = new AtomicBoolean(z3);
    }

    public i(K1.b bVar, int i3) {
        this.f2460a = i3;
        switch (i3) {
            case 15:
                new T1.o(bVar, "flutter/mousecursor", s.f1473b).b(new J1.i(15, this));
                break;
            case 16:
            case 17:
            case 18:
            default:
                P0.j jVar = new P0.j(21);
                T1.o oVar = new T1.o(bVar, "flutter/backgesture", s.f1473b);
                this.f2461b = oVar;
                oVar.b(jVar);
                break;
            case C0644l9.f7759C /* 19 */:
                new T1.o(bVar, "flutter/scribe", T1.j.f1467a).b(new J1.i(19, this));
                break;
            case C0644l9.f7760D /* 20 */:
                new T1.o(bVar, "flutter/sensitivecontent", s.f1473b).b(new J1.i(20, this));
                break;
            case C0644l9.f7761E /* 21 */:
                new T1.o(bVar, "flutter/spellcheck", s.f1473b).b(new J1.i(21, this));
                break;
        }
    }

    public i(T1.f fVar) {
        this.f2460a = 13;
        this.f2461b = new D0.a(fVar, "flutter/keyevent", (T1.k) T1.i.f1466a, (P0.j) null);
    }

    public i(int i3) {
        this.f2460a = i3;
        switch (i3) {
            case 8:
                break;
            default:
                this.f2461b = new HashMap();
                break;
        }
    }
}
