package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzcl {
    public String zza;
    public String zzb;
    public String zzc;
    public int zzf = 1;
    public List zzd = Collections.emptyList();
    public List zze = Collections.emptyList();
    public int zzg = 1;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzcl zza(JsonReader jsonReader) {
        boolean z4;
        String nextString;
        boolean z7;
        char c3;
        int i7;
        zzcl zzclVar = new zzcl();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i8 = 6;
            int i9 = 3;
            switch (nextName.hashCode()) {
                case -2001388947:
                    if (nextName.equals("consent_signal")) {
                        z4 = false;
                        break;
                    }
                    z4 = -1;
                    break;
                case -1938755376:
                    if (nextName.equals("error_message")) {
                        z4 = 3;
                        break;
                    }
                    z4 = -1;
                    break;
                case -1851537225:
                    if (nextName.equals("consent_form_base_url")) {
                        z4 = 2;
                        break;
                    }
                    z4 = -1;
                    break;
                case -1324537865:
                    if (nextName.equals("privacy_options_required")) {
                        z4 = 6;
                        break;
                    }
                    z4 = -1;
                    break;
                case -1161803523:
                    if (nextName.equals("actions")) {
                        z4 = 5;
                        break;
                    }
                    z4 = -1;
                    break;
                case -986806987:
                    if (nextName.equals("request_info_keys")) {
                        z4 = 4;
                        break;
                    }
                    z4 = -1;
                    break;
                case -790907624:
                    if (nextName.equals("consent_form_payload")) {
                        z4 = true;
                        break;
                    }
                    z4 = -1;
                    break;
                default:
                    z4 = -1;
                    break;
            }
            switch (z4) {
                case false:
                    nextString = jsonReader.nextString();
                    switch (nextString) {
                        case "CONSENT_SIGNAL_UNKNOWN":
                            i8 = 1;
                            zzclVar.zzf = i8;
                            break;
                        case "CONSENT_SIGNAL_PERSONALIZED_ADS":
                            i8 = 2;
                            zzclVar.zzf = i8;
                            break;
                        case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS":
                            i8 = 3;
                            zzclVar.zzf = i8;
                            break;
                        case "CONSENT_SIGNAL_SUFFICIENT":
                            i8 = 4;
                            zzclVar.zzf = i8;
                            break;
                        case "CONSENT_SIGNAL_COLLECT_CONSENT":
                            i8 = 5;
                            zzclVar.zzf = i8;
                            break;
                        case "CONSENT_SIGNAL_NOT_REQUIRED":
                            zzclVar.zzf = i8;
                            break;
                        case "CONSENT_SIGNAL_ERROR":
                            i8 = 7;
                            zzclVar.zzf = i8;
                            break;
                        case "CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION":
                            i8 = 8;
                            zzclVar.zzf = i8;
                            break;
                        default:
                            throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                    }
                case true:
                    zzclVar.zza = jsonReader.nextString();
                    break;
                case true:
                    zzclVar.zzb = jsonReader.nextString();
                    break;
                case true:
                    zzclVar.zzc = jsonReader.nextString();
                    break;
                case true:
                    zzclVar.zzd = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzclVar.zzd.add(jsonReader.nextString());
                    }
                    jsonReader.endArray();
                    break;
                case true:
                    zzclVar.zze = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzck zzckVar = new zzck();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            int hashCode = nextName2.hashCode();
                            if (hashCode != -2105551094) {
                                if (hashCode == 1583758243 && nextName2.equals("action_type")) {
                                    z7 = false;
                                }
                                z7 = -1;
                            } else {
                                if (nextName2.equals("args_json")) {
                                    z7 = true;
                                }
                                z7 = -1;
                            }
                            if (!z7) {
                                String nextString2 = jsonReader.nextString();
                                int hashCode2 = nextString2.hashCode();
                                if (hashCode2 == 64208429) {
                                    if (nextString2.equals("CLEAR")) {
                                        c3 = 2;
                                        if (c3 != 0) {
                                        }
                                        zzckVar.zzb = i7;
                                    }
                                    c3 = 65535;
                                    if (c3 != 0) {
                                    }
                                    zzckVar.zzb = i7;
                                } else if (hashCode2 != 82862015) {
                                    if (hashCode2 == 1856333582 && nextString2.equals("UNKNOWN_ACTION_TYPE")) {
                                        c3 = 0;
                                        if (c3 != 0) {
                                            i7 = 1;
                                        } else if (c3 == 1) {
                                            i7 = 2;
                                        } else {
                                            if (c3 != 2) {
                                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString2));
                                            }
                                            i7 = 3;
                                        }
                                        zzckVar.zzb = i7;
                                    }
                                    c3 = 65535;
                                    if (c3 != 0) {
                                    }
                                    zzckVar.zzb = i7;
                                } else {
                                    if (nextString2.equals("WRITE")) {
                                        c3 = 1;
                                        if (c3 != 0) {
                                        }
                                        zzckVar.zzb = i7;
                                    }
                                    c3 = 65535;
                                    if (c3 != 0) {
                                    }
                                    zzckVar.zzb = i7;
                                }
                            } else if (!z7) {
                                jsonReader.skipValue();
                            } else {
                                zzckVar.zza = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        zzclVar.zze.add(zzckVar);
                    }
                    jsonReader.endArray();
                    break;
                case true:
                    String nextString3 = jsonReader.nextString();
                    int hashCode3 = nextString3.hashCode();
                    if (hashCode3 != -1888946261) {
                        if (hashCode3 != 389487519) {
                            if (hashCode3 == 433141802 && nextString3.equals("UNKNOWN")) {
                            }
                        } else if (nextString3.equals("REQUIRED")) {
                        }
                    } else if (nextString3.equals("NOT_REQUIRED")) {
                    }
                    if (r6 == 0) {
                        i9 = 1;
                    } else if (r6 == 1) {
                        i9 = 2;
                    } else if (r6 != 2) {
                        throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(nextString3));
                    }
                    zzclVar.zzg = i9;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return zzclVar;
    }
}
