package T2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.A7;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.Tl;
import com.google.android.gms.internal.ads.Ul;
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
import q3.AbstractC2309b;

/* renamed from: T2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0435m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5722a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public String f5723b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f5724c = "";

    /* renamed from: d, reason: collision with root package name */
    public boolean f5725d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5726e = false;
    public String f = "";

    /* renamed from: g, reason: collision with root package name */
    public Ul f5727g;

    public static void e(Context context, String str, boolean z3, boolean z5) {
        if (context instanceof Activity) {
            L.f5672l.post(new RunnableC0434l(context, str, z3, z5));
        } else {
            U2.j.h("Can not create dialog without Activity Context");
        }
    }

    public static final String j(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", P2.o.f4767B.f4771c.x(context, str2));
        new v(context);
        t a5 = v.a(0, str, hashMap, null);
        try {
            return (String) a5.f10334k.get(((Integer) Q2.r.f5053d.f5056c.a(F7.f8670C4)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e3) {
            U2.j.g("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e3);
            a5.cancel(true);
            return null;
        } catch (TimeoutException e5) {
            U2.j.g("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e5);
            a5.cancel(true);
            return null;
        } catch (Exception e6) {
            U2.j.g("Error retrieving a response from: ".concat(String.valueOf(str)), e6);
            return null;
        }
    }

    public final void a(Context context) {
        Ul ul;
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.O8)).booleanValue() || (ul = this.f5727g) == null) {
            return;
        }
        ul.d(new BinderC0433k(this, context), Tl.f11672n);
    }

    public final void b(Context context, String str, String str2) {
        L l5 = P2.o.f4767B.f4771c;
        L.q(context, k(context, (String) Q2.r.f5053d.f5056c.a(F7.f8933y4), str, str2));
    }

    public final void c(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = k(context, (String) Q2.r.f5053d.f5056c.a(F7.f8664B4), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        L l5 = P2.o.f4767B.f4771c;
        new y(context, str, buildUpon.build().toString(), null).l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r4 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z3) {
        synchronized (this.f5722a) {
            try {
                this.f5726e = z3;
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.O8)).booleanValue()) {
                    P2.o.f4767B.f4774g.d().C(z3);
                    Ul ul = this.f5727g;
                    if (ul != null) {
                        if (!ul.f11805u) {
                            if (z3) {
                                ul.i();
                                if (!ul.f11803s) {
                                    ul.n();
                                }
                            }
                            if (!ul.f()) {
                                ul.m();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f(Context context, String str, String str2) {
        A7 a7 = F7.f8659A4;
        Q2.r rVar = Q2.r.f5053d;
        String j5 = j(context, k(context, (String) rVar.f5056c.a(a7), str, str2).toString(), str2);
        if (TextUtils.isEmpty(j5)) {
            U2.j.d("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(j5.trim()).optString("debug_mode"));
            d(equals);
            if (((Boolean) rVar.f5056c.a(F7.O8)).booleanValue()) {
                I d5 = P2.o.f4767B.f4774g.d();
                if (true != equals) {
                    str = "";
                }
                d5.B(str);
            }
            return equals;
        } catch (JSONException e3) {
            U2.j.j("Fail to get debug mode response json.", e3);
            return false;
        }
    }

    public final boolean g() {
        boolean z3;
        synchronized (this.f5722a) {
            z3 = this.f5726e;
        }
        return z3;
    }

    public final boolean h() {
        boolean z3;
        synchronized (this.f5722a) {
            z3 = this.f5725d;
        }
        return z3;
    }

    public final boolean i(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !h()) {
            return false;
        }
        U2.j.d("Sending troubleshooting signals to the server.");
        c(context, str, str2, str3);
        return true;
    }

    public final Uri k(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f5722a) {
            if (TextUtils.isEmpty(this.f5723b)) {
                L l5 = P2.o.f4767B.f4771c;
                try {
                    FileInputStream openFileInput = context.openFileInput("debug_signals_id.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    AbstractC2309b.d(openFileInput, byteArrayOutputStream, true);
                    str5 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                } catch (IOException unused) {
                    U2.j.d("Error reading from internal storage.");
                    str5 = "";
                }
                this.f5723b = str5;
                if (TextUtils.isEmpty(str5)) {
                    L l6 = P2.o.f4767B.f4771c;
                    String uuid = UUID.randomUUID().toString();
                    this.f5723b = uuid;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(uuid.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e3) {
                        U2.j.g("Error writing to file in internal storage.", e3);
                    }
                }
            }
            str4 = this.f5723b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }
}
