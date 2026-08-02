package androidx.lifecycle;

import androidx.lifecycle.AbstractC5434v;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.lifecycle.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5417g implements G {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r[] f43312a;

    public C5417g(@NotNull r[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.f43312a = generatedAdapters;
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(@NotNull J source, @NotNull AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        new HashMap();
        r[] rVarArr = this.f43312a;
        for (r rVar : rVarArr) {
            rVar.a();
        }
        for (r rVar2 : rVarArr) {
            rVar2.a();
        }
    }
}
