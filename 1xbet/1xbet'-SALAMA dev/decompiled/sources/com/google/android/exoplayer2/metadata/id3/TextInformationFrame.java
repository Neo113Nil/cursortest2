package com.google.android.exoplayer2.metadata.id3;

import A1.C0024i0;
import V2.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.ArrayList;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new a(13);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10637c;

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.f10636b = str2;
        this.f10637c = str3;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return t.a(this.f10625a, textInformationFrame.f10625a) && t.a(this.f10636b, textInformationFrame.f10636b) && t.a(this.f10637c, textInformationFrame.f10637c);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void h(C0024i0 c0024i0) {
        byte b7;
        String str = this.f10625a;
        str.getClass();
        String str2 = this.f10637c;
        switch (str) {
            case "TAL":
                b7 = 0;
                break;
            case "TCM":
                b7 = 1;
                break;
            case "TDA":
                b7 = 2;
                break;
            case "TP1":
                b7 = 3;
                break;
            case "TP2":
                b7 = 4;
                break;
            case "TP3":
                b7 = 5;
                break;
            case "TRK":
                b7 = 6;
                break;
            case "TT2":
                b7 = 7;
                break;
            case "TXT":
                b7 = 8;
                break;
            case "TYE":
                b7 = 9;
                break;
            case "TALB":
                b7 = 10;
                break;
            case "TCOM":
                b7 = 11;
                break;
            case "TDAT":
                b7 = 12;
                break;
            case "TDRC":
                b7 = 13;
                break;
            case "TDRL":
                b7 = 14;
                break;
            case "TEXT":
                b7 = 15;
                break;
            case "TIT2":
                b7 = 16;
                break;
            case "TPE1":
                b7 = 17;
                break;
            case "TPE2":
                b7 = 18;
                break;
            case "TPE3":
                b7 = 19;
                break;
            case "TRCK":
                b7 = 20;
                break;
            case "TYER":
                b7 = 21;
                break;
            default:
                b7 = -1;
                break;
        }
        try {
            switch (b7) {
                case 0:
                case 10:
                    c0024i0.f391c = str2;
                    break;
                case 1:
                case 11:
                    c0024i0.f411x = str2;
                    break;
                case 2:
                case 12:
                    int i7 = Integer.parseInt(str2.substring(2, 4));
                    int i8 = Integer.parseInt(str2.substring(0, 2));
                    c0024i0.f405r = Integer.valueOf(i7);
                    c0024i0.f406s = Integer.valueOf(i8);
                    break;
                case 3:
                case 17:
                    c0024i0.f390b = str2;
                    break;
                case 4:
                case 18:
                    c0024i0.f392d = str2;
                    break;
                case 5:
                case 19:
                    c0024i0.f412y = str2;
                    break;
                case 6:
                case 20:
                    int i9 = t.f17159a;
                    String[] strArrSplit = str2.split("/", -1);
                    int i10 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    c0024i0.f400m = Integer.valueOf(i10);
                    c0024i0.f401n = numValueOf;
                    break;
                case 7:
                case 16:
                    c0024i0.f389a = str2;
                    break;
                case 8:
                case 15:
                    c0024i0.f410w = str2;
                    break;
                case 9:
                case zzbbd.zzt.zzm /* 21 */:
                    c0024i0.f404q = Integer.valueOf(Integer.parseInt(str2));
                    break;
                case 13:
                    ArrayList arrayListA = a(str2);
                    int size = arrayListA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c0024i0.f406s = (Integer) arrayListA.get(2);
                            }
                        }
                        c0024i0.f405r = (Integer) arrayListA.get(1);
                    }
                    c0024i0.f404q = (Integer) arrayListA.get(0);
                    break;
                case 14:
                    ArrayList arrayListA2 = a(str2);
                    int size2 = arrayListA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c0024i0.f409v = (Integer) arrayListA2.get(2);
                            }
                        }
                        c0024i0.f408u = (Integer) arrayListA2.get(1);
                    }
                    c0024i0.f407t = (Integer) arrayListA2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final int hashCode() {
        int iD = p150v0.a.d(527, 31, this.f10625a);
        String str = this.f10636b;
        int iHashCode = (iD + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10637c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f10625a + ": description=" + this.f10636b + ": value=" + this.f10637c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f10625a);
        parcel.writeString(this.f10636b);
        parcel.writeString(this.f10637c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInformationFrame(Parcel parcel) {
        String string = parcel.readString();
        int i7 = t.f17159a;
        super(string);
        this.f10636b = parcel.readString();
        this.f10637c = parcel.readString();
    }
}
