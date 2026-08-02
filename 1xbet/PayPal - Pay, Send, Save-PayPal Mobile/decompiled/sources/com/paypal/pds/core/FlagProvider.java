package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\f\u0010\nJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0003R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/pds/core/FlagProvider;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "", "Lcom/paypal/pds/core/FlagProvider$Country;", "getOrLoadCountriesCache$pds_release", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/graphics/ImageBitmap;", "getOrLoadSpriteCache$pds_release", "", "p0", "p1", "", "getHighSpeedVideoSizes", "(ILandroid/content/Context;)Ljava/util/List;", "", "resetCache$pds_release", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/sync/Mutex;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/graphics/ImageBitmap;", "Country"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class FlagProvider {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static volatile java.util.Map<java.lang.String, com.paypal.pds.core.FlagProvider.Country> getHighSpeedVideoSizes;
    private static volatile androidx.compose.ui.graphics.ImageBitmap getHighSpeedVideoFpsRangesFor;
    public static final com.paypal.pds.core.FlagProvider INSTANCE = new com.paypal.pds.core.FlagProvider();
    private static final kotlinx.coroutines.sync.Mutex getHighSpeedVideoFpsRanges = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    public static final int $stable = 8;

    private FlagProvider() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:11:0x0059, B:13:0x005d, B:14:0x0081, B:16:0x0087, B:18:0x00a1), top: B:10:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getOrLoadCountriesCache$pds_release(android.content.Context context, kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, com.paypal.pds.core.FlagProvider.Country>> continuation) {
        com.paypal.pds.core.FlagProvider$getOrLoadCountriesCache$1 flagProvider$getOrLoadCountriesCache$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        java.util.Map map;
        try {
            if (continuation instanceof com.paypal.pds.core.FlagProvider$getOrLoadCountriesCache$1) {
                flagProvider$getOrLoadCountriesCache$1 = (com.paypal.pds.core.FlagProvider$getOrLoadCountriesCache$1) continuation;
                if ((flagProvider$getOrLoadCountriesCache$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    flagProvider$getOrLoadCountriesCache$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = flagProvider$getOrLoadCountriesCache$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = flagProvider$getOrLoadCountriesCache$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.util.Map<java.lang.String, com.paypal.pds.core.FlagProvider.Country> map2 = getHighSpeedVideoSizes;
                        if (map2 != null) {
                            return map2;
                        }
                        mutex = getHighSpeedVideoFpsRanges;
                        flagProvider$getOrLoadCountriesCache$1.Camera2StreamConfigurationMap = context;
                        flagProvider$getOrLoadCountriesCache$1.getHighResolutionOutputSizeshNQ4ISI = mutex;
                        flagProvider$getOrLoadCountriesCache$1.getHighSpeedVideoFpsRanges = 0;
                        flagProvider$getOrLoadCountriesCache$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (mutex.lock(null, flagProvider$getOrLoadCountriesCache$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = flagProvider$getOrLoadCountriesCache$1.getHighSpeedVideoFpsRanges;
                        kotlinx.coroutines.sync.Mutex mutex2 = (kotlinx.coroutines.sync.Mutex) flagProvider$getOrLoadCountriesCache$1.getHighResolutionOutputSizeshNQ4ISI;
                        android.content.Context context2 = (android.content.Context) flagProvider$getOrLoadCountriesCache$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        context = context2;
                    }
                    map = getHighSpeedVideoSizes;
                    if (map == null) {
                        java.util.List<com.paypal.pds.core.FlagProvider.Country> highSpeedVideoSizes = getHighSpeedVideoSizes(com.paypal.pds.tokens.R.raw.countries, context);
                        map = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(highSpeedVideoSizes, 10)), 16));
                        for (java.lang.Object obj2 : highSpeedVideoSizes) {
                            java.lang.String lowerCase = ((com.paypal.pds.core.FlagProvider.Country) obj2).getCountryCode().toLowerCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                            map.put(lowerCase, obj2);
                        }
                        getHighSpeedVideoSizes = map;
                    }
                    return map;
                }
            }
            map = getHighSpeedVideoSizes;
            if (map == null) {
            }
            return map;
        } finally {
            mutex.unlock(null);
        }
        flagProvider$getOrLoadCountriesCache$1 = new com.paypal.pds.core.FlagProvider$getOrLoadCountriesCache$1(this, continuation);
        java.lang.Object obj3 = flagProvider$getOrLoadCountriesCache$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flagProvider$getOrLoadCountriesCache$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #0 {all -> 0x0076, blocks: (B:11:0x0059, B:13:0x005d), top: B:10:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getOrLoadSpriteCache$pds_release(android.content.Context context, kotlin.coroutines.Continuation<? super androidx.compose.ui.graphics.ImageBitmap> continuation) {
        com.paypal.pds.core.FlagProvider$getOrLoadSpriteCache$1 flagProvider$getOrLoadSpriteCache$1;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        androidx.compose.ui.graphics.ImageBitmap imageBitmap;
        try {
            if (continuation instanceof com.paypal.pds.core.FlagProvider$getOrLoadSpriteCache$1) {
                flagProvider$getOrLoadSpriteCache$1 = (com.paypal.pds.core.FlagProvider$getOrLoadSpriteCache$1) continuation;
                if ((flagProvider$getOrLoadSpriteCache$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    flagProvider$getOrLoadSpriteCache$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = flagProvider$getOrLoadSpriteCache$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = flagProvider$getOrLoadSpriteCache$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.compose.ui.graphics.ImageBitmap imageBitmap2 = getHighSpeedVideoFpsRangesFor;
                        if (imageBitmap2 != null) {
                            return imageBitmap2;
                        }
                        mutex = getHighSpeedVideoFpsRanges;
                        flagProvider$getOrLoadSpriteCache$1.getHighSpeedVideoFpsRanges = context;
                        flagProvider$getOrLoadSpriteCache$1.getHighSpeedVideoSizes = mutex;
                        flagProvider$getOrLoadSpriteCache$1.Camera2StreamConfigurationMap = 0;
                        flagProvider$getOrLoadSpriteCache$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (mutex.lock(null, flagProvider$getOrLoadSpriteCache$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = flagProvider$getOrLoadSpriteCache$1.Camera2StreamConfigurationMap;
                        kotlinx.coroutines.sync.Mutex mutex2 = (kotlinx.coroutines.sync.Mutex) flagProvider$getOrLoadSpriteCache$1.getHighSpeedVideoSizes;
                        android.content.Context context2 = (android.content.Context) flagProvider$getOrLoadSpriteCache$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = mutex2;
                        context = context2;
                    }
                    imageBitmap = getHighSpeedVideoFpsRangesFor;
                    if (imageBitmap == null) {
                        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource(context.getResources(), com.paypal.pds.tokens.R.drawable.round1x);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decodeResource, "");
                        imageBitmap = androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(decodeResource);
                        getHighSpeedVideoFpsRangesFor = imageBitmap;
                    }
                    return imageBitmap;
                }
            }
            imageBitmap = getHighSpeedVideoFpsRangesFor;
            if (imageBitmap == null) {
            }
            return imageBitmap;
        } finally {
            mutex.unlock(null);
        }
        flagProvider$getOrLoadSpriteCache$1 = new com.paypal.pds.core.FlagProvider$getOrLoadSpriteCache$1(this, continuation);
        java.lang.Object obj2 = flagProvider$getOrLoadSpriteCache$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flagProvider$getOrLoadSpriteCache$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }

    private static java.util.List<com.paypal.pds.core.FlagProvider.Country> getHighSpeedVideoSizes(int p0, android.content.Context p1) {
        java.io.InputStream openRawResource = p1.getResources().openRawResource(p0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(openRawResource, "");
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(openRawResource, kotlin.text.Charsets.UTF_8), 8192);
        try {
            java.lang.String readText = kotlin.io.TextStreamsKt.readText(bufferedReader);
            kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
            org.json.JSONArray jSONArray = new org.json.JSONObject(readText).getJSONArray("countries");
            kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, jSONArray.length());
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
            java.util.Iterator<java.lang.Integer> it = until.iterator();
            while (it.hasNext()) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(((kotlin.collections.IntIterator) it).nextInt());
                java.lang.String string = jSONObject.getString("countryCode");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                arrayList.add(new com.paypal.pds.core.FlagProvider.Country(string, jSONObject.getInt("imageIndex")));
            }
            return arrayList;
        } finally {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b"}, d2 = {"Lcom/paypal/pds/core/FlagProvider$Country;", "", "", "countryCode", "", "imageIndex", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/paypal/pds/core/FlagProvider$Country;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getCountryCode", com.visa.cbp.getEncExpo.warmup, "getImageIndex"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Country {
        public static final int $stable = 0;
        private final java.lang.String countryCode;
        private final int imageIndex;

        public Country(java.lang.String str, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.countryCode = str;
            this.imageIndex = i;
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final int getImageIndex() {
            return this.imageIndex;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.countryCode;
            int i = this.imageIndex;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Country(countryCode=");
            sb.append(str);
            sb.append(", imageIndex=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.countryCode.hashCode() * 31) + java.lang.Integer.hashCode(this.imageIndex);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.pds.core.FlagProvider.Country)) {
                return false;
            }
            com.paypal.pds.core.FlagProvider.Country country = (com.paypal.pds.core.FlagProvider.Country) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, country.countryCode) && this.imageIndex == country.imageIndex;
        }

        public final com.paypal.pds.core.FlagProvider.Country copy(java.lang.String countryCode, int imageIndex) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.pds.core.FlagProvider.Country(countryCode, imageIndex);
        }

        /* renamed from: component2, reason: from getter */
        public final int getImageIndex() {
            return this.imageIndex;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public static /* synthetic */ com.paypal.pds.core.FlagProvider.Country copy$default(com.paypal.pds.core.FlagProvider.Country country, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = country.countryCode;
            }
            if ((i2 & 2) != 0) {
                i = country.imageIndex;
            }
            return country.copy(str, i);
        }
    }

    public final void resetCache$pds_release() {
        getHighSpeedVideoSizes = null;
        getHighSpeedVideoFpsRangesFor = null;
    }
}
