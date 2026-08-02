package org.chromium.net.apihelpers;

/* loaded from: classes18.dex */
final class ContentTypeParametersParser {
    int getHighResolutionOutputSizeshNQ4ISI;
    final java.lang.String getHighSpeedVideoSizes;

    static boolean getHighSpeedVideoSizes(char c) {
        if (c == '\t' || c == ' ') {
            return true;
        }
        return '!' <= c && c <= 255 && c != 127;
    }

    ContentTypeParametersParser(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
        int indexOf = str.indexOf(59);
        this.getHighResolutionOutputSizeshNQ4ISI = indexOf != -1 ? indexOf + 1 : str.length();
    }

    final java.lang.String getHighSpeedVideoFpsRangesFor() throws org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException {
        char highSpeedVideoSizes;
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        while (this.getHighResolutionOutputSizeshNQ4ISI < this.getHighSpeedVideoSizes.length() && (highSpeedVideoSizes = getHighSpeedVideoSizes()) <= 127 && (java.lang.Character.isLetterOrDigit(highSpeedVideoSizes) || "!#$%&'*+-.^_`|~".indexOf(highSpeedVideoSizes) != -1)) {
            Camera2StreamConfigurationMap();
        }
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == i2) {
            java.lang.String str = this.getHighSpeedVideoSizes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Token not found at position ");
            sb.append(i);
            sb.append(": [");
            sb.append(str);
            sb.append("]");
            throw new org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException(sb.toString(), i);
        }
        return this.getHighSpeedVideoSizes.substring(i, i2);
    }

    static class ContentTypeParametersParserException extends java.text.ParseException {
        ContentTypeParametersParserException(java.lang.String str, int i) {
            super(str, i);
        }
    }

    final void Camera2StreamConfigurationMap() throws org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException {
        if (this.getHighResolutionOutputSizeshNQ4ISI >= this.getHighSpeedVideoSizes.length()) {
            throw new org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException("End of header reached", this.getHighResolutionOutputSizeshNQ4ISI);
        }
        this.getHighResolutionOutputSizeshNQ4ISI++;
    }

    final char getHighSpeedVideoSizes() throws org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException {
        if (this.getHighResolutionOutputSizeshNQ4ISI >= this.getHighSpeedVideoSizes.length()) {
            throw new org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException("End of header reached", this.getHighResolutionOutputSizeshNQ4ISI);
        }
        return this.getHighSpeedVideoSizes.charAt(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    final void getHighResolutionOutputSizeshNQ4ISI() throws org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException {
        while (this.getHighResolutionOutputSizeshNQ4ISI < this.getHighSpeedVideoSizes.length()) {
            char highSpeedVideoSizes = getHighSpeedVideoSizes();
            if (highSpeedVideoSizes != '\t' && highSpeedVideoSizes != ' ') {
                return;
            } else {
                Camera2StreamConfigurationMap();
            }
        }
    }
}
