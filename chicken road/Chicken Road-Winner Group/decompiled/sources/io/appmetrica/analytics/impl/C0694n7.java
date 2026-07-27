package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.n7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0694n7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0616k7 f7911a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0694n7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(C0668m7 c0668m7) {
        ContentValues contentValues = new ContentValues();
        Long l3 = c0668m7.f7842a;
        if (l3 != null) {
            contentValues.put("session_id", Long.valueOf(l3.longValue()));
        }
        EnumC0372al enumC0372al = c0668m7.f7843b;
        if (enumC0372al != null) {
            contentValues.put("session_type", Integer.valueOf(enumC0372al.f7002a));
        }
        Long l4 = c0668m7.f7844c;
        if (l4 != null) {
            contentValues.put("number_in_session", Long.valueOf(l4.longValue()));
        }
        EnumC0569ib enumC0569ib = c0668m7.f7845d;
        if (enumC0569ib != null) {
            contentValues.put("type", Integer.valueOf(enumC0569ib.f7538a));
        }
        Long l5 = c0668m7.f7846e;
        if (l5 != null) {
            contentValues.put("global_number", Long.valueOf(l5.longValue()));
        }
        Long l6 = c0668m7.f;
        if (l6 != null) {
            contentValues.put("time", Long.valueOf(l6.longValue()));
        }
        C0616k7 c0616k7 = this.f7911a;
        contentValues.put("event_description", MessageNano.toByteArray(c0616k7.f7686a.fromModel(c0668m7.f7847g)));
        return contentValues;
    }

    public C0694n7(C0616k7 c0616k7) {
        this.f7911a = c0616k7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0694n7(C0616k7 c0616k7, int i3, kotlin.jvm.internal.f fVar) {
        this((i3 & 1) != 0 ? new C0616k7(null, 1, 0 == true ? 1 : 0) : c0616k7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0668m7 toModel(ContentValues contentValues) {
        EnumC0372al enumC0372al;
        Long asLong = contentValues.getAsLong("session_id");
        Integer asInteger = contentValues.getAsInteger("session_type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            enumC0372al = EnumC0372al.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                enumC0372al = EnumC0372al.BACKGROUND;
            }
        } else {
            enumC0372al = null;
        }
        Long asLong2 = contentValues.getAsLong("number_in_session");
        Integer asInteger2 = contentValues.getAsInteger("type");
        return new C0668m7(asLong, enumC0372al, asLong2, asInteger2 != null ? EnumC0569ib.a(asInteger2.intValue()) : null, contentValues.getAsLong("global_number"), contentValues.getAsLong("time"), this.f7911a.toModel(contentValues.getAsByteArray("event_description")));
    }
}
