package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class k82 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4302a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intent intent = null;
        switch (this.f4302a) {
            case 0:
                int iM2785D = j22.m2785D(parcel);
                boolean zM2812u = true;
                boolean zM2812u2 = true;
                String strM2802k = null;
                String strM2802k2 = null;
                String strM2802k3 = null;
                String strM2802k4 = null;
                String strM2802k5 = null;
                String strM2802k6 = null;
                Boolean boolValueOf = null;
                ArrayList<String> arrayList = null;
                String strM2802k7 = null;
                String strM2802k8 = null;
                long jM2815x = 0;
                long jM2815x2 = 0;
                long jM2815x3 = 0;
                long jM2815x4 = 0;
                long jM2815x5 = 0;
                long jM2815x6 = 0;
                long jM2815x7 = 0;
                long jM2815x8 = 0;
                boolean zM2812u3 = false;
                int iM2814w = 0;
                boolean zM2812u4 = false;
                boolean zM2812u5 = false;
                int iM2814w2 = 0;
                int iM2814w3 = 0;
                String strM2802k9 = "";
                String strM2802k10 = strM2802k9;
                String strM2802k11 = strM2802k10;
                String strM2802k12 = strM2802k11;
                int iM2814w4 = 100;
                long jM2815x9 = -2147483648L;
                while (parcel.dataPosition() < iM2785D) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 2:
                            strM2802k = j22.m2802k(parcel, i);
                            break;
                        case 3:
                            strM2802k2 = j22.m2802k(parcel, i);
                            break;
                        case 4:
                            strM2802k3 = j22.m2802k(parcel, i);
                            break;
                        case 5:
                            strM2802k4 = j22.m2802k(parcel, i);
                            break;
                        case 6:
                            jM2815x = j22.m2815x(parcel, i);
                            break;
                        case 7:
                            jM2815x2 = j22.m2815x(parcel, i);
                            break;
                        case '\b':
                            strM2802k5 = j22.m2802k(parcel, i);
                            break;
                        case '\t':
                            zM2812u = j22.m2812u(parcel, i);
                            break;
                        case '\n':
                            zM2812u3 = j22.m2812u(parcel, i);
                            break;
                        case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                            jM2815x9 = j22.m2815x(parcel, i);
                            break;
                        case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                            strM2802k6 = j22.m2802k(parcel, i);
                            break;
                        case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            j22.m2782A(parcel, i);
                            break;
                        case 14:
                            jM2815x3 = j22.m2815x(parcel, i);
                            break;
                        case 15:
                            iM2814w = j22.m2814w(parcel, i);
                            break;
                        case 16:
                            zM2812u2 = j22.m2812u(parcel, i);
                            break;
                        case 18:
                            zM2812u4 = j22.m2812u(parcel, i);
                            break;
                        case 21:
                            int iM2816y = j22.m2816y(parcel, i);
                            if (iM2816y != 0) {
                                j22.m2789H(parcel, iM2816y, 4);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            } else {
                                boolValueOf = null;
                            }
                            break;
                        case 22:
                            jM2815x4 = j22.m2815x(parcel, i);
                            break;
                        case 23:
                            int iM2816y2 = j22.m2816y(parcel, i);
                            int iDataPosition = parcel.dataPosition();
                            if (iM2816y2 != 0) {
                                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                                parcel.setDataPosition(iDataPosition + iM2816y2);
                                arrayList = arrayListCreateStringArrayList;
                            } else {
                                arrayList = null;
                            }
                            break;
                        case 25:
                            strM2802k9 = j22.m2802k(parcel, i);
                            break;
                        case 26:
                            strM2802k10 = j22.m2802k(parcel, i);
                            break;
                        case 27:
                            strM2802k7 = j22.m2802k(parcel, i);
                            break;
                        case 28:
                            zM2812u5 = j22.m2812u(parcel, i);
                            break;
                        case 29:
                            jM2815x5 = j22.m2815x(parcel, i);
                            break;
                        case 30:
                            iM2814w4 = j22.m2814w(parcel, i);
                            break;
                        case 31:
                            strM2802k11 = j22.m2802k(parcel, i);
                            break;
                        case ' ':
                            iM2814w2 = j22.m2814w(parcel, i);
                            break;
                        case '\"':
                            jM2815x6 = j22.m2815x(parcel, i);
                            break;
                        case '#':
                            strM2802k8 = j22.m2802k(parcel, i);
                            break;
                        case '$':
                            strM2802k12 = j22.m2802k(parcel, i);
                            break;
                        case '%':
                            jM2815x7 = j22.m2815x(parcel, i);
                            break;
                        case '&':
                            iM2814w3 = j22.m2814w(parcel, i);
                            break;
                        case '\'':
                            jM2815x8 = j22.m2815x(parcel, i);
                            break;
                    }
                }
                j22.m2805n(parcel, iM2785D);
                return new z72(strM2802k, strM2802k2, strM2802k3, strM2802k4, jM2815x, jM2815x2, strM2802k5, zM2812u, zM2812u3, jM2815x9, strM2802k6, jM2815x3, iM2814w, zM2812u2, zM2812u4, boolValueOf, jM2815x4, arrayList, strM2802k9, strM2802k10, strM2802k7, zM2812u5, jM2815x5, iM2814w4, strM2802k11, iM2814w2, jM2815x6, strM2802k8, strM2802k12, jM2815x7, iM2814w3, jM2815x8);
            default:
                int iM2785D2 = j22.m2785D(parcel);
                while (parcel.dataPosition() < iM2785D2) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 1) {
                        j22.m2782A(parcel, i2);
                    } else {
                        intent = (Intent) j22.m2801j(parcel, i2, Intent.CREATOR);
                    }
                }
                j22.m2805n(parcel, iM2785D2);
                return new C0914yh(intent);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f4302a) {
            case 0:
                return new z72[i];
            default:
                return new C0914yh[i];
        }
    }
}
