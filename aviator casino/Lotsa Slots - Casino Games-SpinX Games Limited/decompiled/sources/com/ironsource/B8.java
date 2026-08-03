package com.ironsource;

/* loaded from: classes5.dex */
public final class B8 extends android.widget.FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f5624a;
    private com.ironsource.B8.a b;

    public interface a {
        void a(com.ironsource.Ag ag);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f5624a = "ISNNativeAdContainer";
    }

    private final com.ironsource.Ag a() {
        return new com.ironsource.Ag(getVisibility() == 0, getWindowVisibility() == 0, isShown());
    }

    public final com.ironsource.B8.a getListener$mediationsdk_release() {
        return this.b;
    }

    @Override // android.view.View
    public void onVisibilityChanged(android.view.View changedView, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changedView, "changedView");
        com.ironsource.sdk.utils.Logger.i(this.f5624a, "onVisibilityChanged: " + i);
        com.ironsource.B8.a aVar = this.b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        com.ironsource.sdk.utils.Logger.i(this.f5624a, "onWindowVisibilityChanged: " + i);
        com.ironsource.B8.a aVar = this.b;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    public final void setListener$mediationsdk_release(com.ironsource.B8.a aVar) {
        this.b = aVar;
    }
}
