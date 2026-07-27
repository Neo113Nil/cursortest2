package com.onesignal.user.internal.jwt;

import com.onesignal.IUserJwtInvalidatedListener;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.threading.OneSignalDispatchers;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.debug.internal.logging.Logging;
import e5.g;
import g4.AbstractC0465j;
import g4.AbstractC0476u;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class JwtTokenStore {
    private final IPreferencesService _prefs;
    private final EventProducer<IJwtUpdateListener> internalUpdateListeners;
    private boolean isLoaded;
    private final EventProducer<IUserJwtInvalidatedListener> publicInvalidatedListeners;
    private final Map<String, String> tokens;

    public JwtTokenStore(IPreferencesService _prefs) {
        i.e(_prefs, "_prefs");
        this._prefs = _prefs;
        this.tokens = new LinkedHashMap();
        this.internalUpdateListeners = new EventProducer<>();
        this.publicInvalidatedListeners = new EventProducer<>();
    }

    private final void ensureLoaded() {
        if (this.isLoaded) {
            return;
        }
        String string$default = IPreferencesService.DefaultImpls.getString$default(this._prefs, "OneSignal", PreferenceOneSignalKeys.PREFS_OS_JWT_TOKENS, null, 4, null);
        if (string$default != null) {
            try {
                JSONObject jSONObject = new JSONObject(string$default);
                Iterator<String> keys = jSONObject.keys();
                i.d(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    Map<String, String> map = this.tokens;
                    i.b(next);
                    String string = jSONObject.getString(next);
                    i.d(string, "getString(...)");
                    map.put(next, string);
                }
            } catch (JSONException e3) {
                Logging.warn$default("JwtTokenStore: failed to parse persisted tokens, starting fresh: " + e3.getMessage(), null, 2, null);
            }
        }
        this.isLoaded = true;
    }

    private final void persist() {
        this._prefs.saveString("OneSignal", PreferenceOneSignalKeys.PREFS_OS_JWT_TOKENS, new JSONObject(AbstractC0476u.d0(this.tokens)).toString());
    }

    public final void addInternalUpdateListener(IJwtUpdateListener listener) {
        i.e(listener, "listener");
        this.internalUpdateListeners.subscribe(listener);
    }

    public final void addUserJwtInvalidatedListener(IUserJwtInvalidatedListener listener) {
        i.e(listener, "listener");
        this.publicInvalidatedListeners.subscribe(listener);
    }

    public final String getJwt(String externalId) {
        String str;
        i.e(externalId, "externalId");
        synchronized (this.tokens) {
            ensureLoaded();
            str = this.tokens.get(externalId);
        }
        return str;
    }

    public final void invalidateJwt(String externalId) {
        boolean z;
        i.e(externalId, "externalId");
        synchronized (this.tokens) {
            ensureLoaded();
            z = this.tokens.remove(externalId) != null;
            if (z) {
                persist();
            }
        }
        if (z) {
            OneSignalDispatchers.INSTANCE.launchOnDefault(new JwtTokenStore$invalidateJwt$2(this, externalId, null));
        }
    }

    public final void pruneToExternalIds(Set<String> activeIds) {
        Set X02;
        i.e(activeIds, "activeIds");
        synchronized (this.tokens) {
            ensureLoaded();
            X02 = AbstractC0465j.X0(g.s(this.tokens.keySet(), activeIds));
            if (!X02.isEmpty()) {
                this.tokens.keySet().removeAll(X02);
                persist();
            }
        }
        Iterator it = X02.iterator();
        while (it.hasNext()) {
            this.internalUpdateListeners.fire(new JwtTokenStore$pruneToExternalIds$2((String) it.next()));
        }
    }

    public final void putJwt(String externalId, String str) {
        boolean a6;
        i.e(externalId, "externalId");
        if (str == null) {
            return;
        }
        synchronized (this.tokens) {
            ensureLoaded();
            a6 = i.a(this.tokens.get(externalId), str);
            this.tokens.put(externalId, str);
            if (!a6) {
                persist();
            }
        }
        if (a6) {
            return;
        }
        this.internalUpdateListeners.fire(new JwtTokenStore$putJwt$2(externalId));
    }

    public final void removeInternalUpdateListener(IJwtUpdateListener listener) {
        i.e(listener, "listener");
        this.internalUpdateListeners.unsubscribe(listener);
    }

    public final void removeUserJwtInvalidatedListener(IUserJwtInvalidatedListener listener) {
        i.e(listener, "listener");
        this.publicInvalidatedListeners.unsubscribe(listener);
    }
}
