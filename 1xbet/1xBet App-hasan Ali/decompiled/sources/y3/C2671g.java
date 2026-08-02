package y3;

import a.AbstractC0444a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: y3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2671g implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21233a;

    public /* synthetic */ C2671g(int i) {
        this.f21233a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f21233a) {
            case 0:
                int g02 = AbstractC0444a.g0(parcel);
                long j5 = 0;
                long j6 = 0;
                boolean z3 = false;
                String str = null;
                String str2 = null;
                String str3 = null;
                Bundle bundle = null;
                String str4 = null;
                while (parcel.dataPosition() < g02) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            j5 = AbstractC0444a.Y(parcel, readInt);
                            break;
                        case 2:
                            j6 = AbstractC0444a.Y(parcel, readInt);
                            break;
                        case 3:
                            z3 = AbstractC0444a.V(parcel, readInt);
                            break;
                        case 4:
                            str = AbstractC0444a.B(parcel, readInt);
                            break;
                        case 5:
                            str2 = AbstractC0444a.B(parcel, readInt);
                            break;
                        case 6:
                            str3 = AbstractC0444a.B(parcel, readInt);
                            break;
                        case 7:
                            bundle = AbstractC0444a.y(parcel, readInt);
                            break;
                        case '\b':
                            str4 = AbstractC0444a.B(parcel, readInt);
                            break;
                        default:
                            AbstractC0444a.b0(parcel, readInt);
                            break;
                    }
                }
                AbstractC0444a.G(parcel, g02);
                return new C2670f(j5, j6, z3, str, str2, str3, bundle, str4);
            default:
                s1.f fVar = new s1.f(parcel);
                fVar.f19200k = parcel.readInt();
                return fVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f21233a) {
            case 0:
                return new C2670f[i];
            default:
                return new s1.f[i];
        }
    }
}
