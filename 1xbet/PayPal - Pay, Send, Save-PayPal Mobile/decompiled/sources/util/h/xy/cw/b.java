package util.h.xy.cw;

/* loaded from: classes5.dex */
abstract class b implements util.h.xy.da.ra {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    protected static final java.lang.Object getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static char[] getHighSpeedVideoSizesFor = null;
    private static int getOutputFormats = 0;
    private static int getOutputMinFrameDuration = 1;
    protected boolean Camera2StreamConfigurationMap;
    protected final util.h.xy.cx.ma getHighSpeedVideoSizes;
    private final java.lang.String getInputFormats;

    protected abstract void Camera2StreamConfigurationMap() throws util.h.xy.da.b;

    protected abstract byte[] Camera2StreamConfigurationMap(byte[] bArr) throws util.h.xy.da.b;

    protected abstract byte[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) throws util.h.xy.da.b;

    protected abstract void getHighSpeedVideoFpsRanges();

    protected abstract byte[] getHighSpeedVideoFpsRanges(byte[] bArr) throws util.h.xy.da.b;

    protected abstract int getHighSpeedVideoFpsRangesFor();

    protected abstract byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr) throws util.h.xy.da.b;

    protected abstract java.lang.String getHighSpeedVideoSizes();

    static {
        getInputFormats();
        getHighSpeedVideoFpsRanges = new java.lang.Object();
        getOutputMinFrameDuration = (getOutputFormats + 15) % 128;
    }

    b(java.lang.String str) {
        this.getInputFormats = str;
        this.getHighSpeedVideoSizes = new util.h.xy.cx.ma(getHighSpeedVideoSizes(), str);
    }

    @Override // util.h.xy.da.ra
    /* renamed from: ᐝ, reason: contains not printable characters */
    public final boolean mo26080() {
        boolean z;
        synchronized (getHighSpeedVideoFpsRanges) {
            z = this.Camera2StreamConfigurationMap;
        }
        return z;
    }

    protected final java.lang.String getHighSpeedVideoSizesFor() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getInputFormats);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(false, new int[]{0, 1, 0, 0}, "\u0001", objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(getHighSpeedVideoSizes());
        java.lang.String obj = sb.toString();
        int i = getOutputMinFrameDuration + 67;
        getOutputFormats = i % 128;
        if (i % 2 == 0) {
            return obj;
        }
        throw null;
    }

    @Override // util.h.xy.da.ra
    /* renamed from: ˎ, reason: contains not printable characters */
    public final void mo26077(byte[] bArr, byte[] bArr2) throws util.h.xy.da.b {
        if (!mo26080()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(true, new int[]{1, 54, 0, 33}, "\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001", objArr);
            throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern());
        }
        if (util.h.xy.cy.ma.m26119(bArr) || util.h.xy.cy.ma.m26119(bArr2)) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(false, new int[]{55, 46, 0, 0}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000", objArr2);
            throw new util.h.xy.da.b(((java.lang.String) objArr2[0]).intern(), 10301);
        }
        getHighSpeedVideoSizes(bArr);
        int i = getOutputFormats + 111;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            int length = bArr2.length;
            getHighSpeedVideoFpsRangesFor();
            throw null;
        }
        if (bArr2.length > getHighSpeedVideoFpsRangesFor()) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(true, new int[]{151, 55, 0, 3}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000", objArr3);
            throw new util.h.xy.da.b(((java.lang.String) objArr3[0]).intern());
        }
        int i2 = getOutputFormats + 97;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr);
        byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr2);
        synchronized (getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoSizes.m26099();
            try {
                this.getHighSpeedVideoSizes.m26104(highSpeedVideoFpsRanges, highResolutionOutputSizeshNQ4ISI);
            } finally {
                this.getHighSpeedVideoSizes.mo26102();
            }
        }
    }

    @Override // util.h.xy.da.ra
    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] mo26081(byte[] bArr) throws util.h.xy.da.b {
        byte[] Camera2StreamConfigurationMap;
        if (!mo26080()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(true, new int[]{1, 54, 0, 33}, "\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001", objArr);
            throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern());
        }
        if (util.h.xy.cy.ma.m26119(bArr)) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(false, new int[]{55, 46, 0, 0}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000", objArr2);
            throw new util.h.xy.da.b(((java.lang.String) objArr2[0]).intern(), 10307);
        }
        getHighSpeedVideoSizes(bArr);
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr);
        synchronized (getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoSizes.m26098();
            try {
                Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes.m26101(highSpeedVideoFpsRanges));
            } finally {
                this.getHighSpeedVideoSizes.mo26102();
            }
        }
        return Camera2StreamConfigurationMap;
    }

    @Override // util.h.xy.da.ra
    /* renamed from: ˏ, reason: contains not printable characters */
    public final java.util.ArrayList<byte[]> mo26078() throws util.h.xy.da.b {
        if (!mo26080()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(true, new int[]{1, 54, 0, 33}, "\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001", objArr);
            throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern());
        }
        java.util.ArrayList<byte[]> arrayList = new java.util.ArrayList<>();
        synchronized (getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoSizes.m26098();
            try {
                java.util.List<byte[]> m26100 = this.getHighSpeedVideoSizes.m26100();
                if (m26100 != null) {
                    java.util.Iterator<byte[]> it = m26100.iterator();
                    while (it.hasNext()) {
                        arrayList.add(getHighSpeedVideoFpsRangesFor(it.next()));
                    }
                }
            } finally {
                this.getHighSpeedVideoSizes.mo26102();
            }
        }
        return arrayList;
    }

    @Override // util.h.xy.da.ra
    /* renamed from: ˎ, reason: contains not printable characters */
    public final void mo26076(byte[] bArr) throws util.h.xy.da.b {
        if (!mo26080()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(true, new int[]{1, 54, 0, 33}, "\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001", objArr);
            throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern());
        }
        if (util.h.xy.cy.ma.m26119(bArr)) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(false, new int[]{55, 46, 0, 0}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000", objArr2);
            throw new util.h.xy.da.b(((java.lang.String) objArr2[0]).intern(), 10307);
        }
        getHighSpeedVideoSizes(bArr);
        byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr);
        synchronized (getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoSizes.m26099();
            try {
                this.getHighSpeedVideoSizes.m26103(highSpeedVideoFpsRanges);
            } finally {
                this.getHighSpeedVideoSizes.mo26102();
            }
        }
    }

    @Override // util.h.xy.da.ra
    /* renamed from: ˋ, reason: contains not printable characters */
    public final void mo26075() throws util.h.xy.da.b {
        synchronized (getHighSpeedVideoFpsRanges) {
            getHighSpeedVideoSizesFor();
            Camera2StreamConfigurationMap();
            this.getHighSpeedVideoSizes.m26099();
            try {
                this.getHighSpeedVideoSizes.m26097();
                this.getHighSpeedVideoSizes.mo26102();
                mo26074();
            } catch (java.lang.Throwable th) {
                this.getHighSpeedVideoSizes.mo26102();
                throw th;
            }
        }
    }

    @Override // util.h.xy.da.ra
    /* renamed from: ˊ, reason: contains not printable characters */
    public final void mo26074() {
        synchronized (getHighSpeedVideoFpsRanges) {
            this.Camera2StreamConfigurationMap = false;
            getHighSpeedVideoFpsRanges();
        }
    }

    private static void getHighSpeedVideoFpsRanges(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 105;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = getHighSpeedVideoSizesFor;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
                cArr2[i6] = (char) (cArr[i6] ^ (-8125198844289309347L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        java.lang.System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bytes != null) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 93) % 128;
            char[] cArr4 = new char[i3];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i3) {
                if (bytes[maVar.f2631] == 1) {
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 103) % 128;
            char[] cArr5 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i7 = i3 - i5;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i7, i5);
            java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i7);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            maVar.f2631 = 0;
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 85) % 128;
            while (maVar.f2631 < i3) {
                int i8 = getHighSpeedVideoFpsRangesFor + 55;
                getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = maVar.f2631;
                    int i10 = maVar.f2631;
                    throw new java.lang.ArithmeticException();
                }
                cArr6[maVar.f2631] = cArr3[(i3 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            maVar.f2631 = 0;
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 111) % 128;
            while (maVar.f2631 < i3) {
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 47) % 128;
        objArr[0] = str2;
    }

    @Override // util.h.xy.da.ra
    /* renamed from: ͺ, reason: contains not printable characters */
    public final boolean mo26079() throws util.h.xy.da.b {
        boolean m26105;
        android.content.Context m26264 = util.h.xy.da.mc.m26262().m26264();
        synchronized (getHighSpeedVideoFpsRanges) {
            m26105 = this.getHighSpeedVideoSizes.m26105(m26264);
        }
        return m26105;
    }

    private static void getHighSpeedVideoSizes(byte[] bArr) throws util.h.xy.da.b {
        int i = getOutputMinFrameDuration;
        getOutputFormats = (i + 33) % 128;
        if (bArr.length > 64) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(false, new int[]{101, 50, 0, 0}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000", objArr);
            throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern());
        }
        int i2 = i + 55;
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static void getInputFormats() {
        getHighSpeedVideoSizesFor = new char[]{42354, 42351, 42289, 42295, 42302, 42293, 42243, 42338, 42260, 42289, 42284, 42288, 42298, 42268, 42257, 42287, 42285, 42284, 42292, 42294, 42287, 42286, 42289, 42268, 42260, 42291, 42265, 42271, 42299, 42297, 42292, 42285, 42284, 42302, 42246, 42292, 42294, 42291, 42289, 42292, 42267, 42266, 42292, 42295, 42290, 42266, 42271, 42299, 42291, 42263, 42267, 42289, 42299, 42303, 42268, 42367, 42250, 42291, 42291, 42299, 42294, 42260, 42266, 42291, 42292, 42271, 42266, 42295, 42270, 42257, 42281, 42287, 42286, 42260, 42261, 42293, 42292, 42292, 42298, 42292, 42289, 42289, 42294, 42287, 42260, 42265, 42291, 42260, 42271, 42292, 42291, 42287, 42283, 42257, 42266, 42285, 42260, 42266, 42284, 42285, 42289, 42360, 42245, 42290, 42257, 42267, 42293, 42292, 42295, 42288, 42291, 42265, 42271, 42291, 42288, 42297, 42296, 42297, 42294, 42260, 42263, 42291, 42299, 42271, 42267, 42298, 42289, 42285, 42294, 42284, 42284, 42267, 42267, 42293, 42292, 42295, 42288, 42291, 42265, 42266, 42295, 42270, 42358, 42344, 42359, 42268, 42288, 42283, 42289, 42289, 42263, 42347, 42299, 42246, 42342, 42263, 42289, 42289, 42283, 42288, 42268, 42348, 42267, 42339, 42348, 42350, 42359, 42270, 42295, 42266, 42265, 42291, 42288, 42295, 42292, 42293, 42267, 42267, 42284, 42284, 42294, 42285, 42289, 42298, 42267, 42271, 42299, 42291, 42263, 42260, 42294, 42297, 42296, 42297, 42288, 42291, 42271, 42265, 42291, 42288, 42295, 42292, 42293, 42267, 42271, 42288};
    }
}
