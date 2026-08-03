package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzcn {
    public java.lang.String zza;
    public java.lang.String zzb;
    public java.lang.String zzc;
    public java.lang.String zzf;
    public int zzg = 1;
    public java.util.List zzd = java.util.Collections.emptyList();
    public java.util.List zze = java.util.Collections.emptyList();
    public int zzh = 1;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x020b, code lost:
    
        if (r1.equals("CONSENT_SIGNAL_UNKNOWN") != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
    
        if (r1.equals("UNKNOWN") == false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.android.gms.internal.consent_sdk.zzcn zza(android.util.JsonReader jsonReader) throws java.io.IOException {
        char c;
        char c2;
        char c3;
        int i;
        com.google.android.gms.internal.consent_sdk.zzcn zzcnVar = new com.google.android.gms.internal.consent_sdk.zzcn();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String nextName = jsonReader.nextName();
            int i2 = 4;
            int i3 = 3;
            char c4 = 0;
            switch (nextName.hashCode()) {
                case -2001388947:
                    if (nextName.equals("consent_signal")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1938755376:
                    if (nextName.equals(com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_ERROR_MESSAGE)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1851537225:
                    if (nextName.equals("consent_form_base_url")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1734348803:
                    if (nextName.equals("client_side_pingback_url")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1324537865:
                    if (nextName.equals("privacy_options_required")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1161803523:
                    if (nextName.equals("actions")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -986806987:
                    if (nextName.equals("request_info_keys")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -790907624:
                    if (nextName.equals("consent_form_payload")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    java.lang.String nextString = jsonReader.nextString();
                    switch (nextString.hashCode()) {
                        case -2058725357:
                            if (nextString.equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1969035850:
                            if (nextString.equals("CONSENT_SIGNAL_ERROR")) {
                                c4 = 6;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1263695752:
                            break;
                        case -954325659:
                            if (nextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -918677260:
                            if (nextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                                c4 = 7;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 429411856:
                            if (nextString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 467888915:
                            if (nextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1725474845:
                            if (nextString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                                c4 = 5;
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
                        case 0:
                            i2 = 1;
                            zzcnVar.zzg = i2;
                            break;
                        case 1:
                            i2 = 2;
                            zzcnVar.zzg = i2;
                            break;
                        case 2:
                            i2 = 3;
                            zzcnVar.zzg = i2;
                            break;
                        case 3:
                            zzcnVar.zzg = i2;
                            break;
                        case 4:
                            i2 = 5;
                            zzcnVar.zzg = i2;
                            break;
                        case 5:
                            i2 = 6;
                            zzcnVar.zzg = i2;
                            break;
                        case 6:
                            i2 = 7;
                            zzcnVar.zzg = i2;
                            break;
                        case 7:
                            i2 = 8;
                            zzcnVar.zzg = i2;
                            break;
                        default:
                            throw new java.io.IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(java.lang.String.valueOf(nextString)));
                    }
                case 1:
                    zzcnVar.zza = jsonReader.nextString();
                    break;
                case 2:
                    zzcnVar.zzb = jsonReader.nextString();
                    break;
                case 3:
                    zzcnVar.zzc = jsonReader.nextString();
                    break;
                case 4:
                    zzcnVar.zzd = new java.util.ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzcnVar.zzd.add(jsonReader.nextString());
                    }
                    jsonReader.endArray();
                    break;
                case 5:
                    zzcnVar.zze = new java.util.ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.google.android.gms.internal.consent_sdk.zzcm zzcmVar = new com.google.android.gms.internal.consent_sdk.zzcm();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            java.lang.String nextName2 = jsonReader.nextName();
                            int hashCode = nextName2.hashCode();
                            if (hashCode != -2105551094) {
                                if (hashCode == 1583758243 && nextName2.equals(com.facebook.share.internal.ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE)) {
                                    c2 = 0;
                                }
                                c2 = 65535;
                            } else {
                                if (nextName2.equals("args_json")) {
                                    c2 = 1;
                                }
                                c2 = 65535;
                            }
                            if (c2 == 0) {
                                java.lang.String nextString2 = jsonReader.nextString();
                                int hashCode2 = nextString2.hashCode();
                                if (hashCode2 == 64208429) {
                                    if (nextString2.equals("CLEAR")) {
                                        c3 = 2;
                                        if (c3 != 0) {
                                        }
                                        zzcmVar.zzb = i;
                                    }
                                    c3 = 65535;
                                    if (c3 != 0) {
                                    }
                                    zzcmVar.zzb = i;
                                } else if (hashCode2 != 82862015) {
                                    if (hashCode2 == 1856333582 && nextString2.equals("UNKNOWN_ACTION_TYPE")) {
                                        c3 = 0;
                                        if (c3 != 0) {
                                            i = 1;
                                        } else if (c3 == 1) {
                                            i = 2;
                                        } else {
                                            if (c3 != 2) {
                                                throw new java.io.IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(java.lang.String.valueOf(nextString2)));
                                            }
                                            i = 3;
                                        }
                                        zzcmVar.zzb = i;
                                    }
                                    c3 = 65535;
                                    if (c3 != 0) {
                                    }
                                    zzcmVar.zzb = i;
                                } else {
                                    if (nextString2.equals("WRITE")) {
                                        c3 = 1;
                                        if (c3 != 0) {
                                        }
                                        zzcmVar.zzb = i;
                                    }
                                    c3 = 65535;
                                    if (c3 != 0) {
                                    }
                                    zzcmVar.zzb = i;
                                }
                            } else if (c2 != 1) {
                                jsonReader.skipValue();
                            } else {
                                zzcmVar.zza = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        zzcnVar.zze.add(zzcmVar);
                    }
                    jsonReader.endArray();
                    break;
                case 6:
                    java.lang.String nextString3 = jsonReader.nextString();
                    int hashCode3 = nextString3.hashCode();
                    if (hashCode3 == -1888946261) {
                        if (nextString3.equals("NOT_REQUIRED")) {
                            c4 = 2;
                            if (c4 == 0) {
                            }
                            zzcnVar.zzh = i3;
                        }
                        c4 = 65535;
                        if (c4 == 0) {
                        }
                        zzcnVar.zzh = i3;
                    } else if (hashCode3 != 389487519) {
                        if (hashCode3 == 433141802) {
                            break;
                        }
                        c4 = 65535;
                        if (c4 == 0) {
                            i3 = 1;
                        } else if (c4 == 1) {
                            i3 = 2;
                        } else if (c4 != 2) {
                            throw new java.io.IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(java.lang.String.valueOf(nextString3)));
                        }
                        zzcnVar.zzh = i3;
                        break;
                    } else {
                        if (nextString3.equals("REQUIRED")) {
                            c4 = 1;
                            if (c4 == 0) {
                            }
                            zzcnVar.zzh = i3;
                        }
                        c4 = 65535;
                        if (c4 == 0) {
                        }
                        zzcnVar.zzh = i3;
                    }
                case 7:
                    zzcnVar.zzf = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return zzcnVar;
    }
}
