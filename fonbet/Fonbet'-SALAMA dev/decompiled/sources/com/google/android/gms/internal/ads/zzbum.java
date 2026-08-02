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
import m3.c;

/* loaded from: classes.dex */
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
        ParcelFileDescriptor[] createPipe;
        if (this.zza == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.zzb.writeToParcel(obtain, 0);
                final byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                } catch (IOException e7) {
                    e = e7;
                    autoCloseOutputStream = null;
                }
                try {
                    zzbza.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbul
                        @Override // java.lang.Runnable
                        public final void run() {
                            DataOutputStream dataOutputStream;
                            Parcelable.Creator<zzbum> creator = zzbum.CREATOR;
                            OutputStream outputStream = autoCloseOutputStream;
                            byte[] bArr = marshall;
                            DataOutputStream dataOutputStream2 = null;
                            try {
                                try {
                                    dataOutputStream = new DataOutputStream(outputStream);
                                } catch (IOException e8) {
                                    e = e8;
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                dataOutputStream.writeInt(bArr.length);
                                dataOutputStream.write(bArr);
                                c.d(dataOutputStream);
                            } catch (IOException e9) {
                                e = e9;
                                dataOutputStream2 = dataOutputStream;
                                int i8 = J.f3546b;
                                j.e("Error transporting the ad response", e);
                                o.f1952C.f1961g.zzw(e, "LargeParcelTeleporter.pipeData.1");
                                if (dataOutputStream2 == null) {
                                    c.d(outputStream);
                                } else {
                                    c.d(dataOutputStream2);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                dataOutputStream2 = dataOutputStream;
                                if (dataOutputStream2 == null) {
                                    c.d(outputStream);
                                } else {
                                    c.d(dataOutputStream2);
                                }
                                throw th;
                            }
                        }
                    });
                    parcelFileDescriptor = createPipe[0];
                } catch (IOException e8) {
                    e = e8;
                    int i8 = J.f3546b;
                    j.e("Error transporting the ad response", e);
                    o.f1952C.f1961g.zzw(e, "LargeParcelTeleporter.pipeData.2");
                    c.d(autoCloseOutputStream);
                    this.zza = parcelFileDescriptor;
                    int x02 = D.x0(20293, parcel);
                    D.r0(parcel, 2, this.zza, i7, false);
                    D.z0(x02, parcel);
                }
                this.zza = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        int x022 = D.x0(20293, parcel);
        D.r0(parcel, 2, this.zza, i7, false);
        D.z0(x022, parcel);
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
                    int readInt = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr, 0, readInt);
                    c.d(dataInputStream);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.unmarshall(bArr, 0, readInt);
                        obtain.setDataPosition(0);
                        this.zzb = (Parcelable) creator.createFromParcel(obtain);
                        obtain.recycle();
                        this.zzc = false;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (IOException e7) {
                    int i8 = J.f3546b;
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
