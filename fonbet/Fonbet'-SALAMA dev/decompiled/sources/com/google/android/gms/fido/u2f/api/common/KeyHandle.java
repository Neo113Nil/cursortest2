package com.google.android.gms.fido.u2f.api.common;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import e1.k;
import java.util.ArrayList;
import java.util.Arrays;
import t3.l;
import u3.b;

@Deprecated
/* loaded from: classes.dex */
public class KeyHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<KeyHandle> CREATOR = new l(14);

    /* renamed from: a, reason: collision with root package name */
    public final int f11528a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f11529b;

    /* renamed from: c, reason: collision with root package name */
    public final ProtocolVersion f11530c;

    /* renamed from: d, reason: collision with root package name */
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
        String obj = arrayList == null ? "null" : arrayList.toString();
        byte[] bArr = this.f11529b;
        StringBuilder k7 = k.k("{keyHandle: ", bArr == null ? null : Base64.encodeToString(bArr, 0), ", version: ");
        k7.append(this.f11530c);
        k7.append(", transports: ");
        k7.append(obj);
        k7.append("}");
        return k7.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11528a);
        D.l0(parcel, 2, this.f11529b, false);
        D.s0(parcel, 3, this.f11530c.f11534a, false);
        D.w0(parcel, 4, this.f11531d, false);
        D.z0(x02, parcel);
    }
}
