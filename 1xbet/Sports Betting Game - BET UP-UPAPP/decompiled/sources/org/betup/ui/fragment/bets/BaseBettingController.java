package org.betup.ui.fragment.bets;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import org.betup.services.user.UserService;
import org.betup.ui.ProgressDisplay;

/* loaded from: classes4.dex */
public abstract class BaseBettingController {
    protected final AppCompatActivity activity;
    protected final FragmentCallback fragmentCallback;
    protected final ProgressDisplay progressDisplay;
    protected final View rootView;
    protected final UserService userService;

    public interface BettingUICallback {
        boolean canPlaceBet();
    }

    public interface FragmentCallback {
        boolean isActive();
    }

    public abstract void init();

    public abstract void unbind();

    public BaseBettingController(AppCompatActivity activity, UserService userService, FragmentCallback fragmentCallback, ProgressDisplay progressDisplay, View rootView) {
        this.fragmentCallback = fragmentCallback;
        this.activity = activity;
        this.userService = userService;
        this.progressDisplay = progressDisplay;
        this.rootView = rootView;
    }
}
