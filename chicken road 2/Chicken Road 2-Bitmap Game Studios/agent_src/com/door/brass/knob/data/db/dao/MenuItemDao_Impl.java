package com.door.brass.knob.data.db.dao;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteStatement;
import com.door.brass.knob.data.db.entity.MenuItemEntity;
import defpackage.K6HLhdE38aTVLa;
import defpackage.l3;
import defpackage.ra306ClFT3HT;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/door/brass/knob/data/db/dao/MenuItemDao_Impl;", "Lcom/door/brass/knob/data/db/dao/MenuItemDao;", "Companion", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MenuItemDao_Impl implements MenuItemDao {
    public final AnonymousClass1 hRNgd2zGCE5kj = new AnonymousClass1();
    public final RoomDatabase yzPsTade5rL7D3;

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/door/brass/knob/data/db/dao/MenuItemDao_Impl$1", "Landroidx/room/EntityInsertAdapter;", "Lcom/door/brass/knob/data/db/entity/MenuItemEntity;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.door.brass.knob.data.db.dao.MenuItemDao_Impl$1, reason: invalid class name */
    public final class AnonymousClass1 extends EntityInsertAdapter<MenuItemEntity> {
        @Override // androidx.room.EntityInsertAdapter
        public final String hRNgd2zGCE5kj() {
            return "INSERT OR IGNORE INTO `menu_items` (`id`,`name`,`category`,`description`,`ingredients`,`sweetness`,`texture`,`tags`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public final void yzPsTade5rL7D3(SQLiteStatement sQLiteStatement, Object obj) {
            MenuItemEntity menuItemEntity = (MenuItemEntity) obj;
            sQLiteStatement.getClass();
            sQLiteStatement.i7xAcZoXXiIt(1, menuItemEntity.yzPsTade5rL7D3);
            sQLiteStatement.o2t7oodqU1bUMaS(menuItemEntity.hRNgd2zGCE5kj, 2);
            sQLiteStatement.o2t7oodqU1bUMaS(menuItemEntity.ra306ClFT3HT, 3);
            sQLiteStatement.o2t7oodqU1bUMaS(menuItemEntity.oyjLVtGms9eZwJ0, 4);
            String str = menuItemEntity.b41X89IqSbKt;
            if (str == null) {
                sQLiteStatement.ra306ClFT3HT(5);
            } else {
                sQLiteStatement.o2t7oodqU1bUMaS(str, 5);
            }
            sQLiteStatement.o2t7oodqU1bUMaS(menuItemEntity.gmXBnHsR2YSm, 6);
            sQLiteStatement.o2t7oodqU1bUMaS(menuItemEntity.i7xAcZoXXiIt, 7);
            sQLiteStatement.o2t7oodqU1bUMaS(menuItemEntity.Uo5pffGf8LUU, 8);
        }
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/door/brass/knob/data/db/dao/MenuItemDao_Impl$2", "Landroidx/room/EntityInsertAdapter;", "Lcom/door/brass/knob/data/db/entity/MenuItemEntity;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.door.brass.knob.data.db.dao.MenuItemDao_Impl$2, reason: invalid class name */
    public final class AnonymousClass2 extends EntityInsertAdapter<MenuItemEntity> {
        @Override // androidx.room.EntityInsertAdapter
        public final String hRNgd2zGCE5kj() {
            return "INSERT OR REPLACE INTO `menu_items` (`id`,`name`,`category`,`description`,`ingredients`,`sweetness`,`texture`,`tags`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertAdapter
        public final void yzPsTade5rL7D3(SQLiteStatement sQLiteStatement, Object obj) {
            MenuItemEntity menuItemEntity = (MenuItemEntity) obj;
            sQLiteStatement.getClass();
            sQLiteStatement.i7xAcZoXXiIt(1, menuItemEntity.yzPsTade5rL7D3);
            sQLiteStatement.o2t7oodqU1bUMaS(menuItemEntity.hRNgd2zGCE5kj, 2);
            sQLiteStatement.o2t7oodqU1bUMaS(menuItemEntity.ra306ClFT3HT, 3);
            sQLiteStatement.o2t7oodqU1bUMaS(menuItemEntity.oyjLVtGms9eZwJ0, 4);
            String str = menuItemEntity.b41X89IqSbKt;
            if (str == null) {
                sQLiteStatement.ra306ClFT3HT(5);
            } else {
                sQLiteStatement.o2t7oodqU1bUMaS(str, 5);
            }
            sQLiteStatement.o2t7oodqU1bUMaS(menuItemEntity.gmXBnHsR2YSm, 6);
            sQLiteStatement.o2t7oodqU1bUMaS(menuItemEntity.i7xAcZoXXiIt, 7);
            sQLiteStatement.o2t7oodqU1bUMaS(menuItemEntity.Uo5pffGf8LUU, 8);
        }
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/door/brass/knob/data/db/dao/MenuItemDao_Impl$3", "Landroidx/room/EntityDeleteOrUpdateAdapter;", "Lcom/door/brass/knob/data/db/entity/MenuItemEntity;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.door.brass.knob.data.db.dao.MenuItemDao_Impl$3, reason: invalid class name */
    public final class AnonymousClass3 extends EntityDeleteOrUpdateAdapter<MenuItemEntity> {
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public final String hRNgd2zGCE5kj() {
            return "DELETE FROM `menu_items` WHERE `id` = ?";
        }

        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public final void yzPsTade5rL7D3(SQLiteStatement sQLiteStatement, Object obj) {
            sQLiteStatement.getClass();
            sQLiteStatement.i7xAcZoXXiIt(1, ((MenuItemEntity) obj).yzPsTade5rL7D3);
        }
    }

    /* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/door/brass/knob/data/db/dao/MenuItemDao_Impl$Companion;", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
    }

    public MenuItemDao_Impl(RoomDatabase roomDatabase) {
        this.yzPsTade5rL7D3 = roomDatabase;
    }

    @Override // com.door.brass.knob.data.db.dao.MenuItemDao
    public final FlowUtil$createFlow$$inlined$map$1 getAll() {
        l3 l3Var = new l3(3);
        return FlowUtil.yzPsTade5rL7D3(this.yzPsTade5rL7D3, new String[]{"menu_items"}, l3Var);
    }

    @Override // com.door.brass.knob.data.db.dao.MenuItemDao
    public final Object hRNgd2zGCE5kj(List list, Continuation continuation) {
        Object hRNgd2zGCE5kj = DBUtil.hRNgd2zGCE5kj(this.yzPsTade5rL7D3, continuation, new ra306ClFT3HT(28, this, list), false, true);
        return hRNgd2zGCE5kj == CoroutineSingletons.oyjLVtGms9eZwJ0 ? hRNgd2zGCE5kj : Unit.yzPsTade5rL7D3;
    }

    @Override // com.door.brass.knob.data.db.dao.MenuItemDao
    public final Object ra306ClFT3HT(long j, Continuation continuation) {
        return DBUtil.hRNgd2zGCE5kj(this.yzPsTade5rL7D3, continuation, new K6HLhdE38aTVLa(5, j), true, false);
    }

    @Override // com.door.brass.knob.data.db.dao.MenuItemDao
    public final Object yzPsTade5rL7D3(Continuation continuation) {
        return DBUtil.hRNgd2zGCE5kj(this.yzPsTade5rL7D3, continuation, new l3(2), true, false);
    }
}
