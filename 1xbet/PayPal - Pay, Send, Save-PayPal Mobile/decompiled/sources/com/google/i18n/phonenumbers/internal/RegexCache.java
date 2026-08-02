package com.google.i18n.phonenumbers.internal;

/* loaded from: classes9.dex */
public class RegexCache {
    private com.google.i18n.phonenumbers.internal.RegexCache.LRUCache<java.lang.String, java.util.regex.Pattern> cache;

    public RegexCache(int i) {
        this.cache = new com.google.i18n.phonenumbers.internal.RegexCache.LRUCache<>(i);
    }

    public java.util.regex.Pattern getPatternForRegex(java.lang.String str) {
        java.util.regex.Pattern pattern = this.cache.get(str);
        if (pattern != null) {
            return pattern;
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(str);
        this.cache.put(str, compile);
        return compile;
    }

    boolean containsRegex(java.lang.String str) {
        return this.cache.containsKey(str);
    }

    static class LRUCache<K, V> {
        private java.util.LinkedHashMap<K, V> map;
        private int size;

        public LRUCache(int i) {
            this.size = i;
            this.map = new java.util.LinkedHashMap<K, V>(((i * 4) / 3) + 1, 0.75f, true) { // from class: com.google.i18n.phonenumbers.internal.RegexCache.LRUCache.1
                @Override // java.util.LinkedHashMap
                protected boolean removeEldestEntry(java.util.Map.Entry<K, V> entry) {
                    return size() > com.google.i18n.phonenumbers.internal.RegexCache.LRUCache.this.size;
                }
            };
        }

        public V get(K k) {
            V v;
            synchronized (this) {
                v = this.map.get(k);
            }
            return v;
        }

        public void put(K k, V v) {
            synchronized (this) {
                this.map.put(k, v);
            }
        }

        public boolean containsKey(K k) {
            boolean containsKey;
            synchronized (this) {
                containsKey = this.map.containsKey(k);
            }
            return containsKey;
        }
    }
}
