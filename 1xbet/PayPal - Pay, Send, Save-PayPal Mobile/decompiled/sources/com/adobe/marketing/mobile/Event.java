package com.adobe.marketing.mobile;

/* loaded from: classes.dex */
public final class Event {
    private java.lang.String Camera2StreamConfigurationMap;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRanges;
    private java.lang.String[] getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;
    private java.lang.String getHighSpeedVideoSizesFor;
    private long getInputFormats;
    private java.lang.String getOutputFormats;
    private java.lang.String getOutputMinFrameDuration;

    /* synthetic */ Event(byte b) {
        this();
    }

    /* loaded from: classes3.dex */
    public static class Builder {
        boolean Camera2StreamConfigurationMap;
        final com.adobe.marketing.mobile.Event getHighSpeedVideoFpsRangesFor;

        public Builder(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this(str, str2, str3, null);
        }

        public Builder(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String[] strArr) {
            com.adobe.marketing.mobile.Event event = new com.adobe.marketing.mobile.Event((byte) 0);
            this.getHighSpeedVideoFpsRangesFor = event;
            event.getHighSpeedVideoSizes = str;
            event.getOutputMinFrameDuration = java.util.UUID.randomUUID().toString();
            event.getOutputFormats = str2;
            event.getHighSpeedVideoSizesFor = str3;
            event.Camera2StreamConfigurationMap = null;
            event.getHighResolutionOutputSizeshNQ4ISI = null;
            event.getHighSpeedVideoFpsRangesFor = strArr;
            this.Camera2StreamConfigurationMap = false;
        }

        public com.adobe.marketing.mobile.Event build() {
            if (!this.Camera2StreamConfigurationMap) {
                this.Camera2StreamConfigurationMap = true;
                if (this.getHighSpeedVideoFpsRangesFor.getOutputFormats == null || this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor == null) {
                    return null;
                }
                if (this.getHighSpeedVideoFpsRangesFor.getInputFormats == 0) {
                    this.getHighSpeedVideoFpsRangesFor.getInputFormats = java.lang.System.currentTimeMillis();
                }
                return this.getHighSpeedVideoFpsRangesFor;
            }
            throw new java.lang.UnsupportedOperationException("Event - attempted to call methods on Event.Builder after build() was called");
        }

        public com.adobe.marketing.mobile.Event.Builder chainToParentEvent(com.adobe.marketing.mobile.Event event) {
            if (this.Camera2StreamConfigurationMap) {
                throw new java.lang.UnsupportedOperationException("Event - attempted to call methods on Event.Builder after build() was called");
            }
            if (event == null) {
                throw new java.lang.NullPointerException("parentEvent cannot be null");
            }
            this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI = event.getUniqueIdentifier();
            return this;
        }

        public com.adobe.marketing.mobile.Event.Builder inResponseToEvent(com.adobe.marketing.mobile.Event event) {
            if (this.Camera2StreamConfigurationMap) {
                throw new java.lang.UnsupportedOperationException("Event - attempted to call methods on Event.Builder after build() was called");
            }
            if (event != null) {
                java.lang.String str = event.getOutputMinFrameDuration;
                if (!this.Camera2StreamConfigurationMap) {
                    this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap = str;
                    chainToParentEvent(event);
                    return this;
                }
                throw new java.lang.UnsupportedOperationException("Event - attempted to call methods on Event.Builder after build() was called");
            }
            throw new java.lang.NullPointerException("requestEvent is null");
        }

        public com.adobe.marketing.mobile.Event.Builder setEventData(java.util.Map<java.lang.String, java.lang.Object> map) {
            if (!this.Camera2StreamConfigurationMap) {
                try {
                    this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges = com.adobe.marketing.mobile.util.EventDataUtils.immutableClone(map);
                    return this;
                } catch (java.lang.Exception e) {
                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "EventBuilder", "Event data couldn't be serialized, empty data was set instead %s", e);
                    return this;
                }
            }
            throw new java.lang.UnsupportedOperationException("Event - attempted to call methods on Event.Builder after build() was called");
        }
    }

    private Event() {
    }

    public final com.adobe.marketing.mobile.Event cloneWithEventData(java.util.Map<java.lang.String, java.lang.Object> map) {
        com.adobe.marketing.mobile.Event build = new com.adobe.marketing.mobile.Event.Builder(this.getHighSpeedVideoSizes, this.getOutputFormats, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor).setEventData(map).build();
        build.getOutputMinFrameDuration = this.getOutputMinFrameDuration;
        build.getInputFormats = this.getInputFormats;
        build.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
        return build;
    }

    public final java.lang.String getName() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String getUniqueIdentifier() {
        return this.getOutputMinFrameDuration;
    }

    public final java.lang.String getSource() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final java.lang.String getType() {
        return this.getOutputFormats;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getEventData() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final long getTimestamp() {
        return this.getInputFormats;
    }

    public final java.lang.String getResponseID() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String getParentID() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final long getTimestampInSeconds() {
        return java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(this.getInputFormats);
    }

    public final java.lang.String[] getMask() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{\n    class: Event,\n    name: ");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(",\n    uniqueIdentifier: ");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(",\n    source: ");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(",\n    type: ");
        sb.append(this.getOutputFormats);
        sb.append(",\n    responseId: ");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(",\n    parentId: ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(",\n    timestamp: ");
        sb.append(this.getInputFormats);
        sb.append(",\n    data: ");
        java.util.Map<java.lang.String, java.lang.Object> map = this.getHighSpeedVideoFpsRanges;
        sb.append(map == null ? "{}" : com.adobe.marketing.mobile.internal.util.MapExtensionsKt.prettify(map));
        sb.append(",\n    mask: ");
        sb.append(java.util.Arrays.toString(this.getHighSpeedVideoFpsRangesFor));
        sb.append(",\n}");
        return sb.toString();
    }
}
