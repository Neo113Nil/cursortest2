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
import androidx.appcompat.widget.InterfaceC0606a0;
import androidx.appcompat.widget.InterfaceC0629m;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.f1;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.common.internal.C0815k;
import com.google.android.gms.internal.ads.zzbbd;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010b0.C0733d;
import p018c2.C0774u;
import p098n4.C0940m;
import p098n4.RunnableC0936i;
import p146u2.C0955n;
import p155w1.AbstractC0997i0;
import p155w1.C1021o0;
import p155w1.C1046w0;
import p155w1.C1049x0;
import p155w1.C1055z0;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements C0.L, InterfaceC0365v, J2.f, L6.a, p086m.i, p146u2.F, InterfaceC0606a0, p098n4.C, p156w2.k, A5.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
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

    @Override // p086m.i
    public void b(p086m.k kVar) {
        p086m.i iVar = ((ActionMenuView) this.f613b).f8241M;
        if (iVar != null) {
            iVar.b(kVar);
        }
    }

    @Override // J2.f
    public void c(JsonWriter jsonWriter) throws IOException {
        Object obj = J2.g.f3814b;
        jsonWriter.name(Message.JsonKeys.PARAMS).beginObject();
        byte[] bArr = (byte[]) this.f613b;
        int length = bArr.length;
        String strEncodeToString = Base64.encodeToString(bArr, 0);
        if (length < 10000) {
            jsonWriter.name(SentryLogEvent.JsonKeys.BODY).value(strEncodeToString);
        } else {
            String strA = J2.d.a(strEncodeToString, "MD5");
            if (strA != null) {
                jsonWriter.name("bodydigest").value(strA);
            }
        }
        jsonWriter.name("bodylength").value(length);
        jsonWriter.endObject();
    }

    @Override // p086m.i
    public boolean e(p086m.k kVar, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        InterfaceC0629m interfaceC0629m = ((ActionMenuView) this.f613b).f8246R;
        if (interfaceC0629m == null) {
            return false;
        }
        Toolbar toolbar = (Toolbar) ((p096n1.e) interfaceC0629m).f15314b;
        if (toolbar.f8533a0.a()) {
            zOnMenuItemSelected = true;
        } else {
            f1 f1Var = toolbar.c0;
            zOnMenuItemSelected = f1Var != null ? ((p058i.E) ((p145u1.c) f1Var).f16597b).f13616b.f13725a.onMenuItemSelected(0, menuItem) : false;
        }
        return zOnMenuItemSelected;
    }

    @Override // p098n4.C
    public void f(p134s4.h hVar, p098n4.E e7, p098n4.M m7, p098n4.M m8) {
        ((C0940m) this.f613b).q(new RunnableC0936i(this, hVar, m8));
    }

    @Override // p146u2.F
    public void g(p146u2.H h6, long j, long j3) {
        p146u2.N n2 = (p146u2.N) h6;
        p040f2.f fVar = (p040f2.f) this.f613b;
        fVar.getClass();
        long j7 = n2.f16734a;
        Uri uri = n2.f16737d.f16761c;
        C0774u c0774u = new C0774u();
        fVar.f12850n.getClass();
        fVar.f12853q.f(c0774u, n2.f16736c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        g2.c cVar = (g2.c) n2.f16739f;
        g2.c cVar2 = fVar.f12837H;
        int size = cVar2 == null ? 0 : cVar2.f13126m.size();
        long j8 = cVar.b(0).f13149b;
        int i7 = 0;
        while (i7 < size && fVar.f12837H.b(i7).f13149b < j8) {
            i7++;
        }
        if (cVar.f13118d) {
            if (size - i7 > cVar.f13126m.size()) {
                Log.w("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j9 = fVar.f12843N;
                if (j9 == -9223372036854775807L || cVar.f13122h * 1000 > j9) {
                    fVar.f12842M = 0;
                } else {
                    Log.w("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f13122h + ", " + fVar.f12843N);
                }
            }
            int i8 = fVar.f12842M;
            fVar.f12842M = i8 + 1;
            if (i8 < fVar.f12850n.u(n2.f16736c)) {
                fVar.f12833D.postDelayed(fVar.f12858v, Math.min((fVar.f12842M - 1) * zzbbd.zzq.zzf, LoggerBatchProcessor.FLUSH_AFTER_MS));
                return;
            } else {
                fVar.f12832C = new Z4.b();
                return;
            }
        }
        fVar.f12837H = cVar;
        fVar.f12838I = cVar.f13118d & fVar.f12838I;
        fVar.f12839J = j - j3;
        fVar.f12840K = j;
        synchronized (fVar.f12856t) {
            try {
                if (n2.f16735b.f16814a == fVar.f12835F) {
                    Uri uri2 = fVar.f12837H.f13124k;
                    if (uri2 == null) {
                        uri2 = n2.f16737d.f16761c;
                    }
                    fVar.f12835F = uri2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (size != 0) {
            fVar.f12844O += i7;
            fVar.s(true);
            return;
        }
        g2.c cVar3 = fVar.f12837H;
        if (!cVar3.f13118d) {
            fVar.s(true);
            return;
        }
        C0815k c0815k = cVar3.f13123i;
        if (c0815k == null) {
            fVar.r();
            return;
        }
        String str = c0815k.f11317b;
        if (p151v2.t.a(str, "urn:mpeg:dash:utc:direct:2014") || p151v2.t.a(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                fVar.f12841L = p151v2.t.H(c0815k.f11318c) - fVar.f12840K;
                fVar.s(true);
                return;
            } catch (C0045t0 e7) {
                p151v2.a.l("DashMediaSource", "Failed to resolve time offset.", e7);
                fVar.s(true);
                return;
            }
        }
        if (p151v2.t.a(str, "urn:mpeg:dash:utc:http-iso:2014") || p151v2.t.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            p146u2.N n7 = new p146u2.N(fVar.f12862z, Uri.parse(c0815k.f11318c), 5, new p040f2.e());
            fVar.f12830A.f(n7, new p096n1.e(fVar, 12), 1);
            fVar.f12853q.k(new C0774u(n7.f16735b), n7.f16736c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (p151v2.t.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || p151v2.t.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            p146u2.N n8 = new p146u2.N(fVar.f12862z, Uri.parse(c0815k.f11318c), 5, new p036e6.c(17));
            fVar.f12830A.f(n8, new p096n1.e(fVar, 12), 1);
            fVar.f12853q.k(new C0774u(n8.f16735b), n8.f16736c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (p151v2.t.a(str, "urn:mpeg:dash:utc:ntp:2014") || p151v2.t.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
            fVar.r();
        } else {
            p151v2.a.l("DashMediaSource", "Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
            fVar.s(true);
        }
    }

    @Override // p156w2.k
    public void h(R5.F f7) {
        f7.d(((WindowManager) this.f613b).getDefaultDisplay());
    }

    @Override // p146u2.F
    public Q1.e i(p146u2.H h6, IOException iOException, int i7) {
        long jMin;
        p146u2.N n2 = (p146u2.N) h6;
        p040f2.f fVar = (p040f2.f) this.f613b;
        fVar.getClass();
        long j = n2.f16734a;
        Uri uri = n2.f16737d.f16761c;
        C0774u c0774u = new C0774u();
        fVar.f12850n.getClass();
        if (!(iOException instanceof C0045t0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof p146u2.A) && !(iOException instanceof p146u2.J)) {
            int i8 = C0955n.f16799b;
            Throwable cause = iOException;
            while (true) {
                if (cause == null) {
                    jMin = Math.min((i7 - 1) * zzbbd.zzq.zzf, LoggerBatchProcessor.FLUSH_AFTER_MS);
                    break;
                }
                if ((cause instanceof C0955n) && ((C0955n) cause).f16800a == 2008) {
                    jMin = -9223372036854775807L;
                    break;
                }
                cause = cause.getCause();
            }
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        Q1.e eVar = jMin == -9223372036854775807L ? p146u2.K.f16730f : new Q1.e(jMin, 0, false);
        fVar.f12853q.i(c0774u, n2.f16736c, iOException, !eVar.a());
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

    @Override // p146u2.F
    public void l(p146u2.H h6, long j, long j3, boolean z4) {
        p146u2.N n2 = (p146u2.N) h6;
        p040f2.f fVar = (p040f2.f) this.f613b;
        fVar.getClass();
        long j7 = n2.f16734a;
        Uri uri = n2.f16737d.f16761c;
        C0774u c0774u = new C0774u();
        fVar.f12850n.getClass();
        fVar.f12853q.d(c0774u, n2.f16736c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public void m(C1049x0 c1049x0, boolean z4) {
        if (!z4) {
            ((C1046w0) this.f613b).f17913H = false;
        }
        int i7 = c1049x0.f17927b;
        int i8 = 3;
        if (i7 == 1) {
            AbstractC0997i0.o(3, "Fetch succeeded.");
            ((C1046w0) this.f613b).f17914I = true;
            for (C1055z0 c1055z0 : C1055z0.f17946b.values()) {
                ((C1046w0) this.f613b).f17911F.put(c1055z0, new Pair(Boolean.valueOf(((C1046w0) this.f613b).f17911F.containsKey(c1055z0) ? ((Boolean) ((Pair) ((C1046w0) this.f613b).f17911F.get(c1055z0)).first).booleanValue() : false), Boolean.FALSE));
            }
            i8 = 1;
        } else if (i7 == 2) {
            AbstractC0997i0.o(3, "Fetch finished.");
            i8 = 2;
        } else {
            AbstractC0997i0.o(3, "Error occured while fetching: ".concat(String.valueOf(c1049x0)));
        }
        C1046w0 c1046w0 = (C1046w0) this.f613b;
        if (p155w1.L.h(c1046w0.f17915J) <= p155w1.L.h(i8)) {
            c1046w0.f17915J = i8;
        }
        synchronized (c1046w0.f17910E) {
            try {
                for (Map.Entry entry : c1046w0.f17910E.entrySet()) {
                    p145u1.j jVar = (p145u1.j) entry.getKey();
                    Handler handler = (Handler) ((WeakReference) ((Pair) entry.getValue()).second).get();
                    C1021o0 c1021o0 = new C1021o0(c1046w0, i8, jVar, 1);
                    if (handler == null) {
                        c1046w0.f17909D.post(c1021o0);
                    } else {
                        handler.post(c1021o0);
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
            p113p3.f.F("Unsupported combination of changes %s after %s", enumC0172e4, enumC0172e3);
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
    /* JADX WARN: Code duplicated, block: B:96:0x020c  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    @Override // A5.q
    public void onMethodCall(A5.o oVar, A5.r rVar) {
        Bundle bundle;
        int i7 = 0;
        switch (this.f612a) {
            case 24:
                p028d6.k kVar = (p028d6.k) this.f613b;
                if (((io.flutter.plugin.platform.p) kVar.f12448c) == null) {
                    return;
                }
                String str = oVar.f676a;
                str.getClass();
                Object obj = oVar.f677b;
                switch (str) {
                    case "create":
                        Map map = (Map) obj;
                        boolean z4 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                        ByteBuffer byteBufferWrap = map.containsKey(Message.JsonKeys.PARAMS) ? ByteBuffer.wrap((byte[]) map.get(Message.JsonKeys.PARAMS)) : null;
                        try {
                            if (z4) {
                                p174z5.g gVar = new p174z5.g(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 3, byteBufferWrap);
                                io.flutter.plugin.platform.s sVar = (io.flutter.plugin.platform.s) ((io.flutter.plugin.platform.p) kVar.f12448c).f14175b;
                                sVar.getClass();
                                io.flutter.plugin.platform.s.h(19);
                                io.flutter.plugin.platform.s.e(sVar, gVar);
                                sVar.f(gVar, false);
                                io.flutter.plugin.platform.s.h(19);
                                ((A5.p) rVar).success(null);
                                return;
                            }
                            if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                                i7 = 1;
                            }
                            long jD = ((io.flutter.plugin.platform.p) kVar.f12448c).d(new p174z5.g(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey(RRWebVideoEvent.JsonKeys.TOP) ? ((Double) map.get(RRWebVideoEvent.JsonKeys.TOP)).doubleValue() : 0.0d, map.containsKey(RRWebVideoEvent.JsonKeys.LEFT) ? ((Double) map.get(RRWebVideoEvent.JsonKeys.LEFT)).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), i7 != 0 ? 2 : 1, byteBufferWrap));
                            if (jD != -2) {
                                ((A5.p) rVar).success(Long.valueOf(jD));
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
                    case "offset":
                        Map map2 = (Map) obj;
                        try {
                            ((io.flutter.plugin.platform.p) kVar.f12448c).h(((Integer) map2.get("id")).intValue(), ((Double) map2.get(RRWebVideoEvent.JsonKeys.TOP)).doubleValue(), ((Double) map2.get(RRWebVideoEvent.JsonKeys.LEFT)).doubleValue());
                            ((A5.p) rVar).success(null);
                            return;
                        } catch (IllegalStateException e8) {
                            ((A5.p) rVar).error("error", Log.getStackTraceString(e8), null);
                            return;
                        }
                    case "resize":
                        Map map3 = (Map) obj;
                        try {
                            ((io.flutter.plugin.platform.p) kVar.f12448c).l(new p174z5.h(((Integer) map3.get("id")).intValue(), ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue()), new p138t1.a((A5.p) rVar));
                            return;
                        } catch (IllegalStateException e9) {
                            ((A5.p) rVar).error("error", Log.getStackTraceString(e9), null);
                            return;
                        }
                    case "clearFocus":
                        try {
                            ((io.flutter.plugin.platform.p) kVar.f12448c).c(((Integer) obj).intValue());
                            ((A5.p) rVar).success(null);
                            return;
                        } catch (IllegalStateException e10) {
                            ((A5.p) rVar).error("error", Log.getStackTraceString(e10), null);
                            return;
                        }
                    case "synchronizeToNativeViewHierarchy":
                        try {
                            ((io.flutter.plugin.platform.s) ((io.flutter.plugin.platform.p) kVar.f12448c).f14175b).f14207q = ((Boolean) obj).booleanValue();
                            ((A5.p) rVar).success(null);
                            return;
                        } catch (IllegalStateException e11) {
                            ((A5.p) rVar).error("error", Log.getStackTraceString(e11), null);
                            return;
                        }
                    case "touch":
                        List list = (List) obj;
                        try {
                            ((io.flutter.plugin.platform.p) kVar.f12448c).i(new p174z5.i(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                            ((A5.p) rVar).success(null);
                            return;
                        } catch (IllegalStateException e12) {
                            ((A5.p) rVar).error("error", Log.getStackTraceString(e12), null);
                            return;
                        }
                    case "setDirection":
                        Map map4 = (Map) obj;
                        try {
                            ((io.flutter.plugin.platform.p) kVar.f12448c).m(((Integer) map4.get("id")).intValue(), ((Integer) map4.get("direction")).intValue());
                            ((A5.p) rVar).success(null);
                            return;
                        } catch (IllegalStateException e13) {
                            ((A5.p) rVar).error("error", Log.getStackTraceString(e13), null);
                            return;
                        }
                    case "dispose":
                        try {
                            ((io.flutter.plugin.platform.p) kVar.f12448c).f(((Integer) ((Map) obj).get("id")).intValue());
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
                p174z5.s sVar2 = (p174z5.s) this.f613b;
                if (sVar2.f18532b == null) {
                    return;
                }
                String str2 = oVar.f676a;
                str2.getClass();
                Object obj2 = oVar.f677b;
                switch (str2) {
                    case "TextInput.setPlatformViewClient":
                        try {
                            JSONObject jSONObject = (JSONObject) obj2;
                            sVar2.f18532b.setPlatformViewClient(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                            ((A5.p) rVar).success(null);
                            return;
                        } catch (JSONException e15) {
                            ((A5.p) rVar).error("error", e15.getMessage(), null);
                            return;
                        }
                    case "TextInput.setEditingState":
                        try {
                            sVar2.f18532b.setEditingState(p174z5.q.a((JSONObject) obj2));
                            ((A5.p) rVar).success(null);
                            return;
                        } catch (JSONException e16) {
                            ((A5.p) rVar).error("error", e16.getMessage(), null);
                            return;
                        }
                    case "TextInput.setClient":
                        try {
                            JSONArray jSONArray = (JSONArray) obj2;
                            sVar2.f18532b.setClient(jSONArray.getInt(0), p174z5.n.a(jSONArray.getJSONObject(1)));
                            ((A5.p) rVar).success(null);
                            return;
                        } catch (NoSuchFieldException | JSONException e17) {
                            ((A5.p) rVar).error("error", e17.getMessage(), null);
                            return;
                        }
                    case "TextInput.hide":
                        sVar2.f18532b.hide();
                        ((A5.p) rVar).success(null);
                        return;
                    case "TextInput.show":
                        sVar2.f18532b.show();
                        ((A5.p) rVar).success(null);
                        return;
                    case "TextInput.sendAppPrivateCommand":
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
                            sVar2.f18532b.sendAppPrivateCommand(string, bundle);
                            ((A5.p) rVar).success(null);
                            return;
                        } catch (JSONException e18) {
                            ((A5.p) rVar).error("error", e18.getMessage(), null);
                            return;
                        }
                    case "TextInput.setEditableSizeAndTransform":
                        try {
                            JSONObject jSONObject3 = (JSONObject) obj2;
                            double d7 = jSONObject3.getDouble("width");
                            double d8 = jSONObject3.getDouble("height");
                            JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                            double[] dArr = new double[16];
                            while (i7 < 16) {
                                dArr[i7] = jSONArray2.getDouble(i7);
                                i7++;
                            }
                            sVar2.f18532b.setEditableSizeAndTransform(d7, d8, dArr);
                            ((A5.p) rVar).success(null);
                            return;
                        } catch (JSONException e19) {
                            ((A5.p) rVar).error("error", e19.getMessage(), null);
                            return;
                        }
                    case "TextInput.finishAutofillContext":
                        sVar2.f18532b.finishAutofillContext(((Boolean) obj2).booleanValue());
                        ((A5.p) rVar).success(null);
                        return;
                    case "TextInput.clearClient":
                        sVar2.f18532b.clearClient();
                        ((A5.p) rVar).success(null);
                        return;
                    case "TextInput.requestAutofill":
                        sVar2.f18532b.requestAutofill();
                        ((A5.p) rVar).success(null);
                        return;
                    default:
                        ((A5.p) rVar).notImplemented();
                        return;
                }
        }
    }

    public p010b0.i0 p() {
        G6.w wVar = (G6.w) this.f613b;
        wVar.getClass();
        W0 w7 = H6.l.f3444a;
        Object obj = G6.w.f3138e.get(wVar);
        if (obj == w7) {
            obj = null;
        }
        return (p010b0.i0) obj;
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

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    public void s(p010b0.i0 i0Var) {
        G6.w wVar;
        Object obj;
        Object obj2;
        t6.h.e(i0Var, "newState");
        do {
            wVar = (G6.w) this.f613b;
            wVar.getClass();
            obj = H6.l.f3444a;
            obj2 = G6.w.f3138e.get(wVar);
            if (obj2 == obj) {
                obj2 = null;
            }
            p010b0.i0 i0Var2 = (p010b0.i0) obj2;
            if (i0Var2 instanceof p010b0.b0 ? true : t6.h.a(i0Var2, p010b0.j0.f10058b)) {
                i0Var2 = i0Var;
            } else if (i0Var2 instanceof C0733d) {
                if (i0Var.f10053a > i0Var2.f10053a) {
                    i0Var2 = i0Var;
                }
            } else if (!(i0Var2 instanceof p010b0.Z)) {
                throw new W();
            }
            if (obj2 == null) {
                obj2 = obj;
            }
            if (i0Var2 != null) {
                obj = i0Var2;
            }
        } while (!wVar.E(obj2, obj));
    }

    public /* synthetic */ x0(Object obj, int i7) {
        this.f612a = i7;
        this.f613b = obj;
    }

    public x0(A5.f fVar) {
        this.f612a = 23;
        this.f613b = new p155w1.F0(fVar, "flutter/keyevent", A5.l.f674a, (Object) null, 1);
    }

    public x0(EditText editText) {
        this.f612a = 17;
        this.f613b = new p028d6.k(editText);
    }

    public x0(int i7) {
        this.f612a = i7;
        switch (i7) {
            case 3:
                this.f613b = new TreeMap();
                break;
            case 13:
                this.f613b = new G6.w(p010b0.j0.f10058b);
                break;
            default:
                this.f613b = new B3.g();
                break;
        }
    }

    @Override // p156w2.k
    public void a() {
    }

    @Override // p098n4.C
    public void d(p134s4.h hVar) {
    }
}
