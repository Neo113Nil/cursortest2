package N2;

import U2.m;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c extends Thread {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3757k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Serializable f3758l;

    public /* synthetic */ c(int i, Serializable serializable) {
        this.f3757k = i;
        this.f3758l = serializable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.f3757k) {
            case 0:
                Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                HashMap hashMap = (HashMap) this.f3758l;
                for (String str : hashMap.keySet()) {
                    buildUpon.appendQueryParameter(str, (String) hashMap.get(str));
                }
                String uri = buildUpon.build().toString();
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode < 200 || responseCode >= 300) {
                            StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 65);
                            sb.append("Received non-success response code ");
                            sb.append(responseCode);
                            sb.append(" from pinging URL: ");
                            sb.append(uri);
                            Log.w("HttpUrlPinger", sb.toString());
                        }
                        httpURLConnection.disconnect();
                        return;
                    } catch (Throwable th) {
                        httpURLConnection.disconnect();
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    String message = e.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + String.valueOf(uri).length() + 27);
                    sb2.append("Error while pinging URL: ");
                    sb2.append(uri);
                    sb2.append(". ");
                    sb2.append(message);
                    Log.w("HttpUrlPinger", sb2.toString(), e);
                    return;
                } catch (IndexOutOfBoundsException e5) {
                    String message2 = e5.getMessage();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + String.valueOf(uri).length() + 32);
                    sb3.append("Error while parsing ping URL: ");
                    sb3.append(uri);
                    sb3.append(". ");
                    sb3.append(message2);
                    Log.w("HttpUrlPinger", sb3.toString(), e5);
                    return;
                } catch (RuntimeException e6) {
                    e = e6;
                    String message3 = e.getMessage();
                    StringBuilder sb22 = new StringBuilder(String.valueOf(message3).length() + String.valueOf(uri).length() + 27);
                    sb22.append("Error while pinging URL: ");
                    sb22.append(uri);
                    sb22.append(". ");
                    sb22.append(message3);
                    Log.w("HttpUrlPinger", sb22.toString(), e);
                    return;
                } finally {
                }
            default:
                new m(null).d((String) this.f3758l);
                return;
        }
    }
}
