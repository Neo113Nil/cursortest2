package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
public final class ExperienceEvent {
    java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap;
    java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRanges;
    java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    java.lang.String getHighSpeedVideoSizes;

    /* synthetic */ ExperienceEvent(byte b) {
        this();
    }

    private ExperienceEvent() {
    }

    public static class Builder {
        private final com.adobe.marketing.mobile.ExperienceEvent getHighSpeedVideoFpsRanges = new com.adobe.marketing.mobile.ExperienceEvent(0);
        private boolean getHighSpeedVideoSizes = false;

        public com.adobe.marketing.mobile.ExperienceEvent.Builder setXdmSchema(java.util.Map<java.lang.String, java.lang.Object> map) {
            return setXdmSchema(map, null);
        }

        public com.adobe.marketing.mobile.ExperienceEvent build() {
            if (!this.getHighSpeedVideoSizes) {
                if (this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor == null) {
                    com.adobe.marketing.mobile.services.Log.warning("Edge", "ExperienceEvent", "Unable to create the ExperienceEvent without required 'XdmSchema', use setXdmSchema API to set it.", new java.lang.Object[0]);
                    return null;
                }
                this.getHighSpeedVideoSizes = true;
                return this.getHighSpeedVideoFpsRanges;
            }
            throw new java.lang.UnsupportedOperationException("ExperienceEvent - attempted to call methods on ExperienceEvent.Builder after build() was called");
        }

        public com.adobe.marketing.mobile.ExperienceEvent.Builder setData(java.util.Map<java.lang.String, java.lang.Object> map) {
            if (!this.getHighSpeedVideoSizes) {
                this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap = map == null ? null : com.adobe.marketing.mobile.Utils.getHighSpeedVideoFpsRanges(map);
                return this;
            }
            throw new java.lang.UnsupportedOperationException("ExperienceEvent - attempted to call methods on ExperienceEvent.Builder after build() was called");
        }

        public com.adobe.marketing.mobile.ExperienceEvent.Builder setDatastreamConfigOverride(java.util.Map<java.lang.String, java.lang.Object> map) {
            if (!this.getHighSpeedVideoSizes) {
                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges = map == null ? null : com.adobe.marketing.mobile.Utils.getHighSpeedVideoFpsRanges(map);
                return this;
            }
            throw new java.lang.UnsupportedOperationException("ExperienceEvent - attempted to call methods on ExperienceEvent.Builder after build() was called");
        }

        public com.adobe.marketing.mobile.ExperienceEvent.Builder setDatastreamIdOverride(java.lang.String str) {
            if (!this.getHighSpeedVideoSizes) {
                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes = str;
                return this;
            }
            throw new java.lang.UnsupportedOperationException("ExperienceEvent - attempted to call methods on ExperienceEvent.Builder after build() was called");
        }

        public com.adobe.marketing.mobile.ExperienceEvent.Builder setXdmSchema(com.adobe.marketing.mobile.xdm.Schema schema) {
            if (this.getHighSpeedVideoSizes) {
                throw new java.lang.UnsupportedOperationException("ExperienceEvent - attempted to call methods on ExperienceEvent.Builder after build() was called");
            }
            if (schema == null) {
                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI = null;
                return this;
            }
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.Utils.getHighSpeedVideoFpsRanges(schema.serializeToXdm());
            this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI = schema.getDatasetIdentifier();
            return this;
        }

        public com.adobe.marketing.mobile.ExperienceEvent.Builder setXdmSchema(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) {
            if (!this.getHighSpeedVideoSizes) {
                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor = map == null ? null : com.adobe.marketing.mobile.Utils.getHighSpeedVideoFpsRanges(map);
                this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI = str;
                return this;
            }
            throw new java.lang.UnsupportedOperationException("ExperienceEvent - attempted to call methods on ExperienceEvent.Builder after build() was called");
        }
    }

    public final java.lang.String getDatastreamIdOverride() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getDatastreamConfigOverride() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getData() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.Camera2StreamConfigurationMap;
        if (map != null) {
            return com.adobe.marketing.mobile.Utils.getHighSpeedVideoFpsRanges(map);
        }
        return java.util.Collections.emptyMap();
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getXdmSchema() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.getHighSpeedVideoFpsRangesFor;
        if (map != null) {
            return com.adobe.marketing.mobile.Utils.getHighSpeedVideoFpsRanges(map);
        }
        return java.util.Collections.emptyMap();
    }
}
