package com.gemalto.mfs.mwsdk.utils.async;

/* loaded from: classes3.dex */
public interface AsyncResult<T> {
    java.util.HashMap<java.lang.String, java.lang.Object> getAdditionalInformation();

    java.lang.Throwable getCausingException();

    int getErrorCode();

    java.lang.String getErrorMessage();

    T getResult();

    boolean isSuccessful();
}
