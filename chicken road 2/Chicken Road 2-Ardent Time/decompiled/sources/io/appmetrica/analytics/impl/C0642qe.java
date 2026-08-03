package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0642qe implements io.appmetrica.analytics.impl.I6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.File f6685a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Jg f6686b;

    public C0642qe(java.io.File file, io.appmetrica.analytics.impl.Jg jg) {
        this.f6685a = file;
        this.f6686b = jg;
    }

    @Override // io.appmetrica.analytics.impl.I6
    public final java.io.File a(android.content.Context context, java.lang.String str) {
        return new java.io.File(this.f6685a, this.f6686b.a(str));
    }
}
