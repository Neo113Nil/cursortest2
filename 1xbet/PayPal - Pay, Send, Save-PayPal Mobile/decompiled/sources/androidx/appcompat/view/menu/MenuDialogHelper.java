package androidx.appcompat.view.menu;

/* loaded from: classes3.dex */
class MenuDialogHelper implements android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, androidx.appcompat.view.menu.MenuPresenter.Callback {
    androidx.appcompat.view.menu.MenuBuilder Camera2StreamConfigurationMap;
    androidx.appcompat.app.AlertDialog getHighSpeedVideoFpsRanges;
    private androidx.appcompat.view.menu.MenuPresenter.Callback getHighSpeedVideoFpsRangesFor;
    androidx.appcompat.view.menu.ListMenuPresenter getHighSpeedVideoSizes;

    public MenuDialogHelper(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        this.Camera2StreamConfigurationMap = menuBuilder;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface dialogInterface, int i, android.view.KeyEvent keyEvent) {
        android.view.Window window;
        android.view.View decorView;
        android.view.KeyEvent.DispatcherState keyDispatcherState;
        android.view.View decorView2;
        android.view.KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                android.view.Window window2 = this.getHighSpeedVideoFpsRanges.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.getHighSpeedVideoFpsRanges.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.Camera2StreamConfigurationMap.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.Camera2StreamConfigurationMap.performShortcut(i, keyEvent, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.getHighSpeedVideoSizes.onCloseMenu(this.Camera2StreamConfigurationMap, true);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder, boolean z) {
        androidx.appcompat.app.AlertDialog alertDialog;
        if ((z || menuBuilder == this.Camera2StreamConfigurationMap) && (alertDialog = this.getHighSpeedVideoFpsRanges) != null) {
            alertDialog.dismiss();
        }
        androidx.appcompat.view.menu.MenuPresenter.Callback callback = this.getHighSpeedVideoFpsRangesFor;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public boolean onOpenSubMenu(androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        androidx.appcompat.view.menu.MenuPresenter.Callback callback = this.getHighSpeedVideoFpsRangesFor;
        if (callback != null) {
            return callback.onOpenSubMenu(menuBuilder);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i) {
        this.Camera2StreamConfigurationMap.performItemAction((androidx.appcompat.view.menu.MenuItemImpl) this.getHighSpeedVideoSizes.getAdapter().getItem(i), 0);
    }
}
