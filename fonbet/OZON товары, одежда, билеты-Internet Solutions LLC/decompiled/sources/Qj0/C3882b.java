package Qj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.networkinfo.models.ConnectionType;

/* renamed from: Qj0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3882b extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConnectionType f23609a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3882b(@NotNull ConnectionType type) {
        super(0);
        Intrinsics.checkNotNullParameter(type, "type");
        this.f23609a = type;
    }

    @NotNull
    public final ConnectionType a() {
        return this.f23609a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3882b) && this.f23609a == ((C3882b) obj).f23609a;
    }

    public final int hashCode() {
        return this.f23609a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ConnectionType(type=" + this.f23609a + ")";
    }
}
