package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

@AutoValue
@Encodable
/* loaded from: classes.dex */
public abstract class n {
    @NonNull
    @Encodable.Field(name = "logRequest")
    public abstract List<u> a();
}
