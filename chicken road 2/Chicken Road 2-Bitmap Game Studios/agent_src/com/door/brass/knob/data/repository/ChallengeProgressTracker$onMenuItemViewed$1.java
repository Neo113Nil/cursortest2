package com.door.brass.knob.data.repository;

import com.door.brass.knob.data.db.entity.ChallengeEntity;
import com.door.brass.knob.data.db.entity.MenuItemEntity;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.door.brass.knob.data.repository.ChallengeProgressTracker", f = "ChallengeProgressTracker.kt", l = {18, 25, 26, 29}, m = "onMenuItemViewed", v = 2)
/* loaded from: classes.dex */
final class ChallengeProgressTracker$onMenuItemViewed$1 extends ContinuationImpl {
    public ChallengeEntity FsuUJlzzWhYnMlD;
    public int MRfxZSx8l5UG62U;
    public int NIabVTHf6LMJyXq;
    public Object UEutaskTsxaI;
    public Iterator Uo5pffGf8LUU;
    public MenuItemEntity i7xAcZoXXiIt;
    public int kSPEzfraxudm4i;
    public /* synthetic */ Object uypNJrpDByoB;
    public final /* synthetic */ ChallengeProgressTracker yRx9jbDCTnXb3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeProgressTracker$onMenuItemViewed$1(ChallengeProgressTracker challengeProgressTracker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.yRx9jbDCTnXb3 = challengeProgressTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object AGl7HBCQ8xrHABq(Object obj) {
        this.uypNJrpDByoB = obj;
        this.NIabVTHf6LMJyXq |= Integer.MIN_VALUE;
        return this.yRx9jbDCTnXb3.yzPsTade5rL7D3(null, this);
    }
}
