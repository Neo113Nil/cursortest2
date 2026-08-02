package Eb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h {
    private static final String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            byte b11 = bArr[i11];
            int i12 = i11 * 2;
            cArr[i12] = "0123456789ABCDEF".charAt((b11 & 255) >>> 4);
            cArr[i12 + 1] = "0123456789ABCDEF".charAt(b11 & 15);
        }
        return new String(cArr);
    }

    public static final String b(@NotNull Context context, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            PackageInfo d11 = d(context, packageName);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (Signature signature : e(d11)) {
                messageDigest.update(signature.toByteArray());
            }
            byte[] digest = messageDigest.digest();
            Intrinsics.checkNotNullExpressionValue(digest, "messageDigest.digest()");
            return a(digest);
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    @NotNull
    public static final List<String> c(@NotNull PackageManager packageManager) {
        List<ResolveInfo> queryIntentServices;
        PackageManager.ResolveInfoFlags of2;
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        Intent intent = new Intent();
        intent.setAction("com.vk.push.HOST_SERVICE");
        Intrinsics.checkNotNullParameter(packageManager, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Build.VERSION.SDK_INT >= 33) {
            of2 = PackageManager.ResolveInfoFlags.of(UserVerificationMethods.USER_VERIFY_PATTERN);
            queryIntentServices = packageManager.queryIntentServices(intent, of2);
            Intrinsics.checkNotNullExpressionValue(queryIntentServices, "{\n        queryIntentSer…of(flags.toLong()))\n    }");
        } else {
            queryIntentServices = packageManager.queryIntentServices(intent, UserVerificationMethods.USER_VERIFY_PATTERN);
            Intrinsics.checkNotNullExpressionValue(queryIntentServices, "{\n        queryIntentServices(intent, flags)\n    }");
        }
        List<ResolveInfo> list = queryIntentServices;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).serviceInfo.packageName);
        }
        return C7714v.C(arrayList);
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private static final PackageInfo d(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 134217728);
            Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n        packageManager…GNING_CERTIFICATES)\n    }");
            return packageInfo;
        }
        PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(str, 64);
        Intrinsics.checkNotNullExpressionValue(packageInfo2, "{\n        packageManager…ger.GET_SIGNATURES)\n    }");
        return packageInfo2;
    }

    private static final Signature[] e(PackageInfo packageInfo) {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        if (Build.VERSION.SDK_INT >= 28) {
            signingInfo = packageInfo.signingInfo;
            if (signingInfo != null) {
                hasMultipleSigners = signingInfo.hasMultipleSigners();
                signatureArr = hasMultipleSigners ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
            } else {
                signatureArr = null;
            }
        } else {
            signatureArr = packageInfo.signatures;
        }
        return signatureArr == null ? new Signature[0] : signatureArr;
    }

    public static final boolean f(@NotNull Context context, @NotNull String expectedPubKey, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(expectedPubKey, "expectedPubKey");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            PackageInfo d11 = d(context, packageName);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (Signature signature : e(d11)) {
                Intrinsics.checkNotNullExpressionValue(messageDigest, "messageDigest");
                messageDigest.reset();
                messageDigest.update(signature.toByteArray());
                byte[] digest = messageDigest.digest();
                Intrinsics.checkNotNullExpressionValue(digest, "messageDigest.digest()");
                if (kotlin.text.h.D(expectedPubKey, a(digest), true)) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
        }
        return false;
    }
}
