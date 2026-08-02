package dagger.hilt.android.internal.managers;

/* loaded from: classes17.dex */
public class FragmentComponentManager implements dagger.hilt.internal.GeneratedComponentManager<java.lang.Object> {
    private final java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
    private volatile java.lang.Object getHighSpeedVideoFpsRanges;
    private final androidx.fragment.app.Fragment getHighSpeedVideoSizes;

    public interface FragmentComponentBuilderEntryPoint {
        dagger.hilt.android.internal.builders.FragmentComponentBuilder fragmentComponentBuilder();
    }

    protected void validate(androidx.fragment.app.Fragment fragment) {
    }

    public FragmentComponentManager(androidx.fragment.app.Fragment fragment) {
        this.getHighSpeedVideoSizes = fragment;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public java.lang.Object generatedComponent() {
        if (this.getHighSpeedVideoFpsRanges == null) {
            synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                if (this.getHighSpeedVideoFpsRanges == null) {
                    dagger.hilt.internal.Preconditions.checkNotNull(this.getHighSpeedVideoSizes.getHost(), "Hilt Fragments must be attached before creating the component.");
                    dagger.hilt.internal.Preconditions.checkState(this.getHighSpeedVideoSizes.getHost() instanceof dagger.hilt.internal.GeneratedComponentManagerHolder, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.getHighSpeedVideoSizes.getHost().getClass());
                    validate(this.getHighSpeedVideoSizes);
                    this.getHighSpeedVideoFpsRanges = ((dagger.hilt.android.internal.managers.FragmentComponentManager.FragmentComponentBuilderEntryPoint) dagger.hilt.EntryPoints.get(this.getHighSpeedVideoSizes.getHost(), dagger.hilt.android.internal.managers.FragmentComponentManager.FragmentComponentBuilderEntryPoint.class)).fragmentComponentBuilder().fragment(this.getHighSpeedVideoSizes).build();
                }
            }
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    public static final void initializeArguments(androidx.fragment.app.Fragment fragment) {
        dagger.hilt.internal.Preconditions.checkNotNull(fragment);
        if (fragment.getArguments() == null) {
            fragment.setArguments(new android.os.Bundle());
        }
    }

    public static final android.content.Context findActivity(android.content.Context context) {
        while ((context instanceof android.content.ContextWrapper) && !(context instanceof android.app.Activity)) {
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static android.content.ContextWrapper createContextWrapper(android.content.Context context, androidx.fragment.app.Fragment fragment) {
        return new dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper(context, fragment);
    }

    public static android.content.ContextWrapper createContextWrapper(android.view.LayoutInflater layoutInflater, androidx.fragment.app.Fragment fragment) {
        return new dagger.hilt.android.internal.managers.ViewComponentManager.FragmentContextWrapper(layoutInflater, fragment);
    }
}
