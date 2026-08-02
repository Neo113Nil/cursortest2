package com.droibit.android.customtabs.launcher;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class d extends Lambda implements Function1<String, Boolean> {
    public static final d a = new d(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        return Boolean.valueOf(!f.a.contains(str));
    }
}
