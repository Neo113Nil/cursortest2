package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.f7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0350f7 implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0273c7 f5874a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0350f7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final android.content.ContentValues fromModel(io.appmetrica.analytics.impl.C0324e7 c0324e7) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        java.lang.Long l2 = c0324e7.f5777a;
        if (l2 != null) {
            contentValues.put("session_id", java.lang.Long.valueOf(l2.longValue()));
        }
        io.appmetrica.analytics.impl.Vk vk = c0324e7.f5778b;
        if (vk != null) {
            contentValues.put("session_type", java.lang.Integer.valueOf(vk.f5177a));
        }
        java.lang.Long l3 = c0324e7.f5779c;
        if (l3 != null) {
            contentValues.put("number_in_session", java.lang.Long.valueOf(l3.longValue()));
        }
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = c0324e7.f5780d;
        if (enumC0251bb != null) {
            contentValues.put("type", java.lang.Integer.valueOf(enumC0251bb.f5573a));
        }
        java.lang.Long l4 = c0324e7.f5781e;
        if (l4 != null) {
            contentValues.put("global_number", java.lang.Long.valueOf(l4.longValue()));
        }
        java.lang.Long l5 = c0324e7.f5782f;
        if (l5 != null) {
            contentValues.put("time", java.lang.Long.valueOf(l5.longValue()));
        }
        io.appmetrica.analytics.impl.C0273c7 c0273c7 = this.f5874a;
        contentValues.put("event_description", io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(c0273c7.f5636a.fromModel(c0324e7.f5783g)));
        return contentValues;
    }

    public C0350f7(io.appmetrica.analytics.impl.C0273c7 c0273c7) {
        this.f5874a = c0273c7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0350f7(io.appmetrica.analytics.impl.C0273c7 c0273c7, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new io.appmetrica.analytics.impl.C0273c7(null, 1, 0 == true ? 1 : 0) : c0273c7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0324e7 toModel(android.content.ContentValues contentValues) {
        io.appmetrica.analytics.impl.Vk vk;
        java.lang.Long asLong = contentValues.getAsLong("session_id");
        java.lang.Integer asInteger = contentValues.getAsInteger("session_type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            vk = io.appmetrica.analytics.impl.Vk.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                vk = io.appmetrica.analytics.impl.Vk.BACKGROUND;
            }
        } else {
            vk = null;
        }
        java.lang.Long asLong2 = contentValues.getAsLong("number_in_session");
        java.lang.Integer asInteger2 = contentValues.getAsInteger("type");
        return new io.appmetrica.analytics.impl.C0324e7(asLong, vk, asLong2, asInteger2 != null ? io.appmetrica.analytics.impl.EnumC0251bb.a(asInteger2.intValue()) : null, contentValues.getAsLong("global_number"), contentValues.getAsLong("time"), this.f5874a.toModel(contentValues.getAsByteArray("event_description")));
    }
}
