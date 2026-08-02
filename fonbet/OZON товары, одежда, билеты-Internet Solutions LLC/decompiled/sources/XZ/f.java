package XZ;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sg.a f34229a;

    public f(@NotNull Sg.a analyticsScreenStorage) {
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        this.f34229a = analyticsScreenStorage;
    }

    public final UZ.d a(d payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new UZ.d(this.f34229a.a(), payload);
    }
}
