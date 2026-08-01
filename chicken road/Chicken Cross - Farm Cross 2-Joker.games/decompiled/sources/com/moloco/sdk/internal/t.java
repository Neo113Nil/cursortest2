package com.moloco.sdk.internal;

import com.moloco.sdk.publisher.MolocoAdError;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class t {
    public static final int d = 8;

    /* renamed from: a, reason: collision with root package name */
    public final MolocoAdError f10845a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b;
    public final Map<String, String> c;

    public t(MolocoAdError molocoAdError, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c subErrorType, Map<String, String> details) {
        Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        Intrinsics.checkNotNullParameter(subErrorType, "subErrorType");
        Intrinsics.checkNotNullParameter(details, "details");
        this.f10845a = molocoAdError;
        this.b = subErrorType;
        this.c = details;
    }

    public final MolocoAdError a() {
        return this.f10845a;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b() {
        return this.b;
    }

    public final Map<String, String> c() {
        return this.c;
    }

    public final Map<String, String> d() {
        return this.c;
    }

    public final MolocoAdError e() {
        return this.f10845a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.areEqual(this.f10845a, tVar.f10845a) && Intrinsics.areEqual(this.b, tVar.b) && Intrinsics.areEqual(this.c, tVar.c);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c f() {
        return this.b;
    }

    public int hashCode() {
        return (((this.f10845a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "MolocoInternalAdError(molocoAdError=" + this.f10845a + ", subErrorType=" + this.b + ", details=" + this.c + ')';
    }

    public final t a(MolocoAdError molocoAdError, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c subErrorType, Map<String, String> details) {
        Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        Intrinsics.checkNotNullParameter(subErrorType, "subErrorType");
        Intrinsics.checkNotNullParameter(details, "details");
        return new t(molocoAdError, subErrorType, details);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ t a(t tVar, MolocoAdError molocoAdError, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            molocoAdError = tVar.f10845a;
        }
        if ((i & 2) != 0) {
            cVar = tVar.b;
        }
        if ((i & 4) != 0) {
            map = tVar.c;
        }
        return tVar.a(molocoAdError, cVar, map);
    }

    public /* synthetic */ t(MolocoAdError molocoAdError, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(molocoAdError, cVar, (i & 4) != 0 ? MapsKt.emptyMap() : map);
    }
}
