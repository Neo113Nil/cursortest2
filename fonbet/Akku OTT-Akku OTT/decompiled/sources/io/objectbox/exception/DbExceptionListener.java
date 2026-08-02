package io.objectbox.exception;

/* loaded from: classes3.dex */
public interface DbExceptionListener {
    static void cancelCurrentException() {
        DbExceptionListenerJni.nativeCancelCurrentException();
    }

    void onDbException(Exception exc);
}
