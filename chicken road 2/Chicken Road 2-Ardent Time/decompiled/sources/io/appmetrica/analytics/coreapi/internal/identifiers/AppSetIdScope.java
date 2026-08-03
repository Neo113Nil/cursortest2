package io.appmetrica.analytics.coreapi.internal.identifiers;

/* loaded from: classes.dex */
public enum AppSetIdScope {
    UNKNOWN(""),
    APP("app"),
    DEVELOPER("developer");


    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3662a;

    AppSetIdScope(java.lang.String str) {
        this.f3662a = str;
    }

    public final java.lang.String getValue() {
        return this.f3662a;
    }
}
