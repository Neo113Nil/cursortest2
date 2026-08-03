package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public final class c implements java.lang.Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public android.content.SharedPreferences f3659a;
    public final java.lang.Thread.UncaughtExceptionHandler b = java.lang.Thread.getDefaultUncaughtExceptionHandler();

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        android.content.SharedPreferences sharedPreferences = this.f3659a;
        if (sharedPreferences != null) {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            th.printStackTrace(new java.io.PrintWriter(stringWriter));
            java.lang.String stringBuffer = stringWriter.getBuffer().toString();
            if (stringBuffer.contains("com.fyber.inneractive")) {
                sharedPreferences.edit().putString("FyberExceptionKey", stringBuffer).putString("FyberVersionKey", com.fyber.inneractive.sdk.external.InneractiveAdManager.getVersion()).putString("FyberNameKey", th.getClass().getName()).putString("FyberDescriptionKey", th.getLocalizedMessage()).commit();
            }
        }
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            try {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
