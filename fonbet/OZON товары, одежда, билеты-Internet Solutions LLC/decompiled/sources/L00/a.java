package L00;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f16065a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f16066b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f16067c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f16068d;

    public a(@NotNull String versionName, int i11, @NotNull String appName, @NotNull String deviceType) {
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        this.f16065a = appName;
        this.f16066b = deviceType;
        if (kotlin.text.h.K(versionName)) {
            throw new IllegalArgumentException("Parameter `versionName` must not be empty");
        }
        if (kotlin.text.h.K(appName)) {
            throw new IllegalArgumentException("Parameter `appName` must not be empty");
        }
        if (kotlin.text.h.K(deviceType)) {
            throw new IllegalArgumentException("Parameter `deviceType` must not be empty");
        }
        this.f16067c = versionName + "(" + i11 + ")";
        this.f16068d = appName + "/" + versionName + "+" + i11;
    }

    @NotNull
    public final String a() {
        return this.f16065a;
    }

    @NotNull
    public final String b() {
        return this.f16066b;
    }

    @NotNull
    public final String c() {
        return this.f16068d;
    }

    @NotNull
    public final String d() {
        return this.f16067c;
    }
}
