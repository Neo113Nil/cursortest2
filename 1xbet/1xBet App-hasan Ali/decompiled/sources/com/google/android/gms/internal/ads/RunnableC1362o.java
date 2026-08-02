package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1362o implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14737k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f14738l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f14739m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f14740n;

    public RunnableC1362o(TextureViewSurfaceTextureListenerC0683Sd textureViewSurfaceTextureListenerC0683Sd, String str, String str2) {
        this.f14737k = 3;
        this.f14738l = str;
        this.f14739m = str2;
        this.f14740n = textureViewSurfaceTextureListenerC0683Sd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B3 b3;
        int i = 0;
        switch (this.f14737k) {
            case 0:
                C0709Wb c0709Wb = (C0709Wb) this.f14738l;
                c0709Wb.getClass();
                int i5 = AbstractC1260lo.f14419a;
                SE se = ((SurfaceHolderCallbackC0974fE) c0709Wb.f12041m).f13463k.f13883A;
                OE l5 = se.l();
                se.i(l5, 1017, new Dp(l5, (C1407p) this.f14739m, (TD) this.f14740n));
                return;
            case 1:
                ((A3) this.f14738l).l();
                P.W w5 = (P.W) this.f14739m;
                C3 c32 = (C3) w5.f4414n;
                if (c32 == null) {
                    ((A3) this.f14738l).e(w5.f4412l);
                } else {
                    A3 a32 = (A3) this.f14738l;
                    synchronized (a32.f7523o) {
                        b3 = a32.f7524p;
                    }
                    b3.n(c32);
                }
                if (((P.W) this.f14739m).f4411k) {
                    ((A3) this.f14738l).d("intermediate-response");
                } else {
                    ((A3) this.f14738l).f("done");
                }
                Kw kw = (Kw) this.f14740n;
                if (kw != null) {
                    kw.run();
                    return;
                }
                return;
            case 2:
                T5 t5 = (T5) this.f14738l;
                WebView webView = (WebView) this.f14739m;
                if (webView.getSettings().getJavaScriptEnabled()) {
                    try {
                        webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", t5);
                        return;
                    } catch (Throwable unused) {
                        t5.onReceiveValue("");
                        return;
                    }
                }
                return;
            case 3:
                C0711Wd c0711Wd = ((TextureViewSurfaceTextureListenerC0683Sd) this.f14740n).f11553z;
                if (c0711Wd != null) {
                    c0711Wd.c("error", "what", (String) this.f14738l, "extra", (String) this.f14739m);
                    return;
                }
                return;
            case 4:
                ((ViewTreeObserverOnGlobalLayoutListenerC0805bf) this.f14738l).Q((String) this.f14739m, (ValueCallback) this.f14740n);
                return;
            case 5:
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_state", (Integer) 1);
                String[] strArr = {(String) this.f14739m};
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f14738l;
                sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", strArr);
                Xm.f(sQLiteDatabase, (U2.m) this.f14740n);
                return;
            case 6:
                Gn gn = (Gn) this.f14738l;
                E3.a l02 = AbstractC1400ot.l0(gn.f9261b.b((Sq) this.f14739m, (Lq) this.f14740n), r2.f10480R, TimeUnit.SECONDS, gn.f9264e);
                l02.a(new Kw(i, l02, new Mt(28, gn)), gn.f9262c);
                return;
            case 7:
                Wt wt = (Wt) this.f14739m;
                A0.J0 j02 = (A0.J0) this.f14740n;
                C0908du c0908du = (C0908du) this.f14738l;
                String str = c0908du.f13201b;
                try {
                    C0802bc c0802bc = c0908du.f13200a;
                    if (c0802bc == null) {
                        throw null;
                    }
                    Vt vt = (Vt) c0802bc.f12830t;
                    if (vt == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str);
                    C0908du.b(wt.f12122a, new C0820bu(6, bundle));
                    C0908du.b(wt.f12123b, new C0820bu(7, bundle));
                    BinderC0864cu binderC0864cu = new BinderC0864cu(c0908du, j02);
                    Tt tt = (Tt) vt;
                    Parcel N5 = tt.N();
                    F5.c(N5, bundle);
                    F5.e(N5, binderC0864cu);
                    tt.h1(N5, 2);
                    return;
                } catch (RemoteException e3) {
                    C0908du.f13198c.b(e3, "dismiss overlay display from: %s", str);
                    return;
                }
            case 8:
                Yt yt = (Yt) this.f14739m;
                A0.J0 j03 = (A0.J0) this.f14740n;
                C0908du c0908du2 = (C0908du) this.f14738l;
                String str2 = c0908du2.f13201b;
                try {
                    C0802bc c0802bc2 = c0908du2.f13200a;
                    if (c0802bc2 == null) {
                        throw null;
                    }
                    Vt vt2 = (Vt) c0802bc2.f12830t;
                    if (vt2 == null) {
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("callerPackage", str2);
                    bundle2.putBinder("windowToken", yt.f12370a);
                    C0908du.b(yt.f, new C0820bu(8, bundle2));
                    bundle2.putInt("layoutGravity", yt.f12372c);
                    bundle2.putFloat("layoutVerticalMargin", yt.f12373d);
                    bundle2.putInt("displayMode", 0);
                    bundle2.putInt("triggerMode", 0);
                    bundle2.putInt("windowWidthPx", yt.f12374e);
                    C0908du.b(null, new C0820bu(1, bundle2));
                    C0908du.b(null, new C0820bu(2, bundle2));
                    C0908du.b(yt.f12371b, new C0820bu(3, bundle2));
                    C0908du.b(null, new C0820bu(4, bundle2));
                    bundle2.putBoolean("stableSessionToken", true);
                    BinderC0864cu binderC0864cu2 = new BinderC0864cu(c0908du2, j03);
                    Tt tt2 = (Tt) vt2;
                    Parcel N6 = tt2.N();
                    N6.writeString(str2);
                    F5.c(N6, bundle2);
                    F5.e(N6, binderC0864cu2);
                    tt2.h1(N6, 1);
                    return;
                } catch (RemoteException e5) {
                    C0908du.f13198c.b(e5, "show overlay display from: %s", str2);
                    return;
                }
            case 9:
                C1691vE c1691vE = (C1691vE) this.f14738l;
                c1691vE.getClass();
                C1761wv f = ((C0909dv) this.f14739m).f();
                SE se2 = c1691vE.f15989c;
                ME me = se2.f11526g;
                me.getClass();
                C1324n6 c1324n6 = se2.f11524d;
                c1324n6.getClass();
                c1324n6.f14579l = AbstractC1044gv.l(f);
                if (!f.isEmpty()) {
                    c1324n6.f14582o = (C1603tG) f.get(0);
                    C1603tG c1603tG = (C1603tG) this.f14740n;
                    c1603tG.getClass();
                    c1324n6.f14583p = c1603tG;
                }
                if (((C1603tG) c1324n6.f14581n) == null) {
                    c1324n6.f14581n = C1324n6.v(me, (AbstractC1044gv) c1324n6.f14579l, (C1603tG) c1324n6.f14582o, (C1785xa) c1324n6.f14578k);
                }
                c1324n6.y(me.l1());
                return;
            case 10:
                SE se3 = (SE) ((AE) this.f14738l).f7554b.f14152s;
                Pair pair = (Pair) this.f14739m;
                se3.d(((Integer) pair.first).intValue(), (C1603tG) pair.second, (C1469qG) this.f14740n);
                return;
            default:
                Er er = (Er) this.f14738l;
                er.getClass();
                int i6 = AbstractC1260lo.f14419a;
                SE se4 = ((SurfaceHolderCallbackC0974fE) er.f8618m).f13463k.f13883A;
                OE l6 = se4.l();
                se4.i(l6, 1009, new Qs(l6, (C1407p) this.f14739m, (TD) this.f14740n));
                return;
        }
    }

    public /* synthetic */ RunnableC1362o(Object obj, Object obj2, Object obj3, int i) {
        this.f14737k = i;
        this.f14738l = obj;
        this.f14739m = obj2;
        this.f14740n = obj3;
    }

    public RunnableC1362o(U5 u5, Q5 q5, WebView webView, boolean z3) {
        this.f14737k = 2;
        this.f14739m = webView;
        this.f14740n = u5;
        this.f14738l = new T5(this, q5, webView, z3);
    }
}
