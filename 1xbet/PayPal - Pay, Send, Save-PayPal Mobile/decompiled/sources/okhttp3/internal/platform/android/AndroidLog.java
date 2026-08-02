package okhttp3.internal.platform.android;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0003R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lokhttp3/internal/platform/android/AndroidLog;", "", "<init>", "()V", "", "loggerName", "", "logLevel", "message", "", "t", "", "androidLog$okhttp", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "enable", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/logging/Logger;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/CopyOnWriteArraySet;", "", "getHighSpeedVideoSizes", "Ljava/util/Map;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidLog {
    public static final okhttp3.internal.platform.android.AndroidLog INSTANCE = new okhttp3.internal.platform.android.AndroidLog();
    private static final java.util.concurrent.CopyOnWriteArraySet<java.util.logging.Logger> getHighSpeedVideoFpsRanges = new java.util.concurrent.CopyOnWriteArraySet<>();
    private static final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizes;

    private AndroidLog() {
    }

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.Package r1 = okhttp3.OkHttpClient.class.getPackage();
        java.lang.String name2 = r1 != null ? r1.getName() : null;
        if (name2 != null) {
            linkedHashMap.put(name2, "OkHttp");
        }
        java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
        linkedHashMap2.put(okhttp3.OkHttpClient.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap2.put(okhttp3.internal.http2.Http2.class.getName(), "okhttp.Http2");
        linkedHashMap2.put(okhttp3.internal.concurrent.TaskRunner.class.getName(), "okhttp.TaskRunner");
        linkedHashMap2.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        getHighSpeedVideoSizes = kotlin.collections.MapsKt.toMap(linkedHashMap2);
    }

    public static /* synthetic */ void androidLog$okhttp$default(okhttp3.internal.platform.android.AndroidLog androidLog, java.lang.String str, int i, java.lang.String str2, java.lang.Throwable th, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            th = null;
        }
        androidLog.androidLog$okhttp(str, i, str2, th);
    }

    public final void enable() {
        java.util.logging.Level level;
        try {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : getHighSpeedVideoSizes.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                java.util.logging.Logger logger = java.util.logging.Logger.getLogger(key);
                if (getHighSpeedVideoFpsRanges.add(logger)) {
                    logger.setUseParentHandlers(false);
                    if (android.util.Log.isLoggable(value, 3)) {
                        level = java.util.logging.Level.FINE;
                    } else {
                        level = android.util.Log.isLoggable(value, 4) ? java.util.logging.Level.INFO : java.util.logging.Level.WARNING;
                    }
                    logger.setLevel(level);
                    logger.addHandler(okhttp3.internal.platform.android.AndroidLogHandler.INSTANCE);
                }
            }
        } catch (java.lang.RuntimeException e) {
            java.lang.System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (java.lang.UnsatisfiedLinkError e2) {
            java.lang.System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
    }

    public final void androidLog$okhttp(java.lang.String loggerName, int logLevel, java.lang.String message, java.lang.Throwable t) {
        int min;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loggerName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        java.lang.String str = getHighSpeedVideoSizes.get(loggerName);
        if (str == null) {
            str = kotlin.text.StringsKt.take(loggerName, 23);
        }
        if (android.util.Log.isLoggable(str, logLevel)) {
            if (t != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(message);
                sb.append('\n');
                sb.append(android.util.Log.getStackTraceString(t));
                message = sb.toString();
            }
            int length = message.length();
            int i = 0;
            while (i < length) {
                int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) message, '\n', i, false, 4, (java.lang.Object) null);
                if (indexOf$default == -1) {
                    indexOf$default = length;
                }
                while (true) {
                    min = java.lang.Math.min(indexOf$default, i + 4000);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(message.substring(i, min), "");
                    if (min >= indexOf$default) {
                        break;
                    } else {
                        i = min;
                    }
                }
                i = min + 1;
            }
        }
    }
}
