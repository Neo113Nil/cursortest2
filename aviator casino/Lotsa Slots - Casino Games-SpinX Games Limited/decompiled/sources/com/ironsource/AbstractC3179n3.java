package com.ironsource;

/* renamed from: com.ironsource.n3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3179n3 {

    /* renamed from: a, reason: collision with root package name */
    private final int f6476a;
    private final java.lang.String b;
    private final boolean c;
    private final com.ironsource.C3082hd d;

    public AbstractC3179n3(int i, java.lang.String placementName, boolean z, com.ironsource.C3082hd c3082hd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.f6476a = i;
        this.b = placementName;
        this.c = z;
        this.d = c3082hd;
    }

    public final com.ironsource.C3082hd a() {
        return this.d;
    }

    public final int b() {
        return this.f6476a;
    }

    public final java.lang.String c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public java.lang.String toString() {
        return "placement name: " + this.b;
    }

    public final boolean a(int i) {
        return this.f6476a == i;
    }

    public /* synthetic */ AbstractC3179n3(int i, java.lang.String str, boolean z, com.ironsource.C3082hd c3082hd, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : c3082hd);
    }
}
