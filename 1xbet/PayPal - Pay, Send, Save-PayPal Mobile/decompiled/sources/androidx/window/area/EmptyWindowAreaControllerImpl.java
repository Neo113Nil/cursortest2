package androidx.window.area;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/window/area/EmptyWindowAreaControllerImpl;", "Landroidx/window/area/WindowAreaController;", "<init>", "()V", "Landroid/os/Binder;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/window/area/WindowAreaSessionCallback;", "windowAreaSessionCallback", "", "transferActivityToWindowArea", "(Landroid/os/Binder;Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/window/area/WindowAreaSessionCallback;)V", "Landroidx/window/area/WindowAreaPresentationSessionCallback;", "windowAreaPresentationSessionCallback", "presentContentOnWindowArea", "(Landroid/os/Binder;Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/window/area/WindowAreaPresentationSessionCallback;)V", "Lkotlinx/coroutines/flow/Flow;", "", "Landroidx/window/area/WindowAreaInfo;", "getWindowAreaInfos", "()Lkotlinx/coroutines/flow/Flow;", "windowAreaInfos"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EmptyWindowAreaControllerImpl extends androidx.window.area.WindowAreaController {
    @Override // androidx.window.area.WindowAreaController
    public final kotlinx.coroutines.flow.Flow<java.util.List<androidx.window.area.WindowAreaInfo>> getWindowAreaInfos() {
        return kotlinx.coroutines.flow.FlowKt.flowOf(kotlin.collections.CollectionsKt.emptyList());
    }

    @Override // androidx.window.area.WindowAreaController
    public final void transferActivityToWindowArea(android.os.Binder token, android.app.Activity activity, java.util.concurrent.Executor executor, androidx.window.area.WindowAreaSessionCallback windowAreaSessionCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowAreaSessionCallback, "");
        windowAreaSessionCallback.onSessionEnded(new java.lang.IllegalStateException("There are no WindowAreas"));
    }

    @Override // androidx.window.area.WindowAreaController
    public final void presentContentOnWindowArea(android.os.Binder token, android.app.Activity activity, java.util.concurrent.Executor executor, androidx.window.area.WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowAreaPresentationSessionCallback, "");
        windowAreaPresentationSessionCallback.onSessionEnded(new java.lang.IllegalStateException("There are no WindowAreas"));
    }
}
