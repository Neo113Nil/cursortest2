package sg.bigo.ads.d;

import android.content.Context;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.LGPD;
import com.ironsource.Y1;
import java.util.HashMap;
import org.json.JSONArray;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.ConsentOptions;
import sg.bigo.ads.X0.A;
import sg.bigo.ads.p0.AbstractC5429c;

/* renamed from: sg.bigo.ads.d.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5060f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12724a;
    public final /* synthetic */ ConsentOptions b;
    public final /* synthetic */ boolean c;

    public RunnableC5060f(Context context, ConsentOptions consentOptions, boolean z) {
        this.f12724a = context;
        this.b = consentOptions;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0052  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String valueOf;
        String str;
        String str2;
        String str3;
        String str4;
        Context context = this.f12724a;
        ConsentOptions consentOptions = this.b;
        boolean z = this.c;
        int i = AbstractC5062h.f12725a[consentOptions.ordinal()];
        if (i == 1) {
            valueOf = String.valueOf(sg.bigo.ads.F0.a.d());
            str = LGPD.LGPD_STANDARD;
        } else if (i == 2) {
            valueOf = String.valueOf(sg.bigo.ads.F0.a.a());
            str = "ccpa";
        } else if (i == 3) {
            valueOf = String.valueOf(sg.bigo.ads.F0.a.b());
            str = COPPA.COPPA_STANDARD;
        } else {
            if (i != 4) {
                str3 = "";
                str2 = str3;
                String str5 = !z ? "1" : "2";
                String str6 = A.c ? "1" : "0";
                if (AbstractC5429c.a(context)) {
                    str4 = Y1.f;
                } else {
                    str4 = String.valueOf((context == null || !sg.bigo.ads.F0.b.a()) ? AbstractC5429c.b : sg.bigo.ads.F0.a.b(context.getPackageName()));
                }
                C5063i c5063i = new C5063i(str3, str2, str5, str6, str4, (context == null && sg.bigo.ads.F0.b.a()) ? sg.bigo.ads.F0.a.c(context.getPackageName()) : AbstractC5429c.f13236a, (context == null && sg.bigo.ads.F0.b.a()) ? sg.bigo.ads.F0.a.d(context.getPackageName()) : AbstractC5429c.c);
                if (BigoAdSdk.isInitialized()) {
                    C5063i.h.add(c5063i);
                    return;
                }
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(C5063i.a(c5063i));
                hashMap.put("user_consent_event", jSONArray.toString());
                hashMap.put("uuid", sg.bigo.ads.F0.a.e());
                sg.bigo.ads.s1.b.a(hashMap);
                return;
            }
            valueOf = String.valueOf(sg.bigo.ads.F0.a.c());
            str = "gdpr";
        }
        str2 = valueOf;
        str3 = str;
        if (!z) {
        }
        String str62 = A.c ? "1" : "0";
        if (AbstractC5429c.a(context)) {
        }
        C5063i c5063i2 = new C5063i(str3, str2, str5, str62, str4, (context == null && sg.bigo.ads.F0.b.a()) ? sg.bigo.ads.F0.a.c(context.getPackageName()) : AbstractC5429c.f13236a, (context == null && sg.bigo.ads.F0.b.a()) ? sg.bigo.ads.F0.a.d(context.getPackageName()) : AbstractC5429c.c);
        if (BigoAdSdk.isInitialized()) {
        }
    }
}
