package androidx.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u001e\u0010\u0017\u001a\u00060\u0015j\u0002`\u00168\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/navigation/ActionOnlyNavDirections;", "Landroidx/navigation/NavDirections;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, "<init>", "(I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "component1", "copy", "(I)Landroidx/navigation/ActionOnlyNavDirections;", com.visa.cbp.getEncExpo.warmup, "getActionId", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "arguments", "Landroid/os/Bundle;", "getArguments", "()Landroid/os/Bundle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ActionOnlyNavDirections implements androidx.view.NavDirections {
    private final int actionId;
    private final android.os.Bundle arguments;

    public ActionOnlyNavDirections(int i) {
        kotlin.Pair[] pairArr;
        this.actionId = i;
        java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
        if (emptyMap.isEmpty()) {
            pairArr = new kotlin.Pair[0];
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(emptyMap.size());
            for (java.util.Map.Entry entry : emptyMap.entrySet()) {
                arrayList.add(kotlin.TuplesKt.to((java.lang.String) entry.getKey(), entry.getValue()));
            }
            pairArr = (kotlin.Pair[]) arrayList.toArray(new kotlin.Pair[0]);
        }
        android.os.Bundle bundleOf = androidx.core.os.BundleKt.bundleOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length));
        androidx.view.SavedStateWriter.m9382constructorimpl(bundleOf);
        this.arguments = bundleOf;
    }

    @Override // androidx.view.NavDirections
    public final int getActionId() {
        return this.actionId;
    }

    @Override // androidx.view.NavDirections
    public final android.os.Bundle getArguments() {
        return this.arguments;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return other != null && kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other.getClass()) && getActionId() == ((androidx.view.ActionOnlyNavDirections) other).getActionId();
    }

    public final int hashCode() {
        return getActionId() + 31;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActionOnlyNavDirections(actionId=");
        sb.append(getActionId());
        sb.append(')');
        return sb.toString();
    }

    public final androidx.view.ActionOnlyNavDirections copy(int actionId) {
        return new androidx.view.ActionOnlyNavDirections(actionId);
    }

    /* renamed from: component1, reason: from getter */
    public final int getActionId() {
        return this.actionId;
    }

    public static /* synthetic */ androidx.view.ActionOnlyNavDirections copy$default(androidx.view.ActionOnlyNavDirections actionOnlyNavDirections, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = actionOnlyNavDirections.actionId;
        }
        return actionOnlyNavDirections.copy(i);
    }
}
