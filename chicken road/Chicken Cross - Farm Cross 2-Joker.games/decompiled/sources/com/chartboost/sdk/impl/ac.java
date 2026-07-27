package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    public final long f4676a;
    public final zb b;
    public final int c;
    public final String d;
    public final ne e;
    public final Long f;
    public final Long g;

    public ac(long j, zb mode, int i, String selectedMimeType, ne playbackMode, Long l, Long l2) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(selectedMimeType, "selectedMimeType");
        Intrinsics.checkNotNullParameter(playbackMode, "playbackMode");
        this.f4676a = j;
        this.b = mode;
        this.c = i;
        this.d = selectedMimeType;
        this.e = playbackMode;
        this.f = l;
        this.g = l2;
    }

    public final ac a(long j, zb mode, int i, String selectedMimeType, ne playbackMode, Long l, Long l2) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(selectedMimeType, "selectedMimeType");
        Intrinsics.checkNotNullParameter(playbackMode, "playbackMode");
        return new ac(j, mode, i, selectedMimeType, playbackMode, l, l2);
    }

    public final long b() {
        return this.f4676a;
    }

    public final zb c() {
        return this.b;
    }

    public final ne d() {
        return this.e;
    }

    public final Long e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return this.f4676a == acVar.f4676a && this.b == acVar.b && this.c == acVar.c && Intrinsics.areEqual(this.d, acVar.d) && this.e == acVar.e && Intrinsics.areEqual(this.f, acVar.f) && Intrinsics.areEqual(this.g, acVar.g);
    }

    public final String f() {
        return this.d;
    }

    public final Long g() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = ((((((((Long.hashCode(this.f4676a) * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        Long l = this.f;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.g;
        return hashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        return "MediaSelectionResult(latencyMs=" + this.f4676a + ", mode=" + this.b + ", failures=" + this.c + ", selectedMimeType=" + this.d + ", playbackMode=" + this.e + ", progressiveDownloadDurationMs=" + this.f + ", videoRenderableLoadDurationMs=" + this.g + ")";
    }

    public final int a() {
        return this.c;
    }
}
