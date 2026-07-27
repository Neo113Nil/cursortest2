package com.onesignal.user.internal.operations.impl.states;

import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.time.ITime;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class NewRecordsState {
    private final ConfigModelStore _configModelStore;
    private final ITime _time;
    private final Map<String, Long> records;

    public NewRecordsState(ITime _time, ConfigModelStore _configModelStore) {
        i.e(_time, "_time");
        i.e(_configModelStore, "_configModelStore");
        this._time = _time;
        this._configModelStore = _configModelStore;
        this.records = new LinkedHashMap();
    }

    public final void add(String key) {
        i.e(key, "key");
        this.records.put(key, Long.valueOf(this._time.getCurrentTimeMillis()));
    }

    public final boolean canAccess(String key) {
        i.e(key, "key");
        Long l2 = this.records.get(key);
        if (l2 != null) {
            return this._time.getCurrentTimeMillis() - l2.longValue() >= this._configModelStore.getModel().getOpRepoPostCreateDelay();
        }
        return true;
    }

    public final boolean isInMissingRetryWindow(String key) {
        i.e(key, "key");
        Long l2 = this.records.get(key);
        if (l2 != null) {
            return this._time.getCurrentTimeMillis() - l2.longValue() <= this._configModelStore.getModel().getOpRepoPostCreateRetryUpTo();
        }
        return false;
    }
}
