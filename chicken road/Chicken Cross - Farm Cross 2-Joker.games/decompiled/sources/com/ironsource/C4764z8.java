package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.z8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4764z8 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final String f8793a;
    private a b;

    /* renamed from: com.ironsource.z8$a */
    public interface a {
        void a(Dg dg);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4764z8(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8793a = "ISNNativeAdContainer";
    }

    private final Dg a() {
        return new Dg(getVisibility() == 0, getWindowVisibility() == 0, isShown());
    }

    public final a getListener$mediationsdk_release() {
        return this.b;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int i) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        Logger.i(this.f8793a, "onVisibilityChanged: " + i);
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        Logger.i(this.f8793a, "onWindowVisibilityChanged: " + i);
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    public final void setListener$mediationsdk_release(a aVar) {
        this.b = aVar;
    }
}
