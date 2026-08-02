package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class V0 implements InterfaceC1592t5 {
    public static final Parcelable.Creator<V0> CREATOR = new C1812y0(18);

    /* renamed from: k, reason: collision with root package name */
    public final float f11850k;

    /* renamed from: l, reason: collision with root package name */
    public final int f11851l;

    public V0(int i, float f) {
        this.f11850k = f;
        this.f11851l = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1592t5
    public final /* synthetic */ void d(C1412p4 c1412p4) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && V0.class == obj.getClass()) {
            V0 v02 = (V0) obj;
            if (this.f11850k == v02.f11850k && this.f11851l == v02.f11851l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f11850k).hashCode() + 527) * 31) + this.f11851l;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f11850k + ", svcTemporalLayerCount=" + this.f11851l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f11850k);
        parcel.writeInt(this.f11851l);
    }

    public /* synthetic */ V0(Parcel parcel) {
        this.f11850k = parcel.readFloat();
        this.f11851l = parcel.readInt();
    }
}
