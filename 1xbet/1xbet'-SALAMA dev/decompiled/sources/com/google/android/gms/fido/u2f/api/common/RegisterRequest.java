package com.google.android.gms.fido.u2f.api.common;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p140t3.l;
import p147u3.b;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RegisterRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterRequest> CREATOR = new l(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProtocolVersion f11536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f11537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11538d;

    public RegisterRequest(String str, String str2, int i7, byte[] bArr) {
        this.f11535a = i7;
        try {
            this.f11536b = ProtocolVersion.a(str);
            this.f11537c = bArr;
            this.f11538d = str2;
        } catch (b e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequest)) {
            return false;
        }
        RegisterRequest registerRequest = (RegisterRequest) obj;
        if (!Arrays.equals(this.f11537c, registerRequest.f11537c) || this.f11536b != registerRequest.f11536b) {
            return false;
        }
        String str = registerRequest.f11538d;
        String str2 = this.f11538d;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = ((Arrays.hashCode(this.f11537c) + 31) * 31) + this.f11536b.hashCode();
        String str = this.f11538d;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11535a);
        D.s0(parcel, 2, this.f11536b.f11534a, false);
        D.l0(parcel, 3, this.f11537c, false);
        D.s0(parcel, 4, this.f11538d, false);
        D.z0(iX0, parcel);
    }
}
