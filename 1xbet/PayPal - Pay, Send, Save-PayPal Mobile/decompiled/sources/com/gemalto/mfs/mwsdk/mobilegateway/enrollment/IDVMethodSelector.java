package com.gemalto.mfs.mwsdk.mobilegateway.enrollment;

/* loaded from: classes8.dex */
public interface IDVMethodSelector {
    com.gemalto.mfs.mwsdk.mobilegateway.enrollment.IDVMethod[] getIdvMethodList();

    void select(java.lang.String str);
}
