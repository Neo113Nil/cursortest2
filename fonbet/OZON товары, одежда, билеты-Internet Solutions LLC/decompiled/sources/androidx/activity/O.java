package androidx.activity;

import android.content.res.Resources;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    private final int f36944a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36945b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<Resources, Boolean> f36946c;

    public static final class a {
    }

    public O(int i11, int i12, Function1 function1) {
        this.f36944a = i11;
        this.f36945b = i12;
        this.f36946c = function1;
    }

    @NotNull
    public final Function1<Resources, Boolean> a() {
        return this.f36946c;
    }

    public final int b(boolean z11) {
        return z11 ? this.f36945b : this.f36944a;
    }
}
