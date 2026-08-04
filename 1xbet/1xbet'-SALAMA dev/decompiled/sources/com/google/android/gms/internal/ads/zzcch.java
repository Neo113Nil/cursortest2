package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import io.sentry.clientreport.DiscardedEvent;
import java.util.HashMap;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
final class zzcch implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzcci zze;

    public zzcch(zzcci zzcciVar, String str, String str2, String str3, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = zzcciVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x00a7  */
    @Override // java.lang.Runnable
    public final void run() {
        byte b7;
        HashMap mapM = k.m("event", "precacheCanceled");
        mapM.put("src", this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            mapM.put("cachedSrc", this.zzb);
        }
        switch (this.zzc) {
            case "interrupted":
                b7 = 3;
                break;
            case "badUrl":
                b7 = 8;
                break;
            case "inProgress":
                b7 = 2;
                break;
            case "downloadTimeout":
                b7 = 9;
                break;
            case "contentLengthMissing":
                b7 = 0;
                break;
            case "playerFailed":
                b7 = 5;
                break;
            case "sizeExceeded":
                b7 = 11;
                break;
            case "externalAbort":
                b7 = 10;
                break;
            case "noop":
                b7 = 4;
                break;
            case "error":
                b7 = 1;
                break;
            case "expireFailed":
                b7 = 6;
                break;
            case "noCacheDir":
                b7 = 7;
                break;
            default:
                b7 = -1;
                break;
        }
        String str = "internal";
        switch (b7) {
            case 6:
            case 7:
                str = "io";
                break;
            case 8:
            case 9:
                str = "network";
                break;
            case 10:
            case 11:
                str = "policy";
                break;
        }
        mapM.put("type", str);
        mapM.put(DiscardedEvent.JsonKeys.REASON, this.zzc);
        if (!TextUtils.isEmpty(this.zzd)) {
            mapM.put("message", this.zzd);
        }
        zzcci.zze(this.zze, "onPrecacheEvent", mapM);
    }
}
