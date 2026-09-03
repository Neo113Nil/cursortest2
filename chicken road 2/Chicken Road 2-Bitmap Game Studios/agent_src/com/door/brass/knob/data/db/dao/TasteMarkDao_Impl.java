package com.door.brass.knob.data.db.dao;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import androidx.sqlite.SQLiteStatement;
import com.door.brass.knob.data.db.entity.TasteMarkEntity;
import defpackage.K6HLhdE38aTVLa;
import kotlin.Metadata;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/door/brass/knob/data/db/dao/TasteMarkDao_Impl;", "Lcom/door/brass/knob/data/db/dao/TasteMarkDao;", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TasteMarkDao_Impl implements TasteMarkDao {
    public final RoomDatabase yzPsTade5rL7D3;

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/door/brass/knob/data/db/dao/TasteMarkDao_Impl$1", "Landroidx/room/EntityInsertAdapter;", "Lcom/door/brass/knob/data/db/entity/TasteMarkEntity;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.door.brass.knob.data.db.dao.TasteMarkDao_Impl$1, reason: invalid class name */
    public final class AnonymousClass1 extends EntityInsertAdapter<TasteMarkEntity> {
        @Override // androidx.room.EntityInsertAdapter
        public final String hRNgd2zGCE5kj() {
            return "INSERT OR REPLACE INTO `taste_marks` (`id`,`menu_item_id`,`value`,`label`,`timestamp`) VALUES (nullif(?, 0),?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public final void yzPsTade5rL7D3(SQLiteStatement sQLiteStatement, Object obj) {
            TasteMarkEntity tasteMarkEntity = (TasteMarkEntity) obj;
            sQLiteStatement.getClass();
            sQLiteStatement.i7xAcZoXXiIt(1, tasteMarkEntity.yzPsTade5rL7D3);
            sQLiteStatement.i7xAcZoXXiIt(2, tasteMarkEntity.hRNgd2zGCE5kj);
            sQLiteStatement.o2t7oodqU1bUMaS(tasteMarkEntity.ra306ClFT3HT, 3);
            sQLiteStatement.o2t7oodqU1bUMaS(tasteMarkEntity.oyjLVtGms9eZwJ0, 4);
            sQLiteStatement.i7xAcZoXXiIt(5, tasteMarkEntity.b41X89IqSbKt);
        }
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/door/brass/knob/data/db/dao/TasteMarkDao_Impl$2", "Landroidx/room/EntityDeleteOrUpdateAdapter;", "Lcom/door/brass/knob/data/db/entity/TasteMarkEntity;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.door.brass.knob.data.db.dao.TasteMarkDao_Impl$2, reason: invalid class name */
    public final class AnonymousClass2 extends EntityDeleteOrUpdateAdapter<TasteMarkEntity> {
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public final String hRNgd2zGCE5kj() {
            return "DELETE FROM `taste_marks` WHERE `id` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public final void yzPsTade5rL7D3(SQLiteStatement sQLiteStatement, Object obj) {
            sQLiteStatement.getClass();
            sQLiteStatement.i7xAcZoXXiIt(1, ((TasteMarkEntity) obj).yzPsTade5rL7D3);
        }
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/data/db/dao/TasteMarkDao_Impl$Companion;", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    public TasteMarkDao_Impl(RoomDatabase roomDatabase) {
        this.yzPsTade5rL7D3 = roomDatabase;
    }

    @Override // com.door.brass.knob.data.db.dao.TasteMarkDao
    public final FlowUtil$createFlow$$inlined$map$1 yzPsTade5rL7D3(long j) {
        K6HLhdE38aTVLa k6HLhdE38aTVLa = new K6HLhdE38aTVLa(7, j);
        return FlowUtil.yzPsTade5rL7D3(this.yzPsTade5rL7D3, new String[]{"taste_marks"}, k6HLhdE38aTVLa);
    }
}
