package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1138j0 implements InterfaceC0915e0 {

    /* renamed from: a, reason: collision with root package name */
    public final C1761wv f14043a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14044b;

    public C1138j0(int i, C1761wv c1761wv) {
        this.f14044b = i;
        this.f14043a = c1761wv;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1138j0 c(int i, C1617tm c1617tm) {
        int i5;
        String str;
        int i6;
        InterfaceC0915e0 c1183k0;
        String str2;
        int i7 = 1;
        int i8 = 4;
        AbstractC0952et.q("initialCapacity", 4);
        Object[] objArr = new Object[4];
        int i9 = c1617tm.f15726c;
        int i10 = 0;
        int i11 = -2;
        int i12 = 0;
        while (c1617tm.o() > 8) {
            int r5 = c1617tm.r();
            int r6 = c1617tm.f15725b + c1617tm.r();
            c1617tm.i(r6);
            if (r5 == 1414744396) {
                c1183k0 = c(c1617tm.r(), c1617tm);
            } else {
                C1050h0 c1050h0 = null;
                switch (r5) {
                    case 1718776947:
                        if (i11 == 2) {
                            c1617tm.k(i8);
                            int r7 = c1617tm.r();
                            int r8 = c1617tm.r();
                            c1617tm.k(i8);
                            int r9 = c1617tm.r();
                            switch (r9) {
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
                            if (str2 != null) {
                                C1649uH c1649uH = new C1649uH();
                                c1649uH.f15855s = r7;
                                c1649uH.f15856t = r8;
                                c1649uH.c(str2);
                                i5 = i7;
                                c1183k0 = new C1183k0(new C1407p(c1649uH));
                                break;
                            } else {
                                AbstractC0467k.y(r9, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                i5 = i7;
                            }
                        } else if (i11 == i7) {
                            int t5 = c1617tm.t();
                            String str3 = t5 != i7 ? t5 != 85 ? t5 != 255 ? t5 != 8192 ? t5 != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str3 != null) {
                                int t6 = c1617tm.t();
                                int r10 = c1617tm.r();
                                c1617tm.k(6);
                                int q5 = AbstractC1260lo.q(c1617tm.t());
                                if (c1617tm.o() > 0) {
                                    i5 = i7;
                                    i6 = c1617tm.t();
                                } else {
                                    i5 = i7;
                                    i6 = i10;
                                }
                                byte[] bArr = new byte[i6];
                                c1617tm.f(bArr, i10, i6);
                                C1649uH c1649uH2 = new C1649uH();
                                c1649uH2.c(str3);
                                c1649uH2.f15831A = t6;
                                c1649uH2.f15832B = r10;
                                if ("audio/raw".equals(str3) && q5 != 0) {
                                    c1649uH2.f15833C = q5;
                                }
                                if ("audio/mp4a-latm".equals(str3) && i6 > 0) {
                                    c1649uH2.f15851o = AbstractC1044gv.n(bArr);
                                }
                                c1183k0 = new C1183k0(new C1407p(c1649uH2));
                                break;
                            } else {
                                AbstractC0467k.y(t5, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                i5 = i7;
                            }
                        } else {
                            i5 = i7;
                            int i13 = AbstractC1260lo.f14419a;
                            switch (i11) {
                                case -2:
                                    str = "none";
                                    break;
                                case -1:
                                    str = "unknown";
                                    break;
                                case 0:
                                    str = "default";
                                    break;
                                case 1:
                                    str = "audio";
                                    break;
                                case 2:
                                    str = "video";
                                    break;
                                case 3:
                                    str = "text";
                                    break;
                                case 4:
                                    str = "image";
                                    break;
                                case 5:
                                    str = "metadata";
                                    break;
                                default:
                                    str = "camera motion";
                                    break;
                            }
                            JB.l("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(str));
                        }
                        c1183k0 = c1050h0;
                        break;
                    case 1751742049:
                        int r11 = c1617tm.r();
                        c1617tm.k(8);
                        int r12 = c1617tm.r();
                        int r13 = c1617tm.r();
                        c1617tm.k(i8);
                        c1617tm.r();
                        c1617tm.k(12);
                        i5 = i7;
                        c1183k0 = new C1005g0(r11, r12, r13);
                        break;
                    case 1752331379:
                        int r14 = c1617tm.r();
                        c1617tm.k(12);
                        c1617tm.r();
                        int r15 = c1617tm.r();
                        int r16 = c1617tm.r();
                        c1617tm.k(i8);
                        int r17 = c1617tm.r();
                        int r18 = c1617tm.r();
                        c1617tm.k(8);
                        c1050h0 = new C1050h0(r14, r15, r16, r17, r18);
                        i5 = i7;
                        c1183k0 = c1050h0;
                        break;
                    case 1852994675:
                        c1183k0 = new C1228l0(c1617tm.b(c1617tm.o(), StandardCharsets.UTF_8));
                        break;
                    default:
                        i5 = i7;
                        c1183k0 = c1050h0;
                        break;
                }
                if (c1183k0 != null) {
                    if (c1183k0.a() == 1752331379) {
                        int i14 = ((C1050h0) c1183k0).f13693a;
                        if (i14 == 1935960438) {
                            i11 = 2;
                        } else if (i14 == 1935963489) {
                            i11 = i5;
                        } else if (i14 != 1937012852) {
                            JB.l("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i14))));
                            i11 = -1;
                        } else {
                            i11 = 3;
                        }
                    }
                    int length = objArr.length;
                    int i15 = i12 + 1;
                    int d5 = AbstractC0776av.d(length, i15);
                    if (d5 > length) {
                        objArr = Arrays.copyOf(objArr, d5);
                    }
                    objArr[i12] = c1183k0;
                    i12 = i15;
                }
                c1617tm.j(r6);
                c1617tm.i(i9);
                i7 = i5;
                i8 = 4;
                i10 = 0;
            }
            i5 = i7;
            if (c1183k0 != null) {
            }
            c1617tm.j(r6);
            c1617tm.i(i9);
            i7 = i5;
            i8 = 4;
            i10 = 0;
        }
        return new C1138j0(i, AbstractC1044gv.k(i12, objArr));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0915e0
    public final int a() {
        return this.f14044b;
    }

    public final InterfaceC0915e0 b(Class cls) {
        C1761wv c1761wv = this.f14043a;
        int i = c1761wv.f16186n;
        int i5 = 0;
        while (i5 < i) {
            InterfaceC0915e0 interfaceC0915e0 = (InterfaceC0915e0) c1761wv.get(i5);
            i5++;
            if (interfaceC0915e0.getClass() == cls) {
                return interfaceC0915e0;
            }
        }
        return null;
    }
}
