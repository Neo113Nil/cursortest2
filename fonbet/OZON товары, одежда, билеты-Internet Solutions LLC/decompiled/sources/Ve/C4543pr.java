package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.pr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4543pr implements Sr {

    /* renamed from: a, reason: collision with root package name */
    public final String f31818a;

    public C4543pr(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f31818a = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4543pr) && Intrinsics.d(this.f31818a, ((C4543pr) obj).f31818a);
    }

    public final int hashCode() {
        return this.f31818a.hashCode();
    }

    public final String toString() {
        return "Text(text=" + ((Object) this.f31818a) + ")";
    }
}
