package com.bytedance.adsdk.ugeno.kj;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public abstract class pcc implements Parcelable {
    private final Parcelable sf;
    public static final pcc pcc = new pcc() { // from class: com.bytedance.adsdk.ugeno.kj.pcc.1
    };
    public static final Parcelable.Creator<pcc> CREATOR = new Parcelable.ClassLoaderCreator<pcc>() { // from class: com.bytedance.adsdk.ugeno.kj.pcc.2
        @Override // android.os.Parcelable.Creator
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public pcc createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public pcc createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) != null) {
                throw new IllegalStateException("superState must be null");
            }
            return pcc.pcc;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public pcc[] newArray(int i) {
            return new pcc[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private pcc() {
        this.sf = null;
    }

    protected pcc(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.sf = parcelable == pcc ? null : parcelable;
    }

    protected pcc(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.sf = readParcelable == null ? pcc : readParcelable;
    }

    public final Parcelable pcc() {
        return this.sf;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.sf, i);
    }
}
