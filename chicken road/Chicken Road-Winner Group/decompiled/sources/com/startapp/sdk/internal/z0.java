package com.startapp.sdk.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.model.AdDetails;

/* loaded from: classes.dex */
public final class z0 extends View.BaseSavedState {
    public static final Parcelable.Creator<z0> CREATOR = new y0();

    /* renamed from: a, reason: collision with root package name */
    public AdDetails[] f4751a;

    /* renamed from: b, reason: collision with root package name */
    public float f4752b;

    /* renamed from: c, reason: collision with root package name */
    public int f4753c;

    /* renamed from: d, reason: collision with root package name */
    public int f4754d;

    /* renamed from: e, reason: collision with root package name */
    public int f4755e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4756g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4757h;

    /* renamed from: i, reason: collision with root package name */
    public AdInformationOverrides f4758i;

    /* renamed from: j, reason: collision with root package name */
    public BannerOptions f4759j;

    /* renamed from: k, reason: collision with root package name */
    public final AdRulesResult f4760k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4761l;

    /* renamed from: m, reason: collision with root package name */
    public c1[] f4762m;

    public z0(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        if (!this.f4761l) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(this.f4755e);
        parcel.writeFloat(this.f4752b);
        parcel.writeInt(this.f4753c);
        parcel.writeInt(this.f4754d);
        parcel.writeParcelableArray(this.f4751a, i3);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.f4756g ? 1 : 0);
        parcel.writeInt(this.f4757h ? 1 : 0);
        c1[] c1VarArr = this.f4762m;
        if (c1VarArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(c1VarArr.length);
            for (c1 c1Var : this.f4762m) {
                parcel.writeParcelable(c1Var, i3);
            }
        }
        parcel.writeSerializable(this.f4758i);
        parcel.writeSerializable(this.f4759j);
        parcel.writeSerializable(this.f4760k);
    }

    public z0(Parcel parcel) {
        super(parcel);
        if (parcel.readInt() != 1) {
            this.f4761l = false;
            return;
        }
        this.f4761l = true;
        this.f4755e = parcel.readInt();
        this.f4752b = parcel.readFloat();
        this.f4753c = parcel.readInt();
        this.f4754d = parcel.readInt();
        Parcelable[] readParcelableArray = parcel.readParcelableArray(AdDetails.class.getClassLoader());
        if (readParcelableArray != null) {
            AdDetails[] adDetailsArr = new AdDetails[readParcelableArray.length];
            this.f4751a = adDetailsArr;
            System.arraycopy(readParcelableArray, 0, adDetailsArr, 0, readParcelableArray.length);
        }
        int readInt = parcel.readInt();
        this.f = false;
        if (readInt == 1) {
            this.f = true;
        }
        int readInt2 = parcel.readInt();
        this.f4756g = false;
        if (readInt2 == 1) {
            this.f4756g = true;
        }
        int readInt3 = parcel.readInt();
        this.f4757h = false;
        if (readInt3 == 1) {
            this.f4757h = true;
        }
        int readInt4 = parcel.readInt();
        if (readInt4 > 0) {
            this.f4762m = new c1[readInt4];
            for (int i3 = 0; i3 < readInt4; i3++) {
                this.f4762m[i3] = (c1) parcel.readParcelable(c1.class.getClassLoader());
            }
        }
        this.f4758i = (AdInformationOverrides) parcel.readSerializable();
        this.f4759j = (BannerOptions) parcel.readSerializable();
        this.f4760k = (AdRulesResult) parcel.readSerializable();
    }
}
