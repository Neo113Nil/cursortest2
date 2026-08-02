package com.google.android.gms.ads.identifier;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.ads_identifier.zzi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HashMap f10713a;

    public a(HashMap hashMap) {
        this.f10713a = hashMap;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        HashMap hashMap = this.f10713a;
        for (String str : hashMap.keySet()) {
            buildUpon.appendQueryParameter(str, (String) hashMap.get(str));
        }
        String uri = buildUpon.build().toString();
        try {
            try {
                zzi.zzb(263);
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
                } finally {
                    httpURLConnection.disconnect();
                }
            } finally {
                zzi.zza();
            }
        } catch (IOException e7) {
            e = e7;
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(message).length());
            sb2.append("Error while pinging URL: ");
            sb2.append(uri);
            sb2.append(". ");
            sb2.append(message);
            Log.w("HttpUrlPinger", sb2.toString(), e);
        } catch (IndexOutOfBoundsException e8) {
            String message2 = e8.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(uri).length() + 32 + String.valueOf(message2).length());
            sb3.append("Error while parsing ping URL: ");
            sb3.append(uri);
            sb3.append(". ");
            sb3.append(message2);
            Log.w("HttpUrlPinger", sb3.toString(), e8);
        } catch (RuntimeException e9) {
            e = e9;
            String message3 = e.getMessage();
            StringBuilder sb22 = new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(message3).length());
            sb22.append("Error while pinging URL: ");
            sb22.append(uri);
            sb22.append(". ");
            sb22.append(message3);
            Log.w("HttpUrlPinger", sb22.toString(), e);
        }
    }
}
