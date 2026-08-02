package ae0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f36657a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j() {
        super("Map and all its parts should be initialized before usage!");
        Intrinsics.checkNotNullParameter("Map and all its parts should be initialized before usage!", "message");
        this.f36657a = "Map and all its parts should be initialized before usage!";
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String getMessage() {
        return this.f36657a;
    }
}
