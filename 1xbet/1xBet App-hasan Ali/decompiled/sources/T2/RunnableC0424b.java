package T2;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.A7;
import com.google.android.gms.internal.ads.F7;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: T2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0424b implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5685k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0432j f5686l;

    public /* synthetic */ RunnableC0424b(C0432j c0432j, int i) {
        this.f5685k = i;
        this.f5686l = c0432j;
    }

    private final void a() {
        C0432j c0432j = this.f5686l;
        c0432j.getClass();
        P2.o oVar = P2.o.f4767B;
        C0435m c0435m = oVar.f4780n;
        Context context = c0432j.f5706a;
        String str = c0432j.f5709d;
        String str2 = c0432j.f5710e;
        c0435m.getClass();
        A7 a7 = F7.f8938z4;
        Q2.r rVar = Q2.r.f5053d;
        String j5 = C0435m.j(context, c0435m.k(context, (String) rVar.f5056c.a(a7), str, str2).toString(), str2);
        if (TextUtils.isEmpty(j5)) {
            U2.j.d("Not linked for in app preview.");
        } else {
            try {
                JSONObject jSONObject = new JSONObject(j5.trim());
                String optString = jSONObject.optString("gct");
                c0435m.f = jSONObject.optString("status");
                if (((Boolean) rVar.f5056c.a(F7.O8)).booleanValue()) {
                    boolean z3 = "0".equals(c0435m.f) || "2".equals(c0435m.f);
                    c0435m.d(z3);
                    oVar.f4774g.d().B(!z3 ? "" : str);
                }
                synchronized (c0435m.f5722a) {
                    c0435m.f5724c = optString;
                }
                if ("2".equals(c0435m.f)) {
                    U2.j.d("Creative is not pushed for this device.");
                    C0435m.e(context, "There was no creative pushed from DFP to the device.", false, false);
                    return;
                } else if ("1".equals(c0435m.f)) {
                    U2.j.d("The app is not linked for creative preview.");
                    c0435m.b(context, str, str2);
                    return;
                } else {
                    if ("0".equals(c0435m.f)) {
                        U2.j.d("Device is linked for in app preview.");
                        C0435m.e(context, "The device is successfully linked for creative preview.", false, true);
                        return;
                    }
                    return;
                }
            } catch (JSONException e3) {
                U2.j.j("Fail to get in app preview response json.", e3);
            }
        }
        C0435m.e(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5685k) {
            case 0:
                C0432j c0432j = this.f5686l;
                c0432j.c(c0432j.f5706a);
                return;
            case 1:
                C0432j c0432j2 = this.f5686l;
                c0432j2.f5711g = 4;
                c0432j2.b();
                return;
            case 2:
                a();
                return;
            case 3:
                C0432j c0432j3 = this.f5686l;
                c0432j3.getClass();
                P2.o.f4767B.f4780n.a(c0432j3.f5706a);
                return;
            case 4:
                C0432j c0432j4 = this.f5686l;
                c0432j4.c(c0432j4.f5706a);
                return;
            case 5:
                C0432j c0432j5 = this.f5686l;
                c0432j5.getClass();
                P2.o.f4767B.f4780n.a(c0432j5.f5706a);
                return;
            default:
                C0432j c0432j6 = this.f5686l;
                c0432j6.getClass();
                C0435m c0435m = P2.o.f4767B.f4780n;
                String str = c0432j6.f5709d;
                String str2 = c0432j6.f5710e;
                String str3 = c0432j6.f;
                boolean h3 = c0435m.h();
                Context context = c0432j6.f5706a;
                boolean f = c0435m.f(context, str, str2);
                synchronized (c0435m.f5722a) {
                    c0435m.f5725d = f;
                }
                if (!c0435m.h()) {
                    c0435m.b(context, str, str2);
                    return;
                }
                if (!h3 && !TextUtils.isEmpty(str3)) {
                    c0435m.c(context, str2, str3, str);
                }
                U2.j.d("Device is linked for debug signals.");
                C0435m.e(context, "The device is successfully linked for troubleshooting.", false, true);
                return;
        }
    }
}
