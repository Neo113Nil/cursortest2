package com.datadog.trace.core.propagation.ptags;

/* loaded from: classes3.dex */
abstract class TagElement implements java.lang.CharSequence {
    abstract java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.core.propagation.ptags.TagElement.Encoding encoding);

    TagElement() {
    }

    public enum Encoding {
        DATADOG("_dd.p."),
        W3C("t.");

        private static final com.datadog.trace.core.propagation.ptags.TagElement.Encoding[] getHighSpeedVideoFpsRangesFor;
        private static final int getHighSpeedVideoSizes;
        private final java.lang.String getHighSpeedVideoFpsRanges;

        static {
            com.datadog.trace.core.propagation.ptags.TagElement.Encoding[] values = values();
            getHighSpeedVideoFpsRangesFor = values;
            getHighSpeedVideoSizes = values.length;
        }

        Encoding(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
        }

        public final java.lang.String getPrefix() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final int getPrefixLength() {
            return this.getHighSpeedVideoFpsRanges.length();
        }

        static com.datadog.trace.core.propagation.ptags.TagElement.Encoding[] getHighSpeedVideoFpsRanges() {
            return getHighSpeedVideoFpsRangesFor;
        }

        static int getHighSpeedVideoSizes() {
            return getHighSpeedVideoSizes;
        }
    }
}
