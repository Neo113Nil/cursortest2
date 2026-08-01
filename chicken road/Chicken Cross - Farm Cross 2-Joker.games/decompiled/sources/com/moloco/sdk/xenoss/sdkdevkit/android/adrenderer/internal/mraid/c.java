package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C4823i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class c {
    public static final int b = 8;

    /* renamed from: a, reason: collision with root package name */
    public final C4823i f11023a;

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final C4823i a() {
        return this.f11023a;
    }

    public final C4823i b() {
        return this.f11023a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.f11023a, ((c) obj).f11023a);
    }

    public int hashCode() {
        C4823i c4823i = this.f11023a;
        if (c4823i == null) {
            return 0;
        }
        return c4823i.hashCode();
    }

    public String toString() {
        return "MraidAdData(dec=" + this.f11023a + ')';
    }

    public c(C4823i c4823i) {
        this.f11023a = c4823i;
    }

    public final c a(C4823i c4823i) {
        return new c(c4823i);
    }

    public static /* synthetic */ c a(c cVar, C4823i c4823i, int i, Object obj) {
        if ((i & 1) != 0) {
            c4823i = cVar.f11023a;
        }
        return cVar.a(c4823i);
    }

    public /* synthetic */ c(C4823i c4823i, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c4823i);
    }
}
