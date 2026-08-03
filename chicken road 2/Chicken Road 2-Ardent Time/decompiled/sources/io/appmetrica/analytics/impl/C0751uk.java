package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.uk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0751uk implements io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers f6930a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo f6931b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f6932c;

    public C0751uk(io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers sdkIdentifiers, io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo remoteConfigMetaInfo, java.lang.Object obj) {
        this.f6930a = sdkIdentifiers;
        this.f6931b = remoteConfigMetaInfo;
        this.f6932c = obj;
    }

    public final io.appmetrica.analytics.impl.C0751uk a(io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers sdkIdentifiers, io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo remoteConfigMetaInfo, java.lang.Object obj) {
        return new io.appmetrica.analytics.impl.C0751uk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    public final io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo b() {
        return this.f6931b;
    }

    public final java.lang.Object c() {
        return this.f6932c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.impl.C0751uk)) {
            return false;
        }
        io.appmetrica.analytics.impl.C0751uk c0751uk = (io.appmetrica.analytics.impl.C0751uk) obj;
        return kotlin.jvm.internal.i.a(this.f6930a, c0751uk.f6930a) && kotlin.jvm.internal.i.a(this.f6931b, c0751uk.f6931b) && kotlin.jvm.internal.i.a(this.f6932c, c0751uk.f6932c);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final java.lang.Object getFeaturesConfig() {
        return this.f6932c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers getIdentifiers() {
        return this.f6930a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.f6931b;
    }

    public final int hashCode() {
        int hashCode = (this.f6931b.hashCode() + (this.f6930a.hashCode() * 31)) * 31;
        java.lang.Object obj = this.f6932c;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final java.lang.String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.f6930a + ", remoteConfigMetaInfo=" + this.f6931b + ", featuresConfig=" + this.f6932c + ')';
    }

    public final io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers a() {
        return this.f6930a;
    }

    public static io.appmetrica.analytics.impl.C0751uk a(io.appmetrica.analytics.impl.C0751uk c0751uk, io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers sdkIdentifiers, io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo remoteConfigMetaInfo, java.lang.Object obj, int i2, java.lang.Object obj2) {
        if ((i2 & 1) != 0) {
            sdkIdentifiers = c0751uk.f6930a;
        }
        if ((i2 & 2) != 0) {
            remoteConfigMetaInfo = c0751uk.f6931b;
        }
        if ((i2 & 4) != 0) {
            obj = c0751uk.f6932c;
        }
        c0751uk.getClass();
        return new io.appmetrica.analytics.impl.C0751uk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }
}
