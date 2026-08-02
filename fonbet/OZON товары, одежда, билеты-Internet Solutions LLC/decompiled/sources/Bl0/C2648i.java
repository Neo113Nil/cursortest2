package Bl0;

import ed.InterfaceC6346b;
import kotlin.jvm.internal.Intrinsics;

@InterfaceC6346b
/* renamed from: Bl0.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2648i {

    /* renamed from: a, reason: collision with root package name */
    public final String f3977a;

    public final boolean equals(Object obj) {
        if (obj instanceof C2648i) {
            return Intrinsics.d(this.f3977a, ((C2648i) obj).f3977a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3977a.hashCode();
    }

    public final String toString() {
        return B3.D.c(new StringBuilder("VersionName(value="), this.f3977a, ')');
    }
}
