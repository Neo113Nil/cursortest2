package com.moloco.sdk.internal.publisher;

/* renamed from: com.moloco.sdk.internal.publisher.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3417a implements com.moloco.sdk.internal.publisher.s {
    public static final com.moloco.sdk.internal.publisher.C3417a.C0187a d = new com.moloco.sdk.internal.publisher.C3417a.C0187a(null);
    public static final int e = 8;
    public static final java.lang.String f = "AdCreateLoadTimeoutManager";

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.publisher.AdFormatType f7079a;
    public final long b;
    public long c;

    /* renamed from: com.moloco.sdk.internal.publisher.a$a, reason: collision with other inner class name */
    public static final class C0187a {
        public /* synthetic */ C0187a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0187a() {
        }
    }

    public /* synthetic */ C3417a(com.moloco.sdk.publisher.AdFormatType adFormatType, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormatType, j);
    }

    public final long a(long j) {
        long createAdObjectStartTime = j - getCreateAdObjectStartTime();
        long duration = kotlin.time.DurationKt.toDuration(kotlin.time.Duration.m12157getInWholeMillisecondsimpl(this.b) - createAdObjectStartTime, kotlin.time.DurationUnit.MILLISECONDS);
        com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, f, this.f7079a + " timeout: " + ((java.lang.Object) kotlin.time.Duration.m12186toStringimpl(this.b)) + " , create ad duration: " + createAdObjectStartTime + " ms (createTime: " + getCreateAdObjectStartTime() + " ms, loadStartTime: " + j + " ms). Return value: " + ((java.lang.Object) kotlin.time.Duration.m12186toStringimpl(duration)), false, 4, null);
        return duration;
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public long getCreateAdObjectStartTime() {
        return this.c;
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public void setCreateAdObjectStartTime(long j) {
        this.c = j;
    }

    public C3417a(com.moloco.sdk.publisher.AdFormatType adFormatType, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        this.f7079a = adFormatType;
        this.b = j;
    }
}
