package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Yc implements io.appmetrica.analytics.coreapi.internal.data.JsonParser, io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration f5338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.coreapi.internal.data.JsonParser f5339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.coreapi.internal.data.Converter f5340c;

    public Yc(io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration<java.lang.Object> remoteConfigExtensionConfiguration) {
        this.f5338a = remoteConfigExtensionConfiguration;
        this.f5339b = remoteConfigExtensionConfiguration.getJsonParser();
        this.f5340c = remoteConfigExtensionConfiguration.getProtobufConverter();
    }

    public final byte[] a(java.lang.Object obj) {
        return (byte[]) this.f5340c.fromModel(obj);
    }

    public final java.lang.Object b(org.json.JSONObject jSONObject) {
        return this.f5339b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object fromModel(java.lang.Object obj) {
        return (byte[]) this.f5340c.fromModel(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final java.lang.Object parse(org.json.JSONObject jSONObject) {
        return this.f5339b.parse(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final java.lang.Object parseOrNull(org.json.JSONObject jSONObject) {
        return this.f5339b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object toModel(java.lang.Object obj) {
        return this.f5340c.toModel((byte[]) obj);
    }

    public final java.lang.Object a(org.json.JSONObject jSONObject) {
        return this.f5339b.parse(jSONObject);
    }

    public final java.lang.Object a(byte[] bArr) {
        return this.f5340c.toModel(bArr);
    }

    public final io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration<java.lang.Object> a() {
        return this.f5338a;
    }
}
