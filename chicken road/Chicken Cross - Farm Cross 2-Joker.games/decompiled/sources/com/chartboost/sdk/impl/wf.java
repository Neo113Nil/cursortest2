package com.chartboost.sdk.impl;

import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wf {

    /* renamed from: a, reason: collision with root package name */
    public final int f5060a;
    public final int b;
    public final float c;
    public final WindowInsetsCompat d;
    public final Insets e;

    public wf(int i, int i2, float f, WindowInsetsCompat windowInsetsCompat, Insets insets) {
        this.f5060a = i;
        this.b = i2;
        this.c = f;
        this.d = windowInsetsCompat;
        this.e = insets;
    }

    public final float a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final Insets c() {
        return this.e;
    }

    public final int d() {
        return this.f5060a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf)) {
            return false;
        }
        wf wfVar = (wf) obj;
        return this.f5060a == wfVar.f5060a && this.b == wfVar.b && Float.compare(this.c, wfVar.c) == 0 && Intrinsics.areEqual(this.d, wfVar.d) && Intrinsics.areEqual(this.e, wfVar.e);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f5060a) * 31) + Integer.hashCode(this.b)) * 31) + Float.hashCode(this.c)) * 31;
        WindowInsetsCompat windowInsetsCompat = this.d;
        int hashCode2 = (hashCode + (windowInsetsCompat == null ? 0 : windowInsetsCompat.hashCode())) * 31;
        Insets insets = this.e;
        return hashCode2 + (insets != null ? insets.hashCode() : 0);
    }

    public String toString() {
        return "RenderingContainer(width=" + this.f5060a + ", height=" + this.b + ", density=" + this.c + ", windowInsets=" + this.d + ", systemInsets=" + this.e + ")";
    }

    public /* synthetic */ wf(int i, int i2, float f, WindowInsetsCompat windowInsetsCompat, Insets insets, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, f, (i3 & 8) != 0 ? null : windowInsetsCompat, (i3 & 16) != 0 ? null : insets);
    }
}
