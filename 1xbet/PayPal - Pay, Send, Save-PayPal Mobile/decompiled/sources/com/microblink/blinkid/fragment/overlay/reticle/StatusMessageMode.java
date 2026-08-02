package com.microblink.blinkid.fragment.overlay.reticle;

/* loaded from: classes10.dex */
public enum StatusMessageMode {
    IMMEDIATE,
    DELAYED;

    public final com.microblink.blinkid.fragment.overlay.reticle.StatusMessageMode hurried() {
        return this == DELAYED ? IMMEDIATE : this;
    }
}
