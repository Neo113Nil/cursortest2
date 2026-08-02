package P90;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;

/* loaded from: classes3.dex */
public final class b implements Y30.a<O90.a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ExternalFintechSettings f22050a;

    public b(@NotNull ExternalFintechSettings externalFintechSettings) {
        Intrinsics.checkNotNullParameter(externalFintechSettings, "externalFintechSettings");
        this.f22050a = externalFintechSettings;
    }

    @Override // Y30.a
    public final O90.a create(Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        P30.b bVar = (P30.b) componentStorage.a(P30.b.class);
        Z80.a aVar = (Z80.a) componentStorage.a(Z80.a.class);
        Y20.a aVar2 = (Y20.a) componentStorage.a(Y20.a.class);
        ExternalFintechSettings externalFintechSettings = this.f22050a;
        externalFintechSettings.getClass();
        return new a(bVar, aVar, externalFintechSettings, aVar2);
    }
}
