package org.threeten.bp.zone;

/* loaded from: classes18.dex */
final class StandardZoneRules extends org.threeten.bp.zone.ZoneRules implements java.io.Serializable {
    private static final long serialVersionUID = 3044319355680032515L;
    final org.threeten.bp.ZoneOffset[] Camera2StreamConfigurationMap;
    final org.threeten.bp.zone.ZoneOffsetTransitionRule[] getHighResolutionOutputSizeshNQ4ISI;
    final long[] getHighSpeedVideoFpsRanges;
    final long[] getHighSpeedVideoFpsRangesFor;
    final org.threeten.bp.ZoneOffset[] getHighSpeedVideoSizes;
    private final org.threeten.bp.LocalDateTime[] getHighSpeedVideoSizesFor;
    private final java.util.concurrent.ConcurrentMap<java.lang.Integer, org.threeten.bp.zone.ZoneOffsetTransition[]> getInputFormats = new java.util.concurrent.ConcurrentHashMap();

    StandardZoneRules(org.threeten.bp.ZoneOffset zoneOffset, org.threeten.bp.ZoneOffset zoneOffset2, java.util.List<org.threeten.bp.zone.ZoneOffsetTransition> list, java.util.List<org.threeten.bp.zone.ZoneOffsetTransition> list2, java.util.List<org.threeten.bp.zone.ZoneOffsetTransitionRule> list3) {
        this.getHighSpeedVideoFpsRanges = new long[list.size()];
        org.threeten.bp.ZoneOffset[] zoneOffsetArr = new org.threeten.bp.ZoneOffset[list.size() + 1];
        this.Camera2StreamConfigurationMap = zoneOffsetArr;
        zoneOffsetArr[0] = zoneOffset;
        int i = 0;
        while (i < list.size()) {
            this.getHighSpeedVideoFpsRanges[i] = list.get(i).toEpochSecond();
            int i2 = i + 1;
            this.Camera2StreamConfigurationMap[i2] = list.get(i).getOffsetAfter();
            i = i2;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(zoneOffset2);
        for (org.threeten.bp.zone.ZoneOffsetTransition zoneOffsetTransition : list2) {
            if (zoneOffsetTransition.isGap()) {
                arrayList.add(zoneOffsetTransition.getDateTimeBefore());
                arrayList.add(zoneOffsetTransition.getDateTimeAfter());
            } else {
                arrayList.add(zoneOffsetTransition.getDateTimeAfter());
                arrayList.add(zoneOffsetTransition.getDateTimeBefore());
            }
            arrayList2.add(zoneOffsetTransition.getOffsetAfter());
        }
        this.getHighSpeedVideoSizesFor = (org.threeten.bp.LocalDateTime[]) arrayList.toArray(new org.threeten.bp.LocalDateTime[arrayList.size()]);
        this.getHighSpeedVideoSizes = (org.threeten.bp.ZoneOffset[]) arrayList2.toArray(new org.threeten.bp.ZoneOffset[arrayList2.size()]);
        this.getHighSpeedVideoFpsRangesFor = new long[list2.size()];
        for (int i3 = 0; i3 < list2.size(); i3++) {
            this.getHighSpeedVideoFpsRangesFor[i3] = list2.get(i3).getInstant().getEpochSecond();
        }
        if (list3.size() > 15) {
            throw new java.lang.IllegalArgumentException("Too many transition rules");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = (org.threeten.bp.zone.ZoneOffsetTransitionRule[]) list3.toArray(new org.threeten.bp.zone.ZoneOffsetTransitionRule[list3.size()]);
    }

    private StandardZoneRules(long[] jArr, org.threeten.bp.ZoneOffset[] zoneOffsetArr, long[] jArr2, org.threeten.bp.ZoneOffset[] zoneOffsetArr2, org.threeten.bp.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArr) {
        this.getHighSpeedVideoFpsRanges = jArr;
        this.Camera2StreamConfigurationMap = zoneOffsetArr;
        this.getHighSpeedVideoFpsRangesFor = jArr2;
        this.getHighSpeedVideoSizes = zoneOffsetArr2;
        this.getHighResolutionOutputSizeshNQ4ISI = zoneOffsetTransitionRuleArr;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        while (i < jArr2.length) {
            int i2 = i + 1;
            org.threeten.bp.zone.ZoneOffsetTransition zoneOffsetTransition = new org.threeten.bp.zone.ZoneOffsetTransition(jArr2[i], zoneOffsetArr2[i], zoneOffsetArr2[i2]);
            if (zoneOffsetTransition.isGap()) {
                arrayList.add(zoneOffsetTransition.getDateTimeBefore());
                arrayList.add(zoneOffsetTransition.getDateTimeAfter());
            } else {
                arrayList.add(zoneOffsetTransition.getDateTimeAfter());
                arrayList.add(zoneOffsetTransition.getDateTimeBefore());
            }
            i = i2;
        }
        this.getHighSpeedVideoSizesFor = (org.threeten.bp.LocalDateTime[]) arrayList.toArray(new org.threeten.bp.LocalDateTime[arrayList.size()]);
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.zone.Ser((byte) 1, this);
    }

    static org.threeten.bp.zone.StandardZoneRules getHighSpeedVideoSizes(java.io.DataInput dataInput) throws java.io.IOException, java.lang.ClassNotFoundException {
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        for (int i = 0; i < readInt; i++) {
            jArr[i] = org.threeten.bp.zone.Ser.getHighResolutionOutputSizeshNQ4ISI(dataInput);
        }
        int i2 = readInt + 1;
        org.threeten.bp.ZoneOffset[] zoneOffsetArr = new org.threeten.bp.ZoneOffset[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            zoneOffsetArr[i3] = org.threeten.bp.zone.Ser.getHighSpeedVideoFpsRangesFor(dataInput);
        }
        int readInt2 = dataInput.readInt();
        long[] jArr2 = new long[readInt2];
        for (int i4 = 0; i4 < readInt2; i4++) {
            jArr2[i4] = org.threeten.bp.zone.Ser.getHighResolutionOutputSizeshNQ4ISI(dataInput);
        }
        int i5 = readInt2 + 1;
        org.threeten.bp.ZoneOffset[] zoneOffsetArr2 = new org.threeten.bp.ZoneOffset[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            zoneOffsetArr2[i6] = org.threeten.bp.zone.Ser.getHighSpeedVideoFpsRangesFor(dataInput);
        }
        int readByte = dataInput.readByte();
        org.threeten.bp.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArr = new org.threeten.bp.zone.ZoneOffsetTransitionRule[readByte];
        for (int i7 = 0; i7 < readByte; i7++) {
            zoneOffsetTransitionRuleArr[i7] = org.threeten.bp.zone.ZoneOffsetTransitionRule.getHighSpeedVideoFpsRanges(dataInput);
        }
        return new org.threeten.bp.zone.StandardZoneRules(jArr, zoneOffsetArr, jArr2, zoneOffsetArr2, zoneOffsetTransitionRuleArr);
    }

    @Override // org.threeten.bp.zone.ZoneRules
    public final boolean isFixedOffset() {
        return this.getHighSpeedVideoFpsRangesFor.length == 0 && this.getHighResolutionOutputSizeshNQ4ISI.length == 0 && this.getHighSpeedVideoSizes[0].equals(this.Camera2StreamConfigurationMap[0]);
    }

    @Override // org.threeten.bp.zone.ZoneRules
    public final org.threeten.bp.ZoneOffset getOffset(org.threeten.bp.Instant instant) {
        long epochSecond = instant.getEpochSecond();
        if (this.getHighResolutionOutputSizeshNQ4ISI.length > 0) {
            long[] jArr = this.getHighSpeedVideoFpsRangesFor;
            if (jArr.length == 0 || epochSecond > jArr[jArr.length - 1]) {
                org.threeten.bp.ZoneOffset[] zoneOffsetArr = this.getHighSpeedVideoSizes;
                org.threeten.bp.zone.ZoneOffsetTransition[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.LocalDate.ofEpochDay(org.threeten.bp.jdk8.Jdk8Methods.floorDiv(zoneOffsetArr[zoneOffsetArr.length - 1].getTotalSeconds() + epochSecond, 86400L)).getYear());
                org.threeten.bp.zone.ZoneOffsetTransition zoneOffsetTransition = null;
                for (int i = 0; i < highResolutionOutputSizeshNQ4ISI.length; i++) {
                    zoneOffsetTransition = highResolutionOutputSizeshNQ4ISI[i];
                    if (epochSecond < zoneOffsetTransition.toEpochSecond()) {
                        return zoneOffsetTransition.getOffsetBefore();
                    }
                }
                return zoneOffsetTransition.getOffsetAfter();
            }
        }
        int binarySearch = java.util.Arrays.binarySearch(this.getHighSpeedVideoFpsRangesFor, epochSecond);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.getHighSpeedVideoSizes[binarySearch + 1];
    }

    @Override // org.threeten.bp.zone.ZoneRules
    public final org.threeten.bp.ZoneOffset getOffset(org.threeten.bp.LocalDateTime localDateTime) {
        java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(localDateTime);
        if (highSpeedVideoFpsRangesFor instanceof org.threeten.bp.zone.ZoneOffsetTransition) {
            return ((org.threeten.bp.zone.ZoneOffsetTransition) highSpeedVideoFpsRangesFor).getOffsetBefore();
        }
        return (org.threeten.bp.ZoneOffset) highSpeedVideoFpsRangesFor;
    }

    @Override // org.threeten.bp.zone.ZoneRules
    public final java.util.List<org.threeten.bp.ZoneOffset> getValidOffsets(org.threeten.bp.LocalDateTime localDateTime) {
        java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(localDateTime);
        if (highSpeedVideoFpsRangesFor instanceof org.threeten.bp.zone.ZoneOffsetTransition) {
            org.threeten.bp.zone.ZoneOffsetTransition zoneOffsetTransition = (org.threeten.bp.zone.ZoneOffsetTransition) highSpeedVideoFpsRangesFor;
            if (zoneOffsetTransition.isGap()) {
                return java.util.Collections.emptyList();
            }
            return java.util.Arrays.asList(zoneOffsetTransition.getOffsetBefore(), zoneOffsetTransition.getOffsetAfter());
        }
        return java.util.Collections.singletonList((org.threeten.bp.ZoneOffset) highSpeedVideoFpsRangesFor);
    }

    @Override // org.threeten.bp.zone.ZoneRules
    public final org.threeten.bp.zone.ZoneOffsetTransition getTransition(org.threeten.bp.LocalDateTime localDateTime) {
        java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(localDateTime);
        if (highSpeedVideoFpsRangesFor instanceof org.threeten.bp.zone.ZoneOffsetTransition) {
            return (org.threeten.bp.zone.ZoneOffsetTransition) highSpeedVideoFpsRangesFor;
        }
        return null;
    }

    private java.lang.Object getHighSpeedVideoFpsRangesFor(org.threeten.bp.LocalDateTime localDateTime) {
        org.threeten.bp.ZoneOffset offsetBefore;
        int i = 0;
        if (this.getHighResolutionOutputSizeshNQ4ISI.length > 0) {
            org.threeten.bp.LocalDateTime[] localDateTimeArr = this.getHighSpeedVideoSizesFor;
            if (localDateTimeArr.length == 0 || localDateTime.isAfter(localDateTimeArr[localDateTimeArr.length - 1])) {
                org.threeten.bp.zone.ZoneOffsetTransition[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(localDateTime.getYear());
                int length = highResolutionOutputSizeshNQ4ISI.length;
                org.threeten.bp.ZoneOffset zoneOffset = null;
                while (i < length) {
                    org.threeten.bp.zone.ZoneOffsetTransition zoneOffsetTransition = highResolutionOutputSizeshNQ4ISI[i];
                    org.threeten.bp.LocalDateTime dateTimeBefore = zoneOffsetTransition.getDateTimeBefore();
                    if (zoneOffsetTransition.isGap()) {
                        if (localDateTime.isBefore(dateTimeBefore)) {
                            offsetBefore = zoneOffsetTransition.getOffsetBefore();
                        } else {
                            if (!localDateTime.isBefore(zoneOffsetTransition.getDateTimeAfter())) {
                                offsetBefore = zoneOffsetTransition.getOffsetAfter();
                            }
                            offsetBefore = zoneOffsetTransition;
                        }
                    } else if (!localDateTime.isBefore(dateTimeBefore)) {
                        offsetBefore = zoneOffsetTransition.getOffsetAfter();
                    } else {
                        if (localDateTime.isBefore(zoneOffsetTransition.getDateTimeAfter())) {
                            offsetBefore = zoneOffsetTransition.getOffsetBefore();
                        }
                        offsetBefore = zoneOffsetTransition;
                    }
                    if ((offsetBefore instanceof org.threeten.bp.zone.ZoneOffsetTransition) || offsetBefore.equals(zoneOffsetTransition.getOffsetBefore())) {
                        return offsetBefore;
                    }
                    i++;
                    zoneOffset = offsetBefore;
                }
                return zoneOffset;
            }
        }
        int binarySearch = java.util.Arrays.binarySearch(this.getHighSpeedVideoSizesFor, localDateTime);
        if (binarySearch == -1) {
            return this.getHighSpeedVideoSizes[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else {
            java.lang.Object[] objArr = this.getHighSpeedVideoSizesFor;
            if (binarySearch < objArr.length - 1) {
                int i2 = binarySearch + 1;
                if (objArr[binarySearch].equals(objArr[i2])) {
                    binarySearch = i2;
                }
            }
        }
        if ((binarySearch & 1) == 0) {
            org.threeten.bp.LocalDateTime[] localDateTimeArr2 = this.getHighSpeedVideoSizesFor;
            org.threeten.bp.LocalDateTime localDateTime2 = localDateTimeArr2[binarySearch];
            org.threeten.bp.LocalDateTime localDateTime3 = localDateTimeArr2[binarySearch + 1];
            org.threeten.bp.ZoneOffset[] zoneOffsetArr = this.getHighSpeedVideoSizes;
            int i3 = binarySearch / 2;
            org.threeten.bp.ZoneOffset zoneOffset2 = zoneOffsetArr[i3];
            org.threeten.bp.ZoneOffset zoneOffset3 = zoneOffsetArr[i3 + 1];
            if (zoneOffset3.getTotalSeconds() > zoneOffset2.getTotalSeconds()) {
                return new org.threeten.bp.zone.ZoneOffsetTransition(localDateTime2, zoneOffset2, zoneOffset3);
            }
            return new org.threeten.bp.zone.ZoneOffsetTransition(localDateTime3, zoneOffset2, zoneOffset3);
        }
        return this.getHighSpeedVideoSizes[(binarySearch / 2) + 1];
    }

    @Override // org.threeten.bp.zone.ZoneRules
    public final boolean isValidOffset(org.threeten.bp.LocalDateTime localDateTime, org.threeten.bp.ZoneOffset zoneOffset) {
        return getValidOffsets(localDateTime).contains(zoneOffset);
    }

    private org.threeten.bp.zone.ZoneOffsetTransition[] getHighResolutionOutputSizeshNQ4ISI(int i) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
        org.threeten.bp.zone.ZoneOffsetTransition[] zoneOffsetTransitionArr = this.getInputFormats.get(valueOf);
        if (zoneOffsetTransitionArr != null) {
            return zoneOffsetTransitionArr;
        }
        org.threeten.bp.zone.ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArr = this.getHighResolutionOutputSizeshNQ4ISI;
        org.threeten.bp.zone.ZoneOffsetTransition[] zoneOffsetTransitionArr2 = new org.threeten.bp.zone.ZoneOffsetTransition[zoneOffsetTransitionRuleArr.length];
        for (int i2 = 0; i2 < zoneOffsetTransitionRuleArr.length; i2++) {
            zoneOffsetTransitionArr2[i2] = zoneOffsetTransitionRuleArr[i2].createTransition(i);
        }
        if (i < 2100) {
            this.getInputFormats.putIfAbsent(valueOf, zoneOffsetTransitionArr2);
        }
        return zoneOffsetTransitionArr2;
    }

    @Override // org.threeten.bp.zone.ZoneRules
    public final org.threeten.bp.ZoneOffset getStandardOffset(org.threeten.bp.Instant instant) {
        int binarySearch = java.util.Arrays.binarySearch(this.getHighSpeedVideoFpsRanges, instant.getEpochSecond());
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.Camera2StreamConfigurationMap[binarySearch + 1];
    }

    @Override // org.threeten.bp.zone.ZoneRules
    public final org.threeten.bp.Duration getDaylightSavings(org.threeten.bp.Instant instant) {
        return org.threeten.bp.Duration.ofSeconds(getOffset(instant).getTotalSeconds() - getStandardOffset(instant).getTotalSeconds());
    }

    @Override // org.threeten.bp.zone.ZoneRules
    public final boolean isDaylightSavings(org.threeten.bp.Instant instant) {
        return !getStandardOffset(instant).equals(getOffset(instant));
    }

    @Override // org.threeten.bp.zone.ZoneRules
    public final org.threeten.bp.zone.ZoneOffsetTransition nextTransition(org.threeten.bp.Instant instant) {
        if (this.getHighSpeedVideoFpsRangesFor.length == 0) {
            return null;
        }
        long epochSecond = instant.getEpochSecond();
        long[] jArr = this.getHighSpeedVideoFpsRangesFor;
        if (epochSecond >= jArr[jArr.length - 1]) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.length == 0) {
                return null;
            }
            org.threeten.bp.ZoneOffset[] zoneOffsetArr = this.getHighSpeedVideoSizes;
            int year = org.threeten.bp.LocalDate.ofEpochDay(org.threeten.bp.jdk8.Jdk8Methods.floorDiv(zoneOffsetArr[zoneOffsetArr.length - 1].getTotalSeconds() + epochSecond, 86400L)).getYear();
            for (org.threeten.bp.zone.ZoneOffsetTransition zoneOffsetTransition : getHighResolutionOutputSizeshNQ4ISI(year)) {
                if (epochSecond < zoneOffsetTransition.toEpochSecond()) {
                    return zoneOffsetTransition;
                }
            }
            if (year < 999999999) {
                return getHighResolutionOutputSizeshNQ4ISI(year + 1)[0];
            }
            return null;
        }
        int binarySearch = java.util.Arrays.binarySearch(jArr, epochSecond);
        int i = binarySearch < 0 ? (-binarySearch) - 1 : binarySearch + 1;
        long j = this.getHighSpeedVideoFpsRangesFor[i];
        org.threeten.bp.ZoneOffset[] zoneOffsetArr2 = this.getHighSpeedVideoSizes;
        return new org.threeten.bp.zone.ZoneOffsetTransition(j, zoneOffsetArr2[i], zoneOffsetArr2[i + 1]);
    }

    @Override // org.threeten.bp.zone.ZoneRules
    public final org.threeten.bp.zone.ZoneOffsetTransition previousTransition(org.threeten.bp.Instant instant) {
        if (this.getHighSpeedVideoFpsRangesFor.length == 0) {
            return null;
        }
        long epochSecond = instant.getEpochSecond();
        if (instant.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
            epochSecond++;
        }
        long j = this.getHighSpeedVideoFpsRangesFor[r13.length - 1];
        if (this.getHighResolutionOutputSizeshNQ4ISI.length > 0 && epochSecond > j) {
            org.threeten.bp.ZoneOffset zoneOffset = this.getHighSpeedVideoSizes[r13.length - 1];
            int year = org.threeten.bp.LocalDate.ofEpochDay(org.threeten.bp.jdk8.Jdk8Methods.floorDiv(zoneOffset.getTotalSeconds() + epochSecond, 86400L)).getYear();
            org.threeten.bp.zone.ZoneOffsetTransition[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(year);
            for (int length = highResolutionOutputSizeshNQ4ISI.length - 1; length >= 0; length--) {
                if (epochSecond > highResolutionOutputSizeshNQ4ISI[length].toEpochSecond()) {
                    return highResolutionOutputSizeshNQ4ISI[length];
                }
            }
            int i = year - 1;
            if (i > org.threeten.bp.LocalDate.ofEpochDay(org.threeten.bp.jdk8.Jdk8Methods.floorDiv(j + zoneOffset.getTotalSeconds(), 86400L)).getYear()) {
                return getHighResolutionOutputSizeshNQ4ISI(i)[r13.length - 1];
            }
        }
        int binarySearch = java.util.Arrays.binarySearch(this.getHighSpeedVideoFpsRangesFor, epochSecond);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        if (binarySearch <= 0) {
            return null;
        }
        int i2 = binarySearch - 1;
        long j2 = this.getHighSpeedVideoFpsRangesFor[i2];
        org.threeten.bp.ZoneOffset[] zoneOffsetArr = this.getHighSpeedVideoSizes;
        return new org.threeten.bp.zone.ZoneOffsetTransition(j2, zoneOffsetArr[i2], zoneOffsetArr[binarySearch]);
    }

    @Override // org.threeten.bp.zone.ZoneRules
    public final java.util.List<org.threeten.bp.zone.ZoneOffsetTransition> getTransitions() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        while (true) {
            long[] jArr = this.getHighSpeedVideoFpsRangesFor;
            if (i < jArr.length) {
                long j = jArr[i];
                org.threeten.bp.ZoneOffset[] zoneOffsetArr = this.getHighSpeedVideoSizes;
                org.threeten.bp.ZoneOffset zoneOffset = zoneOffsetArr[i];
                i++;
                arrayList.add(new org.threeten.bp.zone.ZoneOffsetTransition(j, zoneOffset, zoneOffsetArr[i]));
            } else {
                return java.util.Collections.unmodifiableList(arrayList);
            }
        }
    }

    @Override // org.threeten.bp.zone.ZoneRules
    public final java.util.List<org.threeten.bp.zone.ZoneOffsetTransitionRule> getTransitionRules() {
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(this.getHighResolutionOutputSizeshNQ4ISI));
    }

    @Override // org.threeten.bp.zone.ZoneRules
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof org.threeten.bp.zone.StandardZoneRules)) {
            return (obj instanceof org.threeten.bp.zone.ZoneRules.Fixed) && isFixedOffset() && getOffset(org.threeten.bp.Instant.EPOCH).equals(((org.threeten.bp.zone.ZoneRules.Fixed) obj).getOffset(org.threeten.bp.Instant.EPOCH));
        }
        org.threeten.bp.zone.StandardZoneRules standardZoneRules = (org.threeten.bp.zone.StandardZoneRules) obj;
        return java.util.Arrays.equals(this.getHighSpeedVideoFpsRanges, standardZoneRules.getHighSpeedVideoFpsRanges) && java.util.Arrays.equals(this.Camera2StreamConfigurationMap, standardZoneRules.Camera2StreamConfigurationMap) && java.util.Arrays.equals(this.getHighSpeedVideoFpsRangesFor, standardZoneRules.getHighSpeedVideoFpsRangesFor) && java.util.Arrays.equals(this.getHighSpeedVideoSizes, standardZoneRules.getHighSpeedVideoSizes) && java.util.Arrays.equals(this.getHighResolutionOutputSizeshNQ4ISI, standardZoneRules.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // org.threeten.bp.zone.ZoneRules
    public final int hashCode() {
        int hashCode = java.util.Arrays.hashCode(this.getHighSpeedVideoFpsRanges);
        int hashCode2 = java.util.Arrays.hashCode(this.Camera2StreamConfigurationMap);
        int hashCode3 = java.util.Arrays.hashCode(this.getHighSpeedVideoFpsRangesFor);
        return (((hashCode ^ hashCode2) ^ hashCode3) ^ java.util.Arrays.hashCode(this.getHighSpeedVideoSizes)) ^ java.util.Arrays.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StandardZoneRules[currentStandardOffset=");
        sb.append(this.Camera2StreamConfigurationMap[r1.length - 1]);
        sb.append("]");
        return sb.toString();
    }
}
