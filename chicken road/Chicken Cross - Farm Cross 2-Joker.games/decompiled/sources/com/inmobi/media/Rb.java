package com.inmobi.media;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Rb extends Sb {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f6825a;
    public final String b;

    public Rb(Activity activity, String finalUrl) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(finalUrl, "finalUrl");
        this.f6825a = activity;
        this.b = finalUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rb)) {
            return false;
        }
        Rb rb = (Rb) obj;
        return Intrinsics.areEqual(this.f6825a, rb.f6825a) && Intrinsics.areEqual(this.b, rb.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6825a.hashCode() * 31);
    }

    public final String toString() {
        return "Valid(activity=" + this.f6825a + ", finalUrl=" + this.b + ")";
    }
}
