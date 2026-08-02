package androidx.viewpager2.adapter;

/* loaded from: classes7.dex */
public abstract class FragmentStateAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.viewpager2.adapter.FragmentViewHolder> implements androidx.viewpager2.adapter.StatefulAdapter {
    private static final long GRACE_WINDOW_TIME_MS = 10000;
    private static final java.lang.String KEY_PREFIX_FRAGMENT = "f#";
    private static final java.lang.String KEY_PREFIX_STATE = "s#";
    androidx.viewpager2.adapter.FragmentStateAdapter.FragmentEventDispatcher mFragmentEventDispatcher;
    final androidx.fragment.app.FragmentManager mFragmentManager;
    private androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer mFragmentMaxLifecycleEnforcer;
    final androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> mFragments;
    private boolean mHasStaleFragments;
    boolean mIsInGracePeriod;
    private final androidx.collection.LongSparseArray<java.lang.Integer> mItemIdToViewHolder;
    final androidx.view.Lifecycle mLifecycle;
    private final androidx.collection.LongSparseArray<androidx.fragment.app.Fragment.SavedState> mSavedStates;

    /* loaded from: classes3.dex */
    public @interface ExperimentalFragmentStateAdapterApi {
    }

    public abstract androidx.fragment.app.Fragment createFragment(int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(androidx.viewpager2.adapter.FragmentViewHolder fragmentViewHolder) {
        return true;
    }

    public FragmentStateAdapter(androidx.fragment.app.FragmentActivity fragmentActivity) {
        this(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
    }

    public FragmentStateAdapter(androidx.fragment.app.Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public FragmentStateAdapter(androidx.fragment.app.FragmentManager fragmentManager, androidx.view.Lifecycle lifecycle) {
        this.mFragments = new androidx.collection.LongSparseArray<>();
        this.mSavedStates = new androidx.collection.LongSparseArray<>();
        this.mItemIdToViewHolder = new androidx.collection.LongSparseArray<>();
        this.mFragmentEventDispatcher = new androidx.viewpager2.adapter.FragmentStateAdapter.FragmentEventDispatcher();
        this.mIsInGracePeriod = false;
        this.mHasStaleFragments = false;
        this.mFragmentManager = fragmentManager;
        this.mLifecycle = lifecycle;
        super.setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.core.util.Preconditions.checkArgument(this.mFragmentMaxLifecycleEnforcer == null);
        final androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer();
        this.mFragmentMaxLifecycleEnforcer = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.getHighSpeedVideoFpsRanges = androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.getHighSpeedVideoFpsRangesFor(recyclerView);
        androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onPageChangeCallback = new androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int i) {
                androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.this.getHighResolutionOutputSizeshNQ4ISI(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i) {
                androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.this.getHighResolutionOutputSizeshNQ4ISI(false);
            }
        };
        fragmentMaxLifecycleEnforcer.getHighSpeedVideoSizes = onPageChangeCallback;
        fragmentMaxLifecycleEnforcer.getHighSpeedVideoFpsRanges.registerOnPageChangeCallback(onPageChangeCallback);
        androidx.viewpager2.adapter.FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver = new androidx.viewpager2.adapter.FragmentStateAdapter.DataSetChangeObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.2
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.this.getHighResolutionOutputSizeshNQ4ISI(true);
            }
        };
        fragmentMaxLifecycleEnforcer.getHighResolutionOutputSizeshNQ4ISI = dataSetChangeObserver;
        androidx.viewpager2.adapter.FragmentStateAdapter.this.registerAdapterDataObserver(dataSetChangeObserver);
        fragmentMaxLifecycleEnforcer.Camera2StreamConfigurationMap = new androidx.view.LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
            @Override // androidx.view.LifecycleEventObserver
            public void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.this.getHighResolutionOutputSizeshNQ4ISI(false);
            }
        };
        androidx.viewpager2.adapter.FragmentStateAdapter.this.mLifecycle.addObserver(fragmentMaxLifecycleEnforcer.Camera2StreamConfigurationMap);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = this.mFragmentMaxLifecycleEnforcer;
        androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.getHighSpeedVideoFpsRangesFor(recyclerView).unregisterOnPageChangeCallback(fragmentMaxLifecycleEnforcer.getHighSpeedVideoSizes);
        androidx.viewpager2.adapter.FragmentStateAdapter.this.unregisterAdapterDataObserver(fragmentMaxLifecycleEnforcer.getHighResolutionOutputSizeshNQ4ISI);
        androidx.viewpager2.adapter.FragmentStateAdapter.this.mLifecycle.removeObserver(fragmentMaxLifecycleEnforcer.Camera2StreamConfigurationMap);
        fragmentMaxLifecycleEnforcer.getHighSpeedVideoFpsRanges = null;
        this.mFragmentMaxLifecycleEnforcer = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final androidx.viewpager2.adapter.FragmentViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        return androidx.viewpager2.adapter.FragmentViewHolder.getHighSpeedVideoFpsRangesFor(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(androidx.viewpager2.adapter.FragmentViewHolder fragmentViewHolder, int i) {
        long itemId = fragmentViewHolder.getItemId();
        int id = ((android.widget.FrameLayout) fragmentViewHolder.itemView).getId();
        java.lang.Long itemForViewHolder = itemForViewHolder(id);
        if (itemForViewHolder != null && itemForViewHolder.longValue() != itemId) {
            removeFragment(itemForViewHolder.longValue());
            this.mItemIdToViewHolder.remove(itemForViewHolder.longValue());
        }
        this.mItemIdToViewHolder.put(itemId, java.lang.Integer.valueOf(id));
        ensureFragment(i);
        if (((android.widget.FrameLayout) fragmentViewHolder.itemView).isAttachedToWindow()) {
            placeFragmentInViewHolder(fragmentViewHolder);
        }
        gcFragments();
    }

    void gcFragments() {
        if (!this.mHasStaleFragments || shouldDelayFragmentTransactions()) {
            return;
        }
        androidx.collection.ArraySet arraySet = new androidx.collection.ArraySet();
        for (int i = 0; i < this.mFragments.size(); i++) {
            long keyAt = this.mFragments.keyAt(i);
            if (!containsItem(keyAt)) {
                arraySet.add(java.lang.Long.valueOf(keyAt));
                this.mItemIdToViewHolder.remove(keyAt);
            }
        }
        if (!this.mIsInGracePeriod) {
            this.mHasStaleFragments = false;
            for (int i2 = 0; i2 < this.mFragments.size(); i2++) {
                long keyAt2 = this.mFragments.keyAt(i2);
                if (!isFragmentViewBound(keyAt2)) {
                    arraySet.add(java.lang.Long.valueOf(keyAt2));
                }
            }
        }
        java.util.Iterator<E> it = arraySet.iterator();
        while (it.hasNext()) {
            removeFragment(((java.lang.Long) it.next()).longValue());
        }
    }

    private boolean isFragmentViewBound(long j) {
        android.view.View view;
        if (this.mItemIdToViewHolder.containsKey(j)) {
            return true;
        }
        androidx.fragment.app.Fragment fragment = this.mFragments.get(j);
        return (fragment == null || (view = fragment.getView()) == null || view.getParent() == null) ? false : true;
    }

    private java.lang.Long itemForViewHolder(int i) {
        java.lang.Long l = null;
        for (int i2 = 0; i2 < this.mItemIdToViewHolder.size(); i2++) {
            if (this.mItemIdToViewHolder.valueAt(i2).intValue() == i) {
                if (l != null) {
                    throw new java.lang.IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                l = java.lang.Long.valueOf(this.mItemIdToViewHolder.keyAt(i2));
            }
        }
        return l;
    }

    private void ensureFragment(int i) {
        long itemId = getItemId(i);
        if (this.mFragments.containsKey(itemId)) {
            return;
        }
        androidx.fragment.app.Fragment createFragment = createFragment(i);
        createFragment.setInitialSavedState(this.mSavedStates.get(itemId));
        this.mFragments.put(itemId, createFragment);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(androidx.viewpager2.adapter.FragmentViewHolder fragmentViewHolder) {
        placeFragmentInViewHolder(fragmentViewHolder);
        gcFragments();
    }

    void placeFragmentInViewHolder(final androidx.viewpager2.adapter.FragmentViewHolder fragmentViewHolder) {
        androidx.fragment.app.Fragment fragment = this.mFragments.get(fragmentViewHolder.getItemId());
        if (fragment == null) {
            throw new java.lang.IllegalStateException("Design assumption violated.");
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) fragmentViewHolder.itemView;
        android.view.View view = fragment.getView();
        if (!fragment.isAdded() && view != null) {
            throw new java.lang.IllegalStateException("Design assumption violated.");
        }
        if (fragment.isAdded() && view == null) {
            scheduleViewAttach(fragment, frameLayout);
            return;
        }
        if (fragment.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                addViewToContainer(view, frameLayout);
                return;
            }
            return;
        }
        if (fragment.isAdded()) {
            addViewToContainer(view, frameLayout);
            return;
        }
        if (!shouldDelayFragmentTransactions()) {
            scheduleViewAttach(fragment, frameLayout);
            androidx.viewpager2.adapter.FragmentStateAdapter.FragmentEventDispatcher fragmentEventDispatcher = this.mFragmentEventDispatcher;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback> it = fragmentEventDispatcher.getHighSpeedVideoSizes.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().onFragmentPreAdded(fragment));
            }
            try {
                fragment.setMenuVisibility(false);
                androidx.fragment.app.FragmentTransaction beginTransaction = this.mFragmentManager.beginTransaction();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("f");
                sb.append(fragmentViewHolder.getItemId());
                beginTransaction.add(fragment, sb.toString()).setMaxLifecycle(fragment, androidx.lifecycle.Lifecycle.State.STARTED).commitNow();
                this.mFragmentMaxLifecycleEnforcer.getHighResolutionOutputSizeshNQ4ISI(false);
                return;
            } finally {
                androidx.viewpager2.adapter.FragmentStateAdapter.FragmentEventDispatcher.getHighResolutionOutputSizeshNQ4ISI(arrayList);
            }
        }
        if (this.mFragmentManager.isDestroyed()) {
            return;
        }
        this.mLifecycle.addObserver(new androidx.view.LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.1
            @Override // androidx.view.LifecycleEventObserver
            public void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                if (androidx.viewpager2.adapter.FragmentStateAdapter.this.shouldDelayFragmentTransactions()) {
                    return;
                }
                lifecycleOwner.getLifecycle().removeObserver(this);
                if (((android.widget.FrameLayout) fragmentViewHolder.itemView).isAttachedToWindow()) {
                    androidx.viewpager2.adapter.FragmentStateAdapter.this.placeFragmentInViewHolder(fragmentViewHolder);
                }
            }
        });
    }

    private void scheduleViewAttach(final androidx.fragment.app.Fragment fragment, final android.widget.FrameLayout frameLayout) {
        this.mFragmentManager.registerFragmentLifecycleCallbacks(new androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
            @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentViewCreated(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment2, android.view.View view, android.os.Bundle bundle) {
                if (fragment2 == fragment) {
                    fragmentManager.unregisterFragmentLifecycleCallbacks(this);
                    androidx.viewpager2.adapter.FragmentStateAdapter.this.addViewToContainer(view, frameLayout);
                }
            }
        }, false);
    }

    void addViewToContainer(android.view.View view, android.widget.FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new java.lang.IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((android.view.ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    private void removeFragment(long j) {
        android.view.ViewParent parent;
        androidx.fragment.app.Fragment fragment = this.mFragments.get(j);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((android.widget.FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j)) {
            this.mSavedStates.remove(j);
        }
        if (!fragment.isAdded()) {
            this.mFragments.remove(j);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            this.mHasStaleFragments = true;
            return;
        }
        if (fragment.isAdded() && containsItem(j)) {
            androidx.viewpager2.adapter.FragmentStateAdapter.FragmentEventDispatcher fragmentEventDispatcher = this.mFragmentEventDispatcher;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback> it = fragmentEventDispatcher.getHighSpeedVideoSizes.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().onFragmentPreSavedInstanceState(fragment));
            }
            androidx.fragment.app.Fragment.SavedState saveFragmentInstanceState = this.mFragmentManager.saveFragmentInstanceState(fragment);
            androidx.viewpager2.adapter.FragmentStateAdapter.FragmentEventDispatcher.getHighResolutionOutputSizeshNQ4ISI(arrayList);
            this.mSavedStates.put(j, saveFragmentInstanceState);
        }
        androidx.viewpager2.adapter.FragmentStateAdapter.FragmentEventDispatcher fragmentEventDispatcher2 = this.mFragmentEventDispatcher;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback> it2 = fragmentEventDispatcher2.getHighSpeedVideoSizes.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().onFragmentPreRemoved(fragment));
        }
        try {
            this.mFragmentManager.beginTransaction().remove(fragment).commitNow();
            this.mFragments.remove(j);
        } finally {
            androidx.viewpager2.adapter.FragmentStateAdapter.FragmentEventDispatcher.getHighResolutionOutputSizeshNQ4ISI(arrayList2);
        }
    }

    boolean shouldDelayFragmentTransactions() {
        return this.mFragmentManager.isStateSaved();
    }

    public boolean containsItem(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
        throw new java.lang.UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final android.os.Parcelable saveState() {
        android.os.Bundle bundle = new android.os.Bundle(this.mFragments.size() + this.mSavedStates.size());
        for (int i = 0; i < this.mFragments.size(); i++) {
            long keyAt = this.mFragments.keyAt(i);
            androidx.fragment.app.Fragment fragment = this.mFragments.get(keyAt);
            if (fragment != null && fragment.isAdded()) {
                this.mFragmentManager.putFragment(bundle, createKey(KEY_PREFIX_FRAGMENT, keyAt), fragment);
            }
        }
        for (int i2 = 0; i2 < this.mSavedStates.size(); i2++) {
            long keyAt2 = this.mSavedStates.keyAt(i2);
            if (containsItem(keyAt2)) {
                bundle.putParcelable(createKey(KEY_PREFIX_STATE, keyAt2), this.mSavedStates.get(keyAt2));
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final void restoreState(android.os.Parcelable parcelable) {
        if (!this.mSavedStates.isEmpty() || !this.mFragments.isEmpty()) {
            throw new java.lang.IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        android.os.Bundle bundle = (android.os.Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (java.lang.String str : bundle.keySet()) {
            if (isValidKey(str, KEY_PREFIX_FRAGMENT)) {
                this.mFragments.put(parseIdFromKey(str, KEY_PREFIX_FRAGMENT), this.mFragmentManager.getFragment(bundle, str));
            } else if (isValidKey(str, KEY_PREFIX_STATE)) {
                long parseIdFromKey = parseIdFromKey(str, KEY_PREFIX_STATE);
                androidx.fragment.app.Fragment.SavedState savedState = (androidx.fragment.app.Fragment.SavedState) bundle.getParcelable(str);
                if (containsItem(parseIdFromKey)) {
                    this.mSavedStates.put(parseIdFromKey, savedState);
                }
            } else {
                throw new java.lang.IllegalArgumentException("Unexpected key in savedState: ".concat(java.lang.String.valueOf(str)));
            }
        }
        if (this.mFragments.isEmpty()) {
            return;
        }
        this.mHasStaleFragments = true;
        this.mIsInGracePeriod = true;
        gcFragments();
        scheduleGracePeriodEnd();
    }

    private void scheduleGracePeriodEnd() {
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        final java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                androidx.viewpager2.adapter.FragmentStateAdapter.this.mIsInGracePeriod = false;
                androidx.viewpager2.adapter.FragmentStateAdapter.this.gcFragments();
            }
        };
        this.mLifecycle.addObserver(new androidx.view.LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.4
            @Override // androidx.view.LifecycleEventObserver
            public void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
                    handler.removeCallbacks(runnable);
                    lifecycleOwner.getLifecycle().removeObserver(this);
                }
            }
        });
        handler.postDelayed(runnable, 10000L);
    }

    private static java.lang.String createKey(java.lang.String str, long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(j);
        return sb.toString();
    }

    private static boolean isValidKey(java.lang.String str, java.lang.String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private static long parseIdFromKey(java.lang.String str, java.lang.String str2) {
        return java.lang.Long.parseLong(str.substring(str2.length()));
    }

    class FragmentMaxLifecycleEnforcer {
        androidx.view.LifecycleEventObserver Camera2StreamConfigurationMap;
        androidx.recyclerview.widget.RecyclerView.AdapterDataObserver getHighResolutionOutputSizeshNQ4ISI;
        androidx.viewpager2.widget.ViewPager2 getHighSpeedVideoFpsRanges;
        androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback getHighSpeedVideoSizes;
        private long getOutputFormats = -1;

        FragmentMaxLifecycleEnforcer() {
        }

        final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
            int currentItem;
            androidx.fragment.app.Fragment fragment;
            if (androidx.viewpager2.adapter.FragmentStateAdapter.this.shouldDelayFragmentTransactions() || this.getHighSpeedVideoFpsRanges.getScrollState() != 0 || androidx.viewpager2.adapter.FragmentStateAdapter.this.mFragments.isEmpty() || androidx.viewpager2.adapter.FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.getHighSpeedVideoFpsRanges.getCurrentItem()) >= androidx.viewpager2.adapter.FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = androidx.viewpager2.adapter.FragmentStateAdapter.this.getItemId(currentItem);
            if ((itemId != this.getOutputFormats || z) && (fragment = androidx.viewpager2.adapter.FragmentStateAdapter.this.mFragments.get(itemId)) != null && fragment.isAdded()) {
                this.getOutputFormats = itemId;
                androidx.fragment.app.FragmentTransaction beginTransaction = androidx.viewpager2.adapter.FragmentStateAdapter.this.mFragmentManager.beginTransaction();
                java.util.ArrayList<java.util.List> arrayList = new java.util.ArrayList();
                androidx.fragment.app.Fragment fragment2 = null;
                for (int i = 0; i < androidx.viewpager2.adapter.FragmentStateAdapter.this.mFragments.size(); i++) {
                    long keyAt = androidx.viewpager2.adapter.FragmentStateAdapter.this.mFragments.keyAt(i);
                    androidx.fragment.app.Fragment valueAt = androidx.viewpager2.adapter.FragmentStateAdapter.this.mFragments.valueAt(i);
                    if (valueAt.isAdded()) {
                        if (keyAt != this.getOutputFormats) {
                            beginTransaction.setMaxLifecycle(valueAt, androidx.lifecycle.Lifecycle.State.STARTED);
                            arrayList.add(androidx.viewpager2.adapter.FragmentStateAdapter.this.mFragmentEventDispatcher.getHighSpeedVideoSizes(valueAt, androidx.lifecycle.Lifecycle.State.STARTED));
                        } else {
                            fragment2 = valueAt;
                        }
                        valueAt.setMenuVisibility(keyAt == this.getOutputFormats);
                    }
                }
                if (fragment2 != null) {
                    beginTransaction.setMaxLifecycle(fragment2, androidx.lifecycle.Lifecycle.State.RESUMED);
                    arrayList.add(androidx.viewpager2.adapter.FragmentStateAdapter.this.mFragmentEventDispatcher.getHighSpeedVideoSizes(fragment2, androidx.lifecycle.Lifecycle.State.RESUMED));
                }
                if (beginTransaction.isEmpty()) {
                    return;
                }
                beginTransaction.commitNow();
                java.util.Collections.reverse(arrayList);
                for (java.util.List list : arrayList) {
                    androidx.viewpager2.adapter.FragmentStateAdapter.FragmentEventDispatcher fragmentEventDispatcher = androidx.viewpager2.adapter.FragmentStateAdapter.this.mFragmentEventDispatcher;
                    androidx.viewpager2.adapter.FragmentStateAdapter.FragmentEventDispatcher.getHighResolutionOutputSizeshNQ4ISI(list);
                }
            }
        }

        static androidx.viewpager2.widget.ViewPager2 getHighSpeedVideoFpsRangesFor(androidx.recyclerview.widget.RecyclerView recyclerView) {
            android.view.ViewParent parent = recyclerView.getParent();
            if (parent instanceof androidx.viewpager2.widget.ViewPager2) {
                return (androidx.viewpager2.widget.ViewPager2) parent;
            }
            throw new java.lang.IllegalStateException("Expected ViewPager2 instance. Got: ".concat(java.lang.String.valueOf(parent)));
        }
    }

    static abstract class DataSetChangeObserver extends androidx.recyclerview.widget.RecyclerView.AdapterDataObserver {
        private DataSetChangeObserver() {
        }

        /* synthetic */ DataSetChangeObserver(byte b) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2, java.lang.Object obj) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }
    }

    static class FragmentEventDispatcher {
        java.util.List<androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback> getHighSpeedVideoSizes = new java.util.concurrent.CopyOnWriteArrayList();

        FragmentEventDispatcher() {
        }

        public final java.util.List<androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener> getHighSpeedVideoSizes(androidx.fragment.app.Fragment fragment, androidx.lifecycle.Lifecycle.State state) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback> it = this.getHighSpeedVideoSizes.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().onFragmentMaxLifecyclePreUpdated(fragment, state));
            }
            return arrayList;
        }

        public static void getHighResolutionOutputSizeshNQ4ISI(java.util.List<androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener> list) {
            java.util.Iterator<androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().onPost();
            }
        }
    }

    public static abstract class FragmentTransactionCallback {
        private static final androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener Camera2StreamConfigurationMap = new androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.1
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener
            public void onPost() {
            }
        };

        public interface OnPostEventListener {
            void onPost();
        }

        public androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener onFragmentPreAdded(androidx.fragment.app.Fragment fragment) {
            return Camera2StreamConfigurationMap;
        }

        public androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener onFragmentPreSavedInstanceState(androidx.fragment.app.Fragment fragment) {
            return Camera2StreamConfigurationMap;
        }

        public androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener onFragmentPreRemoved(androidx.fragment.app.Fragment fragment) {
            return Camera2StreamConfigurationMap;
        }

        public androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener onFragmentMaxLifecyclePreUpdated(androidx.fragment.app.Fragment fragment, androidx.lifecycle.Lifecycle.State state) {
            return Camera2StreamConfigurationMap;
        }
    }

    public void registerFragmentTransactionCallback(androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback fragmentTransactionCallback) {
        this.mFragmentEventDispatcher.getHighSpeedVideoSizes.add(fragmentTransactionCallback);
    }

    public void unregisterFragmentTransactionCallback(androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback fragmentTransactionCallback) {
        this.mFragmentEventDispatcher.getHighSpeedVideoSizes.remove(fragmentTransactionCallback);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(androidx.viewpager2.adapter.FragmentViewHolder fragmentViewHolder) {
        java.lang.Long itemForViewHolder = itemForViewHolder(((android.widget.FrameLayout) fragmentViewHolder.itemView).getId());
        if (itemForViewHolder != null) {
            removeFragment(itemForViewHolder.longValue());
            this.mItemIdToViewHolder.remove(itemForViewHolder.longValue());
        }
    }
}
