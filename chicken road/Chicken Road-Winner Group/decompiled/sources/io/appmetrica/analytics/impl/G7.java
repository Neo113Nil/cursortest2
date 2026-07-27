package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class G7 {

    /* renamed from: a, reason: collision with root package name */
    public final Pa f5978a;

    /* renamed from: b, reason: collision with root package name */
    public String f5979b = "";

    public G7(Pa pa) {
        this.f5978a = pa;
    }

    public final void a(String str, boolean z3) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || kotlin.jvm.internal.j.a(this.f5979b, str)) {
                return;
            }
            this.f5979b = str;
            this.f5978a.a(str, z3);
        }
    }
}
