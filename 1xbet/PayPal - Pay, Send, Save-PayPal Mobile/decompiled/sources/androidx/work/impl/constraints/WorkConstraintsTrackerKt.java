package androidx.work.impl.constraints;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a)\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e\"\u0019\u0010\u0013\u001a\u00070\u000f¢\u0006\u0002\b\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012*$\b\u0002\u0010\u0017\"\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014"}, d2 = {"Landroidx/work/impl/constraints/WorkConstraintsTracker;", "Landroidx/work/impl/model/WorkSpec;", "spec", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Landroidx/work/impl/constraints/OnConstraintsStateChangedListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlinx/coroutines/Job;", "listen", "(Landroidx/work/impl/constraints/WorkConstraintsTracker;Landroidx/work/impl/model/WorkSpec;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/work/impl/constraints/OnConstraintsStateChangedListener;)Lkotlinx/coroutines/Job;", "Landroid/content/Context;", "context", "Landroidx/work/impl/constraints/NetworkRequestConstraintController;", "NetworkRequestConstraintController", "(Landroid/content/Context;)Landroidx/work/impl/constraints/NetworkRequestConstraintController;", "", "Lorg/jspecify/annotations/NonNull;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Function1;", "Landroidx/work/impl/constraints/ConstraintsState;", "", "OnConstraintState"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkConstraintsTrackerKt {
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    public static final kotlinx.coroutines.Job listen(androidx.work.impl.constraints.WorkConstraintsTracker workConstraintsTracker, androidx.work.impl.model.WorkSpec workSpec, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, androidx.work.impl.constraints.OnConstraintsStateChangedListener onConstraintsStateChangedListener) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workConstraintsTracker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workSpec, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onConstraintsStateChangedListener, "");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineDispatcher), null, null, new androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1(workConstraintsTracker, workSpec, onConstraintsStateChangedListener, null), 3, null);
        return launch$default;
    }

    static {
        java.lang.String tagWithPrefix = androidx.work.Logger.tagWithPrefix("WorkConstraintsTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "");
        getHighResolutionOutputSizeshNQ4ISI = tagWithPrefix;
    }

    public static final androidx.work.impl.constraints.NetworkRequestConstraintController NetworkRequestConstraintController(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("connectivity");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        return new androidx.work.impl.constraints.NetworkRequestConstraintController((android.net.ConnectivityManager) systemService, 0L, 2, null);
    }

    public static final /* synthetic */ java.util.List access$createControllers(androidx.work.impl.constraints.trackers.Trackers trackers) {
        java.util.List mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(new androidx.work.impl.constraints.controllers.BatteryChargingController(trackers.getBatteryChargingTracker()), new androidx.work.impl.constraints.controllers.BatteryNotLowController(trackers.getBatteryNotLowTracker()), new androidx.work.impl.constraints.controllers.StorageNotLowController(trackers.getStorageNotLowTracker()));
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            mutableListOf.add(NetworkRequestConstraintController(trackers.getContext()));
            return mutableListOf;
        }
        androidx.work.impl.constraints.trackers.ConstraintTracker<androidx.work.impl.constraints.NetworkState> networkStateTracker = trackers.getNetworkStateTracker();
        kotlin.jvm.internal.Intrinsics.checkNotNull(networkStateTracker);
        mutableListOf.addAll(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.work.impl.constraints.controllers.BaseConstraintController[]{new androidx.work.impl.constraints.controllers.NetworkConnectedControllerPre28(networkStateTracker), new androidx.work.impl.constraints.controllers.NetworkUnmeteredControllerPre28(trackers.getNetworkStateTracker()), new androidx.work.impl.constraints.controllers.NetworkNotRoamingControllerPre28(trackers.getNetworkStateTracker()), new androidx.work.impl.constraints.controllers.NetworkMeteredControllerPre28(trackers.getNetworkStateTracker())}));
        return mutableListOf;
    }
}
