package p099n5;

import A5.o;
import A5.p;
import A5.q;
import A5.r;
import A5.s;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import p050g6.g;
import p159w5.b;
import p159w5.c;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements q, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f15518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f15519b;

    public static String b(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        messageDigest.update(bArr);
        byte[] bArrDigest = messageDigest.digest();
        h.b(bArrDigest);
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArrDigest.length * 2];
        int length = bArrDigest.length;
        for (int i7 = 0; i7 < length; i7++) {
            byte b7 = bArrDigest[i7];
            int i8 = i7 * 2;
            cArr2[i8] = cArr[(b7 & 255) >>> 4];
            cArr2[i8 + 1] = cArr[b7 & 15];
        }
        return new String(cArr2);
    }

    public final String a(PackageManager packageManager) {
        String strB = null;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Context context = this.f15518a;
                h.b(context);
                SigningInfo signingInfo = packageManager.getPackageInfo(context.getPackageName(), 134217728).signingInfo;
                if (signingInfo == null) {
                    return null;
                }
                if (signingInfo.hasMultipleSigners()) {
                    Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                    h.d(apkContentsSigners, "getApkContentsSigners(...)");
                    byte[] byteArray = ((Signature) g.t0(apkContentsSigners)).toByteArray();
                    h.d(byteArray, "toByteArray(...)");
                    strB = b(byteArray);
                } else {
                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    h.d(signingCertificateHistory, "getSigningCertificateHistory(...)");
                    byte[] byteArray2 = ((Signature) g.t0(signingCertificateHistory)).toByteArray();
                    h.d(byteArray2, "toByteArray(...)");
                    strB = b(byteArray2);
                }
            } else {
                Context context2 = this.f15518a;
                h.b(context2);
                Signature[] signatureArr = packageManager.getPackageInfo(context2.getPackageName(), 64).signatures;
                if (signatureArr != null && signatureArr.length != 0 && g.t0(signatureArr) != null) {
                    byte[] byteArray3 = ((Signature) g.t0(signatureArr)).toByteArray();
                    h.d(byteArray3, "toByteArray(...)");
                    strB = b(byteArray3);
                }
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
        }
        return strB;
    }

    @Override // p159w5.c
    public final void onAttachedToEngine(b bVar) {
        h.e(bVar, "binding");
        this.f15518a = bVar.f18081a;
        s sVar = new s(bVar.f18083c, "dev.fluttercommunity.plus/package_info");
        this.f15519b = sVar;
        sVar.b(this);
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(b bVar) {
        h.e(bVar, "binding");
        this.f15518a = null;
        s sVar = this.f15519b;
        h.b(sVar);
        sVar.b(null);
        this.f15519b = null;
    }

    @Override // A5.q
    public final void onMethodCall(o oVar, r rVar) {
        h.e(oVar, "call");
        try {
            if (!h.a(oVar.f676a, "getAll")) {
                ((p) rVar).notImplemented();
                return;
            }
            Context context = this.f15518a;
            h.b(context);
            PackageManager packageManager = context.getPackageManager();
            Context context2 = this.f15518a;
            h.b(context2);
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            String strA = a(packageManager);
            Context context3 = this.f15518a;
            h.b(context3);
            PackageManager packageManager2 = context3.getPackageManager();
            Context context4 = this.f15518a;
            h.b(context4);
            String packageName = context4.getPackageName();
            int i7 = Build.VERSION.SDK_INT;
            String initiatingPackageName = i7 >= 30 ? packageManager2.getInstallSourceInfo(packageName).getInitiatingPackageName() : packageManager2.getInstallerPackageName(packageName);
            HashMap map = new HashMap();
            map.put("appName", packageInfo.applicationInfo.loadLabel(packageManager).toString());
            Context context5 = this.f15518a;
            h.b(context5);
            map.put("packageName", context5.getPackageName());
            map.put("version", packageInfo.versionName);
            map.put("buildNumber", String.valueOf(i7 >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode));
            if (strA != null) {
                map.put("buildSignature", strA);
            }
            if (initiatingPackageName != null) {
                map.put("installerStore", initiatingPackageName);
            }
            ((p) rVar).success(map);
        } catch (PackageManager.NameNotFoundException e7) {
            ((p) rVar).error("Name not found", e7.getMessage(), null);
        }
    }
}
