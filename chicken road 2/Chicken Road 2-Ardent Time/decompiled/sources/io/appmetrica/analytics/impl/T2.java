package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class T2 implements io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper f4995a;

    public T2(io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper iBinaryDataHelper) {
        this.f4995a = iBinaryDataHelper;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final byte[] get(java.lang.String str) {
        return this.f4995a.get(str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void insert(java.lang.String str, byte[] bArr) {
        this.f4995a.insert(str, bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void remove(java.lang.String str) {
        this.f4995a.remove(str);
    }
}
