package com.gemalto.mfs.mwsdk.mobilegateway.enrollment;

/* loaded from: classes8.dex */
public interface ThreeDSecure {
    public static final int RESULT_CODE_AUTHENTICATION_FAILED = 1;
    public static final int RESULT_CODE_SESSION_NOT_FOUND = 2;
    public static final int RESULT_CODE_SUCCESS = 0;

    java.lang.String getAcsMethod();

    java.lang.String getAcsQuery();

    java.lang.String getAcsUrl();
}
