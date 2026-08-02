package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Re {

    /* renamed from: a, reason: collision with root package name */
    public final Pf.f f29849a;

    public Re(Pf.f content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f29849a = content;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Re) && Intrinsics.d(this.f29849a, ((Re) obj).f29849a);
    }

    public final int hashCode() {
        return this.f29849a.hashCode();
    }

    public final String toString() {
        return "HtmlPage(content=" + this.f29849a + ")";
    }
}
