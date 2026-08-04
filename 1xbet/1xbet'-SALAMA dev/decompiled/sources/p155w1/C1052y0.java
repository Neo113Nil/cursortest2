package p155w1;

import A5.o;
import A5.p;
import A5.q;
import A5.s;
import A5.y;
import A5.z;
import B1.m;
import B3.d;
import F2.C0254t;
import G6.g;
import G6.h;
import H6.n;
import I2.J;
import P2.BinderC0386l;
import W5.A0;
import W5.AbstractC0486a1;
import android.content.ClipDescription;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.util.Log;
import android.util.Pair;
import android.view.MenuItem;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.common.api.internal.InterfaceC0797s;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzdqv;
import com.google.android.gms.internal.ads.zzgay;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.internal.p002firebaseauthapi.zzahh;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.functions.Function2;
import p042f4.w;
import p055h3.a;
import p058i.E;
import p058i.r;
import p086m.i;
import p086m.k;
import p098n4.C0934g;
import p120q4.b;
import p120q4.c;
import p135s5.f;
import p174z5.j;

/* JADX INFO: renamed from: w1.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1052y0 implements g, d, zzgay, A0, Continuation, InterfaceC0797s, i, b, q, A5.d, Y0, A5.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C1052y0 f17935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C1052y0 f17936d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17938b;

    public /* synthetic */ C1052y0(int i7, boolean z4) {
        this.f17937a = i7;
    }

    @Override // p120q4.b
    public Object a(C0934g c0934g, Object obj, Object obj2) {
        switch (this.f17937a) {
            case 17:
                Integer num = (Integer) obj2;
                return Integer.valueOf(((c) this.f17938b).y(c0934g) == null ? num.intValue() + 1 : num.intValue());
            case 18:
            default:
                ((ArrayList) this.f17938b).add(new AbstractMap.SimpleImmutableEntry(c0934g, obj));
                return null;
            case 19:
                return !((Boolean) obj).booleanValue() ? ((b) this.f17938b).a(c0934g, null, obj2) : obj2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0797s
    public void accept(Object obj, Object obj2) {
        a aVar = (a) ((p055h3.c) obj).getService();
        Parcel parcelZaa = aVar.zaa();
        zac.zad(parcelZaa, (TelemetryData) this.f17938b);
        aVar.zad(1, parcelZaa);
        ((TaskCompletionSource) obj2).setResult(null);
    }

    @Override // p086m.i
    public void b(k kVar) {
        E e7 = (E) this.f17938b;
        boolean zP = e7.f13615a.f8662a.p();
        r rVar = e7.f13616b;
        if (zP) {
            rVar.onPanelClosed(108, kVar);
        } else if (rVar.onPreparePanel(0, null, kVar)) {
            rVar.onMenuOpened(108, kVar);
        }
    }

    @Override // W5.A0
    public void c() {
        ((AtomicLong) this.f17938b).getAndAdd(1L);
    }

    public HashMap d(C1055z0 c1055z0) {
        C1046w0 c1046w0 = (C1046w0) this.f17938b;
        if (c1046w0.f17916z == null) {
            c1046w0.n();
            c1046w0.f17916z = new p028d6.k(19, c1046w0.f17906A, c1046w0.f17907B);
        }
        p028d6.k kVar = c1046w0.f17916z;
        kVar.getClass();
        HashMap map = new HashMap();
        io.flutter.view.r rVar = (io.flutter.view.r) kVar.f12448c;
        if (c1055z0 == null) {
            Iterator it = ((HashMap) rVar.f14358c).values().iterator();
            while (it.hasNext()) {
                for (Map.Entry entry : ((Map) it.next()).entrySet()) {
                    map.put((String) entry.getKey(), ((C1040u0) entry.getValue()).a());
                }
            }
        } else {
            Map map2 = (Map) ((HashMap) rVar.f14358c).get(c1055z0);
            if (map2 != null) {
                for (Map.Entry entry2 : map2.entrySet()) {
                    map.put((String) entry2.getKey(), ((C1040u0) entry2.getValue()).a());
                }
            }
        }
        return map;
    }

    @Override // p086m.i
    public boolean e(k kVar, MenuItem menuItem) {
        return false;
    }

    public String f(String str, String str2) {
        B5.a aVar = (B5.a) this.f17938b;
        Context contextCreateConfigurationContext = aVar.f1201b;
        if (str2 != null) {
            Locale localeA = B5.a.a(str2);
            Configuration configuration = new Configuration(aVar.f1201b.getResources().getConfiguration());
            configuration.setLocale(localeA);
            contextCreateConfigurationContext = aVar.f1201b.createConfigurationContext(configuration);
        }
        int identifier = contextCreateConfigurationContext.getResources().getIdentifier(str, "string", aVar.f1201b.getPackageName());
        if (identifier != 0) {
            return contextCreateConfigurationContext.getResources().getString(identifier);
        }
        return null;
    }

    @Override // p155w1.Y0
    public Object h(InputStream inputStream) throws Throwable {
        GZIPInputStream gZIPInputStream = null;
        try {
            GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream);
            try {
                Object objH = ((m) this.f17938b).h(gZIPInputStream2);
                AbstractC0997i0.h(gZIPInputStream2);
                return objH;
            } catch (Throwable th) {
                th = th;
                gZIPInputStream = gZIPInputStream2;
                AbstractC0997i0.h(gZIPInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // A5.b
    public void i(Object obj, V0 v6) {
        C1017n0 c1017n0 = (C1017n0) this.f17938b;
        if (((io.flutter.view.a) c1017n0.f17813d) == null) {
            v6.f(null);
            return;
        }
        HashMap map = (HashMap) obj;
        String str = (String) map.get("type");
        HashMap map2 = (HashMap) map.get("data");
        str.getClass();
        switch (str) {
            case "tooltip":
                String str2 = (String) map2.get("message");
                if (str2 != null) {
                    io.flutter.view.a aVar = (io.flutter.view.a) c1017n0.f17813d;
                    if (Build.VERSION.SDK_INT < 28) {
                        io.flutter.view.k kVar = (io.flutter.view.k) aVar.f14230a;
                        AccessibilityEvent accessibilityEventD = kVar.d(0, 32);
                        accessibilityEventD.getText().add(str2);
                        kVar.h(accessibilityEventD);
                    } else {
                        aVar.getClass();
                    }
                    break;
                }
                break;
            case "announce":
                String str3 = (String) map2.get("message");
                if (str3 != null) {
                    io.flutter.view.a aVar2 = (io.flutter.view.a) c1017n0.f17813d;
                    if (Build.VERSION.SDK_INT >= 36) {
                        aVar2.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.k) aVar2.f14230a).f14320a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) map.get("nodeId");
                if (num != null) {
                    io.flutter.view.a aVar3 = (io.flutter.view.a) c1017n0.f17813d;
                    ((io.flutter.view.k) aVar3.f14230a).g(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) map.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.a aVar4 = (io.flutter.view.a) c1017n0.f17813d;
                    ((io.flutter.view.k) aVar4.f14230a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) map.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.a aVar5 = (io.flutter.view.a) c1017n0.f17813d;
                    ((io.flutter.view.k) aVar5.f14230a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        v6.f(null);
    }

    @Override // B3.d
    public void onConsentInfoUpdateFailure(B3.i iVar) {
        ((p) this.f17938b).error(Integer.toString(iVar.f1067a), iVar.f1068b, null);
    }

    @Override // A5.q
    public void onMethodCall(o oVar, A5.r rVar) {
        switch (this.f17937a) {
            case 18:
                if (!"check".equals(oVar.f676a)) {
                    ((p) rVar).notImplemented();
                } else {
                    ((p) rVar).success(((p145u1.c) this.f17938b).h());
                }
                break;
            default:
                j jVar = (j) this.f17938b;
                if (jVar.f18500a != null) {
                    String str = oVar.f676a;
                    str.getClass();
                    switch (str) {
                        case "Scribe.isFeatureAvailable":
                            try {
                                ((p) rVar).success(Boolean.valueOf(jVar.f18500a.isFeatureAvailable()));
                                break;
                            } catch (IllegalStateException e7) {
                                ((p) rVar).error("error", e7.getMessage(), null);
                            }
                            break;
                        case "Scribe.startStylusHandwriting":
                            if (Build.VERSION.SDK_INT >= 33) {
                                try {
                                    jVar.f18500a.startStylusHandwriting();
                                    ((p) rVar).success(null);
                                } catch (IllegalStateException e8) {
                                    ((p) rVar).error("error", e8.getMessage(), null);
                                    return;
                                }
                                break;
                            } else {
                                ((p) rVar).error("error", "Requires API level 33 or higher.", null);
                                break;
                            }
                            break;
                        case "Scribe.isStylusHandwritingAvailable":
                            if (Build.VERSION.SDK_INT >= 34) {
                                try {
                                    ((p) rVar).success(Boolean.valueOf(jVar.f18500a.isStylusHandwritingAvailable()));
                                } catch (IllegalStateException e9) {
                                    ((p) rVar).error("error", e9.getMessage(), null);
                                    return;
                                }
                                break;
                            } else {
                                ((p) rVar).error("error", "Requires API level 34 or higher.", null);
                                break;
                            }
                            break;
                        default:
                            ((p) rVar).notImplemented();
                            break;
                    }
                }
                break;
        }
    }

    @Override // A5.d
    public void p(ByteBuffer byteBuffer, f fVar) {
        z.f691b.getClass();
        z.c(byteBuffer);
        ((p078l.k) this.f17938b).getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v4, types: [k6.i, kotlin.jvm.functions.Function2] */
    @Override // G6.g
    public Object r(h hVar, p065i6.d dVar) throws Throwable {
        G6.a aVar;
        Throwable th;
        n nVar;
        if (dVar instanceof G6.a) {
            aVar = (G6.a) dVar;
            int i7 = aVar.f3069d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                aVar.f3069d = i7 - Integer.MIN_VALUE;
            } else {
                aVar = new G6.a(this, dVar);
            }
        } else {
            aVar = new G6.a(this, dVar);
        }
        Object obj = aVar.f3067b;
        j6.a aVar2 = j6.a.f14648a;
        int i8 = aVar.f3069d;
        p044f6.i iVar = p044f6.i.f13014a;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = aVar.f3066a;
            try {
                p003a.a.p0(obj);
                nVar.releaseIntercepted();
                return iVar;
            } catch (Throwable th2) {
                th = th2;
                nVar.releaseIntercepted();
                throw th;
            }
        }
        p003a.a.p0(obj);
        n nVar2 = new n(hVar, aVar.getContext());
        try {
            aVar.f3066a = nVar2;
            aVar.f3069d = 1;
            Object objInvoke = ((p077k6.i) this.f17938b).invoke(nVar2, aVar);
            if (objInvoke != aVar2) {
                objInvoke = iVar;
            }
            if (objInvoke == aVar2) {
                return aVar2;
            }
            nVar = nVar2;
            nVar.releaseIntercepted();
            return iVar;
        } catch (Throwable th3) {
            th = th3;
            nVar = nVar2;
            nVar.releaseIntercepted();
            throw th;
        }
    }

    @Override // p155w1.Y0
    public void s(Object obj, OutputStream outputStream) throws Throwable {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
            try {
                m mVar = (m) this.f17938b;
                if (obj != null) {
                    mVar.s(obj, gZIPOutputStream2);
                }
                AbstractC0997i0.h(gZIPOutputStream2);
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = gZIPOutputStream2;
                AbstractC0997i0.h(gZIPOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            D.i(exception);
            return Tasks.forException(exception);
        }
        zzahh zzahhVar = (zzahh) task.getResult();
        if (!(zzahhVar instanceof zzahn)) {
            throw new IllegalArgumentException(AbstractC0486a1.h("Response should be an instance of StartTotpMfaEnrollmentResponse but was ", zzahhVar.getClass().getName(), "."));
        }
        zzahn zzahnVar = (zzahn) zzahhVar;
        String strZzf = zzahnVar.zzf();
        D.e(strZzf);
        String strZze = zzahnVar.zze();
        D.e(strZze);
        int iZzc = zzahnVar.zzc();
        int iZzb = zzahnVar.zzb();
        long jZzd = zzahnVar.zzd();
        String strZza = zzahnVar.zza();
        D.e(strZza);
        return Tasks.forResult(new w(strZzf, strZze, iZzc, iZzb, jZzd, strZza, (FirebaseAuth) this.f17938b));
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public void zza(Throwable th) {
        E2.o.f1952C.f1961g.zzw(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        BinderC0386l binderC0386l = (BinderC0386l) this.f17938b;
        zzdqv zzdqvVar = binderC0386l.f5493B;
        Pair pair = new Pair("sgf_reason", th.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        AtomicInteger atomicInteger = binderC0386l.f5511T;
        Q0.a.n0(zzdqvVar, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
        int i7 = J.f3546b;
        J2.j.e("Failed to initialize webview for loading SDKCore. ", th);
        zzbbp zzbbpVar = zzbby.zzjI;
        C0254t c0254t = C0254t.f2723d;
        if (!((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() || binderC0386l.f5510S.get()) {
            return;
        }
        if (atomicInteger.getAndIncrement() < ((Integer) c0254t.f2726c.zzb(zzbby.zzjJ)).intValue()) {
            binderC0386l.u0();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public void zzb(Object obj) {
        int i7 = J.f3546b;
        J2.j.b("Initialized webview successfully for SDKCore.");
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjI)).booleanValue()) {
            BinderC0386l binderC0386l = (BinderC0386l) this.f17938b;
            Q0.a.n0(binderC0386l.f5493B, "sgs", new Pair("se", "query_g"), new Pair("ad_format", "BANNER"), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(binderC0386l.f5511T.get())));
            binderC0386l.f5510S.set(true);
        }
    }

    public /* synthetic */ C1052y0(Object obj, int i7) {
        this.f17937a = i7;
        this.f17938b = obj;
    }

    public C1052y0(p078l.k kVar) {
        this.f17937a = 26;
        new s(kVar, "flutter/mousecursor", y.f688b, null).b(new p174z5.c(this, 0));
    }

    public C1052y0(int i7) {
        this.f17937a = i7;
        switch (i7) {
            case 22:
                this.f17938b = new CopyOnWriteArrayList();
                break;
            default:
                this.f17938b = new AtomicLong();
                break;
        }
    }

    public C1052y0(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f17937a = 9;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f17938b = new U.f(uri, clipDescription, uri2);
        } else {
            this.f17938b = new C1050x1(uri, clipDescription, uri2, 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1052y0(Function2 function2) {
        this.f17937a = 4;
        this.f17938b = (p077k6.i) function2;
    }
}
