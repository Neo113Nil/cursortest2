package com.google.firebase.auth;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public abstract class ActionCodeEmailInfo extends ActionCodeInfo {
    @Override // com.google.firebase.auth.ActionCodeInfo
    @NonNull
    public String getEmail() {
        return super.getEmail();
    }

    @NonNull
    public abstract String getPreviousEmail();
}
