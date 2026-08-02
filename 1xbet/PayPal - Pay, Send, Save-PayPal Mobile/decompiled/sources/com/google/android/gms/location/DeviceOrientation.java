package com.google.android.gms.location;

/* loaded from: classes8.dex */
public class DeviceOrientation extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.DeviceOrientation> CREATOR = new com.google.android.gms.location.zzm();
    private final float[] zza;
    private final float zzb;
    private final float zzc;
    private final long zzd;
    private final byte zze;
    private final float zzf;
    private final float zzg;

    DeviceOrientation(float[] fArr, float f, float f2, long j, byte b, float f3, float f4) {
        zzj(fArr);
        com.google.android.gms.internal.identity.zzer.zza(f >= 0.0f && f < 360.0f);
        com.google.android.gms.internal.identity.zzer.zza(f2 >= 0.0f && f2 <= 180.0f);
        com.google.android.gms.internal.identity.zzer.zza(f4 >= 0.0f && f4 <= 180.0f);
        com.google.android.gms.internal.identity.zzer.zza(j >= 0);
        this.zza = fArr;
        this.zzb = f;
        this.zzc = f2;
        this.zzf = f3;
        this.zzg = f4;
        this.zzd = j;
        this.zze = (byte) (((byte) (((byte) (b | 16)) | 4)) | 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzj(float[] fArr) {
        com.google.android.gms.internal.identity.zzer.zzb(fArr != null && fArr.length == 4, "Input attitude array should be of length 4.");
        com.google.android.gms.internal.identity.zzer.zzb((java.lang.Float.isNaN(fArr[0]) || java.lang.Float.isNaN(fArr[1]) || java.lang.Float.isNaN(fArr[2]) || java.lang.Float.isNaN(fArr[3])) ? false : true, "Input attitude cannot contain NaNs.");
    }

    @org.checkerframework.dataflow.qual.Pure
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.location.DeviceOrientation)) {
            return false;
        }
        com.google.android.gms.location.DeviceOrientation deviceOrientation = (com.google.android.gms.location.DeviceOrientation) obj;
        return java.lang.Float.compare(this.zzb, deviceOrientation.zzb) == 0 && java.lang.Float.compare(this.zzc, deviceOrientation.zzc) == 0 && (zza() == deviceOrientation.zza() && (!zza() || java.lang.Float.compare(this.zzf, deviceOrientation.zzf) == 0)) && (hasConservativeHeadingErrorDegrees() == deviceOrientation.hasConservativeHeadingErrorDegrees() && (!hasConservativeHeadingErrorDegrees() || java.lang.Float.compare(getConservativeHeadingErrorDegrees(), deviceOrientation.getConservativeHeadingErrorDegrees()) == 0)) && this.zzd == deviceOrientation.zzd && java.util.Arrays.equals(this.zza, deviceOrientation.zza);
    }

    @org.checkerframework.dataflow.qual.Pure
    public float[] getAttitude() {
        return (float[]) this.zza.clone();
    }

    @org.checkerframework.dataflow.qual.Pure
    public int hashCode() {
        float f = this.zzb;
        float f2 = this.zzc;
        float f3 = this.zzg;
        long j = this.zzd;
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2), java.lang.Float.valueOf(f3), java.lang.Long.valueOf(j), this.zza, java.lang.Byte.valueOf(this.zze));
    }

    @org.checkerframework.dataflow.qual.Pure
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceOrientation[attitude=");
        sb.append(java.util.Arrays.toString(this.zza));
        sb.append(", headingDegrees=");
        sb.append(this.zzb);
        sb.append(", headingErrorDegrees=");
        sb.append(this.zzc);
        if (hasConservativeHeadingErrorDegrees()) {
            sb.append(", conservativeHeadingErrorDegrees=");
            sb.append(this.zzg);
        }
        sb.append(", elapsedRealtimeNs=");
        sb.append(this.zzd);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatArray(parcel, 1, getAttitude(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 4, getHeadingDegrees());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 5, getHeadingErrorDegrees());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 6, getElapsedRealtimeNs());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByte(parcel, 7, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 8, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 9, getConservativeHeadingErrorDegrees());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static final class Builder {
        private final float[] zza;
        private float zzb;
        private float zzc;
        private long zzd;
        private byte zze;
        private float zzf;
        private float zzg;

        public Builder(com.google.android.gms.location.DeviceOrientation deviceOrientation) {
            this.zze = (byte) 0;
            com.google.android.gms.location.DeviceOrientation.zzj(deviceOrientation.zzc());
            this.zza = java.util.Arrays.copyOf(deviceOrientation.zzc(), deviceOrientation.zzc().length);
            setHeadingDegrees(deviceOrientation.zzd());
            setHeadingErrorDegrees(deviceOrientation.zze());
            setConservativeHeadingErrorDegrees(deviceOrientation.zzi());
            setElapsedRealtimeNs(deviceOrientation.zzf());
            this.zzf = deviceOrientation.zzh();
            this.zze = deviceOrientation.zzg();
        }

        public final com.google.android.gms.location.DeviceOrientation build() {
            return new com.google.android.gms.location.DeviceOrientation(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
        }

        public final com.google.android.gms.location.DeviceOrientation.Builder setAttitude(float[] fArr) {
            com.google.android.gms.location.DeviceOrientation.zzj(fArr);
            java.lang.System.arraycopy(fArr, 0, this.zza, 0, fArr.length);
            return this;
        }

        public final com.google.android.gms.location.DeviceOrientation.Builder setConservativeHeadingErrorDegrees(float f) {
            boolean z = false;
            if (f >= 0.0f && f <= 180.0f) {
                z = true;
            }
            com.google.android.gms.internal.identity.zzer.zzb(z, "conservativeHeadingErrorDegrees should be between 0 and 180.");
            this.zzg = f;
            this.zze = (byte) (this.zze | 64);
            android.os.Parcelable.Creator<com.google.android.gms.location.DeviceOrientation> creator = com.google.android.gms.location.DeviceOrientation.CREATOR;
            this.zzf = f < 180.0f ? (float) (2.0d / (1.0d - java.lang.Math.cos(java.lang.Math.toRadians(f)))) : 0.0f;
            this.zze = (byte) (this.zze | 32);
            return this;
        }

        public final com.google.android.gms.location.DeviceOrientation.Builder setElapsedRealtimeNs(long j) {
            com.google.android.gms.internal.identity.zzer.zzb(j >= 0, "elapsedRealtimeNs should be greater than or equal to 0.");
            this.zzd = j;
            return this;
        }

        public final com.google.android.gms.location.DeviceOrientation.Builder setHeadingDegrees(float f) {
            boolean z = false;
            if (f >= 0.0f && f < 360.0f) {
                z = true;
            }
            com.google.android.gms.internal.identity.zzer.zzb(z, "headingDegrees should be greater than or equal to 0 and less than 360.");
            this.zzb = f;
            return this;
        }

        public final com.google.android.gms.location.DeviceOrientation.Builder setHeadingErrorDegrees(float f) {
            boolean z = false;
            if (f >= 0.0f && f <= 180.0f) {
                z = true;
            }
            com.google.android.gms.internal.identity.zzer.zzb(z, "headingErrorDegrees should be between 0 and 180.");
            this.zzc = f;
            return this;
        }

        public Builder(float[] fArr, float f, float f2, long j) {
            this.zze = (byte) 0;
            com.google.android.gms.location.DeviceOrientation.zzj(fArr);
            this.zza = java.util.Arrays.copyOf(fArr, fArr.length);
            setHeadingDegrees(f);
            setHeadingErrorDegrees(f2);
            setElapsedRealtimeNs(j);
            this.zzf = 0.0f;
            this.zzg = 180.0f;
            this.zze = (byte) 0;
        }

        public final com.google.android.gms.location.DeviceOrientation.Builder clearConservativeHeadingErrorDegrees() {
            this.zzg = 180.0f;
            byte b = this.zze;
            this.zzf = 0.0f;
            this.zze = (byte) (((byte) (b & com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus)) & (-33));
            return this;
        }
    }

    final /* synthetic */ float zzi() {
        return this.zzg;
    }

    final /* synthetic */ float zzh() {
        return this.zzf;
    }

    final /* synthetic */ byte zzg() {
        return this.zze;
    }

    final /* synthetic */ long zzf() {
        return this.zzd;
    }

    final /* synthetic */ float zze() {
        return this.zzc;
    }

    final /* synthetic */ float zzd() {
        return this.zzb;
    }

    final /* synthetic */ float[] zzc() {
        return this.zza;
    }

    @org.checkerframework.dataflow.qual.Pure
    public final boolean zza() {
        return (this.zze & 32) != 0;
    }

    @org.checkerframework.dataflow.qual.Pure
    public boolean hasConservativeHeadingErrorDegrees() {
        return (this.zze & 64) != 0;
    }

    @org.checkerframework.dataflow.qual.Pure
    public float getHeadingErrorDegrees() {
        return this.zzc;
    }

    @org.checkerframework.dataflow.qual.Pure
    public float getHeadingDegrees() {
        return this.zzb;
    }

    @org.checkerframework.dataflow.qual.Pure
    public long getElapsedRealtimeNs() {
        return this.zzd;
    }

    @org.checkerframework.dataflow.qual.Pure
    public float getConservativeHeadingErrorDegrees() {
        return this.zzg;
    }
}
