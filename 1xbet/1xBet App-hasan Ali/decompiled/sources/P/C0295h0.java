package P;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: P.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295h0 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4474a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f4474a) {
            case 0:
                return new C0297i0(parcel.readFloat());
            case 1:
                return new C0299j0(parcel.readInt());
            default:
                return new C0301k0(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f4474a) {
            case 0:
                return new C0297i0[i];
            case 1:
                return new C0299j0[i];
            default:
                return new C0301k0[i];
        }
    }
}
