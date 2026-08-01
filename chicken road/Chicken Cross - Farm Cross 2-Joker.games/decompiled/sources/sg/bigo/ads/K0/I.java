package sg.bigo.ads.K0;

import android.graphics.Color;
import java.security.SecureRandom;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f12345a;

    static {
        new SecureRandom();
        f12345a = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
    }

    public static String a(String str, String str2) {
        return (a((CharSequence) str) || a((CharSequence) str2)) ? !a((CharSequence) str) ? str : !a((CharSequence) str2) ? str2 : "" : str + "," + str2;
    }

    public static int b(int i, String str) {
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return i;
        }
    }

    public static byte[] a(String str) {
        if (a((CharSequence) str)) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (((byte) "0123456789ABCDEF".indexOf(charArray[i2 + 1])) | (((byte) "0123456789ABCDEF".indexOf(charArray[i2])) << 4));
        }
        return bArr;
    }

    public static boolean a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static int a(int i, String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public static String a(String str, String str2, String str3, boolean z) {
        if (a((CharSequence) str) || a((CharSequence) str2) || a((CharSequence) str3)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length() - 1;
        while (true) {
            int indexOf = (a((CharSequence) str) || a((CharSequence) str2)) ? -1 : z ? str.toLowerCase().indexOf(str2.toLowerCase()) : str.indexOf(str2);
            if (indexOf == -1) {
                sb.append(str);
                return sb.toString();
            }
            sb.append(str.substring(0, indexOf)).append(str3);
            str = indexOf < length ? str.substring(str2.length() + indexOf) : "";
        }
    }
}
