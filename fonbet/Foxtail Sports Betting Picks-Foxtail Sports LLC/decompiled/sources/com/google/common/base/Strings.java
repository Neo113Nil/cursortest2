package com.google.common.base;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class Strings {
    private Strings() {
    }

    public static String nullToEmpty(String string) {
        return Platform.nullToEmpty(string);
    }

    public static String emptyToNull(String string) {
        return Platform.emptyToNull(string);
    }

    public static boolean isNullOrEmpty(String string) {
        return Platform.stringIsNullOrEmpty(string);
    }

    public static String padStart(String string, int minLength, char padChar) {
        Preconditions.checkNotNull(string);
        if (string.length() >= minLength) {
            return string;
        }
        StringBuilder sb = new StringBuilder(minLength);
        for (int length = string.length(); length < minLength; length++) {
            sb.append(padChar);
        }
        sb.append(string);
        return sb.toString();
    }

    public static String padEnd(String string, int minLength, char padChar) {
        Preconditions.checkNotNull(string);
        if (string.length() >= minLength) {
            return string;
        }
        StringBuilder sb = new StringBuilder(minLength);
        sb.append(string);
        for (int length = string.length(); length < minLength; length++) {
            sb.append(padChar);
        }
        return sb.toString();
    }

    public static String repeat(String string, int count) {
        Preconditions.checkNotNull(string);
        if (count <= 1) {
            Preconditions.checkArgument(count >= 0, "invalid count: %s", count);
            return count == 0 ? "" : string;
        }
        int length = string.length();
        long j = length * count;
        int i = (int) j;
        if (i != j) {
            throw new ArrayIndexOutOfBoundsException("Required array size too large: " + j);
        }
        char[] cArr = new char[i];
        string.getChars(0, length, cArr, 0);
        while (true) {
            int i2 = i - length;
            if (length < i2) {
                System.arraycopy(cArr, 0, cArr, length, length);
                length <<= 1;
            } else {
                System.arraycopy(cArr, 0, cArr, length, i2);
                return new String(cArr);
            }
        }
    }

    public static String commonPrefix(CharSequence a, CharSequence b) {
        Preconditions.checkNotNull(a);
        Preconditions.checkNotNull(b);
        int min = Math.min(a.length(), b.length());
        int i = 0;
        while (i < min && a.charAt(i) == b.charAt(i)) {
            i++;
        }
        int i2 = i - 1;
        if (validSurrogatePairAt(a, i2) || validSurrogatePairAt(b, i2)) {
            i--;
        }
        return a.subSequence(0, i).toString();
    }

    public static String commonSuffix(CharSequence a, CharSequence b) {
        Preconditions.checkNotNull(a);
        Preconditions.checkNotNull(b);
        int min = Math.min(a.length(), b.length());
        int i = 0;
        while (i < min && a.charAt((a.length() - i) - 1) == b.charAt((b.length() - i) - 1)) {
            i++;
        }
        if (validSurrogatePairAt(a, (a.length() - i) - 1) || validSurrogatePairAt(b, (b.length() - i) - 1)) {
            i--;
        }
        return a.subSequence(a.length() - i, a.length()).toString();
    }

    static boolean validSurrogatePairAt(CharSequence string, int index) {
        return index >= 0 && index <= string.length() + (-2) && Character.isHighSurrogate(string.charAt(index)) && Character.isLowSurrogate(string.charAt(index + 1));
    }

    public static String lenientFormat(String template, Object... args) {
        int indexOf;
        String valueOf = String.valueOf(template);
        int i = 0;
        if (args == null) {
            args = new Object[]{"(Object[])null"};
        }
        StringBuilder sb = new StringBuilder(valueOf.length() + (args.length * 16));
        int i2 = 0;
        while (i < args.length && (indexOf = valueOf.indexOf("%s", i2)) != -1) {
            sb.append((CharSequence) valueOf, i2, indexOf);
            sb.append(lenientToString(args[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) valueOf, i2, valueOf.length());
        if (i < args.length) {
            String str = " [";
            while (i < args.length) {
                sb.append(str);
                sb.append(lenientToString(args[i]));
                i++;
                str = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String lenientToString(Object o) {
        if (o == null) {
            return "null";
        }
        try {
            return o.toString();
        } catch (Exception e) {
            String str = o.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(o));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str, (Throwable) e);
            return "<" + str + " threw " + e.getClass().getName() + ">";
        }
    }
}
