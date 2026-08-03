package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcbb extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzcbb> CREATOR = new com.google.android.gms.internal.ads.zzcbc();
    android.os.ParcelFileDescriptor zza;
    private android.os.Parcelable zzb = null;
    private boolean zzc = true;

    public zzcbb(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        final android.os.ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        android.os.ParcelFileDescriptor[] createPipe;
        if (this.zza == null) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            try {
                this.zzb.writeToParcel(obtain, 0);
                final byte[] marshall = obtain.marshall();
                obtain.recycle();
                android.os.ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    createPipe = android.os.ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                } catch (java.io.IOException e) {
                    e = e;
                    autoCloseOutputStream = null;
                }
                try {
                    com.google.android.gms.internal.ads.zzcfr.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcba
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            java.io.DataOutputStream dataOutputStream;
                            android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzcbb> creator = com.google.android.gms.internal.ads.zzcbb.CREATOR;
                            byte[] bArr = marshall;
                            java.io.OutputStream outputStream = autoCloseOutputStream;
                            java.io.DataOutputStream dataOutputStream2 = null;
                            try {
                                try {
                                    dataOutputStream = new java.io.DataOutputStream(outputStream);
                                } catch (java.io.IOException e2) {
                                    e = e2;
                                }
                            } catch (java.lang.Throwable th) {
                                th = th;
                            }
                            try {
                                dataOutputStream.writeInt(bArr.length);
                                dataOutputStream.write(bArr);
                                com.google.android.gms.common.util.IOUtils.closeQuietly(dataOutputStream);
                            } catch (java.io.IOException e3) {
                                e = e3;
                                dataOutputStream2 = dataOutputStream;
                                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error transporting the ad response", e);
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "LargeParcelTeleporter.pipeData.1");
                                if (dataOutputStream2 == null) {
                                    com.google.android.gms.common.util.IOUtils.closeQuietly(outputStream);
                                } else {
                                    com.google.android.gms.common.util.IOUtils.closeQuietly(dataOutputStream2);
                                }
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                dataOutputStream2 = dataOutputStream;
                                if (dataOutputStream2 == null) {
                                    com.google.android.gms.common.util.IOUtils.closeQuietly(outputStream);
                                } else {
                                    com.google.android.gms.common.util.IOUtils.closeQuietly(dataOutputStream2);
                                }
                                throw th;
                            }
                        }
                    });
                    parcelFileDescriptor = createPipe[0];
                } catch (java.io.IOException e2) {
                    e = e2;
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Error transporting the ad response", e);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "LargeParcelTeleporter.pipeData.2");
                    com.google.android.gms.common.util.IOUtils.closeQuietly(autoCloseOutputStream);
                    this.zza = parcelFileDescriptor;
                    int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
                    com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
                    com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
                }
                this.zza = parcelFileDescriptor;
            } catch (java.lang.Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        int beginObjectHeader2 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader2);
    }

    public final com.google.android.gms.common.internal.safeparcel.SafeParcelable zza(android.os.Parcelable.Creator creator) {
        if (this.zzc) {
            if (this.zza == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("File descriptor is empty, returning null.");
                return null;
            }
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new android.os.ParcelFileDescriptor.AutoCloseInputStream(this.zza));
            try {
                try {
                    int readInt = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr, 0, readInt);
                    com.google.android.gms.common.util.IOUtils.closeQuietly(dataInputStream);
                    android.os.Parcel obtain = android.os.Parcel.obtain();
                    try {
                        obtain.unmarshall(bArr, 0, readInt);
                        obtain.setDataPosition(0);
                        this.zzb = (android.os.Parcelable) creator.createFromParcel(obtain);
                        obtain.recycle();
                        this.zzc = false;
                    } catch (java.lang.Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (java.io.IOException e) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not read from parcel file descriptor", e);
                    com.google.android.gms.common.util.IOUtils.closeQuietly(dataInputStream);
                    return null;
                }
            } catch (java.lang.Throwable th2) {
                com.google.android.gms.common.util.IOUtils.closeQuietly(dataInputStream);
                throw th2;
            }
        }
        return (com.google.android.gms.common.internal.safeparcel.SafeParcelable) this.zzb;
    }
}
