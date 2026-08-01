package com.moloco.sdk.internal.services;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.internal.services.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4809j {
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f10826a;
    public final String b;
    public final String c;

    public C4809j(String applicationName, String packageName, String version) {
        Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(version, "version");
        this.f10826a = applicationName;
        this.b = packageName;
        this.c = version;
    }

    public final String a() {
        return this.f10826a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }
}
