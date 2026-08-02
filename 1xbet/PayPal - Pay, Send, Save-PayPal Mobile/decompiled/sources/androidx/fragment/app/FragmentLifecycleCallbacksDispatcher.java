package androidx.fragment.app;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001/B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0010J'\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u000eJ\u001d\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0010J%\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u000eJ\u001d\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u0010J\u001d\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u0010J/\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b \u0010\u0010J\u001d\u0010$\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\n¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010-"}, d2 = {"Landroidx/fragment/app/FragmentLifecycleCallbacksDispatcher;", "", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "Landroidx/fragment/app/Fragment;", "f", "Landroid/os/Bundle;", "savedInstanceState", "", "onlyRecursive", "", "dispatchOnFragmentActivityCreated", "(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V", "dispatchOnFragmentAttached", "(Landroidx/fragment/app/Fragment;Z)V", "dispatchOnFragmentCreated", "dispatchOnFragmentDestroyed", "dispatchOnFragmentDetached", "dispatchOnFragmentPaused", "dispatchOnFragmentPreAttached", "dispatchOnFragmentPreCreated", "dispatchOnFragmentResumed", "outState", "dispatchOnFragmentSaveInstanceState", "dispatchOnFragmentStarted", "dispatchOnFragmentStopped", "Landroid/view/View;", "v", "dispatchOnFragmentViewCreated", "(Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;Z)V", "dispatchOnFragmentViewDestroyed", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "cb", "recursive", "registerFragmentLifecycleCallbacks", "(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;Z)V", "unregisterFragmentLifecycleCallbacks", "(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;)V", "getHighSpeedVideoFpsRangesFor", "Landroidx/fragment/app/FragmentManager;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/fragment/app/FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getHighSpeedVideoSizes", "FragmentLifecycleCallbacksHolder"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FragmentLifecycleCallbacksDispatcher {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.fragment.app.FragmentManager getHighResolutionOutputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/fragment/app/FragmentLifecycleCallbacksDispatcher$FragmentLifecycleCallbacksHolder;", "", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "p0", "", "p1", "<init>", "(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;Z)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "getHighSpeedVideoFpsRangesFor", "()Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "getHighSpeedVideoFpsRanges", "Z", "getHighSpeedVideoSizes", "()Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class FragmentLifecycleCallbacksHolder {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final boolean getHighResolutionOutputSizeshNQ4ISI;

        public FragmentLifecycleCallbacksHolder(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentLifecycleCallbacks, "");
            this.getHighSpeedVideoFpsRangesFor = fragmentLifecycleCallbacks;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
        }

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
        public final androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        /* renamed from: getHighSpeedVideoSizes, reason: from getter */
        public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    public FragmentLifecycleCallbacksDispatcher(androidx.fragment.app.FragmentManager fragmentManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.getHighResolutionOutputSizeshNQ4ISI = fragmentManager;
        this.getHighSpeedVideoSizes = new java.util.concurrent.CopyOnWriteArrayList<>();
    }

    public final void registerFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks cb, boolean recursive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cb, "");
        this.getHighSpeedVideoSizes.add(new androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder(cb, recursive));
    }

    public final void unregisterFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks cb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cb, "");
        synchronized (this.getHighSpeedVideoSizes) {
            int size = this.getHighSpeedVideoSizes.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (this.getHighSpeedVideoSizes.get(i).getGetHighSpeedVideoFpsRangesFor() == cb) {
                    this.getHighSpeedVideoSizes.remove(i);
                    break;
                }
                i++;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void dispatchOnFragmentPreAttached(androidx.fragment.app.Fragment f, boolean onlyRecursive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "");
        android.content.Context context = this.getHighResolutionOutputSizeshNQ4ISI.getHost().getContext();
        androidx.fragment.app.Fragment unwrapAs = this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs();
        if (unwrapAs != null) {
            androidx.fragment.app.FragmentManager parentFragmentManager = unwrapAs.getParentFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            parentFragmentManager.getValidOutputFormatsForInputhNQ4ISI().dispatchOnFragmentPreAttached(f, true);
        }
        java.util.Iterator<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getGetHighResolutionOutputSizeshNQ4ISI()) {
                next.getGetHighSpeedVideoFpsRangesFor().onFragmentPreAttached(this.getHighResolutionOutputSizeshNQ4ISI, f, context);
            }
        }
    }

    public final void dispatchOnFragmentAttached(androidx.fragment.app.Fragment f, boolean onlyRecursive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "");
        android.content.Context context = this.getHighResolutionOutputSizeshNQ4ISI.getHost().getContext();
        androidx.fragment.app.Fragment unwrapAs = this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs();
        if (unwrapAs != null) {
            androidx.fragment.app.FragmentManager parentFragmentManager = unwrapAs.getParentFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            parentFragmentManager.getValidOutputFormatsForInputhNQ4ISI().dispatchOnFragmentAttached(f, true);
        }
        java.util.Iterator<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getGetHighResolutionOutputSizeshNQ4ISI()) {
                next.getGetHighSpeedVideoFpsRangesFor().onFragmentAttached(this.getHighResolutionOutputSizeshNQ4ISI, f, context);
            }
        }
    }

    public final void dispatchOnFragmentPreCreated(androidx.fragment.app.Fragment f, android.os.Bundle savedInstanceState, boolean onlyRecursive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "");
        androidx.fragment.app.Fragment unwrapAs = this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs();
        if (unwrapAs != null) {
            androidx.fragment.app.FragmentManager parentFragmentManager = unwrapAs.getParentFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            parentFragmentManager.getValidOutputFormatsForInputhNQ4ISI().dispatchOnFragmentPreCreated(f, savedInstanceState, true);
        }
        java.util.Iterator<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getGetHighResolutionOutputSizeshNQ4ISI()) {
                next.getGetHighSpeedVideoFpsRangesFor().onFragmentPreCreated(this.getHighResolutionOutputSizeshNQ4ISI, f, savedInstanceState);
            }
        }
    }

    public final void dispatchOnFragmentCreated(androidx.fragment.app.Fragment f, android.os.Bundle savedInstanceState, boolean onlyRecursive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "");
        androidx.fragment.app.Fragment unwrapAs = this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs();
        if (unwrapAs != null) {
            androidx.fragment.app.FragmentManager parentFragmentManager = unwrapAs.getParentFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            parentFragmentManager.getValidOutputFormatsForInputhNQ4ISI().dispatchOnFragmentCreated(f, savedInstanceState, true);
        }
        java.util.Iterator<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getGetHighResolutionOutputSizeshNQ4ISI()) {
                next.getGetHighSpeedVideoFpsRangesFor().onFragmentCreated(this.getHighResolutionOutputSizeshNQ4ISI, f, savedInstanceState);
            }
        }
    }

    public final void dispatchOnFragmentActivityCreated(androidx.fragment.app.Fragment f, android.os.Bundle savedInstanceState, boolean onlyRecursive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "");
        androidx.fragment.app.Fragment unwrapAs = this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs();
        if (unwrapAs != null) {
            androidx.fragment.app.FragmentManager parentFragmentManager = unwrapAs.getParentFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            parentFragmentManager.getValidOutputFormatsForInputhNQ4ISI().dispatchOnFragmentActivityCreated(f, savedInstanceState, true);
        }
        java.util.Iterator<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getGetHighResolutionOutputSizeshNQ4ISI()) {
                next.getGetHighSpeedVideoFpsRangesFor().onFragmentActivityCreated(this.getHighResolutionOutputSizeshNQ4ISI, f, savedInstanceState);
            }
        }
    }

    public final void dispatchOnFragmentViewCreated(androidx.fragment.app.Fragment f, android.view.View v, android.os.Bundle savedInstanceState, boolean onlyRecursive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "");
        androidx.fragment.app.Fragment unwrapAs = this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs();
        if (unwrapAs != null) {
            androidx.fragment.app.FragmentManager parentFragmentManager = unwrapAs.getParentFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            parentFragmentManager.getValidOutputFormatsForInputhNQ4ISI().dispatchOnFragmentViewCreated(f, v, savedInstanceState, true);
        }
        java.util.Iterator<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getGetHighResolutionOutputSizeshNQ4ISI()) {
                next.getGetHighSpeedVideoFpsRangesFor().onFragmentViewCreated(this.getHighResolutionOutputSizeshNQ4ISI, f, v, savedInstanceState);
            }
        }
    }

    public final void dispatchOnFragmentStarted(androidx.fragment.app.Fragment f, boolean onlyRecursive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "");
        androidx.fragment.app.Fragment unwrapAs = this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs();
        if (unwrapAs != null) {
            androidx.fragment.app.FragmentManager parentFragmentManager = unwrapAs.getParentFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            parentFragmentManager.getValidOutputFormatsForInputhNQ4ISI().dispatchOnFragmentStarted(f, true);
        }
        java.util.Iterator<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getGetHighResolutionOutputSizeshNQ4ISI()) {
                next.getGetHighSpeedVideoFpsRangesFor().onFragmentStarted(this.getHighResolutionOutputSizeshNQ4ISI, f);
            }
        }
    }

    public final void dispatchOnFragmentResumed(androidx.fragment.app.Fragment f, boolean onlyRecursive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "");
        androidx.fragment.app.Fragment unwrapAs = this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs();
        if (unwrapAs != null) {
            androidx.fragment.app.FragmentManager parentFragmentManager = unwrapAs.getParentFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            parentFragmentManager.getValidOutputFormatsForInputhNQ4ISI().dispatchOnFragmentResumed(f, true);
        }
        java.util.Iterator<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getGetHighResolutionOutputSizeshNQ4ISI()) {
                next.getGetHighSpeedVideoFpsRangesFor().onFragmentResumed(this.getHighResolutionOutputSizeshNQ4ISI, f);
            }
        }
    }

    public final void dispatchOnFragmentPaused(androidx.fragment.app.Fragment f, boolean onlyRecursive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "");
        androidx.fragment.app.Fragment unwrapAs = this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs();
        if (unwrapAs != null) {
            androidx.fragment.app.FragmentManager parentFragmentManager = unwrapAs.getParentFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            parentFragmentManager.getValidOutputFormatsForInputhNQ4ISI().dispatchOnFragmentPaused(f, true);
        }
        java.util.Iterator<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getGetHighResolutionOutputSizeshNQ4ISI()) {
                next.getGetHighSpeedVideoFpsRangesFor().onFragmentPaused(this.getHighResolutionOutputSizeshNQ4ISI, f);
            }
        }
    }

    public final void dispatchOnFragmentStopped(androidx.fragment.app.Fragment f, boolean onlyRecursive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "");
        androidx.fragment.app.Fragment unwrapAs = this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs();
        if (unwrapAs != null) {
            androidx.fragment.app.FragmentManager parentFragmentManager = unwrapAs.getParentFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            parentFragmentManager.getValidOutputFormatsForInputhNQ4ISI().dispatchOnFragmentStopped(f, true);
        }
        java.util.Iterator<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getGetHighResolutionOutputSizeshNQ4ISI()) {
                next.getGetHighSpeedVideoFpsRangesFor().onFragmentStopped(this.getHighResolutionOutputSizeshNQ4ISI, f);
            }
        }
    }

    public final void dispatchOnFragmentSaveInstanceState(androidx.fragment.app.Fragment f, android.os.Bundle outState, boolean onlyRecursive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outState, "");
        androidx.fragment.app.Fragment unwrapAs = this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs();
        if (unwrapAs != null) {
            androidx.fragment.app.FragmentManager parentFragmentManager = unwrapAs.getParentFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            parentFragmentManager.getValidOutputFormatsForInputhNQ4ISI().dispatchOnFragmentSaveInstanceState(f, outState, true);
        }
        java.util.Iterator<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getGetHighResolutionOutputSizeshNQ4ISI()) {
                next.getGetHighSpeedVideoFpsRangesFor().onFragmentSaveInstanceState(this.getHighResolutionOutputSizeshNQ4ISI, f, outState);
            }
        }
    }

    public final void dispatchOnFragmentViewDestroyed(androidx.fragment.app.Fragment f, boolean onlyRecursive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "");
        androidx.fragment.app.Fragment unwrapAs = this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs();
        if (unwrapAs != null) {
            androidx.fragment.app.FragmentManager parentFragmentManager = unwrapAs.getParentFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            parentFragmentManager.getValidOutputFormatsForInputhNQ4ISI().dispatchOnFragmentViewDestroyed(f, true);
        }
        java.util.Iterator<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getGetHighResolutionOutputSizeshNQ4ISI()) {
                next.getGetHighSpeedVideoFpsRangesFor().onFragmentViewDestroyed(this.getHighResolutionOutputSizeshNQ4ISI, f);
            }
        }
    }

    public final void dispatchOnFragmentDestroyed(androidx.fragment.app.Fragment f, boolean onlyRecursive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "");
        androidx.fragment.app.Fragment unwrapAs = this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs();
        if (unwrapAs != null) {
            androidx.fragment.app.FragmentManager parentFragmentManager = unwrapAs.getParentFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            parentFragmentManager.getValidOutputFormatsForInputhNQ4ISI().dispatchOnFragmentDestroyed(f, true);
        }
        java.util.Iterator<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getGetHighResolutionOutputSizeshNQ4ISI()) {
                next.getGetHighSpeedVideoFpsRangesFor().onFragmentDestroyed(this.getHighResolutionOutputSizeshNQ4ISI, f);
            }
        }
    }

    public final void dispatchOnFragmentDetached(androidx.fragment.app.Fragment f, boolean onlyRecursive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "");
        androidx.fragment.app.Fragment unwrapAs = this.getHighResolutionOutputSizeshNQ4ISI.unwrapAs();
        if (unwrapAs != null) {
            androidx.fragment.app.FragmentManager parentFragmentManager = unwrapAs.getParentFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            parentFragmentManager.getValidOutputFormatsForInputhNQ4ISI().dispatchOnFragmentDetached(f, true);
        }
        java.util.Iterator<androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder next = it.next();
            if (!onlyRecursive || next.getGetHighResolutionOutputSizeshNQ4ISI()) {
                next.getGetHighSpeedVideoFpsRangesFor().onFragmentDetached(this.getHighResolutionOutputSizeshNQ4ISI, f);
            }
        }
    }
}
