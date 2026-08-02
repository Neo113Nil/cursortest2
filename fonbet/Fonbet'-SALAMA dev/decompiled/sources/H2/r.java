package H2;

import F2.C0254t;
import G4.C0282o;
import I2.J;
import U5.I;
import U5.c0;
import U5.l0;
import U5.n0;
import a.AbstractC0603a;
import android.content.Context;
import android.text.TextUtils;
import b6.AbstractC0791c;
import b6.C0789a;
import b6.C0790b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C0824a;
import com.google.android.gms.common.api.internal.C0831h;
import com.google.android.gms.common.api.internal.D;
import com.google.android.gms.common.api.internal.X;
import com.google.android.gms.common.internal.InterfaceC0852d;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzceb;
import com.google.android.gms.internal.ads.zzfqy;
import com.google.android.gms.internal.ads.zzfqz;
import com.google.android.gms.internal.ads.zzfrs;
import com.google.android.gms.internal.ads.zzfrw;
import com.google.android.gms.internal.ads.zzfrx;
import com.google.android.gms.internal.ads.zzfsk;
import com.google.protobuf.A0;
import com.google.protobuf.AbstractC0891a;
import com.google.protobuf.B;
import com.google.protobuf.C;
import com.google.protobuf.C0917n;
import com.google.protobuf.M;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class r implements InterfaceC0852d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3290a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3291b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3292c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3293d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3294e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3295f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3296g;

    public /* synthetic */ r() {
        this.f3290a = 0;
    }

    public static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        p3.f.k(str, "fullServiceName");
        sb.append(str);
        sb.append("/");
        p3.f.k(str2, "methodName");
        sb.append(str2);
        return sb.toString();
    }

    public static C0282o c() {
        C0282o c0282o = new C0282o();
        c0282o.f3010b = null;
        c0282o.f3011c = null;
        return c0282o;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0852d
    public void a(ConnectionResult connectionResult) {
        ((C0831h) this.f3296g).f11181E.post(new X(1, this, connectionResult));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005a A[Catch: IOException -> 0x004a, TryCatch #0 {IOException -> 0x004a, blocks: (B:16:0x0025, B:18:0x002a, B:22:0x0034, B:24:0x003e, B:26:0x0046, B:31:0x005a, B:33:0x0064, B:37:0x0068, B:56:0x006d, B:57:0x008d, B:59:0x004d, B:61:0x0090), top: B:15:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068 A[Catch: IOException -> 0x004a, TryCatch #0 {IOException -> 0x004a, blocks: (B:16:0x0025, B:18:0x002a, B:22:0x0034, B:24:0x003e, B:26:0x0046, B:31:0x005a, B:33:0x0064, B:37:0x0068, B:56:0x006d, B:57:0x008d, B:59:0x004d, B:61:0x0090), top: B:15:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3 A[Catch: M -> 0x00d7, TryCatch #1 {M -> 0x00d7, blocks: (B:47:0x00b0, B:49:0x00c3, B:51:0x00c8, B:52:0x00d6), top: B:46:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8 A[Catch: M -> 0x00d7, TryCatch #1 {M -> 0x00d7, blocks: (B:47:0x00b0, B:49:0x00c3, B:51:0x00c8, B:52:0x00d6), top: B:46:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006d A[Catch: IOException -> 0x004a, TryCatch #0 {IOException -> 0x004a, blocks: (B:16:0x0025, B:18:0x002a, B:22:0x0034, B:24:0x003e, B:26:0x0046, B:31:0x005a, B:33:0x0064, B:37:0x0068, B:56:0x006d, B:57:0x008d, B:59:0x004d, B:61:0x0090), top: B:15:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC0891a d(InputStream inputStream) {
        H6.b bVar;
        int i7;
        C s7;
        byte[] bArr;
        int i8;
        C0790b c0790b = (C0790b) this.f3296g;
        c0790b.getClass();
        if ((inputStream instanceof C0789a) && ((C0789a) inputStream).f10149b == c0790b.f10152a) {
            try {
                AbstractC0891a abstractC0891a = ((C0789a) inputStream).f10148a;
                if (abstractC0891a != null) {
                    return abstractC0891a;
                }
                throw new IllegalStateException("message not available");
            } catch (IllegalStateException unused) {
            }
        }
        try {
            try {
                if (inputStream instanceof I) {
                    int available = inputStream.available();
                    if (available > 0 && available <= 4194304) {
                        ThreadLocal threadLocal = C0790b.f10151d;
                        Reference reference = (Reference) threadLocal.get();
                        if (reference != null) {
                            bArr = (byte[]) reference.get();
                            if (bArr != null) {
                                if (bArr.length < available) {
                                }
                                i8 = available;
                                while (i8 > 0) {
                                    int read = inputStream.read(bArr, available - i8, i8);
                                    if (read == -1) {
                                        break;
                                    }
                                    i8 -= read;
                                }
                                if (i8 == 0) {
                                    throw new RuntimeException("size inaccurate: " + available + " != " + (available - i8));
                                }
                                bVar = H6.b.g(bArr, 0, available, false);
                                if (bVar == null) {
                                    bVar = new C0917n(inputStream);
                                }
                                i7 = c0790b.f10154c;
                                if (i7 >= 0) {
                                    if (i7 < 0) {
                                        throw new IllegalArgumentException(e1.k.d(i7, "Recursion limit cannot be negative: "));
                                    }
                                    bVar.f3425b = i7;
                                }
                                s7 = C.s(((B) c0790b.f10152a).f12097a, bVar, AbstractC0791c.f10155a);
                                if (C.m(s7, true)) {
                                    throw new M(new A0().getMessage());
                                }
                                bVar.a(0);
                                return s7;
                            }
                        }
                        bArr = new byte[available];
                        threadLocal.set(new WeakReference(bArr));
                        i8 = available;
                        while (i8 > 0) {
                        }
                        if (i8 == 0) {
                        }
                    } else if (available == 0) {
                        return c0790b.f10153b;
                    }
                }
                s7 = C.s(((B) c0790b.f10152a).f12097a, bVar, AbstractC0791c.f10155a);
                if (C.m(s7, true)) {
                }
            } catch (M e7) {
                throw new n0(l0.f6543m.g("Invalid protobuf byte sequence").f(e7));
            }
            bVar = null;
            if (bVar == null) {
            }
            i7 = c0790b.f10154c;
            if (i7 >= 0) {
            }
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    public C0789a e(C c3) {
        C0790b c0790b = (C0790b) this.f3295f;
        c0790b.getClass();
        return new C0789a(c3, c0790b.f10152a);
    }

    public void f(ConnectionResult connectionResult) {
        D d7 = (D) ((C0831h) this.f3296g).f11177A.get((C0824a) this.f3292c);
        if (d7 != null) {
            com.google.android.gms.common.internal.D.c(d7.f11103D.f11181E);
            com.google.android.gms.common.api.g gVar = d7.f11105b;
            gVar.disconnect("onSignInFailed for " + gVar.getClass().getName() + " with " + String.valueOf(connectionResult));
            d7.m(connectionResult, null);
        }
    }

    public void g(String str, String str2) {
        J.k(str);
        if (((zzceb) this.f3294e) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            zzbza.zzf.execute(new q(this, "onError", hashMap, 0));
        }
    }

    public void h(zzceb zzcebVar, zzfrs zzfrsVar) {
        if (zzcebVar == null) {
            g("adWebview missing", "onLMDShow");
            return;
        }
        this.f3294e = zzcebVar;
        if (!this.f3293d && !i(zzcebVar.getContext())) {
            g("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlx)).booleanValue()) {
            this.f3292c = zzfrsVar.zzh();
        }
        if (((R4.c) this.f3296g) == null) {
            this.f3296g = new R4.c(this, 6);
        }
        zzfqy zzfqyVar = (zzfqy) this.f3295f;
        if (zzfqyVar != null) {
            zzfqyVar.zzd(zzfrsVar, (R4.c) this.f3296g);
        }
    }

    public synchronized boolean i(Context context) {
        if (!zzfsk.zza(context)) {
            return false;
        }
        try {
            this.f3295f = zzfqz.zza(context);
        } catch (NullPointerException e7) {
            J.k("Error connecting LMD Overlay service");
            E2.o.f1952C.f1961g.zzw(e7, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (((zzfqy) this.f3295f) == null) {
            this.f3293d = false;
            return false;
        }
        if (((R4.c) this.f3296g) == null) {
            this.f3296g = new R4.c(this, 6);
        }
        this.f3293d = true;
        return true;
    }

    public zzfrx j() {
        zzfrw zzc = zzfrx.zzc();
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlx)).booleanValue() || TextUtils.isEmpty((String) this.f3292c)) {
            String str = (String) this.f3291b;
            if (str != null) {
                zzc.zzb(str);
            } else {
                g("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc.zza((String) this.f3292c);
        }
        return zzc.zzc();
    }

    public String toString() {
        switch (this.f3290a) {
            case 1:
                D3.j u02 = AbstractC0603a.u0(this);
                u02.a((String) this.f3291b, "fullMethodName");
                u02.a((c0) this.f3294e, "type");
                u02.c("idempotent", false);
                u02.c("safe", false);
                u02.c("sampledToLocalTracing", this.f3293d);
                u02.a((C0790b) this.f3295f, "requestMarshaller");
                u02.a((C0790b) this.f3296g, "responseMarshaller");
                u02.a(null, "schemaDescriptor");
                u02.f1724c = true;
                return u02.toString();
            default:
                return super.toString();
        }
    }

    public r(C0831h c0831h, com.google.android.gms.common.api.g gVar, C0824a c0824a) {
        this.f3290a = 2;
        this.f3296g = c0831h;
        this.f3294e = null;
        this.f3295f = null;
        this.f3293d = false;
        this.f3291b = gVar;
        this.f3292c = c0824a;
    }

    public r(c0 c0Var, String str, C0790b c0790b, C0790b c0790b2, boolean z4) {
        this.f3290a = 1;
        new AtomicReferenceArray(2);
        p3.f.k(c0Var, "type");
        this.f3294e = c0Var;
        p3.f.k(str, "fullMethodName");
        this.f3291b = str;
        int lastIndexOf = str.lastIndexOf(47);
        this.f3292c = lastIndexOf == -1 ? null : str.substring(0, lastIndexOf);
        p3.f.k(c0790b, "requestMarshaller");
        this.f3295f = c0790b;
        p3.f.k(c0790b2, "responseMarshaller");
        this.f3296g = c0790b2;
        this.f3293d = z4;
    }
}
