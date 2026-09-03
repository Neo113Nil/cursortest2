package com.door.brass.knob.data.db.dao;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteStatement;
import com.door.brass.knob.data.db.entity.TipEntity;
import defpackage.K6HLhdE38aTVLa;
import defpackage.j7;
import defpackage.u3;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/door/brass/knob/data/db/dao/TipDao_Impl;", "Lcom/door/brass/knob/data/db/dao/TipDao;", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TipDao_Impl implements TipDao {
    public final AnonymousClass1 hRNgd2zGCE5kj = new AnonymousClass1();
    public final AnonymousClass2 ra306ClFT3HT = new AnonymousClass2();
    public final RoomDatabase yzPsTade5rL7D3;

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/door/brass/knob/data/db/dao/TipDao_Impl$1", "Landroidx/room/EntityInsertAdapter;", "Lcom/door/brass/knob/data/db/entity/TipEntity;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.door.brass.knob.data.db.dao.TipDao_Impl$1, reason: invalid class name */
    public final class AnonymousClass1 extends EntityInsertAdapter<TipEntity> {
        @Override // androidx.room.EntityInsertAdapter
        public final String hRNgd2zGCE5kj() {
            return "INSERT OR IGNORE INTO `tips` (`id`,`title`,`content`,`category`,`is_favorite`) VALUES (nullif(?, 0),?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public final void yzPsTade5rL7D3(SQLiteStatement sQLiteStatement, Object obj) {
            TipEntity tipEntity = (TipEntity) obj;
            sQLiteStatement.getClass();
            sQLiteStatement.i7xAcZoXXiIt(1, tipEntity.yzPsTade5rL7D3);
            sQLiteStatement.o2t7oodqU1bUMaS(tipEntity.hRNgd2zGCE5kj, 2);
            sQLiteStatement.o2t7oodqU1bUMaS(tipEntity.ra306ClFT3HT, 3);
            sQLiteStatement.o2t7oodqU1bUMaS(tipEntity.oyjLVtGms9eZwJ0, 4);
            sQLiteStatement.i7xAcZoXXiIt(5, tipEntity.b41X89IqSbKt ? 1L : 0L);
        }
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/door/brass/knob/data/db/dao/TipDao_Impl$2", "Landroidx/room/EntityDeleteOrUpdateAdapter;", "Lcom/door/brass/knob/data/db/entity/TipEntity;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.door.brass.knob.data.db.dao.TipDao_Impl$2, reason: invalid class name */
    public final class AnonymousClass2 extends EntityDeleteOrUpdateAdapter<TipEntity> {
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public final String hRNgd2zGCE5kj() {
            return "UPDATE OR ABORT `tips` SET `id` = ?,`title` = ?,`content` = ?,`category` = ?,`is_favorite` = ? WHERE `id` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public final void yzPsTade5rL7D3(SQLiteStatement sQLiteStatement, Object obj) {
            TipEntity tipEntity = (TipEntity) obj;
            sQLiteStatement.getClass();
            long j = tipEntity.yzPsTade5rL7D3;
            sQLiteStatement.i7xAcZoXXiIt(1, j);
            sQLiteStatement.o2t7oodqU1bUMaS(tipEntity.hRNgd2zGCE5kj, 2);
            sQLiteStatement.o2t7oodqU1bUMaS(tipEntity.ra306ClFT3HT, 3);
            sQLiteStatement.o2t7oodqU1bUMaS(tipEntity.oyjLVtGms9eZwJ0, 4);
            sQLiteStatement.i7xAcZoXXiIt(5, tipEntity.b41X89IqSbKt ? 1L : 0L);
            sQLiteStatement.i7xAcZoXXiIt(6, j);
        }
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/data/db/dao/TipDao_Impl$Companion;", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    public TipDao_Impl(RoomDatabase roomDatabase) {
        this.yzPsTade5rL7D3 = roomDatabase;
    }

    @Override // com.door.brass.knob.data.db.dao.TipDao
    public final FlowUtil$createFlow$$inlined$map$1 getAll() {
        j7 j7Var = new j7(13);
        return FlowUtil.yzPsTade5rL7D3(this.yzPsTade5rL7D3, new String[]{"tips"}, j7Var);
    }

    @Override // com.door.brass.knob.data.db.dao.TipDao
    public final Object hRNgd2zGCE5kj(List list, Continuation continuation) {
        Object hRNgd2zGCE5kj = DBUtil.hRNgd2zGCE5kj(this.yzPsTade5rL7D3, continuation, new u3(15, this, list), false, true);
        return hRNgd2zGCE5kj == CoroutineSingletons.oyjLVtGms9eZwJ0 ? hRNgd2zGCE5kj : Unit.yzPsTade5rL7D3;
    }

    @Override // com.door.brass.knob.data.db.dao.TipDao
    public final Object oyjLVtGms9eZwJ0(TipEntity tipEntity, Continuation continuation) {
        Object hRNgd2zGCE5kj = DBUtil.hRNgd2zGCE5kj(this.yzPsTade5rL7D3, continuation, new u3(14, this, tipEntity), false, true);
        return hRNgd2zGCE5kj == CoroutineSingletons.oyjLVtGms9eZwJ0 ? hRNgd2zGCE5kj : Unit.yzPsTade5rL7D3;
    }

    @Override // com.door.brass.knob.data.db.dao.TipDao
    public final Object ra306ClFT3HT(long j, Continuation continuation) {
        return DBUtil.hRNgd2zGCE5kj(this.yzPsTade5rL7D3, continuation, new K6HLhdE38aTVLa(8, j), true, false);
    }

    @Override // com.door.brass.knob.data.db.dao.TipDao
    public final Object yzPsTade5rL7D3(Continuation continuation) {
        return DBUtil.hRNgd2zGCE5kj(this.yzPsTade5rL7D3, continuation, new j7(12), true, false);
    }
}
