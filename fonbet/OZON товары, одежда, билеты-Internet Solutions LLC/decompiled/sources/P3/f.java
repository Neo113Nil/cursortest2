package P3;

import Ij.C3261b;
import com.google.common.collect.AbstractC5880y;
import com.google.common.collect.g0;
import j3.C7272n;
import java.nio.ByteOrder;
import m3.C8050C;
import m3.N;
import m3.s;

/* loaded from: classes8.dex */
final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5880y<a> f21781a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21782b;

    private f(int i11, AbstractC5880y<a> abstractC5880y) {
        this.f21782b = i11;
        this.f21781a = abstractC5880y;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i11, C8050C c8050c) {
        a gVar;
        String str;
        AbstractC5880y.a aVar = new AbstractC5880y.a();
        int i12 = c8050c.i();
        int i13 = -2;
        while (c8050c.a() > 8) {
            int s11 = c8050c.s();
            int f7 = c8050c.f() + c8050c.s();
            c8050c.Q(f7);
            if (s11 != 1414744396) {
                g gVar2 = null;
                switch (s11) {
                    case 1718776947:
                        if (i13 == 2) {
                            c8050c.S(4);
                            int s12 = c8050c.s();
                            int s13 = c8050c.s();
                            c8050c.S(4);
                            int s14 = c8050c.s();
                            switch (s14) {
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
                                C3261b.f(s14, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                            } else {
                                C7272n.a aVar2 = new C7272n.a();
                                aVar2.F0(s12);
                                aVar2.h0(s13);
                                aVar2.y0(str);
                                gVar2 = new g(aVar2.P());
                            }
                        } else if (i13 == 1) {
                            int x11 = c8050c.x();
                            String str2 = x11 != 1 ? x11 != 85 ? x11 != 255 ? x11 != 8192 ? x11 != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 != null) {
                                int x12 = c8050c.x();
                                int s15 = c8050c.s();
                                c8050c.S(6);
                                int x13 = c8050c.x();
                                int i14 = N.f74289a;
                                int C11 = N.C(x13, ByteOrder.LITTLE_ENDIAN);
                                int x14 = c8050c.a() > 0 ? c8050c.x() : 0;
                                C7272n.a aVar3 = new C7272n.a();
                                aVar3.y0(str2);
                                aVar3.T(x12);
                                aVar3.z0(s15);
                                if (str2.equals("audio/raw") && C11 != 0) {
                                    aVar3.s0(C11);
                                }
                                if (str2.equals("audio/mp4a-latm") && x14 > 0) {
                                    byte[] bArr = new byte[x14];
                                    c8050c.n(0, x14, bArr);
                                    aVar3.k0(AbstractC5880y.B(bArr));
                                }
                                gVar = new g(aVar3.P());
                                break;
                            } else {
                                C3261b.f(x11, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                            }
                        } else {
                            s.f("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + N.G(i13));
                        }
                        gVar = gVar2;
                        break;
                    case 1751742049:
                        gVar = c.b(c8050c);
                        break;
                    case 1752331379:
                        gVar = d.c(c8050c);
                        break;
                    case 1852994675:
                        gVar = h.a(c8050c);
                        break;
                    default:
                        gVar = gVar2;
                        break;
                }
            } else {
                gVar = b(c8050c.s(), c8050c);
            }
            if (gVar != null) {
                if (gVar.getType() == 1752331379) {
                    i13 = ((d) gVar).b();
                }
                aVar.e(gVar);
            }
            c8050c.R(f7);
            c8050c.Q(i12);
        }
        return new f(i11, aVar.j());
    }

    public final <T extends a> T a(Class<T> cls) {
        g0<a> listIterator = this.f21781a.listIterator(0);
        while (listIterator.hasNext()) {
            T t2 = (T) listIterator.next();
            if (t2.getClass() == cls) {
                return t2;
            }
        }
        return null;
    }

    @Override // P3.a
    public final int getType() {
        return this.f21782b;
    }
}
