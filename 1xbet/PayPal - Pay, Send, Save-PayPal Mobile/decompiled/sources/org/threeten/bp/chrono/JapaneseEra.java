package org.threeten.bp.chrono;

/* loaded from: classes18.dex */
public final class JapaneseEra extends org.threeten.bp.jdk8.DefaultInterfaceEra implements java.io.Serializable {
    public static final org.threeten.bp.chrono.JapaneseEra HEISEI;
    public static final org.threeten.bp.chrono.JapaneseEra MEIJI;
    public static final org.threeten.bp.chrono.JapaneseEra REIWA;
    public static final org.threeten.bp.chrono.JapaneseEra SHOWA;
    public static final org.threeten.bp.chrono.JapaneseEra TAISHO;
    private static final java.util.concurrent.atomic.AtomicReference<org.threeten.bp.chrono.JapaneseEra[]> getHighSpeedVideoSizes;
    private static final long serialVersionUID = 1466499369062886794L;
    private final int Camera2StreamConfigurationMap;
    final transient org.threeten.bp.LocalDate getHighResolutionOutputSizeshNQ4ISI;
    private final transient java.lang.String getHighSpeedVideoFpsRangesFor;

    static {
        org.threeten.bp.chrono.JapaneseEra japaneseEra = new org.threeten.bp.chrono.JapaneseEra(-1, org.threeten.bp.LocalDate.of(1868, 9, 8), "Meiji");
        MEIJI = japaneseEra;
        org.threeten.bp.chrono.JapaneseEra japaneseEra2 = new org.threeten.bp.chrono.JapaneseEra(0, org.threeten.bp.LocalDate.of(1912, 7, 30), "Taisho");
        TAISHO = japaneseEra2;
        org.threeten.bp.chrono.JapaneseEra japaneseEra3 = new org.threeten.bp.chrono.JapaneseEra(1, org.threeten.bp.LocalDate.of(1926, 12, 25), "Showa");
        SHOWA = japaneseEra3;
        org.threeten.bp.chrono.JapaneseEra japaneseEra4 = new org.threeten.bp.chrono.JapaneseEra(2, org.threeten.bp.LocalDate.of(1989, 1, 8), "Heisei");
        HEISEI = japaneseEra4;
        org.threeten.bp.chrono.JapaneseEra japaneseEra5 = new org.threeten.bp.chrono.JapaneseEra(3, org.threeten.bp.LocalDate.of(2019, 5, 1), "Reiwa");
        REIWA = japaneseEra5;
        getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>(new org.threeten.bp.chrono.JapaneseEra[]{japaneseEra, japaneseEra2, japaneseEra3, japaneseEra4, japaneseEra5});
    }

