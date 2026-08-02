package util.h.xy.bi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes18.dex */
public final class mb implements util.h.xy.bq.e {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static long getHighSpeedVideoFpsRanges = 0;
    private static final /* synthetic */ util.h.xy.bi.mb[] getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final java.lang.String f958;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.bi.mb f959;

    private mb(java.lang.String str) {
    }

    public static util.h.xy.bi.mb valueOf(java.lang.String str) {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        util.h.xy.bi.mb mbVar = (util.h.xy.bi.mb) java.lang.Enum.valueOf(util.h.xy.bi.mb.class, str);
        int i = getHighSpeedVideoSizes + 49;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            return mbVar;
        }
        throw new java.lang.ArithmeticException();
    }

    public static util.h.xy.bi.mb[] values() {
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 53) % 128;
        util.h.xy.bi.mb[] mbVarArr = (util.h.xy.bi.mb[]) getHighSpeedVideoFpsRangesFor.clone();
        int i = getHighSpeedVideoSizesFor + 59;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            return mbVarArr;
        }
        throw null;
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        int i = 0;
        int indexOf = android.text.TextUtils.indexOf("", "", 0) + 49927;
        char[] charArray = "괯港⬻\ue427ꄻ戋㼏\uf812".toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = indexOf;
        int length = charArray.length;
        long[] jArr = new long[length];
        loop0: while (true) {
            dVar.f2629 = 0;
            while (dVar.f2629 < charArray.length) {
                int i2 = getHighResolutionOutputSizeshNQ4ISI + 99;
                Camera2StreamConfigurationMap = i2 % 128;
                if (i2 % 2 == 0) {
                    break;
                }
                jArr[dVar.f2629] = ((-7508379876853140581L) ^ getHighSpeedVideoFpsRanges) ^ (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628));
                dVar.f2629++;
            }
            jArr[dVar.f2629] = (charArray[dVar.f2629] * (dVar.f2629 / dVar.f2628)) + ((-7508379876853140581L) | getHighSpeedVideoFpsRanges);
            int i3 = dVar.f2629;
        }
        char[] cArr = new char[length];
        while (true) {
            dVar.f2629 = i;
            if (dVar.f2629 >= charArray.length) {
                util.h.xy.bi.mb mbVar = new util.h.xy.bi.mb(new java.lang.String(cArr).intern());
                f959 = mbVar;
                int i4 = getHighSpeedVideoSizesFor;
                getHighSpeedVideoSizes = (i4 + 111) % 128;
                int i5 = (i4 + 117) % 128;
                getHighSpeedVideoSizes = i5;
                getHighSpeedVideoFpsRangesFor = new util.h.xy.bi.mb[]{mbVar};
                f958 = "mb";
                getHighSpeedVideoSizesFor = (i5 + 29) % 128;
                return;
            }
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 49) % 128;
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            i = dVar.f2629 + 1;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.payment.engine.TransactionContext m25495(byte[] bArr, byte[] bArr2) {
        byte[] m25090 = util.h.xy.ar.b.m25090(util.h.xy.ar.mb.m25107(f1013, bArr), util.h.xy.ar.mb.m25107(f1010, java.util.Arrays.copyOfRange(bArr2, 7, 13)), util.h.xy.ar.mb.m25107(f1009, java.util.Arrays.copyOfRange(bArr2, 21, 23)), util.h.xy.ar.mb.m25107(f1015, java.util.Arrays.copyOfRange(bArr2, 23, 26)), util.h.xy.ar.mb.m25107(f1004, java.util.Arrays.copyOfRange(bArr2, 26, 27)), util.h.xy.ar.mb.m25107(f1020, java.util.Arrays.copyOfRange(bArr2, 27, 28)));
        util.h.xy.ar.b.m25074(m25090);
        util.h.xy.bq.md mdVar = new util.h.xy.bq.md(m25090);
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 21) % 128;
        return mdVar;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.payment.engine.TransactionContext m25498(byte[] bArr, byte[] bArr2, boolean z) {
        byte[] m25090 = util.h.xy.ar.b.m25090(util.h.xy.ar.mb.m25107(f1013, bArr), util.h.xy.ar.mb.m25107(f1010, java.util.Arrays.copyOfRange(bArr2, 5, 11)), util.h.xy.ar.mb.m25107(f1009, java.util.Arrays.copyOfRange(bArr2, 24, 26)), util.h.xy.ar.mb.m25107(f1015, java.util.Arrays.copyOfRange(bArr2, 26, 28)), util.h.xy.ar.mb.m25107(f1004, java.util.Arrays.copyOfRange(bArr2, 29, 30)), util.h.xy.ar.mb.m25107(f1020, java.util.Arrays.copyOfRange(bArr2, 31, 32)));
        util.h.xy.ar.b.m25074(m25090);
        util.h.xy.bq.md mdVar = new util.h.xy.bq.md(m25090);
        getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 15) % 128;
        return mdVar;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.payment.engine.TransactionContext m25497(byte[] bArr, byte[] bArr2) {
        byte[] m25090 = util.h.xy.ar.b.m25090(util.h.xy.ar.mb.m25107(f1013, bArr), util.h.xy.ar.mb.m25107(f1010, java.util.Arrays.copyOfRange(bArr2, 11, 17)), util.h.xy.ar.mb.m25107(f1009, java.util.Arrays.copyOfRange(bArr2, 30, 32)), util.h.xy.ar.mb.m25107(f1015, java.util.Arrays.copyOfRange(bArr2, 32, 35)), util.h.xy.ar.mb.m25107(f1004, java.util.Arrays.copyOfRange(bArr2, 35, 36)), util.h.xy.ar.mb.m25107(f1020, java.util.Arrays.copyOfRange(bArr2, 36, 37)));
        util.h.xy.ar.b.m25074(m25090);
        util.h.xy.bq.md mdVar = new util.h.xy.bq.md(m25090);
        getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 65) % 128;
        return mdVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.payment.engine.TransactionContext m25496(byte[] bArr, byte[] bArr2, boolean z) {
        byte[] copyOfRange;
        byte[] copyOfRange2;
        byte[] bArr3;
        byte[] bArr4;
        getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 125) % 128;
        util.h.xy.ar.b.m25074(bArr);
        util.h.xy.ar.b.m25074(bArr2);
        byte[] copyOfRange3 = java.util.Arrays.copyOfRange(bArr2, 5, bArr2.length);
        util.h.xy.ar.b.m25074(copyOfRange3);
        byte[] copyOfRange4 = java.util.Arrays.copyOfRange(copyOfRange3, 0, 6);
        util.h.xy.ar.b.m25074(copyOfRange4);
        if (z) {
            byte[] copyOfRange5 = java.util.Arrays.copyOfRange(copyOfRange3, 17, 19);
            util.h.xy.ar.b.m25074(copyOfRange5);
            byte[] copyOfRange6 = java.util.Arrays.copyOfRange(copyOfRange3, 19, 22);
            util.h.xy.ar.b.m25074(copyOfRange6);
            copyOfRange = java.util.Arrays.copyOfRange(copyOfRange3, 22, 23);
            util.h.xy.ar.b.m25074(copyOfRange);
            copyOfRange2 = java.util.Arrays.copyOfRange(copyOfRange3, 23, 25);
            bArr3 = copyOfRange5;
            bArr4 = copyOfRange6;
        } else {
            getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 119) % 128;
            bArr3 = java.util.Arrays.copyOfRange(copyOfRange3, 19, 21);
            util.h.xy.ar.b.m25074(bArr3);
            bArr4 = java.util.Arrays.copyOfRange(copyOfRange3, 21, 24);
            util.h.xy.ar.b.m25074(bArr4);
            copyOfRange = java.util.Arrays.copyOfRange(copyOfRange3, 24, 25);
            util.h.xy.ar.b.m25074(copyOfRange);
            copyOfRange2 = java.util.Arrays.copyOfRange(copyOfRange3, 25, 27);
        }
        byte[] m25090 = util.h.xy.ar.b.m25090(util.h.xy.ar.mb.m25107(f1013, bArr), util.h.xy.ar.mb.m25107(f1010, copyOfRange4), util.h.xy.ar.mb.m25107(f1009, bArr3), util.h.xy.ar.mb.m25107(f1015, bArr4), util.h.xy.ar.mb.m25107(f1004, copyOfRange), util.h.xy.ar.mb.m25107(f1020, copyOfRange2));
        util.h.xy.ar.b.m25074(m25090);
        return new util.h.xy.bq.md(m25090);
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoFpsRanges = 4455059403528904445L;
    }
}
