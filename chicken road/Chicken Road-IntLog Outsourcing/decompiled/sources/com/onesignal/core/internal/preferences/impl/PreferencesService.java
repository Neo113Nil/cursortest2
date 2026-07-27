package com.onesignal.core.internal.preferences.impl;

import B0.o;
import D4.X;
import android.content.SharedPreferences;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.common.threading.Waiter;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceStores;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import f4.C0430g;
import g4.AbstractC0476u;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class PreferencesService implements IPreferencesService, IStartableService {
    public static final Companion Companion = new Companion(null);
    private static final int WRITE_CALL_DELAY_TO_BUFFER_MS = 200;
    private final IApplicationService _applicationService;
    private final ITime _time;
    private volatile boolean hasLoggedMissingAppContext;
    private final Map<String, Map<String, Object>> prefsToApply;
    private final Waiter waiter;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public PreferencesService(IApplicationService _applicationService, ITime _time) {
        i.e(_applicationService, "_applicationService");
        i.e(_time, "_time");
        this._applicationService = _applicationService;
        this._time = _time;
        this.prefsToApply = AbstractC0476u.Y(new C0430g("OneSignal", new LinkedHashMap()), new C0430g(PreferenceStores.PLAYER_PURCHASES, new LinkedHashMap()));
        this.waiter = new Waiter();
    }

    private final X doWorkAsync() {
        return ThreadUtilsKt.launchOnIO(new PreferencesService$doWorkAsync$1(this, null));
    }

    private final Object get(String str, String str2, Class<?> cls, Object obj) {
        if (!this.prefsToApply.containsKey(str)) {
            throw new Exception(o.i("Store not found: ", str));
        }
        Map<String, Object> map = this.prefsToApply.get(str);
        i.b(map);
        Map<String, Object> map2 = map;
        synchronized (map2) {
            Object obj2 = map2.get(str2);
            if (obj2 == null) {
                if (!map2.containsKey(str2)) {
                    SharedPreferences sharedPrefsByName = getSharedPrefsByName(str);
                    if (sharedPrefsByName != null) {
                        try {
                            if (i.a(cls, String.class)) {
                                return sharedPrefsByName.getString(str2, (String) obj);
                            }
                            if (i.a(cls, Boolean.TYPE)) {
                                Boolean bool = (Boolean) obj;
                                return Boolean.valueOf(sharedPrefsByName.getBoolean(str2, bool != null ? bool.booleanValue() : false));
                            }
                            if (i.a(cls, Integer.TYPE)) {
                                Integer num = (Integer) obj;
                                return Integer.valueOf(sharedPrefsByName.getInt(str2, num != null ? num.intValue() : 0));
                            }
                            if (i.a(cls, Long.TYPE)) {
                                Long l2 = (Long) obj;
                                return Long.valueOf(sharedPrefsByName.getLong(str2, l2 != null ? l2.longValue() : 0L));
                            }
                            if (i.a(cls, Set.class)) {
                                return sharedPrefsByName.getStringSet(str2, (Set) obj);
                            }
                            return null;
                        } catch (Exception unused) {
                        }
                    }
                    if (i.a(cls, String.class)) {
                        return (String) obj;
                    }
                    if (i.a(cls, Boolean.TYPE)) {
                        Boolean bool2 = (Boolean) obj;
                        return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
                    }
                    if (i.a(cls, Integer.TYPE)) {
                        Integer num2 = (Integer) obj;
                        return Integer.valueOf(num2 != null ? num2.intValue() : 0);
                    }
                    if (i.a(cls, Long.TYPE)) {
                        Long l6 = (Long) obj;
                        return Long.valueOf(l6 != null ? l6.longValue() : 0L);
                    }
                    if (i.a(cls, Set.class)) {
                        return (Set) obj;
                    }
                    return null;
                }
            }
            return obj2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized SharedPreferences getSharedPrefsByName(String str) {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = this._applicationService.getAppContext().getSharedPreferences(str, 0);
        } catch (Throwable unused) {
            sharedPreferences = null;
        }
        return sharedPreferences;
    }

    private final void save(String str, String str2, Object obj) {
        if (!this.prefsToApply.containsKey(str)) {
            throw new Exception(o.i("Store not found: ", str));
        }
        Map<String, Object> map = this.prefsToApply.get(str);
        i.b(map);
        Map<String, Object> map2 = map;
        synchronized (map2) {
            map2.put(str2, obj);
        }
        Logging.debug$default("OneSignal: PreferencesService queued write for store=" + str + " key=" + str2, null, 2, null);
        this.waiter.wake();
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public Boolean getBool(String store, String key, Boolean bool) {
        i.e(store, "store");
        i.e(key, "key");
        return (Boolean) get(store, key, Boolean.TYPE, bool);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public Integer getInt(String store, String key, Integer num) {
        i.e(store, "store");
        i.e(key, "key");
        return (Integer) get(store, key, Integer.TYPE, num);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public Long getLong(String store, String key, Long l2) {
        i.e(store, "store");
        i.e(key, "key");
        return (Long) get(store, key, Long.TYPE, l2);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public String getString(String store, String key, String str) {
        i.e(store, "store");
        i.e(key, "key");
        return (String) get(store, key, String.class, str);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public Set<String> getStringSet(String store, String key, Set<String> set) {
        i.e(store, "store");
        i.e(key, "key");
        return (Set) get(store, key, Set.class, set);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public void saveBool(String store, String key, Boolean bool) {
        i.e(store, "store");
        i.e(key, "key");
        save(store, key, bool);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public void saveInt(String store, String key, Integer num) {
        i.e(store, "store");
        i.e(key, "key");
        save(store, key, num);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public void saveLong(String store, String key, Long l2) {
        i.e(store, "store");
        i.e(key, "key");
        save(store, key, l2);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public void saveString(String store, String key, String str) {
        i.e(store, "store");
        i.e(key, "key");
        save(store, key, str);
    }

    @Override // com.onesignal.core.internal.preferences.IPreferencesService
    public void saveStringSet(String store, String key, Set<String> set) {
        i.e(store, "store");
        i.e(key, "key");
        save(store, key, set);
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        Logging.debug$default("OneSignal: PreferencesService starting async write loop", null, 2, null);
        doWorkAsync();
    }
}
