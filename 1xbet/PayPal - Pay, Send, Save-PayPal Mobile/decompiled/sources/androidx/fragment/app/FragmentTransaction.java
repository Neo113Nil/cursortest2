package androidx.fragment.app;

/* loaded from: classes.dex */
public abstract class FragmentTransaction {
    public static final int TRANSIT_ENTER_MASK = 4096;
    public static final int TRANSIT_EXIT_MASK = 8192;
    public static final int TRANSIT_FRAGMENT_CLOSE = 8194;
    public static final int TRANSIT_FRAGMENT_FADE = 4099;
    public static final int TRANSIT_FRAGMENT_MATCH_ACTIVITY_CLOSE = 8197;
    public static final int TRANSIT_FRAGMENT_MATCH_ACTIVITY_OPEN = 4100;
    public static final int TRANSIT_FRAGMENT_OPEN = 4097;
    public static final int TRANSIT_NONE = 0;
    public static final int TRANSIT_UNSET = -1;
    int ArtificialStackFrames;
    boolean Camera2StreamConfigurationMap;
    private final java.lang.ClassLoader getHighSpeedVideoFpsRanges;
    private final androidx.fragment.app.FragmentFactory getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    boolean getInputFormats;
    java.lang.CharSequence getInputSizeshNQ4ISI;
    java.lang.CharSequence getOutputFormats;
    int getOutputMinFrameDuration;
    java.util.ArrayList<java.lang.Runnable> getOutputMinFrameDurationlomOqCM;
    java.lang.String getOutputSizes;
    java.util.ArrayList<androidx.fragment.app.FragmentTransaction.Op> getOutputSizeshNQ4ISI;
    int getOutputStallDuration;
    int getOutputStallDurationlomOqCM;
    int getValidOutputFormatsForInputhNQ4ISI;
    boolean isOutputSupportedFor;
    java.util.ArrayList<java.lang.String> isOutputSupportedForhNQ4ISI;
    int toString;
    java.util.ArrayList<java.lang.String> unwrapAs;

    public abstract int commit();

    public abstract int commitAllowingStateLoss();

    public abstract void commitNow();

    public abstract void commitNowAllowingStateLoss();

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setTransitionStyle(int i) {
        return this;
    }

    /* loaded from: classes3.dex */
    static final class Op {
        int Camera2StreamConfigurationMap;
        androidx.lifecycle.Lifecycle.State getHighResolutionOutputSizeshNQ4ISI;
        androidx.fragment.app.Fragment getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;
        boolean getHighSpeedVideoSizesFor;
        int getInputFormats;
        androidx.lifecycle.Lifecycle.State getOutputFormats;
        int getOutputMinFrameDuration;

        Op() {
        }

        Op(int i, androidx.fragment.app.Fragment fragment) {
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoFpsRanges = fragment;
            this.getHighSpeedVideoSizesFor = false;
            this.getOutputFormats = androidx.lifecycle.Lifecycle.State.RESUMED;
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.lifecycle.Lifecycle.State.RESUMED;
        }

        Op(int i, androidx.fragment.app.Fragment fragment, byte b) {
            this.Camera2StreamConfigurationMap = i;
            this.getHighSpeedVideoFpsRanges = fragment;
            this.getHighSpeedVideoSizesFor = true;
            this.getOutputFormats = androidx.lifecycle.Lifecycle.State.RESUMED;
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.lifecycle.Lifecycle.State.RESUMED;
        }

        Op(androidx.fragment.app.Fragment fragment, androidx.lifecycle.Lifecycle.State state) {
            this.Camera2StreamConfigurationMap = 10;
            this.getHighSpeedVideoFpsRanges = fragment;
            this.getHighSpeedVideoSizesFor = false;
            this.getOutputFormats = fragment.mMaxState;
            this.getHighResolutionOutputSizeshNQ4ISI = state;
        }

