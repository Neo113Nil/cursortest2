package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzoe {
    static final com.google.common.collect.ImmutableList zza = com.google.common.collect.ImmutableList.of("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");
    public static final /* synthetic */ int zzb = 0;

    static java.lang.String zza(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (java.lang.ClassCastException unused) {
            return "";
        }
    }

    static int zzb(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (java.lang.ClassCastException unused) {
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static final boolean zzc(com.google.android.gms.internal.measurement.zzko zzkoVar, com.google.common.collect.ImmutableMap immutableMap, com.google.common.collect.ImmutableMap immutableMap2, com.google.common.collect.ImmutableSet immutableSet, char[] cArr, int i, int i2, int i3, int i4, int i5, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        com.google.common.collect.ImmutableMap immutableMap3;
        int i12;
        com.google.android.gms.measurement.internal.zzod zzodVar;
        int ordinal;
        char c;
        int zze = zze(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, z3);
        if (zze > 0) {
            i7 = i3;
            i6 = i2;
            if (i7 == 1) {
                if (i6 == 1) {
                    i9 = 1;
                    i8 = 1;
                    if (zzi(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i5, str, str2, str3, z, z2, z3) != com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_NOT_ALLOWED) {
                        c = '3';
                    } else {
                        if (zzkoVar == com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                            i10 = i5;
                            i11 = 1;
                            if (i10 == 1) {
                                if (immutableSet.contains(str)) {
                                    if (zze > 0 && cArr[zze] != '2') {
                                        cArr[zze] = '1';
                                    }
                                    return true;
                                }
                                immutableMap3 = immutableMap;
                                i12 = 1;
                                if (immutableMap3.containsKey(zzkoVar) && (zzodVar = (com.google.android.gms.measurement.internal.zzod) immutableMap3.get(zzkoVar)) != null) {
                                    ordinal = zzodVar.ordinal();
                                    if (ordinal == 0) {
                                        if (ordinal != i11) {
                                            if (ordinal == 2) {
                                                return zzi(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2, z3) == com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? zzh(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2, z3) : zzg(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2, z3);
                                            }
                                            if (ordinal == 3) {
                                                return zzi(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2, z3) == com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? zzg(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2, z3) : zzh(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2, z3);
                                            }
                                        } else if (zzi(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2, z3) != com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                                            return zzh(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2, z3);
                                        }
                                    } else if (zzi(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2, z3) != com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                                        return zzg(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i12, str, str2, str3, z, z2, z3);
                                    }
                                    c = '8';
                                }
                                c = '0';
                            }
                        } else {
                            i10 = i5;
                            i11 = 1;
                        }
                        immutableMap3 = immutableMap;
                        i12 = i10;
                        if (immutableMap3.containsKey(zzkoVar)) {
                            ordinal = zzodVar.ordinal();
                            if (ordinal == 0) {
                            }
                            c = '8';
                        }
                        c = '0';
                    }
                    if (zze <= 0 && cArr[zze] != '2') {
                        cArr[zze] = c;
                        return false;
                    }
                }
                i7 = 1;
            }
            cArr[zze] = '2';
        } else {
            i6 = i2;
            i7 = i3;
        }
        i8 = i7;
        i9 = i6;
        if (zzi(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i, i9, i8, i4, i5, str, str2, str3, z, z2, z3) != com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_NOT_ALLOWED) {
        }
        return zze <= 0 ? false : false;
    }

    public static final java.util.Map zzd(com.google.common.collect.ImmutableMap immutableMap, com.google.common.collect.ImmutableMap immutableMap2, com.google.common.collect.ImmutableSet immutableSet, char[] cArr, int i, int i2, int i3, int i4, int i5, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3) {
        if (((java.lang.Boolean) com.google.android.gms.measurement.internal.zzfx.zzba.zzb(null)).booleanValue() && !z3) {
            return com.google.common.collect.ImmutableMap.of();
        }
        com.google.android.gms.internal.measurement.zzko zzkoVar = com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        com.google.android.gms.internal.measurement.zzkp zzkpVar = (com.google.android.gms.internal.measurement.zzkp) immutableMap2.get(zzkoVar);
        com.google.android.gms.internal.measurement.zzko zzkoVar2 = com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        com.google.android.gms.internal.measurement.zzkp zzkpVar2 = (com.google.android.gms.internal.measurement.zzkp) immutableMap2.get(zzkoVar2);
        com.google.android.gms.internal.measurement.zzko zzkoVar3 = com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        com.google.android.gms.internal.measurement.zzkp zzkpVar3 = (com.google.android.gms.internal.measurement.zzkp) immutableMap2.get(zzkoVar3);
        com.google.android.gms.internal.measurement.zzko zzkoVar4 = com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        com.google.android.gms.internal.measurement.zzkp zzkpVar4 = (com.google.android.gms.internal.measurement.zzkp) immutableMap2.get(zzkoVar4);
        return com.google.common.collect.ImmutableMap.builder().put("Version", "2").put("VendorConsent", true != z ? "0" : "1").put("VendorLegitimateInterest", true != z2 ? "0" : "1").put("gdprApplies", i3 != 1 ? "0" : "1").put("EnableAdvertiserConsentMode", i2 != 1 ? "0" : "1").put("PolicyVersion", java.lang.String.valueOf(i4)).put("CmpSdkID", java.lang.String.valueOf(i)).put("PurposeOneTreatment", i5 != 1 ? "0" : "1").put("PublisherCC", str).put("PublisherRestrictions1", java.lang.String.valueOf(zzkpVar != null ? zzkpVar.zza() : com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_UNDEFINED.zza())).put("PublisherRestrictions3", java.lang.String.valueOf(zzkpVar2 != null ? zzkpVar2.zza() : com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_UNDEFINED.zza())).put("PublisherRestrictions4", java.lang.String.valueOf(zzkpVar3 != null ? zzkpVar3.zza() : com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_UNDEFINED.zza())).put("PublisherRestrictions7", java.lang.String.valueOf(zzkpVar4 != null ? zzkpVar4.zza() : com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_UNDEFINED.zza())).putAll(com.google.common.collect.ImmutableMap.of("Purpose1", zzf(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, z3), "Purpose3", zzf(zzkoVar2, immutableMap, immutableMap2, immutableSet, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, z3), "Purpose4", zzf(zzkoVar3, immutableMap, immutableMap2, immutableSet, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, z3), "Purpose7", zzf(zzkoVar4, immutableMap, immutableMap2, immutableSet, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, z3))).putAll(com.google.common.collect.ImmutableMap.of("AuthorizePurpose1", (java.lang.String) (true != zzc(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, z3) ? "0" : "1"), "AuthorizePurpose3", (java.lang.String) (true != zzc(zzkoVar2, immutableMap, immutableMap2, immutableSet, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, z3) ? "0" : "1"), "AuthorizePurpose4", (java.lang.String) (true != zzc(zzkoVar3, immutableMap, immutableMap2, immutableSet, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, z3) ? "0" : "1"), "AuthorizePurpose7", true != zzc(zzkoVar4, immutableMap, immutableMap2, immutableSet, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, z3) ? "0" : "1", "PurposeDiagnostics", new java.lang.String(cArr))).buildOrThrow();
    }

    private static final int zze(com.google.android.gms.internal.measurement.zzko zzkoVar, com.google.common.collect.ImmutableMap immutableMap, com.google.common.collect.ImmutableMap immutableMap2, com.google.common.collect.ImmutableSet immutableSet, char[] cArr, int i, int i2, int i3, int i4, int i5, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3) {
        if (zzkoVar == com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzkoVar == com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzkoVar == com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzkoVar == com.google.android.gms.internal.measurement.zzko.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final java.lang.String zzf(com.google.android.gms.internal.measurement.zzko zzkoVar, com.google.common.collect.ImmutableMap immutableMap, com.google.common.collect.ImmutableMap immutableMap2, com.google.common.collect.ImmutableSet immutableSet, char[] cArr, int i, int i2, int i3, int i4, int i5, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3) {
        java.lang.String str4 = "0";
        java.lang.String valueOf = (android.text.TextUtils.isEmpty(str2) || str2.length() < zzkoVar.zza()) ? "0" : java.lang.String.valueOf(str2.charAt(zzkoVar.zza() - 1));
        if (!android.text.TextUtils.isEmpty(str3) && str3.length() >= zzkoVar.zza()) {
            str4 = java.lang.String.valueOf(str3.charAt(zzkoVar.zza() - 1));
        }
        java.lang.String.valueOf(valueOf);
        java.lang.String.valueOf(str4);
        return java.lang.String.valueOf(valueOf).concat(java.lang.String.valueOf(str4));
    }

    private static final boolean zzg(com.google.android.gms.internal.measurement.zzko zzkoVar, com.google.common.collect.ImmutableMap immutableMap, com.google.common.collect.ImmutableMap immutableMap2, com.google.common.collect.ImmutableSet immutableSet, char[] cArr, int i, int i2, int i3, int i4, int i5, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3) {
        char c;
        int zze = zze(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, z3);
        if (!z) {
            c = '4';
        } else {
            if (str2.length() >= zzkoVar.zza()) {
                char charAt = str2.charAt(zzkoVar.zza() - 1);
                boolean z4 = charAt == '1';
                if (zze > 0 && cArr[zze] != '2') {
                    cArr[zze] = charAt != '1' ? '6' : '1';
                }
                return z4;
            }
            c = '0';
        }
        if (zze > 0 && cArr[zze] != '2') {
            cArr[zze] = c;
        }
        return false;
    }

    private static final boolean zzh(com.google.android.gms.internal.measurement.zzko zzkoVar, com.google.common.collect.ImmutableMap immutableMap, com.google.common.collect.ImmutableMap immutableMap2, com.google.common.collect.ImmutableSet immutableSet, char[] cArr, int i, int i2, int i3, int i4, int i5, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3) {
        char c;
        int zze = zze(zzkoVar, immutableMap, immutableMap2, immutableSet, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, z3);
        if (!z2) {
            c = '5';
        } else {
            if (str3.length() >= zzkoVar.zza()) {
                char charAt = str3.charAt(zzkoVar.zza() - 1);
                boolean z4 = charAt == '1';
                if (zze > 0 && cArr[zze] != '2') {
                    cArr[zze] = charAt != '1' ? '7' : '1';
                }
                return z4;
            }
            c = '0';
        }
        if (zze > 0 && cArr[zze] != '2') {
            cArr[zze] = c;
        }
        return false;
    }

    private static final com.google.android.gms.internal.measurement.zzkp zzi(com.google.android.gms.internal.measurement.zzko zzkoVar, com.google.common.collect.ImmutableMap immutableMap, com.google.common.collect.ImmutableMap immutableMap2, com.google.common.collect.ImmutableSet immutableSet, char[] cArr, int i, int i2, int i3, int i4, int i5, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3) {
        return (com.google.android.gms.internal.measurement.zzkp) immutableMap2.getOrDefault(zzkoVar, com.google.android.gms.internal.measurement.zzkp.PURPOSE_RESTRICTION_UNDEFINED);
    }
}
