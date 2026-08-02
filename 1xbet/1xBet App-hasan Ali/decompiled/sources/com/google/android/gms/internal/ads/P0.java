package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class P0 extends K0 {
    public static final Parcelable.Creator<P0> CREATOR = new C1812y0(13);

    /* renamed from: l, reason: collision with root package name */
    public final String f11018l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC1044gv f11019m;

    public P0(String str, String str2, C1761wv c1761wv) {
        super(str);
        AbstractC1668us.S(!c1761wv.isEmpty());
        this.f11018l = str2;
        AbstractC1044gv l5 = AbstractC1044gv.l(c1761wv);
        this.f11019m = l5;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.K0, com.google.android.gms.internal.ads.InterfaceC1592t5
    public final void d(C1412p4 c1412p4) {
        char c5;
        byte b3;
        Long valueOf;
        byte b5;
        String str = this.f10099k;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c5 = 6;
                    break;
                }
                c5 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c5 = 16;
                    break;
                }
                c5 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c5 = '\f';
                    break;
                }
                c5 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c5 = 18;
                    break;
                }
                c5 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c5 = '\b';
                    break;
                }
                c5 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c5 = 20;
                    break;
                }
                c5 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c5 = '\n';
                    break;
                }
                c5 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c5 = 7;
                    break;
                }
                c5 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c5 = 17;
                    break;
                }
                c5 = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c5 = 22;
                    break;
                }
                c5 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c5 = '\r';
                    break;
                }
                c5 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c5 = 14;
                    break;
                }
                c5 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c5 = 15;
                    break;
                }
                c5 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c5 = 21;
                    break;
                }
                c5 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c5 = 5;
                    break;
                }
                c5 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c5 = 19;
                    break;
                }
                c5 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c5 = '\t';
                    break;
                }
                c5 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c5 = 11;
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        AbstractC1044gv abstractC1044gv = this.f11019m;
        try {
            switch (c5) {
                case 0:
                case 1:
                    c1412p4.f14939a = (CharSequence) abstractC1044gv.get(0);
                    break;
                case 2:
                case 3:
                    c1412p4.f14940b = (CharSequence) abstractC1044gv.get(0);
                    break;
                case 4:
                case 5:
                    c1412p4.f14942d = (CharSequence) abstractC1044gv.get(0);
                    break;
                case 6:
                case 7:
                    c1412p4.f14941c = (CharSequence) abstractC1044gv.get(0);
                    break;
                case '\b':
                case '\t':
                    String str2 = (String) abstractC1044gv.get(0);
                    int i = AbstractC1260lo.f14419a;
                    String[] split = str2.split("/", -1);
                    int parseInt = Integer.parseInt(split[0]);
                    r3 = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    c1412p4.f14945h = Integer.valueOf(parseInt);
                    c1412p4.i = r3;
                    break;
                case '\n':
                case 11:
                    c1412p4.f14948l = Integer.valueOf(Integer.parseInt((String) abstractC1044gv.get(0)));
                    break;
                case '\f':
                case '\r':
                    String str3 = (String) abstractC1044gv.get(0);
                    int parseInt2 = Integer.parseInt(str3.substring(2, 4));
                    int parseInt3 = Integer.parseInt(str3.substring(0, 2));
                    c1412p4.f14949m = Integer.valueOf(parseInt2);
                    c1412p4.f14950n = Integer.valueOf(parseInt3);
                    break;
                case 14:
                    ArrayList a5 = a((String) abstractC1044gv.get(0));
                    int size = a5.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c1412p4.f14950n = (Integer) a5.get(2);
                            }
                        }
                        c1412p4.f14949m = (Integer) a5.get(1);
                    }
                    c1412p4.f14948l = (Integer) a5.get(0);
                    break;
                case 15:
                    ArrayList a6 = a((String) abstractC1044gv.get(0));
                    int size2 = a6.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c1412p4.f14953q = (Integer) a6.get(2);
                            }
                        }
                        c1412p4.f14952p = (Integer) a6.get(1);
                    }
                    c1412p4.f14951o = (Integer) a6.get(0);
                    break;
                case 16:
                case 17:
                    c1412p4.f14955s = (CharSequence) abstractC1044gv.get(0);
                    break;
                case 18:
                case 19:
                    c1412p4.f14956t = (CharSequence) abstractC1044gv.get(0);
                    break;
                case 20:
                case C1639u7.zzm /* 21 */:
                    c1412p4.f14954r = (CharSequence) abstractC1044gv.get(0);
                    break;
                case 22:
                    String str4 = (String) abstractC1044gv.get(0);
                    str4.getClass();
                    if (!str4.isEmpty()) {
                        char charAt = str4.charAt(0);
                        int i5 = charAt == '-' ? 1 : 0;
                        if (i5 != str4.length()) {
                            int i6 = i5 + 1;
                            char charAt2 = str4.charAt(i5);
                            char c6 = 128;
                            if (charAt2 < 128) {
                                b3 = Zv.f12542a[charAt2];
                            } else {
                                byte[] bArr = Zv.f12542a;
                                b3 = -1;
                            }
                            if (b3 >= 0 && b3 < 10) {
                                long j5 = -b3;
                                while (true) {
                                    if (i6 < str4.length()) {
                                        int i7 = i6 + 1;
                                        char charAt3 = str4.charAt(i6);
                                        if (charAt3 < c6) {
                                            b5 = Zv.f12542a[charAt3];
                                        } else {
                                            byte[] bArr2 = Zv.f12542a;
                                            b5 = -1;
                                        }
                                        if (b5 >= 0 && b5 < 10 && j5 >= -922337203685477580L) {
                                            long j6 = j5 * 10;
                                            long j7 = b5;
                                            if (j6 >= j7 - Long.MIN_VALUE) {
                                                i6 = i7;
                                                j5 = j6 - j7;
                                                c6 = 128;
                                            }
                                        }
                                    } else if (charAt == '-') {
                                        valueOf = Long.valueOf(j5);
                                    } else if (j5 != Long.MIN_VALUE) {
                                        valueOf = Long.valueOf(-j5);
                                    }
                                }
                            }
                        }
                    }
                    valueOf = null;
                    if (valueOf != null && valueOf.longValue() == valueOf.intValue()) {
                        r3 = Integer.valueOf(valueOf.intValue());
                    }
                    if (r3 != null) {
                        String a7 = L0.a(r3.intValue());
                        if (a7 != null) {
                            c1412p4.f14957u = a7;
                            break;
                        }
                    } else {
                        c1412p4.f14957u = (CharSequence) abstractC1044gv.get(0);
                        break;
                    }
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && P0.class == obj.getClass()) {
            P0 p02 = (P0) obj;
            if (Objects.equals(this.f10099k, p02.f10099k) && Objects.equals(this.f11018l, p02.f11018l) && this.f11019m.equals(p02.f11019m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f10099k.hashCode() + 527;
        String str = this.f11018l;
        return this.f11019m.hashCode() + (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.K0
    public final String toString() {
        return this.f10099k + ": description=" + this.f11018l + ": values=" + String.valueOf(this.f11019m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10099k);
        parcel.writeString(this.f11018l);
        parcel.writeStringArray((String[]) this.f11019m.toArray(new String[0]));
    }
}
