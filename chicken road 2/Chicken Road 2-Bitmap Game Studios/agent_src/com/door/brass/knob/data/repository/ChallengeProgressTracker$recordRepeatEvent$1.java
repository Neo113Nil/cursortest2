package com.door.brass.knob.data.repository;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.door.brass.knob.data.repository.ChallengeProgressTracker", f = "ChallengeProgressTracker.kt", l = {47}, m = "recordRepeatEvent", v = 2)
/* loaded from: classes.dex */
final class ChallengeProgressTracker$recordRepeatEvent$1 extends ContinuationImpl {
    public int FsuUJlzzWhYnMlD;
    public final /* synthetic */ ChallengeProgressTracker Uo5pffGf8LUU;
    public /* synthetic */ Object i7xAcZoXXiIt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeProgressTracker$recordRepeatEvent$1(ChallengeProgressTracker challengeProgressTracker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.Uo5pffGf8LUU = challengeProgressTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object AGl7HBCQ8xrHABq(Object obj) {
        this.i7xAcZoXXiIt = obj;
        this.FsuUJlzzWhYnMlD |= Integer.MIN_VALUE;
        Map map = ChallengeProgressTracker.ra306ClFT3HT;
        return this.Uo5pffGf8LUU.hRNgd2zGCE5kj(0L, null, this);
    }
}
