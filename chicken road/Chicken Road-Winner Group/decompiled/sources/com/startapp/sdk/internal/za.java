package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class za implements Runnable {
    protected final ya callback;
    protected final Context context;
    protected final Bundle extras;

    public za(Context context, ya yaVar, Bundle bundle) {
        this.context = context;
        this.callback = yaVar;
        this.extras = bundle;
    }

    public boolean runSync() {
        return false;
    }
}
