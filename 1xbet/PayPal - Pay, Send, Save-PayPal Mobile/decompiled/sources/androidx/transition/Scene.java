package androidx.transition;

/* loaded from: classes3.dex */
public class Scene {
    private java.lang.Runnable Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    private android.content.Context getHighSpeedVideoFpsRanges;
    private java.lang.Runnable getHighSpeedVideoFpsRangesFor;
    private android.view.View getHighSpeedVideoSizes;
    private android.view.ViewGroup getInputFormats;

    public static androidx.transition.Scene getSceneForLayout(android.view.ViewGroup viewGroup, int i, android.content.Context context) {
        android.util.SparseArray sparseArray = (android.util.SparseArray) viewGroup.getTag(androidx.transition.R.id.transition_scene_layoutid_cache);
        if (sparseArray == null) {
            sparseArray = new android.util.SparseArray();
            viewGroup.setTag(androidx.transition.R.id.transition_scene_layoutid_cache, sparseArray);
        }
        androidx.transition.Scene scene = (androidx.transition.Scene) sparseArray.get(i);
        if (scene != null) {
            return scene;
        }
        androidx.transition.Scene scene2 = new androidx.transition.Scene(viewGroup, i, context);
        sparseArray.put(i, scene2);
        return scene2;
    }

    public Scene(android.view.ViewGroup viewGroup) {
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
        this.getInputFormats = viewGroup;
    }

    private Scene(android.view.ViewGroup viewGroup, int i, android.content.Context context) {
        this.getHighSpeedVideoFpsRanges = context;
        this.getInputFormats = viewGroup;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public Scene(android.view.ViewGroup viewGroup, android.view.View view) {
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
        this.getInputFormats = viewGroup;
        this.getHighSpeedVideoSizes = view;
    }

    public android.view.ViewGroup getSceneRoot() {
        return this.getInputFormats;
    }

    public void exit() {
        java.lang.Runnable runnable;
        if (getCurrentScene(this.getInputFormats) != this || (runnable = this.Camera2StreamConfigurationMap) == null) {
            return;
        }
        runnable.run();
    }

    public void enter() {
        if (this.getHighResolutionOutputSizeshNQ4ISI > 0 || this.getHighSpeedVideoSizes != null) {
            getSceneRoot().removeAllViews();
            if (this.getHighResolutionOutputSizeshNQ4ISI > 0) {
                android.view.LayoutInflater.from(this.getHighSpeedVideoFpsRanges).inflate(this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats);
            } else {
                this.getInputFormats.addView(this.getHighSpeedVideoSizes);
            }
        }
        java.lang.Runnable runnable = this.getHighSpeedVideoFpsRangesFor;
        if (runnable != null) {
            runnable.run();
        }
        this.getInputFormats.setTag(androidx.transition.R.id.transition_current_scene, this);
    }

    static void getHighSpeedVideoSizes(android.view.ViewGroup viewGroup, androidx.transition.Scene scene) {
        viewGroup.setTag(androidx.transition.R.id.transition_current_scene, null);
    }

    public static androidx.transition.Scene getCurrentScene(android.view.ViewGroup viewGroup) {
        return (androidx.transition.Scene) viewGroup.getTag(androidx.transition.R.id.transition_current_scene);
    }

    public void setEnterAction(java.lang.Runnable runnable) {
        this.getHighSpeedVideoFpsRangesFor = runnable;
    }

    public void setExitAction(java.lang.Runnable runnable) {
        this.Camera2StreamConfigurationMap = runnable;
    }
}
