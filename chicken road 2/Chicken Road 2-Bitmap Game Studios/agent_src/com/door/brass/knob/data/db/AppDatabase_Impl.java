package com.door.brass.knob.data.db;

import androidx.room.InvalidationTracker;
import androidx.room.ObservedTableStates;
import androidx.room.RoomOpenDelegate;
import androidx.room.RoomOpenDelegateMarker;
import androidx.room.TriggerBasedInvalidationTracker;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.door.brass.knob.data.db.AppDatabase_Impl;
import com.door.brass.knob.data.db.dao.ChallengeDao;
import com.door.brass.knob.data.db.dao.ChallengeDao_Impl;
import com.door.brass.knob.data.db.dao.ChallengeProgressDao;
import com.door.brass.knob.data.db.dao.ChallengeProgressDao_Impl;
import com.door.brass.knob.data.db.dao.DessertConfigDao;
import com.door.brass.knob.data.db.dao.DessertConfigDao_Impl;
import com.door.brass.knob.data.db.dao.MenuItemDao;
import com.door.brass.knob.data.db.dao.MenuItemDao_Impl;
import com.door.brass.knob.data.db.dao.TasteMarkDao;
import com.door.brass.knob.data.db.dao.TasteMarkDao_Impl;
import com.door.brass.knob.data.db.dao.TipDao;
import com.door.brass.knob.data.db.dao.TipDao_Impl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/door/brass/knob/data/db/AppDatabase_Impl;", "Lcom/door/brass/knob/data/db/AppDatabase;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {
    public final Lazy GiTAvmtrM6Bh8SJ;
    public final Lazy MRfxZSx8l5UG62U;
    public final Lazy NIabVTHf6LMJyXq;
    public final Lazy kSPEzfraxudm4i;
    public final Lazy uypNJrpDByoB;
    public final Lazy yRx9jbDCTnXb3;

    public AppDatabase_Impl() {
        final int i = 0;
        this.MRfxZSx8l5UG62U = LazyKt.hRNgd2zGCE5kj(new Function0(this) { // from class: nyjtcQGvI9u5
            public final /* synthetic */ AppDatabase_Impl b41X89IqSbKt;

            {
                this.b41X89IqSbKt = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object hRNgd2zGCE5kj() {
                int i2 = i;
                AppDatabase_Impl appDatabase_Impl = this.b41X89IqSbKt;
                switch (i2) {
                    case 0:
                        return new MenuItemDao_Impl(appDatabase_Impl);
                    case 1:
                        return new ChallengeDao_Impl(appDatabase_Impl);
                    case 2:
                        return new ChallengeProgressDao_Impl(appDatabase_Impl);
                    case 3:
                        return new TipDao_Impl(appDatabase_Impl);
                    case 4:
                        return new TasteMarkDao_Impl(appDatabase_Impl);
                    default:
                        return new DessertConfigDao_Impl(appDatabase_Impl);
                }
            }
        });
        final int i2 = 1;
        this.kSPEzfraxudm4i = LazyKt.hRNgd2zGCE5kj(new Function0(this) { // from class: nyjtcQGvI9u5
            public final /* synthetic */ AppDatabase_Impl b41X89IqSbKt;

            {
                this.b41X89IqSbKt = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object hRNgd2zGCE5kj() {
                int i22 = i2;
                AppDatabase_Impl appDatabase_Impl = this.b41X89IqSbKt;
                switch (i22) {
                    case 0:
                        return new MenuItemDao_Impl(appDatabase_Impl);
                    case 1:
                        return new ChallengeDao_Impl(appDatabase_Impl);
                    case 2:
                        return new ChallengeProgressDao_Impl(appDatabase_Impl);
                    case 3:
                        return new TipDao_Impl(appDatabase_Impl);
                    case 4:
                        return new TasteMarkDao_Impl(appDatabase_Impl);
                    default:
                        return new DessertConfigDao_Impl(appDatabase_Impl);
                }
            }
        });
        final int i3 = 2;
        this.uypNJrpDByoB = LazyKt.hRNgd2zGCE5kj(new Function0(this) { // from class: nyjtcQGvI9u5
            public final /* synthetic */ AppDatabase_Impl b41X89IqSbKt;

            {
                this.b41X89IqSbKt = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object hRNgd2zGCE5kj() {
                int i22 = i3;
                AppDatabase_Impl appDatabase_Impl = this.b41X89IqSbKt;
                switch (i22) {
                    case 0:
                        return new MenuItemDao_Impl(appDatabase_Impl);
                    case 1:
                        return new ChallengeDao_Impl(appDatabase_Impl);
                    case 2:
                        return new ChallengeProgressDao_Impl(appDatabase_Impl);
                    case 3:
                        return new TipDao_Impl(appDatabase_Impl);
                    case 4:
                        return new TasteMarkDao_Impl(appDatabase_Impl);
                    default:
                        return new DessertConfigDao_Impl(appDatabase_Impl);
                }
            }
        });
        final int i4 = 3;
        this.yRx9jbDCTnXb3 = LazyKt.hRNgd2zGCE5kj(new Function0(this) { // from class: nyjtcQGvI9u5
            public final /* synthetic */ AppDatabase_Impl b41X89IqSbKt;

            {
                this.b41X89IqSbKt = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object hRNgd2zGCE5kj() {
                int i22 = i4;
                AppDatabase_Impl appDatabase_Impl = this.b41X89IqSbKt;
                switch (i22) {
                    case 0:
                        return new MenuItemDao_Impl(appDatabase_Impl);
                    case 1:
                        return new ChallengeDao_Impl(appDatabase_Impl);
                    case 2:
                        return new ChallengeProgressDao_Impl(appDatabase_Impl);
                    case 3:
                        return new TipDao_Impl(appDatabase_Impl);
                    case 4:
                        return new TasteMarkDao_Impl(appDatabase_Impl);
                    default:
                        return new DessertConfigDao_Impl(appDatabase_Impl);
                }
            }
        });
        final int i5 = 4;
        this.NIabVTHf6LMJyXq = LazyKt.hRNgd2zGCE5kj(new Function0(this) { // from class: nyjtcQGvI9u5
            public final /* synthetic */ AppDatabase_Impl b41X89IqSbKt;

            {
                this.b41X89IqSbKt = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object hRNgd2zGCE5kj() {
                int i22 = i5;
                AppDatabase_Impl appDatabase_Impl = this.b41X89IqSbKt;
                switch (i22) {
                    case 0:
                        return new MenuItemDao_Impl(appDatabase_Impl);
                    case 1:
                        return new ChallengeDao_Impl(appDatabase_Impl);
                    case 2:
                        return new ChallengeProgressDao_Impl(appDatabase_Impl);
                    case 3:
                        return new TipDao_Impl(appDatabase_Impl);
                    case 4:
                        return new TasteMarkDao_Impl(appDatabase_Impl);
                    default:
                        return new DessertConfigDao_Impl(appDatabase_Impl);
                }
            }
        });
        final int i6 = 5;
        this.GiTAvmtrM6Bh8SJ = LazyKt.hRNgd2zGCE5kj(new Function0(this) { // from class: nyjtcQGvI9u5
            public final /* synthetic */ AppDatabase_Impl b41X89IqSbKt;

            {
                this.b41X89IqSbKt = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object hRNgd2zGCE5kj() {
                int i22 = i6;
                AppDatabase_Impl appDatabase_Impl = this.b41X89IqSbKt;
                switch (i22) {
                    case 0:
                        return new MenuItemDao_Impl(appDatabase_Impl);
                    case 1:
                        return new ChallengeDao_Impl(appDatabase_Impl);
                    case 2:
                        return new ChallengeProgressDao_Impl(appDatabase_Impl);
                    case 3:
                        return new TipDao_Impl(appDatabase_Impl);
                    case 4:
                        return new TasteMarkDao_Impl(appDatabase_Impl);
                    default:
                        return new DessertConfigDao_Impl(appDatabase_Impl);
                }
            }
        });
    }

    @Override // com.door.brass.knob.data.db.AppDatabase
    public final TipDao GiTAvmtrM6Bh8SJ() {
        return (TipDao) this.yRx9jbDCTnXb3.getValue();
    }

    @Override // com.door.brass.knob.data.db.AppDatabase
    public final ChallengeDao MRfxZSx8l5UG62U() {
        return (ChallengeDao) this.kSPEzfraxudm4i.getValue();
    }

    @Override // com.door.brass.knob.data.db.AppDatabase
    public final TasteMarkDao NIabVTHf6LMJyXq() {
        return (TasteMarkDao) this.NIabVTHf6LMJyXq.getValue();
    }

    @Override // androidx.room.RoomDatabase
    public final Set b41X89IqSbKt() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final LinkedHashMap gmXBnHsR2YSm() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ClassReference yzPsTade5rL7D3 = Reflection.yzPsTade5rL7D3(MenuItemDao.class);
        EmptyList emptyList = EmptyList.oyjLVtGms9eZwJ0;
        linkedHashMap.put(yzPsTade5rL7D3, emptyList);
        linkedHashMap.put(Reflection.yzPsTade5rL7D3(ChallengeDao.class), emptyList);
        linkedHashMap.put(Reflection.yzPsTade5rL7D3(ChallengeProgressDao.class), emptyList);
        linkedHashMap.put(Reflection.yzPsTade5rL7D3(TipDao.class), emptyList);
        linkedHashMap.put(Reflection.yzPsTade5rL7D3(TasteMarkDao.class), emptyList);
        linkedHashMap.put(Reflection.yzPsTade5rL7D3(DessertConfigDao.class), emptyList);
        return linkedHashMap;
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker hRNgd2zGCE5kj() {
        return new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "menu_items", "challenges", "challenge_progress_events", "tips", "taste_marks", "dessert_config");
    }

    @Override // com.door.brass.knob.data.db.AppDatabase
    public final ChallengeProgressDao kSPEzfraxudm4i() {
        return (ChallengeProgressDao) this.uypNJrpDByoB.getValue();
    }

    @Override // androidx.room.RoomDatabase
    public final RoomOpenDelegateMarker ra306ClFT3HT() {
        return new RoomOpenDelegate() { // from class: com.door.brass.knob.data.db.AppDatabase_Impl$createOpenDelegate$_openDelegate$1
            {
                super(2, "2d580712777bb942dba96361cc361aad", "4233fe43b6d934611db7f392e2c68578");
            }

            @Override // androidx.room.RoomOpenDelegate
            public final void b41X89IqSbKt(SQLiteConnection sQLiteConnection) {
                sQLiteConnection.getClass();
            }

            @Override // androidx.room.RoomOpenDelegate
            public final void gmXBnHsR2YSm(SQLiteConnection sQLiteConnection) {
                sQLiteConnection.getClass();
                ListBuilder o2t7oodqU1bUMaS = CollectionsKt.o2t7oodqU1bUMaS();
                SQLiteStatement rw91HsWWsh17Nm = sQLiteConnection.rw91HsWWsh17Nm("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (rw91HsWWsh17Nm.ainHcH9lkbxnI()) {
                    try {
                        o2t7oodqU1bUMaS.add(rw91HsWWsh17Nm.MCcLy95b8Awzmw(0));
                    } finally {
                    }
                }
                AutoCloseableKt.yzPsTade5rL7D3(rw91HsWWsh17Nm, null);
                ListIterator listIterator = CollectionsKt.yRx9jbDCTnXb3(o2t7oodqU1bUMaS).listIterator(0);
                while (listIterator.hasNext()) {
                    String str = (String) listIterator.next();
                    if (StringsKt.o4ticBN7g1K8jE(str, "room_fts_content_sync_", false)) {
                        SQLite.yzPsTade5rL7D3(sQLiteConnection, "DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
            }

            @Override // androidx.room.RoomOpenDelegate
            public final void hRNgd2zGCE5kj(SQLiteConnection sQLiteConnection) {
                sQLiteConnection.getClass();
                SQLite.yzPsTade5rL7D3(sQLiteConnection, "DROP TABLE IF EXISTS `menu_items`");
                SQLite.yzPsTade5rL7D3(sQLiteConnection, "DROP TABLE IF EXISTS `challenges`");
                SQLite.yzPsTade5rL7D3(sQLiteConnection, "DROP TABLE IF EXISTS `challenge_progress_events`");
                SQLite.yzPsTade5rL7D3(sQLiteConnection, "DROP TABLE IF EXISTS `tips`");
                SQLite.yzPsTade5rL7D3(sQLiteConnection, "DROP TABLE IF EXISTS `taste_marks`");
                SQLite.yzPsTade5rL7D3(sQLiteConnection, "DROP TABLE IF EXISTS `dessert_config`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public final RoomOpenDelegate.ValidationResult i7xAcZoXXiIt(SQLiteConnection sQLiteConnection) {
                sQLiteConnection.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                linkedHashMap.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
                linkedHashMap.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, 1));
                linkedHashMap.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, 1));
                linkedHashMap.put("ingredients", new TableInfo.Column("ingredients", "TEXT", false, 0, null, 1));
                linkedHashMap.put("sweetness", new TableInfo.Column("sweetness", "TEXT", true, 0, null, 1));
                linkedHashMap.put("texture", new TableInfo.Column("texture", "TEXT", true, 0, null, 1));
                linkedHashMap.put("tags", new TableInfo.Column("tags", "TEXT", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("menu_items", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
                TableInfo yzPsTade5rL7D3 = TableInfo.Companion.yzPsTade5rL7D3(sQLiteConnection, "menu_items");
                if (!tableInfo.equals(yzPsTade5rL7D3)) {
                    return new RoomOpenDelegate.ValidationResult("menu_items(com.door.brass.knob.data.db.entity.MenuItemEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + yzPsTade5rL7D3, false);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                linkedHashMap2.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("target_count", new TableInfo.Column("target_count", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("current_progress", new TableInfo.Column("current_progress", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("is_completed", new TableInfo.Column("is_completed", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("completed_at", new TableInfo.Column("completed_at", "INTEGER", false, 0, null, 1));
                TableInfo tableInfo2 = new TableInfo("challenges", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
                TableInfo yzPsTade5rL7D32 = TableInfo.Companion.yzPsTade5rL7D3(sQLiteConnection, "challenges");
                if (!tableInfo2.equals(yzPsTade5rL7D32)) {
                    return new RoomOpenDelegate.ValidationResult("challenges(com.door.brass.knob.data.db.entity.ChallengeEntity).\n Expected:\n" + tableInfo2 + "\n Found:\n" + yzPsTade5rL7D32, false);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                linkedHashMap3.put("challenge_id", new TableInfo.Column("challenge_id", "INTEGER", true, 0, null, 1));
                linkedHashMap3.put("event_key", new TableInfo.Column("event_key", "TEXT", true, 0, null, 1));
                linkedHashMap3.put("recorded_at", new TableInfo.Column("recorded_at", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("challenge_progress_events", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
                TableInfo yzPsTade5rL7D33 = TableInfo.Companion.yzPsTade5rL7D3(sQLiteConnection, "challenge_progress_events");
                if (!tableInfo3.equals(yzPsTade5rL7D33)) {
                    return new RoomOpenDelegate.ValidationResult("challenge_progress_events(com.door.brass.knob.data.db.entity.ChallengeProgressEventEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + yzPsTade5rL7D33, false);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                linkedHashMap4.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
                linkedHashMap4.put("content", new TableInfo.Column("content", "TEXT", true, 0, null, 1));
                linkedHashMap4.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, 1));
                linkedHashMap4.put("is_favorite", new TableInfo.Column("is_favorite", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo4 = new TableInfo("tips", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
                TableInfo yzPsTade5rL7D34 = TableInfo.Companion.yzPsTade5rL7D3(sQLiteConnection, "tips");
                if (!tableInfo4.equals(yzPsTade5rL7D34)) {
                    return new RoomOpenDelegate.ValidationResult("tips(com.door.brass.knob.data.db.entity.TipEntity).\n Expected:\n" + tableInfo4 + "\n Found:\n" + yzPsTade5rL7D34, false);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                linkedHashMap5.put("menu_item_id", new TableInfo.Column("menu_item_id", "INTEGER", true, 0, null, 1));
                linkedHashMap5.put("value", new TableInfo.Column("value", "TEXT", true, 0, null, 1));
                linkedHashMap5.put("label", new TableInfo.Column("label", "TEXT", true, 0, null, 1));
                linkedHashMap5.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new TableInfo.ForeignKey("menu_items", "CASCADE", "NO ACTION", CollectionsKt.o4ticBN7g1K8jE("menu_item_id"), CollectionsKt.o4ticBN7g1K8jE("id")));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new TableInfo.Index("index_taste_marks_menu_item_id", false, CollectionsKt.o4ticBN7g1K8jE("menu_item_id"), CollectionsKt.o4ticBN7g1K8jE("ASC")));
                TableInfo tableInfo5 = new TableInfo("taste_marks", linkedHashMap5, linkedHashSet, linkedHashSet2);
                TableInfo yzPsTade5rL7D35 = TableInfo.Companion.yzPsTade5rL7D3(sQLiteConnection, "taste_marks");
                if (!tableInfo5.equals(yzPsTade5rL7D35)) {
                    return new RoomOpenDelegate.ValidationResult("taste_marks(com.door.brass.knob.data.db.entity.TasteMarkEntity).\n Expected:\n" + tableInfo5 + "\n Found:\n" + yzPsTade5rL7D35, false);
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                linkedHashMap6.put("offer_url", new TableInfo.Column("offer_url", "TEXT", false, 0, null, 1));
                linkedHashMap6.put("shows_offer", new TableInfo.Column("shows_offer", "INTEGER", true, 0, null, 1));
                linkedHashMap6.put("is_zesty", new TableInfo.Column("is_zesty", "INTEGER", true, 0, null, 1));
                linkedHashMap6.put("has_meringue", new TableInfo.Column("has_meringue", "INTEGER", true, 0, null, 1));
                linkedHashMap6.put("is_seasonal", new TableInfo.Column("is_seasonal", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo6 = new TableInfo("dessert_config", linkedHashMap6, new LinkedHashSet(), new LinkedHashSet());
                TableInfo yzPsTade5rL7D36 = TableInfo.Companion.yzPsTade5rL7D3(sQLiteConnection, "dessert_config");
                if (tableInfo6.equals(yzPsTade5rL7D36)) {
                    return new RoomOpenDelegate.ValidationResult(null, true);
                }
                return new RoomOpenDelegate.ValidationResult("dessert_config(com.door.brass.knob.data.db.entity.DessertConfigEntity).\n Expected:\n" + tableInfo6 + "\n Found:\n" + yzPsTade5rL7D36, false);
            }

            @Override // androidx.room.RoomOpenDelegate
            public final void oyjLVtGms9eZwJ0(SQLiteConnection sQLiteConnection) {
                sQLiteConnection.getClass();
                SQLite.yzPsTade5rL7D3(sQLiteConnection, "PRAGMA foreign_keys = ON");
                InvalidationTracker oyjLVtGms9eZwJ0 = AppDatabase_Impl.this.oyjLVtGms9eZwJ0();
                TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = oyjLVtGms9eZwJ0.hRNgd2zGCE5kj;
                triggerBasedInvalidationTracker.getClass();
                SQLiteStatement rw91HsWWsh17Nm = sQLiteConnection.rw91HsWWsh17Nm("PRAGMA query_only");
                try {
                    rw91HsWWsh17Nm.ainHcH9lkbxnI();
                    boolean zP42naeF6vBe = rw91HsWWsh17Nm.zP42naeF6vBe();
                    AutoCloseableKt.yzPsTade5rL7D3(rw91HsWWsh17Nm, null);
                    if (!zP42naeF6vBe) {
                        SQLite.yzPsTade5rL7D3(sQLiteConnection, "PRAGMA temp_store = MEMORY");
                        SQLite.yzPsTade5rL7D3(sQLiteConnection, "PRAGMA recursive_triggers = 1");
                        SQLite.yzPsTade5rL7D3(sQLiteConnection, "DROP TABLE IF EXISTS room_table_modification_log");
                        if (triggerBasedInvalidationTracker.oyjLVtGms9eZwJ0) {
                            SQLite.yzPsTade5rL7D3(sQLiteConnection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                        } else {
                            SQLite.yzPsTade5rL7D3(sQLiteConnection, StringsKt.XrorSzThrtvJ4A("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                        }
                        ObservedTableStates observedTableStates = triggerBasedInvalidationTracker.Uo5pffGf8LUU;
                        ReentrantLock reentrantLock = observedTableStates.yzPsTade5rL7D3;
                        reentrantLock.lock();
                        try {
                            observedTableStates.oyjLVtGms9eZwJ0 = true;
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                    synchronized (oyjLVtGms9eZwJ0.i7xAcZoXXiIt) {
                    }
                } finally {
                }
            }

            @Override // androidx.room.RoomOpenDelegate
            public final void ra306ClFT3HT(SQLiteConnection sQLiteConnection) {
                sQLiteConnection.getClass();
            }

            @Override // androidx.room.RoomOpenDelegate
            public final void yzPsTade5rL7D3(SQLiteConnection sQLiteConnection) {
                sQLiteConnection.getClass();
                SQLite.yzPsTade5rL7D3(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `menu_items` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `category` TEXT NOT NULL, `description` TEXT NOT NULL, `ingredients` TEXT, `sweetness` TEXT NOT NULL, `texture` TEXT NOT NULL, `tags` TEXT NOT NULL)");
                SQLite.yzPsTade5rL7D3(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `challenges` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `category` TEXT NOT NULL, `target_count` INTEGER NOT NULL, `current_progress` INTEGER NOT NULL, `is_completed` INTEGER NOT NULL, `completed_at` INTEGER)");
                SQLite.yzPsTade5rL7D3(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `challenge_progress_events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `challenge_id` INTEGER NOT NULL, `event_key` TEXT NOT NULL, `recorded_at` INTEGER NOT NULL)");
                SQLite.yzPsTade5rL7D3(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `tips` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `content` TEXT NOT NULL, `category` TEXT NOT NULL, `is_favorite` INTEGER NOT NULL)");
                SQLite.yzPsTade5rL7D3(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `taste_marks` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `menu_item_id` INTEGER NOT NULL, `value` TEXT NOT NULL, `label` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, FOREIGN KEY(`menu_item_id`) REFERENCES `menu_items`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.yzPsTade5rL7D3(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_taste_marks_menu_item_id` ON `taste_marks` (`menu_item_id`)");
                SQLite.yzPsTade5rL7D3(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `dessert_config` (`id` INTEGER NOT NULL, `offer_url` TEXT, `shows_offer` INTEGER NOT NULL, `is_zesty` INTEGER NOT NULL, `has_meringue` INTEGER NOT NULL, `is_seasonal` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                SQLite.yzPsTade5rL7D3(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                SQLite.yzPsTade5rL7D3(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2d580712777bb942dba96361cc361aad')");
            }
        };
    }

    @Override // com.door.brass.knob.data.db.AppDatabase
    public final DessertConfigDao uypNJrpDByoB() {
        return (DessertConfigDao) this.GiTAvmtrM6Bh8SJ.getValue();
    }

    @Override // com.door.brass.knob.data.db.AppDatabase
    public final MenuItemDao yRx9jbDCTnXb3() {
        return (MenuItemDao) this.MRfxZSx8l5UG62U.getValue();
    }

    @Override // androidx.room.RoomDatabase
    public final List yzPsTade5rL7D3(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }
}
