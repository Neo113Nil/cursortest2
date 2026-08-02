package com.google.android.gms.internal.consent_sdk;

import e1.k;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class zzdf extends zzdb implements Set {
    private transient zzde zza;

    public static int zzf(int i7) {
        int max = Math.max(i7, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
        } while (highestOneBit * 0.7d < max);
        return highestOneBit;
    }

    public static zzdf zzi() {
        return zzdi.zza;
    }

    public static zzdf zzj(Object obj, Object obj2, Object obj3, Object obj4) {
        return zzm(4, "IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    }

    public static zzdf zzk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzm(5, "UMP_CoMoAdStoragePurposeConsentStatus", "UMP_CoMoAdUserDataPurposeConsentStatus", "UMP_CoMoAdPersonalizationPurposeConsentStatus", "UMP_CoMoAnalyticsStoragePurposeConsentStatus", "IABTCF_gdprApplies");
    }

    private static zzdf zzm(int i7, Object... objArr) {
        if (i7 == 0) {
            return zzdi.zza;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzdj(obj);
        }
        int zzf = zzf(i7);
        Object[] objArr2 = new Object[zzf];
        int i8 = zzf - 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            Object obj2 = objArr[i11];
            if (obj2 == null) {
                throw new NullPointerException(k.d(i11, "at index "));
            }
            int hashCode = obj2.hashCode();
            int zza = zzda.zza(hashCode);
            while (true) {
                int i12 = zza & i8;
                Object obj3 = objArr2[i12];
                if (obj3 == null) {
                    objArr[i10] = obj2;
                    objArr2[i12] = obj2;
                    i9 += hashCode;
                    i10++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    zza++;
                }
            }
        }
        Arrays.fill(objArr, i10, i7, (Object) null);
        if (i10 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzdj(obj4);
        }
        if (zzf(i10) < zzf / 2) {
            return zzm(i10, objArr);
        }
        if (i10 < 3) {
            objArr = Arrays.copyOf(objArr, i10);
        }
        return new zzdi(objArr, i9, objArr2, i8, i10);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzdf) && zzl() && ((zzdf) obj).zzl() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i7 += next != null ? next.hashCode() : 0;
        }
        return i7;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzdk iterator();

    public final zzde zzg() {
        zzde zzdeVar = this.zza;
        if (zzdeVar != null) {
            return zzdeVar;
        }
        zzde zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    public zzde zzh() {
        Object[] array = toArray();
        int i7 = zzde.zzd;
        return zzde.zzg(array, array.length);
    }

    public boolean zzl() {
        return false;
    }
}
