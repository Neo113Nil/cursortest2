package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.server.response.a;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public final class f extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<f> CREATOR = new j();
    public final int a;
    public final String b;

    @Nullable
    public final ArrayList c;

    public f(int i, String str, ArrayList arrayList) {
        this.a = i;
        this.b = str;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 3, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    public f(String str, Map map) {
        ArrayList arrayList;
        this.a = 1;
        this.b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new g((a.C0113a) map.get(str2), str2));
            }
        }
        this.c = arrayList;
    }
}
