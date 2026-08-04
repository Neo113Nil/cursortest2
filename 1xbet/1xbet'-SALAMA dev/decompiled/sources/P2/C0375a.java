package P2;

import D6.y0;
import F2.C0254t;
import I2.P;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbed;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzdqv;
import com.google.android.gms.internal.ads.zzfbe;
import com.google.android.gms.internal.ads.zzfia;
import com.google.android.gms.internal.ads.zzgbn;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: P2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0375a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebView f5461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzauo f5462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzfbe f5463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzdqv f5465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zzgbn f5467h = zzbza.zzf;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zzfia f5468i;
    public final G j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final B f5469k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final E f5470l;

    public C0375a(WebView webView, zzauo zzauoVar, zzdqv zzdqvVar, zzfia zzfiaVar, zzfbe zzfbeVar, G g3, B b7, E e7) {
        this.f5461b = webView;
        Context context = webView.getContext();
        this.f5460a = context;
        this.f5462c = zzauoVar;
        this.f5465f = zzdqvVar;
        zzbby.zza(context);
        zzbbp zzbbpVar = zzbby.zzjC;
        C0254t c0254t = C0254t.f2723d;
        this.f5464e = ((Integer) c0254t.f2726c.zzb(zzbbpVar)).intValue();
        this.f5466g = ((Boolean) c0254t.f2726c.zzb(zzbby.zzjD)).booleanValue();
        this.f5468i = zzfiaVar;
        this.f5463d = zzfbeVar;
        this.j = g3;
        this.f5469k = b7;
        this.f5470l = e7;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            E2.o oVar = E2.o.f1952C;
            oVar.j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strZzd = this.f5462c.zzc().zzd(this.f5460a, str, this.f5461b);
            if (this.f5466g) {
                oVar.j.getClass();
                Q0.a.n0(this.f5465f, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strZzd;
        } catch (RuntimeException e7) {
            int i7 = I2.J.f3546b;
            J2.j.e("Exception getting click signals. ", e7);
            E2.o.f1952C.f1961g.zzw(e7, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(String str, int i7) {
        if (i7 <= 0) {
            String strD = p031e1.k.d(i7, "Invalid timeout for getting click signals. Timeout=");
            int i8 = I2.J.f3546b;
            J2.j.d(strD);
            return "";
        }
        try {
            return (String) zzbza.zza.zzb(new E2.f(3, this, str)).get(Math.min(i7, this.f5464e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            int i9 = I2.J.f3546b;
            J2.j.e("Exception getting click signals with timeout. ", e7);
            E2.o.f1952C.f1961g.zzw(e7, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e7 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        P p5 = E2.o.f1952C.f1957c;
        String string = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        y yVar = new y(this, string);
        if (((Boolean) zzbed.zzd.zze()).booleanValue()) {
            this.j.b(this.f5461b, yVar);
        } else {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjF)).booleanValue()) {
                this.f5467h.execute(new H2.q(this, bundle, yVar, 2));
            } else {
                R2.a.a(this.f5460a, new p167y2.i((p167y2.h) new p167y2.h(6).a(bundle, AdMobAdapter.class)), yVar);
            }
        }
        return string;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            E2.o oVar = E2.o.f1952C;
            oVar.j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strZzh = this.f5462c.zzc().zzh(this.f5460a, this.f5461b, null);
            if (this.f5466g) {
                oVar.j.getClass();
                Q0.a.n0(this.f5465f, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strZzh;
        } catch (RuntimeException e7) {
            int i7 = I2.J.f3546b;
            J2.j.e("Exception getting view signals. ", e7);
            E2.o.f1952C.f1961g.zzw(e7, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i7) {
        if (i7 <= 0) {
            String strD = p031e1.k.d(i7, "Invalid timeout for getting view signals. Timeout=");
            int i8 = I2.J.f3546b;
            J2.j.d(strD);
            return "";
        }
        try {
            return (String) zzbza.zza.zzb(new E2.l(this, 2)).get(Math.min(i7, this.f5464e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            int i9 = I2.J.f3546b;
            J2.j.e("Exception getting view signals with timeout. ", e7);
            E2.o.f1952C.f1961g.zzw(e7, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e7 instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(String str) {
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjH)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzbza.zza.execute(new y0(16, this, str));
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        int i7;
        int i8;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i9 = jSONObject.getInt("x");
            int i10 = jSONObject.getInt("y");
            int i11 = jSONObject.getInt("duration_ms");
            float f7 = (float) jSONObject.getDouble("force");
            int i12 = jSONObject.getInt("type");
            try {
                if (i12 != 0) {
                    int i13 = 1;
                    if (i12 != 1) {
                        i13 = 2;
                        if (i12 != 2) {
                            i13 = 3;
                            i8 = i12 != 3 ? -1 : 0;
                            this.f5462c.zzd(MotionEvent.obtain(0L, i11, i7, i9, i10, f7, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                            return;
                        }
                    }
                    i7 = i13;
                    this.f5462c.zzd(MotionEvent.obtain(0L, i11, i7, i9, i10, f7, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                    return;
                }
                this.f5462c.zzd(MotionEvent.obtain(0L, i11, i7, i9, i10, f7, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                return;
            } catch (RuntimeException e7) {
                e = e7;
                int i14 = I2.J.f3546b;
                J2.j.e("Failed to parse the touch string. ", e);
                E2.o.f1952C.f1961g.zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
                return;
            } catch (JSONException e8) {
                e = e8;
                int i15 = I2.J.f3546b;
                J2.j.e("Failed to parse the touch string. ", e);
                E2.o.f1952C.f1961g.zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
                return;
            }
            i7 = i8;
        } catch (RuntimeException | JSONException e9) {
            e = e9;
        }
    }
}
