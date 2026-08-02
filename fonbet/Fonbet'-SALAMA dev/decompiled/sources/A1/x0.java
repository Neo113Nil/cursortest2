package A1;

import E4.C0173f;
import E4.EnumC0172e;
import F2.W0;
import P.InterfaceC0365v;
import android.media.browse.MediaBrowser;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Log;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.InterfaceC0627a0;
import androidx.appcompat.widget.InterfaceC0650m;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.f1;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.C0756d;
import c2.C0814u;
import com.google.android.gms.common.internal.C0859k;
import com.google.android.gms.internal.ads.zzbbd;
import d6.C0977k;
import e6.C1054c;
import f2.C1073e;
import f2.C1074f;
import i.C1218E;
import io.sentry.SentryLogEvent;
import io.sentry.logger.LoggerBatchProcessor;
import io.sentry.protocol.Message;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.WeakHashMap;
import n1.C1450e;
import n4.C1479m;
import n4.RunnableC1475i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t1.C1604a;
import u2.C1621A;
import u2.C1637n;
import v2.AbstractC1664a;
import w1.AbstractC1706i0;
import w1.C1730o0;
import w1.C1755w0;
import w1.C1758x0;
import w1.C1764z0;
import z5.C1825g;
import z5.C1826h;
import z5.C1827i;

