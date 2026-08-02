package org.betup.model.remote.entity;

/* loaded from: classes2.dex */
public class MatchHolder<T> {
    private boolean isPromo;
    private T match;

    public MatchHolder(T match, boolean isPromo) {
        this.match = match;
        this.isPromo = isPromo;
    }

    public T getMatch() {
        return this.match;
    }

    public void setMatch(T match) {
        this.match = match;
    }

    public boolean isPromo() {
        return this.isPromo;
    }

    public void setPromo(boolean promo) {
        this.isPromo = promo;
    }
}
