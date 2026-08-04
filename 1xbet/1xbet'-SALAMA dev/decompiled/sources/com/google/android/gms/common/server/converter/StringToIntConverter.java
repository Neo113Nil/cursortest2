package com.google.android.gms.common.server.converter;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class StringToIntConverter extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new E(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f11369b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f11370c = new SparseArray();

    public StringToIntConverter(ArrayList arrayList, int i7) {
        this.f11368a = i7;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            zac zacVar = (zac) arrayList.get(i8);
            String str = zacVar.f11374b;
            int i9 = zacVar.f11375c;
            this.f11369b.put(str, Integer.valueOf(i9));
            this.f11370c.put(i9, str);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11368a);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f11369b;
        for (String str : map.keySet()) {
            arrayList.add(new zac(str, ((Integer) map.get(str)).intValue()));
        }
        D.w0(parcel, 2, arrayList, false);
        D.z0(iX0, parcel);
    }
}
