package Og0;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class j implements Sg0.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ug0.a f20390a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Xg0.a f20391b;

    public j(@NotNull Ug0.a powerSettingsIntentsProvider, @NotNull Xg0.a androidOsBuildResolver) {
        Intrinsics.checkNotNullParameter(powerSettingsIntentsProvider, "powerSettingsIntentsProvider");
        Intrinsics.checkNotNullParameter(androidOsBuildResolver, "androidOsBuildResolver");
        this.f20390a = powerSettingsIntentsProvider;
        this.f20391b = androidOsBuildResolver;
    }

    private static Intent c(String str, String str2, Function1 function1) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        function1.invoke(intent);
        return intent;
    }

    @Override // Sg0.b
    @SuppressLint({"BatteryLife"})
    @NotNull
    public final ArrayList a(@NotNull String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        String str = this.f20391b.a() ? "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity" : "com.huawei.systemmanager.appcontrol.activity.StartupAppControlActivity";
        List<Intent> provide = this.f20390a.provide();
        i iVar = i.f20389b;
        return C7714v.p0(C7714v.b0(c("com.miui.securitycenter", "com.miui.permcenter.autostart.AutoStartManagementActivity", iVar), c("com.letv.android.letvsafe", "com.letv.android.letvsafe.AutobootManageActivity", iVar), c("com.huawei.systemmanager", "com.huawei.systemmanager.optimize.process.ProtectActivity", iVar), c("com.coloros.oppoguardelf", "com.coloros.powermanager.fuelgaue.PowerUsageModelActivity", iVar), c("com.coloros.oppoguardelf", "com.coloros.powermanager.fuelgaue.PowerSaverModeActivity", iVar), c("com.coloros.oppoguardelf", "com.coloros.powermanager.fuelgaue.PowerConsumptionActivity", iVar), c("com.coloros.safecenter", "com.coloros.safecenter.permission.startup.StartupAppListActivity", iVar), c("com.oppo.safe", "com.oppo.safe.permission.startup.StartupAppListActivity", iVar), c("com.iqoo.secure", "com.iqoo.secure.ui.phoneoptimize.AddWhiteListActivity", iVar), c("com.iqoo.secure", "com.iqoo.secure.ui.phoneoptimize.BgStartUpManager", iVar), c("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.BgStartUpManagerActivity", iVar), c("com.asus.mobilemanager", "com.asus.mobilemanager.entry.FunctionActivity", iVar), c("com.asus.mobilemanager", "com.asus.mobilemanager.autostart.AutoStartActivity", iVar), c("com.letv.android.letvsafe", "com.letv.android.letvsafe.AutobootManageActivity", f.f20386b), c("com.meizu.safe", "com.meizu.safe.security.SHOW_APPSEC", new g(applicationId)), c("com.huawei.systemmanager", str, iVar), c("com.coloros.safecenter", "com.coloros.safecenter.startupapp.StartupAppListActivity", new h(applicationId))), provide);
    }

    @Override // Sg0.b
    @NotNull
    public final List<Intent> b(@NotNull String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intent intent = new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
        Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent2.setData(Uri.parse("package:" + applicationId));
        Unit unit = Unit.f71690a;
        return C7714v.b0(intent, intent2, new Intent("android.settings.SETTINGS"));
    }
}
