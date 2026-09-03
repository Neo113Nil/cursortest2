package com.door.brass.knob.data.db.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteStatement;
import com.door.brass.knob.data.db.entity.ChallengeProgressEventEntity;
import defpackage.K6HLhdE38aTVLa;
import defpackage.d;
import defpackage.ra306ClFT3HT;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/door/brass/knob/data/db/dao/ChallengeProgressDao_Impl;", "Lcom/door/brass/knob/data/db/dao/ChallengeProgressDao;", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChallengeProgressDao_Impl implements ChallengeProgressDao {
    public final AnonymousClass1 hRNgd2zGCE5kj = new AnonymousClass1();
    public final RoomDatabase yzPsTade5rL7D3;

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/door/brass/knob/data/db/dao/ChallengeProgressDao_Impl$1", "Landroidx/room/EntityInsertAdapter;", "Lcom/door/brass/knob/data/db/entity/ChallengeProgressEventEntity;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.door.brass.knob.data.db.dao.ChallengeProgressDao_Impl$1, reason: invalid class name */
    public final class AnonymousClass1 extends EntityInsertAdapter<ChallengeProgressEventEntity> {
        @Override // androidx.room.EntityInsertAdapter
        public final String hRNgd2zGCE5kj() {
            return "INSERT OR ABORT INTO `challenge_progress_events` (`id`,`challenge_id`,`event_key`,`recorded_at`) VALUES (nullif(?, 0),?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public final void yzPsTade5rL7D3(SQLiteStatement sQLiteStatement, Object obj) {
            ChallengeProgressEventEntity challengeProgressEventEntity = (ChallengeProgressEventEntity) obj;
            sQLiteStatement.getClass();
            sQLiteStatement.i7xAcZoXXiIt(1, 0L);
            sQLiteStatement.i7xAcZoXXiIt(2, challengeProgressEventEntity.yzPsTade5rL7D3);
            sQLiteStatement.o2t7oodqU1bUMaS(challengeProgressEventEntity.hRNgd2zGCE5kj, 3);
            sQLiteStatement.i7xAcZoXXiIt(4, challengeProgressEventEntity.ra306ClFT3HT);
        }
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/data/db/dao/ChallengeProgressDao_Impl$Companion;", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    public ChallengeProgressDao_Impl(RoomDatabase roomDatabase) {
        this.yzPsTade5rL7D3 = roomDatabase;
    }

    @Override // com.door.brass.knob.data.db.dao.ChallengeProgressDao
    public final Object hRNgd2zGCE5kj(long j, String str, Continuation continuation) {
        return DBUtil.hRNgd2zGCE5kj(this.yzPsTade5rL7D3, continuation, new d(0, j, str), true, false);
    }

    @Override // com.door.brass.knob.data.db.dao.ChallengeProgressDao
    public final Object oyjLVtGms9eZwJ0(long j, Continuation continuation) {
        return DBUtil.hRNgd2zGCE5kj(this.yzPsTade5rL7D3, continuation, new K6HLhdE38aTVLa(3, j), true, false);
    }

    @Override // com.door.brass.knob.data.db.dao.ChallengeProgressDao
    public final Object ra306ClFT3HT(long j, Continuation continuation) {
        return DBUtil.hRNgd2zGCE5kj(this.yzPsTade5rL7D3, continuation, new K6HLhdE38aTVLa(2, j), true, false);
    }

    @Override // com.door.brass.knob.data.db.dao.ChallengeProgressDao
    public final Object yzPsTade5rL7D3(ChallengeProgressEventEntity challengeProgressEventEntity, ContinuationImpl continuationImpl) {
        Object hRNgd2zGCE5kj = DBUtil.hRNgd2zGCE5kj(this.yzPsTade5rL7D3, continuationImpl, new ra306ClFT3HT(9, this, challengeProgressEventEntity), false, true);
        return hRNgd2zGCE5kj == CoroutineSingletons.oyjLVtGms9eZwJ0 ? hRNgd2zGCE5kj : Unit.yzPsTade5rL7D3;
    }
}
