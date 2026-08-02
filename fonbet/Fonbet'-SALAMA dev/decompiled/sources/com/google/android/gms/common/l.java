package com.google.android.gms.common;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.B;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import o3.BinderC1507b;

/* loaded from: classes.dex */
public abstract class l extends zzb implements B {

    /* renamed from: a, reason: collision with root package name */
    public final int f11362a;

    public l(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        D.b(bArr.length == 25);
        this.f11362a = Arrays.hashCode(bArr);
    }

    public static byte[] Z(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof B)) {
            try {
                B b7 = (B) obj;
                if (((l) b7).f11362a != this.f11362a) {
                    return false;
                }
                return Arrays.equals(t0(), (byte[]) BinderC1507b.t0(new BinderC1507b(((l) b7).t0())));
            } catch (RemoteException e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11362a;
    }

    public abstract byte[] t0();

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            BinderC1507b binderC1507b = new BinderC1507b(t0());
            parcel2.writeNoException();
            zzc.zze(parcel2, binderC1507b);
        } else {
            if (i7 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f11362a);
        }
        return true;
    }
}
