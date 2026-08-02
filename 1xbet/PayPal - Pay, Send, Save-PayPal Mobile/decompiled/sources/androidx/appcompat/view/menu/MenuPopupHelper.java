package androidx.appcompat.view.menu;

/* loaded from: classes3.dex */
public class MenuPopupHelper implements androidx.appcompat.view.menu.MenuHelper {
    private boolean Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private final android.content.Context getHighSpeedVideoFpsRanges;
    private final android.widget.PopupWindow.OnDismissListener getHighSpeedVideoFpsRangesFor;
    private android.view.View getHighSpeedVideoSizes;
    private final androidx.appcompat.view.menu.MenuBuilder getHighSpeedVideoSizesFor;
    private final boolean getInputFormats;
    private androidx.appcompat.view.menu.MenuPopup getInputSizeshNQ4ISI;
    private android.widget.PopupWindow.OnDismissListener getOutputFormats;
    private final int getOutputMinFrameDuration;
    private final int getOutputSizes;
    private androidx.appcompat.view.menu.MenuPresenter.Callback getOutputSizeshNQ4ISI;

    public MenuPopupHelper(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder) {
        this(context, menuBuilder, null, false, androidx.appcompat.R.attr.popupMenuStyle, 0);
    }

    public MenuPopupHelper(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.View view) {
        this(context, menuBuilder, view, false, androidx.appcompat.R.attr.popupMenuStyle, 0);
    }

    public MenuPopupHelper(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.View view, boolean z, int i) {
        this(context, menuBuilder, view, z, i, 0);
    }

    public MenuPopupHelper(android.content.Context context, androidx.appcompat.view.menu.MenuBuilder menuBuilder, android.view.View view, boolean z, int i, int i2) {
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.core.view.GravityCompat.START;
        this.getHighSpeedVideoFpsRangesFor = new android.widget.PopupWindow.OnDismissListener() { // from class: androidx.appcompat.view.menu.MenuPopupHelper.1
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                androidx.appcompat.view.menu.MenuPopupHelper.this.onDismiss();
            }
        };
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoSizesFor = menuBuilder;
        this.getHighSpeedVideoSizes = view;
        this.getInputFormats = z;
        this.getOutputMinFrameDuration = i;
        this.getOutputSizes = i2;
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.getOutputFormats = onDismissListener;
    }

    public void setAnchorView(android.view.View view) {
        this.getHighSpeedVideoSizes = view;
    }

    public void setForceShowIcon(boolean z) {
        this.Camera2StreamConfigurationMap = z;
        androidx.appcompat.view.menu.MenuPopup menuPopup = this.getInputSizeshNQ4ISI;
        if (menuPopup != null) {
            menuPopup.Camera2StreamConfigurationMap(z);
        }
    }

    public void setGravity(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public int getGravity() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void show() {
        if (!tryShow()) {
            throw new java.lang.IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void show(int i, int i2) {
        if (!tryShow(i, i2)) {
            throw new java.lang.IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public androidx.appcompat.view.menu.MenuPopup getPopup() {
        androidx.appcompat.view.menu.MenuPopup standardMenuPopup;
        if (this.getInputSizeshNQ4ISI == null) {
            android.view.Display defaultDisplay = ((android.view.WindowManager) this.getHighSpeedVideoFpsRanges.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME)).getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point();
            defaultDisplay.getRealSize(point);
            if (java.lang.Math.min(point.x, point.y) >= this.getHighSpeedVideoFpsRanges.getResources().getDimensionPixelSize(androidx.appcompat.R.dimen.abc_cascading_menus_min_smallest_width)) {
                standardMenuPopup = new androidx.appcompat.view.menu.CascadingMenuPopup(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, this.getOutputSizes, this.getInputFormats);
            } else {
                standardMenuPopup = new androidx.appcompat.view.menu.StandardMenuPopup(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, this.getOutputSizes, this.getInputFormats);
            }
            standardMenuPopup.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizesFor);
            standardMenuPopup.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor);
            standardMenuPopup.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes);
            standardMenuPopup.setCallback(this.getOutputSizeshNQ4ISI);
            standardMenuPopup.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap);
            standardMenuPopup.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI);
            this.getInputSizeshNQ4ISI = standardMenuPopup;
        }
        return this.getInputSizeshNQ4ISI;
    }

    public boolean tryShow() {
        if (isShowing()) {
            return true;
        }
        if (this.getHighSpeedVideoSizes == null) {
            return false;
        }
        getHighSpeedVideoSizes(0, 0, false, false);
        return true;
    }

    public boolean tryShow(int i, int i2) {
        if (isShowing()) {
            return true;
        }
        if (this.getHighSpeedVideoSizes == null) {
            return false;
        }
        getHighSpeedVideoSizes(i, i2, true, true);
        return true;
    }

    private void getHighSpeedVideoSizes(int i, int i2, boolean z, boolean z2) {
        androidx.appcompat.view.menu.MenuPopup popup = getPopup();
        popup.getHighResolutionOutputSizeshNQ4ISI(z2);
        if (z) {
            if ((androidx.core.view.GravityCompat.getAbsoluteGravity(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes.getLayoutDirection()) & 7) == 5) {
                i -= this.getHighSpeedVideoSizes.getWidth();
            }
            popup.getHighSpeedVideoSizes(i);
            popup.getHighSpeedVideoFpsRanges(i2);
            int i3 = (int) ((this.getHighSpeedVideoFpsRanges.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            popup.getInputSizeshNQ4ISI = new android.graphics.Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        popup.show();
    }

    public void dismiss() {
        if (isShowing()) {
            this.getInputSizeshNQ4ISI.dismiss();
        }
    }

    public void onDismiss() {
        this.getInputSizeshNQ4ISI = null;
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.getOutputFormats;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean isShowing() {
        androidx.appcompat.view.menu.MenuPopup menuPopup = this.getInputSizeshNQ4ISI;
        return menuPopup != null && menuPopup.isShowing();
    }

    public void setPresenterCallback(androidx.appcompat.view.menu.MenuPresenter.Callback callback) {
        this.getOutputSizeshNQ4ISI = callback;
        androidx.appcompat.view.menu.MenuPopup menuPopup = this.getInputSizeshNQ4ISI;
        if (menuPopup != null) {
            menuPopup.setCallback(callback);
        }
    }

    public android.widget.ListView getListView() {
        return getPopup().getListView();
    }
}
