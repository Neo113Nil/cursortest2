package androidx.compose.runtime.reflect;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Landroidx/compose/runtime/reflect/ComposableInfo;", "", "", "isComposable", "", "realParamsCount", "changedParams", "defaultParams", "<init>", "(ZIII)V", "component1", "()Z", "component2", "()I", "component3", "component4", "copy", "(ZIII)Landroidx/compose/runtime/reflect/ComposableInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Z", com.visa.cbp.getEncExpo.warmup, "getRealParamsCount", "getChangedParams", "getDefaultParams"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ComposableInfo {
    public static final int $stable = 0;
    private final int changedParams;
    private final int defaultParams;
    private final boolean isComposable;
    private final int realParamsCount;

    public ComposableInfo(boolean z, int i, int i2, int i3) {
        this.isComposable = z;
        this.realParamsCount = i;
        this.changedParams = i2;
        this.defaultParams = i3;
    }

    public final boolean isComposable() {
        return this.isComposable;
    }

    public final int getRealParamsCount() {
        return this.realParamsCount;
    }

    public final int getChangedParams() {
        return this.changedParams;
    }

    public final int getDefaultParams() {
        return this.defaultParams;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ComposableInfo(isComposable=");
        sb.append(this.isComposable);
        sb.append(", realParamsCount=");
        sb.append(this.realParamsCount);
        sb.append(", changedParams=");
        sb.append(this.changedParams);
        sb.append(", defaultParams=");
        sb.append(this.defaultParams);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.isComposable) * 31) + java.lang.Integer.hashCode(this.realParamsCount)) * 31) + java.lang.Integer.hashCode(this.changedParams)) * 31) + java.lang.Integer.hashCode(this.defaultParams);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.runtime.reflect.ComposableInfo)) {
            return false;
        }
        androidx.compose.runtime.reflect.ComposableInfo composableInfo = (androidx.compose.runtime.reflect.ComposableInfo) other;
        return this.isComposable == composableInfo.isComposable && this.realParamsCount == composableInfo.realParamsCount && this.changedParams == composableInfo.changedParams && this.defaultParams == composableInfo.defaultParams;
    }

    public final androidx.compose.runtime.reflect.ComposableInfo copy(boolean isComposable, int realParamsCount, int changedParams, int defaultParams) {
        return new androidx.compose.runtime.reflect.ComposableInfo(isComposable, realParamsCount, changedParams, defaultParams);
    }

    /* renamed from: component4, reason: from getter */
    public final int getDefaultParams() {
        return this.defaultParams;
    }

    /* renamed from: component3, reason: from getter */
    public final int getChangedParams() {
        return this.changedParams;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRealParamsCount() {
        return this.realParamsCount;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsComposable() {
        return this.isComposable;
    }

    public static /* synthetic */ androidx.compose.runtime.reflect.ComposableInfo copy$default(androidx.compose.runtime.reflect.ComposableInfo composableInfo, boolean z, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            z = composableInfo.isComposable;
        }
        if ((i4 & 2) != 0) {
            i = composableInfo.realParamsCount;
        }
        if ((i4 & 4) != 0) {
            i2 = composableInfo.changedParams;
        }
        if ((i4 & 8) != 0) {
            i3 = composableInfo.defaultParams;
        }
        return composableInfo.copy(z, i, i2, i3);
    }
}
