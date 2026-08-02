package com.google.android.gms.common.server.response;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Map;
import k3.C1338c;

/* loaded from: classes.dex */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new C1338c(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f11394a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11395b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f11396c;

    public zal(int i7, String str, ArrayList arrayList) {
        this.f11394a = i7;
        this.f11395b = str;
        this.f11396c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11394a);
        D.s0(parcel, 2, this.f11395b, false);
        D.w0(parcel, 3, this.f11396c, false);
        D.z0(x02, parcel);
    }

    public zal(String str, Map map) {
        ArrayList arrayList;
        this.f11394a = 1;
        this.f11395b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam((FastJsonResponse$Field) map.get(str2), str2));
            }
        }
        this.f11396c = arrayList;
    }
}
