package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public abstract class zzam extends com.google.android.gms.internal.play_billing.zzaf implements java.util.Set {

    @javax.annotation.CheckForNull
    private transient com.google.android.gms.internal.play_billing.zzai zza;

    zzam() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this || obj == this) {
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
    public final int hashCode() {
        return com.google.android.gms.internal.play_billing.zzau.zza(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf
    public com.google.android.gms.internal.play_billing.zzai zzd() {
        com.google.android.gms.internal.play_billing.zzai zzaiVar = this.zza;
        if (zzaiVar != null) {
            return zzaiVar;
        }
        com.google.android.gms.internal.play_billing.zzai zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract com.google.android.gms.internal.play_billing.zzav iterator();

    com.google.android.gms.internal.play_billing.zzai zzh() {
        java.lang.Object[] array = toArray();
        int i = com.google.android.gms.internal.play_billing.zzai.zzd;
        return com.google.android.gms.internal.play_billing.zzai.zzi(array, array.length);
    }
}
