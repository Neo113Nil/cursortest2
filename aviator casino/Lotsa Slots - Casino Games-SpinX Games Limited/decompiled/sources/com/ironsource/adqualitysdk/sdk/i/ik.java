package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ik<T> extends com.ironsource.adqualitysdk.sdk.i.cw implements com.ironsource.adqualitysdk.sdk.i.ch, com.ironsource.adqualitysdk.sdk.i.Cif<T> {

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f2534 = 0;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f2535 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.Cif f2541;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private java.lang.Object f2542;

    /* renamed from: ｋ, reason: contains not printable characters */
    private java.util.Collection f2543;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private java.lang.reflect.Field f2544;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private java.util.Map f2545;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f2540 = {44253, 17349, 29434, 24994, 4275, 1876, 13907, 9577, io.ktor.util.date.GMTDateParser.SECONDS, 61311, 56896, 52504, 48137, 44014, 39657, 35283, 'i', 61289, 56946, 52519, 48141, 44014, 39672, 'g', 61311, 56896, 52488, 48129, 44007, 39664, 35282, 'g', 61311, 56896, 52493, 48135, 44014, 39664, 35283, 30899, 26526, 22381, 18033, 13654, 'g', 61311, 56896, 52510, 48137, 44016, 39673, 35288, 30884, 17245, 44138, 40268, 36409, 65305, 59620, 55752, 51917, 15271, 9364, 5234, 1349, 30279, 26416, 20498, 43668, 17849, 29847, 26608, 5835, 371, 12346, 8975, 53864, 52567, 64944, 60655, 40844, 36603, 47576, 43060, 23300, 18975, 25964, 5201, 1214, 14291, 9890, 53733, 49355, 62270, 57878, 40219, 35919, 48970, 44984, 24219, 18933, 30914, 27592, 6703, 13589, 9267, 55139, 50758, 63157, 57746, 37091, 33770, 45705, 44334, 23576, 20323, 32345, 26948, 6561, 2271, 15294};

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static long f2539 = 8312691144628039450L;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char f2536 = 56503;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f2537 = 54626;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static char f2533 = 58328;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char f2538 = 10647;

    ik(java.lang.reflect.Field field, java.lang.Object obj, com.ironsource.adqualitysdk.sdk.i.Cif cif) {
        this.f2544 = field;
        this.f2542 = obj;
        this.f2541 = cif;
    }

    ik(java.util.Collection collection, java.lang.Object obj, com.ironsource.adqualitysdk.sdk.i.Cif cif) {
        this.f2543 = collection;
        this.f2542 = obj;
        this.f2541 = cif;
    }

    ik(java.util.Map map, java.lang.Object obj, com.ironsource.adqualitysdk.sdk.i.Cif cif) {
        this.f2545 = map;
        this.f2542 = obj;
        this.f2541 = cif;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.Cif
    /* renamed from: ｋ */
    public final T mo7963() {
        int i = 2 % 2;
        if (m8062()) {
            try {
                T t = (T) this.f2544.get(this.f2542);
                int i2 = f2535 + 49;
                f2534 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 53 / 0;
                }
                return t;
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        if ((!m8067()) && !m8063()) {
            return null;
        }
        T t2 = (T) this.f2542;
        int i4 = f2534 + 55;
        f2535 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return t2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m8066(T t) {
        int i = 2 % 2;
        if (m8062()) {
            int i2 = f2534 + 7;
            f2535 = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    this.f2544.set(this.f2542, t);
                    throw null;
                }
                this.f2544.set(this.f2542, t);
                int i3 = f2534 + 87;
                f2535 = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.Cif
    /* renamed from: ﾒ */
    public final java.lang.reflect.Field mo7964() {
        int i = 2 % 2;
        int i2 = f2535;
        int i3 = i2 + 125;
        f2534 = i3 % 128;
        int i4 = i3 % 2;
        java.lang.reflect.Field field = this.f2544;
        int i5 = i2 + 7;
        f2534 = i5 % 128;
        if (i5 % 2 == 0) {
            return field;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean m8062() {
        int i = 2 % 2;
        int i2 = f2534 + 113;
        int i3 = i2 % 128;
        f2535 = i3;
        int i4 = i2 % 2;
        if (this.f2544 == null) {
            return false;
        }
        int i5 = i3 + 91;
        f2534 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private boolean m8067() {
        int i = 2 % 2;
        int i2 = f2535;
        int i3 = i2 + 63;
        f2534 = i3 % 128;
        int i4 = i3 % 2;
        if (this.f2543 == null) {
            return false;
        }
        int i5 = i2 + 105;
        f2534 = i5 % 128;
        return true ^ (i5 % 2 != 0);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean m8063() {
        int i = 2 % 2;
        if (this.f2545 != null) {
            int i2 = f2534 + 81;
            f2535 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = f2535 + 85;
        f2534 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return false;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private java.util.Collection m8059() {
        int i = 2 % 2;
        int i2 = f2535;
        int i3 = i2 + 25;
        f2534 = i3 % 128;
        int i4 = i3 % 2;
        java.util.Collection collection = this.f2543;
        int i5 = i2 + 99;
        f2534 = i5 % 128;
        int i6 = i5 % 2;
        return collection;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private java.util.Map m8061() {
        int i = 2 % 2;
        int i2 = f2534 + 77;
        f2535 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f2545;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private com.ironsource.adqualitysdk.sdk.i.Cif m8060() {
        int i = 2 % 2;
        int i2 = f2534 + 23;
        int i3 = i2 % 128;
        f2535 = i3;
        int i4 = i2 % 2;
        com.ironsource.adqualitysdk.sdk.i.Cif cif = this.f2541;
        int i5 = i3 + 57;
        f2534 = i5 % 128;
        int i6 = i5 % 2;
        return cif;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private java.lang.Object m8058() {
        int i = 2 % 2;
        int i2 = f2535 + 43;
        int i3 = i2 % 128;
        f2534 = i3;
        int i4 = i2 % 2;
        java.lang.Object obj = this.f2542;
        int i5 = i3 + 115;
        f2535 = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0107, code lost:
    
        if (r17.equals(m8065("\u09d0鏵ᯧ㱢榱坞써Ⲵᙆ代ݧɺ", 12 - android.view.View.MeasureSpec.getSize(0)).intern()) != false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.ch
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo6378(com.ironsource.adqualitysdk.sdk.i.cl clVar, java.lang.String str, java.util.List<java.lang.Object> list, com.ironsource.adqualitysdk.sdk.i.ck ckVar, com.ironsource.adqualitysdk.sdk.i.ee eeVar) {
        char c;
        int i = 2 % 2;
        try {
            c = '\t';
            switch (str.hashCode()) {
                case -2039060844:
                    if (str.equals(m8064((char) (android.os.Process.myPid() >> 22), 31 - (android.view.KeyEvent.getMaxKeyCode() >> 16), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.SO).intern())) {
                        int i2 = f2535 + 23;
                        f2534 = i2 % 128;
                        int i3 = i2 % 2;
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1661939189:
                    if (str.equals(m8065("ﷂ퓼唖₰陶ꊕ똃졆곎ꤧ豖䕕", android.view.KeyEvent.getDeadChar(0, 0) + 11).intern())) {
                        break;
                    }
                    c = 65535;
                    break;
                case -1249356250:
                    if (str.equals(m8065("ﷂ퓼萝몏뼺礯", 6 - android.view.View.getDefaultSize(0, 0)).intern())) {
                        int i4 = f2535 + 37;
                        f2534 = i4 % 128;
                        int i5 = i4 % 2;
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 100472786:
                    if (str.equals(m8065("\u09d0鏵\ueac2쥥몪빕", (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4).intern())) {
                        int i6 = f2534 + 107;
                        f2535 = i6 % 128;
                        int i7 = i6 % 2;
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 429960040:
                    break;
                case 700591008:
                    if (str.equals(m8064((char) android.view.View.combineMeasuredStates(0, 0), (-16777172) - android.graphics.Color.rgb(0, 0, 0), 9 - android.graphics.Color.red(0)).intern())) {
                        int i8 = f2534 + 125;
                        f2535 = i8 % 128;
                        if (i8 % 2 != 0) {
                            c = '\b';
                            break;
                        } else {
                            c = 'I';
                            break;
                        }
                    }
                    c = 65535;
                    break;
                case 1406685743:
                    if (str.equals(m8064((char) android.view.KeyEvent.normalizeMetaState(0), 8 - android.text.TextUtils.getTrimmedLength(""), android.graphics.Color.alpha(0) + 8).intern())) {
                        int i9 = f2534 + 83;
                        f2535 = i9 % 128;
                        int i10 = i9 % 2;
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1953253188:
                    if (str.equals(m8064((char) android.view.View.getDefaultSize(0, 0), 23 - android.graphics.Color.argb(0, 0, 0, 0), 8 - android.view.View.resolveSizeAndState(0, 0, 0)).intern())) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1967798203:
                    if (str.equals(m8064((char) (android.view.KeyEvent.keyCodeFromString("") + 44218), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.Gravity.getAbsoluteGravity(0, 0) + 8).intern())) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 2058833392:
                    if (str.equals(m8064((char) ((-1) - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0)), 15 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 6 - android.os.Process.getGidForName("")).intern())) {
                        int i11 = f2535 + 45;
                        f2534 = i11 % 128;
                        if (i11 % 2 == 0) {
                            c = 2;
                            break;
                        }
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
        } catch (java.lang.Exception e) {
            e = e;
        }
        try {
        } catch (java.lang.Exception e2) {
            e = e2;
            java.lang.String m7200 = clVar.m7200();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m8064((char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 43729), 69 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 53).intern());
            sb.append(str);
            sb.append(m8065("棵溵", 1 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)).intern());
            com.ironsource.adqualitysdk.sdk.i.cn.m7265(m7200, sb.toString(), e);
            return null;
        }
        switch (c) {
            case 0:
                return mo7963();
            case 1:
                m8066(m7362(list, 0, java.lang.Object.class));
                return null;
            case 2:
                return java.lang.Boolean.valueOf(m8062());
            case 3:
                java.lang.reflect.Field mo7964 = mo7964();
                int i12 = f2535 + 89;
                f2534 = i12 % 128;
                int i13 = i12 % 2;
                return mo7964;
            case 4:
                return java.lang.Boolean.valueOf(m8067());
            case 5:
                return m8059();
            case 6:
                return java.lang.Boolean.valueOf(m8063());
            case 7:
                java.util.Map m8061 = m8061();
                int i14 = f2535 + 87;
                f2534 = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 84 / 0;
                }
                return m8061;
            case '\b':
                return m8060();
            case '\t':
                return m8058();
            default:
                try {
                    new com.ironsource.adqualitysdk.sdk.i.ds(clVar, eeVar, m8064((char) (17170 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)), 54 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 15 - android.view.Gravity.getAbsoluteGravity(0, 0)).intern(), str).m7590(clVar.m7200());
                } catch (java.lang.Exception e3) {
                    e = e3;
                    java.lang.String m72002 = clVar.m7200();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(m8064((char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 43729), 69 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 53).intern());
                    sb2.append(str);
                    sb2.append(m8065("棵溵", 1 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)).intern());
                    com.ironsource.adqualitysdk.sdk.i.cn.m7265(m72002, sb2.toString(), e);
                    return null;
                }
                return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static java.lang.String m8064(char c, int i, int i2) {
        java.lang.String str;
        synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1207) {
            char[] cArr = new char[i2];
            com.ironsource.adqualitysdk.sdk.i.c.f1208 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.c.f1208 < i2) {
                cArr[com.ironsource.adqualitysdk.sdk.i.c.f1208] = (char) ((f2540[com.ironsource.adqualitysdk.sdk.i.c.f1208 + i] ^ (com.ironsource.adqualitysdk.sdk.i.c.f1208 * f2539)) ^ c);
                com.ironsource.adqualitysdk.sdk.i.c.f1208++;
            }
            str = new java.lang.String(cArr);
        }
        return str;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m8065(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.o.f3104) {
            char[] cArr3 = new char[cArr2.length];
            com.ironsource.adqualitysdk.sdk.i.o.f3105 = 0;
            char[] cArr4 = new char[2];
            while (com.ironsource.adqualitysdk.sdk.i.o.f3105 < cArr2.length) {
                cArr4[0] = cArr2[com.ironsource.adqualitysdk.sdk.i.o.f3105];
                cArr4[1] = cArr2[com.ironsource.adqualitysdk.sdk.i.o.f3105 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f2536)) ^ ((c2 >>> 5) + f2533)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2537) ^ ((c3 + i2) ^ ((c3 << 4) + f2538))));
                    i2 -= 40503;
                }
                cArr3[com.ironsource.adqualitysdk.sdk.i.o.f3105] = cArr4[0];
                cArr3[com.ironsource.adqualitysdk.sdk.i.o.f3105 + 1] = cArr4[1];
                com.ironsource.adqualitysdk.sdk.i.o.f3105 += 2;
            }
            str2 = new java.lang.String(cArr3, 0, i);
        }
        return str2;
    }
}
