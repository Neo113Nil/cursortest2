package k2;

import C1.C0095a;
import F1.x;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v0.AbstractC1663a;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class f extends h {

    /* renamed from: A, reason: collision with root package name */
    public final int f14749A;

    /* renamed from: B, reason: collision with root package name */
    public final e[] f14750B;

    /* renamed from: C, reason: collision with root package name */
    public e f14751C;

    /* renamed from: D, reason: collision with root package name */
    public List f14752D;

    /* renamed from: E, reason: collision with root package name */
    public List f14753E;

    /* renamed from: F, reason: collision with root package name */
    public x f14754F;

    /* renamed from: G, reason: collision with root package name */
    public int f14755G;

    /* renamed from: x, reason: collision with root package name */
    public final C0095a f14756x = new C0095a(4, false);

    /* renamed from: y, reason: collision with root package name */
    public final x f14757y = new x();

    /* renamed from: z, reason: collision with root package name */
    public int f14758z = -1;

    public f(int i7, List list) {
        this.f14749A = i7 == -1 ? 1 : i7;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b7 = ((byte[]) list.get(0))[0];
        }
        this.f14750B = new e[8];
        for (int i8 = 0; i8 < 8; i8++) {
            this.f14750B[i8] = new e();
        }
        this.f14751C = this.f14750B[0];
    }

    @Override // k2.h
    public final R4.c e() {
        List list = this.f14752D;
        this.f14753E = list;
        list.getClass();
        return new R4.c(list, 19);
    }

    @Override // k2.h
    public final void f(g gVar) {
        ByteBuffer byteBuffer = gVar.f1697d;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C0095a c0095a = this.f14756x;
        c0095a.B(limit, array);
        while (c0095a.d() >= 3) {
            int t7 = c0095a.t();
            int i7 = t7 & 3;
            boolean z4 = (t7 & 4) == 4;
            byte t8 = (byte) c0095a.t();
            byte t9 = (byte) c0095a.t();
            if (i7 == 2 || i7 == 3) {
                if (z4) {
                    if (i7 == 3) {
                        i();
                        int i8 = (t8 & 192) >> 6;
                        int i9 = this.f14758z;
                        if (i9 != -1 && i8 != (i9 + 1) % 4) {
                            k();
                            Log.w("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f14758z + " current=" + i8);
                        }
                        this.f14758z = i8;
                        int i10 = t8 & 63;
                        if (i10 == 0) {
                            i10 = 64;
                        }
                        x xVar = new x(i8, i10);
                        this.f14754F = xVar;
                        xVar.f2587e = 1;
                        xVar.f2586d[0] = t9;
                    } else {
                        AbstractC1664a.f(i7 == 2);
                        x xVar2 = this.f14754F;
                        if (xVar2 == null) {
                            Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = xVar2.f2586d;
                            int i11 = xVar2.f2587e;
                            int i12 = i11 + 1;
                            xVar2.f2587e = i12;
                            bArr[i11] = t8;
                            xVar2.f2587e = i11 + 2;
                            bArr[i12] = t9;
                        }
                    }
                    x xVar3 = this.f14754F;
                    if (xVar3.f2587e == (xVar3.f2585c * 2) - 1) {
                        i();
                    }
                }
            }
        }
    }

    @Override // k2.h, D1.d
    public final void flush() {
        super.flush();
        this.f14752D = null;
        this.f14753E = null;
        this.f14755G = 0;
        this.f14751C = this.f14750B[0];
        k();
        this.f14754F = null;
    }

    @Override // k2.h
    public final boolean h() {
        return this.f14752D != this.f14753E;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void i() {
        int i7;
        int i8;
        String str;
        boolean z4;
        char c3;
        int i9;
        String str2;
        x xVar = this.f14754F;
        if (xVar == null) {
            return;
        }
        int i10 = 2;
        String str3 = "Cea708Decoder";
        if (xVar.f2587e != (xVar.f2585c * 2) - 1) {
            Log.d("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f14754F.f2585c * 2) - 1) + ", but current index is " + this.f14754F.f2587e + " (sequence number " + this.f14754F.f2584b + ");");
        }
        x xVar2 = this.f14754F;
        byte[] bArr = xVar2.f2586d;
        int i11 = xVar2.f2587e;
        x xVar3 = this.f14757y;
        xVar3.n(i11, bArr);
        boolean z7 = false;
        while (true) {
            if (xVar3.b() > 0) {
                int i12 = 3;
                int i13 = xVar3.i(3);
                int i14 = xVar3.i(5);
                if (i13 == 7) {
                    xVar3.r(i10);
                    i13 = xVar3.i(6);
                    if (i13 < 7) {
                        AbstractC1663a.j(i13, "Invalid extended service number: ", str3);
                    }
                }
                if (i14 == 0) {
                    if (i13 != 0) {
                        Log.w(str3, "serviceNumber is non-zero (" + i13 + ") when blockSize is 0");
                    }
                } else if (i13 != this.f14749A) {
                    xVar3.s(i14);
                } else {
                    int g3 = (i14 * 8) + xVar3.g();
                    while (xVar3.g() < g3) {
                        int i15 = xVar3.i(8);
                        if (i15 != 16) {
                            if (i15 <= 31) {
                                if (i15 != 0) {
                                    if (i15 == i12) {
                                        this.f14752D = j();
                                    } else if (i15 != 8) {
                                        switch (i15) {
                                            case 12:
                                                k();
                                                break;
                                            case 13:
                                                this.f14751C.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (i15 < 17 || i15 > 23) {
                                                    if (i15 < 24 || i15 > 31) {
                                                        AbstractC1663a.j(i15, "Invalid C0 command: ", str3);
                                                        break;
                                                    } else {
                                                        Log.w(str3, "Currently unsupported COMMAND_P16 Command: " + i15);
                                                        xVar3.r(16);
                                                        break;
                                                    }
                                                } else {
                                                    Log.w(str3, "Currently unsupported COMMAND_EXT1 Command: " + i15);
                                                    xVar3.r(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.f14751C.f14729b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i9 = i10;
                                i7 = i12;
                                i8 = g3;
                            } else if (i15 <= 127) {
                                if (i15 == 127) {
                                    this.f14751C.a((char) 9835);
                                } else {
                                    this.f14751C.a((char) (i15 & 255));
                                }
                                i9 = i10;
                                i7 = i12;
                                i8 = g3;
                                z7 = true;
                            } else {
                                if (i15 <= 159) {
                                    e[] eVarArr = this.f14750B;
                                    switch (i15) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            str2 = str3;
                                            i7 = i12;
                                            i8 = g3;
                                            z4 = true;
                                            int i16 = i15 - 128;
                                            if (this.f14755G != i16) {
                                                this.f14755G = i16;
                                                this.f14751C = eVarArr[i16];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            str2 = str3;
                                            i7 = i12;
                                            i8 = g3;
                                            z4 = true;
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (xVar3.h()) {
                                                    e eVar = eVarArr[8 - i17];
                                                    eVar.f14728a.clear();
                                                    eVar.f14729b.clear();
                                                    eVar.f14742p = -1;
                                                    eVar.f14743q = -1;
                                                    eVar.f14744r = -1;
                                                    eVar.f14746t = -1;
                                                    eVar.f14748v = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            str2 = str3;
                                            i7 = i12;
                                            i8 = g3;
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (xVar3.h()) {
                                                    eVarArr[8 - i18].f14731d = true;
                                                }
                                            }
                                            z4 = true;
                                            break;
                                        case 138:
                                            str2 = str3;
                                            i7 = i12;
                                            i8 = g3;
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (xVar3.h()) {
                                                    eVarArr[8 - i19].f14731d = false;
                                                }
                                            }
                                            z4 = true;
                                            break;
                                        case 139:
                                            str2 = str3;
                                            i7 = i12;
                                            i8 = g3;
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (xVar3.h()) {
                                                    eVarArr[8 - i20].f14731d = !r1.f14731d;
                                                }
                                            }
                                            z4 = true;
                                            break;
                                        case 140:
                                            str2 = str3;
                                            i7 = i12;
                                            i8 = g3;
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (xVar3.h()) {
                                                    eVarArr[8 - i21].d();
                                                }
                                            }
                                            z4 = true;
                                            break;
                                        case 141:
                                            str2 = str3;
                                            i7 = i12;
                                            i8 = g3;
                                            xVar3.r(8);
                                            z4 = true;
                                            break;
                                        case 142:
                                            str2 = str3;
                                            i7 = i12;
                                            i8 = g3;
                                            z4 = true;
                                            break;
                                        case 143:
                                            str2 = str3;
                                            i7 = i12;
                                            i8 = g3;
                                            k();
                                            z4 = true;
                                            break;
                                        case 144:
                                            str2 = str3;
                                            i8 = g3;
                                            if (!this.f14751C.f14730c) {
                                                xVar3.r(16);
                                                i7 = 3;
                                                z4 = true;
                                                break;
                                            } else {
                                                xVar3.i(4);
                                                xVar3.i(2);
                                                xVar3.i(2);
                                                boolean h6 = xVar3.h();
                                                boolean h7 = xVar3.h();
                                                i7 = 3;
                                                xVar3.i(3);
                                                xVar3.i(3);
                                                this.f14751C.e(h6, h7);
                                                z4 = true;
                                            }
                                        case 145:
                                            str2 = str3;
                                            i8 = g3;
                                            if (this.f14751C.f14730c) {
                                                int c4 = e.c(xVar3.i(2), xVar3.i(2), xVar3.i(2), xVar3.i(2));
                                                int c7 = e.c(xVar3.i(2), xVar3.i(2), xVar3.i(2), xVar3.i(2));
                                                xVar3.r(2);
                                                e.c(xVar3.i(2), xVar3.i(2), xVar3.i(2), 0);
                                                this.f14751C.f(c4, c7);
                                            } else {
                                                xVar3.r(24);
                                            }
                                            i7 = 3;
                                            z4 = true;
                                            break;
                                        case 146:
                                            str2 = str3;
                                            i8 = g3;
                                            if (this.f14751C.f14730c) {
                                                xVar3.r(4);
                                                int i22 = xVar3.i(4);
                                                xVar3.r(2);
                                                xVar3.i(6);
                                                e eVar2 = this.f14751C;
                                                if (eVar2.f14748v != i22) {
                                                    eVar2.a('\n');
                                                }
                                                eVar2.f14748v = i22;
                                            } else {
                                                xVar3.r(16);
                                            }
                                            i7 = 3;
                                            z4 = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            AbstractC1663a.j(i15, "Invalid C1 command: ", str3);
                                            str2 = str3;
                                            i7 = i12;
                                            i8 = g3;
                                            z4 = true;
                                            break;
                                        case 151:
                                            str2 = str3;
                                            i8 = g3;
                                            if (this.f14751C.f14730c) {
                                                int c8 = e.c(xVar3.i(2), xVar3.i(2), xVar3.i(2), xVar3.i(2));
                                                xVar3.i(2);
                                                e.c(xVar3.i(2), xVar3.i(2), xVar3.i(2), 0);
                                                xVar3.h();
                                                xVar3.h();
                                                xVar3.i(2);
                                                xVar3.i(2);
                                                int i23 = xVar3.i(2);
                                                xVar3.r(8);
                                                e eVar3 = this.f14751C;
                                                eVar3.f14741o = c8;
                                                eVar3.f14738l = i23;
                                            } else {
                                                xVar3.r(32);
                                            }
                                            i7 = 3;
                                            z4 = true;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i24 = i15 - 152;
                                            e eVar4 = eVarArr[i24];
                                            xVar3.r(i10);
                                            boolean h8 = xVar3.h();
                                            boolean h9 = xVar3.h();
                                            xVar3.h();
                                            int i25 = xVar3.i(i12);
                                            boolean h10 = xVar3.h();
                                            int i26 = xVar3.i(7);
                                            int i27 = xVar3.i(8);
                                            int i28 = xVar3.i(4);
                                            int i29 = xVar3.i(4);
                                            xVar3.r(i10);
                                            i8 = g3;
                                            xVar3.i(6);
                                            xVar3.r(i10);
                                            int i30 = xVar3.i(3);
                                            str2 = str3;
                                            int i31 = xVar3.i(3);
                                            eVar4.f14730c = true;
                                            eVar4.f14731d = h8;
                                            eVar4.f14737k = h9;
                                            eVar4.f14732e = i25;
                                            eVar4.f14733f = h10;
                                            eVar4.f14734g = i26;
                                            eVar4.f14735h = i27;
                                            eVar4.f14736i = i28;
                                            int i32 = i29 + 1;
                                            if (eVar4.j != i32) {
                                                eVar4.j = i32;
                                                while (true) {
                                                    ArrayList arrayList = eVar4.f14728a;
                                                    if ((h9 && arrayList.size() >= eVar4.j) || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i30 != 0 && eVar4.f14739m != i30) {
                                                eVar4.f14739m = i30;
                                                int i33 = i30 - 1;
                                                int i34 = e.f14720C[i33];
                                                boolean z8 = e.f14719B[i33];
                                                int i35 = e.f14727z[i33];
                                                int i36 = e.f14718A[i33];
                                                int i37 = e.f14726y[i33];
                                                eVar4.f14741o = i34;
                                                eVar4.f14738l = i37;
                                            }
                                            if (i31 != 0 && eVar4.f14740n != i31) {
                                                eVar4.f14740n = i31;
                                                int i38 = i31 - 1;
                                                int i39 = e.f14722E[i38];
                                                int i40 = e.f14721D[i38];
                                                eVar4.e(false, false);
                                                eVar4.f(e.f14724w, e.f14723F[i38]);
                                            }
                                            if (this.f14755G != i24) {
                                                this.f14755G = i24;
                                                this.f14751C = eVarArr[i24];
                                            }
                                            i7 = 3;
                                            z4 = true;
                                            break;
                                    }
                                } else {
                                    str2 = str3;
                                    i7 = i12;
                                    i8 = g3;
                                    z4 = true;
                                    if (i15 <= 255) {
                                        this.f14751C.a((char) (i15 & 255));
                                    } else {
                                        str = str2;
                                        AbstractC1663a.j(i15, "Invalid base command: ", str);
                                        i9 = 2;
                                        c3 = 7;
                                    }
                                }
                                z7 = z4;
                                str = str2;
                                i9 = 2;
                                c3 = 7;
                            }
                            c3 = 7;
                            str = str3;
                            z4 = true;
                        } else {
                            i7 = i12;
                            i8 = g3;
                            str = str3;
                            z4 = true;
                            int i41 = xVar3.i(8);
                            if (i41 <= 31) {
                                c3 = 7;
                                if (i41 > 7) {
                                    if (i41 <= 15) {
                                        xVar3.r(8);
                                    } else if (i41 <= 23) {
                                        xVar3.r(16);
                                    } else if (i41 <= 31) {
                                        xVar3.r(24);
                                    }
                                }
                            } else {
                                c3 = 7;
                                if (i41 <= 127) {
                                    if (i41 == 32) {
                                        this.f14751C.a(' ');
                                    } else if (i41 == 33) {
                                        this.f14751C.a((char) 160);
                                    } else if (i41 == 37) {
                                        this.f14751C.a((char) 8230);
                                    } else if (i41 == 42) {
                                        this.f14751C.a((char) 352);
                                    } else if (i41 == 44) {
                                        this.f14751C.a((char) 338);
                                    } else if (i41 == 63) {
                                        this.f14751C.a((char) 376);
                                    } else if (i41 == 57) {
                                        this.f14751C.a((char) 8482);
                                    } else if (i41 == 58) {
                                        this.f14751C.a((char) 353);
                                    } else if (i41 == 60) {
                                        this.f14751C.a((char) 339);
                                    } else if (i41 != 61) {
                                        switch (i41) {
                                            case 48:
                                                this.f14751C.a((char) 9608);
                                                break;
                                            case 49:
                                                this.f14751C.a((char) 8216);
                                                break;
                                            case 50:
                                                this.f14751C.a((char) 8217);
                                                break;
                                            case 51:
                                                this.f14751C.a((char) 8220);
                                                break;
                                            case 52:
                                                this.f14751C.a((char) 8221);
                                                break;
                                            case 53:
                                                this.f14751C.a((char) 8226);
                                                break;
                                            default:
                                                switch (i41) {
                                                    case 118:
                                                        this.f14751C.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f14751C.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f14751C.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f14751C.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f14751C.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f14751C.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f14751C.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f14751C.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f14751C.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f14751C.a((char) 9484);
                                                        break;
                                                    default:
                                                        AbstractC1663a.j(i41, "Invalid G2 character: ", str);
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.f14751C.a((char) 8480);
                                    }
                                    z7 = true;
                                } else if (i41 > 159) {
                                    i9 = 2;
                                    if (i41 <= 255) {
                                        if (i41 == 160) {
                                            this.f14751C.a((char) 13252);
                                        } else {
                                            AbstractC1663a.j(i41, "Invalid G3 character: ", str);
                                            this.f14751C.a('_');
                                        }
                                        z7 = true;
                                    } else {
                                        AbstractC1663a.j(i41, "Invalid extended command: ", str);
                                    }
                                } else if (i41 <= 135) {
                                    xVar3.r(32);
                                } else if (i41 <= 143) {
                                    xVar3.r(40);
                                } else if (i41 <= 159) {
                                    i9 = 2;
                                    xVar3.r(2);
                                    xVar3.r(xVar3.i(6) * 8);
                                }
                            }
                            i9 = 2;
                        }
                        i12 = i7;
                        str3 = str;
                        g3 = i8;
                        i10 = i9;
                    }
                }
            }
        }
        if (z7) {
            this.f14752D = j();
        }
        this.f14754F = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List j() {
        d dVar;
        Layout.Alignment alignment;
        float f7;
        float f8;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < 8; i7++) {
            e[] eVarArr = this.f14750B;
            e eVar = eVarArr[i7];
            if (eVar.f14730c && (!eVar.f14728a.isEmpty() || eVar.f14729b.length() != 0)) {
                e eVar2 = eVarArr[i7];
                if (eVar2.f14731d) {
                    if (eVar2.f14730c) {
                        ArrayList arrayList2 = eVar2.f14728a;
                        if (!arrayList2.isEmpty() || eVar2.f14729b.length() != 0) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                                spannableStringBuilder.append((CharSequence) arrayList2.get(i8));
                                spannableStringBuilder.append('\n');
                            }
                            spannableStringBuilder.append((CharSequence) eVar2.b());
                            int i9 = eVar2.f14738l;
                            if (i9 != 0) {
                                if (i9 == 1) {
                                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                } else if (i9 == 2) {
                                    alignment = Layout.Alignment.ALIGN_CENTER;
                                } else if (i9 != 3) {
                                    throw new IllegalArgumentException("Unexpected justification value: " + eVar2.f14738l);
                                }
                                Layout.Alignment alignment2 = alignment;
                                if (eVar2.f14733f) {
                                    f7 = eVar2.f14735h / 209.0f;
                                    f8 = eVar2.f14734g / 74.0f;
                                } else {
                                    f7 = eVar2.f14735h / 99.0f;
                                    f8 = eVar2.f14734g / 99.0f;
                                }
                                float f9 = (f7 * 0.9f) + 0.05f;
                                float f10 = (f8 * 0.9f) + 0.05f;
                                int i10 = eVar2.f14736i;
                                int i11 = i10 / 3;
                                int i12 = i11 != 0 ? 0 : i11 == 1 ? 1 : 2;
                                int i13 = i10 % 3;
                                int i14 = i13 != 0 ? 0 : i13 == 1 ? 1 : 2;
                                int i15 = eVar2.f14741o;
                                dVar = new d(spannableStringBuilder, alignment2, f10, i12, f9, i14, i15 == e.f14725x, i15, eVar2.f14732e);
                                if (dVar != null) {
                                    arrayList.add(dVar);
                                }
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            Layout.Alignment alignment22 = alignment;
                            if (eVar2.f14733f) {
                            }
                            float f92 = (f7 * 0.9f) + 0.05f;
                            float f102 = (f8 * 0.9f) + 0.05f;
                            int i102 = eVar2.f14736i;
                            int i112 = i102 / 3;
                            if (i112 != 0) {
                            }
                            int i132 = i102 % 3;
                            if (i132 != 0) {
                            }
                            int i152 = eVar2.f14741o;
                            dVar = new d(spannableStringBuilder, alignment22, f102, i12, f92, i14, i152 == e.f14725x, i152, eVar2.f14732e);
                            if (dVar != null) {
                            }
                        }
                    }
                    dVar = null;
                    if (dVar != null) {
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, d.f14715c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            arrayList3.add(((d) arrayList.get(i16)).f14716a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void k() {
        for (int i7 = 0; i7 < 8; i7++) {
            this.f14750B[i7].d();
        }
    }
}
