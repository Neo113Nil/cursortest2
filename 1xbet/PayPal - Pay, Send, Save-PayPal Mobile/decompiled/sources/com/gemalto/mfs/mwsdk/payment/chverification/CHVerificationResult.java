package com.gemalto.mfs.mwsdk.payment.chverification;

/* loaded from: classes8.dex */
public interface CHVerificationResult<T> {
    java.lang.String getErrorMessage();

    T getResult();

    boolean isSuccessful();
}
