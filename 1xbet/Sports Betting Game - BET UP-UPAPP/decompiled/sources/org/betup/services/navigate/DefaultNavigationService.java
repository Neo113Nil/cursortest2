package org.betup.services.navigate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.vk.sdk.api.model.VKAttachments;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.betup.R;
import org.betup.bus.NavigateMessage;
import org.betup.games.MiniGameActivity;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.services.casino.CasinoService;
import org.betup.services.user.UserService;
import org.betup.ui.MainActivity;
import org.betup.ui.ProgressDisplay;
import org.betup.ui.base.BaseActivity;
import org.betup.ui.dialogs.OffersDialogFragment;
import org.betup.ui.dialogs.offer.SpecialOfferDialogFragment;
import org.betup.ui.fragment.BaseFragment;
import org.betup.ui.fragment.achievements.NewAchievementsFragment;
import org.betup.ui.fragment.balance.BalanceHistoryFragmentK;
import org.betup.ui.fragment.bets.BetsFragment;
import org.betup.ui.fragment.bets.BetsPage;
import org.betup.ui.fragment.competitions.NewCompetitionsFragment;
import org.betup.ui.fragment.competitions.details.CompetitionDetailsFragment;
import org.betup.ui.fragment.flashbet.FlashBetCategoriesFragment;
import org.betup.ui.fragment.flashbet.FlashBetFragment;
import org.betup.ui.fragment.flashbet.FlashBetGameFragment;
import org.betup.ui.fragment.flashbet.FlashBetMatchStartFragment;
import org.betup.ui.fragment.home.HomeFragment;
import org.betup.ui.fragment.matches.LeaguesFragment;
import org.betup.ui.fragment.matches.MatchesTabsFragment;
import org.betup.ui.fragment.matches.SpecificChampionshipFragment;
import org.betup.ui.fragment.matches.SportsByDateFragment;
import org.betup.ui.fragment.matches.TopMatchesFragment;
import org.betup.ui.fragment.matches.details.MatchDetailsFragmentK;
import org.betup.ui.fragment.matches.details.TeamDetailsFragment;
import org.betup.ui.fragment.notifications.NotificationsFragment;
import org.betup.ui.fragment.search.NewSearchFragment;
import org.betup.ui.fragment.settings.NewSettingsFragment;
import org.betup.ui.fragment.shop.ShopBetcoinsFragmentK;
import org.betup.ui.fragment.shop.promo.PromoFragment;
import org.betup.ui.fragment.support.SupportFragmentK;
import org.betup.ui.fragment.user.ForeignUserDetailsFragmentK;
import org.betup.ui.fragment.user.UserBattlesFragment;
import org.betup.ui.fragment.user.UserDetailsFragmentK;
import org.betup.ui.fragment.user.UserRankingsFragment;
import org.betup.utils.FragmentTransactionHelper;

/* loaded from: classes2.dex */
public class DefaultNavigationService implements NavigationService<NavigateMessage.Target> {
    private final CasinoService casinoService;
    private final UserService userService;

