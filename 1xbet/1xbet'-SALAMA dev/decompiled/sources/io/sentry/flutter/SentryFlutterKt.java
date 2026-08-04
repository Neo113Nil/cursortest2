package io.sentry.flutter;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class SentryFlutterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> void getIfNotNull(Map<String, ? extends Object> map, String str, Function1 function1) {
        Object obj = map.get(str);
        if (obj == null) {
            obj = null;
        }
        if (obj != null) {
            function1.invoke(obj);
        }
    }
}
