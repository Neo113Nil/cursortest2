package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import io.sentry.ILogger;
import io.sentry.InitPriority;
import io.sentry.ProfileLifecycle;
import io.sentry.SentryFeedbackOptions;
import io.sentry.SentryIntegrationPackageStorage;
import io.sentry.SentryLevel;
import io.sentry.protocol.SdkVersion;
import io.sentry.util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
final class ManifestMetadataReader {
    static final String ANR_ATTACH_THREAD_DUMPS = "io.sentry.anr.attach-thread-dumps";
    static final String ANR_ENABLE = "io.sentry.anr.enable";
    static final String ANR_REPORT_DEBUG = "io.sentry.anr.report-debug";
    static final String ANR_TIMEOUT_INTERVAL_MILLIS = "io.sentry.anr.timeout-interval-millis";
    static final String ATTACH_SCREENSHOT = "io.sentry.attach-screenshot";
    static final String ATTACH_THREADS = "io.sentry.attach-threads";
    static final String ATTACH_VIEW_HIERARCHY = "io.sentry.attach-view-hierarchy";
    static final String AUTO_INIT = "io.sentry.auto-init";
    static final String AUTO_SESSION_TRACKING_ENABLE = "io.sentry.auto-session-tracking.enable";
    static final String BREADCRUMBS_ACTIVITY_LIFECYCLE_ENABLE = "io.sentry.breadcrumbs.activity-lifecycle";
    static final String BREADCRUMBS_APP_COMPONENTS_ENABLE = "io.sentry.breadcrumbs.app-components";
    static final String BREADCRUMBS_APP_LIFECYCLE_ENABLE = "io.sentry.breadcrumbs.app-lifecycle";
    static final String BREADCRUMBS_NETWORK_EVENTS_ENABLE = "io.sentry.breadcrumbs.network-events";
    static final String BREADCRUMBS_SYSTEM_EVENTS_ENABLE = "io.sentry.breadcrumbs.system-events";
    static final String BREADCRUMBS_USER_INTERACTION_ENABLE = "io.sentry.breadcrumbs.user-interaction";
    static final String CLIENT_REPORTS_ENABLE = "io.sentry.send-client-reports";
    static final String COLLECT_ADDITIONAL_CONTEXT = "io.sentry.additional-context";
    static final String DEBUG = "io.sentry.debug";
    static final String DEBUG_LEVEL = "io.sentry.debug.level";
    static final String DSN = "io.sentry.dsn";
    static final String ENABLE_APP_START_PROFILING = "io.sentry.profiling.enable-app-start";
    static final String ENABLE_AUTO_TRACE_ID_GENERATION = "io.sentry.traces.enable-auto-id-generation";
    static final String ENABLE_LOGS = "io.sentry.logs.enabled";
    static final String ENABLE_PERFORMANCE_V2 = "io.sentry.performance-v2.enable";
    static final String ENABLE_ROOT_CHECK = "io.sentry.enable-root-check";
    static final String ENABLE_SCOPE_PERSISTENCE = "io.sentry.enable-scope-persistence";
    static final String ENABLE_SENTRY = "io.sentry.enabled";
    static final String ENVIRONMENT = "io.sentry.environment";
    static final String FEEDBACK_EMAIL_REQUIRED = "io.sentry.feedback.is-email-required";
    static final String FEEDBACK_NAME_REQUIRED = "io.sentry.feedback.is-name-required";
    static final String FEEDBACK_SHOW_BRANDING = "io.sentry.feedback.show-branding";
    static final String FEEDBACK_SHOW_EMAIL = "io.sentry.feedback.show-email";
    static final String FEEDBACK_SHOW_NAME = "io.sentry.feedback.show-name";
    static final String FEEDBACK_USE_SENTRY_USER = "io.sentry.feedback.use-sentry-user";
    static final String FORCE_INIT = "io.sentry.force-init";
    static final String IDLE_TIMEOUT = "io.sentry.traces.idle-timeout";
    static final String IGNORED_ERRORS = "io.sentry.ignored-errors";
    static final String IN_APP_EXCLUDES = "io.sentry.in-app-excludes";
    static final String IN_APP_INCLUDES = "io.sentry.in-app-includes";
    static final String MAX_BREADCRUMBS = "io.sentry.max-breadcrumbs";
    static final String NDK_ENABLE = "io.sentry.ndk.enable";
    static final String NDK_SCOPE_SYNC_ENABLE = "io.sentry.ndk.scope-sync.enable";
    static final String PERFORM_FRAMES_TRACKING = "io.sentry.traces.frames-tracking";
    static final String PROFILER_START_ON_APP_START = "io.sentry.traces.profiling.start-on-app-start";
    static final String PROFILES_SAMPLE_RATE = "io.sentry.traces.profiling.sample-rate";
    static final String PROFILE_LIFECYCLE = "io.sentry.traces.profiling.lifecycle";
    static final String PROFILE_SESSION_SAMPLE_RATE = "io.sentry.traces.profiling.session-sample-rate";
    static final String PROGUARD_UUID = "io.sentry.proguard-uuid";
    static final String RELEASE = "io.sentry.release";
    static final String REPLAYS_DEBUG = "io.sentry.session-replay.debug";
    static final String REPLAYS_ERROR_SAMPLE_RATE = "io.sentry.session-replay.on-error-sample-rate";
    static final String REPLAYS_MASK_ALL_IMAGES = "io.sentry.session-replay.mask-all-images";
    static final String REPLAYS_MASK_ALL_TEXT = "io.sentry.session-replay.mask-all-text";
    static final String REPLAYS_SESSION_SAMPLE_RATE = "io.sentry.session-replay.session-sample-rate";
    static final String SAMPLE_RATE = "io.sentry.sample-rate";
    static final String SDK_NAME = "io.sentry.sdk.name";
    static final String SDK_VERSION = "io.sentry.sdk.version";
    static final String SEND_DEFAULT_PII = "io.sentry.send-default-pii";
    static final String SEND_MODULES = "io.sentry.send-modules";
    static final String SENTRY_GRADLE_PLUGIN_INTEGRATIONS = "io.sentry.gradle-plugin-integrations";
    static final String SESSION_TRACKING_TIMEOUT_INTERVAL_MILLIS = "io.sentry.session-tracking.timeout-interval-millis";
    static final String TRACES_ACTIVITY_AUTO_FINISH_ENABLE = "io.sentry.traces.activity.auto-finish.enable";
    static final String TRACES_ACTIVITY_ENABLE = "io.sentry.traces.activity.enable";
    static final String TRACES_SAMPLE_RATE = "io.sentry.traces.sample-rate";
    static final String TRACES_UI_ENABLE = "io.sentry.traces.user-interaction.enable";
    static final String TRACE_PROPAGATION_TARGETS = "io.sentry.traces.trace-propagation-targets";
    static final String TRACE_SAMPLING = "io.sentry.traces.trace-sampling";
    static final String TTFD_ENABLE = "io.sentry.traces.time-to-full-display.enable";
    static final String UNCAUGHT_EXCEPTION_HANDLER_ENABLE = "io.sentry.uncaught-exception-handler.enable";

