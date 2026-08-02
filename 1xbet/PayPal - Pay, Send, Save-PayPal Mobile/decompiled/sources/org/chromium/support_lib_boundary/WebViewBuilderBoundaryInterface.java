package org.chromium.support_lib_boundary;

@org.jspecify.annotations.NullMarked
/* loaded from: classes18.dex */
public interface WebViewBuilderBoundaryInterface {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Baseline {
        public static final int DEFAULT = 0;
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ConfigField {
        public static final int BASELINE = 0;
        public static final int JAVASCRIPT_INTERFACE = 1;
        public static final int PROFILE_NAME = 3;
        public static final int RESTRICT_JAVASCRIPT_INTERFACE = 2;
    }

    android.webkit.WebView build(android.content.Context context, java.util.function.Consumer<java.util.function.BiConsumer<java.lang.Integer, java.lang.Object>> consumer);

    public static class Config implements java.util.function.Consumer<java.util.function.BiConsumer<java.lang.Integer, java.lang.Object>> {
        public java.lang.String profileName;
        public boolean restrictJavascriptInterface;
        public int baseline = 0;
        java.util.List<java.lang.Object> getHighSpeedVideoSizes = new java.util.ArrayList();
        java.util.Map<java.lang.String, java.lang.Boolean> getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();
        java.util.List<java.util.List<java.lang.String>> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();

        public void addJavascriptInterface(java.lang.Object obj, java.lang.String str, java.util.List<java.lang.String> list) {
            if (this.getHighSpeedVideoFpsRanges.containsKey(str)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("A duplicate JavaScript interface was provided for \"");
                sb.append(str);
                sb.append("\"");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.getHighSpeedVideoSizes.add(obj);
            this.getHighSpeedVideoFpsRanges.put(str, java.lang.Boolean.TRUE);
            this.getHighResolutionOutputSizeshNQ4ISI.add(list);
        }

        @Override // java.util.function.Consumer
        public void accept(java.util.function.BiConsumer<java.lang.Integer, java.lang.Object> biConsumer) {
            biConsumer.accept(0, java.lang.Integer.valueOf(this.baseline));
            biConsumer.accept(2, java.lang.Boolean.valueOf(this.restrictJavascriptInterface));
            biConsumer.accept(1, new java.lang.Object[]{this.getHighSpeedVideoSizes, new java.util.ArrayList(this.getHighSpeedVideoFpsRanges.keySet()), this.getHighResolutionOutputSizeshNQ4ISI});
            if (this.profileName != null) {
                biConsumer.accept(3, this.profileName);
            }
        }
    }
}
