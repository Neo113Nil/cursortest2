package org.threeten.bp.chrono;

/* loaded from: classes18.dex */
final class Ser implements java.io.Externalizable {
    private static final long serialVersionUID = 7857518227608961174L;
    private byte getHighSpeedVideoFpsRangesFor;
    private java.lang.Object getHighSpeedVideoSizes;

    public Ser() {
    }

    Ser(byte b, java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = b;
        this.getHighSpeedVideoSizes = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(java.io.ObjectOutput objectOutput) throws java.io.IOException {
        byte b = this.getHighSpeedVideoFpsRangesFor;
        java.lang.Object obj = this.getHighSpeedVideoSizes;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                org.threeten.bp.chrono.JapaneseDate japaneseDate = (org.threeten.bp.chrono.JapaneseDate) obj;
                objectOutput.writeInt(japaneseDate.get(org.threeten.bp.temporal.ChronoField.YEAR));
                objectOutput.writeByte(japaneseDate.get(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(japaneseDate.get(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH));
                return;
            case 2:
                objectOutput.writeByte(((org.threeten.bp.chrono.JapaneseEra) obj).getValue());
                return;
            case 3:
                org.threeten.bp.chrono.HijrahDate hijrahDate = (org.threeten.bp.chrono.HijrahDate) obj;
                objectOutput.writeInt(hijrahDate.get(org.threeten.bp.temporal.ChronoField.YEAR));
                objectOutput.writeByte(hijrahDate.get(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(hijrahDate.get(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH));
                return;
            case 4:
                objectOutput.writeByte(((org.threeten.bp.chrono.HijrahEra) obj).getValue());
                return;
            case 5:
                org.threeten.bp.chrono.MinguoDate minguoDate = (org.threeten.bp.chrono.MinguoDate) obj;
                objectOutput.writeInt(minguoDate.get(org.threeten.bp.temporal.ChronoField.YEAR));
                objectOutput.writeByte(minguoDate.get(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(minguoDate.get(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH));
                return;
            case 6:
                objectOutput.writeByte(((org.threeten.bp.chrono.MinguoEra) obj).getValue());
                return;
            case 7:
                org.threeten.bp.chrono.ThaiBuddhistDate thaiBuddhistDate = (org.threeten.bp.chrono.ThaiBuddhistDate) obj;
                objectOutput.writeInt(thaiBuddhistDate.get(org.threeten.bp.temporal.ChronoField.YEAR));
                objectOutput.writeByte(thaiBuddhistDate.get(org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(thaiBuddhistDate.get(org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH));
                return;
            case 8:
                objectOutput.writeByte(((org.threeten.bp.chrono.ThaiBuddhistEra) obj).getValue());
                return;
            case 9:
            case 10:
            default:
                throw new java.io.InvalidClassException("Unknown serialized type");
            case 11:
                objectOutput.writeUTF(((org.threeten.bp.chrono.Chronology) obj).getId());
                return;
            case 12:
                org.threeten.bp.chrono.ChronoLocalDateTimeImpl chronoLocalDateTimeImpl = (org.threeten.bp.chrono.ChronoLocalDateTimeImpl) obj;
                objectOutput.writeObject(chronoLocalDateTimeImpl.getHighSpeedVideoSizes);
                objectOutput.writeObject(chronoLocalDateTimeImpl.getHighResolutionOutputSizeshNQ4ISI);
                return;
            case 13:
                org.threeten.bp.chrono.ChronoZonedDateTimeImpl chronoZonedDateTimeImpl = (org.threeten.bp.chrono.ChronoZonedDateTimeImpl) obj;
                objectOutput.writeObject(chronoZonedDateTimeImpl.Camera2StreamConfigurationMap);
                objectOutput.writeObject(chronoZonedDateTimeImpl.getHighResolutionOutputSizeshNQ4ISI);
                objectOutput.writeObject(chronoZonedDateTimeImpl.getHighSpeedVideoFpsRangesFor);
                return;
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(java.io.ObjectInput objectInput) throws java.io.IOException, java.lang.ClassNotFoundException {
        java.lang.Object highSpeedVideoFpsRanges;
        byte readByte = objectInput.readByte();
        this.getHighSpeedVideoFpsRangesFor = readByte;
        switch (readByte) {
            case 1:
                highSpeedVideoFpsRanges = org.threeten.bp.chrono.JapaneseDate.getHighSpeedVideoFpsRanges(objectInput);
                break;
            case 2:
                highSpeedVideoFpsRanges = org.threeten.bp.chrono.JapaneseEra.getHighSpeedVideoFpsRanges(objectInput);
                break;
            case 3:
                highSpeedVideoFpsRanges = org.threeten.bp.chrono.HijrahDate.getHighSpeedVideoSizes(objectInput);
                break;
            case 4:
                highSpeedVideoFpsRanges = org.threeten.bp.chrono.HijrahEra.getHighSpeedVideoFpsRanges(objectInput);
                break;
            case 5:
                highSpeedVideoFpsRanges = org.threeten.bp.chrono.MinguoDate.getHighSpeedVideoFpsRangesFor(objectInput);
                break;
            case 6:
                highSpeedVideoFpsRanges = org.threeten.bp.chrono.MinguoEra.getHighSpeedVideoSizes(objectInput);
                break;
            case 7:
                highSpeedVideoFpsRanges = org.threeten.bp.chrono.ThaiBuddhistDate.getHighSpeedVideoFpsRanges(objectInput);
                break;
            case 8:
                highSpeedVideoFpsRanges = org.threeten.bp.chrono.ThaiBuddhistEra.getHighSpeedVideoFpsRanges(objectInput);
                break;
            case 9:
            case 10:
            default:
                throw new java.io.StreamCorruptedException("Unknown serialized type");
            case 11:
                highSpeedVideoFpsRanges = org.threeten.bp.chrono.Chronology.getHighResolutionOutputSizeshNQ4ISI(objectInput);
                break;
            case 12:
                highSpeedVideoFpsRanges = org.threeten.bp.chrono.ChronoLocalDateTimeImpl.getHighResolutionOutputSizeshNQ4ISI(objectInput);
                break;
            case 13:
                highSpeedVideoFpsRanges = org.threeten.bp.chrono.ChronoZonedDateTimeImpl.getHighSpeedVideoFpsRangesFor(objectInput);
                break;
        }
        this.getHighSpeedVideoSizes = highSpeedVideoFpsRanges;
    }

    private java.lang.Object readResolve() {
        return this.getHighSpeedVideoSizes;
    }
}
