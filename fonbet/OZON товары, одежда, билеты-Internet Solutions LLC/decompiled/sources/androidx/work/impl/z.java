package androidx.work.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f45539a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String[] f45540b;

    static {
        String i11 = androidx.work.o.i("WrkDbPathHelper");
        Intrinsics.checkNotNullExpressionValue(i11, "tagWithPrefix(\"WrkDbPathHelper\")");
        f45539a = i11;
        f45540b = new String[]{"-journal", "-shm", "-wal"};
    }
}
