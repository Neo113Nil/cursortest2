package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* loaded from: classes.dex */
public final class W8 {

    /* renamed from: a, reason: collision with root package name */
    public final U8 f6790a;

    /* renamed from: b, reason: collision with root package name */
    public final V8 f6791b;

    /* renamed from: c, reason: collision with root package name */
    public final IBinaryDataHelper f6792c;

    public W8(Context context, X4 x4) {
        this(new V8(), new U8(), C0513g7.a(context).a(x4));
    }

    public W8(V8 v8, U8 u8, IBinaryDataHelper iBinaryDataHelper) {
        this.f6791b = v8;
        this.f6790a = u8;
        this.f6792c = iBinaryDataHelper;
    }
}
