package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public class PatternItem extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.PatternItem> CREATOR = new com.google.android.gms.maps.model.zzq();
    private static final java.lang.String zza = "PatternItem";
    private final int zzb;
    private final java.lang.Float zzc;

    public PatternItem(int i, java.lang.Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(f);
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, sb.toString());
        this.zzb = i;
        this.zzc = f;
    }

    static java.util.List zza(java.util.List list) {
        com.google.android.gms.maps.model.PatternItem dash;
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.maps.model.PatternItem patternItem = (com.google.android.gms.maps.model.PatternItem) it.next();
            if (patternItem == null) {
                patternItem = null;
            } else {
                int i = patternItem.zzb;
                if (i == 0) {
                    java.lang.Float f = patternItem.zzc;
                    com.google.android.gms.common.internal.Preconditions.checkState(f != null, "length must not be null.");
                    dash = new com.google.android.gms.maps.model.Dash(f.floatValue());
                } else if (i == 1) {
                    patternItem = new com.google.android.gms.maps.model.Dot();
                } else if (i == 2) {
                    java.lang.Float f2 = patternItem.zzc;
                    com.google.android.gms.common.internal.Preconditions.checkState(f2 != null, "length must not be null.");
                    dash = new com.google.android.gms.maps.model.Gap(f2.floatValue());
                }
                patternItem = dash;
            }
            arrayList.add(patternItem);
        }
        return arrayList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.maps.model.PatternItem)) {
            return false;
        }
        com.google.android.gms.maps.model.PatternItem patternItem = (com.google.android.gms.maps.model.PatternItem) obj;
        return this.zzb == patternItem.zzb && com.google.android.gms.common.internal.Objects.equal(this.zzc, patternItem.zzc);
    }

    public int hashCode() {
        int i = this.zzb;
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(i), this.zzc);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[PatternItem: type=");
        sb.append(this.zzb);
        sb.append(" length=");
        sb.append(this.zzc);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zzb;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatObject(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
