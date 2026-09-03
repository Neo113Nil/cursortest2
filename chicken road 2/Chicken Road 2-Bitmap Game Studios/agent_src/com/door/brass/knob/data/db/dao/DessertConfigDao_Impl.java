package com.door.brass.knob.data.db.dao;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteStatement;
import com.door.brass.knob.data.db.entity.DessertConfigEntity;
import defpackage.e;
import defpackage.ra306ClFT3HT;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/door/brass/knob/data/db/dao/DessertConfigDao_Impl;", "Lcom/door/brass/knob/data/db/dao/DessertConfigDao;", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DessertConfigDao_Impl implements DessertConfigDao {
    public final AnonymousClass1 hRNgd2zGCE5kj = new AnonymousClass1();
    public final RoomDatabase yzPsTade5rL7D3;

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/door/brass/knob/data/db/dao/DessertConfigDao_Impl$1", "Landroidx/room/EntityInsertAdapter;", "Lcom/door/brass/knob/data/db/entity/DessertConfigEntity;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.door.brass.knob.data.db.dao.DessertConfigDao_Impl$1, reason: invalid class name */
    public final class AnonymousClass1 extends EntityInsertAdapter<DessertConfigEntity> {
        @Override // androidx.room.EntityInsertAdapter
        public final String hRNgd2zGCE5kj() {
            return "INSERT OR REPLACE INTO `dessert_config` (`id`,`offer_url`,`shows_offer`,`is_zesty`,`has_meringue`,`is_seasonal`) VALUES (?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public final void yzPsTade5rL7D3(SQLiteStatement sQLiteStatement, Object obj) {
            DessertConfigEntity dessertConfigEntity = (DessertConfigEntity) obj;
            sQLiteStatement.getClass();
            sQLiteStatement.i7xAcZoXXiIt(1, dessertConfigEntity.yzPsTade5rL7D3);
            String str = dessertConfigEntity.hRNgd2zGCE5kj;
            if (str == null) {
                sQLiteStatement.ra306ClFT3HT(2);
            } else {
                sQLiteStatement.o2t7oodqU1bUMaS(str, 2);
            }
            sQLiteStatement.i7xAcZoXXiIt(3, dessertConfigEntity.ra306ClFT3HT ? 1L : 0L);
            sQLiteStatement.i7xAcZoXXiIt(4, dessertConfigEntity.oyjLVtGms9eZwJ0 ? 1L : 0L);
            sQLiteStatement.i7xAcZoXXiIt(5, dessertConfigEntity.b41X89IqSbKt ? 1L : 0L);
            sQLiteStatement.i7xAcZoXXiIt(6, dessertConfigEntity.gmXBnHsR2YSm ? 1L : 0L);
        }
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/data/db/dao/DessertConfigDao_Impl$Companion;", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    public DessertConfigDao_Impl(RoomDatabase roomDatabase) {
        this.yzPsTade5rL7D3 = roomDatabase;
    }

    @Override // com.door.brass.knob.data.db.dao.DessertConfigDao
    public final Object hRNgd2zGCE5kj(DessertConfigEntity dessertConfigEntity, Continuation continuation) {
        Object hRNgd2zGCE5kj = DBUtil.hRNgd2zGCE5kj(this.yzPsTade5rL7D3, continuation, new ra306ClFT3HT(15, this, dessertConfigEntity), false, true);
        return hRNgd2zGCE5kj == CoroutineSingletons.oyjLVtGms9eZwJ0 ? hRNgd2zGCE5kj : Unit.yzPsTade5rL7D3;
    }

    @Override // com.door.brass.knob.data.db.dao.DessertConfigDao
    public final Object yzPsTade5rL7D3(Continuation continuation) {
        return DBUtil.hRNgd2zGCE5kj(this.yzPsTade5rL7D3, continuation, new e(12), true, false);
    }
}
