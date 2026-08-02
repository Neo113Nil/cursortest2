package b4;

import com.google.common.collect.AbstractC5880y;
import j3.s;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import m3.N;

/* renamed from: b4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5537m extends AbstractC5532h {

    /* renamed from: b, reason: collision with root package name */
    public final String f55524b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC5880y<String> f55525c;

    /* JADX WARN: Multi-variable type inference failed */
    public C5537m(String str, String str2, List<String> list) {
        super(str);
        G10.a.c(!((AbstractCollection) list).isEmpty());
        this.f55524b = str2;
        AbstractC5880y<String> n11 = AbstractC5880y.n(list);
        this.f55525c = n11;
        n11.get(0);
    }

    private static ArrayList d(String str) {
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
    @Override // j3.t.a
    public final void a(s.a aVar) {
        char c11;
        String str = this.f55512a;
        AbstractC5880y<String> abstractC5880y = this.f55525c;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c11 = '\t';
                    break;
                }
                c11 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c11 = '\n';
                    break;
                }
                c11 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c11 = 11;
                    break;
                }
                c11 = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c11 = '\f';
                    break;
                }
                c11 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c11 = '\r';
                    break;
                }
                c11 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c11 = 14;
                    break;
                }
                c11 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c11 = 15;
                    break;
                }
                c11 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c11 = 16;
                    break;
                }
                c11 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c11 = 17;
                    break;
                }
                c11 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c11 = 18;
                    break;
                }
                c11 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c11 = 19;
                    break;
                }
                c11 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c11 = 20;
                    break;
                }
                c11 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c11 = 21;
                    break;
                }
                c11 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c11 = 22;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        try {
            switch (c11) {
                case 0:
                case '\n':
                    aVar.L(abstractC5880y.get(0));
                    break;
                case 1:
                case 11:
                    aVar.N(abstractC5880y.get(0));
                    break;
                case 2:
                case '\r':
                    String str2 = abstractC5880y.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    aVar.T(Integer.valueOf(parseInt));
                    aVar.S(Integer.valueOf(parseInt2));
                    break;
                case 3:
                case 18:
                    aVar.M(abstractC5880y.get(0));
                    break;
                case 4:
                case 19:
                    aVar.K(abstractC5880y.get(0));
                    break;
                case 5:
                case 20:
                    aVar.O(abstractC5880y.get(0));
                    break;
                case 6:
                case 21:
                    String str3 = abstractC5880y.get(0);
                    int i11 = N.f74289a;
                    String[] split = str3.split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    aVar.c0(Integer.valueOf(parseInt3));
                    aVar.b0(valueOf);
                    break;
                case 7:
                case 17:
                    aVar.Z(abstractC5880y.get(0));
                    break;
                case '\b':
                case 16:
                    aVar.d0(abstractC5880y.get(0));
                    break;
                case '\t':
                case 22:
                    aVar.U(Integer.valueOf(Integer.parseInt(abstractC5880y.get(0))));
                    break;
                case '\f':
                    Integer g10 = com.google.common.primitives.b.g(abstractC5880y.get(0));
                    if (g10 != null) {
                        String a11 = C5533i.a(g10.intValue());
                        if (a11 != null) {
                            aVar.R(a11);
                            break;
                        }
                    } else {
                        aVar.R(abstractC5880y.get(0));
                        break;
                    }
                    break;
                case 14:
                    ArrayList d11 = d(abstractC5880y.get(0));
                    int size = d11.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                aVar.S((Integer) d11.get(2));
                            }
                        }
                        aVar.T((Integer) d11.get(1));
                    }
                    aVar.U((Integer) d11.get(0));
                    break;
                case 15:
                    ArrayList d12 = d(abstractC5880y.get(0));
                    int size2 = d12.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                aVar.V((Integer) d12.get(2));
                            }
                        }
                        aVar.W((Integer) d12.get(1));
                    }
                    aVar.X((Integer) d12.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5537m.class == obj.getClass()) {
            C5537m c5537m = (C5537m) obj;
            if (Objects.equals(this.f55512a, c5537m.f55512a) && Objects.equals(this.f55524b, c5537m.f55524b) && this.f55525c.equals(c5537m.f55525c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a11 = G.g.a(527, 31, this.f55512a);
        String str = this.f55524b;
        return this.f55525c.hashCode() + ((a11 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // b4.AbstractC5532h
    public final String toString() {
        return this.f55512a + ": description=" + this.f55524b + ": values=" + this.f55525c;
    }
}
