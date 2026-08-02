package com.google.android.gms.safetynet;

/* loaded from: classes8.dex */
public class SafeBrowsingData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.safetynet.SafeBrowsingData> CREATOR = new com.google.android.gms.safetynet.zzj();
    private static final java.lang.String zza = "SafeBrowsingData";
    private java.lang.String zzb;
    private com.google.android.gms.common.data.DataHolder zzc;
    private android.os.ParcelFileDescriptor zzd;
    private long zze;
    private byte[] zzf;
    private byte[] zzg;
    private java.io.File zzh;

    public SafeBrowsingData() {
        this(null, null, null, 0L, null);
    }

    private static final void zza(java.io.Closeable closeable) {
        try {
            closeable.close();
        } catch (java.io.IOException unused) {
        }
    }

    public byte[] getSerializedLists() {
        android.os.ParcelFileDescriptor parcelFileDescriptor = this.zzd;
        if (parcelFileDescriptor == null) {
            return null;
        }
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
        try {
            byte[] bArr = new byte[dataInputStream.readInt()];
            dataInputStream.read(bArr);
            return bArr;
        } catch (java.io.IOException unused) {
            return null;
        } finally {
            zza(dataInputStream);
            this.zzd = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void writeToParcel(android.os.Parcel parcel, int i) {
        java.io.File file;
        java.io.FileOutputStream fileOutputStream;
        java.io.File file2 = null;
        if (this.zzd == null && this.zzg != null) {
            java.io.File file3 = this.zzh;
            if (file3 != null) {
                try {
                    file = java.io.File.createTempFile("xlb", ".tmp", file3);
                } catch (java.io.IOException unused) {
                    file = null;
                } catch (java.lang.Throwable th) {
                    th = th;
                }
                try {
                    fileOutputStream = new java.io.FileOutputStream(file);
                    this.zzd = android.os.ParcelFileDescriptor.open(file, 268435456);
                    if (file != null) {
                        file.delete();
                    }
                } catch (java.io.IOException unused2) {
                    if (file != null) {
                        file.delete();
                    }
                    fileOutputStream = null;
                    if (fileOutputStream != null) {
                    }
                    com.google.android.gms.safetynet.zzj.zza(this, parcel, i);
                    this.zzd = null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    file2 = file;
                    if (file2 != null) {
                        file2.delete();
                    }
                    throw th;
                }
                if (fileOutputStream != null) {
                    java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.BufferedOutputStream(fileOutputStream));
                    try {
                        dataOutputStream.writeInt(this.zzg.length);
                        dataOutputStream.write(this.zzg);
                        zza(dataOutputStream);
                        com.google.android.gms.safetynet.zzj.zza(this, parcel, i | 1);
                    } catch (java.io.IOException unused3) {
                        zza(dataOutputStream);
                    } catch (java.lang.Throwable th3) {
                        zza(dataOutputStream);
                        throw th3;
                    }
                    this.zzd = null;
                }
            }
            fileOutputStream = null;
            if (fileOutputStream != null) {
            }
        }
        com.google.android.gms.safetynet.zzj.zza(this, parcel, i);
        this.zzd = null;
    }

    public SafeBrowsingData(long j, byte[] bArr) {
        this(null, null, null, j, bArr);
    }

    public SafeBrowsingData(java.lang.String str) {
        this(str, null, null, 0L, null);
    }

    public SafeBrowsingData(java.lang.String str, com.google.android.gms.common.data.DataHolder dataHolder) {
        this(str, dataHolder, null, 0L, null);
    }

    public SafeBrowsingData(java.lang.String str, com.google.android.gms.common.data.DataHolder dataHolder, android.os.ParcelFileDescriptor parcelFileDescriptor, long j, byte[] bArr) {
        this.zzb = str;
        this.zzc = dataHolder;
        this.zzd = parcelFileDescriptor;
        this.zze = j;
        this.zzf = bArr;
    }

    public void setTempDir(java.io.File file) {
        if (file != null) {
            this.zzh = file;
        }
    }

    public void setSerializedLists(byte[] bArr) {
        this.zzg = bArr;
    }

    public byte[] getState() {
        return this.zzf;
    }

    public java.lang.String getMetadata() {
        return this.zzb;
    }

    public com.google.android.gms.common.data.DataHolder getListsDataHolder() {
        return this.zzc;
    }

    public long getLastUpdateTimeMs() {
        return this.zze;
    }

    public android.os.ParcelFileDescriptor getFileDescriptor() {
        return this.zzd;
    }
}
