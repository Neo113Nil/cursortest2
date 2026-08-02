package androidx.core.view.insets;

/* loaded from: classes7.dex */
class ProtectionGroup implements androidx.core.view.insets.SystemBarStateMonitor.Callback {
    private boolean Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRanges;
    private final androidx.core.view.insets.SystemBarStateMonitor getOutputMinFrameDuration;
    final java.util.ArrayList<androidx.core.view.insets.Protection> getHighSpeedVideoSizes = new java.util.ArrayList<>();
    private androidx.core.graphics.Insets getHighSpeedVideoFpsRangesFor = androidx.core.graphics.Insets.NONE;
    private androidx.core.graphics.Insets getHighResolutionOutputSizeshNQ4ISI = androidx.core.graphics.Insets.NONE;

    ProtectionGroup(androidx.core.view.insets.SystemBarStateMonitor systemBarStateMonitor, java.util.List<androidx.core.view.insets.Protection> list) {
        getHighResolutionOutputSizeshNQ4ISI(list, false);
        getHighResolutionOutputSizeshNQ4ISI(list, true);
        if (!systemBarStateMonitor.getHighSpeedVideoSizes.contains(this)) {
            systemBarStateMonitor.getHighSpeedVideoSizes.add(this);
            getHighSpeedVideoSizes(systemBarStateMonitor.getHighSpeedVideoFpsRanges, systemBarStateMonitor.Camera2StreamConfigurationMap);
            Camera2StreamConfigurationMap(systemBarStateMonitor.getHighSpeedVideoFpsRangesFor);
        }
        this.getOutputMinFrameDuration = systemBarStateMonitor;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(java.util.List<androidx.core.view.insets.Protection> list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.core.view.insets.Protection protection = list.get(i);
            if (protection.getHighSpeedVideoFpsRanges() == z) {
                java.lang.Object obj = protection.Camera2StreamConfigurationMap;
                if (obj != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(protection);
                    sb.append(" (");
                    sb.append(i + 1);
                    sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                    sb.append(size);
                    sb.append(") is already controlled by ");
                    sb.append(obj);
                    sb.append(" but is still added to ");
                    sb.append(this);
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                protection.Camera2StreamConfigurationMap = this;
                this.getHighSpeedVideoSizes.add(protection);
            }
        }
    }

    private void getHighSpeedVideoSizes() {
        androidx.core.graphics.Insets insets = androidx.core.graphics.Insets.NONE;
        for (int size = this.getHighSpeedVideoSizes.size() - 1; size >= 0; size--) {
            androidx.core.view.insets.Protection protection = this.getHighSpeedVideoSizes.get(size);
            androidx.core.graphics.Insets insets2 = this.getHighSpeedVideoFpsRangesFor;
            androidx.core.graphics.Insets insets3 = this.getHighResolutionOutputSizeshNQ4ISI;
            protection.getHighResolutionOutputSizeshNQ4ISI = insets2;
            protection.getHighSpeedVideoFpsRangesFor = insets3;
            androidx.core.view.insets.Protection.Attributes.getHighSpeedVideoFpsRangesFor(protection.getHighSpeedVideoFpsRanges, insets);
            insets = androidx.core.graphics.Insets.max(insets, protection.getHighResolutionOutputSizeshNQ4ISI());
        }
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public final void getHighSpeedVideoSizes(androidx.core.graphics.Insets insets, androidx.core.graphics.Insets insets2) {
        this.getHighSpeedVideoFpsRangesFor = insets;
        this.getHighResolutionOutputSizeshNQ4ISI = insets2;
        getHighSpeedVideoSizes();
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public final void Camera2StreamConfigurationMap(int i) {
        for (int size = this.getHighSpeedVideoSizes.size() - 1; size >= 0; size--) {
            this.getHighSpeedVideoSizes.get(size).Camera2StreamConfigurationMap(i);
        }
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public final void getHighSpeedVideoFpsRangesFor() {
        this.getHighSpeedVideoFpsRanges++;
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public final void getHighSpeedVideoSizes(int i, androidx.core.graphics.Insets insets, android.graphics.RectF rectF) {
        androidx.core.graphics.Insets insets2 = this.getHighResolutionOutputSizeshNQ4ISI;
        for (int size = this.getHighSpeedVideoSizes.size() - 1; size >= 0; size--) {
            androidx.core.view.insets.Protection protection = this.getHighSpeedVideoSizes.get(size);
            int side = protection.getSide();
            if ((side & i) != 0) {
                androidx.core.view.insets.Protection.Attributes.getHighResolutionOutputSizeshNQ4ISI(protection.getHighSpeedVideoFpsRanges, true);
                if (side == 1) {
                    if (insets2.left > 0) {
                        protection.getInputFormats = insets.left / insets2.left;
                        protection.Camera2StreamConfigurationMap();
                    }
                    protection.getHighSpeedVideoSizes = rectF.left;
                    androidx.core.view.insets.Protection.Attributes.getHighSpeedVideoFpsRangesFor(protection.getHighSpeedVideoFpsRanges, protection.getHighSpeedVideoSizes * protection.getHighSpeedVideoSizesFor);
                } else if (side == 2) {
                    if (insets2.top > 0) {
                        protection.getInputFormats = insets.top / insets2.top;
                        protection.Camera2StreamConfigurationMap();
                    }
                    protection.getHighSpeedVideoSizes = rectF.top;
                    androidx.core.view.insets.Protection.Attributes.getHighSpeedVideoFpsRangesFor(protection.getHighSpeedVideoFpsRanges, protection.getHighSpeedVideoSizes * protection.getHighSpeedVideoSizesFor);
                } else if (side == 4) {
                    if (insets2.right > 0) {
                        protection.getInputFormats = insets.right / insets2.right;
                        protection.Camera2StreamConfigurationMap();
                    }
                    protection.getHighSpeedVideoSizes = rectF.right;
                    androidx.core.view.insets.Protection.Attributes.getHighSpeedVideoFpsRangesFor(protection.getHighSpeedVideoFpsRanges, protection.getHighSpeedVideoSizes * protection.getHighSpeedVideoSizesFor);
                } else if (side == 8) {
                    if (insets2.bottom > 0) {
                        protection.getInputFormats = insets.bottom / insets2.bottom;
                        protection.Camera2StreamConfigurationMap();
                    }
                    protection.getHighSpeedVideoSizes = rectF.bottom;
                    androidx.core.view.insets.Protection.Attributes.getHighSpeedVideoFpsRangesFor(protection.getHighSpeedVideoFpsRanges, protection.getHighSpeedVideoSizes * protection.getHighSpeedVideoSizesFor);
                }
            }
        }
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public final void getHighSpeedVideoFpsRanges() {
        int i = this.getHighSpeedVideoFpsRanges;
        boolean z = i > 0;
        int i2 = i - 1;
        this.getHighSpeedVideoFpsRanges = i2;
        if (z && i2 == 0) {
            getHighSpeedVideoSizes();
        }
    }

    final void Camera2StreamConfigurationMap() {
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        this.Camera2StreamConfigurationMap = true;
        this.getOutputMinFrameDuration.getHighSpeedVideoSizes.remove(this);
        for (int size = this.getHighSpeedVideoSizes.size() - 1; size >= 0; size--) {
            this.getHighSpeedVideoSizes.get(size).Camera2StreamConfigurationMap = null;
        }
        this.getHighSpeedVideoSizes.clear();
    }
}
