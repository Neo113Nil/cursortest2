package a0;

import kotlin.jvm.internal.l;
import r0.AbstractC2346c;

/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0445a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f6362a;

    public C0445a(AbstractC2346c abstractC2346c, Integer num) {
        this.f6362a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0445a)) {
            return false;
        }
        C0445a c0445a = (C0445a) obj;
        c0445a.getClass();
        return l.a(null, null) && l.a(this.f6362a, c0445a.f6362a);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ComposeStackTraceFrame(sourceInfo=" + ((Object) null) + ", groupOffset=" + this.f6362a + ')';
    }
}
