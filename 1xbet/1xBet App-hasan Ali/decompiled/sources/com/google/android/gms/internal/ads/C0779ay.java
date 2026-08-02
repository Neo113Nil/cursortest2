package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.ay, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0779ay extends AbstractC1673ux {

    /* renamed from: a, reason: collision with root package name */
    public final Cx f12736a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12737b;

    /* renamed from: c, reason: collision with root package name */
    public final C1091hx f12738c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1673ux f12739d;

    public C0779ay(Cx cx, String str, C1091hx c1091hx, AbstractC1673ux abstractC1673ux) {
        this.f12736a = cx;
        this.f12737b = str;
        this.f12738c = c1091hx;
        this.f12739d = abstractC1673ux;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1314mx
    public final boolean a() {
        return this.f12736a != Cx.f8123v;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0779ay)) {
            return false;
        }
        C0779ay c0779ay = (C0779ay) obj;
        return c0779ay.f12738c.equals(this.f12738c) && c0779ay.f12739d.equals(this.f12739d) && c0779ay.f12737b.equals(this.f12737b) && c0779ay.f12736a.equals(this.f12736a);
    }

    public final int hashCode() {
        return Objects.hash(C0779ay.class, this.f12737b, this.f12738c, this.f12739d, this.f12736a);
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f12737b + ", dekParsingStrategy: " + String.valueOf(this.f12738c) + ", dekParametersForNewKeys: " + String.valueOf(this.f12739d) + ", variant: " + String.valueOf(this.f12736a) + ")";
    }
}
