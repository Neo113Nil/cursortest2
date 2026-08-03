package io.appmetrica.analytics.modulesapi.internal.common;

/* loaded from: classes.dex */
public interface ModulePreferences {

    public static final class DefaultImpls {
        public static /* synthetic */ int getInt$default(io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences modulePreferences, java.lang.String str, int i2, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt");
            }
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            return modulePreferences.getInt(str, i2);
        }

        public static /* synthetic */ long getLong$default(io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences modulePreferences, java.lang.String str, long j2, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
            }
            if ((i2 & 2) != 0) {
                j2 = 0;
            }
            return modulePreferences.getLong(str, j2);
        }

        public static /* synthetic */ java.lang.String getString$default(io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences modulePreferences, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
            }
            if ((i2 & 2) != 0) {
                str2 = null;
            }
            return modulePreferences.getString(str, str2);
        }
    }

    boolean getBoolean(java.lang.String str, boolean z2);

    int getInt(java.lang.String str, int i2);

    long getLong(java.lang.String str, long j2);

    java.lang.String getString(java.lang.String str, java.lang.String str2);

    void putBoolean(java.lang.String str, boolean z2);

    void putInt(java.lang.String str, int i2);

    void putLong(java.lang.String str, long j2);

    void putString(java.lang.String str, java.lang.String str2);
}
