package androidx.compose.animation.core;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0010"}, d2 = {"Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "vectorValue", "Landroidx/compose/animation/core/Easing;", "easing", "Landroidx/compose/animation/core/ArcMode;", "arcMode", "<init>", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Landroidx/compose/animation/core/AnimationVector;", "component2", "()Landroidx/compose/animation/core/Easing;", "component3--9T-Mq4", "()I", "component3", "copy-2NF0KzA", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/Easing;I)Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/animation/core/AnimationVector;", "getVectorValue", "Landroidx/compose/animation/core/Easing;", "getEasing", com.visa.cbp.getEncExpo.warmup, "getArcMode--9T-Mq4"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class VectorizedKeyframeSpecElementInfo<V extends androidx.compose.animation.core.AnimationVector> {
    public static final int $stable = 0;
    private final int arcMode;
    private final androidx.compose.animation.core.Easing easing;
    private final V vectorValue;

    private VectorizedKeyframeSpecElementInfo(V v, androidx.compose.animation.core.Easing easing, int i) {
        this.vectorValue = v;
        this.easing = easing;
        this.arcMode = i;
    }

    public final V getVectorValue() {
        return this.vectorValue;
    }

    public final androidx.compose.animation.core.Easing getEasing() {
        return this.easing;
    }

    /* renamed from: getArcMode--9T-Mq4, reason: not valid java name */
    public final int m1255getArcMode9TMq4() {
        return this.arcMode;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VectorizedKeyframeSpecElementInfo(vectorValue=");
        sb.append(this.vectorValue);
        sb.append(", easing=");
        sb.append(this.easing);
        sb.append(", arcMode=");
        sb.append((java.lang.Object) androidx.compose.animation.core.ArcMode.m1193toStringimpl(this.arcMode));
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.vectorValue.hashCode() * 31) + this.easing.hashCode()) * 31) + androidx.compose.animation.core.ArcMode.m1192hashCodeimpl(this.arcMode);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.animation.core.VectorizedKeyframeSpecElementInfo)) {
            return false;
        }
        androidx.compose.animation.core.VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (androidx.compose.animation.core.VectorizedKeyframeSpecElementInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.vectorValue, vectorizedKeyframeSpecElementInfo.vectorValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.easing, vectorizedKeyframeSpecElementInfo.easing) && androidx.compose.animation.core.ArcMode.m1191equalsimpl0(this.arcMode, vectorizedKeyframeSpecElementInfo.arcMode);
    }

    /* renamed from: copy-2NF0KzA, reason: not valid java name */
    public final androidx.compose.animation.core.VectorizedKeyframeSpecElementInfo<V> m1254copy2NF0KzA(V vectorValue, androidx.compose.animation.core.Easing easing, int arcMode) {
        return new androidx.compose.animation.core.VectorizedKeyframeSpecElementInfo<>(vectorValue, easing, arcMode, null);
    }

    /* renamed from: component3--9T-Mq4, reason: not valid java name and from getter */
    public final int getArcMode() {
        return this.arcMode;
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.compose.animation.core.Easing getEasing() {
        return this.easing;
    }

    public final V component1() {
        return this.vectorValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-2NF0KzA$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.animation.core.VectorizedKeyframeSpecElementInfo m1252copy2NF0KzA$default(androidx.compose.animation.core.VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo, androidx.compose.animation.core.AnimationVector animationVector, androidx.compose.animation.core.Easing easing, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            animationVector = vectorizedKeyframeSpecElementInfo.vectorValue;
        }
        if ((i2 & 2) != 0) {
            easing = vectorizedKeyframeSpecElementInfo.easing;
        }
        if ((i2 & 4) != 0) {
            i = vectorizedKeyframeSpecElementInfo.arcMode;
        }
        return vectorizedKeyframeSpecElementInfo.m1254copy2NF0KzA(animationVector, easing, i);
    }

    public /* synthetic */ VectorizedKeyframeSpecElementInfo(androidx.compose.animation.core.AnimationVector animationVector, androidx.compose.animation.core.Easing easing, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(animationVector, easing, i);
    }
}
