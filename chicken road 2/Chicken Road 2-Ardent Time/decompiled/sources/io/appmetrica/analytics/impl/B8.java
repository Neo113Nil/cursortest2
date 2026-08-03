package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public class B8 implements io.appmetrica.analytics.coreapi.internal.data.StateSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.data.StateSerializer f4103a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter f4104b;

    public B8(io.appmetrica.analytics.coreapi.internal.data.StateSerializer<java.lang.Object> stateSerializer, io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter aESEncrypter) {
        this.f4103a = stateSerializer;
        this.f4104b = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final java.lang.Object defaultValue() {
        return this.f4103a.defaultValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final byte[] toByteArray(java.lang.Object obj) {
        try {
            return this.f4104b.encrypt(this.f4103a.toByteArray(obj));
        } catch (java.lang.Throwable unused) {
            return new byte[0];
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final java.lang.Object toState(byte[] bArr) {
        try {
            return this.f4103a.toState(this.f4104b.decrypt(bArr));
        } catch (java.lang.Throwable th) {
            throw new java.io.IOException(th);
        }
    }
}
