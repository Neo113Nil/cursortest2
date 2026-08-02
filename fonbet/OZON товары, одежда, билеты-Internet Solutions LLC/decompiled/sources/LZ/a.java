package LZ;

import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f16662a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f16663b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final GZ.c f16664c;

    public a(@NotNull String deeplink, @NotNull Map<String, ? extends Object> properties, @NotNull GZ.c deeplinkSourceType) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(deeplinkSourceType, "deeplinkSourceType");
        this.f16662a = deeplink;
        this.f16663b = properties;
        this.f16664c = deeplinkSourceType;
    }

    @NotNull
    public final String a() {
        return this.f16662a;
    }

    @NotNull
    public final GZ.c b() {
        return this.f16664c;
    }

    @NotNull
    public final Map<String, Object> c() {
        return this.f16663b;
    }

    public /* synthetic */ a(String str, int i11, Map map) {
        this(str, (Map<String, ? extends Object>) ((i11 & 2) != 0 ? U.c() : map), GZ.c.INTERNAL);
    }
}
