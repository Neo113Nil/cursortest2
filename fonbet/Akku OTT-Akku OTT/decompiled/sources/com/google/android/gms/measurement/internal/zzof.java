package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.common.collect.C0965m;
import com.google.common.collect.G;
import com.google.common.collect.I;
import com.google.common.collect.M;
import com.google.common.collect.j0;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzof {
    static final G zza = G.q("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");
    public static final /* synthetic */ int zzb = 0;

    public static String zza(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static int zzb(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    @VisibleForTesting
    public static final boolean zzc(com.google.android.gms.internal.measurement.zzkp zzkpVar, I i, I i2, M m, char[] cArr, int i3, int i4, int i5, int i6, int i7, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        int i8;
        int i9;
        M m2;
        String str4;
        zzoe zzoeVar;
        char c;
        int zze = zze(zzkpVar, i, i2, m, cArr, i3, i4, i5, i6, i7, str, str2, str3, z, z2, true);
        if (zze > 0) {
            i9 = i5;
            if (i9 == 1) {
                i8 = i4;
                if (i8 != 1) {
                    i9 = 1;
                } else {
                    i8 = 1;
                    i9 = 1;
                }
            } else {
                i8 = i4;
            }
            cArr[zze] = '2';
        } else {
            i8 = i4;
            i9 = i5;
        }
        if (zzi(zzkpVar, i, i2, m, cArr, i3, i8, i9, i6, i7, str, str2, str3, z, z2, true) == com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            int i10 = i7;
            if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                m2 = m;
                str4 = str;
                if (i10 == 1) {
                    if (m2.contains(str4)) {
                        if (zze > 0 && cArr[zze] != '2') {
                            cArr[zze] = '1';
                        }
                        return true;
                    }
                    i10 = 1;
                }
            } else {
                m2 = m;
                str4 = str;
            }
            if (i.containsKey(zzkpVar) && (zzoeVar = (zzoe) i.get(zzkpVar)) != null) {
                int ordinal = zzoeVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return zzi(zzkpVar, i, i2, m, cArr, i3, i8, i9, i6, i10, str, str2, str3, z, z2, true) == com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? zzh(zzkpVar, i, i2, m, cArr, i3, i8, i9, i6, i10, str, str2, str3, z, z2, true) : zzg(zzkpVar, i, i2, m, cArr, i3, i8, i9, i6, i10, str, str2, str3, z, z2, true);
                        }
                        if (ordinal == 3) {
                            return zzi(zzkpVar, i, i2, m2, cArr, i3, i8, i9, i6, i10, str4, str2, str3, z, z2, true) == com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? zzg(zzkpVar, i, i2, m, cArr, i3, i8, i9, i6, i10, str, str2, str3, z, z2, true) : zzh(zzkpVar, i, i2, m, cArr, i3, i8, i9, i6, i10, str, str2, str3, z, z2, true);
                        }
                    } else if (zzi(zzkpVar, i, i2, m, cArr, i3, i8, i9, i6, i10, str, str2, str3, z, z2, true) != com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return zzh(zzkpVar, i, i2, m, cArr, i3, i8, i9, i6, i10, str, str2, str3, z, z2, true);
                    }
                } else if (zzi(zzkpVar, i, i2, m, cArr, i3, i8, i9, i6, i10, str, str2, str3, z, z2, true) != com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return zzg(zzkpVar, i, i2, m, cArr, i3, i8, i9, i6, i10, str, str2, str3, z, z2, true);
                }
                c = '8';
            }
            c = '0';
        }
        if (zze <= 0 || cArr[zze] == '2') {
            return false;
        }
        cArr[zze] = c;
        return false;
    }

    public static final Map zzd(I i, I i2, M m, char[] cArr, int i3, int i4, int i5, int i6, int i7, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        if (!z3) {
            return j0.i;
        }
        com.google.android.gms.internal.measurement.zzkp zzkpVar = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        com.google.android.gms.internal.measurement.zzkq zzkqVar = (com.google.android.gms.internal.measurement.zzkq) i2.get(zzkpVar);
        com.google.android.gms.internal.measurement.zzkp zzkpVar2 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        com.google.android.gms.internal.measurement.zzkq zzkqVar2 = (com.google.android.gms.internal.measurement.zzkq) i2.get(zzkpVar2);
        com.google.android.gms.internal.measurement.zzkp zzkpVar3 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        com.google.android.gms.internal.measurement.zzkq zzkqVar3 = (com.google.android.gms.internal.measurement.zzkq) i2.get(zzkpVar3);
        com.google.android.gms.internal.measurement.zzkp zzkpVar4 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        com.google.android.gms.internal.measurement.zzkq zzkqVar4 = (com.google.android.gms.internal.measurement.zzkq) i2.get(zzkpVar4);
        I.a a = I.a();
        a.d("Version", ExifInterface.GPS_MEASUREMENT_2D);
        a.d("VendorConsent", true != z ? SessionDescription.SUPPORTED_SDP_VERSION : "1");
        a.d("VendorLegitimateInterest", true != z2 ? SessionDescription.SUPPORTED_SDP_VERSION : "1");
        a.d("gdprApplies", i5 != 1 ? SessionDescription.SUPPORTED_SDP_VERSION : "1");
        a.d("EnableAdvertiserConsentMode", i4 != 1 ? SessionDescription.SUPPORTED_SDP_VERSION : "1");
        a.d("PolicyVersion", String.valueOf(i6));
        a.d("CmpSdkID", String.valueOf(i3));
        a.d("PurposeOneTreatment", i7 != 1 ? SessionDescription.SUPPORTED_SDP_VERSION : "1");
        a.d("PublisherCC", str);
        a.d("PublisherRestrictions1", String.valueOf(zzkqVar != null ? zzkqVar.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza()));
        a.d("PublisherRestrictions3", String.valueOf(zzkqVar2 != null ? zzkqVar2.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza()));
        a.d("PublisherRestrictions4", String.valueOf(zzkqVar3 != null ? zzkqVar3.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza()));
        a.d("PublisherRestrictions7", String.valueOf(zzkqVar4 != null ? zzkqVar4.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza()));
        String zzf = zzf(zzkpVar, i, i2, m, cArr, i3, i4, i5, i6, i7, str, str2, str3, z, z2, true);
        String zzf2 = zzf(zzkpVar2, i, i2, m, cArr, i3, i4, i5, i6, i7, str, str2, str3, z, z2, true);
        String zzf3 = zzf(zzkpVar3, i, i2, m, cArr, i3, i4, i5, i6, i7, str, str2, str3, z, z2, true);
        String zzf4 = zzf(zzkpVar4, i, i2, m, cArr, i3, i4, i5, i6, i7, str, str2, str3, z, z2, true);
        C0965m.a("Purpose1", zzf);
        C0965m.a("Purpose3", zzf2);
        C0965m.a("Purpose4", zzf3);
        C0965m.a("Purpose7", zzf4);
        return a.g(j0.i(4, new Object[]{"Purpose1", zzf, "Purpose3", zzf2, "Purpose4", zzf3, "Purpose7", zzf4}, null)).g(j0.i(5, new Object[]{"AuthorizePurpose1", true != zzc(zzkpVar, i, i2, m, cArr, i3, i4, i5, i6, i7, str, str2, str3, z, z2, true) ? SessionDescription.SUPPORTED_SDP_VERSION : "1", "AuthorizePurpose3", true != zzc(zzkpVar2, i, i2, m, cArr, i3, i4, i5, i6, i7, str, str2, str3, z, z2, true) ? SessionDescription.SUPPORTED_SDP_VERSION : "1", "AuthorizePurpose4", true != zzc(zzkpVar3, i, i2, m, cArr, i3, i4, i5, i6, i7, str, str2, str3, z, z2, true) ? SessionDescription.SUPPORTED_SDP_VERSION : "1", "AuthorizePurpose7", true != zzc(zzkpVar4, i, i2, m, cArr, i3, i4, i5, i6, i7, str, str2, str3, z, z2, true) ? SessionDescription.SUPPORTED_SDP_VERSION : "1", "PurposeDiagnostics", new String(cArr)}, null)).c();
    }

    private static final int zze(com.google.android.gms.internal.measurement.zzkp zzkpVar, I i, I i2, M m, char[] cArr, int i3, int i4, int i5, int i6, int i7, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final String zzf(com.google.android.gms.internal.measurement.zzkp zzkpVar, I i, I i2, M m, char[] cArr, int i3, int i4, int i5, int i6, int i7, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        String str4 = SessionDescription.SUPPORTED_SDP_VERSION;
        String valueOf = (isEmpty || str2.length() < zzkpVar.zza()) ? SessionDescription.SUPPORTED_SDP_VERSION : String.valueOf(str2.charAt(zzkpVar.zza() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= zzkpVar.zza()) {
            str4 = String.valueOf(str3.charAt(zzkpVar.zza() - 1));
        }
        return String.valueOf(valueOf).concat(String.valueOf(str4));
    }

    private static final boolean zzg(com.google.android.gms.internal.measurement.zzkp zzkpVar, I i, I i2, M m, char[] cArr, int i3, int i4, int i5, int i6, int i7, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        char c;
        int zze = zze(zzkpVar, i, i2, m, cArr, i3, i4, i5, i6, i7, str, str2, str3, z, z2, true);
        if (!z) {
            c = '4';
        } else {
            if (str2.length() >= zzkpVar.zza()) {
                char charAt = str2.charAt(zzkpVar.zza() - 1);
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

    private static final boolean zzh(com.google.android.gms.internal.measurement.zzkp zzkpVar, I i, I i2, M m, char[] cArr, int i3, int i4, int i5, int i6, int i7, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        char c;
        int zze = zze(zzkpVar, i, i2, m, cArr, i3, i4, i5, i6, i7, str, str2, str3, z, z2, true);
        if (!z2) {
            c = '5';
        } else {
            if (str3.length() >= zzkpVar.zza()) {
                char charAt = str3.charAt(zzkpVar.zza() - 1);
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

    private static final com.google.android.gms.internal.measurement.zzkq zzi(com.google.android.gms.internal.measurement.zzkp zzkpVar, I i, I i2, M m, char[] cArr, int i3, int i4, int i5, int i6, int i7, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        Object obj = com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED;
        Object obj2 = i2.get(zzkpVar);
        if (obj2 != null) {
            obj = obj2;
        }
        return (com.google.android.gms.internal.measurement.zzkq) obj;
    }
}
