package androidx.loader.app;

/* loaded from: classes3.dex */
class LoaderManagerImpl extends androidx.loader.app.LoaderManager {
    static boolean getHighSpeedVideoSizes = false;
    private final androidx.loader.app.LoaderManagerImpl.LoaderViewModel Camera2StreamConfigurationMap;
    private final androidx.view.LifecycleOwner getHighSpeedVideoFpsRangesFor;

    public static class LoaderInfo<D> extends androidx.view.MutableLiveData<D> implements androidx.loader.content.Loader.OnLoadCompleteListener<D> {
        androidx.loader.app.LoaderManagerImpl.LoaderObserver<D> Camera2StreamConfigurationMap;
        private final int getHighResolutionOutputSizeshNQ4ISI;
        private androidx.view.LifecycleOwner getHighSpeedVideoFpsRanges;
        private final android.os.Bundle getHighSpeedVideoFpsRangesFor;
        final androidx.loader.content.Loader<D> getHighSpeedVideoSizes;
        private androidx.loader.content.Loader<D> getOutputFormats;

        LoaderInfo(int i, android.os.Bundle bundle, androidx.loader.content.Loader<D> loader, androidx.loader.content.Loader<D> loader2) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoFpsRangesFor = bundle;
            this.getHighSpeedVideoSizes = loader;
            this.getOutputFormats = loader2;
            loader.registerListener(i, this);
        }

        @Override // androidx.view.LiveData
        public void onActive() {
            boolean z = androidx.loader.app.LoaderManagerImpl.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes.startLoading();
        }

        @Override // androidx.view.LiveData
        public void onInactive() {
            boolean z = androidx.loader.app.LoaderManagerImpl.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes.stopLoading();
        }

        final androidx.loader.content.Loader<D> Camera2StreamConfigurationMap(androidx.view.LifecycleOwner lifecycleOwner, androidx.loader.app.LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
            androidx.loader.app.LoaderManagerImpl.LoaderObserver<D> loaderObserver = new androidx.loader.app.LoaderManagerImpl.LoaderObserver<>(this.getHighSpeedVideoSizes, loaderCallbacks);
            observe(lifecycleOwner, loaderObserver);
            androidx.loader.app.LoaderManagerImpl.LoaderObserver<D> loaderObserver2 = this.Camera2StreamConfigurationMap;
            if (loaderObserver2 != null) {
                removeObserver(loaderObserver2);
            }
            this.getHighSpeedVideoFpsRanges = lifecycleOwner;
            this.Camera2StreamConfigurationMap = loaderObserver;
            return this.getHighSpeedVideoSizes;
        }

        final void getHighResolutionOutputSizeshNQ4ISI() {
            androidx.view.LifecycleOwner lifecycleOwner = this.getHighSpeedVideoFpsRanges;
            androidx.loader.app.LoaderManagerImpl.LoaderObserver<D> loaderObserver = this.Camera2StreamConfigurationMap;
            if (lifecycleOwner == null || loaderObserver == null) {
                return;
            }
            super.removeObserver(loaderObserver);
            observe(lifecycleOwner, loaderObserver);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.view.LiveData
        public void removeObserver(androidx.view.Observer<? super D> observer) {
            super.removeObserver(observer);
            this.getHighSpeedVideoFpsRanges = null;
            this.Camera2StreamConfigurationMap = null;
        }

        final androidx.loader.content.Loader<D> getHighResolutionOutputSizeshNQ4ISI(boolean z) {
            boolean z2 = androidx.loader.app.LoaderManagerImpl.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes.cancelLoad();
            this.getHighSpeedVideoSizes.abandon();
            androidx.loader.app.LoaderManagerImpl.LoaderObserver<D> loaderObserver = this.Camera2StreamConfigurationMap;
            if (loaderObserver != null) {
                removeObserver(loaderObserver);
                if (z && loaderObserver.Camera2StreamConfigurationMap) {
                    if (androidx.loader.app.LoaderManagerImpl.getHighSpeedVideoSizes) {
                        androidx.loader.content.Loader<D> loader = loaderObserver.getHighSpeedVideoFpsRangesFor;
                    }
                    loaderObserver.getHighSpeedVideoSizes.onLoaderReset(loaderObserver.getHighSpeedVideoFpsRangesFor);
                }
            }
            this.getHighSpeedVideoSizes.unregisterListener(this);
            if ((loaderObserver != null && !loaderObserver.Camera2StreamConfigurationMap) || z) {
                this.getHighSpeedVideoSizes.reset();
                return this.getOutputFormats;
            }
            return this.getHighSpeedVideoSizes;
        }

        @Override // androidx.loader.content.Loader.OnLoadCompleteListener
        public void onLoadComplete(androidx.loader.content.Loader<D> loader, D d) {
            boolean z = androidx.loader.app.LoaderManagerImpl.getHighSpeedVideoSizes;
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                setValue(d);
            } else {
                boolean z2 = androidx.loader.app.LoaderManagerImpl.getHighSpeedVideoSizes;
                postValue(d);
            }
        }

