package com.inmobi.media;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.f7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3702f7 {

    /* renamed from: a, reason: collision with root package name */
    public final float f7101a;
    public final C3730g7 b;
    public final ArrayList c;

    public C3702f7(float f, C3730g7 c3730g7, ArrayList arrayList) {
        this.f7101a = f;
        this.b = c3730g7;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3702f7)) {
            return false;
        }
        C3702f7 c3702f7 = (C3702f7) obj;
        return Float.compare(this.f7101a, c3702f7.f7101a) == 0 && Intrinsics.areEqual(this.b, c3702f7.b) && Intrinsics.areEqual(this.c, c3702f7.c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.f7101a) * 31;
        C3730g7 c3730g7 = this.b;
        int hashCode2 = (hashCode + (c3730g7 == null ? 0 : c3730g7.hashCode())) * 31;
        ArrayList arrayList = this.c;
        return hashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "ExposureMetrics(exposedPercentage=" + this.f7101a + ", visibleRectangle=" + this.b + ", occlusionRectangles=" + this.c + ")";
    }
}
