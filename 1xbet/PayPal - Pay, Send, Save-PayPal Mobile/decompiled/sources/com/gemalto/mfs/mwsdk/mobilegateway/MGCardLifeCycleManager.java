package com.gemalto.mfs.mwsdk.mobilegateway;

/* loaded from: classes3.dex */
public interface MGCardLifeCycleManager {
    java.lang.String deleteCard(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener, java.lang.String str2, java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.KeyValues> list);

    java.lang.String deleteCard(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener, java.lang.String str2, java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.KeyValues> list, java.lang.String str3);

    void deleteCard(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener);

    java.lang.String resumeCard(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener, java.lang.String str2, java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.KeyValues> list);

    java.lang.String resumeCard(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener, java.lang.String str2, java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.KeyValues> list, java.lang.String str3);

    void resumeCard(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener);

    java.lang.String suspendCard(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener, java.lang.String str2, java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.KeyValues> list);

    java.lang.String suspendCard(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener, java.lang.String str2, java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.KeyValues> list, java.lang.String str3);

    void suspendCard(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener);

    java.lang.String updateCard(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener, java.lang.String str2, byte[] bArr, java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.KeyValues> list);

    java.lang.String updateCard(java.lang.String str, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGCardLifecycleEventListener mGCardLifecycleEventListener, java.lang.String str2, byte[] bArr, java.util.List<com.gemalto.mfs.mwsdk.mobilegateway.enrollment.KeyValues> list, java.lang.String str3);
}
