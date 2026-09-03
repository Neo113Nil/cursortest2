package com.door.brass.knob.data.repository;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.door.brass.knob.data.repository.ChallengeProgressTracker", f = "ChallengeProgressTracker.kt", l = {35, 36}, m = "recordUniqueEvent", v = 2)
/* loaded from: classes.dex */
final class ChallengeProgressTracker$recordUniqueEvent$1 extends ContinuationImpl {
    public /* synthetic */ Object FsuUJlzzWhYnMlD;
    public int MRfxZSx8l5UG62U;
    public final /* synthetic */ ChallengeProgressTracker UEutaskTsxaI;
    public String Uo5pffGf8LUU;
    public long i7xAcZoXXiIt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeProgressTracker$recordUniqueEvent$1(ChallengeProgressTracker challengeProgressTracker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.UEutaskTsxaI = challengeProgressTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object AGl7HBCQ8xrHABq(Object obj) {
        this.FsuUJlzzWhYnMlD = obj;
        this.MRfxZSx8l5UG62U |= Integer.MIN_VALUE;
        Map map = ChallengeProgressTracker.ra306ClFT3HT;
        return this.UEutaskTsxaI.ra306ClFT3HT(0L, null, this);
    }
}
