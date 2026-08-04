package J2;

import F2.C0252s;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes.dex */
public final class n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3832a;

    public n(String str) {
        this.f3832a = str;
    }

    @Override // J2.c
    public final m zza(String str) {
        m mVar = m.f3829c;
        m mVar2 = m.f3828b;
        try {
            j.b("Pinging URL: " + str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URI(str).toURL().openConnection();
            try {
                d dVar = C0252s.f2717f.f2718a;
                String str2 = this.f3832a;
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setReadTimeout(60000);
                if (str2 != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str2);
                }
                httpURLConnection.setUseCaches(false);
                g gVar = new g();
                gVar.a(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                gVar.b(httpURLConnection, responseCode);
                if (responseCode < 200 || responseCode >= 300) {
                    j.g("Received non-success response code " + responseCode + " from pinging URL: " + str);
                    if (responseCode == 502) {
                        mVar2 = mVar;
                    }
                } else {
                    mVar2 = m.f3827a;
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e7) {
            e = e7;
            j.g("Error while pinging URL: " + str + ". " + e.getMessage());
            return mVar;
        } catch (IndexOutOfBoundsException e8) {
            e = e8;
            j.g("Error while parsing ping URL: " + str + ". " + e.getMessage());
        } catch (RuntimeException e9) {
            e = e9;
            j.g("Error while pinging URL: " + str + ". " + e.getMessage());
            return mVar;
        } catch (URISyntaxException e10) {
            e = e10;
            j.g("Error while parsing ping URL: " + str + ". " + e.getMessage());
        } catch (Throwable th) {
            throw th;
        }
        return mVar2;
    }
}
