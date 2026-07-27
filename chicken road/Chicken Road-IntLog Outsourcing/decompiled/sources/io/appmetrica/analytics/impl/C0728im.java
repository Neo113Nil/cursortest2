package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.im, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0728im {

    /* renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f8461a;

    /* renamed from: b, reason: collision with root package name */
    public final yo f8462b;

    public C0728im(ProtobufStateStorage protobufStateStorage, yo yoVar) {
        this.f8461a = protobufStateStorage;
        this.f8462b = yoVar;
    }

    public C0728im(Context context) {
        this(((Vm) Tm.a(C0858nm.class)).create(context), C1027ua.k().D().a());
    }
}
