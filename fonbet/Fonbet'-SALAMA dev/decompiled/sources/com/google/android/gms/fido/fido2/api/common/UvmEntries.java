package com.google.android.gms.fido.fido2.api.common;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import k3.C1338c;

/* loaded from: classes.dex */
public class UvmEntries extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntries> CREATOR = new C1338c(23);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11501a;

    public UvmEntries(ArrayList arrayList) {
        this.f11501a = arrayList;
    }

    public final boolean equals(Object obj) {
        ArrayList arrayList;
        if (!(obj instanceof UvmEntries)) {
            return false;
        }
        UvmEntries uvmEntries = (UvmEntries) obj;
        ArrayList arrayList2 = this.f11501a;
        return (arrayList2 == null && uvmEntries.f11501a == null) || (arrayList2 != null && (arrayList = uvmEntries.f11501a) != null && arrayList2.containsAll(arrayList) && uvmEntries.f11501a.containsAll(arrayList2));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f11501a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.w0(parcel, 1, this.f11501a, false);
        D.z0(x02, parcel);
    }
}