/* loaded from: classes.dex */
public final class x0 implements C0.L, InterfaceC0365v, J2.f, L6.a, m.i, u2.F, InterfaceC0627a0, n4.C, w2.k, A5.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f612a;

    /* renamed from: b, reason: collision with root package name */
    public Object f613b;

    public /* synthetic */ x0(int i7, boolean z4) {
        this.f612a = i7;
    }

    @Override // C0.L
    public int K() {
        C0.u uVar = (C0.u) this.f613b;
        return uVar.f1319f - uVar.t();
    }

    @Override // C0.L
    public View S(int i7) {
        return ((C0.u) this.f613b).o(i7);
    }

    @Override // C0.L
    public int V(View view) {
        C0.v vVar = (C0.v) view.getLayoutParams();
        ((C0.u) this.f613b).getClass();
        return view.getRight() + ((C0.v) view.getLayoutParams()).f1321a.right + ((ViewGroup.MarginLayoutParams) vVar).rightMargin;
    }

    @Override // m.i
    public void b(m.k kVar) {
        m.i iVar = ((ActionMenuView) this.f613b).f8241M;
        if (iVar != null) {
            iVar.b(kVar);
        }
    }

    @Override // J2.f
    public void c(JsonWriter jsonWriter) {
        Object obj = J2.g.f3814b;
        jsonWriter.name(Message.JsonKeys.PARAMS).beginObject();
        byte[] bArr = (byte[]) this.f613b;
        int length = bArr.length;
        String encodeToString = Base64.encodeToString(bArr, 0);
        if (length < 10000) {
            jsonWriter.name(SentryLogEvent.JsonKeys.BODY).value(encodeToString);
        } else {
            String a2 = J2.d.a(encodeToString, "MD5");
            if (a2 != null) {
                jsonWriter.name("bodydigest").value(a2);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    @Override // m.i
    public boolean e(m.k kVar, MenuItem menuItem) {
        boolean onMenuItemSelected;
        InterfaceC0650m interfaceC0650m = ((ActionMenuView) this.f613b).f8246R;
        if (interfaceC0650m == null) {
            return false;
        }
        Toolbar toolbar = (Toolbar) ((C1450e) interfaceC0650m).f15308b;
        if (toolbar.f8533a0.a()) {
            onMenuItemSelected = true;
        } else {
            f1 f1Var = toolbar.c0;
            onMenuItemSelected = f1Var != null ? ((C1218E) ((u1.c) f1Var).f16591b).f13610b.f13719a.onMenuItemSelected(0, menuItem) : false;
        }
        return onMenuItemSelected;
    }

    @Override // n4.C
    public void f(s4.h hVar, n4.E e7, n4.M m7, n4.M m8) {
        ((C1479m) this.f613b).q(new RunnableC1475i(this, hVar, m8));
    }

    @Override // u2.F
    public void g(u2.H h6, long j, long j3) {
        u2.N n2 = (u2.N) h6;
        C1074f c1074f = (C1074f) this.f613b;
        c1074f.getClass();
        long j7 = n2.f16728a;
        Uri uri = n2.f16731d.f16755c;
        C0814u c0814u = new C0814u();
        c1074f.f12844n.getClass();
        c1074f.f12847q.f(c0814u, n2.f16730c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        g2.c cVar = (g2.c) n2.f16733f;
        g2.c cVar2 = c1074f.f12831H;
        int size = cVar2 == null ? 0 : cVar2.f13120m.size();
        long j8 = cVar.b(0).f13143b;
        int i7 = 0;
        while (i7 < size && c1074f.f12831H.b(i7).f13143b < j8) {
            i7++;
        }
        if (cVar.f13112d) {
            if (size - i7 > cVar.f13120m.size()) {
                Log.w("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j9 = c1074f.f12837N;
                if (j9 == -9223372036854775807L || cVar.f13116h * 1000 > j9) {
                    c1074f.f12836M = 0;
                } else {
                    Log.w("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f13116h + ", " + c1074f.f12837N);
                }
            }
            int i8 = c1074f.f12836M;
            c1074f.f12836M = i8 + 1;
            if (i8 < c1074f.f12844n.u(n2.f16730c)) {
                c1074f.f12827D.postDelayed(c1074f.f12852v, Math.min((c1074f.f12836M - 1) * zzbbd.zzq.zzf, LoggerBatchProcessor.FLUSH_AFTER_MS));
                return;
            } else {
                c1074f.f12826C = new Z4.b();
                return;
            }
        }
        c1074f.f12831H = cVar;
        c1074f.f12832I = cVar.f13112d & c1074f.f12832I;
        c1074f.f12833J = j - j3;
        c1074f.f12834K = j;
        synchronized (c1074f.f12850t) {
            try {
                if (n2.f16729b.f16808a == c1074f.f12829F) {
                    Uri uri2 = c1074f.f12831H.f13118k;
                    if (uri2 == null) {
                        uri2 = n2.f16731d.f16755c;
                    }
                    c1074f.f12829F = uri2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (size != 0) {
            c1074f.f12838O += i7;
            c1074f.s(true);
            return;
        }
        g2.c cVar3 = c1074f.f12831H;
        if (!cVar3.f13112d) {
            c1074f.s(true);
            return;
        }
        C0859k c0859k = cVar3.f13117i;
        if (c0859k == null) {
            c1074f.r();
            return;
        }
        String str = c0859k.f11317b;
        if (v2.t.a(str, "urn:mpeg:dash:utc:direct:2014") || v2.t.a(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                c1074f.f12835L = v2.t.H(c0859k.f11318c) - c1074f.f12834K;
                c1074f.s(true);
                return;
            } catch (C0045t0 e7) {
                AbstractC1664a.l("DashMediaSource", "Failed to resolve time offset.", e7);
                c1074f.s(true);
                return;
            }
        }
        if (v2.t.a(str, "urn:mpeg:dash:utc:http-iso:2014") || v2.t.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            u2.N n7 = new u2.N(c1074f.f12856z, Uri.parse(c0859k.f11318c), 5, new C1073e());
            c1074f.f12824A.f(n7, new C1450e(c1074f, 12), 1);
            c1074f.f12847q.k(new C0814u(n7.f16729b), n7.f16730c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (v2.t.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || v2.t.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            u2.N n8 = new u2.N(c1074f.f12856z, Uri.parse(c0859k.f11318c), 5, new C1054c(17));
            c1074f.f12824A.f(n8, new C1450e(c1074f, 12), 1);
            c1074f.f12847q.k(new C0814u(n8.f16729b), n8.f16730c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (v2.t.a(str, "urn:mpeg:dash:utc:ntp:2014") || v2.t.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
            c1074f.r();
        } else {
            AbstractC1664a.l("DashMediaSource", "Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
            c1074f.s(true);
        }
    }

    @Override // w2.k
    public void h(R5.F f7) {
        f7.d(((WindowManager) this.f613b).getDefaultDisplay());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    @Override // u2.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Q1.e i(u2.H h6, IOException iOException, int i7) {
        long j;
        u2.N n2 = (u2.N) h6;
        C1074f c1074f = (C1074f) this.f613b;
        c1074f.getClass();
        long j3 = n2.f16728a;
        Uri uri = n2.f16731d.f16755c;
        C0814u c0814u = new C0814u();
        c1074f.f12844n.getClass();
        if (!(iOException instanceof C0045t0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof C1621A) && !(iOException instanceof u2.J)) {
            int i8 = C1637n.f16793b;
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof C1637n) || ((C1637n) th).f16794a != 2008) {
                }
            }
            j = Math.min((i7 - 1) * zzbbd.zzq.zzf, LoggerBatchProcessor.FLUSH_AFTER_MS);
            Q1.e eVar = j != -9223372036854775807L ? u2.K.f16724f : new Q1.e(j, 0, false);
            c1074f.f12847q.i(c0814u, n2.f16730c, iOException, !eVar.a());
            return eVar;
        }
        j = -9223372036854775807L;
        if (j != -9223372036854775807L) {
        }
        c1074f.f12847q.i(c0814u, n2.f16730c, iOException, !eVar.a());
        return eVar;
    }

    @Override // C0.L
    public int j(View view) {
        C0.v vVar = (C0.v) view.getLayoutParams();
        ((C0.u) this.f613b).getClass();
        return (view.getLeft() - ((C0.v) view.getLayoutParams()).f1321a.left) - ((ViewGroup.MarginLayoutParams) vVar).leftMargin;
    }

    @Override // P.InterfaceC0365v
    public P.q0 k(View view, P.q0 q0Var) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f613b;
        if (!Objects.equals(coordinatorLayout.f9032A, q0Var)) {
            coordinatorLayout.f9032A = q0Var;
            boolean z4 = q0Var.d() > 0;
            coordinatorLayout.f9033B = z4;
            coordinatorLayout.setWillNotDraw(!z4 && coordinatorLayout.getBackground() == null);
            if (!q0Var.f5101a.j()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = coordinatorLayout.getChildAt(i7);
                    WeakHashMap weakHashMap = P.U.f5037a;
                    if (childAt.getFitsSystemWindows()) {
                        ((D.c) childAt.getLayoutParams()).getClass();
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return q0Var;
    }

    @Override // u2.F
    public void l(u2.H h6, long j, long j3, boolean z4) {
        u2.N n2 = (u2.N) h6;
        C1074f c1074f = (C1074f) this.f613b;
        c1074f.getClass();
        long j7 = n2.f16728a;
        Uri uri = n2.f16731d.f16755c;
        C0814u c0814u = new C0814u();
        c1074f.f12844n.getClass();
        c1074f.f12847q.d(c0814u, n2.f16730c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public void m(C1758x0 c1758x0, boolean z4) {
        if (!z4) {
            ((C1755w0) this.f613b).f17907H = false;
        }
        int i7 = c1758x0.f17921b;
        int i8 = 3;
        if (i7 == 1) {
            AbstractC1706i0.o(3, "Fetch succeeded.");
            ((C1755w0) this.f613b).f17908I = true;
            for (C1764z0 c1764z0 : C1764z0.f17940b.values()) {
                ((C1755w0) this.f613b).f17905F.put(c1764z0, new Pair(Boolean.valueOf(((C1755w0) this.f613b).f17905F.containsKey(c1764z0) ? ((Boolean) ((Pair) ((C1755w0) this.f613b).f17905F.get(c1764z0)).first).booleanValue() : false), Boolean.FALSE));
            }
            i8 = 1;
        } else if (i7 == 2) {
            AbstractC1706i0.o(3, "Fetch finished.");
            i8 = 2;
        } else {
            AbstractC1706i0.o(3, "Error occured while fetching: ".concat(String.valueOf(c1758x0)));
        }
        C1755w0 c1755w0 = (C1755w0) this.f613b;
        if (w1.L.h(c1755w0.f17909J) <= w1.L.h(i8)) {
            c1755w0.f17909J = i8;
        }
        synchronized (c1755w0.f17904E) {
            try {
                for (Map.Entry entry : c1755w0.f17904E.entrySet()) {
                    u1.j jVar = (u1.j) entry.getKey();
                    Handler handler = (Handler) ((WeakReference) ((Pair) entry.getValue()).second).get();
                    C1730o0 c1730o0 = new C1730o0(c1755w0, i8, jVar, 1);
                    if (handler == null) {
                        c1755w0.f17903D.post(c1730o0);
                    } else {
                        handler.post(c1730o0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(C0173f c0173f) {
        H4.k kVar = c0173f.f2180b;
        H4.h hVar = kVar.f3323a;
        TreeMap treeMap = (TreeMap) this.f613b;
        C0173f c0173f2 = (C0173f) treeMap.get(hVar);
        if (c0173f2 == null) {
            treeMap.put(hVar, c0173f);
            return;
        }
        EnumC0172e enumC0172e = EnumC0172e.f2175b;
        EnumC0172e enumC0172e2 = EnumC0172e.f2177d;
        EnumC0172e enumC0172e3 = c0173f2.f2179a;
        EnumC0172e enumC0172e4 = c0173f.f2179a;
        if (enumC0172e4 != enumC0172e && enumC0172e3 == enumC0172e2) {
            treeMap.put(hVar, c0173f);
            return;
        }
        EnumC0172e enumC0172e5 = EnumC0172e.f2174a;
        if (enumC0172e4 == enumC0172e2 && enumC0172e3 != enumC0172e5) {
            treeMap.put(hVar, new C0173f(enumC0172e3, kVar));
            return;
        }
        EnumC0172e enumC0172e6 = EnumC0172e.f2176c;
        if (enumC0172e4 == enumC0172e6 && enumC0172e3 == enumC0172e6) {
            treeMap.put(hVar, new C0173f(enumC0172e6, kVar));
            return;
        }
        if (enumC0172e4 == enumC0172e6 && enumC0172e3 == enumC0172e) {
            treeMap.put(hVar, new C0173f(enumC0172e, kVar));
            return;
        }
        if (enumC0172e4 == enumC0172e5 && enumC0172e3 == enumC0172e) {
            treeMap.remove(hVar);
            return;
        }
        if (enumC0172e4 == enumC0172e5 && enumC0172e3 == enumC0172e6) {
            treeMap.put(hVar, new C0173f(enumC0172e5, c0173f2.f2180b));
        } else if (enumC0172e4 == enumC0172e && enumC0172e3 == enumC0172e5) {
            treeMap.put(hVar, new C0173f(enumC0172e6, kVar));
        } else {
            p3.f.F("Unsupported combination of changes %s after %s", enumC0172e4, enumC0172e3);
            throw null;
        }
    }

    public void o(int i7, boolean z4) {
        B3.g gVar = (B3.g) this.f613b;
        if (z4) {
            gVar.c(i7);
        } else {
            gVar.getClass();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // A5.q
    public void onMethodCall(A5.o oVar, A5.r rVar) {
        char c3;
        char c4;
        Bundle bundle;
        int i7 = 0;
        switch (this.f612a) {
            case 24:
                C0977k c0977k = (C0977k) this.f613b;
                if (((io.flutter.plugin.platform.p) c0977k.f12442c) == null) {
                    return;
                }
                String str = oVar.f676a;
                str.getClass();
                Object obj = oVar.f677b;
                switch (str.hashCode()) {
                    case -1352294148:
                        if (str.equals("create")) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -1019779949:
                        if (str.equals("offset")) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -934437708:
                        if (str.equals("resize")) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -756050293:
                        if (str.equals("clearFocus")) {
                            c3 = 3;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -308988850:
                        if (str.equals("synchronizeToNativeViewHierarchy")) {
                            c3 = 4;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 110550847:
                        if (str.equals("touch")) {
                            c3 = 5;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 576796989:
                        if (str.equals("setDirection")) {
                            c3 = 6;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1671767583:
                        if (str.equals("dispose")) {
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
                        Map map = (Map) obj;
                        boolean z4 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                        ByteBuffer wrap = map.containsKey(Message.JsonKeys.PARAMS) ? ByteBuffer.wrap((byte[]) map.get(Message.JsonKeys.PARAMS)) : null;
                        try {
                            if (z4) {
                                C1825g c1825g = new C1825g(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 3, wrap);
                                io.flutter.plugin.platform.s sVar = (io.flutter.plugin.platform.s) ((io.flutter.plugin.platform.p) c0977k.f12442c).f14169b;
                                sVar.getClass();
                                io.flutter.plugin.platform.s.h(19);
                                io.flutter.plugin.platform.s.e(sVar, c1825g);
                                sVar.f(c1825g, false);
                                io.flutter.plugin.platform.s.h(19);
                                ((A5.p) rVar).success(null);
                                return;
                            }
                            if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                                i7 = 1;
                            }
                            long d7 = ((io.flutter.plugin.platform.p) c0977k.f12442c).d(new C1825g(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey(RRWebVideoEvent.JsonKeys.TOP) ? ((Double) map.get(RRWebVideoEvent.JsonKeys.TOP)).doubleValue() : 0.0d, map.containsKey(RRWebVideoEvent.JsonKeys.LEFT) ? ((Double) map.get(RRWebVideoEvent.JsonKeys.LEFT)).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), i7 != 0 ? 2 : 1, wrap));
                            if (d7 != -2) {
                                ((A5.p) rVar).success(Long.valueOf(d7));
                                return;
                            } else {
                                if (i7 == 0) {
                                    throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                                }
                                ((A5.p) rVar).success(null);
                                return;
                            }
                        } catch (IllegalStateException e7) {
                            ((A5.p) rVar).error("error", Log.getStackTraceString(e7), null);
                            return;
                        }
                    case 1:
                        Map map2 = (Map) obj;
                        try {
                            ((io.flutter.plugin.platform.p) c0977k.f12442c).h(((Integer) map2.get("id")).intValue(), ((Double) map2.get(RRWebVideoEvent.JsonKeys.TOP)).doubleValue(), ((Double) map2.get(RRWebVideoEvent.JsonKeys.LEFT)).doubleValue());
                            ((A5.p) rVar).success(null);
                            return;
                        } catch (IllegalStateException e8) {
                            ((A5.p) rVar).error("error", Log.getStackTraceString(e8), null);
                            return;
                        }
                    case 2:
                        Map map3 = (Map) obj;
                        try {
                            ((io.flutter.plugin.platform.p) c0977k.f12442c).l(new C1826h(((Integer) map3.get("id")).intValue(), ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue()), new C1604a((A5.p) rVar));
                            return;
                        } catch (IllegalStateException e9) {
                            ((A5.p) rVar).error("error", Log.getStackTraceString(e9), null);
                            return;
                        }
                    case 3:
                        try {
                            ((io.flutter.plugin.platform.p) c0977k.f12442c).c(((Integer) obj).intValue());
                            ((A5.p) rVar).success(null);
                            return;
                        } catch (IllegalStateException e10) {
                            ((A5.p) rVar).error("error", Log.getStackTraceString(e10), null);
                            return;
                        }
                    case 4:
                        try {
                            ((io.flutter.plugin.platform.s) ((io.flutter.plugin.platform.p) c0977k.f12442c).f14169b).f14201q = ((Boolean) obj).booleanValue();
                            ((A5.p) rVar).success(null);
                            return;
                        } catch (IllegalStateException e11) {
                            ((A5.p) rVar).error("error", Log.getStackTraceString(e11), null);
                            return;
                        }
                    case 5:
                        List list = (List) obj;
                        try {
                            ((io.flutter.plugin.platform.p) c0977k.f12442c).i(new C1827i(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                            ((A5.p) rVar).success(null);
                            return;
                        } catch (IllegalStateException e12) {
                            ((A5.p) rVar).error("error", Log.getStackTraceString(e12), null);
                            return;
                        }
                    case 6:
                        Map map4 = (Map) obj;
                        try {
                            ((io.flutter.plugin.platform.p) c0977k.f12442c).m(((Integer) map4.get("id")).intValue(), ((Integer) map4.get("direction")).intValue());
                            ((A5.p) rVar).success(null);
                            return;
                        } catch (IllegalStateException e13) {
                            ((A5.p) rVar).error("error", Log.getStackTraceString(e13), null);
                            return;
                        }
                    case 7:
                        try {
                            ((io.flutter.plugin.platform.p) c0977k.f12442c).f(((Integer) ((Map) obj).get("id")).intValue());
                            ((A5.p) rVar).success(null);
                            return;
                        } catch (IllegalStateException e14) {
                            ((A5.p) rVar).error("error", Log.getStackTraceString(e14), null);
                            return;
                        }
                    default:
                        ((A5.p) rVar).notImplemented();
                        return;
                }
            default:
                z5.s sVar2 = (z5.s) this.f613b;
                if (sVar2.f18526b == null) {
                    return;
                }
                String str2 = oVar.f676a;
                str2.getClass();
                Object obj2 = oVar.f677b;
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
                            JSONObject jSONObject = (JSONObject) obj2;
                            sVar2.f18526b.setPlatformViewClient(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                            ((A5.p) rVar).success(null);
                            return;
                        } catch (JSONException e15) {
                            ((A5.p) rVar).error("error", e15.getMessage(), null);
                            return;
                        }
                    case 1:
                        try {
                            sVar2.f18526b.setEditingState(z5.q.a((JSONObject) obj2));
                            ((A5.p) rVar).success(null);
                            return;
                        } catch (JSONException e16) {
                            ((A5.p) rVar).error("error", e16.getMessage(), null);
                            return;
                        }
                    case 2:
                        try {
                            JSONArray jSONArray = (JSONArray) obj2;
                            sVar2.f18526b.setClient(jSONArray.getInt(0), z5.n.a(jSONArray.getJSONObject(1)));
                            ((A5.p) rVar).success(null);
                            return;
                        } catch (NoSuchFieldException | JSONException e17) {
                            ((A5.p) rVar).error("error", e17.getMessage(), null);
                            return;
                        }
                    case 3:
                        sVar2.f18526b.hide();
                        ((A5.p) rVar).success(null);
                        return;
                    case 4:
                        sVar2.f18526b.show();
                        ((A5.p) rVar).success(null);
                        return;
                    case 5:
                        try {
                            JSONObject jSONObject2 = (JSONObject) obj2;
                            String string = jSONObject2.getString("action");
                            String string2 = jSONObject2.getString("data");
                            if (string2 == null || string2.isEmpty()) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("data", string2);
                            }
                            sVar2.f18526b.sendAppPrivateCommand(string, bundle);
                            ((A5.p) rVar).success(null);
                            return;
                        } catch (JSONException e18) {
                            ((A5.p) rVar).error("error", e18.getMessage(), null);
                            return;
                        }
                    case 6:
                        try {
                            JSONObject jSONObject3 = (JSONObject) obj2;
                            double d8 = jSONObject3.getDouble("width");
                            double d9 = jSONObject3.getDouble("height");
                            JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                            double[] dArr = new double[16];
                            while (i7 < 16) {
                                dArr[i7] = jSONArray2.getDouble(i7);
                                i7++;
                            }
                            sVar2.f18526b.setEditableSizeAndTransform(d8, d9, dArr);
                            ((A5.p) rVar).success(null);
                            return;
                        } catch (JSONException e19) {
                            ((A5.p) rVar).error("error", e19.getMessage(), null);
                            return;
                        }
                    case 7:
                        sVar2.f18526b.finishAutofillContext(((Boolean) obj2).booleanValue());
                        ((A5.p) rVar).success(null);
                        return;
                    case '\b':
                        sVar2.f18526b.clearClient();
                        ((A5.p) rVar).success(null);
                        return;
                    case '\t':
                        sVar2.f18526b.requestAutofill();
                        ((A5.p) rVar).success(null);
                        return;
                    default:
                        ((A5.p) rVar).notImplemented();
                        return;
                }
        }
    }

    public b0.i0 p() {
        G6.w wVar = (G6.w) this.f613b;
        wVar.getClass();
        W0 w02 = H6.l.f3444a;
        Object obj = G6.w.f3138e.get(wVar);
        if (obj == w02) {
            obj = null;
        }
        return (b0.i0) obj;
    }

    public void q(Object obj) {
        boolean z4 = obj instanceof List;
        ArrayList arrayList = null;
        MediaBrowserService.Result result = (MediaBrowserService.Result) this.f613b;
        if (!z4) {
            if (!(obj instanceof Parcel)) {
                result.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        List<Parcel> list = (List) obj;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            for (Parcel parcel2 : list) {
                parcel2.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                parcel2.recycle();
            }
        }
        result.sendResult(arrayList);
    }

    @Override // C0.L
    public int r() {
        return ((C0.u) this.f613b).s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7.f10053a > r3.f10053a) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void s(b0.i0 i0Var) {
        G6.w wVar;
        Object obj;
        Object obj2;
        t6.h.e(i0Var, "newState");
        do {
            wVar = (G6.w) this.f613b;
            wVar.getClass();
            obj = H6.l.f3444a;
            Object obj3 = G6.w.f3138e.get(wVar);
            obj2 = obj3;
            if (obj3 == obj) {
                obj2 = null;
            }
            b0.i0 i0Var2 = (b0.i0) obj2;
            if (!(i0Var2 instanceof b0.b0 ? true : t6.h.a(i0Var2, b0.j0.f10058b))) {
                if (!(i0Var2 instanceof C0756d)) {
                    if (!(i0Var2 instanceof b0.Z)) {
                        throw new W();
                    }
                }
                if (obj2 == null) {
                    obj2 = obj;
                }
                if (i0Var2 != null) {
                    obj = i0Var2;
                }
            }
            i0Var2 = i0Var;
            if (obj2 == null) {
            }
            if (i0Var2 != null) {
            }
        } while (!wVar.E(obj2, obj));
    }

    public /* synthetic */ x0(Object obj, int i7) {
        this.f612a = i7;
        this.f613b = obj;
    }

    public x0(A5.f fVar) {
        this.f612a = 23;
        this.f613b = new w1.F0(fVar, "flutter/keyevent", A5.l.f674a, (Object) null, 1);
    }

    public x0(EditText editText) {
        this.f612a = 17;
        this.f613b = new C0977k(editText);
    }

    public x0(int i7) {
        this.f612a = i7;
        switch (i7) {
            case 3:
                this.f613b = new TreeMap();
                break;
            case 13:
                this.f613b = new G6.w(b0.j0.f10058b);
                break;
            default:
                this.f613b = new B3.g();
                break;
        }
    }

    @Override // w2.k
    public void a() {
    }

    @Override // n4.C
    public void d(s4.h hVar) {
    }
}
