package e2;

import A0.J0;
import A0.o1;
import B.C0080i;
import F3.y;
import H3.q;
import H3.v;
import I.O;
import K0.N;
import L4.InterfaceC0228k;
import O4.InterfaceC0267m;
import P.AbstractC0321v;
import P.AbstractC0329z;
import P0.w;
import Q2.C0375o;
import X3.z;
import a3.BinderC0468l;
import a3.u;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.AbstractC1668us;
import com.google.android.gms.internal.ads.C0809bj;
import com.google.android.gms.internal.ads.C1893zs;
import com.google.android.gms.internal.ads.Cif;
import com.google.android.gms.internal.ads.Dp;
import com.google.android.gms.internal.ads.InterfaceC0677Re;
import com.google.android.gms.internal.ads.InterfaceC1852yw;
import com.google.android.gms.internal.ads.Ix;
import com.google.android.gms.internal.ads.Jw;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import o4.AbstractC2223a;
import o4.AbstractC2234l;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import t3.AbstractC2425d;
import y4.A;
import y4.B;
import y4.C;

/* renamed from: e2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1930k implements WebMessageListenerBoundaryInterface, C2.i, q, InterfaceC0267m, Cif, InterfaceC1852yw, Jw, k1.b {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16909k;

    /* renamed from: l, reason: collision with root package name */
    public Object f16910l;

    public /* synthetic */ C1930k(int i, Object obj) {
        this.f16909k = i;
        this.f16910l = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1852yw, com.google.android.gms.internal.ads.InterfaceC1805xu
    /* renamed from: a */
    public E3.a mo12a() {
        BinderC0468l binderC0468l = (BinderC0468l) this.f16910l;
        return (E3.a) binderC0468l.u3(binderC0468l.f6569m, null, "BANNER", null, null, 0, null, new Bundle(), null).f10661W.d();
    }

    public synchronized void b(C c5) {
        kotlin.jvm.internal.l.f("route", c5);
        ((LinkedHashSet) this.f16910l).remove(c5);
    }

    @Override // k1.b
    public Cursor c(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f16910l;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e3) {
            Log.w("FontsProvider", "Unable to query the content provider", e3);
            return null;
        }
    }

    @Override // k1.b
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f16910l;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    public void d() {
        ((AbstractC0321v) this.f16910l).getClass();
    }

    public void e(byte b3) {
        ((Parcel) this.f16910l).writeByte(b3);
    }

    public void f(float f) {
        ((Parcel) this.f16910l).writeFloat(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r4 == null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // O4.InterfaceC0267m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(Object obj) {
        Charset charset;
        String str;
        B b3 = (B) obj;
        A a5 = b3.f21281k;
        if (a5 == null) {
            InterfaceC0228k f = b3.f();
            y4.q d5 = b3.d();
            if (d5 != null) {
                charset = AbstractC2223a.f18653a;
                String[] strArr = d5.f21374c;
                int i = 0;
                int A3 = G4.l.A(0, strArr.length - 1, 2);
                if (A3 >= 0) {
                    while (!AbstractC2234l.s0(strArr[i], "charset", true)) {
                        if (i != A3) {
                            i += 2;
                        }
                    }
                    str = strArr[i + 1];
                    if (str != null) {
                        try {
                            charset = Charset.forName(str);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                str = null;
                if (str != null) {
                }
            }
            charset = AbstractC2223a.f18653a;
            a5 = new A(f, charset);
            b3.f21281k = a5;
        }
        N3.a aVar = new N3.a(a5);
        aVar.f3777y = 2;
        try {
            Object a6 = ((y) this.f16910l).a(aVar);
            if (aVar.K() == 10) {
                return a6;
            }
            throw new F3.p("JSON document was not fully consumed.");
        } finally {
            b3.close();
        }
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // C2.i
    public void h(C2.b bVar, Bitmap bitmap, Map map) {
        ((C2.h) this.f16910l).i(bVar, bitmap, map, AbstractC2425d.s(bitmap));
    }

    public void i(long j5) {
        long b3 = W0.o.b(j5);
        byte b5 = 0;
        if (!W0.p.a(b3, 0L)) {
            if (W0.p.a(b3, 4294967296L)) {
                b5 = 1;
            } else if (W0.p.a(b3, 8589934592L)) {
                b5 = 2;
            }
        }
        e(b5);
        if (W0.p.a(W0.o.b(j5), 0L)) {
            return;
        }
        f(W0.o.c(j5));
    }

    public void j(long j5) {
        long j6 = 63 & j5;
        if (Long.compare(Long.MIN_VALUE ^ j6, -9223372036854775792L) >= 0) {
            j5 = (j5 & (-64)) | (j6 - 1);
        }
        ((Parcel) this.f16910l).writeLong(j5);
    }

    @Override // H3.q
    public Object k() {
        switch (this.f16909k) {
            case 9:
                Class cls = (Class) this.f16910l;
                try {
                    return v.f2364a.a(cls);
                } catch (Exception e3) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e3);
                }
            default:
                Type type = (Type) this.f16910l;
                if (!(type instanceof ParameterizedType)) {
                    throw new F3.p("Invalid EnumSet type: " + type.toString());
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new F3.p("Invalid EnumSet type: " + type.toString());
        }
    }

    public void l(View view, int i, boolean z3) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.f16910l).notifyViewVisibilityChanged(view, i, z3);
        }
    }

    @Override // com.google.android.gms.internal.ads.Cif
    public void n(String str, int i, String str2, boolean z3) {
        InterfaceC0677Re interfaceC0677Re = ((S2.d) this.f16910l).f5300n;
        if (interfaceC0677Re != null) {
            interfaceC0677Re.X();
        }
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public /* synthetic */ void mo14o(Object obj) {
        ((C0809bj) this.f16910l).p1((u) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105 A[ORIG_RETURN, RETURN] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z3, InvocationHandler invocationHandler2) {
        C2.h hVar;
        C2.h hVar2;
        C1893zs c1893zs;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) N4.b.m(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        J0[] j0Arr = new J0[ports.length];
        for (int i = 0; i < ports.length; i++) {
            InvocationHandler invocationHandler3 = ports[i];
            J0 j02 = new J0();
            j02.f304k = (WebMessagePortBoundaryInterface) N4.b.m(WebMessagePortBoundaryInterface.class, invocationHandler3);
            j0Arr[i] = j02;
        }
        if (AbstractC1933n.f16912a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) N4.b.m(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                hVar = new C2.h(10, webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    hVar2 = null;
                    if (hVar2 == null) {
                        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) N4.b.m(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        Dp dp = (Dp) this.f16910l;
                        int i5 = hVar2.f833l;
                        if (i5 != 0) {
                            StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
                            sb.append(i5 != 0 ? i5 != 1 ? "Unknown" : "ArrayBuffer" : "String");
                            sb.append(" expected, but got ");
                            sb.append("String");
                            throw new IllegalStateException(sb.toString());
                        }
                        try {
                            JSONObject jSONObject = new JSONObject((String) hVar2.f834m);
                            String string = jSONObject.getString("method");
                            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
                            boolean equals = string.equals("startSession");
                            C0375o c0375o = (C0375o) dp.f8377l;
                            if (equals) {
                                C0375o.Q(c0375o, string2);
                                return;
                            } else {
                                if (string.equals("finishSession") && (c1893zs = (C1893zs) ((HashMap) c0375o.f5045o).get(string2)) != null) {
                                    c1893zs.a();
                                    ((HashMap) c0375o.f5045o).remove(string2);
                                    return;
                                }
                                return;
                            }
                        } catch (JSONException e3) {
                            AbstractC1668us.q("Error parsing JS message in JavaScriptSessionService.", e3);
                            return;
                        }
                    }
                    return;
                }
                hVar = new C2.h(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
            }
        } else {
            hVar = new C2.h(10, webMessageBoundaryInterface.getData());
        }
        hVar2 = hVar;
        if (hVar2 == null) {
        }
    }

    @Override // C2.i
    public C2.c p(C2.b bVar) {
        return null;
    }

    public void r(w wVar, long j5, boolean z3, o1 o1Var) {
        ((O) this.f16910l).n(N.b(O.a((O) this.f16910l, wVar, j5, z3, false, o1Var, false)) ? E.O.f1066m : E.O.f1065l);
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
        C0809bj c0809bj = (C0809bj) this.f16910l;
        String message = th.getMessage();
        synchronized (c0809bj) {
            c0809bj.n1(new Ix(message, 6));
        }
    }

    public /* synthetic */ C1930k(int i, boolean z3) {
        this.f16909k = i;
    }

    public C1930k(F3.m mVar, y yVar) {
        this.f16909k = 14;
        this.f16910l = yVar;
    }

    public C1930k(int i) {
        this.f16909k = i;
        switch (i) {
            case 5:
                this.f16910l = new LinkedHashSet();
                break;
            case 8:
                this.f16910l = AbstractC0329z.t(Boolean.FALSE);
                break;
            case 18:
                this.f16910l = new ConcurrentHashMap();
                new AtomicInteger(0);
                break;
            default:
                this.f16910l = new R.e(new C0080i[16]);
                break;
        }
    }

    public C1930k(E2.n nVar) {
        this.f16909k = 7;
        this.f16910l = z.U(nVar.f1476k);
    }

    public C1930k(Context context, Uri uri) {
        this.f16909k = 28;
        this.f16910l = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public void q() {
    }

    @Override // C2.i
    public void m(int i) {
    }
}
