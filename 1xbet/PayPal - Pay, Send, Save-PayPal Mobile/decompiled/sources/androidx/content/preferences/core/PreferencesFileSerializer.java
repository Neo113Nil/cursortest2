package androidx.content.preferences.core;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/datastore/preferences/core/PreferencesFileSerializer;", "Landroidx/datastore/core/Serializer;", "Landroidx/datastore/preferences/core/Preferences;", "<init>", "()V", "Ljava/io/InputStream;", "input", "readFrom", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "", "writeTo", "(Landroidx/datastore/preferences/core/Preferences;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "fileExtension", "Ljava/lang/String;", "getDefaultValue", "()Landroidx/datastore/preferences/core/Preferences;", "defaultValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreferencesFileSerializer implements androidx.content.core.Serializer<androidx.content.preferences.core.Preferences> {
    public static final androidx.content.preferences.core.PreferencesFileSerializer INSTANCE = new androidx.content.preferences.core.PreferencesFileSerializer();
    public static final java.lang.String fileExtension = "preferences_pb";

    private PreferencesFileSerializer() {
    }

    @Override // androidx.content.core.Serializer
    public final /* bridge */ /* synthetic */ java.lang.Object writeTo(androidx.content.preferences.core.Preferences preferences, java.io.OutputStream outputStream, kotlin.coroutines.Continuation continuation) {
        return writeTo2(preferences, outputStream, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.content.core.Serializer
    public final androidx.content.preferences.core.Preferences getDefaultValue() {
        return androidx.content.preferences.core.PreferencesFactory.createEmpty();
    }

    @Override // androidx.content.core.Serializer
    public final java.lang.Object readFrom(java.io.InputStream inputStream, kotlin.coroutines.Continuation<? super androidx.content.preferences.core.Preferences> continuation) throws java.io.IOException, androidx.content.core.CorruptionException {
        androidx.datastore.preferences.PreferencesProto.PreferenceMap readFrom = androidx.content.preferences.PreferencesMapCompat.INSTANCE.readFrom(inputStream);
        androidx.content.preferences.core.MutablePreferences createMutable = androidx.content.preferences.core.PreferencesFactory.createMutable(new androidx.datastore.preferences.core.Preferences.Pair[0]);
        java.util.Map<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> preferencesMap = readFrom.getPreferencesMap();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(preferencesMap, "");
        for (java.util.Map.Entry<java.lang.String, androidx.datastore.preferences.PreferencesProto.Value> entry : preferencesMap.entrySet()) {
            java.lang.String key = entry.getKey();
            androidx.datastore.preferences.PreferencesProto.Value value = entry.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(key);
            kotlin.jvm.internal.Intrinsics.checkNotNull(value);
            androidx.datastore.preferences.PreferencesProto.Value.ValueCase valueCase = value.getValueCase();
            switch (valueCase == null ? -1 : androidx.datastore.preferences.core.PreferencesFileSerializer.WhenMappings.$EnumSwitchMapping$0[valueCase.ordinal()]) {
                case -1:
                    throw new androidx.content.core.CorruptionException("Value case is null.", null, 2, null);
                case 0:
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
                case 1:
                    createMutable.set(androidx.content.preferences.core.PreferencesKeys.booleanKey(key), java.lang.Boolean.valueOf(value.getBoolean()));
                    break;
                case 2:
                    createMutable.set(androidx.content.preferences.core.PreferencesKeys.floatKey(key), java.lang.Float.valueOf(value.getFloat()));
                    break;
                case 3:
                    createMutable.set(androidx.content.preferences.core.PreferencesKeys.doubleKey(key), java.lang.Double.valueOf(value.getDouble()));
                    break;
                case 4:
                    createMutable.set(androidx.content.preferences.core.PreferencesKeys.intKey(key), java.lang.Integer.valueOf(value.getInteger()));
                    break;
                case 5:
                    createMutable.set(androidx.content.preferences.core.PreferencesKeys.longKey(key), java.lang.Long.valueOf(value.getLong()));
                    break;
                case 6:
                    createMutable.set(androidx.content.preferences.core.PreferencesKeys.stringKey(key), value.getString());
                    break;
                case 7:
                    androidx.datastore.preferences.core.Preferences.Key<java.util.Set<java.lang.String>> stringSetKey = androidx.content.preferences.core.PreferencesKeys.stringSetKey(key);
                    java.util.List<java.lang.String> stringsList = value.getStringSet().getStringsList();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stringsList, "");
                    createMutable.set(stringSetKey, kotlin.collections.CollectionsKt.toSet(stringsList));
                    break;
                case 8:
                    createMutable.set(androidx.content.preferences.core.PreferencesKeys.byteArrayKey(key), value.getBytes().toByteArray());
                    break;
                case 9:
                    throw new androidx.content.core.CorruptionException("Value not set.", null, 2, null);
            }
        }
        return createMutable.toPreferences();
    }

    /* renamed from: writeTo, reason: avoid collision after fix types in other method */
    public final java.lang.Object writeTo2(androidx.content.preferences.core.Preferences preferences, java.io.OutputStream outputStream, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.io.IOException, androidx.content.core.CorruptionException {
        androidx.datastore.preferences.PreferencesProto.Value build;
        java.util.Map<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> asMap = preferences.asMap();
        androidx.datastore.preferences.PreferencesProto.PreferenceMap.Builder newBuilder = androidx.datastore.preferences.PreferencesProto.PreferenceMap.newBuilder();
        for (java.util.Map.Entry<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> entry : asMap.entrySet()) {
            androidx.datastore.preferences.core.Preferences.Key<?> key = entry.getKey();
            java.lang.Object value = entry.getValue();
            java.lang.String name2 = key.getName();
            if (value instanceof java.lang.Boolean) {
                build = androidx.datastore.preferences.PreferencesProto.Value.newBuilder().setBoolean(((java.lang.Boolean) value).booleanValue()).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            } else if (value instanceof java.lang.Float) {
                build = androidx.datastore.preferences.PreferencesProto.Value.newBuilder().setFloat(((java.lang.Number) value).floatValue()).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            } else if (value instanceof java.lang.Double) {
                build = androidx.datastore.preferences.PreferencesProto.Value.newBuilder().setDouble(((java.lang.Number) value).doubleValue()).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            } else if (value instanceof java.lang.Integer) {
                build = androidx.datastore.preferences.PreferencesProto.Value.newBuilder().setInteger(((java.lang.Number) value).intValue()).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            } else if (value instanceof java.lang.Long) {
                build = androidx.datastore.preferences.PreferencesProto.Value.newBuilder().setLong(((java.lang.Number) value).longValue()).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            } else if (value instanceof java.lang.String) {
                build = androidx.datastore.preferences.PreferencesProto.Value.newBuilder().setString((java.lang.String) value).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            } else if (value instanceof java.util.Set) {
                androidx.datastore.preferences.PreferencesProto.Value.Builder newBuilder2 = androidx.datastore.preferences.PreferencesProto.Value.newBuilder();
                androidx.datastore.preferences.PreferencesProto.StringSet.Builder newBuilder3 = androidx.datastore.preferences.PreferencesProto.StringSet.newBuilder();
                kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
                build = newBuilder2.setStringSet(newBuilder3.addAllStrings((java.util.Set) value)).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            } else {
                if (!(value instanceof byte[])) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("PreferencesSerializer does not support type: ");
                    sb.append(value.getClass().getName());
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                build = androidx.datastore.preferences.PreferencesProto.Value.newBuilder().setBytes(androidx.content.preferences.protobuf.ByteString.copyFrom((byte[]) value)).build();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            }
            newBuilder.putPreferences(name2, build);
        }
        newBuilder.build().writeTo(outputStream);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.datastore.preferences.PreferencesProto.Value.ValueCase.values().length];
            try {
                iArr[androidx.datastore.preferences.PreferencesProto.Value.ValueCase.BOOLEAN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.datastore.preferences.PreferencesProto.Value.ValueCase.FLOAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.datastore.preferences.PreferencesProto.Value.ValueCase.DOUBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.datastore.preferences.PreferencesProto.Value.ValueCase.INTEGER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.datastore.preferences.PreferencesProto.Value.ValueCase.LONG.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.datastore.preferences.PreferencesProto.Value.ValueCase.STRING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[androidx.datastore.preferences.PreferencesProto.Value.ValueCase.STRING_SET.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[androidx.datastore.preferences.PreferencesProto.Value.ValueCase.BYTES.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[androidx.datastore.preferences.PreferencesProto.Value.ValueCase.VALUE_NOT_SET.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
