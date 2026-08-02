package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import e1.k;
import io.sentry.clientreport.DiscardedEvent;
import java.util.HashMap;

/* loaded from: classes.dex */
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
    @Override // java.lang.Runnable
    public final void run() {
        char c3;
        HashMap m7 = k.m("event", "precacheCanceled");
        m7.put("src", this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            m7.put("cachedSrc", this.zzb);
        }
        String str = this.zzc;
        switch (str.hashCode()) {
            case -1947652542:
                if (str.equals("interrupted")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case -1396664534:
                if (str.equals("badUrl")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case -1347010958:
                if (str.equals("inProgress")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case -918817863:
                if (str.equals("downloadTimeout")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case -659376217:
                if (str.equals("contentLengthMissing")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case -642208130:
                if (str.equals("playerFailed")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case -354048396:
                if (str.equals("sizeExceeded")) {
                    c3 = 11;
                    break;
                }
                c3 = 65535;
                break;
            case -32082395:
                if (str.equals("externalAbort")) {
                    c3 = '\n';
                    break;
                }
                c3 = 65535;
                break;
            case 3387234:
                if (str.equals("noop")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 96784904:
                if (str.equals("error")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 580119100:
                if (str.equals("expireFailed")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 725497484:
                if (str.equals("noCacheDir")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        String str2 = "internal";
        switch (c3) {
            case 6:
            case 7:
                str2 = "io";
                break;
            case '\b':
            case '\t':
                str2 = "network";
                break;
            case '\n':
            case 11:
                str2 = "policy";
                break;
        }
        m7.put("type", str2);
        m7.put(DiscardedEvent.JsonKeys.REASON, this.zzc);
        if (!TextUtils.isEmpty(this.zzd)) {
            m7.put("message", this.zzd);
        }
        zzcci.zze(this.zze, "onPrecacheEvent", m7);
    }
}
