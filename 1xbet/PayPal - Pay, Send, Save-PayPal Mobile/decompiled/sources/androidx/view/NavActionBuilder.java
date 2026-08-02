package androidx.view;

@androidx.view.NavDestinationDsl
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u00020\u00062\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/navigation/NavActionBuilder;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/navigation/NavOptionsBuilder;", "", "Lkotlin/ExtensionFunctionType;", "optionsBuilder", "navOptions", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/navigation/NavAction;", "build$navigation_common_release", "()Landroidx/navigation/NavAction;", "", "destinationId", com.visa.cbp.getEncExpo.warmup, "getDestinationId", "()I", "setDestinationId", "(I)V", "", "", "defaultArguments", "Ljava/util/Map;", "getDefaultArguments", "()Ljava/util/Map;", "Landroidx/navigation/NavOptions;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/navigation/NavOptions;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavActionBuilder {
    private final java.util.Map<java.lang.String, java.lang.Object> defaultArguments = new java.util.LinkedHashMap();
    private int destinationId;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.view.NavOptions Camera2StreamConfigurationMap;

    public final int getDestinationId() {
        return this.destinationId;
    }

    public final void setDestinationId(int i) {
        this.destinationId = i;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getDefaultArguments() {
        return this.defaultArguments;
    }

    public final void navOptions(kotlin.jvm.functions.Function1<? super androidx.view.NavOptionsBuilder, kotlin.Unit> optionsBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionsBuilder, "");
        androidx.view.NavOptionsBuilder navOptionsBuilder = new androidx.view.NavOptionsBuilder();
        optionsBuilder.invoke(navOptionsBuilder);
        this.Camera2StreamConfigurationMap = navOptionsBuilder.build$navigation_common_release();
    }

    public final androidx.view.NavAction build$navigation_common_release() {
        kotlin.Pair[] pairArr;
        android.os.Bundle bundleOf;
        int i = this.destinationId;
        androidx.view.NavOptions navOptions = this.Camera2StreamConfigurationMap;
        if (this.defaultArguments.isEmpty()) {
            bundleOf = null;
        } else {
            java.util.Map<java.lang.String, java.lang.Object> map = this.defaultArguments;
            if (map.isEmpty()) {
                pairArr = new kotlin.Pair[0];
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
                for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
                    arrayList.add(kotlin.TuplesKt.to(entry.getKey(), entry.getValue()));
                }
                pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
            }
            bundleOf = androidx.core.os.BundleKt.bundleOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
            androidx.view.SavedStateWriter.m9382constructorimpl(bundleOf);
        }
        return new androidx.view.NavAction(i, navOptions, bundleOf);
    }
}
