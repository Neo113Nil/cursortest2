package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.RootConfig;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.uk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4140uk {
    public static void a(Context context, RootConfig.PreInit obj, boolean z) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        JSONObject a2 = AbstractC3875lb.a(obj, obj.getClass());
        if (a2 == null) {
            a2 = new JSONObject();
        }
        RootConfig.InitTelemetry initTelemetry = obj.getInitTelemetry();
        String str = "Saving pre-init snapshot; preInit.enabled=" + obj.isEnabled() + ", accountIdResetEnabled=" + z + ", initTelemetry.enabled=" + initTelemetry.getEnabled() + ", initTelemetry.url=" + initTelemetry.getTelemetryUrl() + ", initTelemetry.maxRetries=" + initTelemetry.getMaxRetries() + ", initTelemetry.retryInterval=" + initTelemetry.getRetryInterval() + ", initTelemetry.timeout=" + initTelemetry.getTimeout();
        Context applicationContext = context.getApplicationContext();
        ConcurrentHashMap concurrentHashMap = Db.b;
        applicationContext.getSharedPreferences(Cb.a("sdk_pre_init_config"), 0).edit().putBoolean("enabled", obj.isEnabled()).putBoolean("account_id_reset_enabled", z).putString("pre_init_config", a2.toString()).apply();
    }

    public static boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        ConcurrentHashMap concurrentHashMap = Db.b;
        RootConfig.PreInit preInit = null;
        String string = applicationContext.getSharedPreferences(Cb.a("sdk_pre_init_config"), 0).getString("pre_init_config", null);
        if (string != null) {
            try {
                JSONObject jsonObject = new JSONObject(string);
                Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                Intrinsics.checkNotNullParameter(RootConfig.PreInit.class, "type");
                preInit = (RootConfig.PreInit) RootConfig.PreInit.class.cast(AbstractC3875lb.a(jsonObject, RootConfig.PreInit.class, null, null));
            } catch (Exception unused) {
            }
        }
        boolean appLaunchTimeEnabled = preInit != null ? preInit.getAppLaunchTimeEnabled() : false;
        String str = "Read pre-init app launch time snapshot; enabled=" + appLaunchTimeEnabled;
        return appLaunchTimeEnabled;
    }

    public static boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        ConcurrentHashMap concurrentHashMap = Db.b;
        boolean z = applicationContext.getSharedPreferences(Cb.a("sdk_pre_init_config"), 0).getBoolean("account_id_reset_enabled", false);
        String str = "Read pre-init account ID reset snapshot; accountIdResetEnabled=" + z;
        return z;
    }
}
