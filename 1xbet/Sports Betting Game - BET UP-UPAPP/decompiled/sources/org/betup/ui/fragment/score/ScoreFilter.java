package org.betup.ui.fragment.score;

import org.betup.R;

/* loaded from: classes4.dex */
public enum ScoreFilter {
    LIVE(R.string.live),
    TODAY(R.string.today),
    SELECT_DATE(R.string.select_date);

    private int strRes;

    public int getStrRes() {
        return this.strRes;
    }

    ScoreFilter(int strRes) {
        this.strRes = strRes;
    }
}
