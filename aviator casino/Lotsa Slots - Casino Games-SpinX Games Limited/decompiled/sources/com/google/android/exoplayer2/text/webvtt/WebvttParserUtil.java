package com.google.android.exoplayer2.text.webvtt;

/* loaded from: classes3.dex */
public final class WebvttParserUtil {
    private static final java.util.regex.Pattern COMMENT = java.util.regex.Pattern.compile("^NOTE([ \t].*)?$");
    private static final java.lang.String WEBVTT_HEADER = "WEBVTT";

    private WebvttParserUtil() {
    }

    public static void validateWebvttHeaderLine(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) throws com.google.android.exoplayer2.ParserException {
        int position = parsableByteArray.getPosition();
        if (isWebvttHeaderLine(parsableByteArray)) {
            return;
        }
        parsableByteArray.setPosition(position);
        throw com.google.android.exoplayer2.ParserException.createForMalformedContainer("Expected WEBVTT. Got " + parsableByteArray.readLine(), null);
    }

    public static boolean isWebvttHeaderLine(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        java.lang.String readLine = parsableByteArray.readLine();
        return readLine != null && readLine.startsWith(WEBVTT_HEADER);
    }

    public static long parseTimestampUs(java.lang.String str) throws java.lang.NumberFormatException {
        java.lang.String[] splitAtFirst = com.google.android.exoplayer2.util.Util.splitAtFirst(str, "\\.");
        long j = 0;
        for (java.lang.String str2 : com.google.android.exoplayer2.util.Util.split(splitAtFirst[0], ":")) {
            j = (j * 60) + java.lang.Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (splitAtFirst.length == 2) {
            j2 += java.lang.Long.parseLong(splitAtFirst[1]);
        }
        return j2 * 1000;
    }

    public static float parsePercentage(java.lang.String str) throws java.lang.NumberFormatException {
        if (!str.endsWith("%")) {
            throw new java.lang.NumberFormatException("Percentages must end with %");
        }
        return java.lang.Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
    }

    public static java.util.regex.Matcher findNextCueHeader(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        java.lang.String readLine;
        while (true) {
            java.lang.String readLine2 = parsableByteArray.readLine();
            if (readLine2 == null) {
                return null;
            }
            if (COMMENT.matcher(readLine2).matches()) {
                do {
                    readLine = parsableByteArray.readLine();
                    if (readLine != null) {
                    }
                } while (!readLine.isEmpty());
            } else {
                java.util.regex.Matcher matcher = com.google.android.exoplayer2.text.webvtt.WebvttCueParser.CUE_HEADER_PATTERN.matcher(readLine2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }
}
