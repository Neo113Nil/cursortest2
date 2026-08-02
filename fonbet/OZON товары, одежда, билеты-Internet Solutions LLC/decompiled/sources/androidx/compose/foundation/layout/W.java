package androidx.compose.foundation.layout;

import Am.C2438a;
import B0.A0;
import B1.m0;
import E0.C2942q;
import androidx.compose.foundation.layout.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u0.C9889B;
import u0.InterfaceC9888A;

/* loaded from: classes.dex */
public final class W {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final B1.W a(@NotNull InterfaceC9888A interfaceC9888A, int i11, int i12, int i13, int i14, int i15, @NotNull B1.Y y11, @NotNull List<? extends B1.U> list, @NotNull m0[] m0VarArr, int i16, int i17, int[] iArr, int i18) {
        int[] iArr2;
        String str;
        float f7;
        String str2;
        long j11;
        String str3;
        String str4;
        long j12;
        int i19;
        InterfaceC9888A interfaceC9888A2;
        int e11;
        int i21;
        int i22;
        String str5;
        String str6;
        String str7;
        long j13;
        float f11;
        boolean b11;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        float f12;
        int i29;
        List<? extends B1.U> list2 = list;
        int i31 = i17;
        long j14 = i15;
        int i32 = i31 - i16;
        int[] iArr3 = new int[i32];
        int i33 = i16;
        int i34 = 0;
        float f13 = 0.0f;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        boolean z11 = false;
        while (true) {
            iArr2 = iArr3;
            if (i33 >= i31) {
                break;
            }
            B1.U u11 = list2.get(i33);
            C9889B a11 = u0.z.a(u11);
            float b12 = u0.z.b(a11);
            if (z11) {
                i27 = i33;
            } else {
                r a12 = a11 != null ? a11.a() : null;
                i27 = i33;
                r rVar = a12;
                if (!(rVar != null ? rVar instanceof r.a : false)) {
                    z11 = false;
                    if (b12 <= 0.0f) {
                        f13 += b12;
                        i35++;
                        i28 = i32;
                    } else {
                        int i38 = i13 - i34;
                        m0 m0Var = m0VarArr[i27];
                        if (m0Var == null) {
                            i29 = i38;
                            i28 = i32;
                            f12 = f13;
                            m0Var = u11.a0(interfaceC9888A.d(0, i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i29 < 0 ? 0 : i29, i14, false));
                        } else {
                            i28 = i32;
                            f12 = f13;
                            i29 = i38;
                        }
                        m0 m0Var2 = m0Var;
                        int e12 = interfaceC9888A.e(m0Var2);
                        int b13 = interfaceC9888A.b(m0Var2);
                        iArr2[i27 - i16] = e12;
                        int i39 = i29 - e12;
                        if (i39 < 0) {
                            i39 = 0;
                        }
                        i37 = Math.min(i15, i39);
                        i34 += e12 + i37;
                        int max = Math.max(i36, b13);
                        m0VarArr[i27] = m0Var2;
                        i36 = max;
                        f13 = f12;
                    }
                    i33 = i27 + 1;
                    iArr3 = iArr2;
                    i32 = i28;
                }
            }
            z11 = true;
            if (b12 <= 0.0f) {
            }
            i33 = i27 + 1;
            iArr3 = iArr2;
            i32 = i28;
        }
        int i41 = i32;
        float f14 = f13;
        if (i35 == 0) {
            i19 = i34 - i37;
            e11 = 0;
            interfaceC9888A2 = interfaceC9888A;
        } else {
            int i42 = i13 != Integer.MAX_VALUE ? i13 : i11;
            long j15 = (i35 - 1) * j14;
            long j16 = (i42 - i34) - j15;
            if (j16 < 0) {
                j16 = 0;
            }
            int i43 = i36;
            float f15 = j16 / f14;
            int i44 = i16;
            long j17 = j16;
            while (true) {
                str = "weightedSize ";
                f7 = f15;
                str2 = "arrangementSpacingTotal ";
                j11 = j16;
                str3 = "fixedSpace ";
                str4 = "weightChildrenCount ";
                j12 = j15;
                if (i44 >= i31) {
                    break;
                }
                float b14 = u0.z.b(u0.z.a(list2.get(i44)));
                float f16 = f7 * b14;
                try {
                    j17 -= Math.round(f16);
                    i44++;
                    list2 = list;
                    i31 = i17;
                    f15 = f7;
                    j16 = j11;
                    j15 = j12;
                } catch (IllegalArgumentException e13) {
                    StringBuilder a13 = C2438a.a("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax ", i13, "mainAxisMin ", "targetSpace ", i11);
                    a13.append(i42);
                    a13.append("arrangementSpacingPx ");
                    a13.append(j14);
                    A0.c(i35, i34, "weightChildrenCount ", "fixedSpace ", a13);
                    C2942q.f(a13, "arrangementSpacingTotal ", j12, "remainingToTarget ");
                    a13.append(j11);
                    a13.append("totalWeight ");
                    a13.append(f14);
                    a13.append("weightUnitSpace ");
                    a13.append(f7);
                    a13.append("itemWeight ");
                    a13.append(b14);
                    a13.append(str);
                    a13.append(f16);
                    throw new IllegalArgumentException(a13.toString()).initCause(e13);
                }
            }
            int i45 = i16;
            int i46 = i43;
            int i47 = 0;
            while (i45 < i17) {
                if (m0VarArr[i45] == null) {
                    B1.U u12 = list.get(i45);
                    C9889B a14 = u0.z.a(u12);
                    i21 = i45;
                    float b15 = u0.z.b(a14);
                    if (!(b15 > 0.0f)) {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                    int signum = Long.signum(j17);
                    int i48 = i34;
                    str5 = str3;
                    j17 -= signum;
                    float f17 = f7 * b15;
                    int max2 = Math.max(0, Math.round(f17) + signum);
                    if (a14 != null) {
                        try {
                            b11 = a14.b();
                        } catch (IllegalArgumentException e14) {
                            e = e14;
                            j13 = j14;
                            f11 = f17;
                            str6 = str4;
                            str7 = str2;
                            StringBuilder a15 = C2438a.a("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ", i13, "mainAxisMin ", "targetSpace ", i11);
                            a15.append(i42);
                            a15.append("arrangementSpacingPx ");
                            a15.append(j13);
                            A0.c(i35, i48, str6, str5, a15);
                            C2942q.f(a15, str7, j12, "remainingToTarget ");
                            a15.append(j11);
                            a15.append("totalWeight ");
                            a15.append(f14);
                            a15.append("weightUnitSpace ");
                            a15.append(f7);
                            a15.append("weight ");
                            a15.append(b15);
                            a15.append(str);
                            a15.append(f11);
                            a15.append("crossAxisDesiredSize nullremainderUnit ");
                            a15.append(signum);
                            a15.append("childMainAxisSize ");
                            a15.append(max2);
                            throw new IllegalArgumentException(a15.toString()).initCause(e);
                        }
                    } else {
                        b11 = true;
                    }
                    try {
                        if (b11 && max2 != Integer.MAX_VALUE) {
                            i23 = max2;
                            j13 = j14;
                            f11 = f17;
                            str6 = str4;
                            str7 = str2;
                            m0 a02 = u12.a0(interfaceC9888A.d(i23, max2, i14, true));
                            int e15 = interfaceC9888A.e(a02);
                            int b16 = interfaceC9888A.b(a02);
                            iArr2[i21 - i16] = e15;
                            i47 += e15;
                            i46 = Math.max(i46, b16);
                            m0VarArr[i21] = a02;
                            i22 = i48;
                            j14 = j13;
                        }
                        m0 a022 = u12.a0(interfaceC9888A.d(i23, max2, i14, true));
                        int e152 = interfaceC9888A.e(a022);
                        int b162 = interfaceC9888A.b(a022);
                        iArr2[i21 - i16] = e152;
                        i47 += e152;
                        i46 = Math.max(i46, b162);
                        m0VarArr[i21] = a022;
                        i22 = i48;
                        j14 = j13;
                    } catch (IllegalArgumentException e16) {
                        e = e16;
                        StringBuilder a152 = C2438a.a("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ", i13, "mainAxisMin ", "targetSpace ", i11);
                        a152.append(i42);
                        a152.append("arrangementSpacingPx ");
                        a152.append(j13);
                        A0.c(i35, i48, str6, str5, a152);
                        C2942q.f(a152, str7, j12, "remainingToTarget ");
                        a152.append(j11);
                        a152.append("totalWeight ");
                        a152.append(f14);
                        a152.append("weightUnitSpace ");
                        a152.append(f7);
                        a152.append("weight ");
                        a152.append(b15);
                        a152.append(str);
                        a152.append(f11);
                        a152.append("crossAxisDesiredSize nullremainderUnit ");
                        a152.append(signum);
                        a152.append("childMainAxisSize ");
                        a152.append(max2);
                        throw new IllegalArgumentException(a152.toString()).initCause(e);
                    }
                    i23 = 0;
                    j13 = j14;
                    f11 = f17;
                    str6 = str4;
                    str7 = str2;
                } else {
                    i21 = i45;
                    i22 = i34;
                    str5 = str3;
                    str6 = str4;
                    str7 = str2;
                }
                str = str;
                i34 = i22;
                i45 = i21 + 1;
                str2 = str7;
                str3 = str5;
                str4 = str6;
            }
            i19 = i34;
            interfaceC9888A2 = interfaceC9888A;
            i36 = i46;
            e11 = kotlin.ranges.h.e((int) (i47 + j12), 0, i13 - i19);
        }
        if (z11) {
            i24 = i17;
            int i49 = 0;
            i25 = 0;
            for (int i51 = i16; i51 < i24; i51++) {
                m0 m0Var3 = m0VarArr[i51];
                Intrinsics.f(m0Var3);
                Object m11 = m0Var3.m();
                C9889B c9889b = m11 instanceof C9889B ? (C9889B) m11 : null;
                r a16 = c9889b != null ? c9889b.a() : null;
                Integer b17 = a16 != null ? a16.b(m0Var3) : null;
                if (b17 != null) {
                    int intValue = b17.intValue();
                    int b18 = interfaceC9888A2.b(m0Var3);
                    i49 = Math.max(i49, intValue != Integer.MIN_VALUE ? b17.intValue() : 0);
                    if (intValue == Integer.MIN_VALUE) {
                        intValue = b18;
                    }
                    i25 = Math.max(i25, b18 - intValue);
                }
            }
            i26 = i49;
        } else {
            i24 = i17;
            i25 = 0;
            i26 = 0;
        }
        int i52 = e11 + i19;
        if (i52 < 0) {
            i52 = 0;
        }
        int max3 = Math.max(i52, i11);
        int max4 = Math.max(i36, Math.max(i12, i25 + i26));
        int[] iArr4 = new int[i41];
        for (int i53 = 0; i53 < i41; i53++) {
            iArr4[i53] = 0;
        }
        interfaceC9888A2.a(max3, y11, iArr2, iArr4);
        return interfaceC9888A2.c(m0VarArr, y11, i26, iArr4, max3, max4, iArr, i18, i16, i24);
    }
}
