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
import androidx.appcompat.widget.C0623j;
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
import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.z0;
import com.salamadev.nabilalawadi.kisaskoran.R;
import io.flutter.plugin.platform.p;
import io.sentry.MeasurementUnit;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p058i.v;
import p068j2.f;
import p083l4.s;
import p086m.D;
import p086m.w;
import p098n4.C0940m;
import p098n4.F;
import p155w1.AbstractC0997i0;
import p155w1.C0982e1;
import p155w1.C0986f1;
import p155w1.F0;
import p155w1.L;
import p155w1.M0;
import p155w1.N0;
import p155w1.P2;
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public class c implements d, zzfnd, zzfrv, g, w, p040f2.g, InterfaceC0365v, f, F, M0, q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile c f6062c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6064b;

    public /* synthetic */ c(int i7, boolean z4) {
        this.f6063a = i7;
    }

    public static ArrayList A(W4.g gVar) {
        ArrayList arrayList = new ArrayList();
        for (e eVar : gVar.x()) {
            j jVarY = j.y(eVar.y());
            int i7 = 2;
            if (p136t.e.b(eVar.A(), 2)) {
                i7 = 3;
            } else if (eVar.z().equals(W4.d.ASCENDING)) {
                i7 = 1;
            }
            arrayList.add(new H4.d(i7, jVarY));
        }
        return arrayList;
    }

    public k B(J4.b bVar) {
        int iE = p136t.e.e(bVar.A());
        P2 p5 = (P2) this.f6064b;
        if (iE == 0) {
            J4.d dVarC = bVar.C();
            boolean zB = bVar.B();
            k kVarH = k.h(p5.j(dVarC.y()), P2.n(dVarC.z()));
            if (zB) {
                kVarH.f3328f = 2;
            }
            return kVarH;
        }
        if (iE == 1) {
            C0595s c0595sZ = bVar.z();
            boolean zB2 = bVar.B();
            h hVarJ = p5.j(c0595sZ.A());
            n nVarN = P2.n(c0595sZ.B());
            l lVarE = l.e(c0595sZ.z());
            k kVar = new k(hVarJ);
            kVar.a(nVarN, lVarE);
            if (zB2) {
                kVar.f3328f = 2;
            }
            return kVar;
        }
        if (iE != 2) {
            p113p3.f.F("Unknown MaybeDocument %s", bVar);
            throw null;
        }
        i iVarD = bVar.D();
        h hVarJ2 = p5.j(iVarD.y());
        n nVarN2 = P2.n(iVarD.z());
        k kVar2 = new k(hVarJ2);
        kVar2.f3325c = nVarN2;
        kVar2.f3324b = 4;
        kVar2.f3327e = new l();
        kVar2.f3328f = 2;
        return kVar2;
    }

    public I4.i C(J4.k kVar) {
        int iB = kVar.B();
        z0 z0VarC = kVar.C();
        P2 p5 = (P2) this.f6064b;
        Timestamp timestamp = new Timestamp(z0VarC.z(), z0VarC.y());
        int iA = kVar.A();
        ArrayList arrayList = new ArrayList(iA);
        for (int i7 = 0; i7 < iA; i7++) {
            arrayList.add(p5.k(kVar.z(i7)));
        }
        ArrayList arrayList2 = new ArrayList(kVar.E());
        int i8 = 0;
        while (i8 < kVar.E()) {
            L0 l0D = kVar.D(i8);
            int i9 = i8 + 1;
            if (i9 >= kVar.E() || !kVar.D(i9).K()) {
                arrayList2.add(p5.k(l0D));
            } else {
                p113p3.f.O("TransformMutation should be preceded by a patch or set mutation", kVar.D(i8).L(), new Object[0]);
                J0 j0O = L0.O(l0D);
                for (A a2 : kVar.D(i9).E().w()) {
                    j0O.d();
                    L0.w((L0) j0O.f12096b, a2);
                }
                arrayList2.add(p5.k((L0) j0O.b()));
                i8 = i9;
            }
            i8++;
        }
        return new I4.i(iB, timestamp, arrayList, arrayList2);
    }

    public Z D(J4.g gVar) {
        I iM;
        int iJ = gVar.J();
        n nVarN = P2.n(gVar.I());
        n nVarN2 = P2.n(gVar.E());
        AbstractC0867k abstractC0867kH = gVar.H();
        long jF = gVar.F();
        int iOrdinal = gVar.K().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                p113p3.f.F("Unknown targetType %d", gVar.K());
                throw null;
            }
            y0 y0VarD = gVar.D();
            int iY = y0VarD.y();
            p113p3.f.O("DocumentsTarget contained other than 1 document %d", iY == 1, Integer.valueOf(iY));
            m mVarY = m.y(y0VarD.x());
            p113p3.f.O("Tried to deserialize invalid key %s", P2.E(mVarY), mVarY);
            iM = new C(mVarY.f3312a.size() == 4 ? m.f3331b : P2.z(mVarY), null).i();
        } else {
            A0 a0G = gVar.G();
            iM = P2.m(a0G.y(), a0G.z());
        }
        return new Z(iM, iJ, jF, B.f2875a, nVarN, nVarN2, abstractC0867kH, null);
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

    @Override // p086m.w
    public void a(p086m.k kVar, boolean z4) {
        if (kVar instanceof D) {
            ((D) kVar).f15065R.k().c(false);
        }
        w wVar = ((C0623j) this.f6064b).f8655e;
        if (wVar != null) {
            wVar.a(kVar, z4);
        }
    }

    @Override // p040f2.g
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

    @Override // p068j2.f
    public int d(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // p040f2.g
    public long f(long j, long j3) {
        return 0L;
    }

    @Override // p040f2.g
    public long g(long j, long j3) {
        return -9223372036854775807L;
    }

    @Override // p068j2.f
    public long h(int i7) {
        p151v2.a.f(i7 == 0);
        return 0L;
    }

    @Override // p040f2.g
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
        q0 q0VarB;
        i0 g0Var;
        boolean z7;
        boolean z8;
        int iD = q0Var.d();
        v vVar = (v) this.f6064b;
        vVar.getClass();
        int iD2 = q0Var.d();
        ActionBarContextView actionBarContextView = vVar.f13766M;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z4 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vVar.f13766M.getLayoutParams();
            if (vVar.f13766M.isShown()) {
                if (vVar.f13798t0 == null) {
                    vVar.f13798t0 = new Rect();
                    vVar.f13799u0 = new Rect();
                }
                Rect rect = vVar.f13798t0;
                Rect rect2 = vVar.f13799u0;
                rect.set(q0Var.b(), q0Var.d(), q0Var.c(), q0Var.a());
                ViewGroup viewGroup = vVar.f13771R;
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
                ViewGroup viewGroup2 = vVar.f13771R;
                WeakHashMap weakHashMap = U.f5037a;
                q0 q0VarA = J.a(viewGroup2);
                int iB = q0VarA == null ? 0 : q0VarA.b();
                int iC = q0VarA == null ? 0 : q0VarA.c();
                if (marginLayoutParams.topMargin == i7 && marginLayoutParams.leftMargin == i8 && marginLayoutParams.rightMargin == i9) {
                    z8 = false;
                } else {
                    marginLayoutParams.topMargin = i7;
                    marginLayoutParams.leftMargin = i8;
                    marginLayoutParams.rightMargin = i9;
                    z8 = true;
                }
                Context context = vVar.f13755B;
                if (i7 <= 0 || vVar.f13773T != null) {
                    View view2 = vVar.f13773T;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i10 = marginLayoutParams2.height;
                        int i11 = marginLayoutParams.topMargin;
                        if (i10 != i11 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i11;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            vVar.f13773T.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    vVar.f13773T = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    vVar.f13771R.addView(vVar.f13773T, -1, layoutParams);
                }
                View view4 = vVar.f13773T;
                boolean z9 = view4 != null;
                if (z9 && view4.getVisibility() != 0) {
                    View view5 = vVar.f13773T;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? G.h.getColor(context, R.color.abc_decor_view_status_guard_light) : G.h.getColor(context, R.color.abc_decor_view_status_guard));
                }
                if (!vVar.f13778Y && z9) {
                    iD2 = 0;
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
                vVar.f13766M.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = vVar.f13773T;
        if (view6 != null) {
            view6.setVisibility(z4 ? 0 : 8);
        }
        if (iD != iD2) {
            int iB2 = q0Var.b();
            int iC2 = q0Var.c();
            int iA = q0Var.a();
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30) {
                g0Var = new h0(q0Var);
            } else {
                g0Var = i12 >= 29 ? new g0(q0Var) : new f0(q0Var);
            }
            g0Var.d(I.c.a(iB2, iD2, iC2, iA));
            q0VarB = g0Var.b();
        } else {
            q0VarB = q0Var;
        }
        WeakHashMap weakHashMap2 = U.f5037a;
        WindowInsets windowInsetsF = q0VarB.f();
        if (windowInsetsF == null) {
            return q0VarB;
        }
        WindowInsets windowInsetsB = G.b(view, windowInsetsF);
        return !windowInsetsB.equals(windowInsetsF) ? q0.g(windowInsetsB, view) : q0VarB;
    }

    @Override // p040f2.g
    public long l(long j, long j3) {
        return 0L;
    }

    @Override // p068j2.f
    public List m(long j) {
        return j >= 0 ? (List) this.f6064b : Collections.emptyList();
    }

    @Override // p086m.w
    public boolean n(p086m.k kVar) {
        C0623j c0623j = (C0623j) this.f6064b;
        if (kVar == c0623j.f8653c) {
            return false;
        }
        ((D) kVar).f15066S.getClass();
        c0623j.getClass();
        w wVar = c0623j.f8655e;
        if (wVar != null) {
            return wVar.n(kVar);
        }
        return false;
    }

    @Override // p155w1.M0
    public void o(Object obj, N0 n2) {
        C0982e1 c0982e1 = (C0982e1) this.f6064b;
        String str = (String) obj;
        try {
            int i7 = n2.f17463D;
            if (i7 != 200) {
                AbstractC0997i0.o(5, "Error in getting privacy dashboard url. Error code = ".concat(String.valueOf(i7)));
                Object obj2 = c0982e1.f17699b.f17717z.f3678b;
                Log.d("FlurryFlutterPlugin", "Opening Privacy Dashboard failed.");
            } else {
                JSONObject jSONObject = new JSONObject(str);
                C0986f1.h(new p145u1.c(jSONObject.getString("device_session_id"), jSONObject.getLong("expires_in"), c0982e1.f17699b.f17717z));
                Object obj3 = c0982e1.f17699b.f17717z.f3678b;
                Log.d("FlurryFlutterPlugin", "Privacy Dashboard opened successfully.");
            }
        } catch (JSONException e7) {
            AbstractC0997i0.p(5, "Error in getting privacy dashboard url. ", e7);
            Object obj4 = c0982e1.f17699b.f17717z.f3678b;
            Log.d("FlurryFlutterPlugin", "Opening Privacy Dashboard failed.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00cc  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // A5.q
    public void onMethodCall(o oVar, r rVar) {
        byte b7;
        int i7;
        p174z5.e eVarA;
        ClipDescription primaryClipDescription;
        switch (this.f6063a) {
            case 27:
                ((p174z5.b) this.f6064b).getClass();
                break;
            default:
                p028d6.k kVar = (p028d6.k) this.f6064b;
                if (((p) kVar.f12448c) != null) {
                    String str = oVar.f676a;
                    try {
                        boolean zHasMimeType = false;
                        switch (str.hashCode()) {
                            case -1501580720:
                                if (!str.equals("SystemNavigator.setFrameworkHandlesBack")) {
                                    b7 = -1;
                                } else {
                                    b7 = 9;
                                }
                                break;
                            case -931781241:
                                if (!str.equals("Share.invoke")) {
                                    b7 = -1;
                                } else {
                                    b7 = 14;
                                }
                                break;
                            case -766342101:
                                if (!str.equals("SystemNavigator.pop")) {
                                    b7 = -1;
                                } else {
                                    b7 = 10;
                                }
                                break;
                            case -720677196:
                                if (!str.equals("Clipboard.setData")) {
                                    b7 = -1;
                                } else {
                                    b7 = 12;
                                }
                                break;
                            case -577225884:
                                if (!str.equals("SystemChrome.setSystemUIChangeListener")) {
                                    b7 = -1;
                                } else {
                                    b7 = 6;
                                }
                                break;
                            case -548468504:
                                if (!str.equals("SystemChrome.setApplicationSwitcherDescription")) {
                                    b7 = -1;
                                } else {
                                    b7 = 3;
                                }
                                break;
                            case -247230243:
                                if (!str.equals("HapticFeedback.vibrate")) {
                                    b7 = -1;
                                } else {
                                    b7 = 1;
                                }
                                break;
                            case -215273374:
                                if (!str.equals("SystemSound.play")) {
                                    b7 = -1;
                                } else {
                                    b7 = 0;
                                }
                                break;
                            case 241845679:
                                if (!str.equals("SystemChrome.restoreSystemUIOverlays")) {
                                    b7 = -1;
                                } else {
                                    b7 = 7;
                                }
                                break;
                            case 875995648:
                                if (!str.equals("Clipboard.hasStrings")) {
                                    b7 = -1;
                                } else {
                                    b7 = 13;
                                }
                                break;
                            case 1128339786:
                                if (!str.equals("SystemChrome.setEnabledSystemUIMode")) {
                                    b7 = -1;
                                } else {
                                    b7 = 5;
                                }
                                break;
                            case 1390477857:
                                if (!str.equals("SystemChrome.setSystemUIOverlayStyle")) {
                                    b7 = -1;
                                } else {
                                    b7 = 8;
                                }
                                break;
                            case 1514180520:
                                if (!str.equals("Clipboard.getData")) {
                                    b7 = -1;
                                } else {
                                    b7 = 11;
                                }
                                break;
                            case 1674312266:
                                if (!str.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                                    b7 = -1;
                                } else {
                                    b7 = 4;
                                }
                                break;
                            case 2119655719:
                                if (!str.equals("SystemChrome.setPreferredOrientations")) {
                                    b7 = -1;
                                } else {
                                    b7 = 2;
                                }
                                break;
                            default:
                                b7 = -1;
                                break;
                        }
                        Object obj = oVar.f677b;
                        switch (b7) {
                            case 0:
                                try {
                                    int iC = L.c((String) obj);
                                    O1.k kVar2 = (O1.k) ((p) kVar.f12448c).f14175b;
                                    if (iC == 1) {
                                        ((p121q5.c) kVar2.f4971b).getWindow().getDecorView().playSoundEffect(0);
                                    } else {
                                        kVar2.getClass();
                                    }
                                    ((A5.p) rVar).success(null);
                                } catch (NoSuchFieldException e7) {
                                    ((A5.p) rVar).error("error", e7.getMessage(), null);
                                    return;
                                }
                                break;
                            case 1:
                                try {
                                    ((p) kVar.f12448c).o(L.b((String) obj));
                                    ((A5.p) rVar).success(null);
                                } catch (NoSuchFieldException e8) {
                                    ((A5.p) rVar).error("error", e8.getMessage(), null);
                                    return;
                                }
                                break;
                            case 2:
                                try {
                                    ((p121q5.c) ((O1.k) ((p) kVar.f12448c).f14175b).f4971b).setRequestedOrientation(p028d6.k.i(kVar, (JSONArray) obj));
                                    ((A5.p) rVar).success(null);
                                } catch (NoSuchFieldException | JSONException e9) {
                                    ((A5.p) rVar).error("error", e9.getMessage(), null);
                                    return;
                                }
                                break;
                            case 3:
                                try {
                                    JSONObject jSONObject = (JSONObject) obj;
                                    int i8 = jSONObject.getInt("primaryColor");
                                    if (i8 != 0) {
                                        i8 |= -16777216;
                                    }
                                    String string = jSONObject.getString("label");
                                    p pVar = (p) kVar.f12448c;
                                    int i9 = Build.VERSION.SDK_INT;
                                    p121q5.c cVar = (p121q5.c) ((O1.k) pVar.f14175b).f4971b;
                                    if (i9 < 28) {
                                        cVar.setTaskDescription(new ActivityManager.TaskDescription(string, (Bitmap) null, i8));
                                    } else {
                                        cVar.setTaskDescription(p043f5.b.d(i8, string));
                                    }
                                    ((A5.p) rVar).success(null);
                                } catch (JSONException e10) {
                                    ((A5.p) rVar).error("error", e10.getMessage(), null);
                                    return;
                                }
                                break;
                            case 4:
                                try {
                                    ((p) kVar.f12448c).n(p028d6.k.j(kVar, (JSONArray) obj));
                                    ((A5.p) rVar).success(null);
                                } catch (NoSuchFieldException | JSONException e11) {
                                    ((A5.p) rVar).error("error", e11.getMessage(), null);
                                    return;
                                }
                                break;
                            case 5:
                                try {
                                    int iK = p028d6.k.k(kVar, (String) obj);
                                    O1.k kVar3 = (O1.k) ((p) kVar.f12448c).f14175b;
                                    kVar3.getClass();
                                    if (iK == 1) {
                                        i7 = 1798;
                                    } else if (iK == 2) {
                                        i7 = 3846;
                                    } else if (iK != 3) {
                                        if (iK == 4 && Build.VERSION.SDK_INT >= 29) {
                                            i7 = 1792;
                                        }
                                        ((A5.p) rVar).success(null);
                                    } else {
                                        i7 = 5894;
                                    }
                                    kVar3.f4970a = i7;
                                    kVar3.m();
                                    ((A5.p) rVar).success(null);
                                } catch (NoSuchFieldException | JSONException e12) {
                                    ((A5.p) rVar).error("error", e12.getMessage(), null);
                                    return;
                                }
                                break;
                            case 6:
                                O1.k kVar4 = (O1.k) ((p) kVar.f12448c).f14175b;
                                View decorView = ((p121q5.c) kVar4.f4971b).getWindow().getDecorView();
                                decorView.setOnSystemUiVisibilityChangeListener(new io.flutter.plugin.platform.e(kVar4, decorView));
                                ((A5.p) rVar).success(null);
                                break;
                            case 7:
                                ((O1.k) ((p) kVar.f12448c).f14175b).m();
                                ((A5.p) rVar).success(null);
                                break;
                            case 8:
                                try {
                                    ((O1.k) ((p) kVar.f12448c).f14175b).l(p028d6.k.l(kVar, (JSONObject) obj));
                                    ((A5.p) rVar).success(null);
                                } catch (NoSuchFieldException | JSONException e13) {
                                    ((A5.p) rVar).error("error", e13.getMessage(), null);
                                    return;
                                }
                                break;
                            case 9:
                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                p121q5.c cVar2 = (p121q5.c) ((O1.k) ((p) kVar.f12448c).f14175b).f4973d;
                                if (cVar2 != null) {
                                    cVar2.f(zBooleanValue);
                                }
                                ((A5.p) rVar).success(null);
                                break;
                            case 10:
                                O1.k kVar5 = (O1.k) ((p) kVar.f12448c).f14175b;
                                Object obj2 = kVar5.f4973d;
                                p121q5.c cVar3 = (p121q5.c) kVar5.f4971b;
                                if (cVar3 instanceof androidx.activity.B) {
                                    ((androidx.activity.B) cVar3).getOnBackPressedDispatcher().a();
                                } else {
                                    cVar3.finish();
                                }
                                ((A5.p) rVar).success(null);
                                break;
                            case 11:
                                String str2 = (String) obj;
                                if (str2 != null) {
                                    try {
                                        eVarA = p174z5.e.a(str2);
                                    } catch (NoSuchFieldException unused) {
                                        ((A5.p) rVar).error("error", "No such clipboard content format: ".concat(str2), null);
                                        eVarA = null;
                                    }
                                } else {
                                    eVarA = null;
                                }
                                CharSequence charSequenceG = ((p) kVar.f12448c).g(eVarA);
                                if (charSequenceG == null) {
                                    ((A5.p) rVar).success(null);
                                } else {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("text", charSequenceG);
                                    ((A5.p) rVar).success(jSONObject2);
                                }
                                break;
                            case 12:
                                ((ClipboardManager) ((p121q5.c) ((O1.k) ((p) kVar.f12448c).f14175b).f4971b).getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj).getString("text")));
                                ((A5.p) rVar).success(null);
                                break;
                            case 13:
                                ClipboardManager clipboardManager = (ClipboardManager) ((p121q5.c) ((O1.k) ((p) kVar.f12448c).f14175b).f4971b).getSystemService("clipboard");
                                if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("value", zHasMimeType);
                                ((A5.p) rVar).success(jSONObject3);
                                break;
                            case 14:
                                O1.k kVar6 = (O1.k) ((p) kVar.f12448c).f14175b;
                                kVar6.getClass();
                                Intent intent = new Intent();
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", (String) obj);
                                ((p121q5.c) kVar6.f4971b).startActivity(Intent.createChooser(intent, null));
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

    @Override // p068j2.f
    public int p() {
        return 1;
    }

    @Override // p098n4.F
    public void q(String str) {
        C0940m c0940m = (C0940m) this.f6064b;
        c0940m.f15461i.W(null, "App check token changed, triggering app check token refresh", new Object[0]);
        s sVar = c0940m.f15455c;
        sVar.f15013y.W(null, "App check token refreshed.", new Object[0]);
        sVar.f15007s = str;
        if (sVar.b()) {
            if (str != null) {
                sVar.j(false);
                return;
            }
            Y4.D.v("Must be connected to send unauth.", sVar.b(), new Object[0]);
            Y4.D.v("App check token must not be set.", sVar.f15007s == null, new Object[0]);
            sVar.p("unappcheck", false, Collections.emptyMap(), null);
        }
    }

    @Override // G6.g
    public Object r(G6.h hVar, p065i6.d dVar) {
        switch (this.f6063a) {
            case 9:
                Object objR = ((g) this.f6064b).r(new P5.B(hVar, 0), dVar);
                return objR == j6.a.f14648a ? objR : p044f6.i.f13014a;
            default:
                Object objR2 = ((P2) this.f6064b).r(new P5.B(hVar, 1), dVar);
                return objR2 == j6.a.f14648a ? objR2 : p044f6.i.f13014a;
        }
    }

    @Override // p040f2.g
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

    @Override // p040f2.g
    public long u() {
        return 0L;
    }

    @Override // p040f2.g
    public long v(long j) {
        return 1L;
    }

    @Override // p040f2.g
    public long w(long j, long j3) {
        return 1L;
    }

    public void x(String str) {
        V0 v6 = (V0) this.f6064b;
        C5.b bVar = (C5.b) v6.f17568b;
        C5.a aVar = V0.f17566e;
        Integer numValueOf = Integer.valueOf(zzbbd.zzq.zzf);
        if (aVar == null) {
            C5.a aVar2 = new C5.a();
            aVar2.put("alias", 1010);
            aVar2.put("allScroll", 1013);
            aVar2.put("basic", numValueOf);
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
            V0.f17566e = aVar2;
        }
        bVar.setPointerIcon(PointerIcon.getSystemIcon(((p121q5.m) ((C5.b) v6.f17568b)).getContext(), ((Integer) V0.f17566e.getOrDefault(str, numValueOf)).intValue()));
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

    public c(p078l.k kVar) {
        this.f6063a = 29;
        this.f6064b = new F0(kVar, "flutter/system", A5.l.f674a, (Object) null, 1);
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
                HashMap map = new HashMap();
                map.put("error", String.valueOf(zzfruVar.zza()));
                zzbza.zzf.execute(new H2.q(rVar, "onLMDOverlayFailedToOpen", map, 0));
                break;
        }
    }

    public c(int i7) {
        Handler handler;
        Handler handlerA;
        this.f6063a = i7;
        switch (i7) {
            case 10:
                this.f6064b = new ArrayList();
                return;
            case 14:
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 28) {
                    handlerA = L.g.a(mainLooper);
                } else {
                    try {
                        handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                    } catch (IllegalAccessException e7) {
                        e = e7;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                    } catch (InstantiationException e8) {
                        e = e8;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                    } catch (NoSuchMethodException e9) {
                        e = e9;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
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
                    handlerA = handler;
                    break;
                }
                this.f6064b = handlerA;
                return;
            case 22:
                this.f6064b = new AudioAttributes.Builder();
                return;
            default:
                this.f6064b = new HashSet();
                return;
        }
    }

    @Override // p040f2.g
    public long e(long j, long j3) {
        return j3;
    }
}
