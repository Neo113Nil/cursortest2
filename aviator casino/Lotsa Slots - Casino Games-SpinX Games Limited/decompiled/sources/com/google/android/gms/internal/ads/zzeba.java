package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeba extends com.google.android.gms.internal.ads.zzbqs {
    private final com.google.android.gms.internal.ads.zzebd zza;
    private final com.google.android.gms.internal.ads.zzeay zzb;
    private final java.util.Map zzc = new java.util.HashMap();

    zzeba(com.google.android.gms.internal.ads.zzebd zzebdVar, com.google.android.gms.internal.ads.zzeay zzeayVar) {
        this.zza = zzebdVar;
        this.zzb = zzeayVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static com.google.android.gms.ads.internal.client.zzm zzc(java.util.Map map) {
        char c;
        com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
        java.lang.String str = (java.lang.String) map.get("ad_request");
        if (str == null) {
            return zznVar.zza();
        }
        android.util.JsonReader jsonReader = new android.util.JsonReader(new java.io.StringReader(android.net.Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                java.lang.String nextName = jsonReader.nextName();
                switch (nextName.hashCode()) {
                    case -1289032093:
                        if (nextName.equals("extras")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -839117230:
                        if (nextName.equals("isTestDevice")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -733436947:
                        if (nextName.equals("tagForUnderAgeOfConsent")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -99890337:
                        if (nextName.equals("httpTimeoutMillis")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 523149226:
                        if (nextName.equals("keywords")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 597632527:
                        if (nextName.equals("maxAdContentRating")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1411582723:
                        if (nextName.equals("tagForChildDirectedTreatment")) {
                            c = 3;
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
                        jsonReader.beginObject();
                        android.os.Bundle bundle = new android.os.Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        zznVar.zzb(bundle);
                        break;
                    case 1:
                        jsonReader.beginArray();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        zznVar.zzc(arrayList);
                        break;
                    case 2:
                        zznVar.zzd(jsonReader.nextBoolean());
                        break;
                    case 3:
                        if (!jsonReader.nextBoolean()) {
                            zznVar.zze(0);
                            break;
                        } else {
                            zznVar.zze(1);
                            break;
                        }
                    case 4:
                        if (!jsonReader.nextBoolean()) {
                            zznVar.zzf(0);
                            break;
                        } else {
                            zznVar.zzf(1);
                            break;
                        }
                    case 5:
                        java.lang.String nextString = jsonReader.nextString();
                        if (!com.google.android.gms.ads.RequestConfiguration.zza.contains(nextString)) {
                            break;
                        } else {
                            zznVar.zzg(nextString);
                            break;
                        }
                    case 6:
                        zznVar.zzh(jsonReader.nextInt());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (java.io.IOException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Ad Request json was malformed, parsing ended early.");
        }
        com.google.android.gms.ads.internal.client.zzm zza = zznVar.zza();
        android.os.Bundle bundle2 = zza.zzm;
        android.os.Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle3 == null) {
            bundle3 = zza.zzc;
            bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle3);
        }
        return new com.google.android.gms.ads.internal.client.zzm(zza.zza, zza.zzb, bundle3, zza.zzd, zza.zze, zza.zzf, zza.zzg, zza.zzh, zza.zzi, zza.zzj, zza.zzk, zza.zzl, bundle2, zza.zzn, zza.zzo, zza.zzp, zza.zzq, zza.zzr, zza.zzs, zza.zzt, zza.zzu, zza.zzv, zza.zzw, zza.zzx, zza.zzy, zza.zzz, zza.zzA);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00ab, code lost:
    
        if (r0.equals("create_interstitial_ad") != false) goto L50;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzbqt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(java.lang.String str) throws android.os.RemoteException {
        char c;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlq)).booleanValue()) {
            java.lang.String.valueOf(str);
            com.google.android.gms.ads.internal.util.zze.zza("Received H5 gmsg: ".concat(java.lang.String.valueOf(str)));
            android.net.Uri parse = android.net.Uri.parse(str);
            com.google.android.gms.ads.internal.zzt.zzc();
            java.util.Map zzT = com.google.android.gms.ads.internal.util.zzs.zzT(parse);
            java.lang.String str2 = (java.lang.String) zzT.get("action");
            if (android.text.TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 gmsg did not contain an action");
                return;
            }
            int hashCode = str2.hashCode();
            char c2 = 0;
            if (hashCode != 579053441) {
                if (hashCode == 871091088 && str2.equals(com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName)) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (str2.equals("dispose_all")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                this.zzc.clear();
                this.zzb.zza();
                return;
            }
            if (c == 1) {
                java.util.Map map = this.zzc;
                java.util.Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((com.google.android.gms.internal.ads.zzeau) it.next()).zzc();
                }
                map.clear();
                return;
            }
            java.lang.String str3 = (java.lang.String) zzT.get("obj_id");
            try {
                long parseLong = java.lang.Long.parseLong((java.lang.String) java.util.Objects.requireNonNull(str3));
                switch (str2.hashCode()) {
                    case -1790951212:
                        if (str2.equals("show_interstitial_ad")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1266374734:
                        if (str2.equals("show_rewarded_ad")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -257098725:
                        if (str2.equals("load_rewarded_ad")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 393881811:
                        break;
                    case 585513149:
                        if (str2.equals("load_interstitial_ad")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2109237041:
                        if (str2.equals("create_rewarded_ad")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        java.util.Map map2 = this.zzc;
                        if (map2.size() < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlr)).intValue()) {
                            java.lang.Long valueOf = java.lang.Long.valueOf(parseLong);
                            if (!map2.containsKey(valueOf)) {
                                java.lang.String str4 = (java.lang.String) zzT.get("ad_unit");
                                if (!android.text.TextUtils.isEmpty(str4)) {
                                    com.google.android.gms.internal.ads.zzeav zzc = this.zza.zzc();
                                    zzc.zzc(parseLong);
                                    zzc.zzb(str4);
                                    map2.put(valueOf, zzc.zza().zza());
                                    this.zzb.zzb(parseLong);
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(parseLong).length() + 39 + java.lang.String.valueOf(str4).length());
                                    sb.append("Created H5 interstitial #");
                                    sb.append(parseLong);
                                    sb.append(" with ad unit ");
                                    sb.append(str4);
                                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                                    break;
                                } else {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzc(parseLong);
                                    break;
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not create H5 ad, object ID already exists");
                                this.zzb.zzc(parseLong);
                                break;
                            }
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, too many existing objects");
                            this.zzb.zzc(parseLong);
                            break;
                        }
                    case 1:
                        com.google.android.gms.internal.ads.zzeau zzeauVar = (com.google.android.gms.internal.ads.zzeau) this.zzc.get(java.lang.Long.valueOf(parseLong));
                        if (zzeauVar != null) {
                            zzeauVar.zza(zzc(zzT));
                            break;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzd(parseLong);
                            break;
                        }
                    case 2:
                        com.google.android.gms.internal.ads.zzeau zzeauVar2 = (com.google.android.gms.internal.ads.zzeau) this.zzc.get(java.lang.Long.valueOf(parseLong));
                        if (zzeauVar2 != null) {
                            zzeauVar2.zzb();
                            break;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzd(parseLong);
                            break;
                        }
                    case 3:
                        java.util.Map map3 = this.zzc;
                        if (map3.size() < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlr)).intValue()) {
                            java.lang.Long valueOf2 = java.lang.Long.valueOf(parseLong);
                            if (!map3.containsKey(valueOf2)) {
                                java.lang.String str5 = (java.lang.String) zzT.get("ad_unit");
                                if (!android.text.TextUtils.isEmpty(str5)) {
                                    com.google.android.gms.internal.ads.zzeav zzc2 = this.zza.zzc();
                                    zzc2.zzc(parseLong);
                                    zzc2.zzb(str5);
                                    map3.put(valueOf2, zzc2.zza().zzb());
                                    this.zzb.zzb(parseLong);
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(parseLong).length() + 35 + java.lang.String.valueOf(str5).length());
                                    sb2.append("Created H5 rewarded #");
                                    sb2.append(parseLong);
                                    sb2.append(" with ad unit ");
                                    sb2.append(str5);
                                    com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                                    break;
                                } else {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzc(parseLong);
                                    break;
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not create H5 ad, object ID already exists");
                                this.zzb.zzc(parseLong);
                                break;
                            }
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create H5 ad, too many existing objects");
                            this.zzb.zzc(parseLong);
                            break;
                        }
                    case 4:
                        com.google.android.gms.internal.ads.zzeau zzeauVar3 = (com.google.android.gms.internal.ads.zzeau) this.zzc.get(java.lang.Long.valueOf(parseLong));
                        if (zzeauVar3 != null) {
                            zzeauVar3.zza(zzc(zzT));
                            break;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzj(parseLong);
                            break;
                        }
                    case 5:
                        com.google.android.gms.internal.ads.zzeau zzeauVar4 = (com.google.android.gms.internal.ads.zzeau) this.zzc.get(java.lang.Long.valueOf(parseLong));
                        if (zzeauVar4 != null) {
                            zzeauVar4.zzb();
                            break;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzj(parseLong);
                            break;
                        }
                    case 6:
                        java.util.Map map4 = this.zzc;
                        java.lang.Long valueOf3 = java.lang.Long.valueOf(parseLong);
                        com.google.android.gms.internal.ads.zzeau zzeauVar5 = (com.google.android.gms.internal.ads.zzeau) map4.get(valueOf3);
                        if (zzeauVar5 != null) {
                            zzeauVar5.zzc();
                            map4.remove(valueOf3);
                            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(parseLong).length() + 16);
                            sb3.append("Disposed H5 ad #");
                            sb3.append(parseLong);
                            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                            break;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Could not dispose H5 ad, object ID does not exist");
                            break;
                        }
                    default:
                        java.lang.String.valueOf(str2);
                        com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 gmsg contained invalid action: ".concat(java.lang.String.valueOf(str2)));
                        break;
                }
            } catch (java.lang.NullPointerException | java.lang.NumberFormatException unused) {
                java.lang.String.valueOf(str3);
                com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 gmsg did not contain a valid object id: ".concat(java.lang.String.valueOf(str3)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqt
    public final void zzf() {
        this.zzc.clear();
    }
}
