package p033e3;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0799u;
import com.google.android.gms.common.internal.D;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p062i3.a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12655c = new a("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0799u f12657b;

    public b(String str) {
        D.e(str);
        this.f12656a = str;
        this.f12657b = new C0799u(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = f12655c;
        Status status = Status.f11079x;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f12656a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f11077e;
            } else {
                aVar.c("Unable to revoke access!", new Object[0]);
            }
            aVar.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e7) {
            aVar.c("IOException when revoking access: ".concat(String.valueOf(e7.toString())), new Object[0]);
        } catch (Exception e8) {
            aVar.c("Exception when revoking access: ".concat(String.valueOf(e8.toString())), new Object[0]);
        }
        this.f12657b.setResult(status);
    }
}
