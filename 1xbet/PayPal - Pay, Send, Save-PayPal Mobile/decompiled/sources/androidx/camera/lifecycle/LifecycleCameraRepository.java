package androidx.camera.lifecycle;

/* loaded from: classes.dex */
public final class LifecycleCameraRepository {
    final java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository.Key, androidx.camera.lifecycle.LifecycleCamera> Camera2StreamConfigurationMap;
    final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.ArrayDeque<androidx.view.LifecycleOwner> getHighSpeedVideoFpsRanges;
    androidx.camera.core.concurrent.CameraCoordinator getHighSpeedVideoFpsRangesFor;
    final java.util.Map<androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver, java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository.Key>> getHighSpeedVideoSizes;
    private final int getInputSizeshNQ4ISI;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    @interface FromUseCaseAdapter {
    }

    LifecycleCameraRepository() {
        this(androidx.camera.core.impl.utils.ContextUtil.getDefaultDeviceId());
    }

    LifecycleCameraRepository(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();
        this.Camera2StreamConfigurationMap = new java.util.HashMap();
        this.getHighSpeedVideoSizes = new java.util.HashMap();
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayDeque<>();
        this.getInputSizeshNQ4ISI = i;
    }

    final androidx.camera.lifecycle.LifecycleCamera getHighSpeedVideoFpsRanges(androidx.view.LifecycleOwner lifecycleOwner, androidx.camera.core.internal.CameraUseCaseAdapter cameraUseCaseAdapter, androidx.camera.core.RotationProvider rotationProvider) {
        java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository.Key> hashSet;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.core.util.Preconditions.checkArgument(this.Camera2StreamConfigurationMap.get(androidx.camera.lifecycle.LifecycleCameraRepository.Key.getHighResolutionOutputSizeshNQ4ISI(lifecycleOwner, cameraUseCaseAdapter.getAdapterIdentifier())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
            androidx.camera.lifecycle.LifecycleCamera lifecycleCamera = new androidx.camera.lifecycle.LifecycleCamera(lifecycleOwner, cameraUseCaseAdapter, rotationProvider);
            if (cameraUseCaseAdapter.getUseCases().isEmpty()) {
                lifecycleCamera.suspend();
            }
            if (lifecycleOwner.getLifecycle().getCamera2StreamConfigurationMap() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
                return lifecycleCamera;
            }
            synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
                androidx.view.LifecycleOwner lifecycleOwner2 = lifecycleCamera.getLifecycleOwner();
                androidx.camera.lifecycle.LifecycleCameraRepository.Key highResolutionOutputSizeshNQ4ISI = androidx.camera.lifecycle.LifecycleCameraRepository.Key.getHighResolutionOutputSizeshNQ4ISI(lifecycleOwner2, lifecycleCamera.getCameraUseCaseAdapter().getAdapterIdentifier());
                androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver highSpeedVideoSizes = getHighSpeedVideoSizes(lifecycleOwner2);
                if (highSpeedVideoSizes != null) {
                    hashSet = this.getHighSpeedVideoSizes.get(highSpeedVideoSizes);
                } else {
                    hashSet = new java.util.HashSet<>();
                }
                hashSet.add(highResolutionOutputSizeshNQ4ISI);
                this.Camera2StreamConfigurationMap.put(highResolutionOutputSizeshNQ4ISI, lifecycleCamera);
                if (highSpeedVideoSizes == null) {
                    androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = new androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver(lifecycleOwner2, this);
                    this.getHighSpeedVideoSizes.put(lifecycleCameraRepositoryObserver, hashSet);
                    lifecycleOwner2.getLifecycle().addObserver(lifecycleCameraRepositoryObserver);
                }
            }
            return lifecycleCamera;
        }
    }

