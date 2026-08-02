package org.betup.ui.dialogs.compose;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleResultTheme.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b=\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 Z2\u00020\u0001:\u0001ZB\u009b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u0010\u00103\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b4\u0010\u001dJ\u0010\u00105\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b6\u0010\u001dJ\u0010\u00107\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b8\u0010\u001dJ\u0010\u00109\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b:\u0010\u001dJ\t\u0010;\u001a\u00020\nHÆ\u0003J\t\u0010<\u001a\u00020\nHÆ\u0003J\u0010\u0010=\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b>\u0010\u001dJ\u0010\u0010?\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b@\u0010\u001dJ\t\u0010A\u001a\u00020\nHÆ\u0003J\u0010\u0010B\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bC\u0010\u001dJ\u0010\u0010D\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bE\u0010\u001dJ\u0010\u0010F\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bG\u0010\u001dJ\u0010\u0010H\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bI\u0010\u001dJ\u0010\u0010J\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bK\u0010\u001dJ\u0010\u0010L\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bM\u0010\u001dJ\u0010\u0010N\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bO\u0010\u001dJ\u0010\u0010P\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u00100JÆ\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\bR\u0010SJ\u0013\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010W\u001a\u00020\u0017HÖ\u0001J\t\u0010X\u001a\u00020YHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\u0007\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b \u0010\u001dR\u0013\u0010\b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b!\u0010\u001dR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0013\u0010\f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b%\u0010\u001dR\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b&\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0013\u0010\u000f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b(\u0010\u001dR\u0013\u0010\u0010\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b)\u0010\u001dR\u0013\u0010\u0011\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b*\u0010\u001dR\u0013\u0010\u0012\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b+\u0010\u001dR\u0013\u0010\u0013\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b,\u0010\u001dR\u0013\u0010\u0014\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b-\u0010\u001dR\u0013\u0010\u0015\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b.\u0010\u001dR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100¨\u0006["}, d2 = {"Lorg/betup/ui/dialogs/compose/BattleResultPalette;", "", "tone", "Lorg/betup/ui/dialogs/compose/BattleResultTone;", "accent", "Landroidx/compose/ui/graphics/Color;", "accentBright", "accentSoft", "glow", "headerGradient", "Landroidx/compose/ui/graphics/Brush;", "titleGradient", "cardBorderWin", "cardBorderLose", "dialogBorder", "captionBorder", "subtitle", "potBorder", "potFillTop", "potFillBottom", "emblemShadow", "amountColor", "emblemRes", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/dialogs/compose/BattleResultTone;JJJJLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;JJLandroidx/compose/ui/graphics/Brush;JJJJJJJLjava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTone", "()Lorg/betup/ui/dialogs/compose/BattleResultTone;", "getAccent-0d7_KjU", "()J", "J", "getAccentBright-0d7_KjU", "getAccentSoft-0d7_KjU", "getGlow-0d7_KjU", "getHeaderGradient", "()Landroidx/compose/ui/graphics/Brush;", "getTitleGradient", "getCardBorderWin-0d7_KjU", "getCardBorderLose-0d7_KjU", "getDialogBorder", "getCaptionBorder-0d7_KjU", "getSubtitle-0d7_KjU", "getPotBorder-0d7_KjU", "getPotFillTop-0d7_KjU", "getPotFillBottom-0d7_KjU", "getEmblemShadow-0d7_KjU", "getAmountColor-0d7_KjU", "getEmblemRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "component6", "component7", "component8", "component8-0d7_KjU", "component9", "component9-0d7_KjU", "component10", "component11", "component11-0d7_KjU", "component12", "component12-0d7_KjU", "component13", "component13-0d7_KjU", "component14", "component14-0d7_KjU", "component15", "component15-0d7_KjU", "component16", "component16-0d7_KjU", "component17", "component17-0d7_KjU", "component18", "copy", "copy-yc15cxA", "(Lorg/betup/ui/dialogs/compose/BattleResultTone;JJJJLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;JJLandroidx/compose/ui/graphics/Brush;JJJJJJJLjava/lang/Integer;)Lorg/betup/ui/dialogs/compose/BattleResultPalette;", "equals", "", "other", "hashCode", "toString", "", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BattleResultPalette {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long accent;
    private final long accentBright;
    private final long accentSoft;
    private final long amountColor;
    private final long captionBorder;
    private final long cardBorderLose;
    private final long cardBorderWin;
    private final Brush dialogBorder;
    private final Integer emblemRes;
    private final long emblemShadow;
    private final long glow;
    private final Brush headerGradient;
    private final long potBorder;
    private final long potFillBottom;
    private final long potFillTop;
    private final long subtitle;
    private final Brush titleGradient;
    private final BattleResultTone tone;

    public /* synthetic */ BattleResultPalette(BattleResultTone battleResultTone, long j, long j2, long j3, long j4, Brush brush, Brush brush2, long j5, long j6, Brush brush3, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(battleResultTone, j, j2, j3, j4, brush, brush2, j5, j6, brush3, j7, j8, j9, j10, j11, j12, j13, num);
    }

    /* renamed from: component1, reason: from getter */
    public final BattleResultTone getTone() {
        return this.tone;
    }

    /* renamed from: component10, reason: from getter */
    public final Brush getDialogBorder() {
        return this.dialogBorder;
    }

    /* renamed from: component11-0d7_KjU, reason: not valid java name and from getter */
    public final long getCaptionBorder() {
        return this.captionBorder;
    }

    /* renamed from: component12-0d7_KjU, reason: not valid java name and from getter */
    public final long getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component13-0d7_KjU, reason: not valid java name and from getter */
    public final long getPotBorder() {
        return this.potBorder;
    }

    /* renamed from: component14-0d7_KjU, reason: not valid java name and from getter */
    public final long getPotFillTop() {
        return this.potFillTop;
    }

    /* renamed from: component15-0d7_KjU, reason: not valid java name and from getter */
    public final long getPotFillBottom() {
        return this.potFillBottom;
    }

    /* renamed from: component16-0d7_KjU, reason: not valid java name and from getter */
    public final long getEmblemShadow() {
        return this.emblemShadow;
    }

    /* renamed from: component17-0d7_KjU, reason: not valid java name and from getter */
    public final long getAmountColor() {
        return this.amountColor;
    }

    /* renamed from: component18, reason: from getter */
    public final Integer getEmblemRes() {
        return this.emblemRes;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getAccent() {
        return this.accent;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getAccentBright() {
        return this.accentBright;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getAccentSoft() {
        return this.accentSoft;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getGlow() {
        return this.glow;
    }

    /* renamed from: component6, reason: from getter */
    public final Brush getHeaderGradient() {
        return this.headerGradient;
    }

    /* renamed from: component7, reason: from getter */
    public final Brush getTitleGradient() {
        return this.titleGradient;
    }

    /* renamed from: component8-0d7_KjU, reason: not valid java name and from getter */
    public final long getCardBorderWin() {
        return this.cardBorderWin;
    }

    /* renamed from: component9-0d7_KjU, reason: not valid java name and from getter */
    public final long getCardBorderLose() {
        return this.cardBorderLose;
    }

    /* renamed from: copy-yc15cxA, reason: not valid java name */
    public final BattleResultPalette m13234copyyc15cxA(BattleResultTone tone, long accent, long accentBright, long accentSoft, long glow, Brush headerGradient, Brush titleGradient, long cardBorderWin, long cardBorderLose, Brush dialogBorder, long captionBorder, long subtitle, long potBorder, long potFillTop, long potFillBottom, long emblemShadow, long amountColor, Integer emblemRes) {
        Intrinsics.checkNotNullParameter(tone, "tone");
        Intrinsics.checkNotNullParameter(headerGradient, "headerGradient");
        Intrinsics.checkNotNullParameter(titleGradient, "titleGradient");
        Intrinsics.checkNotNullParameter(dialogBorder, "dialogBorder");
        return new BattleResultPalette(tone, accent, accentBright, accentSoft, glow, headerGradient, titleGradient, cardBorderWin, cardBorderLose, dialogBorder, captionBorder, subtitle, potBorder, potFillTop, potFillBottom, emblemShadow, amountColor, emblemRes, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BattleResultPalette)) {
            return false;
        }
        BattleResultPalette battleResultPalette = (BattleResultPalette) other;
        return this.tone == battleResultPalette.tone && Color.m5169equalsimpl0(this.accent, battleResultPalette.accent) && Color.m5169equalsimpl0(this.accentBright, battleResultPalette.accentBright) && Color.m5169equalsimpl0(this.accentSoft, battleResultPalette.accentSoft) && Color.m5169equalsimpl0(this.glow, battleResultPalette.glow) && Intrinsics.areEqual(this.headerGradient, battleResultPalette.headerGradient) && Intrinsics.areEqual(this.titleGradient, battleResultPalette.titleGradient) && Color.m5169equalsimpl0(this.cardBorderWin, battleResultPalette.cardBorderWin) && Color.m5169equalsimpl0(this.cardBorderLose, battleResultPalette.cardBorderLose) && Intrinsics.areEqual(this.dialogBorder, battleResultPalette.dialogBorder) && Color.m5169equalsimpl0(this.captionBorder, battleResultPalette.captionBorder) && Color.m5169equalsimpl0(this.subtitle, battleResultPalette.subtitle) && Color.m5169equalsimpl0(this.potBorder, battleResultPalette.potBorder) && Color.m5169equalsimpl0(this.potFillTop, battleResultPalette.potFillTop) && Color.m5169equalsimpl0(this.potFillBottom, battleResultPalette.potFillBottom) && Color.m5169equalsimpl0(this.emblemShadow, battleResultPalette.emblemShadow) && Color.m5169equalsimpl0(this.amountColor, battleResultPalette.amountColor) && Intrinsics.areEqual(this.emblemRes, battleResultPalette.emblemRes);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((this.tone.hashCode() * 31) + Color.m5175hashCodeimpl(this.accent)) * 31) + Color.m5175hashCodeimpl(this.accentBright)) * 31) + Color.m5175hashCodeimpl(this.accentSoft)) * 31) + Color.m5175hashCodeimpl(this.glow)) * 31) + this.headerGradient.hashCode()) * 31) + this.titleGradient.hashCode()) * 31) + Color.m5175hashCodeimpl(this.cardBorderWin)) * 31) + Color.m5175hashCodeimpl(this.cardBorderLose)) * 31) + this.dialogBorder.hashCode()) * 31) + Color.m5175hashCodeimpl(this.captionBorder)) * 31) + Color.m5175hashCodeimpl(this.subtitle)) * 31) + Color.m5175hashCodeimpl(this.potBorder)) * 31) + Color.m5175hashCodeimpl(this.potFillTop)) * 31) + Color.m5175hashCodeimpl(this.potFillBottom)) * 31) + Color.m5175hashCodeimpl(this.emblemShadow)) * 31) + Color.m5175hashCodeimpl(this.amountColor)) * 31;
        Integer num = this.emblemRes;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "BattleResultPalette(tone=" + this.tone + ", accent=" + Color.m5176toStringimpl(this.accent) + ", accentBright=" + Color.m5176toStringimpl(this.accentBright) + ", accentSoft=" + Color.m5176toStringimpl(this.accentSoft) + ", glow=" + Color.m5176toStringimpl(this.glow) + ", headerGradient=" + this.headerGradient + ", titleGradient=" + this.titleGradient + ", cardBorderWin=" + Color.m5176toStringimpl(this.cardBorderWin) + ", cardBorderLose=" + Color.m5176toStringimpl(this.cardBorderLose) + ", dialogBorder=" + this.dialogBorder + ", captionBorder=" + Color.m5176toStringimpl(this.captionBorder) + ", subtitle=" + Color.m5176toStringimpl(this.subtitle) + ", potBorder=" + Color.m5176toStringimpl(this.potBorder) + ", potFillTop=" + Color.m5176toStringimpl(this.potFillTop) + ", potFillBottom=" + Color.m5176toStringimpl(this.potFillBottom) + ", emblemShadow=" + Color.m5176toStringimpl(this.emblemShadow) + ", amountColor=" + Color.m5176toStringimpl(this.amountColor) + ", emblemRes=" + this.emblemRes + ")";
    }

    private BattleResultPalette(BattleResultTone tone, long j, long j2, long j3, long j4, Brush headerGradient, Brush titleGradient, long j5, long j6, Brush dialogBorder, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Integer num) {
        Intrinsics.checkNotNullParameter(tone, "tone");
        Intrinsics.checkNotNullParameter(headerGradient, "headerGradient");
        Intrinsics.checkNotNullParameter(titleGradient, "titleGradient");
        Intrinsics.checkNotNullParameter(dialogBorder, "dialogBorder");
        this.tone = tone;
        this.accent = j;
        this.accentBright = j2;
        this.accentSoft = j3;
        this.glow = j4;
        this.headerGradient = headerGradient;
        this.titleGradient = titleGradient;
        this.cardBorderWin = j5;
        this.cardBorderLose = j6;
        this.dialogBorder = dialogBorder;
        this.captionBorder = j7;
        this.subtitle = j8;
        this.potBorder = j9;
        this.potFillTop = j10;
        this.potFillBottom = j11;
        this.emblemShadow = j12;
        this.amountColor = j13;
        this.emblemRes = num;
    }

    public /* synthetic */ BattleResultPalette(BattleResultTone battleResultTone, long j, long j2, long j3, long j4, Brush brush, Brush brush2, long j5, long j6, Brush brush3, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(battleResultTone, j, j2, j3, j4, brush, brush2, j5, j6, brush3, j7, j8, j9, j10, j11, j12, j13, (i & 131072) != 0 ? null : num, null);
    }

    public final BattleResultTone getTone() {
        return this.tone;
    }

    /* renamed from: getAccent-0d7_KjU, reason: not valid java name */
    public final long m13235getAccent0d7_KjU() {
        return this.accent;
    }

    /* renamed from: getAccentBright-0d7_KjU, reason: not valid java name */
    public final long m13236getAccentBright0d7_KjU() {
        return this.accentBright;
    }

    /* renamed from: getAccentSoft-0d7_KjU, reason: not valid java name */
    public final long m13237getAccentSoft0d7_KjU() {
        return this.accentSoft;
    }

    /* renamed from: getGlow-0d7_KjU, reason: not valid java name */
    public final long m13243getGlow0d7_KjU() {
        return this.glow;
    }

    public final Brush getHeaderGradient() {
        return this.headerGradient;
    }

    public final Brush getTitleGradient() {
        return this.titleGradient;
    }

    /* renamed from: getCardBorderWin-0d7_KjU, reason: not valid java name */
    public final long m13241getCardBorderWin0d7_KjU() {
        return this.cardBorderWin;
    }

    /* renamed from: getCardBorderLose-0d7_KjU, reason: not valid java name */
    public final long m13240getCardBorderLose0d7_KjU() {
        return this.cardBorderLose;
    }

    public final Brush getDialogBorder() {
        return this.dialogBorder;
    }

    /* renamed from: getCaptionBorder-0d7_KjU, reason: not valid java name */
    public final long m13239getCaptionBorder0d7_KjU() {
        return this.captionBorder;
    }

    /* renamed from: getSubtitle-0d7_KjU, reason: not valid java name */
    public final long m13247getSubtitle0d7_KjU() {
        return this.subtitle;
    }

    /* renamed from: getPotBorder-0d7_KjU, reason: not valid java name */
    public final long m13244getPotBorder0d7_KjU() {
        return this.potBorder;
    }

    /* renamed from: getPotFillTop-0d7_KjU, reason: not valid java name */
    public final long m13246getPotFillTop0d7_KjU() {
        return this.potFillTop;
    }

    /* renamed from: getPotFillBottom-0d7_KjU, reason: not valid java name */
    public final long m13245getPotFillBottom0d7_KjU() {
        return this.potFillBottom;
    }

    /* renamed from: getEmblemShadow-0d7_KjU, reason: not valid java name */
    public final long m13242getEmblemShadow0d7_KjU() {
        return this.emblemShadow;
    }

    /* renamed from: getAmountColor-0d7_KjU, reason: not valid java name */
    public final long m13238getAmountColor0d7_KjU() {
        return this.amountColor;
    }

    public final Integer getEmblemRes() {
        return this.emblemRes;
    }

    /* compiled from: BattleResultTheme.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0015\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lorg/betup/ui/dialogs/compose/BattleResultPalette$Companion;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "from", "Lorg/betup/ui/dialogs/compose/BattleResultPalette;", "tone", "Lorg/betup/ui/dialogs/compose/BattleResultTone;", "fromEffectiveState", "effectiveState", "", "(Ljava/lang/Integer;)Lorg/betup/ui/dialogs/compose/BattleResultTone;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BattleResultPalette from(BattleResultTone tone) {
            ComposeUtils.BattleResultVisualTone visual;
            Intrinsics.checkNotNullParameter(tone, "tone");
            visual = BattleResultThemeKt.toVisual(tone);
            ComposeUtils.BattleResultStyleTokens battleResultStyleTokens = ComposeUtils.BattleResultStyle.INSTANCE.tokens(visual);
            return new BattleResultPalette(tone, battleResultStyleTokens.m14412getAccent0d7_KjU(), battleResultStyleTokens.m14413getAccentBright0d7_KjU(), battleResultStyleTokens.m14414getAccentSoft0d7_KjU(), battleResultStyleTokens.m14420getGlow0d7_KjU(), battleResultStyleTokens.getHeaderGradient(), battleResultStyleTokens.getTitleGradient(), battleResultStyleTokens.m14418getCardBorderWin0d7_KjU(), battleResultStyleTokens.m14417getCardBorderLose0d7_KjU(), battleResultStyleTokens.getDialogBorder(), battleResultStyleTokens.m14416getCaptionBorder0d7_KjU(), battleResultStyleTokens.m14424getSubtitle0d7_KjU(), battleResultStyleTokens.m14421getPotBorder0d7_KjU(), battleResultStyleTokens.m14423getPotFillTop0d7_KjU(), battleResultStyleTokens.m14422getPotFillBottom0d7_KjU(), battleResultStyleTokens.m14419getEmblemShadow0d7_KjU(), battleResultStyleTokens.m14415getAmountColor0d7_KjU(), null, null);
        }

        public final BattleResultTone fromEffectiveState(Integer effectiveState) {
            BattleResultTone battleTone;
            battleTone = BattleResultThemeKt.toBattleTone(ComposeUtils.BattleResultStyle.INSTANCE.fromEffectiveState(effectiveState));
            return battleTone;
        }
    }
}
