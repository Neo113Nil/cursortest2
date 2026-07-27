package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.im, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0579im {

    /* renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f7550a;

    /* renamed from: b, reason: collision with root package name */
    public final yo f7551b;

    public C0579im(ProtobufStateStorage protobufStateStorage, yo yoVar) {
        this.f7550a = protobufStateStorage;
        this.f7551b = yoVar;
    }

    public C0579im(Context context) {
        this(((Vm) Tm.a(C0709nm.class)).create(context), C0878ua.k().D().a());
    }
}
