package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.nG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1334nG implements Comparator, Parcelable {
    public static final Parcelable.Creator<C1334nG> CREATOR = new C0730Zb(19);

    /* renamed from: k, reason: collision with root package name */
    public final XF[] f14645k;

    /* renamed from: l, reason: collision with root package name */
    public int f14646l;

    /* renamed from: m, reason: collision with root package name */
    public final String f14647m;

    /* renamed from: n, reason: collision with root package name */
    public final int f14648n;

    public C1334nG(Parcel parcel) {
        this.f14647m = parcel.readString();
        XF[] xfArr = (XF[]) parcel.createTypedArray(XF.CREATOR);
        int i = AbstractC1260lo.f14419a;
        this.f14645k = xfArr;
        this.f14648n = xfArr.length;
    }

    public final C1334nG a(String str) {
        return Objects.equals(this.f14647m, str) ? this : new C1334nG(str, false, this.f14645k);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        XF xf = (XF) obj;
        XF xf2 = (XF) obj2;
        UUID uuid = AbstractC1644uC.f15803a;
        return uuid.equals(xf.f12192l) ? !uuid.equals(xf2.f12192l) ? 1 : 0 : xf.f12192l.compareTo(xf2.f12192l);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1334nG.class == obj.getClass()) {
            C1334nG c1334nG = (C1334nG) obj;
            if (Objects.equals(this.f14647m, c1334nG.f14647m) && Arrays.equals(this.f14645k, c1334nG.f14645k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f14646l;
        if (i != 0) {
            return i;
        }
        String str = this.f14647m;
        int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f14645k);
        this.f14646l = hashCode;
        return hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14647m);
        parcel.writeTypedArray(this.f14645k, 0);
    }

    public C1334nG(String str, boolean z3, XF... xfArr) {
        this.f14647m = str;
        xfArr = z3 ? (XF[]) xfArr.clone() : xfArr;
        this.f14645k = xfArr;
        this.f14648n = xfArr.length;
        Arrays.sort(xfArr, this);
    }
}
