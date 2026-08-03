package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.t7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0712t7 implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0635q7 f6846a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0712t7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final android.content.ContentValues fromModel(io.appmetrica.analytics.impl.C0686s7 c0686s7) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        java.lang.Long l2 = c0686s7.f6792a;
        if (l2 != null) {
            contentValues.put("id", java.lang.Long.valueOf(l2.longValue()));
        }
        io.appmetrica.analytics.impl.Vk vk = c0686s7.f6793b;
        if (vk != null) {
            contentValues.put("type", java.lang.Integer.valueOf(vk.f5177a));
        }
        java.lang.String str = c0686s7.f6794c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        io.appmetrica.analytics.impl.C0635q7 c0635q7 = this.f6846a;
        contentValues.put("session_description", io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(c0635q7.f6677a.fromModel(c0686s7.f6795d)));
        return contentValues;
    }

    public C0712t7(io.appmetrica.analytics.impl.C0635q7 c0635q7) {
        this.f6846a = c0635q7;
    }

    public /* synthetic */ C0712t7(io.appmetrica.analytics.impl.C0635q7 c0635q7, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new io.appmetrica.analytics.impl.C0635q7(null, 1, null) : c0635q7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0686s7 toModel(android.content.ContentValues contentValues) {
        io.appmetrica.analytics.impl.Vk vk;
        java.lang.Long asLong = contentValues.getAsLong("id");
        java.lang.Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            vk = io.appmetrica.analytics.impl.Vk.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                vk = io.appmetrica.analytics.impl.Vk.BACKGROUND;
            }
        } else {
            vk = null;
        }
        return new io.appmetrica.analytics.impl.C0686s7(asLong, vk, contentValues.getAsString("report_request_parameters"), this.f6846a.toModel(contentValues.getAsByteArray("session_description")));
    }
}
