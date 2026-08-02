package androidx.webkit;

/* loaded from: classes7.dex */
public final class URLUtilCompat {
    private static final java.util.regex.Pattern getHighSpeedVideoFpsRanges = java.util.regex.Pattern.compile("\\s*(\\S+?) # Group 1: parameter name\n\\s*=\\s* # Match equals sign\n(?: # non-capturing group of options\n   '( (?: [^'\\\\] | \\\\. )* )' # Group 2: single-quoted\n | \"( (?: [^\"\\\\] | \\\\. )*  )\" # Group 3: double-quoted\n | ( [^'\"][^;\\s]* ) # Group 4: un-quoted parameter\n)\\s*;? # Optional end semicolon", 4);

    private URLUtilCompat() {
    }

    public static java.lang.String guessFileName(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        java.lang.String lastPathSegment;
        java.lang.String filenameFromContentDisposition;
        if (str2 != null && (filenameFromContentDisposition = getFilenameFromContentDisposition(str2)) != null) {
            return getHighSpeedVideoFpsRanges(filenameFromContentDisposition);
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        if (parse != null && (lastPathSegment = parse.getLastPathSegment()) != null) {
            str4 = getHighSpeedVideoFpsRanges(lastPathSegment);
        } else {
            str4 = "downloadfile";
        }
        if (str4.indexOf(46) >= 0 && !getHighSpeedVideoFpsRangesFor(str4, str3)) {
            return str4;
        }
        java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str3);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str4);
        sb.append(highSpeedVideoFpsRangesFor);
        return sb.toString();
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str) {
        return str.replaceAll(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, "_");
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        java.lang.String extensionFromMimeType;
        if (str == null) {
            return "";
        }
        java.lang.String lowerCase = str.trim().toLowerCase(java.util.Locale.ROOT);
        if (lowerCase.equals(com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor.MIME_TYPE_OCTET_STREAM) || (extensionFromMimeType = android.webkit.MimeTypeMap.getSingleton().getExtensionFromMimeType(lowerCase)) == null) {
            return "";
        }
        return ".".concat(java.lang.String.valueOf(extensionFromMimeType));
    }

    private static boolean getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            return false;
        }
        java.lang.String mimeTypeFromExtension = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(str.lastIndexOf(46) + 1));
        return (mimeTypeFromExtension == null || mimeTypeFromExtension.equalsIgnoreCase(str2)) ? false : true;
    }

    public static java.lang.String getFilenameFromContentDisposition(java.lang.String str) {
        java.lang.String group;
        java.lang.String[] split = str.trim().split(";", 2);
        java.lang.String str2 = null;
        if (split.length < 2 || "inline".equalsIgnoreCase(split[0].trim())) {
            return null;
        }
        java.util.regex.Matcher matcher = getHighSpeedVideoFpsRanges.matcher(split[1]);
        java.lang.String str3 = null;
        while (matcher.find()) {
            java.lang.String group2 = matcher.group(1);
            if (matcher.group(2) != null) {
                group = getHighSpeedVideoSizes(matcher.group(2));
            } else if (matcher.group(3) != null) {
                group = getHighSpeedVideoSizes(matcher.group(3));
            } else {
                group = matcher.group(4);
            }
            if (group2 != null && group != null) {
                if (io.ktor.http.ContentDisposition.Parameters.FileNameAsterisk.equalsIgnoreCase(group2)) {
                    str2 = getHighResolutionOutputSizeshNQ4ISI(group);
                } else if ("filename".equalsIgnoreCase(group2)) {
                    str3 = group;
                }
            }
        }
        return str2 != null ? str2 : str3;
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\\\\(.)", "$1");
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        java.lang.String[] split = str.split("'", 3);
        if (split.length < 3) {
            return null;
        }
        java.lang.String str2 = split[0];
        try {
            return java.net.URLDecoder.decode(getHighSpeedVideoFpsRanges(split[2], str2), str2);
        } catch (java.io.UnsupportedEncodingException | java.lang.RuntimeException unused) {
            return null;
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2) {
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName(str2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte b : forName.encode("+").array()) {
            sb.append(java.lang.String.format("%02x", java.lang.Byte.valueOf(b)));
        }
        return str.replaceAll("\\+", sb.toString());
    }
}
