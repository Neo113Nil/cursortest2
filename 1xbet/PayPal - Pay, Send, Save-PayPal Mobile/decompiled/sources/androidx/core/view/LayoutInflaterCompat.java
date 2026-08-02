package androidx.core.view;

/* loaded from: classes3.dex */
public final class LayoutInflaterCompat {

    /* loaded from: classes7.dex */
    static class Factory2Wrapper implements android.view.LayoutInflater.Factory2 {
        final androidx.core.view.LayoutInflaterFactory getHighSpeedVideoSizes;

        Factory2Wrapper(androidx.core.view.LayoutInflaterFactory layoutInflaterFactory) {
            this.getHighSpeedVideoSizes = layoutInflaterFactory;
        }

        @Override // android.view.LayoutInflater.Factory
        public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
            return this.getHighSpeedVideoSizes.onCreateView(null, str, context, attributeSet);
        }

        @Override // android.view.LayoutInflater.Factory2
        public android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
            return this.getHighSpeedVideoSizes.onCreateView(view, str, context, attributeSet);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getClass().getName());
            sb.append("{");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append("}");
            return sb.toString();
        }
    }

    private LayoutInflaterCompat() {
    }

    @java.lang.Deprecated
    public static void setFactory(android.view.LayoutInflater layoutInflater, androidx.core.view.LayoutInflaterFactory layoutInflaterFactory) {
        layoutInflater.setFactory2(new androidx.core.view.LayoutInflaterCompat.Factory2Wrapper(layoutInflaterFactory));
    }

    public static void setFactory2(android.view.LayoutInflater layoutInflater, android.view.LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }

    @java.lang.Deprecated
    public static androidx.core.view.LayoutInflaterFactory getFactory(android.view.LayoutInflater layoutInflater) {
        android.view.LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof androidx.core.view.LayoutInflaterCompat.Factory2Wrapper) {
            return ((androidx.core.view.LayoutInflaterCompat.Factory2Wrapper) factory).getHighSpeedVideoSizes;
        }
        return null;
    }
}
