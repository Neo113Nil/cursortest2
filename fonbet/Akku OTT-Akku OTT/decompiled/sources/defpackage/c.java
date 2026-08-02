package defpackage;

import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class c {
    public static final a Companion = new a();
    public final Boolean a;

    public static final class a {
    }

    public c() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return k.a(CollectionsKt.listOf(this.a), CollectionsKt.listOf(((c) obj).a));
    }

    public final int hashCode() {
        return CollectionsKt.listOf(this.a).hashCode();
    }

    public final String toString() {
        return "ToggleMessage(enable=" + this.a + ")";
    }

    public c(Boolean bool) {
        this.a = bool;
    }
}
