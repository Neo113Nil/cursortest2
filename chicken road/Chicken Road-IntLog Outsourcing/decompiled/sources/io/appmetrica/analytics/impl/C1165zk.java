package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* renamed from: io.appmetrica.analytics.impl.zk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1165zk implements ModuleRemoteConfig {

    /* renamed from: a, reason: collision with root package name */
    public final SdkIdentifiers f9672a;

    /* renamed from: b, reason: collision with root package name */
    public final RemoteConfigMetaInfo f9673b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9674c;

    public C1165zk(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.f9672a = sdkIdentifiers;
        this.f9673b = remoteConfigMetaInfo;
        this.f9674c = obj;
    }

    public final C1165zk a(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new C1165zk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    public final RemoteConfigMetaInfo b() {
        return this.f9673b;
    }

    public final Object c() {
        return this.f9674c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1165zk)) {
            return false;
        }
        C1165zk c1165zk = (C1165zk) obj;
        return kotlin.jvm.internal.i.a(this.f9672a, c1165zk.f9672a) && kotlin.jvm.internal.i.a(this.f9673b, c1165zk.f9673b) && kotlin.jvm.internal.i.a(this.f9674c, c1165zk.f9674c);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.f9674c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final SdkIdentifiers getIdentifiers() {
        return this.f9672a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.f9673b;
    }

    public final int hashCode() {
        int hashCode = (this.f9673b.hashCode() + (this.f9672a.hashCode() * 31)) * 31;
        Object obj = this.f9674c;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.f9672a + ", remoteConfigMetaInfo=" + this.f9673b + ", featuresConfig=" + this.f9674c + ')';
    }

    public final SdkIdentifiers a() {
        return this.f9672a;
    }

    public static C1165zk a(C1165zk c1165zk, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            sdkIdentifiers = c1165zk.f9672a;
        }
        if ((i2 & 2) != 0) {
            remoteConfigMetaInfo = c1165zk.f9673b;
        }
        if ((i2 & 4) != 0) {
            obj = c1165zk.f9674c;
        }
        c1165zk.getClass();
        return new C1165zk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }
}
