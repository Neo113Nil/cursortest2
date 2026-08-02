package q4;

import java.util.Random;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes2.dex */
public abstract class h {
    static {
        new Random();
    }

    public static final String a(String str) {
        l.b(str);
        Integer g3 = k.g(str);
        if (g3 != null) {
            return g3.intValue() == Integer.MIN_VALUE ? "[MIN_NAME]" : String.valueOf(g3.intValue() - 1);
        }
        StringBuilder sb = new StringBuilder(str);
        if (sb.charAt(sb.length() - 1) == '-') {
            return sb.length() == 1 ? String.valueOf(com.google.android.gms.common.api.f.API_PRIORITY_OTHER) : sb.substring(0, sb.length() - 1);
        }
        sb.setCharAt(sb.length() - 1, "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".indexOf(sb.charAt(sb.length() - 1)) - 1));
        sb.append(new String(new char[786 - sb.length()]).replace(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "z"));
        return sb.toString();
    }

    public static final String b(String str) {
        l.b(str);
        Integer g3 = k.g(str);
        if (g3 != null) {
            return g3.intValue() == Integer.MAX_VALUE ? String.valueOf('-') : String.valueOf(g3.intValue() + 1);
        }
        StringBuilder sb = new StringBuilder(str);
        if (sb.length() < 786) {
            sb.append('-');
            return sb.toString();
        }
        int length = sb.length() - 1;
        while (length >= 0 && sb.charAt(length) == 'z') {
            length--;
        }
        if (length == -1) {
            return "[MAX_KEY]";
        }
        int i7 = length + 1;
        sb.replace(length, i7, String.valueOf("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".indexOf(sb.charAt(length)) + 1)));
        return sb.substring(0, i7);
    }
}
