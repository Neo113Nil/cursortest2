package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Uo implements InterfaceC1592t5 {
    public static final Parcelable.Creator<Uo> CREATOR = new C0730Zb(10);

    /* renamed from: k, reason: collision with root package name */
    public final String f11818k;

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f11819l;

    /* renamed from: m, reason: collision with root package name */
    public final int f11820m;

    /* renamed from: n, reason: collision with root package name */
    public final int f11821n;

    public /* synthetic */ Uo(Parcel parcel) {
        String readString = parcel.readString();
        int i = AbstractC1260lo.f14419a;
        this.f11818k = readString;
        byte[] createByteArray = parcel.createByteArray();
        this.f11819l = createByteArray;
        this.f11820m = parcel.readInt();
        int readInt = parcel.readInt();
        this.f11821n = readInt;
        a(readString, createByteArray, readInt);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(String str, byte[] bArr, int i) {
        char c5;
        byte b3;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case -1555642602:
                if (str.equals("editable.tracks.samples.location")) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            case 101820674:
                if (str.equals("editable.tracks.length")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case 188404399:
                if (str.equals("editable.tracks.offset")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case 1805012160:
                if (str.equals("editable.tracks.map")) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        if (c5 == 0) {
            AbstractC1668us.S(i == 23 && bArr.length == 4);
            return;
        }
        if (c5 == 1 || c5 == 2) {
            AbstractC1668us.S(i == 78 && bArr.length == 8);
            return;
        }
        if (c5 == 3) {
            AbstractC1668us.S(i == 0);
            return;
        }
        if (c5 != 4) {
            return;
        }
        if (i != 75 || bArr.length != 1 || ((b3 = bArr[0]) != 0 && b3 != 1)) {
            r4 = false;
        }
        AbstractC1668us.S(r4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1592t5
    public final /* synthetic */ void d(C1412p4 c1412p4) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Uo.class == obj.getClass()) {
            Uo uo = (Uo) obj;
            if (this.f11818k.equals(uo.f11818k) && Arrays.equals(this.f11819l, uo.f11819l) && this.f11820m == uo.f11820m && this.f11821n == uo.f11821n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f11819l) + ((this.f11818k.hashCode() + 527) * 31)) * 31) + this.f11820m) * 31) + this.f11821n;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7 A[LOOP:0: B:17:0x00a4->B:19:0x00a7, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String sb;
        String str = this.f11818k;
        int i = 0;
        byte[] bArr = this.f11819l;
        int i5 = this.f11821n;
        if (i5 == 0) {
            if (str.equals("editable.tracks.map")) {
                if (!str.equals("editable.tracks.map")) {
                    throw new IllegalStateException("Metadata is not an editable tracks map");
                }
                byte b3 = bArr[1];
                ArrayList arrayList = new ArrayList();
                while (i < b3) {
                    arrayList.add(Integer.valueOf(bArr[i + 2]));
                    i++;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("track types = ");
                AbstractC0952et.O(sb2, arrayList.iterator(), ",");
                sb = sb2.toString();
            }
            int length = bArr.length;
            StringBuilder sb3 = new StringBuilder(length + length);
            while (i < bArr.length) {
            }
            sb = sb3.toString();
        } else if (i5 == 1) {
            int i6 = AbstractC1260lo.f14419a;
            sb = new String(bArr, StandardCharsets.UTF_8);
        } else if (i5 == 23) {
            sb = String.valueOf(Float.intBitsToFloat(AbstractC1400ot.O(bArr)));
        } else if (i5 == 67) {
            sb = String.valueOf(AbstractC1400ot.O(bArr));
        } else if (i5 != 75) {
            if (i5 == 78) {
                sb = String.valueOf(new C1617tm(bArr).E());
            }
            int length2 = bArr.length;
            StringBuilder sb32 = new StringBuilder(length2 + length2);
            while (i < bArr.length) {
                sb32.append(Character.forDigit((bArr[i] >> 4) & 15, 16));
                sb32.append(Character.forDigit(bArr[i] & 15, 16));
                i++;
            }
            sb = sb32.toString();
        } else {
            sb = String.valueOf(bArr[0] & 255);
        }
        return "mdta: key=" + str + ", value=" + sb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11818k);
        parcel.writeByteArray(this.f11819l);
        parcel.writeInt(this.f11820m);
        parcel.writeInt(this.f11821n);
    }

    public Uo(String str, byte[] bArr, int i, int i5) {
        a(str, bArr, i5);
        this.f11818k = str;
        this.f11819l = bArr;
        this.f11820m = i;
        this.f11821n = i5;
    }
}
