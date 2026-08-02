package androidx.work.impl.model;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.runtime.J;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkRequestCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlinx.coroutines.flow.InterfaceC1060e;

/* loaded from: classes3.dex */
public final class RawWorkInfoDao_Impl implements RawWorkInfoDao {
    private final RoomDatabase __db;

    public RawWorkInfoDao_Impl(@NonNull RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkProgressAsandroidxWorkData(@NonNull HashMap<String, ArrayList<Data>> hashMap) {
        Set<String> keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            RelationUtil.recursiveFetchHashMap(hashMap, true, new a(this, 0));
            return;
        }
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        Iterator<String> it = keySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            acquire.bindString(i, it.next());
            i++;
        }
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(query, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (query.moveToNext()) {
                ArrayList<Data> arrayList = hashMap.get(query.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(Data.fromByteArray(query.getBlob(0)));
                }
            }
        } finally {
            query.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkTagAsjavaLangString(@NonNull HashMap<String, ArrayList<String>> hashMap) {
        Set<String> keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            RelationUtil.recursiveFetchHashMap(hashMap, true, new J(this, 1));
            return;
        }
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        Iterator<String> it = keySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            acquire.bindString(i, it.next());
            i++;
        }
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(query, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (query.moveToNext()) {
                ArrayList<String> arrayList = hashMap.get(query.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(query.getString(0));
                }
            }
        } finally {
            query.close();
        }
    }

    @NonNull
    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$__fetchRelationshipWorkProgressAsandroidxWorkData$1(HashMap hashMap) {
        __fetchRelationshipWorkProgressAsandroidxWorkData(hashMap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$__fetchRelationshipWorkTagAsjavaLangString$0(HashMap hashMap) {
        __fetchRelationshipWorkTagAsjavaLangString(hashMap);
        return Unit.INSTANCE;
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(SupportSQLiteQuery supportSQLiteQuery) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, supportSQLiteQuery, true, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(query, "id");
            int columnIndex2 = CursorUtil.getColumnIndex(query, "state");
            int columnIndex3 = CursorUtil.getColumnIndex(query, "output");
            int columnIndex4 = CursorUtil.getColumnIndex(query, "initial_delay");
            int columnIndex5 = CursorUtil.getColumnIndex(query, "interval_duration");
            int columnIndex6 = CursorUtil.getColumnIndex(query, "flex_duration");
            int columnIndex7 = CursorUtil.getColumnIndex(query, "run_attempt_count");
            int columnIndex8 = CursorUtil.getColumnIndex(query, "backoff_policy");
            int columnIndex9 = CursorUtil.getColumnIndex(query, "backoff_delay_duration");
            int columnIndex10 = CursorUtil.getColumnIndex(query, "last_enqueue_time");
            int columnIndex11 = CursorUtil.getColumnIndex(query, "period_count");
            int columnIndex12 = CursorUtil.getColumnIndex(query, "generation");
            int columnIndex13 = CursorUtil.getColumnIndex(query, "next_schedule_time_override");
            int columnIndex14 = CursorUtil.getColumnIndex(query, "stop_reason");
            int columnIndex15 = CursorUtil.getColumnIndex(query, "required_network_type");
            int columnIndex16 = CursorUtil.getColumnIndex(query, "required_network_request");
            int columnIndex17 = CursorUtil.getColumnIndex(query, "requires_charging");
            int columnIndex18 = CursorUtil.getColumnIndex(query, "requires_device_idle");
            int columnIndex19 = CursorUtil.getColumnIndex(query, "requires_battery_not_low");
            int columnIndex20 = CursorUtil.getColumnIndex(query, "requires_storage_not_low");
            int columnIndex21 = CursorUtil.getColumnIndex(query, "trigger_content_update_delay");
            int columnIndex22 = CursorUtil.getColumnIndex(query, "trigger_max_content_delay");
            int columnIndex23 = CursorUtil.getColumnIndex(query, "content_uri_triggers");
            HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
            int i2 = columnIndex13;
            HashMap<String, ArrayList<Data>> hashMap2 = new HashMap<>();
            while (query.moveToNext()) {
                int i3 = columnIndex12;
                String string = query.getString(columnIndex);
                if (hashMap.containsKey(string)) {
                    i = columnIndex11;
                } else {
                    i = columnIndex11;
                    hashMap.put(string, new ArrayList<>());
                }
                String string2 = query.getString(columnIndex);
                if (!hashMap2.containsKey(string2)) {
                    hashMap2.put(string2, new ArrayList<>());
                }
                columnIndex12 = i3;
                columnIndex11 = i;
            }
            int i4 = columnIndex11;
            int i5 = columnIndex12;
            query.moveToPosition(-1);
            __fetchRelationshipWorkTagAsjavaLangString(hashMap);
            __fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                String string3 = columnIndex == -1 ? null : query.getString(columnIndex);
                WorkInfo.State intToState = columnIndex2 == -1 ? null : WorkTypeConverters.intToState(query.getInt(columnIndex2));
                Data fromByteArray = columnIndex3 == -1 ? null : Data.fromByteArray(query.getBlob(columnIndex3));
                long j = columnIndex4 == -1 ? 0L : query.getLong(columnIndex4);
                long j2 = columnIndex5 == -1 ? 0L : query.getLong(columnIndex5);
                long j3 = columnIndex6 == -1 ? 0L : query.getLong(columnIndex6);
                boolean z4 = false;
                int i6 = columnIndex7 == -1 ? 0 : query.getInt(columnIndex7);
                BackoffPolicy intToBackoffPolicy = columnIndex8 == -1 ? null : WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndex8));
                long j4 = columnIndex9 == -1 ? 0L : query.getLong(columnIndex9);
                long j5 = columnIndex10 == -1 ? 0L : query.getLong(columnIndex10);
                int i7 = i4;
                int i8 = i7 == -1 ? 0 : query.getInt(i7);
                i4 = i7;
                int i9 = i5;
                int i10 = i9 == -1 ? 0 : query.getInt(i9);
                i5 = i9;
                int i11 = i2;
                long j6 = i11 == -1 ? 0L : query.getLong(i11);
                i2 = i11;
                int i12 = columnIndex14;
                int i13 = i12 == -1 ? 0 : query.getInt(i12);
                columnIndex14 = i12;
                int i14 = columnIndex15;
                NetworkType intToNetworkType = i14 == -1 ? null : WorkTypeConverters.intToNetworkType(query.getInt(i14));
                columnIndex15 = i14;
                int i15 = columnIndex16;
                NetworkRequestCompat networkRequest$work_runtime_release = i15 == -1 ? null : WorkTypeConverters.toNetworkRequest$work_runtime_release(query.getBlob(i15));
                columnIndex16 = i15;
                int i16 = columnIndex17;
                if (i16 == -1) {
                    z = false;
                } else {
                    z = query.getInt(i16) != 0;
                }
                columnIndex17 = i16;
                int i17 = columnIndex18;
                if (i17 == -1) {
                    z2 = false;
                } else {
                    z2 = query.getInt(i17) != 0;
                }
                columnIndex18 = i17;
                int i18 = columnIndex19;
                if (i18 == -1) {
                    z3 = false;
                } else {
                    z3 = query.getInt(i18) != 0;
                }
                columnIndex19 = i18;
                int i19 = columnIndex20;
                if (i19 != -1 && query.getInt(i19) != 0) {
                    z4 = true;
                }
                columnIndex20 = i19;
                int i20 = columnIndex21;
                boolean z5 = z4;
                long j7 = i20 == -1 ? 0L : query.getLong(i20);
                columnIndex21 = i20;
                int i21 = columnIndex22;
                long j8 = i21 != -1 ? query.getLong(i21) : 0L;
                columnIndex22 = i21;
                int i22 = columnIndex23;
                columnIndex23 = i22;
                arrayList.add(new WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z, z2, z3, z5, j7, j8, i22 == -1 ? null : WorkTypeConverters.byteArrayToSetOfTriggers(query.getBlob(i22))), i6, intToBackoffPolicy, j4, j5, i8, i10, j6, i13, hashMap.get(query.getString(columnIndex)), hashMap2.get(query.getString(columnIndex))));
            }
            query.close();
            return arrayList;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public InterfaceC1060e<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosFlow(final SupportSQLiteQuery supportSQLiteQuery) {
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl.2
            @Override // java.util.concurrent.Callable
            @NonNull
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                boolean z;
                boolean z2;
                boolean z3;
                int i;
                Cursor query = DBUtil.query(RawWorkInfoDao_Impl.this.__db, supportSQLiteQuery, true, null);
                try {
                    int columnIndex = CursorUtil.getColumnIndex(query, "id");
                    int columnIndex2 = CursorUtil.getColumnIndex(query, "state");
                    int columnIndex3 = CursorUtil.getColumnIndex(query, "output");
                    int columnIndex4 = CursorUtil.getColumnIndex(query, "initial_delay");
                    int columnIndex5 = CursorUtil.getColumnIndex(query, "interval_duration");
                    int columnIndex6 = CursorUtil.getColumnIndex(query, "flex_duration");
                    int columnIndex7 = CursorUtil.getColumnIndex(query, "run_attempt_count");
                    int columnIndex8 = CursorUtil.getColumnIndex(query, "backoff_policy");
                    int columnIndex9 = CursorUtil.getColumnIndex(query, "backoff_delay_duration");
                    int columnIndex10 = CursorUtil.getColumnIndex(query, "last_enqueue_time");
                    int columnIndex11 = CursorUtil.getColumnIndex(query, "period_count");
                    int columnIndex12 = CursorUtil.getColumnIndex(query, "generation");
                    int columnIndex13 = CursorUtil.getColumnIndex(query, "next_schedule_time_override");
                    int columnIndex14 = CursorUtil.getColumnIndex(query, "stop_reason");
                    int columnIndex15 = CursorUtil.getColumnIndex(query, "required_network_type");
                    int columnIndex16 = CursorUtil.getColumnIndex(query, "required_network_request");
                    int columnIndex17 = CursorUtil.getColumnIndex(query, "requires_charging");
                    int columnIndex18 = CursorUtil.getColumnIndex(query, "requires_device_idle");
                    int columnIndex19 = CursorUtil.getColumnIndex(query, "requires_battery_not_low");
                    int columnIndex20 = CursorUtil.getColumnIndex(query, "requires_storage_not_low");
                    int columnIndex21 = CursorUtil.getColumnIndex(query, "trigger_content_update_delay");
                    int columnIndex22 = CursorUtil.getColumnIndex(query, "trigger_max_content_delay");
                    int columnIndex23 = CursorUtil.getColumnIndex(query, "content_uri_triggers");
                    HashMap hashMap = new HashMap();
                    int i2 = columnIndex13;
                    HashMap hashMap2 = new HashMap();
                    while (query.moveToNext()) {
                        int i3 = columnIndex12;
                        String string = query.getString(columnIndex);
                        if (hashMap.containsKey(string)) {
                            i = columnIndex11;
                        } else {
                            i = columnIndex11;
                            hashMap.put(string, new ArrayList());
                        }
                        String string2 = query.getString(columnIndex);
                        if (!hashMap2.containsKey(string2)) {
                            hashMap2.put(string2, new ArrayList());
                        }
                        columnIndex12 = i3;
                        columnIndex11 = i;
                    }
                    int i4 = columnIndex11;
                    int i5 = columnIndex12;
                    query.moveToPosition(-1);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(hashMap);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        String string3 = columnIndex == -1 ? null : query.getString(columnIndex);
                        WorkInfo.State intToState = columnIndex2 == -1 ? null : WorkTypeConverters.intToState(query.getInt(columnIndex2));
                        Data fromByteArray = columnIndex3 == -1 ? null : Data.fromByteArray(query.getBlob(columnIndex3));
                        long j = columnIndex4 == -1 ? 0L : query.getLong(columnIndex4);
                        long j2 = columnIndex5 == -1 ? 0L : query.getLong(columnIndex5);
                        long j3 = columnIndex6 == -1 ? 0L : query.getLong(columnIndex6);
                        boolean z4 = false;
                        int i6 = columnIndex7 == -1 ? 0 : query.getInt(columnIndex7);
                        BackoffPolicy intToBackoffPolicy = columnIndex8 == -1 ? null : WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndex8));
                        long j4 = columnIndex9 == -1 ? 0L : query.getLong(columnIndex9);
                        long j5 = columnIndex10 == -1 ? 0L : query.getLong(columnIndex10);
                        int i7 = i4;
                        int i8 = i7 == -1 ? 0 : query.getInt(i7);
                        i4 = i7;
                        int i9 = i5;
                        int i10 = i9 == -1 ? 0 : query.getInt(i9);
                        i5 = i9;
                        int i11 = i2;
                        long j6 = i11 == -1 ? 0L : query.getLong(i11);
                        i2 = i11;
                        int i12 = columnIndex14;
                        int i13 = i12 == -1 ? 0 : query.getInt(i12);
                        columnIndex14 = i12;
                        int i14 = columnIndex15;
                        NetworkType intToNetworkType = i14 == -1 ? null : WorkTypeConverters.intToNetworkType(query.getInt(i14));
                        columnIndex15 = i14;
                        int i15 = columnIndex16;
                        NetworkRequestCompat networkRequest$work_runtime_release = i15 == -1 ? null : WorkTypeConverters.toNetworkRequest$work_runtime_release(query.getBlob(i15));
                        columnIndex16 = i15;
                        int i16 = columnIndex17;
                        if (i16 == -1) {
                            z = false;
                        } else {
                            z = query.getInt(i16) != 0;
                        }
                        columnIndex17 = i16;
                        int i17 = columnIndex18;
                        if (i17 == -1) {
                            z2 = false;
                        } else {
                            z2 = query.getInt(i17) != 0;
                        }
                        columnIndex18 = i17;
                        int i18 = columnIndex19;
                        if (i18 == -1) {
                            z3 = false;
                        } else {
                            z3 = query.getInt(i18) != 0;
                        }
                        columnIndex19 = i18;
                        int i19 = columnIndex20;
                        if (i19 != -1 && query.getInt(i19) != 0) {
                            z4 = true;
                        }
                        columnIndex20 = i19;
                        int i20 = columnIndex21;
                        boolean z5 = z4;
                        long j7 = i20 == -1 ? 0L : query.getLong(i20);
                        columnIndex21 = i20;
                        int i21 = columnIndex22;
                        long j8 = i21 != -1 ? query.getLong(i21) : 0L;
                        columnIndex22 = i21;
                        int i22 = columnIndex23;
                        columnIndex23 = i22;
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z, z2, z3, z5, j7, j8, i22 == -1 ? null : WorkTypeConverters.byteArrayToSetOfTriggers(query.getBlob(i22))), i6, intToBackoffPolicy, j4, j5, i8, i10, j6, i13, (ArrayList) hashMap.get(query.getString(columnIndex)), (ArrayList) hashMap2.get(query.getString(columnIndex))));
                    }
                    query.close();
                    return arrayList;
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
        });
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(final SupportSQLiteQuery supportSQLiteQuery) {
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl.1
            @Override // java.util.concurrent.Callable
            @Nullable
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                boolean z;
                boolean z2;
                boolean z3;
                int i;
                Cursor query = DBUtil.query(RawWorkInfoDao_Impl.this.__db, supportSQLiteQuery, true, null);
                try {
                    int columnIndex = CursorUtil.getColumnIndex(query, "id");
                    int columnIndex2 = CursorUtil.getColumnIndex(query, "state");
                    int columnIndex3 = CursorUtil.getColumnIndex(query, "output");
                    int columnIndex4 = CursorUtil.getColumnIndex(query, "initial_delay");
                    int columnIndex5 = CursorUtil.getColumnIndex(query, "interval_duration");
                    int columnIndex6 = CursorUtil.getColumnIndex(query, "flex_duration");
                    int columnIndex7 = CursorUtil.getColumnIndex(query, "run_attempt_count");
                    int columnIndex8 = CursorUtil.getColumnIndex(query, "backoff_policy");
                    int columnIndex9 = CursorUtil.getColumnIndex(query, "backoff_delay_duration");
                    int columnIndex10 = CursorUtil.getColumnIndex(query, "last_enqueue_time");
                    int columnIndex11 = CursorUtil.getColumnIndex(query, "period_count");
                    int columnIndex12 = CursorUtil.getColumnIndex(query, "generation");
                    int columnIndex13 = CursorUtil.getColumnIndex(query, "next_schedule_time_override");
                    int columnIndex14 = CursorUtil.getColumnIndex(query, "stop_reason");
                    int columnIndex15 = CursorUtil.getColumnIndex(query, "required_network_type");
                    int columnIndex16 = CursorUtil.getColumnIndex(query, "required_network_request");
                    int columnIndex17 = CursorUtil.getColumnIndex(query, "requires_charging");
                    int columnIndex18 = CursorUtil.getColumnIndex(query, "requires_device_idle");
                    int columnIndex19 = CursorUtil.getColumnIndex(query, "requires_battery_not_low");
                    int columnIndex20 = CursorUtil.getColumnIndex(query, "requires_storage_not_low");
                    int columnIndex21 = CursorUtil.getColumnIndex(query, "trigger_content_update_delay");
                    int columnIndex22 = CursorUtil.getColumnIndex(query, "trigger_max_content_delay");
                    int columnIndex23 = CursorUtil.getColumnIndex(query, "content_uri_triggers");
                    HashMap hashMap = new HashMap();
                    int i2 = columnIndex13;
                    HashMap hashMap2 = new HashMap();
                    while (query.moveToNext()) {
                        int i3 = columnIndex12;
                        String string = query.getString(columnIndex);
                        if (hashMap.containsKey(string)) {
                            i = columnIndex11;
                        } else {
                            i = columnIndex11;
                            hashMap.put(string, new ArrayList());
                        }
                        String string2 = query.getString(columnIndex);
                        if (!hashMap2.containsKey(string2)) {
                            hashMap2.put(string2, new ArrayList());
                        }
                        columnIndex12 = i3;
                        columnIndex11 = i;
                    }
                    int i4 = columnIndex11;
                    int i5 = columnIndex12;
                    query.moveToPosition(-1);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(hashMap);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                    ArrayList arrayList = new ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        String string3 = columnIndex == -1 ? null : query.getString(columnIndex);
                        WorkInfo.State intToState = columnIndex2 == -1 ? null : WorkTypeConverters.intToState(query.getInt(columnIndex2));
                        Data fromByteArray = columnIndex3 == -1 ? null : Data.fromByteArray(query.getBlob(columnIndex3));
                        long j = columnIndex4 == -1 ? 0L : query.getLong(columnIndex4);
                        long j2 = columnIndex5 == -1 ? 0L : query.getLong(columnIndex5);
                        long j3 = columnIndex6 == -1 ? 0L : query.getLong(columnIndex6);
                        boolean z4 = false;
                        int i6 = columnIndex7 == -1 ? 0 : query.getInt(columnIndex7);
                        BackoffPolicy intToBackoffPolicy = columnIndex8 == -1 ? null : WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndex8));
                        long j4 = columnIndex9 == -1 ? 0L : query.getLong(columnIndex9);
                        long j5 = columnIndex10 == -1 ? 0L : query.getLong(columnIndex10);
                        int i7 = i4;
                        int i8 = i7 == -1 ? 0 : query.getInt(i7);
                        i4 = i7;
                        int i9 = i5;
                        int i10 = i9 == -1 ? 0 : query.getInt(i9);
                        i5 = i9;
                        int i11 = i2;
                        long j6 = i11 == -1 ? 0L : query.getLong(i11);
                        i2 = i11;
                        int i12 = columnIndex14;
                        int i13 = i12 == -1 ? 0 : query.getInt(i12);
                        columnIndex14 = i12;
                        int i14 = columnIndex15;
                        NetworkType intToNetworkType = i14 == -1 ? null : WorkTypeConverters.intToNetworkType(query.getInt(i14));
                        columnIndex15 = i14;
                        int i15 = columnIndex16;
                        NetworkRequestCompat networkRequest$work_runtime_release = i15 == -1 ? null : WorkTypeConverters.toNetworkRequest$work_runtime_release(query.getBlob(i15));
                        columnIndex16 = i15;
                        int i16 = columnIndex17;
                        if (i16 == -1) {
                            z = false;
                        } else {
                            z = query.getInt(i16) != 0;
                        }
                        columnIndex17 = i16;
                        int i17 = columnIndex18;
                        if (i17 == -1) {
                            z2 = false;
                        } else {
                            z2 = query.getInt(i17) != 0;
                        }
                        columnIndex18 = i17;
                        int i18 = columnIndex19;
                        if (i18 == -1) {
                            z3 = false;
                        } else {
                            z3 = query.getInt(i18) != 0;
                        }
                        columnIndex19 = i18;
                        int i19 = columnIndex20;
                        if (i19 != -1 && query.getInt(i19) != 0) {
                            z4 = true;
                        }
                        columnIndex20 = i19;
                        int i20 = columnIndex21;
                        boolean z5 = z4;
                        long j7 = i20 == -1 ? 0L : query.getLong(i20);
                        columnIndex21 = i20;
                        int i21 = columnIndex22;
                        long j8 = i21 != -1 ? query.getLong(i21) : 0L;
                        columnIndex22 = i21;
                        int i22 = columnIndex23;
                        columnIndex23 = i22;
                        arrayList.add(new WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z, z2, z3, z5, j7, j8, i22 == -1 ? null : WorkTypeConverters.byteArrayToSetOfTriggers(query.getBlob(i22))), i6, intToBackoffPolicy, j4, j5, i8, i10, j6, i13, (ArrayList) hashMap.get(query.getString(columnIndex)), (ArrayList) hashMap2.get(query.getString(columnIndex))));
                    }
                    query.close();
                    return arrayList;
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
        });
    }
}
