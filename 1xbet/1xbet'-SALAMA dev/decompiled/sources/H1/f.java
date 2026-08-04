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
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f3229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3230b;

    public f(int i7, L l7) {
        this.f3230b = i7;
        this.f3229a = l7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i7, C0095a c0095a) {
        String str;
        String str2;
        a cVar;
        int i8;
        int i9 = 4;
        AbstractC0158p.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
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
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                p150v0.a.j(i18, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                            } else {
                                Format$Builder format$Builder = new Format$Builder();
                                format$Builder.f10542p = i16;
                                format$Builder.f10543q = i17;
                                format$Builder.f10537k = str2;
                                gVar = new g(new X(format$Builder));
                            }
                        } else if (i12 == 1) {
                            int iM = c0095a.m();
                            if (iM == 1) {
                                str = "audio/raw";
                            } else if (iM == 85) {
                                str = "audio/mpeg";
                            } else if (iM == 255) {
                                str = "audio/mp4a-latm";
                            } else if (iM != 8192) {
                                str = iM != 8193 ? null : "audio/vnd.dts";
                            } else {
                                str = "audio/ac3";
                            }
                            if (str == null) {
                                p150v0.a.j(iM, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                            } else {
                                int iM2 = c0095a.m();
                                int i19 = c0095a.i();
                                c0095a.E(6);
                                int iV = t.v(c0095a.y());
                                int iM3 = c0095a.m();
                                byte[] bArr = new byte[iM3];
                                c0095a.f(bArr, i11, iM3);
                                Format$Builder format$Builder2 = new Format$Builder();
                                format$Builder2.f10537k = str;
                                format$Builder2.f10550x = iM2;
                                format$Builder2.f10551y = i19;
                                if ("audio/raw".equals(str) && iV != 0) {
                                    format$Builder2.f10552z = iV;
                                }
                                if ("audio/mp4a-latm".equals(str) && iM3 > 0) {
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
                if (objArrCopyOf.length < i29) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, C0164w.e(objArrCopyOf.length, i29));
                }
                objArrCopyOf[i13] = cVar;
                i13 = i29;
            }
            c0095a.D(i15);
            c0095a.C(i10);
            i9 = 4;
            i11 = 0;
        }
        return new f(i7, AbstractC0167z.B(i13, objArrCopyOf));
    }

    public final a a(Class cls) {
        C0165x c0165xListIterator = this.f3229a.listIterator(0);
        while (c0165xListIterator.hasNext()) {
            a aVar = (a) c0165xListIterator.next();
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
