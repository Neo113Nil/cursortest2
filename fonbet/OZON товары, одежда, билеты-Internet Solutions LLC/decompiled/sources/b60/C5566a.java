package b60;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: b60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5566a implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<U50.a> f55555a;

    public C5566a(@NotNull C5569d availableBridgeInterface, @NotNull C5571f requestContactsPermission, @NotNull C5570e readContactsBridgeInterface, @NotNull C5568c getPhotoBridgeInterface) {
        Intrinsics.checkNotNullParameter(availableBridgeInterface, "availableBridgeInterface");
        Intrinsics.checkNotNullParameter(requestContactsPermission, "requestContactsPermission");
        Intrinsics.checkNotNullParameter(readContactsBridgeInterface, "readContactsBridgeInterface");
        Intrinsics.checkNotNullParameter(getPhotoBridgeInterface, "getPhotoBridgeInterface");
        this.f55555a = C7714v.b0(availableBridgeInterface, requestContactsPermission, readContactsBridgeInterface, getPhotoBridgeInterface);
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return this.f55555a;
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "contacts";
    }
}
