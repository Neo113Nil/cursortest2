package com.moloco.sdk.internal.services;

/* renamed from: com.moloco.sdk.internal.services.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3439j {
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7305a;
    public final java.lang.String b;
    public final java.lang.String c;

    public C3439j(java.lang.String applicationName, java.lang.String packageName, java.lang.String version) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationName, "applicationName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "packageName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
        this.f7305a = applicationName;
        this.b = packageName;
        this.c = version;
    }

    public final java.lang.String a() {
        return this.f7305a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.c;
    }
}
