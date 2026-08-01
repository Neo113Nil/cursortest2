package com.inmobi.media;

/* loaded from: classes6.dex */
public final class Nj {

    /* renamed from: a, reason: collision with root package name */
    public final int f6746a;

    public Nj(int i) {
        this.f6746a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Nj) && this.f6746a == ((Nj) obj).f6746a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6746a);
    }

    public final String toString() {
        return "RenderViewTelemetryData(maxTemplateEvents=" + this.f6746a + ")";
    }
}
