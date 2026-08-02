package org.chromium.support_lib_boundary;

@org.jspecify.annotations.NullMarked
/* loaded from: classes18.dex */
public final class ProcessGlobalConfigConstants {
    public static final java.lang.String CACHE_DIRECTORY_BASE_PATH = "CACHE_DIRECTORY_BASE_PATH";
    public static final java.lang.String CONFIGURE_PARTITIONED_COOKIES = "CONFIGURE_PARTITIONED_COOKIES";
    public static final java.lang.String DATA_DIRECTORY_BASE_PATH = "DATA_DIRECTORY_BASE_PATH";
    public static final java.lang.String DATA_DIRECTORY_SUFFIX = "DATA_DIRECTORY_SUFFIX";
    public static final java.lang.String UI_THREAD_STARTUP_MODE = "UI_THREAD_STARTUP_MODE";
    public static final int UI_THREAD_STARTUP_MODE_ASYNC_LONG_TASKS = 1;
    public static final int UI_THREAD_STARTUP_MODE_ASYNC_PLUS_MULTI_PROCESS = 4;
    public static final int UI_THREAD_STARTUP_MODE_ASYNC_SHORT_TASKS = 2;
    public static final int UI_THREAD_STARTUP_MODE_ASYNC_VERY_SHORT_TASKS = 3;
    public static final int UI_THREAD_STARTUP_MODE_DEFAULT = -1;
    public static final int UI_THREAD_STARTUP_MODE_SYNC = 0;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ProcessGlobalConfigMapKey {
    }

    private ProcessGlobalConfigConstants() {
    }
}
