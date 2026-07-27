package com.onesignal.common;

import B4.r;
import java.util.UUID;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class IDManager {
    public static final IDManager INSTANCE = new IDManager();
    public static final String LOCAL_PREFIX = "local-";

    private IDManager() {
    }

    public final String createLocalId() {
        return LOCAL_PREFIX + UUID.randomUUID();
    }

    public final boolean isLocalId(String id) {
        i.e(id, "id");
        return r.O(id, LOCAL_PREFIX, false);
    }
}
