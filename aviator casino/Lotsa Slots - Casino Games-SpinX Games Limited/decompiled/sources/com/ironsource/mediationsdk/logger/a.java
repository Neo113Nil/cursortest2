package com.ironsource.mediationsdk.logger;

/* loaded from: classes5.dex */
public class a extends com.ironsource.mediationsdk.logger.IronSourceLogger {
    public static final java.lang.String c = "console";
    public static final java.lang.String d = "LevelPlaySDK: ";

    private a() {
        super("console");
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag, java.lang.String str, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UIThread: ");
        sb.append(android.os.Looper.getMainLooper() == android.os.Looper.myLooper());
        sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
        java.lang.String sb2 = sb.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Activity: ");
        sb3.append(com.ironsource.environment.ContextProvider.getInstance().getCurrentActiveActivity() != null ? java.lang.Integer.valueOf(com.ironsource.environment.ContextProvider.getInstance().getCurrentActiveActivity().hashCode()) : java.lang.Boolean.FALSE);
        sb3.append(io.ktor.sse.ServerSentEventKt.SPACE);
        java.lang.String sb4 = sb3.toString();
        if (i == 0) {
            android.util.Log.v(d + ironSourceTag, sb2 + sb4 + str);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                android.util.Log.w(d + ironSourceTag, str);
                return;
            } else if (i == 3) {
                android.util.Log.e(d + ironSourceTag, str);
                return;
            } else if (i != 4) {
                return;
            }
        }
        android.util.Log.i(d + ironSourceTag, str);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag, java.lang.String str, java.lang.Throwable th) {
        log(ironSourceTag, str + ":stacktrace[" + android.util.Log.getStackTraceString(th) + com.ironsource.X3.j.e, 3);
    }

    public a(int i) {
        super("console", i);
    }
}
