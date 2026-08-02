package p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ry1 extends k62 {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f6990m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ry1(x62 x62Var, int i) {
        super(x62Var);
        this.f6990m = i;
    }

    @Override // p000.k62
    /* JADX INFO: renamed from: D */
    public final void mo34D() {
        int i = this.f6990m;
    }

    /* JADX INFO: renamed from: E */
    public boolean m4429E() {
        m2988B();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((f02) this.f7192j).f2242j.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: H */
    public void m4430H(String str, m62 m62Var, e02 e02Var, ny1 ny1Var) {
        String str2;
        String str3 = m62Var.f4988a;
        f02 f02Var = (f02) this.f7192j;
        mo11z();
        m2988B();
        try {
            URL url = new URI(str3).toURL();
            this.f1566k.m5570k0();
            byte[] bArrM1274a = e02Var.m1274a();
            a02 a02Var = f02Var.f2248p;
            f02.m1560m(a02Var);
            Map map = m62Var.f4989b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                a02Var.m9M(new py1(this, str2, url, bArrM1274a, map, ny1Var));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                ky1 ky1Var = f02Var.f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4600o.m5314c(ky1.m3106I(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }

    /* JADX INFO: renamed from: F */
    private final void m4427F() {
    }

    /* JADX INFO: renamed from: G */
    private final void m4428G() {
    }
}
