package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes8.dex */
public final class zbb implements java.lang.Runnable {
    private static final com.google.android.gms.common.logging.Logger zba = new com.google.android.gms.common.logging.Logger("RevokeAccessOperation", new java.lang.String[0]);
    private final java.lang.String zbb;
    private final com.google.android.gms.common.api.internal.StatusPendingResult zbc = new com.google.android.gms.common.api.internal.StatusPendingResult((com.google.android.gms.common.api.GoogleApiClient) null);

    public zbb(java.lang.String str) {
        this.zbb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
    }

    public static com.google.android.gms.common.api.PendingResult zba(java.lang.String str) {
        if (str == null) {
            return com.google.android.gms.common.api.PendingResults.immediateFailedResult(new com.google.android.gms.common.api.Status(4), null);
        }
        com.google.android.gms.auth.api.signin.internal.zbb zbbVar = new com.google.android.gms.auth.api.signin.internal.zbb(str);
        new java.lang.Thread(zbbVar).start();
        return zbbVar.zbc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.Status status = com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR;
        try {
            java.lang.String str = this.zbb;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 50);
            sb.append("https://accounts.google.com/o/oauth2/revoke?token=");
            sb.append(str);
            java.net.URL url = new java.net.URL(sb.toString());
            int i = com.google.android.gms.internal.p000authapi.zbbc.zbb;
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
            } else {
                zba.e("Unable to revoke access!", new java.lang.Object[0]);
            }
            com.google.android.gms.common.logging.Logger logger = zba;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(responseCode).length() + 15);
            sb2.append("Response Code: ");
            sb2.append(responseCode);
            logger.d(sb2.toString(), new java.lang.Object[0]);
        } catch (java.io.IOException e) {
            com.google.android.gms.common.logging.Logger logger2 = zba;
            java.lang.String iOException = e.toString();
            java.lang.String.valueOf(iOException);
            logger2.e("IOException when revoking access: ".concat(java.lang.String.valueOf(iOException)), new java.lang.Object[0]);
        } catch (java.lang.Exception e2) {
            com.google.android.gms.common.logging.Logger logger3 = zba;
            java.lang.String exc = e2.toString();
            java.lang.String.valueOf(exc);
            logger3.e("Exception when revoking access: ".concat(java.lang.String.valueOf(exc)), new java.lang.Object[0]);
        }
        this.zbc.setResult(status);
    }
}
