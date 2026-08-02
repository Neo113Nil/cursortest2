package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Jh {

    /* renamed from: a, reason: collision with root package name */
    public final String f29292a;

    /* renamed from: b, reason: collision with root package name */
    public final Pi f29293b;

    public Jh(String authorization, Pi effect) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f29292a = authorization;
        this.f29293b = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jh)) {
            return false;
        }
        Jh jh2 = (Jh) obj;
        return Intrinsics.d(this.f29292a, jh2.f29292a) && Intrinsics.d(this.f29293b, jh2.f29293b);
    }

    public final int hashCode() {
        return this.f29293b.hashCode() + (this.f29292a.hashCode() * 31);
    }

    public final String toString() {
        return "RevokeRefreshTokenUseCaseParams(authorization=" + this.f29292a + ", effect=" + this.f29293b + ")";
    }
}
