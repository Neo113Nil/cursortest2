package com.google.android.gms.ads.identifier;

/* loaded from: classes.dex */
public final class a extends java.lang.Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f2572a;

    public a(java.util.HashMap hashMap) {
        this.f2572a = hashMap;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        android.net.Uri.Builder buildUpon = android.net.Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        java.util.HashMap hashMap = this.f2572a;
        for (java.lang.String str : hashMap.keySet()) {
            buildUpon.appendQueryParameter(str, (java.lang.String) hashMap.get(str));
        }
        java.lang.String uri = buildUpon.build().toString();
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(uri).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(uri).length() + 65);
                    sb.append("Received non-success response code ");
                    sb.append(responseCode);
                    sb.append(" from pinging URL: ");
                    sb.append(uri);
                    android.util.Log.w("HttpUrlPinger", sb.toString());
                }
                httpURLConnection.disconnect();
            } catch (java.lang.Throwable th) {
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (java.io.IOException e2) {
            e = e2;
            java.lang.String message = e.getMessage();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + java.lang.String.valueOf(uri).length() + 27);
            sb2.append("Error while pinging URL: ");
            sb2.append(uri);
            sb2.append(". ");
            sb2.append(message);
            android.util.Log.w("HttpUrlPinger", sb2.toString(), e);
        } catch (java.lang.IndexOutOfBoundsException e3) {
            java.lang.String message2 = e3.getMessage();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(message2).length() + java.lang.String.valueOf(uri).length() + 32);
            sb3.append("Error while parsing ping URL: ");
            sb3.append(uri);
            sb3.append(". ");
            sb3.append(message2);
            android.util.Log.w("HttpUrlPinger", sb3.toString(), e3);
        } catch (java.lang.RuntimeException e4) {
            e = e4;
            java.lang.String message3 = e.getMessage();
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder(java.lang.String.valueOf(message3).length() + java.lang.String.valueOf(uri).length() + 27);
            sb22.append("Error while pinging URL: ");
            sb22.append(uri);
            sb22.append(". ");
            sb22.append(message3);
            android.util.Log.w("HttpUrlPinger", sb22.toString(), e);
        } finally {
        }
    }
}
