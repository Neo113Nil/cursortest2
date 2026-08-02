package com.google.firebase.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class InternalTokenResult {

    @Nullable
    private String zza;

    public InternalTokenResult(@Nullable String str) {
        this.zza = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof InternalTokenResult) {
            return C0874p.a(this.zza, ((InternalTokenResult) obj).zza);
        }
        return false;
    }

    @Nullable
    public String getToken() {
        return this.zza;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    @NonNull
    public String toString() {
        C0874p.a aVar = new C0874p.a(this);
        aVar.a(this.zza, Constants.TOKEN);
        return aVar.toString();
    }
}
