package com.google.android.gms.internal.firebase_auth;

import org.json.JSONException;

/* loaded from: classes.dex */
public final class zzac {
    private String message;

    public static zzac zzj(String str) throws JSONException {
        zzac zzacVar = new zzac();
        zzacVar.message = str;
        return zzacVar;
    }

    public final String getErrorMessage() {
        return this.message;
    }
}
