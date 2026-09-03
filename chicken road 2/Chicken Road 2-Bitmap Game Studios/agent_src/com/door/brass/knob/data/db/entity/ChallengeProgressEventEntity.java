package com.door.brass.knob.data.db.entity;

import defpackage.OcGJUxcOVecQiKb;
import defpackage.j8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/data/db/entity/ChallengeProgressEventEntity;", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ChallengeProgressEventEntity {
    public final String hRNgd2zGCE5kj;
    public final long ra306ClFT3HT;
    public final long yzPsTade5rL7D3;

    public ChallengeProgressEventEntity(long j, String str, long j2) {
        str.getClass();
        this.yzPsTade5rL7D3 = j;
        this.hRNgd2zGCE5kj = str;
        this.ra306ClFT3HT = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeProgressEventEntity)) {
            return false;
        }
        ChallengeProgressEventEntity challengeProgressEventEntity = (ChallengeProgressEventEntity) obj;
        return this.yzPsTade5rL7D3 == challengeProgressEventEntity.yzPsTade5rL7D3 && Intrinsics.yzPsTade5rL7D3(this.hRNgd2zGCE5kj, challengeProgressEventEntity.hRNgd2zGCE5kj) && this.ra306ClFT3HT == challengeProgressEventEntity.ra306ClFT3HT;
    }

    public final int hashCode() {
        return Long.hashCode(this.ra306ClFT3HT) + j8.hRNgd2zGCE5kj(this.hRNgd2zGCE5kj, OcGJUxcOVecQiKb.ra306ClFT3HT(Long.hashCode(0L) * 31, 31, this.yzPsTade5rL7D3), 31);
    }

    public final String toString() {
        return "ChallengeProgressEventEntity(id=0, challengeId=" + this.yzPsTade5rL7D3 + ", eventKey=" + this.hRNgd2zGCE5kj + ", recordedAt=" + this.ra306ClFT3HT + ")";
    }
}
