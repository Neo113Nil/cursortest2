package com.datadog.trace.core.propagation.ptags;

/* loaded from: classes3.dex */
public class PTagsFactory implements com.datadog.trace.core.propagation.PropagationTags.Factory {
    final int getHighResolutionOutputSizeshNQ4ISI;
    final java.util.EnumMap<com.datadog.trace.core.propagation.PropagationTags.HeaderType, com.datadog.trace.core.propagation.ptags.PTagsCodec> getHighSpeedVideoSizes;

    public PTagsFactory(int i) {
        java.util.EnumMap<com.datadog.trace.core.propagation.PropagationTags.HeaderType, com.datadog.trace.core.propagation.ptags.PTagsCodec> enumMap = new java.util.EnumMap<>((java.lang.Class<com.datadog.trace.core.propagation.PropagationTags.HeaderType>) com.datadog.trace.core.propagation.PropagationTags.HeaderType.class);
        this.getHighSpeedVideoSizes = enumMap;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        enumMap.put((java.util.EnumMap<com.datadog.trace.core.propagation.PropagationTags.HeaderType, com.datadog.trace.core.propagation.ptags.PTagsCodec>) com.datadog.trace.core.propagation.PropagationTags.HeaderType.DATADOG, (com.datadog.trace.core.propagation.PropagationTags.HeaderType) new com.datadog.trace.core.propagation.ptags.DatadogPTagsCodec(i));
        enumMap.put((java.util.EnumMap<com.datadog.trace.core.propagation.PropagationTags.HeaderType, com.datadog.trace.core.propagation.ptags.PTagsCodec>) com.datadog.trace.core.propagation.PropagationTags.HeaderType.W3C, (com.datadog.trace.core.propagation.PropagationTags.HeaderType) new com.datadog.trace.core.propagation.ptags.W3CPTagsCodec());
    }

    @Override // com.datadog.trace.core.propagation.PropagationTags.Factory
    public final com.datadog.trace.core.propagation.PropagationTags fromHeaderValue(com.datadog.trace.core.propagation.PropagationTags.HeaderType headerType, java.lang.String str) {
        return this.getHighSpeedVideoSizes.get(headerType).getHighSpeedVideoFpsRangesFor(this, str);
    }

    static class PTags extends com.datadog.trace.core.propagation.PropagationTags {
        volatile com.datadog.trace.core.propagation.ptags.TagValue Camera2StreamConfigurationMap;
        final java.util.List<com.datadog.trace.core.propagation.ptags.TagElement> getHighResolutionOutputSizeshNQ4ISI;
        volatile com.datadog.trace.core.propagation.ptags.TagValue getHighSpeedVideoFpsRanges;
        protected volatile java.lang.String getHighSpeedVideoFpsRangesFor;
        protected final com.datadog.trace.core.propagation.ptags.PTagsFactory getHighSpeedVideoSizes;
        protected volatile java.lang.String getHighSpeedVideoSizesFor;
        private volatile java.lang.String getInputFormats;
        private final boolean getInputSizeshNQ4ISI;
        private volatile java.lang.String[] getOutputFormats;
        private volatile java.lang.CharSequence getOutputMinFrameDuration;
        private volatile int getOutputSizes;
        private volatile int getOutputSizeshNQ4ISI;
        private volatile com.datadog.trace.core.propagation.ptags.TagValue getOutputStallDuration;
        private volatile long getOutputStallDurationlomOqCM;

        public PTags(com.datadog.trace.core.propagation.ptags.PTagsFactory pTagsFactory, java.util.List<com.datadog.trace.core.propagation.ptags.TagElement> list, com.datadog.trace.core.propagation.ptags.TagValue tagValue, com.datadog.trace.core.propagation.ptags.TagValue tagValue2) {
            this(pTagsFactory, list, tagValue, tagValue2, androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT, null);
        }

