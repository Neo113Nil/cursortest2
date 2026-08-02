package e3;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0843u;
import com.google.android.gms.common.internal.D;
import i3.C1263a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: e3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1017b implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final C1263a f12649c = new C1263a("RevokeAccessOperation", new String[0]);

    /* renamed from: a, reason: collision with root package name */
    public final String f12650a;

    /* renamed from: b, reason: collision with root package name */
    public final C0843u f12651b;

    public RunnableC1017b(String str) {
        D.e(str);
        this.f12650a = str;
        this.f12651b = new C0843u(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1263a c1263a = f12649c;
        Status status = Status.f11079x;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f12650a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f11077e;
            } else {
                c1263a.c("Unable to revoke access!", new Object[0]);
            }
            c1263a.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e7) {
            c1263a.c("IOException when revoking access: ".concat(String.valueOf(e7.toString())), new Object[0]);
        } catch (Exception e8) {
            c1263a.c("Exception when revoking access: ".concat(String.valueOf(e8.toString())), new Object[0]);
        }
        this.f12651b.setResult((C0843u) status);
    }
}
