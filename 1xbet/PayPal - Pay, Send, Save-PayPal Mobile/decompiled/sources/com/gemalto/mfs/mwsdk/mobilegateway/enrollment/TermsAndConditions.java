package com.gemalto.mfs.mwsdk.mobilegateway.enrollment;

/* loaded from: classes8.dex */
public interface TermsAndConditions {
    com.gemalto.mfs.mwsdk.mobilegateway.enrollment.TermsAndConditionSession accept();

    java.lang.String getContent();

    com.gemalto.mfs.mwsdk.mobilegateway.enrollment.ContentType getContentType();

    java.lang.String getHeight();

    @java.lang.Deprecated
    java.lang.String getText();

    java.lang.String getWidth();
}
