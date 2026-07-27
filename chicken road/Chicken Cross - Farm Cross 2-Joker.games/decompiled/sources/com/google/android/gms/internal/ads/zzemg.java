package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public interface zzemg {
    boolean zza(Context context);

    String zzb(Context context);

    zzeml zzc(String str, WebView webView, String str2, String str3, String str4, zzemi zzemiVar, zzemh zzemhVar, String str5);

    zzeml zzd(String str, WebView webView, String str2, String str3, String str4, String str5, zzemi zzemiVar, zzemh zzemhVar, String str6);

    void zze(zzfvm zzfvmVar);

    void zzf(zzfvm zzfvmVar);

    void zzg(zzfvm zzfvmVar, View view);

    void zzh(zzfvm zzfvmVar, View view);

    zzfvy zzi(VersionInfoParcel versionInfoParcel, WebView webView, boolean z);

    void zzj(zzfvy zzfvyVar, zzfvx zzfvxVar);

    void zzk(zzfvy zzfvyVar, View view);
}
