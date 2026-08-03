package org.slf4j.spi;

/* loaded from: classes6.dex */
public interface MDCAdapter {
    void clear();

    void clearDequeByKey(java.lang.String str);

    java.lang.String get(java.lang.String str);

    java.util.Map<java.lang.String, java.lang.String> getCopyOfContextMap();

    java.util.Deque<java.lang.String> getCopyOfDequeByKey(java.lang.String str);

    java.lang.String popByKey(java.lang.String str);

    void pushByKey(java.lang.String str, java.lang.String str2);

    void put(java.lang.String str, java.lang.String str2);

    void remove(java.lang.String str);

    void setContextMap(java.util.Map<java.lang.String, java.lang.String> map);
}
