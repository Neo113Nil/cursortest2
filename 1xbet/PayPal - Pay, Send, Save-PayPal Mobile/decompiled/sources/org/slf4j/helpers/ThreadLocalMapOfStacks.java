package org.slf4j.helpers;

/* loaded from: classes18.dex */
public class ThreadLocalMapOfStacks {
    final java.lang.ThreadLocal<java.util.Map<java.lang.String, java.util.Deque<java.lang.String>>> Camera2StreamConfigurationMap = new java.lang.ThreadLocal<>();

    public void pushByKey(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return;
        }
        java.util.Map<java.lang.String, java.util.Deque<java.lang.String>> map = this.Camera2StreamConfigurationMap.get();
        if (map == null) {
            map = new java.util.HashMap<>();
            this.Camera2StreamConfigurationMap.set(map);
        }
        java.util.Deque<java.lang.String> deque = map.get(str);
        if (deque == null) {
            deque = new java.util.ArrayDeque<>();
        }
        deque.push(str2);
        map.put(str, deque);
    }

    public java.lang.String popByKey(java.lang.String str) {
        java.util.Map<java.lang.String, java.util.Deque<java.lang.String>> map;
        java.util.Deque<java.lang.String> deque;
        if (str == null || (map = this.Camera2StreamConfigurationMap.get()) == null || (deque = map.get(str)) == null) {
            return null;
        }
        return deque.pop();
    }

    public java.util.Deque<java.lang.String> getCopyOfDequeByKey(java.lang.String str) {
        java.util.Map<java.lang.String, java.util.Deque<java.lang.String>> map;
        java.util.Deque<java.lang.String> deque;
        if (str == null || (map = this.Camera2StreamConfigurationMap.get()) == null || (deque = map.get(str)) == null) {
            return null;
        }
        return new java.util.ArrayDeque(deque);
    }

    public void clearDequeByKey(java.lang.String str) {
        java.util.Map<java.lang.String, java.util.Deque<java.lang.String>> map;
        java.util.Deque<java.lang.String> deque;
        if (str == null || (map = this.Camera2StreamConfigurationMap.get()) == null || (deque = map.get(str)) == null) {
            return;
        }
        deque.clear();
    }
}
