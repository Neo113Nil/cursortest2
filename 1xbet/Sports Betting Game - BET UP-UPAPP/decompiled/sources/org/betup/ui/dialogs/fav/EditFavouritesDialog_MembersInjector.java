package org.betup.ui.dialogs.fav;

import dagger.MembersInjector;
import javax.inject.Provider;
import org.betup.ui.fragment.matches.LeaguesController;
import org.betup.ui.fragment.matches.MatchesController;
import org.betup.ui.fragment.matches.TeamsController;

/* loaded from: classes2.dex */
public final class EditFavouritesDialog_MembersInjector implements MembersInjector<EditFavouritesDialog> {
    private final Provider<LeaguesController> leaguesControllerProvider;
    private final Provider<MatchesController> matchesControllerProvider;
    private final Provider<TeamsController> teamsControllerProvider;

    public EditFavouritesDialog_MembersInjector(Provider<MatchesController> matchesControllerProvider, Provider<LeaguesController> leaguesControllerProvider, Provider<TeamsController> teamsControllerProvider) {
        this.matchesControllerProvider = matchesControllerProvider;
        this.leaguesControllerProvider = leaguesControllerProvider;
        this.teamsControllerProvider = teamsControllerProvider;
    }

    public static MembersInjector<EditFavouritesDialog> create(Provider<MatchesController> matchesControllerProvider, Provider<LeaguesController> leaguesControllerProvider, Provider<TeamsController> teamsControllerProvider) {
        return new EditFavouritesDialog_MembersInjector(matchesControllerProvider, leaguesControllerProvider, teamsControllerProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(EditFavouritesDialog instance) {
        injectMatchesController(instance, this.matchesControllerProvider.get());
        injectLeaguesController(instance, this.leaguesControllerProvider.get());
        injectTeamsController(instance, this.teamsControllerProvider.get());
    }

    public static void injectMatchesController(EditFavouritesDialog instance, MatchesController matchesController) {
        instance.matchesController = matchesController;
    }

    public static void injectLeaguesController(EditFavouritesDialog instance, LeaguesController leaguesController) {
        instance.leaguesController = leaguesController;
    }

    public static void injectTeamsController(EditFavouritesDialog instance, TeamsController teamsController) {
        instance.teamsController = teamsController;
    }
}
