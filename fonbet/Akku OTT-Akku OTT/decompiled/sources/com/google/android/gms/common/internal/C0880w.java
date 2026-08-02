package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.a;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.internal.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0880w implements a.d {

    @NonNull
    public static final C0880w b = new C0880w(null);

    @Nullable
    public final String a;

    public /* synthetic */ C0880w(String str) {
        this.a = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0880w) {
            return C0874p.a(this.a, ((C0880w) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
