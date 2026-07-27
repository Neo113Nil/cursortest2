package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.fg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3711fg {

    /* renamed from: a, reason: collision with root package name */
    public final Map f7106a;

    public C3711fg(Map requestParams) {
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        this.f7106a = requestParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3711fg) && Intrinsics.areEqual(this.f7106a, ((C3711fg) obj).f7106a);
    }

    public final int hashCode() {
        return this.f7106a.hashCode();
    }

    public final String toString() {
        return "NovatiqAdData(requestParams=" + this.f7106a + ")";
    }
}
