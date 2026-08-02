package D20;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f5601a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<e> f5602b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<e> f5603c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<e> f5604d;

    public c(@NotNull String schemaVersion, @NotNull List<e> application, @NotNull List<e> projectModules, @NotNull List<e> libraries) {
        Intrinsics.checkNotNullParameter(schemaVersion, "schemaVersion");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(projectModules, "projectModules");
        Intrinsics.checkNotNullParameter(libraries, "libraries");
        this.f5601a = schemaVersion;
        this.f5602b = application;
        this.f5603c = projectModules;
        this.f5604d = libraries;
    }

    @NotNull
    public final List<e> a() {
        return this.f5602b;
    }

    @NotNull
    public final List<e> b() {
        return this.f5604d;
    }

    @NotNull
    public final List<e> c() {
        return this.f5603c;
    }

    @NotNull
    public final String d() {
        return this.f5601a;
    }
}
