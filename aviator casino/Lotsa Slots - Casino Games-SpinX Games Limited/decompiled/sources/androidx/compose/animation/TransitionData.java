package androidx.compose.animation;

/* compiled from: EnterExitTransition.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B]\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e0\r¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u001d\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e0\rHÆ\u0003Ja\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e0\rHÆ\u0001J\u0013\u0010$\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R%\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Landroidx/compose/animation/TransitionData;", "", "fade", "Landroidx/compose/animation/Fade;", "slide", "Landroidx/compose/animation/Slide;", "changeSize", "Landroidx/compose/animation/ChangeSize;", "scale", "Landroidx/compose/animation/Scale;", "hold", "", "effectsMap", "", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/Modifier$Node;", "(Landroidx/compose/animation/Fade;Landroidx/compose/animation/Slide;Landroidx/compose/animation/ChangeSize;Landroidx/compose/animation/Scale;ZLjava/util/Map;)V", "getChangeSize", "()Landroidx/compose/animation/ChangeSize;", "getEffectsMap", "()Ljava/util/Map;", "getFade", "()Landroidx/compose/animation/Fade;", "getHold", "()Z", "getScale", "()Landroidx/compose/animation/Scale;", "getSlide", "()Landroidx/compose/animation/Slide;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TransitionData {
    public static final int $stable = 0;
    private final androidx.compose.animation.ChangeSize changeSize;
    private final java.util.Map<java.lang.Object, androidx.compose.ui.node.ModifierNodeElement<? extends androidx.compose.ui.Modifier.Node>> effectsMap;
    private final androidx.compose.animation.Fade fade;
    private final boolean hold;
    private final androidx.compose.animation.Scale scale;
    private final androidx.compose.animation.Slide slide;

    public TransitionData() {
        this(null, null, null, null, false, null, 63, null);
    }

    public static /* synthetic */ androidx.compose.animation.TransitionData copy$default(androidx.compose.animation.TransitionData transitionData, androidx.compose.animation.Fade fade, androidx.compose.animation.Slide slide, androidx.compose.animation.ChangeSize changeSize, androidx.compose.animation.Scale scale, boolean z, java.util.Map map, int i, java.lang.Object obj) {
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
            z = transitionData.hold;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            map = transitionData.effectsMap;
        }
        return transitionData.copy(fade, slide2, changeSize2, scale2, z2, map);
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.compose.animation.Fade getFade() {
        return this.fade;
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.compose.animation.Slide getSlide() {
        return this.slide;
    }

    /* renamed from: component3, reason: from getter */
    public final androidx.compose.animation.ChangeSize getChangeSize() {
        return this.changeSize;
    }

    /* renamed from: component4, reason: from getter */
    public final androidx.compose.animation.Scale getScale() {
        return this.scale;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHold() {
        return this.hold;
    }

    public final java.util.Map<java.lang.Object, androidx.compose.ui.node.ModifierNodeElement<? extends androidx.compose.ui.Modifier.Node>> component6() {
        return this.effectsMap;
    }

    public final androidx.compose.animation.TransitionData copy(androidx.compose.animation.Fade fade, androidx.compose.animation.Slide slide, androidx.compose.animation.ChangeSize changeSize, androidx.compose.animation.Scale scale, boolean hold, java.util.Map<java.lang.Object, ? extends androidx.compose.ui.node.ModifierNodeElement<? extends androidx.compose.ui.Modifier.Node>> effectsMap) {
        return new androidx.compose.animation.TransitionData(fade, slide, changeSize, scale, hold, effectsMap);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.animation.TransitionData)) {
            return false;
        }
        androidx.compose.animation.TransitionData transitionData = (androidx.compose.animation.TransitionData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fade, transitionData.fade) && kotlin.jvm.internal.Intrinsics.areEqual(this.slide, transitionData.slide) && kotlin.jvm.internal.Intrinsics.areEqual(this.changeSize, transitionData.changeSize) && kotlin.jvm.internal.Intrinsics.areEqual(this.scale, transitionData.scale) && this.hold == transitionData.hold && kotlin.jvm.internal.Intrinsics.areEqual(this.effectsMap, transitionData.effectsMap);
    }

    public int hashCode() {
        androidx.compose.animation.Fade fade = this.fade;
        int hashCode = (fade == null ? 0 : fade.hashCode()) * 31;
        androidx.compose.animation.Slide slide = this.slide;
        int hashCode2 = (hashCode + (slide == null ? 0 : slide.hashCode())) * 31;
        androidx.compose.animation.ChangeSize changeSize = this.changeSize;
        int hashCode3 = (hashCode2 + (changeSize == null ? 0 : changeSize.hashCode())) * 31;
        androidx.compose.animation.Scale scale = this.scale;
        return ((((hashCode3 + (scale != null ? scale.hashCode() : 0)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.hold)) * 31) + this.effectsMap.hashCode();
    }

    public java.lang.String toString() {
        return "TransitionData(fade=" + this.fade + ", slide=" + this.slide + ", changeSize=" + this.changeSize + ", scale=" + this.scale + ", hold=" + this.hold + ", effectsMap=" + this.effectsMap + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionData(androidx.compose.animation.Fade fade, androidx.compose.animation.Slide slide, androidx.compose.animation.ChangeSize changeSize, androidx.compose.animation.Scale scale, boolean z, java.util.Map<java.lang.Object, ? extends androidx.compose.ui.node.ModifierNodeElement<? extends androidx.compose.ui.Modifier.Node>> map) {
        this.fade = fade;
        this.slide = slide;
        this.changeSize = changeSize;
        this.scale = scale;
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

    public final boolean getHold() {
        return this.hold;
    }

    public /* synthetic */ TransitionData(androidx.compose.animation.Fade fade, androidx.compose.animation.Slide slide, androidx.compose.animation.ChangeSize changeSize, androidx.compose.animation.Scale scale, boolean z, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fade, (i & 2) != 0 ? null : slide, (i & 4) != 0 ? null : changeSize, (i & 8) == 0 ? scale : null, (i & 16) != 0 ? false : z, (i & 32) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.util.Map<java.lang.Object, androidx.compose.ui.node.ModifierNodeElement<? extends androidx.compose.ui.Modifier.Node>> getEffectsMap() {
        return this.effectsMap;
    }
}
