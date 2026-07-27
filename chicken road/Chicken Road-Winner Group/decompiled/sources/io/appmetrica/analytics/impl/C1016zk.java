package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* renamed from: io.appmetrica.analytics.impl.zk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1016zk implements ModuleRemoteConfig {

    /* renamed from: a, reason: collision with root package name */
    public final SdkIdentifiers f8709a;

    /* renamed from: b, reason: collision with root package name */
    public final RemoteConfigMetaInfo f8710b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8711c;

    public C1016zk(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.f8709a = sdkIdentifiers;
        this.f8710b = remoteConfigMetaInfo;
        this.f8711c = obj;
    }

    public final C1016zk a(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new C1016zk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    public final RemoteConfigMetaInfo b() {
        return this.f8710b;
    }

    public final Object c() {
        return this.f8711c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1016zk)) {
            return false;
        }
        C1016zk c1016zk = (C1016zk) obj;
        return kotlin.jvm.internal.j.a(this.f8709a, c1016zk.f8709a) && kotlin.jvm.internal.j.a(this.f8710b, c1016zk.f8710b) && kotlin.jvm.internal.j.a(this.f8711c, c1016zk.f8711c);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.f8711c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final SdkIdentifiers getIdentifiers() {
        return this.f8709a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.f8710b;
    }

    public final int hashCode() {
        int hashCode = (this.f8710b.hashCode() + (this.f8709a.hashCode() * 31)) * 31;
        Object obj = this.f8711c;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.f8709a + ", remoteConfigMetaInfo=" + this.f8710b + ", featuresConfig=" + this.f8711c + ')';
    }

    public final SdkIdentifiers a() {
        return this.f8709a;
    }

    public static C1016zk a(C1016zk c1016zk, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            sdkIdentifiers = c1016zk.f8709a;
        }
        if ((i3 & 2) != 0) {
            remoteConfigMetaInfo = c1016zk.f8710b;
        }
        if ((i3 & 4) != 0) {
            obj = c1016zk.f8711c;
        }
        c1016zk.getClass();
        return new C1016zk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }
}
