package com.startapp.sdk.internal;

import com.startapp.sdk.jobs.JobRequest$Network;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes.dex */
public final class de {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f3589a;

    /* renamed from: b, reason: collision with root package name */
    public final UUID f3590b = UUID.randomUUID();

    /* renamed from: c, reason: collision with root package name */
    public final JobRequest$Network f3591c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3592d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f3593e;

    public de(ce ceVar) {
        this.f3589a = ceVar.f3549a;
        this.f3591c = ceVar.f3550b;
        this.f3592d = ceVar.f3551c;
        this.f3593e = ceVar.f3552d;
    }

    public static int a(Class... clsArr) {
        if (clsArr.length == 0) {
            return 0;
        }
        String[] strArr = new String[clsArr.length];
        for (int i3 = 0; i3 < clsArr.length; i3++) {
            strArr[i3] = clsArr[i3].getName();
        }
        return Math.abs(Arrays.hashCode(strArr));
    }
}
