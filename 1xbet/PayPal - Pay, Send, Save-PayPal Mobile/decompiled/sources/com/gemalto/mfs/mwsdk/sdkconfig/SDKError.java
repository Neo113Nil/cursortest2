package com.gemalto.mfs.mwsdk.sdkconfig;

/* loaded from: classes3.dex */
public interface SDKError<T> {
    java.util.HashMap<java.lang.String, java.lang.Object> getAdditionalInformation();

    java.lang.Throwable getCausingException();

    T getErrorCode();

    java.lang.String getErrorMessage();
}
