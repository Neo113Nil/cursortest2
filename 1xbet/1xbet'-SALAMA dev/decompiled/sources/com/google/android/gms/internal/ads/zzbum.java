package com.google.android.gms.internal.ads;

import E2.o;
import I2.J;
import J2.j;
import Y4.D;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p090m3.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzbum extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbum> CREATOR = new zzbun();
    ParcelFileDescriptor zza;
    private Parcelable zzb = null;
    private boolean zzc = true;

    public zzbum(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.zza == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.zzb.writeToParcel(parcelObtain, 0);
                final byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
                    try {
                        zzbza.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbul
                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                Parcelable.Creator<zzbum> creator = zzbum.CREATOR;
                                OutputStream outputStream = autoCloseOutputStream;
                                byte[] bArr = bArrMarshall;
                                DataOutputStream dataOutputStream = null;
                                try {
                                    try {
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                                        try {
                                            dataOutputStream2.writeInt(bArr.length);
                                            dataOutputStream2.write(bArr);
                                            c.d(dataOutputStream2);
                                        } catch (IOException e7) {
                                            e = e7;
                                            dataOutputStream = dataOutputStream2;
                                            int i8 = J.f3546b;
                                            j.e("Error transporting the ad response", e);
                                            o.f1952C.f1961g.zzw(e, "LargeParcelTeleporter.pipeData.1");
                                            if (dataOutputStream == null) {
                                                c.d(outputStream);
                                            } else {
                                                c.d(dataOutputStream);
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream == null) {
                                                c.d(outputStream);
                                            } else {
                                                c.d(dataOutputStream);
                                            }
                                            throw th;
                                        }
                                    } catch (IOException e8) {
                                        e = e8;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        });
                        parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                    } catch (IOException e7) {
                        e = e7;
                        int i8 = J.f3546b;
                        j.e("Error transporting the ad response", e);
                        o.f1952C.f1961g.zzw(e, "LargeParcelTeleporter.pipeData.2");
                        c.d(autoCloseOutputStream);
                    }
                } catch (IOException e8) {
                    e = e8;
                    autoCloseOutputStream = null;
                }
                this.zza = parcelFileDescriptor;
            } catch (Throwable th) {
                parcelObtain.recycle();
                throw th;
            }
        }
        int iX0 = D.x0(20293, parcel);
        D.r0(parcel, 2, this.zza, i7, false);
        D.z0(iX0, parcel);
    }

    public final SafeParcelable zza(Parcelable.Creator creator) {
        if (this.zzc) {
            if (this.zza == null) {
                int i7 = J.f3546b;
                j.d("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zza));
            try {
                try {
                    int i8 = dataInputStream.readInt();
                    byte[] bArr = new byte[i8];
                    dataInputStream.readFully(bArr, 0, i8);
                    c.d(dataInputStream);
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(bArr, 0, i8);
                        parcelObtain.setDataPosition(0);
                        this.zzb = (Parcelable) creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        this.zzc = false;
                    } catch (Throwable th) {
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (IOException e7) {
                    int i9 = J.f3546b;
                    j.e("Could not read from parcel file descriptor", e7);
                    c.d(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                c.d(dataInputStream);
                throw th2;
            }
        }
        return (SafeParcelable) this.zzb;
    }
}
