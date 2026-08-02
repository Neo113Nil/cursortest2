package com.adobe.marketing.mobile.xdm;

/* loaded from: classes7.dex */
public interface Schema {
    java.lang.String getDatasetIdentifier();

    java.lang.String getSchemaIdentifier();

    java.lang.String getSchemaVersion();

    java.util.Map<java.lang.String, java.lang.Object> serializeToXdm();
}
