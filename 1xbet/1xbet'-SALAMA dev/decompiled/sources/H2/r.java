package H2;

import F2.C0254t;
import G4.C0282o;
import I2.J;
import U5.I;
import U5.c0;
import U5.l0;
import U5.n0;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C0780a;
import com.google.android.gms.common.api.internal.C0787h;
import com.google.android.gms.common.api.internal.D;
import com.google.android.gms.common.api.internal.X;
import com.google.android.gms.common.internal.InterfaceC0808d;
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
import com.google.protobuf.AbstractC0847a;
import com.google.protobuf.B;
import com.google.protobuf.C;
import com.google.protobuf.C0873n;
import com.google.protobuf.M;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class r implements InterfaceC0808d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f3296g;

    public /* synthetic */ r() {
        this.f3290a = 0;
    }

    public static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        p113p3.f.k(str, "fullServiceName");
        sb.append(str);
        sb.append("/");
        p113p3.f.k(str2, "methodName");
        sb.append(str2);
        return sb.toString();
    }

    public static C0282o c() {
        C0282o c0282o = new C0282o();
        c0282o.f3010b = null;
        c0282o.f3011c = null;
        return c0282o;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0808d
    public void a(ConnectionResult connectionResult) {
        ((C0787h) this.f3296g).f11181E.post(new X(1, this, connectionResult));
    }

    public AbstractC0847a d(InputStream inputStream) {
        H6.b c0873n;
        byte[] bArr;
        p016b6.b bVar = (p016b6.b) this.f3296g;
        bVar.getClass();
        if ((inputStream instanceof p016b6.a) && ((p016b6.a) inputStream).f10149b == bVar.f10152a) {
            try {
                AbstractC0847a abstractC0847a = ((p016b6.a) inputStream).f10148a;
                if (abstractC0847a != null) {
                    return abstractC0847a;
                }
                throw new IllegalStateException("message not available");
            } catch (IllegalStateException unused) {
            }
        }
        try {
            if (inputStream instanceof I) {
                int iAvailable = inputStream.available();
                if (iAvailable <= 0 || iAvailable > 4194304) {
                    if (iAvailable == 0) {
                        return bVar.f10153b;
                    }
                    c0873n = null;
                } else {
                    ThreadLocal threadLocal = p016b6.b.f10151d;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i7 = iAvailable;
                    while (i7 > 0) {
                        int i8 = inputStream.read(bArr, iAvailable - i7, i7);
                        if (i8 == -1) {
                            break;
                        }
                        i7 -= i8;
                    }
                    if (i7 != 0) {
                        throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i7));
                    }
                    c0873n = H6.b.g(bArr, 0, iAvailable, false);
                }
            } else {
                c0873n = null;
            }
            if (c0873n == null) {
                c0873n = new C0873n(inputStream);
            }
            int i9 = bVar.f10154c;
            if (i9 >= 0) {
                if (i9 < 0) {
                    throw new IllegalArgumentException(p031e1.k.d(i9, "Recursion limit cannot be negative: "));
                }
                c0873n.f3425b = i9;
            }
            try {
                C cS = C.s(((B) bVar.f10152a).f12097a, c0873n, p016b6.c.f10155a);
                if (!C.m(cS, true)) {
                    throw new M(new A0().getMessage());
                }
                c0873n.a(0);
                return cS;
            } catch (M e7) {
                throw new n0(l0.f6543m.g("Invalid protobuf byte sequence").f(e7));
            }
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    public p016b6.a e(C c3) {
        p016b6.b bVar = (p016b6.b) this.f3295f;
        bVar.getClass();
        return new p016b6.a(c3, bVar.f10152a);
    }

    public void f(ConnectionResult connectionResult) {
        D d7 = (D) ((C0787h) this.f3296g).f11177A.get((C0780a) this.f3292c);
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
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            zzbza.zzf.execute(new q(this, "onError", map, 0));
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
        zzfrw zzfrwVarZzc = zzfrx.zzc();
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlx)).booleanValue() || TextUtils.isEmpty((String) this.f3292c)) {
            String str = (String) this.f3291b;
            if (str != null) {
                zzfrwVarZzc.zzb(str);
            } else {
                g("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzfrwVarZzc.zza((String) this.f3292c);
        }
        return zzfrwVarZzc.zzc();
    }

    public String toString() {
        switch (this.f3290a) {
            case 1:
                D3.j jVarU0 = p003a.a.u0(this);
                jVarU0.a((String) this.f3291b, "fullMethodName");
                jVarU0.a((c0) this.f3294e, "type");
                jVarU0.c("idempotent", false);
                jVarU0.c("safe", false);
                jVarU0.c("sampledToLocalTracing", this.f3293d);
                jVarU0.a((p016b6.b) this.f3295f, "requestMarshaller");
                jVarU0.a((p016b6.b) this.f3296g, "responseMarshaller");
                jVarU0.a(null, "schemaDescriptor");
                jVarU0.f1724c = true;
                return jVarU0.toString();
            default:
                return super.toString();
        }
    }

    public r(C0787h c0787h, com.google.android.gms.common.api.g gVar, C0780a c0780a) {
        this.f3290a = 2;
        this.f3296g = c0787h;
        this.f3294e = null;
        this.f3295f = null;
        this.f3293d = false;
        this.f3291b = gVar;
        this.f3292c = c0780a;
    }

    public r(c0 c0Var, String str, p016b6.b bVar, p016b6.b bVar2, boolean z4) {
        this.f3290a = 1;
        new AtomicReferenceArray(2);
        p113p3.f.k(c0Var, "type");
        this.f3294e = c0Var;
        p113p3.f.k(str, "fullMethodName");
        this.f3291b = str;
        int iLastIndexOf = str.lastIndexOf(47);
        this.f3292c = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        p113p3.f.k(bVar, "requestMarshaller");
        this.f3295f = bVar;
        p113p3.f.k(bVar2, "responseMarshaller");
        this.f3296g = bVar2;
        this.f3293d = z4;
    }
}
