package org.betup.ui.fragment.shop.compose;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.unit.Dp;
import androidx.webkit.Profile;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShopCardBorderStyle.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lorg/betup/ui/fragment/shop/compose/ShopCardBorderStyle;", "", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "borderBrush", "Landroidx/compose/ui/graphics/Brush;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;IFLandroidx/compose/ui/graphics/Brush;)V", "getBorderWidth-D9Ej5fM", "()F", "F", "getBorderBrush", "()Landroidx/compose/ui/graphics/Brush;", "FirstPurchase", "DailyDeal", "Bundle", "CoinPack", "BestValue", Profile.DEFAULT_PROFILE_NAME, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopCardBorderStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ShopCardBorderStyle[] $VALUES;
    public static final ShopCardBorderStyle BestValue;
    public static final ShopCardBorderStyle Bundle;
    public static final ShopCardBorderStyle DailyDeal;
    private final Brush borderBrush;
    private final float borderWidth;
    public static final ShopCardBorderStyle FirstPurchase = new ShopCardBorderStyle("FirstPurchase", 0, Dp.m7774constructorimpl((float) 2.5d), ComposeUtils.AppBrushPalette.BorderFirstPurchase.INSTANCE.getBrush());
    public static final ShopCardBorderStyle CoinPack = new ShopCardBorderStyle("CoinPack", 3, Dp.m7774constructorimpl((float) 1.5d), ComposeUtils.AppBrushPalette.BorderCoinPack.INSTANCE.getBrush());
    public static final ShopCardBorderStyle Default = new ShopCardBorderStyle(Profile.DEFAULT_PROFILE_NAME, 5, Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush());

    private static final /* synthetic */ ShopCardBorderStyle[] $values() {
        return new ShopCardBorderStyle[]{FirstPurchase, DailyDeal, Bundle, CoinPack, BestValue, Default};
    }

    public static EnumEntries<ShopCardBorderStyle> getEntries() {
        return $ENTRIES;
    }

    private ShopCardBorderStyle(String str, int i, float f, Brush brush) {
        this.borderWidth = f;
        this.borderBrush = brush;
    }

    /* renamed from: getBorderWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBorderWidth() {
        return this.borderWidth;
    }

    public final Brush getBorderBrush() {
        return this.borderBrush;
    }

    static {
        float f = 2;
        DailyDeal = new ShopCardBorderStyle("DailyDeal", 1, Dp.m7774constructorimpl(f), ComposeUtils.AppBrushPalette.BorderDailyDeal.INSTANCE.getBrush());
        Bundle = new ShopCardBorderStyle("Bundle", 2, Dp.m7774constructorimpl(f), ComposeUtils.AppBrushPalette.BorderBundle.INSTANCE.getBrush());
        BestValue = new ShopCardBorderStyle("BestValue", 4, Dp.m7774constructorimpl(f), ComposeUtils.AppBrushPalette.BorderBestValue.INSTANCE.getBrush());
        ShopCardBorderStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static ShopCardBorderStyle valueOf(String str) {
        return (ShopCardBorderStyle) Enum.valueOf(ShopCardBorderStyle.class, str);
    }

    public static ShopCardBorderStyle[] values() {
        return (ShopCardBorderStyle[]) $VALUES.clone();
    }
}
