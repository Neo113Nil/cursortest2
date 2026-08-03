package com.inmobi.media;

/* renamed from: com.inmobi.media.yi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2911yi {

    /* renamed from: a, reason: collision with root package name */
    public final int f5573a;

    public C2911yi(int i) {
        this.f5573a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.inmobi.media.C2911yi) && this.f5573a == ((com.inmobi.media.C2911yi) obj).f5573a;
    }

    public final int hashCode() {
        return this.f5573a;
    }

    public final java.lang.String toString() {
        return "RenderViewTelemetryData(maxTemplateEvents=" + this.f5573a + ")";
    }
}
