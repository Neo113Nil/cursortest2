package androidx.view;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aJ\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a>\u0010\u000b\u001a\u00060\tj\u0002`\n2\n\u0010\u0003\u001a\u00060\tj\u0002`\n2\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\r*\n\u0010\u000e\"\u00020\t2\u00020\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "", "", "p0", "Lkotlin/Function1;", "Landroidx/savedstate/SavedStateWriter;", "", "Lkotlin/ExtensionFunctionType;", "p1", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "savedState", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Landroid/os/Bundle;", "(Landroid/os/Bundle;Lkotlin/jvm/functions/Function1;)Landroid/os/Bundle;", "Camera2StreamConfigurationMap"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/savedstate/SavedStateKt")
/* loaded from: classes3.dex */
final /* synthetic */ class SavedStateKt__SavedState_androidKt {
    public static final android.os.Bundle savedState(java.util.Map<java.lang.String, ? extends java.lang.Object> map, kotlin.jvm.functions.Function1<? super androidx.view.SavedStateWriter, kotlin.Unit> function1) {
        kotlin.Pair[] pairArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (map.isEmpty()) {
            pairArr = new kotlin.Pair[0];
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
            for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
                arrayList.add(kotlin.TuplesKt.to(entry.getKey(), entry.getValue()));
            }
            pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
        }
        android.os.Bundle bundleOf = androidx.core.os.BundleKt.bundleOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
        function1.invoke(androidx.view.SavedStateWriter.m9380boximpl(androidx.view.SavedStateWriter.m9382constructorimpl(bundleOf)));
        return bundleOf;
    }

    public static final android.os.Bundle savedState(android.os.Bundle bundle, kotlin.jvm.functions.Function1<? super androidx.view.SavedStateWriter, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        function1.invoke(androidx.view.SavedStateWriter.m9380boximpl(androidx.view.SavedStateWriter.m9382constructorimpl(bundle2)));
        return bundle2;
    }

    public static /* synthetic */ android.os.Bundle savedState$default(android.os.Bundle bundle, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<androidx.view.SavedStateWriter, kotlin.Unit>() { // from class: androidx.savedstate.SavedStateKt__SavedState_androidKt$savedState$3
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.view.SavedStateWriter savedStateWriter) {
                    m9294invokexApjlu4(savedStateWriter.getGetHighSpeedVideoFpsRangesFor());
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke-xApjlu4, reason: not valid java name */
                public final void m9294invokexApjlu4(android.os.Bundle bundle2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle2, "");
                }
            };
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        android.os.Bundle bundle2 = new android.os.Bundle(bundle);
        function1.invoke(androidx.view.SavedStateWriter.m9380boximpl(androidx.view.SavedStateWriter.m9382constructorimpl(bundle2)));
        return bundle2;
    }

    public static /* synthetic */ android.os.Bundle savedState$default(java.util.Map map, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        kotlin.Pair[] pairArr;
        if ((i & 1) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<androidx.view.SavedStateWriter, kotlin.Unit>() { // from class: androidx.savedstate.SavedStateKt__SavedState_androidKt$savedState$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.view.SavedStateWriter savedStateWriter) {
                    m9293invokexApjlu4(savedStateWriter.getGetHighSpeedVideoFpsRangesFor());
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke-xApjlu4, reason: not valid java name */
                public final void m9293invokexApjlu4(android.os.Bundle bundle) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
                }
            };
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (map.isEmpty()) {
            pairArr = new kotlin.Pair[0];
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                arrayList.add(kotlin.TuplesKt.to((java.lang.String) entry.getKey(), entry.getValue()));
            }
            pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
        }
        android.os.Bundle bundleOf = androidx.core.os.BundleKt.bundleOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
        function1.invoke(androidx.view.SavedStateWriter.m9380boximpl(androidx.view.SavedStateWriter.m9382constructorimpl(bundleOf)));
        return bundleOf;
    }
}
