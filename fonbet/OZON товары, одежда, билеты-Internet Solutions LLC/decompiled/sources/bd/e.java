package bd;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f55928a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f55929b;

    public e(@NotNull File root, @NotNull List<? extends File> segments) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.f55928a = root;
        this.f55929b = segments;
    }

    @NotNull
    public final File a() {
        return this.f55928a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<java.io.File>] */
    @NotNull
    public final List<File> b() {
        return this.f55929b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final int c() {
        return this.f55929b.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f55928a, eVar.f55928a) && Intrinsics.d(this.f55929b, eVar.f55929b);
    }

    public final int hashCode() {
        return this.f55929b.hashCode() + (this.f55928a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "FilePathComponents(root=" + this.f55928a + ", segments=" + this.f55929b + ')';
    }
}
