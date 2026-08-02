package androidx.view;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0003R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/lifecycle/ViewModelStore;", "", "<init>", "()V", "", "key", "Landroidx/lifecycle/ViewModel;", "viewModel", "", "put", "(Ljava/lang/String;Landroidx/lifecycle/ViewModel;)V", "get", "(Ljava/lang/String;)Landroidx/lifecycle/ViewModel;", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "()Ljava/util/Set;", "clear", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class ViewModelStore {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, androidx.view.ViewModel> getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap();

    public final void put(java.lang.String key, androidx.view.ViewModel viewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "");
        androidx.view.ViewModel put = this.getHighResolutionOutputSizeshNQ4ISI.put(key, viewModel);
        if (put != null) {
            put.clear$lifecycle_viewmodel();
        }
    }

    public final androidx.view.ViewModel get(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.get(key);
    }

    public final java.util.Set<java.lang.String> keys() {
        return new java.util.HashSet(this.getHighResolutionOutputSizeshNQ4ISI.keySet());
    }

    public final void clear() {
        java.util.Iterator<androidx.view.ViewModel> it = this.getHighResolutionOutputSizeshNQ4ISI.values().iterator();
        while (it.hasNext()) {
            it.next().clear$lifecycle_viewmodel();
        }
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
    }
}
