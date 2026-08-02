package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class jm1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4029a;

    public /* synthetic */ jm1(int i) {
        this.f4029a = i;
    }

    /* JADX INFO: renamed from: a */
    public static void m2935a(z70 z70Var, Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        int i2 = z70Var.f9626j;
        t22.m4662p(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = z70Var.f9627k;
        t22.m4662p(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = z70Var.f9628l;
        t22.m4662p(parcel, 3, 4);
        parcel.writeInt(i4);
        t22.m4658l(parcel, 4, z70Var.f9629m);
        t22.m4655i(parcel, 5, z70Var.f9630n);
        t22.m4659m(parcel, 6, z70Var.f9631o, i);
        t22.m4652f(parcel, 7, z70Var.f9632p);
        t22.m4657k(parcel, 8, z70Var.f9633q, i);
        t22.m4659m(parcel, 10, z70Var.f9634r, i);
        t22.m4659m(parcel, 11, z70Var.f9635s, i);
        boolean z = z70Var.f9636t;
        t22.m4662p(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = z70Var.f9637u;
        t22.m4662p(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = z70Var.f9638v;
        t22.m4662p(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        t22.m4658l(parcel, 15, z70Var.f9639w);
        t22.m4665s(parcel, iM4663q);
    }

    /* JADX INFO: renamed from: b */
    public static void m2936b(fu1 fu1Var, Parcel parcel, int i) {
        String str = fu1Var.f2501j;
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4658l(parcel, 2, str);
        t22.m4657k(parcel, 3, fu1Var.f2502k, i);
        t22.m4658l(parcel, 4, fu1Var.f2503l);
        long j = fu1Var.f2504m;
        t22.m4662p(parcel, 5, 8);
        parcel.writeLong(j);
        long j2 = fu1Var.f2505n;
        t22.m4662p(parcel, 6, 8);
        parcel.writeLong(j2);
        t22.m4665s(parcel, iM4663q);
    }

    /* JADX INFO: renamed from: c */
    public static void m2937c(b72 b72Var, Parcel parcel) {
        int i = b72Var.f748j;
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4662p(parcel, 1, 4);
        parcel.writeInt(i);
        t22.m4658l(parcel, 2, b72Var.f749k);
        long j = b72Var.f750l;
        t22.m4662p(parcel, 3, 8);
        parcel.writeLong(j);
        Long l = b72Var.f751m;
        if (l != null) {
            t22.m4662p(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        t22.m4658l(parcel, 6, b72Var.f752n);
        t22.m4658l(parcel, 7, b72Var.f753o);
        Double d = b72Var.f754p;
        if (d != null) {
            t22.m4662p(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        t22.m4665s(parcel, iM4663q);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long jM2815x = 0;
        int iM2814w = 0;
        int iM2814w2 = 0;
        int iM2814w3 = 0;
        int iM2814w4 = 0;
        boolean zM2812u = false;
        int iM2814w5 = 0;
        int iM2814w6 = 0;
        int iM2814w7 = 0;
        Bundle bundleM2797f = null;
        ArrayList arrayListM2804m = null;
        String strM2802k = null;
        Bundle bundleM2797f2 = null;
        ArrayList arrayListM2804m2 = null;
        String strM2802k2 = null;
        byte[] bArrM2798g = null;
        String strM2802k3 = null;
        String strM2802k4 = null;
        String strM2802k5 = null;
        Bundle bundleM2797f3 = null;
        switch (this.f4029a) {
            case 0:
                int iM2785D = j22.m2785D(parcel);
                int iM2814w8 = 0;
                int iM2814w9 = 0;
                PendingIntent pendingIntent = null;
                String strM2802k6 = null;
                Integer numValueOf = null;
                while (parcel.dataPosition() < iM2785D) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iM2814w8 = j22.m2814w(parcel, i);
                    } else if (c == 2) {
                        iM2814w9 = j22.m2814w(parcel, i);
                    } else if (c == 3) {
                        pendingIntent = (PendingIntent) j22.m2801j(parcel, i, PendingIntent.CREATOR);
                    } else if (c == 4) {
                        strM2802k6 = j22.m2802k(parcel, i);
                    } else if (c != 5) {
                        j22.m2782A(parcel, i);
                    } else {
                        int iM2816y = j22.m2816y(parcel, i);
                        if (iM2816y == 0) {
                            numValueOf = null;
                        } else {
                            j22.m2789H(parcel, iM2816y, 4);
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                j22.m2805n(parcel, iM2785D);
                return new C0253gl(iM2814w8, iM2814w9, pendingIntent, strM2802k6, numValueOf);
            case 1:
                int iM2785D2 = j22.m2785D(parcel);
                long jM2815x2 = 0;
                long jM2815x3 = 0;
                int iM2814w10 = 0;
                while (parcel.dataPosition() < iM2785D2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        jM2815x2 = j22.m2815x(parcel, i2);
                    } else if (c2 == 2) {
                        iM2814w10 = j22.m2814w(parcel, i2);
                    } else if (c2 != 3) {
                        j22.m2782A(parcel, i2);
                    } else {
                        jM2815x3 = j22.m2815x(parcel, i2);
                    }
                }
                j22.m2805n(parcel, iM2785D2);
                return new vp1(iM2814w10, jM2815x2, jM2815x3);
            case 2:
                int iM2785D3 = j22.m2785D(parcel);
                int iM2814w11 = 0;
                boolean zM2812u2 = false;
                boolean zM2812u3 = false;
                int iM2814w12 = 0;
                int iM2814w13 = 0;
                while (parcel.dataPosition() < iM2785D3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        iM2814w11 = j22.m2814w(parcel, i3);
                    } else if (c3 == 2) {
                        zM2812u2 = j22.m2812u(parcel, i3);
                    } else if (c3 == 3) {
                        zM2812u3 = j22.m2812u(parcel, i3);
                    } else if (c3 == 4) {
                        iM2814w12 = j22.m2814w(parcel, i3);
                    } else if (c3 != 5) {
                        j22.m2782A(parcel, i3);
                    } else {
                        iM2814w13 = j22.m2814w(parcel, i3);
                    }
                }
                j22.m2805n(parcel, iM2785D3);
                return new p31(iM2814w11, zM2812u2, zM2812u3, iM2814w12, iM2814w13);
            case 3:
                int iM2785D4 = j22.m2785D(parcel);
                long jM2815x4 = 0;
                long jM2815x5 = 0;
                long jM2815x6 = 0;
                boolean zM2812u4 = false;
                String strM2802k7 = null;
                String strM2802k8 = null;
                b72 b72Var = null;
                String strM2802k9 = null;
                fu1 fu1Var = null;
                fu1 fu1Var2 = null;
                fu1 fu1Var3 = null;
                while (parcel.dataPosition() < iM2785D4) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 2:
                            strM2802k7 = j22.m2802k(parcel, i4);
                            break;
                        case 3:
                            strM2802k8 = j22.m2802k(parcel, i4);
                            break;
                        case 4:
                            b72Var = (b72) j22.m2801j(parcel, i4, b72.CREATOR);
                            break;
                        case 5:
                            jM2815x4 = j22.m2815x(parcel, i4);
                            break;
                        case 6:
                            zM2812u4 = j22.m2812u(parcel, i4);
                            break;
                        case 7:
                            strM2802k9 = j22.m2802k(parcel, i4);
                            break;
                        case '\b':
                            fu1Var = (fu1) j22.m2801j(parcel, i4, fu1.CREATOR);
                            break;
                        case '\t':
                            jM2815x5 = j22.m2815x(parcel, i4);
                            break;
                        case '\n':
                            fu1Var2 = (fu1) j22.m2801j(parcel, i4, fu1.CREATOR);
                            break;
                        case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                            jM2815x6 = j22.m2815x(parcel, i4);
                            break;
                        case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                            fu1Var3 = (fu1) j22.m2801j(parcel, i4, fu1.CREATOR);
                            break;
                        default:
                            j22.m2782A(parcel, i4);
                            break;
                    }
                }
                j22.m2805n(parcel, iM2785D4);
                return new hr1(strM2802k7, strM2802k8, b72Var, jM2815x4, zM2812u4, strM2802k9, fu1Var, jM2815x5, fu1Var2, jM2815x6, fu1Var3);
            case 4:
                int iM2785D5 = j22.m2785D(parcel);
                while (parcel.dataPosition() < iM2785D5) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 1) {
                        j22.m2782A(parcel, i5);
                    } else {
                        bundleM2797f = j22.m2797f(parcel, i5);
                    }
                }
                j22.m2805n(parcel, iM2785D5);
                return new gt1(bundleM2797f);
            case 5:
                return new uv1(parcel.readStrongBinder());
            case 6:
                int iM2785D6 = j22.m2785D(parcel);
                long jM2815x7 = -1;
                int iM2814w14 = 0;
                boolean zM2812u5 = false;
                String strM2802k10 = null;
                while (parcel.dataPosition() < iM2785D6) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        strM2802k10 = j22.m2802k(parcel, i6);
                    } else if (c4 == 2) {
                        iM2814w14 = j22.m2814w(parcel, i6);
                    } else if (c4 == 3) {
                        jM2815x7 = j22.m2815x(parcel, i6);
                    } else if (c4 != 4) {
                        j22.m2782A(parcel, i6);
                    } else {
                        zM2812u5 = j22.m2812u(parcel, i6);
                    }
                }
                j22.m2805n(parcel, iM2785D6);
                return new C0451lz(strM2802k10, iM2814w14, jM2815x7, zM2812u5);
            case 7:
                int iM2785D7 = j22.m2785D(parcel);
                while (parcel.dataPosition() < iM2785D7) {
                    int i7 = parcel.readInt();
                    if (((char) i7) != 2) {
                        j22.m2782A(parcel, i7);
                    } else {
                        bundleM2797f3 = j22.m2797f(parcel, i7);
                    }
                }
                j22.m2805n(parcel, iM2785D7);
                return new eu1(bundleM2797f3);
            case 8:
                int iM2785D8 = j22.m2785D(parcel);
                long jM2815x8 = 0;
                long jM2815x9 = 0;
                String strM2802k11 = null;
                eu1 eu1Var = null;
                String strM2802k12 = null;
                while (parcel.dataPosition() < iM2785D8) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 2) {
                        strM2802k11 = j22.m2802k(parcel, i8);
                    } else if (c5 == 3) {
                        eu1Var = (eu1) j22.m2801j(parcel, i8, eu1.CREATOR);
                    } else if (c5 == 4) {
                        strM2802k12 = j22.m2802k(parcel, i8);
                    } else if (c5 == 5) {
                        jM2815x8 = j22.m2815x(parcel, i8);
                    } else if (c5 != 6) {
                        j22.m2782A(parcel, i8);
                    } else {
                        jM2815x9 = j22.m2815x(parcel, i8);
                    }
                }
                j22.m2805n(parcel, iM2785D8);
                return new fu1(strM2802k11, eu1Var, strM2802k12, jM2815x8, jM2815x9);
            case 9:
                int iM2785D9 = j22.m2785D(parcel);
                while (parcel.dataPosition() < iM2785D9) {
                    int i9 = parcel.readInt();
                    char c6 = (char) i9;
                    if (c6 == 1) {
                        iM2814w = j22.m2814w(parcel, i9);
                    } else if (c6 != 2) {
                        j22.m2782A(parcel, i9);
                    } else {
                        strM2802k5 = j22.m2802k(parcel, i9);
                    }
                }
                j22.m2805n(parcel, iM2785D9);
                return new Scope(strM2802k5, iM2814w);
            case 10:
                int iM2785D10 = j22.m2785D(parcel);
                long jM2815x10 = 0;
                long jM2815x11 = 0;
                boolean zM2812u6 = false;
                Bundle bundleM2797f4 = null;
                String strM2802k13 = null;
                while (parcel.dataPosition() < iM2785D10) {
                    int i10 = parcel.readInt();
                    char c7 = (char) i10;
                    if (c7 == 1) {
                        jM2815x10 = j22.m2815x(parcel, i10);
                    } else if (c7 == 2) {
                        jM2815x11 = j22.m2815x(parcel, i10);
                    } else if (c7 == 3) {
                        zM2812u6 = j22.m2812u(parcel, i10);
                    } else if (c7 == 7) {
                        bundleM2797f4 = j22.m2797f(parcel, i10);
                    } else if (c7 != '\b') {
                        j22.m2782A(parcel, i10);
                    } else {
                        strM2802k13 = j22.m2802k(parcel, i10);
                    }
                }
                j22.m2805n(parcel, iM2785D10);
                return new wv1(jM2815x10, jM2815x11, zM2812u6, bundleM2797f4, strM2802k13);
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                int iM2785D11 = j22.m2785D(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iM2785D11) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 1) {
                        iM2814w7 = j22.m2814w(parcel, i11);
                    } else if (c8 == 2) {
                        strM2802k4 = j22.m2802k(parcel, i11);
                    } else if (c8 != 3) {
                        j22.m2782A(parcel, i11);
                    } else {
                        intent = (Intent) j22.m2801j(parcel, i11, Intent.CREATOR);
                    }
                }
                j22.m2805n(parcel, iM2785D11);
                return new xv1(iM2814w7, strM2802k4, intent);
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                int iM2785D12 = j22.m2785D(parcel);
                PendingIntent pendingIntent2 = null;
                C0253gl c0253gl = null;
                while (parcel.dataPosition() < iM2785D12) {
                    int i12 = parcel.readInt();
                    char c9 = (char) i12;
                    if (c9 == 1) {
                        iM2814w6 = j22.m2814w(parcel, i12);
                    } else if (c9 == 2) {
                        strM2802k3 = j22.m2802k(parcel, i12);
                    } else if (c9 == 3) {
                        pendingIntent2 = (PendingIntent) j22.m2801j(parcel, i12, PendingIntent.CREATOR);
                    } else if (c9 != 4) {
                        j22.m2782A(parcel, i12);
                    } else {
                        c0253gl = (C0253gl) j22.m2801j(parcel, i12, C0253gl.CREATOR);
                    }
                }
                j22.m2805n(parcel, iM2785D12);
                return new Status(iM2814w6, strM2802k3, pendingIntent2, c0253gl);
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                int iM2785D13 = j22.m2785D(parcel);
                n12[] n12VarArr = null;
                String[] strArr = null;
                while (parcel.dataPosition() < iM2785D13) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 2) {
                        iM2814w5 = j22.m2814w(parcel, i13);
                    } else if (c10 == 3) {
                        n12VarArr = (n12[]) j22.m2803l(parcel, i13, n12.CREATOR);
                    } else if (c10 != 4) {
                        j22.m2782A(parcel, i13);
                    } else {
                        int iM2816y2 = j22.m2816y(parcel, i13);
                        int iDataPosition = parcel.dataPosition();
                        if (iM2816y2 == 0) {
                            strArr = null;
                        } else {
                            String[] strArrCreateStringArray = parcel.createStringArray();
                            parcel.setDataPosition(iDataPosition + iM2816y2);
                            strArr = strArrCreateStringArray;
                        }
                    }
                }
                j22.m2805n(parcel, iM2785D13);
                return new e12(iM2814w5, n12VarArr, strArr);
            case 14:
                int iM2785D14 = j22.m2785D(parcel);
                long jM2815x12 = 0;
                boolean zM2812u7 = false;
                String strM2802k14 = null;
                String strM2802k15 = null;
                e12[] e12VarArr = null;
                byte[] bArrM2798g2 = null;
                while (parcel.dataPosition() < iM2785D14) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 2:
                            strM2802k14 = j22.m2802k(parcel, i14);
                            break;
                        case 3:
                            strM2802k15 = j22.m2802k(parcel, i14);
                            break;
                        case 4:
                            e12VarArr = (e12[]) j22.m2803l(parcel, i14, e12.CREATOR);
                            break;
                        case 5:
                            zM2812u7 = j22.m2812u(parcel, i14);
                            break;
                        case 6:
                            bArrM2798g2 = j22.m2798g(parcel, i14);
                            break;
                        case 7:
                            jM2815x12 = j22.m2815x(parcel, i14);
                            break;
                        default:
                            j22.m2782A(parcel, i14);
                            break;
                    }
                }
                j22.m2805n(parcel, iM2785D14);
                return new g12(strM2802k14, strM2802k15, e12VarArr, zM2812u7, bArrM2798g2, jM2815x12);
            case 15:
                int iM2785D15 = j22.m2785D(parcel);
                while (parcel.dataPosition() < iM2785D15) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 2) {
                        j22.m2782A(parcel, i15);
                    } else {
                        bArrM2798g = j22.m2798g(parcel, i15);
                    }
                }
                j22.m2805n(parcel, iM2785D15);
                return new j12(bArrM2798g);
            case 16:
                int iM2785D16 = j22.m2785D(parcel);
                String strM2802k16 = null;
                byte[] bArrM2798g3 = null;
                byte[][] bArrM2799h = null;
                byte[][] bArrM2799h2 = null;
                byte[][] bArrM2799h3 = null;
                byte[][] bArrM2799h4 = null;
                int[] iArrM2800i = null;
                byte[][] bArrM2799h5 = null;
                int[] iArrM2800i2 = null;
                byte[][] bArrM2799h6 = null;
                while (parcel.dataPosition() < iM2785D16) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 2:
                            strM2802k16 = j22.m2802k(parcel, i16);
                            break;
                        case 3:
                            bArrM2798g3 = j22.m2798g(parcel, i16);
                            break;
                        case 4:
                            bArrM2799h = j22.m2799h(parcel, i16);
                            break;
                        case 5:
                            bArrM2799h2 = j22.m2799h(parcel, i16);
                            break;
                        case 6:
                            bArrM2799h3 = j22.m2799h(parcel, i16);
                            break;
                        case 7:
                            bArrM2799h4 = j22.m2799h(parcel, i16);
                            break;
                        case '\b':
                            iArrM2800i = j22.m2800i(parcel, i16);
                            break;
                        case '\t':
                            bArrM2799h5 = j22.m2799h(parcel, i16);
                            break;
                        case '\n':
                            iArrM2800i2 = j22.m2800i(parcel, i16);
                            break;
                        case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                            bArrM2799h6 = j22.m2799h(parcel, i16);
                            break;
                        default:
                            j22.m2782A(parcel, i16);
                            break;
                    }
                }
                j22.m2805n(parcel, iM2785D16);
                return new m12(strM2802k16, bArrM2798g3, bArrM2799h, bArrM2799h2, bArrM2799h3, bArrM2799h4, iArrM2800i, bArrM2799h5, iArrM2800i2, bArrM2799h6);
            case 17:
                int iM2785D17 = j22.m2785D(parcel);
                double d = 0.0d;
                long jM2815x13 = 0;
                boolean zM2812u8 = false;
                int iM2814w15 = 0;
                int iM2814w16 = 0;
                int iM2814w17 = 0;
                String strM2802k17 = null;
                String strM2802k18 = null;
                byte[] bArrM2798g4 = null;
                while (parcel.dataPosition() < iM2785D17) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            strM2802k17 = j22.m2802k(parcel, i17);
                            break;
                        case 3:
                            jM2815x13 = j22.m2815x(parcel, i17);
                            break;
                        case 4:
                            zM2812u8 = j22.m2812u(parcel, i17);
                            break;
                        case 5:
                            j22.m2787F(parcel, i17, 8);
                            d = parcel.readDouble();
                            break;
                        case 6:
                            strM2802k18 = j22.m2802k(parcel, i17);
                            break;
                        case 7:
                            bArrM2798g4 = j22.m2798g(parcel, i17);
                            break;
                        case '\b':
                            iM2814w15 = j22.m2814w(parcel, i17);
                            break;
                        case '\t':
                            iM2814w16 = j22.m2814w(parcel, i17);
                            break;
                        case '\n':
                            iM2814w17 = j22.m2814w(parcel, i17);
                            break;
                        default:
                            j22.m2782A(parcel, i17);
                            break;
                    }
                }
                j22.m2805n(parcel, iM2785D17);
                return new n12(strM2802k17, jM2815x13, zM2812u8, d, strM2802k18, bArrM2798g4, iM2814w15, iM2814w16, iM2814w17);
            case 18:
                int iM2785D18 = j22.m2785D(parcel);
                String strM2802k19 = null;
                n12 n12Var = null;
                while (parcel.dataPosition() < iM2785D18) {
                    int i18 = parcel.readInt();
                    char c11 = (char) i18;
                    if (c11 == 2) {
                        strM2802k2 = j22.m2802k(parcel, i18);
                    } else if (c11 == 3) {
                        strM2802k19 = j22.m2802k(parcel, i18);
                    } else if (c11 == 4) {
                        n12Var = (n12) j22.m2801j(parcel, i18, n12.CREATOR);
                    } else if (c11 != 5) {
                        j22.m2782A(parcel, i18);
                    } else {
                        zM2812u = j22.m2812u(parcel, i18);
                    }
                }
                j22.m2805n(parcel, iM2785D18);
                return new p12(strM2802k2, strM2802k19, n12Var, zM2812u);
            case 19:
                int iM2785D19 = j22.m2785D(parcel);
                while (parcel.dataPosition() < iM2785D19) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 2) {
                        j22.m2782A(parcel, i19);
                    } else {
                        arrayListM2804m2 = j22.m2804m(parcel, i19, p12.CREATOR);
                    }
                }
                j22.m2805n(parcel, iM2785D19);
                return new r12(arrayListM2804m2);
            case 20:
                int iM2785D20 = j22.m2785D(parcel);
                int iM2814w18 = 0;
                while (parcel.dataPosition() < iM2785D20) {
                    int i20 = parcel.readInt();
                    char c12 = (char) i20;
                    if (c12 == 1) {
                        iM2814w4 = j22.m2814w(parcel, i20);
                    } else if (c12 != 2) {
                        j22.m2782A(parcel, i20);
                    } else {
                        iM2814w18 = j22.m2814w(parcel, i20);
                    }
                }
                j22.m2805n(parcel, iM2785D20);
                return new u12(iM2814w4, iM2814w18);
            case 21:
                int iM2785D21 = j22.m2785D(parcel);
                C0451lz[] c0451lzArr = null;
                C0363jl c0363jl = null;
                while (parcel.dataPosition() < iM2785D21) {
                    int i21 = parcel.readInt();
                    char c13 = (char) i21;
                    if (c13 == 1) {
                        bundleM2797f2 = j22.m2797f(parcel, i21);
                    } else if (c13 == 2) {
                        c0451lzArr = (C0451lz[]) j22.m2803l(parcel, i21, C0451lz.CREATOR);
                    } else if (c13 == 3) {
                        iM2814w3 = j22.m2814w(parcel, i21);
                    } else if (c13 != 4) {
                        j22.m2782A(parcel, i21);
                    } else {
                        c0363jl = (C0363jl) j22.m2801j(parcel, i21, C0363jl.CREATOR);
                    }
                }
                j22.m2805n(parcel, iM2785D21);
                y02 y02Var = new y02();
                y02Var.f9124j = bundleM2797f2;
                y02Var.f9125k = c0451lzArr;
                y02Var.f9126l = iM2814w3;
                y02Var.f9127m = c0363jl;
                return y02Var;
            case 22:
                int iM2785D22 = j22.m2785D(parcel);
                boolean zM2812u9 = false;
                boolean zM2812u10 = false;
                int iM2814w19 = 0;
                p31 p31Var = null;
                int[] iArrM2800i3 = null;
                int[] iArrM2800i4 = null;
                while (parcel.dataPosition() < iM2785D22) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 1:
                            p31Var = (p31) j22.m2801j(parcel, i22, p31.CREATOR);
                            break;
                        case 2:
                            zM2812u9 = j22.m2812u(parcel, i22);
                            break;
                        case 3:
                            zM2812u10 = j22.m2812u(parcel, i22);
                            break;
                        case 4:
                            iArrM2800i3 = j22.m2800i(parcel, i22);
                            break;
                        case 5:
                            iM2814w19 = j22.m2814w(parcel, i22);
                            break;
                        case 6:
                            iArrM2800i4 = j22.m2800i(parcel, i22);
                            break;
                        default:
                            j22.m2782A(parcel, i22);
                            break;
                    }
                }
                j22.m2805n(parcel, iM2785D22);
                return new C0363jl(p31Var, zM2812u9, zM2812u10, iArrM2800i3, iM2814w19, iArrM2800i4);
            case 23:
                int iM2785D23 = j22.m2785D(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = z70.f9624x;
                C0451lz[] c0451lzArr2 = z70.f9625y;
                C0451lz[] c0451lzArr3 = c0451lzArr2;
                int iM2814w20 = 0;
                int iM2814w21 = 0;
                int iM2814w22 = 0;
                boolean zM2812u11 = false;
                int iM2814w23 = 0;
                boolean zM2812u12 = false;
                String strM2802k20 = null;
                IBinder iBinderM2813v = null;
                Account account = null;
                String strM2802k21 = null;
                while (parcel.dataPosition() < iM2785D23) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            iM2814w20 = j22.m2814w(parcel, i23);
                            break;
                        case 2:
                            iM2814w21 = j22.m2814w(parcel, i23);
                            break;
                        case 3:
                            iM2814w22 = j22.m2814w(parcel, i23);
                            break;
                        case 4:
                            strM2802k20 = j22.m2802k(parcel, i23);
                            break;
                        case 5:
                            iBinderM2813v = j22.m2813v(parcel, i23);
                            break;
                        case 6:
                            scopeArr = (Scope[]) j22.m2803l(parcel, i23, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = j22.m2797f(parcel, i23);
                            break;
                        case '\b':
                            account = (Account) j22.m2801j(parcel, i23, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            j22.m2782A(parcel, i23);
                            break;
                        case '\n':
                            c0451lzArr2 = (C0451lz[]) j22.m2803l(parcel, i23, C0451lz.CREATOR);
                            break;
                        case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                            c0451lzArr3 = (C0451lz[]) j22.m2803l(parcel, i23, C0451lz.CREATOR);
                            break;
                        case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                            zM2812u11 = j22.m2812u(parcel, i23);
                            break;
                        case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                            iM2814w23 = j22.m2814w(parcel, i23);
                            break;
                        case 14:
                            zM2812u12 = j22.m2812u(parcel, i23);
                            break;
                        case 15:
                            strM2802k21 = j22.m2802k(parcel, i23);
                            break;
                    }
                }
                j22.m2805n(parcel, iM2785D23);
                return new z70(iM2814w20, iM2814w21, iM2814w22, strM2802k20, iBinderM2813v, scopeArr, bundle, account, c0451lzArr2, c0451lzArr3, zM2812u11, iM2814w23, zM2812u12, strM2802k21);
            case 24:
                int iM2785D24 = j22.m2785D(parcel);
                while (parcel.dataPosition() < iM2785D24) {
                    int i24 = parcel.readInt();
                    char c14 = (char) i24;
                    if (c14 == 1) {
                        strM2802k = j22.m2802k(parcel, i24);
                    } else if (c14 == 2) {
                        jM2815x = j22.m2815x(parcel, i24);
                    } else if (c14 != 3) {
                        j22.m2782A(parcel, i24);
                    } else {
                        iM2814w2 = j22.m2814w(parcel, i24);
                    }
                }
                j22.m2805n(parcel, iM2785D24);
                return new y52(iM2814w2, jM2815x, strM2802k);
            case 25:
                int iM2785D25 = j22.m2785D(parcel);
                long jM2815x14 = 0;
                long jM2815x15 = 0;
                int iM2814w24 = 0;
                byte[] bArrM2798g5 = null;
                String strM2802k22 = null;
                Bundle bundleM2797f5 = null;
                String strM2802k23 = null;
                while (parcel.dataPosition() < iM2785D25) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 1:
                            jM2815x14 = j22.m2815x(parcel, i25);
                            break;
                        case 2:
                            bArrM2798g5 = j22.m2798g(parcel, i25);
                            break;
                        case 3:
                            strM2802k22 = j22.m2802k(parcel, i25);
                            break;
                        case 4:
                            bundleM2797f5 = j22.m2797f(parcel, i25);
                            break;
                        case 5:
                            iM2814w24 = j22.m2814w(parcel, i25);
                            break;
                        case 6:
                            jM2815x15 = j22.m2815x(parcel, i25);
                            break;
                        case 7:
                            strM2802k23 = j22.m2802k(parcel, i25);
                            break;
                        default:
                            j22.m2782A(parcel, i25);
                            break;
                    }
                }
                j22.m2805n(parcel, iM2785D25);
                return new e62(jM2815x14, bArrM2798g5, strM2802k22, bundleM2797f5, iM2814w24, jM2815x15, strM2802k23);
            case 26:
                int iM2785D26 = j22.m2785D(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (true) {
                        if (parcel.dataPosition() >= iM2785D26) {
                            j22.m2805n(parcel, iM2785D26);
                            return new g62(arrayList);
                        }
                        int i26 = parcel.readInt();
                        if (((char) i26) != 1) {
                            j22.m2782A(parcel, i26);
                        } else {
                            int iM2816y3 = j22.m2816y(parcel, i26);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iM2816y3 == 0) {
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int i27 = parcel.readInt();
                            for (int i28 = 0; i28 < i27; i28++) {
                                arrayList2.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(iDataPosition2 + iM2816y3);
                            arrayList = arrayList2;
                        }
                        break;
                    }
                }
                break;
            case 27:
                int iM2785D27 = j22.m2785D(parcel);
                while (parcel.dataPosition() < iM2785D27) {
                    int i29 = parcel.readInt();
                    if (((char) i29) != 1) {
                        j22.m2782A(parcel, i29);
                    } else {
                        arrayListM2804m = j22.m2804m(parcel, i29, e62.CREATOR);
                    }
                }
                j22.m2805n(parcel, iM2785D27);
                return new j62(arrayListM2804m);
            case 28:
                int iM2785D28 = j22.m2785D(parcel);
                long jM2815x16 = 0;
                int iM2814w25 = 0;
                String strM2802k24 = null;
                Long lValueOf = null;
                Float fValueOf = null;
                String strM2802k25 = null;
                String strM2802k26 = null;
                Double dValueOf = null;
                while (parcel.dataPosition() < iM2785D28) {
                    int i30 = parcel.readInt();
                    switch ((char) i30) {
                        case 1:
                            iM2814w25 = j22.m2814w(parcel, i30);
                            break;
                        case 2:
                            strM2802k24 = j22.m2802k(parcel, i30);
                            break;
                        case 3:
                            jM2815x16 = j22.m2815x(parcel, i30);
                            break;
                        case 4:
                            int iM2816y4 = j22.m2816y(parcel, i30);
                            if (iM2816y4 == 0) {
                                lValueOf = null;
                            } else {
                                j22.m2789H(parcel, iM2816y4, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                            }
                            break;
                        case 5:
                            int iM2816y5 = j22.m2816y(parcel, i30);
                            if (iM2816y5 == 0) {
                                fValueOf = null;
                            } else {
                                j22.m2789H(parcel, iM2816y5, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                            }
                            break;
                        case 6:
                            strM2802k25 = j22.m2802k(parcel, i30);
                            break;
                        case 7:
                            strM2802k26 = j22.m2802k(parcel, i30);
                            break;
                        case '\b':
                            int iM2816y6 = j22.m2816y(parcel, i30);
                            if (iM2816y6 == 0) {
                                dValueOf = null;
                            } else {
                                j22.m2789H(parcel, iM2816y6, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            }
                            break;
                        default:
                            j22.m2782A(parcel, i30);
                            break;
                    }
                }
                j22.m2805n(parcel, iM2785D28);
                return new b72(iM2814w25, strM2802k24, jM2815x16, lValueOf, fValueOf, strM2802k25, strM2802k26, dValueOf);
            default:
                int iM2785D29 = j22.m2785D(parcel);
                long jM2815x17 = -1;
                int iM2814w26 = 0;
                int iM2814w27 = 0;
                boolean zM2812u13 = false;
                String strM2802k27 = null;
                while (parcel.dataPosition() < iM2785D29) {
                    int i31 = parcel.readInt();
                    char c15 = (char) i31;
                    if (c15 == 1) {
                        zM2812u13 = j22.m2812u(parcel, i31);
                    } else if (c15 == 2) {
                        strM2802k27 = j22.m2802k(parcel, i31);
                    } else if (c15 == 3) {
                        iM2814w26 = j22.m2814w(parcel, i31);
                    } else if (c15 == 4) {
                        iM2814w27 = j22.m2814w(parcel, i31);
                    } else if (c15 != 5) {
                        j22.m2782A(parcel, i31);
                    } else {
                        jM2815x17 = j22.m2815x(parcel, i31);
                    }
                }
                j22.m2805n(parcel, iM2785D29);
                return new y72(iM2814w26, iM2814w27, jM2815x17, strM2802k27, zM2812u13);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f4029a) {
            case 0:
                return new C0253gl[i];
            case 1:
                return new vp1[i];
            case 2:
                return new p31[i];
            case 3:
                return new hr1[i];
            case 4:
                return new gt1[i];
            case 5:
                return new uv1[i];
            case 6:
                return new C0451lz[i];
            case 7:
                return new eu1[i];
            case 8:
                return new fu1[i];
            case 9:
                return new Scope[i];
            case 10:
                return new wv1[i];
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                return new xv1[i];
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                return new Status[i];
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                return new e12[i];
            case 14:
                return new g12[i];
            case 15:
                return new j12[i];
            case 16:
                return new m12[i];
            case 17:
                return new n12[i];
            case 18:
                return new p12[i];
            case 19:
                return new r12[i];
            case 20:
                return new u12[i];
            case 21:
                return new y02[i];
            case 22:
                return new C0363jl[i];
            case 23:
                return new z70[i];
            case 24:
                return new y52[i];
            case 25:
                return new e62[i];
            case 26:
                return new g62[i];
            case 27:
                return new j62[i];
            case 28:
                return new b72[i];
            default:
                return new y72[i];
        }
    }
}
