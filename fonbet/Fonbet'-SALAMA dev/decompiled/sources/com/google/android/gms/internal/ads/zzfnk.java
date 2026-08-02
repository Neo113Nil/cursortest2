package com.google.android.gms.internal.ads;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzfnk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfnk> CREATOR = new zzfnl();
    public final int zza;
    private zzasm zzb = null;
    private byte[] zzc;

    public zzfnk(int i7, byte[] bArr) {
        this.zza = i7;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzasm zzasmVar = this.zzb;
        if (zzasmVar != null || this.zzc == null) {
            if (zzasmVar == null || this.zzc != null) {
                if (zzasmVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzasmVar != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zza;
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(i8);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzaV();
        }
        D.l0(parcel, 2, bArr, false);
        D.z0(x02, parcel);
    }

    public final zzasm zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzasm.zzd(this.zzc, zzgwq.zza());
                this.zzc = null;
            } catch (zzgxv | NullPointerException e7) {
                throw new IllegalStateException(e7);
            }
        }
        zzb();
        return this.zzb;
    }
}
