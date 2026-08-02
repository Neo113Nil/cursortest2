package com.google.firebase.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.a;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class MultiFactorInfo extends a {

    @NonNull
    public static final String FACTOR_ID_KEY = "factorIdKey";

    @Nullable
    public abstract String getDisplayName();

    public abstract long getEnrollmentTimestamp();

    @NonNull
    public abstract String getFactorId();

    @NonNull
    public abstract String getUid();

    @Nullable
    public abstract JSONObject toJson();
}
