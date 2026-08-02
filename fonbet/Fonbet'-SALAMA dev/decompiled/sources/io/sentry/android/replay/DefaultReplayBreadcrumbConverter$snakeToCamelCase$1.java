package io.sentry.android.replay;

import C6.e;
import C6.f;
import C6.o;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;

/* loaded from: classes2.dex */
public final class DefaultReplayBreadcrumbConverter$snakeToCamelCase$1 extends i implements Function1 {
    public static final DefaultReplayBreadcrumbConverter$snakeToCamelCase$1 INSTANCE = new DefaultReplayBreadcrumbConverter$snakeToCamelCase$1();

    public DefaultReplayBreadcrumbConverter$snakeToCamelCase$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(e eVar) {
        h.e(eVar, "it");
        String group = ((f) eVar).f1597a.group();
        h.d(group, "group(...)");
        if (group.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        String upperCase = String.valueOf(group.charAt(o.r0(group))).toUpperCase(Locale.ROOT);
        h.d(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
