package androidx.emoji2.viewsintegration;

/* loaded from: classes3.dex */
final class EmojiEditableFactory extends android.text.Editable.Factory {
    private static final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
    private static java.lang.Class<?> getHighResolutionOutputSizeshNQ4ISI;
    private static volatile android.text.Editable.Factory getHighSpeedVideoSizes;

    private EmojiEditableFactory() {
        try {
            getHighResolutionOutputSizeshNQ4ISI = java.lang.Class.forName("android.text.DynamicLayout$ChangeWatcher", false, getClass().getClassLoader());
        } catch (java.lang.Throwable unused) {
        }
    }

    public static android.text.Editable.Factory getHighSpeedVideoFpsRangesFor() {
        if (getHighSpeedVideoSizes == null) {
            synchronized (Camera2StreamConfigurationMap) {
                if (getHighSpeedVideoSizes == null) {
                    getHighSpeedVideoSizes = new androidx.emoji2.viewsintegration.EmojiEditableFactory();
                }
            }
        }
        return getHighSpeedVideoSizes;
    }

    @Override // android.text.Editable.Factory
    public final android.text.Editable newEditable(java.lang.CharSequence charSequence) {
        java.lang.Class<?> cls = getHighResolutionOutputSizeshNQ4ISI;
        if (cls != null) {
            return androidx.emoji2.text.SpannableBuilder.create(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
