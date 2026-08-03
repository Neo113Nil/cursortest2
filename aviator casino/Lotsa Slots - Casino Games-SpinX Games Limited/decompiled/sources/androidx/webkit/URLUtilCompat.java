package androidx.webkit;

/* loaded from: classes2.dex */
public final class URLUtilCompat {
    private static final java.util.regex.Pattern DISPOSITION_PATTERN = java.util.regex.Pattern.compile("\\s*(\\S+?) # Group 1: parameter name\n\\s*=\\s* # Match equals sign\n(?: # non-capturing group of options\n   '( (?: [^'\\\\] | \\\\. )* )' # Group 2: single-quoted\n | \"( (?: [^\"\\\\] | \\\\. )*  )\" # Group 3: double-quoted\n | ( [^'\"][^;\\s]* ) # Group 4: un-quoted parameter\n)\\s*;? # Optional end semicolon", 4);

    private URLUtilCompat() {
    }

    public static java.lang.String guessFileName(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String filenameSuggestion = getFilenameSuggestion(str, str2);
        java.lang.String suggestExtensionFromMimeType = suggestExtensionFromMimeType(str3);
        if (filenameSuggestion.indexOf(46) < 0) {
            return filenameSuggestion + suggestExtensionFromMimeType;
        }
        if (str3 == null || !extensionDifferentFromMimeType(filenameSuggestion, str3)) {
            return filenameSuggestion;
        }
        return filenameSuggestion + suggestExtensionFromMimeType;
    }

    private static java.lang.String getFilenameSuggestion(java.lang.String str, java.lang.String str2) {
        java.lang.String lastPathSegment;
        java.lang.String filenameFromContentDisposition;
        if (str2 != null && (filenameFromContentDisposition = getFilenameFromContentDisposition(str2)) != null) {
            return replacePathSeparators(filenameFromContentDisposition);
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        if (parse != null && (lastPathSegment = parse.getLastPathSegment()) != null) {
            return replacePathSeparators(lastPathSegment);
        }
        return "downloadfile";
    }

    private static java.lang.String replacePathSeparators(java.lang.String str) {
        return str.replaceAll(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING, "_");
    }

    private static boolean extensionDifferentFromMimeType(java.lang.String str, java.lang.String str2) {
        java.lang.String mimeTypeFromExtension = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(str.lastIndexOf(46) + 1));
        return (mimeTypeFromExtension == null || mimeTypeFromExtension.equalsIgnoreCase(str2)) ? false : true;
    }

    private static java.lang.String suggestExtensionFromMimeType(java.lang.String str) {
        if (str == null) {
            return ".bin";
        }
        java.lang.String extensionFromMimeType = android.webkit.MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            return "." + extensionFromMimeType;
        }
        if (str.equalsIgnoreCase("text/html")) {
            return ".html";
        }
        if (!str.toLowerCase(java.util.Locale.ROOT).startsWith("text/")) {
            return ".bin";
        }
        return ".txt";
    }

    public static java.lang.String getFilenameFromContentDisposition(java.lang.String str) {
        java.lang.String group;
        java.lang.String[] split = str.trim().split(";", 2);
        java.lang.String str2 = null;
        if (split.length < 2 || "inline".equalsIgnoreCase(split[0].trim())) {
            return null;
        }
        java.util.regex.Matcher matcher = DISPOSITION_PATTERN.matcher(split[1]);
        java.lang.String str3 = null;
        while (matcher.find()) {
            java.lang.String group2 = matcher.group(1);
            if (matcher.group(2) != null) {
                group = removeSlashEscapes(matcher.group(2));
            } else if (matcher.group(3) != null) {
                group = removeSlashEscapes(matcher.group(3));
            } else {
                group = matcher.group(4);
            }
            if (group2 != null && group != null) {
                if (io.ktor.http.ContentDisposition.Parameters.FileNameAsterisk.equalsIgnoreCase(group2)) {
                    str2 = parseExtValueString(group);
                } else if (io.ktor.http.ContentDisposition.Parameters.FileName.equalsIgnoreCase(group2)) {
                    str3 = group;
                }
            }
        }
        return str2 != null ? str2 : str3;
    }

    private static java.lang.String removeSlashEscapes(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\\\\(.)", "$1");
    }

    private static java.lang.String parseExtValueString(java.lang.String str) {
        java.lang.String[] split = str.split("'", 3);
        if (split.length < 3) {
            return null;
        }
        java.lang.String str2 = split[0];
        try {
            return java.net.URLDecoder.decode(encodePlusCharacters(split[2], str2), str2);
        } catch (java.io.UnsupportedEncodingException | java.lang.RuntimeException unused) {
            return null;
        }
    }

    private static java.lang.String encodePlusCharacters(java.lang.String str, java.lang.String str2) {
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName(str2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte b : forName.encode(org.slf4j.Marker.ANY_NON_NULL_MARKER).array()) {
            sb.append(java.lang.String.format("%02x", java.lang.Byte.valueOf(b)));
        }
        return str.replaceAll("\\+", sb.toString());
    }
}
