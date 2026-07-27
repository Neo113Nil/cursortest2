package io.appmetrica.analytics.modulesapi.internal.common;

/* loaded from: classes.dex */
public interface ModulePreferences {

    public static final class DefaultImpls {
        public static /* synthetic */ int getInt$default(ModulePreferences modulePreferences, String str, int i3, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt");
            }
            if ((i4 & 2) != 0) {
                i3 = 0;
            }
            return modulePreferences.getInt(str, i3);
        }

        public static /* synthetic */ long getLong$default(ModulePreferences modulePreferences, String str, long j3, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
            }
            if ((i3 & 2) != 0) {
                j3 = 0;
            }
            return modulePreferences.getLong(str, j3);
        }

        public static /* synthetic */ String getString$default(ModulePreferences modulePreferences, String str, String str2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
            }
            if ((i3 & 2) != 0) {
                str2 = null;
            }
            return modulePreferences.getString(str, str2);
        }
    }

    boolean getBoolean(String str, boolean z3);

    int getInt(String str, int i3);

    long getLong(String str, long j3);

    String getString(String str, String str2);

    void putBoolean(String str, boolean z3);

    void putInt(String str, int i3);

    void putLong(String str, long j3);

    void putString(String str, String str2);
}
