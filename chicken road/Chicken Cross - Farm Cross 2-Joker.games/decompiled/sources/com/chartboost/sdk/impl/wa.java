package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class wa {

    /* renamed from: a, reason: collision with root package name */
    public final int f5056a;

    public wa(int i) {
        this.f5056a = i;
    }

    public final int a() {
        return this.f5056a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wa) && this.f5056a == ((wa) obj).f5056a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f5056a);
    }

    public String toString() {
        return "InterruptionConfig(audioFocusType=" + this.f5056a + ")";
    }

    public /* synthetic */ wa(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 3 : i);
    }
}