    private JapaneseEra(int i, org.threeten.bp.LocalDate localDate, java.lang.String str) {
        this.Camera2StreamConfigurationMap = i;
        this.getHighResolutionOutputSizeshNQ4ISI = localDate;
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    private java.lang.Object readResolve() throws java.io.ObjectStreamException {
        try {
            return of(this.Camera2StreamConfigurationMap);
        } catch (org.threeten.bp.DateTimeException e) {
            java.io.InvalidObjectException invalidObjectException = new java.io.InvalidObjectException("Invalid era");
            invalidObjectException.initCause(e);
            throw invalidObjectException;
        }
    }

    public static org.threeten.bp.chrono.JapaneseEra registerEra(org.threeten.bp.LocalDate localDate, java.lang.String str) {
        java.util.concurrent.atomic.AtomicReference<org.threeten.bp.chrono.JapaneseEra[]> atomicReference = getHighSpeedVideoSizes;
        org.threeten.bp.chrono.JapaneseEra[] japaneseEraArr = atomicReference.get();
        if (japaneseEraArr.length > 5) {
            throw new org.threeten.bp.DateTimeException("Only one additional Japanese era can be added");
        }
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(localDate, "since");
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(str, "name");
        if (!localDate.isAfter(REIWA.getHighResolutionOutputSizeshNQ4ISI)) {
            throw new org.threeten.bp.DateTimeException("Invalid since date for additional Japanese era, must be after Reiwa");
        }
        org.threeten.bp.chrono.JapaneseEra japaneseEra = new org.threeten.bp.chrono.JapaneseEra(4, localDate, str);
        org.threeten.bp.chrono.JapaneseEra[] japaneseEraArr2 = (org.threeten.bp.chrono.JapaneseEra[]) java.util.Arrays.copyOf(japaneseEraArr, 6);
        japaneseEraArr2[5] = japaneseEra;
        if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, japaneseEraArr, japaneseEraArr2)) {
            return japaneseEra;
        }
        throw new org.threeten.bp.DateTimeException("Only one additional Japanese era can be added");
    }

    public static org.threeten.bp.chrono.JapaneseEra of(int i) {
        org.threeten.bp.chrono.JapaneseEra[] japaneseEraArr = getHighSpeedVideoSizes.get();
        if (i < MEIJI.Camera2StreamConfigurationMap || i > japaneseEraArr[japaneseEraArr.length - 1].Camera2StreamConfigurationMap) {
            throw new org.threeten.bp.DateTimeException("japaneseEra is invalid");
        }
        return japaneseEraArr[i + 1];
    }

    public static org.threeten.bp.chrono.JapaneseEra valueOf(java.lang.String str) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(str, "japaneseEra");
        for (org.threeten.bp.chrono.JapaneseEra japaneseEra : getHighSpeedVideoSizes.get()) {
            if (str.equals(japaneseEra.getHighSpeedVideoFpsRangesFor)) {
                return japaneseEra;
            }
        }
        throw new java.lang.IllegalArgumentException("Era not found: ".concat(java.lang.String.valueOf(str)));
    }

    public static org.threeten.bp.chrono.JapaneseEra[] values() {
        org.threeten.bp.chrono.JapaneseEra[] japaneseEraArr = getHighSpeedVideoSizes.get();
        return (org.threeten.bp.chrono.JapaneseEra[]) java.util.Arrays.copyOf(japaneseEraArr, japaneseEraArr.length);
    }

    static org.threeten.bp.chrono.JapaneseEra Camera2StreamConfigurationMap(org.threeten.bp.LocalDate localDate) {
        if (localDate.isBefore(MEIJI.getHighResolutionOutputSizeshNQ4ISI)) {
            throw new org.threeten.bp.DateTimeException("Date too early: ".concat(java.lang.String.valueOf(localDate)));
        }
        org.threeten.bp.chrono.JapaneseEra[] japaneseEraArr = getHighSpeedVideoSizes.get();
        for (int length = japaneseEraArr.length - 1; length >= 0; length--) {
            org.threeten.bp.chrono.JapaneseEra japaneseEra = japaneseEraArr[length];
            if (localDate.compareTo((org.threeten.bp.chrono.ChronoLocalDate) japaneseEra.getHighResolutionOutputSizeshNQ4ISI) >= 0) {
                return japaneseEra;
            }
        }
        return null;
    }

    final org.threeten.bp.LocalDate Camera2StreamConfigurationMap() {
        int i = this.Camera2StreamConfigurationMap;
        int i2 = i + 1;
        org.threeten.bp.chrono.JapaneseEra[] values = values();
        if (i2 >= values.length - 1) {
            return org.threeten.bp.LocalDate.MAX;
        }
        return values[i + 2].getHighResolutionOutputSizeshNQ4ISI.minusDays(1L);
    }

    @Override // org.threeten.bp.chrono.Era
    public final int getValue() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField == org.threeten.bp.temporal.ChronoField.ERA) {
            return org.threeten.bp.chrono.JapaneseChronology.INSTANCE.range(org.threeten.bp.temporal.ChronoField.ERA);
        }
        return super.range(temporalField);
    }

    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.chrono.Ser((byte) 2, this);
    }

    static org.threeten.bp.chrono.JapaneseEra getHighSpeedVideoFpsRanges(java.io.DataInput dataInput) throws java.io.IOException {
        return of(dataInput.readByte());
    }
}
