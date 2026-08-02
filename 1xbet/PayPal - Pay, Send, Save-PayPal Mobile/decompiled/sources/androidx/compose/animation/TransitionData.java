package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010 \u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\u0004\u0012\u00020\u00100\u000eHÆ\u0003¢\u0006\u0004\b \u0010!Jp\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\u0004\u0012\u00020\u00100\u000eHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010\u001dR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010\u001fR*\u0010\u0011\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\b:\u0010!"}, d2 = {"Landroidx/compose/animation/TransitionData;", "", "Landroidx/compose/animation/Fade;", "fade", "Landroidx/compose/animation/Slide;", "slide", "Landroidx/compose/animation/ChangeSize;", "changeSize", "Landroidx/compose/animation/Scale;", "scale", "Landroidx/compose/animation/Veil;", "veil", "", "hold", "", "Landroidx/compose/animation/TransitionEffectKey;", "Landroidx/compose/animation/TransitionEffect;", "effectsMap", "<init>", "(Landroidx/compose/animation/Fade;Landroidx/compose/animation/Slide;Landroidx/compose/animation/ChangeSize;Landroidx/compose/animation/Scale;Landroidx/compose/animation/Veil;ZLjava/util/Map;)V", "component1", "()Landroidx/compose/animation/Fade;", "component2", "()Landroidx/compose/animation/Slide;", "component3", "()Landroidx/compose/animation/ChangeSize;", "component4", "()Landroidx/compose/animation/Scale;", "component5", "()Landroidx/compose/animation/Veil;", "component6", "()Z", "component7", "()Ljava/util/Map;", "copy", "(Landroidx/compose/animation/Fade;Landroidx/compose/animation/Slide;Landroidx/compose/animation/ChangeSize;Landroidx/compose/animation/Scale;Landroidx/compose/animation/Veil;ZLjava/util/Map;)Landroidx/compose/animation/TransitionData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/animation/Fade;", "getFade", "Landroidx/compose/animation/Slide;", "getSlide", "Landroidx/compose/animation/ChangeSize;", "getChangeSize", "Landroidx/compose/animation/Scale;", "getScale", "Landroidx/compose/animation/Veil;", "getVeil", "Z", "getHold", "Ljava/util/Map;", "getEffectsMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TransitionData {
    public static final int $stable = 0;
    private final androidx.compose.animation.ChangeSize changeSize;
    private final java.util.Map<androidx.compose.animation.TransitionEffectKey<?>, androidx.compose.animation.TransitionEffect> effectsMap;
    private final androidx.compose.animation.Fade fade;
    private final boolean hold;
    private final androidx.compose.animation.Scale scale;
    private final androidx.compose.animation.Slide slide;
    private final androidx.compose.animation.Veil veil;

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionData(androidx.compose.animation.Fade fade, androidx.compose.animation.Slide slide, androidx.compose.animation.ChangeSize changeSize, androidx.compose.animation.Scale scale, androidx.compose.animation.Veil veil, boolean z, java.util.Map<androidx.compose.animation.TransitionEffectKey<?>, ? extends androidx.compose.animation.TransitionEffect> map) {
        this.fade = fade;
        this.slide = slide;
        this.changeSize = changeSize;
        this.scale = scale;
        this.veil = veil;
        this.hold = z;
        this.effectsMap = map;
    }

    public final androidx.compose.animation.Fade getFade() {
        return this.fade;
    }

    public final androidx.compose.animation.Slide getSlide() {
        return this.slide;
    }

    public final androidx.compose.animation.ChangeSize getChangeSize() {
        return this.changeSize;
    }

    public final androidx.compose.animation.Scale getScale() {
        return this.scale;
    }

    public final androidx.compose.animation.Veil getVeil() {
        return this.veil;
    }

    public final boolean getHold() {
        return this.hold;
    }

    public /* synthetic */ TransitionData(androidx.compose.animation.Fade fade, androidx.compose.animation.Slide slide, androidx.compose.animation.ChangeSize changeSize, androidx.compose.animation.Scale scale, androidx.compose.animation.Veil veil, boolean z, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fade, (i & 2) != 0 ? null : slide, (i & 4) != 0 ? null : changeSize, (i & 8) != 0 ? null : scale, (i & 16) == 0 ? veil : null, (i & 32) != 0 ? false : z, (i & 64) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.util.Map<androidx.compose.animation.TransitionEffectKey<?>, androidx.compose.animation.TransitionEffect> getEffectsMap() {
        return this.effectsMap;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransitionData(fade=");
        sb.append(this.fade);
        sb.append(", slide=");
        sb.append(this.slide);
        sb.append(", changeSize=");
        sb.append(this.changeSize);
        sb.append(", scale=");
        sb.append(this.scale);
        sb.append(", veil=");
        sb.append(this.veil);
        sb.append(", hold=");
        sb.append(this.hold);
        sb.append(", effectsMap=");
        sb.append(this.effectsMap);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        androidx.compose.animation.Fade fade = this.fade;
        int hashCode = fade == null ? 0 : fade.hashCode();
        androidx.compose.animation.Slide slide = this.slide;
        int hashCode2 = slide == null ? 0 : slide.hashCode();
        androidx.compose.animation.ChangeSize changeSize = this.changeSize;
        int hashCode3 = changeSize == null ? 0 : changeSize.hashCode();
        androidx.compose.animation.Scale scale = this.scale;
        int hashCode4 = scale == null ? 0 : scale.hashCode();
        androidx.compose.animation.Veil veil = this.veil;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (veil != null ? veil.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.hold)) * 31) + this.effectsMap.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.animation.TransitionData)) {
            return false;
        }
        androidx.compose.animation.TransitionData transitionData = (androidx.compose.animation.TransitionData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fade, transitionData.fade) && kotlin.jvm.internal.Intrinsics.areEqual(this.slide, transitionData.slide) && kotlin.jvm.internal.Intrinsics.areEqual(this.changeSize, transitionData.changeSize) && kotlin.jvm.internal.Intrinsics.areEqual(this.scale, transitionData.scale) && kotlin.jvm.internal.Intrinsics.areEqual(this.veil, transitionData.veil) && this.hold == transitionData.hold && kotlin.jvm.internal.Intrinsics.areEqual(this.effectsMap, transitionData.effectsMap);
    }

    public final androidx.compose.animation.TransitionData copy(androidx.compose.animation.Fade fade, androidx.compose.animation.Slide slide, androidx.compose.animation.ChangeSize changeSize, androidx.compose.animation.Scale scale, androidx.compose.animation.Veil veil, boolean hold, java.util.Map<androidx.compose.animation.TransitionEffectKey<?>, ? extends androidx.compose.animation.TransitionEffect> effectsMap) {
        return new androidx.compose.animation.TransitionData(fade, slide, changeSize, scale, veil, hold, effectsMap);
    }

    public final java.util.Map<androidx.compose.animation.TransitionEffectKey<?>, androidx.compose.animation.TransitionEffect> component7() {
        return this.effectsMap;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHold() {
        return this.hold;
    }

    /* renamed from: component5, reason: from getter */
    public final androidx.compose.animation.Veil getVeil() {
        return this.veil;
    }

    /* renamed from: component4, reason: from getter */
    public final androidx.compose.animation.Scale getScale() {
        return this.scale;
    }

    /* renamed from: component3, reason: from getter */
    public final androidx.compose.animation.ChangeSize getChangeSize() {
        return this.changeSize;
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.compose.animation.Slide getSlide() {
        return this.slide;
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.compose.animation.Fade getFade() {
        return this.fade;
    }

    public static /* synthetic */ androidx.compose.animation.TransitionData copy$default(androidx.compose.animation.TransitionData transitionData, androidx.compose.animation.Fade fade, androidx.compose.animation.Slide slide, androidx.compose.animation.ChangeSize changeSize, androidx.compose.animation.Scale scale, androidx.compose.animation.Veil veil, boolean z, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fade = transitionData.fade;
        }
        if ((i & 2) != 0) {
            slide = transitionData.slide;
        }
        androidx.compose.animation.Slide slide2 = slide;
        if ((i & 4) != 0) {
            changeSize = transitionData.changeSize;
        }
        androidx.compose.animation.ChangeSize changeSize2 = changeSize;
        if ((i & 8) != 0) {
            scale = transitionData.scale;
        }
        androidx.compose.animation.Scale scale2 = scale;
        if ((i & 16) != 0) {
            veil = transitionData.veil;
        }
        androidx.compose.animation.Veil veil2 = veil;
        if ((i & 32) != 0) {
            z = transitionData.hold;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            map = transitionData.effectsMap;
        }
        return transitionData.copy(fade, slide2, changeSize2, scale2, veil2, z2, map);
    }

    public TransitionData() {
        this(null, null, null, null, null, false, null, 127, null);
    }
}
