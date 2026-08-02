package k2;

import C1.C0095a;
import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
import j2.C1305b;
import j2.C1307d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: P, reason: collision with root package name */
    public static final int[] f14689P = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: Q, reason: collision with root package name */
    public static final int[] f14690Q = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: R, reason: collision with root package name */
    public static final int[] f14691R = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: S, reason: collision with root package name */
    public static final int[] f14692S = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: T, reason: collision with root package name */
    public static final int[] f14693T = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: U, reason: collision with root package name */
    public static final int[] f14694U = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: V, reason: collision with root package name */
    public static final int[] f14695V = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: W, reason: collision with root package name */
    public static final boolean[] f14696W = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: A, reason: collision with root package name */
    public final int f14697A;

    /* renamed from: E, reason: collision with root package name */
    public List f14701E;

    /* renamed from: F, reason: collision with root package name */
    public List f14702F;

    /* renamed from: G, reason: collision with root package name */
    public int f14703G;

    /* renamed from: H, reason: collision with root package name */
    public int f14704H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f14705I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f14706J;

    /* renamed from: K, reason: collision with root package name */
    public byte f14707K;

    /* renamed from: L, reason: collision with root package name */
    public byte f14708L;

    /* renamed from: N, reason: collision with root package name */
    public boolean f14710N;

    /* renamed from: O, reason: collision with root package name */
    public long f14711O;

    /* renamed from: y, reason: collision with root package name */
    public final int f14713y;

    /* renamed from: z, reason: collision with root package name */
    public final int f14714z;

    /* renamed from: x, reason: collision with root package name */
    public final C0095a f14712x = new C0095a(4, false);

    /* renamed from: C, reason: collision with root package name */
    public final ArrayList f14699C = new ArrayList();

    /* renamed from: D, reason: collision with root package name */
    public C1335b f14700D = new C1335b(0, 4);

    /* renamed from: M, reason: collision with root package name */
    public int f14709M = 0;

    /* renamed from: B, reason: collision with root package name */
    public final long f14698B = 16000000;

    public c(String str, int i7) {
        this.f14713y = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i7 == 1) {
            this.f14697A = 0;
            this.f14714z = 0;
        } else if (i7 == 2) {
            this.f14697A = 1;
            this.f14714z = 0;
        } else if (i7 == 3) {
            this.f14697A = 0;
            this.f14714z = 1;
        } else if (i7 != 4) {
            Log.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f14697A = 0;
            this.f14714z = 0;
        } else {
            this.f14697A = 1;
            this.f14714z = 1;
        }
        k(0);
        j();
        this.f14710N = true;
        this.f14711O = -9223372036854775807L;
    }

    @Override // k2.h
    public final R4.c e() {
        List list = this.f14701E;
        this.f14702F = list;
        list.getClass();
        return new R4.c(list, 19);
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086 A[SYNTHETIC] */
    @Override // k2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(g gVar) {
        boolean z4;
        ByteBuffer byteBuffer = gVar.f1697d;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C0095a c0095a = this.f14712x;
        c0095a.B(limit, array);
        boolean z7 = false;
        while (true) {
            int d7 = c0095a.d();
            int i7 = this.f14713y;
            if (d7 < i7) {
                if (z7) {
                    int i8 = this.f14703G;
                    if (i8 == 1 || i8 == 3) {
                        this.f14701E = i();
                        this.f14711O = this.f14764e;
                        return;
                    }
                    return;
                }
                return;
            }
            byte t7 = i7 == 2 ? (byte) -4 : (byte) c0095a.t();
            int t8 = c0095a.t();
            int t9 = c0095a.t();
            if ((t7 & 2) == 0 && (t7 & 1) == this.f14714z) {
                byte b7 = (byte) (t8 & 127);
                byte b8 = (byte) (t9 & 127);
                if (b7 != 0 || b8 != 0) {
                    boolean z8 = this.f14705I;
                    if ((t7 & 4) == 4) {
                        boolean[] zArr = f14696W;
                        if (zArr[t8] && zArr[t9]) {
                            z4 = true;
                            this.f14705I = z4;
                            if (z4 || (b7 & 240) != 16) {
                                this.f14706J = false;
                            } else if (this.f14706J && this.f14707K == b7 && this.f14708L == b8) {
                                this.f14706J = false;
                            } else {
                                this.f14706J = true;
                                this.f14707K = b7;
                                this.f14708L = b8;
                            }
                            if (!z4) {
                                if (1 <= b7 && b7 <= 15) {
                                    this.f14710N = false;
                                } else if ((b7 & 247) == 20) {
                                    if (b8 != 32 && b8 != 47) {
                                        switch (b8) {
                                            default:
                                                switch (b8) {
                                                    case 42:
                                                    case 43:
                                                        this.f14710N = false;
                                                        break;
                                                }
                                            case 37:
                                            case 38:
                                            case 39:
                                                this.f14710N = true;
                                                break;
                                        }
                                    }
                                    this.f14710N = true;
                                }
                                if (this.f14710N) {
                                    int i9 = b7 & 224;
                                    if (i9 == 0) {
                                        this.f14709M = (b7 >> 3) & 1;
                                    }
                                    if (this.f14709M == this.f14697A) {
                                        if (i9 == 0) {
                                            int i10 = b7 & 247;
                                            if (i10 == 17 && (b8 & 240) == 48) {
                                                this.f14700D.a((char) f14693T[b8 & 15]);
                                            } else {
                                                int i11 = b7 & 246;
                                                if (i11 == 18 && (b8 & 224) == 32) {
                                                    this.f14700D.b();
                                                    this.f14700D.a((char) ((b7 & 1) == 0 ? f14694U[b8 & 31] : f14695V[b8 & 31]));
                                                } else if (i10 == 17 && (b8 & 240) == 32) {
                                                    this.f14700D.a(' ');
                                                    boolean z9 = (b8 & 1) == 1;
                                                    C1335b c1335b = this.f14700D;
                                                    c1335b.f14681a.add(new C1334a((b8 >> 1) & 7, z9, c1335b.f14683c.length()));
                                                } else if ((b7 & 240) == 16 && (b8 & 192) == 64) {
                                                    int i12 = f14689P[b7 & 7];
                                                    if ((b8 & 32) != 0) {
                                                        i12++;
                                                    }
                                                    C1335b c1335b2 = this.f14700D;
                                                    if (i12 != c1335b2.f14684d) {
                                                        if (this.f14703G != 1 && !c1335b2.e()) {
                                                            C1335b c1335b3 = new C1335b(this.f14703G, this.f14704H);
                                                            this.f14700D = c1335b3;
                                                            this.f14699C.add(c1335b3);
                                                        }
                                                        this.f14700D.f14684d = i12;
                                                    }
                                                    boolean z10 = (b8 & 16) == 16;
                                                    boolean z11 = (b8 & 1) == 1;
                                                    int i13 = (b8 >> 1) & 7;
                                                    C1335b c1335b4 = this.f14700D;
                                                    c1335b4.f14681a.add(new C1334a(z10 ? 8 : i13, z11, c1335b4.f14683c.length()));
                                                    if (z10) {
                                                        this.f14700D.f14685e = f14690Q[i13];
                                                    }
                                                } else if (i10 == 23 && b8 >= 33 && b8 <= 35) {
                                                    this.f14700D.f14686f = b8 - 32;
                                                } else if (i11 == 20 && (b8 & 240) == 32) {
                                                    if (b8 == 32) {
                                                        k(2);
                                                    } else if (b8 != 41) {
                                                        switch (b8) {
                                                            case 37:
                                                                k(1);
                                                                this.f14704H = 2;
                                                                this.f14700D.f14688h = 2;
                                                                break;
                                                            case 38:
                                                                k(1);
                                                                this.f14704H = 3;
                                                                this.f14700D.f14688h = 3;
                                                                break;
                                                            case 39:
                                                                k(1);
                                                                this.f14704H = 4;
                                                                this.f14700D.f14688h = 4;
                                                                break;
                                                            default:
                                                                int i14 = this.f14703G;
                                                                if (i14 != 0) {
                                                                    if (b8 == 33) {
                                                                        this.f14700D.b();
                                                                        break;
                                                                    } else {
                                                                        switch (b8) {
                                                                            case 44:
                                                                                this.f14701E = Collections.emptyList();
                                                                                int i15 = this.f14703G;
                                                                                if (i15 == 1 || i15 == 3) {
                                                                                    j();
                                                                                    break;
                                                                                }
                                                                            case 45:
                                                                                if (i14 == 1 && !this.f14700D.e()) {
                                                                                    C1335b c1335b5 = this.f14700D;
                                                                                    ArrayList arrayList = c1335b5.f14682b;
                                                                                    arrayList.add(c1335b5.d());
                                                                                    c1335b5.f14683c.setLength(0);
                                                                                    c1335b5.f14681a.clear();
                                                                                    int min = Math.min(c1335b5.f14688h, c1335b5.f14684d);
                                                                                    while (arrayList.size() >= min) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                j();
                                                                                break;
                                                                            case 47:
                                                                                this.f14701E = i();
                                                                                j();
                                                                                break;
                                                                        }
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
                                            C1335b c1335b6 = this.f14700D;
                                            int[] iArr = f14692S;
                                            c1335b6.a((char) iArr[(b7 & Byte.MAX_VALUE) - 32]);
                                            if ((b8 & 224) != 0) {
                                                this.f14700D.a((char) iArr[(b8 & Byte.MAX_VALUE) - 32]);
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
                    z4 = false;
                    this.f14705I = z4;
                    if (z4) {
                    }
                    this.f14706J = false;
                    if (!z4) {
                    }
                }
            }
        }
    }

    @Override // k2.h, D1.d
    public final void flush() {
        super.flush();
        this.f14701E = null;
        this.f14702F = null;
        k(0);
        this.f14704H = 4;
        this.f14700D.f14688h = 4;
        j();
        this.f14705I = false;
        this.f14706J = false;
        this.f14707K = (byte) 0;
        this.f14708L = (byte) 0;
        this.f14709M = 0;
        this.f14710N = true;
        this.f14711O = -9223372036854775807L;
    }

    @Override // k2.h, D1.d
    /* renamed from: g */
    public final C1307d b() {
        C1307d c1307d;
        C1307d b7 = super.b();
        if (b7 != null) {
            return b7;
        }
        long j = this.f14698B;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j3 = this.f14711O;
        if (j3 == -9223372036854775807L || this.f14764e - j3 < j || (c1307d = (C1307d) this.f14761b.pollFirst()) == null) {
            return null;
        }
        this.f14701E = Collections.emptyList();
        this.f14711O = -9223372036854775807L;
        c1307d.y(this.f14764e, e(), Long.MAX_VALUE);
        return c1307d;
    }

    @Override // k2.h
    public final boolean h() {
        return this.f14701E != this.f14702F;
    }

    public final ArrayList i() {
        ArrayList arrayList = this.f14699C;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i7 = 2;
        for (int i8 = 0; i8 < size; i8++) {
            C1305b c3 = ((C1335b) arrayList.get(i8)).c(Integer.MIN_VALUE);
            arrayList2.add(c3);
            if (c3 != null) {
                i7 = Math.min(i7, c3.f14585z);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i9 = 0; i9 < size; i9++) {
            C1305b c1305b = (C1305b) arrayList2.get(i9);
            if (c1305b != null) {
                if (c1305b.f14585z != i7) {
                    c1305b = ((C1335b) arrayList.get(i9)).c(i7);
                    c1305b.getClass();
                }
                arrayList3.add(c1305b);
            }
        }
        return arrayList3;
    }

    public final void j() {
        C1335b c1335b = this.f14700D;
        c1335b.f14687g = this.f14703G;
        c1335b.f14681a.clear();
        c1335b.f14682b.clear();
        c1335b.f14683c.setLength(0);
        c1335b.f14684d = 15;
        c1335b.f14685e = 0;
        c1335b.f14686f = 0;
        ArrayList arrayList = this.f14699C;
        arrayList.clear();
        arrayList.add(this.f14700D);
    }

    public final void k(int i7) {
        int i8 = this.f14703G;
        if (i8 == i7) {
            return;
        }
        this.f14703G = i7;
        if (i7 != 3) {
            j();
            if (i8 == 3 || i7 == 1 || i7 == 0) {
                this.f14701E = Collections.emptyList();
                return;
            }
            return;
        }
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f14699C;
            if (i9 >= arrayList.size()) {
                return;
            }
            ((C1335b) arrayList.get(i9)).f14687g = i7;
            i9++;
        }
    }

    @Override // k2.h, D1.d
    public final void release() {
    }
}
