package com.datadog.trace.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class ResolverCacheConfig {
    public static final com.datadog.trace.api.ResolverCacheConfig LARGE;
    public static final com.datadog.trace.api.ResolverCacheConfig LEGACY;
    public static final com.datadog.trace.api.ResolverCacheConfig MEMOS;
    public static final com.datadog.trace.api.ResolverCacheConfig NO_MEMOS;
    public static final com.datadog.trace.api.ResolverCacheConfig SMALL;
    private static final /* synthetic */ com.datadog.trace.api.ResolverCacheConfig[] getHighSpeedVideoSizes;

    public abstract int memoPoolSize();

    public abstract int noMatchesSize();

    public abstract int outlinePoolSize();

    public abstract int typePoolSize();

    private ResolverCacheConfig(java.lang.String str, int i) {
    }

    public static com.datadog.trace.api.ResolverCacheConfig valueOf(java.lang.String str) {
        return (com.datadog.trace.api.ResolverCacheConfig) java.lang.Enum.valueOf(com.datadog.trace.api.ResolverCacheConfig.class, str);
    }

    public static com.datadog.trace.api.ResolverCacheConfig[] values() {
        return (com.datadog.trace.api.ResolverCacheConfig[]) getHighSpeedVideoSizes.clone();
    }

    /* renamed from: com.datadog.trace.api.ResolverCacheConfig$1, reason: invalid class name */
    enum AnonymousClass1 extends com.datadog.trace.api.ResolverCacheConfig {
        @Override // com.datadog.trace.api.ResolverCacheConfig
        public final int memoPoolSize() {
            return 4096;
        }

        @Override // com.datadog.trace.api.ResolverCacheConfig
        public final int noMatchesSize() {
            return 65536;
        }

        @Override // com.datadog.trace.api.ResolverCacheConfig
        public final int outlinePoolSize() {
            return 256;
        }

        @Override // com.datadog.trace.api.ResolverCacheConfig
        public final int typePoolSize() {
            return 64;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private AnonymousClass1(java.lang.String str, int i) {
            super(str, r2, r2);
            byte b = 0;
        }

        /* synthetic */ AnonymousClass1(java.lang.String str) {
            this(str, 0);
        }
    }

    static {
        com.datadog.trace.api.ResolverCacheConfig.AnonymousClass1 anonymousClass1 = new com.datadog.trace.api.ResolverCacheConfig.AnonymousClass1("LARGE");
        LARGE = anonymousClass1;
        com.datadog.trace.api.ResolverCacheConfig.AnonymousClass2 anonymousClass2 = new com.datadog.trace.api.ResolverCacheConfig.AnonymousClass2("MEMOS");
        MEMOS = anonymousClass2;
        com.datadog.trace.api.ResolverCacheConfig.AnonymousClass3 anonymousClass3 = new com.datadog.trace.api.ResolverCacheConfig.AnonymousClass3("NO_MEMOS");
        NO_MEMOS = anonymousClass3;
        com.datadog.trace.api.ResolverCacheConfig.AnonymousClass4 anonymousClass4 = new com.datadog.trace.api.ResolverCacheConfig.AnonymousClass4("SMALL");
        SMALL = anonymousClass4;
        com.datadog.trace.api.ResolverCacheConfig.AnonymousClass5 anonymousClass5 = new com.datadog.trace.api.ResolverCacheConfig.AnonymousClass5("LEGACY");
        LEGACY = anonymousClass5;
        getHighSpeedVideoSizes = new com.datadog.trace.api.ResolverCacheConfig[]{anonymousClass1, anonymousClass2, anonymousClass3, anonymousClass4, anonymousClass5};
    }

    /* renamed from: com.datadog.trace.api.ResolverCacheConfig$2, reason: invalid class name */
    enum AnonymousClass2 extends com.datadog.trace.api.ResolverCacheConfig {
        @Override // com.datadog.trace.api.ResolverCacheConfig
        public final int memoPoolSize() {
            return 2048;
        }

        @Override // com.datadog.trace.api.ResolverCacheConfig
        public final int noMatchesSize() {
            return 16384;
        }

        @Override // com.datadog.trace.api.ResolverCacheConfig
        public final int outlinePoolSize() {
            return 128;
        }

        @Override // com.datadog.trace.api.ResolverCacheConfig
        public final int typePoolSize() {
            return 32;
        }

        private AnonymousClass2(java.lang.String str, int i) {
            super(str, 1, (byte) 0);
        }

        /* synthetic */ AnonymousClass2(java.lang.String str) {
            this(str, 1);
        }
    }

    /* renamed from: com.datadog.trace.api.ResolverCacheConfig$3, reason: invalid class name */
    enum AnonymousClass3 extends com.datadog.trace.api.ResolverCacheConfig {
        @Override // com.datadog.trace.api.ResolverCacheConfig
        public final int memoPoolSize() {
            return 0;
        }

        @Override // com.datadog.trace.api.ResolverCacheConfig
        public final int noMatchesSize() {
            return 0;
        }

        @Override // com.datadog.trace.api.ResolverCacheConfig
        public final int outlinePoolSize() {
            return 256;
        }

        @Override // com.datadog.trace.api.ResolverCacheConfig
        public final int typePoolSize() {
            return 32;
        }

        private AnonymousClass3(java.lang.String str, int i) {
            super(str, 2, (byte) 0);
        }

        /* synthetic */ AnonymousClass3(java.lang.String str) {
            this(str, 2);
        }
    }

    /* renamed from: com.datadog.trace.api.ResolverCacheConfig$4, reason: invalid class name */
    enum AnonymousClass4 extends com.datadog.trace.api.ResolverCacheConfig {
        @Override // com.datadog.trace.api.ResolverCacheConfig
        public final int memoPoolSize() {
            return 0;
        }

        @Override // com.datadog.trace.api.ResolverCacheConfig
        public final int noMatchesSize() {
            return 0;
        }

        @Override // com.datadog.trace.api.ResolverCacheConfig
        public final int outlinePoolSize() {
            return 32;
        }

        @Override // com.datadog.trace.api.ResolverCacheConfig
        public final int typePoolSize() {
            return 16;
        }

        private AnonymousClass4(java.lang.String str, int i) {
            super(str, 3, (byte) 0);
        }

        /* synthetic */ AnonymousClass4(java.lang.String str) {
            this(str, 3);
        }
    }

    /* renamed from: com.datadog.trace.api.ResolverCacheConfig$5, reason: invalid class name */
    enum AnonymousClass5 extends com.datadog.trace.api.ResolverCacheConfig {
        @Override // com.datadog.trace.api.ResolverCacheConfig
        public final int memoPoolSize() {
            return 0;
        }

        @Override // com.datadog.trace.api.ResolverCacheConfig
        public final int noMatchesSize() {
            return 0;
        }

        @Override // com.datadog.trace.api.ResolverCacheConfig
        public final int outlinePoolSize() {
            return 0;
        }

        @Override // com.datadog.trace.api.ResolverCacheConfig
        public final int typePoolSize() {
            return 64;
        }

        private AnonymousClass5(java.lang.String str, int i) {
            super(str, 4, (byte) 0);
        }

        /* synthetic */ AnonymousClass5(java.lang.String str) {
            this(str, 4);
        }
    }

    /* synthetic */ ResolverCacheConfig(java.lang.String str, int i, byte b) {
        this(str, i);
    }
}
