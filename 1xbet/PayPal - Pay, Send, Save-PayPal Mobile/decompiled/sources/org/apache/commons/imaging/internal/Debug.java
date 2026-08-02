package org.apache.commons.imaging.internal;

/* loaded from: classes17.dex */
public final class Debug {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.internal.Debug.class.getName());
    private static final java.lang.String NEWLINE = "\r\n";
    private static long counter;

    public static void debug(java.lang.String str) {
        java.util.logging.Logger logger = LOGGER;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest(str);
        }
    }

    public static void debug() {
        java.util.logging.Logger logger = LOGGER;
        if (logger.isLoggable(java.util.logging.Level.FINEST)) {
            logger.finest("\r\n");
        }
    }

    private static java.lang.String getDebug(java.lang.String str, int[] iArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (iArr == null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(" (null)\r\n");
            sb.append(sb2.toString());
        } else {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append(" (");
            sb3.append(iArr.length);
            sb3.append(")\r\n");
            sb.append(sb3.toString());
            for (int i : iArr) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("\t");
                sb4.append(i);
                sb4.append("\r\n");
                sb.append(sb4.toString());
            }
            sb.append("\r\n");
        }
        return sb.toString();
    }

    private static java.lang.String getDebug(java.lang.String str, byte[] bArr) {
        return getDebug(str, bArr, 250);
    }

    private static java.lang.String getDebug(java.lang.String str, byte[] bArr, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (bArr == null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(" (null)\r\n");
            sb.append(sb2.toString());
        } else {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append(" (");
            sb3.append(bArr.length);
            sb3.append(")\r\n");
            sb.append(sb3.toString());
            for (int i2 = 0; i2 < i && i2 < bArr.length; i2++) {
                int i3 = bArr[i2] & 255;
                char c = (i3 == 0 || i3 == 10 || i3 == 11 || i3 == 13) ? ' ' : (char) i3;
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("\t");
                sb4.append(i2);
                sb4.append(": ");
                sb4.append(i3);
                sb4.append(" (");
                sb4.append(c);
                sb4.append(", 0x");
                sb4.append(java.lang.Integer.toHexString(i3));
                sb4.append(")\r\n");
                sb.append(sb4.toString());
            }
            if (bArr.length > i) {
                sb.append("\t...\r\n");
            }
            sb.append("\r\n");
        }
        return sb.toString();
    }

    private static java.lang.String getDebug(java.lang.String str, char[] cArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (cArr == null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(" (null)\r\n");
            sb.append(sb2.toString());
        } else {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append(" (");
            sb3.append(cArr.length);
            sb3.append(")\r\n");
            sb.append(sb3.toString());
            for (char c : cArr) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("\t");
                sb4.append(c);
                sb4.append(" (");
                sb4.append(c & 255);
                sb4.append(")\r\n");
                sb.append(sb4.toString());
            }
            sb.append("\r\n");
        }
        return sb.toString();
    }

    private static void debug(java.lang.String str, java.util.Map<?, ?> map) {
        debug(getDebug(str, map));
    }

    private static java.lang.String getDebug(java.lang.String str, java.util.Map<?, ?> map) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (map == null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(" map: null");
            return sb2.toString();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(map.keySet());
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(str);
        sb3.append(" map: ");
        sb3.append(arrayList.size());
        sb3.append("\r\n");
        sb.append(sb3.toString());
        for (int i = 0; i < arrayList.size(); i++) {
            java.lang.Object obj = arrayList.get(i);
            java.lang.Object obj2 = map.get(obj);
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("\t");
            sb4.append(i);
            sb4.append(": '");
            sb4.append(obj);
            sb4.append("' -> '");
            sb4.append(obj2);
            sb4.append("'\r\n");
            sb.append(sb4.toString());
        }
        sb.append("\r\n");
        return sb.toString();
    }

    private static java.lang.String byteQuadToString(int i) {
        byte b = (byte) ((i >> 24) & 255);
        byte b2 = (byte) ((i >> 16) & 255);
        byte b3 = (byte) ((i >> 8) & 255);
        byte b4 = (byte) (i & 255);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(31);
        sb.append(new java.lang.String(new char[]{(char) b, (char) b2, (char) b3, (char) b4}));
        sb.append(" bytequad: ");
        sb.append(i);
        sb.append(" b1: ");
        sb.append((int) b);
        sb.append(" b2: ");
        sb.append((int) b2);
        sb.append(" b3: ");
        sb.append((int) b3);
        sb.append(" b4: ");
        sb.append((int) b4);
        return sb.toString();
    }

    public static void debug(java.lang.String str, java.lang.Object obj) {
        if (obj == null) {
            debug(str, "null");
            return;
        }
        if (obj instanceof char[]) {
            debug(str, (char[]) obj);
            return;
        }
        if (obj instanceof byte[]) {
            debug(str, (byte[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            debug(str, (int[]) obj);
            return;
        }
        if (obj instanceof java.lang.String) {
            debug(str, (java.lang.String) obj);
            return;
        }
        if (obj instanceof java.util.List) {
            debug(str, (java.util.List<?>) obj);
            return;
        }
        if (obj instanceof java.util.Map) {
            debug(str, (java.util.Map<?, ?>) obj);
            return;
        }
        if (obj instanceof java.awt.color.ICC_Profile) {
            debug(str, (java.awt.color.ICC_Profile) obj);
            return;
        }
        if (obj instanceof java.io.File) {
            debug(str, (java.io.File) obj);
            return;
        }
        if (obj instanceof java.util.Date) {
            debug(str, (java.util.Date) obj);
        } else if (obj instanceof java.util.Calendar) {
            debug(str, (java.util.Calendar) obj);
        } else {
            debug(str, obj.toString());
        }
    }

    private static void debug(java.lang.String str, byte[] bArr) {
        debug(getDebug(str, bArr));
    }

    private static void debug(java.lang.String str, char[] cArr) {
        debug(getDebug(str, cArr));
    }

    private static void debug(java.lang.String str, java.util.Calendar calendar) {
        debug(str, calendar == null ? "null" : new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss", java.util.Locale.ENGLISH).format(calendar.getTime()));
    }

    private static void debug(java.lang.String str, java.util.Date date) {
        debug(str, date == null ? "null" : new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss", java.util.Locale.ENGLISH).format(date));
    }

    private static void debug(java.lang.String str, java.io.File file) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(file == null ? "null" : file.getPath());
        debug(sb.toString());
    }

    private static void debug(java.lang.String str, java.awt.color.ICC_Profile iCC_Profile) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ICC_Profile ");
        sb.append(str);
        sb.append(": ");
        sb.append(iCC_Profile == null ? "null" : iCC_Profile.toString());
        debug(sb.toString());
        if (iCC_Profile != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\t getProfileClass: ");
            sb2.append(byteQuadToString(iCC_Profile.getProfileClass()));
            debug(sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("\t getPCSType: ");
            sb3.append(byteQuadToString(iCC_Profile.getPCSType()));
            debug(sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("\t getColorSpaceType() : ");
            sb4.append(byteQuadToString(iCC_Profile.getColorSpaceType()));
            debug(sb4.toString());
        }
    }

    private static void debug(java.lang.String str, int[] iArr) {
        debug(getDebug(str, iArr));
    }

    private static void debug(java.lang.String str, java.util.List<?> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" [");
        long j = counter;
        counter = 1 + j;
        sb.append(j);
        sb.append("]");
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(" (");
        sb2.append(list.size());
        sb2.append(")");
        sb2.append(obj);
        debug(sb2.toString());
        for (java.lang.Object obj2 : list) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("\t");
            sb3.append(obj2.toString());
            sb3.append(obj);
            debug(sb3.toString());
        }
        debug();
    }

    private static void debug(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        debug(sb.toString());
    }

    public static void debug(java.lang.Throwable th) {
        debug(getDebug(th));
    }

    public static void debug(java.lang.Throwable th, int i) {
        debug(getDebug(th, i));
    }

    private static java.lang.String getDebug(java.lang.Throwable th) {
        return getDebug(th, -1);
    }

    private static java.lang.String getDebug(java.lang.Throwable th, int i) {
        java.lang.String obj;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(35);
        java.lang.String lowerCase = new java.text.SimpleDateFormat("yyyy-MM-dd kk:mm:ss:SSS", java.util.Locale.ENGLISH).format(new java.util.Date()).toLowerCase();
        sb.append("\r\n");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Throwable: ");
        if (th == null) {
            obj = "";
        } else {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("(");
            sb3.append(th.getClass().getName());
            sb3.append(")");
            obj = sb3.toString();
        }
        sb2.append(obj);
        sb2.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb2.append(lowerCase);
        sb2.append("\r\n");
        sb.append(sb2.toString());
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Throwable: ");
        sb4.append(th == null ? "null" : th.getLocalizedMessage());
        sb4.append("\r\n");
        sb.append(sb4.toString());
        sb.append("\r\n");
        sb.append(getStackTrace(th, i));
        sb.append("Caught here:\r\n");
        sb.append(getStackTrace(new java.lang.Exception(), i, 1));
        sb.append("\r\n");
        return sb.toString();
    }

    private static java.lang.String getStackTrace(java.lang.Throwable th, int i) {
        return getStackTrace(th, i, 0);
    }

    private static java.lang.String getStackTrace(java.lang.Throwable th, int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (th != null) {
            java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                while (i2 < stackTrace.length && (i < 0 || i2 < i)) {
                    java.lang.StackTraceElement stackTraceElement = stackTrace[i2];
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\tat ");
                    sb2.append(stackTraceElement.getClassName());
                    sb2.append(".");
                    sb2.append(stackTraceElement.getMethodName());
                    sb2.append("(");
                    sb2.append(stackTraceElement.getFileName());
                    sb2.append(io.ktor.sse.ServerSentEventKt.COLON);
                    sb2.append(stackTraceElement.getLineNumber());
                    sb2.append(")\r\n");
                    sb.append(sb2.toString());
                    i2++;
                }
                if (i >= 0 && stackTrace.length > i) {
                    sb.append("\t...\r\n");
                }
            }
            sb.append("\r\n");
        }
        return sb.toString();
    }

    private Debug() {
    }
}
