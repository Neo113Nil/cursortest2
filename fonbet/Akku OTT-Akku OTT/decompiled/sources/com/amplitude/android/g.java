package com.amplitude.android;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {
    public static final a Companion = new a();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List<p> e;

    public static final class a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(boolean z, boolean z2, boolean z3, boolean z4, List<? extends p> interactions) {
        Intrinsics.checkNotNullParameter(interactions, "interactions");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = interactions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b == gVar.b && this.c == gVar.c && this.d == gVar.d && Intrinsics.areEqual(this.e, gVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((Boolean.hashCode(this.d) + ((Boolean.hashCode(this.c) + ((Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AutocaptureState(sessions=" + this.a + ", appLifecycles=" + this.b + ", screenViews=" + this.c + ", deepLinks=" + this.d + ", interactions=" + this.e + ')';
    }

    public g() {
        this(false, false, false, false, CollectionsKt.emptyList());
    }
}
