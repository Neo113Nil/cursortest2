package p155w1;

import A1.AbstractC0029l;
import A1.RunnableC0032m0;
import A5.f;
import A5.p;
import A5.q;
import A5.r;
import B3.j;
import B4.V;
import C1.H;
import C1.RunnableC0107m;
import J3.o;
import O2.c;
import P2.v;
import W5.AbstractC0486a1;
import X3.a;
import Y4.D;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.t;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.InterfaceC0647v0;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.internal.ads.zzceb;
import com.google.android.gms.internal.ads.zzcfr;
import com.google.android.gms.internal.ads.zzdde;
import com.google.android.gms.internal.ads.zzgay;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p046g0.i;
import p083l4.s;
import p086m.C0927d;
import p086m.e;
import p086m.k;
import p086m.m;
import p098n4.C0934g;
import p098n4.C0940m;
import p098n4.F;
import p114p4.d;
import p120q4.b;
import p146u2.K;
import t6.h;

/* JADX INFO: renamed from: w1.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1010l1 implements zzcfr, c, j, zzgay, i, j5.c, InterfaceC0647v0, F, b, f, p146u2.F, Y0, q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C1010l1 f17776b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f17777a;

    public /* synthetic */ C1010l1(Object obj) {
        this.f17777a = obj;
    }

    public static synchronized C1010l1 r() {
        try {
            if (f17776b == null) {
                f17776b = new C1010l1();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f17776b;
    }

    public static C1010l1 u(byte[] bArr, o oVar) {
        if (oVar != null) {
            return new C1010l1(a.a(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public static int y(int i7, int i8) {
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            i9++;
            if (i9 == i8) {
                i10++;
                i9 = 0;
            } else if (i9 > i8) {
                i10++;
                i9 = 1;
            }
        }
        return i9 + 1 > i8 ? i10 + 1 : i10;
    }

    public void A(Exception exc) {
        p151v2.a.l("MediaCodecAudioRenderer", "Audio sink error", exc);
        P2 p5 = ((H) this.f17777a).W0;
        Handler handler = (Handler) p5.f17514b;
        if (handler != null) {
            handler.post(new RunnableC0107m(p5, exc, 6));
        }
    }

    public void B() {
        long j;
        p040f2.f fVar = (p040f2.f) this.f17777a;
        synchronized (p151v2.a.f17097h) {
            try {
                j = p151v2.a.f17098i ? p151v2.a.j : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        fVar.f12841L = j;
        fVar.s(true);
    }

    public void C(String str, Bitmap bitmap) {
        p122r.b bVar = MediaMetadataCompat.f7987d;
        if (bVar.containsKey(str) && ((Integer) bVar.getOrDefault(str, null)).intValue() != 2) {
            throw new IllegalArgumentException(AbstractC0486a1.h("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f17777a).putParcelable(str, bitmap);
    }

    public void D(String str, long j) {
        p122r.b bVar = MediaMetadataCompat.f7987d;
        if (bVar.containsKey(str) && ((Integer) bVar.getOrDefault(str, null)).intValue() != 0) {
            throw new IllegalArgumentException(AbstractC0486a1.h("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.f17777a).putLong(str, j);
    }

    public void E(String str, String str2) {
        p122r.b bVar = MediaMetadataCompat.f7987d;
        if (bVar.containsKey(str) && ((Integer) bVar.getOrDefault(str, null)).intValue() != 1) {
            throw new IllegalArgumentException(AbstractC0486a1.h("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f17777a).putCharSequence(str, str2);
    }

    public Class G() throws ClassNotFoundException {
        Class<?> clsLoadClass = ((ClassLoader) this.f17777a).loadClass("java.util.function.Consumer");
        h.d(clsLoadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return clsLoadClass;
    }

    @Override // p120q4.b
    public Object a(C0934g c0934g, Object obj, Object obj2) {
        Iterator it = ((Map) obj).entrySet().iterator();
        while (it.hasNext()) {
            p114p4.c cVar = (p114p4.c) ((Map.Entry) it.next()).getValue();
            if (!cVar.f15708d) {
                ((d) this.f17777a).f(new p114p4.c(cVar.f15705a, cVar.f15706b, cVar.f15707c, true, cVar.f15709e));
            }
        }
        return null;
    }

    @Override // p046g0.i
    public void b(p113p3.f fVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new p046g0.a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC0032m0(this, fVar, threadPoolExecutor, 18));
    }

    @Override // A5.f
    public void c(String str, A5.d dVar) {
        ((p135s5.i) this.f17777a).n(str, dVar, null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0647v0
    public void d(k kVar, m mVar) {
        e eVar = (e) this.f17777a;
        eVar.f15109f.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.f15111y;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (kVar == ((C0927d) arrayList.get(i7)).f15086b) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1) {
            return;
        }
        int i8 = i7 + 1;
        eVar.f15109f.postAtTime(new A2.c(this, i8 < arrayList.size() ? (C0927d) arrayList.get(i8) : null, mVar, kVar, 16, false), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // j5.c
    public void f(Serializable serializable) {
        ((r) this.f17777a).success(serializable);
    }

    @Override // p146u2.F
    public void g(p146u2.H h6, long j, long j3) {
        boolean z4;
        C1010l1 c1010l1 = (C1010l1) this.f17777a;
        synchronized (p151v2.a.f17097h) {
            z4 = p151v2.a.f17098i;
        }
        if (z4) {
            c1010l1.B();
            return;
        }
        IOException iOException = new IOException(new ConcurrentModificationException());
        p040f2.f fVar = (p040f2.f) c1010l1.f17777a;
        fVar.getClass();
        p151v2.a.l("DashMediaSource", "Failed to resolve time offset.", iOException);
        fVar.s(true);
    }

    @Override // p155w1.Y0
    public Object h(InputStream inputStream) throws IOException {
        int i7 = new E(inputStream, 3).readInt();
        ArrayList arrayList = new ArrayList(i7);
        for (int i8 = 0; i8 < i7; i8++) {
            arrayList.add(((C1013m0) this.f17777a).h(inputStream));
        }
        return arrayList;
    }

    @Override // p146u2.F
    public Q1.e i(p146u2.H h6, IOException iOException, int i7) {
        p040f2.f fVar = (p040f2.f) ((C1010l1) this.f17777a).f17777a;
        fVar.getClass();
        p151v2.a.l("DashMediaSource", "Failed to resolve time offset.", iOException);
        fVar.s(true);
        return K.f16729e;
    }

    @Override // A5.f
    public void j(String str, ByteBuffer byteBuffer) {
        ((p135s5.i) this.f17777a).k(str, byteBuffer, null);
    }

    @Override // A5.f
    public void k(String str, ByteBuffer byteBuffer, A5.e eVar) {
        ((p135s5.i) this.f17777a).k(str, byteBuffer, eVar);
    }

    @Override // A5.f
    public V m(A5.m mVar) {
        return ((p135s5.i) this.f17777a).m(mVar);
    }

    @Override // A5.f
    public void n(String str, A5.d dVar, V v6) {
        ((p135s5.i) this.f17777a).n(str, dVar, v6);
    }

    @Override // androidx.appcompat.widget.InterfaceC0647v0
    public void o(k kVar, m mVar) {
        ((e) this.f17777a).f15109f.removeCallbacksAndMessages(kVar);
    }

    @Override // B3.j
    public void onConsentFormLoadFailure(B3.i iVar) {
        ((p) this.f17777a).error(Integer.toString(iVar.f1067a), iVar.f1068b, null);
    }

    @Override // A5.q
    public void onMethodCall(A5.o oVar, r rVar) {
        p174z5.m mVar = (p174z5.m) this.f17777a;
        if (mVar.f18506a == null) {
            return;
        }
        String str = oVar.f676a;
        Object obj = oVar.f677b;
        str.getClass();
        if (!str.equals("SpellCheck.initiateSpellCheck")) {
            ((p) rVar).notImplemented();
            return;
        }
        try {
            ArrayList arrayList = (ArrayList) obj;
            mVar.f18506a.initiateSpellCheck((String) arrayList.get(0), (String) arrayList.get(1), rVar);
        } catch (IllegalStateException e7) {
            ((p) rVar).error("error", e7.getMessage(), null);
        }
    }

    @Override // O2.c
    public void onNativeAdLoaded(NativeAd nativeAd) {
        WeakReference weakReference = (WeakReference) this.f17777a;
        if (weakReference.get() != null) {
            L5.H h6 = (L5.H) weakReference.get();
            M5.b bVar = h6.f4407h;
            bVar.getClass();
            TemplateView templateView = (TemplateView) ((LayoutInflater) h6.j.getSystemService("layout_inflater")).inflate(bVar.f4594a.f4606a, (ViewGroup) null);
            p171z1.a aVar = new p171z1.a();
            ColorDrawable colorDrawable = bVar.f4595b;
            if (colorDrawable != null) {
                aVar.f18459q = colorDrawable;
            }
            M5.c cVar = bVar.f4596c;
            if (cVar != null) {
                ColorDrawable colorDrawable2 = cVar.f4601b;
                if (colorDrawable2 != null) {
                    aVar.f18447d = colorDrawable2;
                }
                ColorDrawable colorDrawable3 = cVar.f4600a;
                if (colorDrawable3 != null) {
                    aVar.f18446c = Integer.valueOf(colorDrawable3.getColor());
                }
                M5.a aVar2 = cVar.f4602c;
                if (aVar2 != null) {
                    aVar.f18444a = aVar2.a();
                }
                if (cVar.a() != null) {
                    aVar.f18445b = cVar.a().floatValue();
                }
            }
            M5.c cVar2 = bVar.f4597d;
            if (cVar2 != null) {
                ColorDrawable colorDrawable4 = cVar2.f4601b;
                if (colorDrawable4 != null) {
                    aVar.f18451h = colorDrawable4;
                }
                ColorDrawable colorDrawable5 = cVar2.f4600a;
                if (colorDrawable5 != null) {
                    aVar.f18450g = Integer.valueOf(colorDrawable5.getColor());
                }
                M5.a aVar3 = cVar2.f4602c;
                if (aVar3 != null) {
                    aVar.f18448e = aVar3.a();
                }
                if (cVar2.a() != null) {
                    aVar.f18449f = cVar2.a().floatValue();
                }
            }
            M5.c cVar3 = bVar.f4598e;
            if (cVar3 != null) {
                ColorDrawable colorDrawable6 = cVar3.f4601b;
                if (colorDrawable6 != null) {
                    aVar.f18454l = colorDrawable6;
                }
                ColorDrawable colorDrawable7 = cVar3.f4600a;
                if (colorDrawable7 != null) {
                    aVar.f18453k = Integer.valueOf(colorDrawable7.getColor());
                }
                M5.a aVar4 = cVar3.f4602c;
                if (aVar4 != null) {
                    aVar.f18452i = aVar4.a();
                }
                if (cVar3.a() != null) {
                    aVar.j = cVar3.a().floatValue();
                }
            }
            M5.c cVar4 = bVar.f4599f;
            if (cVar4 != null) {
                ColorDrawable colorDrawable8 = cVar4.f4601b;
                if (colorDrawable8 != null) {
                    aVar.f18458p = colorDrawable8;
                }
                ColorDrawable colorDrawable9 = cVar4.f4600a;
                if (colorDrawable9 != null) {
                    aVar.f18457o = Integer.valueOf(colorDrawable9.getColor());
                }
                M5.a aVar5 = cVar4.f4602c;
                if (aVar5 != null) {
                    aVar.f18455m = aVar5.a();
                }
                if (cVar4.a() != null) {
                    aVar.f18456n = cVar4.a().floatValue();
                }
            }
            templateView.setStyles(aVar);
            h6.f4408i = templateView;
            templateView.setNativeAd(nativeAd);
            C1050x1 c1050x1 = h6.f4401b;
            nativeAd.setOnPaidEventListener(new P2(16, c1050x1, h6, false));
            c1050x1.U(h6.f4481a, nativeAd.getResponseInfo());
        }
    }

    @Override // j5.c
    public void p(String str, HashMap map) {
        ((r) this.f17777a).error("sqlite_error", str, map);
    }

    @Override // p098n4.F
    public void q(String str) {
        C0940m c0940m = (C0940m) this.f17777a;
        c0940m.f15461i.W(null, "Auth token changed, triggering auth token refresh", new Object[0]);
        s sVar = c0940m.f15455c;
        sVar.f15013y.W(null, "Auth token refreshed.", new Object[0]);
        sVar.f15005q = str;
        if (sVar.b()) {
            if (str != null) {
                sVar.k(false);
                return;
            }
            D.v("Must be connected to send unauth.", sVar.b(), new Object[0]);
            D.v("Auth token must not be set.", sVar.f15005q == null, new Object[0]);
            sVar.p("unauth", false, Collections.emptyMap(), null);
        }
    }

    @Override // p155w1.Y0
    public void s(Object obj, OutputStream outputStream) throws IOException {
        List list = (List) obj;
        D d7 = new D(outputStream, 3);
        int size = list != null ? list.size() : 0;
        d7.writeInt(size);
        for (int i7 = 0; i7 < size; i7++) {
            ((C1013m0) this.f17777a).s(list.get(i7), outputStream);
        }
        d7.flush();
    }

    public U0.d v(Object obj, t6.d dVar, Activity activity, Z0.b bVar) throws IllegalAccessException, InvocationTargetException {
        U0.c cVar = new U0.c(dVar, bVar);
        Object objNewProxyInstance = Proxy.newProxyInstance((ClassLoader) this.f17777a, new Class[]{G()}, cVar);
        h.d(objNewProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, G()).invoke(obj, activity, objNewProxyInstance);
        return new U0.d(obj.getClass().getMethod("removeWindowLayoutInfoListener", G()), obj, objNewProxyInstance);
    }

    public E1.c w() {
        return (E1.c) this.f17777a;
    }

    public UUID x() {
        return AbstractC0029l.f462a;
    }

    public int z() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public void zza(Throwable th) {
        ((zzdde) this.f17777a).zzb(th.getMessage());
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public /* synthetic */ void zzb(Object obj) {
        ((zzdde) this.f17777a).zza((v) obj);
    }

    public C1010l1(MediaMetadataCompat mediaMetadataCompat) {
        Bundle bundle = new Bundle(mediaMetadataCompat.f7991a);
        this.f17777a = bundle;
        t.Z(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public void zza(boolean z4, int i7, String str, String str2) {
        zzceb zzcebVar = ((H2.j) this.f17777a).f3261c;
        if (zzcebVar != null) {
            zzcebVar.zzaa();
        }
    }

    public C1010l1(int i7) {
        switch (i7) {
            case 11:
                this.f17777a = new Bundle();
                break;
            case 12:
                this.f17777a = new AtomicInteger(0);
                break;
            default:
                this.f17777a = new SparseIntArray();
                break;
        }
    }

    public void F(B1.m mVar) {
    }

    public void t(B1.m mVar) {
    }

    @Override // p146u2.F
    public void l(p146u2.H h6, long j, long j3, boolean z4) {
    }
}
