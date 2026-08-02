package org.betup.services.menu;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* loaded from: classes2.dex */
public class MatchTabHolder {
    private int position;

    public enum Position {
        LIVE,
        SCHEDULED
    }

    @Inject
    public MatchTabHolder() {
    }

    public Position getPosition() {
        if (this.position == 0) {
            return Position.LIVE;
        }
        return Position.SCHEDULED;
    }

    public void setPosition(Position position) {
        if (position == Position.LIVE) {
            this.position = 0;
        } else {
            this.position = 1;
        }
    }
}
