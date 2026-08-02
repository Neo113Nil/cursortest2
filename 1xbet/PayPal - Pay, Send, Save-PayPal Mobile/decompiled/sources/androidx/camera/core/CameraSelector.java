package androidx.camera.core;

/* loaded from: classes.dex */
public final class CameraSelector {
    public static final int LENS_FACING_BACK = 1;
    public static final int LENS_FACING_EXTERNAL = 2;
    public static final int LENS_FACING_FRONT = 0;
    public static final int LENS_FACING_UNKNOWN = -1;
    private final java.util.LinkedHashSet<androidx.camera.core.CameraFilter> Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    public static final androidx.camera.core.CameraSelector DEFAULT_FRONT_CAMERA = new androidx.camera.core.CameraSelector.Builder().requireLensFacing(0).build();
    public static final androidx.camera.core.CameraSelector DEFAULT_BACK_CAMERA = new androidx.camera.core.CameraSelector.Builder().requireLensFacing(1).build();

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface LensFacing {
    }

    CameraSelector(java.util.LinkedHashSet<androidx.camera.core.CameraFilter> linkedHashSet, java.lang.String str) {
        this.Camera2StreamConfigurationMap = linkedHashSet;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    public final androidx.camera.core.impl.CameraInternal select(java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> linkedHashSet) {
        java.util.Iterator<androidx.camera.core.impl.CameraInternal> it = filter(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cams:");
        sb.append(linkedHashSet.size());
        java.util.Iterator<androidx.camera.core.impl.CameraInternal> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal = it2.next().getCameraInfoInternal();
            sb.append(java.lang.String.format(" Id:%s  Lens:%s", cameraInfoInternal.getCameraId(), java.lang.Integer.valueOf(cameraInfoInternal.getLensFacing())));
        }
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(java.lang.String.format("PhyId:%s  Filters:%s", this.getHighResolutionOutputSizeshNQ4ISI, java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap.size())));
        java.util.Iterator<androidx.camera.core.CameraFilter> it3 = this.Camera2StreamConfigurationMap.iterator();
        while (it3.hasNext()) {
            androidx.camera.core.CameraFilter next = it3.next();
            sb2.append(" Id:");
            sb2.append(next.getIdentifier());
            if (next instanceof androidx.camera.core.impl.LensFacingCameraFilter) {
                sb2.append(" LensFilter:");
                sb2.append(((androidx.camera.core.impl.LensFacingCameraFilter) next).getLensFacing());
            }
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("No available camera can be found. %s %s", obj, sb2.toString()));
    }

    public final java.util.List<androidx.camera.core.CameraInfo> filter(java.util.List<androidx.camera.core.CameraInfo> list) {
        java.util.List<androidx.camera.core.CameraInfo> arrayList = new java.util.ArrayList<>(list);
        java.util.Iterator<androidx.camera.core.CameraFilter> it = this.Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            arrayList = it.next().filter(java.util.Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    public final java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> filter(java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> linkedHashSet) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.camera.core.impl.CameraInternal> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getCameraInfo());
        }
        java.util.List<androidx.camera.core.CameraInfo> filter = filter(arrayList);
        java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> linkedHashSet2 = new java.util.LinkedHashSet<>();
        java.util.Iterator<androidx.camera.core.impl.CameraInternal> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            androidx.camera.core.impl.CameraInternal next = it2.next();
            if (filter.contains(next.getCameraInfo())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }

    public final java.util.LinkedHashSet<androidx.camera.core.CameraFilter> getCameraFilterSet() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.Integer getLensFacing() {
        java.util.Iterator<androidx.camera.core.CameraFilter> it = this.Camera2StreamConfigurationMap.iterator();
        java.lang.Integer num = null;
        while (it.hasNext()) {
            androidx.camera.core.CameraFilter next = it.next();
            if (next instanceof androidx.camera.core.impl.LensFacingCameraFilter) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(((androidx.camera.core.impl.LensFacingCameraFilter) next).getLensFacing());
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new java.lang.IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public final java.lang.String getPhysicalCameraId() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static androidx.camera.core.CameraSelector of(final androidx.camera.core.CameraIdentifier... cameraIdentifierArr) {
        if (cameraIdentifierArr == null || cameraIdentifierArr.length == 0) {
            throw new java.lang.IllegalArgumentException("At least one CameraIdentifier must be provided.");
        }
        androidx.camera.core.CameraSelector.Builder builder = new androidx.camera.core.CameraSelector.Builder();
        builder.addCameraFilter(new androidx.camera.core.CameraFilter() { // from class: androidx.camera.core.CameraSelector$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.CameraFilter
            public final java.util.List filter(java.util.List list) {
                return androidx.camera.core.CameraSelector.getHighSpeedVideoSizes(cameraIdentifierArr, list);
            }
        });
        return builder.build();
    }

    static /* synthetic */ java.util.List getHighSpeedVideoSizes(androidx.camera.core.CameraIdentifier[] cameraIdentifierArr, java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        for (androidx.camera.core.CameraIdentifier cameraIdentifier : cameraIdentifierArr) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    androidx.camera.core.CameraInfo cameraInfo = (androidx.camera.core.CameraInfo) it.next();
                    if (java.util.Objects.equals(cameraInfo.getCameraIdentifier(), cameraIdentifier) && !hashSet.contains(cameraIdentifier)) {
                        arrayList.add(cameraInfo);
                        hashSet.add(cameraIdentifier);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    /* loaded from: classes6.dex */
    public static final class Builder {
        private java.lang.String Camera2StreamConfigurationMap;
        private final java.util.LinkedHashSet<androidx.camera.core.CameraFilter> getHighSpeedVideoSizes;

        public Builder() {
            this.getHighSpeedVideoSizes = new java.util.LinkedHashSet<>();
        }

        private Builder(java.util.LinkedHashSet<androidx.camera.core.CameraFilter> linkedHashSet) {
            this.getHighSpeedVideoSizes = new java.util.LinkedHashSet<>(linkedHashSet);
        }

        public final androidx.camera.core.CameraSelector.Builder requireLensFacing(int i) {
            androidx.core.util.Preconditions.checkState(i != -1, "The specified lens facing is invalid.");
            this.getHighSpeedVideoSizes.add(new androidx.camera.core.impl.LensFacingCameraFilter(i));
            return this;
        }

        public final androidx.camera.core.CameraSelector.Builder addCameraFilter(androidx.camera.core.CameraFilter cameraFilter) {
            this.getHighSpeedVideoSizes.add(cameraFilter);
            return this;
        }

        public static androidx.camera.core.CameraSelector.Builder fromSelector(androidx.camera.core.CameraSelector cameraSelector) {
            return new androidx.camera.core.CameraSelector.Builder(cameraSelector.getCameraFilterSet());
        }

        public final androidx.camera.core.CameraSelector.Builder setPhysicalCameraId(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
            return this;
        }

        public final androidx.camera.core.CameraSelector build() {
            return new androidx.camera.core.CameraSelector(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
        }
    }
}
