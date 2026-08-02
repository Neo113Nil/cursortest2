package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.di, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4188di {

    /* renamed from: a, reason: collision with root package name */
    public final C4543pr f30883a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30884b;

    public C4188di(C4543pr name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f30883a = name;
        this.f30884b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4188di)) {
            return false;
        }
        C4188di c4188di = (C4188di) obj;
        return Intrinsics.d(this.f30883a, c4188di.f30883a) && Intrinsics.d(this.f30884b, c4188di.f30884b);
    }

    public final int hashCode() {
        int hashCode = this.f30883a.f31818a.hashCode() * 31;
        String str = this.f30884b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MerchantData(name=" + this.f30883a + ", logo=" + this.f30884b + ")";
    }
}
