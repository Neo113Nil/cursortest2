package p120q4;

import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import p063i4.d;
import p098n4.C0934g;
import p098n4.C0941n;
import p155w1.L;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f15871a = "0123456789abcdef".toCharArray();

    public static String a(double d7) {
        StringBuilder sb = new StringBuilder(16);
        long jDoubleToLongBits = Double.doubleToLongBits(d7);
        for (int i7 = 7; i7 >= 0; i7--) {
            int i8 = (int) ((jDoubleToLongBits >>> (i7 * 8)) & 255);
            char[] cArr = f15871a;
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
        String strSubstring;
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (scheme == null) {
                throw new IllegalArgumentException("Database URL does not specify a URL scheme");
            }
            String host = uri.getHost();
            if (host == null) {
                throw new IllegalArgumentException("Database URL does not specify a valid host");
            }
            String queryParameter = uri.getQueryParameter("ns");
            if (queryParameter == null) {
                queryParameter = host.split("\\.", -1)[0].toLowerCase(Locale.US);
            }
            C0941n c0941n = new C0941n();
            c0941n.f15468a = host.toLowerCase(Locale.US);
            int port = uri.getPort();
            if (port != -1) {
                c0941n.f15469b = scheme.equals("https") || scheme.equals("wss");
                c0941n.f15468a += ":" + port;
            } else {
                c0941n.f15469b = true;
            }
            c0941n.f15470c = queryParameter;
            int iIndexOf = str.indexOf("//");
            if (iIndexOf == -1) {
                throw new d("Firebase Database URL is missing URL scheme");
            }
            String strSubstring2 = str.substring(iIndexOf + 2);
            int iIndexOf2 = strSubstring2.indexOf("/");
            if (iIndexOf2 != -1) {
                int iIndexOf3 = strSubstring2.indexOf("?");
                strSubstring = iIndexOf3 != -1 ? strSubstring2.substring(iIndexOf2 + 1, iIndexOf3) : strSubstring2.substring(iIndexOf2 + 1);
            } else {
                strSubstring = "";
            }
            String strReplace = strSubstring.replace("+", " ");
            l.d(strReplace);
            f fVar = new f();
            fVar.f15866b = new C0934g(strReplace);
            fVar.f15865a = c0941n;
            return fVar;
        } catch (Exception e7) {
            throw new d(L.i("Invalid Firebase Database url specified: ", str), e7);
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
        String strReplace = str.indexOf(92) != -1 ? str.replace("\\", "\\\\") : str;
        if (str.indexOf(34) != -1) {
            strReplace = strReplace.replace("\"", "\\\"");
        }
        return "\"" + strReplace + '\"';
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
            char cCharAt = str.charAt(i7);
            if (cCharAt < '0' || cCharAt > '9') {
                return null;
            }
            j = (j * 10) + ((long) (cCharAt - '0'));
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
