package io.sentry.util;

/* loaded from: classes2.dex */
public final class SentryRandom {
    private static final SentryRandomThreadLocal instance = new SentryRandomThreadLocal();

    public static class SentryRandomThreadLocal extends ThreadLocal<Random> {
        private SentryRandomThreadLocal() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Random initialValue() {
            return new Random();
        }
    }

    public static Random current() {
        return instance.get();
    }
}
