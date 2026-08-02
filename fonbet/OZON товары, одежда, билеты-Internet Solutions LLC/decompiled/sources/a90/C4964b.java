package a90;

import b90.C5597d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;

/* renamed from: a90.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4964b implements Y30.a<Z80.a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ExternalNetworkSettings f36461a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C5597d f36462b;

    public C4964b(@NotNull ExternalNetworkSettings externalNetworkSettings, @NotNull C5597d singleNetworkClientProvider) {
        Intrinsics.checkNotNullParameter(externalNetworkSettings, "externalNetworkSettings");
        Intrinsics.checkNotNullParameter(singleNetworkClientProvider, "singleNetworkClientProvider");
        this.f36461a = externalNetworkSettings;
        this.f36462b = singleNetworkClientProvider;
    }

    @Override // Y30.a
    public final Z80.a create(Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        P30.b bVar = (P30.b) componentStorage.a(P30.b.class);
        ExternalNetworkSettings externalNetworkSettings = this.f36461a;
        externalNetworkSettings.getClass();
        C5597d c5597d = this.f36462b;
        c5597d.getClass();
        return new C4963a(bVar, externalNetworkSettings, c5597d);
    }
}
