package w1;

import A1.AbstractC0029l;
import A1.RunnableC0032m0;
import C1.RunnableC0107m;
import W5.AbstractC0486a1;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.InterfaceC0668v0;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.internal.ads.zzceb;
import com.google.android.gms.internal.ads.zzcfr;
import com.google.android.gms.internal.ads.zzdde;
import com.google.android.gms.internal.ads.zzgay;
import f2.C1074f;
import g0.ThreadFactoryC1119a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
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
import m.C1420d;
import m.ViewOnKeyListenerC1421e;
import n4.C1473g;
import n4.C1479m;
import v2.AbstractC1664a;
import z1.C1814a;

/* renamed from: w1.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1719l1 implements zzcfr, O2.c, B3.j, zzgay, g0.i, j5.c, InterfaceC0668v0, n4.F, q4.b, A5.f, u2.F, Y0, A5.q {

    /* renamed from: b, reason: collision with root package name */
    public static C1719l1 f17770b;

    /* renamed from: a, reason: collision with root package name */
    public Object f17771a;

    public /* synthetic */ C1719l1(Object obj) {
        this.f17771a = obj;
    }

    public static synchronized C1719l1 r() {
        C1719l1 c1719l1;
        synchronized (C1719l1.class) {
            try {
                if (f17770b == null) {
                    f17770b = new C1719l1();
                }
                c1719l1 = f17770b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1719l1;
    }

    public static C1719l1 u(byte[] bArr, J3.o oVar) {
        if (oVar != null) {
            return new C1719l1(X3.a.a(bArr));
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
        AbstractC1664a.l("MediaCodecAudioRenderer", "Audio sink error", exc);
        P2 p22 = ((C1.H) this.f17771a).W0;
        Handler handler = (Handler) p22.f17508b;
        if (handler != null) {
            handler.post(new RunnableC0107m(p22, exc, 6));
        }
    }

    public void B() {
        long j;
        C1074f c1074f = (C1074f) this.f17771a;
        synchronized (AbstractC1664a.f17091h) {
            try {
                j = AbstractC1664a.f17092i ? AbstractC1664a.j : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        c1074f.f12835L = j;
        c1074f.s(true);
    }

    public void C(String str, Bitmap bitmap) {
        r.b bVar = MediaMetadataCompat.f7987d;
        if (bVar.containsKey(str) && ((Integer) bVar.getOrDefault(str, null)).intValue() != 2) {
            throw new IllegalArgumentException(AbstractC0486a1.h("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f17771a).putParcelable(str, bitmap);
    }

    public void D(String str, long j) {
        r.b bVar = MediaMetadataCompat.f7987d;
        if (bVar.containsKey(str) && ((Integer) bVar.getOrDefault(str, null)).intValue() != 0) {
            throw new IllegalArgumentException(AbstractC0486a1.h("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.f17771a).putLong(str, j);
    }

    public void E(String str, String str2) {
        r.b bVar = MediaMetadataCompat.f7987d;
        if (bVar.containsKey(str) && ((Integer) bVar.getOrDefault(str, null)).intValue() != 1) {
            throw new IllegalArgumentException(AbstractC0486a1.h("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f17771a).putCharSequence(str, str2);
    }

    public Class G() {
        Class<?> loadClass = ((ClassLoader) this.f17771a).loadClass("java.util.function.Consumer");
        t6.h.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }

    @Override // q4.b
    public Object a(C1473g c1473g, Object obj, Object obj2) {
        Iterator it = ((Map) obj).entrySet().iterator();
        while (it.hasNext()) {
            p4.c cVar = (p4.c) ((Map.Entry) it.next()).getValue();
            if (!cVar.f15702d) {
                ((p4.d) this.f17771a).f(new p4.c(cVar.f15699a, cVar.f15700b, cVar.f15701c, true, cVar.f15703e));
            }
        }
        return null;
    }

    @Override // g0.i
    public void b(p3.f fVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1119a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC0032m0(this, fVar, threadPoolExecutor, 18));
    }

    @Override // A5.f
    public void c(String str, A5.d dVar) {
        ((s5.i) this.f17771a).n(str, dVar, null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0668v0
    public void d(m.k kVar, m.m mVar) {
        ViewOnKeyListenerC1421e viewOnKeyListenerC1421e = (ViewOnKeyListenerC1421e) this.f17771a;
        viewOnKeyListenerC1421e.f15103f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC1421e.f15105y;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (kVar == ((C1420d) arrayList.get(i7)).f15080b) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1) {
            return;
        }
        int i8 = i7 + 1;
        viewOnKeyListenerC1421e.f15103f.postAtTime(new A2.c(this, i8 < arrayList.size() ? (C1420d) arrayList.get(i8) : null, mVar, kVar, 16, false), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // j5.c
    public void f(Serializable serializable) {
        ((A5.r) this.f17771a).success(serializable);
    }

    @Override // u2.F
    public void g(u2.H h6, long j, long j3) {
        boolean z4;
        C1719l1 c1719l1 = (C1719l1) this.f17771a;
        synchronized (AbstractC1664a.f17091h) {
            z4 = AbstractC1664a.f17092i;
        }
        if (z4) {
            c1719l1.B();
            return;
        }
        IOException iOException = new IOException(new ConcurrentModificationException());
        C1074f c1074f = (C1074f) c1719l1.f17771a;
        c1074f.getClass();
        AbstractC1664a.l("DashMediaSource", "Failed to resolve time offset.", iOException);
        c1074f.s(true);
    }

    @Override // w1.Y0
    public Object h(InputStream inputStream) {
        int readInt = new E(inputStream, 3).readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            arrayList.add(((C1722m0) this.f17771a).h(inputStream));
        }
        return arrayList;
    }

    @Override // u2.F
    public Q1.e i(u2.H h6, IOException iOException, int i7) {
        C1074f c1074f = (C1074f) ((C1719l1) this.f17771a).f17771a;
        c1074f.getClass();
        AbstractC1664a.l("DashMediaSource", "Failed to resolve time offset.", iOException);
        c1074f.s(true);
        return u2.K.f16723e;
    }

    @Override // A5.f
    public void j(String str, ByteBuffer byteBuffer) {
        ((s5.i) this.f17771a).k(str, byteBuffer, null);
    }

    @Override // A5.f
    public void k(String str, ByteBuffer byteBuffer, A5.e eVar) {
        ((s5.i) this.f17771a).k(str, byteBuffer, eVar);
    }

    @Override // A5.f
    public B4.V m(A5.m mVar) {
        return ((s5.i) this.f17771a).m(mVar);
    }

    @Override // A5.f
    public void n(String str, A5.d dVar, B4.V v6) {
        ((s5.i) this.f17771a).n(str, dVar, v6);
    }

    @Override // androidx.appcompat.widget.InterfaceC0668v0
    public void o(m.k kVar, m.m mVar) {
        ((ViewOnKeyListenerC1421e) this.f17771a).f15103f.removeCallbacksAndMessages(kVar);
    }

    @Override // B3.j
    public void onConsentFormLoadFailure(B3.i iVar) {
        ((A5.p) this.f17771a).error(Integer.toString(iVar.f1067a), iVar.f1068b, null);
    }

    @Override // A5.q
    public void onMethodCall(A5.o oVar, A5.r rVar) {
        z5.m mVar = (z5.m) this.f17771a;
        if (mVar.f18500a == null) {
            return;
        }
        String str = oVar.f676a;
        Object obj = oVar.f677b;
        str.getClass();
        if (!str.equals("SpellCheck.initiateSpellCheck")) {
            ((A5.p) rVar).notImplemented();
            return;
        }
        try {
            ArrayList arrayList = (ArrayList) obj;
            mVar.f18500a.initiateSpellCheck((String) arrayList.get(0), (String) arrayList.get(1), rVar);
        } catch (IllegalStateException e7) {
            ((A5.p) rVar).error("error", e7.getMessage(), null);
        }
    }

    @Override // O2.c
    public void onNativeAdLoaded(NativeAd nativeAd) {
        WeakReference weakReference = (WeakReference) this.f17771a;
        if (weakReference.get() != null) {
            L5.H h6 = (L5.H) weakReference.get();
            M5.b bVar = h6.f4407h;
            bVar.getClass();
            TemplateView templateView = (TemplateView) ((LayoutInflater) h6.j.getSystemService("layout_inflater")).inflate(bVar.f4594a.f4606a, (ViewGroup) null);
            C1814a c1814a = new C1814a();
            ColorDrawable colorDrawable = bVar.f4595b;
            if (colorDrawable != null) {
                c1814a.f18453q = colorDrawable;
            }
            M5.c cVar = bVar.f4596c;
            if (cVar != null) {
                ColorDrawable colorDrawable2 = cVar.f4601b;
                if (colorDrawable2 != null) {
                    c1814a.f18441d = colorDrawable2;
                }
                ColorDrawable colorDrawable3 = cVar.f4600a;
                if (colorDrawable3 != null) {
                    c1814a.f18440c = Integer.valueOf(colorDrawable3.getColor());
                }
                M5.a aVar = cVar.f4602c;
                if (aVar != null) {
                    c1814a.f18438a = aVar.a();
                }
                if (cVar.a() != null) {
                    c1814a.f18439b = cVar.a().floatValue();
                }
            }
            M5.c cVar2 = bVar.f4597d;
            if (cVar2 != null) {
                ColorDrawable colorDrawable4 = cVar2.f4601b;
                if (colorDrawable4 != null) {
                    c1814a.f18445h = colorDrawable4;
                }
                ColorDrawable colorDrawable5 = cVar2.f4600a;
                if (colorDrawable5 != null) {
                    c1814a.f18444g = Integer.valueOf(colorDrawable5.getColor());
                }
                M5.a aVar2 = cVar2.f4602c;
                if (aVar2 != null) {
                    c1814a.f18442e = aVar2.a();
                }
                if (cVar2.a() != null) {
                    c1814a.f18443f = cVar2.a().floatValue();
                }
            }
            M5.c cVar3 = bVar.f4598e;
            if (cVar3 != null) {
                ColorDrawable colorDrawable6 = cVar3.f4601b;
                if (colorDrawable6 != null) {
                    c1814a.f18448l = colorDrawable6;
                }
                ColorDrawable colorDrawable7 = cVar3.f4600a;
                if (colorDrawable7 != null) {
                    c1814a.f18447k = Integer.valueOf(colorDrawable7.getColor());
                }
                M5.a aVar3 = cVar3.f4602c;
                if (aVar3 != null) {
                    c1814a.f18446i = aVar3.a();
                }
                if (cVar3.a() != null) {
                    c1814a.j = cVar3.a().floatValue();
                }
            }
            M5.c cVar4 = bVar.f4599f;
            if (cVar4 != null) {
                ColorDrawable colorDrawable8 = cVar4.f4601b;
                if (colorDrawable8 != null) {
                    c1814a.f18452p = colorDrawable8;
                }
                ColorDrawable colorDrawable9 = cVar4.f4600a;
                if (colorDrawable9 != null) {
                    c1814a.f18451o = Integer.valueOf(colorDrawable9.getColor());
                }
                M5.a aVar4 = cVar4.f4602c;
                if (aVar4 != null) {
                    c1814a.f18449m = aVar4.a();
                }
                if (cVar4.a() != null) {
                    c1814a.f18450n = cVar4.a().floatValue();
                }
            }
            templateView.setStyles(c1814a);
            h6.f4408i = templateView;
            templateView.setNativeAd(nativeAd);
            C1759x1 c1759x1 = h6.f4401b;
            nativeAd.setOnPaidEventListener(new P2(16, c1759x1, h6, false));
            c1759x1.U(h6.f4481a, nativeAd.getResponseInfo());
        }
    }

    @Override // j5.c
    public void p(String str, HashMap hashMap) {
        ((A5.r) this.f17771a).error("sqlite_error", str, hashMap);
    }

    @Override // n4.F
    public void q(String str) {
        C1479m c1479m = (C1479m) this.f17771a;
        c1479m.f15455i.W(null, "Auth token changed, triggering auth token refresh", new Object[0]);
        l4.s sVar = c1479m.f15449c;
        sVar.f15007y.W(null, "Auth token refreshed.", new Object[0]);
        sVar.f14999q = str;
        if (sVar.b()) {
            if (str != null) {
                sVar.k(false);
                return;
            }
            Y4.D.v("Must be connected to send unauth.", sVar.b(), new Object[0]);
            Y4.D.v("Auth token must not be set.", sVar.f14999q == null, new Object[0]);
            sVar.p("unauth", false, Collections.emptyMap(), null);
        }
    }

    @Override // w1.Y0
    public void s(Object obj, OutputStream outputStream) {
        List list = (List) obj;
        D d7 = new D(outputStream, 3);
        int size = list != null ? list.size() : 0;
        d7.writeInt(size);
        for (int i7 = 0; i7 < size; i7++) {
            ((C1722m0) this.f17771a).s(list.get(i7), outputStream);
        }
        d7.flush();
    }

    public U0.d v(Object obj, t6.d dVar, Activity activity, Z0.b bVar) {
        U0.c cVar = new U0.c(dVar, bVar);
        Object newProxyInstance = Proxy.newProxyInstance((ClassLoader) this.f17771a, new Class[]{G()}, cVar);
        t6.h.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, G()).invoke(obj, activity, newProxyInstance);
        return new U0.d(obj.getClass().getMethod("removeWindowLayoutInfoListener", G()), obj, newProxyInstance);
    }

    public E1.c w() {
        return (E1.c) this.f17771a;
    }

    public UUID x() {
        return AbstractC0029l.f462a;
    }

    public int z() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public void zza(Throwable th) {
        ((zzdde) this.f17771a).zzb(th.getMessage());
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public /* synthetic */ void zzb(Object obj) {
        ((zzdde) this.f17771a).zza((P2.v) obj);
    }

    public C1719l1(MediaMetadataCompat mediaMetadataCompat) {
        Bundle bundle = new Bundle(mediaMetadataCompat.f7991a);
        this.f17771a = bundle;
        android.support.v4.media.session.t.Z(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public void zza(boolean z4, int i7, String str, String str2) {
        zzceb zzcebVar = ((H2.j) this.f17771a).f3261c;
        if (zzcebVar != null) {
            zzcebVar.zzaa();
        }
    }

    public C1719l1(int i7) {
        switch (i7) {
            case 11:
                this.f17771a = new Bundle();
                break;
            case 12:
                this.f17771a = new AtomicInteger(0);
                break;
            default:
                this.f17771a = new SparseIntArray();
                break;
        }
    }

    public void F(B1.m mVar) {
    }

    public void t(B1.m mVar) {
    }

    @Override // u2.F
    public void l(u2.H h6, long j, long j3, boolean z4) {
    }
}
