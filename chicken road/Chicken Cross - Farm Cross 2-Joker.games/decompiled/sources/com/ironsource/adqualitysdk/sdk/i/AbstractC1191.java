package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﯨ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC1191 {
    /* renamed from: ｋ, reason: contains not printable characters */
    public static String m5910(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] digest = MessageDigest.getInstance(StringFog.decrypt("bVmSmGPuKg==\n", "PhHTtVHbHHs=\n")).digest(str.getBytes(StringFog.decrypt("dik3KYI=\n", "I31xBLrAVdA=\n")));
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b : digest) {
                sb.append(String.format(StringFog.decrypt("Xqv3hw==\n", "e5vF/1dLHK8=\n"), Integer.valueOf(b & 255)));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(StringFog.decrypt("9xcQ6mjMCSPKMCXnO49easg+M6s/\n", "pF9Rx1r5PwM=\n"), e2);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static ArrayList m5911(String str, String str2, boolean z) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        while (matcher.find()) {
            if (matcher.groupCount() == 0) {
                arrayList.add(matcher.group());
                if (z) {
                    return arrayList;
                }
            } else {
                for (int i = 1; i <= matcher.groupCount(); i++) {
                    arrayList.add(matcher.group(i));
                    if (z) {
                        return arrayList;
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static int m5913(String str, String str2) {
        String[] split = str.replaceAll(StringFog.decrypt("hxfl2S8opQ==\n", "3EnV9BYG+CQ=\n"), "").split(StringFog.decrypt("o18=\n", "/3GZxLdwmwk=\n"));
        String[] split2 = str2.replaceAll(StringFog.decrypt("0Ik+zwuezA==\n", "i9cO4jKwkdI=\n"), "").split(StringFog.decrypt("EqM=\n", "To1SGEUuFW4=\n"));
        int i = 0;
        while (i < split.length && i < split2.length && split[i].equals(split2[i])) {
            i++;
        }
        return (i >= split.length || i >= split2.length) ? Integer.signum(split.length - split2.length) : Integer.signum(Integer.valueOf(split[i]).compareTo(Integer.valueOf(split2[i])));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m5912(String str) {
        Handler handler = AbstractC1145.f3288;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return false;
        }
        try {
            new GZIPInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m5916(String str, int i) {
        return !TextUtils.isEmpty(str) && str.length() >= 1 && str.length() <= i;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5915(String str, String str2, boolean z) {
        if (z && !TextUtils.isEmpty(str2)) {
            if (!str2.startsWith(StringFog.decrypt("dA==\n", "KocwfH7ciPg=\n"))) {
                str2 = AbstractC0548.m5514("oXP7mNQxyXA=\n", "/yin64hilFo=\n", new StringBuilder(), str2);
            }
            if (!str2.endsWith(StringFog.decrypt("0g==\n", "9rjDo30odGw=\n"))) {
                str2 = AbstractC1257.m5940("wYDF9ILyRw==\n", "mty2qNGvbYg=\n", new StringBuilder().append(str2));
            }
        }
        ArrayList m5911 = m5911(str, str2, true);
        if (m5911.size() > 0) {
            return (String) m5911.get(0);
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5914(String str) {
        if (str != null) {
            Handler handler = AbstractC1145.f3288;
            if (Looper.myLooper() != Looper.getMainLooper() && m5912(str)) {
                int i = 0;
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    new ByteArrayOutputStream();
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = gZIPInputStream.read(bArr, i, 8192 - i);
                        if (read == -1) {
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            return new String(bArr, StringFog.decrypt("bx82DGo=\n", "OktwIVJ+D+A=\n"));
                        }
                        i += read;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }
}
