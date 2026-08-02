package androidx.webkit;

/* loaded from: classes7.dex */
public final class RestrictionAllowlist {
    final java.util.List<androidx.webkit.RestrictionAllowlist.ConfigTask> getHighSpeedVideoSizes;

    interface ConfigTask {
        void configure(org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface.Config config);
    }

    /* synthetic */ RestrictionAllowlist(java.util.List list, byte b) {
        this(list);
    }

    private RestrictionAllowlist(java.util.List<androidx.webkit.RestrictionAllowlist.ConfigTask> list) {
        this.getHighSpeedVideoSizes = list;
    }

    public static final class Builder {
        final java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.List<androidx.webkit.RestrictionAllowlist.ConfigTask> getHighSpeedVideoFpsRanges = new java.util.ArrayList();

        public Builder(java.util.Set<java.lang.String> set) {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(set);
        }

        public final androidx.webkit.RestrictionAllowlist.Builder addJavaScriptInterface(final java.lang.Object obj, final java.lang.String str) {
            this.getHighSpeedVideoFpsRanges.add(new androidx.webkit.RestrictionAllowlist.ConfigTask() { // from class: androidx.webkit.RestrictionAllowlist$Builder$$ExternalSyntheticLambda0
                @Override // androidx.webkit.RestrictionAllowlist.ConfigTask
                public final void configure(org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface.Config config) {
                    config.addJavascriptInterface(obj, str, androidx.webkit.RestrictionAllowlist.Builder.this.getHighResolutionOutputSizeshNQ4ISI);
                }
            });
            return this;
        }

        public final androidx.webkit.RestrictionAllowlist build() {
            return new androidx.webkit.RestrictionAllowlist(this.getHighSpeedVideoFpsRanges, (byte) 0);
        }
    }
}
