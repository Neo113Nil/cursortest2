package H1;

import A1.X;
import C1.C0095a;
import E3.AbstractC0158p;
import E3.AbstractC0167z;
import E3.C0164w;
import E3.C0165x;
import E3.L;
import android.util.Log;
import com.google.android.exoplayer2.Format$Builder;
import java.util.Arrays;
import v0.AbstractC1663a;
import v2.t;

/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final L f3229a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3230b;

    public f(int i7, L l7) {
        this.f3230b = i7;
        this.f3229a = l7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i7, C0095a c0095a) {
        String str;
        a cVar;
        int i8;
        int i9 = 4;
        AbstractC0158p.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = c0095a.f1464b;
        int i11 = 0;
        int i12 = -2;
        int i13 = 0;
        while (c0095a.d() > 8) {
            int i14 = c0095a.i();
            int i15 = c0095a.f1463a + c0095a.i();
            c0095a.C(i15);
            if (i14 != 1414744396) {
                g gVar = null;
                switch (i14) {
                    case 1718776947:
                        if (i12 == 2) {
                            c0095a.E(i9);
                            int i16 = c0095a.i();
                            int i17 = c0095a.i();
                            c0095a.E(i9);
                            int i18 = c0095a.i();
                            switch (i18) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                AbstractC1663a.j(i18, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                            } else {
                                Format$Builder format$Builder = new Format$Builder();
                                format$Builder.f10542p = i16;
                                format$Builder.f10543q = i17;
                                format$Builder.f10537k = str;
                                gVar = new g(new X(format$Builder));
                            }
                        } else if (i12 == 1) {
                            int m7 = c0095a.m();
                            String str2 = m7 != 1 ? m7 != 85 ? m7 != 255 ? m7 != 8192 ? m7 != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 == null) {
                                AbstractC1663a.j(m7, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                            } else {
                                int m8 = c0095a.m();
                                int i19 = c0095a.i();
                                c0095a.E(6);
                                int v6 = t.v(c0095a.y());
                                int m9 = c0095a.m();
                                byte[] bArr = new byte[m9];
                                c0095a.f(bArr, i11, m9);
                                Format$Builder format$Builder2 = new Format$Builder();
                                format$Builder2.f10537k = str2;
                                format$Builder2.f10550x = m8;
                                format$Builder2.f10551y = i19;
                                if ("audio/raw".equals(str2) && v6 != 0) {
                                    format$Builder2.f10552z = v6;
                                }
                                if ("audio/mp4a-latm".equals(str2) && m9 > 0) {
                                    format$Builder2.f10539m = AbstractC0167z.I(bArr);
                                }
                                gVar = new g(new X(format$Builder2));
                            }
                        } else {
                            Log.w("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + t.B(i12));
                        }
                        cVar = gVar;
                        break;
                    case 1751742049:
                        int i20 = c0095a.i();
                        c0095a.E(8);
                        int i21 = c0095a.i();
                        int i22 = c0095a.i();
                        c0095a.E(i9);
                        c0095a.i();
                        c0095a.E(12);
                        cVar = new c(i20, i21, i22);
                        break;
                    case 1752331379:
                        int i23 = c0095a.i();
                        c0095a.E(12);
                        c0095a.i();
                        int i24 = c0095a.i();
                        int i25 = c0095a.i();
                        c0095a.E(i9);
                        int i26 = c0095a.i();
                        int i27 = c0095a.i();
                        c0095a.E(8);
                        cVar = new d(i23, i24, i25, i26, i27);
                        break;
                    case 1852994675:
                        cVar = new h(c0095a.r(c0095a.d(), D3.f.f1719c));
                        break;
                    default:
                        cVar = gVar;
                        break;
                }
            } else {
                cVar = b(c0095a.i(), c0095a);
            }
            if (cVar != null) {
                if (cVar.getType() == 1752331379) {
                    int i28 = ((d) cVar).f3213a;
                    if (i28 == 1935960438) {
                        i12 = 2;
                    } else if (i28 != 1935963489) {
                        if (i28 != 1937012852) {
                            Log.w("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i28));
                            i8 = -1;
                        } else {
                            i8 = 3;
                        }
                        i12 = i8;
                    } else {
                        i12 = 1;
                    }
                }
                int i29 = i13 + 1;
                if (objArr.length < i29) {
                    objArr = Arrays.copyOf(objArr, C0164w.e(objArr.length, i29));
                }
                objArr[i13] = cVar;
                i13 = i29;
            }
            c0095a.D(i15);
            c0095a.C(i10);
            i9 = 4;
            i11 = 0;
        }
        return new f(i7, AbstractC0167z.B(i13, objArr));
    }

    public final a a(Class cls) {
        C0165x listIterator = this.f3229a.listIterator(0);
        while (listIterator.hasNext()) {
            a aVar = (a) listIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // H1.a
    public final int getType() {
        return this.f3230b;
    }
}
