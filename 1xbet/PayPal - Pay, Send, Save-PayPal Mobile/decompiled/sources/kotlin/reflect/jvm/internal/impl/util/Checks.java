package kotlin.reflect.jvm.internal.impl.util;

/* loaded from: classes5.dex */
public final class Checks {
    private final kotlin.reflect.jvm.internal.impl.util.Check[] Camera2StreamConfigurationMap;
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name> getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.name.Name getHighSpeedVideoFpsRangesFor;
    private final kotlin.text.Regex getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    private Checks(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.text.Regex regex, java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name> collection, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.String> function1, kotlin.reflect.jvm.internal.impl.util.Check... checkArr) {
        this.getHighSpeedVideoFpsRangesFor = name2;
        this.getHighSpeedVideoSizes = regex;
        this.getHighSpeedVideoFpsRanges = collection;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.Camera2StreamConfigurationMap = checkArr;
    }

    public final boolean isApplicable(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
        if (this.getHighSpeedVideoFpsRangesFor != null && !kotlin.jvm.internal.Intrinsics.areEqual(functionDescriptor.getName(), this.getHighSpeedVideoFpsRangesFor)) {
            return false;
        }
        if (this.getHighSpeedVideoSizes != null) {
            java.lang.String asString = functionDescriptor.getName().asString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
            if (!this.getHighSpeedVideoSizes.matches(asString)) {
                return false;
            }
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name> collection = this.getHighSpeedVideoFpsRanges;
        return collection == null || collection.contains(functionDescriptor.getName());
    }

    public final kotlin.reflect.jvm.internal.impl.util.CheckResult checkAll(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
        for (kotlin.reflect.jvm.internal.impl.util.Check check : this.Camera2StreamConfigurationMap) {
            java.lang.String invoke = check.invoke(functionDescriptor);
            if (invoke != null) {
                return new kotlin.reflect.jvm.internal.impl.util.CheckResult.IllegalSignature(invoke);
            }
        }
        java.lang.String invoke2 = this.getHighResolutionOutputSizeshNQ4ISI.invoke(functionDescriptor);
        if (invoke2 != null) {
            return new kotlin.reflect.jvm.internal.impl.util.CheckResult.IllegalSignature(invoke2);
        }
        return kotlin.reflect.jvm.internal.impl.util.CheckResult.SuccessCheck.INSTANCE;
    }

    public /* synthetic */ Checks(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.util.Check[] checkArr, kotlin.reflect.jvm.internal.impl.util.Checks.AnonymousClass2 anonymousClass2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(name2, checkArr, (kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.String>) ((i & 4) != 0 ? new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.util.Checks.2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) obj, "");
                return null;
            }
        } : anonymousClass2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.util.Check[] checkArr, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.String> function1) {
        this(name2, (kotlin.text.Regex) null, (java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name>) null, function1, (kotlin.reflect.jvm.internal.impl.util.Check[]) java.util.Arrays.copyOf(checkArr, checkArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
    }

    public /* synthetic */ Checks(kotlin.text.Regex regex, kotlin.reflect.jvm.internal.impl.util.Check[] checkArr, kotlin.reflect.jvm.internal.impl.util.Checks.AnonymousClass3 anonymousClass3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(regex, checkArr, (kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.String>) ((i & 4) != 0 ? new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.util.Checks.3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) obj, "");
                return null;
            }
        } : anonymousClass3));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(kotlin.text.Regex regex, kotlin.reflect.jvm.internal.impl.util.Check[] checkArr, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.String> function1) {
        this((kotlin.reflect.jvm.internal.impl.name.Name) null, regex, (java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name>) null, function1, (kotlin.reflect.jvm.internal.impl.util.Check[]) java.util.Arrays.copyOf(checkArr, checkArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regex, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
    }

    public /* synthetic */ Checks(java.util.Collection collection, kotlin.reflect.jvm.internal.impl.util.Check[] checkArr, kotlin.reflect.jvm.internal.impl.util.Checks.AnonymousClass4 anonymousClass4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name>) collection, checkArr, (kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.String>) ((i & 4) != 0 ? new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.util.Checks.4
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) obj, "");
                return null;
            }
        } : anonymousClass4));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name> collection, kotlin.reflect.jvm.internal.impl.util.Check[] checkArr, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.String> function1) {
        this((kotlin.reflect.jvm.internal.impl.name.Name) null, (kotlin.text.Regex) null, collection, function1, (kotlin.reflect.jvm.internal.impl.util.Check[]) java.util.Arrays.copyOf(checkArr, checkArr.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
    }
}
