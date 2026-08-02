package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.internal.C0874p;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class L {
    public final C0828b a;
    public final C0854d b;

    public /* synthetic */ L(C0828b c0828b, C0854d c0854d) {
        this.a = c0828b;
        this.b = c0854d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof L)) {
            L l = (L) obj;
            if (C0874p.a(this.a, l.a) && C0874p.a(this.b, l.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        C0874p.a aVar = new C0874p.a(this);
        aVar.a(this.a, Constants.KEY);
        aVar.a(this.b, "feature");
        return aVar.toString();
    }
}
