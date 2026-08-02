package Lj0;

import fi0.x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.AbToolBaseApi;
import ru.ozon.app.android.abtool.AbToolNamespace;
import ru.ozon.app.android.abtool.data.model.FeatureDTO;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x f17133a;

    public g(@NotNull x settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f17133a = settings;
    }

    private final boolean a(FeatureDTO featureDTO) {
        Ld0.c v11 = this.f17133a.v();
        AbToolBaseApi abToolBaseApi = v11 != null ? (AbToolBaseApi) v11.d(AbToolBaseApi.class) : null;
        if (abToolBaseApi != null) {
            return abToolBaseApi.getBoolean(featureDTO.getName(), featureDTO.getServiceName(), AbToolNamespace.PLATFORM_MOBILE);
        }
        Object defaultValue = featureDTO.getDefaultValue();
        Intrinsics.g(defaultValue, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) defaultValue).booleanValue();
    }

    public final boolean b() {
        return a(Jj0.a.c()) && a(Jj0.a.b());
    }

    public final boolean c() {
        return a(Jj0.a.c()) && a(Jj0.a.e());
    }

    public final boolean d() {
        return a(Jj0.a.c()) && a(Jj0.a.d());
    }
}
