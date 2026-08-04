package io.sentry.android.replay;

import io.sentry.util.Random;
import t6.i;

/* JADX INFO: loaded from: classes2.dex */
public final class ReplayIntegration$random$2 extends i implements s6.a {
    public static final ReplayIntegration$random$2 INSTANCE = new ReplayIntegration$random$2();

    public ReplayIntegration$random$2() {
        super(0);
    }

    @Override // s6.a
    public final Random invoke() {
        return new Random();
    }
}
