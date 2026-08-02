package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
public abstract class IntegrityTokenResponse {
    public abstract com.google.android.gms.tasks.Task<java.lang.Integer> showDialog(android.app.Activity activity, int i);

    public abstract java.lang.String token();
}