    public DefaultNavigationService(UserService userService, CasinoService casinoService) {
        this.userService = userService;
        this.casinoService = casinoService;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x04f5  */
    /* JADX WARN: Type inference failed for: r38v0, types: [android.app.Activity, android.content.Context, org.betup.ui.base.BaseActivity] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12, types: [org.betup.ui.fragment.shop.ShopBetcoinsFragmentK] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v76, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v77, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v78 */
    /* JADX WARN: Type inference failed for: r3v81, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r3v85, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v94 */
    /* JADX WARN: Type inference failed for: r4v41, types: [org.betup.ui.fragment.flashbet.FlashBetCategoriesFragment$Companion] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // org.betup.services.navigate.NavigationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void processNavigation(BaseActivity baseActivity, NavigateMessage<NavigateMessage.Target> navigateMessage) {
        NavigateMessage.Target target;
        FragmentTransactionHelper.AnimationType animationType;
        boolean z;
        boolean z2;
        String str;
        HomeFragment homeFragment;
        Fragment findFragmentById;
        Fragment instance;
        Fragment newInstance;
        int i;
        int i2;
        FragmentTransactionHelper.AnimationType animationType2;
        Fragment fragment;
        Fragment fragment2;
        boolean z3;
        Fragment newInstance2;
        Fragment fragment3;
        Log.d("DefaultNavigationService", "processNavigation called with target: " + navigateMessage.getTarget());
        NavigateMessage.Target target2 = navigateMessage.getTarget();
        boolean z4 = target2 == NavigateMessage.Target.OFFERS || target2 == NavigateMessage.Target.USER_DETAILS || target2 == NavigateMessage.Target.FOREIGN_USER_DETAILS || target2 == NavigateMessage.Target.SHOP;
        if (!this.userService.isRegistered() && !z4) {
            Log.w("DefaultNavigationService", "User not registered, skipping navigation");
            return;
        }
        Bundle bundle = navigateMessage.getBundle();
        FragmentTransactionHelper.AnimationType animationType3 = FragmentTransactionHelper.AnimationType.SLIDE;
        Log.d("DefaultNavigationService", "Processing target: " + target2);
        if (target2 != null) {
            try {
                animationType = animationType3;
                target = target2;
                str = "";
                try {
                    try {
                    } catch (Exception e) {
                        e = e;
                        str = 0;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                target = target2;
                animationType = animationType3;
            }
            switch (AnonymousClass1.$SwitchMap$org$betup$bus$NavigateMessage$Target[target2.ordinal()]) {
                case 1:
                    z = false;
                    z2 = true;
                    try {
                    } catch (Exception e4) {
                        e = e4;
                        str = 0;
                        e.printStackTrace();
                        homeFragment = str;
                        animationType3 = animationType;
                        fragment3 = homeFragment;
                        Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                        if (fragment3 == null) {
                        }
                        Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    }
                    if (!navigateToHomeRoot(baseActivity)) {
                        homeFragment = new HomeFragment();
                        animationType3 = animationType;
                        fragment3 = homeFragment;
                        Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                        if (fragment3 == null && baseActivity.isVisible()) {
                            Log.d("DefaultNavigationService", "Fragment type: " + fragment3.getClass().getSimpleName());
                            boolean z5 = fragment3 instanceof BaseFragment;
                            Log.d("DefaultNavigationService", "Is BaseFragment: " + z5);
                            boolean z6 = fragment3 instanceof DialogFragment;
                            Log.d("DefaultNavigationService", "Is DialogFragment: " + z6);
                            if (!z5) {
                                if (!z6) {
                                    Log.w("DefaultNavigationService", "Fragment is neither BaseFragment nor DialogFragment - cannot display");
                                    break;
                                } else {
                                    Log.d("DefaultNavigationService", "Showing DialogFragment");
                                    ((DialogFragment) fragment3).show(baseActivity.getSupportFragmentManager(), (String) null);
                                    Log.d("DefaultNavigationService", "DialogFragment shown successfully");
                                    break;
                                }
                            } else {
                                BaseFragment baseFragment = (BaseFragment) fragment3;
                                NavigateMessage.Target target3 = target;
                                if (target3 != NavigateMessage.Target.MATCH_DETAILS && target3 != NavigateMessage.Target.TEAM_DETAILS) {
                                    FragmentTransactionHelper.with(baseActivity.getSupportFragmentManager()).commit(baseFragment, (Context) baseActivity, animationType3);
                                    Log.d("DefaultNavigationService", "BaseFragment committed successfully");
                                    break;
                                } else {
                                    Fragment findFragmentById2 = baseActivity.getSupportFragmentManager().findFragmentById(R.id.container);
                                    FragmentTransactionHelper.with(baseActivity.getSupportFragmentManager()).commitKeepingCurrent(findFragmentById2 instanceof BaseFragment ? (BaseFragment) findFragmentById2 : null, baseFragment, baseActivity, animationType3);
                                    Log.d("DefaultNavigationService", "Committed with preserve (hide+add)");
                                    break;
                                }
                            }
                        } else {
                            Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                        }
                    }
                    break;
                case 2:
                    try {
                        findFragmentById = baseActivity.getSupportFragmentManager().findFragmentById(R.id.container);
                        Log.d("DefaultNavigationService", "SHOP navigation requested. Current fragment: " + (findFragmentById != null ? findFragmentById.getClass().getSimpleName() : AbstractJsonLexerKt.NULL));
                    } catch (Exception e5) {
                        e = e5;
                        z = false;
                        z2 = true;
                        str = 0;
                        e.printStackTrace();
                        homeFragment = str;
                        animationType3 = animationType;
                        fragment3 = homeFragment;
                        Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                        if (fragment3 == null) {
                        }
                        Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    }
                    if (findFragmentById instanceof ShopBetcoinsFragmentK) {
                        Log.d("DefaultNavigationService", "Shop fragment already active, skipping navigation");
                        break;
                    } else {
                        Log.d("DefaultNavigationService", "Creating new ShopBetcoinsFragmentK instance");
                        str = ShopBetcoinsFragmentK.INSTANCE.newInstance();
                        z = false;
                        try {
                            if (bundle.getBoolean("restore_betting_sheet", false) && (baseActivity instanceof MainActivity)) {
                                z2 = true;
                                try {
                                    ((MainActivity) baseActivity).setRestoreBettingSheetAfterShop(true);
                                    homeFragment = str;
                                } catch (Exception e6) {
                                    e = e6;
                                    e.printStackTrace();
                                    homeFragment = str;
                                    animationType3 = animationType;
                                    fragment3 = homeFragment;
                                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                                    if (fragment3 == null) {
                                    }
                                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                                }
                            } else {
                                z2 = true;
                                homeFragment = str;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            z2 = true;
                            e.printStackTrace();
                            homeFragment = str;
                            animationType3 = animationType;
                            fragment3 = homeFragment;
                            Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                            if (fragment3 == null) {
                            }
                            Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                        }
                        animationType3 = animationType;
                        fragment3 = homeFragment;
                        Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                        if (fragment3 == null) {
                            break;
                        }
                        Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    }
                    break;
                case 3:
                    instance = SpecificChampionshipFragment.INSTANCE.setInstance(bundle.getInt("id"), bundle.getBoolean("isLive"), bundle.getString("filter"), bundle.getBoolean("isFavorite"));
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 4:
                    instance = UserRankingsFragment.newInstance(this.userService.getShortProfile().getUserModel().getId().intValue());
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 5:
                    instance = BalanceHistoryFragmentK.newInstance();
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 6:
                    instance = NewAchievementsFragment.INSTANCE.newInstance();
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 7:
                    instance = new MatchesTabsFragment();
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 8:
                    instance = TopMatchesFragment.INSTANCE.newInstance(bundle != null ? bundle.getInt("initialTab", 0) : 0);
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 9:
                    instance = MatchDetailsFragmentK.INSTANCE.setInstance(bundle.getInt("matchId"), bundle.getBoolean("isLive"), bundle.getInt("participationId", 0));
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 10:
                    instance = PromoFragment.newInstance();
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 11:
                    String string = bundle != null ? bundle.getString("chatId") : null;
                    newInstance = (string == null || string.isEmpty()) ? SupportFragmentK.INSTANCE.newInstance(1, null, null, null) : SupportFragmentK.INSTANCE.newInstance(1, null, null, string);
                    instance = newInstance;
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 12:
                    newInstance = SupportFragmentK.INSTANCE.newInstance(0, null, null, null);
                    instance = newInstance;
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 13:
                    this.casinoService.runGame(baseActivity, (ProgressDisplay) baseActivity);
                    z = false;
                    z2 = true;
                    animationType3 = animationType;
                    break;
                case 14:
                    newInstance = SupportFragmentK.INSTANCE.newInstance(1, null, null, bundle != null ? bundle.getString("chatId") : null);
                    instance = newInstance;
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 15:
                    newInstance = SupportFragmentK.INSTANCE.newInstance(2, 3, baseActivity.getApplicationContext().getString(R.string.delete_account_default_message), null);
                    instance = newInstance;
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 16:
                    if (bundle != null) {
                        i = 0;
                        try {
                            i2 = bundle.getInt("openBetId", 0);
                        } catch (Exception e8) {
                            e = e8;
                            z = false;
                            str = 0;
                            z2 = true;
                            e.printStackTrace();
                            homeFragment = str;
                            animationType3 = animationType;
                            fragment3 = homeFragment;
                            Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                            if (fragment3 == null) {
                            }
                            Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                        }
                    } else {
                        i = 0;
                        i2 = 0;
                    }
                    newInstance = BetsFragment.newInstance(bundle != null ? (BetState) bundle.getSerializable("state") : null, bundle != null ? (BetsPage) bundle.getSerializable(VKAttachments.TYPE_WIKI_PAGE) : null, i2, bundle != null ? bundle.getInt("openBetOwnerUserId", i) : 0);
                    instance = newInstance;
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 17:
                    int i3 = bundle.getInt(GetRandomTeamImagesInteractor.KEY_SPORT_ID, 0);
                    Log.d("NavigationService", "========================================");
                    Log.d("NavigationService", "🎯 Navigating to LEAGUES");
                    Log.d("NavigationService", "sportId from bundle: " + i3);
                    Log.d("NavigationService", "Bundle keys: " + Arrays.toString(bundle.keySet().toArray()));
                    if (i3 == 0) {
                        Log.w("NavigationService", "⚠️ sportId is 0 or not found in bundle!");
                    }
                    LeaguesFragment newInstance3 = LeaguesFragment.INSTANCE.newInstance(i3);
                    try {
                        Log.d("NavigationService", "✅ LeaguesFragment created with sportId: " + i3);
                        Log.d("NavigationService", "========================================");
                        instance = newInstance3;
                        animationType3 = animationType;
                        fragment = instance;
                        z = false;
                        z2 = true;
                        fragment3 = fragment;
                    } catch (Exception e9) {
                        e = e9;
                        str = newInstance3;
                        z = false;
                        z2 = true;
                        e.printStackTrace();
                        homeFragment = str;
                        animationType3 = animationType;
                        fragment3 = homeFragment;
                        Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                        if (fragment3 == null) {
                        }
                        Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    }
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 18:
                    newInstance = SportsByDateFragment.INSTANCE.newInstance();
                    instance = newInstance;
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 19:
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    boolean z7 = bundle.getBoolean("return", true);
                    int i4 = bundle.getInt("id", 0);
                    int intValue = this.userService.getShortProfile().getUserModel().getId().intValue();
                    if (i4 <= 0) {
                        i4 = intValue;
                    }
                    instance = i4 == intValue ? UserDetailsFragmentK.INSTANCE.newInstance(i4, z7, bundle.getBoolean("openToMessages", false), bundle.getBoolean("openToRankings", false)) : ForeignUserDetailsFragmentK.INSTANCE.newInstance(i4, z7);
                    if (z7) {
                        animationType2 = FragmentTransactionHelper.AnimationType.FLIP;
                        fragment2 = instance;
                        animationType3 = animationType2;
                        fragment = fragment2;
                        z = false;
                        z2 = true;
                        fragment3 = fragment;
                        Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                        if (fragment3 == null) {
                        }
                        Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                        break;
                    }
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 20:
                    boolean z8 = bundle.getBoolean("return", true);
                    instance = ForeignUserDetailsFragmentK.INSTANCE.newInstance(bundle.getInt("id"), z8);
                    if (z8) {
                        animationType2 = FragmentTransactionHelper.AnimationType.FLIP;
                        fragment2 = instance;
                        animationType3 = animationType2;
                        fragment = fragment2;
                        z = false;
                        z2 = true;
                        fragment3 = fragment;
                        Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                        if (fragment3 == null) {
                        }
                        Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                        break;
                    }
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 21:
                    Log.d("DefaultNavigationService", "BATTLES case - creating UserBattlesFragment");
                    instance = new UserBattlesFragment();
                    Log.d("DefaultNavigationService", "UserBattlesFragment created: true");
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 22:
                    newInstance = new NewSettingsFragment();
                    instance = newInstance;
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 23:
                    newInstance = new NewSearchFragment();
                    instance = newInstance;
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 24:
                    newInstance = new NewCompetitionsFragment();
                    instance = newInstance;
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 25:
                    newInstance = CompetitionDetailsFragment.INSTANCE.newInstance(bundle.getLong("competition_id", 0L));
                    instance = newInstance;
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 26:
                    baseActivity.startActivity(new Intent((Context) baseActivity, (Class<?>) MiniGameActivity.class));
                    z = false;
                    z2 = true;
                    animationType3 = animationType;
                    break;
                case 27:
                    this.casinoService.runGame(baseActivity, (ProgressDisplay) baseActivity);
                    z = false;
                    z2 = true;
                    animationType3 = animationType;
                    break;
                case 28:
                    String string2 = bundle != null ? bundle.getString("offerId") : null;
                    newInstance = string2 != null ? SpecialOfferDialogFragment.INSTANCE.newInstance(string2) : OffersDialogFragment.INSTANCE.newInstance(null);
                    instance = newInstance;
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 29:
                    newInstance = NotificationsFragment.INSTANCE.newInstance();
                    instance = newInstance;
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 30:
                    long j = bundle.getLong("teamId", 0L);
                    if (j > 0) {
                        newInstance = TeamDetailsFragment.INSTANCE.newInstance(j);
                        instance = newInstance;
                        animationType3 = animationType;
                        fragment = instance;
                        z = false;
                        z2 = true;
                        fragment3 = fragment;
                        Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                        if (fragment3 == null) {
                        }
                        Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                        break;
                    }
                    z = false;
                    z2 = true;
                    animationType3 = animationType;
                    break;
                case 31:
                    newInstance = new FlashBetFragment();
                    instance = newInstance;
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 32:
                    newInstance = FlashBetCategoriesFragment.INSTANCE.newInstance(bundle != null ? bundle.getString(GetRandomTeamImagesInteractor.KEY_SPORT_ID, "") : "", bundle != null ? bundle.getString("sportName", "") : "");
                    instance = newInstance;
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 33:
                    newInstance = FlashBetMatchStartFragment.INSTANCE.newInstance(bundle != null ? bundle.getString(GetRandomTeamImagesInteractor.KEY_SPORT_ID, "") : "", bundle != null ? bundle.getString("sportName", "") : "", bundle != null ? bundle.getString("categoryId", "") : "", bundle != null ? bundle.getString("categoryName", "") : "", bundle != null ? bundle.getString("categoryPhotoUrl", "") : "", bundle != null ? bundle.getString("categoryLogoUrl", "") : "", bundle != null ? bundle.getLong("entryFee", 0L) : 0L);
                    instance = newInstance;
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 34:
                    newInstance = FlashBetGameFragment.INSTANCE.newInstance(bundle != null ? bundle.getString("sessionId", "") : "", bundle != null ? bundle.getString("categoryName", "") : "", bundle != null ? bundle.getString("categoryLogoUrl", "") : "", bundle != null ? bundle.getString("categoryPhotoUrl", "") : "", bundle != null ? bundle.getString(GetRandomTeamImagesInteractor.KEY_SPORT_ID, "") : "", bundle != null ? bundle.getString("sportName", "") : "");
                    instance = newInstance;
                    animationType3 = animationType;
                    fragment = instance;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                case 35:
                    String string3 = bundle != null ? bundle.getString("userId") : null;
                    int intValue2 = this.userService.getShortProfile().getUserModel().getId().intValue();
                    if (string3 != null && !string3.isEmpty()) {
                        try {
                            intValue2 = Integer.parseInt(string3);
                        } catch (NumberFormatException unused) {
                            Log.w("DefaultNavigationService", "Invalid userId in MESSAGES bundle: " + string3);
                        }
                    }
                    if (intValue2 == this.userService.getShortProfile().getUserModel().getId().intValue()) {
                        try {
                            z3 = true;
                            try {
                                newInstance2 = UserDetailsFragmentK.INSTANCE.newInstance(intValue2, true, true);
                            } catch (Exception e10) {
                                e = e10;
                                z2 = z3;
                                str = 0;
                                z = false;
                                e.printStackTrace();
                                homeFragment = str;
                                animationType3 = animationType;
                                fragment3 = homeFragment;
                                Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                                if (fragment3 == null) {
                                }
                                Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                            }
                        } catch (Exception e11) {
                            e = e11;
                            z3 = true;
                        }
                    } else {
                        newInstance2 = ForeignUserDetailsFragmentK.INSTANCE.newInstance(intValue2, true, true);
                    }
                    fragment2 = newInstance2;
                    animationType2 = FragmentTransactionHelper.AnimationType.FLIP;
                    animationType3 = animationType2;
                    fragment = fragment2;
                    z = false;
                    z2 = true;
                    fragment3 = fragment;
                    Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
                    if (fragment3 == null) {
                    }
                    Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
                    break;
                default:
                    z = false;
                    z2 = true;
                    animationType3 = animationType;
                    break;
            }
            return;
        }
        target = target2;
        z = false;
        z2 = true;
        fragment3 = null;
        Log.d("DefaultNavigationService", "Fragment created: " + (fragment3 == null ? z2 : z) + ", Activity visible: " + baseActivity.isVisible());
        if (fragment3 == null) {
        }
        Log.w("DefaultNavigationService", "Cannot show fragment - fragment null: " + (fragment3 != null ? z2 : z) + ", activity visible: " + baseActivity.isVisible());
    }

    /* renamed from: org.betup.services.navigate.DefaultNavigationService$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$bus$NavigateMessage$Target;

        static {
            int[] iArr = new int[NavigateMessage.Target.values().length];
            $SwitchMap$org$betup$bus$NavigateMessage$Target = iArr;
            try {
                iArr[NavigateMessage.Target.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.SHOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.LEAGUE_MATCHES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.RANKINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.BALANCE_HISTORY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.ACHIEVEMENTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.MATCHES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.TOP_MATCHES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.MATCH_DETAILS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.PROMO_LIST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.SUPPORT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.FAQ.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.CASINO.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.SUPPORT_CHAT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.DELETE_ACCOUNT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.BETS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.LEAGUES.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.SCORES.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.USER_DETAILS.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.FOREIGN_USER_DETAILS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.BATTLES.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.SETTINGS.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.SEARCH.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.DAILY_COMPETITIONS.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.COMPETITION_DETAILS.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.MINI_GAMES_HOME_ACTIVITY.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.TVBET.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.OFFERS.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.EVENTS.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.TEAM_DETAILS.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.FLASH_BET.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.FLASH_BET_CATEGORIES.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.FLASH_BET_MATCH_START.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.FLASH_BET_GAME.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$Target[NavigateMessage.Target.MESSAGES.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
        }
    }

    private boolean navigateToHomeRoot(BaseActivity activity) {
        if (!(activity instanceof MainActivity)) {
            return false;
        }
        MainActivity mainActivity = (MainActivity) activity;
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        supportFragmentManager.executePendingTransactions();
        while (supportFragmentManager.getBackStackEntryCount() > 0) {
            supportFragmentManager.popBackStackImmediate();
        }
        mainActivity.syncStackSizeFromBackStack();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        HomeFragment homeFragment = null;
        boolean z = false;
        for (Fragment fragment : supportFragmentManager.getFragments()) {
            if (fragment != null && fragment.isAdded() && !(fragment instanceof DialogFragment)) {
                if (fragment instanceof HomeFragment) {
                    if (homeFragment == null) {
                        homeFragment = (HomeFragment) fragment;
                    } else {
                        beginTransaction.remove(fragment);
                        z = true;
                    }
                } else if (fragment instanceof BaseFragment) {
                    beginTransaction.remove(fragment);
                    z = true;
                }
            }
        }
        if (homeFragment != null && homeFragment.isHidden()) {
            beginTransaction.show(homeFragment);
            z = true;
        }
        if (z) {
            beginTransaction.commitAllowingStateLoss();
            supportFragmentManager.executePendingTransactions();
        }
        if (homeFragment == null) {
            return false;
        }
        Fragment findFragmentById = supportFragmentManager.findFragmentById(R.id.container);
        if ((findFragmentById instanceof HomeFragment) && findFragmentById == homeFragment) {
            Log.d("DefaultNavigationService", "Home restored — skip replace");
            return true;
        }
        FragmentTransaction beginTransaction2 = supportFragmentManager.beginTransaction();
        if (findFragmentById != null && findFragmentById.isAdded() && findFragmentById != homeFragment) {
            beginTransaction2.remove(findFragmentById);
        }
        if (!homeFragment.isAdded() || supportFragmentManager.findFragmentById(R.id.container) != homeFragment) {
            beginTransaction2.replace(R.id.container, homeFragment, homeFragment.getClass().getCanonicalName());
        } else if (homeFragment.isHidden()) {
            beginTransaction2.show(homeFragment);
        }
        beginTransaction2.commitAllowingStateLoss();
        supportFragmentManager.executePendingTransactions();
        Log.d("DefaultNavigationService", "Home restored from existing instance");
        return true;
    }
}
