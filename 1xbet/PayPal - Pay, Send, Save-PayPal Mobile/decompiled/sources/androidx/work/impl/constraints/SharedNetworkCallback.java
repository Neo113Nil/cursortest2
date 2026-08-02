package androidx.work.impl.constraints;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0003J;\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00172\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00122\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u0013j\u0002`\u0015¢\u0006\u0004\b\u0010\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR0\u0010 \u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u0013j\u0002`\u0015\u0012\u0004\u0012\u00020\u00120\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010$"}, d2 = {"Landroidx/work/impl/constraints/SharedNetworkCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "<init>", "()V", "Landroid/net/Network;", "p0", "Landroid/net/NetworkCapabilities;", "p1", "", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "", "onBlockedStatusChanged", "(Landroid/net/Network;Z)V", "onLost", "(Landroid/net/Network;)V", "getHighSpeedVideoFpsRanges", "Landroid/net/ConnectivityManager;", "Landroid/net/NetworkRequest;", "Lkotlin/Function1;", "Landroidx/work/impl/constraints/ConstraintsState;", "Landroidx/work/impl/constraints/OnConstraintState;", "p2", "Lkotlin/Function0;", "(Landroid/net/ConnectivityManager;Landroid/net/NetworkRequest;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;", "", "getOutputFormats", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Landroid/net/NetworkCapabilities;", "Z", "Ljava/lang/Boolean;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SharedNetworkCallback extends android.net.ConnectivityManager.NetworkCallback {
    public static android.net.NetworkCapabilities Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static java.lang.Boolean getHighSpeedVideoSizes;
    public static boolean getHighSpeedVideoFpsRanges;
    public static final androidx.work.impl.constraints.SharedNetworkCallback INSTANCE = new androidx.work.impl.constraints.SharedNetworkCallback();

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private static final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.util.Map<kotlin.jvm.functions.Function1<androidx.work.impl.constraints.ConstraintsState, kotlin.Unit>, android.net.NetworkRequest> getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap();

    private SharedNetworkCallback() {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(android.net.Network p0, android.net.NetworkCapabilities p1) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        androidx.work.Logger logger = androidx.work.Logger.get();
        str = androidx.work.impl.constraints.WorkConstraintsTrackerKt.getHighResolutionOutputSizeshNQ4ISI;
        logger.debug(str, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (getHighSpeedVideoFpsRangesFor) {
            Camera2StreamConfigurationMap = p1;
            getHighSpeedVideoFpsRanges = true;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        getHighSpeedVideoFpsRanges();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(android.net.Network p0, boolean p1) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        androidx.work.Logger logger = androidx.work.Logger.get();
        str = androidx.work.impl.constraints.WorkConstraintsTrackerKt.getHighResolutionOutputSizeshNQ4ISI;
        logger.debug(str, "NetworkRequestConstraintController onBlockedStatusChanged callback ".concat(java.lang.String.valueOf(p1)));
        synchronized (getHighSpeedVideoFpsRangesFor) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(getHighSpeedVideoSizes, java.lang.Boolean.valueOf(p1))) {
                return;
            }
            getHighSpeedVideoSizes = java.lang.Boolean.valueOf(p1);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            getHighSpeedVideoFpsRanges();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network p0) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        androidx.work.Logger logger = androidx.work.Logger.get();
        str = androidx.work.impl.constraints.WorkConstraintsTrackerKt.getHighResolutionOutputSizeshNQ4ISI;
        logger.debug(str, "NetworkRequestConstraintController onLost callback");
        synchronized (getHighSpeedVideoFpsRangesFor) {
            Camera2StreamConfigurationMap = null;
            java.util.Iterator<T> it = getHighResolutionOutputSizeshNQ4ISI.keySet().iterator();
            while (it.hasNext()) {
                ((kotlin.jvm.functions.Function1) it.next()).invoke(new androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet(7));
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private static void getHighSpeedVideoFpsRanges() {
        java.lang.String str;
        androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet constraintsNotMet;
        java.util.ArrayList<kotlin.Pair> arrayList = new java.util.ArrayList();
        synchronized (getHighSpeedVideoFpsRangesFor) {
            if (getHighSpeedVideoFpsRanges && getHighSpeedVideoSizes != null) {
                java.util.Iterator<T> it = getHighResolutionOutputSizeshNQ4ISI.entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) entry.getKey();
                    android.net.NetworkRequest networkRequest = (android.net.NetworkRequest) entry.getValue();
                    android.net.NetworkCapabilities networkCapabilities = Camera2StreamConfigurationMap;
                    java.lang.Boolean bool = getHighSpeedVideoSizes;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
                    if (!bool.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities)) {
                        constraintsNotMet = androidx.work.impl.constraints.ConstraintsState.ConstraintsMet.INSTANCE;
                    } else {
                        constraintsNotMet = new androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet(7);
                    }
                    arrayList.add(kotlin.TuplesKt.to(function1, constraintsNotMet));
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                for (kotlin.Pair pair : arrayList) {
                    ((kotlin.jvm.functions.Function1) pair.component1()).invoke((androidx.work.impl.constraints.ConstraintsState) pair.component2());
                }
                return;
            }
            androidx.work.Logger logger = androidx.work.Logger.get();
            str = androidx.work.impl.constraints.WorkConstraintsTrackerKt.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Not dispatching constraint state yet: isBlocked=");
            sb.append(getHighSpeedVideoSizes);
            sb.append(", capabilitiesInitialized=");
            sb.append(getHighSpeedVideoFpsRanges);
            logger.debug(str, sb.toString());
        }
    }

    public static kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges(final android.net.ConnectivityManager p0, android.net.NetworkRequest p1, final kotlin.jvm.functions.Function1<? super androidx.work.impl.constraints.ConstraintsState, kotlin.Unit> p2) {
        java.lang.String str;
        androidx.work.impl.constraints.ConstraintsState constraintsNotMet;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
        synchronized (getHighSpeedVideoFpsRangesFor) {
            java.util.Map<kotlin.jvm.functions.Function1<androidx.work.impl.constraints.ConstraintsState, kotlin.Unit>, android.net.NetworkRequest> map = getHighResolutionOutputSizeshNQ4ISI;
            boolean isEmpty = map.isEmpty();
            map.put(p2, p1);
            if (isEmpty) {
                androidx.work.Logger logger = androidx.work.Logger.get();
                str2 = androidx.work.impl.constraints.WorkConstraintsTrackerKt.getHighResolutionOutputSizeshNQ4ISI;
                logger.debug(str2, "NetworkRequestConstraintController register shared callback");
                p0.registerDefaultNetworkCallback(INSTANCE);
            } else if (getHighSpeedVideoFpsRanges && getHighSpeedVideoSizes != null) {
                androidx.work.Logger logger2 = androidx.work.Logger.get();
                str = androidx.work.impl.constraints.WorkConstraintsTrackerKt.getHighResolutionOutputSizeshNQ4ISI;
                logger2.debug(str, "NetworkRequestConstraintController send initial capabilities");
                android.net.NetworkCapabilities networkCapabilities = Camera2StreamConfigurationMap;
                java.lang.Boolean bool = getHighSpeedVideoSizes;
                kotlin.jvm.internal.Intrinsics.checkNotNull(bool);
                if (!bool.booleanValue() && p1.canBeSatisfiedBy(networkCapabilities)) {
                    constraintsNotMet = androidx.work.impl.constraints.ConstraintsState.ConstraintsMet.INSTANCE;
                } else {
                    constraintsNotMet = new androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet(7);
                }
                p2.invoke(constraintsNotMet);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.constraints.SharedNetworkCallback$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.work.impl.constraints.SharedNetworkCallback.getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1.this, p0);
                return highSpeedVideoFpsRanges;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(kotlin.jvm.functions.Function1 function1, android.net.ConnectivityManager connectivityManager) {
        java.lang.String str;
        synchronized (getHighSpeedVideoFpsRangesFor) {
            java.util.Map<kotlin.jvm.functions.Function1<androidx.work.impl.constraints.ConstraintsState, kotlin.Unit>, android.net.NetworkRequest> map = getHighResolutionOutputSizeshNQ4ISI;
            map.remove(function1);
            if (map.isEmpty()) {
                androidx.work.Logger logger = androidx.work.Logger.get();
                str = androidx.work.impl.constraints.WorkConstraintsTrackerKt.getHighResolutionOutputSizeshNQ4ISI;
                logger.debug(str, "NetworkRequestConstraintController unregister shared callback");
                connectivityManager.unregisterNetworkCallback(INSTANCE);
                getHighSpeedVideoSizes = null;
                Camera2StreamConfigurationMap = null;
                getHighSpeedVideoFpsRanges = false;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }
}
