package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\t\b&\u0018\u0000*\u0018\b\u0000\u0010\u0004 \u0001*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\"\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R%\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028G@GX\u0086\u008e\u0002¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/apollographql/apollo/api/ObjectBuilder;", "", "", "", "T", "Lcom/apollographql/apollo/api/BuilderScope;", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "<init>", "(Lcom/apollographql/apollo/api/CustomScalarAdapters;)V", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set", "(Ljava/lang/String;Ljava/lang/Object;)V", "build", "()Ljava/util/Map;", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "getCustomScalarAdapters", "()Lcom/apollographql/apollo/api/CustomScalarAdapters;", "", "__fields", "Ljava/util/Map;", "get__fields", "<set-?>", "get__typename", "()Ljava/lang/String;", "set__typename", "(Ljava/lang/String;)V", "__typename"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ObjectBuilder<T extends java.util.Map<java.lang.String, ? extends java.lang.Object>> implements com.apollographql.apollo.api.BuilderScope {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(com.apollographql.apollo.api.ObjectBuilder.class, "__typename", "get__typename()Ljava/lang/String;", 0))};
    private final java.util.Map<java.lang.String, java.lang.Object> __fields;
    private final com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters;

    public abstract T build();

    public ObjectBuilder(com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
        this.customScalarAdapters = customScalarAdapters;
        this.__fields = new java.util.LinkedHashMap();
    }

    @Override // com.apollographql.apollo.api.BuilderScope
    public com.apollographql.apollo.api.CustomScalarAdapters getCustomScalarAdapters() {
        return this.customScalarAdapters;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> get__fields() {
        return this.__fields;
    }

    public final java.lang.String get__typename() {
        return (java.lang.String) kotlin.collections.MapsKt.getOrImplicitDefaultNullable(this.__fields, getHighSpeedVideoSizes[0].getName());
    }

    public final void set__typename(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.__fields.put(getHighSpeedVideoSizes[0].getName(), str);
    }

    public final void set(java.lang.String key, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        this.__fields.put(key, value);
    }
}
