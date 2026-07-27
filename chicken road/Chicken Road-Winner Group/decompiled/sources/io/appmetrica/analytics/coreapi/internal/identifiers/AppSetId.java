package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class AppSetId {

    /* renamed from: a, reason: collision with root package name */
    private final String f5343a;

    /* renamed from: b, reason: collision with root package name */
    private final AppSetIdScope f5344b;

    public AppSetId(String str, AppSetIdScope appSetIdScope) {
        this.f5343a = str;
        this.f5344b = appSetIdScope;
    }

    public static /* synthetic */ AppSetId copy$default(AppSetId appSetId, String str, AppSetIdScope appSetIdScope, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = appSetId.f5343a;
        }
        if ((i3 & 2) != 0) {
            appSetIdScope = appSetId.f5344b;
        }
        return appSetId.copy(str, appSetIdScope);
    }

    public final String component1() {
        return this.f5343a;
    }

    public final AppSetIdScope component2() {
        return this.f5344b;
    }

    public final AppSetId copy(String str, AppSetIdScope appSetIdScope) {
        return new AppSetId(str, appSetIdScope);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSetId)) {
            return false;
        }
        AppSetId appSetId = (AppSetId) obj;
        return j.a(this.f5343a, appSetId.f5343a) && this.f5344b == appSetId.f5344b;
    }

    public final String getId() {
        return this.f5343a;
    }

    public final AppSetIdScope getScope() {
        return this.f5344b;
    }

    public int hashCode() {
        String str = this.f5343a;
        return this.f5344b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "AppSetId(id=" + this.f5343a + ", scope=" + this.f5344b + ')';
    }
}
