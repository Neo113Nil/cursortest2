package com.facebook;

import com.facebook.z;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes3.dex */
public final class B implements z.d {
    public final /* synthetic */ ArrayList<String> a;

    public B(ArrayList<String> arrayList) {
        this.a = arrayList;
    }

    @Override // com.facebook.z.d
    public final void a(String key, String value) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{key, URLEncoder.encode(value, "UTF-8")}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        this.a.add(format);
    }
}
