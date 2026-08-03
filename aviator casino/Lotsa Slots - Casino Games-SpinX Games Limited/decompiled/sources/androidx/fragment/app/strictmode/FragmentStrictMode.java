package androidx.fragment.app.strictmode;

/* compiled from: FragmentStrictMode.kt */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003./0B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0004H\u0007J\u001a\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J \u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\"H\u0007J\u0018\u0010#\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010$\u001a\u00020%H\u0007J\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0018\u0010'\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010(\u001a\u00020)H\u0002J0\u0010*\u001a\u00020%2\u0006\u0010\u0010\u001a\u00020\u00062\u000e\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0,2\u000e\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120,H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u00061"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode;", "", "()V", "TAG", "", "defaultPolicy", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "getDefaultPolicy", "()Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "setDefaultPolicy", "(Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;)V", "getNearestPolicy", "fragment", "Landroidx/fragment/app/Fragment;", "handlePolicyViolation", "", "policy", "violation", "Landroidx/fragment/app/strictmode/Violation;", "logIfDebuggingEnabled", "onFragmentReuse", "previousFragmentId", "onFragmentTagUsage", "container", "Landroid/view/ViewGroup;", "onGetRetainInstanceUsage", "onGetTargetFragmentRequestCodeUsage", "onGetTargetFragmentUsage", "onPolicyViolation", "onSetRetainInstanceUsage", "onSetTargetFragmentUsage", "violatingFragment", "targetFragment", "requestCode", "", "onSetUserVisibleHint", "isVisibleToUser", "", "onWrongFragmentContainer", "runOnHostThread", "runnable", "Ljava/lang/Runnable;", "shouldHandlePolicyViolation", "fragmentClass", "Ljava/lang/Class;", "violationClass", "Flag", "OnViolationListener", "Policy", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FragmentStrictMode {
    private static final java.lang.String TAG = "FragmentStrictMode";
    public static final androidx.fragment.app.strictmode.FragmentStrictMode INSTANCE = new androidx.fragment.app.strictmode.FragmentStrictMode();
    private static androidx.fragment.app.strictmode.FragmentStrictMode.Policy defaultPolicy = androidx.fragment.app.strictmode.FragmentStrictMode.Policy.LAX;

    /* compiled from: FragmentStrictMode.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "", "(Ljava/lang/String;I)V", "PENALTY_LOG", "PENALTY_DEATH", "DETECT_FRAGMENT_REUSE", "DETECT_FRAGMENT_TAG_USAGE", "DETECT_RETAIN_INSTANCE_USAGE", "DETECT_SET_USER_VISIBLE_HINT", "DETECT_TARGET_FRAGMENT_USAGE", "DETECT_WRONG_FRAGMENT_CONTAINER", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum Flag {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* compiled from: FragmentStrictMode.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "", "onViolation", "", "violation", "Landroidx/fragment/app/strictmode/Violation;", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnViolationListener {
        void onViolation(androidx.fragment.app.strictmode.Violation violation);
    }

    private FragmentStrictMode() {
    }

    public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy getDefaultPolicy() {
        return defaultPolicy;
    }

    public final void setDefaultPolicy(androidx.fragment.app.strictmode.FragmentStrictMode.Policy policy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(policy, "<set-?>");
        defaultPolicy = policy;
    }

    private final androidx.fragment.app.strictmode.FragmentStrictMode.Policy getNearestPolicy(androidx.fragment.app.Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                androidx.fragment.app.FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.getStrictModePolicy() != null) {
                    androidx.fragment.app.strictmode.FragmentStrictMode.Policy strictModePolicy = parentFragmentManager.getStrictModePolicy();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(strictModePolicy);
                    return strictModePolicy;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return defaultPolicy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.jvm.JvmStatic
    public static final void onFragmentReuse(androidx.fragment.app.Fragment fragment, java.lang.String previousFragmentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        androidx.fragment.app.strictmode.FragmentReuseViolation fragmentReuseViolation = new androidx.fragment.app.strictmode.FragmentReuseViolation(fragment, previousFragmentId);
        androidx.fragment.app.strictmode.FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(fragmentReuseViolation);
        androidx.fragment.app.strictmode.FragmentStrictMode.Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_FRAGMENT_REUSE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), fragmentReuseViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, fragmentReuseViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.jvm.JvmStatic
    public static final void onFragmentTagUsage(androidx.fragment.app.Fragment fragment, android.view.ViewGroup container) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        androidx.fragment.app.strictmode.FragmentTagUsageViolation fragmentTagUsageViolation = new androidx.fragment.app.strictmode.FragmentTagUsageViolation(fragment, container);
        androidx.fragment.app.strictmode.FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(fragmentTagUsageViolation);
        androidx.fragment.app.strictmode.FragmentStrictMode.Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_FRAGMENT_TAG_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, fragmentTagUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.jvm.JvmStatic
    public static final void onSetRetainInstanceUsage(androidx.fragment.app.Fragment fragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation(fragment);
        androidx.fragment.app.strictmode.FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(setRetainInstanceUsageViolation);
        androidx.fragment.app.strictmode.FragmentStrictMode.Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, setRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.jvm.JvmStatic
    public static final void onGetRetainInstanceUsage(androidx.fragment.app.Fragment fragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation(fragment);
        androidx.fragment.app.strictmode.FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(getRetainInstanceUsageViolation);
        androidx.fragment.app.strictmode.FragmentStrictMode.Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, getRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.jvm.JvmStatic
    public static final void onSetUserVisibleHint(androidx.fragment.app.Fragment fragment, boolean isVisibleToUser) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        androidx.fragment.app.strictmode.SetUserVisibleHintViolation setUserVisibleHintViolation = new androidx.fragment.app.strictmode.SetUserVisibleHintViolation(fragment, isVisibleToUser);
        androidx.fragment.app.strictmode.FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(setUserVisibleHintViolation);
        androidx.fragment.app.strictmode.FragmentStrictMode.Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_SET_USER_VISIBLE_HINT) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, setUserVisibleHintViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.jvm.JvmStatic
    public static final void onSetTargetFragmentUsage(androidx.fragment.app.Fragment violatingFragment, androidx.fragment.app.Fragment targetFragment, int requestCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(violatingFragment, "violatingFragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
        androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation(violatingFragment, targetFragment, requestCode);
        androidx.fragment.app.strictmode.FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(setTargetFragmentUsageViolation);
        androidx.fragment.app.strictmode.FragmentStrictMode.Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(violatingFragment);
        if (nearestPolicy.getFlags$fragment_release().contains(androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, violatingFragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, setTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.jvm.JvmStatic
    public static final void onGetTargetFragmentUsage(androidx.fragment.app.Fragment fragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation(fragment);
        androidx.fragment.app.strictmode.FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(getTargetFragmentUsageViolation);
        androidx.fragment.app.strictmode.FragmentStrictMode.Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, getTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.jvm.JvmStatic
    public static final void onGetTargetFragmentRequestCodeUsage(androidx.fragment.app.Fragment fragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation(fragment);
        androidx.fragment.app.strictmode.FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(getTargetFragmentRequestCodeUsageViolation);
        androidx.fragment.app.strictmode.FragmentStrictMode.Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.jvm.JvmStatic
    public static final void onWrongFragmentContainer(androidx.fragment.app.Fragment fragment, android.view.ViewGroup container) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "container");
        androidx.fragment.app.strictmode.WrongFragmentContainerViolation wrongFragmentContainerViolation = new androidx.fragment.app.strictmode.WrongFragmentContainerViolation(fragment, container);
        androidx.fragment.app.strictmode.FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(wrongFragmentContainerViolation);
        androidx.fragment.app.strictmode.FragmentStrictMode.Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, wrongFragmentContainerViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onPolicyViolation(androidx.fragment.app.strictmode.Violation violation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(violation, "violation");
        logIfDebuggingEnabled(violation);
        androidx.fragment.app.Fragment fragment = violation.getFragment();
        androidx.fragment.app.strictmode.FragmentStrictMode.Policy nearestPolicy = getNearestPolicy(fragment);
        if (shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), violation.getClass())) {
            handlePolicyViolation(nearestPolicy, violation);
        }
    }

    private final void logIfDebuggingEnabled(androidx.fragment.app.strictmode.Violation violation) {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d(androidx.fragment.app.FragmentManager.TAG, "StrictMode violation in " + violation.getFragment().getClass().getName(), violation);
        }
    }

    private final boolean shouldHandlePolicyViolation(androidx.fragment.app.strictmode.FragmentStrictMode.Policy policy, java.lang.Class<? extends androidx.fragment.app.Fragment> fragmentClass, java.lang.Class<? extends androidx.fragment.app.strictmode.Violation> violationClass) {
        java.util.Set<java.lang.Class<? extends androidx.fragment.app.strictmode.Violation>> set = policy.getMAllowedViolations$fragment_release().get(fragmentClass.getName());
        if (set == null) {
            return true;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(violationClass.getSuperclass(), androidx.fragment.app.strictmode.Violation.class) || !kotlin.collections.CollectionsKt.contains(set, violationClass.getSuperclass())) {
            return !set.contains(violationClass);
        }
        return false;
    }

    private final void handlePolicyViolation(final androidx.fragment.app.strictmode.FragmentStrictMode.Policy policy, final androidx.fragment.app.strictmode.Violation violation) {
        androidx.fragment.app.Fragment fragment = violation.getFragment();
        final java.lang.String name = fragment.getClass().getName();
        if (policy.getFlags$fragment_release().contains(androidx.fragment.app.strictmode.FragmentStrictMode.Flag.PENALTY_LOG)) {
            android.util.Log.d(TAG, "Policy violation in " + name, violation);
        }
        if (policy.getListener() != null) {
            runOnHostThread(fragment, new java.lang.Runnable() { // from class: androidx.fragment.app.strictmode.FragmentStrictMode$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.fragment.app.strictmode.FragmentStrictMode.m4779handlePolicyViolation$lambda0(androidx.fragment.app.strictmode.FragmentStrictMode.Policy.this, violation);
                }
            });
        }
        if (policy.getFlags$fragment_release().contains(androidx.fragment.app.strictmode.FragmentStrictMode.Flag.PENALTY_DEATH)) {
            runOnHostThread(fragment, new java.lang.Runnable() { // from class: androidx.fragment.app.strictmode.FragmentStrictMode$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.fragment.app.strictmode.FragmentStrictMode.m4780handlePolicyViolation$lambda1(name, violation);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handlePolicyViolation$lambda-0, reason: not valid java name */
    public static final void m4779handlePolicyViolation$lambda0(androidx.fragment.app.strictmode.FragmentStrictMode.Policy policy, androidx.fragment.app.strictmode.Violation violation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(policy, "$policy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(violation, "$violation");
        policy.getListener().onViolation(violation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handlePolicyViolation$lambda-1, reason: not valid java name */
    public static final void m4780handlePolicyViolation$lambda1(java.lang.String str, androidx.fragment.app.strictmode.Violation violation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(violation, "$violation");
        android.util.Log.e(TAG, "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    private final void runOnHostThread(androidx.fragment.app.Fragment fragment, java.lang.Runnable runnable) {
        if (fragment.isAdded()) {
            android.os.Handler handler = fragment.getParentFragmentManager().getHost().getHandler();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(handler, "fragment.parentFragmentManager.host.handler");
            if (kotlin.jvm.internal.Intrinsics.areEqual(handler.getLooper(), android.os.Looper.myLooper())) {
                runnable.run();
                return;
            } else {
                handler.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    /* compiled from: FragmentStrictMode.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016BA\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012 \u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\n0\b¢\u0006\u0002\u0010\rR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R.\u0010\u0012\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\u00030\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "", "flags", "", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "allowedViolations", "", "", "", "Ljava/lang/Class;", "Landroidx/fragment/app/strictmode/Violation;", "(Ljava/util/Set;Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;Ljava/util/Map;)V", "getFlags$fragment_release", "()Ljava/util/Set;", "getListener$fragment_release", "()Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "mAllowedViolations", "getMAllowedViolations$fragment_release", "()Ljava/util/Map;", "Builder", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Policy {
        public static final androidx.fragment.app.strictmode.FragmentStrictMode.Policy LAX = new androidx.fragment.app.strictmode.FragmentStrictMode.Policy(kotlin.collections.SetsKt.emptySet(), null, kotlin.collections.MapsKt.emptyMap());
        private final java.util.Set<androidx.fragment.app.strictmode.FragmentStrictMode.Flag> flags;
        private final androidx.fragment.app.strictmode.FragmentStrictMode.OnViolationListener listener;
        private final java.util.Map<java.lang.String, java.util.Set<java.lang.Class<? extends androidx.fragment.app.strictmode.Violation>>> mAllowedViolations;

        /* JADX WARN: Multi-variable type inference failed */
        public Policy(java.util.Set<? extends androidx.fragment.app.strictmode.FragmentStrictMode.Flag> flags, androidx.fragment.app.strictmode.FragmentStrictMode.OnViolationListener onViolationListener, java.util.Map<java.lang.String, ? extends java.util.Set<java.lang.Class<? extends androidx.fragment.app.strictmode.Violation>>> allowedViolations) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flags, "flags");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
            this.flags = flags;
            this.listener = onViolationListener;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry<java.lang.String, ? extends java.util.Set<java.lang.Class<? extends androidx.fragment.app.strictmode.Violation>>> entry : allowedViolations.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.mAllowedViolations = linkedHashMap;
        }

        public final java.util.Set<androidx.fragment.app.strictmode.FragmentStrictMode.Flag> getFlags$fragment_release() {
            return this.flags;
        }

        /* renamed from: getListener$fragment_release, reason: from getter */
        public final androidx.fragment.app.strictmode.FragmentStrictMode.OnViolationListener getListener() {
            return this.listener;
        }

        public final java.util.Map<java.lang.String, java.util.Set<java.lang.Class<? extends androidx.fragment.app.strictmode.Violation>>> getMAllowedViolations$fragment_release() {
            return this.mAllowedViolations;
        }

        /* compiled from: FragmentStrictMode.kt */
        @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\r\u001a\u00020\u00002\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000b2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000bH\u0007J \u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000bH\u0007J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0000H\u0007J\b\u0010\u0014\u001a\u00020\u0000H\u0007J\b\u0010\u0015\u001a\u00020\u0000H\u0007J\b\u0010\u0016\u001a\u00020\u0000H\u0007J\b\u0010\u0017\u001a\u00020\u0000H\u0007J\b\u0010\u0018\u001a\u00020\u0000H\u0007J\b\u0010\u0019\u001a\u00020\u0000H\u0007J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\u001b\u001a\u00020\u0000H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\u00040\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy$Builder;", "", "()V", "flags", "", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "mAllowedViolations", "", "", "Ljava/lang/Class;", "Landroidx/fragment/app/strictmode/Violation;", "allowViolation", "fragmentClass", "Landroidx/fragment/app/Fragment;", "violationClass", "build", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "detectFragmentReuse", "detectFragmentTagUsage", "detectRetainInstanceUsage", "detectSetUserVisibleHint", "detectTargetFragmentUsage", "detectWrongFragmentContainer", "penaltyDeath", "penaltyListener", "penaltyLog", "fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Builder {
            private androidx.fragment.app.strictmode.FragmentStrictMode.OnViolationListener listener;
            private final java.util.Set<androidx.fragment.app.strictmode.FragmentStrictMode.Flag> flags = new java.util.LinkedHashSet();
            private final java.util.Map<java.lang.String, java.util.Set<java.lang.Class<? extends androidx.fragment.app.strictmode.Violation>>> mAllowedViolations = new java.util.LinkedHashMap();

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder penaltyLog() {
                this.flags.add(androidx.fragment.app.strictmode.FragmentStrictMode.Flag.PENALTY_LOG);
                return this;
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder penaltyDeath() {
                this.flags.add(androidx.fragment.app.strictmode.FragmentStrictMode.Flag.PENALTY_DEATH);
                return this;
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder penaltyListener(androidx.fragment.app.strictmode.FragmentStrictMode.OnViolationListener listener) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
                this.listener = listener;
                return this;
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder detectFragmentReuse() {
                this.flags.add(androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_FRAGMENT_REUSE);
                return this;
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder detectFragmentTagUsage() {
                this.flags.add(androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_FRAGMENT_TAG_USAGE);
                return this;
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder detectRetainInstanceUsage() {
                this.flags.add(androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE);
                return this;
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder detectSetUserVisibleHint() {
                this.flags.add(androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_SET_USER_VISIBLE_HINT);
                return this;
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder detectTargetFragmentUsage() {
                this.flags.add(androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE);
                return this;
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder detectWrongFragmentContainer() {
                this.flags.add(androidx.fragment.app.strictmode.FragmentStrictMode.Flag.DETECT_WRONG_FRAGMENT_CONTAINER);
                return this;
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder allowViolation(java.lang.Class<? extends androidx.fragment.app.Fragment> fragmentClass, java.lang.Class<? extends androidx.fragment.app.strictmode.Violation> violationClass) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(violationClass, "violationClass");
                java.lang.String fragmentClassString = fragmentClass.getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentClassString, "fragmentClassString");
                return allowViolation(fragmentClassString, violationClass);
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy.Builder allowViolation(java.lang.String fragmentClass, java.lang.Class<? extends androidx.fragment.app.strictmode.Violation> violationClass) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(violationClass, "violationClass");
                java.util.LinkedHashSet linkedHashSet = this.mAllowedViolations.get(fragmentClass);
                if (linkedHashSet == null) {
                    linkedHashSet = new java.util.LinkedHashSet();
                }
                linkedHashSet.add(violationClass);
                this.mAllowedViolations.put(fragmentClass, linkedHashSet);
                return this;
            }

            public final androidx.fragment.app.strictmode.FragmentStrictMode.Policy build() {
                if (this.listener == null && !this.flags.contains(androidx.fragment.app.strictmode.FragmentStrictMode.Flag.PENALTY_DEATH)) {
                    penaltyLog();
                }
                return new androidx.fragment.app.strictmode.FragmentStrictMode.Policy(this.flags, this.listener, this.mAllowedViolations);
            }
        }
    }
}