    private ManifestMetadataReader() {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x01d9 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0055, B:12:0x0077, B:14:0x0081, B:15:0x0088, B:18:0x00c7, B:22:0x00d0, B:23:0x00eb, B:25:0x01d9, B:26:0x01de, B:28:0x01fe, B:30:0x0208, B:31:0x020f, B:33:0x023c, B:35:0x0246, B:36:0x024d, B:38:0x0253, B:40:0x025d, B:41:0x0264, B:43:0x027a, B:44:0x0285, B:46:0x02b8, B:47:0x02bf, B:50:0x02cb, B:51:0x02d8, B:53:0x02f4, B:54:0x02f9, B:56:0x032b, B:57:0x032f, B:59:0x0335, B:61:0x0343, B:63:0x039b, B:65:0x03a5, B:66:0x03b0, B:68:0x03ba, B:70:0x03c4, B:71:0x03cf, B:73:0x0407, B:75:0x040d, B:76:0x0411, B:78:0x0417, B:80:0x0421, B:82:0x0429, B:84:0x042f, B:85:0x0433, B:87:0x0439, B:89:0x0443, B:91:0x02d5, B:92:0x00de, B:93:0x04aa), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01fe A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0055, B:12:0x0077, B:14:0x0081, B:15:0x0088, B:18:0x00c7, B:22:0x00d0, B:23:0x00eb, B:25:0x01d9, B:26:0x01de, B:28:0x01fe, B:30:0x0208, B:31:0x020f, B:33:0x023c, B:35:0x0246, B:36:0x024d, B:38:0x0253, B:40:0x025d, B:41:0x0264, B:43:0x027a, B:44:0x0285, B:46:0x02b8, B:47:0x02bf, B:50:0x02cb, B:51:0x02d8, B:53:0x02f4, B:54:0x02f9, B:56:0x032b, B:57:0x032f, B:59:0x0335, B:61:0x0343, B:63:0x039b, B:65:0x03a5, B:66:0x03b0, B:68:0x03ba, B:70:0x03c4, B:71:0x03cf, B:73:0x0407, B:75:0x040d, B:76:0x0411, B:78:0x0417, B:80:0x0421, B:82:0x0429, B:84:0x042f, B:85:0x0433, B:87:0x0439, B:89:0x0443, B:91:0x02d5, B:92:0x00de, B:93:0x04aa), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x023c A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0055, B:12:0x0077, B:14:0x0081, B:15:0x0088, B:18:0x00c7, B:22:0x00d0, B:23:0x00eb, B:25:0x01d9, B:26:0x01de, B:28:0x01fe, B:30:0x0208, B:31:0x020f, B:33:0x023c, B:35:0x0246, B:36:0x024d, B:38:0x0253, B:40:0x025d, B:41:0x0264, B:43:0x027a, B:44:0x0285, B:46:0x02b8, B:47:0x02bf, B:50:0x02cb, B:51:0x02d8, B:53:0x02f4, B:54:0x02f9, B:56:0x032b, B:57:0x032f, B:59:0x0335, B:61:0x0343, B:63:0x039b, B:65:0x03a5, B:66:0x03b0, B:68:0x03ba, B:70:0x03c4, B:71:0x03cf, B:73:0x0407, B:75:0x040d, B:76:0x0411, B:78:0x0417, B:80:0x0421, B:82:0x0429, B:84:0x042f, B:85:0x0433, B:87:0x0439, B:89:0x0443, B:91:0x02d5, B:92:0x00de, B:93:0x04aa), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0253 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0055, B:12:0x0077, B:14:0x0081, B:15:0x0088, B:18:0x00c7, B:22:0x00d0, B:23:0x00eb, B:25:0x01d9, B:26:0x01de, B:28:0x01fe, B:30:0x0208, B:31:0x020f, B:33:0x023c, B:35:0x0246, B:36:0x024d, B:38:0x0253, B:40:0x025d, B:41:0x0264, B:43:0x027a, B:44:0x0285, B:46:0x02b8, B:47:0x02bf, B:50:0x02cb, B:51:0x02d8, B:53:0x02f4, B:54:0x02f9, B:56:0x032b, B:57:0x032f, B:59:0x0335, B:61:0x0343, B:63:0x039b, B:65:0x03a5, B:66:0x03b0, B:68:0x03ba, B:70:0x03c4, B:71:0x03cf, B:73:0x0407, B:75:0x040d, B:76:0x0411, B:78:0x0417, B:80:0x0421, B:82:0x0429, B:84:0x042f, B:85:0x0433, B:87:0x0439, B:89:0x0443, B:91:0x02d5, B:92:0x00de, B:93:0x04aa), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x027a A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0055, B:12:0x0077, B:14:0x0081, B:15:0x0088, B:18:0x00c7, B:22:0x00d0, B:23:0x00eb, B:25:0x01d9, B:26:0x01de, B:28:0x01fe, B:30:0x0208, B:31:0x020f, B:33:0x023c, B:35:0x0246, B:36:0x024d, B:38:0x0253, B:40:0x025d, B:41:0x0264, B:43:0x027a, B:44:0x0285, B:46:0x02b8, B:47:0x02bf, B:50:0x02cb, B:51:0x02d8, B:53:0x02f4, B:54:0x02f9, B:56:0x032b, B:57:0x032f, B:59:0x0335, B:61:0x0343, B:63:0x039b, B:65:0x03a5, B:66:0x03b0, B:68:0x03ba, B:70:0x03c4, B:71:0x03cf, B:73:0x0407, B:75:0x040d, B:76:0x0411, B:78:0x0417, B:80:0x0421, B:82:0x0429, B:84:0x042f, B:85:0x0433, B:87:0x0439, B:89:0x0443, B:91:0x02d5, B:92:0x00de, B:93:0x04aa), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02b8 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0055, B:12:0x0077, B:14:0x0081, B:15:0x0088, B:18:0x00c7, B:22:0x00d0, B:23:0x00eb, B:25:0x01d9, B:26:0x01de, B:28:0x01fe, B:30:0x0208, B:31:0x020f, B:33:0x023c, B:35:0x0246, B:36:0x024d, B:38:0x0253, B:40:0x025d, B:41:0x0264, B:43:0x027a, B:44:0x0285, B:46:0x02b8, B:47:0x02bf, B:50:0x02cb, B:51:0x02d8, B:53:0x02f4, B:54:0x02f9, B:56:0x032b, B:57:0x032f, B:59:0x0335, B:61:0x0343, B:63:0x039b, B:65:0x03a5, B:66:0x03b0, B:68:0x03ba, B:70:0x03c4, B:71:0x03cf, B:73:0x0407, B:75:0x040d, B:76:0x0411, B:78:0x0417, B:80:0x0421, B:82:0x0429, B:84:0x042f, B:85:0x0433, B:87:0x0439, B:89:0x0443, B:91:0x02d5, B:92:0x00de, B:93:0x04aa), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02f4 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0055, B:12:0x0077, B:14:0x0081, B:15:0x0088, B:18:0x00c7, B:22:0x00d0, B:23:0x00eb, B:25:0x01d9, B:26:0x01de, B:28:0x01fe, B:30:0x0208, B:31:0x020f, B:33:0x023c, B:35:0x0246, B:36:0x024d, B:38:0x0253, B:40:0x025d, B:41:0x0264, B:43:0x027a, B:44:0x0285, B:46:0x02b8, B:47:0x02bf, B:50:0x02cb, B:51:0x02d8, B:53:0x02f4, B:54:0x02f9, B:56:0x032b, B:57:0x032f, B:59:0x0335, B:61:0x0343, B:63:0x039b, B:65:0x03a5, B:66:0x03b0, B:68:0x03ba, B:70:0x03c4, B:71:0x03cf, B:73:0x0407, B:75:0x040d, B:76:0x0411, B:78:0x0417, B:80:0x0421, B:82:0x0429, B:84:0x042f, B:85:0x0433, B:87:0x0439, B:89:0x0443, B:91:0x02d5, B:92:0x00de, B:93:0x04aa), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x032b A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0055, B:12:0x0077, B:14:0x0081, B:15:0x0088, B:18:0x00c7, B:22:0x00d0, B:23:0x00eb, B:25:0x01d9, B:26:0x01de, B:28:0x01fe, B:30:0x0208, B:31:0x020f, B:33:0x023c, B:35:0x0246, B:36:0x024d, B:38:0x0253, B:40:0x025d, B:41:0x0264, B:43:0x027a, B:44:0x0285, B:46:0x02b8, B:47:0x02bf, B:50:0x02cb, B:51:0x02d8, B:53:0x02f4, B:54:0x02f9, B:56:0x032b, B:57:0x032f, B:59:0x0335, B:61:0x0343, B:63:0x039b, B:65:0x03a5, B:66:0x03b0, B:68:0x03ba, B:70:0x03c4, B:71:0x03cf, B:73:0x0407, B:75:0x040d, B:76:0x0411, B:78:0x0417, B:80:0x0421, B:82:0x0429, B:84:0x042f, B:85:0x0433, B:87:0x0439, B:89:0x0443, B:91:0x02d5, B:92:0x00de, B:93:0x04aa), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x039b A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0055, B:12:0x0077, B:14:0x0081, B:15:0x0088, B:18:0x00c7, B:22:0x00d0, B:23:0x00eb, B:25:0x01d9, B:26:0x01de, B:28:0x01fe, B:30:0x0208, B:31:0x020f, B:33:0x023c, B:35:0x0246, B:36:0x024d, B:38:0x0253, B:40:0x025d, B:41:0x0264, B:43:0x027a, B:44:0x0285, B:46:0x02b8, B:47:0x02bf, B:50:0x02cb, B:51:0x02d8, B:53:0x02f4, B:54:0x02f9, B:56:0x032b, B:57:0x032f, B:59:0x0335, B:61:0x0343, B:63:0x039b, B:65:0x03a5, B:66:0x03b0, B:68:0x03ba, B:70:0x03c4, B:71:0x03cf, B:73:0x0407, B:75:0x040d, B:76:0x0411, B:78:0x0417, B:80:0x0421, B:82:0x0429, B:84:0x042f, B:85:0x0433, B:87:0x0439, B:89:0x0443, B:91:0x02d5, B:92:0x00de, B:93:0x04aa), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03ba A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0055, B:12:0x0077, B:14:0x0081, B:15:0x0088, B:18:0x00c7, B:22:0x00d0, B:23:0x00eb, B:25:0x01d9, B:26:0x01de, B:28:0x01fe, B:30:0x0208, B:31:0x020f, B:33:0x023c, B:35:0x0246, B:36:0x024d, B:38:0x0253, B:40:0x025d, B:41:0x0264, B:43:0x027a, B:44:0x0285, B:46:0x02b8, B:47:0x02bf, B:50:0x02cb, B:51:0x02d8, B:53:0x02f4, B:54:0x02f9, B:56:0x032b, B:57:0x032f, B:59:0x0335, B:61:0x0343, B:63:0x039b, B:65:0x03a5, B:66:0x03b0, B:68:0x03ba, B:70:0x03c4, B:71:0x03cf, B:73:0x0407, B:75:0x040d, B:76:0x0411, B:78:0x0417, B:80:0x0421, B:82:0x0429, B:84:0x042f, B:85:0x0433, B:87:0x0439, B:89:0x0443, B:91:0x02d5, B:92:0x00de, B:93:0x04aa), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0417 A[Catch: all -> 0x0052, LOOP:1: B:76:0x0411->B:78:0x0417, LOOP_END, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0055, B:12:0x0077, B:14:0x0081, B:15:0x0088, B:18:0x00c7, B:22:0x00d0, B:23:0x00eb, B:25:0x01d9, B:26:0x01de, B:28:0x01fe, B:30:0x0208, B:31:0x020f, B:33:0x023c, B:35:0x0246, B:36:0x024d, B:38:0x0253, B:40:0x025d, B:41:0x0264, B:43:0x027a, B:44:0x0285, B:46:0x02b8, B:47:0x02bf, B:50:0x02cb, B:51:0x02d8, B:53:0x02f4, B:54:0x02f9, B:56:0x032b, B:57:0x032f, B:59:0x0335, B:61:0x0343, B:63:0x039b, B:65:0x03a5, B:66:0x03b0, B:68:0x03ba, B:70:0x03c4, B:71:0x03cf, B:73:0x0407, B:75:0x040d, B:76:0x0411, B:78:0x0417, B:80:0x0421, B:82:0x0429, B:84:0x042f, B:85:0x0433, B:87:0x0439, B:89:0x0443, B:91:0x02d5, B:92:0x00de, B:93:0x04aa), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0439 A[Catch: all -> 0x0052, LOOP:2: B:85:0x0433->B:87:0x0439, LOOP_END, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0055, B:12:0x0077, B:14:0x0081, B:15:0x0088, B:18:0x00c7, B:22:0x00d0, B:23:0x00eb, B:25:0x01d9, B:26:0x01de, B:28:0x01fe, B:30:0x0208, B:31:0x020f, B:33:0x023c, B:35:0x0246, B:36:0x024d, B:38:0x0253, B:40:0x025d, B:41:0x0264, B:43:0x027a, B:44:0x0285, B:46:0x02b8, B:47:0x02bf, B:50:0x02cb, B:51:0x02d8, B:53:0x02f4, B:54:0x02f9, B:56:0x032b, B:57:0x032f, B:59:0x0335, B:61:0x0343, B:63:0x039b, B:65:0x03a5, B:66:0x03b0, B:68:0x03ba, B:70:0x03c4, B:71:0x03cf, B:73:0x0407, B:75:0x040d, B:76:0x0411, B:78:0x0417, B:80:0x0421, B:82:0x0429, B:84:0x042f, B:85:0x0433, B:87:0x0439, B:89:0x0443, B:91:0x02d5, B:92:0x00de, B:93:0x04aa), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d5 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0030, B:9:0x0046, B:10:0x0055, B:12:0x0077, B:14:0x0081, B:15:0x0088, B:18:0x00c7, B:22:0x00d0, B:23:0x00eb, B:25:0x01d9, B:26:0x01de, B:28:0x01fe, B:30:0x0208, B:31:0x020f, B:33:0x023c, B:35:0x0246, B:36:0x024d, B:38:0x0253, B:40:0x025d, B:41:0x0264, B:43:0x027a, B:44:0x0285, B:46:0x02b8, B:47:0x02bf, B:50:0x02cb, B:51:0x02d8, B:53:0x02f4, B:54:0x02f9, B:56:0x032b, B:57:0x032f, B:59:0x0335, B:61:0x0343, B:63:0x039b, B:65:0x03a5, B:66:0x03b0, B:68:0x03ba, B:70:0x03c4, B:71:0x03cf, B:73:0x0407, B:75:0x040d, B:76:0x0411, B:78:0x0417, B:80:0x0421, B:82:0x0429, B:84:0x042f, B:85:0x0433, B:87:0x0439, B:89:0x0443, B:91:0x02d5, B:92:0x00de, B:93:0x04aa), top: B:2:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void applyMetadata(Context context, SentryAndroidOptions sentryAndroidOptions, BuildInfoProvider buildInfoProvider) {
        String readString;
        long readLong;
        List<String> readList;
        SdkVersion sdkVersion;
        List<String> readList2;
        List<String> readList3;
        List<String> readList4;
        Iterator<String> it;
        Iterator<String> it2;
        Objects.requireNonNull(context, "The application context is required.");
        Objects.requireNonNull(sentryAndroidOptions, "The options object is required.");
        try {
            Bundle metadata = getMetadata(context, sentryAndroidOptions.getLogger(), buildInfoProvider);
            ILogger logger = sentryAndroidOptions.getLogger();
            if (metadata != null) {
                sentryAndroidOptions.setDebug(readBool(metadata, logger, DEBUG, sentryAndroidOptions.isDebug()));
                if (sentryAndroidOptions.isDebug()) {
                    String name = sentryAndroidOptions.getDiagnosticLevel().name();
                    Locale locale = Locale.ROOT;
                    String readString2 = readString(metadata, logger, DEBUG_LEVEL, name.toLowerCase(locale));
                    if (readString2 != null) {
                        sentryAndroidOptions.setDiagnosticLevel(SentryLevel.valueOf(readString2.toUpperCase(locale)));
                    }
                }
                sentryAndroidOptions.setAnrEnabled(readBool(metadata, logger, ANR_ENABLE, sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setEnableAutoSessionTracking(readBool(metadata, logger, AUTO_SESSION_TRACKING_ENABLE, sentryAndroidOptions.isEnableAutoSessionTracking()));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    double readDouble = readDouble(metadata, logger, SAMPLE_RATE);
                    if (readDouble != -1.0d) {
                        sentryAndroidOptions.setSampleRate(Double.valueOf(readDouble));
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(readBool(metadata, logger, ANR_REPORT_DEBUG, sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(readLong(metadata, logger, ANR_TIMEOUT_INTERVAL_MILLIS, sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                sentryAndroidOptions.setAttachAnrThreadDump(readBool(metadata, logger, ANR_ATTACH_THREAD_DUMPS, sentryAndroidOptions.isAttachAnrThreadDump()));
                String readString3 = readString(metadata, logger, DSN, sentryAndroidOptions.getDsn());
                boolean readBool = readBool(metadata, logger, ENABLE_SENTRY, sentryAndroidOptions.isEnabled());
                if (readBool && (readString3 == null || !readString3.isEmpty())) {
                    if (readString3 == null) {
                        sentryAndroidOptions.getLogger().log(SentryLevel.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                    }
                    sentryAndroidOptions.setEnabled(readBool);
                    sentryAndroidOptions.setDsn(readString3);
                    sentryAndroidOptions.setEnableNdk(readBool(metadata, logger, NDK_ENABLE, sentryAndroidOptions.isEnableNdk()));
                    sentryAndroidOptions.setEnableScopeSync(readBool(metadata, logger, NDK_SCOPE_SYNC_ENABLE, sentryAndroidOptions.isEnableScopeSync()));
                    sentryAndroidOptions.setRelease(readString(metadata, logger, RELEASE, sentryAndroidOptions.getRelease()));
                    sentryAndroidOptions.setEnvironment(readString(metadata, logger, ENVIRONMENT, sentryAndroidOptions.getEnvironment()));
                    sentryAndroidOptions.setSessionTrackingIntervalMillis(readLong(metadata, logger, SESSION_TRACKING_TIMEOUT_INTERVAL_MILLIS, sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                    sentryAndroidOptions.setMaxBreadcrumbs((int) readLong(metadata, logger, MAX_BREADCRUMBS, sentryAndroidOptions.getMaxBreadcrumbs()));
                    sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_ACTIVITY_LIFECYCLE_ENABLE, sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                    sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_APP_LIFECYCLE_ENABLE, sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                    sentryAndroidOptions.setEnableSystemEventBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_SYSTEM_EVENTS_ENABLE, sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                    sentryAndroidOptions.setEnableAppComponentBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_APP_COMPONENTS_ENABLE, sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                    sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_USER_INTERACTION_ENABLE, sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                    sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_NETWORK_EVENTS_ENABLE, sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                    sentryAndroidOptions.setEnableUncaughtExceptionHandler(readBool(metadata, logger, UNCAUGHT_EXCEPTION_HANDLER_ENABLE, sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                    sentryAndroidOptions.setAttachThreads(readBool(metadata, logger, ATTACH_THREADS, sentryAndroidOptions.isAttachThreads()));
                    sentryAndroidOptions.setAttachScreenshot(readBool(metadata, logger, ATTACH_SCREENSHOT, sentryAndroidOptions.isAttachScreenshot()));
                    sentryAndroidOptions.setAttachViewHierarchy(readBool(metadata, logger, ATTACH_VIEW_HIERARCHY, sentryAndroidOptions.isAttachViewHierarchy()));
                    sentryAndroidOptions.setSendClientReports(readBool(metadata, logger, CLIENT_REPORTS_ENABLE, sentryAndroidOptions.isSendClientReports()));
                    if (readBool(metadata, logger, AUTO_INIT, true)) {
                        sentryAndroidOptions.setInitPriority(InitPriority.LOW);
                    }
                    sentryAndroidOptions.setForceInit(readBool(metadata, logger, FORCE_INIT, sentryAndroidOptions.isForceInit()));
                    sentryAndroidOptions.setCollectAdditionalContext(readBool(metadata, logger, COLLECT_ADDITIONAL_CONTEXT, sentryAndroidOptions.isCollectAdditionalContext()));
                    if (sentryAndroidOptions.getTracesSampleRate() == null) {
                        double readDouble2 = readDouble(metadata, logger, TRACES_SAMPLE_RATE);
                        if (readDouble2 != -1.0d) {
                            sentryAndroidOptions.setTracesSampleRate(Double.valueOf(readDouble2));
                        }
                    }
                    sentryAndroidOptions.setTraceSampling(readBool(metadata, logger, TRACE_SAMPLING, sentryAndroidOptions.isTraceSampling()));
                    sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(readBool(metadata, logger, TRACES_ACTIVITY_ENABLE, sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                    sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(readBool(metadata, logger, TRACES_ACTIVITY_AUTO_FINISH_ENABLE, sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                    if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                        double readDouble3 = readDouble(metadata, logger, PROFILES_SAMPLE_RATE);
                        if (readDouble3 != -1.0d) {
                            sentryAndroidOptions.setProfilesSampleRate(Double.valueOf(readDouble3));
                        }
                    }
                    if (sentryAndroidOptions.getProfileSessionSampleRate() == null) {
                        double readDouble4 = readDouble(metadata, logger, PROFILE_SESSION_SAMPLE_RATE);
                        if (readDouble4 != -1.0d) {
                            sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(readDouble4));
                        }
                    }
                    String name2 = sentryAndroidOptions.getProfileLifecycle().name();
                    Locale locale2 = Locale.ROOT;
                    readString = readString(metadata, logger, PROFILE_LIFECYCLE, name2.toLowerCase(locale2));
                    if (readString != null) {
                        sentryAndroidOptions.setProfileLifecycle(ProfileLifecycle.valueOf(readString.toUpperCase(locale2)));
                    }
                    sentryAndroidOptions.setStartProfilerOnAppStart(readBool(metadata, logger, PROFILER_START_ON_APP_START, sentryAndroidOptions.isStartProfilerOnAppStart()));
                    sentryAndroidOptions.setEnableUserInteractionTracing(readBool(metadata, logger, TRACES_UI_ENABLE, sentryAndroidOptions.isEnableUserInteractionTracing()));
                    sentryAndroidOptions.setEnableTimeToFullDisplayTracing(readBool(metadata, logger, TTFD_ENABLE, sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                    readLong = readLong(metadata, logger, IDLE_TIMEOUT, -1L);
                    if (readLong != -1) {
                        sentryAndroidOptions.setIdleTimeout(Long.valueOf(readLong));
                    }
                    readList = readList(metadata, logger, TRACE_PROPAGATION_TARGETS);
                    if (!metadata.containsKey(TRACE_PROPAGATION_TARGETS) && readList == null) {
                        sentryAndroidOptions.setTracePropagationTargets(Collections.emptyList());
                    } else if (readList != null) {
                        sentryAndroidOptions.setTracePropagationTargets(readList);
                    }
                    sentryAndroidOptions.setEnableFramesTracking(readBool(metadata, logger, PERFORM_FRAMES_TRACKING, true));
                    sentryAndroidOptions.setProguardUuid(readString(metadata, logger, PROGUARD_UUID, sentryAndroidOptions.getProguardUuid()));
                    sdkVersion = sentryAndroidOptions.getSdkVersion();
                    if (sdkVersion == null) {
                        sdkVersion = new SdkVersion("", "");
                    }
                    sdkVersion.setName(readStringNotNull(metadata, logger, SDK_NAME, sdkVersion.getName()));
                    sdkVersion.setVersion(readStringNotNull(metadata, logger, SDK_VERSION, sdkVersion.getVersion()));
                    sentryAndroidOptions.setSdkVersion(sdkVersion);
                    sentryAndroidOptions.setSendDefaultPii(readBool(metadata, logger, SEND_DEFAULT_PII, sentryAndroidOptions.isSendDefaultPii()));
                    readList2 = readList(metadata, logger, SENTRY_GRADLE_PLUGIN_INTEGRATIONS);
                    if (readList2 != null) {
                        Iterator<String> it3 = readList2.iterator();
                        while (it3.hasNext()) {
                            SentryIntegrationPackageStorage.getInstance().addIntegration(it3.next());
                        }
                    }
                    sentryAndroidOptions.setEnableRootCheck(readBool(metadata, logger, ENABLE_ROOT_CHECK, sentryAndroidOptions.isEnableRootCheck()));
                    sentryAndroidOptions.setSendModules(readBool(metadata, logger, SEND_MODULES, sentryAndroidOptions.isSendModules()));
                    sentryAndroidOptions.setEnablePerformanceV2(readBool(metadata, logger, ENABLE_PERFORMANCE_V2, sentryAndroidOptions.isEnablePerformanceV2()));
                    sentryAndroidOptions.setEnableAppStartProfiling(readBool(metadata, logger, ENABLE_APP_START_PROFILING, sentryAndroidOptions.isEnableAppStartProfiling()));
                    sentryAndroidOptions.setEnableScopePersistence(readBool(metadata, logger, ENABLE_SCOPE_PERSISTENCE, sentryAndroidOptions.isEnableScopePersistence()));
                    sentryAndroidOptions.setEnableAutoTraceIdGeneration(readBool(metadata, logger, ENABLE_AUTO_TRACE_ID_GENERATION, sentryAndroidOptions.isEnableAutoTraceIdGeneration()));
                    if (sentryAndroidOptions.getSessionReplay().getSessionSampleRate() == null) {
                        double readDouble5 = readDouble(metadata, logger, REPLAYS_SESSION_SAMPLE_RATE);
                        if (readDouble5 != -1.0d) {
                            sentryAndroidOptions.getSessionReplay().setSessionSampleRate(Double.valueOf(readDouble5));
                        }
                    }
                    if (sentryAndroidOptions.getSessionReplay().getOnErrorSampleRate() == null) {
                        double readDouble6 = readDouble(metadata, logger, REPLAYS_ERROR_SAMPLE_RATE);
                        if (readDouble6 != -1.0d) {
                            sentryAndroidOptions.getSessionReplay().setOnErrorSampleRate(Double.valueOf(readDouble6));
                        }
                    }
                    sentryAndroidOptions.getSessionReplay().setMaskAllText(readBool(metadata, logger, REPLAYS_MASK_ALL_TEXT, true));
                    sentryAndroidOptions.getSessionReplay().setMaskAllImages(readBool(metadata, logger, REPLAYS_MASK_ALL_IMAGES, true));
                    sentryAndroidOptions.getSessionReplay().setDebug(readBool(metadata, logger, REPLAYS_DEBUG, false));
                    sentryAndroidOptions.setIgnoredErrors(readList(metadata, logger, IGNORED_ERRORS));
                    readList3 = readList(metadata, logger, IN_APP_INCLUDES);
                    if (readList3 != null && !readList3.isEmpty()) {
                        it2 = readList3.iterator();
                        while (it2.hasNext()) {
                            sentryAndroidOptions.addInAppInclude(it2.next());
                        }
                    }
                    readList4 = readList(metadata, logger, IN_APP_EXCLUDES);
                    if (readList4 != null && !readList4.isEmpty()) {
                        it = readList4.iterator();
                        while (it.hasNext()) {
                            sentryAndroidOptions.addInAppExclude(it.next());
                        }
                    }
                    sentryAndroidOptions.getLogs().setEnabled(readBool(metadata, logger, ENABLE_LOGS, sentryAndroidOptions.getLogs().isEnabled()));
                    SentryFeedbackOptions feedbackOptions = sentryAndroidOptions.getFeedbackOptions();
                    feedbackOptions.setNameRequired(readBool(metadata, logger, FEEDBACK_NAME_REQUIRED, feedbackOptions.isNameRequired()));
                    feedbackOptions.setShowName(readBool(metadata, logger, FEEDBACK_SHOW_NAME, feedbackOptions.isShowName()));
                    feedbackOptions.setEmailRequired(readBool(metadata, logger, FEEDBACK_EMAIL_REQUIRED, feedbackOptions.isEmailRequired()));
                    feedbackOptions.setShowEmail(readBool(metadata, logger, FEEDBACK_SHOW_EMAIL, feedbackOptions.isShowEmail()));
                    feedbackOptions.setUseSentryUser(readBool(metadata, logger, FEEDBACK_USE_SENTRY_USER, feedbackOptions.isUseSentryUser()));
                    feedbackOptions.setShowBranding(readBool(metadata, logger, FEEDBACK_SHOW_BRANDING, feedbackOptions.isShowBranding()));
                }
                sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                sentryAndroidOptions.setEnabled(readBool);
                sentryAndroidOptions.setDsn(readString3);
                sentryAndroidOptions.setEnableNdk(readBool(metadata, logger, NDK_ENABLE, sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(readBool(metadata, logger, NDK_SCOPE_SYNC_ENABLE, sentryAndroidOptions.isEnableScopeSync()));
                sentryAndroidOptions.setRelease(readString(metadata, logger, RELEASE, sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setEnvironment(readString(metadata, logger, ENVIRONMENT, sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(readLong(metadata, logger, SESSION_TRACKING_TIMEOUT_INTERVAL_MILLIS, sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setMaxBreadcrumbs((int) readLong(metadata, logger, MAX_BREADCRUMBS, sentryAndroidOptions.getMaxBreadcrumbs()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_ACTIVITY_LIFECYCLE_ENABLE, sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_APP_LIFECYCLE_ENABLE, sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_SYSTEM_EVENTS_ENABLE, sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_APP_COMPONENTS_ENABLE, sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_USER_INTERACTION_ENABLE, sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(readBool(metadata, logger, BREADCRUMBS_NETWORK_EVENTS_ENABLE, sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(readBool(metadata, logger, UNCAUGHT_EXCEPTION_HANDLER_ENABLE, sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                sentryAndroidOptions.setAttachThreads(readBool(metadata, logger, ATTACH_THREADS, sentryAndroidOptions.isAttachThreads()));
                sentryAndroidOptions.setAttachScreenshot(readBool(metadata, logger, ATTACH_SCREENSHOT, sentryAndroidOptions.isAttachScreenshot()));
                sentryAndroidOptions.setAttachViewHierarchy(readBool(metadata, logger, ATTACH_VIEW_HIERARCHY, sentryAndroidOptions.isAttachViewHierarchy()));
                sentryAndroidOptions.setSendClientReports(readBool(metadata, logger, CLIENT_REPORTS_ENABLE, sentryAndroidOptions.isSendClientReports()));
                if (readBool(metadata, logger, AUTO_INIT, true)) {
                }
                sentryAndroidOptions.setForceInit(readBool(metadata, logger, FORCE_INIT, sentryAndroidOptions.isForceInit()));
                sentryAndroidOptions.setCollectAdditionalContext(readBool(metadata, logger, COLLECT_ADDITIONAL_CONTEXT, sentryAndroidOptions.isCollectAdditionalContext()));
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                }
                sentryAndroidOptions.setTraceSampling(readBool(metadata, logger, TRACE_SAMPLING, sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(readBool(metadata, logger, TRACES_ACTIVITY_ENABLE, sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(readBool(metadata, logger, TRACES_ACTIVITY_AUTO_FINISH_ENABLE, sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                }
                if (sentryAndroidOptions.getProfileSessionSampleRate() == null) {
                }
                String name22 = sentryAndroidOptions.getProfileLifecycle().name();
                Locale locale22 = Locale.ROOT;
                readString = readString(metadata, logger, PROFILE_LIFECYCLE, name22.toLowerCase(locale22));
                if (readString != null) {
                }
                sentryAndroidOptions.setStartProfilerOnAppStart(readBool(metadata, logger, PROFILER_START_ON_APP_START, sentryAndroidOptions.isStartProfilerOnAppStart()));
                sentryAndroidOptions.setEnableUserInteractionTracing(readBool(metadata, logger, TRACES_UI_ENABLE, sentryAndroidOptions.isEnableUserInteractionTracing()));
                sentryAndroidOptions.setEnableTimeToFullDisplayTracing(readBool(metadata, logger, TTFD_ENABLE, sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                readLong = readLong(metadata, logger, IDLE_TIMEOUT, -1L);
                if (readLong != -1) {
                }
                readList = readList(metadata, logger, TRACE_PROPAGATION_TARGETS);
                if (!metadata.containsKey(TRACE_PROPAGATION_TARGETS)) {
                }
                if (readList != null) {
                }
                sentryAndroidOptions.setEnableFramesTracking(readBool(metadata, logger, PERFORM_FRAMES_TRACKING, true));
                sentryAndroidOptions.setProguardUuid(readString(metadata, logger, PROGUARD_UUID, sentryAndroidOptions.getProguardUuid()));
                sdkVersion = sentryAndroidOptions.getSdkVersion();
                if (sdkVersion == null) {
                }
                sdkVersion.setName(readStringNotNull(metadata, logger, SDK_NAME, sdkVersion.getName()));
                sdkVersion.setVersion(readStringNotNull(metadata, logger, SDK_VERSION, sdkVersion.getVersion()));
                sentryAndroidOptions.setSdkVersion(sdkVersion);
                sentryAndroidOptions.setSendDefaultPii(readBool(metadata, logger, SEND_DEFAULT_PII, sentryAndroidOptions.isSendDefaultPii()));
                readList2 = readList(metadata, logger, SENTRY_GRADLE_PLUGIN_INTEGRATIONS);
                if (readList2 != null) {
                }
                sentryAndroidOptions.setEnableRootCheck(readBool(metadata, logger, ENABLE_ROOT_CHECK, sentryAndroidOptions.isEnableRootCheck()));
                sentryAndroidOptions.setSendModules(readBool(metadata, logger, SEND_MODULES, sentryAndroidOptions.isSendModules()));
                sentryAndroidOptions.setEnablePerformanceV2(readBool(metadata, logger, ENABLE_PERFORMANCE_V2, sentryAndroidOptions.isEnablePerformanceV2()));
                sentryAndroidOptions.setEnableAppStartProfiling(readBool(metadata, logger, ENABLE_APP_START_PROFILING, sentryAndroidOptions.isEnableAppStartProfiling()));
                sentryAndroidOptions.setEnableScopePersistence(readBool(metadata, logger, ENABLE_SCOPE_PERSISTENCE, sentryAndroidOptions.isEnableScopePersistence()));
                sentryAndroidOptions.setEnableAutoTraceIdGeneration(readBool(metadata, logger, ENABLE_AUTO_TRACE_ID_GENERATION, sentryAndroidOptions.isEnableAutoTraceIdGeneration()));
                if (sentryAndroidOptions.getSessionReplay().getSessionSampleRate() == null) {
                }
                if (sentryAndroidOptions.getSessionReplay().getOnErrorSampleRate() == null) {
                }
                sentryAndroidOptions.getSessionReplay().setMaskAllText(readBool(metadata, logger, REPLAYS_MASK_ALL_TEXT, true));
                sentryAndroidOptions.getSessionReplay().setMaskAllImages(readBool(metadata, logger, REPLAYS_MASK_ALL_IMAGES, true));
                sentryAndroidOptions.getSessionReplay().setDebug(readBool(metadata, logger, REPLAYS_DEBUG, false));
                sentryAndroidOptions.setIgnoredErrors(readList(metadata, logger, IGNORED_ERRORS));
                readList3 = readList(metadata, logger, IN_APP_INCLUDES);
                if (readList3 != null) {
                    it2 = readList3.iterator();
                    while (it2.hasNext()) {
                    }
                }
                readList4 = readList(metadata, logger, IN_APP_EXCLUDES);
                if (readList4 != null) {
                    it = readList4.iterator();
                    while (it.hasNext()) {
                    }
                }
                sentryAndroidOptions.getLogs().setEnabled(readBool(metadata, logger, ENABLE_LOGS, sentryAndroidOptions.getLogs().isEnabled()));
                SentryFeedbackOptions feedbackOptions2 = sentryAndroidOptions.getFeedbackOptions();
                feedbackOptions2.setNameRequired(readBool(metadata, logger, FEEDBACK_NAME_REQUIRED, feedbackOptions2.isNameRequired()));
                feedbackOptions2.setShowName(readBool(metadata, logger, FEEDBACK_SHOW_NAME, feedbackOptions2.isShowName()));
                feedbackOptions2.setEmailRequired(readBool(metadata, logger, FEEDBACK_EMAIL_REQUIRED, feedbackOptions2.isEmailRequired()));
                feedbackOptions2.setShowEmail(readBool(metadata, logger, FEEDBACK_SHOW_EMAIL, feedbackOptions2.isShowEmail()));
                feedbackOptions2.setUseSentryUser(readBool(metadata, logger, FEEDBACK_USE_SENTRY_USER, feedbackOptions2.isUseSentryUser()));
                feedbackOptions2.setShowBranding(readBool(metadata, logger, FEEDBACK_SHOW_BRANDING, feedbackOptions2.isShowBranding()));
            }
            sentryAndroidOptions.getLogger().log(SentryLevel.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().log(SentryLevel.ERROR, "Failed to read configuration from android manifest metadata.", th);
        }
    }

    private static Bundle getMetadata(Context context, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        if (buildInfoProvider == null) {
            buildInfoProvider = new BuildInfoProvider(iLogger);
        }
        ApplicationInfo applicationInfo = ContextUtils.getApplicationInfo(context, buildInfoProvider);
        if (applicationInfo != null) {
            return applicationInfo.metaData;
        }
        return null;
    }

    public static boolean isAutoInit(Context context, ILogger iLogger) {
        Objects.requireNonNull(context, "The application context is required.");
        try {
            Bundle metadata = getMetadata(context, iLogger, null);
            if (metadata != null) {
                return readBool(metadata, iLogger, AUTO_INIT, true);
            }
            return true;
        } catch (Throwable th) {
            iLogger.log(SentryLevel.ERROR, "Failed to read auto-init from android manifest metadata.", th);
            return true;
        }
    }

    private static boolean readBool(Bundle bundle, ILogger iLogger, String str, boolean z4) {
        boolean z7 = bundle.getBoolean(str, z4);
        iLogger.log(SentryLevel.DEBUG, str + " read: " + z7, new Object[0]);
        return z7;
    }

    private static Boolean readBoolNullable(Bundle bundle, ILogger iLogger, String str, Boolean bool) {
        if (bundle.getSerializable(str) == null) {
            iLogger.log(SentryLevel.DEBUG, str + " used default " + bool, new Object[0]);
            return bool;
        }
        boolean z4 = bundle.getBoolean(str, bool != null);
        iLogger.log(SentryLevel.DEBUG, str + " read: " + z4, new Object[0]);
        return Boolean.valueOf(z4);
    }

    private static double readDouble(Bundle bundle, ILogger iLogger, String str) {
        double doubleValue = Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue();
        if (doubleValue == -1.0d) {
            doubleValue = Integer.valueOf(bundle.getInt(str, -1)).doubleValue();
        }
        iLogger.log(SentryLevel.DEBUG, str + " read: " + doubleValue, new Object[0]);
        return doubleValue;
    }

    private static List<String> readList(Bundle bundle, ILogger iLogger, String str) {
        String string = bundle.getString(str);
        iLogger.log(SentryLevel.DEBUG, e1.k.f(str, " read: ", string), new Object[0]);
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    private static long readLong(Bundle bundle, ILogger iLogger, String str, long j) {
        long j3 = bundle.getInt(str, (int) j);
        iLogger.log(SentryLevel.DEBUG, str + " read: " + j3, new Object[0]);
        return j3;
    }

    private static String readString(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string = bundle.getString(str, str2);
        iLogger.log(SentryLevel.DEBUG, e1.k.f(str, " read: ", string), new Object[0]);
        return string;
    }

    private static String readStringNotNull(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string = bundle.getString(str, str2);
        iLogger.log(SentryLevel.DEBUG, e1.k.f(str, " read: ", string), new Object[0]);
        return string;
    }
}
