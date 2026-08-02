package org.slf4j.helpers;

/* loaded from: classes18.dex */
public class BasicMDCAdapter implements org.slf4j.spi.MDCAdapter {
    private final org.slf4j.helpers.ThreadLocalMapOfStacks Camera2StreamConfigurationMap = new org.slf4j.helpers.ThreadLocalMapOfStacks();
    private final java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>> getHighResolutionOutputSizeshNQ4ISI = new java.lang.InheritableThreadLocal<java.util.Map<java.lang.String, java.lang.String>>() { // from class: org.slf4j.helpers.BasicMDCAdapter.1
        @Override // java.lang.InheritableThreadLocal
        protected /* synthetic */ java.util.Map<java.lang.String, java.lang.String> childValue(java.util.Map<java.lang.String, java.lang.String> map) {
            java.util.Map<java.lang.String, java.lang.String> map2 = map;
            if (map2 == null) {
                return null;
            }
            return new java.util.HashMap(map2);
        }
    };

    @Override // org.slf4j.spi.MDCAdapter
    public void put(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("key cannot be null");
        }
        java.util.Map<java.lang.String, java.lang.String> map = this.getHighResolutionOutputSizeshNQ4ISI.get();
        if (map == null) {
            map = new java.util.HashMap<>();
            this.getHighResolutionOutputSizeshNQ4ISI.set(map);
        }
        map.put(str, str2);
    }

    @Override // org.slf4j.spi.MDCAdapter
    public java.lang.String get(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> map = this.getHighResolutionOutputSizeshNQ4ISI.get();
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void remove(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> map = this.getHighResolutionOutputSizeshNQ4ISI.get();
        if (map != null) {
            map.remove(str);
        }
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void clear() {
        java.util.Map<java.lang.String, java.lang.String> map = this.getHighResolutionOutputSizeshNQ4ISI.get();
        if (map != null) {
            map.clear();
            this.getHighResolutionOutputSizeshNQ4ISI.remove();
        }
    }

    public java.util.Set<java.lang.String> getKeys() {
        java.util.Map<java.lang.String, java.lang.String> map = this.getHighResolutionOutputSizeshNQ4ISI.get();
        if (map != null) {
            return map.keySet();
        }
        return null;
    }

    @Override // org.slf4j.spi.MDCAdapter
    public java.util.Map<java.lang.String, java.lang.String> getCopyOfContextMap() {
        java.util.Map<java.lang.String, java.lang.String> map = this.getHighResolutionOutputSizeshNQ4ISI.get();
        if (map != null) {
            return new java.util.HashMap(map);
        }
        return null;
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void setContextMap(java.util.Map<java.lang.String, java.lang.String> map) {
        this.getHighResolutionOutputSizeshNQ4ISI.set(map != null ? new java.util.HashMap(map) : null);
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void pushByKey(java.lang.String str, java.lang.String str2) {
        this.Camera2StreamConfigurationMap.pushByKey(str, str2);
    }

    @Override // org.slf4j.spi.MDCAdapter
    public java.lang.String popByKey(java.lang.String str) {
        return this.Camera2StreamConfigurationMap.popByKey(str);
    }

    @Override // org.slf4j.spi.MDCAdapter
    public java.util.Deque<java.lang.String> getCopyOfDequeByKey(java.lang.String str) {
        return this.Camera2StreamConfigurationMap.getCopyOfDequeByKey(str);
    }

    @Override // org.slf4j.spi.MDCAdapter
    public void clearDequeByKey(java.lang.String str) {
        this.Camera2StreamConfigurationMap.clearDequeByKey(str);
    }
}
