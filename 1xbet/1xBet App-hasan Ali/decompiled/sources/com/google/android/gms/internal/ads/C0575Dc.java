package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k4.AbstractC2036a;
import n3.AbstractC2187a;
import org.json.JSONArray;

/* renamed from: com.google.android.gms.internal.ads.Dc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0575Dc extends AbstractC2187a {
    public static final Parcelable.Creator<C0575Dc> CREATOR = new C0730Zb(6);

    /* renamed from: k, reason: collision with root package name */
    public final String f8197k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8198l;

    public C0575Dc(String str, int i) {
        this.f8197k = str;
        this.f8198l = i;
    }

    public static C0575Dc a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new C0575Dc(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0575Dc)) {
            C0575Dc c0575Dc = (C0575Dc) obj;
            if (m3.v.g(this.f8197k, c0575Dc.f8197k) && m3.v.g(Integer.valueOf(this.f8198l), Integer.valueOf(c0575Dc.f8198l))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8197k, Integer.valueOf(this.f8198l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.f0(parcel, 2, this.f8197k);
        AbstractC2036a.n0(parcel, 3, 4);
        parcel.writeInt(this.f8198l);
        AbstractC2036a.m0(parcel, k02);
    }
}
