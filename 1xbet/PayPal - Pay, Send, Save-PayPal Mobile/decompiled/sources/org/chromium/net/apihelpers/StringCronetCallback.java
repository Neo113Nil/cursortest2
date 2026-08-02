package org.chromium.net.apihelpers;

/* loaded from: classes18.dex */
public abstract class StringCronetCallback extends org.chromium.net.apihelpers.InMemoryTransformCronetCallback<java.lang.String> {
    StringCronetCallback() {
    }

    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public org.chromium.net.apihelpers.StringCronetCallback addCompletionListener(org.chromium.net.apihelpers.CronetRequestCompletionListener<? super java.lang.String> cronetRequestCompletionListener) {
        super.addCompletionListener((org.chromium.net.apihelpers.CronetRequestCompletionListener) cronetRequestCompletionListener);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public java.lang.String transformBodyBytes(org.chromium.net.UrlResponseInfo urlResponseInfo, byte[] bArr) {
        return new java.lang.String(bArr, getHighSpeedVideoFpsRangesFor(urlResponseInfo));
    }

    private static java.nio.charset.Charset getHighSpeedVideoFpsRangesFor(org.chromium.net.UrlResponseInfo urlResponseInfo) {
        java.lang.String highSpeedVideoFpsRangesFor;
        java.util.Iterator<java.lang.String> it = urlResponseInfo.getAllHeaders().get("Content-Type").iterator();
        java.lang.String str = null;
        loop0: while (it.hasNext()) {
            org.chromium.net.apihelpers.ContentTypeParametersParser contentTypeParametersParser = new org.chromium.net.apihelpers.ContentTypeParametersParser(it.next());
            while (contentTypeParametersParser.getHighResolutionOutputSizeshNQ4ISI < contentTypeParametersParser.getHighSpeedVideoSizes.length()) {
                try {
                    contentTypeParametersParser.getHighResolutionOutputSizeshNQ4ISI();
                    java.lang.String highSpeedVideoFpsRangesFor2 = contentTypeParametersParser.getHighSpeedVideoFpsRangesFor();
                    if (contentTypeParametersParser.getHighSpeedVideoSizes() != '=') {
                        int i = contentTypeParametersParser.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.String str2 = contentTypeParametersParser.getHighSpeedVideoSizes;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid parameter format: expected = at ");
                        sb.append(i);
                        sb.append(": [");
                        sb.append(str2);
                        sb.append("]");
                        throw new org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException(sb.toString(), contentTypeParametersParser.getHighResolutionOutputSizeshNQ4ISI);
                    }
                    contentTypeParametersParser.Camera2StreamConfigurationMap();
                    if (contentTypeParametersParser.getHighSpeedVideoSizes() != '\"') {
                        highSpeedVideoFpsRangesFor = contentTypeParametersParser.getHighSpeedVideoFpsRangesFor();
                    } else {
                        int i2 = contentTypeParametersParser.getHighResolutionOutputSizeshNQ4ISI;
                        if (contentTypeParametersParser.getHighSpeedVideoSizes() != '\"') {
                            int i3 = contentTypeParametersParser.getHighResolutionOutputSizeshNQ4ISI;
                            java.lang.String str3 = contentTypeParametersParser.getHighSpeedVideoSizes;
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Not a quoted string: expected \" at ");
                            sb2.append(i3);
                            sb2.append(": [");
                            sb2.append(str3);
                            sb2.append("]");
                            throw new org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException(sb2.toString(), contentTypeParametersParser.getHighResolutionOutputSizeshNQ4ISI);
                        }
                        contentTypeParametersParser.Camera2StreamConfigurationMap();
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        while (true) {
                            boolean z = false;
                            while (contentTypeParametersParser.getHighResolutionOutputSizeshNQ4ISI < contentTypeParametersParser.getHighSpeedVideoSizes.length()) {
                                if (z) {
                                    if (!org.chromium.net.apihelpers.ContentTypeParametersParser.getHighSpeedVideoSizes(contentTypeParametersParser.getHighSpeedVideoSizes())) {
                                        int i4 = contentTypeParametersParser.getHighResolutionOutputSizeshNQ4ISI;
                                        java.lang.String str4 = contentTypeParametersParser.getHighSpeedVideoSizes;
                                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Invalid character at ");
                                        sb4.append(i4);
                                        sb4.append(": [");
                                        sb4.append(str4);
                                        sb4.append("]");
                                        throw new org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException(sb4.toString(), contentTypeParametersParser.getHighResolutionOutputSizeshNQ4ISI);
                                    }
                                    sb3.append(contentTypeParametersParser.getHighSpeedVideoSizes());
                                    contentTypeParametersParser.Camera2StreamConfigurationMap();
                                } else {
                                    if (contentTypeParametersParser.getHighSpeedVideoSizes() == '\"') {
                                        contentTypeParametersParser.Camera2StreamConfigurationMap();
                                        highSpeedVideoFpsRangesFor = sb3.toString();
                                        break;
                                    }
                                    if (contentTypeParametersParser.getHighSpeedVideoSizes() == '\\') {
                                        contentTypeParametersParser.Camera2StreamConfigurationMap();
                                        z = true;
                                    } else {
                                        char highSpeedVideoSizes = contentTypeParametersParser.getHighSpeedVideoSizes();
                                        if (highSpeedVideoSizes == '\\' || highSpeedVideoSizes == '\"' || !org.chromium.net.apihelpers.ContentTypeParametersParser.getHighSpeedVideoSizes(highSpeedVideoSizes)) {
                                            break loop0;
                                        }
                                        sb3.append(contentTypeParametersParser.getHighSpeedVideoSizes());
                                        contentTypeParametersParser.Camera2StreamConfigurationMap();
                                    }
                                }
                            }
                            java.lang.String str5 = contentTypeParametersParser.getHighSpeedVideoSizes;
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Unterminated quoted string at ");
                            sb5.append(i2);
                            sb5.append(": [");
                            sb5.append(str5);
                            sb5.append("]");
                            throw new org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException(sb5.toString(), i2);
                        }
                        int i5 = contentTypeParametersParser.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.String str6 = contentTypeParametersParser.getHighSpeedVideoSizes;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Invalid character at ");
                        sb6.append(i5);
                        sb6.append(": [");
                        sb6.append(str6);
                        sb6.append("]");
                        throw new org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException(sb6.toString(), contentTypeParametersParser.getHighResolutionOutputSizeshNQ4ISI);
                    }
                    contentTypeParametersParser.getHighResolutionOutputSizeshNQ4ISI();
                    if (contentTypeParametersParser.getHighResolutionOutputSizeshNQ4ISI < contentTypeParametersParser.getHighSpeedVideoSizes.length()) {
                        if (contentTypeParametersParser.getHighSpeedVideoSizes() != ';') {
                            int i6 = contentTypeParametersParser.getHighResolutionOutputSizeshNQ4ISI;
                            java.lang.String str7 = contentTypeParametersParser.getHighSpeedVideoSizes;
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Invalid parameter format: expected ; at ");
                            sb7.append(i6);
                            sb7.append(": [");
                            sb7.append(str7);
                            sb7.append("]");
                            throw new org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException(sb7.toString(), contentTypeParametersParser.getHighResolutionOutputSizeshNQ4ISI);
                        }
                        contentTypeParametersParser.Camera2StreamConfigurationMap();
                    }
                    java.lang.String str8 = (java.lang.String) new java.util.AbstractMap.SimpleEntry(highSpeedVideoFpsRangesFor2, highSpeedVideoFpsRangesFor).getValue();
                    if (str != null && !str8.equalsIgnoreCase(str)) {
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Multiple charsets provided: ");
                        sb8.append(str8);
                        sb8.append(" and ");
                        sb8.append(str);
                        throw new java.lang.IllegalArgumentException(sb8.toString());
                    }
                    str = str8;
                } catch (org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException unused) {
                    continue;
                }
            }
        }
        if (str != null) {
            return java.nio.charset.Charset.forName(str);
        }
        return java.nio.charset.Charset.defaultCharset();
    }
}
