package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.fd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0493fd implements JsonParser, Converter {

    /* renamed from: a, reason: collision with root package name */
    public final RemoteConfigExtensionConfiguration f7287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JsonParser f7288b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Converter f7289c;

    public C0493fd(RemoteConfigExtensionConfiguration<Object> remoteConfigExtensionConfiguration) {
        this.f7287a = remoteConfigExtensionConfiguration;
        this.f7288b = remoteConfigExtensionConfiguration.getJsonParser();
        this.f7289c = remoteConfigExtensionConfiguration.getProtobufConverter();
    }

    public final byte[] a(Object obj) {
        return (byte[]) this.f7289c.fromModel(obj);
    }

    public final Object b(JSONObject jSONObject) {
        return this.f7288b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return (byte[]) this.f7289c.fromModel(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parse(JSONObject jSONObject) {
        return this.f7288b.parse(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return this.f7288b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return this.f7289c.toModel((byte[]) obj);
    }

    public final Object a(JSONObject jSONObject) {
        return this.f7288b.parse(jSONObject);
    }

    public final Object a(byte[] bArr) {
        return this.f7289c.toModel(bArr);
    }

    public final RemoteConfigExtensionConfiguration<Object> a() {
        return this.f7287a;
    }
}
