package io.sentry.android.replay;

import C6.g;
import t6.i;

/* loaded from: classes2.dex */
public final class DefaultReplayBreadcrumbConverter$Companion$snakecasePattern$2 extends i implements s6.a {
    public static final DefaultReplayBreadcrumbConverter$Companion$snakecasePattern$2 INSTANCE = new DefaultReplayBreadcrumbConverter$Companion$snakecasePattern$2();

    public DefaultReplayBreadcrumbConverter$Companion$snakecasePattern$2() {
        super(0);
    }

    @Override // s6.a
    public final g invoke() {
        return new g("_[a-z]");
    }
}
