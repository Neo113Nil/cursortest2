package org.slf4j.helpers;

/* loaded from: classes18.dex */
public class NOPMDCAdapter implements org.slf4j.spi.MDCAdapter {
    @Override // org.slf4j.spi.MDCAdapter
    public void clear() {
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void clearDequeByKey(java.lang.String str) {
    }

    @Override // org.slf4j.spi.MDCAdapter
    public java.lang.String get(java.lang.String str) {
        return null;
    }

    @Override // org.slf4j.spi.MDCAdapter
    public java.util.Map<java.lang.String, java.lang.String> getCopyOfContextMap() {
        return null;
    }

    @Override // org.slf4j.spi.MDCAdapter
    public java.util.Deque<java.lang.String> getCopyOfDequeByKey(java.lang.String str) {
        return null;
    }

    @Override // org.slf4j.spi.MDCAdapter
    public java.lang.String popByKey(java.lang.String str) {
        return null;
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void pushByKey(java.lang.String str, java.lang.String str2) {
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void put(java.lang.String str, java.lang.String str2) {
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void remove(java.lang.String str) {
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void setContextMap(java.util.Map<java.lang.String, java.lang.String> map) {
    }
}
