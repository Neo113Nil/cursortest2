package androidx.fragment.app;

/* loaded from: classes3.dex */
public class FragmentController {
    private final androidx.fragment.app.FragmentHostCallback<?> getHighSpeedVideoSizes;

    @java.lang.Deprecated
    public void dispatchReallyStop() {
    }

    @java.lang.Deprecated
    public void doLoaderDestroy() {
    }

    @java.lang.Deprecated
    public void doLoaderRetain() {
    }

    @java.lang.Deprecated
    public void doLoaderStart() {
    }

    @java.lang.Deprecated
    public void doLoaderStop(boolean z) {
    }

    @java.lang.Deprecated
    public void dumpLoaders(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
    }

    @java.lang.Deprecated
    public void reportLoaderStart() {
    }

    @java.lang.Deprecated
    public void restoreLoaderNonConfig(androidx.collection.SimpleArrayMap<java.lang.String, androidx.loader.app.LoaderManager> simpleArrayMap) {
    }

    @java.lang.Deprecated
    public androidx.collection.SimpleArrayMap<java.lang.String, androidx.loader.app.LoaderManager> retainLoaderNonConfig() {
        return null;
    }

    public static androidx.fragment.app.FragmentController createController(androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback) {
        return new androidx.fragment.app.FragmentController((androidx.fragment.app.FragmentHostCallback) androidx.core.util.Preconditions.checkNotNull(fragmentHostCallback, "callbacks == null"));
    }

    private FragmentController(androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback) {
        this.getHighSpeedVideoSizes = fragmentHostCallback;
    }

    public androidx.fragment.app.FragmentManager getSupportFragmentManager() {
        return this.getHighSpeedVideoSizes.getFragmentManager();
    }

    @java.lang.Deprecated
    public androidx.loader.app.LoaderManager getSupportLoaderManager() {
        throw new java.lang.UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    public androidx.fragment.app.Fragment findFragmentByWho(java.lang.String str) {
        return this.getHighSpeedVideoSizes.getFragmentManager().getInputFormats.getHighSpeedVideoFpsRanges(str);
    }

    public int getActiveFragmentsCount() {
        return this.getHighSpeedVideoSizes.getFragmentManager().getInputFormats.getHighResolutionOutputSizeshNQ4ISI.size();
    }

    public java.util.List<androidx.fragment.app.Fragment> getActiveFragments(java.util.List<androidx.fragment.app.Fragment> list) {
        return this.getHighSpeedVideoSizes.getFragmentManager().getInputFormats.getHighResolutionOutputSizeshNQ4ISI();
    }

    public void attachHost(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.FragmentManager fragmentManager = this.getHighSpeedVideoSizes.getFragmentManager();
        androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback = this.getHighSpeedVideoSizes;
        fragmentManager.getHighSpeedVideoFpsRangesFor(fragmentHostCallback, fragmentHostCallback, fragment);
    }

    public android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return this.getHighSpeedVideoSizes.getFragmentManager().isOutputSupportedFor().onCreateView(view, str, context, attributeSet);
    }

    public void noteStateNotSaved() {
        this.getHighSpeedVideoSizes.getFragmentManager().ArtificialStackFrames();
    }

