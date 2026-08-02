package org.betup.services.search;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.services.user.UserService;

@Singleton
/* loaded from: classes2.dex */
public class RecentSearchesService {
    private static final int MAX_TERMS = 5;
    private final LocalPreferencesService localPreferencesService;
    private List<String> recents;
    private final UserService userService;

    @Inject
    public RecentSearchesService(LocalPreferencesService localPreferencesService, UserService userService) {
        this.localPreferencesService = localPreferencesService;
        this.userService = userService;
        this.recents = new ArrayList(localPreferencesService.getRecentSearches(userService.getShortProfile().getUserModel().getId().intValue()));
    }

    public List<String> getRecentSearches() {
        return this.recents;
    }

    public void addToRecents(String term) {
        if (term == null || term.isEmpty()) {
            return;
        }
        this.recents.remove(term);
        if (this.recents.size() > 0) {
            String str = this.recents.get(0);
            if (str.startsWith(term)) {
                return;
            }
            if (term.contains(str)) {
                this.recents.remove(str);
            }
        }
        this.recents.add(0, term);
        if (this.recents.size() > 5) {
            this.recents = this.recents.subList(0, 4);
        }
        this.localPreferencesService.saveRecentSearches(this.userService.getShortProfile().getUserModel().getId().intValue(), this.recents);
    }
}
