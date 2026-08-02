package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public final class zzek extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.location.Geofence {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.identity.zzek> CREATOR = new com.google.android.gms.internal.identity.zzel();
    private final java.lang.String zza;
    private final long zzb;
    private final short zzc;
    private final double zzd;
    private final double zze;
    private final float zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;

    public zzek(java.lang.String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str == null || str.length() > 100) {
            java.lang.String.valueOf(str);
            throw new java.lang.IllegalArgumentException("requestId is null or too long: ".concat(java.lang.String.valueOf(str)));
        }
        if (f <= 0.0f) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(f).length() + 16);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (d > 90.0d || d < -90.0d) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(d).length() + 18);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (d2 > 180.0d || d2 < -180.0d) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(d2).length() + 19);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new java.lang.IllegalArgumentException(sb3.toString());
        }
        int i4 = i & 7;
        if (i4 == 0) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 35);
            sb4.append("No supported transition specified: ");
            sb4.append(i);
            throw new java.lang.IllegalArgumentException(sb4.toString());
        }
        this.zzc = s;
        this.zza = str;
        this.zzd = d;
        this.zze = d2;
        this.zzf = f;
        this.zzb = j;
        this.zzg = i4;
        this.zzh = i2;
        this.zzi = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.identity.zzek)) {
            return false;
        }
        com.google.android.gms.internal.identity.zzek zzekVar = (com.google.android.gms.internal.identity.zzek) obj;
        return this.zzf == zzekVar.zzf && this.zzd == zzekVar.zzd && this.zze == zzekVar.zze && this.zzc == zzekVar.zzc && this.zzg == zzekVar.zzg;
    }

    public final int hashCode() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.zzd);
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.zze);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + java.lang.Float.floatToIntBits(this.zzf)) * 31) + this.zzc) * 31) + this.zzg;
    }

    public final java.lang.String toString() {
        short s = this.zzc;
        return java.lang.String.format(java.util.Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", s != -1 ? s != 1 ? "UNKNOWN" : "CIRCLE" : "INVALID", this.zza.replaceAll("\\p{C}", com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION), java.lang.Integer.valueOf(this.zzg), java.lang.Double.valueOf(this.zzd), java.lang.Double.valueOf(this.zze), java.lang.Float.valueOf(this.zzf), java.lang.Integer.valueOf(this.zzh / 1000), java.lang.Integer.valueOf(this.zzi), java.lang.Long.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeShort(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getTransitionTypes() {
        return this.zzg;
    }

    @Override // com.google.android.gms.location.Geofence
    public final java.lang.String getRequestId() {
        return this.zza;
    }

    @Override // com.google.android.gms.location.Geofence
    public final float getRadius() {
        return this.zzf;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getNotificationResponsiveness() {
        return this.zzh;
    }

    @Override // com.google.android.gms.location.Geofence
    public final double getLongitude() {
        return this.zze;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getLoiteringDelay() {
        return this.zzi;
    }

    @Override // com.google.android.gms.location.Geofence
    public final double getLatitude() {
        return this.zzd;
    }

    @Override // com.google.android.gms.location.Geofence
    public final long getExpirationTime() {
        return this.zzb;
    }
}
