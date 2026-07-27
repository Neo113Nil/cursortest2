package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.StateSerializer;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.IOException;

/* loaded from: classes.dex */
public class G8 implements StateSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final StateSerializer f5980a;

    /* renamed from: b, reason: collision with root package name */
    public final AESEncrypter f5981b;

    public G8(StateSerializer<Object> stateSerializer, AESEncrypter aESEncrypter) {
        this.f5980a = stateSerializer;
        this.f5981b = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return this.f5980a.defaultValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final byte[] toByteArray(Object obj) {
        try {
            return this.f5981b.encrypt(this.f5980a.toByteArray(obj));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object toState(byte[] bArr) throws IOException {
        try {
            return this.f5980a.toState(this.f5981b.decrypt(bArr));
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
