package org.betup.model.local.entity;

/* loaded from: classes2.dex */
public enum OddType {
    DECIMAL("decimal"),
    FRACTIONAL("fractional"),
    AMERICAN("american");

    private String name;

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    OddType(String name) {
        this.name = name;
    }
}
