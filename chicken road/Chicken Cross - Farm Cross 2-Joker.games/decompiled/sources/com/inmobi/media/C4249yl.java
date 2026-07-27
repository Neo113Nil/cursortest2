package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.yl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4249yl extends AbstractC4277zl {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f7508a;

    public C4249yl(JSONObject value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7508a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4249yl) && Intrinsics.areEqual(this.f7508a, ((C4249yl) obj).f7508a);
    }

    public final int hashCode() {
        return this.f7508a.hashCode();
    }

    public final String toString() {
        return "ObjectPayload(value=" + this.f7508a + ")";
    }
}
