package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public class CameraRepository implements androidx.camera.core.impl.InternalCameraPresenceListener {
    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> Camera2StreamConfigurationMap;
    private androidx.camera.core.impl.CameraFactory getHighSpeedVideoFpsRangesFor;
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getHighSpeedVideoSizes;
    final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
    private final java.util.Map<java.lang.String, androidx.camera.core.impl.CameraInternal> getOutputFormats = new java.util.LinkedHashMap();
    final java.util.Set<androidx.camera.core.impl.CameraInternal> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashSet();

    public void init(androidx.camera.core.impl.CameraFactory cameraFactory) throws androidx.camera.core.InitializationException {
        this.getHighSpeedVideoFpsRangesFor = cameraFactory;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            try {
                for (java.lang.String str : cameraFactory.getAvailableCameraIds()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Added camera: ");
                    sb.append(str);
                    androidx.camera.core.Logger.d("CameraRepository", sb.toString());
                    androidx.camera.core.impl.CameraInternal put = this.getOutputFormats.put(str, cameraFactory.getCamera(str));
                    if (put != null) {
                        put.release();
                    }
                }
            } catch (androidx.camera.core.CameraUnavailableException e) {
                throw new androidx.camera.core.InitializationException(e);
            }
        }
    }

    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> deinit() {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getOutputFormats.isEmpty()) {
                com.google.common.util.concurrent.ListenableFuture<java.lang.Void> listenableFuture = this.getHighSpeedVideoSizes;
                if (listenableFuture == null) {
                    listenableFuture = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
                }
                return listenableFuture;
            }
            com.google.common.util.concurrent.ListenableFuture<java.lang.Void> listenableFuture2 = this.getHighSpeedVideoSizes;
            if (listenableFuture2 == null) {
                listenableFuture2 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.CameraRepository$$ExternalSyntheticLambda0
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                        return androidx.camera.core.impl.CameraRepository.this.Camera2StreamConfigurationMap(completer);
                    }
                });
                this.getHighSpeedVideoSizes = listenableFuture2;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.addAll(this.getOutputFormats.values());
            for (final androidx.camera.core.impl.CameraInternal cameraInternal : this.getOutputFormats.values()) {
                cameraInternal.release().addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.CameraRepository$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.impl.CameraRepository cameraRepository = androidx.camera.core.impl.CameraRepository.this;
                        androidx.camera.core.impl.CameraInternal cameraInternal2 = cameraInternal;
                        synchronized (cameraRepository.getHighSpeedVideoFpsRanges) {
                            cameraRepository.getHighResolutionOutputSizeshNQ4ISI.remove(cameraInternal2);
                            if (cameraRepository.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                                androidx.core.util.Preconditions.checkNotNull(cameraRepository.Camera2StreamConfigurationMap);
                                cameraRepository.Camera2StreamConfigurationMap.set(null);
                                cameraRepository.Camera2StreamConfigurationMap = null;
                                cameraRepository.getHighSpeedVideoSizes = null;
                            }
                        }
                    }
                }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            }
            this.getOutputFormats.clear();
            return listenableFuture2;
        }
    }

    final /* synthetic */ java.lang.Object Camera2StreamConfigurationMap(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.Camera2StreamConfigurationMap = completer;
        }
        return "CameraRepository-deinit";
    }

    public androidx.camera.core.impl.CameraInternal getCamera(java.lang.String str) {
        androidx.camera.core.impl.CameraInternal cameraInternal;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            cameraInternal = this.getOutputFormats.get(str);
            if (cameraInternal == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid camera: ");
                sb.append(str);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        return cameraInternal;
    }

    public java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> getCameras() {
        java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> linkedHashSet;
        synchronized (this.getHighSpeedVideoFpsRanges) {
            linkedHashSet = new java.util.LinkedHashSet<>(this.getOutputFormats.values());
        }
        return linkedHashSet;
    }

    @Override // androidx.camera.core.impl.InternalCameraPresenceListener
    public void onCamerasUpdated(java.util.List<java.lang.String> list) throws androidx.camera.core.impl.CameraUpdateException {
        java.util.HashSet<java.lang.String> hashSet;
        java.util.HashMap hashMap = new java.util.HashMap();
        synchronized (this.getHighSpeedVideoFpsRanges) {
            hashSet = new java.util.HashSet(list);
            hashSet.removeAll(this.getOutputFormats.keySet());
        }
        try {
            for (java.lang.String str : hashSet) {
                hashMap.put(str, this.getHighSpeedVideoFpsRangesFor.getCamera(str));
            }
            synchronized (this.getHighSpeedVideoFpsRanges) {
                java.util.HashSet hashSet2 = new java.util.HashSet(this.getOutputFormats.keySet());
                hashSet2.removeAll(list);
                java.util.ArrayList<androidx.camera.core.impl.CameraInternal> arrayList = new java.util.ArrayList();
                java.util.Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.getOutputFormats.get((java.lang.String) it.next()));
                }
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.lang.String str2 : list) {
                    if (this.getOutputFormats.containsKey(str2)) {
                        linkedHashMap.put(str2, this.getOutputFormats.get(str2));
                    } else {
                        linkedHashMap.put(str2, (androidx.camera.core.impl.CameraInternal) hashMap.get(str2));
                    }
                }
                this.getOutputFormats.clear();
                this.getOutputFormats.putAll(linkedHashMap);
                for (androidx.camera.core.impl.CameraInternal cameraInternal : arrayList) {
                    if (cameraInternal != null) {
                        cameraInternal.onRemoved();
                    }
                }
            }
        } catch (androidx.camera.core.CameraUnavailableException e) {
            throw new androidx.camera.core.impl.CameraUpdateException("Failed to create CameraInternal", e);
        }
    }
}
