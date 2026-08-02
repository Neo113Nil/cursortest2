package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T0 implements InterfaceC1592t5 {
    public static final Parcelable.Creator<T0> CREATOR = new C1812y0(16);

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f11609k;

    public T0(ArrayList arrayList) {
        this.f11609k = arrayList;
        boolean z3 = false;
        if (!arrayList.isEmpty()) {
            long j5 = ((S0) arrayList.get(0)).f11481l;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((S0) arrayList.get(i)).f11480k < j5) {
                    z3 = true;
                    break;
                } else {
                    j5 = ((S0) arrayList.get(i)).f11481l;
                    i++;
                }
            }
        }
        AbstractC1668us.S(!z3);
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
        if (obj == null || T0.class != obj.getClass()) {
            return false;
        }
        return this.f11609k.equals(((T0) obj).f11609k);
    }

    public final int hashCode() {
        return this.f11609k.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.f11609k.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f11609k);
    }
}
