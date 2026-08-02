package B60;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final k f2969a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final m f2970b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final i f2971c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final f f2972d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final c f2973e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final d f2974f;

    public g(@NotNull k securedStorageStateBridgeInterface, @NotNull m securedStorageWriteBridgeInterface, @NotNull i securedStorageReadBridgeInterface, @NotNull f securedStorageClearBridgeInterface, @NotNull c fastEntryBridgeInterface, @NotNull d getFastEntryStateBridgeInterface) {
        Intrinsics.checkNotNullParameter(securedStorageStateBridgeInterface, "securedStorageStateBridgeInterface");
        Intrinsics.checkNotNullParameter(securedStorageWriteBridgeInterface, "securedStorageWriteBridgeInterface");
        Intrinsics.checkNotNullParameter(securedStorageReadBridgeInterface, "securedStorageReadBridgeInterface");
        Intrinsics.checkNotNullParameter(securedStorageClearBridgeInterface, "securedStorageClearBridgeInterface");
        Intrinsics.checkNotNullParameter(fastEntryBridgeInterface, "fastEntryBridgeInterface");
        Intrinsics.checkNotNullParameter(getFastEntryStateBridgeInterface, "getFastEntryStateBridgeInterface");
        this.f2969a = securedStorageStateBridgeInterface;
        this.f2970b = securedStorageWriteBridgeInterface;
        this.f2971c = securedStorageReadBridgeInterface;
        this.f2972d = securedStorageClearBridgeInterface;
        this.f2973e = fastEntryBridgeInterface;
        this.f2974f = getFastEntryStateBridgeInterface;
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return C7714v.b0(this.f2969a, this.f2970b, this.f2971c, this.f2972d, this.f2973e, this.f2974f);
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "securedstorage";
    }
}
