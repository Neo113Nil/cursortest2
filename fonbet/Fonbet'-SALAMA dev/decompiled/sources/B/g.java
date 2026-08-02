package B;

import android.util.Log;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int[] f786a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f787b;

    /* renamed from: c, reason: collision with root package name */
    public int f788c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f789d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f790e;

    /* renamed from: f, reason: collision with root package name */
    public int f791f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f792g;

    /* renamed from: h, reason: collision with root package name */
    public String[] f793h;

    /* renamed from: i, reason: collision with root package name */
    public int f794i;
    public int[] j;

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f795k;

    /* renamed from: l, reason: collision with root package name */
    public int f796l;

    public final void a(float f7, int i7) {
        int i8 = this.f791f;
        int[] iArr = this.f789d;
        if (i8 >= iArr.length) {
            this.f789d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f790e;
            this.f790e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f789d;
        int i9 = this.f791f;
        iArr2[i9] = i7;
        float[] fArr2 = this.f790e;
        this.f791f = i9 + 1;
        fArr2[i9] = f7;
    }

    public final void b(int i7, int i8) {
        int i9 = this.f788c;
        int[] iArr = this.f786a;
        if (i9 >= iArr.length) {
            this.f786a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f787b;
            this.f787b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f786a;
        int i10 = this.f788c;
        iArr3[i10] = i7;
        int[] iArr4 = this.f787b;
        this.f788c = i10 + 1;
        iArr4[i10] = i8;
    }

    public final void c(int i7, String str) {
        int i8 = this.f794i;
        int[] iArr = this.f792g;
        if (i8 >= iArr.length) {
            this.f792g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f793h;
            this.f793h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f792g;
        int i9 = this.f794i;
        iArr2[i9] = i7;
        String[] strArr2 = this.f793h;
        this.f794i = i9 + 1;
        strArr2[i9] = str;
    }

    public final void d(int i7, boolean z4) {
        int i8 = this.f796l;
        int[] iArr = this.j;
        if (i8 >= iArr.length) {
            this.j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f795k;
            this.f795k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.j;
        int i9 = this.f796l;
        iArr2[i9] = i7;
        boolean[] zArr2 = this.f795k;
        this.f796l = i9 + 1;
        zArr2[i9] = z4;
    }

    public final void e(h hVar) {
        for (int i7 = 0; i7 < this.f788c; i7++) {
            int i8 = this.f786a[i7];
            int i9 = this.f787b[i7];
            if (i8 == 6) {
                hVar.f801e.f809D = i9;
            } else if (i8 == 7) {
                hVar.f801e.f810E = i9;
            } else if (i8 == 8) {
                hVar.f801e.f816K = i9;
            } else if (i8 == 27) {
                hVar.f801e.f811F = i9;
            } else if (i8 == 28) {
                hVar.f801e.f813H = i9;
            } else if (i8 == 41) {
                hVar.f801e.f828W = i9;
            } else if (i8 == 42) {
                hVar.f801e.f829X = i9;
            } else if (i8 == 61) {
                hVar.f801e.f806A = i9;
            } else if (i8 == 62) {
                hVar.f801e.f807B = i9;
            } else if (i8 == 72) {
                hVar.f801e.f844g0 = i9;
            } else if (i8 == 73) {
                hVar.f801e.f846h0 = i9;
            } else if (i8 == 2) {
                hVar.f801e.f815J = i9;
            } else if (i8 == 31) {
                hVar.f801e.f817L = i9;
            } else if (i8 == 34) {
                hVar.f801e.f814I = i9;
            } else if (i8 == 38) {
                hVar.f797a = i9;
            } else if (i8 == 64) {
                hVar.f800d.f874b = i9;
            } else if (i8 == 66) {
                hVar.f800d.f878f = i9;
            } else if (i8 == 76) {
                hVar.f800d.f877e = i9;
            } else if (i8 == 78) {
                hVar.f799c.f887c = i9;
            } else if (i8 == 97) {
                hVar.f801e.f861p0 = i9;
            } else if (i8 == 93) {
                hVar.f801e.f818M = i9;
            } else if (i8 != 94) {
                switch (i8) {
                    case 11:
                        hVar.f801e.f822Q = i9;
                        break;
                    case 12:
                        hVar.f801e.f823R = i9;
                        break;
                    case 13:
                        hVar.f801e.f819N = i9;
                        break;
                    case 14:
                        hVar.f801e.f821P = i9;
                        break;
                    case 15:
                        hVar.f801e.f824S = i9;
                        break;
                    case 16:
                        hVar.f801e.f820O = i9;
                        break;
                    case 17:
                        hVar.f801e.f839e = i9;
                        break;
                    case 18:
                        hVar.f801e.f841f = i9;
                        break;
                    default:
                        switch (i8) {
                            case zzbbd.zzt.zzm /* 21 */:
                                hVar.f801e.f837d = i9;
                                break;
                            case 22:
                                hVar.f799c.f886b = i9;
                                break;
                            case 23:
                                hVar.f801e.f836c = i9;
                                break;
                            case 24:
                                hVar.f801e.f812G = i9;
                                break;
                            default:
                                switch (i8) {
                                    case 54:
                                        hVar.f801e.f830Y = i9;
                                        break;
                                    case 55:
                                        hVar.f801e.f831Z = i9;
                                        break;
                                    case 56:
                                        hVar.f801e.f833a0 = i9;
                                        break;
                                    case 57:
                                        hVar.f801e.f835b0 = i9;
                                        break;
                                    case 58:
                                        hVar.f801e.c0 = i9;
                                        break;
                                    case 59:
                                        hVar.f801e.f838d0 = i9;
                                        break;
                                    default:
                                        switch (i8) {
                                            case 82:
                                                hVar.f800d.f875c = i9;
                                                break;
                                            case 83:
                                                hVar.f802f.f899i = i9;
                                                break;
                                            case 84:
                                                hVar.f800d.j = i9;
                                                break;
                                            default:
                                                switch (i8) {
                                                    case 87:
                                                        break;
                                                    case 88:
                                                        hVar.f800d.f883l = i9;
                                                        break;
                                                    case 89:
                                                        hVar.f800d.f884m = i9;
                                                        break;
                                                    default:
                                                        Log.w("ConstraintSet", "Unknown attribute 0x");
                                                        break;
                                                }
                                        }
                                }
                        }
                }
            } else {
                hVar.f801e.f825T = i9;
            }
        }
        for (int i10 = 0; i10 < this.f791f; i10++) {
            int i11 = this.f789d[i10];
            float f7 = this.f790e[i10];
            if (i11 == 19) {
                hVar.f801e.f843g = f7;
            } else if (i11 == 20) {
                hVar.f801e.f869x = f7;
            } else if (i11 == 37) {
                hVar.f801e.f870y = f7;
            } else if (i11 == 60) {
                hVar.f802f.f892b = f7;
            } else if (i11 == 63) {
                hVar.f801e.f808C = f7;
            } else if (i11 == 79) {
                hVar.f800d.f879g = f7;
            } else if (i11 == 85) {
                hVar.f800d.f881i = f7;
            } else if (i11 != 87) {
                if (i11 == 39) {
                    hVar.f801e.f827V = f7;
                } else if (i11 != 40) {
                    switch (i11) {
                        case 43:
                            hVar.f799c.f888d = f7;
                            break;
                        case 44:
                            l lVar = hVar.f802f;
                            lVar.f903n = f7;
                            lVar.f902m = true;
                            break;
                        case 45:
                            hVar.f802f.f893c = f7;
                            break;
                        case 46:
                            hVar.f802f.f894d = f7;
                            break;
                        case 47:
                            hVar.f802f.f895e = f7;
                            break;
                        case 48:
                            hVar.f802f.f896f = f7;
                            break;
                        case 49:
                            hVar.f802f.f897g = f7;
                            break;
                        case 50:
                            hVar.f802f.f898h = f7;
                            break;
                        case 51:
                            hVar.f802f.j = f7;
                            break;
                        case 52:
                            hVar.f802f.f900k = f7;
                            break;
                        case 53:
                            hVar.f802f.f901l = f7;
                            break;
                        default:
                            switch (i11) {
                                case 67:
                                    hVar.f800d.f880h = f7;
                                    break;
                                case 68:
                                    hVar.f799c.f889e = f7;
                                    break;
                                case 69:
                                    hVar.f801e.f840e0 = f7;
                                    break;
                                case 70:
                                    hVar.f801e.f842f0 = f7;
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                    break;
                            }
                    }
                } else {
                    hVar.f801e.f826U = f7;
                }
            }
        }
        for (int i12 = 0; i12 < this.f794i; i12++) {
            int i13 = this.f792g[i12];
            String str = this.f793h[i12];
            if (i13 == 5) {
                hVar.f801e.f871z = str;
            } else if (i13 == 65) {
                hVar.f800d.f876d = str;
            } else if (i13 == 74) {
                i iVar = hVar.f801e;
                iVar.f851k0 = str;
                iVar.f849j0 = null;
            } else if (i13 == 77) {
                hVar.f801e.f853l0 = str;
            } else if (i13 != 87) {
                if (i13 != 90) {
                    Log.w("ConstraintSet", "Unknown attribute 0x");
                } else {
                    hVar.f800d.f882k = str;
                }
            }
        }
        for (int i14 = 0; i14 < this.f796l; i14++) {
            int i15 = this.j[i14];
            boolean z4 = this.f795k[i14];
            if (i15 == 44) {
                hVar.f802f.f902m = z4;
            } else if (i15 == 75) {
                hVar.f801e.f859o0 = z4;
            } else if (i15 != 87) {
                if (i15 == 80) {
                    hVar.f801e.f855m0 = z4;
                } else if (i15 != 81) {
                    Log.w("ConstraintSet", "Unknown attribute 0x");
                } else {
                    hVar.f801e.f857n0 = z4;
                }
            }
        }
    }
}
