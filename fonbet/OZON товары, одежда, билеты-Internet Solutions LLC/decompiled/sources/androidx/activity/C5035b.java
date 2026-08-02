package androidx.activity;

import android.window.BackEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.activity.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5035b {

    /* renamed from: a, reason: collision with root package name */
    private final float f36950a;

    /* renamed from: b, reason: collision with root package name */
    private final float f36951b;

    /* renamed from: c, reason: collision with root package name */
    private final float f36952c;

    /* renamed from: d, reason: collision with root package name */
    private final int f36953d;

    public C5035b(@NotNull BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        C5034a c5034a = C5034a.f36949a;
        float d11 = c5034a.d(backEvent);
        float e11 = c5034a.e(backEvent);
        float b11 = c5034a.b(backEvent);
        int c11 = c5034a.c(backEvent);
        this.f36950a = d11;
        this.f36951b = e11;
        this.f36952c = b11;
        this.f36953d = c11;
    }

    public final float a() {
        return this.f36952c;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackEventCompat{touchX=");
        sb2.append(this.f36950a);
        sb2.append(", touchY=");
        sb2.append(this.f36951b);
        sb2.append(", progress=");
        sb2.append(this.f36952c);
        sb2.append(", swipeEdge=");
        return Ek.a.d(sb2, this.f36953d, '}');
    }
}
