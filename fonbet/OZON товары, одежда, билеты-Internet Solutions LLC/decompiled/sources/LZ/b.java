package LZ;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;

/* loaded from: classes3.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f16665a;

    public b(@NotNull f destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f16665a = destination;
    }

    @NotNull
    public final f a() {
        return this.f16665a;
    }
}
