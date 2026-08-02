package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

@AutoValue
/* loaded from: classes.dex */
public abstract class u {
    @Nullable
    public abstract o a();

    @Nullable
    @Encodable.Field(name = "logEvent")
    public abstract List<t> b();

    @Nullable
    public abstract Integer c();

    @Nullable
    public abstract String d();

    @Nullable
    public abstract x e();

    public abstract long f();

    public abstract long g();
}