        Op(androidx.fragment.app.FragmentTransaction.Op op) {
            this.Camera2StreamConfigurationMap = op.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = op.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizesFor = op.getHighSpeedVideoSizesFor;
            this.getHighSpeedVideoFpsRangesFor = op.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = op.getHighSpeedVideoSizes;
            this.getOutputMinFrameDuration = op.getOutputMinFrameDuration;
            this.getInputFormats = op.getInputFormats;
            this.getOutputFormats = op.getOutputFormats;
            this.getHighResolutionOutputSizeshNQ4ISI = op.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    @java.lang.Deprecated
    public FragmentTransaction() {
        this.getOutputSizeshNQ4ISI = new java.util.ArrayList<>();
        this.getInputFormats = true;
        this.isOutputSupportedFor = false;
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRanges = null;
    }

    FragmentTransaction(androidx.fragment.app.FragmentFactory fragmentFactory, java.lang.ClassLoader classLoader) {
        this.getOutputSizeshNQ4ISI = new java.util.ArrayList<>();
        this.getInputFormats = true;
        this.isOutputSupportedFor = false;
        this.getHighSpeedVideoSizes = fragmentFactory;
        this.getHighSpeedVideoFpsRanges = classLoader;
    }

    FragmentTransaction(androidx.fragment.app.FragmentFactory fragmentFactory, java.lang.ClassLoader classLoader, androidx.fragment.app.FragmentTransaction fragmentTransaction) {
        this(fragmentFactory, classLoader);
        java.util.Iterator<androidx.fragment.app.FragmentTransaction.Op> it = fragmentTransaction.getOutputSizeshNQ4ISI.iterator();
        while (it.hasNext()) {
            this.getOutputSizeshNQ4ISI.add(new androidx.fragment.app.FragmentTransaction.Op(it.next()));
        }
        this.getOutputStallDurationlomOqCM = fragmentTransaction.getOutputStallDurationlomOqCM;
        this.getOutputStallDuration = fragmentTransaction.getOutputStallDuration;
        this.getValidOutputFormatsForInputhNQ4ISI = fragmentTransaction.getValidOutputFormatsForInputhNQ4ISI;
        this.toString = fragmentTransaction.toString;
        this.ArtificialStackFrames = fragmentTransaction.ArtificialStackFrames;
        this.Camera2StreamConfigurationMap = fragmentTransaction.Camera2StreamConfigurationMap;
        this.getInputFormats = fragmentTransaction.getInputFormats;
        this.getOutputSizes = fragmentTransaction.getOutputSizes;
        this.getHighSpeedVideoSizesFor = fragmentTransaction.getHighSpeedVideoSizesFor;
        this.getOutputFormats = fragmentTransaction.getOutputFormats;
        this.getOutputMinFrameDuration = fragmentTransaction.getOutputMinFrameDuration;
        this.getInputSizeshNQ4ISI = fragmentTransaction.getInputSizeshNQ4ISI;
        if (fragmentTransaction.unwrapAs != null) {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            this.unwrapAs = arrayList;
            arrayList.addAll(fragmentTransaction.unwrapAs);
        }
        if (fragmentTransaction.isOutputSupportedForhNQ4ISI != null) {
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
            this.isOutputSupportedForhNQ4ISI = arrayList2;
            arrayList2.addAll(fragmentTransaction.isOutputSupportedForhNQ4ISI);
        }
        this.isOutputSupportedFor = fragmentTransaction.isOutputSupportedFor;
    }

    final void Camera2StreamConfigurationMap(androidx.fragment.app.FragmentTransaction.Op op) {
        this.getOutputSizeshNQ4ISI.add(op);
        op.getHighSpeedVideoFpsRangesFor = this.getOutputStallDurationlomOqCM;
        op.getHighSpeedVideoSizes = this.getOutputStallDuration;
        op.getOutputMinFrameDuration = this.getValidOutputFormatsForInputhNQ4ISI;
        op.getInputFormats = this.toString;
    }

    private androidx.fragment.app.Fragment getHighSpeedVideoFpsRanges(java.lang.Class<? extends androidx.fragment.app.Fragment> cls, android.os.Bundle bundle) {
        androidx.fragment.app.FragmentFactory fragmentFactory = this.getHighSpeedVideoSizes;
        if (fragmentFactory == null) {
            throw new java.lang.IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        java.lang.ClassLoader classLoader = this.getHighSpeedVideoFpsRanges;
        if (classLoader == null) {
            throw new java.lang.IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        androidx.fragment.app.Fragment instantiate = fragmentFactory.instantiate(classLoader, cls.getName());
        if (bundle != null) {
            instantiate.setArguments(bundle);
        }
        return instantiate;
    }

    public final androidx.fragment.app.FragmentTransaction add(java.lang.Class<? extends androidx.fragment.app.Fragment> cls, android.os.Bundle bundle, java.lang.String str) {
        return add(getHighSpeedVideoFpsRanges(cls, bundle), str);
    }

    public androidx.fragment.app.FragmentTransaction add(androidx.fragment.app.Fragment fragment, java.lang.String str) {
        getHighSpeedVideoFpsRanges(0, fragment, str, 1);
        return this;
    }

    public final androidx.fragment.app.FragmentTransaction add(int i, java.lang.Class<? extends androidx.fragment.app.Fragment> cls, android.os.Bundle bundle) {
        return add(i, getHighSpeedVideoFpsRanges(cls, bundle));
    }

    public androidx.fragment.app.FragmentTransaction add(int i, androidx.fragment.app.Fragment fragment) {
        getHighSpeedVideoFpsRanges(i, fragment, null, 1);
        return this;
    }

    public final androidx.fragment.app.FragmentTransaction add(int i, java.lang.Class<? extends androidx.fragment.app.Fragment> cls, android.os.Bundle bundle, java.lang.String str) {
        return add(i, getHighSpeedVideoFpsRanges(cls, bundle), str);
    }

    public androidx.fragment.app.FragmentTransaction add(int i, androidx.fragment.app.Fragment fragment, java.lang.String str) {
        getHighSpeedVideoFpsRanges(i, fragment, str, 1);
        return this;
    }

    public final androidx.fragment.app.FragmentTransaction add(android.view.ViewGroup viewGroup, androidx.fragment.app.Fragment fragment, java.lang.String str) {
        fragment.mContainer = viewGroup;
        fragment.mInDynamicContainer = true;
        return add(viewGroup.getId(), fragment, str);
    }

    void getHighSpeedVideoFpsRanges(int i, androidx.fragment.app.Fragment fragment, java.lang.String str, int i2) {
        if (fragment.mPreviousWho != null) {
            androidx.fragment.app.strictmode.FragmentStrictMode.onFragmentReuse(fragment, fragment.mPreviousWho);
        }
        java.lang.Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !java.lang.reflect.Modifier.isPublic(modifiers) || (cls.isMemberClass() && !java.lang.reflect.Modifier.isStatic(modifiers))) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Fragment ");
            sb.append(cls.getCanonicalName());
            sb.append(" must be a public static class to be  properly recreated from instance state.");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (str != null) {
            if (fragment.mTag != null && !str.equals(fragment.mTag)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                sb2.append(fragment.mTag);
                sb2.append(" now ");
                sb2.append(str);
                throw new java.lang.IllegalStateException(sb2.toString());
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Can't add fragment ");
                sb3.append(fragment);
                sb3.append(" with tag ");
                sb3.append(str);
                sb3.append(" to container view with no id");
                throw new java.lang.IllegalArgumentException(sb3.toString());
            }
            if (fragment.mFragmentId != 0 && fragment.mFragmentId != i) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Can't change container ID of fragment ");
                sb4.append(fragment);
                sb4.append(": was ");
                sb4.append(fragment.mFragmentId);
                sb4.append(" now ");
                sb4.append(i);
                throw new java.lang.IllegalStateException(sb4.toString());
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        Camera2StreamConfigurationMap(new androidx.fragment.app.FragmentTransaction.Op(i2, fragment));
    }

    public final androidx.fragment.app.FragmentTransaction replace(int i, java.lang.Class<? extends androidx.fragment.app.Fragment> cls, android.os.Bundle bundle) {
        return replace(i, cls, bundle, null);
    }

    public androidx.fragment.app.FragmentTransaction replace(int i, androidx.fragment.app.Fragment fragment) {
        return replace(i, fragment, (java.lang.String) null);
    }

    public final androidx.fragment.app.FragmentTransaction replace(int i, java.lang.Class<? extends androidx.fragment.app.Fragment> cls, android.os.Bundle bundle, java.lang.String str) {
        return replace(i, getHighSpeedVideoFpsRanges(cls, bundle), str);
    }

    public androidx.fragment.app.FragmentTransaction replace(int i, androidx.fragment.app.Fragment fragment, java.lang.String str) {
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Must use non-zero containerViewId");
        }
        getHighSpeedVideoFpsRanges(i, fragment, str, 2);
        return this;
    }

    public androidx.fragment.app.FragmentTransaction remove(androidx.fragment.app.Fragment fragment) {
        Camera2StreamConfigurationMap(new androidx.fragment.app.FragmentTransaction.Op(3, fragment));
        return this;
    }

    public androidx.fragment.app.FragmentTransaction hide(androidx.fragment.app.Fragment fragment) {
        Camera2StreamConfigurationMap(new androidx.fragment.app.FragmentTransaction.Op(4, fragment));
        return this;
    }

    public androidx.fragment.app.FragmentTransaction show(androidx.fragment.app.Fragment fragment) {
        Camera2StreamConfigurationMap(new androidx.fragment.app.FragmentTransaction.Op(5, fragment));
        return this;
    }

    public androidx.fragment.app.FragmentTransaction detach(androidx.fragment.app.Fragment fragment) {
        Camera2StreamConfigurationMap(new androidx.fragment.app.FragmentTransaction.Op(6, fragment));
        return this;
    }

    public androidx.fragment.app.FragmentTransaction attach(androidx.fragment.app.Fragment fragment) {
        Camera2StreamConfigurationMap(new androidx.fragment.app.FragmentTransaction.Op(7, fragment));
        return this;
    }

    public androidx.fragment.app.FragmentTransaction setPrimaryNavigationFragment(androidx.fragment.app.Fragment fragment) {
        Camera2StreamConfigurationMap(new androidx.fragment.app.FragmentTransaction.Op(8, fragment));
        return this;
    }

    public androidx.fragment.app.FragmentTransaction setMaxLifecycle(androidx.fragment.app.Fragment fragment, androidx.lifecycle.Lifecycle.State state) {
        Camera2StreamConfigurationMap(new androidx.fragment.app.FragmentTransaction.Op(fragment, state));
        return this;
    }

    public boolean isEmpty() {
        return this.getOutputSizeshNQ4ISI.isEmpty();
    }

    public androidx.fragment.app.FragmentTransaction setCustomAnimations(int i, int i2) {
        return setCustomAnimations(i, i2, 0, 0);
    }

    public androidx.fragment.app.FragmentTransaction setCustomAnimations(int i, int i2, int i3, int i4) {
        this.getOutputStallDurationlomOqCM = i;
        this.getOutputStallDuration = i2;
        this.getValidOutputFormatsForInputhNQ4ISI = i3;
        this.toString = i4;
        return this;
    }

    public androidx.fragment.app.FragmentTransaction addSharedElement(android.view.View view, java.lang.String str) {
        if (!androidx.fragment.app.FragmentTransition.supportsTransition()) {
            return this;
        }
        java.lang.String transitionName = androidx.core.view.ViewCompat.getTransitionName(view);
        if (transitionName == null) {
            throw new java.lang.IllegalArgumentException("Unique transitionNames are required for all sharedElements");
        }
        if (this.unwrapAs == null) {
            this.unwrapAs = new java.util.ArrayList<>();
            this.isOutputSupportedForhNQ4ISI = new java.util.ArrayList<>();
        } else {
            if (this.isOutputSupportedForhNQ4ISI.contains(str)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("A shared element with the target name '");
                sb.append(str);
                sb.append("' has already been added to the transaction.");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            if (this.unwrapAs.contains(transitionName)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("A shared element with the source name '");
                sb2.append(transitionName);
                sb2.append("' has already been added to the transaction.");
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
        }
        this.unwrapAs.add(transitionName);
        this.isOutputSupportedForhNQ4ISI.add(str);
        return this;
    }

    public androidx.fragment.app.FragmentTransaction setTransition(int i) {
        this.ArtificialStackFrames = i;
        return this;
    }

    public androidx.fragment.app.FragmentTransaction addToBackStack(java.lang.String str) {
        if (!this.getInputFormats) {
            throw new java.lang.IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.Camera2StreamConfigurationMap = true;
        this.getOutputSizes = str;
        return this;
    }

    public boolean isAddToBackStackAllowed() {
        return this.getInputFormats;
    }

    public androidx.fragment.app.FragmentTransaction disallowAddToBackStack() {
        if (this.Camera2StreamConfigurationMap) {
            throw new java.lang.IllegalStateException("This transaction is already being added to the back stack");
        }
        this.getInputFormats = false;
        return this;
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setBreadCrumbTitle(int i) {
        this.getOutputMinFrameDuration = i;
        this.getInputSizeshNQ4ISI = null;
        return this;
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setBreadCrumbTitle(java.lang.CharSequence charSequence) {
        this.getOutputMinFrameDuration = 0;
        this.getInputSizeshNQ4ISI = charSequence;
        return this;
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setBreadCrumbShortTitle(int i) {
        this.getHighSpeedVideoSizesFor = i;
        this.getOutputFormats = null;
        return this;
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setBreadCrumbShortTitle(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoSizesFor = 0;
        this.getOutputFormats = charSequence;
        return this;
    }

    public androidx.fragment.app.FragmentTransaction setReorderingAllowed(boolean z) {
        this.isOutputSupportedFor = z;
        return this;
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction setAllowOptimization(boolean z) {
        return setReorderingAllowed(z);
    }

    public androidx.fragment.app.FragmentTransaction runOnCommit(java.lang.Runnable runnable) {
        return getHighSpeedVideoFpsRangesFor(false, runnable);
    }

    final androidx.fragment.app.FragmentTransaction getHighSpeedVideoFpsRangesFor(boolean z, java.lang.Runnable runnable) {
        if (!z) {
            disallowAddToBackStack();
        }
        if (this.getOutputMinFrameDurationlomOqCM == null) {
            this.getOutputMinFrameDurationlomOqCM = new java.util.ArrayList<>();
        }
        this.getOutputMinFrameDurationlomOqCM.add(runnable);
        return this;
    }
}
