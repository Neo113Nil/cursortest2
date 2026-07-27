package com.ironsource;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ya {

    /* renamed from: a, reason: collision with root package name */
    private final C4404f6 f8027a;
    private final C4404f6 b;
    private final C4740y2 c;
    private final Map<String, Ad> d;

    public Ya(C4404f6 c4404f6, C4404f6 c4404f62, C4740y2 c4740y2, Map<String, Ad> providerConfig) {
        Intrinsics.checkNotNullParameter(providerConfig, "providerConfig");
        this.f8027a = c4404f6;
        this.b = c4404f62;
        this.c = c4740y2;
        this.d = providerConfig;
    }

    public final C4404f6 a() {
        return this.f8027a;
    }

    public final C4404f6 b() {
        return this.b;
    }

    public final C4740y2 c() {
        return this.c;
    }

    public final Map<String, Ad> d() {
        return this.d;
    }

    public final C4740y2 e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ya)) {
            return false;
        }
        Ya ya = (Ya) obj;
        return Intrinsics.areEqual(this.f8027a, ya.f8027a) && Intrinsics.areEqual(this.b, ya.b) && Intrinsics.areEqual(this.c, ya.c) && Intrinsics.areEqual(this.d, ya.d);
    }

    public final C4404f6 f() {
        return this.b;
    }

    public final Map<String, Ad> g() {
        return this.d;
    }

    public final C4404f6 h() {
        return this.f8027a;
    }

    public int hashCode() {
        C4404f6 c4404f6 = this.f8027a;
        int hashCode = (c4404f6 == null ? 0 : c4404f6.hashCode()) * 31;
        C4404f6 c4404f62 = this.b;
        int hashCode2 = (hashCode + (c4404f62 == null ? 0 : c4404f62.hashCode())) * 31;
        C4740y2 c4740y2 = this.c;
        return ((hashCode2 + (c4740y2 != null ? c4740y2.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "LevelPlayInitConfig2(rewarded=" + this.f8027a + ", interstitial=" + this.b + ", banner=" + this.c + ", providerConfig=" + this.d + ")";
    }

    public final Ya a(C4404f6 c4404f6, C4404f6 c4404f62, C4740y2 c4740y2, Map<String, Ad> providerConfig) {
        Intrinsics.checkNotNullParameter(providerConfig, "providerConfig");
        return new Ya(c4404f6, c4404f62, c4740y2, providerConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Ya a(Ya ya, C4404f6 c4404f6, C4404f6 c4404f62, C4740y2 c4740y2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            c4404f6 = ya.f8027a;
        }
        if ((i & 2) != 0) {
            c4404f62 = ya.b;
        }
        if ((i & 4) != 0) {
            c4740y2 = ya.c;
        }
        if ((i & 8) != 0) {
            map = ya.d;
        }
        return ya.a(c4404f6, c4404f62, c4740y2, map);
    }
}
