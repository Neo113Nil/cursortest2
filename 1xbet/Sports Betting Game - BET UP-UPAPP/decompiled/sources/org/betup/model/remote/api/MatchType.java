package org.betup.model.remote.api;

/* loaded from: classes2.dex */
public enum MatchType {
    LIVE("live"),
    FUTURE("future");

    private String name;

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    MatchType(String name) {
        this.name = name;
    }
}
