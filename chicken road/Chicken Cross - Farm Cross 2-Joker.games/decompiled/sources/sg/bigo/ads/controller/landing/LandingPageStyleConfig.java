package sg.bigo.ads.controller.landing;

import android.os.Parcel;
import android.os.Parcelable;
import sg.bigo.ads.Y0.y;

/* loaded from: classes3.dex */
public class LandingPageStyleConfig implements Parcelable {
    public static final Parcelable.Creator<LandingPageStyleConfig> CREATOR = new y();

    /* renamed from: a, reason: collision with root package name */
    public final int f12718a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final Class g;

    public LandingPageStyleConfig(Parcel parcel) {
        this.g = (Class) parcel.readSerializable();
        this.c = parcel.readInt();
        this.f12718a = parcel.readInt();
        this.b = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.g);
        parcel.writeInt(this.c);
        parcel.writeInt(this.f12718a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeFloat(this.f);
    }

    public LandingPageStyleConfig(Class cls, int i, int i2, int i3, int i4, int i5, float f) {
        this.g = cls;
        this.c = i;
        this.f12718a = i2;
        this.b = i3;
        this.d = i4;
        this.e = i5;
        this.f = f;
    }
}
