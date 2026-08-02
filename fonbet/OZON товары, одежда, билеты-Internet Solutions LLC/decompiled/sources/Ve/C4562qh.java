package Ve;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.qh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4562qh extends Wj {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f31875a;

    public C4562qh(ArrayList authenticators) {
        Intrinsics.checkNotNullParameter(authenticators, "authenticators");
        this.f31875a = authenticators;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4562qh) && Intrinsics.d(this.f31875a, ((C4562qh) obj).f31875a);
    }

    public final int hashCode() {
        return this.f31875a.hashCode();
    }

    public final String toString() {
        return Om.a(")", new StringBuilder("ShowFullEmissionAuth(authenticators="), this.f31875a);
    }
}
