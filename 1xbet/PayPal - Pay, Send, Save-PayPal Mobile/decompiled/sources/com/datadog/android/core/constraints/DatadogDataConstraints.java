package com.datadog.android.core.constraints;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JW\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u00072\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150\u000e2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00150\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR,\u0010\u001e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u001cj\u0002`\u001d0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/datadog/android/core/constraints/DatadogDataConstraints;", "Lcom/datadog/android/core/constraints/DataConstraints;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "T", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "keyPrefix", "attributesGroupName", "", "reservedKeys", "", "validateAttributes", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ljava/util/Map;", "", "tags", "validateTags", "(Ljava/util/List;)Ljava/util/List;", "", "timings", "validateTimings", "(Ljava/util/Map;)Ljava/util/Map;", "getHighSpeedVideoSizes", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Function1;", "Lcom/datadog/android/core/internal/constraints/StringTransform;", "Camera2StreamConfigurationMap", "Ljava/util/List;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DatadogDataConstraints implements com.datadog.android.core.constraints.DataConstraints {
    public static final java.lang.String CUSTOM_TIMING_KEY_REPLACED_WARNING = "Invalid timing name: %s, sanitized to: %s";
    private static final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{com.datadog.android.log.LogAttributes.HOST, "device", "source"});
    private final java.util.List<kotlin.jvm.functions.Function1<java.lang.String, java.lang.String>> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRangesFor;

    public DatadogDataConstraints(com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighSpeedVideoFpsRangesFor = internalLogger;
        this.Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.jvm.functions.Function1[]{new kotlin.jvm.functions.Function1<java.lang.String, java.lang.String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$tagTransforms$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                java.util.Locale locale = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                java.lang.String lowerCase = str.toLowerCase(locale);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                return lowerCase;
            }
        }, new kotlin.jvm.functions.Function1<java.lang.String, java.lang.String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$tagTransforms$2
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.ranges.CharRange charRange = new kotlin.ranges.CharRange('a', io.ktor.util.date.GMTDateParser.ZONE);
                java.lang.Character orNull = kotlin.text.StringsKt.getOrNull(str, 0);
                if (orNull == null || !charRange.contains(orNull.charValue())) {
                    return null;
                }
                return str;
            }
        }, new kotlin.jvm.functions.Function1<java.lang.String, java.lang.String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$tagTransforms$3
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                return new kotlin.text.Regex("[^a-z0-9_:./-]").replace(str, "_");
            }
        }, new kotlin.jvm.functions.Function1<java.lang.String, java.lang.String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$tagTransforms$4
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                java.lang.String str2 = str;
                if (!kotlin.text.StringsKt.endsWith$default((java.lang.CharSequence) str2, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, false, 2, (java.lang.Object) null)) {
                    return str;
                }
                java.lang.String substring = str.substring(0, kotlin.text.StringsKt.getLastIndex(str2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                return substring;
            }
        }, new kotlin.jvm.functions.Function1<java.lang.String, java.lang.String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$tagTransforms$5
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                if (str.length() <= 200) {
                    return str;
                }
                java.lang.String substring = str.substring(0, 200);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                return substring;
            }
        }, new kotlin.jvm.functions.Function1<java.lang.String, java.lang.String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$tagTransforms$6
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                if (com.datadog.android.core.constraints.DatadogDataConstraints.access$isKeyReserved(com.datadog.android.core.constraints.DatadogDataConstraints.this, str)) {
                    return null;
                }
                return str;
            }

            {
                super(1);
            }
        }});
    }

    @Override // com.datadog.android.core.constraints.DataConstraints
    public final java.util.List<java.lang.String> validateTags(java.util.List<java.lang.String> tags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (final java.lang.String str : tags) {
            java.util.Iterator<T> it = this.Camera2StreamConfigurationMap.iterator();
            final java.lang.String str2 = str;
            while (it.hasNext()) {
                str2 = str2 == null ? null : (java.lang.String) ((kotlin.jvm.functions.Function1) it.next()).invoke(str2);
            }
            if (str2 == null) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$validateTags$convertedTags$1$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        java.lang.String str3 = str;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("\"");
                        sb.append(str3);
                        sb.append("\" is an invalid tag, and was ignored.");
                        return sb.toString();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            } else if (!kotlin.jvm.internal.Intrinsics.areEqual(str2, str)) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$validateTags$convertedTags$1$2
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        java.lang.String str3 = str;
                        java.lang.String str4 = str2;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("tag \"");
                        sb.append(str3);
                        sb.append("\" was modified to \"");
                        sb.append(str4);
                        sb.append("\" to match our constraints.");
                        return sb.toString();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, (java.lang.Throwable) null, true, (java.util.Map) null, 40, (java.lang.Object) null);
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        final int size = arrayList2.size() - 100;
        if (size > 0) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$validateTags$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    int i = size;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("too many tags were added, ");
                    sb.append(i);
                    sb.append(" had to be discarded.");
                    return sb.toString();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        }
        return kotlin.collections.CollectionsKt.take(arrayList2, 100);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f A[SYNTHETIC] */
    @Override // com.datadog.android.core.constraints.DataConstraints
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> java.util.Map<java.lang.String, T> validateAttributes(java.util.Map<java.lang.String, ? extends T> attributes, java.lang.String keyPrefix, java.lang.String attributesGroupName, java.util.Set<java.lang.String> reservedKeys) {
        int i;
        final java.lang.String obj;
        kotlin.Pair pair;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reservedKeys, "");
        if (keyPrefix != null) {
            java.lang.String str = keyPrefix;
            int i2 = 0;
            for (int i3 = 0; i3 < str.length(); i3++) {
                if (str.charAt(i3) == '.') {
                    i2++;
                }
            }
            i = i2 + 1;
        } else {
            i = 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (final java.util.Map.Entry<java.lang.String, ? extends T> entry : attributes.entrySet()) {
            if (entry.getKey() == null) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$validateAttributes$convertedAttributes$1$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        java.lang.Object obj2 = entry;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("\"");
                        sb.append(obj2);
                        sb.append("\" is an invalid attribute, and was ignored.");
                        return sb.toString();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            } else if (reservedKeys.contains(entry.getKey())) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$validateAttributes$convertedAttributes$1$2
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        java.lang.Object obj2 = entry;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("\"");
                        sb.append(obj2);
                        sb.append("\" key was in the reservedKeys set, and was dropped.");
                        return sb.toString();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            } else {
                java.lang.String key = entry.getKey();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(key.length());
                int i4 = i;
                for (int i5 = 0; i5 < key.length(); i5++) {
                    char charAt = key.charAt(i5);
                    if (charAt == '.' && (i4 = i4 + 1) > 9) {
                        charAt = '_';
                    }
                    arrayList2.add(java.lang.Character.valueOf(charAt));
                }
                final java.lang.String str2 = new java.lang.String(kotlin.collections.CollectionsKt.toCharArray(arrayList2));
                if (!kotlin.jvm.internal.Intrinsics.areEqual(str2, entry.getKey())) {
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$validateAttributes$convertedAttributes$1$3
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            java.lang.String key2 = entry.getKey();
                            java.lang.String str3 = str2;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Key \"");
                            sb.append((java.lang.Object) key2);
                            sb.append("\" was modified to \"");
                            sb.append(str3);
                            sb.append("\" to match our constraints.");
                            return sb.toString();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }
                    }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                }
                pair = kotlin.TuplesKt.to(str2, entry.getValue());
                if (pair == null) {
                    arrayList.add(pair);
                }
            }
            pair = null;
            if (pair == null) {
            }
        }
        java.util.ArrayList arrayList3 = arrayList;
        int size = arrayList3.size() - 128;
        if (size > 0) {
            if (attributesGroupName != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Too many attributes were added for [");
                sb.append(attributesGroupName);
                sb.append("], ");
                sb.append(size);
                sb.append(" had to be discarded.");
                obj = sb.toString();
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Too many attributes were added, ");
                sb2.append(size);
                sb2.append(" had to be discarded.");
                obj = sb2.toString();
            }
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$validateAttributes$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return obj;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        }
        return com.datadog.android.core.internal.utils.MapUtilsKt.toMutableMap(kotlin.collections.CollectionsKt.take(arrayList3, 128));
    }

    @Override // com.datadog.android.core.constraints.DataConstraints
    public final java.util.Map<java.lang.String, java.lang.Long> validateTimings(java.util.Map<java.lang.String, java.lang.Long> timings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timings, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(timings.size()));
        java.util.Iterator<T> it = timings.entrySet().iterator();
        while (it.hasNext()) {
            final java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            final java.lang.String replace = new kotlin.text.Regex("[^a-zA-Z0-9\\-_.@$]").replace((java.lang.CharSequence) entry.getKey(), "_");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(replace, entry.getKey())) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.constraints.DatadogDataConstraints$validateTimings$1$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        java.lang.String format = java.lang.String.format(java.util.Locale.US, com.datadog.android.core.constraints.DatadogDataConstraints.CUSTOM_TIMING_KEY_REPLACED_WARNING, java.util.Arrays.copyOf(new java.lang.Object[]{entry.getKey(), replace}, 2));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                        return format;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            }
            linkedHashMap.put(replace, entry.getValue());
        }
        return kotlin.collections.MapsKt.toMutableMap(linkedHashMap);
    }

    public static final /* synthetic */ boolean access$isKeyReserved(com.datadog.android.core.constraints.DatadogDataConstraints datadogDataConstraints, java.lang.String str) {
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, 0, false, 6, (java.lang.Object) null);
        if (indexOf$default <= 0) {
            return false;
        }
        java.lang.String substring = str.substring(0, indexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return getHighSpeedVideoFpsRanges.contains(substring);
    }
}
