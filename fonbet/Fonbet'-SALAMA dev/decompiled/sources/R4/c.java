package R4;

import A0.d;
import A5.o;
import A5.q;
import A5.r;
import E4.C;
import E4.I;
import F2.C0254t;
import G4.B;
import G4.Z;
import G6.g;
import H4.h;
import H4.j;
import H4.k;
import H4.l;
import H4.m;
import H4.n;
import J4.i;
import P.G;
import P.InterfaceC0365v;
import P.J;
import P.U;
import P.f0;
import P.g0;
import P.h0;
import P.i0;
import P.q0;
import W4.e;
import Y4.A;
import Y4.A0;
import Y4.C0595s;
import Y4.D;
import Y4.J0;
import Y4.L0;
import Y4.y0;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0644j;
import androidx.appcompat.widget.q1;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzfnd;
import com.google.android.gms.internal.ads.zzfru;
import com.google.android.gms.internal.ads.zzfrv;
import com.google.firebase.Timestamp;
import com.google.protobuf.AbstractC0911k;
import com.google.protobuf.z0;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import d6.C0977k;
import f2.InterfaceC1075g;
import f5.AbstractC1102b;
import f6.C1116i;
import i.v;
import i6.InterfaceC1287d;
import io.flutter.plugin.platform.p;
import io.sentry.MeasurementUnit;
import j2.InterfaceC1309f;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import l.C1373k;
import l4.s;
import m.SubMenuC1416D;
import m.w;
import n4.C1479m;
import n4.F;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p3.f;
import q5.AbstractActivityC1559c;
import v2.AbstractC1664a;
import w1.AbstractC1706i0;
import w1.C1691e1;
import w1.C1695f1;
import w1.F0;
import w1.L;
import w1.M0;
import w1.N0;
import w1.P2;
import w1.V0;
import z5.C1820b;
import z5.EnumC1823e;

/* loaded from: classes2.dex */
public class c implements d, zzfnd, zzfrv, g, w, InterfaceC1075g, InterfaceC0365v, InterfaceC1309f, F, M0, q {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c f6062c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6063a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6064b;

    public /* synthetic */ c(int i7, boolean z4) {
        this.f6063a = i7;
    }

    public static ArrayList A(W4.g gVar) {
        ArrayList arrayList = new ArrayList();
        for (e eVar : gVar.x()) {
            j y4 = j.y(eVar.y());
            int i7 = 2;
            if (t.e.b(eVar.A(), 2)) {
                i7 = 3;
            } else if (eVar.z().equals(W4.d.ASCENDING)) {
                i7 = 1;
            }
            arrayList.add(new H4.d(i7, y4));
        }
        return arrayList;
    }

    public k B(J4.b bVar) {
        int e7 = t.e.e(bVar.A());
        P2 p22 = (P2) this.f6064b;
        if (e7 == 0) {
            J4.d C3 = bVar.C();
            boolean B7 = bVar.B();
            k h6 = k.h(p22.j(C3.y()), P2.n(C3.z()));
            if (B7) {
                h6.f3328f = 2;
            }
            return h6;
        }
        if (e7 == 1) {
            C0595s z4 = bVar.z();
            boolean B8 = bVar.B();
            h j = p22.j(z4.A());
            n n2 = P2.n(z4.B());
            l e8 = l.e(z4.z());
            k kVar = new k(j);
            kVar.a(n2, e8);
            if (B8) {
                kVar.f3328f = 2;
            }
            return kVar;
        }
        if (e7 != 2) {
            f.F("Unknown MaybeDocument %s", bVar);
            throw null;
        }
        i D7 = bVar.D();
        h j3 = p22.j(D7.y());
        n n7 = P2.n(D7.z());
        k kVar2 = new k(j3);
        kVar2.f3325c = n7;
        kVar2.f3324b = 4;
        kVar2.f3327e = new l();
        kVar2.f3328f = 2;
        return kVar2;
    }

