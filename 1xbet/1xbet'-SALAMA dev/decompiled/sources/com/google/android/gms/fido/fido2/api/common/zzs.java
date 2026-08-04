package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import p140t3.l;

/* JADX INFO: loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new l(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11519a;

    public zzs(ArrayList arrayList) {
        D.i(arrayList);
        this.f11519a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        ArrayList arrayList = zzsVar.f11519a;
        ArrayList arrayList2 = this.f11519a;
        return arrayList2.containsAll(arrayList) && zzsVar.f11519a.containsAll(arrayList2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f11519a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.w0(parcel, 1, this.f11519a, false);
        Y4.D.z0(iX0, parcel);
    }
}
