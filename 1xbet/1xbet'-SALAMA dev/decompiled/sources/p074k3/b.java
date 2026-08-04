package p074k3;

import Q0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = a.a0(parcel);
        int iN = 0;
        int iN2 = 0;
        boolean zK = false;
        int iN3 = 0;
        boolean zK2 = false;
        int iN4 = 0;
        String strN = null;
        String strN2 = null;
        zaa zaaVar = null;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            switch ((char) i7) {
                case 1:
                    iN = a.N(i7, parcel);
                    break;
                case 2:
                    iN2 = a.N(i7, parcel);
                    break;
                case 3:
                    zK = a.K(i7, parcel);
                    break;
                case 4:
                    iN3 = a.N(i7, parcel);
                    break;
                case 5:
                    zK2 = a.K(i7, parcel);
                    break;
                case 6:
                    strN = a.n(i7, parcel);
                    break;
                case 7:
                    iN4 = a.N(i7, parcel);
                    break;
                case '\b':
                    strN2 = a.n(i7, parcel);
                    break;
                case '\t':
                    zaaVar = (zaa) a.m(parcel, i7, zaa.CREATOR);
                    break;
                default:
                    a.X(i7, parcel);
                    break;
            }
        }
        a.y(iA0, parcel);
        return new FastJsonResponse$Field(iN, iN2, zK, iN3, zK2, strN, iN4, strN2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new FastJsonResponse$Field[i7];
    }
}
