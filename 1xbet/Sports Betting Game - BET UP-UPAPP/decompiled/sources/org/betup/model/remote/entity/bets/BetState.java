package org.betup.model.remote.entity.bets;

/* loaded from: classes2.dex */
public enum BetState {
    ALL("all"),
    RETURNED("returned"),
    PENDING("pending"),
    WON("won"),
    LOST("lost"),
    SOLD("sold"),
    CANCELED("canceled");

    private String name;

    BetState(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    public static BetState fromString(String name) {
        if (name == null) {
            return ALL;
        }
        name.hashCode();
        switch (name) {
        }
        return ALL;
    }

    public static BetState fromInt(int val) {
        if (val == 1) {
            return RETURNED;
        }
        if (val == 2) {
            return PENDING;
        }
        if (val == 4) {
            return WON;
        }
        if (val == 8) {
            return LOST;
        }
        if (val == 16) {
            return SOLD;
        }
        if (val == 32) {
            return CANCELED;
        }
        return ALL;
    }
}
