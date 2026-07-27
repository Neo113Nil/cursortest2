package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes.dex */
public final class B7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C1127y7 f6590a;

    /* JADX WARN: Multi-variable type inference failed */
    public B7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(A7 a7) {
        ContentValues contentValues = new ContentValues();
        Long l2 = a7.f6504a;
        if (l2 != null) {
            contentValues.put(OutcomeConstants.OUTCOME_ID, Long.valueOf(l2.longValue()));
        }
        EnumC0521al enumC0521al = a7.f6505b;
        if (enumC0521al != null) {
            contentValues.put(WebViewManager.EVENT_TYPE_KEY, Integer.valueOf(enumC0521al.f7885a));
        }
        String str = a7.f6506c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        C1127y7 c1127y7 = this.f6590a;
        contentValues.put("session_description", MessageNano.toByteArray(c1127y7.f9592a.fromModel(a7.f6507d)));
        return contentValues;
    }

    public B7(C1127y7 c1127y7) {
        this.f6590a = c1127y7;
    }

    public /* synthetic */ B7(C1127y7 c1127y7, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new C1127y7(null, 1, null) : c1127y7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A7 toModel(ContentValues contentValues) {
        EnumC0521al enumC0521al;
        Long asLong = contentValues.getAsLong(OutcomeConstants.OUTCOME_ID);
        Integer asInteger = contentValues.getAsInteger(WebViewManager.EVENT_TYPE_KEY);
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            enumC0521al = EnumC0521al.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                enumC0521al = EnumC0521al.BACKGROUND;
            }
        } else {
            enumC0521al = null;
        }
        return new A7(asLong, enumC0521al, contentValues.getAsString("report_request_parameters"), this.f6590a.toModel(contentValues.getAsByteArray("session_description")));
    }
}
