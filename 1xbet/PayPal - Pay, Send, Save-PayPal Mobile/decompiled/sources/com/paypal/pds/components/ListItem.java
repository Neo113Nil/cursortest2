package com.paypal.pds.components;

@kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "ListItem is no longer needed. Use ListItemView(title, ...) directly, passing each property as a named parameter instead of wrapping them in a ListItem object.", replaceWith = @kotlin.ReplaceWith(expression = "ListItemView(title = \"\", description = null, data = null, metadata = null)", imports = {"com.paypal.pds.components.ListItemView"}))
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f\u0012\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f\u0012\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f\u0012\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u001d\u0010\u001f\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\fHÆ\u0003¢\u0006\u0004\b!\u0010 J\u001d\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\fHÆ\u0003¢\u0006\u0004\b\"\u0010 J\u001d\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\fHÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0018J\u0012\u0010'\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010)\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b(\u0010&JÒ\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b8\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010\u001dR\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b;\u0010\u001dR'\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010 R'\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b>\u0010 R'\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b?\u0010 R'\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\b@\u0010 R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\bA\u0010\u0018R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\bC\u0010&R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010B\u001a\u0004\bD\u0010&"}, d2 = {"Lcom/paypal/pds/components/ListItem;", "", "", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "metadata", "", "shouldShowChevron", "shouldShowDivider", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "trailingSlot", "leadingSlot", "bottomSlot", "inlineSlot", "selectedIconContentDescription", "Landroidx/compose/ui/unit/Dp;", "paddingTop", "paddingBottom", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "component6", "component7", "()Lkotlin/jvm/functions/Function2;", "component8", "component9", "component10", "component11", "component12-lTKBWiU", "()Landroidx/compose/ui/unit/Dp;", "component12", "component13-lTKBWiU", "component13", "copy-_BKMH08", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Landroidx/compose/ui/unit/Dp;Landroidx/compose/ui/unit/Dp;)Lcom/paypal/pds/components/ListItem;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getDescription", "getData", "getMetadata", "Z", "getShouldShowChevron", "getShouldShowDivider", "Lkotlin/jvm/functions/Function2;", "getTrailingSlot", "getLeadingSlot", "getBottomSlot", "getInlineSlot", "getSelectedIconContentDescription", "Landroidx/compose/ui/unit/Dp;", "getPaddingTop-lTKBWiU", "getPaddingBottom-lTKBWiU"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ListItem {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> bottomSlot;
    private final java.lang.String data;
    private final java.lang.String description;
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> inlineSlot;
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> leadingSlot;
    private final java.lang.String metadata;
    private final androidx.compose.ui.unit.Dp paddingBottom;
    private final androidx.compose.ui.unit.Dp paddingTop;
    private final java.lang.String selectedIconContentDescription;
    private final boolean shouldShowChevron;
    private final boolean shouldShowDivider;
    private final java.lang.String title;
    private final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> trailingSlot;

    /* JADX WARN: Multi-variable type inference failed */
    private ListItem(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, java.lang.String str5, androidx.compose.ui.unit.Dp dp, androidx.compose.ui.unit.Dp dp2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
        this.description = str2;
        this.data = str3;
        this.metadata = str4;
        this.shouldShowChevron = z;
        this.shouldShowDivider = z2;
        this.trailingSlot = function2;
        this.leadingSlot = function22;
        this.bottomSlot = function23;
        this.inlineSlot = function24;
        this.selectedIconContentDescription = str5;
        this.paddingTop = dp;
        this.paddingBottom = dp2;
    }

    public /* synthetic */ ListItem(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function2 function23, kotlin.jvm.functions.Function2 function24, java.lang.String str5, androidx.compose.ui.unit.Dp dp, androidx.compose.ui.unit.Dp dp2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : function2, (i & 128) != 0 ? null : function22, (i & 256) != 0 ? null : function23, (i & 512) != 0 ? null : function24, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : dp, (i & 4096) != 0 ? null : dp2, null);
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String getData() {
        return this.data;
    }

    public final java.lang.String getMetadata() {
        return this.metadata;
    }

    public final boolean getShouldShowChevron() {
        return this.shouldShowChevron;
    }

    public final boolean getShouldShowDivider() {
        return this.shouldShowDivider;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getTrailingSlot() {
        return this.trailingSlot;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLeadingSlot() {
        return this.leadingSlot;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getBottomSlot() {
        return this.bottomSlot;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getInlineSlot() {
        return this.inlineSlot;
    }

    public final java.lang.String getSelectedIconContentDescription() {
        return this.selectedIconContentDescription;
    }

    /* renamed from: getPaddingTop-lTKBWiU, reason: not valid java name */
    public final androidx.compose.ui.unit.Dp m21926getPaddingToplTKBWiU() {
        return this.paddingTop;
    }

    /* renamed from: getPaddingBottom-lTKBWiU, reason: not valid java name */
    public final androidx.compose.ui.unit.Dp m21925getPaddingBottomlTKBWiU() {
        return this.paddingBottom;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.description;
        java.lang.String str3 = this.data;
        java.lang.String str4 = this.metadata;
        boolean z = this.shouldShowChevron;
        boolean z2 = this.shouldShowDivider;
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.trailingSlot;
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = this.leadingSlot;
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function23 = this.bottomSlot;
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = this.inlineSlot;
        java.lang.String str5 = this.selectedIconContentDescription;
        androidx.compose.ui.unit.Dp dp = this.paddingTop;
        androidx.compose.ui.unit.Dp dp2 = this.paddingBottom;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ListItem(title=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", data=");
        sb.append(str3);
        sb.append(", metadata=");
        sb.append(str4);
        sb.append(", shouldShowChevron=");
        sb.append(z);
        sb.append(", shouldShowDivider=");
        sb.append(z2);
        sb.append(", trailingSlot=");
        sb.append(function2);
        sb.append(", leadingSlot=");
        sb.append(function22);
        sb.append(", bottomSlot=");
        sb.append(function23);
        sb.append(", inlineSlot=");
        sb.append(function24);
        sb.append(", selectedIconContentDescription=");
        sb.append(str5);
        sb.append(", paddingTop=");
        sb.append(dp);
        sb.append(", paddingBottom=");
        sb.append(dp2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode();
        java.lang.String str = this.description;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.data;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.metadata;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        int hashCode5 = java.lang.Boolean.hashCode(this.shouldShowChevron);
        int hashCode6 = java.lang.Boolean.hashCode(this.shouldShowDivider);
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.trailingSlot;
        int hashCode7 = function2 == null ? 0 : function2.hashCode();
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = this.leadingSlot;
        int hashCode8 = function22 == null ? 0 : function22.hashCode();
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function23 = this.bottomSlot;
        int hashCode9 = function23 == null ? 0 : function23.hashCode();
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = this.inlineSlot;
        int hashCode10 = function24 == null ? 0 : function24.hashCode();
        java.lang.String str4 = this.selectedIconContentDescription;
        int hashCode11 = str4 == null ? 0 : str4.hashCode();
        androidx.compose.ui.unit.Dp dp = this.paddingTop;
        int m8607hashCodeimpl = dp == null ? 0 : androidx.compose.ui.unit.Dp.m8607hashCodeimpl(dp.m8615unboximpl());
        androidx.compose.ui.unit.Dp dp2 = this.paddingBottom;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + m8607hashCodeimpl) * 31) + (dp2 != null ? androidx.compose.ui.unit.Dp.m8607hashCodeimpl(dp2.m8615unboximpl()) : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.pds.components.ListItem)) {
            return false;
        }
        com.paypal.pds.components.ListItem listItem = (com.paypal.pds.components.ListItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, listItem.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, listItem.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, listItem.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, listItem.metadata) && this.shouldShowChevron == listItem.shouldShowChevron && this.shouldShowDivider == listItem.shouldShowDivider && kotlin.jvm.internal.Intrinsics.areEqual(this.trailingSlot, listItem.trailingSlot) && kotlin.jvm.internal.Intrinsics.areEqual(this.leadingSlot, listItem.leadingSlot) && kotlin.jvm.internal.Intrinsics.areEqual(this.bottomSlot, listItem.bottomSlot) && kotlin.jvm.internal.Intrinsics.areEqual(this.inlineSlot, listItem.inlineSlot) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedIconContentDescription, listItem.selectedIconContentDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.paddingTop, listItem.paddingTop) && kotlin.jvm.internal.Intrinsics.areEqual(this.paddingBottom, listItem.paddingBottom);
    }

    /* renamed from: copy-_BKMH08, reason: not valid java name */
    public final com.paypal.pds.components.ListItem m21924copy_BKMH08(java.lang.String title, java.lang.String description, java.lang.String data, java.lang.String metadata, boolean shouldShowChevron, boolean shouldShowDivider, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> trailingSlot, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> leadingSlot, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> bottomSlot, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> inlineSlot, java.lang.String selectedIconContentDescription, androidx.compose.ui.unit.Dp paddingTop, androidx.compose.ui.unit.Dp paddingBottom) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        return new com.paypal.pds.components.ListItem(title, description, data, metadata, shouldShowChevron, shouldShowDivider, trailingSlot, leadingSlot, bottomSlot, inlineSlot, selectedIconContentDescription, paddingTop, paddingBottom, null);
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> component9() {
        return this.bottomSlot;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> component8() {
        return this.leadingSlot;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> component7() {
        return this.trailingSlot;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShouldShowDivider() {
        return this.shouldShowDivider;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShouldShowChevron() {
        return this.shouldShowChevron;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMetadata() {
        return this.metadata;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component13-lTKBWiU, reason: not valid java name and from getter */
    public final androidx.compose.ui.unit.Dp getPaddingBottom() {
        return this.paddingBottom;
    }

    /* renamed from: component12-lTKBWiU, reason: not valid java name and from getter */
    public final androidx.compose.ui.unit.Dp getPaddingTop() {
        return this.paddingTop;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getSelectedIconContentDescription() {
        return this.selectedIconContentDescription;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> component10() {
        return this.inlineSlot;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    public /* synthetic */ ListItem(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function2 function23, kotlin.jvm.functions.Function2 function24, java.lang.String str5, androidx.compose.ui.unit.Dp dp, androidx.compose.ui.unit.Dp dp2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z, z2, function2, function22, function23, function24, str5, dp, dp2);
    }
}
