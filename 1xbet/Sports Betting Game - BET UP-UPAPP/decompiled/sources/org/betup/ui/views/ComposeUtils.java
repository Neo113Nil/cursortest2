package org.betup.ui.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ComposeUtils.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\r"}, d2 = {"Lorg/betup/ui/views/ComposeUtils;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "sfProFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/font/FontFamily;", "openSansFamily", "AppColorPalette", "BattleResultVisualTone", "BattleResultStyleTokens", "BattleResultStyle", "AppBrushPalette", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposeUtils {
    public static final int $stable = 0;
    public static final ComposeUtils INSTANCE = new ComposeUtils();

    private ComposeUtils() {
    }

    /* compiled from: ComposeUtils.kt */
    @Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001::\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001:CDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|¨\u0006}"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", "", "color", "Landroidx/compose/ui/graphics/Color;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(J)V", "getColor-0d7_KjU", "()J", "J", "White", "Black", "Gold", "Gray", "GrayDark", "GrayLight", "Green", "Violet", "Blue", "ScreenBackground", "ScreenBorder", "Red", "BackgroundListBetsItem", "GrayUnselectedMatchButton", "BackgroundGroupMatchBet", "Bronze", "Silver", "GoldBackgroundFortune1", "GoldBackgroundFortune2", "BackgroundMessageInputBar", "FacebookButtonColor", "GPlusButtonColor", "VKButtonColor", "BattleWonAccent", "BattleWonAccentBright", "BattleWonGlow", "BattleWonHeader", "BattleLostAccent", "BattleLostAccentBright", "BattleLostGlow", "BattleLostHeader", "BattleDrawHeader", "BattleDrawGlow", "BattleTitleGoldLight", "BattleTitleGold", "BattleTitleLostLight", "BattleTitleLost", "BattleCaptionText", "BattleSubtitleText", "BattleLinkText", "BattleChipSurface", "BattleCardSurfaceTop", "BattleCardSurfaceBottom", "BattlePendingHeader", "BattlePendingAccent", "BattlePendingGlow", "BattleActiveHeader", "BattleActiveAccent", "BattleActiveGlow", "BattleReturnedHeader", "BattleReturnedAccent", "BattleReturnedGlow", "BattleCanceledHeader", "BattleCanceledAccent", "BattleCanceledGlow", "BattleFinishedHeader", "BattleFinishedAccent", "BattleFinishedGlow", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BackgroundGroupMatchBet;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BackgroundListBetsItem;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BackgroundMessageInputBar;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleActiveAccent;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleActiveGlow;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleActiveHeader;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleCanceledAccent;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleCanceledGlow;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleCanceledHeader;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleCaptionText;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleCardSurfaceBottom;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleCardSurfaceTop;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleChipSurface;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleDrawGlow;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleDrawHeader;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleFinishedAccent;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleFinishedGlow;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleFinishedHeader;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleLinkText;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleLostAccent;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleLostAccentBright;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleLostGlow;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleLostHeader;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattlePendingAccent;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattlePendingGlow;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattlePendingHeader;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleReturnedAccent;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleReturnedGlow;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleReturnedHeader;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleSubtitleText;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleTitleGold;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleTitleGoldLight;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleTitleLost;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleTitleLostLight;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleWonAccent;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleWonAccentBright;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleWonGlow;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleWonHeader;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$Black;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$Blue;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$Bronze;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$FacebookButtonColor;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$GPlusButtonColor;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$Gold;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$GoldBackgroundFortune1;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$GoldBackgroundFortune2;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$Gray;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$GrayDark;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$GrayLight;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$GrayUnselectedMatchButton;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$Green;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$Red;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$ScreenBackground;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$ScreenBorder;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$Silver;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$VKButtonColor;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$Violet;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette$White;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class AppColorPalette {
        public static final int $stable = 0;
        private final long color;

        public /* synthetic */ AppColorPalette(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$White;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class White extends AppColorPalette {
            public static final int $stable = 0;
            public static final White INSTANCE = new White();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof White)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1488368941;
            }

            public String toString() {
                return "White";
            }

            private White() {
                super(ColorKt.Color(4294572797L), null);
            }
        }

        private AppColorPalette(long j) {
            this.color = j;
        }

        /* renamed from: getColor-0d7_KjU, reason: not valid java name and from getter */
        public final long getColor() {
            return this.color;
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$Black;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Black extends AppColorPalette {
            public static final int $stable = 0;
            public static final Black INSTANCE = new Black();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Black)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1507651927;
            }

            public String toString() {
                return "Black";
            }

            private Black() {
                super(ColorKt.Color(4279439895L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$Gold;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Gold extends AppColorPalette {
            public static final int $stable = 0;
            public static final Gold INSTANCE = new Gold();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Gold)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1572502410;
            }

            public String toString() {
                return "Gold";
            }

            private Gold() {
                super(ColorKt.Color(4294946874L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$Gray;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Gray extends AppColorPalette {
            public static final int $stable = 0;
            public static final Gray INSTANCE = new Gray();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Gray)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1572499847;
            }

            public String toString() {
                return "Gray";
            }

            private Gray() {
                super(ColorKt.Color(4285886854L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$GrayDark;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class GrayDark extends AppColorPalette {
            public static final int $stable = 0;
            public static final GrayDark INSTANCE = new GrayDark();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GrayDark)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -812118641;
            }

            public String toString() {
                return "GrayDark";
            }

            private GrayDark() {
                super(ColorKt.Color(4282400073L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$GrayLight;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class GrayLight extends AppColorPalette {
            public static final int $stable = 0;
            public static final GrayLight INSTANCE = new GrayLight();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GrayLight)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 601741853;
            }

            public String toString() {
                return "GrayLight";
            }

            private GrayLight() {
                super(ColorKt.Color(4290032820L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$Green;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Green extends AppColorPalette {
            public static final int $stable = 0;
            public static final Green INSTANCE = new Green();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Green)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1502851667;
            }

            public String toString() {
                return "Green";
            }

            private Green() {
                super(ColorKt.Color(4281768237L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$Violet;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Violet extends AppColorPalette {
            public static final int $stable = 0;
            public static final Violet INSTANCE = new Violet();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Violet)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1077668629;
            }

            public String toString() {
                return "Violet";
            }

            private Violet() {
                super(ColorKt.Color(4283776939L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$Blue;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Blue extends AppColorPalette {
            public static final int $stable = 0;
            public static final Blue INSTANCE = new Blue();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Blue)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1572653968;
            }

            public String toString() {
                return "Blue";
            }

            private Blue() {
                super(ColorKt.Color(4280193279L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$ScreenBackground;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ScreenBackground extends AppColorPalette {
            public static final int $stable = 0;
            public static final ScreenBackground INSTANCE = new ScreenBackground();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ScreenBackground)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1551045168;
            }

            public String toString() {
                return "ScreenBackground";
            }

            private ScreenBackground() {
                super(ColorKt.Color(4280427305L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$ScreenBorder;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ScreenBorder extends AppColorPalette {
            public static final int $stable = 0;
            public static final ScreenBorder INSTANCE = new ScreenBorder();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ScreenBorder)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 190492110;
            }

            public String toString() {
                return "ScreenBorder";
            }

            private ScreenBorder() {
                super(ColorKt.Color(4282992467L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$Red;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Red extends AppColorPalette {
            public static final int $stable = 0;
            public static final Red INSTANCE = new Red();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Red)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1473305019;
            }

            public String toString() {
                return "Red";
            }

            private Red() {
                super(ColorKt.Color(4292230204L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BackgroundListBetsItem;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BackgroundListBetsItem extends AppColorPalette {
            public static final int $stable = 0;
            public static final BackgroundListBetsItem INSTANCE = new BackgroundListBetsItem();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BackgroundListBetsItem)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 539199959;
            }

            public String toString() {
                return "BackgroundListBetsItem";
            }

            private BackgroundListBetsItem() {
                super(ColorKt.Color(4280427305L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$GrayUnselectedMatchButton;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class GrayUnselectedMatchButton extends AppColorPalette {
            public static final int $stable = 0;
            public static final GrayUnselectedMatchButton INSTANCE = new GrayUnselectedMatchButton();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GrayUnselectedMatchButton)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 925459338;
            }

            public String toString() {
                return "GrayUnselectedMatchButton";
            }

            private GrayUnselectedMatchButton() {
                super(ColorKt.Color(4285886854L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BackgroundGroupMatchBet;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BackgroundGroupMatchBet extends AppColorPalette {
            public static final int $stable = 0;
            public static final BackgroundGroupMatchBet INSTANCE = new BackgroundGroupMatchBet();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BackgroundGroupMatchBet)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 518693319;
            }

            public String toString() {
                return "BackgroundGroupMatchBet";
            }

            private BackgroundGroupMatchBet() {
                super(ColorKt.Color(4280032032L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$Bronze;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Bronze extends AppColorPalette {
            public static final int $stable = 0;
            public static final Bronze INSTANCE = new Bronze();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Bronze)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 513399856;
            }

            public String toString() {
                return "Bronze";
            }

            private Bronze() {
                super(ColorKt.Color(4292115561L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$Silver;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Silver extends AppColorPalette {
            public static final int $stable = 0;
            public static final Silver INSTANCE = new Silver();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Silver)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 991701411;
            }

            public String toString() {
                return "Silver";
            }

            private Silver() {
                super(ColorKt.Color(4290032820L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$GoldBackgroundFortune1;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class GoldBackgroundFortune1 extends AppColorPalette {
            public static final int $stable = 0;
            public static final GoldBackgroundFortune1 INSTANCE = new GoldBackgroundFortune1();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GoldBackgroundFortune1)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1509916044;
            }

            public String toString() {
                return "GoldBackgroundFortune1";
            }

            private GoldBackgroundFortune1() {
                super(ColorKt.Color(4294955922L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$GoldBackgroundFortune2;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class GoldBackgroundFortune2 extends AppColorPalette {
            public static final int $stable = 0;
            public static final GoldBackgroundFortune2 INSTANCE = new GoldBackgroundFortune2();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GoldBackgroundFortune2)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1509916043;
            }

            public String toString() {
                return "GoldBackgroundFortune2";
            }

            private GoldBackgroundFortune2() {
                super(ColorKt.Color(4294946874L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BackgroundMessageInputBar;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BackgroundMessageInputBar extends AppColorPalette {
            public static final int $stable = 0;
            public static final BackgroundMessageInputBar INSTANCE = new BackgroundMessageInputBar();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BackgroundMessageInputBar)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1493060692;
            }

            public String toString() {
                return "BackgroundMessageInputBar";
            }

            private BackgroundMessageInputBar() {
                super(ColorKt.Color(4280295977L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$FacebookButtonColor;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class FacebookButtonColor extends AppColorPalette {
            public static final int $stable = 0;
            public static final FacebookButtonColor INSTANCE = new FacebookButtonColor();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FacebookButtonColor)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1997927979;
            }

            public String toString() {
                return "FacebookButtonColor";
            }

            private FacebookButtonColor() {
                super(ColorKt.Color(4279793650L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$GPlusButtonColor;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class GPlusButtonColor extends AppColorPalette {
            public static final int $stable = 0;
            public static final GPlusButtonColor INSTANCE = new GPlusButtonColor();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GPlusButtonColor)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1165085958;
            }

            public String toString() {
                return "GPlusButtonColor";
            }

            private GPlusButtonColor() {
                super(ColorKt.Color(4294955922L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$VKButtonColor;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class VKButtonColor extends AppColorPalette {
            public static final int $stable = 0;
            public static final VKButtonColor INSTANCE = new VKButtonColor();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VKButtonColor)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 873338406;
            }

            public String toString() {
                return "VKButtonColor";
            }

            private VKButtonColor() {
                super(ColorKt.Color(4282673037L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleWonAccent;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleWonAccent extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleWonAccent INSTANCE = new BattleWonAccent();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleWonAccent)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 2019423570;
            }

            public String toString() {
                return "BattleWonAccent";
            }

            private BattleWonAccent() {
                super(ColorKt.Color(4282253224L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleWonAccentBright;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleWonAccentBright extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleWonAccentBright INSTANCE = new BattleWonAccentBright();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleWonAccentBright)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1104622868;
            }

            public String toString() {
                return "BattleWonAccentBright";
            }

            private BattleWonAccentBright() {
                super(ColorKt.Color(4288413652L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleWonGlow;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleWonGlow extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleWonGlow INSTANCE = new BattleWonGlow();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleWonGlow)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1316145131;
            }

            public String toString() {
                return "BattleWonGlow";
            }

            private BattleWonGlow() {
                super(ColorKt.Color(4284153792L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleWonHeader;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleWonHeader extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleWonHeader INSTANCE = new BattleWonHeader();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleWonHeader)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -2073353451;
            }

            public String toString() {
                return "BattleWonHeader";
            }

            private BattleWonHeader() {
                super(ColorKt.Color(4278852116L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleLostAccent;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleLostAccent extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleLostAccent INSTANCE = new BattleLostAccent();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleLostAccent)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1802942204;
            }

            public String toString() {
                return "BattleLostAccent";
            }

            private BattleLostAccent() {
                super(ColorKt.Color(4294925404L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleLostAccentBright;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleLostAccentBright extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleLostAccentBright INSTANCE = new BattleLostAccentBright();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleLostAccentBright)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1294981866;
            }

            public String toString() {
                return "BattleLostAccentBright";
            }

            private BattleLostAccentBright() {
                super(ColorKt.Color(4294939796L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleLostGlow;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleLostGlow extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleLostGlow INSTANCE = new BattleLostGlow();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleLostGlow)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 341728319;
            }

            public String toString() {
                return "BattleLostGlow";
            }

            private BattleLostGlow() {
                super(ColorKt.Color(4294917437L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleLostHeader;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleLostHeader extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleLostHeader INSTANCE = new BattleLostHeader();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleLostHeader)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 2005132479;
            }

            public String toString() {
                return "BattleLostHeader";
            }

            private BattleLostHeader() {
                super(ColorKt.Color(4280946706L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleDrawHeader;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleDrawHeader extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleDrawHeader INSTANCE = new BattleDrawHeader();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleDrawHeader)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -488426785;
            }

            public String toString() {
                return "BattleDrawHeader";
            }

            private BattleDrawHeader() {
                super(ColorKt.Color(4280951312L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleDrawGlow;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleDrawGlow extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleDrawGlow INSTANCE = new BattleDrawGlow();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleDrawGlow)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1434104415;
            }

            public String toString() {
                return "BattleDrawGlow";
            }

            private BattleDrawGlow() {
                super(ColorKt.Color(4294953047L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleTitleGoldLight;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleTitleGoldLight extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleTitleGoldLight INSTANCE = new BattleTitleGoldLight();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleTitleGoldLight)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 202486796;
            }

            public String toString() {
                return "BattleTitleGoldLight";
            }

            private BattleTitleGoldLight() {
                super(ColorKt.Color(4294965480L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleTitleGold;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleTitleGold extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleTitleGold INSTANCE = new BattleTitleGold();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleTitleGold)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -752944342;
            }

            public String toString() {
                return "BattleTitleGold";
            }

            private BattleTitleGold() {
                super(ColorKt.Color(4294955366L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleTitleLostLight;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleTitleLostLight extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleTitleLostLight INSTANCE = new BattleTitleLostLight();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleTitleLostLight)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 2130773960;
            }

            public String toString() {
                return "BattleTitleLostLight";
            }

            private BattleTitleLostLight() {
                super(ColorKt.Color(4294962408L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleTitleLost;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleTitleLost extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleTitleLost INSTANCE = new BattleTitleLost();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleTitleLost)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -752795154;
            }

            public String toString() {
                return "BattleTitleLost";
            }

            private BattleTitleLost() {
                super(ColorKt.Color(4294933332L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleCaptionText;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleCaptionText extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleCaptionText INSTANCE = new BattleCaptionText();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleCaptionText)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 126546949;
            }

            public String toString() {
                return "BattleCaptionText";
            }

            private BattleCaptionText() {
                super(ColorKt.Color(4293455604L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleSubtitleText;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleSubtitleText extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleSubtitleText INSTANCE = new BattleSubtitleText();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleSubtitleText)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1329287213;
            }

            public String toString() {
                return "BattleSubtitleText";
            }

            private BattleSubtitleText() {
                super(ColorKt.Color(4291351774L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleLinkText;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleLinkText extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleLinkText INSTANCE = new BattleLinkText();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleLinkText)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -839403083;
            }

            public String toString() {
                return "BattleLinkText";
            }

            private BattleLinkText() {
                super(ColorKt.Color(4294955366L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleChipSurface;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleChipSurface extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleChipSurface INSTANCE = new BattleChipSurface();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleChipSurface)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -2032286061;
            }

            public String toString() {
                return "BattleChipSurface";
            }

            private BattleChipSurface() {
                super(ColorKt.Color(4280623918L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleCardSurfaceTop;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleCardSurfaceTop extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleCardSurfaceTop INSTANCE = new BattleCardSurfaceTop();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleCardSurfaceTop)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1329190790;
            }

            public String toString() {
                return "BattleCardSurfaceTop";
            }

            private BattleCardSurfaceTop() {
                super(ColorKt.Color(4280426536L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleCardSurfaceBottom;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleCardSurfaceBottom extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleCardSurfaceBottom INSTANCE = new BattleCardSurfaceBottom();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleCardSurfaceBottom)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 2104232538;
            }

            public String toString() {
                return "BattleCardSurfaceBottom";
            }

            private BattleCardSurfaceBottom() {
                super(ColorKt.Color(4279505688L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattlePendingHeader;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattlePendingHeader extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattlePendingHeader INSTANCE = new BattlePendingHeader();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattlePendingHeader)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 788128342;
            }

            public String toString() {
                return "BattlePendingHeader";
            }

            private BattlePendingHeader() {
                super(ColorKt.Color(4279767850L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattlePendingAccent;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattlePendingAccent extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattlePendingAccent INSTANCE = new BattlePendingAccent();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattlePendingAccent)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 585938067;
            }

            public String toString() {
                return "BattlePendingAccent";
            }

            private BattlePendingAccent() {
                super(ColorKt.Color(4291081727L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattlePendingGlow;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattlePendingGlow extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattlePendingGlow INSTANCE = new BattlePendingGlow();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattlePendingGlow)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1080765546;
            }

            public String toString() {
                return "BattlePendingGlow";
            }

            private BattlePendingGlow() {
                super(ColorKt.Color(4286275583L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleActiveHeader;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleActiveHeader extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleActiveHeader INSTANCE = new BattleActiveHeader();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleActiveHeader)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1811212193;
            }

            public String toString() {
                return "BattleActiveHeader";
            }

            private BattleActiveHeader() {
                super(ColorKt.Color(4278850856L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleActiveAccent;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleActiveAccent extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleActiveAccent INSTANCE = new BattleActiveAccent();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleActiveAccent)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1609021918;
            }

            public String toString() {
                return "BattleActiveAccent";
            }

            private BattleActiveAccent() {
                super(ColorKt.Color(4281040127L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleActiveGlow;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleActiveGlow extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleActiveGlow INSTANCE = new BattleActiveGlow();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleActiveGlow)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1972809633;
            }

            public String toString() {
                return "BattleActiveGlow";
            }

            private BattleActiveGlow() {
                super(ColorKt.Color(4284401919L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleReturnedHeader;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleReturnedHeader extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleReturnedHeader INSTANCE = new BattleReturnedHeader();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleReturnedHeader)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -468498390;
            }

            public String toString() {
                return "BattleReturnedHeader";
            }

            private BattleReturnedHeader() {
                super(ColorKt.Color(4279901732L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleReturnedAccent;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleReturnedAccent extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleReturnedAccent INSTANCE = new BattleReturnedAccent();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleReturnedAccent)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -670688665;
            }

            public String toString() {
                return "BattleReturnedAccent";
            }

            private BattleReturnedAccent() {
                super(ColorKt.Color(4291877090L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleReturnedGlow;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleReturnedGlow extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleReturnedGlow INSTANCE = new BattleReturnedGlow();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleReturnedGlow)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 2041945706;
            }

            public String toString() {
                return "BattleReturnedGlow";
            }

            private BattleReturnedGlow() {
                super(ColorKt.Color(4287273904L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleCanceledHeader;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleCanceledHeader extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleCanceledHeader INSTANCE = new BattleCanceledHeader();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleCanceledHeader)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1215934604;
            }

            public String toString() {
                return "BattleCanceledHeader";
            }

            private BattleCanceledHeader() {
                super(ColorKt.Color(4280947732L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleCanceledAccent;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleCanceledAccent extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleCanceledAccent INSTANCE = new BattleCanceledAccent();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleCanceledAccent)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1418124879;
            }

            public String toString() {
                return "BattleCanceledAccent";
            }

            private BattleCanceledAccent() {
                super(ColorKt.Color(4294930544L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleCanceledGlow;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleCanceledGlow extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleCanceledGlow INSTANCE = new BattleCanceledGlow();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleCanceledGlow)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -604639180;
            }

            public String toString() {
                return "BattleCanceledGlow";
            }

            private BattleCanceledGlow() {
                super(ColorKt.Color(4294919493L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleFinishedHeader;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleFinishedHeader extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleFinishedHeader INSTANCE = new BattleFinishedHeader();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleFinishedHeader)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1501987981;
            }

            public String toString() {
                return "BattleFinishedHeader";
            }

            private BattleFinishedHeader() {
                super(ColorKt.Color(4279246382L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleFinishedAccent;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleFinishedAccent extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleFinishedAccent INSTANCE = new BattleFinishedAccent();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleFinishedAccent)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1299797706;
            }

            public String toString() {
                return "BattleFinishedAccent";
            }

            private BattleFinishedAccent() {
                super(ColorKt.Color(4284266751L), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppColorPalette$BattleFinishedGlow;", "Lorg/betup/ui/views/ComposeUtils$AppColorPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BattleFinishedGlow extends AppColorPalette {
            public static final int $stable = 0;
            public static final BattleFinishedGlow INSTANCE = new BattleFinishedGlow();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BattleFinishedGlow)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -293431411;
            }

            public String toString() {
                return "BattleFinishedGlow";
            }

            private BattleFinishedGlow() {
                super(ColorKt.Color(4282224614L), null);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ComposeUtils.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$BattleResultVisualTone;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "WON", "LOST", "DRAW", "PENDING", "ACTIVE", "RETURNED", "CANCELED", "FINISHED", "NEUTRAL", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BattleResultVisualTone {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BattleResultVisualTone[] $VALUES;
        public static final BattleResultVisualTone WON = new BattleResultVisualTone("WON", 0);
        public static final BattleResultVisualTone LOST = new BattleResultVisualTone("LOST", 1);
        public static final BattleResultVisualTone DRAW = new BattleResultVisualTone("DRAW", 2);
        public static final BattleResultVisualTone PENDING = new BattleResultVisualTone("PENDING", 3);
        public static final BattleResultVisualTone ACTIVE = new BattleResultVisualTone("ACTIVE", 4);
        public static final BattleResultVisualTone RETURNED = new BattleResultVisualTone("RETURNED", 5);
        public static final BattleResultVisualTone CANCELED = new BattleResultVisualTone("CANCELED", 6);
        public static final BattleResultVisualTone FINISHED = new BattleResultVisualTone("FINISHED", 7);
        public static final BattleResultVisualTone NEUTRAL = new BattleResultVisualTone("NEUTRAL", 8);

        private static final /* synthetic */ BattleResultVisualTone[] $values() {
            return new BattleResultVisualTone[]{WON, LOST, DRAW, PENDING, ACTIVE, RETURNED, CANCELED, FINISHED, NEUTRAL};
        }

        public static EnumEntries<BattleResultVisualTone> getEntries() {
            return $ENTRIES;
        }

        private BattleResultVisualTone(String str, int i) {
        }

        static {
            BattleResultVisualTone[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static BattleResultVisualTone valueOf(String str) {
            return (BattleResultVisualTone) Enum.valueOf(BattleResultVisualTone.class, str);
        }

        public static BattleResultVisualTone[] values() {
            return (BattleResultVisualTone[]) $VALUES.clone();
        }
    }

    /* compiled from: ComposeUtils.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bD\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0010\u0010.\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b/\u0010\u001bJ\u0010\u00100\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b1\u0010\u001bJ\u0010\u00102\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b3\u0010\u001bJ\u0010\u00104\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b5\u0010\u001bJ\t\u00106\u001a\u00020\nHÆ\u0003J\t\u00107\u001a\u00020\nHÆ\u0003J\u0010\u00108\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b9\u0010\u001bJ\u0010\u0010:\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b;\u0010\u001bJ\t\u0010<\u001a\u00020\nHÆ\u0003J\u0010\u0010=\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b>\u0010\u001bJ\u0010\u0010?\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b@\u0010\u001bJ\u0010\u0010A\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bB\u0010\u001bJ\u0010\u0010C\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bD\u0010\u001bJ\u0010\u0010E\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bF\u0010\u001bJ\u0010\u0010G\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bH\u0010\u001bJ\u0010\u0010I\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bJ\u0010\u001bJº\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\bL\u0010MJ\u0013\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020RHÖ\u0001J\t\u0010S\u001a\u00020THÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u0007\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b#\u0010\u001bR\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b$\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0013\u0010\u000f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b&\u0010\u001bR\u0013\u0010\u0010\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b'\u0010\u001bR\u0013\u0010\u0011\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b(\u0010\u001bR\u0013\u0010\u0012\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b)\u0010\u001bR\u0013\u0010\u0013\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b*\u0010\u001bR\u0013\u0010\u0014\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b+\u0010\u001bR\u0013\u0010\u0015\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b,\u0010\u001b¨\u0006U"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$BattleResultStyleTokens;", "", "tone", "Lorg/betup/ui/views/ComposeUtils$BattleResultVisualTone;", "accent", "Landroidx/compose/ui/graphics/Color;", "accentBright", "accentSoft", "glow", "headerGradient", "Landroidx/compose/ui/graphics/Brush;", "titleGradient", "cardBorderWin", "cardBorderLose", "dialogBorder", "captionBorder", "subtitle", "potBorder", "potFillTop", "potFillBottom", "emblemShadow", "amountColor", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/views/ComposeUtils$BattleResultVisualTone;JJJJLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;JJLandroidx/compose/ui/graphics/Brush;JJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTone", "()Lorg/betup/ui/views/ComposeUtils$BattleResultVisualTone;", "getAccent-0d7_KjU", "()J", "J", "getAccentBright-0d7_KjU", "getAccentSoft-0d7_KjU", "getGlow-0d7_KjU", "getHeaderGradient", "()Landroidx/compose/ui/graphics/Brush;", "getTitleGradient", "getCardBorderWin-0d7_KjU", "getCardBorderLose-0d7_KjU", "getDialogBorder", "getCaptionBorder-0d7_KjU", "getSubtitle-0d7_KjU", "getPotBorder-0d7_KjU", "getPotFillTop-0d7_KjU", "getPotFillBottom-0d7_KjU", "getEmblemShadow-0d7_KjU", "getAmountColor-0d7_KjU", "component1", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "component6", "component7", "component8", "component8-0d7_KjU", "component9", "component9-0d7_KjU", "component10", "component11", "component11-0d7_KjU", "component12", "component12-0d7_KjU", "component13", "component13-0d7_KjU", "component14", "component14-0d7_KjU", "component15", "component15-0d7_KjU", "component16", "component16-0d7_KjU", "component17", "component17-0d7_KjU", "copy", "copy-z3SvwDI", "(Lorg/betup/ui/views/ComposeUtils$BattleResultVisualTone;JJJJLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;JJLandroidx/compose/ui/graphics/Brush;JJJJJJJ)Lorg/betup/ui/views/ComposeUtils$BattleResultStyleTokens;", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BattleResultStyleTokens {
        public static final int $stable = 0;
        private final long accent;
        private final long accentBright;
        private final long accentSoft;
        private final long amountColor;
        private final long captionBorder;
        private final long cardBorderLose;
        private final long cardBorderWin;
        private final Brush dialogBorder;
        private final long emblemShadow;
        private final long glow;
        private final Brush headerGradient;
        private final long potBorder;
        private final long potFillBottom;
        private final long potFillTop;
        private final long subtitle;
        private final Brush titleGradient;
        private final BattleResultVisualTone tone;

        public /* synthetic */ BattleResultStyleTokens(BattleResultVisualTone battleResultVisualTone, long j, long j2, long j3, long j4, Brush brush, Brush brush2, long j5, long j6, Brush brush3, long j7, long j8, long j9, long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
            this(battleResultVisualTone, j, j2, j3, j4, brush, brush2, j5, j6, brush3, j7, j8, j9, j10, j11, j12, j13);
        }

        /* renamed from: component1, reason: from getter */
        public final BattleResultVisualTone getTone() {
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

        /* renamed from: copy-z3SvwDI, reason: not valid java name */
        public final BattleResultStyleTokens m14411copyz3SvwDI(BattleResultVisualTone tone, long accent, long accentBright, long accentSoft, long glow, Brush headerGradient, Brush titleGradient, long cardBorderWin, long cardBorderLose, Brush dialogBorder, long captionBorder, long subtitle, long potBorder, long potFillTop, long potFillBottom, long emblemShadow, long amountColor) {
            Intrinsics.checkNotNullParameter(tone, "tone");
            Intrinsics.checkNotNullParameter(headerGradient, "headerGradient");
            Intrinsics.checkNotNullParameter(titleGradient, "titleGradient");
            Intrinsics.checkNotNullParameter(dialogBorder, "dialogBorder");
            return new BattleResultStyleTokens(tone, accent, accentBright, accentSoft, glow, headerGradient, titleGradient, cardBorderWin, cardBorderLose, dialogBorder, captionBorder, subtitle, potBorder, potFillTop, potFillBottom, emblemShadow, amountColor, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BattleResultStyleTokens)) {
                return false;
            }
            BattleResultStyleTokens battleResultStyleTokens = (BattleResultStyleTokens) other;
            return this.tone == battleResultStyleTokens.tone && Color.m5169equalsimpl0(this.accent, battleResultStyleTokens.accent) && Color.m5169equalsimpl0(this.accentBright, battleResultStyleTokens.accentBright) && Color.m5169equalsimpl0(this.accentSoft, battleResultStyleTokens.accentSoft) && Color.m5169equalsimpl0(this.glow, battleResultStyleTokens.glow) && Intrinsics.areEqual(this.headerGradient, battleResultStyleTokens.headerGradient) && Intrinsics.areEqual(this.titleGradient, battleResultStyleTokens.titleGradient) && Color.m5169equalsimpl0(this.cardBorderWin, battleResultStyleTokens.cardBorderWin) && Color.m5169equalsimpl0(this.cardBorderLose, battleResultStyleTokens.cardBorderLose) && Intrinsics.areEqual(this.dialogBorder, battleResultStyleTokens.dialogBorder) && Color.m5169equalsimpl0(this.captionBorder, battleResultStyleTokens.captionBorder) && Color.m5169equalsimpl0(this.subtitle, battleResultStyleTokens.subtitle) && Color.m5169equalsimpl0(this.potBorder, battleResultStyleTokens.potBorder) && Color.m5169equalsimpl0(this.potFillTop, battleResultStyleTokens.potFillTop) && Color.m5169equalsimpl0(this.potFillBottom, battleResultStyleTokens.potFillBottom) && Color.m5169equalsimpl0(this.emblemShadow, battleResultStyleTokens.emblemShadow) && Color.m5169equalsimpl0(this.amountColor, battleResultStyleTokens.amountColor);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((this.tone.hashCode() * 31) + Color.m5175hashCodeimpl(this.accent)) * 31) + Color.m5175hashCodeimpl(this.accentBright)) * 31) + Color.m5175hashCodeimpl(this.accentSoft)) * 31) + Color.m5175hashCodeimpl(this.glow)) * 31) + this.headerGradient.hashCode()) * 31) + this.titleGradient.hashCode()) * 31) + Color.m5175hashCodeimpl(this.cardBorderWin)) * 31) + Color.m5175hashCodeimpl(this.cardBorderLose)) * 31) + this.dialogBorder.hashCode()) * 31) + Color.m5175hashCodeimpl(this.captionBorder)) * 31) + Color.m5175hashCodeimpl(this.subtitle)) * 31) + Color.m5175hashCodeimpl(this.potBorder)) * 31) + Color.m5175hashCodeimpl(this.potFillTop)) * 31) + Color.m5175hashCodeimpl(this.potFillBottom)) * 31) + Color.m5175hashCodeimpl(this.emblemShadow)) * 31) + Color.m5175hashCodeimpl(this.amountColor);
        }

        public String toString() {
            return "BattleResultStyleTokens(tone=" + this.tone + ", accent=" + Color.m5176toStringimpl(this.accent) + ", accentBright=" + Color.m5176toStringimpl(this.accentBright) + ", accentSoft=" + Color.m5176toStringimpl(this.accentSoft) + ", glow=" + Color.m5176toStringimpl(this.glow) + ", headerGradient=" + this.headerGradient + ", titleGradient=" + this.titleGradient + ", cardBorderWin=" + Color.m5176toStringimpl(this.cardBorderWin) + ", cardBorderLose=" + Color.m5176toStringimpl(this.cardBorderLose) + ", dialogBorder=" + this.dialogBorder + ", captionBorder=" + Color.m5176toStringimpl(this.captionBorder) + ", subtitle=" + Color.m5176toStringimpl(this.subtitle) + ", potBorder=" + Color.m5176toStringimpl(this.potBorder) + ", potFillTop=" + Color.m5176toStringimpl(this.potFillTop) + ", potFillBottom=" + Color.m5176toStringimpl(this.potFillBottom) + ", emblemShadow=" + Color.m5176toStringimpl(this.emblemShadow) + ", amountColor=" + Color.m5176toStringimpl(this.amountColor) + ")";
        }

        private BattleResultStyleTokens(BattleResultVisualTone tone, long j, long j2, long j3, long j4, Brush headerGradient, Brush titleGradient, long j5, long j6, Brush dialogBorder, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
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
        }

        public final BattleResultVisualTone getTone() {
            return this.tone;
        }

        /* renamed from: getAccent-0d7_KjU, reason: not valid java name */
        public final long m14412getAccent0d7_KjU() {
            return this.accent;
        }

        /* renamed from: getAccentBright-0d7_KjU, reason: not valid java name */
        public final long m14413getAccentBright0d7_KjU() {
            return this.accentBright;
        }

        /* renamed from: getAccentSoft-0d7_KjU, reason: not valid java name */
        public final long m14414getAccentSoft0d7_KjU() {
            return this.accentSoft;
        }

        /* renamed from: getGlow-0d7_KjU, reason: not valid java name */
        public final long m14420getGlow0d7_KjU() {
            return this.glow;
        }

        public final Brush getHeaderGradient() {
            return this.headerGradient;
        }

        public final Brush getTitleGradient() {
            return this.titleGradient;
        }

        /* renamed from: getCardBorderWin-0d7_KjU, reason: not valid java name */
        public final long m14418getCardBorderWin0d7_KjU() {
            return this.cardBorderWin;
        }

        /* renamed from: getCardBorderLose-0d7_KjU, reason: not valid java name */
        public final long m14417getCardBorderLose0d7_KjU() {
            return this.cardBorderLose;
        }

        public final Brush getDialogBorder() {
            return this.dialogBorder;
        }

        /* renamed from: getCaptionBorder-0d7_KjU, reason: not valid java name */
        public final long m14416getCaptionBorder0d7_KjU() {
            return this.captionBorder;
        }

        /* renamed from: getSubtitle-0d7_KjU, reason: not valid java name */
        public final long m14424getSubtitle0d7_KjU() {
            return this.subtitle;
        }

        /* renamed from: getPotBorder-0d7_KjU, reason: not valid java name */
        public final long m14421getPotBorder0d7_KjU() {
            return this.potBorder;
        }

        /* renamed from: getPotFillTop-0d7_KjU, reason: not valid java name */
        public final long m14423getPotFillTop0d7_KjU() {
            return this.potFillTop;
        }

        /* renamed from: getPotFillBottom-0d7_KjU, reason: not valid java name */
        public final long m14422getPotFillBottom0d7_KjU() {
            return this.potFillBottom;
        }

        /* renamed from: getEmblemShadow-0d7_KjU, reason: not valid java name */
        public final long m14419getEmblemShadow0d7_KjU() {
            return this.emblemShadow;
        }

        /* renamed from: getAmountColor-0d7_KjU, reason: not valid java name */
        public final long m14415getAmountColor0d7_KjU() {
            return this.amountColor;
        }
    }

    /* compiled from: ComposeUtils.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$BattleResultStyle;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "fromEffectiveState", "Lorg/betup/ui/views/ComposeUtils$BattleResultVisualTone;", "effectiveState", "", "(Ljava/lang/Integer;)Lorg/betup/ui/views/ComposeUtils$BattleResultVisualTone;", "tokens", "Lorg/betup/ui/views/ComposeUtils$BattleResultStyleTokens;", "tone", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BattleResultStyle {
        public static final int $stable = 0;
        public static final BattleResultStyle INSTANCE = new BattleResultStyle();

        /* compiled from: ComposeUtils.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BattleResultVisualTone.values().length];
                try {
                    iArr[BattleResultVisualTone.WON.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BattleResultVisualTone.LOST.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BattleResultVisualTone.DRAW.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[BattleResultVisualTone.PENDING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[BattleResultVisualTone.ACTIVE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[BattleResultVisualTone.RETURNED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[BattleResultVisualTone.CANCELED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[BattleResultVisualTone.FINISHED.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[BattleResultVisualTone.NEUTRAL.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private BattleResultStyle() {
        }

        public final BattleResultVisualTone fromEffectiveState(Integer effectiveState) {
            if (effectiveState != null && effectiveState.intValue() == 4) {
                return BattleResultVisualTone.WON;
            }
            if (effectiveState != null && effectiveState.intValue() == 5) {
                return BattleResultVisualTone.LOST;
            }
            if (effectiveState != null && effectiveState.intValue() == 6) {
                return BattleResultVisualTone.DRAW;
            }
            if (effectiveState != null && effectiveState.intValue() == 1) {
                return BattleResultVisualTone.PENDING;
            }
            if ((effectiveState != null && effectiveState.intValue() == 2) || (effectiveState != null && effectiveState.intValue() == 8)) {
                return BattleResultVisualTone.ACTIVE;
            }
            return (effectiveState != null && effectiveState.intValue() == 7) ? BattleResultVisualTone.RETURNED : (effectiveState != null && effectiveState.intValue() == 10) ? BattleResultVisualTone.CANCELED : (effectiveState != null && effectiveState.intValue() == 9) ? BattleResultVisualTone.FINISHED : BattleResultVisualTone.NEUTRAL;
        }

        public final BattleResultStyleTokens tokens(BattleResultVisualTone tone) {
            BattleResultStyleTokens battleResultStyleTokens;
            Intrinsics.checkNotNullParameter(tone, "tone");
            switch (WhenMappings.$EnumSwitchMapping$0[tone.ordinal()]) {
                case 1:
                    battleResultStyleTokens = new BattleResultStyleTokens(tone, AppColorPalette.BattleWonAccent.INSTANCE.getColor(), AppColorPalette.BattleWonAccentBright.INSTANCE.getColor(), Color.m5167copywmQWz5c$default(AppColorPalette.BattleWonAccent.INSTANCE.getColor(), 0.18f, 0.0f, 0.0f, 0.0f, 14, null), AppColorPalette.BattleWonGlow.INSTANCE.getColor(), Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleWonHeader.INSTANCE.getColor(), 0.96f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleWonHeader.INSTANCE.getColor(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(AppColorPalette.BattleTitleGoldLight.INSTANCE.getColor()), Color.m5158boximpl(AppColorPalette.BattleTitleGold.INSTANCE.getColor())}), 0.0f, 0.0f, 0, 14, (Object) null), AppColorPalette.BattleWonAccent.INSTANCE.getColor(), Color.m5167copywmQWz5c$default(AppColorPalette.Red.INSTANCE.getColor(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null), Brush.Companion.m5119linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleWonAccentBright.INSTANCE.getColor(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleWonGlow.INSTANCE.getColor(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleWonAccent.INSTANCE.getColor(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null))}), 0L, 0L, 0, 14, (Object) null), Color.m5167copywmQWz5c$default(AppColorPalette.BattleWonAccent.INSTANCE.getColor(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), AppColorPalette.BattleSubtitleText.INSTANCE.getColor(), Color.m5167copywmQWz5c$default(AppColorPalette.Gold.INSTANCE.getColor(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.Gold.INSTANCE.getColor(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.Gold.INSTANCE.getColor(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.BattleWonGlow.INSTANCE.getColor(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null), AppColorPalette.BattleWonAccentBright.INSTANCE.getColor(), null);
                    break;
                case 2:
                    battleResultStyleTokens = new BattleResultStyleTokens(tone, AppColorPalette.BattleLostAccent.INSTANCE.getColor(), AppColorPalette.BattleLostAccentBright.INSTANCE.getColor(), Color.m5167copywmQWz5c$default(AppColorPalette.BattleLostAccent.INSTANCE.getColor(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), AppColorPalette.BattleLostGlow.INSTANCE.getColor(), Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleLostHeader.INSTANCE.getColor(), 0.96f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleLostHeader.INSTANCE.getColor(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(AppColorPalette.BattleTitleLostLight.INSTANCE.getColor()), Color.m5158boximpl(AppColorPalette.BattleTitleLost.INSTANCE.getColor())}), 0.0f, 0.0f, 0, 14, (Object) null), Color.m5167copywmQWz5c$default(AppColorPalette.BattleWonAccent.INSTANCE.getColor(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), AppColorPalette.BattleLostAccent.INSTANCE.getColor(), Brush.Companion.m5119linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleLostAccentBright.INSTANCE.getColor(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleLostGlow.INSTANCE.getColor(), 0.28f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleLostAccent.INSTANCE.getColor(), 0.58f, 0.0f, 0.0f, 0.0f, 14, null))}), 0L, 0L, 0, 14, (Object) null), Color.m5167copywmQWz5c$default(AppColorPalette.BattleLostAccent.INSTANCE.getColor(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), AppColorPalette.BattleSubtitleText.INSTANCE.getColor(), Color.m5167copywmQWz5c$default(AppColorPalette.Gold.INSTANCE.getColor(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.Gold.INSTANCE.getColor(), 0.22f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.Gold.INSTANCE.getColor(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.BattleLostGlow.INSTANCE.getColor(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), AppColorPalette.BattleLostAccentBright.INSTANCE.getColor(), null);
                    break;
                case 3:
                    battleResultStyleTokens = new BattleResultStyleTokens(tone, AppColorPalette.Gold.INSTANCE.getColor(), AppColorPalette.BattleDrawGlow.INSTANCE.getColor(), Color.m5167copywmQWz5c$default(AppColorPalette.BattleDrawGlow.INSTANCE.getColor(), 0.14f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.BattleDrawGlow.INSTANCE.getColor(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleDrawHeader.INSTANCE.getColor(), 0.94f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleDrawHeader.INSTANCE.getColor(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(AppColorPalette.BattleTitleGoldLight.INSTANCE.getColor()), Color.m5158boximpl(AppColorPalette.BattleTitleGold.INSTANCE.getColor())}), 0.0f, 0.0f, 0, 14, (Object) null), AppColorPalette.Gold.INSTANCE.getColor(), AppColorPalette.Gray.INSTANCE.getColor(), Brush.Companion.m5119linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleTitleGold.INSTANCE.getColor(), 0.82f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.GoldBackgroundFortune1.INSTANCE.getColor(), 0.28f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.Gold.INSTANCE.getColor(), 0.58f, 0.0f, 0.0f, 0.0f, 14, null))}), 0L, 0L, 0, 14, (Object) null), Color.m5167copywmQWz5c$default(AppColorPalette.Gold.INSTANCE.getColor(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), AppColorPalette.BattleSubtitleText.INSTANCE.getColor(), Color.m5167copywmQWz5c$default(AppColorPalette.Gold.INSTANCE.getColor(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.Gold.INSTANCE.getColor(), 0.28f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.Gold.INSTANCE.getColor(), 0.09f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.BattleDrawGlow.INSTANCE.getColor(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), AppColorPalette.BattleTitleGold.INSTANCE.getColor(), null);
                    break;
                case 4:
                    battleResultStyleTokens = new BattleResultStyleTokens(tone, AppColorPalette.BattlePendingAccent.INSTANCE.getColor(), AppColorPalette.Violet.INSTANCE.getColor(), Color.m5167copywmQWz5c$default(AppColorPalette.BattlePendingAccent.INSTANCE.getColor(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.BattlePendingGlow.INSTANCE.getColor(), 0.62f, 0.0f, 0.0f, 0.0f, 14, null), Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattlePendingHeader.INSTANCE.getColor(), 0.96f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattlePendingHeader.INSTANCE.getColor(), 0.34f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(AppColorPalette.White.INSTANCE.getColor()), Color.m5158boximpl(AppColorPalette.BattlePendingAccent.INSTANCE.getColor())}), 0.0f, 0.0f, 0, 14, (Object) null), AppColorPalette.BattlePendingAccent.INSTANCE.getColor(), AppColorPalette.Gray.INSTANCE.getColor(), Brush.Companion.m5119linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattlePendingAccent.INSTANCE.getColor(), 0.78f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattlePendingGlow.INSTANCE.getColor(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.Violet.INSTANCE.getColor(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null))}), 0L, 0L, 0, 14, (Object) null), Color.m5167copywmQWz5c$default(AppColorPalette.BattlePendingAccent.INSTANCE.getColor(), 0.28f, 0.0f, 0.0f, 0.0f, 14, null), AppColorPalette.BattleSubtitleText.INSTANCE.getColor(), Color.m5167copywmQWz5c$default(AppColorPalette.Gold.INSTANCE.getColor(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.Gold.INSTANCE.getColor(), 0.24f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.Gold.INSTANCE.getColor(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.BattlePendingGlow.INSTANCE.getColor(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), AppColorPalette.Gold.INSTANCE.getColor(), null);
                    break;
                case 5:
                    battleResultStyleTokens = new BattleResultStyleTokens(tone, AppColorPalette.BattleActiveAccent.INSTANCE.getColor(), AppColorPalette.BattleActiveGlow.INSTANCE.getColor(), Color.m5167copywmQWz5c$default(AppColorPalette.BattleActiveAccent.INSTANCE.getColor(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.BattleActiveGlow.INSTANCE.getColor(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleActiveHeader.INSTANCE.getColor(), 0.96f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(ColorKt.Color(4279249490L), 0.42f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ColorKt.Color(4290767103L)), Color.m5158boximpl(AppColorPalette.BattleActiveGlow.INSTANCE.getColor()), Color.m5158boximpl(AppColorPalette.BattleActiveAccent.INSTANCE.getColor())}), 0.0f, 0.0f, 0, 14, (Object) null), AppColorPalette.BattleActiveAccent.INSTANCE.getColor(), AppColorPalette.Gray.INSTANCE.getColor(), Brush.Companion.m5119linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleActiveGlow.INSTANCE.getColor(), 0.88f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleActiveAccent.INSTANCE.getColor(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.Gold.INSTANCE.getColor(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null))}), 0L, 0L, 0, 14, (Object) null), Color.m5167copywmQWz5c$default(AppColorPalette.BattleActiveAccent.INSTANCE.getColor(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), AppColorPalette.BattleSubtitleText.INSTANCE.getColor(), Color.m5167copywmQWz5c$default(AppColorPalette.BattleActiveAccent.INSTANCE.getColor(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.BattleActiveAccent.INSTANCE.getColor(), 0.28f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.BattleActiveAccent.INSTANCE.getColor(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.BattleActiveGlow.INSTANCE.getColor(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null), AppColorPalette.BattleActiveGlow.INSTANCE.getColor(), null);
                    break;
                case 6:
                    battleResultStyleTokens = new BattleResultStyleTokens(tone, AppColorPalette.BattleReturnedAccent.INSTANCE.getColor(), AppColorPalette.GrayLight.INSTANCE.getColor(), Color.m5167copywmQWz5c$default(AppColorPalette.Gray.INSTANCE.getColor(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.BattleReturnedGlow.INSTANCE.getColor(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleReturnedHeader.INSTANCE.getColor(), 0.92f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(AppColorPalette.GrayLight.INSTANCE.getColor()), Color.m5158boximpl(AppColorPalette.Gray.INSTANCE.getColor())}), 0.0f, 0.0f, 0, 14, (Object) null), AppColorPalette.Gray.INSTANCE.getColor(), AppColorPalette.Gray.INSTANCE.getColor(), Brush.Companion.m5119linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.Gray.INSTANCE.getColor(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.GrayDark.INSTANCE.getColor(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.Gray.INSTANCE.getColor(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null))}), 0L, 0L, 0, 14, (Object) null), Color.m5167copywmQWz5c$default(AppColorPalette.Gray.INSTANCE.getColor(), 0.28f, 0.0f, 0.0f, 0.0f, 14, null), AppColorPalette.BattleSubtitleText.INSTANCE.getColor(), Color.m5167copywmQWz5c$default(AppColorPalette.Gray.INSTANCE.getColor(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.Gray.INSTANCE.getColor(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.GrayDark.INSTANCE.getColor(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.Gray.INSTANCE.getColor(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), AppColorPalette.GrayLight.INSTANCE.getColor(), null);
                    break;
                case 7:
                    battleResultStyleTokens = new BattleResultStyleTokens(tone, AppColorPalette.BattleCanceledAccent.INSTANCE.getColor(), AppColorPalette.Red.INSTANCE.getColor(), Color.m5167copywmQWz5c$default(AppColorPalette.BattleCanceledAccent.INSTANCE.getColor(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.BattleCanceledGlow.INSTANCE.getColor(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null), Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleCanceledHeader.INSTANCE.getColor(), 0.92f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(AppColorPalette.GrayLight.INSTANCE.getColor()), Color.m5158boximpl(AppColorPalette.BattleCanceledAccent.INSTANCE.getColor())}), 0.0f, 0.0f, 0, 14, (Object) null), AppColorPalette.Gray.INSTANCE.getColor(), AppColorPalette.BattleCanceledAccent.INSTANCE.getColor(), Brush.Companion.m5119linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleCanceledAccent.INSTANCE.getColor(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleCanceledAccent.INSTANCE.getColor(), 0.15f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleCanceledAccent.INSTANCE.getColor(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null))}), 0L, 0L, 0, 14, (Object) null), Color.m5167copywmQWz5c$default(AppColorPalette.BattleCanceledAccent.INSTANCE.getColor(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), AppColorPalette.BattleSubtitleText.INSTANCE.getColor(), Color.m5167copywmQWz5c$default(AppColorPalette.Gray.INSTANCE.getColor(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.Gray.INSTANCE.getColor(), 0.14f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.GrayDark.INSTANCE.getColor(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.BattleCanceledAccent.INSTANCE.getColor(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), AppColorPalette.GrayLight.INSTANCE.getColor(), null);
                    break;
                case 8:
                    battleResultStyleTokens = r0;
                    BattleResultStyleTokens battleResultStyleTokens2 = new BattleResultStyleTokens(tone, AppColorPalette.BattleFinishedAccent.INSTANCE.getColor(), AppColorPalette.Blue.INSTANCE.getColor(), Color.m5167copywmQWz5c$default(AppColorPalette.BattleFinishedAccent.INSTANCE.getColor(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.BattleFinishedGlow.INSTANCE.getColor(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleFinishedHeader.INSTANCE.getColor(), 0.92f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(AppColorPalette.White.INSTANCE.getColor()), Color.m5158boximpl(AppColorPalette.BattleFinishedAccent.INSTANCE.getColor())}), 0.0f, 0.0f, 0, 14, (Object) null), AppColorPalette.BattleFinishedAccent.INSTANCE.getColor(), AppColorPalette.Gray.INSTANCE.getColor(), Brush.Companion.m5119linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleFinishedAccent.INSTANCE.getColor(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleFinishedAccent.INSTANCE.getColor(), 0.18f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(Color.m5167copywmQWz5c$default(AppColorPalette.BattleFinishedAccent.INSTANCE.getColor(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null))}), 0L, 0L, 0, 14, (Object) null), Color.m5167copywmQWz5c$default(AppColorPalette.BattleFinishedAccent.INSTANCE.getColor(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), AppColorPalette.BattleSubtitleText.INSTANCE.getColor(), Color.m5167copywmQWz5c$default(AppColorPalette.Gold.INSTANCE.getColor(), 0.65f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.Gold.INSTANCE.getColor(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.Gold.INSTANCE.getColor(), 0.07f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.BattleFinishedAccent.INSTANCE.getColor(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), AppColorPalette.White.INSTANCE.getColor(), null);
                    break;
                case 9:
                    return new BattleResultStyleTokens(tone, AppColorPalette.Gold.INSTANCE.getColor(), AppColorPalette.GoldBackgroundFortune1.INSTANCE.getColor(), Color.m5167copywmQWz5c$default(AppColorPalette.GrayDark.INSTANCE.getColor(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), Color.INSTANCE.m5203getTransparent0d7_KjU(), Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU()), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(AppColorPalette.White.INSTANCE.getColor()), Color.m5158boximpl(AppColorPalette.White.INSTANCE.getColor())}), 0.0f, 0.0f, 0, 14, (Object) null), AppColorPalette.Gray.INSTANCE.getColor(), AppColorPalette.Gray.INSTANCE.getColor(), AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), Color.m5167copywmQWz5c$default(AppColorPalette.Gray.INSTANCE.getColor(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), AppColorPalette.Gray.INSTANCE.getColor(), Color.m5167copywmQWz5c$default(AppColorPalette.Gold.INSTANCE.getColor(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.Gold.INSTANCE.getColor(), 0.18f, 0.0f, 0.0f, 0.0f, 14, null), Color.m5167copywmQWz5c$default(AppColorPalette.Gold.INSTANCE.getColor(), 0.06f, 0.0f, 0.0f, 0.0f, 14, null), Color.INSTANCE.m5203getTransparent0d7_KjU(), AppColorPalette.White.INSTANCE.getColor(), null);
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return battleResultStyleTokens;
        }
    }

    /* compiled from: ComposeUtils.kt */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0015\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0015\u001d\u001e\u001f !\"#$%&'()*+,-./01¨\u00062"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppBrushPalette;", "", "brush", "Landroidx/compose/ui/graphics/Brush;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/compose/ui/graphics/Brush;)V", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "ButtonBackgroundGold", "ButtonBackgroundGold2", "GiftBackground", "GiftBorder", "ButtonBackgroundGoldBorder", "ButtonBackgroundBronze", "ButtonBackgroundSilver", "ButtonBackgroundGray", "ButtonBackgroundGrayMatchFilter", "ButtonBackgroundGrayBackground", "ButtonBackgroundGrayDouble", "ButtonBackgroundGrayDouble1", "BorderGray", "BorderGrayTransparent", "BorderGoldTransparent", "BorderFirstPurchase", "BorderDailyDeal", "BorderBundle", "BorderCoinPack", "BorderBestValue", "BorderGrayTransparentHorizontal", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$BorderBestValue;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$BorderBundle;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$BorderCoinPack;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$BorderDailyDeal;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$BorderFirstPurchase;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$BorderGoldTransparent;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$BorderGray;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$BorderGrayTransparent;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$BorderGrayTransparentHorizontal;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$ButtonBackgroundBronze;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$ButtonBackgroundGold;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$ButtonBackgroundGold2;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$ButtonBackgroundGoldBorder;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$ButtonBackgroundGray;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$ButtonBackgroundGrayBackground;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$ButtonBackgroundGrayDouble;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$ButtonBackgroundGrayDouble1;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$ButtonBackgroundGrayMatchFilter;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$ButtonBackgroundSilver;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$GiftBackground;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$GiftBorder;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class AppBrushPalette {
        public static final int $stable = 0;
        private final Brush brush;

        public /* synthetic */ AppBrushPalette(Brush brush, DefaultConstructorMarker defaultConstructorMarker) {
            this(brush);
        }

        private AppBrushPalette(Brush brush) {
            this.brush = brush;
        }

        public final Brush getBrush() {
            return this.brush;
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$ButtonBackgroundGold;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ButtonBackgroundGold extends AppBrushPalette {
            public static final int $stable = 0;
            public static final ButtonBackgroundGold INSTANCE = new ButtonBackgroundGold();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ButtonBackgroundGold)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 2019909101;
            }

            public String toString() {
                return "ButtonBackgroundGold";
            }

            private ButtonBackgroundGold() {
                super(Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ColorKt.Color(4294955922L)), Color.m5158boximpl(ColorKt.Color(4294946874L))}), 0.0f, 0.0f, 0, 14, (Object) null), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$ButtonBackgroundGold2;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ButtonBackgroundGold2 extends AppBrushPalette {
            public static final int $stable = 0;
            public static final ButtonBackgroundGold2 INSTANCE = new ButtonBackgroundGold2();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ButtonBackgroundGold2)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1807327259;
            }

            public String toString() {
                return "ButtonBackgroundGold2";
            }

            private ButtonBackgroundGold2() {
                super(Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ColorKt.Color(4294946874L)), Color.m5158boximpl(ColorKt.Color(4294955922L))}), 0.0f, 0.0f, 0, 14, (Object) null), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$GiftBackground;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class GiftBackground extends AppBrushPalette {
            public static final int $stable = 0;
            public static final GiftBackground INSTANCE = new GiftBackground();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GiftBackground)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 169352107;
            }

            public String toString() {
                return "GiftBackground";
            }

            private GiftBackground() {
                super(Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ColorKt.Color(4280624686L)), Color.m5158boximpl(ColorKt.Color(4280032032L))}), 0.0f, 0.0f, 0, 14, (Object) null), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$GiftBorder;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class GiftBorder extends AppBrushPalette {
            public static final int $stable = 0;
            public static final GiftBorder INSTANCE = new GiftBorder();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GiftBorder)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1615135017;
            }

            public String toString() {
                return "GiftBorder";
            }

            private GiftBorder() {
                super(Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ColorKt.Color(4285886854L)), Color.m5158boximpl(ColorKt.Color(4280032032L))}), 0.0f, 0.0f, 0, 14, (Object) null), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$ButtonBackgroundGoldBorder;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ButtonBackgroundGoldBorder extends AppBrushPalette {
            public static final int $stable = 0;
            public static final ButtonBackgroundGoldBorder INSTANCE = new ButtonBackgroundGoldBorder();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ButtonBackgroundGoldBorder)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -331229063;
            }

            public String toString() {
                return "ButtonBackgroundGoldBorder";
            }

            private ButtonBackgroundGoldBorder() {
                super(Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ColorKt.Color(4294952048L)), Color.m5158boximpl(ColorKt.Color(4294946874L))}), 0.0f, 0.0f, 0, 14, (Object) null), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$ButtonBackgroundBronze;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ButtonBackgroundBronze extends AppBrushPalette {
            public static final int $stable = 0;
            public static final ButtonBackgroundBronze INSTANCE = new ButtonBackgroundBronze();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ButtonBackgroundBronze)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -332844057;
            }

            public String toString() {
                return "ButtonBackgroundBronze";
            }

            private ButtonBackgroundBronze() {
                super(Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ColorKt.Color(4292115561L)), Color.m5158boximpl(ColorKt.Color(4285415478L))}), 0.0f, 0.0f, 0, 14, (Object) null), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$ButtonBackgroundSilver;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ButtonBackgroundSilver extends AppBrushPalette {
            public static final int $stable = 0;
            public static final ButtonBackgroundSilver INSTANCE = new ButtonBackgroundSilver();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ButtonBackgroundSilver)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 145457498;
            }

            public String toString() {
                return "ButtonBackgroundSilver";
            }

            private ButtonBackgroundSilver() {
                super(Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ColorKt.Color(4290032820L)), Color.m5158boximpl(ColorKt.Color(4283321934L))}), 0.0f, 0.0f, 0, 14, (Object) null), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$ButtonBackgroundGray;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ButtonBackgroundGray extends AppBrushPalette {
            public static final int $stable = 0;
            public static final ButtonBackgroundGray INSTANCE = new ButtonBackgroundGray();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ButtonBackgroundGray)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 2019911664;
            }

            public String toString() {
                return "ButtonBackgroundGray";
            }

            private ButtonBackgroundGray() {
                super(Brush.Companion.m5121radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(AppColorPalette.GrayDark.INSTANCE.getColor()), Color.m5158boximpl(AppColorPalette.GrayDark.INSTANCE.getColor())}), 0L, 0.0f, 0, 14, (Object) null), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$ButtonBackgroundGrayMatchFilter;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ButtonBackgroundGrayMatchFilter extends AppBrushPalette {
            public static final int $stable = 0;
            public static final ButtonBackgroundGrayMatchFilter INSTANCE = new ButtonBackgroundGrayMatchFilter();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ButtonBackgroundGrayMatchFilter)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 624513933;
            }

            public String toString() {
                return "ButtonBackgroundGrayMatchFilter";
            }

            private ButtonBackgroundGrayMatchFilter() {
                super(Brush.Companion.m5121radialGradientP_VxKs$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ColorKt.Color(4282006087L)), Color.m5158boximpl(ColorKt.Color(4280164390L))}), 0L, 0.0f, 0, 14, (Object) null), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$ButtonBackgroundGrayBackground;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ButtonBackgroundGrayBackground extends AppBrushPalette {
            public static final int $stable = 0;
            public static final ButtonBackgroundGrayBackground INSTANCE = new ButtonBackgroundGrayBackground();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ButtonBackgroundGrayBackground)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1075679938;
            }

            public String toString() {
                return "ButtonBackgroundGrayBackground";
            }

            private ButtonBackgroundGrayBackground() {
                super(Brush.Companion.m5126verticalGradient8A3gB4$default(Brush.INSTANCE, new Pair[]{TuplesKt.to(Float.valueOf(0.0f), Color.m5158boximpl(AppColorPalette.ScreenBackground.INSTANCE.getColor())), TuplesKt.to(Float.valueOf(0.75f), Color.m5158boximpl(AppColorPalette.ScreenBackground.INSTANCE.getColor()))}, 0.0f, 0.0f, 0, 14, (Object) null), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$ButtonBackgroundGrayDouble;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ButtonBackgroundGrayDouble extends AppBrushPalette {
            public static final int $stable = 0;
            public static final ButtonBackgroundGrayDouble INSTANCE = new ButtonBackgroundGrayDouble();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ButtonBackgroundGrayDouble)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1934615583;
            }

            public String toString() {
                return "ButtonBackgroundGrayDouble";
            }

            private ButtonBackgroundGrayDouble() {
                super(Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ColorKt.Color(4280558893L)), Color.m5158boximpl(ColorKt.Color(4280032032L))}), 0.0f, 0.0f, 0, 14, (Object) null), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$ButtonBackgroundGrayDouble1;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ButtonBackgroundGrayDouble1 extends AppBrushPalette {
            public static final int $stable = 0;
            public static final ButtonBackgroundGrayDouble1 INSTANCE = new ButtonBackgroundGrayDouble1();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ButtonBackgroundGrayDouble1)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 156459120;
            }

            public String toString() {
                return "ButtonBackgroundGrayDouble1";
            }

            private ButtonBackgroundGrayDouble1() {
                super(Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ColorKt.Color(4280624686L)), Color.m5158boximpl(ColorKt.Color(4280032032L))}), 0.0f, 0.0f, 0, 14, (Object) null), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$BorderGray;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BorderGray extends AppBrushPalette {
            public static final int $stable = 0;
            public static final BorderGray INSTANCE = new BorderGray();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BorderGray)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -529835940;
            }

            public String toString() {
                return "BorderGray";
            }

            private BorderGray() {
                super(Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ColorKt.Color(4285228921L)), Color.m5158boximpl(ColorKt.Color(4280163619L))}), 0.0f, 0.0f, 0, 14, (Object) null), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$BorderGrayTransparent;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BorderGrayTransparent extends AppBrushPalette {
            public static final int $stable = 0;
            public static final BorderGrayTransparent INSTANCE = new BorderGrayTransparent();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BorderGrayTransparent)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 267066198;
            }

            public String toString() {
                return "BorderGrayTransparent";
            }

            private BorderGrayTransparent() {
                super(Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ColorKt.Color(4285228921L)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$BorderGoldTransparent;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BorderGoldTransparent extends AppBrushPalette {
            public static final int $stable = 0;
            public static final BorderGoldTransparent INSTANCE = new BorderGoldTransparent();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BorderGoldTransparent)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 140539193;
            }

            public String toString() {
                return "BorderGoldTransparent";
            }

            private BorderGoldTransparent() {
                super(Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(AppColorPalette.Gold.INSTANCE.getColor()), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$BorderFirstPurchase;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BorderFirstPurchase extends AppBrushPalette {
            public static final int $stable = 0;
            public static final BorderFirstPurchase INSTANCE = new BorderFirstPurchase();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BorderFirstPurchase)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 28796408;
            }

            public String toString() {
                return "BorderFirstPurchase";
            }

            private BorderFirstPurchase() {
                super(Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ColorKt.Color(4293454064L)), Color.m5158boximpl(ColorKt.Color(1726540016)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$BorderDailyDeal;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BorderDailyDeal extends AppBrushPalette {
            public static final int $stable = 0;
            public static final BorderDailyDeal INSTANCE = new BorderDailyDeal();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BorderDailyDeal)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1727307724;
            }

            public String toString() {
                return "BorderDailyDeal";
            }

            private BorderDailyDeal() {
                super(Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ColorKt.Color(4294948941L)), Color.m5158boximpl(ColorKt.Color(1728034893)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$BorderBundle;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BorderBundle extends AppBrushPalette {
            public static final int $stable = 0;
            public static final BorderBundle INSTANCE = new BorderBundle();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BorderBundle)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1788765243;
            }

            public String toString() {
                return "BorderBundle";
            }

            private BorderBundle() {
                super(Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ColorKt.Color(4291657522L)), Color.m5158boximpl(ColorKt.Color(1724743474)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$BorderCoinPack;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BorderCoinPack extends AppBrushPalette {
            public static final int $stable = 0;
            public static final BorderCoinPack INSTANCE = new BorderCoinPack();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BorderCoinPack)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1594490307;
            }

            public String toString() {
                return "BorderCoinPack";
            }

            private BorderCoinPack() {
                super(Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ColorKt.Color(4287267988L)), Color.m5158boximpl(ColorKt.Color(1149928596)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$BorderBestValue;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BorderBestValue extends AppBrushPalette {
            public static final int $stable = 0;
            public static final BorderBestValue INSTANCE = new BorderBestValue();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BorderBestValue)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -88760428;
            }

            public String toString() {
                return "BorderBestValue";
            }

            private BorderBestValue() {
                super(Brush.Companion.m5125verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ColorKt.Color(4288376319L)), Color.m5158boximpl(ColorKt.Color(1721462271)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null);
            }
        }

        /* compiled from: ComposeUtils.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lorg/betup/ui/views/ComposeUtils$AppBrushPalette$BorderGrayTransparentHorizontal;", "Lorg/betup/ui/views/ComposeUtils$AppBrushPalette;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BorderGrayTransparentHorizontal extends AppBrushPalette {
            public static final int $stable = 0;
            public static final BorderGrayTransparentHorizontal INSTANCE = new BorderGrayTransparentHorizontal();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BorderGrayTransparentHorizontal)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1398853658;
            }

            public String toString() {
                return "BorderGrayTransparentHorizontal";
            }

            private BorderGrayTransparentHorizontal() {
                super(Brush.Companion.m5117horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(ColorKt.Color(4285228921L)), Color.m5158boximpl(Color.INSTANCE.m5203getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null);
            }
        }
    }

    public final FontFamily sfProFontFamily(Composer composer, int i) {
        composer.startReplaceGroup(1489011830);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1489011830, i, -1, "org.betup.ui.views.ComposeUtils.sfProFontFamily (ComposeUtils.kt:642)");
        }
        FontFamily FontFamily = FontFamilyKt.FontFamily(FontKt.m7330FontYpTlLL0$default(R.font.open_sans_bold, FontWeight.INSTANCE.getBold(), 0, 0, 12, null), FontKt.m7330FontYpTlLL0$default(R.font.open_sans_medium, FontWeight.INSTANCE.getMedium(), 0, 0, 12, null), FontKt.m7330FontYpTlLL0$default(R.font.open_sans_regular, FontWeight.INSTANCE.getNormal(), 0, 0, 12, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return FontFamily;
    }

    public final FontFamily openSansFamily(Composer composer, int i) {
        composer.startReplaceGroup(-291183642);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-291183642, i, -1, "org.betup.ui.views.ComposeUtils.openSansFamily (ComposeUtils.kt:649)");
        }
        FontFamily FontFamily = FontFamilyKt.FontFamily(FontKt.m7330FontYpTlLL0$default(R.font.open_sans_bold, FontWeight.INSTANCE.getBold(), 0, 0, 12, null), FontKt.m7330FontYpTlLL0$default(R.font.open_sans_medium, FontWeight.INSTANCE.getMedium(), 0, 0, 12, null), FontKt.m7330FontYpTlLL0$default(R.font.open_sans_regular, FontWeight.INSTANCE.getNormal(), 0, 0, 12, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return FontFamily;
    }
}
