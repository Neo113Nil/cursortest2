package U2;

import Q2.C0379q;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes.dex */
public final class m implements d {

    /* renamed from: k, reason: collision with root package name */
    public final String f5886k;

    public m(String str) {
        this.f5886k = str;
    }

    @Override // U2.d
    public final l d(String str) {
        l lVar = l.f5883m;
        l lVar2 = l.f5882l;
        try {
            j.d("Pinging URL: " + str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URI(str).toURL().openConnection();
            try {
                e eVar = C0379q.f.f5048a;
                String str2 = this.f5886k;
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
                if (responseCode >= 200 && responseCode < 300) {
                    lVar2 = l.f5881k;
                    httpURLConnection.disconnect();
                    return lVar2;
                }
                j.i("Received non-success response code " + responseCode + " from pinging URL: " + str);
                if (responseCode == 502) {
                    lVar2 = lVar;
                }
                httpURLConnection.disconnect();
                return lVar2;
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            j.i("Error while pinging URL: " + str + ". " + e.getMessage());
            return lVar;
        } catch (IndexOutOfBoundsException e5) {
            e = e5;
            j.i("Error while parsing ping URL: " + str + ". " + e.getMessage());
            return lVar2;
        } catch (RuntimeException e6) {
            e = e6;
            j.i("Error while pinging URL: " + str + ". " + e.getMessage());
            return lVar;
        } catch (URISyntaxException e7) {
            e = e7;
            j.i("Error while parsing ping URL: " + str + ". " + e.getMessage());
            return lVar2;
        } finally {
        }
    }
}
