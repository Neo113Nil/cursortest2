package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0006J!\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u00020\u00122\u0014\u0010\u0017\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001fR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040&8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R&\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000*0&8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010(R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000-8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/"}, d2 = {"Lio/ktor/util/CaseInsensitiveMap;", "", "Value", "", "", "<init>", "()V", "key", "", "containsKey", "(Ljava/lang/String;)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "containsValue", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "isEmpty", "()Z", "", "clear", "put", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "(Ljava/util/Map;)V", "remove", "other", "equals", "", "hashCode", "()I", "Lio/ktor/util/CaseInsensitiveString;", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "", "getKeys", "()Ljava/util/Set;", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "", "getEntries", "entries", "", "getValues", "()Ljava/util/Collection;", "values"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CaseInsensitiveMap<Value> implements java.util.Map<java.lang.String, Value>, kotlin.jvm.internal.markers.KMutableMap {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<io.ktor.util.CaseInsensitiveString, Value> getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap();

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return containsKey((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final java.util.Set<java.util.Map.Entry<java.lang.String, Value>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ Value get(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return get((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final java.util.Set<java.lang.String> keySet() {
        return getKeys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object put(java.lang.String str, java.lang.Object obj) {
        return put2(str, (java.lang.String) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Value remove(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return remove((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final java.util.Collection<Value> values() {
        return getValues();
    }

    public final int getSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI.size();
    }

    public final boolean containsKey(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.containsKey(new io.ktor.util.CaseInsensitiveString(key));
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object value) {
        if (value == null) {
            return false;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.containsValue(value);
    }

    public final Value get(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.get(io.ktor.util.TextKt.caseInsensitive(key));
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isEmpty();
    }

    @Override // java.util.Map
    public final void clear() {
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
    }

    /* renamed from: put, reason: avoid collision after fix types in other method */
    public final Value put2(java.lang.String key, Value value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.put(io.ktor.util.TextKt.caseInsensitive(key), value);
    }

    public final Value remove(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.remove(io.ktor.util.TextKt.caseInsensitive(key));
    }

    public final java.util.Set<java.lang.String> getKeys() {
        return new io.ktor.util.DelegatingMutableSet(this.getHighResolutionOutputSizeshNQ4ISI.keySet(), new kotlin.jvm.functions.Function1() { // from class: io.ktor.util.CaseInsensitiveMap$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.util.CaseInsensitiveMap.$r8$lambda$Lyj5_bBevXED1sLUDUe6C3gMSJE((io.ktor.util.CaseInsensitiveString) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: io.ktor.util.CaseInsensitiveMap$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.util.CaseInsensitiveMap.$r8$lambda$hAxpVwT76bqp2BoZZDdNjODFxr4((java.lang.String) obj);
            }
        });
    }

    public final java.util.Set<java.util.Map.Entry<java.lang.String, Value>> getEntries() {
        return new io.ktor.util.DelegatingMutableSet(this.getHighResolutionOutputSizeshNQ4ISI.entrySet(), new kotlin.jvm.functions.Function1() { // from class: io.ktor.util.CaseInsensitiveMap$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.util.CaseInsensitiveMap.$r8$lambda$8gRXe26BWRKpYiH96mox1NC19uM((java.util.Map.Entry) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: io.ktor.util.CaseInsensitiveMap$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.util.CaseInsensitiveMap.$r8$lambda$QS7o6YFatbut9EOttl7Zu9aNzzY((java.util.Map.Entry) obj);
            }
        });
    }

    public final java.util.Collection<Value> getValues() {
        return this.getHighResolutionOutputSizeshNQ4ISI.values();
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object other) {
        if (other == null || !(other instanceof io.ktor.util.CaseInsensitiveMap)) {
            return false;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(((io.ktor.util.CaseInsensitiveMap) other).getHighResolutionOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends java.lang.String, ? extends Value> from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        for (java.util.Map.Entry<? extends java.lang.String, ? extends Value> entry : from.entrySet()) {
            put2(entry.getKey(), (java.lang.String) entry.getValue());
        }
    }

    public static /* synthetic */ java.util.Map.Entry $r8$lambda$8gRXe26BWRKpYiH96mox1NC19uM(java.util.Map.Entry entry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
        return new io.ktor.util.Entry(((io.ktor.util.CaseInsensitiveString) entry.getKey()).getContent(), entry.getValue());
    }

    public static /* synthetic */ java.lang.String $r8$lambda$Lyj5_bBevXED1sLUDUe6C3gMSJE(io.ktor.util.CaseInsensitiveString caseInsensitiveString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(caseInsensitiveString, "");
        return caseInsensitiveString.getContent();
    }

    public static /* synthetic */ java.util.Map.Entry $r8$lambda$QS7o6YFatbut9EOttl7Zu9aNzzY(java.util.Map.Entry entry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "");
        return new io.ktor.util.Entry(io.ktor.util.TextKt.caseInsensitive((java.lang.String) entry.getKey()), entry.getValue());
    }

    public static /* synthetic */ io.ktor.util.CaseInsensitiveString $r8$lambda$hAxpVwT76bqp2BoZZDdNjODFxr4(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return io.ktor.util.TextKt.caseInsensitive(str);
    }
}
