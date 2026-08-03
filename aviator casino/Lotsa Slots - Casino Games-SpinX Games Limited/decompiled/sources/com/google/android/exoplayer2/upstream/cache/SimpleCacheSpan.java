package com.google.android.exoplayer2.upstream.cache;

/* loaded from: classes3.dex */
final class SimpleCacheSpan extends com.google.android.exoplayer2.upstream.cache.CacheSpan {
    private static final java.util.regex.Pattern CACHE_FILE_PATTERN_V1 = java.util.regex.Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final java.util.regex.Pattern CACHE_FILE_PATTERN_V2 = java.util.regex.Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final java.util.regex.Pattern CACHE_FILE_PATTERN_V3 = java.util.regex.Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);
    static final java.lang.String COMMON_SUFFIX = ".exo";
    private static final java.lang.String SUFFIX = ".v3.exo";

    public static java.io.File getCacheFile(java.io.File file, int i, long j, long j2) {
        return new java.io.File(file, i + "." + j + "." + j2 + SUFFIX);
    }

    public static com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan createLookup(java.lang.String str, long j) {
        return new com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan(str, j, -1L, -9223372036854775807L, null);
    }

    public static com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan createHole(java.lang.String str, long j, long j2) {
        return new com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan(str, j, j2, -9223372036854775807L, null);
    }

    public static com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan createCacheEntry(java.io.File file, long j, com.google.android.exoplayer2.upstream.cache.CachedContentIndex cachedContentIndex) {
        return createCacheEntry(file, j, -9223372036854775807L, cachedContentIndex);
    }

    public static com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan createCacheEntry(java.io.File file, long j, long j2, com.google.android.exoplayer2.upstream.cache.CachedContentIndex cachedContentIndex) {
        java.io.File file2;
        java.lang.String keyForId;
        java.lang.String name = file.getName();
        if (name.endsWith(SUFFIX)) {
            file2 = file;
        } else {
            java.io.File upgradeFile = upgradeFile(file, cachedContentIndex);
            if (upgradeFile == null) {
                return null;
            }
            file2 = upgradeFile;
            name = upgradeFile.getName();
        }
        java.util.regex.Matcher matcher = CACHE_FILE_PATTERN_V3.matcher(name);
        if (!matcher.matches() || (keyForId = cachedContentIndex.getKeyForId(java.lang.Integer.parseInt((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(1))))) == null) {
            return null;
        }
        long length = j == -1 ? file2.length() : j;
        if (length == 0) {
            return null;
        }
        return new com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan(keyForId, java.lang.Long.parseLong((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(2))), length, j2 == -9223372036854775807L ? java.lang.Long.parseLong((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(3))) : j2, file2);
    }

    private static java.io.File upgradeFile(java.io.File file, com.google.android.exoplayer2.upstream.cache.CachedContentIndex cachedContentIndex) {
        java.lang.String str;
        java.lang.String name = file.getName();
        java.util.regex.Matcher matcher = CACHE_FILE_PATTERN_V2.matcher(name);
        if (matcher.matches()) {
            str = com.google.android.exoplayer2.util.Util.unescapeFileName((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(1)));
        } else {
            matcher = CACHE_FILE_PATTERN_V1.matcher(name);
            str = matcher.matches() ? (java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(1)) : null;
        }
        if (str == null) {
            return null;
        }
        java.io.File cacheFile = getCacheFile((java.io.File) com.google.android.exoplayer2.util.Assertions.checkStateNotNull(file.getParentFile()), cachedContentIndex.assignIdForKey(str), java.lang.Long.parseLong((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(2))), java.lang.Long.parseLong((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(3))));
        if (file.renameTo(cacheFile)) {
            return cacheFile;
        }
        return null;
    }

    private SimpleCacheSpan(java.lang.String str, long j, long j2, long j3, java.io.File file) {
        super(str, j, j2, j3, file);
    }

    public com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan copyWithFileAndLastTouchTimestamp(java.io.File file, long j) {
        com.google.android.exoplayer2.util.Assertions.checkState(this.isCached);
        return new com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan(this.key, this.position, this.length, j, file);
    }
}
