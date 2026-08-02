package androidx.compose.foundation.text.handwriting;

import C0.c;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final float f39784a = 40;

    /* renamed from: b, reason: collision with root package name */
    private static final float f39785b = 10;

    public static final float a() {
        return f39785b;
    }

    public static final float b() {
        return f39784a;
    }

    @NotNull
    public static final e c(@NotNull e.a aVar, boolean z11, @NotNull Function0 function0) {
        return (z11 && c.a()) ? T.g(new StylusHandwritingElementWithNegativePadding(function0), f39785b, f39784a) : aVar;
    }
}
