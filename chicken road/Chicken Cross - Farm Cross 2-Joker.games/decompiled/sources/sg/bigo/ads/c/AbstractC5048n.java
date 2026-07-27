package sg.bigo.ads.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Pair;
import com.google.common.base.Ascii;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import sg.bigo.ads.a.AbstractC5015a;

/* renamed from: sg.bigo.ads.c.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5048n {
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair a(String str, Context context) {
        Signature signature;
        byte[] digest;
        PackageManager packageManager;
        Signature[] signatureArr;
        String str2 = null;
        try {
            packageManager = context.getPackageManager();
        } catch (Throwable unused) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = packageManager.getPackageInfo(str, 134217728).signingInfo;
            if (signingInfo == null) {
                signature = null;
                if (signature == null) {
                    return null;
                }
                byte[] byteArray = signature.toByteArray();
                String str3 = "";
                if (byteArray != null) {
                    if (byteArray.length != 0) {
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                            messageDigest.update(byteArray);
                            digest = messageDigest.digest();
                        } catch (NoSuchAlgorithmException unused2) {
                        }
                        if (digest != null) {
                            StringBuilder sb = new StringBuilder(digest.length * 2);
                            for (byte b : digest) {
                                char[] cArr = AbstractC5049o.f12700a;
                                sb.append(cArr[(b & 240) >>> 4]);
                                sb.append(cArr[b & Ascii.SI]);
                            }
                            str2 = sb.toString();
                        }
                    }
                    digest = null;
                    if (digest != null) {
                    }
                } else {
                    str2 = "";
                }
                if (byteArray != null && byteArray.length > 0) {
                    try {
                        String name = ((X509Certificate) CertificateFactory.getInstance(AbstractC5015a.r0).generateCertificate(new ByteArrayInputStream(byteArray))).getSubjectX500Principal().getName();
                        int indexOf = name.indexOf(AbstractC5015a.s0);
                        str3 = indexOf == -1 ? name : name.substring(indexOf);
                    } catch (Exception unused3) {
                    }
                }
                return new Pair(str2, str3);
            }
            signatureArr = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
        } else {
            signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        }
        if (signatureArr != null && signatureArr.length > 0) {
            signature = signatureArr[0];
            if (signature == null) {
            }
        }
        signature = null;
        if (signature == null) {
        }
    }
}