        @Override // androidx.view.MutableLiveData, androidx.view.LiveData
        public void setValue(D d) {
            super.setValue(d);
            androidx.loader.content.Loader<D> loader = this.getOutputFormats;
            if (loader != null) {
                loader.reset();
                this.getOutputFormats = null;
            }
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(" : ");
            java.lang.Class<?> cls = this.getHighSpeedVideoSizes.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(cls)));
            sb.append("}}");
            return sb.toString();
        }

        public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.getHighResolutionOutputSizeshNQ4ISI);
            printWriter.print(" mArgs=");
            printWriter.println(this.getHighSpeedVideoFpsRangesFor);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.getHighSpeedVideoSizes);
            androidx.loader.content.Loader<D> loader = this.getHighSpeedVideoSizes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append("  ");
            loader.dump(sb.toString(), fileDescriptor, printWriter, strArr);
            if (this.Camera2StreamConfigurationMap != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.Camera2StreamConfigurationMap);
                androidx.loader.app.LoaderManagerImpl.LoaderObserver<D> loaderObserver = this.Camera2StreamConfigurationMap;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append("  ");
                printWriter.print(sb2.toString());
                printWriter.print("mDeliveredData=");
                printWriter.println(loaderObserver.Camera2StreamConfigurationMap);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(this.getHighSpeedVideoSizes.dataToString(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }
    }

    static class LoaderObserver<D> implements androidx.view.Observer<D> {
        boolean Camera2StreamConfigurationMap = false;
        final androidx.loader.content.Loader<D> getHighSpeedVideoFpsRangesFor;
        final androidx.loader.app.LoaderManager.LoaderCallbacks<D> getHighSpeedVideoSizes;

        LoaderObserver(androidx.loader.content.Loader<D> loader, androidx.loader.app.LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
            this.getHighSpeedVideoFpsRangesFor = loader;
            this.getHighSpeedVideoSizes = loaderCallbacks;
        }

        @Override // androidx.view.Observer
        public void onChanged(D d) {
            if (androidx.loader.app.LoaderManagerImpl.getHighSpeedVideoSizes) {
                this.getHighSpeedVideoFpsRangesFor.dataToString(d);
            }
            this.Camera2StreamConfigurationMap = true;
            this.getHighSpeedVideoSizes.onLoadFinished(this.getHighSpeedVideoFpsRangesFor, d);
        }

        public java.lang.String toString() {
            return this.getHighSpeedVideoSizes.toString();
        }
    }

    static class LoaderViewModel extends androidx.view.ViewModel {
        private static final androidx.lifecycle.ViewModelProvider.Factory Camera2StreamConfigurationMap = new androidx.lifecycle.ViewModelProvider.Factory() { // from class: androidx.loader.app.LoaderManagerImpl.LoaderViewModel.1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends androidx.view.ViewModel> T create(java.lang.Class<T> cls) {
                return new androidx.loader.app.LoaderManagerImpl.LoaderViewModel();
            }
        };
        androidx.collection.SparseArrayCompat<androidx.loader.app.LoaderManagerImpl.LoaderInfo> getHighResolutionOutputSizeshNQ4ISI = new androidx.collection.SparseArrayCompat<>();
        boolean getHighSpeedVideoFpsRangesFor = false;

        LoaderViewModel() {
        }

        static androidx.loader.app.LoaderManagerImpl.LoaderViewModel getHighSpeedVideoFpsRanges(androidx.view.ViewModelStore viewModelStore) {
            return (androidx.loader.app.LoaderManagerImpl.LoaderViewModel) new androidx.view.ViewModelProvider(viewModelStore, Camera2StreamConfigurationMap).get(androidx.loader.app.LoaderManagerImpl.LoaderViewModel.class);
        }

        @Override // androidx.view.ViewModel
        public void onCleared() {
            super.onCleared();
            int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
            for (int i = 0; i < size; i++) {
                this.getHighResolutionOutputSizeshNQ4ISI.valueAt(i).getHighResolutionOutputSizeshNQ4ISI(true);
            }
            this.getHighResolutionOutputSizeshNQ4ISI.clear();
        }
    }

    LoaderManagerImpl(androidx.view.LifecycleOwner lifecycleOwner, androidx.view.ViewModelStore viewModelStore) {
        this.getHighSpeedVideoFpsRangesFor = lifecycleOwner;
        this.Camera2StreamConfigurationMap = androidx.loader.app.LoaderManagerImpl.LoaderViewModel.getHighSpeedVideoFpsRanges(viewModelStore);
    }

    private <D> androidx.loader.content.Loader<D> getHighSpeedVideoFpsRangesFor(int i, android.os.Bundle bundle, androidx.loader.app.LoaderManager.LoaderCallbacks<D> loaderCallbacks, androidx.loader.content.Loader<D> loader) {
        try {
            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor = true;
            androidx.loader.content.Loader<D> onCreateLoader = loaderCallbacks.onCreateLoader(i, bundle);
            if (onCreateLoader == null) {
                throw new java.lang.IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (onCreateLoader.getClass().isMemberClass() && !java.lang.reflect.Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Object returned from onCreateLoader must not be a non-static inner member class: ");
                sb.append(onCreateLoader);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            androidx.loader.app.LoaderManagerImpl.LoaderInfo loaderInfo = new androidx.loader.app.LoaderManagerImpl.LoaderInfo(i, bundle, onCreateLoader, loader);
            this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI.put(i, loaderInfo);
            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor = false;
            return loaderInfo.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, loaderCallbacks);
        } catch (java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor = false;
            throw th;
        }
    }

    @Override // androidx.loader.app.LoaderManager
    public <D> androidx.loader.content.Loader<D> initLoader(int i, android.os.Bundle bundle, androidx.loader.app.LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
        if (this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalStateException("Called while creating a loader");
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("initLoader must be called on the main thread");
        }
        androidx.loader.app.LoaderManagerImpl.LoaderInfo loaderInfo = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI.get(i);
        if (loaderInfo == null) {
            return getHighSpeedVideoFpsRangesFor(i, bundle, loaderCallbacks, null);
        }
        return loaderInfo.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, loaderCallbacks);
    }

    @Override // androidx.loader.app.LoaderManager
    public <D> androidx.loader.content.Loader<D> restartLoader(int i, android.os.Bundle bundle, androidx.loader.app.LoaderManager.LoaderCallbacks<D> loaderCallbacks) {
        if (this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalStateException("Called while creating a loader");
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("restartLoader must be called on the main thread");
        }
        androidx.loader.app.LoaderManagerImpl.LoaderInfo loaderInfo = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI.get(i);
        return getHighSpeedVideoFpsRangesFor(i, bundle, loaderCallbacks, loaderInfo != null ? loaderInfo.getHighResolutionOutputSizeshNQ4ISI(false) : null);
    }

    @Override // androidx.loader.app.LoaderManager
    public void destroyLoader(int i) {
        if (this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalStateException("Called while creating a loader");
        }
        if (android.os.Looper.getMainLooper() != android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("destroyLoader must be called on the main thread");
        }
        androidx.loader.app.LoaderManagerImpl.LoaderInfo loaderInfo = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI.get(i);
        if (loaderInfo != null) {
            loaderInfo.getHighResolutionOutputSizeshNQ4ISI(true);
            this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI.remove(i);
        }
    }

    @Override // androidx.loader.app.LoaderManager
    public <D> androidx.loader.content.Loader<D> getLoader(int i) {
        if (this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalStateException("Called while creating a loader");
        }
        androidx.loader.app.LoaderManagerImpl.LoaderInfo loaderInfo = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI.get(i);
        if (loaderInfo != null) {
            return loaderInfo.getHighSpeedVideoSizes;
        }
        return null;
    }

    @Override // androidx.loader.app.LoaderManager
    public void markForRedelivery() {
        androidx.loader.app.LoaderManagerImpl.LoaderViewModel loaderViewModel = this.Camera2StreamConfigurationMap;
        int size = loaderViewModel.getHighResolutionOutputSizeshNQ4ISI.size();
        for (int i = 0; i < size; i++) {
            loaderViewModel.getHighResolutionOutputSizeshNQ4ISI.valueAt(i).getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" in ");
        java.lang.Class<?> cls = this.getHighSpeedVideoFpsRangesFor.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }

    @Override // androidx.loader.app.LoaderManager
    @java.lang.Deprecated
    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        androidx.loader.app.LoaderManagerImpl.LoaderViewModel loaderViewModel = this.Camera2StreamConfigurationMap;
        if (loaderViewModel.getHighResolutionOutputSizeshNQ4ISI.size() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append("    ");
            java.lang.String obj = sb.toString();
            for (int i = 0; i < loaderViewModel.getHighResolutionOutputSizeshNQ4ISI.size(); i++) {
                androidx.loader.app.LoaderManagerImpl.LoaderInfo valueAt = loaderViewModel.getHighResolutionOutputSizeshNQ4ISI.valueAt(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(loaderViewModel.getHighResolutionOutputSizeshNQ4ISI.keyAt(i));
                printWriter.print(": ");
                printWriter.println(valueAt.toString());
                valueAt.dump(obj, fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // androidx.loader.app.LoaderManager
    public boolean hasRunningLoaders() {
        androidx.loader.app.LoaderManagerImpl.LoaderObserver<D> loaderObserver;
        androidx.loader.app.LoaderManagerImpl.LoaderViewModel loaderViewModel = this.Camera2StreamConfigurationMap;
        int size = loaderViewModel.getHighResolutionOutputSizeshNQ4ISI.size();
        for (int i = 0; i < size; i++) {
            androidx.loader.app.LoaderManagerImpl.LoaderInfo valueAt = loaderViewModel.getHighResolutionOutputSizeshNQ4ISI.valueAt(i);
            if (valueAt.hasActiveObservers() && (loaderObserver = valueAt.Camera2StreamConfigurationMap) != 0 && !loaderObserver.Camera2StreamConfigurationMap) {
                return true;
            }
        }
        return false;
    }
}
