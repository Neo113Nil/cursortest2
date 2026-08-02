package org.bouncycastle.est;

/* loaded from: classes17.dex */
class HttpUtil {

    static class Headers extends java.util.HashMap<java.lang.String, java.lang.String[]> {
        @Override // java.util.HashMap, java.util.AbstractMap
        public java.lang.Object clone() {
            org.bouncycastle.est.HttpUtil.Headers headers = new org.bouncycastle.est.HttpUtil.Headers();
            for (java.util.Map.Entry<java.lang.String, java.lang.String[]> entry : entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String[] value = entry.getValue();
                int length = value.length;
                java.lang.String[] strArr = new java.lang.String[length];
                java.lang.System.arraycopy(value, 0, strArr, 0, length);
                headers.put(key, strArr);
            }
            return headers;
        }

        final java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
            if (containsKey(str)) {
                return str;
            }
            for (java.lang.String str2 : keySet()) {
                if (str.equalsIgnoreCase(str2)) {
                    return str2;
                }
            }
            return null;
        }
    }

    static java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2) {
        java.lang.String trim = str2.trim();
        if (trim.startsWith(str)) {
            trim = trim.substring(str.length());
        }
        org.bouncycastle.est.HttpUtil.PartLexer partLexer = new org.bouncycastle.est.HttpUtil.PartLexer(trim);
        java.util.HashMap hashMap = new java.util.HashMap();
        while (partLexer.Camera2StreamConfigurationMap < partLexer.getHighSpeedVideoFpsRangesFor.length()) {
            partLexer.getHighSpeedVideoSizes();
            char charAt = partLexer.getHighSpeedVideoFpsRangesFor.charAt(partLexer.Camera2StreamConfigurationMap);
            while (partLexer.Camera2StreamConfigurationMap < partLexer.getHighSpeedVideoFpsRangesFor.length() && ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
                int i = partLexer.Camera2StreamConfigurationMap + 1;
                partLexer.Camera2StreamConfigurationMap = i;
                charAt = partLexer.getHighSpeedVideoFpsRangesFor.charAt(i);
            }
            java.lang.String substring = partLexer.getHighSpeedVideoFpsRangesFor.substring(partLexer.getHighSpeedVideoSizes, partLexer.Camera2StreamConfigurationMap);
            partLexer.getHighSpeedVideoSizes = partLexer.Camera2StreamConfigurationMap;
            if (substring.length() == 0) {
                throw new java.lang.IllegalArgumentException("Expecting alpha label.");
            }
            partLexer.getHighSpeedVideoSizes();
            if (!partLexer.getHighSpeedVideoFpsRangesFor('=')) {
                throw new java.lang.IllegalArgumentException("Expecting assign: '='");
            }
            partLexer.getHighSpeedVideoSizes();
            if (!partLexer.getHighSpeedVideoFpsRangesFor('\"')) {
                throw new java.lang.IllegalArgumentException("Expecting start quote: '\"'");
            }
            partLexer.getHighSpeedVideoSizes = partLexer.Camera2StreamConfigurationMap;
            while (partLexer.Camera2StreamConfigurationMap < partLexer.getHighSpeedVideoFpsRangesFor.length() && partLexer.getHighSpeedVideoFpsRangesFor.charAt(partLexer.Camera2StreamConfigurationMap) != '\"') {
                partLexer.Camera2StreamConfigurationMap++;
            }
            java.lang.String substring2 = partLexer.getHighSpeedVideoFpsRangesFor.substring(partLexer.getHighSpeedVideoSizes, partLexer.Camera2StreamConfigurationMap);
            partLexer.getHighSpeedVideoSizes = partLexer.Camera2StreamConfigurationMap;
            int i2 = partLexer.Camera2StreamConfigurationMap + 1;
            partLexer.Camera2StreamConfigurationMap = i2;
            partLexer.getHighSpeedVideoSizes = i2;
            hashMap.put(substring, substring2);
            partLexer.getHighSpeedVideoSizes();
            if (!partLexer.getHighSpeedVideoFpsRangesFor(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA)) {
                break;
            }
            partLexer.getHighSpeedVideoSizes = partLexer.Camera2StreamConfigurationMap;
        }
        return hashMap;
    }

    static class PartLexer {
        final java.lang.String getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes = 0;
        int Camera2StreamConfigurationMap = 0;

        final void getHighSpeedVideoSizes() {
            while (this.Camera2StreamConfigurationMap < this.getHighSpeedVideoFpsRangesFor.length() && this.getHighSpeedVideoFpsRangesFor.charAt(this.Camera2StreamConfigurationMap) < '!') {
                this.Camera2StreamConfigurationMap++;
            }
            this.getHighSpeedVideoSizes = this.Camera2StreamConfigurationMap;
        }

        final boolean getHighSpeedVideoFpsRangesFor(char c) {
            if (this.Camera2StreamConfigurationMap >= this.getHighSpeedVideoFpsRangesFor.length() || this.getHighSpeedVideoFpsRangesFor.charAt(this.Camera2StreamConfigurationMap) != c) {
                return false;
            }
            this.Camera2StreamConfigurationMap++;
            return true;
        }

        PartLexer(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
        }
    }

    static java.lang.String getHighSpeedVideoSizes(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        stringWriter.write(str);
        stringWriter.write(32);
        boolean z = false;
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            if (z) {
                stringWriter.write(44);
            } else {
                z = true;
            }
            stringWriter.write(entry.getKey());
            stringWriter.write("=\"");
            stringWriter.write(entry.getValue());
            stringWriter.write(34);
        }
        return stringWriter.toString();
    }

    public static java.lang.String[] Camera2StreamConfigurationMap(java.lang.String[] strArr, java.lang.String str) {
        if (strArr == null) {
            return new java.lang.String[]{str};
        }
        int length = strArr.length;
        java.lang.String[] strArr2 = new java.lang.String[length + 1];
        java.lang.System.arraycopy(strArr, 0, strArr2, 0, length);
        strArr2[length] = str;
        return strArr2;
    }

    HttpUtil() {
    }
}
