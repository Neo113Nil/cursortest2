package com.google.firebase.auth;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.d;
import java.util.Map;

/* loaded from: classes4.dex */
public interface AdditionalUserInfo extends d {
    @Nullable
    Map<String, Object> getProfile();

    @Nullable
    String getProviderId();

    @Nullable
    String getUsername();

    boolean isNewUser();
}
