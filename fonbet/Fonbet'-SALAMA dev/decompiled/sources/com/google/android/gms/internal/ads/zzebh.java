package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes.dex */
public interface zzebh {
    zzebm zza(String str, WebView webView, String str2, String str3, String str4, zzebj zzebjVar, zzebi zzebiVar, String str5);

    zzebm zzb(String str, WebView webView, String str2, String str3, String str4, String str5, zzebj zzebjVar, zzebi zzebiVar, String str6);

    zzfjs zze(VersionInfoParcel versionInfoParcel, WebView webView, boolean z4);

    String zzf(Context context);

    void zzg(zzfjh zzfjhVar, View view);

    void zzh(zzfjs zzfjsVar, View view);

    void zzi(zzfjh zzfjhVar);

    void zzj(zzfjh zzfjhVar, View view);

    void zzk(zzfjh zzfjhVar);

    boolean zzl(Context context);

    void zzm(zzfjs zzfjsVar, zzces zzcesVar);
}
