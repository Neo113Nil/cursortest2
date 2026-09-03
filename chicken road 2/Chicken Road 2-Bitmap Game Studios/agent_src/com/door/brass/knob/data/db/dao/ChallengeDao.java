package com.door.brass.knob.data.db.dao;

import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import com.door.brass.knob.data.db.entity.ChallengeEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/door/brass/knob/data/db/dao/ChallengeDao;", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ChallengeDao {
    Object b41X89IqSbKt(ChallengeEntity challengeEntity, ContinuationImpl continuationImpl);

    FlowUtil$createFlow$$inlined$map$1 getAll();

    Object hRNgd2zGCE5kj(List list, Continuation continuation);

    Object oyjLVtGms9eZwJ0(Continuation continuation);

    Object ra306ClFT3HT(long j, Continuation continuation);

    Object yzPsTade5rL7D3(Continuation continuation);
}
