package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C4823i;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class a {
    public static final int f = 8;

    /* renamed from: a, reason: collision with root package name */
    public final f f11330a;
    public final c b;
    public final List<String> c;
    public final List<String> d;
    public final C4823i e;

    public a(f linear, c cVar, List<String> impressionTracking, List<String> errorTracking, C4823i c4823i) {
        Intrinsics.checkNotNullParameter(linear, "linear");
        Intrinsics.checkNotNullParameter(impressionTracking, "impressionTracking");
        Intrinsics.checkNotNullParameter(errorTracking, "errorTracking");
        this.f11330a = linear;
        this.b = cVar;
        this.c = impressionTracking;
        this.d = errorTracking;
        this.e = c4823i;
    }

    public final f a() {
        return this.f11330a;
    }

    public final c b() {
        return this.b;
    }

    public final List<String> c() {
        return this.c;
    }

    public final List<String> d() {
        return this.d;
    }

    public final C4823i e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f11330a, aVar.f11330a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c) && Intrinsics.areEqual(this.d, aVar.d) && Intrinsics.areEqual(this.e, aVar.e);
    }

    public final c f() {
        return this.b;
    }

    public final C4823i g() {
        return this.e;
    }

    public final List<String> h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.f11330a.hashCode() * 31;
        c cVar = this.b;
        int hashCode2 = (((((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        C4823i c4823i = this.e;
        return hashCode2 + (c4823i != null ? c4823i.hashCode() : 0);
    }

    public final List<String> i() {
        return this.c;
    }

    public final f j() {
        return this.f11330a;
    }

    public String toString() {
        return "Ad(linear=" + this.f11330a + ", companion=" + this.b + ", impressionTracking=" + this.c + ", errorTracking=" + this.d + ", dec=" + this.e + ')';
    }

    public final a a(f linear, c cVar, List<String> impressionTracking, List<String> errorTracking, C4823i c4823i) {
        Intrinsics.checkNotNullParameter(linear, "linear");
        Intrinsics.checkNotNullParameter(impressionTracking, "impressionTracking");
        Intrinsics.checkNotNullParameter(errorTracking, "errorTracking");
        return new a(linear, cVar, impressionTracking, errorTracking, c4823i);
    }

    public static /* synthetic */ a a(a aVar, f fVar, c cVar, List list, List list2, C4823i c4823i, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = aVar.f11330a;
        }
        if ((i & 2) != 0) {
            cVar = aVar.b;
        }
        c cVar2 = cVar;
        if ((i & 4) != 0) {
            list = aVar.c;
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = aVar.d;
        }
        List list4 = list2;
        if ((i & 16) != 0) {
            c4823i = aVar.e;
        }
        return aVar.a(fVar, cVar2, list3, list4, c4823i);
    }

    public /* synthetic */ a(f fVar, c cVar, List list, List list2, C4823i c4823i, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, cVar, list, list2, (i & 16) != 0 ? null : c4823i);
    }
}