    final androidx.camera.lifecycle.LifecycleCamera getHighSpeedVideoFpsRanges(androidx.view.LifecycleOwner lifecycleOwner, androidx.camera.core.CameraIdentifier cameraIdentifier) {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.camera.lifecycle.LifecycleCamera lifecycleCamera = this.Camera2StreamConfigurationMap.get(androidx.camera.lifecycle.LifecycleCameraRepository.Key.getHighResolutionOutputSizeshNQ4ISI(lifecycleOwner, cameraIdentifier));
            if (lifecycleCamera == null || !lifecycleCamera.getCameraUseCaseAdapter().isRemoved()) {
                return lifecycleCamera;
            }
            Camera2StreamConfigurationMap(lifecycleCamera);
            return null;
        }
    }

    final java.util.Collection<androidx.camera.lifecycle.LifecycleCamera> getHighSpeedVideoFpsRanges() {
        java.util.Collection<androidx.camera.lifecycle.LifecycleCamera> unmodifiableCollection;
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            unmodifiableCollection = java.util.Collections.unmodifiableCollection(this.Camera2StreamConfigurationMap.values());
        }
        return unmodifiableCollection;
    }

    final void Camera2StreamConfigurationMap(androidx.camera.lifecycle.LifecycleCamera lifecycleCamera) {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.view.LifecycleOwner lifecycleOwner = lifecycleCamera.getLifecycleOwner();
            androidx.camera.lifecycle.LifecycleCameraRepository.Key highResolutionOutputSizeshNQ4ISI = androidx.camera.lifecycle.LifecycleCameraRepository.Key.getHighResolutionOutputSizeshNQ4ISI(lifecycleOwner, lifecycleCamera.getCameraUseCaseAdapter().getAdapterIdentifier());
            this.Camera2StreamConfigurationMap.remove(highResolutionOutputSizeshNQ4ISI);
            java.util.HashSet hashSet = new java.util.HashSet();
            for (androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.getHighSpeedVideoSizes.keySet()) {
                if (lifecycleOwner.equals(lifecycleCameraRepositoryObserver.getHighSpeedVideoSizes)) {
                    java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository.Key> set = this.getHighSpeedVideoSizes.get(lifecycleCameraRepositoryObserver);
                    set.remove(highResolutionOutputSizeshNQ4ISI);
                    if (set.isEmpty()) {
                        hashSet.add(lifecycleCameraRepositoryObserver.getHighSpeedVideoSizes);
                    }
                }
            }
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                getHighSpeedVideoFpsRanges((androidx.view.LifecycleOwner) it.next());
            }
        }
    }

    final void getHighSpeedVideoFpsRanges(androidx.view.LifecycleOwner lifecycleOwner) {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver highSpeedVideoSizes = getHighSpeedVideoSizes(lifecycleOwner);
            if (highSpeedVideoSizes == null) {
                return;
            }
            Camera2StreamConfigurationMap(lifecycleOwner);
            java.util.Iterator<androidx.camera.lifecycle.LifecycleCameraRepository.Key> it = this.getHighSpeedVideoSizes.get(highSpeedVideoSizes).iterator();
            while (it.hasNext()) {
                this.Camera2StreamConfigurationMap.remove(it.next());
            }
            this.getHighSpeedVideoSizes.remove(highSpeedVideoSizes);
            highSpeedVideoSizes.getHighSpeedVideoSizes.getLifecycle().removeObserver(highSpeedVideoSizes);
        }
    }

    final androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver getHighSpeedVideoSizes(androidx.view.LifecycleOwner lifecycleOwner) {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            for (androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver : this.getHighSpeedVideoSizes.keySet()) {
                if (lifecycleOwner.equals(lifecycleCameraRepositoryObserver.getHighSpeedVideoSizes)) {
                    return lifecycleCameraRepositoryObserver;
                }
            }
            return null;
        }
    }

    final void Camera2StreamConfigurationMap(androidx.camera.core.SessionConfig sessionConfig, java.util.Set<androidx.camera.lifecycle.LifecycleCameraRepository.Key> set) {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            if (set == null) {
                set = this.Camera2StreamConfigurationMap.keySet();
            }
            for (androidx.camera.lifecycle.LifecycleCameraRepository.Key key : set) {
                if (this.Camera2StreamConfigurationMap.containsKey(key)) {
                    androidx.camera.lifecycle.LifecycleCamera lifecycleCamera = this.Camera2StreamConfigurationMap.get(key);
                    boolean isEmpty = lifecycleCamera.getUseCases().isEmpty();
                    lifecycleCamera.Camera2StreamConfigurationMap(sessionConfig);
                    if (!isEmpty && lifecycleCamera.getUseCases().isEmpty()) {
                        Camera2StreamConfigurationMap(lifecycleCamera.getLifecycleOwner());
                    }
                }
            }
        }
    }

    final void getHighSpeedVideoFpsRangesFor(androidx.view.LifecycleOwner lifecycleOwner) {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            if (getHighResolutionOutputSizeshNQ4ISI(lifecycleOwner)) {
                if (this.getHighSpeedVideoFpsRanges.isEmpty()) {
                    this.getHighSpeedVideoFpsRanges.push(lifecycleOwner);
                } else {
                    androidx.camera.core.concurrent.CameraCoordinator cameraCoordinator = this.getHighSpeedVideoFpsRangesFor;
                    if (cameraCoordinator == null || cameraCoordinator.getCameraOperatingMode() != 2) {
                        androidx.view.LifecycleOwner peek = this.getHighSpeedVideoFpsRanges.peek();
                        if (!lifecycleOwner.equals(peek)) {
                            getOutputFormats(peek);
                            this.getHighSpeedVideoFpsRanges.remove(lifecycleOwner);
                            this.getHighSpeedVideoFpsRanges.push(lifecycleOwner);
                        }
                    }
                }
                getInputFormats(lifecycleOwner);
            }
        }
    }

    final void Camera2StreamConfigurationMap(androidx.view.LifecycleOwner lifecycleOwner) {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoFpsRanges.remove(lifecycleOwner);
            getOutputFormats(lifecycleOwner);
            if (!this.getHighSpeedVideoFpsRanges.isEmpty()) {
                getInputFormats(this.getHighSpeedVideoFpsRanges.peek());
            }
        }
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(androidx.view.LifecycleOwner lifecycleOwner) {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver highSpeedVideoSizes = getHighSpeedVideoSizes(lifecycleOwner);
            if (highSpeedVideoSizes == null) {
                return false;
            }
            java.util.Iterator<androidx.camera.lifecycle.LifecycleCameraRepository.Key> it = this.getHighSpeedVideoSizes.get(highSpeedVideoSizes).iterator();
            while (it.hasNext()) {
                if (!((androidx.camera.lifecycle.LifecycleCamera) androidx.core.util.Preconditions.checkNotNull(this.Camera2StreamConfigurationMap.get(it.next()))).getUseCases().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    private void getOutputFormats(androidx.view.LifecycleOwner lifecycleOwner) {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver highSpeedVideoSizes = getHighSpeedVideoSizes(lifecycleOwner);
            if (highSpeedVideoSizes == null) {
                return;
            }
            java.util.Iterator<androidx.camera.lifecycle.LifecycleCameraRepository.Key> it = this.getHighSpeedVideoSizes.get(highSpeedVideoSizes).iterator();
            while (it.hasNext()) {
                ((androidx.camera.lifecycle.LifecycleCamera) androidx.core.util.Preconditions.checkNotNull(this.Camera2StreamConfigurationMap.get(it.next()))).suspend();
            }
        }
    }

    private void getInputFormats(androidx.view.LifecycleOwner lifecycleOwner) {
        synchronized (this.getHighResolutionOutputSizeshNQ4ISI) {
            java.util.Iterator<androidx.camera.lifecycle.LifecycleCameraRepository.Key> it = this.getHighSpeedVideoSizes.get(getHighSpeedVideoSizes(lifecycleOwner)).iterator();
            while (it.hasNext()) {
                androidx.camera.lifecycle.LifecycleCamera lifecycleCamera = this.Camera2StreamConfigurationMap.get(it.next());
                if (!((androidx.camera.lifecycle.LifecycleCamera) androidx.core.util.Preconditions.checkNotNull(lifecycleCamera)).getUseCases().isEmpty()) {
                    lifecycleCamera.unsuspend();
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    static abstract class Key {
        public abstract int getHighSpeedVideoFpsRangesFor();

        public abstract androidx.camera.core.CameraIdentifier getHighSpeedVideoSizes();

        Key() {
        }

        static androidx.camera.lifecycle.LifecycleCameraRepository.Key getHighResolutionOutputSizeshNQ4ISI(androidx.view.LifecycleOwner lifecycleOwner, androidx.camera.core.CameraIdentifier cameraIdentifier) {
            return new androidx.camera.lifecycle.AutoValue_LifecycleCameraRepository_Key(java.lang.System.identityHashCode(lifecycleOwner), cameraIdentifier);
        }
    }

    static class LifecycleCameraRepositoryObserver implements androidx.view.LifecycleObserver {
        private final androidx.camera.lifecycle.LifecycleCameraRepository Camera2StreamConfigurationMap;
        final androidx.view.LifecycleOwner getHighSpeedVideoSizes;

        LifecycleCameraRepositoryObserver(androidx.view.LifecycleOwner lifecycleOwner, androidx.camera.lifecycle.LifecycleCameraRepository lifecycleCameraRepository) {
            this.getHighSpeedVideoSizes = lifecycleOwner;
            this.Camera2StreamConfigurationMap = lifecycleCameraRepository;
        }

        @androidx.view.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START)
        public void onStart(androidx.view.LifecycleOwner lifecycleOwner) {
            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(lifecycleOwner);
        }

        @androidx.view.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP)
        public void onStop(androidx.view.LifecycleOwner lifecycleOwner) {
            this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(lifecycleOwner);
        }

        @androidx.view.OnLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
        public void onDestroy(androidx.view.LifecycleOwner lifecycleOwner) {
            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(lifecycleOwner);
        }
    }
}