        PTags(com.datadog.trace.core.propagation.ptags.PTagsFactory pTagsFactory, java.util.List<com.datadog.trace.core.propagation.ptags.TagElement> list, com.datadog.trace.core.propagation.ptags.TagValue tagValue, com.datadog.trace.core.propagation.ptags.TagValue tagValue2, int i, java.lang.CharSequence charSequence) {
            this.getOutputSizeshNQ4ISI = -1;
            this.getOutputFormats = null;
            this.getHighSpeedVideoSizes = pTagsFactory;
            this.getHighResolutionOutputSizeshNQ4ISI = list;
            this.getInputSizeshNQ4ISI = tagValue == null;
            this.Camera2StreamConfigurationMap = tagValue;
            this.getOutputSizes = i;
            this.getOutputMinFrameDuration = charSequence;
            if (tagValue2 != null) {
                java.lang.CharSequence highResolutionOutputSizeshNQ4ISI = tagValue2.getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.core.propagation.ptags.TagElement.Encoding.DATADOG);
                this.getOutputStallDurationlomOqCM = com.datadog.trace.api.internal.util.LongStringUtils.parseUnsignedLongHex(highResolutionOutputSizeshNQ4ISI, 0, highResolutionOutputSizeshNQ4ISI.length(), true);
            }
            this.getHighSpeedVideoFpsRanges = tagValue2;
            this.getHighSpeedVideoFpsRangesFor = null;
        }

        static com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags getHighSpeedVideoFpsRangesFor(com.datadog.trace.core.propagation.ptags.PTagsFactory pTagsFactory, java.lang.String str) {
            com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags pTags = new com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags(pTagsFactory, null, null, null, androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT, null);
            pTags.getHighSpeedVideoFpsRangesFor = str;
            return pTags;
        }

        @Override // com.datadog.trace.core.propagation.PropagationTags
        public void updateTraceSamplingPriority(int i, int i2) {
            if ((i == -128 || !this.getInputSizeshNQ4ISI) && i2 != -128) {
                return;
            }
            if (this.getOutputSizes != i) {
                com.datadog.trace.core.propagation.PropagationTags.HeaderType headerType = com.datadog.trace.core.propagation.PropagationTags.HeaderType.W3C;
                if (headerType == com.datadog.trace.core.propagation.PropagationTags.HeaderType.DATADOG) {
                    this.getOutputSizeshNQ4ISI = -1;
                }
                java.lang.String[] strArr = this.getOutputFormats;
                if (strArr != null) {
                    strArr[headerType.ordinal()] = null;
                }
            }
            this.getOutputSizes = i;
            if (i <= 0) {
                if (this.Camera2StreamConfigurationMap != null) {
                    com.datadog.trace.core.propagation.PropagationTags.HeaderType headerType2 = com.datadog.trace.core.propagation.PropagationTags.HeaderType.DATADOG;
                    if (headerType2 == com.datadog.trace.core.propagation.PropagationTags.HeaderType.DATADOG) {
                        this.getOutputSizeshNQ4ISI = -1;
                    }
                    java.lang.String[] strArr2 = this.getOutputFormats;
                    if (strArr2 != null) {
                        strArr2[headerType2.ordinal()] = null;
                    }
                    com.datadog.trace.core.propagation.PropagationTags.HeaderType headerType3 = com.datadog.trace.core.propagation.PropagationTags.HeaderType.W3C;
                    if (headerType3 == com.datadog.trace.core.propagation.PropagationTags.HeaderType.DATADOG) {
                        this.getOutputSizeshNQ4ISI = -1;
                    }
                    java.lang.String[] strArr3 = this.getOutputFormats;
                    if (strArr3 != null) {
                        strArr3[headerType3.ordinal()] = null;
                    }
                }
                this.Camera2StreamConfigurationMap = null;
                return;
            }
            if (i2 == -128) {
                i2 = 0;
            }
            if (i2 >= 0) {
                com.datadog.trace.core.propagation.ptags.TagValue highResolutionOutputSizeshNQ4ISI = com.datadog.trace.core.propagation.ptags.TagValue.getHighResolutionOutputSizeshNQ4ISI("-".concat(java.lang.String.valueOf(i2)));
                if (!highResolutionOutputSizeshNQ4ISI.equals(this.Camera2StreamConfigurationMap)) {
                    com.datadog.trace.core.propagation.PropagationTags.HeaderType headerType4 = com.datadog.trace.core.propagation.PropagationTags.HeaderType.DATADOG;
                    if (headerType4 == com.datadog.trace.core.propagation.PropagationTags.HeaderType.DATADOG) {
                        this.getOutputSizeshNQ4ISI = -1;
                    }
                    java.lang.String[] strArr4 = this.getOutputFormats;
                    if (strArr4 != null) {
                        strArr4[headerType4.ordinal()] = null;
                    }
                    com.datadog.trace.core.propagation.PropagationTags.HeaderType headerType5 = com.datadog.trace.core.propagation.PropagationTags.HeaderType.W3C;
                    if (headerType5 == com.datadog.trace.core.propagation.PropagationTags.HeaderType.DATADOG) {
                        this.getOutputSizeshNQ4ISI = -1;
                    }
                    java.lang.String[] strArr5 = this.getOutputFormats;
                    if (strArr5 != null) {
                        strArr5[headerType5.ordinal()] = null;
                    }
                }
                this.Camera2StreamConfigurationMap = highResolutionOutputSizeshNQ4ISI;
            }
        }

