package dagger.hilt.android.flags;

/* loaded from: classes17.dex */
public final class FragmentGetContextFix {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.FIELD})
    @javax.inject.Qualifier
    /* loaded from: classes3.dex */
    public @interface DisableFragmentGetContextFix {
    }

    /* loaded from: classes5.dex */
    public interface FragmentGetContextFixEntryPoint {
        java.util.Set<java.lang.Boolean> getDisableFragmentGetContextFix();
    }

    public static boolean isFragmentGetContextFixDisabled(android.content.Context context) {
        java.util.Set<java.lang.Boolean> disableFragmentGetContextFix = ((dagger.hilt.android.flags.FragmentGetContextFix.FragmentGetContextFixEntryPoint) dagger.hilt.android.EntryPointAccessors.fromApplication(context, dagger.hilt.android.flags.FragmentGetContextFix.FragmentGetContextFixEntryPoint.class)).getDisableFragmentGetContextFix();
        dagger.hilt.internal.Preconditions.checkState(disableFragmentGetContextFix.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new java.lang.Object[0]);
        if (disableFragmentGetContextFix.isEmpty()) {
            return true;
        }
        return disableFragmentGetContextFix.iterator().next().booleanValue();
    }

    @dagger.Module
    static abstract class FragmentGetContextFixModule {
        @dagger.multibindings.Multibinds
        abstract java.util.Set<java.lang.Boolean> getHighSpeedVideoSizes();

        FragmentGetContextFixModule() {
        }
    }

    private FragmentGetContextFix() {
    }
}
