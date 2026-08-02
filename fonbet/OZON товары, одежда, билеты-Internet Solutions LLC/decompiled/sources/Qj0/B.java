package Qj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.ObjectTypes;

/* loaded from: classes7.dex */
public final class B extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ObjectTypes f23501a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(@NotNull ObjectTypes type) {
        super(0);
        Intrinsics.checkNotNullParameter(type, "type");
        this.f23501a = type;
    }

    @NotNull
    public final ObjectTypes a() {
        return this.f23501a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B) && this.f23501a == ((B) obj).f23501a;
    }

    public final int hashCode() {
        return this.f23501a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ObjectType(type=" + this.f23501a + ")";
    }
}
