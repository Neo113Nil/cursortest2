package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\bj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001b\u001a\u001a\u0012\b\u0012\u00060\bj\u0002`\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001a\u0018\u00010\u00192\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001f\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00142\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00160\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020'0&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010("}, d2 = {"Lcom/zettle/sdk/analytics/EventStorageImpl;", "Lcom/zettle/sdk/analytics/EventStorage;", "Ljava/io/File;", "rootDir", "Lcom/zettle/sdk/meta/PlatformClock;", "clock", "<init>", "(Ljava/io/File;Lcom/zettle/sdk/meta/PlatformClock;)V", "", "p0", "Lorg/json/JSONObject;", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)Lorg/json/JSONObject;", "Lcom/zettle/sdk/analytics/Path;", "path", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(Ljava/lang/String;)V", "tag", "json", "", "limit", "", "put", "(Ljava/lang/String;Lorg/json/JSONObject;I)Z", "Lkotlin/Pair;", "", "query", "(Ljava/lang/String;)Lkotlin/Pair;", "Lkotlin/Function1;", "p1", "Camera2StreamConfigurationMap", "(Lkotlin/jvm/functions/Function1;)Z", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/meta/PlatformClock;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Ljava/io/File;", "", "Lcom/zettle/sdk/analytics/EventStorageImpl$Writer;", "Ljava/util/Map;", "Writer"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class EventStorageImpl implements com.zettle.sdk.analytics.EventStorage {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.util.Map<java.lang.String, com.zettle.sdk.analytics.EventStorageImpl.Writer> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.io.File getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.PlatformClock getHighResolutionOutputSizeshNQ4ISI;

    public EventStorageImpl(java.io.File file, com.zettle.sdk.meta.PlatformClock platformClock) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformClock, "");
        this.getHighSpeedVideoFpsRanges = file;
        this.getHighResolutionOutputSizeshNQ4ISI = platformClock;
        this.getHighSpeedVideoSizes = new java.util.LinkedHashMap();
    }

    @Override // com.zettle.sdk.analytics.EventStorage
    public final boolean put(java.lang.String tag, org.json.JSONObject json, int limit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        java.util.Map<java.lang.String, com.zettle.sdk.analytics.EventStorageImpl.Writer> map = this.getHighSpeedVideoSizes;
        com.zettle.sdk.analytics.EventStorageImpl.Writer writer = map.get(tag);
        if (writer == null) {
            if (!this.getHighSpeedVideoFpsRanges.exists()) {
                this.getHighSpeedVideoFpsRanges.mkdirs();
            }
            java.io.File file = this.getHighSpeedVideoFpsRanges;
            long currentWallTime = this.getHighResolutionOutputSizeshNQ4ISI.getCurrentWallTime();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(tag);
            sb.append("-");
            sb.append(currentWallTime);
            sb.append(".txt");
            java.io.File file2 = new java.io.File(file, sb.toString());
            com.zettle.sdk.io.FileWriter create = com.zettle.sdk.io.FileWriter.INSTANCE.create(file2);
            java.lang.String absolutePath = file2.getAbsolutePath();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "");
            com.zettle.sdk.analytics.EventStorageImpl.Writer writer2 = new com.zettle.sdk.analytics.EventStorageImpl.Writer(absolutePath, create, 0);
            map.put(tag, writer2);
            writer = writer2;
        }
        final com.zettle.sdk.analytics.EventStorageImpl.Writer writer3 = writer;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(json);
        sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        final byte[] bytes = sb2.toString().getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        boolean Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Boolean>() { // from class: com.zettle.sdk.analytics.EventStorageImpl$put$wrote$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Boolean invoke(java.lang.Integer num) {
                return getHighResolutionOutputSizeshNQ4ISI(num.intValue());
            }

            public final java.lang.Boolean getHighResolutionOutputSizeshNQ4ISI(int i) {
                boolean z = false;
                try {
                    com.zettle.sdk.io.FileWriter fileWriter = com.zettle.sdk.analytics.EventStorageImpl.Writer.this.getHighSpeedVideoSizes;
                    byte[] bArr = bytes;
                    fileWriter.write(bArr, 0, bArr.length);
                    z = true;
                } catch (java.io.IOException e) {
                    com.zettle.sdk.analytics.AnalyticsKt.getAnalytics(com.zettle.sdk.commons.util.Log.INSTANCE).e("Failed to write to file, attempt number ".concat(java.lang.String.valueOf(i)), e);
                }
                return java.lang.Boolean.valueOf(z);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        if (Camera2StreamConfigurationMap) {
            int i = writer3.Camera2StreamConfigurationMap + 1;
            if (i > limit) {
                this.getHighSpeedVideoSizes.remove(tag);
                try {
                    writer3.getHighSpeedVideoSizes.close();
                } catch (java.io.IOException e) {
                    com.zettle.sdk.analytics.AnalyticsKt.getAnalytics(com.zettle.sdk.commons.util.Log.INSTANCE).e("Failed to close writer", e);
                }
                return Camera2StreamConfigurationMap;
            }
            this.getHighSpeedVideoSizes.put(tag, new com.zettle.sdk.analytics.EventStorageImpl.Writer(writer3.getHighResolutionOutputSizeshNQ4ISI, writer3.getHighSpeedVideoSizes, i));
        }
        return Camera2StreamConfigurationMap;
    }

    @Override // com.zettle.sdk.analytics.EventStorage
    public final kotlin.Pair<java.lang.String, java.util.List<org.json.JSONObject>> query(java.lang.String tag) {
        java.io.File file;
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        java.io.File[] listFiles = this.getHighSpeedVideoFpsRanges.listFiles();
        if (listFiles == null) {
            return null;
        }
        if (listFiles.length > 1) {
            kotlin.collections.ArraysKt.sortWith(listFiles, new java.util.Comparator() { // from class: com.zettle.sdk.analytics.EventStorageImpl$query$lambda$2$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(((java.io.File) t).getName(), ((java.io.File) t2).getName());
                }
            });
        }
        int length = listFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                file = null;
                break;
            }
            file = listFiles[i];
            java.lang.String name2 = file.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            if (kotlin.text.StringsKt.startsWith$default(name2, tag, false, 2, (java.lang.Object) null)) {
                break;
            }
            i++;
        }
        if (file == null) {
            return null;
        }
        com.zettle.sdk.analytics.EventStorageImpl.Writer writer = this.getHighSpeedVideoSizes.get(tag);
        if (writer != null && kotlin.jvm.internal.Intrinsics.areEqual(file.getAbsolutePath(), writer.getHighResolutionOutputSizeshNQ4ISI)) {
            this.getHighSpeedVideoSizes.remove(tag);
            try {
                writer.getHighSpeedVideoSizes.close();
            } catch (java.io.IOException e) {
                com.zettle.sdk.analytics.AnalyticsKt.getAnalytics(com.zettle.sdk.commons.util.Log.INSTANCE).e("Failed to close writer", e);
            }
        }
        try {
            java.util.List<java.lang.String> readLines = kotlin.io.TextStreamsKt.readLines(new java.io.FileReader(file));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = readLines.iterator();
            while (it.hasNext()) {
                org.json.JSONObject highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((java.lang.String) it.next());
                if (highSpeedVideoFpsRanges != null) {
                    arrayList2.add(highSpeedVideoFpsRanges);
                }
            }
            arrayList = arrayList2;
        } catch (java.io.IOException e2) {
            com.zettle.sdk.analytics.AnalyticsKt.getAnalytics(com.zettle.sdk.commons.util.Log.INSTANCE).e("Failed to read events file", e2);
            arrayList = null;
        }
        java.util.ArrayList arrayList3 = arrayList;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            java.lang.String absolutePath = file.getAbsolutePath();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "");
            if (Camera2StreamConfigurationMap(new com.zettle.sdk.analytics.EventStorageImpl$deleteInternal$1(new java.io.File(absolutePath)))) {
                return query(tag);
            }
            return null;
        }
        return kotlin.TuplesKt.to(file.getAbsolutePath(), arrayList);
    }

    private static org.json.JSONObject getHighSpeedVideoFpsRanges(java.lang.String p0) {
        try {
            return new org.json.JSONObject(p0);
        } catch (org.json.JSONException e) {
            com.zettle.sdk.analytics.AnalyticsKt.getAnalytics(com.zettle.sdk.commons.util.Log.INSTANCE).e("Malformed json found", e);
            return null;
        }
    }

    private static boolean Camera2StreamConfigurationMap(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> function1) {
        for (int i = 0; i < 3; i++) {
            if (function1.invoke(java.lang.Integer.valueOf(i)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0015\u0010\r\u001a\u00060\u0002j\u0002`\u00038\u0007¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0011\u0010\u000b\u001a\u00020\u00078\u0007¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000e\u001a\u00020\u00058\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/zettle/sdk/analytics/EventStorageImpl$Writer;", "", "", "Lcom/zettle/sdk/analytics/Path;", "p0", "Lcom/zettle/sdk/io/FileWriter;", "p1", "", "p2", "<init>", "(Ljava/lang/String;Lcom/zettle/sdk/io/FileWriter;I)V", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/io/FileWriter;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Writer {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final com.zettle.sdk.io.FileWriter getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        final int Camera2StreamConfigurationMap;

        public Writer(java.lang.String str, com.zettle.sdk.io.FileWriter fileWriter, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileWriter, "");
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoSizes = fileWriter;
            this.Camera2StreamConfigurationMap = i;
        }
    }

    @Override // com.zettle.sdk.analytics.EventStorage
    public final void delete(java.lang.String path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        Camera2StreamConfigurationMap(new com.zettle.sdk.analytics.EventStorageImpl$deleteInternal$1(new java.io.File(path)));
    }
}
