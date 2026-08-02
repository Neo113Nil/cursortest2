package com.github.droibit.flutter.plugins.customtabs.core.utils;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {
    public static final Bundle a(Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Bundle bundle = new Bundle(headers.size());
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }
}
