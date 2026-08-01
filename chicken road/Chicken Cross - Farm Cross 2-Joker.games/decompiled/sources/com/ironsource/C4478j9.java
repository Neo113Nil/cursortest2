package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.j9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4478j9 {

    /* renamed from: a, reason: collision with root package name */
    private final String f8267a;
    private final String b;
    private final EnumC4514l9 c;
    private final JSONObject d;

    public C4478j9(String url, String storePackage, EnumC4514l9 strategy, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(storePackage, "storePackage");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f8267a = url;
        this.b = storePackage;
        this.c = strategy;
        this.d = jSONObject;
    }

    public final String a() {
        return this.f8267a;
    }

    public final String b() {
        return this.b;
    }

    public final EnumC4514l9 c() {
        return this.c;
    }

    public final JSONObject d() {
        return this.d;
    }

    public final JSONObject e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4478j9)) {
            return false;
        }
        C4478j9 c4478j9 = (C4478j9) obj;
        return Intrinsics.areEqual(this.f8267a, c4478j9.f8267a) && Intrinsics.areEqual(this.b, c4478j9.b) && this.c == c4478j9.c && Intrinsics.areEqual(this.d, c4478j9.d);
    }

    public final String f() {
        return this.b;
    }

    public final EnumC4514l9 g() {
        return this.c;
    }

    public final String h() {
        return this.f8267a;
    }

    public int hashCode() {
        int hashCode = ((((this.f8267a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        JSONObject jSONObject = this.d;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "InlineStoreRequest(url=" + this.f8267a + ", storePackage=" + this.b + ", strategy=" + this.c + ", extras=" + this.d + ")";
    }

    public final C4478j9 a(String url, String storePackage, EnumC4514l9 strategy, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(storePackage, "storePackage");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        return new C4478j9(url, storePackage, strategy, jSONObject);
    }

    public static /* synthetic */ C4478j9 a(C4478j9 c4478j9, String str, String str2, EnumC4514l9 enumC4514l9, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4478j9.f8267a;
        }
        if ((i & 2) != 0) {
            str2 = c4478j9.b;
        }
        if ((i & 4) != 0) {
            enumC4514l9 = c4478j9.c;
        }
        if ((i & 8) != 0) {
            jSONObject = c4478j9.d;
        }
        return c4478j9.a(str, str2, enumC4514l9, jSONObject);
    }

    public /* synthetic */ C4478j9(String str, String str2, EnumC4514l9 enumC4514l9, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? EnumC4514l9.APP_ACTIVITY : enumC4514l9, (i & 8) != 0 ? null : jSONObject);
    }
}
