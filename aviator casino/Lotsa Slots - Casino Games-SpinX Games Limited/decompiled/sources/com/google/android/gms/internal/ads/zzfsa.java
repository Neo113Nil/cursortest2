package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfsa implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfpw zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfqg zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdfg zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfsc zzd;

    zzfsa(com.google.android.gms.internal.ads.zzfsc zzfscVar, com.google.android.gms.internal.ads.zzfpw zzfpwVar, com.google.android.gms.internal.ads.zzfqg zzfqgVar, com.google.android.gms.internal.ads.zzdfg zzdfgVar) {
        this.zza = zzfpwVar;
        this.zzb = zzfqgVar;
        this.zzc = zzdfgVar;
        java.util.Objects.requireNonNull(zzfscVar);
        this.zzd = zzfscVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zza;
        if (zzfpwVar == null) {
            return;
        }
        zzfpwVar.zzd(false);
        com.google.android.gms.internal.ads.zzfqg zzfqgVar = this.zzb;
        if (zzfqgVar != null) {
            zzfqgVar.zza(zzfpwVar);
            zzfqgVar.zzh();
        } else {
            com.google.android.gms.internal.ads.zzfsc zzfscVar = this.zzd;
            zzfscVar.zze().zzb(zzfpwVar.zzm());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    @Override // com.google.android.gms.internal.ads.zzhbt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        char c;
        long j;
        int i;
        int hashCode;
        com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zza;
        com.google.android.gms.ads.internal.util.client.zzt zztVar = (com.google.android.gms.ads.internal.util.client.zzt) obj;
        if (zzfpwVar != null) {
            zzfpwVar.zzd(zztVar == com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
            com.google.android.gms.internal.ads.zzfqg zzfqgVar = this.zzb;
            if (zzfqgVar == null) {
                this.zzd.zze().zzb(zzfpwVar.zzm());
            } else {
                zzfqgVar.zza(zzfpwVar);
                zzfqgVar.zzh();
            }
        }
        com.google.android.gms.internal.ads.zzdfg zzdfgVar = this.zzc;
        if (zzdfgVar != null) {
            java.lang.String zzb = this.zzd.zzd().zzb();
            if (android.text.TextUtils.isEmpty(zzb)) {
                return;
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(zzb);
                android.os.Parcelable.Creator<com.google.android.gms.ads.internal.client.zzt> creator = com.google.android.gms.ads.internal.client.zzt.CREATOR;
                java.lang.String optString = jSONObject.optString("type");
                java.lang.String optString2 = jSONObject.optString("precision");
                java.lang.String optString3 = jSONObject.optString("currency");
                long optLong = jSONObject.optLong("value", 0L);
                int hashCode2 = optString.hashCode();
                char c2 = 65535;
                if (hashCode2 == 66934) {
                    if (optString.equals("CPC")) {
                        c = 1;
                        if (c != 0) {
                        }
                        hashCode = optString2.hashCode();
                        if (hashCode == -2131980260) {
                        }
                        zzdfgVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 == 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, j));
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                    hashCode = optString2.hashCode();
                    if (hashCode == -2131980260) {
                    }
                    zzdfgVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 == 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, j));
                }
                if (hashCode2 == 66944) {
                    if (optString.equals("CPM")) {
                        c = 0;
                        if (c != 0) {
                        }
                        hashCode = optString2.hashCode();
                        if (hashCode == -2131980260) {
                        }
                        zzdfgVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 == 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, j));
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                    hashCode = optString2.hashCode();
                    if (hashCode == -2131980260) {
                    }
                    zzdfgVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 == 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, j));
                }
                if (hashCode2 == 1349395245 && optString.equals("ONE_PIXEL")) {
                    c = 2;
                    if (c != 0) {
                        j = optLong;
                        i = 1;
                    } else if (c == 1) {
                        j = optLong;
                        i = 2;
                    } else if (c != 2) {
                        j = optLong;
                        i = 0;
                    } else {
                        j = optLong / 1000;
                        i = 3;
                    }
                    hashCode = optString2.hashCode();
                    if (hashCode == -2131980260) {
                        if (hashCode != 399232571) {
                            if (hashCode == 1271254246 && optString2.equals("PUBLISHER_PROVIDED")) {
                                c2 = 1;
                            }
                        } else if (optString2.equals("PRECISE")) {
                            c2 = 2;
                        }
                    } else if (optString2.equals("ESTIMATED")) {
                        c2 = 0;
                    }
                    zzdfgVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 == 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, j));
                }
                c = 65535;
                if (c != 0) {
                }
                hashCode = optString2.hashCode();
                if (hashCode == -2131980260) {
                }
                zzdfgVar.zza(new com.google.android.gms.ads.internal.client.zzt(i, c2 == 0 ? c2 != 1 ? c2 != 2 ? 0 : 3 : 2 : 1, optString3, j));
            } catch (org.json.JSONException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "UrlPinger.pingUrl");
            }
        }
    }
}
