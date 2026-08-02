package androidx.core.view;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class ViewKt$ancestors$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<android.view.ViewParent, android.view.ViewParent> {
    public static final androidx.core.view.ViewKt$ancestors$1 Camera2StreamConfigurationMap = new androidx.core.view.ViewKt$ancestors$1();

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public final android.view.ViewParent invoke(android.view.ViewParent viewParent) {
        return viewParent.getParent();
    }

    ViewKt$ancestors$1() {
        super(1, android.view.ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }
}
