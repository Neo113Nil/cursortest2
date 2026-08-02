package com.microblink.blinkid.entities.recognizers.blinkid.generic;

/* loaded from: classes10.dex */
public class ClassAnonymizationSettings {
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.DocumentNumberAnonymizationSettings Camera2StreamConfigurationMap;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Country getHighResolutionOutputSizeshNQ4ISI;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Region getHighSpeedVideoFpsRanges;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] getHighSpeedVideoFpsRangesFor;
    private final com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Type getHighSpeedVideoSizes;

    public static class Builder {
        private com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Type Camera2StreamConfigurationMap;
        private com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Country getHighResolutionOutputSizeshNQ4ISI;
        private com.microblink.blinkid.entities.recognizers.blinkid.generic.DocumentNumberAnonymizationSettings getHighSpeedVideoFpsRanges;
        private com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Region getHighSpeedVideoFpsRangesFor;
        private final com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] getHighSpeedVideoSizes;

        public Builder(com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] fieldTypeArr) throws java.lang.IllegalArgumentException {
            if (fieldTypeArr == null) {
                throw new java.lang.IllegalArgumentException("FieldType argument array cannot be null.");
            }
            this.getHighSpeedVideoSizes = fieldTypeArr;
        }

        public com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassAnonymizationSettings build() {
            return new com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassAnonymizationSettings(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
        }

        public com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassAnonymizationSettings.Builder setCountry(com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Country country) {
            this.getHighResolutionOutputSizeshNQ4ISI = country;
            return this;
        }

        public com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassAnonymizationSettings.Builder setDocumentNumberAnonymizationSettings(com.microblink.blinkid.entities.recognizers.blinkid.generic.DocumentNumberAnonymizationSettings documentNumberAnonymizationSettings) {
            this.getHighSpeedVideoFpsRanges = documentNumberAnonymizationSettings;
            return this;
        }

        public com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassAnonymizationSettings.Builder setRegion(com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Region region) {
            this.getHighSpeedVideoFpsRangesFor = region;
            return this;
        }

        public com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassAnonymizationSettings.Builder setType(com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Type type) {
            this.Camera2StreamConfigurationMap = type;
            return this;
        }
    }

    public ClassAnonymizationSettings(com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Country country, com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Region region, com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Type type, com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] fieldTypeArr, com.microblink.blinkid.entities.recognizers.blinkid.generic.DocumentNumberAnonymizationSettings documentNumberAnonymizationSettings) {
        this.getHighResolutionOutputSizeshNQ4ISI = country;
        this.getHighSpeedVideoFpsRanges = region;
        this.getHighSpeedVideoSizes = type;
        this.getHighSpeedVideoFpsRangesFor = fieldTypeArr;
        this.Camera2StreamConfigurationMap = documentNumberAnonymizationSettings;
    }

    public static com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassAnonymizationSettings createFromNative(int i, int i2, int i3, int[] iArr, int i4, int i5) {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Country country = i == -1 ? null : com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Country.values()[i];
        com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Region region = i2 == -1 ? null : com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Region.values()[i2];
        com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Type type = i3 == -1 ? null : com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Type.values()[i3];
        com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] fieldTypeArr = new com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            fieldTypeArr[i6] = com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType.values()[iArr[i6]];
        }
        return new com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassAnonymizationSettings(country, region, type, fieldTypeArr, (i4 == -1 && i5 == -1) ? null : new com.microblink.blinkid.entities.recognizers.blinkid.generic.DocumentNumberAnonymizationSettings(i4, i5));
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Country getCountry() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.generic.DocumentNumberAnonymizationSettings getDocumentNumberAnonymizationSettings() {
        return this.Camera2StreamConfigurationMap;
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] getFields() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Region getRegion() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Type getType() {
        return this.getHighSpeedVideoSizes;
    }

    public int[] serializeToArray() {
        com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] fieldTypeArr;
        com.microblink.blinkid.entities.recognizers.blinkid.generic.FieldType[] fieldTypeArr2 = this.getHighSpeedVideoFpsRangesFor;
        int[] iArr = new int[fieldTypeArr2.length + 6];
        int i = 0;
        iArr[0] = fieldTypeArr2.length + 6;
        com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Country country = this.getHighResolutionOutputSizeshNQ4ISI;
        iArr[1] = country == null ? -1 : country.ordinal();
        com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Region region = this.getHighSpeedVideoFpsRanges;
        iArr[2] = region == null ? -1 : region.ordinal();
        com.microblink.blinkid.entities.recognizers.blinkid.generic.classinfo.Type type = this.getHighSpeedVideoSizes;
        iArr[3] = type == null ? -1 : type.ordinal();
        while (true) {
            fieldTypeArr = this.getHighSpeedVideoFpsRangesFor;
            if (i >= fieldTypeArr.length) {
                break;
            }
            iArr[i + 4] = fieldTypeArr[i].ordinal();
            i++;
        }
        int length = fieldTypeArr.length;
        com.microblink.blinkid.entities.recognizers.blinkid.generic.DocumentNumberAnonymizationSettings documentNumberAnonymizationSettings = this.Camera2StreamConfigurationMap;
        iArr[length + 4] = documentNumberAnonymizationSettings == null ? -1 : documentNumberAnonymizationSettings.prefixDigitsVisible;
        iArr[fieldTypeArr.length + 5] = documentNumberAnonymizationSettings != null ? documentNumberAnonymizationSettings.suffixDigitsVisible : -1;
        return iArr;
    }

    public static int[] serializeToArray(com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassAnonymizationSettings[] classAnonymizationSettingsArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        int i2 = 0;
        for (com.microblink.blinkid.entities.recognizers.blinkid.generic.ClassAnonymizationSettings classAnonymizationSettings : classAnonymizationSettingsArr) {
            int[] serializeToArray = classAnonymizationSettings.serializeToArray();
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
