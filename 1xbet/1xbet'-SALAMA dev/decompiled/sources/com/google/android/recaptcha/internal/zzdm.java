package com.google.android.recaptcha.internal;

import android.net.TrafficStats;
import android.webkit.URLUtil;
import com.google.android.gms.internal.ads.zzbbd;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import p050g6.i;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzdm implements zzdl {
    private final String zza;

    public zzdm(String str) {
        this.zza = str;
    }

    private static final void zzb(byte[] bArr) {
        for (zzop zzopVar : zzos.zzk(bArr).zzJ()) {
            String str = "INIT_TOTAL";
            List listM0 = i.M0("INIT_TOTAL", "EXECUTE_TOTAL");
            switch (zzopVar.zzW()) {
                case 2:
                    str = "UNKNOWN";
                    break;
                case 3:
                    str = "INIT_NATIVE";
                    break;
                case 4:
                    str = "INIT_NETWORK";
                    break;
                case 5:
                    str = "INIT_JS";
                    break;
                case 6:
                    break;
                case 7:
                    str = "EXECUTE_NATIVE";
                    break;
                case 8:
                    str = "EXECUTE_JS";
                    break;
                case 9:
                    str = "EXECUTE_TOTAL";
                    break;
                case 10:
                    str = "CHALLENGE_ACCOUNT_NATIVE";
                    break;
                case 11:
                    str = "CHALLENGE_ACCOUNT_JS";
                    break;
                case 12:
                    str = "CHALLENGE_ACCOUNT_TOTAL";
                    break;
                case 13:
                    str = "VERIFY_PIN_NATIVE";
                    break;
                case 14:
                    str = "VERIFY_PIN_JS";
                    break;
                case 15:
                    str = "VERIFY_PIN_TOTAL";
                    break;
                case 16:
                    str = "RUN_PROGRAM";
                    break;
                case 17:
                    str = "FETCH_ALLOWLIST";
                    break;
                case 18:
                    str = "JS_LOAD";
                    break;
                case 19:
                    str = "WEB_VIEW_RELOAD_JS";
                    break;
                case 20:
                    str = "INIT_NETWORK_MRI_ACTION";
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    str = "INIT_DOWNLOAD_JS";
                    break;
                case 22:
                    str = "VALIDATE_INPUT";
                    break;
                case 23:
                    str = "DOWNLOAD_JS";
                    break;
                case 24:
                    str = "SAVE_CACHE_JS";
                    break;
                case 25:
                    str = "LOAD_CACHE_JS";
                    break;
                case 26:
                    str = "LOAD_WEBVIEW";
                    break;
                case 27:
                    str = "COLLECT_SIGNALS";
                    break;
                case 28:
                    str = "FETCH_TOKEN";
                    break;
                case 29:
                    str = "POST_EXECUTE";
                    break;
                case 30:
                    str = "SIGNAL_MANAGER_INITIALIZATION";
                    break;
                case 31:
                    str = "SIGNAL_MANAGER_COLLECT_SIGNALS";
                    break;
                case 32:
                    str = "WEBVIEW_ENGINE_INITIALIATION";
                    break;
                case 33:
                    str = "WEBVIEW_ENGINE_SIGNAL_COLLECTION";
                    break;
                case 34:
                    str = "NATIVE_ENGINE_INITIALIZATION";
                    break;
                case 35:
                    str = "NATIVE_ENGINE_SIGNAL_COLLECTION";
                    break;
                case 36:
                    str = "NATIVE_SIGNAL_INITIALIZATION";
                    break;
                case 37:
                    str = "NATIVE_SIGNAL_COLLECTION";
                    break;
                case 38:
                    str = "PIA_WARMUP";
                    break;
                case 39:
                    str = "GMSCORE_ENGINE_INITIALIZATION";
                    break;
                case 40:
                    str = "GMSCORE_ENGINE_SIGNAL_COLLECTION";
                    break;
                default:
                    str = "UNRECOGNIZED";
                    break;
            }
            if (listM0.contains(str) && zzopVar.zzV()) {
                zzopVar.zzK();
                zzopVar.zzL();
                zzopVar.zzW();
                zzopVar.zzg().zzk();
                zzopVar.zzg().zzf();
                zzopVar.zzX();
            } else {
                zzopVar.zzK();
                zzopVar.zzL();
                zzopVar.zzW();
                zzopVar.zzX();
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzdl
    public final boolean zza(byte[] bArr) {
        HttpURLConnection httpURLConnection;
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            zzb(bArr);
            if (URLUtil.isHttpUrl(this.zza)) {
                URLConnection uRLConnectionOpenConnection = new URL(this.zza).openConnection();
                h.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            } else {
                if (!URLUtil.isHttpsUrl(this.zza)) {
                    throw new MalformedURLException("Recaptcha server url only allows using Http or Https.");
                }
                URLConnection uRLConnectionOpenConnection2 = new URL(this.zza).openConnection();
                h.c(uRLConnectionOpenConnection2, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                httpURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection2;
            }
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuffer");
            httpURLConnection.connect();
            httpURLConnection.getOutputStream().write(bArr);
            return httpURLConnection.getResponseCode() == 200;
        } catch (Exception e7) {
            e7.getMessage();
            return false;
        }
    }
}
