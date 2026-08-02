package androidx.work;

@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 J2\u00020\u0001:\u0002KJB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0010\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0003\u0010\bJ\u001d\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020#2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u001d\u0010*\u001a\u00020)2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b/\u00100J\u001d\u00102\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u0014¢\u0006\u0004\b4\u00105J)\u00109\u001a\u00020\n\"\u0004\b\u0000\u001062\u0006\u0010\t\u001a\u00020\u00062\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u000007¢\u0006\u0004\b9\u0010:J \u0010;\u001a\u00020\n\"\u0006\b\u0000\u00106\u0018\u00012\u0006\u0010\t\u001a\u00020\u0006H\u0080\b¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u0017¢\u0006\u0004\b=\u0010>J\u001a\u0010?\u001a\u00020\n2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0017H\u0016¢\u0006\u0004\bA\u0010>J\u000f\u0010B\u001a\u00020\u0006H\u0016¢\u0006\u0004\bB\u0010CR\"\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001f\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058G¢\u0006\u0006\u001a\u0004\bG\u0010H"}, d2 = {"Landroidx/work/Data;", "", "other", "<init>", "(Landroidx/work/Data;)V", "", "", "values", "(Ljava/util/Map;)V", "key", "", "defaultValue", "getBoolean", "(Ljava/lang/String;Z)Z", "", "getBooleanArray", "(Ljava/lang/String;)[Z", "", "getByte", "(Ljava/lang/String;B)B", "", "getByteArray", "(Ljava/lang/String;)[B", "", "getInt", "(Ljava/lang/String;I)I", "", "getIntArray", "(Ljava/lang/String;)[I", "", "getLong", "(Ljava/lang/String;J)J", "", "getLongArray", "(Ljava/lang/String;)[J", "", "getFloat", "(Ljava/lang/String;F)F", "", "getFloatArray", "(Ljava/lang/String;)[F", "", "getDouble", "(Ljava/lang/String;D)D", "", "getDoubleArray", "(Ljava/lang/String;)[D", "getString", "(Ljava/lang/String;)Ljava/lang/String;", "", "getStringArray", "(Ljava/lang/String;)[Ljava/lang/String;", "toByteArray", "()[B", "T", "Ljava/lang/Class;", "klass", "hasKeyWithValueOfType", "(Ljava/lang/String;Ljava/lang/Class;)Z", "hasKey$work_runtime_release", "(Ljava/lang/String;)Z", io.ktor.http.ContentDisposition.Parameters.Size, "()I", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges", "getKeyValueMap", "()Ljava/util/Map;", "keyValueMap", "Companion", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Data {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.work.Data.Companion INSTANCE = new androidx.work.Data.Companion(null);
    public static final androidx.work.Data EMPTY = new androidx.work.Data.Builder().build();
    public static final int MAX_DATA_BYTES = 10240;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRanges;

    public Data(androidx.work.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        this.getHighSpeedVideoFpsRanges = new java.util.HashMap(data.getHighSpeedVideoFpsRanges);
    }

    public Data(java.util.Map<java.lang.String, ?> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighSpeedVideoFpsRanges = new java.util.HashMap(map);
    }

    public final boolean getBoolean(java.lang.String key, boolean defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object valueOf = java.lang.Boolean.valueOf(defaultValue);
        java.lang.Object obj = this.getHighSpeedVideoFpsRanges.get(key);
        if (obj instanceof java.lang.Boolean) {
            valueOf = obj;
        }
        return ((java.lang.Boolean) valueOf).booleanValue();
    }

    public final byte getByte(java.lang.String key, byte defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object valueOf = java.lang.Byte.valueOf(defaultValue);
        java.lang.Object obj = this.getHighSpeedVideoFpsRanges.get(key);
        if (obj instanceof java.lang.Byte) {
            valueOf = obj;
        }
        return ((java.lang.Number) valueOf).byteValue();
    }

    public final int getInt(java.lang.String key, int defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object valueOf = java.lang.Integer.valueOf(defaultValue);
        java.lang.Object obj = this.getHighSpeedVideoFpsRanges.get(key);
        if (obj instanceof java.lang.Integer) {
            valueOf = obj;
        }
        return ((java.lang.Number) valueOf).intValue();
    }

    public final long getLong(java.lang.String key, long defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object valueOf = java.lang.Long.valueOf(defaultValue);
        java.lang.Object obj = this.getHighSpeedVideoFpsRanges.get(key);
        if (obj instanceof java.lang.Long) {
            valueOf = obj;
        }
        return ((java.lang.Number) valueOf).longValue();
    }

    public final float getFloat(java.lang.String key, float defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object valueOf = java.lang.Float.valueOf(defaultValue);
        java.lang.Object obj = this.getHighSpeedVideoFpsRanges.get(key);
        if (obj instanceof java.lang.Float) {
            valueOf = obj;
        }
        return ((java.lang.Number) valueOf).floatValue();
    }

    public final double getDouble(java.lang.String key, double defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object valueOf = java.lang.Double.valueOf(defaultValue);
        java.lang.Object obj = this.getHighSpeedVideoFpsRanges.get(key);
        if (obj instanceof java.lang.Double) {
            valueOf = obj;
        }
        return ((java.lang.Number) valueOf).doubleValue();
    }

    public final java.lang.String getString(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.Object obj = this.getHighSpeedVideoFpsRanges.get(key);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        return null;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getKeyValueMap() {
        java.util.Map<java.lang.String, java.lang.Object> unmodifiableMap = java.util.Collections.unmodifiableMap(this.getHighSpeedVideoFpsRanges);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "");
        return unmodifiableMap;
    }

    public final byte[] toByteArray() {
        return INSTANCE.toByteArrayInternalV1(this);
    }

    public final <T> boolean hasKeyWithValueOfType(java.lang.String key, java.lang.Class<T> klass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(klass, "");
        java.lang.Object obj = this.getHighSpeedVideoFpsRanges.get(key);
        return obj != null && klass.isAssignableFrom(obj.getClass());
    }

    public final /* synthetic */ <T> boolean hasKey$work_runtime_release(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return hasKeyWithValueOfType(key, java.lang.Object.class);
    }

    public final int size() {
        return this.getHighSpeedVideoFpsRanges.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x002e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(java.lang.Object other) {
        boolean areEqual;
        if (this == other) {
            return true;
        }
        if (other == null || !kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other.getClass())) {
            return false;
        }
        androidx.work.Data data = (androidx.work.Data) other;
        java.util.Set<java.lang.String> keySet = this.getHighSpeedVideoFpsRanges.keySet();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(keySet, data.getHighSpeedVideoFpsRanges.keySet())) {
            return false;
        }
        for (java.lang.String str : keySet) {
            java.lang.Object obj = this.getHighSpeedVideoFpsRanges.get(str);
            java.lang.Object obj2 = data.getHighSpeedVideoFpsRanges.get(str);
            if (obj == null || obj2 == null) {
                if (obj != obj2) {
                    return false;
                }
            } else {
                if (obj instanceof java.lang.Object[]) {
                    java.lang.Object[] objArr = (java.lang.Object[]) obj;
                    if ((objArr instanceof java.lang.Object[]) && (obj2 instanceof java.lang.Object[])) {
                        java.lang.Object[] objArr2 = (java.lang.Object[]) obj2;
                        if (objArr2 instanceof java.lang.Object[]) {
                            areEqual = kotlin.collections.ArraysKt.contentDeepEquals(objArr, objArr2);
                            if (areEqual) {
                                return false;
                            }
                        }
                    }
                }
                areEqual = kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2);
                if (areEqual) {
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.getHighSpeedVideoFpsRanges.entrySet()) {
            java.lang.Object value = entry.getValue();
            if (value instanceof java.lang.Object[]) {
                hashCode = java.util.Objects.hashCode(entry.getKey()) ^ kotlin.collections.ArraysKt.contentDeepHashCode((java.lang.Object[]) value);
            } else {
                hashCode = entry.hashCode();
            }
            i += hashCode;
        }
        return i * 31;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Data {");
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(this.getHighSpeedVideoFpsRanges.entrySet(), null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: androidx.work.Data$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.work.Data.$r8$lambda$CYyY16ThCkJ_rLJonZYIKWG1Uyk((java.util.Map.Entry) obj);
            }
        }, 31, null));
        sb.append("}");
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b+\u0010,J%\u0010.\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040-¢\u0006\u0004\b.\u0010/J\u0015\u00102\u001a\u00020\u00002\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J#\u00102\u001a\u00020\u00002\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000104¢\u0006\u0004\b2\u00106J\u001f\u00107\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u000200¢\u0006\u0004\b9\u0010:R\"\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010="}, d2 = {"Landroidx/work/Data$Builder;", "", "<init>", "()V", "", "key", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "putBoolean", "(Ljava/lang/String;Z)Landroidx/work/Data$Builder;", "", "putBooleanArray", "(Ljava/lang/String;[Z)Landroidx/work/Data$Builder;", "", "putByte", "(Ljava/lang/String;B)Landroidx/work/Data$Builder;", "", "putByteArray", "(Ljava/lang/String;[B)Landroidx/work/Data$Builder;", "", "putInt", "(Ljava/lang/String;I)Landroidx/work/Data$Builder;", "", "putIntArray", "(Ljava/lang/String;[I)Landroidx/work/Data$Builder;", "", "putLong", "(Ljava/lang/String;J)Landroidx/work/Data$Builder;", "", "putLongArray", "(Ljava/lang/String;[J)Landroidx/work/Data$Builder;", "", "putFloat", "(Ljava/lang/String;F)Landroidx/work/Data$Builder;", "", "putFloatArray", "(Ljava/lang/String;[F)Landroidx/work/Data$Builder;", "", "putDouble", "(Ljava/lang/String;D)Landroidx/work/Data$Builder;", "", "putDoubleArray", "(Ljava/lang/String;[D)Landroidx/work/Data$Builder;", "putString", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/work/Data$Builder;", "", "putStringArray", "(Ljava/lang/String;[Ljava/lang/String;)Landroidx/work/Data$Builder;", "Landroidx/work/Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "putAll", "(Landroidx/work/Data;)Landroidx/work/Data$Builder;", "", "values", "(Ljava/util/Map;)Landroidx/work/Data$Builder;", "put", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;", "build", "()Landroidx/work/Data;", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.util.Map<java.lang.String, java.lang.Object> Camera2StreamConfigurationMap = new java.util.LinkedHashMap();

        public final androidx.work.Data.Builder putBoolean(java.lang.String key, boolean value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            this.Camera2StreamConfigurationMap.put(key, java.lang.Boolean.valueOf(value));
            return this;
        }

        public final androidx.work.Data.Builder putBooleanArray(java.lang.String key, boolean[] value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            this.Camera2StreamConfigurationMap.put(key, androidx.work.Data_Kt.access$convertPrimitiveArray(value));
            return this;
        }

        public final androidx.work.Data.Builder putByte(java.lang.String key, byte value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            this.Camera2StreamConfigurationMap.put(key, java.lang.Byte.valueOf(value));
            return this;
        }

        public final androidx.work.Data.Builder putByteArray(java.lang.String key, byte[] value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            this.Camera2StreamConfigurationMap.put(key, androidx.work.Data_Kt.access$convertPrimitiveArray(value));
            return this;
        }

        public final androidx.work.Data.Builder putInt(java.lang.String key, int value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            this.Camera2StreamConfigurationMap.put(key, java.lang.Integer.valueOf(value));
            return this;
        }

        public final androidx.work.Data.Builder putIntArray(java.lang.String key, int[] value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            this.Camera2StreamConfigurationMap.put(key, androidx.work.Data_Kt.access$convertPrimitiveArray(value));
            return this;
        }

        public final androidx.work.Data.Builder putLong(java.lang.String key, long value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            this.Camera2StreamConfigurationMap.put(key, java.lang.Long.valueOf(value));
            return this;
        }

        public final androidx.work.Data.Builder putLongArray(java.lang.String key, long[] value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            this.Camera2StreamConfigurationMap.put(key, androidx.work.Data_Kt.access$convertPrimitiveArray(value));
            return this;
        }

        public final androidx.work.Data.Builder putFloat(java.lang.String key, float value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            this.Camera2StreamConfigurationMap.put(key, java.lang.Float.valueOf(value));
            return this;
        }

        public final androidx.work.Data.Builder putFloatArray(java.lang.String key, float[] value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            this.Camera2StreamConfigurationMap.put(key, androidx.work.Data_Kt.access$convertPrimitiveArray(value));
            return this;
        }

        public final androidx.work.Data.Builder putDouble(java.lang.String key, double value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            this.Camera2StreamConfigurationMap.put(key, java.lang.Double.valueOf(value));
            return this;
        }

        public final androidx.work.Data.Builder putDoubleArray(java.lang.String key, double[] value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            this.Camera2StreamConfigurationMap.put(key, androidx.work.Data_Kt.access$convertPrimitiveArray(value));
            return this;
        }

        public final androidx.work.Data.Builder putAll(androidx.work.Data data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            putAll(data.getHighSpeedVideoFpsRanges);
            return this;
        }

        public final androidx.work.Data.Builder put(java.lang.String key, java.lang.Object value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            java.util.Map<java.lang.String, java.lang.Object> map = this.Camera2StreamConfigurationMap;
            if (value == null) {
                value = null;
            } else {
                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(value.getClass());
                if (!kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean.TYPE)) && !kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Byte.TYPE)) && !kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Integer.TYPE)) && !kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Long.TYPE)) && !kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Float.TYPE)) && !kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Double.TYPE)) && !kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String.class)) && !kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean[].class)) && !kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Byte[].class)) && !kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Integer[].class)) && !kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Long[].class)) && !kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Float[].class)) && !kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Double[].class)) && !kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String[].class))) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(boolean[].class))) {
                        value = androidx.work.Data_Kt.access$convertPrimitiveArray((boolean[]) value);
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(byte[].class))) {
                        value = androidx.work.Data_Kt.access$convertPrimitiveArray((byte[]) value);
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(int[].class))) {
                        value = androidx.work.Data_Kt.access$convertPrimitiveArray((int[]) value);
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(long[].class))) {
                        value = androidx.work.Data_Kt.access$convertPrimitiveArray((long[]) value);
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(float[].class))) {
                        value = androidx.work.Data_Kt.access$convertPrimitiveArray((float[]) value);
                    } else {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(double[].class))) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Key ");
                            sb.append(key);
                            sb.append(" has invalid type ");
                            sb.append(orCreateKotlinClass);
                            throw new java.lang.IllegalArgumentException(sb.toString());
                        }
                        value = androidx.work.Data_Kt.access$convertPrimitiveArray((double[]) value);
                    }
                }
            }
            map.put(key, value);
            return this;
        }

        public final androidx.work.Data build() {
            androidx.work.Data data = new androidx.work.Data((java.util.Map<java.lang.String, ?>) this.Camera2StreamConfigurationMap);
            androidx.work.Data.INSTANCE.toByteArrayInternalV1(data);
            return data;
        }

        public final androidx.work.Data.Builder putAll(java.util.Map<java.lang.String, ? extends java.lang.Object> values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
            for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : values.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public final androidx.work.Data.Builder putString(java.lang.String key, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            this.Camera2StreamConfigurationMap.put(key, value);
            return this;
        }

        public final androidx.work.Data.Builder putStringArray(java.lang.String key, java.lang.String[] value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            this.Camera2StreamConfigurationMap.put(key, value);
            return this;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/work/Data$Companion;", "", "<init>", "()V", "Landroidx/work/Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "toByteArrayInternalV0", "(Landroidx/work/Data;)[B", "toByteArrayInternalV1", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "fromByteArray", "([B)Landroidx/work/Data;", "EMPTY", "Landroidx/work/Data;", "", "MAX_DATA_BYTES", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.Deprecated(message = "This is kept for testing migration", replaceWith = @kotlin.ReplaceWith(expression = "toByteArrayInternalV1", imports = {}))
        @kotlin.jvm.JvmStatic
        public final byte[] toByteArrayInternalV0(androidx.work.Data data) {
            java.lang.String str;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            try {
                java.io.ObjectOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    java.io.ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                    byteArrayOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream2);
                    try {
                        java.io.ObjectOutputStream objectOutputStream = byteArrayOutputStream;
                        objectOutputStream.writeInt(data.size());
                        for (java.util.Map.Entry entry : data.getHighSpeedVideoFpsRanges.entrySet()) {
                            java.lang.String str2 = (java.lang.String) entry.getKey();
                            java.lang.Object value = entry.getValue();
                            objectOutputStream.writeUTF(str2);
                            objectOutputStream.writeObject(value);
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        kotlin.io.CloseableKt.closeFinally(byteArrayOutputStream, null);
                        kotlin.io.CloseableKt.closeFinally(byteArrayOutputStream, null);
                        if (byteArrayOutputStream2.size() > 10240) {
                            throw new java.lang.IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                        }
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(byteArray);
                        return byteArray;
                    } finally {
                    }
                } finally {
                }
            } catch (java.io.IOException e) {
                str = androidx.work.Data_Kt.getHighSpeedVideoFpsRanges;
                androidx.work.Logger.get().error(str, "Error in Data#toByteArray: ", e);
                return new byte[0];
            }
        }

        @kotlin.jvm.JvmStatic
        public final byte[] toByteArrayInternalV1(androidx.work.Data data) {
            java.lang.String str;
            java.io.DataOutputStream dataOutputStream;
            java.lang.Throwable th;
            int i;
            java.io.DataOutputStream dataOutputStream2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            int i2 = 0;
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                java.io.DataOutputStream dataOutputStream3 = new java.io.DataOutputStream(byteArrayOutputStream);
                try {
                    java.io.DataOutputStream dataOutputStream4 = dataOutputStream3;
                    dataOutputStream4.writeShort(-21521);
                    int i3 = 1;
                    dataOutputStream4.writeShort(1);
                    dataOutputStream4.writeInt(data.size());
                    for (java.util.Map.Entry entry : data.getHighSpeedVideoFpsRanges.entrySet()) {
                        java.lang.String str2 = (java.lang.String) entry.getKey();
                        java.lang.Object value = entry.getValue();
                        if (value == null) {
                            try {
                                dataOutputStream4.writeByte(i2);
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                dataOutputStream = dataOutputStream3;
                                try {
                                    throw th;
                                } catch (java.lang.Throwable th3) {
                                    kotlin.io.CloseableKt.closeFinally(dataOutputStream, th);
                                    throw th3;
                                }
                            }
                        } else if (value instanceof java.lang.Boolean) {
                            dataOutputStream4.writeByte(i3);
                            dataOutputStream4.writeBoolean(((java.lang.Boolean) value).booleanValue());
                        } else if (value instanceof java.lang.Byte) {
                            dataOutputStream4.writeByte(2);
                            dataOutputStream4.writeByte(((java.lang.Number) value).byteValue());
                        } else if (value instanceof java.lang.Integer) {
                            dataOutputStream4.writeByte(3);
                            dataOutputStream4.writeInt(((java.lang.Number) value).intValue());
                        } else if (value instanceof java.lang.Long) {
                            dataOutputStream4.writeByte(4);
                            dataOutputStream4.writeLong(((java.lang.Number) value).longValue());
                        } else if (value instanceof java.lang.Float) {
                            dataOutputStream4.writeByte(5);
                            dataOutputStream4.writeFloat(((java.lang.Number) value).floatValue());
                        } else if (value instanceof java.lang.Double) {
                            dataOutputStream4.writeByte(6);
                            dataOutputStream4.writeDouble(((java.lang.Number) value).doubleValue());
                        } else if (value instanceof java.lang.String) {
                            dataOutputStream4.writeByte(7);
                            dataOutputStream4.writeUTF((java.lang.String) value);
                        } else if (value instanceof java.lang.Object[]) {
                            java.lang.Object[] objArr = (java.lang.Object[]) value;
                            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(objArr.getClass());
                            int i4 = 9;
                            int i5 = 8;
                            if (kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean[].class))) {
                                i = 8;
                            } else if (kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Byte[].class))) {
                                i = 9;
                            } else if (kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Integer[].class))) {
                                i = 10;
                            } else if (kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Long[].class))) {
                                i = 11;
                            } else if (kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Float[].class))) {
                                i = 12;
                            } else if (kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Double[].class))) {
                                i = 13;
                            } else {
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(orCreateKotlinClass, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.String[].class))) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported value type ");
                                    sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(objArr.getClass()).getQualifiedName());
                                    throw new java.lang.IllegalArgumentException(sb.toString());
                                }
                                i = 14;
                            }
                            dataOutputStream4.writeByte(i);
                            dataOutputStream4.writeInt(objArr.length);
                            int length = objArr.length;
                            int i6 = 0;
                            while (i6 < length) {
                                java.lang.Object obj = objArr[i6];
                                if (i == i5) {
                                    java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
                                    dataOutputStream4.writeBoolean(bool != null ? bool.booleanValue() : false);
                                } else if (i == i4) {
                                    java.lang.Byte b = obj instanceof java.lang.Byte ? (java.lang.Byte) obj : null;
                                    dataOutputStream4.writeByte(b != null ? b.byteValue() : (byte) 0);
                                } else if (i == 10) {
                                    java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
                                    dataOutputStream4.writeInt(num != null ? num.intValue() : 0);
                                } else {
                                    if (i == 11) {
                                        java.lang.Long l = obj instanceof java.lang.Long ? (java.lang.Long) obj : null;
                                        dataOutputStream2 = dataOutputStream3;
                                        dataOutputStream4.writeLong(l != null ? l.longValue() : 0L);
                                    } else {
                                        dataOutputStream2 = dataOutputStream3;
                                        if (i == 12) {
                                            java.lang.Float f = obj instanceof java.lang.Float ? (java.lang.Float) obj : null;
                                            dataOutputStream4.writeFloat(f != null ? f.floatValue() : 0.0f);
                                        } else if (i == 13) {
                                            java.lang.Double d = obj instanceof java.lang.Double ? (java.lang.Double) obj : null;
                                            dataOutputStream4.writeDouble(d != null ? d.doubleValue() : 0.0d);
                                        } else {
                                            if (i == 14) {
                                                java.lang.String str3 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                                                if (str3 == null) {
                                                    str3 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                                                }
                                                dataOutputStream4.writeUTF(str3);
                                            }
                                            i6++;
                                            dataOutputStream3 = dataOutputStream2;
                                            i4 = 9;
                                            i5 = 8;
                                        }
                                    }
                                    i6++;
                                    dataOutputStream3 = dataOutputStream2;
                                    i4 = 9;
                                    i5 = 8;
                                }
                                dataOutputStream2 = dataOutputStream3;
                                i6++;
                                dataOutputStream3 = dataOutputStream2;
                                i4 = 9;
                                i5 = 8;
                            }
                        } else {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unsupported value type ");
                            sb2.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(value.getClass()).getSimpleName());
                            throw new java.lang.IllegalArgumentException(sb2.toString());
                        }
                        dataOutputStream = dataOutputStream3;
                        try {
                            dataOutputStream4.writeUTF(str2);
                            dataOutputStream3 = dataOutputStream;
                            i2 = 0;
                            i3 = 1;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            th = th;
                            throw th;
                        }
                    }
                    java.io.DataOutputStream dataOutputStream5 = dataOutputStream3;
                    dataOutputStream4.flush();
                    if (dataOutputStream4.size() > 10240) {
                        throw new java.lang.IllegalStateException("Data cannot occupy more than 10240 bytes when serialized".toString());
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    kotlin.io.CloseableKt.closeFinally(dataOutputStream5, null);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(byteArray);
                    return byteArray;
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    dataOutputStream = dataOutputStream3;
                }
            } catch (java.io.IOException e) {
                str = androidx.work.Data_Kt.getHighSpeedVideoFpsRanges;
                androidx.work.Logger.get().error(str, "Error in Data#toByteArray: ", e);
                return new byte[0];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @kotlin.jvm.JvmStatic
        public final androidx.work.Data fromByteArray(byte[] bytes) {
            java.lang.String str;
            java.lang.String str2;
            java.io.DataInputStream dataInputStream;
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "");
            if (bytes.length > 10240) {
                throw new java.lang.IllegalStateException("Data cannot occupy more than 10240 bytes when serialized".toString());
            }
            if (bytes.length == 0) {
                return androidx.work.Data.EMPTY;
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            try {
                java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bytes);
                byte[] bArr = new byte[2];
                byteArrayInputStream.read(bArr);
                boolean z = bArr[0] == -84 && bArr[1] == -19;
                byteArrayInputStream.reset();
                if (z) {
                    dataInputStream = new java.io.ObjectInputStream(byteArrayInputStream);
                    try {
                        java.io.ObjectInputStream objectInputStream = dataInputStream;
                        int readInt = objectInputStream.readInt();
                        for (int i = 0; i < readInt; i++) {
                            linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        }
                        kotlin.io.CloseableKt.closeFinally(dataInputStream, null);
                    } finally {
                    }
                } else {
                    dataInputStream = new java.io.DataInputStream(byteArrayInputStream);
                    try {
                        java.io.DataInputStream dataInputStream2 = dataInputStream;
                        short readShort = dataInputStream2.readShort();
                        if (readShort != -21521) {
                            throw new java.lang.IllegalStateException("Magic number doesn't match: ".concat(java.lang.String.valueOf((int) readShort)).toString());
                        }
                        short readShort2 = dataInputStream2.readShort();
                        if (readShort2 == 1) {
                            int readInt2 = dataInputStream2.readInt();
                            for (int i2 = 0; i2 < readInt2; i2++) {
                                byte readByte = dataInputStream2.readByte();
                                if (readByte == 0) {
                                    obj = null;
                                } else if (readByte == 1) {
                                    obj = java.lang.Boolean.valueOf(dataInputStream2.readBoolean());
                                } else if (readByte == 2) {
                                    obj = java.lang.Byte.valueOf(dataInputStream2.readByte());
                                } else if (readByte == 3) {
                                    obj = java.lang.Integer.valueOf(dataInputStream2.readInt());
                                } else if (readByte == 4) {
                                    obj = java.lang.Long.valueOf(dataInputStream2.readLong());
                                } else if (readByte == 5) {
                                    obj = java.lang.Float.valueOf(dataInputStream2.readFloat());
                                } else if (readByte == 6) {
                                    obj = java.lang.Double.valueOf(dataInputStream2.readDouble());
                                } else if (readByte == 7) {
                                    obj = dataInputStream2.readUTF();
                                } else if (readByte == 8) {
                                    int readInt3 = dataInputStream2.readInt();
                                    java.lang.Boolean[] boolArr = new java.lang.Boolean[readInt3];
                                    for (int i3 = 0; i3 < readInt3; i3++) {
                                        boolArr[i3] = java.lang.Boolean.valueOf(dataInputStream2.readBoolean());
                                    }
                                    obj = (java.io.Serializable) boolArr;
                                } else if (readByte == 9) {
                                    int readInt4 = dataInputStream2.readInt();
                                    java.lang.Byte[] bArr2 = new java.lang.Byte[readInt4];
                                    for (int i4 = 0; i4 < readInt4; i4++) {
                                        bArr2[i4] = java.lang.Byte.valueOf(dataInputStream2.readByte());
                                    }
                                    obj = (java.io.Serializable) bArr2;
                                } else if (readByte == 10) {
                                    int readInt5 = dataInputStream2.readInt();
                                    java.lang.Integer[] numArr = new java.lang.Integer[readInt5];
                                    for (int i5 = 0; i5 < readInt5; i5++) {
                                        numArr[i5] = java.lang.Integer.valueOf(dataInputStream2.readInt());
                                    }
                                    obj = (java.io.Serializable) numArr;
                                } else if (readByte == 11) {
                                    int readInt6 = dataInputStream2.readInt();
                                    java.lang.Long[] lArr = new java.lang.Long[readInt6];
                                    for (int i6 = 0; i6 < readInt6; i6++) {
                                        lArr[i6] = java.lang.Long.valueOf(dataInputStream2.readLong());
                                    }
                                    obj = (java.io.Serializable) lArr;
                                } else if (readByte == 12) {
                                    int readInt7 = dataInputStream2.readInt();
                                    java.lang.Float[] fArr = new java.lang.Float[readInt7];
                                    for (int i7 = 0; i7 < readInt7; i7++) {
                                        fArr[i7] = java.lang.Float.valueOf(dataInputStream2.readFloat());
                                    }
                                    obj = (java.io.Serializable) fArr;
                                } else if (readByte == 13) {
                                    int readInt8 = dataInputStream2.readInt();
                                    java.lang.Double[] dArr = new java.lang.Double[readInt8];
                                    for (int i8 = 0; i8 < readInt8; i8++) {
                                        dArr[i8] = java.lang.Double.valueOf(dataInputStream2.readDouble());
                                    }
                                    obj = (java.io.Serializable) dArr;
                                } else if (readByte == 14) {
                                    int readInt9 = dataInputStream2.readInt();
                                    java.lang.String[] strArr = new java.lang.String[readInt9];
                                    for (int i9 = 0; i9 < readInt9; i9++) {
                                        java.lang.String readUTF = dataInputStream2.readUTF();
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                                            readUTF = null;
                                        }
                                        strArr[i9] = readUTF;
                                    }
                                    obj = (java.io.Serializable) strArr;
                                } else {
                                    throw new java.lang.IllegalStateException("Unsupported type ".concat(java.lang.String.valueOf((int) readByte)));
                                }
                                linkedHashMap.put(dataInputStream2.readUTF(), obj);
                            }
                            kotlin.io.CloseableKt.closeFinally(dataInputStream, null);
                        } else {
                            throw new java.lang.IllegalStateException("Unsupported version number: ".concat(java.lang.String.valueOf((int) readShort2)).toString());
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
            } catch (java.io.IOException e) {
                str2 = androidx.work.Data_Kt.getHighSpeedVideoFpsRanges;
                androidx.work.Logger.get().error(str2, "Error in Data#fromByteArray: ", e);
            } catch (java.lang.ClassNotFoundException e2) {
                str = androidx.work.Data_Kt.getHighSpeedVideoFpsRanges;
                androidx.work.Logger.get().error(str, "Error in Data#fromByteArray: ", e2);
            }
            return new androidx.work.Data(linkedHashMap);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean[] getBooleanArray(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        final java.lang.Object obj = this.getHighSpeedVideoFpsRanges.get(key);
        if (!(obj instanceof java.lang.Object[])) {
            return null;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        if (!(objArr instanceof java.lang.Object[])) {
            return null;
        }
        int length = objArr.length;
        kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Boolean> function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Boolean>() { // from class: androidx.work.Data$getBooleanArray$$inlined$getTypedArray$1
            public final java.lang.Boolean invoke(int i) {
                java.lang.Object obj2 = ((java.lang.Object[]) obj)[i];
                if (obj2 != null) {
                    return (java.lang.Boolean) obj2;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Boolean, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Boolean invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }
        };
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = function1.invoke(java.lang.Integer.valueOf(i)).booleanValue();
        }
        return zArr;
    }

    public final byte[] getByteArray(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        final java.lang.Object obj = this.getHighSpeedVideoFpsRanges.get(key);
        if (!(obj instanceof java.lang.Object[])) {
            return null;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        if (!(objArr instanceof java.lang.Object[])) {
            return null;
        }
        int length = objArr.length;
        kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Byte> function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Byte>() { // from class: androidx.work.Data$getByteArray$$inlined$getTypedArray$1
            public final java.lang.Byte invoke(int i) {
                java.lang.Object obj2 = ((java.lang.Object[]) obj)[i];
                if (obj2 != null) {
                    return (java.lang.Byte) obj2;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Byte");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Byte, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Byte invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }
        };
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = function1.invoke(java.lang.Integer.valueOf(i)).byteValue();
        }
        return bArr;
    }

    public final int[] getIntArray(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        final java.lang.Object obj = this.getHighSpeedVideoFpsRanges.get(key);
        if (!(obj instanceof java.lang.Object[])) {
            return null;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        if (!(objArr instanceof java.lang.Object[])) {
            return null;
        }
        int length = objArr.length;
        kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer> function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Integer>() { // from class: androidx.work.Data$getIntArray$$inlined$getTypedArray$1
            public final java.lang.Integer invoke(int i) {
                java.lang.Object obj2 = ((java.lang.Object[]) obj)[i];
                if (obj2 != null) {
                    return (java.lang.Integer) obj2;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Integer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Integer invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }
        };
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = function1.invoke(java.lang.Integer.valueOf(i)).intValue();
        }
        return iArr;
    }

    public final long[] getLongArray(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        final java.lang.Object obj = this.getHighSpeedVideoFpsRanges.get(key);
        if (!(obj instanceof java.lang.Object[])) {
            return null;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        if (!(objArr instanceof java.lang.Object[])) {
            return null;
        }
        int length = objArr.length;
        kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Long> function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Long>() { // from class: androidx.work.Data$getLongArray$$inlined$getTypedArray$1
            public final java.lang.Long invoke(int i) {
                java.lang.Object obj2 = ((java.lang.Object[]) obj)[i];
                if (obj2 != null) {
                    return (java.lang.Long) obj2;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Long, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Long invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }
        };
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = function1.invoke(java.lang.Integer.valueOf(i)).longValue();
        }
        return jArr;
    }

    public final float[] getFloatArray(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        final java.lang.Object obj = this.getHighSpeedVideoFpsRanges.get(key);
        if (!(obj instanceof java.lang.Object[])) {
            return null;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        if (!(objArr instanceof java.lang.Object[])) {
            return null;
        }
        int length = objArr.length;
        kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Float> function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Float>() { // from class: androidx.work.Data$getFloatArray$$inlined$getTypedArray$1
            public final java.lang.Float invoke(int i) {
                java.lang.Object obj2 = ((java.lang.Object[]) obj)[i];
                if (obj2 != null) {
                    return (java.lang.Float) obj2;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Float");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Float, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Float invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }
        };
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = function1.invoke(java.lang.Integer.valueOf(i)).floatValue();
        }
        return fArr;
    }

    public final double[] getDoubleArray(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        final java.lang.Object obj = this.getHighSpeedVideoFpsRanges.get(key);
        if (!(obj instanceof java.lang.Object[])) {
            return null;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        if (!(objArr instanceof java.lang.Object[])) {
            return null;
        }
        int length = objArr.length;
        kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Double> function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Double>() { // from class: androidx.work.Data$getDoubleArray$$inlined$getTypedArray$1
            public final java.lang.Double invoke(int i) {
                java.lang.Object obj2 = ((java.lang.Object[]) obj)[i];
                if (obj2 != null) {
                    return (java.lang.Double) obj2;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Double");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Double, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Double invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }
        };
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = function1.invoke(java.lang.Integer.valueOf(i)).doubleValue();
        }
        return dArr;
    }

    public final java.lang.String[] getStringArray(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        final java.lang.Object obj = this.getHighSpeedVideoFpsRanges.get(key);
        if (!(obj instanceof java.lang.Object[])) {
            return null;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        if (!(objArr instanceof java.lang.Object[])) {
            return null;
        }
        int length = objArr.length;
        kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.String> function1 = new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.String>() { // from class: androidx.work.Data$getStringArray$$inlined$getTypedArray$1
            public final java.lang.String invoke(int i) {
                java.lang.Object obj2 = ((java.lang.Object[]) obj)[i];
                if (obj2 != null) {
                    return (java.lang.String) obj2;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.lang.String] */
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.String invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }
        };
        java.lang.String[] strArr = new java.lang.String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = function1.invoke(java.lang.Integer.valueOf(i));
        }
        return strArr;
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$CYyY16ThCkJ_rLJonZYIKWG1Uyk(java.util.Map.Entry entry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
        java.lang.String str = (java.lang.String) entry.getKey();
        java.lang.Object value = entry.getValue();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" : ");
        if (value instanceof java.lang.Object[]) {
            value = java.util.Arrays.toString((java.lang.Object[]) value);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
        }
        sb.append(value);
        return sb.toString();
    }

    @kotlin.jvm.JvmStatic
    public static final byte[] toByteArrayInternalV1(androidx.work.Data data) {
        return INSTANCE.toByteArrayInternalV1(data);
    }

    @kotlin.Deprecated(message = "This is kept for testing migration", replaceWith = @kotlin.ReplaceWith(expression = "toByteArrayInternalV1", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final byte[] toByteArrayInternalV0(androidx.work.Data data) {
        return INSTANCE.toByteArrayInternalV0(data);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.work.Data fromByteArray(byte[] bArr) {
        return INSTANCE.fromByteArray(bArr);
    }
}
