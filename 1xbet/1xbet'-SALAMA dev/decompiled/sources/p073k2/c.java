package p073k2;

import C1.C0095a;
import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p068j2.b;
import p068j2.d;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int[] f14695P = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int[] f14696Q = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int[] f14697R = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int[] f14698S = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final int[] f14699T = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int[] f14700U = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final int[] f14701V = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final boolean[] f14702W = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f14703A;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public List f14707E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public List f14708F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f14709G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f14710H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f14711I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f14712J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public byte f14713K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public byte f14714L;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f14716N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long f14717O;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f14719y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f14720z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0095a f14718x = new C0095a(4, false);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ArrayList f14705C = new ArrayList();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public b f14706D = new b(0, 4);

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f14715M = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final long f14704B = 16000000;

    public c(String str, int i7) {
        this.f14719y = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i7 == 1) {
            this.f14703A = 0;
            this.f14720z = 0;
        } else if (i7 == 2) {
            this.f14703A = 1;
            this.f14720z = 0;
        } else if (i7 == 3) {
            this.f14703A = 0;
            this.f14720z = 1;
        } else if (i7 != 4) {
            Log.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f14703A = 0;
            this.f14720z = 0;
        } else {
            this.f14703A = 1;
            this.f14720z = 1;
        }
        k(0);
        j();
        this.f14716N = true;
        this.f14717O = -9223372036854775807L;
    }

    @Override // p073k2.h
    public final R4.c e() {
        List list = this.f14707E;
        this.f14708F = list;
        list.getClass();
        return new R4.c(list, 19);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x019b  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:133:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:134:0x01be  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01db  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:148:0x0208 A[LOOP:1: B:146:0x0202->B:148:0x0208, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x020c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0216 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0218  */
    /* JADX WARN: Code duplicated, block: B:153:0x021d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0224  */
    /* JADX WARN: Code duplicated, block: B:155:0x022f  */
    /* JADX WARN: Code duplicated, block: B:156:0x023a  */
    /* JADX WARN: Code duplicated, block: B:157:0x0245  */
    /* JADX WARN: Code duplicated, block: B:158:0x024a  */
    /* JADX WARN: Code duplicated, block: B:159:0x024f  */
    /* JADX WARN: Code duplicated, block: B:161:0x0260  */
    /* JADX WARN: Code duplicated, block: B:179:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0103  */
    /* JADX WARN: Code duplicated, block: B:91:0x012b  */
    /* JADX WARN: Code duplicated, block: B:93:0x012f  */
    @Override // p073k2.h
    public final void f(g gVar) {
        boolean z4;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        int i10;
        int i11;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = gVar.f1697d;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C0095a c0095a = this.f14718x;
        c0095a.B(iLimit, bArrArray);
        boolean z7 = false;
        while (true) {
            int iD = c0095a.d();
            int i12 = this.f14719y;
            if (iD < i12) {
                if (z7) {
                    int i13 = this.f14709G;
                    if (i13 == 1 || i13 == 3) {
                        this.f14707E = i();
                        this.f14717O = this.f14770e;
                        return;
                    }
                    return;
                }
                return;
            }
            byte bT = i12 == 2 ? (byte) -4 : (byte) c0095a.t();
            int iT = c0095a.t();
            int iT2 = c0095a.t();
            if ((bT & 2) == 0 && (bT & 1) == this.f14720z) {
                byte b7 = (byte) (iT & 127);
                byte b8 = (byte) (iT2 & 127);
                if (b7 != 0 || b8 != 0) {
                    boolean z8 = this.f14711I;
                    if ((bT & 4) == 4) {
                        boolean[] zArr = f14702W;
                        if (zArr[iT] && zArr[iT2]) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } else {
                        z4 = false;
                    }
                    this.f14711I = z4;
                    if (!z4 || (b7 & 240) != 16) {
                        this.f14712J = false;
                        if (!z4) {
                            if (1 > b7 && b7 <= 15) {
                                this.f14716N = false;
                            } else if ((b7 & 247) == 20) {
                                if (b8 == 32 && b8 != 47) {
                                    switch (b8) {
                                        default:
                                            switch (b8) {
                                                case 42:
                                                case 43:
                                                    this.f14716N = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.f14716N = true;
                                            break;
                                    }
                                } else {
                                    this.f14716N = true;
                                }
                            }
                            if (this.f14716N) {
                                i7 = b7 & 224;
                                if (i7 == 0) {
                                    this.f14715M = (b7 >> 3) & 1;
                                }
                                if (this.f14715M != this.f14703A) {
                                    if (i7 == 0) {
                                        i8 = b7 & 247;
                                        if (i8 == 17 || (b8 & 240) != 48) {
                                            i9 = b7 & 246;
                                            if (i9 != 18 && (b8 & 224) == 32) {
                                                this.f14706D.b();
                                                this.f14706D.a((char) ((b7 & 1) == 0 ? f14700U[b8 & 31] : f14701V[b8 & 31]));
                                            } else if (i8 != 17 && (b8 & 240) == 32) {
                                                this.f14706D.a(' ');
                                                boolean z9 = (b8 & 1) == 1;
                                                b bVar = this.f14706D;
                                                bVar.f14687a.add(new a((b8 >> 1) & 7, z9, bVar.f14689c.length()));
                                            } else if ((b7 & 240) != 16 && (b8 & 192) == 64) {
                                                int i14 = f14695P[b7 & 7];
                                                if ((b8 & 32) != 0) {
                                                    i14++;
                                                }
                                                b bVar2 = this.f14706D;
                                                if (i14 != bVar2.f14690d) {
                                                    if (this.f14709G != 1 && !bVar2.e()) {
                                                        b bVar3 = new b(this.f14709G, this.f14710H);
                                                        this.f14706D = bVar3;
                                                        this.f14705C.add(bVar3);
                                                    }
                                                    this.f14706D.f14690d = i14;
                                                }
                                                boolean z10 = (b8 & 16) == 16;
                                                boolean z11 = (b8 & 1) == 1;
                                                int i15 = (b8 >> 1) & 7;
                                                b bVar4 = this.f14706D;
                                                bVar4.f14687a.add(new a(z10 ? 8 : i15, z11, bVar4.f14689c.length()));
                                                if (z10) {
                                                    this.f14706D.f14691e = f14696Q[i15];
                                                }
                                            } else if (i8 != 23 && b8 >= 33 && b8 <= 35) {
                                                this.f14706D.f14692f = b8 - 32;
                                            } else if (i9 == 20 && (b8 & 240) == 32) {
                                                if (b8 == 32) {
                                                    k(2);
                                                } else if (b8 != 41) {
                                                    switch (b8) {
                                                        case 37:
                                                            k(1);
                                                            this.f14710H = 2;
                                                            this.f14706D.f14694h = 2;
                                                            break;
                                                        case 38:
                                                            k(1);
                                                            this.f14710H = 3;
                                                            this.f14706D.f14694h = 3;
                                                            break;
                                                        case 39:
                                                            k(1);
                                                            this.f14710H = 4;
                                                            this.f14706D.f14694h = 4;
                                                            break;
                                                        default:
                                                            i10 = this.f14709G;
                                                            if (i10 != 0) {
                                                                if (b8 != 33) {
                                                                    switch (b8) {
                                                                        case 44:
                                                                            this.f14707E = Collections.emptyList();
                                                                            i11 = this.f14709G;
                                                                            if (i11 != 1 || i11 == 3) {
                                                                                j();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i10 == 1 && !this.f14706D.e()) {
                                                                                b bVar5 = this.f14706D;
                                                                                arrayList = bVar5.f14688b;
                                                                                arrayList.add(bVar5.d());
                                                                                bVar5.f14689c.setLength(0);
                                                                                bVar5.f14687a.clear();
                                                                                iMin = Math.min(bVar5.f14694h, bVar5.f14690d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            j();
                                                                            break;
                                                                        case 47:
                                                                            this.f14707E = i();
                                                                            j();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f14706D.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    k(3);
                                                }
                                            }
                                        } else {
                                            this.f14706D.a((char) f14699T[b8 & 15]);
                                        }
                                    } else {
                                        b bVar6 = this.f14706D;
                                        iArr = f14698S;
                                        bVar6.a((char) iArr[(b7 & 127) - 32]);
                                        if ((b8 & 224) != 0) {
                                            this.f14706D.a((char) iArr[(b8 & 127) - 32]);
                                        }
                                    }
                                    z7 = true;
                                }
                            }
                        } else if (z8) {
                            j();
                            z7 = true;
                        }
                    } else if (this.f14712J && this.f14713K == b7 && this.f14714L == b8) {
                        this.f14712J = false;
                    } else {
                        this.f14712J = true;
                        this.f14713K = b7;
                        this.f14714L = b8;
                        if (!z4) {
                            if (1 > b7) {
                                if ((b7 & 247) == 20) {
                                    if (b8 == 32) {
                                        this.f14716N = true;
                                    } else {
                                        this.f14716N = true;
                                    }
                                }
                            } else if ((b7 & 247) == 20) {
                                if (b8 == 32) {
                                    this.f14716N = true;
                                } else {
                                    this.f14716N = true;
                                }
                            }
                            if (this.f14716N) {
                                i7 = b7 & 224;
                                if (i7 == 0) {
                                    this.f14715M = (b7 >> 3) & 1;
                                }
                                if (this.f14715M != this.f14703A) {
                                    if (i7 == 0) {
                                        i8 = b7 & 247;
                                        if (i8 == 17) {
                                            i9 = b7 & 246;
                                            if (i9 != 18) {
                                                if (i8 != 17) {
                                                    if ((b7 & 240) != 16) {
                                                        if (i8 != 23) {
                                                            if (i9 == 20) {
                                                                if (b8 == 32) {
                                                                    k(2);
                                                                } else if (b8 != 41) {
                                                                    switch (b8) {
                                                                        case 37:
                                                                            k(1);
                                                                            this.f14710H = 2;
                                                                            this.f14706D.f14694h = 2;
                                                                            break;
                                                                        case 38:
                                                                            k(1);
                                                                            this.f14710H = 3;
                                                                            this.f14706D.f14694h = 3;
                                                                            break;
                                                                        case 39:
                                                                            k(1);
                                                                            this.f14710H = 4;
                                                                            this.f14706D.f14694h = 4;
                                                                            break;
                                                                        default:
                                                                            i10 = this.f14709G;
                                                                            if (i10 != 0) {
                                                                                if (b8 != 33) {
                                                                                    switch (b8) {
                                                                                        case 44:
                                                                                            this.f14707E = Collections.emptyList();
                                                                                            i11 = this.f14709G;
                                                                                            if (i11 != 1) {
                                                                                                j();
                                                                                            } else {
                                                                                                j();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i10 == 1) {
                                                                                                b bVar7 = this.f14706D;
                                                                                                arrayList = bVar7.f14688b;
                                                                                                arrayList.add(bVar7.d());
                                                                                                bVar7.f14689c.setLength(0);
                                                                                                bVar7.f14687a.clear();
                                                                                                iMin = Math.min(bVar7.f14694h, bVar7.f14690d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            j();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f14707E = i();
                                                                                            j();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f14706D.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    k(3);
                                                                }
                                                            }
                                                        } else if (i9 == 20) {
                                                            if (b8 == 32) {
                                                                k(2);
                                                            } else if (b8 != 41) {
                                                                switch (b8) {
                                                                    case 37:
                                                                        k(1);
                                                                        this.f14710H = 2;
                                                                        this.f14706D.f14694h = 2;
                                                                        break;
                                                                    case 38:
                                                                        k(1);
                                                                        this.f14710H = 3;
                                                                        this.f14706D.f14694h = 3;
                                                                        break;
                                                                    case 39:
                                                                        k(1);
                                                                        this.f14710H = 4;
                                                                        this.f14706D.f14694h = 4;
                                                                        break;
                                                                    default:
                                                                        i10 = this.f14709G;
                                                                        if (i10 != 0) {
                                                                            if (b8 != 33) {
                                                                                switch (b8) {
                                                                                    case 44:
                                                                                        this.f14707E = Collections.emptyList();
                                                                                        i11 = this.f14709G;
                                                                                        if (i11 != 1) {
                                                                                            j();
                                                                                        } else {
                                                                                            j();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i10 == 1) {
                                                                                            b bVar8 = this.f14706D;
                                                                                            arrayList = bVar8.f14688b;
                                                                                            arrayList.add(bVar8.d());
                                                                                            bVar8.f14689c.setLength(0);
                                                                                            bVar8.f14687a.clear();
                                                                                            iMin = Math.min(bVar8.f14694h, bVar8.f14690d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        j();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f14707E = i();
                                                                                        j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f14706D.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                k(3);
                                                            }
                                                        }
                                                    } else if (i8 != 23) {
                                                        if (i9 == 20) {
                                                            if (b8 == 32) {
                                                                k(2);
                                                            } else if (b8 != 41) {
                                                                switch (b8) {
                                                                    case 37:
                                                                        k(1);
                                                                        this.f14710H = 2;
                                                                        this.f14706D.f14694h = 2;
                                                                        break;
                                                                    case 38:
                                                                        k(1);
                                                                        this.f14710H = 3;
                                                                        this.f14706D.f14694h = 3;
                                                                        break;
                                                                    case 39:
                                                                        k(1);
                                                                        this.f14710H = 4;
                                                                        this.f14706D.f14694h = 4;
                                                                        break;
                                                                    default:
                                                                        i10 = this.f14709G;
                                                                        if (i10 != 0) {
                                                                            if (b8 != 33) {
                                                                                switch (b8) {
                                                                                    case 44:
                                                                                        this.f14707E = Collections.emptyList();
                                                                                        i11 = this.f14709G;
                                                                                        if (i11 != 1) {
                                                                                            j();
                                                                                        } else {
                                                                                            j();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i10 == 1) {
                                                                                            b bVar9 = this.f14706D;
                                                                                            arrayList = bVar9.f14688b;
                                                                                            arrayList.add(bVar9.d());
                                                                                            bVar9.f14689c.setLength(0);
                                                                                            bVar9.f14687a.clear();
                                                                                            iMin = Math.min(bVar9.f14694h, bVar9.f14690d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        j();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f14707E = i();
                                                                                        j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f14706D.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                k(3);
                                                            }
                                                        }
                                                    } else if (i9 == 20) {
                                                        if (b8 == 32) {
                                                            k(2);
                                                        } else if (b8 != 41) {
                                                            switch (b8) {
                                                                case 37:
                                                                    k(1);
                                                                    this.f14710H = 2;
                                                                    this.f14706D.f14694h = 2;
                                                                    break;
                                                                case 38:
                                                                    k(1);
                                                                    this.f14710H = 3;
                                                                    this.f14706D.f14694h = 3;
                                                                    break;
                                                                case 39:
                                                                    k(1);
                                                                    this.f14710H = 4;
                                                                    this.f14706D.f14694h = 4;
                                                                    break;
                                                                default:
                                                                    i10 = this.f14709G;
                                                                    if (i10 != 0) {
                                                                        if (b8 != 33) {
                                                                            switch (b8) {
                                                                                case 44:
                                                                                    this.f14707E = Collections.emptyList();
                                                                                    i11 = this.f14709G;
                                                                                    if (i11 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i10 == 1) {
                                                                                        b bVar10 = this.f14706D;
                                                                                        arrayList = bVar10.f14688b;
                                                                                        arrayList.add(bVar10.d());
                                                                                        bVar10.f14689c.setLength(0);
                                                                                        bVar10.f14687a.clear();
                                                                                        iMin = Math.min(bVar10.f14694h, bVar10.f14690d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f14707E = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f14706D.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if ((b7 & 240) != 16) {
                                                    if (i8 != 23) {
                                                        if (i9 == 20) {
                                                            if (b8 == 32) {
                                                                k(2);
                                                            } else if (b8 != 41) {
                                                                switch (b8) {
                                                                    case 37:
                                                                        k(1);
                                                                        this.f14710H = 2;
                                                                        this.f14706D.f14694h = 2;
                                                                        break;
                                                                    case 38:
                                                                        k(1);
                                                                        this.f14710H = 3;
                                                                        this.f14706D.f14694h = 3;
                                                                        break;
                                                                    case 39:
                                                                        k(1);
                                                                        this.f14710H = 4;
                                                                        this.f14706D.f14694h = 4;
                                                                        break;
                                                                    default:
                                                                        i10 = this.f14709G;
                                                                        if (i10 != 0) {
                                                                            if (b8 != 33) {
                                                                                switch (b8) {
                                                                                    case 44:
                                                                                        this.f14707E = Collections.emptyList();
                                                                                        i11 = this.f14709G;
                                                                                        if (i11 != 1) {
                                                                                            j();
                                                                                        } else {
                                                                                            j();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i10 == 1) {
                                                                                            b bVar11 = this.f14706D;
                                                                                            arrayList = bVar11.f14688b;
                                                                                            arrayList.add(bVar11.d());
                                                                                            bVar11.f14689c.setLength(0);
                                                                                            bVar11.f14687a.clear();
                                                                                            iMin = Math.min(bVar11.f14694h, bVar11.f14690d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        j();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f14707E = i();
                                                                                        j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f14706D.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                k(3);
                                                            }
                                                        }
                                                    } else if (i9 == 20) {
                                                        if (b8 == 32) {
                                                            k(2);
                                                        } else if (b8 != 41) {
                                                            switch (b8) {
                                                                case 37:
                                                                    k(1);
                                                                    this.f14710H = 2;
                                                                    this.f14706D.f14694h = 2;
                                                                    break;
                                                                case 38:
                                                                    k(1);
                                                                    this.f14710H = 3;
                                                                    this.f14706D.f14694h = 3;
                                                                    break;
                                                                case 39:
                                                                    k(1);
                                                                    this.f14710H = 4;
                                                                    this.f14706D.f14694h = 4;
                                                                    break;
                                                                default:
                                                                    i10 = this.f14709G;
                                                                    if (i10 != 0) {
                                                                        if (b8 != 33) {
                                                                            switch (b8) {
                                                                                case 44:
                                                                                    this.f14707E = Collections.emptyList();
                                                                                    i11 = this.f14709G;
                                                                                    if (i11 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i10 == 1) {
                                                                                        b bVar12 = this.f14706D;
                                                                                        arrayList = bVar12.f14688b;
                                                                                        arrayList.add(bVar12.d());
                                                                                        bVar12.f14689c.setLength(0);
                                                                                        bVar12.f14687a.clear();
                                                                                        iMin = Math.min(bVar12.f14694h, bVar12.f14690d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f14707E = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f14706D.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if (i8 != 23) {
                                                    if (i9 == 20) {
                                                        if (b8 == 32) {
                                                            k(2);
                                                        } else if (b8 != 41) {
                                                            switch (b8) {
                                                                case 37:
                                                                    k(1);
                                                                    this.f14710H = 2;
                                                                    this.f14706D.f14694h = 2;
                                                                    break;
                                                                case 38:
                                                                    k(1);
                                                                    this.f14710H = 3;
                                                                    this.f14706D.f14694h = 3;
                                                                    break;
                                                                case 39:
                                                                    k(1);
                                                                    this.f14710H = 4;
                                                                    this.f14706D.f14694h = 4;
                                                                    break;
                                                                default:
                                                                    i10 = this.f14709G;
                                                                    if (i10 != 0) {
                                                                        if (b8 != 33) {
                                                                            switch (b8) {
                                                                                case 44:
                                                                                    this.f14707E = Collections.emptyList();
                                                                                    i11 = this.f14709G;
                                                                                    if (i11 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i10 == 1) {
                                                                                        b bVar13 = this.f14706D;
                                                                                        arrayList = bVar13.f14688b;
                                                                                        arrayList.add(bVar13.d());
                                                                                        bVar13.f14689c.setLength(0);
                                                                                        bVar13.f14687a.clear();
                                                                                        iMin = Math.min(bVar13.f14694h, bVar13.f14690d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f14707E = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f14706D.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if (i9 == 20) {
                                                    if (b8 == 32) {
                                                        k(2);
                                                    } else if (b8 != 41) {
                                                        switch (b8) {
                                                            case 37:
                                                                k(1);
                                                                this.f14710H = 2;
                                                                this.f14706D.f14694h = 2;
                                                                break;
                                                            case 38:
                                                                k(1);
                                                                this.f14710H = 3;
                                                                this.f14706D.f14694h = 3;
                                                                break;
                                                            case 39:
                                                                k(1);
                                                                this.f14710H = 4;
                                                                this.f14706D.f14694h = 4;
                                                                break;
                                                            default:
                                                                i10 = this.f14709G;
                                                                if (i10 != 0) {
                                                                    if (b8 != 33) {
                                                                        switch (b8) {
                                                                            case 44:
                                                                                this.f14707E = Collections.emptyList();
                                                                                i11 = this.f14709G;
                                                                                if (i11 != 1) {
                                                                                    j();
                                                                                } else {
                                                                                    j();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i10 == 1) {
                                                                                    b bVar14 = this.f14706D;
                                                                                    arrayList = bVar14.f14688b;
                                                                                    arrayList.add(bVar14.d());
                                                                                    bVar14.f14689c.setLength(0);
                                                                                    bVar14.f14687a.clear();
                                                                                    iMin = Math.min(bVar14.f14694h, bVar14.f14690d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                j();
                                                                                break;
                                                                            case 47:
                                                                                this.f14707E = i();
                                                                                j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f14706D.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        k(3);
                                                    }
                                                }
                                            } else if (i8 != 17) {
                                                if ((b7 & 240) != 16) {
                                                    if (i8 != 23) {
                                                        if (i9 == 20) {
                                                            if (b8 == 32) {
                                                                k(2);
                                                            } else if (b8 != 41) {
                                                                switch (b8) {
                                                                    case 37:
                                                                        k(1);
                                                                        this.f14710H = 2;
                                                                        this.f14706D.f14694h = 2;
                                                                        break;
                                                                    case 38:
                                                                        k(1);
                                                                        this.f14710H = 3;
                                                                        this.f14706D.f14694h = 3;
                                                                        break;
                                                                    case 39:
                                                                        k(1);
                                                                        this.f14710H = 4;
                                                                        this.f14706D.f14694h = 4;
                                                                        break;
                                                                    default:
                                                                        i10 = this.f14709G;
                                                                        if (i10 != 0) {
                                                                            if (b8 != 33) {
                                                                                switch (b8) {
                                                                                    case 44:
                                                                                        this.f14707E = Collections.emptyList();
                                                                                        i11 = this.f14709G;
                                                                                        if (i11 != 1) {
                                                                                            j();
                                                                                        } else {
                                                                                            j();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i10 == 1) {
                                                                                            b bVar15 = this.f14706D;
                                                                                            arrayList = bVar15.f14688b;
                                                                                            arrayList.add(bVar15.d());
                                                                                            bVar15.f14689c.setLength(0);
                                                                                            bVar15.f14687a.clear();
                                                                                            iMin = Math.min(bVar15.f14694h, bVar15.f14690d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        j();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f14707E = i();
                                                                                        j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f14706D.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                k(3);
                                                            }
                                                        }
                                                    } else if (i9 == 20) {
                                                        if (b8 == 32) {
                                                            k(2);
                                                        } else if (b8 != 41) {
                                                            switch (b8) {
                                                                case 37:
                                                                    k(1);
                                                                    this.f14710H = 2;
                                                                    this.f14706D.f14694h = 2;
                                                                    break;
                                                                case 38:
                                                                    k(1);
                                                                    this.f14710H = 3;
                                                                    this.f14706D.f14694h = 3;
                                                                    break;
                                                                case 39:
                                                                    k(1);
                                                                    this.f14710H = 4;
                                                                    this.f14706D.f14694h = 4;
                                                                    break;
                                                                default:
                                                                    i10 = this.f14709G;
                                                                    if (i10 != 0) {
                                                                        if (b8 != 33) {
                                                                            switch (b8) {
                                                                                case 44:
                                                                                    this.f14707E = Collections.emptyList();
                                                                                    i11 = this.f14709G;
                                                                                    if (i11 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i10 == 1) {
                                                                                        b bVar16 = this.f14706D;
                                                                                        arrayList = bVar16.f14688b;
                                                                                        arrayList.add(bVar16.d());
                                                                                        bVar16.f14689c.setLength(0);
                                                                                        bVar16.f14687a.clear();
                                                                                        iMin = Math.min(bVar16.f14694h, bVar16.f14690d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f14707E = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f14706D.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if (i8 != 23) {
                                                    if (i9 == 20) {
                                                        if (b8 == 32) {
                                                            k(2);
                                                        } else if (b8 != 41) {
                                                            switch (b8) {
                                                                case 37:
                                                                    k(1);
                                                                    this.f14710H = 2;
                                                                    this.f14706D.f14694h = 2;
                                                                    break;
                                                                case 38:
                                                                    k(1);
                                                                    this.f14710H = 3;
                                                                    this.f14706D.f14694h = 3;
                                                                    break;
                                                                case 39:
                                                                    k(1);
                                                                    this.f14710H = 4;
                                                                    this.f14706D.f14694h = 4;
                                                                    break;
                                                                default:
                                                                    i10 = this.f14709G;
                                                                    if (i10 != 0) {
                                                                        if (b8 != 33) {
                                                                            switch (b8) {
                                                                                case 44:
                                                                                    this.f14707E = Collections.emptyList();
                                                                                    i11 = this.f14709G;
                                                                                    if (i11 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i10 == 1) {
                                                                                        b bVar17 = this.f14706D;
                                                                                        arrayList = bVar17.f14688b;
                                                                                        arrayList.add(bVar17.d());
                                                                                        bVar17.f14689c.setLength(0);
                                                                                        bVar17.f14687a.clear();
                                                                                        iMin = Math.min(bVar17.f14694h, bVar17.f14690d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f14707E = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f14706D.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if (i9 == 20) {
                                                    if (b8 == 32) {
                                                        k(2);
                                                    } else if (b8 != 41) {
                                                        switch (b8) {
                                                            case 37:
                                                                k(1);
                                                                this.f14710H = 2;
                                                                this.f14706D.f14694h = 2;
                                                                break;
                                                            case 38:
                                                                k(1);
                                                                this.f14710H = 3;
                                                                this.f14706D.f14694h = 3;
                                                                break;
                                                            case 39:
                                                                k(1);
                                                                this.f14710H = 4;
                                                                this.f14706D.f14694h = 4;
                                                                break;
                                                            default:
                                                                i10 = this.f14709G;
                                                                if (i10 != 0) {
                                                                    if (b8 != 33) {
                                                                        switch (b8) {
                                                                            case 44:
                                                                                this.f14707E = Collections.emptyList();
                                                                                i11 = this.f14709G;
                                                                                if (i11 != 1) {
                                                                                    j();
                                                                                } else {
                                                                                    j();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i10 == 1) {
                                                                                    b bVar18 = this.f14706D;
                                                                                    arrayList = bVar18.f14688b;
                                                                                    arrayList.add(bVar18.d());
                                                                                    bVar18.f14689c.setLength(0);
                                                                                    bVar18.f14687a.clear();
                                                                                    iMin = Math.min(bVar18.f14694h, bVar18.f14690d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                j();
                                                                                break;
                                                                            case 47:
                                                                                this.f14707E = i();
                                                                                j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f14706D.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        k(3);
                                                    }
                                                }
                                            } else if ((b7 & 240) != 16) {
                                                if (i8 != 23) {
                                                    if (i9 == 20) {
                                                        if (b8 == 32) {
                                                            k(2);
                                                        } else if (b8 != 41) {
                                                            switch (b8) {
                                                                case 37:
                                                                    k(1);
                                                                    this.f14710H = 2;
                                                                    this.f14706D.f14694h = 2;
                                                                    break;
                                                                case 38:
                                                                    k(1);
                                                                    this.f14710H = 3;
                                                                    this.f14706D.f14694h = 3;
                                                                    break;
                                                                case 39:
                                                                    k(1);
                                                                    this.f14710H = 4;
                                                                    this.f14706D.f14694h = 4;
                                                                    break;
                                                                default:
                                                                    i10 = this.f14709G;
                                                                    if (i10 != 0) {
                                                                        if (b8 != 33) {
                                                                            switch (b8) {
                                                                                case 44:
                                                                                    this.f14707E = Collections.emptyList();
                                                                                    i11 = this.f14709G;
                                                                                    if (i11 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i10 == 1) {
                                                                                        b bVar19 = this.f14706D;
                                                                                        arrayList = bVar19.f14688b;
                                                                                        arrayList.add(bVar19.d());
                                                                                        bVar19.f14689c.setLength(0);
                                                                                        bVar19.f14687a.clear();
                                                                                        iMin = Math.min(bVar19.f14694h, bVar19.f14690d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f14707E = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f14706D.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if (i9 == 20) {
                                                    if (b8 == 32) {
                                                        k(2);
                                                    } else if (b8 != 41) {
                                                        switch (b8) {
                                                            case 37:
                                                                k(1);
                                                                this.f14710H = 2;
                                                                this.f14706D.f14694h = 2;
                                                                break;
                                                            case 38:
                                                                k(1);
                                                                this.f14710H = 3;
                                                                this.f14706D.f14694h = 3;
                                                                break;
                                                            case 39:
                                                                k(1);
                                                                this.f14710H = 4;
                                                                this.f14706D.f14694h = 4;
                                                                break;
                                                            default:
                                                                i10 = this.f14709G;
                                                                if (i10 != 0) {
                                                                    if (b8 != 33) {
                                                                        switch (b8) {
                                                                            case 44:
                                                                                this.f14707E = Collections.emptyList();
                                                                                i11 = this.f14709G;
                                                                                if (i11 != 1) {
                                                                                    j();
                                                                                } else {
                                                                                    j();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i10 == 1) {
                                                                                    b bVar110 = this.f14706D;
                                                                                    arrayList = bVar110.f14688b;
                                                                                    arrayList.add(bVar110.d());
                                                                                    bVar110.f14689c.setLength(0);
                                                                                    bVar110.f14687a.clear();
                                                                                    iMin = Math.min(bVar110.f14694h, bVar110.f14690d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                j();
                                                                                break;
                                                                            case 47:
                                                                                this.f14707E = i();
                                                                                j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f14706D.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        k(3);
                                                    }
                                                }
                                            } else if (i8 != 23) {
                                                if (i9 == 20) {
                                                    if (b8 == 32) {
                                                        k(2);
                                                    } else if (b8 != 41) {
                                                        switch (b8) {
                                                            case 37:
                                                                k(1);
                                                                this.f14710H = 2;
                                                                this.f14706D.f14694h = 2;
                                                                break;
                                                            case 38:
                                                                k(1);
                                                                this.f14710H = 3;
                                                                this.f14706D.f14694h = 3;
                                                                break;
                                                            case 39:
                                                                k(1);
                                                                this.f14710H = 4;
                                                                this.f14706D.f14694h = 4;
                                                                break;
                                                            default:
                                                                i10 = this.f14709G;
                                                                if (i10 != 0) {
                                                                    if (b8 != 33) {
                                                                        switch (b8) {
                                                                            case 44:
                                                                                this.f14707E = Collections.emptyList();
                                                                                i11 = this.f14709G;
                                                                                if (i11 != 1) {
                                                                                    j();
                                                                                } else {
                                                                                    j();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i10 == 1) {
                                                                                    b bVar111 = this.f14706D;
                                                                                    arrayList = bVar111.f14688b;
                                                                                    arrayList.add(bVar111.d());
                                                                                    bVar111.f14689c.setLength(0);
                                                                                    bVar111.f14687a.clear();
                                                                                    iMin = Math.min(bVar111.f14694h, bVar111.f14690d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                j();
                                                                                break;
                                                                            case 47:
                                                                                this.f14707E = i();
                                                                                j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f14706D.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        k(3);
                                                    }
                                                }
                                            } else if (i9 == 20) {
                                                if (b8 == 32) {
                                                    k(2);
                                                } else if (b8 != 41) {
                                                    switch (b8) {
                                                        case 37:
                                                            k(1);
                                                            this.f14710H = 2;
                                                            this.f14706D.f14694h = 2;
                                                            break;
                                                        case 38:
                                                            k(1);
                                                            this.f14710H = 3;
                                                            this.f14706D.f14694h = 3;
                                                            break;
                                                        case 39:
                                                            k(1);
                                                            this.f14710H = 4;
                                                            this.f14706D.f14694h = 4;
                                                            break;
                                                        default:
                                                            i10 = this.f14709G;
                                                            if (i10 != 0) {
                                                                if (b8 != 33) {
                                                                    switch (b8) {
                                                                        case 44:
                                                                            this.f14707E = Collections.emptyList();
                                                                            i11 = this.f14709G;
                                                                            if (i11 != 1) {
                                                                                j();
                                                                            } else {
                                                                                j();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i10 == 1) {
                                                                                b bVar112 = this.f14706D;
                                                                                arrayList = bVar112.f14688b;
                                                                                arrayList.add(bVar112.d());
                                                                                bVar112.f14689c.setLength(0);
                                                                                bVar112.f14687a.clear();
                                                                                iMin = Math.min(bVar112.f14694h, bVar112.f14690d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            j();
                                                                            break;
                                                                        case 47:
                                                                            this.f14707E = i();
                                                                            j();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f14706D.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    k(3);
                                                }
                                            }
                                        } else {
                                            i9 = b7 & 246;
                                            if (i9 != 18) {
                                                if (i8 != 17) {
                                                    if ((b7 & 240) != 16) {
                                                        if (i8 != 23) {
                                                            if (i9 == 20) {
                                                                if (b8 == 32) {
                                                                    k(2);
                                                                } else if (b8 != 41) {
                                                                    switch (b8) {
                                                                        case 37:
                                                                            k(1);
                                                                            this.f14710H = 2;
                                                                            this.f14706D.f14694h = 2;
                                                                            break;
                                                                        case 38:
                                                                            k(1);
                                                                            this.f14710H = 3;
                                                                            this.f14706D.f14694h = 3;
                                                                            break;
                                                                        case 39:
                                                                            k(1);
                                                                            this.f14710H = 4;
                                                                            this.f14706D.f14694h = 4;
                                                                            break;
                                                                        default:
                                                                            i10 = this.f14709G;
                                                                            if (i10 != 0) {
                                                                                if (b8 != 33) {
                                                                                    switch (b8) {
                                                                                        case 44:
                                                                                            this.f14707E = Collections.emptyList();
                                                                                            i11 = this.f14709G;
                                                                                            if (i11 != 1) {
                                                                                                j();
                                                                                            } else {
                                                                                                j();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i10 == 1) {
                                                                                                b bVar113 = this.f14706D;
                                                                                                arrayList = bVar113.f14688b;
                                                                                                arrayList.add(bVar113.d());
                                                                                                bVar113.f14689c.setLength(0);
                                                                                                bVar113.f14687a.clear();
                                                                                                iMin = Math.min(bVar113.f14694h, bVar113.f14690d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            j();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f14707E = i();
                                                                                            j();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f14706D.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    k(3);
                                                                }
                                                            }
                                                        } else if (i9 == 20) {
                                                            if (b8 == 32) {
                                                                k(2);
                                                            } else if (b8 != 41) {
                                                                switch (b8) {
                                                                    case 37:
                                                                        k(1);
                                                                        this.f14710H = 2;
                                                                        this.f14706D.f14694h = 2;
                                                                        break;
                                                                    case 38:
                                                                        k(1);
                                                                        this.f14710H = 3;
                                                                        this.f14706D.f14694h = 3;
                                                                        break;
                                                                    case 39:
                                                                        k(1);
                                                                        this.f14710H = 4;
                                                                        this.f14706D.f14694h = 4;
                                                                        break;
                                                                    default:
                                                                        i10 = this.f14709G;
                                                                        if (i10 != 0) {
                                                                            if (b8 != 33) {
                                                                                switch (b8) {
                                                                                    case 44:
                                                                                        this.f14707E = Collections.emptyList();
                                                                                        i11 = this.f14709G;
                                                                                        if (i11 != 1) {
                                                                                            j();
                                                                                        } else {
                                                                                            j();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i10 == 1) {
                                                                                            b bVar114 = this.f14706D;
                                                                                            arrayList = bVar114.f14688b;
                                                                                            arrayList.add(bVar114.d());
                                                                                            bVar114.f14689c.setLength(0);
                                                                                            bVar114.f14687a.clear();
                                                                                            iMin = Math.min(bVar114.f14694h, bVar114.f14690d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        j();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f14707E = i();
                                                                                        j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f14706D.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                k(3);
                                                            }
                                                        }
                                                    } else if (i8 != 23) {
                                                        if (i9 == 20) {
                                                            if (b8 == 32) {
                                                                k(2);
                                                            } else if (b8 != 41) {
                                                                switch (b8) {
                                                                    case 37:
                                                                        k(1);
                                                                        this.f14710H = 2;
                                                                        this.f14706D.f14694h = 2;
                                                                        break;
                                                                    case 38:
                                                                        k(1);
                                                                        this.f14710H = 3;
                                                                        this.f14706D.f14694h = 3;
                                                                        break;
                                                                    case 39:
                                                                        k(1);
                                                                        this.f14710H = 4;
                                                                        this.f14706D.f14694h = 4;
                                                                        break;
                                                                    default:
                                                                        i10 = this.f14709G;
                                                                        if (i10 != 0) {
                                                                            if (b8 != 33) {
                                                                                switch (b8) {
                                                                                    case 44:
                                                                                        this.f14707E = Collections.emptyList();
                                                                                        i11 = this.f14709G;
                                                                                        if (i11 != 1) {
                                                                                            j();
                                                                                        } else {
                                                                                            j();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i10 == 1) {
                                                                                            b bVar115 = this.f14706D;
                                                                                            arrayList = bVar115.f14688b;
                                                                                            arrayList.add(bVar115.d());
                                                                                            bVar115.f14689c.setLength(0);
                                                                                            bVar115.f14687a.clear();
                                                                                            iMin = Math.min(bVar115.f14694h, bVar115.f14690d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        j();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f14707E = i();
                                                                                        j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f14706D.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                k(3);
                                                            }
                                                        }
                                                    } else if (i9 == 20) {
                                                        if (b8 == 32) {
                                                            k(2);
                                                        } else if (b8 != 41) {
                                                            switch (b8) {
                                                                case 37:
                                                                    k(1);
                                                                    this.f14710H = 2;
                                                                    this.f14706D.f14694h = 2;
                                                                    break;
                                                                case 38:
                                                                    k(1);
                                                                    this.f14710H = 3;
                                                                    this.f14706D.f14694h = 3;
                                                                    break;
                                                                case 39:
                                                                    k(1);
                                                                    this.f14710H = 4;
                                                                    this.f14706D.f14694h = 4;
                                                                    break;
                                                                default:
                                                                    i10 = this.f14709G;
                                                                    if (i10 != 0) {
                                                                        if (b8 != 33) {
                                                                            switch (b8) {
                                                                                case 44:
                                                                                    this.f14707E = Collections.emptyList();
                                                                                    i11 = this.f14709G;
                                                                                    if (i11 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i10 == 1) {
                                                                                        b bVar116 = this.f14706D;
                                                                                        arrayList = bVar116.f14688b;
                                                                                        arrayList.add(bVar116.d());
                                                                                        bVar116.f14689c.setLength(0);
                                                                                        bVar116.f14687a.clear();
                                                                                        iMin = Math.min(bVar116.f14694h, bVar116.f14690d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f14707E = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f14706D.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if ((b7 & 240) != 16) {
                                                    if (i8 != 23) {
                                                        if (i9 == 20) {
                                                            if (b8 == 32) {
                                                                k(2);
                                                            } else if (b8 != 41) {
                                                                switch (b8) {
                                                                    case 37:
                                                                        k(1);
                                                                        this.f14710H = 2;
                                                                        this.f14706D.f14694h = 2;
                                                                        break;
                                                                    case 38:
                                                                        k(1);
                                                                        this.f14710H = 3;
                                                                        this.f14706D.f14694h = 3;
                                                                        break;
                                                                    case 39:
                                                                        k(1);
                                                                        this.f14710H = 4;
                                                                        this.f14706D.f14694h = 4;
                                                                        break;
                                                                    default:
                                                                        i10 = this.f14709G;
                                                                        if (i10 != 0) {
                                                                            if (b8 != 33) {
                                                                                switch (b8) {
                                                                                    case 44:
                                                                                        this.f14707E = Collections.emptyList();
                                                                                        i11 = this.f14709G;
                                                                                        if (i11 != 1) {
                                                                                            j();
                                                                                        } else {
                                                                                            j();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i10 == 1) {
                                                                                            b bVar117 = this.f14706D;
                                                                                            arrayList = bVar117.f14688b;
                                                                                            arrayList.add(bVar117.d());
                                                                                            bVar117.f14689c.setLength(0);
                                                                                            bVar117.f14687a.clear();
                                                                                            iMin = Math.min(bVar117.f14694h, bVar117.f14690d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        j();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f14707E = i();
                                                                                        j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f14706D.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                k(3);
                                                            }
                                                        }
                                                    } else if (i9 == 20) {
                                                        if (b8 == 32) {
                                                            k(2);
                                                        } else if (b8 != 41) {
                                                            switch (b8) {
                                                                case 37:
                                                                    k(1);
                                                                    this.f14710H = 2;
                                                                    this.f14706D.f14694h = 2;
                                                                    break;
                                                                case 38:
                                                                    k(1);
                                                                    this.f14710H = 3;
                                                                    this.f14706D.f14694h = 3;
                                                                    break;
                                                                case 39:
                                                                    k(1);
                                                                    this.f14710H = 4;
                                                                    this.f14706D.f14694h = 4;
                                                                    break;
                                                                default:
                                                                    i10 = this.f14709G;
                                                                    if (i10 != 0) {
                                                                        if (b8 != 33) {
                                                                            switch (b8) {
                                                                                case 44:
                                                                                    this.f14707E = Collections.emptyList();
                                                                                    i11 = this.f14709G;
                                                                                    if (i11 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i10 == 1) {
                                                                                        b bVar118 = this.f14706D;
                                                                                        arrayList = bVar118.f14688b;
                                                                                        arrayList.add(bVar118.d());
                                                                                        bVar118.f14689c.setLength(0);
                                                                                        bVar118.f14687a.clear();
                                                                                        iMin = Math.min(bVar118.f14694h, bVar118.f14690d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f14707E = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f14706D.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if (i8 != 23) {
                                                    if (i9 == 20) {
                                                        if (b8 == 32) {
                                                            k(2);
                                                        } else if (b8 != 41) {
                                                            switch (b8) {
                                                                case 37:
                                                                    k(1);
                                                                    this.f14710H = 2;
                                                                    this.f14706D.f14694h = 2;
                                                                    break;
                                                                case 38:
                                                                    k(1);
                                                                    this.f14710H = 3;
                                                                    this.f14706D.f14694h = 3;
                                                                    break;
                                                                case 39:
                                                                    k(1);
                                                                    this.f14710H = 4;
                                                                    this.f14706D.f14694h = 4;
                                                                    break;
                                                                default:
                                                                    i10 = this.f14709G;
                                                                    if (i10 != 0) {
                                                                        if (b8 != 33) {
                                                                            switch (b8) {
                                                                                case 44:
                                                                                    this.f14707E = Collections.emptyList();
                                                                                    i11 = this.f14709G;
                                                                                    if (i11 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i10 == 1) {
                                                                                        b bVar119 = this.f14706D;
                                                                                        arrayList = bVar119.f14688b;
                                                                                        arrayList.add(bVar119.d());
                                                                                        bVar119.f14689c.setLength(0);
                                                                                        bVar119.f14687a.clear();
                                                                                        iMin = Math.min(bVar119.f14694h, bVar119.f14690d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f14707E = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f14706D.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if (i9 == 20) {
                                                    if (b8 == 32) {
                                                        k(2);
                                                    } else if (b8 != 41) {
                                                        switch (b8) {
                                                            case 37:
                                                                k(1);
                                                                this.f14710H = 2;
                                                                this.f14706D.f14694h = 2;
                                                                break;
                                                            case 38:
                                                                k(1);
                                                                this.f14710H = 3;
                                                                this.f14706D.f14694h = 3;
                                                                break;
                                                            case 39:
                                                                k(1);
                                                                this.f14710H = 4;
                                                                this.f14706D.f14694h = 4;
                                                                break;
                                                            default:
                                                                i10 = this.f14709G;
                                                                if (i10 != 0) {
                                                                    if (b8 != 33) {
                                                                        switch (b8) {
                                                                            case 44:
                                                                                this.f14707E = Collections.emptyList();
                                                                                i11 = this.f14709G;
                                                                                if (i11 != 1) {
                                                                                    j();
                                                                                } else {
                                                                                    j();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i10 == 1) {
                                                                                    b bVar1110 = this.f14706D;
                                                                                    arrayList = bVar1110.f14688b;
                                                                                    arrayList.add(bVar1110.d());
                                                                                    bVar1110.f14689c.setLength(0);
                                                                                    bVar1110.f14687a.clear();
                                                                                    iMin = Math.min(bVar1110.f14694h, bVar1110.f14690d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                j();
                                                                                break;
                                                                            case 47:
                                                                                this.f14707E = i();
                                                                                j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f14706D.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        k(3);
                                                    }
                                                }
                                            } else if (i8 != 17) {
                                                if ((b7 & 240) != 16) {
                                                    if (i8 != 23) {
                                                        if (i9 == 20) {
                                                            if (b8 == 32) {
                                                                k(2);
                                                            } else if (b8 != 41) {
                                                                switch (b8) {
                                                                    case 37:
                                                                        k(1);
                                                                        this.f14710H = 2;
                                                                        this.f14706D.f14694h = 2;
                                                                        break;
                                                                    case 38:
                                                                        k(1);
                                                                        this.f14710H = 3;
                                                                        this.f14706D.f14694h = 3;
                                                                        break;
                                                                    case 39:
                                                                        k(1);
                                                                        this.f14710H = 4;
                                                                        this.f14706D.f14694h = 4;
                                                                        break;
                                                                    default:
                                                                        i10 = this.f14709G;
                                                                        if (i10 != 0) {
                                                                            if (b8 != 33) {
                                                                                switch (b8) {
                                                                                    case 44:
                                                                                        this.f14707E = Collections.emptyList();
                                                                                        i11 = this.f14709G;
                                                                                        if (i11 != 1) {
                                                                                            j();
                                                                                        } else {
                                                                                            j();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i10 == 1) {
                                                                                            b bVar1111 = this.f14706D;
                                                                                            arrayList = bVar1111.f14688b;
                                                                                            arrayList.add(bVar1111.d());
                                                                                            bVar1111.f14689c.setLength(0);
                                                                                            bVar1111.f14687a.clear();
                                                                                            iMin = Math.min(bVar1111.f14694h, bVar1111.f14690d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        j();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f14707E = i();
                                                                                        j();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f14706D.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                k(3);
                                                            }
                                                        }
                                                    } else if (i9 == 20) {
                                                        if (b8 == 32) {
                                                            k(2);
                                                        } else if (b8 != 41) {
                                                            switch (b8) {
                                                                case 37:
                                                                    k(1);
                                                                    this.f14710H = 2;
                                                                    this.f14706D.f14694h = 2;
                                                                    break;
                                                                case 38:
                                                                    k(1);
                                                                    this.f14710H = 3;
                                                                    this.f14706D.f14694h = 3;
                                                                    break;
                                                                case 39:
                                                                    k(1);
                                                                    this.f14710H = 4;
                                                                    this.f14706D.f14694h = 4;
                                                                    break;
                                                                default:
                                                                    i10 = this.f14709G;
                                                                    if (i10 != 0) {
                                                                        if (b8 != 33) {
                                                                            switch (b8) {
                                                                                case 44:
                                                                                    this.f14707E = Collections.emptyList();
                                                                                    i11 = this.f14709G;
                                                                                    if (i11 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i10 == 1) {
                                                                                        b bVar1112 = this.f14706D;
                                                                                        arrayList = bVar1112.f14688b;
                                                                                        arrayList.add(bVar1112.d());
                                                                                        bVar1112.f14689c.setLength(0);
                                                                                        bVar1112.f14687a.clear();
                                                                                        iMin = Math.min(bVar1112.f14694h, bVar1112.f14690d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f14707E = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f14706D.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if (i8 != 23) {
                                                    if (i9 == 20) {
                                                        if (b8 == 32) {
                                                            k(2);
                                                        } else if (b8 != 41) {
                                                            switch (b8) {
                                                                case 37:
                                                                    k(1);
                                                                    this.f14710H = 2;
                                                                    this.f14706D.f14694h = 2;
                                                                    break;
                                                                case 38:
                                                                    k(1);
                                                                    this.f14710H = 3;
                                                                    this.f14706D.f14694h = 3;
                                                                    break;
                                                                case 39:
                                                                    k(1);
                                                                    this.f14710H = 4;
                                                                    this.f14706D.f14694h = 4;
                                                                    break;
                                                                default:
                                                                    i10 = this.f14709G;
                                                                    if (i10 != 0) {
                                                                        if (b8 != 33) {
                                                                            switch (b8) {
                                                                                case 44:
                                                                                    this.f14707E = Collections.emptyList();
                                                                                    i11 = this.f14709G;
                                                                                    if (i11 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i10 == 1) {
                                                                                        b bVar1113 = this.f14706D;
                                                                                        arrayList = bVar1113.f14688b;
                                                                                        arrayList.add(bVar1113.d());
                                                                                        bVar1113.f14689c.setLength(0);
                                                                                        bVar1113.f14687a.clear();
                                                                                        iMin = Math.min(bVar1113.f14694h, bVar1113.f14690d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f14707E = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f14706D.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if (i9 == 20) {
                                                    if (b8 == 32) {
                                                        k(2);
                                                    } else if (b8 != 41) {
                                                        switch (b8) {
                                                            case 37:
                                                                k(1);
                                                                this.f14710H = 2;
                                                                this.f14706D.f14694h = 2;
                                                                break;
                                                            case 38:
                                                                k(1);
                                                                this.f14710H = 3;
                                                                this.f14706D.f14694h = 3;
                                                                break;
                                                            case 39:
                                                                k(1);
                                                                this.f14710H = 4;
                                                                this.f14706D.f14694h = 4;
                                                                break;
                                                            default:
                                                                i10 = this.f14709G;
                                                                if (i10 != 0) {
                                                                    if (b8 != 33) {
                                                                        switch (b8) {
                                                                            case 44:
                                                                                this.f14707E = Collections.emptyList();
                                                                                i11 = this.f14709G;
                                                                                if (i11 != 1) {
                                                                                    j();
                                                                                } else {
                                                                                    j();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i10 == 1) {
                                                                                    b bVar1114 = this.f14706D;
                                                                                    arrayList = bVar1114.f14688b;
                                                                                    arrayList.add(bVar1114.d());
                                                                                    bVar1114.f14689c.setLength(0);
                                                                                    bVar1114.f14687a.clear();
                                                                                    iMin = Math.min(bVar1114.f14694h, bVar1114.f14690d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                j();
                                                                                break;
                                                                            case 47:
                                                                                this.f14707E = i();
                                                                                j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f14706D.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        k(3);
                                                    }
                                                }
                                            } else if ((b7 & 240) != 16) {
                                                if (i8 != 23) {
                                                    if (i9 == 20) {
                                                        if (b8 == 32) {
                                                            k(2);
                                                        } else if (b8 != 41) {
                                                            switch (b8) {
                                                                case 37:
                                                                    k(1);
                                                                    this.f14710H = 2;
                                                                    this.f14706D.f14694h = 2;
                                                                    break;
                                                                case 38:
                                                                    k(1);
                                                                    this.f14710H = 3;
                                                                    this.f14706D.f14694h = 3;
                                                                    break;
                                                                case 39:
                                                                    k(1);
                                                                    this.f14710H = 4;
                                                                    this.f14706D.f14694h = 4;
                                                                    break;
                                                                default:
                                                                    i10 = this.f14709G;
                                                                    if (i10 != 0) {
                                                                        if (b8 != 33) {
                                                                            switch (b8) {
                                                                                case 44:
                                                                                    this.f14707E = Collections.emptyList();
                                                                                    i11 = this.f14709G;
                                                                                    if (i11 != 1) {
                                                                                        j();
                                                                                    } else {
                                                                                        j();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i10 == 1) {
                                                                                        b bVar1115 = this.f14706D;
                                                                                        arrayList = bVar1115.f14688b;
                                                                                        arrayList.add(bVar1115.d());
                                                                                        bVar1115.f14689c.setLength(0);
                                                                                        bVar1115.f14687a.clear();
                                                                                        iMin = Math.min(bVar1115.f14694h, bVar1115.f14690d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    j();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f14707E = i();
                                                                                    j();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f14706D.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            k(3);
                                                        }
                                                    }
                                                } else if (i9 == 20) {
                                                    if (b8 == 32) {
                                                        k(2);
                                                    } else if (b8 != 41) {
                                                        switch (b8) {
                                                            case 37:
                                                                k(1);
                                                                this.f14710H = 2;
                                                                this.f14706D.f14694h = 2;
                                                                break;
                                                            case 38:
                                                                k(1);
                                                                this.f14710H = 3;
                                                                this.f14706D.f14694h = 3;
                                                                break;
                                                            case 39:
                                                                k(1);
                                                                this.f14710H = 4;
                                                                this.f14706D.f14694h = 4;
                                                                break;
                                                            default:
                                                                i10 = this.f14709G;
                                                                if (i10 != 0) {
                                                                    if (b8 != 33) {
                                                                        switch (b8) {
                                                                            case 44:
                                                                                this.f14707E = Collections.emptyList();
                                                                                i11 = this.f14709G;
                                                                                if (i11 != 1) {
                                                                                    j();
                                                                                } else {
                                                                                    j();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i10 == 1) {
                                                                                    b bVar1116 = this.f14706D;
                                                                                    arrayList = bVar1116.f14688b;
                                                                                    arrayList.add(bVar1116.d());
                                                                                    bVar1116.f14689c.setLength(0);
                                                                                    bVar1116.f14687a.clear();
                                                                                    iMin = Math.min(bVar1116.f14694h, bVar1116.f14690d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                j();
                                                                                break;
                                                                            case 47:
                                                                                this.f14707E = i();
                                                                                j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f14706D.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        k(3);
                                                    }
                                                }
                                            } else if (i8 != 23) {
                                                if (i9 == 20) {
                                                    if (b8 == 32) {
                                                        k(2);
                                                    } else if (b8 != 41) {
                                                        switch (b8) {
                                                            case 37:
                                                                k(1);
                                                                this.f14710H = 2;
                                                                this.f14706D.f14694h = 2;
                                                                break;
                                                            case 38:
                                                                k(1);
                                                                this.f14710H = 3;
                                                                this.f14706D.f14694h = 3;
                                                                break;
                                                            case 39:
                                                                k(1);
                                                                this.f14710H = 4;
                                                                this.f14706D.f14694h = 4;
                                                                break;
                                                            default:
                                                                i10 = this.f14709G;
                                                                if (i10 != 0) {
                                                                    if (b8 != 33) {
                                                                        switch (b8) {
                                                                            case 44:
                                                                                this.f14707E = Collections.emptyList();
                                                                                i11 = this.f14709G;
                                                                                if (i11 != 1) {
                                                                                    j();
                                                                                } else {
                                                                                    j();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i10 == 1) {
                                                                                    b bVar1117 = this.f14706D;
                                                                                    arrayList = bVar1117.f14688b;
                                                                                    arrayList.add(bVar1117.d());
                                                                                    bVar1117.f14689c.setLength(0);
                                                                                    bVar1117.f14687a.clear();
                                                                                    iMin = Math.min(bVar1117.f14694h, bVar1117.f14690d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                j();
                                                                                break;
                                                                            case 47:
                                                                                this.f14707E = i();
                                                                                j();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f14706D.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        k(3);
                                                    }
                                                }
                                            } else if (i9 == 20) {
                                                if (b8 == 32) {
                                                    k(2);
                                                } else if (b8 != 41) {
                                                    switch (b8) {
                                                        case 37:
                                                            k(1);
                                                            this.f14710H = 2;
                                                            this.f14706D.f14694h = 2;
                                                            break;
                                                        case 38:
                                                            k(1);
                                                            this.f14710H = 3;
                                                            this.f14706D.f14694h = 3;
                                                            break;
                                                        case 39:
                                                            k(1);
                                                            this.f14710H = 4;
                                                            this.f14706D.f14694h = 4;
                                                            break;
                                                        default:
                                                            i10 = this.f14709G;
                                                            if (i10 != 0) {
                                                                if (b8 != 33) {
                                                                    switch (b8) {
                                                                        case 44:
                                                                            this.f14707E = Collections.emptyList();
                                                                            i11 = this.f14709G;
                                                                            if (i11 != 1) {
                                                                                j();
                                                                            } else {
                                                                                j();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i10 == 1) {
                                                                                b bVar1118 = this.f14706D;
                                                                                arrayList = bVar1118.f14688b;
                                                                                arrayList.add(bVar1118.d());
                                                                                bVar1118.f14689c.setLength(0);
                                                                                bVar1118.f14687a.clear();
                                                                                iMin = Math.min(bVar1118.f14694h, bVar1118.f14690d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            j();
                                                                            break;
                                                                        case 47:
                                                                            this.f14707E = i();
                                                                            j();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f14706D.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    k(3);
                                                }
                                            }
                                        }
                                    } else {
                                        b bVar20 = this.f14706D;
                                        iArr = f14698S;
                                        bVar20.a((char) iArr[(b7 & 127) - 32]);
                                        if ((b8 & 224) != 0) {
                                            this.f14706D.a((char) iArr[(b8 & 127) - 32]);
                                        }
                                    }
                                    z7 = true;
                                }
                            }
                        } else if (z8) {
                            j();
                            z7 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // p073k2.h, D1.d
    public final void flush() {
        super.flush();
        this.f14707E = null;
        this.f14708F = null;
        k(0);
        this.f14710H = 4;
        this.f14706D.f14694h = 4;
        j();
        this.f14711I = false;
        this.f14712J = false;
        this.f14713K = (byte) 0;
        this.f14714L = (byte) 0;
        this.f14715M = 0;
        this.f14716N = true;
        this.f14717O = -9223372036854775807L;
    }

    @Override // p073k2.h, D1.d
    /* JADX INFO: renamed from: g */
    public final d b() {
        d dVar;
        d dVarB = super.b();
        if (dVarB != null) {
            return dVarB;
        }
        long j = this.f14704B;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j3 = this.f14717O;
        if (j3 == -9223372036854775807L || this.f14770e - j3 < j || (dVar = (d) this.f14767b.pollFirst()) == null) {
            return null;
        }
        this.f14707E = Collections.emptyList();
        this.f14717O = -9223372036854775807L;
        dVar.y(this.f14770e, e(), Long.MAX_VALUE);
        return dVar;
    }

    @Override // p073k2.h
    public final boolean h() {
        return this.f14707E != this.f14708F;
    }

    public final ArrayList i() {
        ArrayList arrayList = this.f14705C;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i7 = 0; i7 < size; i7++) {
            b bVarC = ((b) arrayList.get(i7)).c(Integer.MIN_VALUE);
            arrayList2.add(bVarC);
            if (bVarC != null) {
                iMin = Math.min(iMin, bVarC.f14591z);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            b bVarC2 = (b) arrayList2.get(i8);
            if (bVarC2 != null) {
                if (bVarC2.f14591z != iMin) {
                    bVarC2 = ((b) arrayList.get(i8)).c(iMin);
                    bVarC2.getClass();
                }
                arrayList3.add(bVarC2);
            }
        }
        return arrayList3;
    }

    public final void j() {
        b bVar = this.f14706D;
        bVar.f14693g = this.f14709G;
        bVar.f14687a.clear();
        bVar.f14688b.clear();
        bVar.f14689c.setLength(0);
        bVar.f14690d = 15;
        bVar.f14691e = 0;
        bVar.f14692f = 0;
        ArrayList arrayList = this.f14705C;
        arrayList.clear();
        arrayList.add(this.f14706D);
    }

    public final void k(int i7) {
        int i8 = this.f14709G;
        if (i8 == i7) {
            return;
        }
        this.f14709G = i7;
        if (i7 != 3) {
            j();
            if (i8 == 3 || i7 == 1 || i7 == 0) {
                this.f14707E = Collections.emptyList();
                return;
            }
            return;
        }
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f14705C;
            if (i9 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i9)).f14693g = i7;
            i9++;
        }
    }

    @Override // p073k2.h, D1.d
    public final void release() {
    }
}
