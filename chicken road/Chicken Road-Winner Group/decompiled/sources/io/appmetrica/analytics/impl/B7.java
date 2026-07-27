package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes.dex */
public final class B7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0978y7 f5758a;

    /* JADX WARN: Multi-variable type inference failed */
    public B7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(A7 a7) {
        ContentValues contentValues = new ContentValues();
        Long l3 = a7.f5674a;
        if (l3 != null) {
            contentValues.put("id", Long.valueOf(l3.longValue()));
        }
        EnumC0372al enumC0372al = a7.f5675b;
        if (enumC0372al != null) {
            contentValues.put("type", Integer.valueOf(enumC0372al.f7002a));
        }
        String str = a7.f5676c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        C0978y7 c0978y7 = this.f5758a;
        contentValues.put("session_description", MessageNano.toByteArray(c0978y7.f8633a.fromModel(a7.f5677d)));
        return contentValues;
    }

    public B7(C0978y7 c0978y7) {
        this.f5758a = c0978y7;
    }

    public /* synthetic */ B7(C0978y7 c0978y7, int i3, kotlin.jvm.internal.f fVar) {
        this((i3 & 1) != 0 ? new C0978y7(null, 1, null) : c0978y7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A7 toModel(ContentValues contentValues) {
        EnumC0372al enumC0372al;
        Long asLong = contentValues.getAsLong("id");
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            enumC0372al = EnumC0372al.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                enumC0372al = EnumC0372al.BACKGROUND;
            }
        } else {
            enumC0372al = null;
        }
        return new A7(asLong, enumC0372al, contentValues.getAsString("report_request_parameters"), this.f5758a.toModel(contentValues.getAsByteArray("session_description")));
    }
}
