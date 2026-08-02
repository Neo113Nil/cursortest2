package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f3316a;
    public final com.dyneti.android.dyscan.y b;
    public final java.util.ArrayList c;
    public final java.util.ArrayList d;
    public final float e;
    public final java.lang.Boolean f;
    public final com.dyneti.android.dyscan.l g;

    public k(android.graphics.Bitmap bitmap, com.dyneti.android.dyscan.y yVar, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, float f, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList2, "");
        com.dyneti.android.dyscan.l lVar = yVar.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "");
        this.f3316a = bitmap;
        this.b = yVar;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = f;
        this.f = bool;
        this.g = lVar;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BlackoutModel(cardImage=");
        sb.append(this.f3316a);
        sb.append(", cardNumberToMatch=");
        sb.append(this.b);
        sb.append(", cardNumberToBlackout=");
        sb.append(this.c);
        sb.append(", predictionsToBlackout=");
        sb.append(this.d);
        sb.append(", cardNumberBoxDeltaY=");
        sb.append(this.e);
        sb.append(", isSingleFrameDetection=");
        sb.append(this.f);
        sb.append(", updatedBoundingBox=");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.f3316a.hashCode();
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.c.hashCode();
        int hashCode4 = this.d.hashCode();
        int hashCode5 = java.lang.Float.hashCode(this.e);
        return this.g.hashCode() + ((this.f.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + (hashCode * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.dyneti.android.dyscan.k)) {
            return false;
        }
        com.dyneti.android.dyscan.k kVar = (com.dyneti.android.dyscan.k) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f3316a, kVar.f3316a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, kVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, kVar.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, kVar.d) && java.lang.Float.compare(this.e, kVar.e) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.f, kVar.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, kVar.g);
    }
}
