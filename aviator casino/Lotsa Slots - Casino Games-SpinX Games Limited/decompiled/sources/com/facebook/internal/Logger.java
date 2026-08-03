package com.facebook.internal;

/* compiled from: Logger.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0016\"\u00020\u0001¢\u0006\u0002\u0010\u0017J\u0012\u0010\u0011\u001a\u00020\u00122\n\u0010\u0018\u001a\u00060\bj\u0002`\tJ\u0016\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0001J\u0006\u0010\u001b\u001a\u00020\u0005J\u0006\u0010\u001c\u001a\u00020\u0012J\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J\b\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bj\u0002`\tX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/facebook/internal/Logger;", "", "behavior", "Lcom/facebook/LoggingBehavior;", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "", "(Lcom/facebook/LoggingBehavior;Ljava/lang/String;)V", "contents", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "value", "", "priority", "getPriority", "()I", "setPriority", "(I)V", "append", "", "string", "format", "args", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "stringBuilder", "appendKeyValue", com.ironsource.X3.i.W, "getContents", "log", "logString", "shouldLog", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class Logger {
    public static final java.lang.String LOG_TAG_BASE = "FacebookSDK.";
    private final com.facebook.LoggingBehavior behavior;
    private java.lang.StringBuilder contents;
    private int priority;
    private final java.lang.String tag;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.internal.Logger.Companion INSTANCE = new com.facebook.internal.Logger.Companion(null);
    private static final java.util.HashMap<java.lang.String, java.lang.String> stringsToReplace = new java.util.HashMap<>();

    @kotlin.jvm.JvmStatic
    public static final void log(com.facebook.LoggingBehavior loggingBehavior, int i, java.lang.String str, java.lang.String str2) {
        INSTANCE.log(loggingBehavior, i, str, str2);
    }

    @kotlin.jvm.JvmStatic
    public static final void log(com.facebook.LoggingBehavior loggingBehavior, int i, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        INSTANCE.log(loggingBehavior, i, str, str2, objArr);
    }

    @kotlin.jvm.JvmStatic
    public static final void log(com.facebook.LoggingBehavior loggingBehavior, java.lang.String str, java.lang.String str2) {
        INSTANCE.log(loggingBehavior, str, str2);
    }

    @kotlin.jvm.JvmStatic
    public static final void log(com.facebook.LoggingBehavior loggingBehavior, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        INSTANCE.log(loggingBehavior, str, str2, objArr);
    }

    @kotlin.jvm.JvmStatic
    public static final synchronized void registerAccessToken(java.lang.String str) {
        synchronized (com.facebook.internal.Logger.class) {
            INSTANCE.registerAccessToken(str);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final synchronized void registerStringToReplace(java.lang.String str, java.lang.String str2) {
        synchronized (com.facebook.internal.Logger.class) {
            INSTANCE.registerStringToReplace(str, str2);
        }
    }

    public Logger(com.facebook.LoggingBehavior behavior, java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(behavior, "behavior");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        this.priority = 3;
        this.behavior = behavior;
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        this.tag = kotlin.jvm.internal.Intrinsics.stringPlus(LOG_TAG_BASE, com.facebook.internal.Validate.notNullOrEmpty(tag, com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY));
        this.contents = new java.lang.StringBuilder();
    }

    public final int getPriority() {
        return this.priority;
    }

    public final void setPriority(int i) {
        com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
        com.facebook.internal.Validate.oneOf(java.lang.Integer.valueOf(i), "value", 7, 3, 6, 4, 2, 5);
        setPriority(i);
    }

    public final java.lang.String getContents() {
        com.facebook.internal.Logger.Companion companion = INSTANCE;
        java.lang.String sb = this.contents.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "contents.toString()");
        return companion.replaceStrings(sb);
    }

    public final void log() {
        java.lang.String sb = this.contents.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "contents.toString()");
        logString(sb);
        this.contents = new java.lang.StringBuilder();
    }

    public final void logString(java.lang.String string) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        INSTANCE.log(this.behavior, this.priority, this.tag, string);
    }

    public final void append(java.lang.StringBuilder stringBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder");
        if (shouldLog()) {
            this.contents.append((java.lang.CharSequence) stringBuilder);
        }
    }

    public final void append(java.lang.String string) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        if (shouldLog()) {
            this.contents.append(string);
        }
    }

    public final void append(java.lang.String format, java.lang.Object... args) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
        if (shouldLog()) {
            java.lang.StringBuilder sb = this.contents;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(args, args.length);
            java.lang.String format2 = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
            sb.append(format2);
        }
    }

    public final void appendKeyValue(java.lang.String key, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        append("  %s:\t%s\n", key, value);
    }

    private final boolean shouldLog() {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        return com.facebook.FacebookSdk.isLoggingBehaviorEnabled(this.behavior);
    }

    /* compiled from: Logger.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007JA\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\"\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0013J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J9\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\"\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0007J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/facebook/internal/Logger$Companion;", "", "()V", "LOG_TAG_BASE", "", "stringsToReplace", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "log", "", "behavior", "Lcom/facebook/LoggingBehavior;", "priority", "", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "string", "format", "args", "", "(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "registerAccessToken", "accessToken", "registerStringToReplace", "original", "replace", "replaceStrings", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final synchronized void registerStringToReplace(java.lang.String original, java.lang.String replace) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(original, "original");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replace, "replace");
            com.facebook.internal.Logger.stringsToReplace.put(original, replace);
        }

        @kotlin.jvm.JvmStatic
        public final synchronized void registerAccessToken(java.lang.String accessToken) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            if (!com.facebook.FacebookSdk.isLoggingBehaviorEnabled(com.facebook.LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
                registerStringToReplace(accessToken, "ACCESS_TOKEN_REMOVED");
            }
        }

        @kotlin.jvm.JvmStatic
        public final void log(com.facebook.LoggingBehavior behavior, java.lang.String tag, java.lang.String string) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(behavior, "behavior");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
            log(behavior, 3, tag, string);
        }

        @kotlin.jvm.JvmStatic
        public final void log(com.facebook.LoggingBehavior behavior, java.lang.String tag, java.lang.String format, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(behavior, "behavior");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            if (com.facebook.FacebookSdk.isLoggingBehaviorEnabled(behavior)) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(args, args.length);
                java.lang.String format2 = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
                log(behavior, 3, tag, format2);
            }
        }

        @kotlin.jvm.JvmStatic
        public final void log(com.facebook.LoggingBehavior behavior, int priority, java.lang.String tag, java.lang.String format, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(behavior, "behavior");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            if (com.facebook.FacebookSdk.isLoggingBehaviorEnabled(behavior)) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(args, args.length);
                java.lang.String format2 = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
                log(behavior, priority, tag, format2);
            }
        }

        @kotlin.jvm.JvmStatic
        public final void log(com.facebook.LoggingBehavior behavior, int priority, java.lang.String tag, java.lang.String string) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(behavior, "behavior");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            if (com.facebook.FacebookSdk.isLoggingBehaviorEnabled(behavior)) {
                java.lang.String replaceStrings = replaceStrings(string);
                if (!kotlin.text.StringsKt.startsWith$default(tag, com.facebook.internal.Logger.LOG_TAG_BASE, false, 2, (java.lang.Object) null)) {
                    tag = kotlin.jvm.internal.Intrinsics.stringPlus(com.facebook.internal.Logger.LOG_TAG_BASE, tag);
                }
                android.util.Log.println(priority, tag, replaceStrings);
                if (behavior == com.facebook.LoggingBehavior.DEVELOPER_ERRORS) {
                    new java.lang.Exception().printStackTrace();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized java.lang.String replaceStrings(java.lang.String string) {
            java.lang.String str;
            str = string;
            for (java.util.Map.Entry entry : com.facebook.internal.Logger.stringsToReplace.entrySet()) {
                str = kotlin.text.StringsKt.replace$default(str, (java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), false, 4, (java.lang.Object) null);
            }
            return str;
        }
    }
}
