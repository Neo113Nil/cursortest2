package org.betup.model.remote.entity.shop;

/* loaded from: classes2.dex */
public enum RewardState {
    AVAILABLE(1),
    CONSUMED(2),
    NOT_AVAILABLE(3);

    private int value;

    RewardState(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
