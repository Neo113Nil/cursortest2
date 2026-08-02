package com.google.android.datatransport;

/* loaded from: classes3.dex */
public abstract class ProductData {
    public abstract java.lang.Integer getProductId();

    public static com.google.android.datatransport.ProductData withProductId(java.lang.Integer num) {
        return new com.google.android.datatransport.AutoValue_ProductData(num);
    }
}
