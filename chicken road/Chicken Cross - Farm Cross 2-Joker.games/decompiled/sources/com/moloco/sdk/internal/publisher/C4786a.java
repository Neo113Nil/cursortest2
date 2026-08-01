package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.s;
import com.moloco.sdk.publisher.AdFormatType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* renamed from: com.moloco.sdk.internal.publisher.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4786a implements s {
    public static final C1482a d = new C1482a(null);
    public static final int e = 8;
    public static final String f = "AdCreateLoadTimeoutManager";

    /* renamed from: a, reason: collision with root package name */
    public final AdFormatType f10591a;
    public final long b;
    public long c;

    /* renamed from: com.moloco.sdk.internal.publisher.a$a, reason: collision with other inner class name */
    public static final class C1482a {
        public /* synthetic */ C1482a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C1482a() {
        }
    }

    public /* synthetic */ C4786a(AdFormatType adFormatType, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormatType, j);
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public void a(long j, long j2) {
        s.a.a(this, j, j2);
    }

    @Override // com.moloco.sdk.internal.publisher.s
    /* renamed from: getCreateAdObjectDuration-UwyO8pc */
    public long mo7561getCreateAdObjectDurationUwyO8pc() {
        return this.c;
    }

    @Override // com.moloco.sdk.internal.publisher.s
    /* renamed from: setCreateAdObjectDuration-LRDsOJo */
    public void mo7562setCreateAdObjectDurationLRDsOJo(long j) {
        this.c = j;
    }

    public C4786a(AdFormatType adFormatType, long j) {
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        this.f10591a = adFormatType;
        this.b = j;
        this.c = Duration.INSTANCE.m9517getZEROUwyO8pc();
    }

    public final long a() {
        long m9454minusLRDsOJo = Duration.m9454minusLRDsOJo(this.b, mo7561getCreateAdObjectDurationUwyO8pc());
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, f, this.f10591a + " timeout: " + ((Object) Duration.m9466toStringimpl(this.b)) + ", create ad duration: " + ((Object) Duration.m9466toStringimpl(mo7561getCreateAdObjectDurationUwyO8pc())) + ". Return value: " + ((Object) Duration.m9466toStringimpl(m9454minusLRDsOJo)), false, 4, null);
        return m9454minusLRDsOJo;
    }
}
