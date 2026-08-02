package androidx.appcompat.widget;

/* loaded from: classes5.dex */
public class PopupMenu {
    private final android.content.Context Camera2StreamConfigurationMap;
    final androidx.appcompat.view.menu.MenuPopupHelper getHighResolutionOutputSizeshNQ4ISI;
    androidx.appcompat.widget.PopupMenu.OnDismissListener getHighSpeedVideoFpsRanges;
    private final android.view.View getHighSpeedVideoFpsRangesFor;
    androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener getHighSpeedVideoSizes;
    private final androidx.appcompat.view.menu.MenuBuilder getInputFormats;
    private android.view.View.OnTouchListener getOutputFormats;

    public interface OnDismissListener {
        void onDismiss(androidx.appcompat.widget.PopupMenu popupMenu);
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(android.view.MenuItem menuItem);
    }

    public PopupMenu(android.content.Context context, android.view.View view) {
        this(context, view, 0);
    }

    public PopupMenu(android.content.Context context, android.view.View view, int i) {
        this(context, view, i, androidx.appcompat.R.attr.popupMenuStyle, 0);
    }

    public PopupMenu(android.content.Context context, android.view.View view, int i, int i2, int i3) {
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoFpsRangesFor = view;
        androidx.appcompat.view.menu.MenuBuilder menuBuilder = new androidx.appcompat.view.menu.MenuBuilder(context);
        this.getInputFormats = menuBuilder;
        menuBuilder.setCallback(new androidx.appcompat.view.menu.MenuBuilder.Callback() { // from class: androidx.appcompat.widget.PopupMenu.1
            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder menuBuilder2) {
            }

            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder menuBuilder2, android.view.MenuItem menuItem) {
                if (androidx.appcompat.widget.PopupMenu.this.getHighSpeedVideoSizes != null) {
                    return androidx.appcompat.widget.PopupMenu.this.getHighSpeedVideoSizes.onMenuItemClick(menuItem);
                }
                return false;
            }
        });
        androidx.appcompat.view.menu.MenuPopupHelper menuPopupHelper = new androidx.appcompat.view.menu.MenuPopupHelper(context, menuBuilder, view, false, i2, i3);
        this.getHighResolutionOutputSizeshNQ4ISI = menuPopupHelper;
        menuPopupHelper.setGravity(i);
        menuPopupHelper.setOnDismissListener(new android.widget.PopupWindow.OnDismissListener() { // from class: androidx.appcompat.widget.PopupMenu.2
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                if (androidx.appcompat.widget.PopupMenu.this.getHighSpeedVideoFpsRanges != null) {
                    androidx.appcompat.widget.PopupMenu.this.getHighSpeedVideoFpsRanges.onDismiss(androidx.appcompat.widget.PopupMenu.this);
                }
            }
        });
    }

    public void setGravity(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI.setGravity(i);
    }

    public int getGravity() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getGravity();
    }

    public android.view.View.OnTouchListener getDragToOpenListener() {
        if (this.getOutputFormats == null) {
            this.getOutputFormats = new androidx.appcompat.widget.ForwardingListener(this.getHighSpeedVideoFpsRangesFor) { // from class: androidx.appcompat.widget.PopupMenu.3
                @Override // androidx.appcompat.widget.ForwardingListener
                protected boolean onForwardingStarted() {
                    androidx.appcompat.widget.PopupMenu.this.show();
                    return true;
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                protected boolean onForwardingStopped() {
                    androidx.appcompat.widget.PopupMenu.this.dismiss();
                    return true;
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public androidx.appcompat.view.menu.ShowableListMenu getPopup() {
                    return androidx.appcompat.widget.PopupMenu.this.getHighResolutionOutputSizeshNQ4ISI.getPopup();
                }
            };
        }
        return this.getOutputFormats;
    }

    public android.view.Menu getMenu() {
        return this.getInputFormats;
    }

    public android.view.MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.SupportMenuInflater(this.Camera2StreamConfigurationMap);
    }

    public void inflate(int i) {
        getMenuInflater().inflate(i, this.getInputFormats);
    }

    public void show() {
        this.getHighResolutionOutputSizeshNQ4ISI.show();
    }

    public void dismiss() {
        this.getHighResolutionOutputSizeshNQ4ISI.dismiss();
    }

    public void setOnMenuItemClickListener(androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener onMenuItemClickListener) {
        this.getHighSpeedVideoSizes = onMenuItemClickListener;
    }

    public void setOnDismissListener(androidx.appcompat.widget.PopupMenu.OnDismissListener onDismissListener) {
        this.getHighSpeedVideoFpsRanges = onDismissListener;
    }

    public void setForceShowIcon(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI.setForceShowIcon(z);
    }
}
