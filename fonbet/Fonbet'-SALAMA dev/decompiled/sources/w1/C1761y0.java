package w1;

import F2.C0254t;
import P2.BinderC0386l;
import W5.AbstractC0486a1;
import a.AbstractC0603a;
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
import com.google.android.gms.common.api.internal.InterfaceC0841s;
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
import d6.C0977k;
import f6.C1116i;
import h3.C1197a;
import i.C1218E;
import i6.InterfaceC1287d;
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
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;
import l.C1373k;
import n4.C1473g;
import z5.C1821c;
import z5.C1828j;

/* renamed from: w1.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1761y0 implements G6.g, B3.d, zzgay, W5.A0, Continuation, InterfaceC0841s, m.i, q4.b, A5.q, A5.d, Y0, A5.b {

    /* renamed from: c, reason: collision with root package name */
    public static C1761y0 f17929c;

    /* renamed from: d, reason: collision with root package name */
    public static C1761y0 f17930d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17931a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17932b;

    public /* synthetic */ C1761y0(int i7, boolean z4) {
        this.f17931a = i7;
    }

    @Override // q4.b
    public Object a(C1473g c1473g, Object obj, Object obj2) {
        switch (this.f17931a) {
            case 17:
                Integer num = (Integer) obj2;
                return Integer.valueOf(((q4.c) this.f17932b).y(c1473g) == null ? num.intValue() + 1 : num.intValue());
            case 18:
            default:
                ((ArrayList) this.f17932b).add(new AbstractMap.SimpleImmutableEntry(c1473g, obj));
                return null;
            case 19:
                return !((Boolean) obj).booleanValue() ? ((q4.b) this.f17932b).a(c1473g, null, obj2) : obj2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0841s
    public void accept(Object obj, Object obj2) {
        C1197a c1197a = (C1197a) ((h3.c) obj).getService();
        Parcel zaa = c1197a.zaa();
        zac.zad(zaa, (TelemetryData) this.f17932b);
        c1197a.zad(1, zaa);
        ((TaskCompletionSource) obj2).setResult(null);
    }

    @Override // m.i
    public void b(m.k kVar) {
        C1218E c1218e = (C1218E) this.f17932b;
        boolean p5 = c1218e.f13609a.f8662a.p();
        i.r rVar = c1218e.f13610b;
        if (p5) {
            rVar.onPanelClosed(108, kVar);
        } else if (rVar.onPreparePanel(0, null, kVar)) {
            rVar.onMenuOpened(108, kVar);
        }
    }

    @Override // W5.A0
    public void c() {
        ((AtomicLong) this.f17932b).getAndAdd(1L);
    }

    public HashMap d(C1764z0 c1764z0) {
        C1755w0 c1755w0 = (C1755w0) this.f17932b;
        if (c1755w0.f17910z == null) {
            c1755w0.n();
            c1755w0.f17910z = new C0977k(19, c1755w0.f17900A, c1755w0.f17901B);
        }
        C0977k c0977k = c1755w0.f17910z;
        c0977k.getClass();
        HashMap hashMap = new HashMap();
        io.flutter.view.r rVar = (io.flutter.view.r) c0977k.f12442c;
        if (c1764z0 == null) {
            Iterator it = ((HashMap) rVar.f14352c).values().iterator();
            while (it.hasNext()) {
                for (Map.Entry entry : ((Map) it.next()).entrySet()) {
                    hashMap.put((String) entry.getKey(), ((C1749u0) entry.getValue()).a());
                }
            }
        } else {
            Map map = (Map) ((HashMap) rVar.f14352c).get(c1764z0);
            if (map != null) {
                for (Map.Entry entry2 : map.entrySet()) {
                    hashMap.put((String) entry2.getKey(), ((C1749u0) entry2.getValue()).a());
                }
            }
        }
        return hashMap;
    }

    @Override // m.i
    public boolean e(m.k kVar, MenuItem menuItem) {
        return false;
    }

    public String f(String str, String str2) {
        B5.a aVar = (B5.a) this.f17932b;
        Context context = aVar.f1201b;
        if (str2 != null) {
            Locale a2 = B5.a.a(str2);
            Configuration configuration = new Configuration(aVar.f1201b.getResources().getConfiguration());
            configuration.setLocale(a2);
            context = aVar.f1201b.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", aVar.f1201b.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    @Override // w1.Y0
    public Object h(InputStream inputStream) {
        GZIPInputStream gZIPInputStream = null;
        try {
            GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream);
            try {
                Object h6 = ((B1.m) this.f17932b).h(gZIPInputStream2);
                AbstractC1706i0.h(gZIPInputStream2);
                return h6;
            } catch (Throwable th) {
                th = th;
                gZIPInputStream = gZIPInputStream2;
                AbstractC1706i0.h(gZIPInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // A5.b
    public void i(Object obj, V0 v02) {
        HashMap hashMap;
        HashMap hashMap2;
        C1726n0 c1726n0 = (C1726n0) this.f17932b;
        if (((io.flutter.view.a) c1726n0.f17807d) == null) {
            v02.f(null);
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
                    io.flutter.view.a aVar = (io.flutter.view.a) c1726n0.f17807d;
                    if (Build.VERSION.SDK_INT < 28) {
                        io.flutter.view.k kVar = (io.flutter.view.k) aVar.f14224a;
                        AccessibilityEvent d7 = kVar.d(0, 32);
                        d7.getText().add(str2);
                        kVar.h(d7);
                        break;
                    } else {
                        aVar.getClass();
                        break;
                    }
                }
                break;
            case "announce":
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    io.flutter.view.a aVar2 = (io.flutter.view.a) c1726n0.f17807d;
                    if (Build.VERSION.SDK_INT >= 36) {
                        aVar2.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.k) aVar2.f14224a).f14314a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    io.flutter.view.a aVar3 = (io.flutter.view.a) c1726n0.f17807d;
                    ((io.flutter.view.k) aVar3.f14224a).g(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.a aVar4 = (io.flutter.view.a) c1726n0.f17807d;
                    ((io.flutter.view.k) aVar4.f14224a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.a aVar5 = (io.flutter.view.a) c1726n0.f17807d;
                    ((io.flutter.view.k) aVar5.f14224a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        v02.f(null);
    }

    @Override // B3.d
    public void onConsentInfoUpdateFailure(B3.i iVar) {
        ((A5.p) this.f17932b).error(Integer.toString(iVar.f1067a), iVar.f1068b, null);
    }

    @Override // A5.q
    public void onMethodCall(A5.o oVar, A5.r rVar) {
        switch (this.f17931a) {
            case 18:
                if (!"check".equals(oVar.f676a)) {
                    ((A5.p) rVar).notImplemented();
                    break;
                } else {
                    ((A5.p) rVar).success(((u1.c) this.f17932b).h());
                    break;
                }
            default:
                C1828j c1828j = (C1828j) this.f17932b;
                if (c1828j.f18494a != null) {
                    String str = oVar.f676a;
                    str.getClass();
                    switch (str) {
                        case "Scribe.isFeatureAvailable":
                            try {
                                ((A5.p) rVar).success(Boolean.valueOf(c1828j.f18494a.isFeatureAvailable()));
                                break;
                            } catch (IllegalStateException e7) {
                                ((A5.p) rVar).error("error", e7.getMessage(), null);
                            }
                        case "Scribe.startStylusHandwriting":
                            if (Build.VERSION.SDK_INT < 33) {
                                ((A5.p) rVar).error("error", "Requires API level 33 or higher.", null);
                                break;
                            } else {
                                try {
                                    c1828j.f18494a.startStylusHandwriting();
                                    ((A5.p) rVar).success(null);
                                    break;
                                } catch (IllegalStateException e8) {
                                    ((A5.p) rVar).error("error", e8.getMessage(), null);
                                    return;
                                }
                            }
                        case "Scribe.isStylusHandwritingAvailable":
                            if (Build.VERSION.SDK_INT < 34) {
                                ((A5.p) rVar).error("error", "Requires API level 34 or higher.", null);
                                break;
                            } else {
                                try {
                                    ((A5.p) rVar).success(Boolean.valueOf(c1828j.f18494a.isStylusHandwritingAvailable()));
                                    break;
                                } catch (IllegalStateException e9) {
                                    ((A5.p) rVar).error("error", e9.getMessage(), null);
                                    return;
                                }
                            }
                        default:
                            ((A5.p) rVar).notImplemented();
                            break;
                    }
                }
                break;
        }
    }

    @Override // A5.d
    public void p(ByteBuffer byteBuffer, s5.f fVar) {
        A5.z.f691b.getClass();
        A5.z.c(byteBuffer);
        ((C1373k) this.f17932b).getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v4, types: [k6.i, kotlin.jvm.functions.Function2] */
    @Override // G6.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(G6.h hVar, InterfaceC1287d interfaceC1287d) {
        G6.a aVar;
        int i7;
        Throwable th;
        H6.n nVar;
        if (interfaceC1287d instanceof G6.a) {
            aVar = (G6.a) interfaceC1287d;
            int i8 = aVar.f3069d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f3069d = i8 - Integer.MIN_VALUE;
                Object obj = aVar.f3067b;
                j6.a aVar2 = j6.a.f14642a;
                i7 = aVar.f3069d;
                C1116i c1116i = C1116i.f13008a;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj);
                    H6.n nVar2 = new H6.n(hVar, aVar.getContext());
                    try {
                        aVar.f3066a = nVar2;
                        aVar.f3069d = 1;
                        Object invoke = ((AbstractC1362i) this.f17932b).invoke(nVar2, aVar);
                        if (invoke != aVar2) {
                            invoke = c1116i;
                        }
                        if (invoke == aVar2) {
                            return aVar2;
                        }
                        nVar = nVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        nVar = nVar2;
                        nVar.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar = aVar.f3066a;
                    try {
                        AbstractC0603a.p0(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        nVar.releaseIntercepted();
                        throw th;
                    }
                }
                nVar.releaseIntercepted();
                return c1116i;
            }
        }
        aVar = new G6.a(this, interfaceC1287d);
        Object obj2 = aVar.f3067b;
        j6.a aVar22 = j6.a.f14642a;
        i7 = aVar.f3069d;
        C1116i c1116i2 = C1116i.f13008a;
        if (i7 != 0) {
        }
        nVar.releaseIntercepted();
        return c1116i2;
    }

    @Override // w1.Y0
    public void s(Object obj, OutputStream outputStream) {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
            try {
                B1.m mVar = (B1.m) this.f17932b;
                if (obj != null) {
                    mVar.s(obj, gZIPOutputStream2);
                }
                AbstractC1706i0.h(gZIPOutputStream2);
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = gZIPOutputStream2;
                AbstractC1706i0.h(gZIPOutputStream);
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
            com.google.android.gms.common.internal.D.i(exception);
            return Tasks.forException(exception);
        }
        zzahh zzahhVar = (zzahh) task.getResult();
        if (!(zzahhVar instanceof zzahn)) {
            throw new IllegalArgumentException(AbstractC0486a1.h("Response should be an instance of StartTotpMfaEnrollmentResponse but was ", zzahhVar.getClass().getName(), "."));
        }
        zzahn zzahnVar = (zzahn) zzahhVar;
        String zzf = zzahnVar.zzf();
        com.google.android.gms.common.internal.D.e(zzf);
        String zze = zzahnVar.zze();
        com.google.android.gms.common.internal.D.e(zze);
        int zzc = zzahnVar.zzc();
        int zzb = zzahnVar.zzb();
        long zzd = zzahnVar.zzd();
        String zza = zzahnVar.zza();
        com.google.android.gms.common.internal.D.e(zza);
        return Tasks.forResult(new f4.w(zzf, zze, zzc, zzb, zzd, zza, (FirebaseAuth) this.f17932b));
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public void zza(Throwable th) {
        E2.o.f1952C.f1961g.zzw(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        BinderC0386l binderC0386l = (BinderC0386l) this.f17932b;
        zzdqv zzdqvVar = binderC0386l.f5493B;
        Pair pair = new Pair("sgf_reason", th.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        AtomicInteger atomicInteger = binderC0386l.f5511T;
        Q0.a.n0(zzdqvVar, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(atomicInteger.get())));
        int i7 = I2.J.f3546b;
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
        int i7 = I2.J.f3546b;
        J2.j.b("Initialized webview successfully for SDKCore.");
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjI)).booleanValue()) {
            BinderC0386l binderC0386l = (BinderC0386l) this.f17932b;
            Q0.a.n0(binderC0386l.f5493B, "sgs", new Pair("se", "query_g"), new Pair("ad_format", "BANNER"), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(binderC0386l.f5511T.get())));
            binderC0386l.f5510S.set(true);
        }
    }

    public /* synthetic */ C1761y0(Object obj, int i7) {
        this.f17931a = i7;
        this.f17932b = obj;
    }

    public C1761y0(C1373k c1373k) {
        this.f17931a = 26;
        new A5.s(c1373k, "flutter/mousecursor", A5.y.f688b, null).b(new C1821c(this, 0));
    }

    public C1761y0(int i7) {
        this.f17931a = i7;
        switch (i7) {
            case 22:
                this.f17932b = new CopyOnWriteArrayList();
                break;
            default:
                this.f17932b = new AtomicLong();
                break;
        }
    }

    public C1761y0(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f17931a = 9;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f17932b = new U.f(uri, clipDescription, uri2);
        } else {
            this.f17932b = new C1759x1(uri, clipDescription, uri2, 12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1761y0(Function2 function2) {
        this.f17931a = 4;
        this.f17932b = (AbstractC1362i) function2;
    }
}
