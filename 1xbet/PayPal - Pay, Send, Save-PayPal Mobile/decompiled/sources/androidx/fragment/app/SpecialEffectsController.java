package androidx.fragment.app;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0005\b \u0018\u0000 @2\u00020\u0001:\u0004@ABCB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ*\u0010\u0010\u001a\u00020\b2\u0011\u0010\r\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0012\u001a\u00020\b2\u0011\u0010\r\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\f0\u000bH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b$\u0010#J\u0015\u0010%\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b%\u0010#J\r\u0010&\u001a\u00020\b¢\u0006\u0004\b&\u0010\u0015J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020'H\u0002¢\u0006\u0004\b\u001c\u0010(J\u0019\u0010)\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010(J\r\u0010*\u001a\u00020\b¢\u0006\u0004\b*\u0010\u0015J\r\u0010+\u001a\u00020\b¢\u0006\u0004\b+\u0010\u0015J\u0017\u0010,\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u000e¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\b¢\u0006\u0004\b0\u0010\u0015J\u0015\u00103\u001a\u00020\b2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\"\u00105\u001a\u00020\b2\u0011\u0010\u0017\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\f0\u000bH\u0002¢\u0006\u0004\b5\u0010\u0013J\u000f\u00106\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u0010\u0015J\u0015\u00107\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b7\u00108R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010<R\u0016\u00106\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u0010<R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060>8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010?R\u0016\u0010\u001c\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u0010<R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00060>8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010?"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController;", "", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "Landroidx/fragment/app/SpecialEffectsController$Operation;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "", "applyContainerChangesToOperation$fragment_release", "(Landroidx/fragment/app/SpecialEffectsController$Operation;)V", "", "Lkotlin/jvm/JvmSuppressWildcards;", "operations", "", "isPop", "collectEffects", "(Ljava/util/List;Z)V", "commitEffects$fragment_release", "(Ljava/util/List;)V", "completeBack", "()V", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "p0", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "p1", "Landroidx/fragment/app/FragmentStateManager;", "p2", "getHighSpeedVideoFpsRanges", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/FragmentStateManager;)V", "finalState", "fragmentStateManager", "enqueueAdd", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/FragmentStateManager;)V", "enqueueHide", "(Landroidx/fragment/app/FragmentStateManager;)V", "enqueueRemove", "enqueueShow", "executePendingOperations", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/SpecialEffectsController$Operation;", "getHighResolutionOutputSizeshNQ4ISI", "forceCompleteAllOperations", "forcePostponedExecutePendingOperations", "getAwaitingCompletionLifecycleImpact", "(Landroidx/fragment/app/FragmentStateManager;)Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "isPendingExecute", "()Z", "markPostponedState", "Landroidx/activity/BackEventCompat;", "backEvent", "processProgress", "(Landroidx/activity/BackEventCompat;)V", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "updateOperationDirection", "(Z)V", "Landroid/view/ViewGroup;", "getContainer", "()Landroid/view/ViewGroup;", "Z", "getHighSpeedVideoSizes", "", "Ljava/util/List;", "Companion", "Effect", "FragmentStateManagerOperation", "Operation"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class SpecialEffectsController {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.fragment.app.SpecialEffectsController.Companion INSTANCE = new androidx.fragment.app.SpecialEffectsController.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;
    private final android.view.ViewGroup container;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> getHighResolutionOutputSizeshNQ4ISI;

    public abstract void collectEffects(java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> operations, boolean isPop);

    public SpecialEffectsController(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "");
        this.container = viewGroup;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
        this.Camera2StreamConfigurationMap = new java.util.ArrayList();
    }

    public final android.view.ViewGroup getContainer() {
        return this.container;
    }

    public final androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact getAwaitingCompletionLifecycleImpact(androidx.fragment.app.FragmentStateManager fragmentStateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentStateManager, "");
        androidx.fragment.app.Fragment Camera2StreamConfigurationMap = fragmentStateManager.Camera2StreamConfigurationMap();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(Camera2StreamConfigurationMap, "");
        androidx.fragment.app.SpecialEffectsController.Operation highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap);
        androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact = highSpeedVideoFpsRanges != null ? highSpeedVideoFpsRanges.getLifecycleImpact() : null;
        androidx.fragment.app.SpecialEffectsController.Operation highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap);
        androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact2 = highResolutionOutputSizeshNQ4ISI != null ? highResolutionOutputSizeshNQ4ISI.getLifecycleImpact() : null;
        int i = lifecycleImpact == null ? -1 : androidx.fragment.app.SpecialEffectsController.WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
        return (i == -1 || i == 1) ? lifecycleImpact2 : lifecycleImpact;
    }

    private final androidx.fragment.app.SpecialEffectsController.Operation getHighSpeedVideoFpsRanges(androidx.fragment.app.Fragment p0) {
        java.lang.Object obj;
        java.util.Iterator<T> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            androidx.fragment.app.SpecialEffectsController.Operation operation = (androidx.fragment.app.SpecialEffectsController.Operation) obj;
            if (kotlin.jvm.internal.Intrinsics.areEqual(operation.getFragment(), p0) && !operation.getIsCanceled()) {
                break;
            }
        }
        return (androidx.fragment.app.SpecialEffectsController.Operation) obj;
    }

    private final androidx.fragment.app.SpecialEffectsController.Operation getHighResolutionOutputSizeshNQ4ISI(androidx.fragment.app.Fragment p0) {
        java.lang.Object obj;
        java.util.Iterator<T> it = this.Camera2StreamConfigurationMap.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            androidx.fragment.app.SpecialEffectsController.Operation operation = (androidx.fragment.app.SpecialEffectsController.Operation) obj;
            if (kotlin.jvm.internal.Intrinsics.areEqual(operation.getFragment(), p0) && !operation.getIsCanceled()) {
                break;
            }
        }
        return (androidx.fragment.app.SpecialEffectsController.Operation) obj;
    }

    public final void enqueueAdd(androidx.fragment.app.SpecialEffectsController.Operation.State finalState, androidx.fragment.app.FragmentStateManager fragmentStateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(finalState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentStateManager, "");
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            fragmentStateManager.Camera2StreamConfigurationMap();
        }
        getHighSpeedVideoFpsRanges(finalState, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING, fragmentStateManager);
    }

    public final void enqueueShow(androidx.fragment.app.FragmentStateManager fragmentStateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentStateManager, "");
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            fragmentStateManager.Camera2StreamConfigurationMap();
        }
        getHighSpeedVideoFpsRanges(androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public final void enqueueHide(androidx.fragment.app.FragmentStateManager fragmentStateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentStateManager, "");
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            fragmentStateManager.Camera2StreamConfigurationMap();
        }
        getHighSpeedVideoFpsRanges(androidx.fragment.app.SpecialEffectsController.Operation.State.GONE, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public final void enqueueRemove(androidx.fragment.app.FragmentStateManager fragmentStateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentStateManager, "");
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            fragmentStateManager.Camera2StreamConfigurationMap();
        }
        getHighSpeedVideoFpsRanges(androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING, fragmentStateManager);
    }

    private final void getHighSpeedVideoFpsRanges(androidx.fragment.app.SpecialEffectsController.Operation.State p0, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact p1, androidx.fragment.app.FragmentStateManager p2) {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.fragment.app.Fragment Camera2StreamConfigurationMap = p2.Camera2StreamConfigurationMap();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(Camera2StreamConfigurationMap, "");
            androidx.fragment.app.SpecialEffectsController.Operation highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap);
            if (highSpeedVideoFpsRanges == null) {
                if (!p2.Camera2StreamConfigurationMap().mTransitioning && !p2.Camera2StreamConfigurationMap().mRemoving) {
                    highSpeedVideoFpsRanges = null;
                }
                androidx.fragment.app.Fragment Camera2StreamConfigurationMap2 = p2.Camera2StreamConfigurationMap();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(Camera2StreamConfigurationMap2, "");
                highSpeedVideoFpsRanges = getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap2);
            }
            if (highSpeedVideoFpsRanges != null) {
                highSpeedVideoFpsRanges.mergeWith(p0, p1);
                return;
            }
            final androidx.fragment.app.SpecialEffectsController.FragmentStateManagerOperation fragmentStateManagerOperation = new androidx.fragment.app.SpecialEffectsController.FragmentStateManagerOperation(p0, p1, p2);
            this.getHighResolutionOutputSizeshNQ4ISI.add(fragmentStateManagerOperation);
            fragmentStateManagerOperation.addCompletionListener(new java.lang.Runnable() { // from class: androidx.fragment.app.SpecialEffectsController$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.fragment.app.SpecialEffectsController.$r8$lambda$TeCmoVW0hctjg0BNHLP6mPbAs5U(androidx.fragment.app.SpecialEffectsController.this, fragmentStateManagerOperation);
                }
            });
            fragmentStateManagerOperation.addCompletionListener(new java.lang.Runnable() { // from class: androidx.fragment.app.SpecialEffectsController$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.fragment.app.SpecialEffectsController.$r8$lambda$ahdwWRJghvCwX2xG1GsepYfILrY(androidx.fragment.app.SpecialEffectsController.this, fragmentStateManagerOperation);
                }
            });
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void updateOperationDirection(boolean isPop) {
        this.getHighSpeedVideoFpsRangesFor = isPop;
    }

    public final void markPostponedState() {
        androidx.fragment.app.SpecialEffectsController.Operation operation;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            getHighSpeedVideoFpsRangesFor();
            java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> list = this.getHighResolutionOutputSizeshNQ4ISI;
            java.util.ListIterator<androidx.fragment.app.SpecialEffectsController.Operation> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    operation = null;
                    break;
                }
                operation = listIterator.previous();
                androidx.fragment.app.SpecialEffectsController.Operation operation2 = operation;
                androidx.fragment.app.SpecialEffectsController.Operation.State.Companion companion = androidx.fragment.app.SpecialEffectsController.Operation.State.INSTANCE;
                android.view.View view = operation2.getFragment().mView;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "");
                androidx.fragment.app.SpecialEffectsController.Operation.State asOperationState = companion.asOperationState(view);
                if (operation2.getFinalState() == androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE && asOperationState != androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE) {
                    break;
                }
            }
            androidx.fragment.app.SpecialEffectsController.Operation operation3 = operation;
            androidx.fragment.app.Fragment fragment = operation3 != null ? operation3.getFragment() : null;
            this.getHighSpeedVideoSizes = fragment != null ? fragment.isPostponed() : false;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final boolean isPendingExecute() {
        return !this.getHighResolutionOutputSizeshNQ4ISI.isEmpty();
    }

    public final void forcePostponedExecutePendingOperations() {
        if (this.getHighSpeedVideoSizes) {
            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
            this.getHighSpeedVideoSizes = false;
            executePendingOperations();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x013a A[Catch: all -> 0x017e, TryCatch #0 {, blocks: (B:12:0x0017, B:13:0x0028, B:15:0x002f, B:17:0x003f, B:21:0x0049, B:25:0x004d, B:26:0x0051, B:28:0x0058, B:30:0x0062, B:31:0x0071, B:34:0x0079, B:38:0x0069, B:40:0x007f, B:42:0x0089, B:46:0x009c, B:48:0x00b9, B:50:0x00bf, B:52:0x00d1, B:54:0x00db, B:58:0x00e4, B:59:0x00e8, B:61:0x00ee, B:70:0x00fe, B:71:0x0109, B:73:0x010f, B:75:0x011f, B:78:0x012c, B:79:0x0134, B:81:0x013a, B:91:0x014f, B:93:0x0156, B:94:0x0175, B:96:0x015f, B:98:0x0169, B:102:0x017a), top: B:11:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0156 A[Catch: all -> 0x017e, TryCatch #0 {, blocks: (B:12:0x0017, B:13:0x0028, B:15:0x002f, B:17:0x003f, B:21:0x0049, B:25:0x004d, B:26:0x0051, B:28:0x0058, B:30:0x0062, B:31:0x0071, B:34:0x0079, B:38:0x0069, B:40:0x007f, B:42:0x0089, B:46:0x009c, B:48:0x00b9, B:50:0x00bf, B:52:0x00d1, B:54:0x00db, B:58:0x00e4, B:59:0x00e8, B:61:0x00ee, B:70:0x00fe, B:71:0x0109, B:73:0x010f, B:75:0x011f, B:78:0x012c, B:79:0x0134, B:81:0x013a, B:91:0x014f, B:93:0x0156, B:94:0x0175, B:96:0x015f, B:98:0x0169, B:102:0x017a), top: B:11:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void executePendingOperations() {
        boolean z;
        boolean z2;
        java.util.Iterator<T> it;
        boolean z3;
        if (this.getHighSpeedVideoSizes) {
            return;
        }
        if (!this.container.isAttachedToWindow()) {
            forceCompleteAllOperations();
            this.getHighSpeedVideoFpsRangesFor = false;
            return;
        }
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) this.Camera2StreamConfigurationMap);
            this.Camera2StreamConfigurationMap.clear();
            java.util.Iterator it2 = mutableList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                androidx.fragment.app.SpecialEffectsController.Operation operation = (androidx.fragment.app.SpecialEffectsController.Operation) it2.next();
                if (this.getHighResolutionOutputSizeshNQ4ISI.isEmpty() || !operation.getFragment().mTransitioning) {
                    r5 = false;
                }
                operation.setSeeking$fragment_release(r5);
            }
            for (androidx.fragment.app.SpecialEffectsController.Operation operation2 : mutableList) {
                if (this.getHighSpeedVideoFpsRanges) {
                    androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                    operation2.complete$fragment_release();
                } else {
                    androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                    operation2.cancel(this.container);
                }
                this.getHighSpeedVideoFpsRanges = false;
                if (!operation2.getIsComplete()) {
                    this.Camera2StreamConfigurationMap.add(operation2);
                }
            }
            if (!this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                getHighSpeedVideoFpsRangesFor();
                java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> mutableList2 = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) this.getHighResolutionOutputSizeshNQ4ISI);
                if (mutableList2.isEmpty()) {
                    return;
                }
                this.getHighResolutionOutputSizeshNQ4ISI.clear();
                this.Camera2StreamConfigurationMap.addAll(mutableList2);
                androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                collectEffects(mutableList2, this.getHighSpeedVideoFpsRangesFor);
                java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> list = mutableList2;
                loop2: while (true) {
                    z = true;
                    for (androidx.fragment.app.SpecialEffectsController.Operation operation3 : list) {
                        if (!operation3.getEffects$fragment_release().isEmpty()) {
                            java.util.List<androidx.fragment.app.SpecialEffectsController.Effect> effects$fragment_release = operation3.getEffects$fragment_release();
                            if (!(effects$fragment_release instanceof java.util.Collection) || !effects$fragment_release.isEmpty()) {
                                java.util.Iterator<T> it3 = effects$fragment_release.iterator();
                                while (it3.hasNext()) {
                                    if (!((androidx.fragment.app.SpecialEffectsController.Effect) it3.next()).getIsSeekingSupported()) {
                                        break;
                                    }
                                }
                            }
                        }
                        z = false;
                    }
                    break loop2;
                }
                if (z) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator<T> it4 = list.iterator();
                    while (it4.hasNext()) {
                        kotlin.collections.CollectionsKt.addAll(arrayList, ((androidx.fragment.app.SpecialEffectsController.Operation) it4.next()).getEffects$fragment_release());
                    }
                    if (!arrayList.isEmpty()) {
                        z2 = true;
                        it = mutableList2.iterator();
                        z3 = true;
                        while (it.hasNext()) {
                            if (!((androidx.fragment.app.SpecialEffectsController.Operation) it.next()).getFragment().mTransitioning) {
                                z3 = false;
                            }
                        }
                        this.getHighSpeedVideoFpsRanges = (z3 || z2) ? false : true;
                        androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                        if (z3) {
                            Camera2StreamConfigurationMap(mutableList2);
                            commitEffects$fragment_release(mutableList2);
                        } else if (z2) {
                            Camera2StreamConfigurationMap(mutableList2);
                            int size = mutableList2.size();
                            for (int i = 0; i < size; i++) {
                                applyContainerChangesToOperation$fragment_release(mutableList2.get(i));
                            }
                        }
                        this.getHighSpeedVideoFpsRangesFor = false;
                        androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                    }
                }
                z2 = false;
                it = mutableList2.iterator();
                z3 = true;
                while (it.hasNext()) {
                }
                this.getHighSpeedVideoFpsRanges = (z3 || z2) ? false : true;
                androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                if (z3) {
                }
                this.getHighSpeedVideoFpsRangesFor = false;
                androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void applyContainerChangesToOperation$fragment_release(androidx.fragment.app.SpecialEffectsController.Operation operation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operation, "");
        if (operation.getIsAwaitingContainerChanges()) {
            androidx.fragment.app.SpecialEffectsController.Operation.State finalState = operation.getFinalState();
            android.view.View requireView = operation.getFragment().requireView();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireView, "");
            finalState.applyState(requireView, this.container);
            operation.setAwaitingContainerChanges(false);
        }
    }

    public final void forceCompleteAllOperations() {
        androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
        this.container.isAttachedToWindow();
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            getHighSpeedVideoFpsRangesFor();
            Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI);
            java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) this.Camera2StreamConfigurationMap);
            java.util.Iterator it = mutableList.iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.SpecialEffectsController.Operation) it.next()).setSeeking$fragment_release(false);
            }
            for (androidx.fragment.app.SpecialEffectsController.Operation operation : mutableList) {
                androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                operation.cancel(this.container);
            }
            java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> mutableList2 = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) this.getHighResolutionOutputSizeshNQ4ISI);
            java.util.Iterator it2 = mutableList2.iterator();
            while (it2.hasNext()) {
                ((androidx.fragment.app.SpecialEffectsController.Operation) it2.next()).setSeeking$fragment_release(false);
            }
            for (androidx.fragment.app.SpecialEffectsController.Operation operation2 : mutableList2) {
                androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                operation2.cancel(this.container);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        for (androidx.fragment.app.SpecialEffectsController.Operation operation : this.getHighResolutionOutputSizeshNQ4ISI) {
            if (operation.getLifecycleImpact() == androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
                android.view.View requireView = operation.getFragment().requireView();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireView, "");
                operation.mergeWith(androidx.fragment.app.SpecialEffectsController.Operation.State.INSTANCE.from(requireView.getVisibility()), androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE);
            }
        }
    }

    public void commitEffects$fragment_release(java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> operations) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operations, "");
        java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> list = operations;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, ((androidx.fragment.app.SpecialEffectsController.Operation) it.next()).getEffects$fragment_release());
        }
        java.util.List list2 = kotlin.collections.CollectionsKt.toList(kotlin.collections.CollectionsKt.toSet(arrayList));
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            ((androidx.fragment.app.SpecialEffectsController.Effect) list2.get(i)).onCommit(this.container);
        }
        int size2 = operations.size();
        for (int i2 = 0; i2 < size2; i2++) {
            applyContainerChangesToOperation$fragment_release(operations.get(i2));
        }
        java.util.List list3 = kotlin.collections.CollectionsKt.toList(list);
        int size3 = list3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            androidx.fragment.app.SpecialEffectsController.Operation operation = (androidx.fragment.app.SpecialEffectsController.Operation) list3.get(i3);
            if (operation.getEffects$fragment_release().isEmpty()) {
                operation.complete$fragment_release();
            }
        }
    }

    private final void Camera2StreamConfigurationMap(java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> p0) {
        int size = p0.size();
        for (int i = 0; i < size; i++) {
            p0.get(i).onStart();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = p0.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, ((androidx.fragment.app.SpecialEffectsController.Operation) it.next()).getEffects$fragment_release());
        }
        java.util.List list = kotlin.collections.CollectionsKt.toList(kotlin.collections.CollectionsKt.toSet(arrayList));
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((androidx.fragment.app.SpecialEffectsController.Effect) list.get(i2)).performStart(this.container);
        }
    }

    public final void processProgress(androidx.view.BackEventCompat backEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backEvent, "");
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            backEvent.getProgress();
        }
        java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> list = this.Camera2StreamConfigurationMap;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, ((androidx.fragment.app.SpecialEffectsController.Operation) it.next()).getEffects$fragment_release());
        }
        java.util.List list2 = kotlin.collections.CollectionsKt.toList(kotlin.collections.CollectionsKt.toSet(arrayList));
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            ((androidx.fragment.app.SpecialEffectsController.Effect) list2.get(i)).onProgress(backEvent, this.container);
        }
    }

    public final void completeBack() {
        androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
        Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap);
        commitEffects$fragment_release(this.Camera2StreamConfigurationMap);
    }

    @kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0010\u0018\u00002\u00020\u0001:\u0002CDB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u0012J\u001d\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R \u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0%8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010(R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b2\u00104\"\u0004\b5\u00106R$\u00108\u001a\u0002012\u0006\u00107\u001a\u0002018\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b8\u00104R$\u00109\u001a\u0002012\u0006\u00107\u001a\u0002018\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b9\u00103\u001a\u0004\b9\u00104R*\u0010;\u001a\u0002012\u0006\u0010:\u001a\u0002018\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b;\u00103\u001a\u0004\b;\u00104\"\u0004\b<\u00106R$\u0010=\u001a\u0002012\u0006\u00107\u001a\u0002018\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b=\u00103\u001a\u0004\b=\u00104R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation;", "", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "finalState", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "lifecycleImpact", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/Fragment;)V", "Ljava/lang/Runnable;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addCompletionListener", "(Ljava/lang/Runnable;)V", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "effect", "addEffect", "(Landroidx/fragment/app/SpecialEffectsController$Effect;)V", "Landroid/view/ViewGroup;", "container", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Landroid/view/ViewGroup;)V", "complete$fragment_release", "()V", "completeEffect", "mergeWith", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;)V", "onStart", "", "toString", "()Ljava/lang/String;", "", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "", "effects", "getEffects$fragment_release", "()Ljava/util/List;", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "getFinalState", "()Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "setFinalState", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;)V", "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "", "isAwaitingContainerChanges", "Z", "()Z", "setAwaitingContainerChanges", "(Z)V", "p0", "isCanceled", "isComplete", "<set-?>", "isSeeking", "setSeeking$fragment_release", "isStarted", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "getLifecycleImpact", "()Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "setLifecycleImpact", "(Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;)V", "LifecycleImpact", "State"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class Operation {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final java.util.List<java.lang.Runnable> getHighSpeedVideoFpsRanges;
        private final java.util.List<androidx.fragment.app.SpecialEffectsController.Effect> effects;
        private androidx.fragment.app.SpecialEffectsController.Operation.State finalState;
        private final androidx.fragment.app.Fragment fragment;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.util.List<androidx.fragment.app.SpecialEffectsController.Effect> getHighSpeedVideoFpsRangesFor;
        private boolean isAwaitingContainerChanges;
        private boolean isCanceled;
        private boolean isComplete;
        private boolean isSeeking;
        private boolean isStarted;
        private androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "ADDING", "REMOVING"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        public Operation(androidx.fragment.app.SpecialEffectsController.Operation.State state, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact, androidx.fragment.app.Fragment fragment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleImpact, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
            this.finalState = state;
            this.lifecycleImpact = lifecycleImpact;
            this.fragment = fragment;
            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
            this.isAwaitingContainerChanges = true;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.getHighSpeedVideoFpsRangesFor = arrayList;
            this.effects = arrayList;
        }

        public final androidx.fragment.app.SpecialEffectsController.Operation.State getFinalState() {
            return this.finalState;
        }

        public final void setFinalState(androidx.fragment.app.SpecialEffectsController.Operation.State state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            this.finalState = state;
        }

        public final androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact getLifecycleImpact() {
            return this.lifecycleImpact;
        }

        public final void setLifecycleImpact(androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleImpact, "");
            this.lifecycleImpact = lifecycleImpact;
        }

        public final androidx.fragment.app.Fragment getFragment() {
            return this.fragment;
        }

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0080\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "container", "", "applyState", "(Landroid/view/View;Landroid/view/ViewGroup;)V", "Companion", "REMOVED", "VISIBLE", "GONE", "INVISIBLE"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* renamed from: Companion, reason: from kotlin metadata */
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State.Companion INSTANCE = new androidx.fragment.app.SpecialEffectsController.Operation.State.Companion(null);

            public final void applyState(android.view.View view, android.view.ViewGroup container) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "");
                androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                int i = androidx.fragment.app.SpecialEffectsController.Operation.State.WhenMappings.$EnumSwitchMapping$0[ordinal()];
                if (i == 1) {
                    android.view.ViewParent parent = view.getParent();
                    android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                    if (viewGroup != null) {
                        androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                    android.view.ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null) == null) {
                        androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i == 3) {
                    androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                    view.setVisibility(8);
                } else if (i == 4) {
                    androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                    view.setVisibility(4);
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u00020\u0006*\u00020\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State$Companion;", "", "<init>", "()V", "", "visibility", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "from", "(I)Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "Landroid/view/View;", "asOperationState", "(Landroid/view/View;)Landroidx/fragment/app/SpecialEffectsController$Operation$State;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public final androidx.fragment.app.SpecialEffectsController.Operation.State asOperationState(android.view.View view) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
                    if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                        return androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE;
                    }
                    return from(view.getVisibility());
                }

                @kotlin.jvm.JvmStatic
                public final androidx.fragment.app.SpecialEffectsController.Operation.State from(int visibility) {
                    if (visibility == 0) {
                        return androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE;
                    }
                    if (visibility == 4) {
                        return androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE;
                    }
                    if (visibility == 8) {
                        return androidx.fragment.app.SpecialEffectsController.Operation.State.GONE;
                    }
                    throw new java.lang.IllegalArgumentException("Unknown visibility ".concat(java.lang.String.valueOf(visibility)));
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[androidx.fragment.app.SpecialEffectsController.Operation.State.values().length];
                    try {
                        iArr[androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[androidx.fragment.app.SpecialEffectsController.Operation.State.GONE.ordinal()] = 3;
                    } catch (java.lang.NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE.ordinal()] = 4;
                    } catch (java.lang.NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @kotlin.jvm.JvmStatic
            public static final androidx.fragment.app.SpecialEffectsController.Operation.State from(int i) {
                return INSTANCE.from(i);
            }
        }

        /* renamed from: isCanceled, reason: from getter */
        public final boolean getIsCanceled() {
            return this.isCanceled;
        }

        /* renamed from: isComplete, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        /* renamed from: isSeeking, reason: from getter */
        public final boolean getIsSeeking() {
            return this.isSeeking;
        }

        public final void setSeeking$fragment_release(boolean z) {
            this.isSeeking = z;
        }

        /* renamed from: isStarted, reason: from getter */
        public final boolean getIsStarted() {
            return this.isStarted;
        }

        /* renamed from: isAwaitingContainerChanges, reason: from getter */
        public final boolean getIsAwaitingContainerChanges() {
            return this.isAwaitingContainerChanges;
        }

        public final void setAwaitingContainerChanges(boolean z) {
            this.isAwaitingContainerChanges = z;
        }

        public final java.util.List<androidx.fragment.app.SpecialEffectsController.Effect> getEffects$fragment_release() {
            return this.effects;
        }

        public java.lang.String toString() {
            java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Operation {");
            sb.append(hexString);
            sb.append("} {finalState = ");
            sb.append(this.finalState);
            sb.append(" lifecycleImpact = ");
            sb.append(this.lifecycleImpact);
            sb.append(" fragment = ");
            sb.append(this.fragment);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
            return sb.toString();
        }

        public final void cancel(android.view.ViewGroup container) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "");
            this.isStarted = false;
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                complete$fragment_release();
                return;
            }
            java.util.Iterator it = kotlin.collections.CollectionsKt.toList(this.effects).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.SpecialEffectsController.Effect) it.next()).cancel(container);
            }
        }

        public final void mergeWith(androidx.fragment.app.SpecialEffectsController.Operation.State finalState, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(finalState, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleImpact, "");
            int i = androidx.fragment.app.SpecialEffectsController.Operation.WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
            if (i == 1) {
                if (this.finalState == androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED) {
                    androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                    this.finalState = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE;
                    this.lifecycleImpact = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING;
                    this.isAwaitingContainerChanges = true;
                    return;
                }
                return;
            }
            if (i == 2) {
                androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                this.finalState = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED;
                this.lifecycleImpact = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING;
                this.isAwaitingContainerChanges = true;
                return;
            }
            if (i != 3 || this.finalState == androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED) {
                return;
            }
            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
            this.finalState = finalState;
        }

        public final void addCompletionListener(java.lang.Runnable listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
            this.getHighSpeedVideoFpsRanges.add(listener);
        }

        public final void addEffect(androidx.fragment.app.SpecialEffectsController.Effect effect) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(effect, "");
            this.getHighSpeedVideoFpsRangesFor.add(effect);
        }

        public final void completeEffect(androidx.fragment.app.SpecialEffectsController.Effect effect) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(effect, "");
            if (this.getHighSpeedVideoFpsRangesFor.remove(effect) && this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                complete$fragment_release();
            }
        }

        public void onStart() {
            this.isStarted = true;
        }

        public void complete$fragment_release() {
            this.isStarted = false;
            if (this.isComplete) {
                return;
            }
            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
            this.isComplete = true;
            java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.values().length];
                try {
                    iArr[androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$FragmentStateManagerOperation;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "p0", "Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "p1", "Landroidx/fragment/app/FragmentStateManager;", "p2", "<init>", "(Landroidx/fragment/app/SpecialEffectsController$Operation$State;Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;Landroidx/fragment/app/FragmentStateManager;)V", "", "complete$fragment_release", "()V", "onStart", "getHighSpeedVideoFpsRanges", "Landroidx/fragment/app/FragmentStateManager;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class FragmentStateManagerOperation extends androidx.fragment.app.SpecialEffectsController.Operation {
        private final androidx.fragment.app.FragmentStateManager getHighSpeedVideoFpsRanges;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public FragmentStateManagerOperation(androidx.fragment.app.SpecialEffectsController.Operation.State state, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact, androidx.fragment.app.FragmentStateManager fragmentStateManager) {
            super(state, lifecycleImpact, r1);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleImpact, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentStateManager, "");
            androidx.fragment.app.Fragment Camera2StreamConfigurationMap = fragmentStateManager.Camera2StreamConfigurationMap();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(Camera2StreamConfigurationMap, "");
            this.getHighSpeedVideoFpsRanges = fragmentStateManager;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void onStart() {
            if (getIsStarted()) {
                return;
            }
            super.onStart();
            if (getLifecycleImpact() == androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
                androidx.fragment.app.Fragment Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(Camera2StreamConfigurationMap, "");
                android.view.View findFocus = Camera2StreamConfigurationMap.mView.findFocus();
                if (findFocus != null) {
                    Camera2StreamConfigurationMap.setFocusedView(findFocus);
                    androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                }
                android.view.View requireView = getFragment().requireView();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireView, "");
                if (requireView.getParent() == null) {
                    androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                    this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(Camera2StreamConfigurationMap.getPostOnViewCreatedAlpha());
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    Camera2StreamConfigurationMap.getPostOnViewCreatedAlpha();
                    return;
                }
                return;
            }
            if (getLifecycleImpact() == androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
                androidx.fragment.app.Fragment Camera2StreamConfigurationMap2 = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(Camera2StreamConfigurationMap2, "");
                android.view.View requireView2 = Camera2StreamConfigurationMap2.requireView();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireView2, "");
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    requireView2.findFocus();
                }
                requireView2.clearFocus();
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void complete$fragment_release() {
            super.complete$fragment_release();
            getFragment().mTransitioning = false;
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\bR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00118\u0017X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Effect;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Landroid/view/ViewGroup;)V", "onCancel", "onCommit", "Landroidx/activity/BackEventCompat;", "backEvent", "onProgress", "(Landroidx/activity/BackEventCompat;Landroid/view/ViewGroup;)V", "onStart", "performStart", "", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoFpsRanges", "isSeekingSupported", "()Z", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class Effect {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private boolean getHighSpeedVideoFpsRanges;
        private boolean getHighSpeedVideoFpsRangesFor;
        private final boolean isSeekingSupported;

        /* renamed from: isSeekingSupported, reason: from getter */
        public boolean getIsSeekingSupported() {
            return this.isSeekingSupported;
        }

        public final void performStart(android.view.ViewGroup container) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "");
            if (!this.getHighSpeedVideoFpsRangesFor) {
                onStart(container);
            }
            this.getHighSpeedVideoFpsRangesFor = true;
        }

        public final void cancel(android.view.ViewGroup container) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "");
            if (!this.getHighSpeedVideoFpsRanges) {
                onCancel(container);
            }
            this.getHighSpeedVideoFpsRanges = true;
        }

        public void onStart(android.view.ViewGroup container) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "");
        }

        public void onProgress(androidx.view.BackEventCompat backEvent, android.view.ViewGroup container) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backEvent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "");
        }

        public void onCommit(android.view.ViewGroup container) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "");
        }

        public void onCancel(android.view.ViewGroup container) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\t\u0010\r"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Companion;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/fragment/app/SpecialEffectsController;", "getOrCreateController", "(Landroid/view/ViewGroup;Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/SpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsControllerFactory;", "factory", "(Landroid/view/ViewGroup;Landroidx/fragment/app/SpecialEffectsControllerFactory;)Landroidx/fragment/app/SpecialEffectsController;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.fragment.app.SpecialEffectsController getOrCreateController(android.view.ViewGroup container, androidx.fragment.app.FragmentManager fragmentManager) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "");
            androidx.fragment.app.SpecialEffectsControllerFactory isOutputSupportedForhNQ4ISI = fragmentManager.isOutputSupportedForhNQ4ISI();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(isOutputSupportedForhNQ4ISI, "");
            return getOrCreateController(container, isOutputSupportedForhNQ4ISI);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.fragment.app.SpecialEffectsController getOrCreateController(android.view.ViewGroup container, androidx.fragment.app.SpecialEffectsControllerFactory factory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(container, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
            java.lang.Object tag = container.getTag(androidx.fragment.R.id.special_effects_controller_view_tag);
            if (tag instanceof androidx.fragment.app.SpecialEffectsController) {
                return (androidx.fragment.app.SpecialEffectsController) tag;
            }
            androidx.fragment.app.SpecialEffectsController highSpeedVideoFpsRanges = factory.getHighSpeedVideoFpsRanges(container);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(highSpeedVideoFpsRanges, "");
            container.setTag(androidx.fragment.R.id.special_effects_controller_view_tag, highSpeedVideoFpsRanges);
            return highSpeedVideoFpsRanges;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void $r8$lambda$TeCmoVW0hctjg0BNHLP6mPbAs5U(androidx.fragment.app.SpecialEffectsController specialEffectsController, androidx.fragment.app.SpecialEffectsController.FragmentStateManagerOperation fragmentStateManagerOperation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialEffectsController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentStateManagerOperation, "");
        if (specialEffectsController.getHighResolutionOutputSizeshNQ4ISI.contains(fragmentStateManagerOperation)) {
            androidx.fragment.app.SpecialEffectsController.Operation.State finalState = fragmentStateManagerOperation.getFinalState();
            android.view.View view = fragmentStateManagerOperation.getFragment().mView;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "");
            finalState.applyState(view, specialEffectsController.container);
        }
    }

    public static /* synthetic */ void $r8$lambda$ahdwWRJghvCwX2xG1GsepYfILrY(androidx.fragment.app.SpecialEffectsController specialEffectsController, androidx.fragment.app.SpecialEffectsController.FragmentStateManagerOperation fragmentStateManagerOperation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialEffectsController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentStateManagerOperation, "");
        specialEffectsController.getHighResolutionOutputSizeshNQ4ISI.remove(fragmentStateManagerOperation);
        specialEffectsController.Camera2StreamConfigurationMap.remove(fragmentStateManagerOperation);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.fragment.app.SpecialEffectsController getOrCreateController(android.view.ViewGroup viewGroup, androidx.fragment.app.SpecialEffectsControllerFactory specialEffectsControllerFactory) {
        return INSTANCE.getOrCreateController(viewGroup, specialEffectsControllerFactory);
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.values().length];
            try {
                iArr[androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.fragment.app.SpecialEffectsController getOrCreateController(android.view.ViewGroup viewGroup, androidx.fragment.app.FragmentManager fragmentManager) {
        return INSTANCE.getOrCreateController(viewGroup, fragmentManager);
    }
}
