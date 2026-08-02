package org.betup.ui.fragment.home;

import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes4.dex */
public abstract class AppBarStateChangeListener implements AppBarLayout.OnOffsetChangedListener {
    private State mCurrentState = State.IDLE;

    public abstract void onStateChanged(AppBarLayout appBarLayout, State state);

    public enum State {
        EXPANDED("EXPANDED"),
        COLLAPSED("COLLAPSED"),
        IDLE("IDLE");

        private String name;

        State(String name) {
            this.name = name;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        if (i == 0) {
            if (this.mCurrentState != State.EXPANDED) {
                onStateChanged(appBarLayout, State.EXPANDED);
            }
            this.mCurrentState = State.EXPANDED;
        } else if (Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
            if (this.mCurrentState != State.COLLAPSED) {
                onStateChanged(appBarLayout, State.COLLAPSED);
            }
            this.mCurrentState = State.COLLAPSED;
        } else {
            if (this.mCurrentState != State.IDLE) {
                onStateChanged(appBarLayout, State.IDLE);
            }
            this.mCurrentState = State.IDLE;
        }
    }
}
