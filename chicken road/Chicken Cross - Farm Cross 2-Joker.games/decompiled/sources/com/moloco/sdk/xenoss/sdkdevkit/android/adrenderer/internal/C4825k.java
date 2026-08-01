package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4825k {
    public static final int c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final Integer f10987a;
    public final List<String> b;

    public C4825k(Integer num, List<String> gradient) {
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        this.f10987a = num;
        this.b = gradient;
    }

    public final Integer a() {
        return this.f10987a;
    }

    public final List<String> b() {
        return this.b;
    }

    public final Integer c() {
        return this.f10987a;
    }

    public final List<String> d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4825k)) {
            return false;
        }
        C4825k c4825k = (C4825k) obj;
        return Intrinsics.areEqual(this.f10987a, c4825k.f10987a) && Intrinsics.areEqual(this.b, c4825k.b);
    }

    public int hashCode() {
        Integer num = this.f10987a;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "DECBorder(borderWidth=" + this.f10987a + ", gradient=" + this.b + ')';
    }

    public final C4825k a(Integer num, List<String> gradient) {
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        return new C4825k(num, gradient);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4825k a(C4825k c4825k, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c4825k.f10987a;
        }
        if ((i & 2) != 0) {
            list = c4825k.b;
        }
        return c4825k.a(num, list);
    }

    public /* synthetic */ C4825k(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }
}
