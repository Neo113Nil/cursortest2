package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.y7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0842y7 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ia f7135a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f7136b = "";

    public C0842y7(io.appmetrica.analytics.impl.Ia ia) {
        this.f7135a = ia;
    }

    public final void a(java.lang.String str, boolean z2) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || kotlin.jvm.internal.i.a(this.f7136b, str)) {
                return;
            }
            this.f7136b = str;
            this.f7135a.a(str, z2);
        }
    }
}