        @Override // com.datadog.trace.core.propagation.PropagationTags
        public int getSamplingPriority() {
            return this.getOutputSizes;
        }

        @Override // com.datadog.trace.core.propagation.PropagationTags
        public void updateTraceOrigin(java.lang.CharSequence charSequence) {
            if (java.util.Objects.equals(this.getOutputMinFrameDuration, charSequence)) {
                return;
            }
            com.datadog.trace.core.propagation.PropagationTags.HeaderType headerType = com.datadog.trace.core.propagation.PropagationTags.HeaderType.W3C;
            if (headerType == com.datadog.trace.core.propagation.PropagationTags.HeaderType.DATADOG) {
                this.getOutputSizeshNQ4ISI = -1;
            }
            java.lang.String[] strArr = this.getOutputFormats;
            if (strArr != null) {
                strArr[headerType.ordinal()] = null;
            }
            this.getOutputMinFrameDuration = com.datadog.trace.core.propagation.ptags.TagValue.getHighResolutionOutputSizeshNQ4ISI(charSequence);
        }

        @Override // com.datadog.trace.core.propagation.PropagationTags
        public java.lang.CharSequence getOrigin() {
            return this.getOutputMinFrameDuration;
        }

        @Override // com.datadog.trace.core.propagation.PropagationTags
        public long getTraceIdHighOrderBits() {
            return this.getOutputStallDurationlomOqCM;
        }

