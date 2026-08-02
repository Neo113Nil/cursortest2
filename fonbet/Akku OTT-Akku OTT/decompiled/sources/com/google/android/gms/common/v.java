package com.google.android.gms.common;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.P;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class v extends zzb implements P {
    public static final /* synthetic */ int b = 0;
    public final int a;

    public v(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        C0875q.a(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    public static byte[] C(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public abstract byte[] D();

    public final boolean equals(@Nullable Object obj) {
        com.google.android.gms.dynamic.a zzd;
        if (obj == null || !(obj instanceof P)) {
            return false;
        }
        try {
            P p = (P) obj;
            if (p.zzc() == this.a && (zzd = p.zzd()) != null) {
                return Arrays.equals(D(), (byte[]) com.google.android.gms.dynamic.b.D(zzd));
            }
            return false;
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            com.google.android.gms.dynamic.a zzd = zzd();
            parcel2.writeNoException();
            zzc.zze(parcel2, zzd);
        } else {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.a);
        }
        return true;
    }

    @Override // com.google.android.gms.common.internal.P
    public final int zzc() {
        return this.a;
    }

    @Override // com.google.android.gms.common.internal.P
    public final com.google.android.gms.dynamic.a zzd() {
        return new com.google.android.gms.dynamic.b(D());
    }
}