    public I4.i C(J4.k kVar) {
        int B7 = kVar.B();
        z0 C3 = kVar.C();
        P2 p22 = (P2) this.f6064b;
        Timestamp timestamp = new Timestamp(C3.z(), C3.y());
        int A7 = kVar.A();
        ArrayList arrayList = new ArrayList(A7);
        for (int i7 = 0; i7 < A7; i7++) {
            arrayList.add(p22.k(kVar.z(i7)));
        }
        ArrayList arrayList2 = new ArrayList(kVar.E());
        int i8 = 0;
        while (i8 < kVar.E()) {
            L0 D7 = kVar.D(i8);
            int i9 = i8 + 1;
            if (i9 >= kVar.E() || !kVar.D(i9).K()) {
                arrayList2.add(p22.k(D7));
            } else {
                f.O("TransformMutation should be preceded by a patch or set mutation", kVar.D(i8).L(), new Object[0]);
                J0 O7 = L0.O(D7);
                for (A a2 : kVar.D(i9).E().w()) {
                    O7.d();
                    L0.w((L0) O7.f12096b, a2);
                }
                arrayList2.add(p22.k((L0) O7.b()));
                i8 = i9;
            }
            i8++;
        }
        return new I4.i(B7, timestamp, arrayList, arrayList2);
    }

