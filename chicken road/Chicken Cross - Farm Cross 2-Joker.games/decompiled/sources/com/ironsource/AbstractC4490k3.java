package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.k3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4490k3 {

    /* renamed from: a, reason: collision with root package name */
    private final int f8281a;
    private final String b;
    private final boolean c;
    private final C4429gd d;

    public AbstractC4490k3(int i, String placementName, boolean z, C4429gd c4429gd) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.f8281a = i;
        this.b = placementName;
        this.c = z;
        this.d = c4429gd;
    }

    public final C4429gd a() {
        return this.d;
    }

    public final int b() {
        return this.f8281a;
    }

    public final String c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public String toString() {
        return "placement name: " + this.b;
    }

    public final boolean a(int i) {
        return this.f8281a == i;
    }

    public /* synthetic */ AbstractC4490k3(int i, String str, boolean z, C4429gd c4429gd, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : c4429gd);
    }
}
