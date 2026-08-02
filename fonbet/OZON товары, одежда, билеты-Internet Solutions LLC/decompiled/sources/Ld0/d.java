package Ld0;

import Sc.InterfaceC3999a;
import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f16849a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Nd0.b f16850b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Nd0.a f16851c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Application f16852a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Nd0.b f16853b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Nd0.c f16854c;

        @InterfaceC3999a
        public a(@NotNull Application application, @NotNull Nd0.b buildType, @NotNull Nd0.c hostName) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(buildType, "buildType");
            Intrinsics.checkNotNullParameter(hostName, "hostName");
            this.f16852a = application;
            this.f16853b = buildType;
            this.f16854c = hostName;
        }

        @NotNull
        public final d a() {
            return new d(this.f16852a, this.f16853b, this.f16854c);
        }
    }

    public d(Application application, Nd0.b bVar, Nd0.a aVar) {
        this.f16849a = application;
        this.f16850b = bVar;
        this.f16851c = aVar;
    }

    @NotNull
    public final Application a() {
        return this.f16849a;
    }

    @NotNull
    public final Nd0.b b() {
        return this.f16850b;
    }
}
