package com.inmobi.media;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class Fa {
    private final boolean GPID;

    public Fa() {
        this(false, 1, null);
    }

    public final boolean a() {
        return this.GPID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Fa) && this.GPID == ((Fa) obj).GPID;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.GPID);
    }

    public final String toString() {
        return "IncludeIdParams(GPID=" + this.GPID + ")";
    }

    public Fa(boolean z) {
        this.GPID = z;
    }

    public /* synthetic */ Fa(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
