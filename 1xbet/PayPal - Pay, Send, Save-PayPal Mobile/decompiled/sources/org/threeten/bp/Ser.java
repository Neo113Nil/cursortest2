package org.threeten.bp;

/* loaded from: classes18.dex */
final class Ser implements java.io.Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    private byte getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.Object getHighSpeedVideoFpsRangesFor;

    public Ser() {
    }

    Ser(byte b, java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = b;
        this.getHighSpeedVideoFpsRangesFor = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        byte b = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor;
        objectOutput.writeByte(b);
        if (b != 64) {
            switch (b) {
                case 1:
                    org.threeten.bp.Duration duration = (org.threeten.bp.Duration) obj;
                    objectOutput.writeLong(duration.getHighSpeedVideoSizes);
                    objectOutput.writeInt(duration.getHighSpeedVideoFpsRanges);
                    return;
                case 2:
                    org.threeten.bp.Instant instant = (org.threeten.bp.Instant) obj;
                    objectOutput.writeLong(instant.Camera2StreamConfigurationMap);
                    objectOutput.writeInt(instant.getHighResolutionOutputSizeshNQ4ISI);
                    return;
                case 3:
                    org.threeten.bp.LocalDate localDate = (org.threeten.bp.LocalDate) obj;
                    objectOutput.writeInt(localDate.getHighSpeedVideoFpsRangesFor);
                    objectOutput.writeByte(localDate.Camera2StreamConfigurationMap);
                    objectOutput.writeByte(localDate.getHighSpeedVideoSizes);
                    return;
                case 4:
                    ((org.threeten.bp.LocalDateTime) obj).Camera2StreamConfigurationMap(objectOutput);
                    return;
                case 5:
                    ((org.threeten.bp.LocalTime) obj).Camera2StreamConfigurationMap(objectOutput);
                    return;
                case 6:
                    org.threeten.bp.ZonedDateTime zonedDateTime = (org.threeten.bp.ZonedDateTime) obj;
                    zonedDateTime.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(objectOutput);
                    zonedDateTime.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(objectOutput);
                    zonedDateTime.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(objectOutput);
                    return;
                case 7:
                    objectOutput.writeUTF(((org.threeten.bp.ZoneRegion) obj).getHighSpeedVideoFpsRangesFor);
                    return;
                case 8:
                    ((org.threeten.bp.ZoneOffset) obj).getHighSpeedVideoFpsRangesFor(objectOutput);
                    return;
                default:
                    switch (b) {
                        case 66:
                            org.threeten.bp.OffsetTime offsetTime = (org.threeten.bp.OffsetTime) obj;
                            offsetTime.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(objectOutput);
                            offsetTime.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(objectOutput);
                            return;
                        case 67:
                            objectOutput.writeInt(((org.threeten.bp.Year) obj).getHighSpeedVideoFpsRangesFor);
                            return;
                        case 68:
                            org.threeten.bp.YearMonth yearMonth = (org.threeten.bp.YearMonth) obj;
                            objectOutput.writeInt(yearMonth.getHighResolutionOutputSizeshNQ4ISI);
                            objectOutput.writeByte(yearMonth.Camera2StreamConfigurationMap);
                            return;
                        case 69:
                            org.threeten.bp.OffsetDateTime offsetDateTime = (org.threeten.bp.OffsetDateTime) obj;
                            offsetDateTime.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(objectOutput);
                            offsetDateTime.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(objectOutput);
                            return;
                        default:
                            throw new java.io.InvalidClassException("Unknown serialized type");
                    }
            }
        }
        org.threeten.bp.MonthDay monthDay = (org.threeten.bp.MonthDay) obj;
        objectOutput.writeByte(monthDay.Camera2StreamConfigurationMap);
        objectOutput.writeByte(monthDay.getHighSpeedVideoSizes);
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput objectInput) throws java.io.IOException {
        byte readByte = objectInput.readByte();
        this.getHighResolutionOutputSizeshNQ4ISI = readByte;
        this.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap(readByte, objectInput);
    }

    static java.lang.Object Camera2StreamConfigurationMap(java.io.DataInput dataInput) throws java.io.IOException {
        return Camera2StreamConfigurationMap(dataInput.readByte(), dataInput);
    }

    private static java.lang.Object Camera2StreamConfigurationMap(byte b, java.io.DataInput dataInput) throws java.io.IOException {
        if (b != 64) {
            switch (b) {
                case 1:
                    return org.threeten.bp.Duration.getHighSpeedVideoFpsRangesFor(dataInput);
                case 2:
                    return org.threeten.bp.Instant.getHighResolutionOutputSizeshNQ4ISI(dataInput);
                case 3:
                    return org.threeten.bp.LocalDate.getHighSpeedVideoFpsRangesFor(dataInput);
                case 4:
                    return org.threeten.bp.LocalDateTime.getHighSpeedVideoFpsRangesFor(dataInput);
                case 5:
                    return org.threeten.bp.LocalTime.getHighSpeedVideoFpsRangesFor(dataInput);
                case 6:
                    return org.threeten.bp.ZonedDateTime.getHighSpeedVideoFpsRanges(dataInput);
                case 7:
                    return org.threeten.bp.ZoneRegion.Camera2StreamConfigurationMap(dataInput);
                case 8:
                    return org.threeten.bp.ZoneOffset.getHighSpeedVideoFpsRanges(dataInput);
                default:
                    switch (b) {
                        case 66:
                            return org.threeten.bp.OffsetTime.Camera2StreamConfigurationMap(dataInput);
                        case 67:
                            return org.threeten.bp.Year.getHighSpeedVideoSizes(dataInput);
                        case 68:
                            return org.threeten.bp.YearMonth.getHighSpeedVideoFpsRanges(dataInput);
                        case 69:
                            return org.threeten.bp.OffsetDateTime.Camera2StreamConfigurationMap(dataInput);
                        default:
                            throw new java.io.StreamCorruptedException("Unknown serialized type");
                    }
            }
        }
        return org.threeten.bp.MonthDay.getHighSpeedVideoSizes(dataInput);
    }

    private java.lang.Object readResolve() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
