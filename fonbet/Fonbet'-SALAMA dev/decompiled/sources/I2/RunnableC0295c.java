package I2;

import F2.C0254t;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzbby;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: I2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0295c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0303k f3594b;

    public /* synthetic */ RunnableC0295c(C0303k c0303k, int i7) {
        this.f3593a = i7;
        this.f3594b = c0303k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3593a) {
            case 0:
                C0303k c0303k = this.f3594b;
                c0303k.c(c0303k.f3614a);
                return;
            case 1:
                C0303k c0303k2 = this.f3594b;
                c0303k2.f3620g = 4;
                c0303k2.b();
                return;
            case 2:
                C0303k c0303k3 = this.f3594b;
                E2.o oVar = E2.o.f1952C;
                C0306n c0306n = oVar.f1967n;
                Context context = c0303k3.f3614a;
                String str = c0303k3.f3617d;
                String str2 = c0303k3.f3618e;
                c0306n.getClass();
                zzbbp zzbbpVar = zzbby.zzeT;
                C0254t c0254t = C0254t.f2723d;
                String j = C0306n.j(context, c0306n.k(context, (String) c0254t.f2726c.zzb(zzbbpVar), str, str2).toString(), str2);
                if (TextUtils.isEmpty(j)) {
                    int i7 = J.f3546b;
                    J2.j.b("Not linked for in app preview.");
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(j.trim());
                        String optString = jSONObject.optString("gct");
                        c0306n.f3633c = jSONObject.optString("status");
                        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzjj)).booleanValue()) {
                            boolean z4 = "0".equals(c0306n.f3633c) || "2".equals(c0306n.f3633c);
                            c0306n.d(z4);
                            ((M) oVar.f1961g.zzi()).q(!z4 ? "" : str);
                        }
                        synchronized (c0306n.f3636f) {
                            c0306n.f3632b = optString;
                        }
                        if ("2".equals(c0306n.f3633c)) {
                            int i8 = J.f3546b;
                            J2.j.b("Creative is not pushed for this device.");
                            C0306n.e(context, "There was no creative pushed from DFP to the device.", false, false);
                            return;
                        } else if ("1".equals(c0306n.f3633c)) {
                            int i9 = J.f3546b;
                            J2.j.b("The app is not linked for creative preview.");
                            c0306n.b(context, str, str2);
                            return;
                        } else {
                            if ("0".equals(c0306n.f3633c)) {
                                int i10 = J.f3546b;
                                J2.j.b("Device is linked for in app preview.");
                                C0306n.e(context, "The device is successfully linked for creative preview.", false, true);
                                return;
                            }
                            return;
                        }
                    } catch (JSONException e7) {
                        int i11 = J.f3546b;
                        J2.j.h("Fail to get in app preview response json.", e7);
                    }
                }
                C0306n.e(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                return;
            case 3:
                E2.o.f1952C.f1967n.a(this.f3594b.f3614a);
                return;
            case 4:
                C0303k c0303k4 = this.f3594b;
                c0303k4.c(c0303k4.f3614a);
                return;
            case 5:
                E2.o.f1952C.f1967n.a(this.f3594b.f3614a);
                return;
            default:
                C0303k c0303k5 = this.f3594b;
                C0306n c0306n2 = E2.o.f1952C.f1967n;
                String str3 = c0303k5.f3617d;
                String str4 = c0303k5.f3618e;
                String str5 = c0303k5.f3619f;
                boolean h6 = c0306n2.h();
                Context context2 = c0303k5.f3614a;
                boolean f7 = c0306n2.f(context2, str3, str4);
                synchronized (c0306n2.f3636f) {
                    c0306n2.f3634d = f7;
                }
                if (!c0306n2.h()) {
                    c0306n2.b(context2, str3, str4);
                    return;
                }
                if (!h6 && !TextUtils.isEmpty(str5)) {
                    c0306n2.c(context2, str4, str5, str3);
                }
                int i12 = J.f3546b;
                J2.j.b("Device is linked for debug signals.");
                C0306n.e(context2, "The device is successfully linked for troubleshooting.", false, true);
                return;
        }
    }
}
