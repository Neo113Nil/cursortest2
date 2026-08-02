package T00;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d<I extends C7854a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f26445a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Collection<R00.f> f26446b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull List<? extends I> mappedModels, @NotNull Collection<? extends R00.f> incidents) {
        Intrinsics.checkNotNullParameter(mappedModels, "mappedModels");
        Intrinsics.checkNotNullParameter(incidents, "incidents");
        this.f26445a = mappedModels;
        this.f26446b = incidents;
    }

    @NotNull
    public final Collection<R00.f> a() {
        return this.f26446b;
    }

    @NotNull
    public final List<I> b() {
        return (List<I>) this.f26445a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f26445a, dVar.f26445a) && Intrinsics.d(this.f26446b, dVar.f26446b);
    }

    public final int hashCode() {
        return this.f26446b.hashCode() + (this.f26445a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "MappedModel(mappedModels=" + this.f26445a + ", incidents=" + this.f26446b + ")";
    }
}
