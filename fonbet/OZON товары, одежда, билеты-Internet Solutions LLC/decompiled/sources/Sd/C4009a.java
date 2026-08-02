package Sd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Sd.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4009a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f26124a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f26125b;

    static {
        Intrinsics.checkNotNullExpressionValue(c.k(h.f26149f), "topLevel(...)");
    }

    public C4009a(@NotNull c packageName, @NotNull f callableName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callableName, "callableName");
        this.f26124a = packageName;
        this.f26125b = callableName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4009a)) {
            return false;
        }
        C4009a c4009a = (C4009a) obj;
        return Intrinsics.d(this.f26124a, c4009a.f26124a) && this.f26125b.equals(c4009a.f26125b);
    }

    public final int hashCode() {
        return this.f26125b.hashCode() + ((this.f26124a.hashCode() + 527) * 961);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        String b11 = this.f26124a.b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        sb2.append(kotlin.text.h.Y(b11, '.', '/'));
        sb2.append("/");
        sb2.append(this.f26125b);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
