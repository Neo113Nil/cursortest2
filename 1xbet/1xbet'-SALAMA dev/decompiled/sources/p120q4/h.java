package p120q4;

import com.google.android.gms.common.api.f;
import java.util.Random;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    static {
        new Random();
    }

    public static final String a(String str) {
        l.b(str);
        Integer numG = k.g(str);
        if (numG != null) {
            return numG.intValue() == Integer.MIN_VALUE ? "[MIN_NAME]" : String.valueOf(numG.intValue() - 1);
        }
        StringBuilder sb = new StringBuilder(str);
        if (sb.charAt(sb.length() - 1) == '-') {
            return sb.length() == 1 ? String.valueOf(f.API_PRIORITY_OTHER) : sb.substring(0, sb.length() - 1);
        }
        sb.setCharAt(sb.length() - 1, "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".charAt("-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".indexOf(sb.charAt(sb.length() - 1)) - 1));
        sb.append(new String(new char[786 - sb.length()]).replace(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "z"));
        return sb.toString();
    }

    public static final String b(String str) {
        l.b(str);
        Integer numG = k.g(str);
        if (numG != null) {
            return numG.intValue() == Integer.MAX_VALUE ? String.valueOf('-') : String.valueOf(numG.intValue() + 1);
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
