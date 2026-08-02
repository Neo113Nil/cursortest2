package org.chromium.net.impl;

import android.net.http.CallbackException;
import android.net.http.HttpException;
import android.net.http.InlineExecutionProhibitedException;
import android.net.http.NetworkException;
import android.net.http.QuicException;
import org.chromium.net.CronetException;

/* loaded from: classes4.dex */
class CronetExceptionTranslationUtils {

    interface CronetWork<T, E extends Exception> {
        T run() throws Exception;
    }

    public static <T, E extends Exception> T executeTranslatingCronetExceptions(CronetWork<T, E> work, Class<E> nonCronetException) throws CronetException, Exception {
        try {
            return work.run();
        } catch (Exception e) {
            if (isUncheckedAndroidCronetException(e)) {
                throw translateUncheckedAndroidCronetException(e);
            }
            if (isCheckedAndroidCronetException(e)) {
                throw translateCheckedAndroidCronetException(e);
            }
            if (nonCronetException.isInstance(e)) {
                throw e;
            }
            throw e;
        }
    }

    public static boolean isUncheckedAndroidCronetException(Exception e) {
        return e instanceof InlineExecutionProhibitedException;
    }

    public static boolean isCheckedAndroidCronetException(Exception e) {
        return e instanceof HttpException;
    }

    public static RuntimeException translateUncheckedAndroidCronetException(Exception e) {
        if (!isUncheckedAndroidCronetException(e)) {
            throw new IllegalArgumentException("Not an Android Cronet exception", e);
        }
        if (e instanceof InlineExecutionProhibitedException) {
            org.chromium.net.InlineExecutionProhibitedException inlineExecutionProhibitedException = new org.chromium.net.InlineExecutionProhibitedException();
            inlineExecutionProhibitedException.initCause(e);
            return inlineExecutionProhibitedException;
        }
        throw new UnsupportedOperationException("Unchecked exception translation discrepancy", e);
    }

    public static CronetException translateCheckedAndroidCronetException(Exception e) {
        if (!isCheckedAndroidCronetException(e)) {
            throw new IllegalArgumentException("Not an Android Cronet exception", e);
        }
        if (e instanceof QuicException) {
            return new AndroidQuicExceptionWrapper((QuicException) e);
        }
        if (e instanceof NetworkException) {
            return new AndroidNetworkExceptionWrapper((NetworkException) e);
        }
        if (e instanceof CallbackException) {
            return new AndroidCallbackExceptionWrapper((CallbackException) e);
        }
        if (e instanceof HttpException) {
            return new AndroidHttpExceptionWrapper((HttpException) e);
        }
        throw new UnsupportedOperationException("Checked exception translation discrepancy", e);
    }

    private CronetExceptionTranslationUtils() {
    }
}
