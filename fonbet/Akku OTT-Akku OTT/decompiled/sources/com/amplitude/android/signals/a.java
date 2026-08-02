package com.amplitude.android.signals;

import com.amplitude.core.platform.l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements l {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        ((a) obj).getClass();
        return Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "UiChangeSignal(timestamp=null)";
    }
}
