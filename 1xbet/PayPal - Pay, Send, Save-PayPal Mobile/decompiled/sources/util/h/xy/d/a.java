package util.h.xy.d;

/* loaded from: classes5.dex */
public final class a implements com.gemalto.mfs.mwsdk.dcm.Aid {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private final int Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus getHighSpeedVideoSizes;
    private final java.lang.String getOutputFormats;

    /* loaded from: classes18.dex */
    public static final class b implements java.util.Comparator<util.h.xy.d.a> {
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoFpsRanges = 1;

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(util.h.xy.d.a aVar, util.h.xy.d.a aVar2) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 121) % 128;
            int m26130 = m26130(aVar, aVar2);
            int i = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = ((i & 55) + (i | 55)) % 128;
            return m26130;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public final int m26130(util.h.xy.d.a aVar, util.h.xy.d.a aVar2) {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRanges = ((i & 101) + (i | 101)) % 128;
            int m26129 = aVar.m26129();
            int i2 = -aVar2.m26129();
            int identityHashCode = java.lang.System.identityHashCode(this);
            int i3 = i2 * 51;
            int i4 = -(-(m26129 * (-49)));
            int i5 = ~i2;
            int i6 = ~m26129;
            int i7 = (i5 ^ i6) | (i5 & i6);
            int i8 = ~((i7 ^ identityHashCode) | (i7 & identityHashCode));
            int i9 = ~identityHashCode;
            int i10 = (i6 & i9) | (i6 ^ i9);
            int i11 = ~((i10 & i2) | (i10 ^ i2));
            int i12 = -(-(((i8 ^ i11) | (i11 & i8)) * 50));
            int i13 = ~i10;
            int i14 = ~(i6 | i2);
            int i15 = (i14 ^ i13) | (i13 & i14);
            int i16 = ~((i9 ^ i2) | (i2 & i9));
            int i17 = getHighSpeedVideoFpsRanges;
            int i18 = ((i17 | 65) << 1) - (i17 ^ 65);
            getHighResolutionOutputSizeshNQ4ISI = i18 % 128;
            if (i18 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return ((((((i3 | i4) << 1) - (i3 ^ i4)) + ((i2 | identityHashCode) * (-50))) - (~i12)) - 1) + (((i15 ^ i16) | (i15 & i16)) * 50);
        }
    }

    public a(java.lang.String str, java.lang.String str2, int i, com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus lockStatus) {
        this.getOutputFormats = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.Camera2StreamConfigurationMap = i;
        if (lockStatus == null) {
            this.getHighSpeedVideoSizes = com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus.UNLOCKED;
        } else {
            this.getHighSpeedVideoSizes = lockStatus;
        }
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.Aid
    public final java.lang.String getAid() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = ((i ^ 7) + ((i & 7) << 1)) % 128;
        getHighSpeedVideoFpsRangesFor = i2;
        java.lang.String str = this.getOutputFormats;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 99) % 128;
        return str;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final int m26129() {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 15) % 128;
        getHighSpeedVideoFpsRangesFor = i;
        int i2 = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI = (((i | 43) << 1) - (i ^ 43)) % 128;
        return i2;
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.Aid
    public final java.lang.String getLabel() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 111) << 1) - (i ^ 111);
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i3 & 31) + (i3 | 31)) % 128;
        return str;
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.Aid
    public final com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus getLockStatus() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoFpsRangesFor = (i + 23) % 128;
        com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus lockStatus = this.getHighSpeedVideoSizes;
        int i2 = (i & 17) + (i | 17);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return lockStatus;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.gemalto.mfs.mwsdk.dcm.Aid
    public final void setLockStatus(com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus lockStatus) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (i & 33) + (i | 33);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        if (i2 % 2 == 0) {
            this.getHighSpeedVideoSizes = lockStatus;
            int i4 = i3 + 91;
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.getHighSpeedVideoSizes = lockStatus;
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (((i | 5) << 1) - (i ^ 5)) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        if (this == obj) {
            getHighSpeedVideoFpsRangesFor = (i2 + 7) % 128;
            return true;
        }
        if (obj instanceof com.gemalto.mfs.mwsdk.dcm.Aid) {
            boolean equals = this.getOutputFormats.equals(((util.h.xy.d.a) obj).getOutputFormats);
            int i3 = getHighSpeedVideoFpsRangesFor;
            getHighResolutionOutputSizeshNQ4ISI = (((i3 | 17) << 1) - (i3 ^ 17)) % 128;
            return equals;
        }
        int i4 = (i2 ^ 101) + ((i2 & 101) << 1);
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        return i4 % 2 != 0;
    }

    public final int hashCode() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 117;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            return java.util.Objects.hash(this.getOutputFormats);
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        objArr[0] = this.getOutputFormats;
        return java.util.Objects.hash(objArr);
    }
}
