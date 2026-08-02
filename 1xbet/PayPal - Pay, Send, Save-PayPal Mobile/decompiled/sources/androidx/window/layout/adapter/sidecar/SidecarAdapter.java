package androidx.window.layout.adapter.sidecar;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u0006\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\fJ\u001a\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\fJ\u001a\u0010\u0015\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fJ(\u0010\u0016\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u0002J\u001c\u0010\u0017\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0002J\u001f\u0010\u0006\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarAdapter;", "", "verificationMode", "Landroidx/window/core/VerificationMode;", "<init>", "(Landroidx/window/core/VerificationMode;)V", "translate", "", "Landroidx/window/layout/DisplayFeature;", "sidecarDisplayFeatures", "Landroidx/window/sidecar/SidecarDisplayFeature;", "deviceState", "Landroidx/window/sidecar/SidecarDeviceState;", "Landroidx/window/layout/WindowLayoutInfo;", "extensionInfo", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "state", "isEqualSidecarDeviceState", "", "first", "second", "isEqualSidecarWindowLayoutInfo", "isEqualSidecarDisplayFeatures", "isEqualSidecarDisplayFeature", "feature", "translate$window_release", "Companion", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SidecarAdapter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.layout.adapter.sidecar.SidecarAdapter.Companion INSTANCE = new androidx.window.layout.adapter.sidecar.SidecarAdapter.Companion(null);
    private static final java.lang.String getHighSpeedVideoFpsRangesFor = "SidecarAdapter";
    private final androidx.window.core.VerificationMode getHighResolutionOutputSizeshNQ4ISI;

    public SidecarAdapter(androidx.window.core.VerificationMode verificationMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationMode, "");
        this.getHighResolutionOutputSizeshNQ4ISI = verificationMode;
    }

    public /* synthetic */ SidecarAdapter(androidx.window.core.VerificationMode verificationMode, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.window.core.VerificationMode.QUIET : verificationMode);
    }

    public final java.util.List<androidx.window.layout.DisplayFeature> translate(java.util.List<androidx.window.sidecar.SidecarDisplayFeature> sidecarDisplayFeatures, androidx.window.sidecar.SidecarDeviceState deviceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sidecarDisplayFeatures, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceState, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            androidx.window.layout.DisplayFeature translate$window_release = translate$window_release((androidx.window.sidecar.SidecarDisplayFeature) it.next(), deviceState);
            if (translate$window_release != null) {
                arrayList.add(translate$window_release);
            }
        }
        return arrayList;
    }

    public final androidx.window.layout.WindowLayoutInfo translate(androidx.window.sidecar.SidecarWindowLayoutInfo extensionInfo, androidx.window.sidecar.SidecarDeviceState state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        if (extensionInfo == null) {
            return new androidx.window.layout.WindowLayoutInfo(kotlin.collections.CollectionsKt.emptyList());
        }
        androidx.window.sidecar.SidecarDeviceState sidecarDeviceState = new androidx.window.sidecar.SidecarDeviceState();
        androidx.window.layout.adapter.sidecar.SidecarAdapter.Companion companion = INSTANCE;
        companion.setSidecarDevicePosture(sidecarDeviceState, companion.getSidecarDevicePosture$window_release(state));
        return new androidx.window.layout.WindowLayoutInfo(translate(companion.getSidecarDisplayFeatures(extensionInfo), sidecarDeviceState));
    }

    public final boolean isEqualSidecarDeviceState(androidx.window.sidecar.SidecarDeviceState first, androidx.window.sidecar.SidecarDeviceState second) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(first, second)) {
            return true;
        }
        if (first == null || second == null) {
            return false;
        }
        androidx.window.layout.adapter.sidecar.SidecarAdapter.Companion companion = INSTANCE;
        return companion.getSidecarDevicePosture$window_release(first) == companion.getSidecarDevicePosture$window_release(second);
    }

    public final boolean isEqualSidecarWindowLayoutInfo(androidx.window.sidecar.SidecarWindowLayoutInfo first, androidx.window.sidecar.SidecarWindowLayoutInfo second) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(first, second)) {
            return true;
        }
        if (first == null || second == null) {
            return false;
        }
        androidx.window.layout.adapter.sidecar.SidecarAdapter.Companion companion = INSTANCE;
        java.util.List<androidx.window.sidecar.SidecarDisplayFeature> sidecarDisplayFeatures = companion.getSidecarDisplayFeatures(first);
        java.util.List<androidx.window.sidecar.SidecarDisplayFeature> sidecarDisplayFeatures2 = companion.getSidecarDisplayFeatures(second);
        if (sidecarDisplayFeatures != sidecarDisplayFeatures2) {
            if (sidecarDisplayFeatures == null || sidecarDisplayFeatures2 == null || sidecarDisplayFeatures.size() != sidecarDisplayFeatures2.size()) {
                return false;
            }
            int size = sidecarDisplayFeatures.size();
            for (int i = 0; i < size; i++) {
                androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature = sidecarDisplayFeatures.get(i);
                androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature2 = sidecarDisplayFeatures2.get(i);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(sidecarDisplayFeature, sidecarDisplayFeature2) && (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType() || !kotlin.jvm.internal.Intrinsics.areEqual(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final androidx.window.layout.DisplayFeature translate$window_release(androidx.window.sidecar.SidecarDisplayFeature feature, androidx.window.sidecar.SidecarDeviceState deviceState) {
        androidx.window.layout.HardwareFoldingFeature.Type fold;
        androidx.window.layout.FoldingFeature.State state;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceState, "");
        androidx.window.core.SpecificationComputer.Companion companion = androidx.window.core.SpecificationComputer.INSTANCE;
        java.lang.String str = getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature = (androidx.window.sidecar.SidecarDisplayFeature) androidx.window.core.SpecificationComputer.Companion.startSpecification$default(companion, feature, str, this.getHighResolutionOutputSizeshNQ4ISI, null, 4, null).require("Type must be either TYPE_FOLD or TYPE_HINGE", new kotlin.jvm.functions.Function1() { // from class: androidx.window.layout.adapter.sidecar.SidecarAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.window.layout.adapter.sidecar.SidecarAdapter.$r8$lambda$YVmqYLnLkldCr_VN6_GXOGPTryU((androidx.window.sidecar.SidecarDisplayFeature) obj));
            }
        }).require("Feature bounds must not be 0", new kotlin.jvm.functions.Function1() { // from class: androidx.window.layout.adapter.sidecar.SidecarAdapter$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.window.layout.adapter.sidecar.SidecarAdapter.$r8$lambda$rnV1cNsmMNc4uNdHq8rE9YjGd8s((androidx.window.sidecar.SidecarDisplayFeature) obj));
            }
        }).require("TYPE_FOLD must have 0 area", new kotlin.jvm.functions.Function1() { // from class: androidx.window.layout.adapter.sidecar.SidecarAdapter$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.window.layout.adapter.sidecar.SidecarAdapter.$r8$lambda$qv14vYXib_KwxuSGN94r0A1H330((androidx.window.sidecar.SidecarDisplayFeature) obj));
            }
        }).require("Feature be pinned to either left or top", new kotlin.jvm.functions.Function1() { // from class: androidx.window.layout.adapter.sidecar.SidecarAdapter$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.window.layout.adapter.sidecar.SidecarAdapter.$r8$lambda$3nBcUBMClXWI4wwSWaRuDrxNurg((androidx.window.sidecar.SidecarDisplayFeature) obj));
            }
        }).compute();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            fold = androidx.window.layout.HardwareFoldingFeature.Type.INSTANCE.getFOLD();
        } else {
            if (type != 2) {
                return null;
            }
            fold = androidx.window.layout.HardwareFoldingFeature.Type.INSTANCE.getHINGE();
        }
        int sidecarDevicePosture$window_release = INSTANCE.getSidecarDevicePosture$window_release(deviceState);
        if (sidecarDevicePosture$window_release == 0 || sidecarDevicePosture$window_release == 1) {
            return null;
        }
        if (sidecarDevicePosture$window_release == 2) {
            state = androidx.window.layout.FoldingFeature.State.HALF_OPENED;
        } else if (sidecarDevicePosture$window_release == 3) {
            state = androidx.window.layout.FoldingFeature.State.FLAT;
        } else {
            if (sidecarDevicePosture$window_release == 4) {
                return null;
            }
            state = androidx.window.layout.FoldingFeature.State.FLAT;
        }
        android.graphics.Rect rect = feature.getRect();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rect, "");
        return new androidx.window.layout.HardwareFoldingFeature(new androidx.window.core.Bounds(rect), fold, state);
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0007J\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0010H\u0007R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarAdapter$Companion;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getSidecarDisplayFeatures", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "info", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "setSidecarDisplayFeatures", "", "displayFeatures", "getSidecarDevicePosture", "", "sidecarDeviceState", "Landroidx/window/sidecar/SidecarDeviceState;", "getSidecarDevicePosture$window_release", "getRawSidecarDevicePosture", "setSidecarDevicePosture", "posture", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.List<androidx.window.sidecar.SidecarDisplayFeature> getSidecarDisplayFeatures(androidx.window.sidecar.SidecarWindowLayoutInfo info) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
            try {
                try {
                    java.util.List<androidx.window.sidecar.SidecarDisplayFeature> list = info.displayFeatures;
                    return list == null ? kotlin.collections.CollectionsKt.emptyList() : list;
                } catch (java.lang.NoSuchFieldError unused) {
                    java.lang.Object invoke = androidx.window.sidecar.SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new java.lang.Class[0]).invoke(info, new java.lang.Object[0]);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
                    return (java.util.List) invoke;
                }
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
        }

        public final void setSidecarDisplayFeatures(androidx.window.sidecar.SidecarWindowLayoutInfo info, java.util.List<androidx.window.sidecar.SidecarDisplayFeature> displayFeatures) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayFeatures, "");
            try {
                info.displayFeatures = displayFeatures;
            } catch (java.lang.NoSuchFieldError unused) {
                try {
                    androidx.window.sidecar.SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", java.util.List.class).invoke(info, displayFeatures);
                } catch (java.lang.IllegalAccessException unused2) {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } catch (java.lang.NoSuchMethodException unused3) {
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                } catch (java.lang.reflect.InvocationTargetException unused4) {
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                }
            }
        }

        public final int getSidecarDevicePosture$window_release(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sidecarDeviceState, "");
            int rawSidecarDevicePosture = getRawSidecarDevicePosture(sidecarDeviceState);
            if (rawSidecarDevicePosture < 0 || rawSidecarDevicePosture > 4) {
                return 0;
            }
            return rawSidecarDevicePosture;
        }

        public final int getRawSidecarDevicePosture(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sidecarDeviceState, "");
            try {
                return sidecarDeviceState.posture;
            } catch (java.lang.NoSuchFieldError unused) {
                try {
                    java.lang.Object invoke = androidx.window.sidecar.SidecarDeviceState.class.getMethod("getPosture", new java.lang.Class[0]).invoke(sidecarDeviceState, new java.lang.Object[0]);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
                    return ((java.lang.Integer) invoke).intValue();
                } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        public final void setSidecarDevicePosture(androidx.window.sidecar.SidecarDeviceState sidecarDeviceState, int posture) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sidecarDeviceState, "");
            try {
                sidecarDeviceState.posture = posture;
            } catch (java.lang.NoSuchFieldError unused) {
                try {
                    androidx.window.sidecar.SidecarDeviceState.class.getMethod("setPosture", java.lang.Integer.TYPE).invoke(sidecarDeviceState, java.lang.Integer.valueOf(posture));
                } catch (java.lang.IllegalAccessException unused2) {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } catch (java.lang.NoSuchMethodException unused3) {
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                } catch (java.lang.reflect.InvocationTargetException unused4) {
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                }
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ boolean $r8$lambda$3nBcUBMClXWI4wwSWaRuDrxNurg(androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sidecarDisplayFeature, "");
        return sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0;
    }

    public static /* synthetic */ boolean $r8$lambda$YVmqYLnLkldCr_VN6_GXOGPTryU(androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sidecarDisplayFeature, "");
        return sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2;
    }

    public static /* synthetic */ boolean $r8$lambda$qv14vYXib_KwxuSGN94r0A1H330(androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sidecarDisplayFeature, "");
        return sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0;
    }

    public static /* synthetic */ boolean $r8$lambda$rnV1cNsmMNc4uNdHq8rE9YjGd8s(androidx.window.sidecar.SidecarDisplayFeature sidecarDisplayFeature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sidecarDisplayFeature, "");
        return (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SidecarAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
