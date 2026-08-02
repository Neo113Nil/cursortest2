package org.betup.services.navigate;

import android.content.Intent;
import androidx.fragment.app.DialogFragment;
import org.betup.bus.NavigateMessage;
import org.betup.games.BaseGameFragment;
import org.betup.games.dice.ui.DiceFragment;
import org.betup.games.doubles.ui.DoubleGameFragment;
import org.betup.games.higherLower.ui.HigherLowerGameFragment;
import org.betup.games.luckyCells.ui.LuckyCellsGameFragment;
import org.betup.games.warGame.ui.WarGameFragment;
import org.betup.services.user.UserService;
import org.betup.ui.MainActivity;
import org.betup.ui.base.BaseActivity;
import org.betup.utils.FragmentTransactionHelper;

/* loaded from: classes2.dex */
public class GamesNavigationService implements NavigationService<NavigateMessage.TargetGame> {
    private UserService userService;

    public GamesNavigationService(UserService userService) {
        this.userService = userService;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x005a -> B:19:0x0081). Please report as a decompilation issue!!! */
    @Override // org.betup.services.navigate.NavigationService
    public void processNavigation(BaseActivity activity, NavigateMessage<NavigateMessage.TargetGame> navigateMessage) {
        Object obj;
        if (navigateMessage == null || !this.userService.isRegistered()) {
            return;
        }
        navigateMessage.getBundle();
        FragmentTransactionHelper.AnimationType animationType = FragmentTransactionHelper.AnimationType.SLIDE;
        if (navigateMessage.getTarget() instanceof NavigateMessage.TargetGame) {
            try {
                int i = AnonymousClass1.$SwitchMap$org$betup$bus$NavigateMessage$TargetGame[navigateMessage.getTarget().ordinal()];
                if (i == 1) {
                    obj = DiceFragment.INSTANCE.newInstance();
                } else if (i == 2) {
                    obj = HigherLowerGameFragment.INSTANCE.newInstance();
                } else if (i == 3) {
                    obj = WarGameFragment.INSTANCE.newInstance();
                } else if (i == 4) {
                    obj = LuckyCellsGameFragment.INSTANCE.newInstance();
                } else if (i == 5) {
                    obj = DoubleGameFragment.INSTANCE.newInstance();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (obj == null && activity.isVisible()) {
                if (obj instanceof BaseGameFragment) {
                    FragmentTransactionHelper.with(activity.getSupportFragmentManager()).commit((BaseGameFragment) obj, activity, animationType);
                    return;
                } else {
                    ((DialogFragment) obj).show(activity.getSupportFragmentManager(), (String) null);
                    return;
                }
            }
        }
        if (navigateMessage.getTarget() instanceof NavigateMessage.Target) {
            if (AnonymousClass1.$SwitchMap$org$betup$bus$NavigateMessage$Target[((NavigateMessage.Target) navigateMessage.getTarget()).ordinal()] == 1) {
                activity.startActivity(new Intent(activity, (Class<?>) MainActivity.class));
            }
        }
        obj = null;
        if (obj == null) {
        }
    }

    /* renamed from: org.betup.services.navigate.GamesNavigationService$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$bus$NavigateMessage$Target;
        static final /* synthetic */ int[] $SwitchMap$org$betup$bus$NavigateMessage$TargetGame;

        static {
            int[] iArr = new int[NavigateMessage.Target.values().length];
            $SwitchMap$org$betup$bus$NavigateMessage$Target = iArr;
            try {
                iArr[NavigateMessage.Target.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[NavigateMessage.TargetGame.values().length];
            $SwitchMap$org$betup$bus$NavigateMessage$TargetGame = iArr2;
            try {
                iArr2[NavigateMessage.TargetGame.DICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$TargetGame[NavigateMessage.TargetGame.HIGHER_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$TargetGame[NavigateMessage.TargetGame.WAR_GAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$TargetGame[NavigateMessage.TargetGame.LUCKY_CELLS.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$betup$bus$NavigateMessage$TargetGame[NavigateMessage.TargetGame.DOUBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }
}
