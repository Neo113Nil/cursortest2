package com.google.android.gms.fido.u2f.api.common;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import p031e1.k;
import p140t3.l;
import p147u3.b;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class KeyHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<KeyHandle> CREATOR = new l(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProtocolVersion f11530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f11531d;

    public KeyHandle(int i7, String str, ArrayList arrayList, byte[] bArr) {
        this.f11528a = i7;
        this.f11529b = bArr;
        try {
            this.f11530c = ProtocolVersion.a(str);
            this.f11531d = arrayList;
        } catch (b e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyHandle)) {
            return false;
        }
        KeyHandle keyHandle = (KeyHandle) obj;
        if (!Arrays.equals(this.f11529b, keyHandle.f11529b) || !this.f11530c.equals(keyHandle.f11530c)) {
            return false;
        }
        ArrayList arrayList = this.f11531d;
        ArrayList arrayList2 = keyHandle.f11531d;
        if (arrayList == null && arrayList2 == null) {
            return true;
        }
        return arrayList != null && arrayList2 != null && arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f11529b)), this.f11530c, this.f11531d});
    }

    public final String toString() {
        ArrayList arrayList = this.f11531d;
        String string = arrayList == null ? "null" : arrayList.toString();
        byte[] bArr = this.f11529b;
        StringBuilder sbK = k.k("{keyHandle: ", bArr == null ? null : Base64.encodeToString(bArr, 0), ", version: ");
        sbK.append(this.f11530c);
        sbK.append(", transports: ");
        sbK.append(string);
        sbK.append("}");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11528a);
        D.l0(parcel, 2, this.f11529b, false);
        D.s0(parcel, 3, this.f11530c.f11534a, false);
        D.w0(parcel, 4, this.f11531d, false);
        D.z0(iX0, parcel);
    }
}