    @java.lang.Deprecated
    public android.os.Parcelable saveAllState() {
        androidx.fragment.app.FragmentManager fragmentManager = this.getHighSpeedVideoSizes.getFragmentManager();
        if (fragmentManager.getHighSpeedVideoSizesFor instanceof androidx.view.SavedStateRegistryOwner) {
            fragmentManager.getHighSpeedVideoFpsRangesFor(new java.lang.IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        android.os.Bundle CoroutineDebuggingKt = fragmentManager.CoroutineDebuggingKt();
        if (CoroutineDebuggingKt.isEmpty()) {
            return null;
        }
        return CoroutineDebuggingKt;
    }

    @java.lang.Deprecated
    public void restoreAllState(android.os.Parcelable parcelable, java.util.List<androidx.fragment.app.Fragment> list) {
        this.getHighSpeedVideoSizes.getFragmentManager().Camera2StreamConfigurationMap(parcelable, new androidx.fragment.app.FragmentManagerNonConfig(list, null, null));
    }

    @java.lang.Deprecated
    public void restoreAllState(android.os.Parcelable parcelable, androidx.fragment.app.FragmentManagerNonConfig fragmentManagerNonConfig) {
        this.getHighSpeedVideoSizes.getFragmentManager().Camera2StreamConfigurationMap(parcelable, fragmentManagerNonConfig);
    }

    @java.lang.Deprecated
    public void restoreSaveState(android.os.Parcelable parcelable) {
        androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback = this.getHighSpeedVideoSizes;
        if (!(fragmentHostCallback instanceof androidx.view.ViewModelStoreOwner)) {
            throw new java.lang.IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        androidx.fragment.app.FragmentManager fragmentManager = fragmentHostCallback.getFragmentManager();
        if (fragmentManager.getHighSpeedVideoSizesFor instanceof androidx.view.SavedStateRegistryOwner) {
            fragmentManager.getHighSpeedVideoFpsRangesFor(new java.lang.IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        fragmentManager.Camera2StreamConfigurationMap(parcelable);
    }

    @java.lang.Deprecated
    public java.util.List<androidx.fragment.app.Fragment> retainNonConfig() {
        androidx.fragment.app.FragmentManagerNonConfig coroutineCreation = this.getHighSpeedVideoSizes.getFragmentManager().coroutineCreation();
        if (coroutineCreation == null || coroutineCreation.getHighSpeedVideoFpsRangesFor == null) {
            return null;
        }
        return new java.util.ArrayList(coroutineCreation.getHighSpeedVideoFpsRangesFor);
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentManagerNonConfig retainNestedNonConfig() {
        return this.getHighSpeedVideoSizes.getFragmentManager().coroutineCreation();
    }

    public void dispatchCreate() {
        this.getHighSpeedVideoSizes.getFragmentManager().getHighSpeedVideoFpsRangesFor();
    }

    public void dispatchActivityCreated() {
        this.getHighSpeedVideoSizes.getFragmentManager().getHighResolutionOutputSizeshNQ4ISI();
    }

    public void dispatchStart() {
        this.getHighSpeedVideoSizes.getFragmentManager().getOutputSizeshNQ4ISI();
    }

    public void dispatchResume() {
        this.getHighSpeedVideoSizes.getFragmentManager().getOutputStallDuration();
    }

    public void dispatchPause() {
        this.getHighSpeedVideoSizes.getFragmentManager().getHighSpeedVideoSizesFor();
    }

    public void dispatchStop() {
        this.getHighSpeedVideoSizes.getFragmentManager().getOutputMinFrameDurationlomOqCM();
    }

    public void dispatchDestroyView() {
        this.getHighSpeedVideoSizes.getFragmentManager().getOutputMinFrameDuration();
    }

    public void dispatchDestroy() {
        this.getHighSpeedVideoSizes.getFragmentManager().getInputSizeshNQ4ISI();
    }

    @java.lang.Deprecated
    public void dispatchMultiWindowModeChanged(boolean z) {
        this.getHighSpeedVideoSizes.getFragmentManager().getHighSpeedVideoFpsRanges(z, true);
    }

    @java.lang.Deprecated
    public void dispatchPictureInPictureModeChanged(boolean z) {
        this.getHighSpeedVideoSizes.getFragmentManager().getHighResolutionOutputSizeshNQ4ISI(z, true);
    }

    @java.lang.Deprecated
    public void dispatchConfigurationChanged(android.content.res.Configuration configuration) {
        this.getHighSpeedVideoSizes.getFragmentManager().getHighSpeedVideoSizes(configuration, true);
    }

    @java.lang.Deprecated
    public void dispatchLowMemory() {
        this.getHighSpeedVideoSizes.getFragmentManager().getHighSpeedVideoFpsRangesFor(true);
    }

    @java.lang.Deprecated
    public boolean dispatchCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        return this.getHighSpeedVideoSizes.getFragmentManager().getHighSpeedVideoFpsRanges(menu, menuInflater);
    }

    @java.lang.Deprecated
    public boolean dispatchPrepareOptionsMenu(android.view.Menu menu) {
        return this.getHighSpeedVideoSizes.getFragmentManager().getHighSpeedVideoFpsRangesFor(menu);
    }

    @java.lang.Deprecated
    public boolean dispatchOptionsItemSelected(android.view.MenuItem menuItem) {
        return this.getHighSpeedVideoSizes.getFragmentManager().Camera2StreamConfigurationMap(menuItem);
    }

    public boolean dispatchContextItemSelected(android.view.MenuItem menuItem) {
        return this.getHighSpeedVideoSizes.getFragmentManager().getHighResolutionOutputSizeshNQ4ISI(menuItem);
    }

    @java.lang.Deprecated
    public void dispatchOptionsMenuClosed(android.view.Menu menu) {
        this.getHighSpeedVideoSizes.getFragmentManager().Camera2StreamConfigurationMap(menu);
    }

    public boolean execPendingActions() {
        return this.getHighSpeedVideoSizes.getFragmentManager().getHighResolutionOutputSizeshNQ4ISI(true);
    }
}
