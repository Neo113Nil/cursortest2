package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class Pb {
    public static List a(Configuration configuration) {
        return AndroidUtils.isApiAchieved(24) ? Qb.a(configuration) : K1.b.W(Le.a(configuration.locale));
    }
}
