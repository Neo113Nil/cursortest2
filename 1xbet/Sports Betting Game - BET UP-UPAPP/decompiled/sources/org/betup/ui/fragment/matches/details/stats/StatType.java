package org.betup.ui.fragment.matches.details.stats;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public enum StatType {
    HIGHLIGHTS(Arrays.asList("high", "highlights"), 0),
    STATISTICS(Arrays.asList("stats", "statistics"), 1),
    HEAD2HEAD(Arrays.asList("h2h", "head2head"), 2),
    STANDINGS(Arrays.asList("standings", "stands"), 3),
    LINEUPS(Arrays.asList("lineups", "lines"), 4);

    private List<String> names;
    private int priority;

    public int getPriority() {
        return this.priority;
    }

    StatType(List names, int priority) {
        this.names = names;
        this.priority = priority;
    }

    public static StatType fromString(String name) {
        for (StatType statType : values()) {
            if (statType.names.contains(name.toLowerCase())) {
                return statType;
            }
        }
        return null;
    }
}
