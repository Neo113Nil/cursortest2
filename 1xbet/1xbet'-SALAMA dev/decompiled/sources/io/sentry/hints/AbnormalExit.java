package io.sentry.hints;

/* JADX INFO: loaded from: classes2.dex */
public interface AbnormalExit {
    boolean ignoreCurrentThread();

    String mechanism();

    Long timestamp();
}
