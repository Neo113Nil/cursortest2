package org.betup.services.user;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class UserAnalyticsTags {
    private static volatile Set<String> tags = Collections.emptySet();

    private UserAnalyticsTags() {
    }

    public static Set<String> getTags() {
        return tags;
    }

    public static void setTags(Collection<String> rawTags) {
        HashSet hashSet = new HashSet();
        for (String str : rawTags) {
            if (str != null) {
                String lowerCase = str.trim().toLowerCase();
                if (!lowerCase.isEmpty()) {
                    hashSet.add(lowerCase);
                }
            }
        }
        tags = hashSet;
    }

    public static void clear() {
        tags = Collections.emptySet();
    }
}
