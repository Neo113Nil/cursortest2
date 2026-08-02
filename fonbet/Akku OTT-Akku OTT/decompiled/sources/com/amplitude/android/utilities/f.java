package com.amplitude.android.utilities;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAndroidNetworkConnectivityChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidNetworkConnectivityChecker.kt\ncom/amplitude/android/utilities/AndroidNetworkConnectivityChecker\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,83:1\n12474#2,2:84\n*S KotlinDebug\n*F\n+ 1 AndroidNetworkConnectivityChecker.kt\ncom/amplitude/android/utilities/AndroidNetworkConnectivityChecker\n*L\n56#1:84,2\n*E\n"})
/* loaded from: classes3.dex */
public final class f {
    public static final a Companion = new a();
    public final Context a;
    public final com.amplitude.common.a b;

    public static final class a {
    }

    public f(Context context, com.amplitude.common.a logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.a = context;
        this.b = logger;
        Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            return;
        }
        logger.d("No ACCESS_NETWORK_STATE permission, offline mode is not supported. To enable, add <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" /> to your AndroidManifest.xml. Learn more at https://www.docs.developers.amplitude.com/data/sdks/android-kotlin/#offline-mode");
    }
}
