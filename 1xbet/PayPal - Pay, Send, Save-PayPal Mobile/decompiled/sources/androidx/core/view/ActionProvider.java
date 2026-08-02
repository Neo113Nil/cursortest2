package androidx.core.view;

/* loaded from: classes3.dex */
public abstract class ActionProvider {
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    private androidx.core.view.ActionProvider.VisibilityListener getHighSpeedVideoFpsRangesFor;
    private androidx.core.view.ActionProvider.SubUiVisibilityListener getHighSpeedVideoSizes;

    public interface SubUiVisibilityListener {
        void onSubUiVisibilityChanged(boolean z);
    }

    public interface VisibilityListener {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    public abstract android.view.View onCreateActionView();

    public boolean onPerformDefaultAction() {
        return false;
    }

    public void onPrepareSubMenu(android.view.SubMenu subMenu) {
    }

    public boolean overridesItemVisibility() {
        return false;
    }

    public ActionProvider(android.content.Context context) {
        this.getHighResolutionOutputSizeshNQ4ISI = context;
    }

    public android.content.Context getContext() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public android.view.View onCreateActionView(android.view.MenuItem menuItem) {
        return onCreateActionView();
    }

    public void refreshVisibility() {
        if (this.getHighSpeedVideoFpsRangesFor == null || !overridesItemVisibility()) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.onActionProviderVisibilityChanged(isVisible());
    }

    public void subUiVisibilityChanged(boolean z) {
        androidx.core.view.ActionProvider.SubUiVisibilityListener subUiVisibilityListener = this.getHighSpeedVideoSizes;
        if (subUiVisibilityListener != null) {
            subUiVisibilityListener.onSubUiVisibilityChanged(z);
        }
    }

    public void setSubUiVisibilityListener(androidx.core.view.ActionProvider.SubUiVisibilityListener subUiVisibilityListener) {
        this.getHighSpeedVideoSizes = subUiVisibilityListener;
    }

    public void setVisibilityListener(androidx.core.view.ActionProvider.VisibilityListener visibilityListener) {
        this.getHighSpeedVideoFpsRangesFor = visibilityListener;
    }

    public void reset() {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoSizes = null;
    }
}
