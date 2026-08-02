package kotlin.reflect.jvm.internal.impl.utils;

/* loaded from: classes5.dex */
public final class FunctionsKt {
    private static final kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Object> getOutputMinFrameDuration = new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$$Lambda$3
        @Override // kotlin.jvm.functions.Function1
        public java.lang.Object invoke(java.lang.Object obj) {
            return kotlin.reflect.jvm.internal.impl.utils.FunctionsKt.getHighResolutionOutputSizeshNQ4ISI(obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> Camera2StreamConfigurationMap = new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$$Lambda$4
        @Override // kotlin.jvm.functions.Function1
        public java.lang.Object invoke(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.utils.FunctionsKt.getHighSpeedVideoFpsRanges());
        }
    };
    private static final kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI = new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$ALWAYS_NULL$1
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            return null;
        }
    };
    private static final kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> getHighSpeedVideoFpsRanges = new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$$Lambda$5
        @Override // kotlin.jvm.functions.Function1
        public java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit unit;
            unit = kotlin.Unit.INSTANCE;
            return unit;
        }
    };
    private static final kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, kotlin.Unit> getHighSpeedVideoSizes = new kotlin.jvm.functions.Function2() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$$Lambda$6
        @Override // kotlin.jvm.functions.Function2
        public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            kotlin.Unit unit;
            unit = kotlin.Unit.INSTANCE;
            return unit;
        }
    };
    private static final kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, kotlin.Unit> getHighSpeedVideoFpsRangesFor = new kotlin.jvm.functions.Function3() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$$Lambda$7
        @Override // kotlin.jvm.functions.Function3
        public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            kotlin.Unit unit;
            unit = kotlin.Unit.INSTANCE;
            return unit;
        }
    };

    static /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
        return obj;
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRanges() {
        return true;
    }

    public static final <T> kotlin.jvm.functions.Function1<T, java.lang.Boolean> alwaysTrue() {
        return (kotlin.jvm.functions.Function1<T, java.lang.Boolean>) Camera2StreamConfigurationMap;
    }

    public static final kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, kotlin.Unit> getDO_NOTHING_3() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
