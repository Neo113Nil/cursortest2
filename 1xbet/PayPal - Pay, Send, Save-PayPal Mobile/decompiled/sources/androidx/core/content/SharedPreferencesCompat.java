package androidx.core.content;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public final class SharedPreferencesCompat {

    @java.lang.Deprecated
    public static final class EditorCompat {
        private static androidx.core.content.SharedPreferencesCompat.EditorCompat getHighSpeedVideoSizes;
        private final androidx.core.content.SharedPreferencesCompat.EditorCompat.Helper Camera2StreamConfigurationMap = new androidx.core.content.SharedPreferencesCompat.EditorCompat.Helper();

        static class Helper {
            Helper() {
            }

            public void getHighSpeedVideoFpsRangesFor(android.content.SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (java.lang.AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        private EditorCompat() {
        }

        @java.lang.Deprecated
        public static androidx.core.content.SharedPreferencesCompat.EditorCompat getInstance() {
            if (getHighSpeedVideoSizes == null) {
                getHighSpeedVideoSizes = new androidx.core.content.SharedPreferencesCompat.EditorCompat();
            }
            return getHighSpeedVideoSizes;
        }

        @java.lang.Deprecated
        public final void apply(android.content.SharedPreferences.Editor editor) {
            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(editor);
        }
    }

    private SharedPreferencesCompat() {
    }
}
