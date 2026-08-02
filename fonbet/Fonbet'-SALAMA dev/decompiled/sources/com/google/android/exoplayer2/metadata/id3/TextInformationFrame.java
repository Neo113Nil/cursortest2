package com.google.android.exoplayer2.metadata.id3;

import A1.C0024i0;
import V2.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.ArrayList;
import v0.AbstractC1663a;
import v2.t;

/* loaded from: classes.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new a(13);

    /* renamed from: b, reason: collision with root package name */
    public final String f10636b;

    /* renamed from: c, reason: collision with root package name */
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void h(C0024i0 c0024i0) {
        char c3;
        String str = this.f10625a;
        str.getClass();
        String str2 = this.f10637c;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c3 = '\n';
                    break;
                }
                c3 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c3 = 11;
                    break;
                }
                c3 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c3 = '\f';
                    break;
                }
                c3 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c3 = '\r';
                    break;
                }
                c3 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c3 = 14;
                    break;
                }
                c3 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c3 = 15;
                    break;
                }
                c3 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c3 = 16;
                    break;
                }
                c3 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c3 = 17;
                    break;
                }
                c3 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c3 = 18;
                    break;
                }
                c3 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c3 = 19;
                    break;
                }
                c3 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c3 = 20;
                    break;
                }
                c3 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c3 = 21;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        try {
            switch (c3) {
                case 0:
                case '\n':
                    c0024i0.f391c = str2;
                    break;
                case 1:
                case 11:
                    c0024i0.f411x = str2;
                    break;
                case 2:
                case '\f':
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    c0024i0.f405r = Integer.valueOf(parseInt);
                    c0024i0.f406s = Integer.valueOf(parseInt2);
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
                    int i7 = t.f17153a;
                    String[] split = str2.split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    c0024i0.f400m = Integer.valueOf(parseInt3);
                    c0024i0.f401n = valueOf;
                    break;
                case 7:
                case 16:
                    c0024i0.f389a = str2;
                    break;
                case '\b':
                case 15:
                    c0024i0.f410w = str2;
                    break;
                case '\t':
                case zzbbd.zzt.zzm /* 21 */:
                    c0024i0.f404q = Integer.valueOf(Integer.parseInt(str2));
                    break;
                case '\r':
                    ArrayList a2 = a(str2);
                    int size = a2.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c0024i0.f406s = (Integer) a2.get(2);
                            }
                        }
                        c0024i0.f405r = (Integer) a2.get(1);
                    }
                    c0024i0.f404q = (Integer) a2.get(0);
                    break;
                case 14:
                    ArrayList a4 = a(str2);
                    int size2 = a4.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c0024i0.f409v = (Integer) a4.get(2);
                            }
                        }
                        c0024i0.f408u = (Integer) a4.get(1);
                    }
                    c0024i0.f407t = (Integer) a4.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final int hashCode() {
        int d7 = AbstractC1663a.d(527, 31, this.f10625a);
        String str = this.f10636b;
        int hashCode = (d7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10637c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextInformationFrame(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i7 = t.f17153a;
        this.f10636b = parcel.readString();
        this.f10637c = parcel.readString();
    }
}
