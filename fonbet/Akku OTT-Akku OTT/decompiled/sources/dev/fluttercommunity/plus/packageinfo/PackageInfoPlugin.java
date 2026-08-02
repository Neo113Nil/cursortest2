package dev.fluttercommunity.plus.packageinfo;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.auth.Constants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001eH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Ldev/fluttercommunity/plus/packageinfo/PackageInfoPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "<init>", "()V", "applicationContext", "Landroid/content/Context;", "methodChannel", "Lio/flutter/plugin/common/MethodChannel;", "onAttachedToEngine", "", "binding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "onMethodCall", NotificationCompat.CATEGORY_CALL, "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "getInstallerPackageName", "", "getLongVersionCode", "", "info", "Landroid/content/pm/PackageInfo;", "getBuildSignature", "pm", "Landroid/content/pm/PackageManager;", "signatureToSha256", "sig", "", "bytesToHex", "bytes", "Companion", "package_info_plus_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* renamed from: dev.fluttercommunity.plus.packageinfo.a, reason: from Kotlin metadata */
/* loaded from: classes4.dex */
public final class PackageInfoPlugin implements MethodChannel.MethodCallHandler, FlutterPlugin {
    public Context a;
    public MethodChannel b;

    public static String b(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNull(digest);
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[digest.length * 2];
        int length = digest.length;
        for (int i = 0; i < length; i++) {
            byte b = digest[i];
            int i2 = i * 2;
            cArr2[i2] = cArr[(b & UByte.MAX_VALUE) >>> 4];
            cArr2[i2 + 1] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    public final String a(PackageManager packageManager) {
        SigningInfo signingInfo;
        boolean hasMultipleSigners;
        Signature[] signingCertificateHistory;
        Signature[] apkContentsSigners;
        try {
            if (Build.VERSION.SDK_INT < 28) {
                Context context = this.a;
                Intrinsics.checkNotNull(context);
                Signature[] signatureArr = packageManager.getPackageInfo(context.getPackageName(), 64).signatures;
                if (signatureArr != null && signatureArr.length != 0 && ArraysKt.first(signatureArr) != null) {
                    byte[] byteArray = ((Signature) ArraysKt.first(signatureArr)).toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                    return b(byteArray);
                }
                return null;
            }
            Context context2 = this.a;
            Intrinsics.checkNotNull(context2);
            signingInfo = packageManager.getPackageInfo(context2.getPackageName(), 134217728).signingInfo;
            if (signingInfo == null) {
                return null;
            }
            hasMultipleSigners = signingInfo.hasMultipleSigners();
            if (hasMultipleSigners) {
                apkContentsSigners = signingInfo.getApkContentsSigners();
                Intrinsics.checkNotNullExpressionValue(apkContentsSigners, "getApkContentsSigners(...)");
                byte[] byteArray2 = ((Signature) ArraysKt.first(apkContentsSigners)).toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray2, "toByteArray(...)");
                return b(byteArray2);
            }
            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            Intrinsics.checkNotNullExpressionValue(signingCertificateHistory, "getSigningCertificateHistory(...)");
            byte[] byteArray3 = ((Signature) ArraysKt.first(signingCertificateHistory)).toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray3, "toByteArray(...)");
            return b(byteArray3);
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.a = binding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(binding.getBinaryMessenger(), "dev.fluttercommunity.plus/package_info");
        this.b = methodChannel;
        Intrinsics.checkNotNull(methodChannel);
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.a = null;
        MethodChannel methodChannel = this.b;
        Intrinsics.checkNotNull(methodChannel);
        methodChannel.setMethodCallHandler(null);
        this.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e A[Catch: NameNotFoundException -> 0x0075, TryCatch #0 {NameNotFoundException -> 0x0075, blocks: (B:3:0x000a, B:5:0x0014, B:7:0x004a, B:8:0x0057, B:11:0x0068, B:13:0x006e, B:16:0x0078, B:19:0x0092, B:21:0x009e, B:22:0x00a6, B:24:0x00af, B:26:0x00b6, B:27:0x00bb, B:30:0x00a3, B:33:0x0053, B:34:0x00d1), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00af A[Catch: NameNotFoundException -> 0x0075, TryCatch #0 {NameNotFoundException -> 0x0075, blocks: (B:3:0x000a, B:5:0x0014, B:7:0x004a, B:8:0x0057, B:11:0x0068, B:13:0x006e, B:16:0x0078, B:19:0x0092, B:21:0x009e, B:22:0x00a6, B:24:0x00af, B:26:0x00b6, B:27:0x00bb, B:30:0x00a3, B:33:0x0053, B:34:0x00d1), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6 A[Catch: NameNotFoundException -> 0x0075, TryCatch #0 {NameNotFoundException -> 0x0075, blocks: (B:3:0x000a, B:5:0x0014, B:7:0x004a, B:8:0x0057, B:11:0x0068, B:13:0x006e, B:16:0x0078, B:19:0x0092, B:21:0x009e, B:22:0x00a6, B:24:0x00af, B:26:0x00b6, B:27:0x00bb, B:30:0x00a3, B:33:0x0053, B:34:0x00d1), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3 A[Catch: NameNotFoundException -> 0x0075, TryCatch #0 {NameNotFoundException -> 0x0075, blocks: (B:3:0x000a, B:5:0x0014, B:7:0x004a, B:8:0x0057, B:11:0x0068, B:13:0x006e, B:16:0x0078, B:19:0x0092, B:21:0x009e, B:22:0x00a6, B:24:0x00af, B:26:0x00b6, B:27:0x00bb, B:30:0x00a3, B:33:0x0053, B:34:0x00d1), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        String installerPackageName;
        String str;
        String str2;
        InstallSourceInfo installSourceInfo;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            if (!Intrinsics.areEqual(call.method, "getAll")) {
                result.notImplemented();
                return;
            }
            Context context = this.a;
            Intrinsics.checkNotNull(context);
            PackageManager packageManager = context.getPackageManager();
            Context context2 = this.a;
            Intrinsics.checkNotNull(context2);
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            Intrinsics.checkNotNull(packageManager);
            String a = a(packageManager);
            Context context3 = this.a;
            Intrinsics.checkNotNull(context3);
            PackageManager packageManager2 = context3.getPackageManager();
            Context context4 = this.a;
            Intrinsics.checkNotNull(context4);
            String packageName = context4.getPackageName();
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                installSourceInfo = packageManager2.getInstallSourceInfo(packageName);
                installerPackageName = installSourceInfo.getInitiatingPackageName();
            } else {
                installerPackageName = packageManager2.getInstallerPackageName(packageName);
            }
            long j = packageInfo.firstInstallTime;
            long j2 = packageInfo.lastUpdateTime;
            HashMap hashMap = new HashMap();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            String str3 = "";
            if (applicationInfo != null) {
                CharSequence loadLabel = applicationInfo.loadLabel(packageManager);
                if (loadLabel != null) {
                    str = loadLabel.toString();
                    if (str == null) {
                    }
                    hashMap.put(Constants.APP_NAME, str);
                    Context context5 = this.a;
                    Intrinsics.checkNotNull(context5);
                    hashMap.put("packageName", context5.getPackageName());
                    str2 = packageInfo.versionName;
                    if (str2 == null) {
                        str3 = str2;
                    }
                    hashMap.put("version", str3);
                    Intrinsics.checkNotNull(packageInfo);
                    hashMap.put("buildNumber", String.valueOf(i < 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode));
                    if (a != null) {
                        hashMap.put("buildSignature", a);
                    }
                    if (installerPackageName != null) {
                        hashMap.put("installerStore", installerPackageName);
                    }
                    hashMap.put("installTime", String.valueOf(j));
                    hashMap.put("updateTime", String.valueOf(j2));
                    result.success(hashMap);
                }
            }
            str = "";
            hashMap.put(Constants.APP_NAME, str);
            Context context52 = this.a;
            Intrinsics.checkNotNull(context52);
            hashMap.put("packageName", context52.getPackageName());
            str2 = packageInfo.versionName;
            if (str2 == null) {
            }
            hashMap.put("version", str3);
            Intrinsics.checkNotNull(packageInfo);
            hashMap.put("buildNumber", String.valueOf(i < 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode));
            if (a != null) {
            }
            if (installerPackageName != null) {
            }
            hashMap.put("installTime", String.valueOf(j));
            hashMap.put("updateTime", String.valueOf(j2));
            result.success(hashMap);
        } catch (PackageManager.NameNotFoundException e) {
            result.error("Name not found", e.getMessage(), null);
        }
    }
}
