package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import l1.C7845v;
import l1.InterfaceC7802U;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes8.dex */
public class U0 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private boolean f40744a;

    public U0(@NotNull Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(@NotNull InterfaceC7802U interfaceC7802U, @NotNull d2 d2Var, long j11) {
        super.drawChild(C7845v.b(interfaceC7802U), d2Var, j11);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            Intrinsics.g(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((d2) childAt).w()) {
                this.f40744a = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f40744a = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildCount() {
        if (this.f40744a) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
