package com.google.android.gms.internal.ads;

import Q2.C0379q;
import T2.C0439q;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.ce, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0848ce {

    /* renamed from: r, reason: collision with root package name */
    public static final boolean f13005r;

    /* renamed from: a, reason: collision with root package name */
    public final Context f13006a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13007b;

    /* renamed from: c, reason: collision with root package name */
    public final U2.a f13008c;

    /* renamed from: d, reason: collision with root package name */
    public final I7 f13009d;

    /* renamed from: e, reason: collision with root package name */
    public final L7 f13010e;
    public final T2.r f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f13011g;

    /* renamed from: h, reason: collision with root package name */
    public final String[] f13012h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13013j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13014k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13015l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13016m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC0690Td f13017n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13018o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13019p;

    /* renamed from: q, reason: collision with root package name */
    public long f13020q;

    static {
        f13005r = C0379q.f.f5052e.nextInt(100) < ((Integer) Q2.r.f5053d.f5056c.a(F7.lc)).intValue();
    }

    public C0848ce(Context context, U2.a aVar, String str, L7 l7, I7 i7) {
        v3.e eVar = new v3.e(10);
        eVar.R("min_1", Double.MIN_VALUE, 1.0d);
        eVar.R("1_5", 1.0d, 5.0d);
        eVar.R("5_10", 5.0d, 10.0d);
        eVar.R("10_20", 10.0d, 20.0d);
        eVar.R("20_30", 20.0d, 30.0d);
        eVar.R("30_max", 30.0d, Double.MAX_VALUE);
        this.f = new T2.r(eVar);
        this.i = false;
        this.f13013j = false;
        this.f13014k = false;
        this.f13015l = false;
        this.f13020q = -1L;
        this.f13006a = context;
        this.f13008c = aVar;
        this.f13007b = str;
        this.f13010e = l7;
        this.f13009d = i7;
        String str2 = (String) Q2.r.f5053d.f5056c.a(F7.f8677E);
        if (str2 == null) {
            this.f13012h = new String[0];
            this.f13011g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.f13012h = new String[length];
        this.f13011g = new long[length];
        for (int i = 0; i < split.length; i++) {
            try {
                this.f13011g[i] = Long.parseLong(split[i]);
            } catch (NumberFormatException e3) {
                U2.j.j("Unable to parse frame hash target time number.", e3);
                this.f13011g[i] = -1;
            }
        }
    }

    public final void a(AbstractC0690Td abstractC0690Td) {
        L7 l7 = this.f13010e;
        AbstractC1803xs.m(l7, this.f13009d, "vpc2");
        this.i = true;
        l7.b("vpn", abstractC0690Td.r());
        this.f13017n = abstractC0690Td;
    }

    public final void b() {
        this.f13016m = true;
        if (!this.f13013j || this.f13014k) {
            return;
        }
        AbstractC1803xs.m(this.f13010e, this.f13009d, "vfp2");
        this.f13014k = true;
    }

    public final void c() {
        Bundle Q5;
        if (!f13005r || this.f13018o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f13007b);
        bundle.putString("player", this.f13017n.r());
        T2.r rVar = this.f;
        rVar.getClass();
        String[] strArr = (String[]) rVar.f5739c;
        ArrayList arrayList = new ArrayList(strArr.length);
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            double d5 = ((double[]) rVar.f5741e)[i];
            double d6 = ((double[]) rVar.f5740d)[i];
            int i5 = ((int[]) rVar.f)[i];
            arrayList.add(new C0439q(str, d5, d6, i5 / rVar.f5738b, i5));
            i++;
            bundle = bundle;
        }
        Bundle bundle2 = bundle;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            C0439q c0439q = (C0439q) obj;
            bundle2.putString("fps_c_".concat(String.valueOf(c0439q.f5732a)), Integer.toString(c0439q.f5736e));
            bundle2.putString("fps_p_".concat(String.valueOf(c0439q.f5732a)), Double.toString(c0439q.f5735d));
        }
        int i7 = 0;
        while (true) {
            long[] jArr = this.f13011g;
            if (i7 >= jArr.length) {
                break;
            }
            String str2 = this.f13012h[i7];
            if (str2 != null) {
                bundle2.putString("fh_".concat(Long.valueOf(jArr[i7]).toString()), str2);
            }
            i7++;
        }
        final T2.L l5 = P2.o.f4767B.f4771c;
        String str3 = this.f13008c.f5852k;
        l5.getClass();
        bundle2.putString("device", T2.L.H());
        A7 a7 = F7.f8796a;
        Q2.r rVar2 = Q2.r.f5053d;
        bundle2.putString("eids", TextUtils.join(",", rVar2.f5054a.n()));
        boolean isEmpty = bundle2.isEmpty();
        final Context context = this.f13006a;
        if (isEmpty) {
            U2.j.d("Empty or null bundle.");
        } else {
            final String str4 = (String) rVar2.f5056c.a(F7.ea);
            boolean andSet = l5.f5676d.getAndSet(true);
            AtomicReference atomicReference = l5.f5675c;
            if (!andSet) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: T2.J
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str5) {
                        L.this.f5675c.set(G4.l.Q(context, str4));
                    }
                };
                if (TextUtils.isEmpty(str4)) {
                    Q5 = Bundle.EMPTY;
                } else {
                    PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    Q5 = G4.l.Q(context, str4);
                }
                atomicReference.set(Q5);
            }
            bundle2.putAll((Bundle) atomicReference.get());
        }
        U2.e eVar = C0379q.f.f5048a;
        U2.e.k(context, str3, bundle2, new G.v(11, context, str3));
        this.f13018o = true;
    }

    public final void d(AbstractC0690Td abstractC0690Td) {
        if (this.f13014k && !this.f13015l) {
            if (T2.G.o() && !this.f13015l) {
                T2.G.m("VideoMetricsMixin first frame");
            }
            AbstractC1803xs.m(this.f13010e, this.f13009d, "vff2");
            this.f13015l = true;
        }
        P2.o.f4767B.f4776j.getClass();
        long nanoTime = System.nanoTime();
        if (this.f13016m && this.f13019p && this.f13020q != -1) {
            double nanos = TimeUnit.SECONDS.toNanos(1L) / (nanoTime - this.f13020q);
            T2.r rVar = this.f;
            rVar.f5738b++;
            int i = 0;
            while (true) {
                double[] dArr = (double[]) rVar.f5741e;
                if (i >= dArr.length) {
                    break;
                }
                double d5 = dArr[i];
                if (d5 <= nanos && nanos < ((double[]) rVar.f5740d)[i]) {
                    int[] iArr = (int[]) rVar.f;
                    iArr[i] = iArr[i] + 1;
                }
                if (nanos < d5) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f13019p = this.f13016m;
        this.f13020q = nanoTime;
        long longValue = ((Long) Q2.r.f5053d.f5056c.a(F7.f8682F)).longValue();
        long i5 = abstractC0690Td.i();
        int i6 = 0;
        while (true) {
            String[] strArr = this.f13012h;
            if (i6 >= strArr.length) {
                return;
            }
            if (strArr[i6] == null && longValue > Math.abs(i5 - this.f13011g[i6])) {
                int i7 = 8;
                Bitmap bitmap = abstractC0690Td.getBitmap(8, 8);
                long j5 = 63;
                long j6 = 0;
                int i8 = 0;
                while (i8 < i7) {
                    int i9 = 0;
                    while (i9 < i7) {
                        int pixel = bitmap.getPixel(i9, i8);
                        j6 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j5);
                        j5--;
                        i9++;
                        i7 = 8;
                    }
                    i8++;
                    i7 = 8;
                }
                strArr[i6] = String.format("%016X", Long.valueOf(j6));
                return;
            }
            i6++;
        }
    }
}
