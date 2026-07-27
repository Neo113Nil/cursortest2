package com.onesignal.user.state;

import kotlin.jvm.internal.i;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class UserChangedState {
    private final UserState current;

    public UserChangedState(UserState current) {
        i.e(current, "current");
        this.current = current;
    }

    public final UserState getCurrent() {
        return this.current;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("current", this.current.toJSONObject());
        i.d(put, "put(...)");
        return put;
    }
}
