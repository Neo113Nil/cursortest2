package P60;

import E0.C2942q;
import android.annotation.SuppressLint;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.installedapps.models.ReceiverInfoCompact;
import ru.ozon.fintech.features.installedapps.models.ServiceInfoCompact;

/* loaded from: classes3.dex */
public final class l implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f21900a;

    public l(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f21900a = context;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    private final List n() {
        PackageManager.PackageInfoFlags of2;
        List installedPackages;
        try {
            if (Build.VERSION.SDK_INT < 33) {
                return p().getInstalledPackages((int) 4096);
            }
            PackageManager p11 = p();
            of2 = PackageManager.PackageInfoFlags.of(4096L);
            installedPackages = p11.getInstalledPackages(of2);
            return installedPackages;
        } catch (Exception e11) {
            L80.a.c("InstalledAppsManager", "getInstalledPackages error", e11);
            return K.f71697a;
        }
    }

    private final PackageManager p() {
        PackageManager packageManager = this.f21900a.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        return packageManager;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    private final LinkedHashMap q(String str) {
        List<ResolveInfo> queryBroadcastReceivers;
        String str2;
        IntentFilter intentFilter;
        PackageManager.ResolveInfoFlags of2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Intent intent = new Intent().setPackage(str);
            Intrinsics.checkNotNullExpressionValue(intent, "setPackage(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager p11 = p();
                of2 = PackageManager.ResolveInfoFlags.of(64L);
                queryBroadcastReceivers = p11.queryBroadcastReceivers(intent, of2);
            } else {
                queryBroadcastReceivers = p().queryBroadcastReceivers(intent, 64);
            }
            Intrinsics.f(queryBroadcastReceivers);
            for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && (str2 = activityInfo.name) != null && (intentFilter = resolveInfo.filter) != null) {
                    Tc.b builder = C7714v.B();
                    Iterator<String> actionsIterator = intentFilter.actionsIterator();
                    while (actionsIterator.hasNext()) {
                        builder.add(actionsIterator.next());
                    }
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    Tc.b B11 = builder.B();
                    if (!B11.isEmpty()) {
                        linkedHashMap.put(str2, B11);
                    }
                }
            }
        } catch (Exception e11) {
            L80.a.c("InstalledAppsManager", "getReceiversFiltersMap error for " + str, e11);
        }
        return linkedHashMap;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    private final List<ResolveInfo> s(Intent intent) {
        PackageManager.ResolveInfoFlags of2;
        List<ResolveInfo> queryIntentActivities;
        try {
            if (Build.VERSION.SDK_INT < 33) {
                return p().queryIntentActivities(intent, 0);
            }
            PackageManager p11 = p();
            of2 = PackageManager.ResolveInfoFlags.of(0L);
            queryIntentActivities = p11.queryIntentActivities(intent, of2);
            return queryIntentActivities;
        } catch (Exception e11) {
            L80.a.a("InstalledAppsManager", "queryIntentActivities error for intent=" + intent + ": " + e11);
            return K.f71697a;
        }
    }

    @Override // P60.g
    @NotNull
    public final String a(@NotNull PackageInfo pkg) {
        long longVersionCode;
        Intrinsics.checkNotNullParameter(pkg, "pkg");
        if (Build.VERSION.SDK_INT < 28) {
            return String.valueOf(pkg.versionCode);
        }
        longVersionCode = pkg.getLongVersionCode();
        return String.valueOf(longVersionCode);
    }

    @Override // P60.g
    public final ArrayList b(@NotNull String packageName) {
        ServiceInfo[] serviceInfoArr;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            PackageInfo o11 = o(4L, packageName);
            if (o11 == null || (serviceInfoArr = o11.services) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(serviceInfoArr.length);
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                String name = serviceInfo.name;
                Intrinsics.checkNotNullExpressionValue(name, "name");
                arrayList.add(new ServiceInfoCompact(name, serviceInfo.permission, serviceInfo.exported));
            }
            return arrayList;
        } catch (Exception e11) {
            L80.a.c("InstalledAppsManager", "Ошибка при чтении сервисов " + packageName, e11);
            return null;
        }
    }

    @Override // P60.g
    public final boolean c(@NotNull PackageInfo pkg) {
        Intrinsics.checkNotNullParameter(pkg, "pkg");
        ApplicationInfo applicationInfo = pkg.applicationInfo;
        if (applicationInfo == null) {
            return false;
        }
        int i11 = applicationInfo.flags;
        return ((i11 & 1) == 0 && (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) ? false : true;
    }

    @Override // P60.g
    public final Intent d(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            return p().getLaunchIntentForPackage(packageName);
        } catch (Exception e11) {
            L80.a.a("InstalledAppsManager", "getLaunchIntent error for " + packageName + ": " + e11);
            return null;
        }
    }

    @Override // P60.g
    public final String e(@NotNull String packageName) {
        InstallSourceInfo installSourceInfo;
        String installingPackageName;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            if (Build.VERSION.SDK_INT < 30) {
                return p().getInstallerPackageName(packageName);
            }
            installSourceInfo = p().getInstallSourceInfo(packageName);
            installingPackageName = installSourceInfo.getInstallingPackageName();
            return installingPackageName;
        } catch (Exception e11) {
            L80.a.a("InstalledAppsManager", "getInstallerPackage error for " + packageName + ": " + e11);
            return null;
        }
    }

    @Override // P60.g
    public final ArrayList f(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            PackageInfo o11 = o(2L, packageName);
            if (o11 == null) {
                return null;
            }
            LinkedHashMap q11 = q(packageName);
            ActivityInfo[] activityInfoArr = o11.receivers;
            if (activityInfoArr == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(activityInfoArr.length);
            for (ActivityInfo activityInfo : activityInfoArr) {
                String name = activityInfo.name;
                Intrinsics.checkNotNullExpressionValue(name, "name");
                ReceiverInfoCompact receiverInfoCompact = new ReceiverInfoCompact(name, activityInfo.exported, activityInfo.permission, (List) q11.get(activityInfo.name), null, null, 48, null);
                if (!Intrinsics.d(activityInfo.permission, "android.permission.BIND_DEVICE_ADMIN")) {
                    String name2 = activityInfo.name;
                    Intrinsics.checkNotNullExpressionValue(name2, "name");
                    if (kotlin.text.h.t(name2, "DeviceAdmin", true)) {
                    }
                    arrayList.add(receiverInfoCompact);
                }
                Boolean bool = Boolean.TRUE;
                String name3 = activityInfo.name;
                Intrinsics.checkNotNullExpressionValue(name3, "name");
                receiverInfoCompact = ReceiverInfoCompact.copy$default(receiverInfoCompact, null, false, null, null, bool, Boolean.valueOf(r(packageName, name3)), 15, null);
                arrayList.add(receiverInfoCompact);
            }
            return arrayList;
        } catch (Exception e11) {
            L80.a.c("InstalledAppsManager", "Ошибка при чтении ресиверов " + packageName, e11);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    @Override // P60.g
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<PackageInfo> g() {
        boolean z11;
        PackageInfo o11;
        String[] strArr;
        Context context = this.f21900a;
        if (Build.VERSION.SDK_INT < 30) {
            return n();
        }
        try {
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            o11 = o(4096L, packageName);
        } catch (Exception e11) {
            L80.a.a("InstalledAppsManager", "hasQueryAllPackagesPermissionDeclared error: " + e11);
        }
        if (o11 != null && (strArr = o11.requestedPermissions) != null) {
            z11 = C7705l.m(strArr, "android.permission.QUERY_ALL_PACKAGES");
            if (z11) {
                L80.a.a("InstalledAppsManager", "В манифесте нет разрешения QUERY_ALL_PACKAGES");
                return K.f71697a;
            }
            if (!(p().checkPermission("android.permission.QUERY_ALL_PACKAGES", context.getPackageName()) == 0)) {
                L80.a.a("InstalledAppsManager", "Нет разрешения QUERY_ALL_PACKAGES");
            }
            return n();
        }
        z11 = false;
        if (z11) {
        }
    }

    @Override // P60.g
    public final boolean h(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return !s(intent).isEmpty();
    }

    @Override // P60.g
    @NotNull
    public final List<String> i(@NotNull PackageInfo pkg) {
        Intrinsics.checkNotNullParameter(pkg, "pkg");
        try {
            String[] strArr = pkg.requestedPermissions;
            if (strArr == null) {
                return K.f71697a;
            }
            int[] iArr = pkg.requestedPermissionsFlags;
            if (iArr == null) {
                iArr = new int[strArr.length];
            }
            ArrayList arrayList = new ArrayList();
            int length = strArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                String str = strArr[i11];
                int i13 = i12 + 1;
                if (i12 >= iArr.length || (iArr[i12] & 2) == 0) {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(str);
                }
                i11++;
                i12 = i13;
            }
            return arrayList;
        } catch (Exception e11) {
            L80.a.c("InstalledAppsManager", "getGrantedPermissions error for " + pkg.packageName, e11);
            return K.f71697a;
        }
    }

    @Override // P60.g
    @SuppressLint({"QueryPermissionsNeeded"})
    @NotNull
    public final List<String> j(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intent addCategory = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE");
        Intrinsics.checkNotNullExpressionValue(addCategory, "addCategory(...)");
        List<ResolveInfo> s11 = s(addCategory);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = s11.iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
            String str = activityInfo != null ? activityInfo.packageName : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        List<String> C11 = C7714v.C(arrayList);
        if (!C11.isEmpty()) {
            L80.a.a("InstalledAppsManager", "URI " + uri + " handled by: " + C11);
        }
        return C11;
    }

    @Override // P60.g
    public final boolean k(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return o(0L, packageName) != null;
    }

    @Override // P60.g
    @NotNull
    public final ArrayList l(@NotNull ArrayList packageNames) {
        Intrinsics.checkNotNullParameter(packageNames, "packageNames");
        List C11 = C7714v.C(packageNames);
        ArrayList arrayList = new ArrayList();
        for (Object obj : C11) {
            if (k((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // P60.g
    @NotNull
    public final String m(@NotNull PackageInfo pkg) {
        CharSequence loadLabel;
        String obj;
        Intrinsics.checkNotNullParameter(pkg, "pkg");
        try {
            ApplicationInfo applicationInfo = pkg.applicationInfo;
            if (applicationInfo != null && (loadLabel = applicationInfo.loadLabel(p())) != null && (obj = loadLabel.toString()) != null) {
                return obj;
            }
            String packageName = pkg.packageName;
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            return packageName;
        } catch (Exception e11) {
            L80.a.a("InstalledAppsManager", "getApplicationLabel error for " + pkg.packageName + ": " + e11);
            return pkg.packageName;
        }
    }

    public final PackageInfo o(long j11, @NotNull String packageName) {
        PackageManager.PackageInfoFlags of2;
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            if (Build.VERSION.SDK_INT < 33) {
                return p().getPackageInfo(packageName, (int) j11);
            }
            PackageManager p11 = p();
            of2 = PackageManager.PackageInfoFlags.of(j11);
            packageInfo = p11.getPackageInfo(packageName, of2);
            return packageInfo;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        } catch (Exception e11) {
            StringBuilder d11 = C2942q.d(j11, "getPackageInfo error for ", packageName, ", flags=");
            d11.append(": ");
            d11.append(e11);
            L80.a.a("InstalledAppsManager", d11.toString());
            return null;
        }
    }

    public final boolean r(@NotNull String packageName, @NotNull String receiverName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(receiverName, "receiverName");
        try {
            Object systemService = this.f21900a.getSystemService("device_policy");
            Intrinsics.g(systemService, "null cannot be cast to non-null type android.app.admin.DevicePolicyManager");
            return ((DevicePolicyManager) systemService).isAdminActive(new ComponentName(packageName, receiverName));
        } catch (Exception e11) {
            L80.a.c("InstalledAppsManager", Sh.b.c("isDeviceAdminReceiverEnabled error for ", packageName, "/", receiverName), e11);
            return false;
        }
    }
}
