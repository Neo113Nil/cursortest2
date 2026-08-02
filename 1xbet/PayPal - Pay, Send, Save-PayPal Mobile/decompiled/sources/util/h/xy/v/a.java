package util.h.xy.v;

/* loaded from: classes5.dex */
public final class a {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.v.a f2437 = new util.h.xy.v.a();

    /* loaded from: classes18.dex */
    public interface ma extends com.sun.jna.Library {
        public static final byte[] $$a;
        public static final int $$b = 92;

        /* renamed from: ᐝ, reason: contains not printable characters */
        public static final util.h.xy.v.a.ma f2438;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(short s, short s2, int i, java.lang.Object[] objArr) {
            int i2;
            int i3;
            int i4 = (s2 * 4) + 68;
            byte[] bArr = $$a;
            int i5 = 6 - (s * 4);
            int i6 = 3 - (i * 2);
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                int i7 = i5;
                i3 = 0;
                i4 = (i4 + i7) - 1;
                i2 = i3;
                i6++;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i4;
                if (i3 == i5) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i7 = bArr[i6];
                i4 = (i4 + i7) - 1;
                i2 = i3;
                i6++;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i4;
                if (i3 == i5) {
                }
            } else {
                i2 = 0;
                i6++;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i4;
                if (i3 == i5) {
                }
            }
        }

