package i0;

import h0.C1989c;

/* renamed from: i0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1995B extends D {

    /* renamed from: a, reason: collision with root package name */
    public final C1989c f17219a;

    public C1995B(C1989c c1989c) {
        this.f17219a = c1989c;
    }

    @Override // i0.D
    public final C1989c a() {
        return this.f17219a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1995B) {
            return kotlin.jvm.internal.l.a(this.f17219a, ((C1995B) obj).f17219a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17219a.hashCode();
    }
}
