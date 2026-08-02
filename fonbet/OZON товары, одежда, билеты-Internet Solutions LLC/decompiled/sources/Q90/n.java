package Q90;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import i3.C7003a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f23106a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f23107b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f23108c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f23109d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f23110e;

    public n(@NotNull Context context, @NotNull c featureToggles, @NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f23106a = context;
        this.f23107b = featureToggles;
        this.f23108c = sharedPreferences;
        this.f23109d = Sc.k.a(Sc.n.PUBLICATION, new N50.a(this, 1));
    }

    public static boolean a(n nVar) {
        return Tl.a.f(nVar.f23107b, S90.c.MOB_ULTRA);
    }

    public static void b(n nVar, Activity activity, boolean z11) {
        PackageManager packageManager = nVar.f23106a.getPackageManager();
        activity.finish();
        Context context = nVar.f23106a;
        packageManager.setComponentEnabledSetting(new ComponentName(context, "ru.ozon.fintech.features.tabber.presentation.finance.FinanceActivityUltra"), z11 ? 1 : 2, 1);
        packageManager.setComponentEnabledSetting(new ComponentName(context, "ru.ozon.fintech.features.tabber.presentation.finance.FinanceActivity"), z11 ? 2 : 1, 1);
        C7003a.b(context.getApplicationContext()).d(new Intent("ru.ozon.fintech.settings.domain.START_ALIAS_ACTIVITY"));
    }

    private static boolean g(Context context) {
        try {
            context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) U90.a.class), UserVerificationMethods.USER_VERIFY_PATTERN);
            return true;
        } catch (Exception e11) {
            L80.a.c("ChangeUltraIconManager", "isServiceDeclared", e11);
            return false;
        }
    }

    public final boolean c(@NotNull final Activity activity, final boolean z11) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f23108c.edit().putBoolean("ultra_state", z11).apply();
        if (z11 == h()) {
            return false;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Q90.m
            @Override // java.lang.Runnable
            public final void run() {
                n.b(n.this, activity, z11);
            }
        });
        return true;
    }

    public final boolean d() {
        return this.f23108c.getBoolean("ultra_state", false);
    }

    @NotNull
    public final Intent e() {
        Intent component = new Intent().setComponent(new ComponentName(this.f23106a, "ru.ozon.fintech.features.tabber.presentation.finance.FinanceActivityUltra"));
        Intrinsics.checkNotNullExpressionValue(component, "setComponent(...)");
        return component;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final boolean f() {
        return ((Boolean) this.f23109d.getValue()).booleanValue();
    }

    public final boolean h() {
        Context context = this.f23106a;
        boolean z11 = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, "ru.ozon.fintech.features.tabber.presentation.finance.FinanceActivityUltra")) == 1;
        L80.a.a("ChangeUltraIconManager", "isUltraIconActive: " + z11);
        return z11;
    }

    public final boolean i() {
        return this.f23110e;
    }

    public final void j(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (g(this.f23106a)) {
            activity.startService(new Intent(activity, (Class<?>) U90.a.class));
        }
    }

    public final void k(boolean z11) {
        this.f23110e = z11;
    }

    public final void l(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (g(this.f23106a)) {
            activity.stopService(new Intent(activity, (Class<?>) U90.a.class));
        }
    }
}
