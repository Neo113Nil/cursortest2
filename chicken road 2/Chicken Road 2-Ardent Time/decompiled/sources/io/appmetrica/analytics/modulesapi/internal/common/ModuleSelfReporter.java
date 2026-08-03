package io.appmetrica.analytics.modulesapi.internal.common;

/* loaded from: classes.dex */
public interface ModuleSelfReporter {

    public static final class DefaultImpls {
        public static /* synthetic */ void reportError$default(io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter moduleSelfReporter, java.lang.String str, java.lang.Throwable th, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportError");
            }
            if ((i2 & 2) != 0) {
                th = null;
            }
            moduleSelfReporter.reportError(str, th);
        }

        public static /* synthetic */ void reportError$default(io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter moduleSelfReporter, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportError");
            }
            if ((i2 & 2) != 0) {
                str2 = null;
            }
            moduleSelfReporter.reportError(str, str2);
        }
    }

    void reportError(java.lang.String str, java.lang.String str2);

    void reportError(java.lang.String str, java.lang.Throwable th);

    void reportEvent(int i2, java.lang.String str, java.lang.String str2);

    void reportEvent(java.lang.String str);

    void reportEvent(java.lang.String str, java.lang.String str2);

    void reportEvent(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map);
}
