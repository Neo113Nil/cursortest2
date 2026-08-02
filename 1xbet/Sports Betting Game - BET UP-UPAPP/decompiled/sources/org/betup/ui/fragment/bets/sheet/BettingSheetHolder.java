package org.betup.ui.fragment.bets.sheet;

import android.util.Log;
import org.betup.services.user.UserService;
import org.betup.ui.MainActivity;

/* loaded from: classes4.dex */
public class BettingSheetHolder {
    private final MainActivity activity;
    private BettingSheetDialog dialog;
    private final UserService userService;

    public BettingSheetHolder(MainActivity activity, UserService userService) {
        this.activity = activity;
        this.userService = userService;
    }

    public void prepareDialog() {
        if (this.dialog == null) {
            createDialog();
        }
    }

    private void createDialog() {
        this.dialog = new BettingSheetDialog();
    }

    public void show() {
        if (this.dialog == null) {
            createDialog();
        }
        Log.d("BOTTOM", "SHOWING..." + (this.dialog == null));
        this.dialog.show(this.activity.getSupportFragmentManager(), "BettingSheetDialog");
    }
}
