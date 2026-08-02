package dev.fluttercommunity.workmanager.pigeon;

import kotlin.collections.CollectionsKt;

/* renamed from: dev.fluttercommunity.workmanager.pigeon.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0981b {
    public static final a Companion = new a();
    public final EnumC0980a a;
    public final Long b;

    /* renamed from: dev.fluttercommunity.workmanager.pigeon.b$a */
    public static final class a {
    }

    public C0981b() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0981b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0981b c0981b = (C0981b) obj;
        return o.a(CollectionsKt.listOf(this.a, this.b), CollectionsKt.listOf(c0981b.a, c0981b.b));
    }

    public final int hashCode() {
        return CollectionsKt.listOf(this.a, this.b).hashCode();
    }

    public final String toString() {
        return "BackoffPolicyConfig(backoffPolicy=" + this.a + ", backoffDelayMillis=" + this.b + ')';
    }

    public C0981b(EnumC0980a enumC0980a, Long l) {
        this.a = enumC0980a;
        this.b = l;
    }
}
