package org.betup.ui;

import org.betup.R;

/* loaded from: classes2.dex */
public interface FilterController {

    public enum FilterType {
        SCHEDULED,
        LIVESCORE
    }

    void applyFilter(FilterType filterType, MatchesFilter matchesFilter);

    MatchesFilter getFilter(FilterType filterType);

    void resetFilters();

    public enum MatchesFilter {
        ALL("all", R.string.all),
        ONE_HOUR("1h", R.string.one_hour),
        THREE_HOURS("3h", R.string.three_hours),
        SIX_HOURS("6h", R.string.six_hours),
        TWELVE_HOURS("12h", R.string.twelve_hours),
        ONE_DAY("1d", R.string.one_day),
        LIVE("now", R.string.live);

        private String shortcut;
        private int strRes;

        public int getStrRes() {
            return this.strRes;
        }

        public String getShortcut() {
            return this.shortcut;
        }

        MatchesFilter(String shortcut, int strRes) {
            this.shortcut = shortcut;
            this.strRes = strRes;
        }
    }
}
