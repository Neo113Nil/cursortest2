package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.server.response.a;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class a extends com.google.android.gms.common.internal.safeparcel.a implements a.b<String, Integer> {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new e();
    public final int a;
    public final HashMap b;
    public final SparseArray c;

    public a() {
        this.a = 1;
        this.b = new HashMap();
        this.c = new SparseArray();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.b;
        for (String str : hashMap.keySet()) {
            arrayList.add(new d(str, ((Integer) hashMap.get(str)).intValue()));
        }
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 2, arrayList, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    public a(int i, ArrayList arrayList) {
        this.a = i;
        this.b = new HashMap();
        this.c = new SparseArray();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) arrayList.get(i2);
            String str = dVar.b;
            int i3 = dVar.c;
            this.b.put(str, Integer.valueOf(i3));
            this.c.put(i3, str);
        }
    }
}
