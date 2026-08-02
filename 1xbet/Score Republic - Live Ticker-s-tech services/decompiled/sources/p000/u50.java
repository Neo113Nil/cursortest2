package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class u50 implements Parcelable {
    public static final Parcelable.Creator<u50> CREATOR = new C0936z2(5);

    /* JADX INFO: renamed from: j */
    public ArrayList f7673j;

    /* JADX INFO: renamed from: k */
    public ArrayList f7674k;

    /* JADX INFO: renamed from: l */
    public C0759ua[] f7675l;

    /* JADX INFO: renamed from: m */
    public int f7676m;

    /* JADX INFO: renamed from: n */
    public String f7677n;

    /* JADX INFO: renamed from: o */
    public ArrayList f7678o;

    /* JADX INFO: renamed from: p */
    public ArrayList f7679p;

    /* JADX INFO: renamed from: q */
    public ArrayList f7680q;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f7673j);
        parcel.writeStringList(this.f7674k);
        parcel.writeTypedArray(this.f7675l, i);
        parcel.writeInt(this.f7676m);
        parcel.writeString(this.f7677n);
        parcel.writeStringList(this.f7678o);
        parcel.writeTypedList(this.f7679p);
        parcel.writeTypedList(this.f7680q);
    }
}
