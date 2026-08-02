package k3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;

/* renamed from: k3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1337b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        int i7 = 0;
        int i8 = 0;
        boolean z4 = false;
        int i9 = 0;
        boolean z7 = false;
        int i10 = 0;
        String str = null;
        String str2 = null;
        zaa zaaVar = null;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i7 = Q0.a.N(readInt, parcel);
                    break;
                case 2:
                    i8 = Q0.a.N(readInt, parcel);
                    break;
                case 3:
                    z4 = Q0.a.K(readInt, parcel);
                    break;
                case 4:
                    i9 = Q0.a.N(readInt, parcel);
                    break;
                case 5:
                    z7 = Q0.a.K(readInt, parcel);
                    break;
                case 6:
                    str = Q0.a.n(readInt, parcel);
                    break;
                case 7:
                    i10 = Q0.a.N(readInt, parcel);
                    break;
                case '\b':
                    str2 = Q0.a.n(readInt, parcel);
                    break;
                case '\t':
                    zaaVar = (zaa) Q0.a.m(parcel, readInt, zaa.CREATOR);
                    break;
                default:
                    Q0.a.X(readInt, parcel);
                    break;
            }
        }
        Q0.a.y(a02, parcel);
        return new FastJsonResponse$Field(i7, i8, z4, i9, z7, str, i10, str2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new FastJsonResponse$Field[i7];
    }
}
