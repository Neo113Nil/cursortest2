package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ZE {

    /* renamed from: a, reason: collision with root package name */
    public final String f12470a;

    /* renamed from: b, reason: collision with root package name */
    public final YE f12471b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12472c;

    static {
        if (AbstractC1260lo.f14419a < 31) {
            new ZE("");
        } else {
            int i = YE.f12309b;
        }
    }

    public ZE(LogSessionId logSessionId, String str) {
        this.f12471b = new YE(logSessionId);
        this.f12470a = str;
        this.f12472c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZE)) {
            return false;
        }
        ZE ze = (ZE) obj;
        return Objects.equals(this.f12470a, ze.f12470a) && Objects.equals(this.f12471b, ze.f12471b) && Objects.equals(this.f12472c, ze.f12472c);
    }

    public final int hashCode() {
        return Objects.hash(this.f12470a, this.f12471b, this.f12472c);
    }

    public ZE(String str) {
        AbstractC1668us.a0(AbstractC1260lo.f14419a < 31);
        this.f12470a = str;
        this.f12471b = null;
        this.f12472c = new Object();
    }
}
