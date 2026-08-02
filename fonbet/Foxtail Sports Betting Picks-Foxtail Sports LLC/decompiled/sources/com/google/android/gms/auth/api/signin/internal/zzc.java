package com.google.android.gms.auth.api.signin.internal;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-auth@@18.1.0 */
/* loaded from: classes.dex */
public final class zzc implements Runnable {
    private static final Logger zzcb = new Logger("RevokeAccessOperation", new String[0]);
    private final String zzcc;
    private final StatusPendingResult zzcd = new StatusPendingResult((GoogleApiClient) null);

    private zzc(String str) {
        this.zzcc = Preconditions.checkNotEmpty(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.RESULT_INTERNAL_ERROR;
        try {
            String valueOf = String.valueOf("https://accounts.google.com/o/oauth2/revoke?token=");
            String valueOf2 = String.valueOf(this.zzcc);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).openConnection();
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, ShareTarget.ENCODING_TYPE_URL_ENCODED);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.RESULT_SUCCESS;
            } else {
                zzcb.e("Unable to revoke access!", new Object[0]);
            }
            zzcb.d(new StringBuilder(26).append("Response Code: ").append(responseCode).toString(), new Object[0]);
        } catch (IOException e) {
            Logger logger = zzcb;
            String valueOf3 = String.valueOf(e.toString());
            logger.e(valueOf3.length() != 0 ? "IOException when revoking access: ".concat(valueOf3) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e2) {
            Logger logger2 = zzcb;
            String valueOf4 = String.valueOf(e2.toString());
            logger2.e(valueOf4.length() != 0 ? "Exception when revoking access: ".concat(valueOf4) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.zzcd.setResult(status);
    }

    public static PendingResult<Status> zzf(String str) {
        if (str == null) {
            return PendingResults.immediateFailedResult(new Status(4), null);
        }
        zzc zzcVar = new zzc(str);
        new Thread(zzcVar).start();
        return zzcVar.zzcd;
    }
}
