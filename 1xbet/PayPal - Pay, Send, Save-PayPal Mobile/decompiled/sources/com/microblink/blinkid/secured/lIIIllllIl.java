package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lIIIllllIl extends android.os.Handler {
    public lIIIllllIl(android.os.Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(android.os.Message message) {
        try {
            super.dispatchMessage(message);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable th2 = th;
            while (th2.getCause() != null) {
                th2 = th2.getCause();
            }
            java.lang.StackTraceElement[] stackTraceElementArr = (java.lang.StackTraceElement[]) message.obj;
            java.lang.StackTraceElement[] stackTrace = th2.getStackTrace();
            java.util.ArrayList arrayList = new java.util.ArrayList(stackTrace.length + stackTraceElementArr.length);
            java.util.Collections.addAll(arrayList, stackTrace);
            arrayList.add(new java.lang.StackTraceElement("********************* Posted to handler", "at: ", null, -2));
            for (int i = 5; i < stackTraceElementArr.length; i++) {
                arrayList.add(stackTraceElementArr[i]);
            }
            java.lang.StackTraceElement[] stackTraceElementArr2 = new java.lang.StackTraceElement[arrayList.size()];
            arrayList.toArray(stackTraceElementArr2);
            th2.setStackTrace(stackTraceElementArr2);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(android.os.Message message, long j) {
        message.obj = java.lang.Thread.currentThread().getStackTrace();
        return super.sendMessageAtTime(message, j);
    }
}
