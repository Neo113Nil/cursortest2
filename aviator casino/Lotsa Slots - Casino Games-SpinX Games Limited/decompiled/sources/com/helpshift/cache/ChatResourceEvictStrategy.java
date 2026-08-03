package com.helpshift.cache;

/* loaded from: classes4.dex */
public class ChatResourceEvictStrategy implements com.helpshift.cache.ResourceCacheEvictStrategy {
    @Override // com.helpshift.cache.ResourceCacheEvictStrategy
    public boolean shouldEvictCache(java.lang.String str, java.lang.String str2) {
        return str.startsWith(str2);
    }
}
