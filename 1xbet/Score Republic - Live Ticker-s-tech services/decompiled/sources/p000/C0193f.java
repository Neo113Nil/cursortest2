package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: f */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0193f implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2213a;

    public /* synthetic */ C0193f(int i) {
        this.f2213a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f2213a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC0230g.f2564k;
                }
                C0270h1.m2191g("superState must be null");
                return null;
            default:
                return new vd1(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f2213a) {
            case 0:
                return new AbstractC0230g[i];
            default:
                return new vd1[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2213a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC0230g.f2564k;
                }
                C0270h1.m2191g("superState must be null");
                return null;
            default:
                return new vd1(parcel, null);
        }
    }
}
