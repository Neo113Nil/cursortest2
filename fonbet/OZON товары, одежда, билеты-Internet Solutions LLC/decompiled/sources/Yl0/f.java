package Yl0;

import Za.d;
import kotlin.jvm.internal.Intrinsics;
import ob.C8684c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final C8684c f35158a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Nl0.l f35159b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Za.d f35160c;

    public f(@NotNull C8684c metadataRepository, @NotNull Nl0.l pushClientInitRepository, @NotNull Hl0.a rootLogger) {
        Intrinsics.checkNotNullParameter(metadataRepository, "metadataRepository");
        Intrinsics.checkNotNullParameter(pushClientInitRepository, "pushClientInitRepository");
        Intrinsics.checkNotNullParameter(rootLogger, "rootLogger");
        this.f35158a = metadataRepository;
        this.f35159b = pushClientInitRepository;
        Intrinsics.checkNotNullParameter(this, "any");
        this.f35160c = d.a.a(rootLogger, this);
    }
}
