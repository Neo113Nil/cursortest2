package I2;

import F2.C0254t;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzdto;
import com.google.android.gms.internal.ads.zzdtp;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: I2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0306n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f3637g;

    public C0306n(int i7) {
        switch (i7) {
            case 1:
                this.f3635e = false;
                break;
            default:
                this.f3636f = new Object();
                this.f3631a = "";
                this.f3632b = "";
                this.f3634d = false;
                this.f3635e = false;
                this.f3633c = "";
                break;
        }
    }

    public static void e(Context context, String str, boolean z4, boolean z7) {
        if (context instanceof Activity) {
            P.f3579l.post(new RunnableC0305m(context, str, z4, z7));
        } else {
            int i7 = J.f3546b;
            J2.j.f("Can not create dialog without Activity Context");
        }
    }

    public static final String j(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", E2.o.f1952C.f1957c.x(context, str2));
        new x(context);
        C0313v c0313vA = x.a(0, str, map, null);
        try {
            return (String) c0313vA.get(((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzeW)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            String strValueOf = String.valueOf(str);
            int i7 = J.f3546b;
            J2.j.e("Interrupted while retrieving a response from: ".concat(strValueOf), e7);
            c0313vA.cancel(true);
            return null;
        } catch (TimeoutException e8) {
            String strValueOf2 = String.valueOf(str);
            int i8 = J.f3546b;
            J2.j.e("Timeout while retrieving a response from: ".concat(strValueOf2), e8);
            c0313vA.cancel(true);
            return null;
        } catch (Exception e9) {
            String strValueOf3 = String.valueOf(str);
            int i9 = J.f3546b;
            J2.j.e("Error retrieving a response from: ".concat(strValueOf3), e9);
            return null;
        }
    }

    public void a(Context context) {
        zzdtp zzdtpVar;
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjj)).booleanValue() || (zzdtpVar = (zzdtp) this.f3637g) == null) {
            return;
        }
        zzdtpVar.zzh(new BinderC0304l(this, context), zzdto.DEBUG_MENU);
    }

    public void b(Context context, String str, String str2) {
        P p5 = E2.o.f1952C.f1957c;
        P.q(context, k(context, (String) C0254t.f2723d.f2726c.zzb(zzbby.zzeS), str, str2));
    }

    public void c(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = k(context, (String) C0254t.f2723d.f2726c.zzb(zzbby.zzeV), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        P p5 = E2.o.f1952C.f1957c;
        new A(context, str, builderBuildUpon.build().toString(), null).zzb();
    }

    public void d(boolean z4) {
        synchronized (this.f3636f) {
            try {
                this.f3635e = z4;
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjj)).booleanValue()) {
                    ((M) E2.o.f1952C.f1961g.zzi()).r(z4);
                    zzdtp zzdtpVar = (zzdtp) this.f3637g;
                    if (zzdtpVar != null) {
                        zzdtpVar.zzl(z4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean f(Context context, String str, String str2) {
        zzbbp zzbbpVar = zzbby.zzeU;
        C0254t c0254t = C0254t.f2723d;
        String strJ = j(context, k(context, (String) c0254t.f2726c.zzb(zzbbpVar), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strJ)) {
            int i7 = J.f3546b;
            J2.j.b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strJ.trim()).optString("debug_mode"));
            d(zEquals);
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzjj)).booleanValue()) {
                L lZzi = E2.o.f1952C.f1961g.zzi();
                if (true != zEquals) {
                    str = "";
                }
                ((M) lZzi).q(str);
            }
            return zEquals;
        } catch (JSONException e7) {
            int i8 = J.f3546b;
            J2.j.h("Fail to get debug mode response json.", e7);
            return false;
        }
    }

    public boolean g() {
        boolean z4;
        synchronized (this.f3636f) {
            z4 = this.f3635e;
        }
        return z4;
    }

    public boolean h() {
        boolean z4;
        synchronized (this.f3636f) {
            z4 = this.f3634d;
        }
        return z4;
    }

    public boolean i(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !h()) {
            return false;
        }
        int i7 = J.f3546b;
        J2.j.b("Sending troubleshooting signals to the server.");
        c(context, str, str2, str3);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006f A[Catch: all -> 0x0032, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0019, B:12:0x003d, B:14:0x0045, B:16:0x0056, B:19:0x0068, B:11:0x0034, B:20:0x006f, B:21:0x0071), top: B:26:0x000b, inners: #1, #2 }] */
    public Uri k(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f3636f) {
            if (TextUtils.isEmpty(this.f3631a)) {
                P p5 = E2.o.f1952C.f1957c;
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("debug_signals_id.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    p090m3.c.e(fileInputStreamOpenFileInput, byteArrayOutputStream, true);
                    str5 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                } catch (IOException unused) {
                    int i7 = J.f3546b;
                    J2.j.b("Error reading from internal storage.");
                    str5 = "";
                }
                this.f3631a = str5;
                if (TextUtils.isEmpty(str5)) {
                    P p7 = E2.o.f1952C.f1957c;
                    String string = UUID.randomUUID().toString();
                    this.f3631a = string;
                    try {
                        FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStreamOpenFileOutput.write(string.getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e7) {
                        int i8 = J.f3546b;
                        J2.j.e("Error writing to file in internal storage.", e7);
                    }
                    str4 = this.f3631a;
                } else {
                    str4 = this.f3631a;
                }
            } else {
                str4 = this.f3631a;
            }
            throw th;
        }
        builderBuildUpon.appendQueryParameter("linkedDeviceId", str4);
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }
}
