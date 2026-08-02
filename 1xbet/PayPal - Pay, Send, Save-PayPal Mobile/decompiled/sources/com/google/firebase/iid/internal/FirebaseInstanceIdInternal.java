package com.google.firebase.iid.internal;

/* loaded from: classes4.dex */
public interface FirebaseInstanceIdInternal {

    /* loaded from: classes9.dex */
    public interface NewTokenListener {
        void onNewToken(java.lang.String str);
    }

    void addNewTokenListener(com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener newTokenListener);

    void deleteToken(java.lang.String str, java.lang.String str2) throws java.io.IOException;

    java.lang.String getId();

    java.lang.String getToken();

    com.google.android.gms.tasks.Task<java.lang.String> getTokenTask();
}
