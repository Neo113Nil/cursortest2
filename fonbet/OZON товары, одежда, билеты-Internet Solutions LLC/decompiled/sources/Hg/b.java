package Hg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f10939a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f10940b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10941c;

    public b(@NotNull String packageName, @NotNull String versionName, String str) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        this.f10939a = packageName;
        this.f10940b = versionName;
        this.f10941c = str;
    }

    public final String a() {
        return this.f10941c;
    }

    @NotNull
    public final String b() {
        return this.f10939a;
    }

    @NotNull
    public final String c() {
        return this.f10940b;
    }
}
