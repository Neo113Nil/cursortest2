package com.moloco.sdk.internal.publisher;

import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes7.dex */
public interface s {

    public static final class a {
        public static void a(s sVar, long j, long j2) {
            sVar.mo7562setCreateAdObjectDurationLRDsOJo(DurationKt.toDuration(j2 - j, DurationUnit.MILLISECONDS));
        }
    }

    void a(long j, long j2);

    /* renamed from: getCreateAdObjectDuration-UwyO8pc */
    long mo7561getCreateAdObjectDurationUwyO8pc();

    /* renamed from: setCreateAdObjectDuration-LRDsOJo */
    void mo7562setCreateAdObjectDurationLRDsOJo(long j);
}
