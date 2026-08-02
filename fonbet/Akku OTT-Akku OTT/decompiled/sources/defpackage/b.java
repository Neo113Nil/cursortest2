package defpackage;

import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class b {
    public static final a Companion = new a();
    public final Boolean a;

    public static final class a {
    }

    public b() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return k.a(CollectionsKt.listOf(this.a), CollectionsKt.listOf(((b) obj).a));
    }

    public final int hashCode() {
        return CollectionsKt.listOf(this.a).hashCode();
    }

    public final String toString() {
        return "IsEnabledMessage(enabled=" + this.a + ")";
    }

    public b(Boolean bool) {
        this.a = bool;
    }
}