        static {
            byte[] bArr = {103, 105, 16, 89, 35, -47, 47, -47, 1};
            $$a = bArr;
            byte b = (byte) (bArr[8] - 1);
            byte b2 = b;
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(b, b2, b2, objArr);
            f2438 = (util.h.xy.v.a.ma) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.v.a.ma.class);
        }
    }

    private a() {
    }

    static {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 113) << 1) - (i ^ 113);
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final int m27566(com.sun.jna.Callback callback, com.sun.jna.Callback callback2, com.sun.jna.Callback callback3, com.sun.jna.Callback callback4, com.sun.jna.Callback callback5, java.lang.String str, java.lang.String str2, int[] iArr, int i, long[] jArr, int i2) {
        int i3;
        util.h.xy.ai.b bVar = new util.h.xy.ai.b();
        try {
            bVar.m24608(callback);
            bVar.m24603(callback2);
            bVar.m24598(callback3);
            bVar.m24613(callback4);
            bVar.m24593(callback5);
            bVar.m24604(str);
            bVar.m24609(str2);
            bVar.m24605(iArr);
            bVar.m24592(i);
            bVar.m24595(jArr);
            bVar.m24615(i2);
            i3 = bVar.m24590();
            int i4 = getHighSpeedVideoFpsRangesFor;
            int i5 = (i4 ^ 73) + ((i4 & 73) << 1);
            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
            int i6 = i5 % 2;
        } catch (java.io.IOException unused) {
            i3 = -1;
        }
        int i7 = getHighSpeedVideoFpsRangesFor;
        int i8 = (i7 & 27) + (i7 | 27);
        getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
        if (i8 % 2 == 0) {
            return i3;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final int m27551(int i, byte[] bArr, int i2, byte[] bArr2, int[] iArr) {
        util.h.xy.ai.ma maVar = new util.h.xy.ai.ma();
        try {
            maVar.m24693(i);
            maVar.m24689(bArr);
            maVar.m24693(i);
            maVar.m24685(i2);
            maVar.m24686(bArr2);
            maVar.m24694(iArr);
            int m24683 = maVar.m24683();
            byte[] m24697 = maVar.m24697();
            java.lang.System.arraycopy(m24697, 0, bArr2, 0, m24697.length);
            int[] m24695 = maVar.m24695();
            java.lang.System.arraycopy(m24695, 0, iArr, 0, m24695.length);
            int i3 = getHighResolutionOutputSizeshNQ4ISI;
            int i4 = (i3 ^ 17) + ((i3 & 17) << 1);
            int i5 = i4 % 128;
            getHighSpeedVideoFpsRangesFor = i5;
            if (i4 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            int i6 = i5 + 23;
            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
            if (i6 % 2 == 0) {
                return m24683;
            }
            throw null;
        } catch (java.io.IOException unused) {
            return -1;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final int m27553(byte[] bArr, int i, int i2, byte[] bArr2, int[] iArr) {
        util.h.xy.ai.ra raVar = new util.h.xy.ai.ra();
        try {
            raVar.m24819(i2);
            raVar.m24823(bArr);
            raVar.m24819(i2);
            raVar.m24828(i);
            raVar.m24820(bArr2);
            raVar.m24826(iArr);
            int m24814 = raVar.m24814();
            byte[] m24829 = raVar.m24829();
            java.lang.System.arraycopy(m24829, 0, bArr2, 0, m24829.length);
            int[] m24830 = raVar.m24830();
            java.lang.System.arraycopy(m24830, 0, iArr, 0, m24830.length);
            int i3 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = ((i3 & 75) + (i3 | 75)) % 128;
            int i4 = ((i3 ^ 87) + ((i3 & 87) << 1)) % 128;
            getHighSpeedVideoFpsRangesFor = i4;
            int i5 = ((i4 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i4 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
            if (i5 % 2 == 0) {
                return m24814;
            }
            throw null;
        } catch (java.io.IOException unused) {
            return -1;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final int m27560(byte[] bArr, int i, byte[] bArr2, int[] iArr, int i2) {
        util.h.xy.ai.mb mbVar = new util.h.xy.ai.mb();
        try {
            mbVar.m24704(i2);
            mbVar.m24705(bArr);
            mbVar.m24704(i2);
            mbVar.m24703(i);
            mbVar.m24712(bArr2);
            mbVar.m24709(iArr);
            int m24699 = mbVar.m24699();
            byte[] m24706 = mbVar.m24706();
            java.lang.System.arraycopy(m24706, 0, bArr2, 0, m24706.length);
            int[] m24716 = mbVar.m24716();
            java.lang.System.arraycopy(m24716, 0, iArr, 0, m24716.length);
            int i3 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = ((i3 & 121) + (i3 | 121)) % 128;
            int i4 = i3 + 61;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            int i5 = i3 + 83;
            getHighSpeedVideoFpsRangesFor = i5 % 128;
            if (i5 % 2 != 0) {
                return m24699;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.io.IOException unused) {
            return -1;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final int m27557(int i, byte[] bArr, int i2, byte[] bArr2, int[] iArr) {
        util.h.xy.ai.a aVar = new util.h.xy.ai.a();
        try {
            aVar.m24575(i);
            aVar.m24579(bArr);
            aVar.m24575(i);
            aVar.m24571(i2);
            aVar.m24583(bArr2);
            aVar.m24576(iArr);
            int m24569 = aVar.m24569();
            byte[] m24573 = aVar.m24573();
            java.lang.System.arraycopy(m24573, 0, bArr2, 0, m24573.length);
            int[] m24568 = aVar.m24568();
            java.lang.System.arraycopy(m24568, 0, iArr, 0, m24568.length);
            int i3 = (getHighSpeedVideoFpsRangesFor + 77) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i3;
            int i4 = (i3 ^ 55) + ((i3 & 55) << 1);
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 != 0) {
                return m24569;
            }
            throw null;
        } catch (java.io.IOException unused) {
            return -1;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final int m27570(byte[] bArr, int i, int i2, byte[] bArr2, int[] iArr) {
        util.h.xy.ai.rc rcVar = new util.h.xy.ai.rc();
        try {
            rcVar.m24855(i2);
            rcVar.m24862(bArr);
            rcVar.m24855(i2);
            rcVar.m24859(i);
            rcVar.m24856(bArr2);
            rcVar.m24857(iArr);
            int m24851 = rcVar.m24851();
            byte[] m24853 = rcVar.m24853();
            java.lang.System.arraycopy(m24853, 0, bArr2, 0, m24853.length);
            int[] m24850 = rcVar.m24850();
            java.lang.System.arraycopy(m24850, 0, iArr, 0, m24850.length);
            int i3 = getHighResolutionOutputSizeshNQ4ISI;
            int i4 = ((i3 ^ 31) + ((i3 & 31) << 1)) % 128;
            getHighSpeedVideoFpsRangesFor = i4;
            int i5 = ((i4 | 31) << 1) - (i4 ^ 31);
            int i6 = i5 % 128;
            getHighResolutionOutputSizeshNQ4ISI = i6;
            if (i5 % 2 != 0) {
                throw null;
            }
            getHighSpeedVideoFpsRangesFor = ((i6 ^ 109) + ((i6 & 109) << 1)) % 128;
            return m24851;
        } catch (java.io.IOException unused) {
            return -1;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final int m27554(byte[] bArr, int i, byte[] bArr2, int[] iArr, int i2) {
        util.h.xy.ai.rb rbVar = new util.h.xy.ai.rb();
        try {
            rbVar.m24846(i2);
            rbVar.m24847(bArr);
            rbVar.m24846(i2);
            rbVar.m24840(i);
            rbVar.m24836(bArr2);
            rbVar.m24843(iArr);
            int m24832 = rbVar.m24832();
            byte[] m24838 = rbVar.m24838();
            java.lang.System.arraycopy(m24838, 0, bArr2, 0, m24838.length);
            int[] m24844 = rbVar.m24844();
            java.lang.System.arraycopy(m24844, 0, iArr, 0, m24844.length);
            int i3 = getHighSpeedVideoFpsRangesFor;
            int i4 = ((i3 & 33) + (i3 | 33)) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i4;
            getHighSpeedVideoFpsRangesFor = (i4 + 33) % 128;
            return m24832;
        } catch (java.io.IOException unused) {
            return -1;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final int m27561(int i, byte[] bArr, int i2, byte[] bArr2, int[] iArr) {
        util.h.xy.ai.mc mcVar = new util.h.xy.ai.mc();
        try {
            mcVar.m24728(i);
            mcVar.m24722(bArr);
            mcVar.m24728(i);
            mcVar.m24726(i2);
            mcVar.m24727(bArr2);
            mcVar.m24729(iArr);
            int m24717 = mcVar.m24717();
            byte[] m24730 = mcVar.m24730();
            java.lang.System.arraycopy(m24730, 0, bArr2, 0, m24730.length);
            int[] m24731 = mcVar.m24731();
            java.lang.System.arraycopy(m24731, 0, iArr, 0, m24731.length);
            int i3 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = (i3 + 89) % 128;
            int i4 = i3 + 51;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 != 0) {
                return m24717;
            }
            throw null;
        } catch (java.io.IOException unused) {
            return -1;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final int m27564(byte[] bArr, int i, int i2, byte[] bArr2, int[] iArr) {
        util.h.xy.ai.d dVar = new util.h.xy.ai.d();
        try {
            dVar.m24649(i2);
            dVar.m24638(bArr);
            dVar.m24649(i2);
            dVar.m24641(i);
            dVar.m24650(bArr2);
            dVar.m24642(iArr);
            int m24634 = dVar.m24634();
            byte[] m24639 = dVar.m24639();
            java.lang.System.arraycopy(m24639, 0, bArr2, 0, m24639.length);
            int[] m24647 = dVar.m24647();
            java.lang.System.arraycopy(m24647, 0, iArr, 0, m24647.length);
            int i3 = getHighSpeedVideoFpsRangesFor;
            int i4 = ((i3 & 43) + (i3 | 43)) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i4;
            getHighSpeedVideoFpsRangesFor = (i4 + 77) % 128;
            getHighSpeedVideoFpsRangesFor = (i4 + 19) % 128;
            return m24634;
        } catch (java.io.IOException unused) {
            return -1;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final int m27569(byte[] bArr, int i, byte[] bArr2, int[] iArr, int i2) {
        util.h.xy.ai.c cVar = new util.h.xy.ai.c();
        try {
            cVar.m24622(i2);
            cVar.m24632(bArr);
            cVar.m24622(i2);
            cVar.m24627(i);
            cVar.m24626(bArr2);
            cVar.m24623(iArr);
            int m24633 = cVar.m24633();
            byte[] m24628 = cVar.m24628();
            java.lang.System.arraycopy(m24628, 0, bArr2, 0, m24628.length);
            int[] m24629 = cVar.m24629();
            java.lang.System.arraycopy(m24629, 0, iArr, 0, m24629.length);
            int i3 = getHighSpeedVideoFpsRangesFor;
            getHighResolutionOutputSizeshNQ4ISI = ((i3 & 71) + (i3 | 71)) % 128;
            return m24633;
        } catch (java.io.IOException unused) {
            return -1;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final int m27568(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, byte[] bArr4, int[] iArr) {
        util.h.xy.ai.e eVar = new util.h.xy.ai.e();
        try {
            eVar.m24668(bArr);
            eVar.m24667(i);
            eVar.m24675(bArr2);
            eVar.m24670(i2);
            eVar.m24661(bArr3);
            eVar.m24676(i3);
            eVar.m24671(bArr4);
            eVar.m24664(iArr);
            int m24658 = eVar.m24658();
            byte[] m24656 = eVar.m24656();
            java.lang.System.arraycopy(m24656, 0, bArr4, 0, m24656.length);
            int[] m24677 = eVar.m24677();
            java.lang.System.arraycopy(m24677, 0, iArr, 0, m24677.length);
            int i4 = getHighSpeedVideoFpsRangesFor;
            int i5 = (((i4 | 109) << 1) - (i4 ^ 109)) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i5;
            getHighSpeedVideoFpsRangesFor = ((i5 & 117) + (i5 | 117)) % 128;
            getHighSpeedVideoFpsRangesFor = (((i5 | 75) << 1) - (i5 ^ 75)) % 128;
            return m24658;
        } catch (java.io.IOException unused) {
            return -1;
        }
    }

    static int getHighSpeedVideoFpsRanges(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, byte[] bArr4, int[] iArr) {
        util.h.xy.ai.re reVar = new util.h.xy.ai.re();
        try {
            reVar.m24889(bArr);
            reVar.m24884(i);
            reVar.m24885(bArr2);
            reVar.m24875(i2);
            reVar.m24876(bArr3);
            reVar.m24870(i3);
            reVar.m24882(bArr4);
            reVar.m24890(iArr);
            int m24872 = reVar.m24872();
            byte[] m24886 = reVar.m24886();
            java.lang.System.arraycopy(m24886, 0, bArr4, 0, m24886.length);
            int[] m24871 = reVar.m24871();
            java.lang.System.arraycopy(m24871, 0, iArr, 0, m24871.length);
            int i4 = getHighSpeedVideoFpsRangesFor;
            int i5 = (i4 ^ 69) + ((i4 & 69) << 1);
            int i6 = i5 % 128;
            getHighResolutionOutputSizeshNQ4ISI = i6;
            if (i5 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            getHighSpeedVideoFpsRangesFor = ((i6 ^ 91) + ((i6 & 91) << 1)) % 128;
            return m24872;
        } catch (java.io.IOException unused) {
            return -1;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m27565(com.sun.jna.Pointer pointer, java.lang.String str) {
        try {
            util.h.xy.ai.rp rpVar = new util.h.xy.ai.rp();
            rpVar.m24947(pointer);
            rpVar.m24945(str);
            rpVar.m24946();
            int i = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = (((i | 55) << 1) - (i ^ 55)) % 128;
        } catch (java.io.IOException unused) {
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m27571() {
        try {
            new util.h.xy.ai.m().m24678();
            int i = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = ((i ^ 3) + ((i & 3) << 1)) % 128;
        } catch (java.lang.Exception unused) {
        }
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = (i2 & 13) + (i2 | 13);
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final int m27559(com.sun.jna.ptr.PointerByReference pointerByReference, com.sun.jna.Pointer pointer, java.lang.String str) {
        try {
            util.h.xy.ai.mn mnVar = new util.h.xy.ai.mn();
            mnVar.m24741();
            mnVar.m24743(pointer);
            mnVar.m24740(str);
            if (mnVar.m24744() == 1) {
                int i = getHighSpeedVideoFpsRangesFor;
                getHighResolutionOutputSizeshNQ4ISI = ((i ^ 61) + ((i & 61) << 1)) % 128;
                pointerByReference.setValue(mnVar.m24739());
            }
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = (((i2 | 45) << 1) - (i2 ^ 45)) % 128;
        } catch (java.lang.Exception unused) {
        }
        int i3 = getHighSpeedVideoFpsRangesFor;
        int i4 = (i3 & 101) + (i3 | 101);
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            return 1;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m27556(com.sun.jna.ptr.PointerByReference pointerByReference, com.sun.jna.Pointer pointer, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, util.h.xy.aj.ra.mb mbVar) {
        try {
            util.h.xy.ai.rl rlVar = new util.h.xy.ai.rl();
            rlVar.m24910();
            rlVar.m24913(pointer);
            rlVar.m24914(str);
            if (str2 != null) {
                int i2 = getHighSpeedVideoFpsRangesFor;
                getHighResolutionOutputSizeshNQ4ISI = ((i2 & 37) + (i2 | 37)) % 128;
                rlVar.m24904(str2);
            } else {
                rlVar.m24899((com.sun.jna.Pointer) null);
            }
            if (str3 != null) {
                int i3 = getHighSpeedVideoFpsRangesFor;
                int i4 = ((i3 | 81) << 1) - (i3 ^ 81);
                getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
                if (i4 % 2 != 0) {
                    rlVar.m24900(str3);
                    throw new java.lang.NullPointerException();
                }
                rlVar.m24900(str3);
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 89) % 128;
            } else {
                rlVar.m24908((com.sun.jna.Pointer) null);
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 75) % 128;
            }
            rlVar.m24903(i);
            rlVar.m24912(mbVar);
            if (rlVar.m24896() == 1) {
                int i5 = getHighResolutionOutputSizeshNQ4ISI;
                int i6 = ((i5 | 79) << 1) - (i5 ^ 79);
                getHighSpeedVideoFpsRangesFor = i6 % 128;
                if (i6 % 2 == 0) {
                    pointerByReference.setValue(rlVar.m24897());
                    throw new java.lang.NullPointerException();
                }
                pointerByReference.setValue(rlVar.m24897());
            } else {
                pointerByReference.setValue(null);
                int i7 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoFpsRangesFor = ((i7 & 17) + (i7 | 17)) % 128;
            }
            int i8 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = (((i8 | 57) << 1) - (i8 ^ 57)) % 128;
        } catch (java.lang.Exception unused) {
        }
        int i9 = getHighResolutionOutputSizeshNQ4ISI;
        int i10 = (i9 & 3) + (i9 | 3);
        getHighSpeedVideoFpsRangesFor = i10 % 128;
        if (i10 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final int m27552(com.sun.jna.Pointer pointer, int i, java.lang.String str, java.lang.String str2) {
        int i2;
        try {
            util.h.xy.ai.mq mqVar = new util.h.xy.ai.mq();
            mqVar.m24789(pointer);
            mqVar.m24781(i);
            mqVar.m24792(str);
            mqVar.m24782(str2);
            i2 = mqVar.m24779();
        } catch (java.lang.Exception unused) {
            i2 = 1;
        }
        int i3 = getHighSpeedVideoFpsRangesFor;
        int i4 = ((i3 | 63) << 1) - (i3 ^ 63);
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            return i2;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final int m27558(com.sun.jna.Pointer pointer, java.lang.String str) {
        try {
            util.h.xy.ai.o oVar = new util.h.xy.ai.o();
            oVar.m24803(pointer);
            oVar.m24796(str);
            int m24797 = oVar.m24797();
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 27) % 128;
            return m24797;
        } catch (java.lang.Exception unused) {
            return 1;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final int m27562(com.sun.jna.Pointer pointer, int i) {
        int i2;
        try {
            util.h.xy.ai.q qVar = new util.h.xy.ai.q();
            qVar.m24806(pointer);
            qVar.m24812(i);
            i2 = qVar.m24805();
        } catch (java.lang.Exception unused) {
            i2 = 1;
        }
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = ((i3 ^ 43) + ((i3 & 43) << 1)) % 128;
        return i2;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final int m27567(com.sun.jna.Pointer pointer, int i) {
        try {
            util.h.xy.ai.rn rnVar = new util.h.xy.ai.rn();
            rnVar.m24927(pointer);
            rnVar.m24921(i);
            int m24922 = rnVar.m24922();
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 23) % 128;
            return m24922;
        } catch (java.lang.Exception unused) {
            return 1;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final int m27563(com.sun.jna.Pointer pointer, int i, int i2) {
        int i3;
        try {
            util.h.xy.ai.ro roVar = new util.h.xy.ai.ro();
            roVar.m24937(pointer);
            roVar.m24932(i);
            roVar.m24934(i2);
            i3 = roVar.m24935();
        } catch (java.lang.Exception unused) {
            i3 = 1;
        }
        int i4 = getHighSpeedVideoFpsRangesFor + 29;
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            return i3;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab A[Catch: Exception -> 0x00dd, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00dd, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x0011, B:10:0x0034, B:12:0x003a, B:16:0x005a, B:18:0x0060, B:22:0x0088, B:24:0x008e, B:28:0x00ab, B:32:0x00c0, B:33:0x00da, B:37:0x00c4, B:39:0x00c7, B:40:0x00cc, B:44:0x00cf, B:47:0x0096, B:48:0x009b, B:52:0x009e, B:55:0x0064, B:56:0x0069, B:60:0x006c, B:62:0x003e, B:64:0x0022), top: B:1:0x0000 }] */
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m27555(com.sun.jna.Pointer pointer, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        util.h.xy.ai.mo moVar;
        int i;
        try {
            moVar = new util.h.xy.ai.mo();
            moVar.m24754(pointer);
            if (str == null || str.isEmpty()) {
                moVar.m24769((com.sun.jna.Pointer) null);
            } else {
                moVar.m24760(str);
                int i2 = getHighSpeedVideoFpsRangesFor;
                getHighResolutionOutputSizeshNQ4ISI = ((i2 ^ 47) + ((i2 & 47) << 1)) % 128;
            }
        } catch (java.lang.Exception unused) {
        }
        if (str2 != null) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = ((i3 ^ 95) + ((i3 & 95) << 1)) % 128;
            if (!str2.isEmpty()) {
                moVar.m24770(str2);
                if (str3 != null) {
                    int i4 = getHighResolutionOutputSizeshNQ4ISI;
                    int i5 = (i4 & 59) + (i4 | 59);
                    getHighSpeedVideoFpsRangesFor = i5 % 128;
                    if (i5 % 2 == 0) {
                        throw new java.lang.NullPointerException();
                    }
                    if (!str3.isEmpty()) {
                        moVar.m24755(str3);
                        if (str4 != null) {
                            int i6 = getHighResolutionOutputSizeshNQ4ISI + 107;
                            getHighSpeedVideoFpsRangesFor = i6 % 128;
                            if (i6 % 2 == 0) {
                                throw new java.lang.ArithmeticException();
                            }
                            if (!str4.isEmpty()) {
                                moVar.m24765(str4);
                                i = getHighResolutionOutputSizeshNQ4ISI + 37;
                                getHighSpeedVideoFpsRangesFor = i % 128;
                                if (str5 != null || str5.isEmpty()) {
                                    moVar.m24750(null);
                                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 65) % 128;
                                } else {
                                    int i7 = getHighSpeedVideoFpsRangesFor;
                                    int i8 = (i7 & 61) + (i7 | 61);
                                    getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
                                    if (i8 % 2 != 0) {
                                        moVar.m24777(str5);
                                        throw new java.lang.ArithmeticException();
                                    }
                                    moVar.m24777(str5);
                                }
                                moVar.m24772();
                                int i9 = getHighResolutionOutputSizeshNQ4ISI;
                                getHighSpeedVideoFpsRangesFor = ((i9 ^ 11) + ((i9 & 11) << 1)) % 128;
                            }
                        }
                        moVar.m24776((com.sun.jna.Pointer) null);
                        i = getHighResolutionOutputSizeshNQ4ISI + 125;
                        getHighSpeedVideoFpsRangesFor = i % 128;
                        if (str5 != null) {
                        }
                        moVar.m24750(null);
                        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 65) % 128;
                        moVar.m24772();
                        int i92 = getHighResolutionOutputSizeshNQ4ISI;
                        getHighSpeedVideoFpsRangesFor = ((i92 ^ 11) + ((i92 & 11) << 1)) % 128;
                    }
                }
                moVar.m24759((com.sun.jna.Pointer) null);
                int i10 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoFpsRangesFor = ((i10 & 107) + (i10 | 107)) % 128;
                if (str4 != null) {
                }
                moVar.m24776((com.sun.jna.Pointer) null);
                i = getHighResolutionOutputSizeshNQ4ISI + 125;
                getHighSpeedVideoFpsRangesFor = i % 128;
                if (str5 != null) {
                }
                moVar.m24750(null);
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 65) % 128;
                moVar.m24772();
                int i922 = getHighResolutionOutputSizeshNQ4ISI;
                getHighSpeedVideoFpsRangesFor = ((i922 ^ 11) + ((i922 & 11) << 1)) % 128;
            }
        }
        moVar.m24764((com.sun.jna.Pointer) null);
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 37) % 128;
        if (str3 != null) {
        }
        moVar.m24759((com.sun.jna.Pointer) null);
        int i102 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = ((i102 & 107) + (i102 | 107)) % 128;
        if (str4 != null) {
        }
        moVar.m24776((com.sun.jna.Pointer) null);
        i = getHighResolutionOutputSizeshNQ4ISI + 125;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (str5 != null) {
        }
        moVar.m24750(null);
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 65) % 128;
        moVar.m24772();
        int i9222 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = ((i9222 ^ 11) + ((i9222 & 11) << 1)) % 128;
    }
}
