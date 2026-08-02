package com.google.android.material.datepicker;

import android.os.Parcelable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.util.Pair;
import java.util.Collection;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.google.android.material.datepicker.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC0946d<S> extends Parcelable {
    void a();

    @StyleRes
    int b();

    @NonNull
    String d();

    @NonNull
    View e();

    @NonNull
    String f();

    @NonNull
    Collection<Pair<Long, Long>> g();

    boolean i();

    @NonNull
    Collection<Long> j();

    @Nullable
    S k();
}
