package Yd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class a implements Comparable<a> {
    @NotNull
    public abstract b a();

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        a other = aVar;
        Intrinsics.checkNotNullParameter(other, "other");
        return a().compareTo(other.a());
    }
}
