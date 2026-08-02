package com.adobe.marketing.mobile.services;

/* loaded from: classes7.dex */
public interface DataQueue {
    boolean add(com.adobe.marketing.mobile.services.DataEntity dataEntity);

    boolean clear();

    void close();

    int count();

    com.adobe.marketing.mobile.services.DataEntity peek();

    java.util.List<com.adobe.marketing.mobile.services.DataEntity> peek(int i);

    boolean remove();

    boolean remove(int i);
}
