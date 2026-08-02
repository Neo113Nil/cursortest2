package com.google.android.gms.ads.identifier;

import android.net.Uri;
import androidx.constraintlayout.solver.widgets.Optimizer;
import com.google.android.gms.internal.ads_identifier.zzi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class c extends Thread {
    public final /* synthetic */ HashMap a;

    public c(HashMap hashMap) {
        this.a = hashMap;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        HashMap hashMap = this.a;
        for (String str : hashMap.keySet()) {
            buildUpon.appendQueryParameter(str, (String) hashMap.get(str));
        }
        String uri = buildUpon.build().toString();
        try {
            try {
                zzi.zzb(Optimizer.OPTIMIZATION_STANDARD);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        new StringBuilder(String.valueOf(uri).length() + 65);
                    }
                } finally {
                    httpURLConnection.disconnect();
                }
            } finally {
                zzi.zza();
            }
        } catch (IOException e) {
            e = e;
            new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(e.getMessage()).length());
        } catch (IndexOutOfBoundsException e2) {
            new StringBuilder(String.valueOf(uri).length() + 32 + String.valueOf(e2.getMessage()).length());
        } catch (RuntimeException e3) {
            e = e3;
            new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(e.getMessage()).length());
        }
    }
}
