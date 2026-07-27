package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Md {

    /* renamed from: a, reason: collision with root package name */
    public final C3639d0 f6716a;
    public final String b;
    public final String c;
    public String d;
    public int e;

    public Md(C3639d0 adLifecycleData, String str, String str2, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        Intrinsics.checkNotNullParameter(adLifecycleData, "adLifecycleData");
        this.f6716a = adLifecycleData;
        this.b = str;
        this.c = str2;
        this.d = null;
        this.e = 0;
    }
}
