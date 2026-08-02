package com.google.android.gms.auth.api.signin.internal;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0846u;
import com.google.android.gms.common.internal.C0875q;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes4.dex */
public final class e implements Runnable {
    public static final com.google.android.gms.common.logging.a c = new com.google.android.gms.common.logging.a("RevokeAccessOperation", new String[0]);
    public final String a;
    public final C0846u b;

    public e(String str) {
        C0875q.d(str);
        this.a = str;
        this.b = new C0846u(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.logging.a aVar = c;
        Status status = Status.i;
        try {
            String str = this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
            sb.append("https://accounts.google.com/o/oauth2/revoke?token=");
            sb.append(str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
            httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_TYPE, ShareTarget.ENCODING_TYPE_URL_ENCODED);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                aVar.b("Unable to revoke access!", new Object[0]);
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(responseCode).length() + 15);
            sb2.append("Response Code: ");
            sb2.append(responseCode);
            aVar.a(sb2.toString(), new Object[0]);
        } catch (IOException e) {
            aVar.b("IOException when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]);
        } catch (Exception e2) {
            aVar.b("Exception when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]);
        }
        this.b.setResult(status);
    }
}
