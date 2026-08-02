package com.google.firebase.logger;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\b&\u0018\u0000 )2\u00020\u0001:\u0004*+,)B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ9\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0013J9\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0011J!\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0013J9\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0015\u0010\u0011J!\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0015\u0010\u0013J9\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u0011J!\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u0013J9\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0011J!\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0013J=\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0012\b\u0002\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0010\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¢\u0006\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u0007\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010("}, d2 = {"Lcom/google/firebase/logger/Logger;", "", "", "tag", "", "enabled", "Lcom/google/firebase/logger/Logger$Level;", "minLevel", "<init>", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)V", "format", "", "args", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "verbose", "(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "(Ljava/lang/String;Ljava/lang/Throwable;)I", com.datadog.android.rum.internal.domain.event.RumEventDeserializer.TELEMETRY_TYPE_DEBUG, "info", "warn", "error", "level", "logIfAble", "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "log", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "Z", "getEnabled", "()Z", "setEnabled", "(Z)V", "Lcom/google/firebase/logger/Logger$Level;", "getMinLevel", "()Lcom/google/firebase/logger/Logger$Level;", "setMinLevel", "(Lcom/google/firebase/logger/Logger$Level;)V", "Companion", "AndroidLogger", "FakeLogger", "Level"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class Logger {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.firebase.logger.Logger.Companion INSTANCE = new com.google.firebase.logger.Logger.Companion(null);
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.google.firebase.logger.Logger> loggers = new java.util.concurrent.ConcurrentHashMap<>();
    private boolean enabled;
    private com.google.firebase.logger.Logger.Level minLevel;
    private final java.lang.String tag;

    public abstract int log(com.google.firebase.logger.Logger.Level level, java.lang.String format, java.lang.Object[] args, java.lang.Throwable throwable);

    private Logger(java.lang.String str, boolean z, com.google.firebase.logger.Logger.Level level) {
        this.tag = str;
        this.enabled = z;
        this.minLevel = level;
    }

    public final java.lang.String getTag() {
        return this.tag;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final com.google.firebase.logger.Logger.Level getMinLevel() {
        return this.minLevel;
    }

    public final void setMinLevel(com.google.firebase.logger.Logger.Level level) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "");
        this.minLevel = level;
    }

    public static /* synthetic */ int verbose$default(com.google.firebase.logger.Logger logger, java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.verbose(str, objArr, th);
    }

    public final int verbose(java.lang.String format, java.lang.Object[] args, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
        return logIfAble(com.google.firebase.logger.Logger.Level.VERBOSE, format, args, throwable);
    }

    public static /* synthetic */ int verbose$default(com.google.firebase.logger.Logger logger, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.verbose(str, th);
    }

    public final int verbose(java.lang.String msg, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "");
        return logIfAble$default(this, com.google.firebase.logger.Logger.Level.VERBOSE, msg, null, throwable, 4, null);
    }

    public static /* synthetic */ int debug$default(com.google.firebase.logger.Logger logger, java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.debug(str, objArr, th);
    }

    public final int debug(java.lang.String format, java.lang.Object[] args, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
        return logIfAble(com.google.firebase.logger.Logger.Level.DEBUG, format, args, throwable);
    }

    public static /* synthetic */ int debug$default(com.google.firebase.logger.Logger logger, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.debug(str, th);
    }

    public final int debug(java.lang.String msg, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "");
        return logIfAble$default(this, com.google.firebase.logger.Logger.Level.DEBUG, msg, null, throwable, 4, null);
    }

    public static /* synthetic */ int info$default(com.google.firebase.logger.Logger logger, java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.info(str, objArr, th);
    }

    public final int info(java.lang.String format, java.lang.Object[] args, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
        return logIfAble(com.google.firebase.logger.Logger.Level.INFO, format, args, throwable);
    }

    public static /* synthetic */ int info$default(com.google.firebase.logger.Logger logger, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.info(str, th);
    }

    public final int info(java.lang.String msg, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "");
        return logIfAble$default(this, com.google.firebase.logger.Logger.Level.INFO, msg, null, throwable, 4, null);
    }

    public static /* synthetic */ int warn$default(com.google.firebase.logger.Logger logger, java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.warn(str, objArr, th);
    }

    public final int warn(java.lang.String format, java.lang.Object[] args, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
        return logIfAble(com.google.firebase.logger.Logger.Level.WARN, format, args, throwable);
    }

    public static /* synthetic */ int warn$default(com.google.firebase.logger.Logger logger, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.warn(str, th);
    }

    public final int warn(java.lang.String msg, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "");
        return logIfAble$default(this, com.google.firebase.logger.Logger.Level.WARN, msg, null, throwable, 4, null);
    }

    public static /* synthetic */ int error$default(com.google.firebase.logger.Logger logger, java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i & 4) != 0) {
            th = null;
        }
        return logger.error(str, objArr, th);
    }

    public final int error(java.lang.String format, java.lang.Object[] args, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
        return logIfAble(com.google.firebase.logger.Logger.Level.ERROR, format, args, throwable);
    }

    public static /* synthetic */ int error$default(com.google.firebase.logger.Logger logger, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i & 2) != 0) {
            th = null;
        }
        return logger.error(str, th);
    }

    public final int error(java.lang.String msg, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "");
        return logIfAble$default(this, com.google.firebase.logger.Logger.Level.ERROR, msg, null, throwable, 4, null);
    }

    static /* synthetic */ int logIfAble$default(com.google.firebase.logger.Logger logger, com.google.firebase.logger.Logger.Level level, java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logIfAble");
        }
        if ((i & 4) != 0) {
            objArr = new java.lang.Object[0];
        }
        return logger.logIfAble(level, str, objArr, th);
    }

    private final int logIfAble(com.google.firebase.logger.Logger.Level level, java.lang.String format, java.lang.Object[] args, java.lang.Throwable throwable) {
        if (!this.enabled) {
            return 0;
        }
        if (this.minLevel.getPriority() <= level.getPriority() || android.util.Log.isLoggable(this.tag, level.getPriority())) {
            return log(level, format, args, throwable);
        }
        return 0;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ;\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0010\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/google/firebase/logger/Logger$AndroidLogger;", "Lcom/google/firebase/logger/Logger;", "", "tag", "", "enabled", "Lcom/google/firebase/logger/Logger$Level;", "minLevel", "<init>", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)V", "level", "format", "", "", "args", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "log", "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class AndroidLogger extends com.google.firebase.logger.Logger {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AndroidLogger(java.lang.String str, boolean z, com.google.firebase.logger.Logger.Level level) {
            super(str, z, level, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "");
        }

        @Override // com.google.firebase.logger.Logger
        public final int log(com.google.firebase.logger.Logger.Level level, java.lang.String format, java.lang.Object[] args, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            if (args.length != 0) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(args, args.length);
                format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            }
            int i = com.google.firebase.logger.Logger.AndroidLogger.WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i == 1) {
                java.lang.String tag = getTag();
                return throwable != null ? android.util.Log.v(tag, format, throwable) : android.util.Log.v(tag, format);
            }
            if (i == 2) {
                java.lang.String tag2 = getTag();
                return throwable != null ? android.util.Log.d(tag2, format, throwable) : android.util.Log.d(tag2, format);
            }
            if (i == 3) {
                java.lang.String tag3 = getTag();
                return throwable != null ? android.util.Log.i(tag3, format, throwable) : android.util.Log.i(tag3, format);
            }
            if (i == 4) {
                java.lang.String tag4 = getTag();
                return throwable != null ? android.util.Log.w(tag4, format, throwable) : android.util.Log.w(tag4, format);
            }
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            java.lang.String tag5 = getTag();
            return throwable != null ? android.util.Log.e(tag5, format, throwable) : android.util.Log.e(tag5, format);
        }

        @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.google.firebase.logger.Logger.Level.values().length];
                try {
                    iArr[com.google.firebase.logger.Logger.Level.VERBOSE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.google.firebase.logger.Logger.Level.DEBUG.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.google.firebase.logger.Logger.Level.INFO.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.google.firebase.logger.Logger.Level.WARN.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[com.google.firebase.logger.Logger.Level.ERROR.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ;\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0010\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u00042\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ;\u0010\u001e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0010\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Lcom/google/firebase/logger/Logger$FakeLogger;", "Lcom/google/firebase/logger/Logger;", "", "tag", "", "enabled", "Lcom/google/firebase/logger/Logger$Level;", "minLevel", "<init>", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)V", "level", "format", "", "", "args", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "log", "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "", "clearLogMessages", "()V", "message", "hasLogMessage", "(Ljava/lang/String;)Z", "Lkotlin/Function1;", "predicate", "hasLogMessageThat", "(Lkotlin/jvm/functions/Function1;)Z", "toLogMessage", "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/String;", "", "record", "Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FakeLogger extends com.google.firebase.logger.Logger {
        private final java.util.List<java.lang.String> record;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeLogger(java.lang.String str, boolean z, com.google.firebase.logger.Logger.Level level) {
            super(str, z, level, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "");
            this.record = new java.util.ArrayList();
        }

        @Override // com.google.firebase.logger.Logger
        public final int log(com.google.firebase.logger.Logger.Level level, java.lang.String format, java.lang.Object[] args, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            java.lang.String logMessage = toLogMessage(level, format, args, throwable);
            java.lang.System.out.println((java.lang.Object) "Log: ".concat(java.lang.String.valueOf(logMessage)));
            this.record.add(logMessage);
            return logMessage.length();
        }

        public final void clearLogMessages() {
            this.record.clear();
        }

        public final boolean hasLogMessage(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            java.util.List<java.lang.String> list = this.record;
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                return false;
            }
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) it.next(), (java.lang.CharSequence) message, false, 2, (java.lang.Object) null)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean hasLogMessageThat(kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> predicate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
            java.util.List<java.lang.String> list = this.record;
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                return false;
            }
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (predicate.invoke(it.next()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }

        private final java.lang.String toLogMessage(com.google.firebase.logger.Logger.Level level, java.lang.String format, java.lang.Object[] args, java.lang.Throwable throwable) {
            if (args.length != 0) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(args, args.length);
                format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            }
            if (throwable != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(level);
                sb.append(' ');
                sb.append(format);
                sb.append(' ');
                sb.append(android.util.Log.getStackTraceString(throwable));
                java.lang.String obj = sb.toString();
                if (obj != null) {
                    return obj;
                }
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(level);
            sb2.append(' ');
            sb2.append(format);
            return sb2.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/google/firebase/logger/Logger$Level;", "", "", "priority", "<init>", "(Ljava/lang/String;II)V", com.visa.cbp.getEncExpo.warmup, "getPriority$com_google_firebase_firebase_common", "()I", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Level {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ com.google.firebase.logger.Logger.Level[] $VALUES;
        private final int priority;
        public static final com.google.firebase.logger.Logger.Level VERBOSE = new com.google.firebase.logger.Logger.Level("VERBOSE", 0, 2);
        public static final com.google.firebase.logger.Logger.Level DEBUG = new com.google.firebase.logger.Logger.Level("DEBUG", 1, 3);
        public static final com.google.firebase.logger.Logger.Level INFO = new com.google.firebase.logger.Logger.Level("INFO", 2, 4);
        public static final com.google.firebase.logger.Logger.Level WARN = new com.google.firebase.logger.Logger.Level("WARN", 3, 5);
        public static final com.google.firebase.logger.Logger.Level ERROR = new com.google.firebase.logger.Logger.Level("ERROR", 4, 6);

        private Level(java.lang.String str, int i, int i2) {
            this.priority = i2;
        }

        /* renamed from: getPriority$com_google_firebase_firebase_common, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }

        static {
            com.google.firebase.logger.Logger.Level[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        }

        public static com.google.firebase.logger.Logger.Level valueOf(java.lang.String str) {
            return (com.google.firebase.logger.Logger.Level) java.lang.Enum.valueOf(com.google.firebase.logger.Logger.Level.class, str);
        }

        public static com.google.firebase.logger.Logger.Level[] values() {
            return (com.google.firebase.logger.Logger.Level[]) $VALUES.clone();
        }

        public static kotlin.enums.EnumEntries<com.google.firebase.logger.Logger.Level> getEntries() {
            return $ENTRIES;
        }

        private static final /* synthetic */ com.google.firebase.logger.Logger.Level[] $values() {
            return new com.google.firebase.logger.Logger.Level[]{VERBOSE, DEBUG, INFO, WARN, ERROR};
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/google/firebase/logger/Logger$Companion;", "", "<init>", "()V", "", "tag", "", "enabled", "Lcom/google/firebase/logger/Logger$Level;", "minLevel", "Lcom/google/firebase/logger/Logger;", "getLogger", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)Lcom/google/firebase/logger/Logger;", "Lcom/google/firebase/logger/Logger$FakeLogger;", "setupFakeLogger", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)Lcom/google/firebase/logger/Logger$FakeLogger;", "Ljava/util/concurrent/ConcurrentHashMap;", "loggers", "Ljava/util/concurrent/ConcurrentHashMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ com.google.firebase.logger.Logger getLogger$default(com.google.firebase.logger.Logger.Companion companion, java.lang.String str, boolean z, com.google.firebase.logger.Logger.Level level, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                level = com.google.firebase.logger.Logger.Level.INFO;
            }
            return companion.getLogger(str, z, level);
        }

        @kotlin.jvm.JvmStatic
        public final com.google.firebase.logger.Logger getLogger(java.lang.String tag, boolean enabled, com.google.firebase.logger.Logger.Level minLevel) {
            java.lang.Object putIfAbsent;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minLevel, "");
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.google.firebase.logger.Logger.loggers;
            com.google.firebase.logger.Logger.AndroidLogger androidLogger = concurrentHashMap.get(tag);
            if (androidLogger == null && (putIfAbsent = concurrentHashMap.putIfAbsent(tag, (androidLogger = new com.google.firebase.logger.Logger.AndroidLogger(tag, enabled, minLevel)))) != null) {
                androidLogger = putIfAbsent;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(androidLogger, "");
            return (com.google.firebase.logger.Logger) androidLogger;
        }

        public static /* synthetic */ com.google.firebase.logger.Logger.FakeLogger setupFakeLogger$default(com.google.firebase.logger.Logger.Companion companion, java.lang.String str, boolean z, com.google.firebase.logger.Logger.Level level, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                level = com.google.firebase.logger.Logger.Level.DEBUG;
            }
            return companion.setupFakeLogger(str, z, level);
        }

        @kotlin.jvm.JvmStatic
        public final com.google.firebase.logger.Logger.FakeLogger setupFakeLogger(java.lang.String tag, boolean enabled, com.google.firebase.logger.Logger.Level minLevel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minLevel, "");
            com.google.firebase.logger.Logger.FakeLogger fakeLogger = new com.google.firebase.logger.Logger.FakeLogger(tag, enabled, minLevel);
            com.google.firebase.logger.Logger.loggers.put(tag, fakeLogger);
            return fakeLogger;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int warn(java.lang.String str, java.lang.Object... objArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        return warn$default(this, str, objArr, null, 4, null);
    }

    public final int warn(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return warn$default(this, str, null, 2, null);
    }

    public final int verbose(java.lang.String str, java.lang.Object... objArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        return verbose$default(this, str, objArr, null, 4, null);
    }

    public final int verbose(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return verbose$default(this, str, null, 2, null);
    }

    public final int info(java.lang.String str, java.lang.Object... objArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        return info$default(this, str, objArr, null, 4, null);
    }

    public final int info(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return info$default(this, str, null, 2, null);
    }

    public final int error(java.lang.String str, java.lang.Object... objArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        return error$default(this, str, objArr, null, 4, null);
    }

    public final int error(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return error$default(this, str, null, 2, null);
    }

    public final int debug(java.lang.String str, java.lang.Object... objArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        return debug$default(this, str, objArr, null, 4, null);
    }

    public final int debug(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return debug$default(this, str, null, 2, null);
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.firebase.logger.Logger.FakeLogger setupFakeLogger(java.lang.String str, boolean z, com.google.firebase.logger.Logger.Level level) {
        return INSTANCE.setupFakeLogger(str, z, level);
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.firebase.logger.Logger getLogger(java.lang.String str, boolean z, com.google.firebase.logger.Logger.Level level) {
        return INSTANCE.getLogger(str, z, level);
    }

    public /* synthetic */ Logger(java.lang.String str, boolean z, com.google.firebase.logger.Logger.Level level, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, level);
    }
}
