package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.S;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLoginLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginLogger.kt\ncom/facebook/login/LoginLogger\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,280:1\n467#2,7:281\n*S KotlinDebug\n*F\n+ 1 LoginLogger.kt\ncom/facebook/login/LoginLogger\n*L\n146#1:281,7\n*E\n"})
/* loaded from: classes3.dex */
public final class x {
    public static final a Companion = new a();
    public static final ScheduledExecutorService c = Executors.newSingleThreadScheduledExecutor();
    public final String a;
    public final com.facebook.appevents.z b;

    public static final class a {
        public static final Bundle a(a aVar, String str) {
            aVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        }
    }

    public x(Context context, String applicationId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        this.a = applicationId;
        this.b = new com.facebook.appevents.z(new com.facebook.appevents.p(context, applicationId));
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                packageManager.getPackageInfo("com.facebook.katana", 0);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final void a(Bundle bundle, String str) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            bundle.getString("0_auth_logger_id");
            bundle.getString("2_result");
            bundle.getString("3_method");
            bundle.getString("6_extras");
            com.facebook.internal.E e = com.facebook.internal.E.a;
            com.facebook.w wVar = com.facebook.w.a;
            com.facebook.appevents.z zVar = this.b;
            zVar.getClass();
            if (S.c()) {
                zVar.a.h(bundle, str);
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }
}
