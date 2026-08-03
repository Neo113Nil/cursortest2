package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public abstract class zzdw extends com.google.android.gms.internal.consent_sdk.zzds implements java.util.Set {
    private transient com.google.android.gms.internal.consent_sdk.zzdv zza;

    zzdw() {
    }

    static int zzf(int i) {
        int max = java.lang.Math.max(i, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new java.lang.IllegalArgumentException("collection too large");
        }
        int highestOneBit = java.lang.Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static com.google.android.gms.internal.consent_sdk.zzdw zzi() {
        return com.google.android.gms.internal.consent_sdk.zzdz.zza;
    }

    public static com.google.android.gms.internal.consent_sdk.zzdw zzj(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        return zzm(4, "IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", com.google.ads.mediation.inmobi.InMobiNetworkKeys.IAB_US_PRIVACY_STRING);
    }

    public static com.google.android.gms.internal.consent_sdk.zzdw zzk(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return zzm(5, "UMP_CoMoAdStoragePurposeConsentStatus", "UMP_CoMoAdUserDataPurposeConsentStatus", "UMP_CoMoAdPersonalizationPurposeConsentStatus", "UMP_CoMoAnalyticsStoragePurposeConsentStatus", com.vungle.ads.internal.model.Cookie.IABTCF_GDPR_APPLIES);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof com.google.android.gms.internal.consent_sdk.zzdw) && zzl() && ((com.google.android.gms.internal.consent_sdk.zzdw) obj).zzl() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        java.util.Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract com.google.android.gms.internal.consent_sdk.zzeb iterator();

    public final com.google.android.gms.internal.consent_sdk.zzdv zzg() {
        com.google.android.gms.internal.consent_sdk.zzdv zzdvVar = this.zza;
        if (zzdvVar != null) {
            return zzdvVar;
        }
        com.google.android.gms.internal.consent_sdk.zzdv zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    com.google.android.gms.internal.consent_sdk.zzdv zzh() {
        java.lang.Object[] array = toArray();
        int i = com.google.android.gms.internal.consent_sdk.zzdv.zzd;
        return com.google.android.gms.internal.consent_sdk.zzdv.zzg(array, array.length);
    }

    boolean zzl() {
        return false;
    }

    private static com.google.android.gms.internal.consent_sdk.zzdw zzm(int i, java.lang.Object... objArr) {
        if (i == 0) {
            return com.google.android.gms.internal.consent_sdk.zzdz.zza;
        }
        if (i == 1) {
            return new com.google.android.gms.internal.consent_sdk.zzea(java.util.Objects.requireNonNull(objArr[0]));
        }
        int zzf = zzf(i);
        java.lang.Object[] objArr2 = new java.lang.Object[zzf];
        int i2 = zzf - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            java.lang.Object obj = objArr[i5];
            if (obj == null) {
                throw new java.lang.NullPointerException("at index " + i5);
            }
            int hashCode = obj.hashCode();
            int zza = com.google.android.gms.internal.consent_sdk.zzdr.zza(hashCode);
            while (true) {
                int i6 = zza & i2;
                java.lang.Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = obj;
                    objArr2[i6] = obj;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (!obj2.equals(obj)) {
                    zza++;
                }
            }
        }
        java.util.Arrays.fill(objArr, i4, i, (java.lang.Object) null);
        if (i4 == 1) {
            return new com.google.android.gms.internal.consent_sdk.zzea(java.util.Objects.requireNonNull(objArr[0]));
        }
        if (zzf(i4) < zzf / 2) {
            return zzm(i4, objArr);
        }
        if (i4 < 3) {
            objArr = java.util.Arrays.copyOf(objArr, i4);
        }
        return new com.google.android.gms.internal.consent_sdk.zzdz(objArr, i3, objArr2, i2, i4);
    }
}
