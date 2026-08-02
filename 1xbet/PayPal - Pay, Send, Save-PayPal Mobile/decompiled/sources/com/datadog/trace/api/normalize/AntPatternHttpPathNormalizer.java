package com.datadog.trace.api.normalize;

/* loaded from: classes3.dex */
final class AntPatternHttpPathNormalizer extends com.datadog.trace.api.normalize.HttpPathNormalizer {
    private static final com.datadog.trace.logger.Logger getHighSpeedVideoSizes = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.api.normalize.AntPatternHttpPathNormalizer.class);
    private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges;
    private final com.datadog.trace.api.normalize.AntPathMatcher getHighSpeedVideoFpsRangesFor = new com.datadog.trace.api.normalize.AntPathMatcher();
    private final com.datadog.trace.api.cache.DDCache<java.lang.String, java.lang.String> getHighResolutionOutputSizeshNQ4ISI = com.datadog.trace.api.cache.DDCaches.newFixedSizeCache(512);
    private final com.datadog.android.trace.internal.compat.function.Function<java.lang.String, java.lang.String> Camera2StreamConfigurationMap = new com.datadog.android.trace.internal.compat.function.Function<java.lang.String, java.lang.String>() { // from class: com.datadog.trace.api.normalize.AntPatternHttpPathNormalizer.1
        /* JADX WARN: Removed duplicated region for block: B:27:0x0139 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x013a  */
        @Override // com.datadog.android.trace.internal.compat.function.Function
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ java.lang.String apply(java.lang.String str) {
            java.util.Iterator it;
            int i;
            int i2;
            java.util.Iterator it2;
            com.datadog.trace.api.normalize.AntPatternHttpPathNormalizer.AnonymousClass1 anonymousClass1 = this;
            java.lang.String str2 = str;
            java.util.Iterator it3 = com.datadog.trace.api.normalize.AntPatternHttpPathNormalizer.this.getHighSpeedVideoFpsRanges.entrySet().iterator();
            while (it3.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it3.next();
                com.datadog.trace.api.normalize.AntPathMatcher unused = com.datadog.trace.api.normalize.AntPatternHttpPathNormalizer.this.getHighSpeedVideoFpsRangesFor;
                java.lang.String str3 = (java.lang.String) entry.getKey();
                if (str2 != null && str2.startsWith(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) == str3.startsWith(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)) {
                    java.lang.String[] highSpeedVideoFpsRanges = com.datadog.trace.api.normalize.AntPathMatcher.getHighSpeedVideoFpsRanges(str3, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                    java.lang.String[] highSpeedVideoFpsRanges2 = com.datadog.trace.api.normalize.AntPathMatcher.getHighSpeedVideoFpsRanges(str2, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                    int length = highSpeedVideoFpsRanges.length - 1;
                    int length2 = highSpeedVideoFpsRanges2.length - 1;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 <= length && i4 <= length2) {
                        java.lang.String str4 = highSpeedVideoFpsRanges[i3];
                        if (!"**".equals(str4)) {
                            if (!com.datadog.trace.api.normalize.AntPathMatcher.getHighSpeedVideoSizes(str4, highSpeedVideoFpsRanges2[i4])) {
                                break;
                            }
                            i3++;
                            i4++;
                        } else {
                            break;
                        }
                    }
                    if (i4 > length2) {
                        if (i3 > length) {
                            if (str3.endsWith(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) == str2.endsWith(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)) {
                                return "*".equals(entry.getValue()) ? str2 : (java.lang.String) entry.getValue();
                            }
                        } else {
                            if (i3 != length || !highSpeedVideoFpsRanges[i3].equals("*") || !str2.endsWith(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)) {
                                while (i3 <= length) {
                                    if (highSpeedVideoFpsRanges[i3].equals("**")) {
                                        i3++;
                                    }
                                }
                            }
                            if ("*".equals(entry.getValue())) {
                            }
                        }
                    } else if (i3 <= length) {
                        while (i3 <= length && i4 <= length2) {
                            java.lang.String str5 = highSpeedVideoFpsRanges[length];
                            if (!str5.equals("**")) {
                                if (!com.datadog.trace.api.normalize.AntPathMatcher.getHighSpeedVideoSizes(str5, highSpeedVideoFpsRanges2[length2])) {
                                    break;
                                }
                                length--;
                                length2--;
                            } else {
                                break;
                            }
                        }
                        if (i4 > length2) {
                            while (i3 <= length) {
                                if (highSpeedVideoFpsRanges[i3].equals("**")) {
                                    i3++;
                                }
                            }
                        } else {
                            while (i3 != length && i4 <= length2) {
                                int i5 = i3 + 1;
                                int i6 = i5;
                                while (true) {
                                    if (i6 > length) {
                                        i6 = -1;
                                        break;
                                    }
                                    if (highSpeedVideoFpsRanges[i6].equals("**")) {
                                        break;
                                    }
                                    i6++;
                                }
                                if (i6 == i5) {
                                    i3 = i5;
                                } else {
                                    int i7 = (i6 - i3) - 1;
                                    int i8 = 0;
                                    while (true) {
                                        if (i8 > ((length2 - i4) + 1) - i7) {
                                            it = it3;
                                            i = -1;
                                            i2 = -1;
                                            break;
                                        }
                                        int i9 = 0;
                                        while (i9 < i7) {
                                            it2 = it3;
                                            if (!com.datadog.trace.api.normalize.AntPathMatcher.getHighSpeedVideoSizes(highSpeedVideoFpsRanges[i3 + i9 + 1], highSpeedVideoFpsRanges2[i4 + i8 + i9])) {
                                                break;
                                            }
                                            i9++;
                                            it3 = it2;
                                        }
                                        it = it3;
                                        i2 = i4 + i8;
                                        i = -1;
                                        break;
                                        i8++;
                                        it3 = it2;
                                    }
                                    if (i2 != i) {
                                        i4 = i2 + i7;
                                        i3 = i6;
                                        it3 = it;
                                    }
                                }
                            }
                            it = it3;
                            while (i3 <= length) {
                                if (highSpeedVideoFpsRanges[i3].equals("**")) {
                                    i3++;
                                }
                            }
                        }
                        if ("*".equals(entry.getValue())) {
                        }
                    }
                    anonymousClass1 = this;
                    it3 = it;
                }
                it = it3;
                anonymousClass1 = this;
                it3 = it;
            }
            return null;
        }
    };

    AntPatternHttpPathNormalizer(java.util.Map<java.lang.String, java.lang.String> map) {
        this.getHighSpeedVideoFpsRanges = map;
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList(map.keySet().size());
        for (java.lang.String str : map.keySet()) {
            if (!com.datadog.trace.api.normalize.AntPathMatcher.Camera2StreamConfigurationMap(str)) {
                arrayList.add(str);
            }
        }
        for (java.lang.String str2 : arrayList) {
            getHighSpeedVideoSizes.warn("Invalid pattern {} removed from matchers", str2);
            this.getHighSpeedVideoFpsRanges.remove(str2);
        }
    }

    @Override // com.datadog.trace.api.normalize.HttpPathNormalizer
    public final java.lang.String normalize(java.lang.String str, boolean z) {
        if (z) {
            str = com.datadog.trace.bootstrap.instrumentation.api.URIUtils.decode(str);
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.computeIfAbsent(str, this.Camera2StreamConfigurationMap);
    }
}
