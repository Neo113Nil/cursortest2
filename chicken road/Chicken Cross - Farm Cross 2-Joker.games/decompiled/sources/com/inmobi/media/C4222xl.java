package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* renamed from: com.inmobi.media.xl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4222xl extends AbstractC4277zl {

    /* renamed from: a, reason: collision with root package name */
    public final JSONArray f7483a;

    public C4222xl(JSONArray value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7483a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4222xl) && Intrinsics.areEqual(this.f7483a, ((C4222xl) obj).f7483a);
    }

    public final int hashCode() {
        return this.f7483a.hashCode();
    }

    public final String toString() {
        return "ArrayPayload(value=" + this.f7483a + ")";
    }
}
