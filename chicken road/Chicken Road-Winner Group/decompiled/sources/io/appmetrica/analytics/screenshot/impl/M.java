package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes.dex */
public final class M implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Y f8993a;

    /* JADX WARN: Multi-variable type inference failed */
    public M() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S fromModel(J j3) {
        S s3 = new S();
        s3.f9008a = j3.f8988a;
        W w3 = j3.f8989b;
        s3.f9009b = w3 != null ? this.f8993a.fromModel(w3) : null;
        return s3;
    }

    public M(Y y) {
        this.f8993a = y;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ M(Y y, int i3, kotlin.jvm.internal.f fVar) {
        this(y);
        if ((i3 & 1) != 0) {
            y = new Y(null, null, null, 7, null);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J toModel(S s3) {
        return new J(s3.f9008a, this.f8993a.toModel(s3.f9009b));
    }
}
