package com.amplitude.core;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class h {
    public static final a Companion = new a();
    public final String a;

    public static final class a {
    }

    public h(String apiKey, com.amplitude.android.utilities.e loggerProvider) {
        i serverZone = i.a;
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter("$default_instance", "instanceName");
        com.amplitude.android.storage.a storageProvider = com.amplitude.android.storage.g.a;
        Intrinsics.checkNotNullParameter(storageProvider, "storageProvider");
        Intrinsics.checkNotNullParameter(loggerProvider, "loggerProvider");
        Intrinsics.checkNotNullParameter(serverZone, "serverZone");
        com.amplitude.android.storage.b identifyInterceptStorageProvider = com.amplitude.android.storage.g.c;
        Intrinsics.checkNotNullParameter(identifyInterceptStorageProvider, "identifyInterceptStorageProvider");
        com.amplitude.id.b identityStorageProvider = com.amplitude.android.storage.g.b;
        Intrinsics.checkNotNullParameter(identityStorageProvider, "identityStorageProvider");
        this.a = apiKey;
    }
}
