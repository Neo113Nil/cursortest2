package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class G7 {

    /* renamed from: a, reason: collision with root package name */
    public final Pa f6823a;

    /* renamed from: b, reason: collision with root package name */
    public String f6824b = "";

    public G7(Pa pa) {
        this.f6823a = pa;
    }

    public final void a(String str, boolean z) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || kotlin.jvm.internal.i.a(this.f6824b, str)) {
                return;
            }
            this.f6824b = str;
            this.f6823a.a(str, z);
        }
    }
}
