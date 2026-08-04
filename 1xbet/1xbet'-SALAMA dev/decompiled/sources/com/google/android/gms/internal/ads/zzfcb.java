package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.C0309q;

/* JADX INFO: loaded from: classes.dex */
public final class zzfcb {
    public static com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        if (th instanceof zzebv) {
            zzebv zzebvVar = (zzebv) th;
            return zzc(zzebvVar.zza(), zzebvVar.zzb());
        }
        if (th instanceof zzdus) {
            return th.getMessage() == null ? zzd(((zzdus) th).zza(), null, null) : zzd(((zzdus) th).zza(), th.getMessage(), null);
        }
        if (!(th instanceof C0309q)) {
            return zzd(1, null, null);
        }
        C0309q c0309q = (C0309q) th;
        return new com.google.android.gms.ads.internal.client.zze(c0309q.f3639a, zzfty.zzc(c0309q.getMessage()), "com.google.android.gms.ads", null, null);
    }

    public static com.google.android.gms.ads.internal.client.zze zzb(Throwable th, zzebw zzebwVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        com.google.android.gms.ads.internal.client.zze zzeVarZza = zza(th);
        int i7 = zzeVarZza.f10720a;
        if ((i7 == 3 || i7 == 0) && (zzeVar = zzeVarZza.f10723d) != null && !zzeVar.f10722c.equals("com.google.android.gms.ads")) {
            zzeVarZza.f10723d = null;
        }
        if (zzebwVar != null) {
            zzeVarZza.f10724e = zzebwVar.zzb();
        }
        return zzeVarZza;
    }

    public static com.google.android.gms.ads.internal.client.zze zzc(int i7, com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (i7 == 0) {
            throw null;
        }
        if (i7 == 8) {
            if (((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzim)).intValue() > 0) {
                return zzeVar;
            }
            i7 = 8;
        }
        return zzd(i7, null, zzeVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    public static com.google.android.gms.ads.internal.client.zze zzd(int i7, String str, com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i8;
        String str2;
        int i9 = i7 - 1;
        if (str == null) {
            if (i7 == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i9) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzip)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i7 == 0) {
            throw null;
        }
        int i10 = 2;
        switch (i9) {
            case 0:
            case 11:
            case 15:
                i10 = 0;
                return new com.google.android.gms.ads.internal.client.zze(i10, str3, "com.google.android.gms.ads", zzeVar, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i10 = 1;
                return new com.google.android.gms.ads.internal.client.zze(i10, str3, "com.google.android.gms.ads", zzeVar, null);
            case 2:
            case 10:
            case 18:
                i10 = 3;
                return new com.google.android.gms.ads.internal.client.zze(i10, str3, "com.google.android.gms.ads", zzeVar, null);
            case 3:
                i8 = 8;
                i10 = i8;
                return new com.google.android.gms.ads.internal.client.zze(i10, str3, "com.google.android.gms.ads", zzeVar, null);
            case 4:
            case 8:
            case 17:
                return new com.google.android.gms.ads.internal.client.zze(i10, str3, "com.google.android.gms.ads", zzeVar, null);
            case 7:
                i8 = 4;
                i10 = i8;
                return new com.google.android.gms.ads.internal.client.zze(i10, str3, "com.google.android.gms.ads", zzeVar, null);
            case 12:
                if (((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzip)).intValue() <= 0) {
                    i8 = 9;
                    i10 = i8;
                } else {
                    i10 = 3;
                }
                return new com.google.android.gms.ads.internal.client.zze(i10, str3, "com.google.android.gms.ads", zzeVar, null);
            case 13:
                i8 = 10;
                i10 = i8;
                return new com.google.android.gms.ads.internal.client.zze(i10, str3, "com.google.android.gms.ads", zzeVar, null);
            case 14:
                i8 = 11;
                i10 = i8;
                return new com.google.android.gms.ads.internal.client.zze(i10, str3, "com.google.android.gms.ads", zzeVar, null);
            default:
                switch (i7) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }
}
