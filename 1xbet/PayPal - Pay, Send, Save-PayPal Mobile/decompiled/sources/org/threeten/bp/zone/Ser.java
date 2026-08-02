package org.threeten.bp.zone;

/* loaded from: classes18.dex */
final class Ser implements java.io.Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;
    private java.lang.Object Camera2StreamConfigurationMap;
    private byte getHighResolutionOutputSizeshNQ4ISI;

    public Ser() {
    }

    Ser(byte b, java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = b;
        this.Camera2StreamConfigurationMap = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        byte b = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object obj = this.Camera2StreamConfigurationMap;
        objectOutput.writeByte(b);
        if (b != 1) {
            if (b != 2) {
                if (b == 3) {
                    ((org.threeten.bp.zone.ZoneOffsetTransitionRule) obj).getHighSpeedVideoFpsRanges(objectOutput);
                    return;
                }
                throw new java.io.InvalidClassException("Unknown serialized type");
            }
            org.threeten.bp.zone.ZoneOffsetTransition zoneOffsetTransition = (org.threeten.bp.zone.ZoneOffsetTransition) obj;
            getHighResolutionOutputSizeshNQ4ISI(zoneOffsetTransition.toEpochSecond(), objectOutput);
            getHighResolutionOutputSizeshNQ4ISI(zoneOffsetTransition.Camera2StreamConfigurationMap, objectOutput);
            getHighResolutionOutputSizeshNQ4ISI(zoneOffsetTransition.getHighSpeedVideoFpsRanges, objectOutput);
            return;
        }
        org.threeten.bp.zone.StandardZoneRules standardZoneRules = (org.threeten.bp.zone.StandardZoneRules) obj;
        objectOutput.writeInt(standardZoneRules.getHighSpeedVideoFpsRanges.length);
        for (long j : standardZoneRules.getHighSpeedVideoFpsRanges) {
            getHighResolutionOutputSizeshNQ4ISI(j, objectOutput);
        }
        for (org.threeten.bp.ZoneOffset zoneOffset : standardZoneRules.Camera2StreamConfigurationMap) {
            getHighResolutionOutputSizeshNQ4ISI(zoneOffset, objectOutput);
        }
        objectOutput.writeInt(standardZoneRules.getHighSpeedVideoFpsRangesFor.length);
        for (long j2 : standardZoneRules.getHighSpeedVideoFpsRangesFor) {
            getHighResolutionOutputSizeshNQ4ISI(j2, objectOutput);
        }
        for (org.threeten.bp.ZoneOffset zoneOffset2 : standardZoneRules.getHighSpeedVideoSizes) {
            getHighResolutionOutputSizeshNQ4ISI(zoneOffset2, objectOutput);
        }
        objectOutput.writeByte(standardZoneRules.getHighResolutionOutputSizeshNQ4ISI.length);
        for (org.threeten.bp.zone.ZoneOffsetTransitionRule zoneOffsetTransitionRule : standardZoneRules.getHighResolutionOutputSizeshNQ4ISI) {
            zoneOffsetTransitionRule.getHighSpeedVideoFpsRanges(objectOutput);
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput objectInput) throws java.io.IOException, java.lang.ClassNotFoundException {
        byte readByte = objectInput.readByte();
        this.getHighResolutionOutputSizeshNQ4ISI = readByte;
        this.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(readByte, objectInput);
    }

    static java.lang.Object getHighSpeedVideoSizes(java.io.DataInput dataInput) throws java.io.IOException, java.lang.ClassNotFoundException {
        return Camera2StreamConfigurationMap(dataInput.readByte(), dataInput);
    }

    private static java.lang.Object Camera2StreamConfigurationMap(byte b, java.io.DataInput dataInput) throws java.io.IOException, java.lang.ClassNotFoundException {
        if (b == 1) {
            return org.threeten.bp.zone.StandardZoneRules.getHighSpeedVideoSizes(dataInput);
        }
        if (b == 2) {
            return org.threeten.bp.zone.ZoneOffsetTransition.getHighResolutionOutputSizeshNQ4ISI(dataInput);
        }
        if (b == 3) {
            return org.threeten.bp.zone.ZoneOffsetTransitionRule.getHighSpeedVideoFpsRanges(dataInput);
        }
        throw new java.io.StreamCorruptedException("Unknown serialized type");
    }

    private java.lang.Object readResolve() {
        return this.Camera2StreamConfigurationMap;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.ZoneOffset zoneOffset, java.io.DataOutput dataOutput) throws java.io.IOException {
        int totalSeconds = zoneOffset.getTotalSeconds();
        int i = totalSeconds % 900 == 0 ? totalSeconds / 900 : 127;
        dataOutput.writeByte(i);
        if (i == 127) {
            dataOutput.writeInt(totalSeconds);
        }
    }

    static org.threeten.bp.ZoneOffset getHighSpeedVideoFpsRangesFor(java.io.DataInput dataInput) throws java.io.IOException {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? org.threeten.bp.ZoneOffset.ofTotalSeconds(dataInput.readInt()) : org.threeten.bp.ZoneOffset.ofTotalSeconds(readByte * 900);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(long j, java.io.DataOutput dataOutput) throws java.io.IOException {
        if (j >= -4575744000L && j < 10413792000L && j % 900 == 0) {
            int i = (int) ((j + 4575744000L) / 900);
            dataOutput.writeByte((i >>> 16) & 255);
            dataOutput.writeByte((i >>> 8) & 255);
            dataOutput.writeByte(i & 255);
            return;
        }
        dataOutput.writeByte(255);
        dataOutput.writeLong(j);
    }

    static long getHighResolutionOutputSizeshNQ4ISI(java.io.DataInput dataInput) throws java.io.IOException {
        if ((dataInput.readByte() & 255) == 255) {
            return dataInput.readLong();
        }
        return ((((r0 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }
}
