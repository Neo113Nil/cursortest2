package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class vd1 extends AbstractC0230g {
    public static final Parcelable.Creator<vd1> CREATOR = new C0193f(1);

    /* JADX INFO: renamed from: l */
    public int f8182l;

    /* JADX INFO: renamed from: m */
    public boolean f8183m;

    public vd1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8182l = parcel.readInt();
        this.f8183m = parcel.readInt() != 0;
    }

    @Override // p000.AbstractC0230g, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f8182l);
        parcel.writeInt(this.f8183m ? 1 : 0);
    }
}