        @Override // com.datadog.trace.core.propagation.PropagationTags
        public void updateTraceIdHighOrderBits(long j) {
            if (this.getOutputStallDurationlomOqCM != j) {
                this.getOutputStallDurationlomOqCM = j;
                this.getHighSpeedVideoFpsRanges = j == 0 ? null : com.datadog.trace.core.propagation.ptags.TagValue.getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.api.internal.util.LongStringUtils.toHexStringPadded(j, 16));
                com.datadog.trace.core.propagation.PropagationTags.HeaderType headerType = com.datadog.trace.core.propagation.PropagationTags.HeaderType.DATADOG;
                if (headerType == com.datadog.trace.core.propagation.PropagationTags.HeaderType.DATADOG) {
                    this.getOutputSizeshNQ4ISI = -1;
                }
                java.lang.String[] strArr = this.getOutputFormats;
                if (strArr != null) {
                    strArr[headerType.ordinal()] = null;
                }
            }
        }

        @Override // com.datadog.trace.core.propagation.PropagationTags
        public java.lang.String getRumSessionId() {
            return this.getInputFormats;
        }

        @Override // com.datadog.trace.core.propagation.PropagationTags
        public void updateRumSessionId(java.lang.String str) {
            if (java.util.Objects.equals(this.getInputFormats, str)) {
                return;
            }
            this.getInputFormats = str;
            this.getOutputStallDuration = com.datadog.trace.core.propagation.ptags.TagValue.getHighResolutionOutputSizeshNQ4ISI(this.getInputFormats);
            com.datadog.trace.core.propagation.PropagationTags.HeaderType headerType = com.datadog.trace.core.propagation.PropagationTags.HeaderType.DATADOG;
            if (headerType == com.datadog.trace.core.propagation.PropagationTags.HeaderType.DATADOG) {
                this.getOutputSizeshNQ4ISI = -1;
            }
            java.lang.String[] strArr = this.getOutputFormats;
            if (strArr != null) {
                strArr[headerType.ordinal()] = null;
            }
            com.datadog.trace.core.propagation.PropagationTags.HeaderType headerType2 = com.datadog.trace.core.propagation.PropagationTags.HeaderType.W3C;
            if (headerType2 == com.datadog.trace.core.propagation.PropagationTags.HeaderType.DATADOG) {
                this.getOutputSizeshNQ4ISI = -1;
            }
            java.lang.String[] strArr2 = this.getOutputFormats;
            if (strArr2 != null) {
                strArr2[headerType2.ordinal()] = null;
            }
        }

        @Override // com.datadog.trace.core.propagation.PropagationTags
        public void fillTagMap(java.util.Map<java.lang.String, java.lang.String> map) {
            com.datadog.trace.core.propagation.ptags.PTagsCodec.Camera2StreamConfigurationMap(this, map);
        }

        private void getHighSpeedVideoSizes(com.datadog.trace.core.propagation.PropagationTags.HeaderType headerType, java.lang.String str) {
            java.lang.String[] strArr = this.getOutputFormats;
            if (strArr == null) {
                strArr = new java.lang.String[com.datadog.trace.core.propagation.PropagationTags.HeaderType.getNumValues()];
                this.getOutputFormats = strArr;
            }
            strArr[headerType.ordinal()] = str;
        }

        final int getHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
        }

        final boolean getHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI <= 0;
        }

        final int getHighSpeedVideoFpsRanges() {
            int i = this.getOutputSizeshNQ4ISI;
            if (i != -1) {
                return i;
            }
            java.util.List<com.datadog.trace.core.propagation.ptags.TagElement> list = this.getHighResolutionOutputSizeshNQ4ISI;
            if (list == null) {
                list = java.util.Collections.emptyList();
            }
            int highSpeedVideoFpsRanges = com.datadog.trace.core.propagation.ptags.PTagsCodec.getHighSpeedVideoFpsRanges(com.datadog.trace.core.propagation.ptags.PTagsCodec.getHighSpeedVideoFpsRanges(com.datadog.trace.core.propagation.ptags.PTagsCodec.getHighSpeedVideoFpsRanges(list), com.datadog.trace.core.propagation.ptags.PTagsCodec.DECISION_MAKER_TAG, this.Camera2StreamConfigurationMap), com.datadog.trace.core.propagation.ptags.PTagsCodec.TRACE_ID_TAG, this.getHighSpeedVideoFpsRanges);
            this.getOutputSizeshNQ4ISI = highSpeedVideoFpsRanges;
            return highSpeedVideoFpsRanges;
        }

        @Override // com.datadog.trace.core.propagation.PropagationTags
        public java.lang.String getW3CTracestate() {
            return this.getHighSpeedVideoSizesFor;
        }

        @Override // com.datadog.trace.core.propagation.PropagationTags
        public void updateW3CTracestate(java.lang.String str) {
            this.getHighSpeedVideoSizesFor = str;
        }

        final java.lang.String getHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // com.datadog.trace.core.propagation.PropagationTags
        public java.lang.String headerValue(com.datadog.trace.core.propagation.PropagationTags.HeaderType headerType) {
            java.lang.String[] strArr = this.getOutputFormats;
            java.lang.String str = strArr == null ? null : strArr[headerType.ordinal()];
            if (str == null) {
                str = com.datadog.trace.core.propagation.ptags.PTagsCodec.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes.getHighSpeedVideoSizes.get(headerType), this);
                if (str != null) {
                    getHighSpeedVideoSizes(headerType, str);
                } else {
                    getHighSpeedVideoSizes(headerType, "");
                }
            }
            if (str == "") {
                return null;
            }
            return str;
        }
    }

    @Override // com.datadog.trace.core.propagation.PropagationTags.Factory
    public final com.datadog.trace.core.propagation.PropagationTags empty() {
        return new com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags(this, null, null, null);
    }
}
