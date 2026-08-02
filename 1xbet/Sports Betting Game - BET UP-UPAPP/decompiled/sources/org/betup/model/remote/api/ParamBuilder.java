package org.betup.model.remote.api;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ParamBuilder {
    private Map<String, Object> map = new HashMap();

    public ParamBuilder addParam(String key, Object param) {
        this.map.put(key, param);
        return this;
    }

    public Map<String, Object> getMap() {
        return this.map;
    }
}
