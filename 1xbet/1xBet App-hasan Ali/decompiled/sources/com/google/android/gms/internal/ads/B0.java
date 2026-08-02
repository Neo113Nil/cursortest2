package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class B0 implements InterfaceC1592t5 {
    public static final Parcelable.Creator<B0> CREATOR = new C1812y0(2);

    /* renamed from: k, reason: collision with root package name */
    public final String f7756k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7757l;

    public B0(Parcel parcel) {
        String readString = parcel.readString();
        int i = AbstractC1260lo.f14419a;
        this.f7756k = readString;
        this.f7757l = parcel.readString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.InterfaceC1592t5
    public final void d(C1412p4 c1412p4) {
        char c5;
        String str = this.f7756k;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        String str2 = this.f7757l;
        if (c5 == 0) {
            c1412p4.f14939a = str2;
            return;
        }
        if (c5 == 1) {
            c1412p4.f14940b = str2;
            return;
        }
        if (c5 == 2) {
            c1412p4.f14941c = str2;
        } else if (c5 == 3) {
            c1412p4.f14942d = str2;
        } else {
            if (c5 != 4) {
                return;
            }
            c1412p4.f14943e = str2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            B0 b02 = (B0) obj;
            if (this.f7756k.equals(b02.f7756k) && this.f7757l.equals(b02.f7757l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7757l.hashCode() + ((this.f7756k.hashCode() + 527) * 31);
    }

    public final String toString() {
        return "VC: " + this.f7756k + "=" + this.f7757l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7756k);
        parcel.writeString(this.f7757l);
    }

    public B0(String str, String str2) {
        this.f7756k = AbstractC0952et.E(str);
        this.f7757l = str2;
    }
}
