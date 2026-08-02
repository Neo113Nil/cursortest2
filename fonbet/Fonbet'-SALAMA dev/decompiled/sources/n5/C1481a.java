package n5;

import A5.o;
import A5.p;
import A5.q;
import A5.r;
import A5.s;
import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import g6.AbstractC1158g;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import t6.h;
import w5.C1782b;
import w5.InterfaceC1783c;

/* renamed from: n5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1481a implements q, InterfaceC1783c {

    /* renamed from: a, reason: collision with root package name */
    public Context f15512a;

    /* renamed from: b, reason: collision with root package name */
    public s f15513b;

    public static String b(byte[] bArr) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        h.b(digest);
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[digest.length * 2];
        int length = digest.length;
        for (int i7 = 0; i7 < length; i7++) {
            byte b7 = digest[i7];
            int i8 = i7 * 2;
            cArr2[i8] = cArr[(b7 & 255) >>> 4];
            cArr2[i8 + 1] = cArr[b7 & 15];
        }
        return new String(cArr2);
    }

    public final String a(PackageManager packageManager) {
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] apkContentsSigners;
        String str = null;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                Context context = this.f15512a;
                h.b(context);
                signingInfo = packageManager.getPackageInfo(context.getPackageName(), 134217728).signingInfo;
                if (signingInfo == null) {
                    return null;
                }
                hasMultipleSigners = signingInfo.hasMultipleSigners();
                if (hasMultipleSigners) {
                    apkContentsSigners = signingInfo.getApkContentsSigners();
                    h.d(apkContentsSigners, "getApkContentsSigners(...)");
                    byte[] byteArray = ((Signature) AbstractC1158g.t0(apkContentsSigners)).toByteArray();
                    h.d(byteArray, "toByteArray(...)");
                    str = b(byteArray);
                } else {
                    signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    h.d(signingCertificateHistory, "getSigningCertificateHistory(...)");
                    byte[] byteArray2 = ((Signature) AbstractC1158g.t0(signingCertificateHistory)).toByteArray();
                    h.d(byteArray2, "toByteArray(...)");
                    str = b(byteArray2);
                }
            } else {
                Context context2 = this.f15512a;
                h.b(context2);
                Signature[] signatureArr = packageManager.getPackageInfo(context2.getPackageName(), 64).signatures;
                if (signatureArr != null && signatureArr.length != 0 && AbstractC1158g.t0(signatureArr) != null) {
                    byte[] byteArray3 = ((Signature) AbstractC1158g.t0(signatureArr)).toByteArray();
                    h.d(byteArray3, "toByteArray(...)");
                    str = b(byteArray3);
                }
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
        }
        return str;
    }

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        h.e(c1782b, "binding");
        this.f15512a = c1782b.f18075a;
        s sVar = new s(c1782b.f18077c, "dev.fluttercommunity.plus/package_info");
        this.f15513b = sVar;
        sVar.b(this);
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        h.e(c1782b, "binding");
        this.f15512a = null;
        s sVar = this.f15513b;
        h.b(sVar);
        sVar.b(null);
        this.f15513b = null;
    }

    @Override // A5.q
    public final void onMethodCall(o oVar, r rVar) {
        String installerPackageName;
        InstallSourceInfo installSourceInfo;
        h.e(oVar, "call");
        try {
            if (!h.a(oVar.f676a, "getAll")) {
                ((p) rVar).notImplemented();
                return;
            }
            Context context = this.f15512a;
            h.b(context);
            PackageManager packageManager = context.getPackageManager();
            Context context2 = this.f15512a;
            h.b(context2);
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            String a2 = a(packageManager);
            Context context3 = this.f15512a;
            h.b(context3);
            PackageManager packageManager2 = context3.getPackageManager();
            Context context4 = this.f15512a;
            h.b(context4);
            String packageName = context4.getPackageName();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30) {
                installSourceInfo = packageManager2.getInstallSourceInfo(packageName);
                installerPackageName = installSourceInfo.getInitiatingPackageName();
            } else {
                installerPackageName = packageManager2.getInstallerPackageName(packageName);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("appName", packageInfo.applicationInfo.loadLabel(packageManager).toString());
            Context context5 = this.f15512a;
            h.b(context5);
            hashMap.put("packageName", context5.getPackageName());
            hashMap.put("version", packageInfo.versionName);
            hashMap.put("buildNumber", String.valueOf(i7 >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode));
            if (a2 != null) {
                hashMap.put("buildSignature", a2);
            }
            if (installerPackageName != null) {
                hashMap.put("installerStore", installerPackageName);
            }
            ((p) rVar).success(hashMap);
        } catch (PackageManager.NameNotFoundException e7) {
            ((p) rVar).error("Name not found", e7.getMessage(), null);
        }
    }
}
