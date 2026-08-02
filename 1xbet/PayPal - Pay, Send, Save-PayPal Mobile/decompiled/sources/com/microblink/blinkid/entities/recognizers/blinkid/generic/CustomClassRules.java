package com.microblink.blinkid.entities.recognizers.blinkid.generic;

/* loaded from: classes10.dex */
public class CustomClassRules {
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Country getHighResolutionOutputSizeshNQ4ISI;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Region getHighSpeedVideoFpsRanges;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Type getHighSpeedVideoFpsRangesFor;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.DetailedFieldType[] getHighSpeedVideoSizes;

    public static class Builder {
        private com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Country getHighResolutionOutputSizeshNQ4ISI;
        private com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Region getHighSpeedVideoFpsRanges;
        private com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Type getHighSpeedVideoFpsRangesFor;
        private final com.microblink.blinkid.entities.recognizers.blinkid.generic.DetailedFieldType[] getHighSpeedVideoSizes;

        public Builder(com.microblink.blinkid.entities.recognizers.blinkid.generic.DetailedFieldType[] detailedFieldTypeArr) throws java.lang.IllegalArgumentException {
            if (detailedFieldTypeArr == null) {
                throw new java.lang.IllegalArgumentException("detailedFieldTypes argument array cannot be null.");
            }
            this.getHighSpeedVideoSizes = detailedFieldTypeArr;
        }

        public com.microblink.blinkid.entities.recognizers.blinkid.generic.CustomClassRules build() {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.CustomClassRules(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
        }

        public com.microblink.blinkid.entities.recognizers.blinkid.generic.CustomClassRules.Builder setCountry(com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Country country) {
            this.getHighResolutionOutputSizeshNQ4ISI = country;
            return this;
        }

        public com.microblink.blinkid.entities.recognizers.blinkid.generic.CustomClassRules.Builder setRegion(com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Region region) {
            this.getHighSpeedVideoFpsRanges = region;
            return this;
        }

        public com.microblink.blinkid.entities.recognizers.blinkid.generic.CustomClassRules.Builder setType(com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Type type) {
            this.getHighSpeedVideoFpsRangesFor = type;
            return this;
        }
    }

    public CustomClassRules(com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Country country, com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Region region, com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Type type, com.microblink.blinkid.entities.recognizers.blinkid.generic.DetailedFieldType[] detailedFieldTypeArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = country;
        this.getHighSpeedVideoFpsRanges = region;
        this.getHighSpeedVideoFpsRangesFor = type;
        this.getHighSpeedVideoSizes = detailedFieldTypeArr;
    }

    public static com.microblink.blinkid.entities.recognizers.blinkid.generic.CustomClassRules createFromNative(int i, int i2, int i3, int[] iArr) {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Country country = i == -1 ? null : com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Country.values()[i];
        com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Region region = i2 == -1 ? null : com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Region.values()[i2];
        com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Type type = i3 != -1 ? com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Type.values()[i3] : null;
        com.microblink.blinkid.entities.recognizers.blinkid.generic.DetailedFieldType[] detailedFieldTypeArr = new com.microblink.blinkid.entities.recognizers.blinkid.generic.DetailedFieldType[iArr.length / 2];
        for (int i4 = 0; i4 < iArr.length; i4 += 2) {
            detailedFieldTypeArr[i4 / 2] = new com.microblink.blinkid.entities.recognizers.blinkid.generic.DetailedFieldType(com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType.values()[iArr[i4]], com.microblink.blinkid.entities.recognizers.blinkid.generic.AlphabetType.values()[iArr[i4 + 1]]);
        }
        return new com.microblink.blinkid.entities.recognizers.blinkid.generic.CustomClassRules(country, region, type, detailedFieldTypeArr);
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Country getCountry() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.generic.DetailedFieldType[] getDetailedFieldTypes() {
        return this.getHighSpeedVideoSizes;
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Region getRegion() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Type getType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int[] serializeToArray() {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.DetailedFieldType[] detailedFieldTypeArr = this.getHighSpeedVideoSizes;
        int[] iArr = new int[(detailedFieldTypeArr.length * 2) + 4];
        int i = 0;
        iArr[0] = (detailedFieldTypeArr.length * 2) + 4;
        com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Country country = this.getHighResolutionOutputSizeshNQ4ISI;
        iArr[1] = country == null ? -1 : country.ordinal();
        com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Region region = this.getHighSpeedVideoFpsRanges;
        iArr[2] = region == null ? -1 : region.ordinal();
        com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Type type = this.getHighSpeedVideoFpsRangesFor;
        iArr[3] = type != null ? type.ordinal() : -1;
        while (true) {
            com.microblink.blinkid.entities.recognizers.blinkid.generic.DetailedFieldType[] detailedFieldTypeArr2 = this.getHighSpeedVideoSizes;
            if (i >= detailedFieldTypeArr2.length) {
                return iArr;
            }
            int i2 = i * 2;
            iArr[i2 + 4] = detailedFieldTypeArr2[i].getFieldType().ordinal();
            iArr[i2 + 5] = this.getHighSpeedVideoSizes[i].getAlphabetType().ordinal();
            i++;
        }
    }

    public static int[] serializeToArray(com.microblink.blinkid.entities.recognizers.blinkid.generic.CustomClassRules[] customClassRulesArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        int i2 = 0;
        for (com.microblink.blinkid.entities.recognizers.blinkid.generic.CustomClassRules customClassRules : customClassRulesArr) {
            int[] serializeToArray = customClassRules.serializeToArray();
            int i3 = serializeToArray[0];
            for (int i4 : serializeToArray) {
                arrayList.add(java.lang.Integer.valueOf(i4));
            }
            i2 += i3;
        }
        int[] iArr = new int[i2 + 1];
        iArr[0] = i2;
        while (i < arrayList.size()) {
            int i5 = i + 1;
            iArr[i5] = ((java.lang.Integer) arrayList.get(i)).intValue();
            i = i5;
        }
        return iArr;
    }
}
