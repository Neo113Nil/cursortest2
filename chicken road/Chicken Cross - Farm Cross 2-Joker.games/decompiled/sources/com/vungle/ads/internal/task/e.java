package com.vungle.ads.internal.task;

import android.os.Bundle;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class e implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final String f12134a;
    public boolean b;
    public long c;
    public Bundle d;
    public int e;

    public e(String jobTag) {
        Intrinsics.checkNotNullParameter(jobTag, "jobTag");
        this.f12134a = jobTag;
        this.d = new Bundle();
        this.e = 2;
    }

    public final e a(boolean z) {
        this.b = z;
        return this;
    }

    public final long b() {
        return this.c;
    }

    public final Bundle c() {
        return this.d;
    }

    public final Object clone() {
        return super.clone();
    }

    public final String d() {
        return this.f12134a;
    }

    public final int e() {
        return this.e;
    }

    public final boolean f() {
        return this.b;
    }

    public final void g() {
        this.c = 0L;
    }

    public final e h() {
        this.e = 0;
        return this;
    }

    public final e a(Bundle extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.d = extras;
        return this;
    }

    public final e a() {
        try {
            Object clone = super.clone();
            Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type com.vungle.ads.internal.task.JobInfo");
            return (e) clone;
        } catch (CloneNotSupportedException e) {
            boolean z = u.f12190a;
            t.a("JobInfo", "Cannot copy JobInfo " + this, e);
            return null;
        }
    }
}
