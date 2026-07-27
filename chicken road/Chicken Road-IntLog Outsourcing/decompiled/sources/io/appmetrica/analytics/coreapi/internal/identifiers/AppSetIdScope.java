package io.appmetrica.analytics.coreapi.internal.identifiers;

/* loaded from: classes.dex */
public enum AppSetIdScope {
    UNKNOWN(""),
    APP("app"),
    DEVELOPER("developer");


    /* renamed from: a, reason: collision with root package name */
    private final String f6165a;

    AppSetIdScope(String str) {
        this.f6165a = str;
    }

    public final String getValue() {
        return this.f6165a;
    }
}
