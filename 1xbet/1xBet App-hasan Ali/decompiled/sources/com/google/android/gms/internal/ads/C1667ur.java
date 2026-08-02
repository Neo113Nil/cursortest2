package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.ur, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1667ur implements Jw, Xu, InterfaceC1166jk, InterfaceC1883zi, InterfaceC0977fH {

    /* renamed from: n, reason: collision with root package name */
    public static C1667ur f15912n;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15913k;

    /* renamed from: l, reason: collision with root package name */
    public Object f15914l;

    /* renamed from: m, reason: collision with root package name */
    public Object f15915m;

    public C1667ur(int i) {
        this.f15913k = i;
        switch (i) {
            case 6:
                this.f15914l = new HashMap();
                this.f15915m = new HashMap();
                break;
            case 8:
                break;
            case 12:
                this.f15914l = new HashSet();
                break;
            default:
                Qs qs = new Qs();
                this.f15914l = qs;
                this.f15915m = new Ps(qs);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Xu
    /* renamed from: a */
    public InterfaceC1402ov mo19a() {
        C0783b1 c0783b1 = (C0783b1) this.f15915m;
        return new C1808xx((Context) this.f15914l, new Dy(null, c0783b1.f12751k, c0783b1.f12752l, false, (Er) c0783b1.f12753m));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0977fH
    public C1761wv b(int i, C1292mb c1292mb, int[] iArr) {
        AbstractC0952et.q("initialCapacity", 4);
        Object[] objArr = new Object[4];
        int i5 = 0;
        int i6 = 0;
        while (i5 < c1292mb.f14495a) {
            int i7 = i;
            C1292mb c1292mb2 = c1292mb;
            C0932eH c0932eH = new C0932eH(i7, c1292mb2, i5, (C0843cH) this.f15914l, iArr[i5], (String) this.f15915m);
            int length = objArr.length;
            int i8 = i6 + 1;
            int d5 = AbstractC0776av.d(length, i8);
            if (d5 > length) {
                objArr = Arrays.copyOf(objArr, d5);
            }
            objArr[i6] = c0932eH;
            i5++;
            i6 = i8;
            i = i7;
            c1292mb = c1292mb2;
        }
        return AbstractC1044gv.k(i6, objArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1166jk
    public void c(Object obj, WG wg) {
        ((PE) obj).j((ME) this.f15915m, new Er(wg, ((SE) this.f15914l).f11525e));
    }

    public void d(C0824bz c0824bz) {
        if (c0824bz == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        C0913dz c0913dz = new C0913dz(c0824bz.f12928a, c0824bz.f12929b);
        HashMap hashMap = (HashMap) this.f15914l;
        if (!hashMap.containsKey(c0913dz)) {
            hashMap.put(c0913dz, c0824bz);
            return;
        }
        C0824bz c0824bz2 = (C0824bz) hashMap.get(c0913dz);
        if (!c0824bz2.equals(c0824bz) || !c0824bz.equals(c0824bz2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(c0913dz.toString()));
        }
    }

    public void f(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.f15914l).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.f15915m) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void g(String str, Object obj) {
        boolean commit;
        boolean z3 = obj instanceof String;
        String str2 = (String) this.f15914l;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f15915m;
        if (z3) {
            commit = sharedPreferences.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            commit = sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            commit = sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            if (!(obj instanceof Integer)) {
                Log.e("GpidLifecycleSPHandler", "Unexpected object class " + String.valueOf(obj.getClass()) + " for app " + str2);
                throw new IOException("Failed to store " + str + " for app " + str2);
            }
            commit = sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).commit();
        }
        if (commit) {
            return;
        }
        throw new IOException("Failed to store " + str + " for app " + str2);
    }

    public void h(String str) {
        if (((SharedPreferences) this.f15915m).edit().remove(str).commit()) {
            return;
        }
        throw new IOException("Failed to remove " + str + " for app " + ((String) this.f15914l));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1883zi, com.google.android.gms.internal.ads.Yj
    /* renamed from: k */
    public void mo11k(Object obj) {
        ((InterfaceC1783xG) obj).d(0, ((C1872zF) this.f15914l).f16578a, (C1469qG) this.f15915m);
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public void mo14o(Object obj) {
        switch (this.f15913k) {
            case 0:
                synchronized (((C1245lH) this.f15915m)) {
                    C1245lH c1245lH = (C1245lH) this.f15915m;
                    c1245lH.f14380o = null;
                    ((ArrayDeque) c1245lH.f14379n).addFirst((C1172jq) this.f15914l);
                    C1245lH c1245lH2 = (C1245lH) this.f15915m;
                    if (c1245lH2.f14376k == 1) {
                        c1245lH2.h();
                    }
                }
                return;
            case 1:
                ((Gr) ((C1324n6) this.f15915m).f14583p).f9281c.n1(new Qt(28, (Cr) this.f15914l));
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
        switch (this.f15913k) {
            case 0:
                synchronized (((C1245lH) this.f15915m)) {
                    ((C1245lH) this.f15915m).f14380o = null;
                }
                return;
            case 1:
                ((Gr) ((C1324n6) this.f15915m).f14583p).f9281c.n1(new Er(0, (Cr) this.f15914l, th));
                return;
            default:
                Jr jr = (Jr) this.f15915m;
                jr.f(th);
                jr.g(false);
                ((Mr) this.f15914l).a(jr);
                return;
        }
    }

    public /* synthetic */ C1667ur(int i, Object obj, Object obj2) {
        this.f15913k = i;
        this.f15914l = obj2;
        this.f15915m = obj;
    }

    public /* synthetic */ C1667ur(int i, Object obj, Object obj2, boolean z3) {
        this.f15913k = i;
        this.f15914l = obj;
        this.f15915m = obj2;
    }

    public C1667ur(Context context, int i) {
        this.f15913k = i;
        switch (i) {
            case 5:
                C0783b1 c0783b1 = new C0783b1(5);
                this.f15914l = context.getApplicationContext();
                this.f15915m = c0783b1;
                break;
            case 11:
                this.f15914l = context;
                break;
            default:
                this.f15914l = context.getPackageName();
                this.f15915m = context.getSharedPreferences("paid_storage_sp", 0);
                break;
        }
    }

    public /* synthetic */ C1667ur(MediaCodec.CryptoInfo cryptoInfo) {
        this.f15913k = 7;
        this.f15914l = cryptoInfo;
        this.f15915m = AbstractC1211kk.a();
    }

    public /* synthetic */ C1667ur(C1003fz c1003fz) {
        this.f15913k = 6;
        this.f15914l = new HashMap(c1003fz.f13534a);
        this.f15915m = new HashMap(c1003fz.f13535b);
    }

    private final void e(Object obj) {
    }
}