    public Z D(J4.g gVar) {
        I m7;
        int J5 = gVar.J();
        n n2 = P2.n(gVar.I());
        n n7 = P2.n(gVar.E());
        AbstractC0911k H7 = gVar.H();
        long F7 = gVar.F();
        int ordinal = gVar.K().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                f.F("Unknown targetType %d", gVar.K());
                throw null;
            }
            y0 D7 = gVar.D();
            int y4 = D7.y();
            f.O("DocumentsTarget contained other than 1 document %d", y4 == 1, Integer.valueOf(y4));
            m y5 = m.y(D7.x());
            f.O("Tried to deserialize invalid key %s", P2.E(y5), y5);
            m7 = new C(y5.f3312a.size() == 4 ? m.f3331b : P2.z(y5), null).i();
        } else {
            A0 G2 = gVar.G();
            m7 = P2.m(G2.y(), G2.z());
        }
        return new Z(m7, J5, F7, B.f2875a, n2, n7, H7, null);
    }

    public c E(int i7) {
        if (i7 == 16) {
            i7 = 12;
        }
        ((AudioAttributes.Builder) this.f6064b).setUsage(i7);
        return this;
    }

    public /* bridge */ c F(int i7) {
        return E(i7);
    }

    @Override // m.w
    public void a(m.k kVar, boolean z4) {
        if (kVar instanceof SubMenuC1416D) {
            ((SubMenuC1416D) kVar).f15059R.k().c(false);
        }
        w wVar = ((C0644j) this.f6064b).f8655e;
        if (wVar != null) {
            wVar.a(kVar, z4);
        }
    }

    @Override // f2.InterfaceC1075g
    public long b(long j) {
        return 0L;
    }

    @Override // A0.d
    public void c(int i7, Serializable serializable) {
        String str;
        switch (i7) {
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
        if (i7 == 6 || i7 == 7 || i7 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f6064b).setResultCode(i7);
    }

    @Override // j2.InterfaceC1309f
    public int d(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // f2.InterfaceC1075g
    public long f(long j, long j3) {
        return 0L;
    }

    @Override // f2.InterfaceC1075g
    public long g(long j, long j3) {
        return -9223372036854775807L;
    }

    @Override // j2.InterfaceC1309f
    public long h(int i7) {
        AbstractC1664a.f(i7 == 0);
        return 0L;
    }

    @Override // f2.InterfaceC1075g
    public g2.j i(long j) {
        return (g2.j) this.f6064b;
    }

    @Override // A0.d
    public void j() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // P.InterfaceC0365v
    public q0 k(View view, q0 q0Var) {
        boolean z4;
        q0 q0Var2;
        boolean z7;
        boolean z8;
        int d7 = q0Var.d();
        v vVar = (v) this.f6064b;
        vVar.getClass();
        int d8 = q0Var.d();
        ActionBarContextView actionBarContextView = vVar.f13760M;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z4 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vVar.f13760M.getLayoutParams();
            if (vVar.f13760M.isShown()) {
                if (vVar.f13792t0 == null) {
                    vVar.f13792t0 = new Rect();
                    vVar.f13793u0 = new Rect();
                }
                Rect rect = vVar.f13792t0;
                Rect rect2 = vVar.f13793u0;
                rect.set(q0Var.b(), q0Var.d(), q0Var.c(), q0Var.a());
                ViewGroup viewGroup = vVar.f13765R;
                Method method = q1.f8734a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e7) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e7);
                    }
                }
                int i7 = rect.top;
                int i8 = rect.left;
                int i9 = rect.right;
                ViewGroup viewGroup2 = vVar.f13765R;
                WeakHashMap weakHashMap = U.f5037a;
                q0 a2 = J.a(viewGroup2);
                int b7 = a2 == null ? 0 : a2.b();
                int c3 = a2 == null ? 0 : a2.c();
                if (marginLayoutParams.topMargin == i7 && marginLayoutParams.leftMargin == i8 && marginLayoutParams.rightMargin == i9) {
                    z8 = false;
                } else {
                    marginLayoutParams.topMargin = i7;
                    marginLayoutParams.leftMargin = i8;
                    marginLayoutParams.rightMargin = i9;
                    z8 = true;
                }
                Context context = vVar.f13749B;
                if (i7 <= 0 || vVar.f13767T != null) {
                    View view2 = vVar.f13767T;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i10 = marginLayoutParams2.height;
                        int i11 = marginLayoutParams.topMargin;
                        if (i10 != i11 || marginLayoutParams2.leftMargin != b7 || marginLayoutParams2.rightMargin != c3) {
                            marginLayoutParams2.height = i11;
                            marginLayoutParams2.leftMargin = b7;
                            marginLayoutParams2.rightMargin = c3;
                            vVar.f13767T.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    vVar.f13767T = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b7;
                    layoutParams.rightMargin = c3;
                    vVar.f13765R.addView(vVar.f13767T, -1, layoutParams);
                }
                View view4 = vVar.f13767T;
                boolean z9 = view4 != null;
                if (z9 && view4.getVisibility() != 0) {
                    View view5 = vVar.f13767T;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? G.h.getColor(context, R.color.abc_decor_view_status_guard_light) : G.h.getColor(context, R.color.abc_decor_view_status_guard));
                }
                if (!vVar.f13772Y && z9) {
                    d8 = 0;
                }
                z4 = z9;
                z7 = z8;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z4 = false;
                z7 = true;
            } else {
                z4 = false;
                z7 = false;
            }
            if (z7) {
                vVar.f13760M.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = vVar.f13767T;
        if (view6 != null) {
            view6.setVisibility(z4 ? 0 : 8);
        }
        if (d7 != d8) {
            int b8 = q0Var.b();
            int c4 = q0Var.c();
            int a4 = q0Var.a();
            int i12 = Build.VERSION.SDK_INT;
            i0 h0Var = i12 >= 30 ? new h0(q0Var) : i12 >= 29 ? new g0(q0Var) : new f0(q0Var);
            h0Var.d(I.c.a(b8, d8, c4, a4));
            q0Var2 = h0Var.b();
        } else {
            q0Var2 = q0Var;
        }
        WeakHashMap weakHashMap2 = U.f5037a;
        WindowInsets f7 = q0Var2.f();
        if (f7 == null) {
            return q0Var2;
        }
        WindowInsets b9 = G.b(view, f7);
        return !b9.equals(f7) ? q0.g(b9, view) : q0Var2;
    }

    @Override // f2.InterfaceC1075g
    public long l(long j, long j3) {
        return 0L;
    }

    @Override // j2.InterfaceC1309f
    public List m(long j) {
        return j >= 0 ? (List) this.f6064b : Collections.emptyList();
    }

    @Override // m.w
    public boolean n(m.k kVar) {
        C0644j c0644j = (C0644j) this.f6064b;
        if (kVar == c0644j.f8653c) {
            return false;
        }
        ((SubMenuC1416D) kVar).f15060S.getClass();
        c0644j.getClass();
        w wVar = c0644j.f8655e;
        if (wVar != null) {
            return wVar.n(kVar);
        }
        return false;
    }

    @Override // w1.M0
    public void o(Object obj, N0 n02) {
        C1691e1 c1691e1 = (C1691e1) this.f6064b;
        String str = (String) obj;
        try {
            int i7 = n02.f17457D;
            if (i7 != 200) {
                AbstractC1706i0.o(5, "Error in getting privacy dashboard url. Error code = ".concat(String.valueOf(i7)));
                Object obj2 = c1691e1.f17693b.f17711z.f3678b;
                Log.d("FlurryFlutterPlugin", "Opening Privacy Dashboard failed.");
            } else {
                JSONObject jSONObject = new JSONObject(str);
                C1695f1.h(new u1.c(jSONObject.getString("device_session_id"), jSONObject.getLong("expires_in"), c1691e1.f17693b.f17711z));
                Object obj3 = c1691e1.f17693b.f17711z.f3678b;
                Log.d("FlurryFlutterPlugin", "Privacy Dashboard opened successfully.");
            }
        } catch (JSONException e7) {
            AbstractC1706i0.p(5, "Error in getting privacy dashboard url. ", e7);
            Object obj4 = c1691e1.f17693b.f17711z.f3678b;
            Log.d("FlurryFlutterPlugin", "Opening Privacy Dashboard failed.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0191 A[Catch: JSONException -> 0x0031, TryCatch #7 {JSONException -> 0x0031, blocks: (B:7:0x0018, B:8:0x0021, B:13:0x00d6, B:16:0x00de, B:18:0x0112, B:21:0x0138, B:23:0x012b, B:26:0x0132, B:27:0x014a, B:29:0x0173, B:39:0x0177, B:32:0x0187, B:34:0x0191, B:36:0x01a1, B:41:0x017c, B:42:0x01a9, B:44:0x01bb, B:45:0x01c8, B:47:0x01c5, B:48:0x01d0, B:50:0x01e4, B:51:0x01e7, B:53:0x0217, B:55:0x022a, B:58:0x032f, B:65:0x034f, B:67:0x035f, B:68:0x0372, B:71:0x036f, B:108:0x020b, B:127:0x0288, B:94:0x02ac, B:87:0x02f8, B:101:0x0324, B:62:0x0344, B:73:0x037a, B:129:0x0026, B:132:0x0034, B:135:0x003f, B:138:0x004b, B:141:0x0057, B:144:0x0062, B:147:0x006e, B:150:0x0078, B:153:0x0082, B:156:0x008c, B:159:0x0096, B:162:0x00a0, B:165:0x00ab, B:168:0x00b6, B:171:0x00c1, B:76:0x02b8, B:78:0x02c2, B:79:0x02c5, B:81:0x02dd, B:82:0x02ef, B:85:0x02e6), top: B:6:0x0018, inners: #6, #8, #9, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a1 A[Catch: JSONException -> 0x0031, TryCatch #7 {JSONException -> 0x0031, blocks: (B:7:0x0018, B:8:0x0021, B:13:0x00d6, B:16:0x00de, B:18:0x0112, B:21:0x0138, B:23:0x012b, B:26:0x0132, B:27:0x014a, B:29:0x0173, B:39:0x0177, B:32:0x0187, B:34:0x0191, B:36:0x01a1, B:41:0x017c, B:42:0x01a9, B:44:0x01bb, B:45:0x01c8, B:47:0x01c5, B:48:0x01d0, B:50:0x01e4, B:51:0x01e7, B:53:0x0217, B:55:0x022a, B:58:0x032f, B:65:0x034f, B:67:0x035f, B:68:0x0372, B:71:0x036f, B:108:0x020b, B:127:0x0288, B:94:0x02ac, B:87:0x02f8, B:101:0x0324, B:62:0x0344, B:73:0x037a, B:129:0x0026, B:132:0x0034, B:135:0x003f, B:138:0x004b, B:141:0x0057, B:144:0x0062, B:147:0x006e, B:150:0x0078, B:153:0x0082, B:156:0x008c, B:159:0x0096, B:162:0x00a0, B:165:0x00ab, B:168:0x00b6, B:171:0x00c1, B:76:0x02b8, B:78:0x02c2, B:79:0x02c5, B:81:0x02dd, B:82:0x02ef, B:85:0x02e6), top: B:6:0x0018, inners: #6, #8, #9, #10 }] */
    @Override // A5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMethodCall(o oVar, r rVar) {
        char c3;
        int i7;
        EnumC1823e a2;
        CharSequence g3;
        ClipDescription primaryClipDescription;
        switch (this.f6063a) {
            case 27:
                ((C1820b) this.f6064b).getClass();
                break;
            default:
                C0977k c0977k = (C0977k) this.f6064b;
                if (((p) c0977k.f12442c) != null) {
                    String str = oVar.f676a;
                    try {
                        boolean z4 = false;
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
                        Object obj = oVar.f677b;
                        switch (c3) {
                            case 0:
                                try {
                                    int c4 = L.c((String) obj);
                                    O1.k kVar = (O1.k) ((p) c0977k.f12442c).f14169b;
                                    if (c4 == 1) {
                                        ((AbstractActivityC1559c) kVar.f4971b).getWindow().getDecorView().playSoundEffect(0);
                                    } else {
                                        kVar.getClass();
                                    }
                                    ((A5.p) rVar).success(null);
                                    break;
                                } catch (NoSuchFieldException e7) {
                                    ((A5.p) rVar).error("error", e7.getMessage(), null);
                                    return;
                                }
                            case 1:
                                try {
                                    ((p) c0977k.f12442c).o(L.b((String) obj));
                                    ((A5.p) rVar).success(null);
                                    break;
                                } catch (NoSuchFieldException e8) {
                                    ((A5.p) rVar).error("error", e8.getMessage(), null);
                                    return;
                                }
                            case 2:
                                try {
                                    ((AbstractActivityC1559c) ((O1.k) ((p) c0977k.f12442c).f14169b).f4971b).setRequestedOrientation(C0977k.i(c0977k, (JSONArray) obj));
                                    ((A5.p) rVar).success(null);
                                    break;
                                } catch (NoSuchFieldException | JSONException e9) {
                                    ((A5.p) rVar).error("error", e9.getMessage(), null);
                                    return;
                                }
                            case 3:
                                try {
                                    JSONObject jSONObject = (JSONObject) obj;
                                    int i8 = jSONObject.getInt("primaryColor");
                                    if (i8 != 0) {
                                        i8 |= -16777216;
                                    }
                                    String string = jSONObject.getString("label");
                                    p pVar = (p) c0977k.f12442c;
                                    int i9 = Build.VERSION.SDK_INT;
                                    AbstractActivityC1559c abstractActivityC1559c = (AbstractActivityC1559c) ((O1.k) pVar.f14169b).f4971b;
                                    if (i9 < 28) {
                                        abstractActivityC1559c.setTaskDescription(new ActivityManager.TaskDescription(string, (Bitmap) null, i8));
                                    } else {
                                        abstractActivityC1559c.setTaskDescription(AbstractC1102b.d(i8, string));
                                    }
                                    ((A5.p) rVar).success(null);
                                    break;
                                } catch (JSONException e10) {
                                    ((A5.p) rVar).error("error", e10.getMessage(), null);
                                    return;
                                }
                            case 4:
                                try {
                                    ((p) c0977k.f12442c).n(C0977k.j(c0977k, (JSONArray) obj));
                                    ((A5.p) rVar).success(null);
                                    break;
                                } catch (NoSuchFieldException | JSONException e11) {
                                    ((A5.p) rVar).error("error", e11.getMessage(), null);
                                    return;
                                }
                            case 5:
                                try {
                                    int k7 = C0977k.k(c0977k, (String) obj);
                                    O1.k kVar2 = (O1.k) ((p) c0977k.f12442c).f14169b;
                                    kVar2.getClass();
                                    if (k7 != 1) {
                                        if (k7 != 2) {
                                            if (k7 != 3) {
                                                if (k7 == 4 && Build.VERSION.SDK_INT >= 29) {
                                                    i7 = 1792;
                                                }
                                                ((A5.p) rVar).success(null);
                                                break;
                                            } else {
                                                i7 = 5894;
                                            }
                                        } else {
                                            i7 = 3846;
                                        }
                                    } else {
                                        i7 = 1798;
                                    }
                                    kVar2.f4970a = i7;
                                    kVar2.m();
                                    ((A5.p) rVar).success(null);
                                } catch (NoSuchFieldException | JSONException e12) {
                                    ((A5.p) rVar).error("error", e12.getMessage(), null);
                                    return;
                                }
                                break;
                            case 6:
                                O1.k kVar3 = (O1.k) ((p) c0977k.f12442c).f14169b;
                                View decorView = ((AbstractActivityC1559c) kVar3.f4971b).getWindow().getDecorView();
                                decorView.setOnSystemUiVisibilityChangeListener(new io.flutter.plugin.platform.e(kVar3, decorView));
                                ((A5.p) rVar).success(null);
                                break;
                            case 7:
                                ((O1.k) ((p) c0977k.f12442c).f14169b).m();
                                ((A5.p) rVar).success(null);
                                break;
                            case '\b':
                                try {
                                    ((O1.k) ((p) c0977k.f12442c).f14169b).l(C0977k.l(c0977k, (JSONObject) obj));
                                    ((A5.p) rVar).success(null);
                                    break;
                                } catch (NoSuchFieldException | JSONException e13) {
                                    ((A5.p) rVar).error("error", e13.getMessage(), null);
                                    return;
                                }
                            case '\t':
                                boolean booleanValue = ((Boolean) obj).booleanValue();
                                AbstractActivityC1559c abstractActivityC1559c2 = (AbstractActivityC1559c) ((O1.k) ((p) c0977k.f12442c).f14169b).f4973d;
                                if (abstractActivityC1559c2 != null) {
                                    abstractActivityC1559c2.f(booleanValue);
                                }
                                ((A5.p) rVar).success(null);
                                break;
                            case '\n':
                                O1.k kVar4 = (O1.k) ((p) c0977k.f12442c).f14169b;
                                Object obj2 = kVar4.f4973d;
                                AbstractActivityC1559c abstractActivityC1559c3 = (AbstractActivityC1559c) kVar4.f4971b;
                                if (abstractActivityC1559c3 instanceof androidx.activity.B) {
                                    ((androidx.activity.B) abstractActivityC1559c3).getOnBackPressedDispatcher().a();
                                } else {
                                    abstractActivityC1559c3.finish();
                                }
                                ((A5.p) rVar).success(null);
                                break;
                            case 11:
                                String str2 = (String) obj;
                                if (str2 != null) {
                                    try {
                                        a2 = EnumC1823e.a(str2);
                                    } catch (NoSuchFieldException unused) {
                                        ((A5.p) rVar).error("error", "No such clipboard content format: ".concat(str2), null);
                                    }
                                    g3 = ((p) c0977k.f12442c).g(a2);
                                    if (g3 != null) {
                                        ((A5.p) rVar).success(null);
                                        break;
                                    } else {
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("text", g3);
                                        ((A5.p) rVar).success(jSONObject2);
                                        break;
                                    }
                                }
                                a2 = null;
                                g3 = ((p) c0977k.f12442c).g(a2);
                                if (g3 != null) {
                                }
                            case '\f':
                                ((ClipboardManager) ((AbstractActivityC1559c) ((O1.k) ((p) c0977k.f12442c).f14169b).f4971b).getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj).getString("text")));
                                ((A5.p) rVar).success(null);
                                break;
                            case '\r':
                                ClipboardManager clipboardManager = (ClipboardManager) ((AbstractActivityC1559c) ((O1.k) ((p) c0977k.f12442c).f14169b).f4971b).getSystemService("clipboard");
                                if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                                    z4 = primaryClipDescription.hasMimeType("text/*");
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("value", z4);
                                ((A5.p) rVar).success(jSONObject3);
                                break;
                            case 14:
                                O1.k kVar5 = (O1.k) ((p) c0977k.f12442c).f14169b;
                                kVar5.getClass();
                                Intent intent = new Intent();
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", (String) obj);
                                ((AbstractActivityC1559c) kVar5.f4971b).startActivity(Intent.createChooser(intent, null));
                                ((A5.p) rVar).success(null);
                                break;
                            default:
                                ((A5.p) rVar).notImplemented();
                                break;
                        }
                    } catch (JSONException e14) {
                        ((A5.p) rVar).error("error", "JSON error: " + e14.getMessage(), null);
                    }
                    ((A5.p) rVar).error("error", "JSON error: " + e14.getMessage(), null);
                }
                break;
        }
    }

    @Override // j2.InterfaceC1309f
    public int p() {
        return 1;
    }

    @Override // n4.F
    public void q(String str) {
        C1479m c1479m = (C1479m) this.f6064b;
        c1479m.f15455i.W(null, "App check token changed, triggering app check token refresh", new Object[0]);
        s sVar = c1479m.f15449c;
        sVar.f15007y.W(null, "App check token refreshed.", new Object[0]);
        sVar.f15001s = str;
        if (sVar.b()) {
            if (str != null) {
                sVar.j(false);
                return;
            }
            D.v("Must be connected to send unauth.", sVar.b(), new Object[0]);
            D.v("App check token must not be set.", sVar.f15001s == null, new Object[0]);
            sVar.p("unappcheck", false, Collections.emptyMap(), null);
        }
    }

    @Override // G6.g
    public Object r(G6.h hVar, InterfaceC1287d interfaceC1287d) {
        switch (this.f6063a) {
            case 9:
                Object r7 = ((g) this.f6064b).r(new P5.B(hVar, 0), interfaceC1287d);
                if (r7 != j6.a.f14642a) {
                    break;
                }
                break;
            default:
                Object r8 = ((P2) this.f6064b).r(new P5.B(hVar, 1), interfaceC1287d);
                if (r8 != j6.a.f14642a) {
                    break;
                }
                break;
        }
        return C1116i.f13008a;
    }

    @Override // f2.InterfaceC1075g
    public boolean s() {
        return true;
    }

    public String toString() {
        switch (this.f6063a) {
            case 10:
                return ((ArrayList) this.f6064b).toString();
            default:
                return super.toString();
        }
    }

    @Override // f2.InterfaceC1075g
    public long u() {
        return 0L;
    }

    @Override // f2.InterfaceC1075g
    public long v(long j) {
        return 1L;
    }

    @Override // f2.InterfaceC1075g
    public long w(long j, long j3) {
        return 1L;
    }

    public void x(String str) {
        V0 v02 = (V0) this.f6064b;
        C5.b bVar = (C5.b) v02.f17562b;
        C5.a aVar = V0.f17560e;
        Integer valueOf = Integer.valueOf(zzbbd.zzq.zzf);
        if (aVar == null) {
            C5.a aVar2 = new C5.a();
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
            aVar2.put(MeasurementUnit.NONE, 0);
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
            V0.f17560e = aVar2;
        }
        bVar.setPointerIcon(PointerIcon.getSystemIcon(((q5.m) ((C5.b) v02.f17562b)).getContext(), ((Integer) V0.f17560e.getOrDefault(str, valueOf)).intValue()));
    }

    public void y(Object obj, String str) {
        ((ArrayList) this.f6064b).add(str + "=" + obj);
    }

    public AudioAttributesImpl z() {
        return new AudioAttributesImplApi21(((AudioAttributes.Builder) this.f6064b).build());
    }

    @Override // com.google.android.gms.internal.ads.zzfnd
    public void zza(int i7, long j) {
        ((E2.h) this.f6064b).f1935y.zzd(i7, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfnd
    public void zzb(int i7, long j, String str) {
        ((E2.h) this.f6064b).f1935y.zze(i7, System.currentTimeMillis() - j, str);
    }

    public /* synthetic */ c(Object obj, int i7) {
        this.f6063a = i7;
        this.f6064b = obj;
    }

    public c(C1373k c1373k) {
        this.f6063a = 29;
        this.f6064b = new F0(c1373k, "flutter/system", A5.l.f674a, (Object) null, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzfrv
    public void zza(zzfru zzfruVar) {
        H2.r rVar = (H2.r) this.f6064b;
        rVar.getClass();
        if (!TextUtils.isEmpty(zzfruVar.zzb())) {
            if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlx)).booleanValue()) {
                rVar.f3291b = zzfruVar.zzb();
            }
        }
        switch (zzfruVar.zza()) {
            case 8152:
                zzbza.zzf.execute(new H2.q(rVar, "onLMDOverlayOpened", new HashMap(), 0));
                break;
            case 8153:
                zzbza.zzf.execute(new H2.q(rVar, "onLMDOverlayClicked", new HashMap(), 0));
                break;
            case 8155:
                zzbza.zzf.execute(new H2.q(rVar, "onLMDOverlayClose", new HashMap(), 0));
                break;
            case 8157:
                rVar.f3291b = null;
                rVar.f3292c = null;
                rVar.f3293d = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(zzfruVar.zza()));
                zzbza.zzf.execute(new H2.q(rVar, "onLMDOverlayFailedToOpen", hashMap, 0));
                break;
        }
    }

    public c(int i7) {
        Handler handler;
        Handler handler2;
        this.f6063a = i7;
        switch (i7) {
            case 10:
                this.f6064b = new ArrayList();
                return;
            case 14:
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler2 = L.g.a(mainLooper);
                } else {
                    try {
                        handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                    } catch (IllegalAccessException e7) {
                        e = e7;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f6064b = handler2;
                        return;
                    } catch (InstantiationException e8) {
                        e = e8;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f6064b = handler2;
                        return;
                    } catch (NoSuchMethodException e9) {
                        e = e9;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f6064b = handler2;
                        return;
                    } catch (InvocationTargetException e10) {
                        Throwable cause = e10.getCause();
                        if (!(cause instanceof RuntimeException)) {
                            if (cause instanceof Error) {
                                throw ((Error) cause);
                            }
                            throw new RuntimeException(cause);
                        }
                        throw ((RuntimeException) cause);
                    }
                    handler2 = handler;
                }
                this.f6064b = handler2;
                return;
            case 22:
                this.f6064b = new AudioAttributes.Builder();
                return;
            default:
                this.f6064b = new HashSet();
                return;
        }
    }

    @Override // f2.InterfaceC1075g
    public long e(long j, long j3) {
        return j3;
    }
}
