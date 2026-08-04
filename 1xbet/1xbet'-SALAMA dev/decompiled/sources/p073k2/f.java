package p073k2;

import C1.C0095a;
import F1.x;
import R4.c;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p151v2.a;

/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f14755A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final e[] f14756B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public e f14757C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public List f14758D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public List f14759E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public x f14760F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f14761G;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0095a f14762x = new C0095a(4, false);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final x f14763y = new x();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f14764z = -1;

    public f(int i7, List list) {
        this.f14755A = i7 == -1 ? 1 : i7;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b7 = ((byte[]) list.get(0))[0];
        }
        this.f14756B = new e[8];
        for (int i8 = 0; i8 < 8; i8++) {
            this.f14756B[i8] = new e();
        }
        this.f14757C = this.f14756B[0];
    }

    @Override // p073k2.h
    public final c e() {
        List list = this.f14758D;
        this.f14759E = list;
        list.getClass();
        return new c(list, 19);
    }

    @Override // p073k2.h
    public final void f(g gVar) {
        ByteBuffer byteBuffer = gVar.f1697d;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C0095a c0095a = this.f14762x;
        c0095a.B(iLimit, bArrArray);
        while (c0095a.d() >= 3) {
            int iT = c0095a.t();
            int i7 = iT & 3;
            boolean z4 = (iT & 4) == 4;
            byte bT = (byte) c0095a.t();
            byte bT2 = (byte) c0095a.t();
            if (i7 == 2 || i7 == 3) {
                if (z4) {
                    if (i7 == 3) {
                        i();
                        int i8 = (bT & 192) >> 6;
                        int i9 = this.f14764z;
                        if (i9 != -1 && i8 != (i9 + 1) % 4) {
                            k();
                            Log.w("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f14764z + " current=" + i8);
                        }
                        this.f14764z = i8;
                        int i10 = bT & 63;
                        if (i10 == 0) {
                            i10 = 64;
                        }
                        x xVar = new x(i8, i10);
                        this.f14760F = xVar;
                        xVar.f2587e = 1;
                        xVar.f2586d[0] = bT2;
                    } else {
                        a.f(i7 == 2);
                        x xVar2 = this.f14760F;
                        if (xVar2 == null) {
                            Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = xVar2.f2586d;
                            int i11 = xVar2.f2587e;
                            int i12 = i11 + 1;
                            xVar2.f2587e = i12;
                            bArr[i11] = bT;
                            xVar2.f2587e = i11 + 2;
                            bArr[i12] = bT2;
                        }
                    }
                    x xVar3 = this.f14760F;
                    if (xVar3.f2587e == (xVar3.f2585c * 2) - 1) {
                        i();
                    }
                }
            }
        }
    }

    @Override // p073k2.h, D1.d
    public final void flush() {
        super.flush();
        this.f14758D = null;
        this.f14759E = null;
        this.f14761G = 0;
        this.f14757C = this.f14756B[0];
        k();
        this.f14760F = null;
    }

    @Override // p073k2.h
    public final boolean h() {
        return this.f14758D != this.f14759E;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:233:0x0591  */
    public final void i() {
        String str;
        boolean z4;
        char c3;
        String str2;
        x xVar = this.f14760F;
        if (xVar == null) {
            return;
        }
        int i7 = 2;
        String str3 = "Cea708Decoder";
        if (xVar.f2587e != (xVar.f2585c * 2) - 1) {
            Log.d("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f14760F.f2585c * 2) - 1) + ", but current index is " + this.f14760F.f2587e + " (sequence number " + this.f14760F.f2584b + ");");
        }
        x xVar2 = this.f14760F;
        byte[] bArr = xVar2.f2586d;
        int i8 = xVar2.f2587e;
        x xVar3 = this.f14763y;
        xVar3.n(i8, bArr);
        boolean z7 = false;
        while (xVar3.b() > 0) {
            int i9 = 3;
            int i10 = xVar3.i(3);
            int i11 = xVar3.i(5);
            if (i10 == 7) {
                xVar3.r(i7);
                i10 = xVar3.i(6);
                if (i10 < 7) {
                    p150v0.a.j(i10, "Invalid extended service number: ", str3);
                }
            }
            if (i11 == 0) {
                if (i10 != 0) {
                    Log.w(str3, "serviceNumber is non-zero (" + i10 + ") when blockSize is 0");
                }
                if (z7) {
                    this.f14758D = j();
                }
                this.f14760F = null;
            }
            if (i10 != this.f14755A) {
                xVar3.s(i11);
            } else {
                int iG = (i11 * 8) + xVar3.g();
                while (xVar3.g() < iG) {
                    int i12 = xVar3.i(8);
                    if (i12 != 16) {
                        if (i12 <= 31) {
                            if (i12 != 0) {
                                if (i12 == i9) {
                                    this.f14758D = j();
                                } else if (i12 != 8) {
                                    switch (i12) {
                                        case 12:
                                            k();
                                            break;
                                        case 13:
                                            this.f14757C.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (i12 >= 17 && i12 <= 23) {
                                                Log.w(str3, "Currently unsupported COMMAND_EXT1 Command: " + i12);
                                                xVar3.r(8);
                                            } else if (i12 < 24 || i12 > 31) {
                                                p150v0.a.j(i12, "Invalid C0 command: ", str3);
                                            } else {
                                                Log.w(str3, "Currently unsupported COMMAND_P16 Command: " + i12);
                                                xVar3.r(16);
                                            }
                                            break;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.f14757C.f14735b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (i12 <= 127) {
                            if (i12 == 127) {
                                this.f14757C.a((char) 9835);
                            } else {
                                this.f14757C.a((char) (i12 & 255));
                            }
                            z7 = true;
                        } else {
                            if (i12 <= 159) {
                                e[] eVarArr = this.f14756B;
                                switch (i12) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        str2 = str3;
                                        i9 = i9;
                                        iG = iG;
                                        z4 = true;
                                        int i13 = i12 - 128;
                                        if (this.f14761G != i13) {
                                            this.f14761G = i13;
                                            this.f14757C = eVarArr[i13];
                                        }
                                        break;
                                    case 136:
                                        str2 = str3;
                                        i9 = i9;
                                        iG = iG;
                                        z4 = true;
                                        for (int i14 = 1; i14 <= 8; i14++) {
                                            if (xVar3.h()) {
                                                e eVar = eVarArr[8 - i14];
                                                eVar.f14734a.clear();
                                                eVar.f14735b.clear();
                                                eVar.f14748p = -1;
                                                eVar.f14749q = -1;
                                                eVar.f14750r = -1;
                                                eVar.f14752t = -1;
                                                eVar.f14754v = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        str2 = str3;
                                        i9 = i9;
                                        iG = iG;
                                        for (int i15 = 1; i15 <= 8; i15++) {
                                            if (xVar3.h()) {
                                                eVarArr[8 - i15].f14737d = true;
                                            }
                                        }
                                        z4 = true;
                                        break;
                                    case 138:
                                        str2 = str3;
                                        i9 = i9;
                                        iG = iG;
                                        for (int i16 = 1; i16 <= 8; i16++) {
                                            if (xVar3.h()) {
                                                eVarArr[8 - i16].f14737d = false;
                                            }
                                        }
                                        z4 = true;
                                        break;
                                    case 139:
                                        str2 = str3;
                                        i9 = i9;
                                        iG = iG;
                                        for (int i17 = 1; i17 <= 8; i17++) {
                                            if (xVar3.h()) {
                                                e eVar2 = eVarArr[8 - i17];
                                                eVar2.f14737d = !eVar2.f14737d;
                                            }
                                        }
                                        z4 = true;
                                        break;
                                    case 140:
                                        str2 = str3;
                                        i9 = i9;
                                        iG = iG;
                                        for (int i18 = 1; i18 <= 8; i18++) {
                                            if (xVar3.h()) {
                                                eVarArr[8 - i18].d();
                                            }
                                        }
                                        z4 = true;
                                        break;
                                    case 141:
                                        str2 = str3;
                                        i9 = i9;
                                        iG = iG;
                                        xVar3.r(8);
                                        z4 = true;
                                        break;
                                    case 142:
                                        str2 = str3;
                                        i9 = i9;
                                        iG = iG;
                                        z4 = true;
                                        break;
                                    case 143:
                                        str2 = str3;
                                        i9 = i9;
                                        iG = iG;
                                        k();
                                        z4 = true;
                                        break;
                                    case 144:
                                        str2 = str3;
                                        iG = iG;
                                        if (this.f14757C.f14736c) {
                                            xVar3.i(4);
                                            xVar3.i(2);
                                            xVar3.i(2);
                                            boolean zH = xVar3.h();
                                            boolean zH2 = xVar3.h();
                                            i9 = 3;
                                            xVar3.i(3);
                                            xVar3.i(3);
                                            this.f14757C.e(zH, zH2);
                                        } else {
                                            xVar3.r(16);
                                            i9 = 3;
                                        }
                                        z4 = true;
                                        break;
                                    case 145:
                                        str2 = str3;
                                        iG = iG;
                                        if (this.f14757C.f14736c) {
                                            int iC = e.c(xVar3.i(2), xVar3.i(2), xVar3.i(2), xVar3.i(2));
                                            int iC2 = e.c(xVar3.i(2), xVar3.i(2), xVar3.i(2), xVar3.i(2));
                                            xVar3.r(2);
                                            e.c(xVar3.i(2), xVar3.i(2), xVar3.i(2), 0);
                                            this.f14757C.f(iC, iC2);
                                        } else {
                                            xVar3.r(24);
                                        }
                                        i9 = 3;
                                        z4 = true;
                                        break;
                                    case 146:
                                        str2 = str3;
                                        iG = iG;
                                        if (this.f14757C.f14736c) {
                                            xVar3.r(4);
                                            int i19 = xVar3.i(4);
                                            xVar3.r(2);
                                            xVar3.i(6);
                                            e eVar3 = this.f14757C;
                                            if (eVar3.f14754v != i19) {
                                                eVar3.a('\n');
                                            }
                                            eVar3.f14754v = i19;
                                        } else {
                                            xVar3.r(16);
                                        }
                                        i9 = 3;
                                        z4 = true;
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        p150v0.a.j(i12, "Invalid C1 command: ", str3);
                                        str2 = str3;
                                        i9 = i9;
                                        iG = iG;
                                        z4 = true;
                                        break;
                                    case 151:
                                        str2 = str3;
                                        iG = iG;
                                        if (this.f14757C.f14736c) {
                                            int iC3 = e.c(xVar3.i(2), xVar3.i(2), xVar3.i(2), xVar3.i(2));
                                            xVar3.i(2);
                                            e.c(xVar3.i(2), xVar3.i(2), xVar3.i(2), 0);
                                            xVar3.h();
                                            xVar3.h();
                                            xVar3.i(2);
                                            xVar3.i(2);
                                            int i20 = xVar3.i(2);
                                            xVar3.r(8);
                                            e eVar4 = this.f14757C;
                                            eVar4.f14747o = iC3;
                                            eVar4.f14744l = i20;
                                        } else {
                                            xVar3.r(32);
                                        }
                                        i9 = 3;
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
                                        int i21 = i12 - 152;
                                        e eVar5 = eVarArr[i21];
                                        xVar3.r(i7);
                                        boolean zH3 = xVar3.h();
                                        boolean zH4 = xVar3.h();
                                        xVar3.h();
                                        int i22 = xVar3.i(i9);
                                        boolean zH5 = xVar3.h();
                                        int i23 = xVar3.i(7);
                                        int i24 = xVar3.i(8);
                                        int i25 = xVar3.i(4);
                                        int i26 = xVar3.i(4);
                                        xVar3.r(i7);
                                        iG = iG;
                                        xVar3.i(6);
                                        xVar3.r(i7);
                                        int i27 = xVar3.i(3);
                                        str2 = str3;
                                        int i28 = xVar3.i(3);
                                        eVar5.f14736c = true;
                                        eVar5.f14737d = zH3;
                                        eVar5.f14743k = zH4;
                                        eVar5.f14738e = i22;
                                        eVar5.f14739f = zH5;
                                        eVar5.f14740g = i23;
                                        eVar5.f14741h = i24;
                                        eVar5.f14742i = i25;
                                        int i29 = i26 + 1;
                                        if (eVar5.j != i29) {
                                            eVar5.j = i29;
                                            while (true) {
                                                ArrayList arrayList = eVar5.f14734a;
                                                if ((zH4 && arrayList.size() >= eVar5.j) || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (i27 != 0 && eVar5.f14745m != i27) {
                                            eVar5.f14745m = i27;
                                            int i30 = i27 - 1;
                                            int i31 = e.f14726C[i30];
                                            boolean z8 = e.f14725B[i30];
                                            int i32 = e.f14733z[i30];
                                            int i33 = e.f14724A[i30];
                                            int i34 = e.f14732y[i30];
                                            eVar5.f14747o = i31;
                                            eVar5.f14744l = i34;
                                        }
                                        if (i28 != 0 && eVar5.f14746n != i28) {
                                            eVar5.f14746n = i28;
                                            int i35 = i28 - 1;
                                            int i36 = e.f14728E[i35];
                                            int i37 = e.f14727D[i35];
                                            eVar5.e(false, false);
                                            eVar5.f(e.f14730w, e.f14729F[i35]);
                                        }
                                        if (this.f14761G != i21) {
                                            this.f14761G = i21;
                                            this.f14757C = eVarArr[i21];
                                        }
                                        i9 = 3;
                                        z4 = true;
                                        break;
                                }
                            } else {
                                str2 = str3;
                                i9 = i9;
                                iG = iG;
                                z4 = true;
                                if (i12 <= 255) {
                                    this.f14757C.a((char) (i12 & 255));
                                } else {
                                    str = str2;
                                    p150v0.a.j(i12, "Invalid base command: ", str);
                                }
                                i7 = 2;
                                c3 = 7;
                            }
                            z7 = z4;
                            str = str2;
                            i7 = 2;
                            c3 = 7;
                        }
                        c3 = 7;
                        str = str3;
                        z4 = true;
                    } else {
                        i9 = i9;
                        iG = iG;
                        str = str3;
                        z4 = true;
                        int i38 = xVar3.i(8);
                        if (i38 <= 31) {
                            c3 = 7;
                            if (i38 > 7) {
                                if (i38 <= 15) {
                                    xVar3.r(8);
                                } else if (i38 <= 23) {
                                    xVar3.r(16);
                                } else if (i38 <= 31) {
                                    xVar3.r(24);
                                }
                            }
                        } else {
                            c3 = 7;
                            if (i38 <= 127) {
                                if (i38 == 32) {
                                    this.f14757C.a(' ');
                                } else if (i38 == 33) {
                                    this.f14757C.a((char) 160);
                                } else if (i38 == 37) {
                                    this.f14757C.a((char) 8230);
                                } else if (i38 == 42) {
                                    this.f14757C.a((char) 352);
                                } else if (i38 == 44) {
                                    this.f14757C.a((char) 338);
                                } else if (i38 == 63) {
                                    this.f14757C.a((char) 376);
                                } else if (i38 == 57) {
                                    this.f14757C.a((char) 8482);
                                } else if (i38 == 58) {
                                    this.f14757C.a((char) 353);
                                } else if (i38 == 60) {
                                    this.f14757C.a((char) 339);
                                } else if (i38 != 61) {
                                    switch (i38) {
                                        case 48:
                                            this.f14757C.a((char) 9608);
                                            break;
                                        case 49:
                                            this.f14757C.a((char) 8216);
                                            break;
                                        case 50:
                                            this.f14757C.a((char) 8217);
                                            break;
                                        case 51:
                                            this.f14757C.a((char) 8220);
                                            break;
                                        case 52:
                                            this.f14757C.a((char) 8221);
                                            break;
                                        case 53:
                                            this.f14757C.a((char) 8226);
                                            break;
                                        default:
                                            switch (i38) {
                                                case 118:
                                                    this.f14757C.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.f14757C.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.f14757C.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.f14757C.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.f14757C.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.f14757C.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.f14757C.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.f14757C.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.f14757C.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f14757C.a((char) 9484);
                                                    break;
                                                default:
                                                    p150v0.a.j(i38, "Invalid G2 character: ", str);
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.f14757C.a((char) 8480);
                                }
                                z7 = true;
                            } else if (i38 > 159) {
                                i7 = 2;
                                if (i38 <= 255) {
                                    if (i38 == 160) {
                                        this.f14757C.a((char) 13252);
                                    } else {
                                        p150v0.a.j(i38, "Invalid G3 character: ", str);
                                        this.f14757C.a('_');
                                    }
                                    z7 = true;
                                } else {
                                    p150v0.a.j(i38, "Invalid extended command: ", str);
                                }
                            } else if (i38 <= 135) {
                                xVar3.r(32);
                            } else if (i38 <= 143) {
                                xVar3.r(40);
                            } else if (i38 <= 159) {
                                i7 = 2;
                                xVar3.r(2);
                                xVar3.r(xVar3.i(6) * 8);
                            }
                        }
                        i7 = 2;
                    }
                    i9 = i9;
                    str3 = str;
                    iG = iG;
                    i7 = i7;
                }
            }
        }
        if (z7) {
            this.f14758D = j();
        }
        this.f14760F = null;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ea  */
    public final List j() {
        d dVar;
        Layout.Alignment alignment;
        float f7;
        float f8;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < 8; i7++) {
            e[] eVarArr = this.f14756B;
            e eVar = eVarArr[i7];
            if (eVar.f14736c && (!eVar.f14734a.isEmpty() || eVar.f14735b.length() != 0)) {
                e eVar2 = eVarArr[i7];
                if (eVar2.f14737d) {
                    if (eVar2.f14736c) {
                        ArrayList arrayList2 = eVar2.f14734a;
                        if (arrayList2.isEmpty() && eVar2.f14735b.length() == 0) {
                            dVar = null;
                        } else {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                                spannableStringBuilder.append((CharSequence) arrayList2.get(i8));
                                spannableStringBuilder.append('\n');
                            }
                            spannableStringBuilder.append((CharSequence) eVar2.b());
                            int i9 = eVar2.f14744l;
                            if (i9 == 0) {
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            } else if (i9 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i9 != 2) {
                                if (i9 != 3) {
                                    throw new IllegalArgumentException("Unexpected justification value: " + eVar2.f14744l);
                                }
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            } else {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            }
                            Layout.Alignment alignment2 = alignment;
                            if (eVar2.f14739f) {
                                f7 = eVar2.f14741h / 99.0f;
                                f8 = eVar2.f14740g / 99.0f;
                            } else {
                                f7 = eVar2.f14741h / 209.0f;
                                f8 = eVar2.f14740g / 74.0f;
                            }
                            float f9 = (f7 * 0.9f) + 0.05f;
                            float f10 = (f8 * 0.9f) + 0.05f;
                            int i10 = eVar2.f14742i;
                            int i11 = i10 / 3;
                            int i12 = i11 == 0 ? 0 : i11 == 1 ? 1 : 2;
                            int i13 = i10 % 3;
                            int i14 = i13 == 0 ? 0 : i13 == 1 ? 1 : 2;
                            int i15 = eVar2.f14747o;
                            dVar = new d(spannableStringBuilder, alignment2, f10, i12, f9, i14, i15 != e.f14731x, i15, eVar2.f14738e);
                        }
                    } else {
                        dVar = null;
                    }
                    if (dVar != null) {
                        arrayList.add(dVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, d.f14721c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            arrayList3.add(((d) arrayList.get(i16)).f14722a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void k() {
        for (int i7 = 0; i7 < 8; i7++) {
            this.f14756B[i7].d();
        }
    }
}
