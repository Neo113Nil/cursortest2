package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes9.dex */
final class FieldParser {
    private static final java.util.Map<java.lang.String, com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength> FOUR_DIGIT_DATA_LENGTH;
    private static final java.util.Map<java.lang.String, com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength> THREE_DIGIT_DATA_LENGTH;
    private static final java.util.Map<java.lang.String, com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength> THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH;
    private static final java.util.Map<java.lang.String, com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength> TWO_DIGIT_DATA_LENGTH;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        TWO_DIGIT_DATA_LENGTH = hashMap;
        hashMap.put(com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter.DOUBLE_ZERO_PREFIX, com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(18));
        hashMap.put("01", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(14));
        hashMap.put(my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_KERNEL_ID_MASTERCARD, com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(14));
        hashMap.put("10", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(20));
        hashMap.put("11", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(6));
        hashMap.put("12", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(6));
        hashMap.put("13", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(6));
        hashMap.put("15", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(6));
        hashMap.put("16", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(6));
        hashMap.put("17", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(6));
        hashMap.put("20", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(2));
        hashMap.put("21", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(20));
        hashMap.put("22", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(29));
        hashMap.put("30", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(8));
        hashMap.put("37", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(8));
        for (int i = 90; i <= 99; i++) {
            TWO_DIGIT_DATA_LENGTH.put(java.lang.String.valueOf(i), com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(30));
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        THREE_DIGIT_DATA_LENGTH = hashMap2;
        hashMap2.put("235", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(28));
        hashMap2.put("240", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(30));
        hashMap2.put("241", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(30));
        hashMap2.put("242", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(6));
        hashMap2.put("243", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(20));
        hashMap2.put("250", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(30));
        hashMap2.put("251", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(30));
        hashMap2.put("253", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(30));
        hashMap2.put("254", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(20));
        hashMap2.put("255", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(25));
        hashMap2.put("400", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(30));
        hashMap2.put("401", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(30));
        hashMap2.put("402", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(17));
        hashMap2.put("403", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(30));
        hashMap2.put("410", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(13));
        hashMap2.put("411", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(13));
        hashMap2.put("412", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(13));
        hashMap2.put("413", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(13));
        hashMap2.put("414", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(13));
        hashMap2.put("415", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(13));
        hashMap2.put("416", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(13));
        hashMap2.put("417", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(13));
        hashMap2.put("420", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(20));
        hashMap2.put("421", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(15));
        hashMap2.put("422", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(3));
        hashMap2.put("423", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(15));
        hashMap2.put("424", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(3));
        hashMap2.put("425", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(15));
        hashMap2.put("426", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(3));
        hashMap2.put("427", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(3));
        hashMap2.put("710", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(20));
        hashMap2.put("711", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(20));
        hashMap2.put("712", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(20));
        hashMap2.put("713", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(20));
        hashMap2.put("714", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(20));
        hashMap2.put("715", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(20));
        THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH = new java.util.HashMap();
        for (int i2 = 310; i2 <= 316; i2++) {
            THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH.put(java.lang.String.valueOf(i2), com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(6));
        }
        for (int i3 = 320; i3 <= 337; i3++) {
            THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH.put(java.lang.String.valueOf(i3), com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(6));
        }
        for (int i4 = 340; i4 <= 357; i4++) {
            THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH.put(java.lang.String.valueOf(i4), com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(6));
        }
        for (int i5 = 360; i5 <= 369; i5++) {
            THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH.put(java.lang.String.valueOf(i5), com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(6));
        }
        java.util.Map<java.lang.String, com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength> map = THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH;
        map.put("390", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(15));
        map.put("391", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(18));
        map.put("392", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(15));
        map.put("393", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(18));
        map.put("394", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(4));
        map.put("395", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(6));
        map.put("703", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(30));
        map.put("723", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(30));
        java.util.HashMap hashMap3 = new java.util.HashMap();
        FOUR_DIGIT_DATA_LENGTH = hashMap3;
        hashMap3.put("4300", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(35));
        hashMap3.put("4301", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(35));
        hashMap3.put("4302", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(70));
        hashMap3.put("4303", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(70));
        hashMap3.put("4304", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(70));
        hashMap3.put("4305", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(70));
        hashMap3.put("4306", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(70));
        hashMap3.put("4307", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(2));
        hashMap3.put("4308", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(30));
        hashMap3.put("4309", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(20));
        hashMap3.put("4310", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(35));
        hashMap3.put("4311", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(35));
        hashMap3.put("4312", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(70));
        hashMap3.put("4313", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(70));
        hashMap3.put("4314", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(70));
        hashMap3.put("4315", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(70));
        hashMap3.put("4316", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(70));
        hashMap3.put("4317", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(2));
        hashMap3.put("4318", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(20));
        hashMap3.put("4319", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(30));
        hashMap3.put("4320", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(35));
        hashMap3.put("4321", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(1));
        hashMap3.put("4322", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(1));
        hashMap3.put("4323", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(1));
        hashMap3.put("4324", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(10));
        hashMap3.put("4325", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(10));
        hashMap3.put("4326", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(6));
        hashMap3.put("7001", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(13));
        hashMap3.put("7002", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(30));
        hashMap3.put("7003", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(10));
        hashMap3.put("7004", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(4));
        hashMap3.put("7005", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(12));
        hashMap3.put("7006", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(6));
        hashMap3.put("7007", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(12));
        hashMap3.put("7008", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(3));
        hashMap3.put("7009", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(10));
        hashMap3.put("7010", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(2));
        hashMap3.put("7011", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(10));
        hashMap3.put("7020", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(20));
        hashMap3.put("7021", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(20));
        hashMap3.put("7022", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(20));
        hashMap3.put("7023", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(30));
        hashMap3.put("7040", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(4));
        hashMap3.put("7240", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(20));
        hashMap3.put(com.visa.cbp.getEncExpo.getActivityResultRegistry, com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(14));
        hashMap3.put("8002", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(20));
        hashMap3.put("8003", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(30));
        hashMap3.put("8004", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(30));
        hashMap3.put("8005", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(6));
        hashMap3.put("8006", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(18));
        hashMap3.put("8007", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(34));
        hashMap3.put("8008", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(12));
        hashMap3.put("8009", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(50));
        hashMap3.put("8010", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(30));
        hashMap3.put("8011", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(12));
        hashMap3.put("8012", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(20));
        hashMap3.put("8013", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(25));
        hashMap3.put("8017", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(18));
        hashMap3.put("8018", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(18));
        hashMap3.put("8019", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(10));
        hashMap3.put("8020", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(25));
        hashMap3.put("8026", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(18));
        hashMap3.put("8100", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(6));
        hashMap3.put("8101", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(10));
        hashMap3.put("8102", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(2));
        hashMap3.put("8110", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(70));
        hashMap3.put("8111", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.fixed(4));
        hashMap3.put("8112", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(70));
        hashMap3.put("8200", com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength.variable(70));
    }

