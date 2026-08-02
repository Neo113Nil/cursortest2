package androidx.work.impl.constraints;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B!\b\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/work/impl/constraints/IndividualNetworkCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lkotlin/Function1;", "Landroidx/work/impl/constraints/ConstraintsState;", "", "Landroidx/work/impl/constraints/OnConstraintState;", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/net/Network;", "Landroid/net/NetworkCapabilities;", "p1", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class IndividualNetworkCallback extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.work.impl.constraints.IndividualNetworkCallback.Companion INSTANCE = new androidx.work.impl.constraints.IndividualNetworkCallback.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.work.impl.constraints.ConstraintsState, kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    private IndividualNetworkCallback(kotlin.jvm.functions.Function1<? super androidx.work.impl.constraints.ConstraintsState, kotlin.Unit> function1) {
        this.getHighSpeedVideoFpsRanges = function1;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(android.net.Network p0, android.net.NetworkCapabilities p1) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        androidx.work.Logger logger = androidx.work.Logger.get();
        str = androidx.work.impl.constraints.WorkConstraintsTrackerKt.getHighResolutionOutputSizeshNQ4ISI;
        logger.debug(str, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.getHighSpeedVideoFpsRanges.invoke(androidx.work.impl.constraints.ConstraintsState.ConstraintsMet.INSTANCE);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network p0) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        androidx.work.Logger logger = androidx.work.Logger.get();
        str = androidx.work.impl.constraints.WorkConstraintsTrackerKt.getHighResolutionOutputSizeshNQ4ISI;
        logger.debug(str, "NetworkRequestConstraintController onLost callback");
        this.getHighSpeedVideoFpsRanges.invoke(new androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet(7));
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/work/impl/constraints/IndividualNetworkCallback$Companion;", "", "<init>", "()V", "Landroid/net/ConnectivityManager;", "connManager", "Landroid/net/NetworkRequest;", "networkRequest", "Lkotlin/Function1;", "Landroidx/work/impl/constraints/ConstraintsState;", "", "Landroidx/work/impl/constraints/OnConstraintState;", "onConstraintState", "Lkotlin/Function0;", "addCallback", "(Landroid/net/ConnectivityManager;Landroid/net/NetworkRequest;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlin.jvm.functions.Function0<kotlin.Unit> addCallback(final android.net.ConnectivityManager connManager, android.net.NetworkRequest networkRequest, kotlin.jvm.functions.Function1<? super androidx.work.impl.constraints.ConstraintsState, kotlin.Unit> onConstraintState) {
            java.lang.String str;
            java.lang.String str2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkRequest, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onConstraintState, "");
            final androidx.work.impl.constraints.IndividualNetworkCallback individualNetworkCallback = new androidx.work.impl.constraints.IndividualNetworkCallback(onConstraintState, null);
            final kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
            try {
                androidx.work.Logger logger = androidx.work.Logger.get();
                str2 = androidx.work.impl.constraints.WorkConstraintsTrackerKt.getHighResolutionOutputSizeshNQ4ISI;
                logger.debug(str2, "NetworkRequestConstraintController register callback");
                connManager.registerNetworkCallback(networkRequest, individualNetworkCallback);
                booleanRef.element = true;
            } catch (java.lang.RuntimeException e) {
                java.lang.String name2 = e.getClass().getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                if (kotlin.text.StringsKt.endsWith$default(name2, "TooManyRequestsException", false, 2, (java.lang.Object) null)) {
                    androidx.work.Logger logger2 = androidx.work.Logger.get();
                    str = androidx.work.impl.constraints.WorkConstraintsTrackerKt.getHighResolutionOutputSizeshNQ4ISI;
                    logger2.debug(str, "NetworkRequestConstraintController couldn't register callback", e);
                    onConstraintState.invoke(new androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet(7));
                } else {
                    throw e;
                }
            }
            return new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.constraints.IndividualNetworkCallback$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.work.impl.constraints.IndividualNetworkCallback.Companion.m9478$r8$lambda$1NfazpWnJwNEPqnnRro2tZElFI(kotlin.jvm.internal.Ref.BooleanRef.this, connManager, individualNetworkCallback);
                }
            };
        }

        /* renamed from: $r8$lambda$1NfazpWnJwNEPqnnR-ro2tZElFI, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m9478$r8$lambda$1NfazpWnJwNEPqnnRro2tZElFI(kotlin.jvm.internal.Ref.BooleanRef booleanRef, android.net.ConnectivityManager connectivityManager, androidx.work.impl.constraints.IndividualNetworkCallback individualNetworkCallback) {
            java.lang.String str;
            if (booleanRef.element) {
                androidx.work.Logger logger = androidx.work.Logger.get();
                str = androidx.work.impl.constraints.WorkConstraintsTrackerKt.getHighResolutionOutputSizeshNQ4ISI;
                logger.debug(str, "NetworkRequestConstraintController unregister callback");
                connectivityManager.unregisterNetworkCallback(individualNetworkCallback);
            }
            return kotlin.Unit.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ IndividualNetworkCallback(kotlin.jvm.functions.Function1 function1, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function1);
    }
}
