package com.csdcorp.speech_to_text;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public final class c extends BroadcastReceiver {
    public final b a;

    public c(b flutterResult, boolean z) {
        Intrinsics.checkNotNullParameter(flutterResult, "flutterResult");
        this.a = flutterResult;
    }

    public static String a(Locale locale) {
        String replace$default;
        String displayName = locale.getDisplayName();
        Intrinsics.checkNotNullExpressionValue(displayName, "getDisplayName(...)");
        replace$default = StringsKt__StringsJVMKt.replace$default(displayName, ':', ' ', false, 4, (Object) null);
        return locale.getLanguage() + "_" + locale.getCountry() + ":" + replace$default;
    }

    public final void b(List<String> list) {
        Locale locale = Locale.getDefault();
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNull(locale);
        arrayList.add(a(locale));
        if (list != null) {
            for (String str : list) {
                if (!Intrinsics.areEqual(locale.toLanguageTag(), str)) {
                    Locale forLanguageTag = Locale.forLanguageTag(str);
                    Intrinsics.checkNotNull(forLanguageTag);
                    arrayList.add(a(forLanguageTag));
                }
            }
        }
        this.a.success(arrayList);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle resultExtras = getResultExtras(true);
        if (resultExtras.containsKey("android.speech.extra.LANGUAGE_PREFERENCE")) {
            resultExtras.getString("android.speech.extra.LANGUAGE_PREFERENCE");
        }
        if (resultExtras.containsKey("android.speech.extra.SUPPORTED_LANGUAGES")) {
            b(resultExtras.getStringArrayList("android.speech.extra.SUPPORTED_LANGUAGES"));
        } else {
            b(new ArrayList());
        }
    }
}