    private FieldParser() {
    }

    static java.lang.String parseFieldsInGeneralPurpose(java.lang.String str) throws com.google.zxing.NotFoundException {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() < 2) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength dataLength = TWO_DIGIT_DATA_LENGTH.get(str.substring(0, 2));
        if (dataLength != null) {
            if (dataLength.variable) {
                return processVariableAI(2, dataLength.length, str);
            }
            return processFixedAI(2, dataLength.length, str);
        }
        if (str.length() < 3) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        java.lang.String substring = str.substring(0, 3);
        com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength dataLength2 = THREE_DIGIT_DATA_LENGTH.get(substring);
        if (dataLength2 != null) {
            if (dataLength2.variable) {
                return processVariableAI(3, dataLength2.length, str);
            }
            return processFixedAI(3, dataLength2.length, str);
        }
        if (str.length() < 4) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength dataLength3 = THREE_DIGIT_PLUS_DIGIT_DATA_LENGTH.get(substring);
        if (dataLength3 != null) {
            if (dataLength3.variable) {
                return processVariableAI(4, dataLength3.length, str);
            }
            return processFixedAI(4, dataLength3.length, str);
        }
        com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength dataLength4 = FOUR_DIGIT_DATA_LENGTH.get(str.substring(0, 4));
        if (dataLength4 != null) {
            if (dataLength4.variable) {
                return processVariableAI(4, dataLength4.length, str);
            }
            return processFixedAI(4, dataLength4.length, str);
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }

    private static java.lang.String processFixedAI(int i, int i2, java.lang.String str) throws com.google.zxing.NotFoundException {
        if (str.length() < i) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        java.lang.String substring = str.substring(0, i);
        int i3 = i2 + i;
        if (str.length() < i3) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        java.lang.String substring2 = str.substring(i, i3);
        java.lang.String substring3 = str.substring(i3);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(substring);
        sb.append(')');
        sb.append(substring2);
        java.lang.String obj = sb.toString();
        java.lang.String parseFieldsInGeneralPurpose = parseFieldsInGeneralPurpose(substring3);
        if (parseFieldsInGeneralPurpose == null) {
            return obj;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj);
        sb2.append(parseFieldsInGeneralPurpose);
        return sb2.toString();
    }

    private static java.lang.String processVariableAI(int i, int i2, java.lang.String str) throws com.google.zxing.NotFoundException {
        java.lang.String substring = str.substring(0, i);
        int min = java.lang.Math.min(str.length(), i2 + i);
        java.lang.String substring2 = str.substring(i, min);
        java.lang.String substring3 = str.substring(min);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(substring);
        sb.append(')');
        sb.append(substring2);
        java.lang.String obj = sb.toString();
        java.lang.String parseFieldsInGeneralPurpose = parseFieldsInGeneralPurpose(substring3);
        if (parseFieldsInGeneralPurpose == null) {
            return obj;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj);
        sb2.append(parseFieldsInGeneralPurpose);
        return sb2.toString();
    }

    static final class DataLength {
        final int length;
        final boolean variable;

        private DataLength(boolean z, int i) {
            this.variable = z;
            this.length = i;
        }

        static com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength fixed(int i) {
            return new com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength(false, i);
        }

        static com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength variable(int i) {
            return new com.google.zxing.oned.rss.expanded.decoders.FieldParser.DataLength(true, i);
        }
    }
}
