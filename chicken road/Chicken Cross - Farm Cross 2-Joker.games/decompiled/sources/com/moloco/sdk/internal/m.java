package com.moloco.sdk.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class m {
    public static final int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f10509a;
    public final int b;

    public m(String description, int i) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f10509a = description;
        this.b = i;
    }

    public final String a() {
        return this.f10509a;
    }

    public final int b() {
        return this.b;
    }
}
