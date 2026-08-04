package io.sentry.android.replay;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;

/* JADX INFO: loaded from: classes2.dex */
public final class ReplayCache$persistSegmentValues$1$2 extends i implements Function1 {
    public static final ReplayCache$persistSegmentValues$1$2 INSTANCE = new ReplayCache$persistSegmentValues$1$2();

    public ReplayCache$persistSegmentValues$1$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Map.Entry<String, String> entry) {
        h.e(entry, "<name for destructuring parameter 0>");
        return entry.getKey() + '=' + entry.getValue();
    }
}
