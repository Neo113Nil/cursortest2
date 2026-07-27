package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.fd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0642fd implements JsonParser, Converter {

    /* renamed from: a, reason: collision with root package name */
    public final RemoteConfigExtensionConfiguration f8182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JsonParser f8183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Converter f8184c;

    public C0642fd(RemoteConfigExtensionConfiguration<Object> remoteConfigExtensionConfiguration) {
        this.f8182a = remoteConfigExtensionConfiguration;
        this.f8183b = remoteConfigExtensionConfiguration.getJsonParser();
        this.f8184c = remoteConfigExtensionConfiguration.getProtobufConverter();
    }

    public final byte[] a(Object obj) {
        return (byte[]) this.f8184c.fromModel(obj);
    }

    public final Object b(JSONObject jSONObject) {
        return this.f8183b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return (byte[]) this.f8184c.fromModel(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parse(JSONObject jSONObject) {
        return this.f8183b.parse(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return this.f8183b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return this.f8184c.toModel((byte[]) obj);
    }

    public final Object a(JSONObject jSONObject) {
        return this.f8183b.parse(jSONObject);
    }

    public final Object a(byte[] bArr) {
        return this.f8184c.toModel(bArr);
    }

    public final RemoteConfigExtensionConfiguration<Object> a() {
        return this.f8182a;
    }
}
