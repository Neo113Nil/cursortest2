package q4;

import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.tasks.TaskCompletionSource;
import i4.C1267d;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import n4.C1473g;
import n4.C1480n;
import w1.L;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f15865a = "0123456789abcdef".toCharArray();

    public static String a(double d7) {
        StringBuilder sb = new StringBuilder(16);
        long doubleToLongBits = Double.doubleToLongBits(d7);
        for (int i7 = 7; i7 >= 0; i7--) {
            int i8 = (int) ((doubleToLongBits >>> (i7 * 8)) & 255);
            char[] cArr = f15865a;
            sb.append(cArr[(i8 >> 4) & 15]);
            sb.append(cArr[i8 & 15]);
        }
        return sb.toString();
    }

    public static void b(String str, boolean z4) {
        if (z4) {
            return;
        }
        L.l("Assertion failed: ", str, "FirebaseDatabase");
    }

    public static void c(boolean z4) {
        b("", z4);
    }

    public static f d(String str) {
        String str2;
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            if (scheme == null) {
                throw new IllegalArgumentException("Database URL does not specify a URL scheme");
            }
            String host = parse.getHost();
            if (host == null) {
                throw new IllegalArgumentException("Database URL does not specify a valid host");
            }
            String queryParameter = parse.getQueryParameter("ns");
            if (queryParameter == null) {
                queryParameter = host.split("\\.", -1)[0].toLowerCase(Locale.US);
            }
            C1480n c1480n = new C1480n();
            c1480n.f15462a = host.toLowerCase(Locale.US);
            int port = parse.getPort();
            if (port != -1) {
                c1480n.f15463b = scheme.equals("https") || scheme.equals("wss");
                c1480n.f15462a += ":" + port;
            } else {
                c1480n.f15463b = true;
            }
            c1480n.f15464c = queryParameter;
            int indexOf = str.indexOf("//");
            if (indexOf == -1) {
                throw new C1267d("Firebase Database URL is missing URL scheme");
            }
            String substring = str.substring(indexOf + 2);
            int indexOf2 = substring.indexOf("/");
            if (indexOf2 != -1) {
                int indexOf3 = substring.indexOf("?");
                str2 = indexOf3 != -1 ? substring.substring(indexOf2 + 1, indexOf3) : substring.substring(indexOf2 + 1);
            } else {
                str2 = "";
            }
            String replace = str2.replace("+", " ");
            l.d(replace);
            f fVar = new f();
            fVar.f15860b = new C1473g(replace);
            fVar.f15859a = c1480n;
            return fVar;
        } catch (Exception e7) {
            throw new C1267d(L.i("Invalid Firebase Database url specified: ", str), e7);
        }
    }

    public static String e(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 encoding is required for Firebase Database to run!");
        } catch (NoSuchAlgorithmException e7) {
            throw new RuntimeException("Missing SHA-1 MessageDigest provider.", e7);
        }
    }

    public static String f(String str) {
        String replace = str.indexOf(92) != -1 ? str.replace("\\", "\\\\") : str;
        if (str.indexOf(34) != -1) {
            replace = replace.replace("\"", "\\\"");
        }
        return "\"" + replace + '\"';
    }

    public static Integer g(String str) {
        boolean z4;
        if (str.length() > 11 || str.length() == 0) {
            return null;
        }
        int i7 = 0;
        if (str.charAt(0) == '-') {
            z4 = true;
            if (str.length() == 1) {
                return null;
            }
            i7 = 1;
        } else {
            z4 = false;
        }
        long j = 0;
        while (i7 < str.length()) {
            char charAt = str.charAt(i7);
            if (charAt < '0' || charAt > '9') {
                return null;
            }
            j = (j * 10) + (charAt - '0');
            i7++;
        }
        if (!z4) {
            if (j > 2147483647L) {
                return null;
            }
            return Integer.valueOf((int) j);
        }
        long j3 = -j;
        if (j3 < -2147483648L) {
            return null;
        }
        return Integer.valueOf((int) j3);
    }

    public static e h() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        return new e(taskCompletionSource.getTask(), new j(taskCompletionSource));
    }
}
