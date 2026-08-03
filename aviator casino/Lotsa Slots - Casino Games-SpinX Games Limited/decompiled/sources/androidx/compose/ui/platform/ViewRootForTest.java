package androidx.compose.ui.platform;

/* compiled from: ViewRootForTest.android.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\b\u0010\u000b\u001a\u00020\fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/ViewRootForTest;", "Landroidx/compose/ui/node/RootForTest;", "hasPendingMeasureOrLayout", "", "getHasPendingMeasureOrLayout", "()Z", "isLifecycleInResumedState", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "getView", "()Landroid/view/View;", "invalidateDescendants", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ViewRootForTest extends androidx.compose.ui.node.RootForTest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.platform.ViewRootForTest.Companion INSTANCE = androidx.compose.ui.platform.ViewRootForTest.Companion.$$INSTANCE;

    boolean getHasPendingMeasureOrLayout();

    android.view.View getView();

    void invalidateDescendants();

    boolean isLifecycleInResumedState();

    /* compiled from: ViewRootForTest.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R2\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/ViewRootForTest$Companion;", "", "()V", "onViewCreatedCallback", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/ViewRootForTest;", "", "getOnViewCreatedCallback$annotations", "getOnViewCreatedCallback", "()Lkotlin/jvm/functions/Function1;", "setOnViewCreatedCallback", "(Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.platform.ViewRootForTest.Companion $$INSTANCE = new androidx.compose.ui.platform.ViewRootForTest.Companion();
        private static kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.ViewRootForTest, kotlin.Unit> onViewCreatedCallback;

        public static /* synthetic */ void getOnViewCreatedCallback$annotations() {
        }

        private Companion() {
        }

        public final kotlin.jvm.functions.Function1<androidx.compose.ui.platform.ViewRootForTest, kotlin.Unit> getOnViewCreatedCallback() {
            return onViewCreatedCallback;
        }

        public final void setOnViewCreatedCallback(kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.ViewRootForTest, kotlin.Unit> function1) {
            onViewCreatedCallback = function1;
        }
    }
}
