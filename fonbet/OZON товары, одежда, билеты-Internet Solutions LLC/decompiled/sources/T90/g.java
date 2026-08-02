package T90;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.settings.models.Pins;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f26935a;

    public g(@NotNull f pinsSettingsRepository) {
        Intrinsics.checkNotNullParameter(pinsSettingsRepository, "pinsSettingsRepository");
        this.f26935a = pinsSettingsRepository;
    }

    public final Pins a() {
        return this.f26935a.a();
    }
}
