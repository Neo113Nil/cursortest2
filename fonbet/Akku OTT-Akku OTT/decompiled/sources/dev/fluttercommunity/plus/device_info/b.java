package dev.fluttercommunity.plus.device_info;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import androidx.core.os.EnvironmentCompat;
import androidx.media3.session.legacy.PlaybackStateCompat;
import com.google.firebase.messaging.Constants;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

@SourceDebugExtension({"SMAP\nMethodCallHandlerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MethodCallHandlerImpl.kt\ndev/fluttercommunity/plus/device_info/MethodCallHandlerImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n4117#2:128\n4217#2,2:129\n1549#3:131\n1620#3,3:132\n*S KotlinDebug\n*F\n+ 1 MethodCallHandlerImpl.kt\ndev/fluttercommunity/plus/device_info/MethodCallHandlerImpl\n*L\n104#1:128\n104#1:129,2\n105#1:131\n105#1:132,3\n*E\n"})
/* loaded from: classes4.dex */
public final class b implements MethodChannel.MethodCallHandler {
    public final PackageManager a;
    public final ActivityManager b;
    public final ContentResolver c;

    public b(PackageManager packageManager, ActivityManager activityManager, ContentResolver contentResolver) {
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(activityManager, "activityManager");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.a = packageManager;
        this.b = activityManager;
        this.c = contentResolver;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00dc, code lost:
    
        if (r0 == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01aa A[LOOP:1: B:24:0x01a4->B:26:0x01aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x025c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMethodCall(MethodCall call, MethodChannel.Result result) {
        boolean startsWith$default;
        boolean startsWith$default2;
        boolean startsWith$default3;
        boolean contains$default;
        boolean contains$default2;
        boolean contains$default3;
        boolean contains$default4;
        boolean contains$default5;
        boolean contains$default6;
        boolean contains$default7;
        boolean contains$default8;
        boolean contains$default9;
        boolean contains$default10;
        boolean z;
        int collectionSizeOrDefault;
        Iterator it;
        int i;
        boolean startsWith$default4;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        if (!call.method.equals("getDeviceInfo")) {
            result.notImplemented();
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("board", Build.BOARD);
        hashMap.put("bootloader", Build.BOOTLOADER);
        String BRAND = Build.BRAND;
        hashMap.put("brand", BRAND);
        String DEVICE = Build.DEVICE;
        hashMap.put("device", DEVICE);
        hashMap.put(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, Build.DISPLAY);
        String FINGERPRINT = Build.FINGERPRINT;
        hashMap.put("fingerprint", FINGERPRINT);
        String HARDWARE = Build.HARDWARE;
        hashMap.put("hardware", HARDWARE);
        hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, Build.HOST);
        hashMap.put("id", Build.ID);
        String MANUFACTURER = Build.MANUFACTURER;
        hashMap.put("manufacturer", MANUFACTURER);
        String MODEL = Build.MODEL;
        hashMap.put("model", MODEL);
        String PRODUCT = Build.PRODUCT;
        hashMap.put("product", PRODUCT);
        if (Build.VERSION.SDK_INT >= 25) {
            String string = Settings.Global.getString(this.c, "device_name");
            if (string == null) {
                string = "";
            }
            hashMap.put("name", string);
        }
        String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
        hashMap.put("supported32BitAbis", CollectionsKt.listOf(Arrays.copyOf(strArr, strArr.length)));
        String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
        hashMap.put("supported64BitAbis", CollectionsKt.listOf(Arrays.copyOf(strArr2, strArr2.length)));
        String[] strArr3 = Build.SUPPORTED_ABIS;
        hashMap.put("supportedAbis", CollectionsKt.listOf(Arrays.copyOf(strArr3, strArr3.length)));
        hashMap.put("tags", Build.TAGS);
        hashMap.put("type", Build.TYPE);
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(BRAND, "generic", false, 2, null);
        String str = EnvironmentCompat.MEDIA_UNKNOWN;
        if (startsWith$default) {
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            startsWith$default4 = StringsKt__StringsJVMKt.startsWith$default(DEVICE, "generic", false, 2, null);
        }
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(FINGERPRINT, "generic", false, 2, null);
        if (!startsWith$default2) {
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
            startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(FINGERPRINT, EnvironmentCompat.MEDIA_UNKNOWN, false, 2, null);
            if (!startsWith$default3) {
                Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
                contains$default = StringsKt__StringsKt.contains$default(HARDWARE, "goldfish", false, 2, (Object) null);
                if (!contains$default) {
                    Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
                    contains$default2 = StringsKt__StringsKt.contains$default(HARDWARE, "ranchu", false, 2, (Object) null);
                    if (!contains$default2) {
                        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                        contains$default3 = StringsKt__StringsKt.contains$default(MODEL, "google_sdk", false, 2, (Object) null);
                        if (!contains$default3) {
                            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                            contains$default4 = StringsKt__StringsKt.contains$default(MODEL, "Emulator", false, 2, (Object) null);
                            if (!contains$default4) {
                                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                                contains$default5 = StringsKt__StringsKt.contains$default(MODEL, "Android SDK built for x86", false, 2, (Object) null);
                                if (!contains$default5) {
                                    Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                                    contains$default6 = StringsKt__StringsKt.contains$default(MANUFACTURER, "Genymotion", false, 2, (Object) null);
                                    if (!contains$default6) {
                                        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                        contains$default7 = StringsKt__StringsKt.contains$default(PRODUCT, "sdk", false, 2, (Object) null);
                                        if (!contains$default7) {
                                            Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                            contains$default8 = StringsKt__StringsKt.contains$default(PRODUCT, "vbox86p", false, 2, (Object) null);
                                            if (!contains$default8) {
                                                Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                                contains$default9 = StringsKt__StringsKt.contains$default(PRODUCT, "emulator", false, 2, (Object) null);
                                                if (!contains$default9) {
                                                    Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
                                                    contains$default10 = StringsKt__StringsKt.contains$default(PRODUCT, "simulator", false, 2, (Object) null);
                                                    if (!contains$default10) {
                                                        z = false;
                                                        hashMap.put("isPhysicalDevice", Boolean.valueOf(!z));
                                                        FeatureInfo[] systemAvailableFeatures = this.a.getSystemAvailableFeatures();
                                                        Intrinsics.checkNotNullExpressionValue(systemAvailableFeatures, "getSystemAvailableFeatures(...)");
                                                        ArrayList arrayList = new ArrayList();
                                                        for (FeatureInfo featureInfo : systemAvailableFeatures) {
                                                            if (featureInfo.name != null) {
                                                                arrayList.add(featureInfo);
                                                            }
                                                        }
                                                        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                                                        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                                                        it = arrayList.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList2.add(((FeatureInfo) it.next()).name);
                                                        }
                                                        hashMap.put("systemFeatures", arrayList2);
                                                        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                                                        hashMap.put("freeDiskSize", Long.valueOf(statFs.getFreeBytes()));
                                                        hashMap.put("totalDiskSize", Long.valueOf(statFs.getTotalBytes()));
                                                        HashMap hashMap2 = new HashMap();
                                                        i = Build.VERSION.SDK_INT;
                                                        hashMap2.put("baseOS", Build.VERSION.BASE_OS);
                                                        hashMap2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
                                                        hashMap2.put("securityPatch", Build.VERSION.SECURITY_PATCH);
                                                        hashMap2.put("codename", Build.VERSION.CODENAME);
                                                        hashMap2.put("incremental", Build.VERSION.INCREMENTAL);
                                                        hashMap2.put("release", Build.VERSION.RELEASE);
                                                        hashMap2.put("sdkInt", Integer.valueOf(i));
                                                        hashMap.put("version", hashMap2);
                                                        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                                                        this.b.getMemoryInfo(memoryInfo);
                                                        hashMap.put("isLowRamDevice", Boolean.valueOf(memoryInfo.lowMemory));
                                                        hashMap.put("physicalRamSize", Long.valueOf(memoryInfo.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED));
                                                        hashMap.put("availableRamSize", Long.valueOf(memoryInfo.availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED));
                                                        if (i < 26) {
                                                            try {
                                                                str = Build.getSerial();
                                                            } catch (SecurityException unused) {
                                                            }
                                                            hashMap.put("serialNumber", str);
                                                        } else {
                                                            hashMap.put("serialNumber", Build.SERIAL);
                                                        }
                                                        result.success(hashMap);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        z = true;
        hashMap.put("isPhysicalDevice", Boolean.valueOf(!z));
        FeatureInfo[] systemAvailableFeatures2 = this.a.getSystemAvailableFeatures();
        Intrinsics.checkNotNullExpressionValue(systemAvailableFeatures2, "getSystemAvailableFeatures(...)");
        ArrayList arrayList3 = new ArrayList();
        while (r9 < r2) {
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
        ArrayList arrayList22 = new ArrayList(collectionSizeOrDefault);
        it = arrayList3.iterator();
        while (it.hasNext()) {
        }
        hashMap.put("systemFeatures", arrayList22);
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        hashMap.put("freeDiskSize", Long.valueOf(statFs2.getFreeBytes()));
        hashMap.put("totalDiskSize", Long.valueOf(statFs2.getTotalBytes()));
        HashMap hashMap22 = new HashMap();
        i = Build.VERSION.SDK_INT;
        hashMap22.put("baseOS", Build.VERSION.BASE_OS);
        hashMap22.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
        hashMap22.put("securityPatch", Build.VERSION.SECURITY_PATCH);
        hashMap22.put("codename", Build.VERSION.CODENAME);
        hashMap22.put("incremental", Build.VERSION.INCREMENTAL);
        hashMap22.put("release", Build.VERSION.RELEASE);
        hashMap22.put("sdkInt", Integer.valueOf(i));
        hashMap.put("version", hashMap22);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        this.b.getMemoryInfo(memoryInfo2);
        hashMap.put("isLowRamDevice", Boolean.valueOf(memoryInfo2.lowMemory));
        hashMap.put("physicalRamSize", Long.valueOf(memoryInfo2.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED));
        hashMap.put("availableRamSize", Long.valueOf(memoryInfo2.availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED));
        if (i < 26) {
        }
        result.success(hashMap);
    }
}
