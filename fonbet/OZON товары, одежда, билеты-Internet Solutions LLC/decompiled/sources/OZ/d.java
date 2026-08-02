package OZ;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d extends f {

    /* renamed from: b, reason: collision with root package name */
    private final int f20166b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f20167c;

    public d(int i11, @NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f20166b = i11;
        this.f20167c = deeplink;
    }

    @Override // OZ.f
    public final pZ.f a() {
        return null;
    }

    @Override // OZ.f
    public final int b() {
        return this.f20166b;
    }

    @NotNull
    public final String getDeeplink() {
        return this.f20167c;
    }
}
