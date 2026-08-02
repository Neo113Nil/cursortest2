package androidx.transition;

/* loaded from: classes7.dex */
class GhostViewHolder extends android.widget.FrameLayout {
    android.view.ViewGroup getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;

    GhostViewHolder(android.view.ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.getHighSpeedVideoFpsRangesFor = viewGroup;
        viewGroup.setTag(androidx.transition.R.id.ghost_view_holder, this);
        androidx.core.view.ViewCompat.addOverlayView(this.getHighSpeedVideoFpsRangesFor, this);
        this.getHighSpeedVideoSizes = true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        if (!this.getHighSpeedVideoSizes) {
            throw new java.lang.IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.getHighSpeedVideoFpsRangesFor.setTag(androidx.transition.R.id.ghost_view_holder, null);
            this.getHighSpeedVideoFpsRangesFor.getOverlay().remove(this);
            this.getHighSpeedVideoSizes = false;
        }
    }

    static androidx.transition.GhostViewHolder Camera2StreamConfigurationMap(android.view.ViewGroup viewGroup) {
        return (androidx.transition.GhostViewHolder) viewGroup.getTag(androidx.transition.R.id.ghost_view_holder);
    }

    static void getHighSpeedVideoSizes(android.view.View view, java.util.ArrayList<android.view.View> arrayList) {
        java.lang.Object parent = view.getParent();
        if (parent instanceof android.view.ViewGroup) {
            getHighSpeedVideoSizes((android.view.View) parent, arrayList);
        }
        arrayList.add(view);
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static float getHighSpeedVideoFpsRangesFor(android.view.View view) {
            return view.getZ();
        }
    }
}
