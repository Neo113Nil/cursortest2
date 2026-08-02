package Kj;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Kj.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3530b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final int[] f15994a = {R.attr.textAllCaps};

    public static final boolean a(@NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        int[] iArr = f15994a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, iArr);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        boolean z11 = obtainStyledAttributes.getBoolean(C7705l.L(iArr, R.attr.textAllCaps), false);
        obtainStyledAttributes.recycle();
        return z11;
    }
}
