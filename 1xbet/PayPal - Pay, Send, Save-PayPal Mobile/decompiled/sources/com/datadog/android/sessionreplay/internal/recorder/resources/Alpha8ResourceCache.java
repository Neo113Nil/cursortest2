package com.datadog.android.sessionreplay.internal.recorder.resources;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/resources/Alpha8ResourceCache;", "Landroid/content/ComponentCallbacks2;", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/Alpha8CacheKey;", "generateKey", "(Landroid/graphics/Bitmap;)Lcom/datadog/android/sessionreplay/internal/recorder/resources/Alpha8CacheKey;", "key", "", "get", "(Lcom/datadog/android/sessionreplay/internal/recorder/resources/Alpha8CacheKey;)Ljava/lang/String;", "resourceId", "", "put", "(Lcom/datadog/android/sessionreplay/internal/recorder/resources/Alpha8CacheKey;Ljava/lang/String;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Alpha8ResourceCache extends android.content.ComponentCallbacks2 {
    com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8CacheKey generateKey(android.graphics.Bitmap bitmap);

    java.lang.String get(com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8CacheKey key);

    void put(com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8CacheKey key, java.lang.String resourceId);
}
