package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class AppSetId {

    /* renamed from: a, reason: collision with root package name */
    private final String f6162a;

    /* renamed from: b, reason: collision with root package name */
    private final AppSetIdScope f6163b;

    public AppSetId(String str, AppSetIdScope appSetIdScope) {
        this.f6162a = str;
        this.f6163b = appSetIdScope;
    }

    public static /* synthetic */ AppSetId copy$default(AppSetId appSetId, String str, AppSetIdScope appSetIdScope, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = appSetId.f6162a;
        }
        if ((i2 & 2) != 0) {
            appSetIdScope = appSetId.f6163b;
        }
        return appSetId.copy(str, appSetIdScope);
    }

    public final String component1() {
        return this.f6162a;
    }

    public final AppSetIdScope component2() {
        return this.f6163b;
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
        return i.a(this.f6162a, appSetId.f6162a) && this.f6163b == appSetId.f6163b;
    }

    public final String getId() {
        return this.f6162a;
    }

    public final AppSetIdScope getScope() {
        return this.f6163b;
    }

    public int hashCode() {
        String str = this.f6162a;
        return this.f6163b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "AppSetId(id=" + this.f6162a + ", scope=" + this.f6163b + ')';
    }
}
