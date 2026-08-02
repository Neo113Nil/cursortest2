package org.betup.ui.fragment.home.compose.sections;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeStatsSection.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lorg/betup/ui/fragment/home/compose/sections/HomeStatTileData;", "", "label", "", "value", "iconRes", "", "onClick", "Lkotlin/Function0;", "", "onBoundsReported", "Lkotlin/Function1;", "Landroid/graphics/Rect;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "getLabel", "()Ljava/lang/String;", "getValue", "getIconRes", "()I", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getOnBoundsReported", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* data */ class HomeStatTileData {
    private final int iconRes;
    private final String label;
    private final Function1<Rect, Unit> onBoundsReported;
    private final Function0<Unit> onClick;
    private final String value;

    public static /* synthetic */ HomeStatTileData copy$default(HomeStatTileData homeStatTileData, String str, String str2, int i, Function0 function0, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = homeStatTileData.label;
        }
        if ((i2 & 2) != 0) {
            str2 = homeStatTileData.value;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            i = homeStatTileData.iconRes;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            function0 = homeStatTileData.onClick;
        }
        Function0 function02 = function0;
        if ((i2 & 16) != 0) {
            function1 = homeStatTileData.onBoundsReported;
        }
        return homeStatTileData.copy(str, str3, i3, function02, function1);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIconRes() {
        return this.iconRes;
    }

    public final Function0<Unit> component4() {
        return this.onClick;
    }

    public final Function1<Rect, Unit> component5() {
        return this.onBoundsReported;
    }

    public final HomeStatTileData copy(String label, String value, int iconRes, Function0<Unit> onClick, Function1<? super Rect, Unit> onBoundsReported) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        return new HomeStatTileData(label, value, iconRes, onClick, onBoundsReported);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeStatTileData)) {
            return false;
        }
        HomeStatTileData homeStatTileData = (HomeStatTileData) other;
        return Intrinsics.areEqual(this.label, homeStatTileData.label) && Intrinsics.areEqual(this.value, homeStatTileData.value) && this.iconRes == homeStatTileData.iconRes && Intrinsics.areEqual(this.onClick, homeStatTileData.onClick) && Intrinsics.areEqual(this.onBoundsReported, homeStatTileData.onBoundsReported);
    }

    public int hashCode() {
        int hashCode = ((((this.label.hashCode() * 31) + this.value.hashCode()) * 31) + Integer.hashCode(this.iconRes)) * 31;
        Function0<Unit> function0 = this.onClick;
        int hashCode2 = (hashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function1<Rect, Unit> function1 = this.onBoundsReported;
        return hashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    public String toString() {
        return "HomeStatTileData(label=" + this.label + ", value=" + this.value + ", iconRes=" + this.iconRes + ", onClick=" + this.onClick + ", onBoundsReported=" + this.onBoundsReported + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeStatTileData(String label, String value, int i, Function0<Unit> function0, Function1<? super Rect, Unit> function1) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.label = label;
        this.value = value;
        this.iconRes = i;
        this.onClick = function0;
        this.onBoundsReported = function1;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public final Function1<Rect, Unit> getOnBoundsReported() {
        return this.onBoundsReported;
    }
}
