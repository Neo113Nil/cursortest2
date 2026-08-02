package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public interface EncoderProfilesProvider {
    public static final androidx.camera.core.impl.EncoderProfilesProvider EMPTY = new androidx.camera.core.impl.EncoderProfilesProvider() { // from class: androidx.camera.core.impl.EncoderProfilesProvider.1
        @Override // androidx.camera.core.impl.EncoderProfilesProvider
        public androidx.camera.core.impl.EncoderProfilesProxy getAll(int i) {
            return null;
        }

        @Override // androidx.camera.core.impl.EncoderProfilesProvider
        public boolean hasProfile(int i) {
            return false;
        }
    };
    public static final java.util.List<java.lang.Integer> QUALITY_HIGH_TO_LOW = java.util.Collections.unmodifiableList(java.util.Arrays.asList(13, 10, 8, 11, 6, 5, 4, 9, 3, 7, 2));

    androidx.camera.core.impl.EncoderProfilesProxy getAll(int i);

    boolean hasProfile(int i);
}
