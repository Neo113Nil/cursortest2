package com.zettle.sdk.common.ui.components.listitem;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b-\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007R\"\u0010\u0016\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010+R\"\u0010,\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u0010\"\u0004\b.\u0010+R\"\u0010/\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u0010(\u001a\u0004\b0\u0010\u0010\"\u0004\b1\u0010+R$\u00102\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010#\u001a\u0004\b3\u0010\u0013\"\u0004\b4\u0010&R\"\u00105\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010(\u001a\u0004\b6\u0010\u0010\"\u0004\b7\u0010+R$\u00108\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010#\u001a\u0004\b9\u0010\u0013\"\u0004\b:\u0010&R\"\u0010;\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010(\u001a\u0004\b<\u0010\u0010\"\u0004\b=\u0010+R\"\u0010>\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u0010(\u001a\u0004\b?\u0010\u0010\"\u0004\b@\u0010+R$\u0010A\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bA\u0010#\u001a\u0004\bB\u0010\u0013\"\u0004\bC\u0010&R\"\u0010D\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010(\u001a\u0004\bE\u0010\u0010\"\u0004\bF\u0010+R$\u0010G\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u0010#\u001a\u0004\bH\u0010\u0013\"\u0004\bI\u0010&R\"\u0010J\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bJ\u0010(\u001a\u0004\bK\u0010\u0010\"\u0004\bL\u0010+R$\u0010M\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u0010#\u001a\u0004\bN\u0010\u0013\"\u0004\bO\u0010&R$\u0010P\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010#\u001a\u0004\bQ\u0010\u0013\"\u0004\bR\u0010&R\"\u0010S\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bS\u0010(\u001a\u0004\bT\u0010\u0010\"\u0004\bU\u0010+R$\u0010V\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010#\u001a\u0004\bW\u0010\u0013\"\u0004\bX\u0010&R\"\u0010Z\u001a\u00020Y8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010a\u001a\u00020`8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010h\u001a\u00020g8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010o\u001a\u00020n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010u\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bu\u0010#\u001a\u0004\bv\u0010\u0013\"\u0004\bw\u0010&R\"\u0010x\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bx\u0010(\u001a\u0004\by\u0010\u0010\"\u0004\bz\u0010+R\"\u0010{\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b{\u0010(\u001a\u0004\b|\u0010\u0010\"\u0004\b}\u0010+R#\u0010~\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0013\n\u0004\b~\u0010(\u001a\u0004\b\u007f\u0010\u0010\"\u0005\b\u0080\u0001\u0010+R(\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010#\u001a\u0005\b\u0082\u0001\u0010\u0013\"\u0005\b\u0083\u0001\u0010&R&\u0010\u0084\u0001\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010(\u001a\u0005\b\u0085\u0001\u0010\u0010\"\u0005\b\u0086\u0001\u0010+R(\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010#\u001a\u0005\b\u0088\u0001\u0010\u0013\"\u0005\b\u0089\u0001\u0010&R&\u0010\u008a\u0001\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010(\u001a\u0005\b\u008b\u0001\u0010\u0010\"\u0005\b\u008c\u0001\u0010+R&\u0010\u008d\u0001\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010(\u001a\u0005\b\u008e\u0001\u0010\u0010\"\u0005\b\u008f\u0001\u0010+R(\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010#\u001a\u0005\b\u0091\u0001\u0010\u0013\"\u0005\b\u0092\u0001\u0010&R&\u0010\u0093\u0001\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010(\u001a\u0005\b\u0094\u0001\u0010\u0010\"\u0005\b\u0095\u0001\u0010+R(\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0096\u0001\u0010#\u001a\u0005\b\u0097\u0001\u0010\u0013\"\u0005\b\u0098\u0001\u0010&R&\u0010\u0099\u0001\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010(\u001a\u0005\b\u009a\u0001\u0010\u0010\"\u0005\b\u009b\u0001\u0010+"}, d2 = {"Lcom/zettle/sdk/common/ui/components/listitem/OttoListItemComponentAttributes;", "", "Landroid/content/res/TypedArray;", "attrsTypedArray", "<init>", "(Landroid/content/res/TypedArray;)V", "component1", "()Landroid/content/res/TypedArray;", "copy", "(Landroid/content/res/TypedArray;)Lcom/zettle/sdk/common/ui/components/listitem/OttoListItemComponentAttributes;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/content/res/TypedArray;", "getAttrsTypedArray", "isAllDuplicatedParentStates", "Z", "()Z", "setAllDuplicatedParentStates", "(Z)V", "", "leadingHorizontalWeight", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getLeadingHorizontalWeight", "()F", "setLeadingHorizontalWeight", "(F)V", "leadingIconContentDescription", "Ljava/lang/String;", "getLeadingIconContentDescription", "setLeadingIconContentDescription", "(Ljava/lang/String;)V", "leadingIconDrawableResId", com.visa.cbp.getEncExpo.warmup, "getLeadingIconDrawableResId", "setLeadingIconDrawableResId", "(I)V", "leadingIconDrawableTintResColor", "getLeadingIconDrawableTintResColor", "setLeadingIconDrawableTintResColor", "leadingPrimaryCustomLayout", "getLeadingPrimaryCustomLayout", "setLeadingPrimaryCustomLayout", "leadingPrimaryText", "getLeadingPrimaryText", "setLeadingPrimaryText", "leadingPrimaryTextAppearance", "getLeadingPrimaryTextAppearance", "setLeadingPrimaryTextAppearance", "leadingPrimaryTextContentDescription", "getLeadingPrimaryTextContentDescription", "setLeadingPrimaryTextContentDescription", "leadingPrimaryTextResColor", "getLeadingPrimaryTextResColor", "setLeadingPrimaryTextResColor", "leadingSecondaryCustomLayout", "getLeadingSecondaryCustomLayout", "setLeadingSecondaryCustomLayout", "leadingSecondaryText", "getLeadingSecondaryText", "setLeadingSecondaryText", "leadingSecondaryTextAppearance", "getLeadingSecondaryTextAppearance", "setLeadingSecondaryTextAppearance", "leadingSecondaryTextContentDescription", "getLeadingSecondaryTextContentDescription", "setLeadingSecondaryTextContentDescription", "leadingSecondaryTextResColor", "getLeadingSecondaryTextResColor", "setLeadingSecondaryTextResColor", "leadingText", "getLeadingText", "setLeadingText", "leadingTextContentDescription", "getLeadingTextContentDescription", "setLeadingTextContentDescription", "leadingTextResColor", "getLeadingTextResColor", "setLeadingTextResColor", "listItemGroupContentDescription", "getListItemGroupContentDescription", "setListItemGroupContentDescription", "Lcom/zettle/sdk/common/ui/components/listitem/ListItemHorizontalModes;", "listItemHorizontalMode", "Lcom/zettle/sdk/common/ui/components/listitem/ListItemHorizontalModes;", "getListItemHorizontalMode", "()Lcom/zettle/sdk/common/ui/components/listitem/ListItemHorizontalModes;", "setListItemHorizontalMode", "(Lcom/zettle/sdk/common/ui/components/listitem/ListItemHorizontalModes;)V", "Lcom/zettle/sdk/common/ui/components/listitem/ListItemLeadingContainerAlignment;", "listItemLeadingContainerAlignment", "Lcom/zettle/sdk/common/ui/components/listitem/ListItemLeadingContainerAlignment;", "getListItemLeadingContainerAlignment", "()Lcom/zettle/sdk/common/ui/components/listitem/ListItemLeadingContainerAlignment;", "setListItemLeadingContainerAlignment", "(Lcom/zettle/sdk/common/ui/components/listitem/ListItemLeadingContainerAlignment;)V", "Lcom/zettle/sdk/common/ui/components/listitem/ListItemIconSize;", "listItemLeadingIconSize", "Lcom/zettle/sdk/common/ui/components/listitem/ListItemIconSize;", "getListItemLeadingIconSize", "()Lcom/zettle/sdk/common/ui/components/listitem/ListItemIconSize;", "setListItemLeadingIconSize", "(Lcom/zettle/sdk/common/ui/components/listitem/ListItemIconSize;)V", "Lcom/zettle/sdk/common/ui/components/listitem/ListItemTypes;", "listItemType", "Lcom/zettle/sdk/common/ui/components/listitem/ListItemTypes;", "getListItemType", "()Lcom/zettle/sdk/common/ui/components/listitem/ListItemTypes;", "setListItemType", "(Lcom/zettle/sdk/common/ui/components/listitem/ListItemTypes;)V", "trailingIconContentDescription", "getTrailingIconContentDescription", "setTrailingIconContentDescription", "trailingIconDrawableResId", "getTrailingIconDrawableResId", "setTrailingIconDrawableResId", "trailingIconDrawableTintResColor", "getTrailingIconDrawableTintResColor", "setTrailingIconDrawableTintResColor", "trailingPrimaryCustomLayout", "getTrailingPrimaryCustomLayout", "setTrailingPrimaryCustomLayout", "trailingPrimaryText", "getTrailingPrimaryText", "setTrailingPrimaryText", "trailingPrimaryTextAppearance", "getTrailingPrimaryTextAppearance", "setTrailingPrimaryTextAppearance", "trailingPrimaryTextContentDescription", "getTrailingPrimaryTextContentDescription", "setTrailingPrimaryTextContentDescription", "trailingPrimaryTextResColor", "getTrailingPrimaryTextResColor", "setTrailingPrimaryTextResColor", "trailingSecondaryCustomLayout", "getTrailingSecondaryCustomLayout", "setTrailingSecondaryCustomLayout", "trailingSecondaryText", "getTrailingSecondaryText", "setTrailingSecondaryText", "trailingSecondaryTextAppearance", "getTrailingSecondaryTextAppearance", "setTrailingSecondaryTextAppearance", "trailingSecondaryTextContentDescription", "getTrailingSecondaryTextContentDescription", "setTrailingSecondaryTextContentDescription", "trailingSecondaryTextResColor", "getTrailingSecondaryTextResColor", "setTrailingSecondaryTextResColor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class OttoListItemComponentAttributes {
    private final android.content.res.TypedArray attrsTypedArray;
    private boolean isAllDuplicatedParentStates;
    private float leadingHorizontalWeight;
    private java.lang.String leadingIconContentDescription;
    private int leadingIconDrawableResId;
    private int leadingIconDrawableTintResColor;
    private int leadingPrimaryCustomLayout;
    private java.lang.String leadingPrimaryText;
    private int leadingPrimaryTextAppearance;
    private java.lang.String leadingPrimaryTextContentDescription;
    private int leadingPrimaryTextResColor;
    private int leadingSecondaryCustomLayout;
    private java.lang.String leadingSecondaryText;
    private int leadingSecondaryTextAppearance;
    private java.lang.String leadingSecondaryTextContentDescription;
    private int leadingSecondaryTextResColor;
    private java.lang.String leadingText;
    private java.lang.String leadingTextContentDescription;
    private int leadingTextResColor;
    private java.lang.String listItemGroupContentDescription;
    private com.zettle.sdk.common.ui.components.listitem.ListItemHorizontalModes listItemHorizontalMode;
    private com.zettle.sdk.common.ui.components.listitem.ListItemLeadingContainerAlignment listItemLeadingContainerAlignment;
    private com.zettle.sdk.common.ui.components.listitem.ListItemIconSize listItemLeadingIconSize;
    private com.zettle.sdk.common.ui.components.listitem.ListItemTypes listItemType;
    private java.lang.String trailingIconContentDescription;
    private int trailingIconDrawableResId;
    private int trailingIconDrawableTintResColor;
    private int trailingPrimaryCustomLayout;
    private java.lang.String trailingPrimaryText;
    private int trailingPrimaryTextAppearance;
    private java.lang.String trailingPrimaryTextContentDescription;
    private int trailingPrimaryTextResColor;
    private int trailingSecondaryCustomLayout;
    private java.lang.String trailingSecondaryText;
    private int trailingSecondaryTextAppearance;
    private java.lang.String trailingSecondaryTextContentDescription;
    private int trailingSecondaryTextResColor;

    public OttoListItemComponentAttributes(android.content.res.TypedArray typedArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typedArray, "");
        this.attrsTypedArray = typedArray;
        this.listItemType = com.zettle.sdk.common.ui.components.listitem.ListItemTypes.STATIC;
        this.listItemHorizontalMode = com.zettle.sdk.common.ui.components.listitem.ListItemHorizontalModes.DEFAULT;
        this.listItemLeadingIconSize = com.zettle.sdk.common.ui.components.listitem.ListItemIconSize.MEDIUM;
        this.listItemLeadingContainerAlignment = com.zettle.sdk.common.ui.components.listitem.ListItemLeadingContainerAlignment.TOP;
        try {
            this.listItemType = com.zettle.sdk.common.ui.components.listitem.ListItemTypes.INSTANCE.findByValue(typedArray.getInt(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_type, com.zettle.sdk.common.ui.components.listitem.ListItemTypes.STATIC.getValue()));
            this.isAllDuplicatedParentStates = typedArray.getBoolean(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_duplicatedParentStates, false);
            this.listItemHorizontalMode = com.zettle.sdk.common.ui.components.listitem.ListItemHorizontalModes.INSTANCE.findByValue(typedArray.getInt(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_horizontalMode, com.zettle.sdk.common.ui.components.listitem.ListItemHorizontalModes.DEFAULT.getValue()));
            this.listItemLeadingIconSize = com.zettle.sdk.common.ui.components.listitem.ListItemIconSize.INSTANCE.findByValue(typedArray.getInt(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_leadingIconSize, com.zettle.sdk.common.ui.components.listitem.ListItemIconSize.MEDIUM.getValue()));
            this.listItemLeadingContainerAlignment = com.zettle.sdk.common.ui.components.listitem.ListItemLeadingContainerAlignment.INSTANCE.findByValue(typedArray.getInt(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_leadingContainerAlignment, com.zettle.sdk.common.ui.components.listitem.ListItemLeadingContainerAlignment.TOP.getValue()));
            this.leadingHorizontalWeight = typedArray.getFloat(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_leadingHorizontalWeight, 0.0f);
            this.leadingIconDrawableResId = typedArray.getResourceId(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_leadingIconSrc, 0);
            this.leadingIconDrawableTintResColor = typedArray.getColor(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_leadingIconTint, 0);
            this.leadingText = typedArray.getString(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_leadingText);
            this.leadingTextResColor = typedArray.getColor(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_leadingTextColor, 0);
            this.leadingPrimaryText = typedArray.getString(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_leadingPrimaryText);
            this.leadingPrimaryTextResColor = typedArray.getColor(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_leadingPrimaryTextColor, 0);
            this.leadingPrimaryTextAppearance = typedArray.getResourceId(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_leadingPrimaryTextAppearance, 0);
            this.leadingPrimaryCustomLayout = typedArray.getResourceId(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_leadingPrimaryCustomLayout, 0);
            this.leadingSecondaryText = typedArray.getString(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_leadingSecondaryText);
            this.leadingSecondaryTextResColor = typedArray.getColor(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_leadingSecondaryTextColor, 0);
            this.leadingSecondaryTextAppearance = typedArray.getResourceId(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_leadingSecondaryTextAppearance, 0);
            this.leadingSecondaryCustomLayout = typedArray.getResourceId(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_leadingSecondaryCustomLayout, 0);
            this.trailingPrimaryText = typedArray.getString(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_trailingPrimaryText);
            this.trailingPrimaryTextResColor = typedArray.getColor(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_trailingPrimaryTextColor, 0);
            this.trailingPrimaryTextAppearance = typedArray.getResourceId(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_trailingPrimaryTextAppearance, 0);
            this.trailingPrimaryCustomLayout = typedArray.getResourceId(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_trailingPrimaryCustomLayout, 0);
            this.trailingSecondaryText = typedArray.getString(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_trailingSecondaryText);
            this.trailingSecondaryTextResColor = typedArray.getColor(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_trailingSecondaryTextColor, 0);
            this.trailingSecondaryTextAppearance = typedArray.getResourceId(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_trailingSecondaryTextAppearance, 0);
            this.trailingSecondaryCustomLayout = typedArray.getResourceId(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_trailingSecondaryCustomLayout, 0);
            this.trailingIconDrawableResId = typedArray.getResourceId(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_trailingIconSrc, 0);
            this.trailingIconDrawableTintResColor = typedArray.getColor(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_trailingIconTint, 0);
            this.leadingIconContentDescription = typedArray.getString(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_leadingIconContentDescription);
            this.leadingTextContentDescription = typedArray.getString(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_leadingTextContentDescription);
            this.leadingPrimaryTextContentDescription = typedArray.getString(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_leadingPrimaryTextContentDescription);
            this.leadingSecondaryTextContentDescription = typedArray.getString(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_leadingSecondaryTextContentDescription);
            this.trailingPrimaryTextContentDescription = typedArray.getString(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_trailingPrimaryTextContentDescription);
            this.trailingSecondaryTextContentDescription = typedArray.getString(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_trailingSecondaryTextContentDescription);
            this.trailingIconContentDescription = typedArray.getString(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_trailingIconContentDescription);
            this.listItemGroupContentDescription = typedArray.getString(com.zettle.sdk.common.ui.R.styleable.OttoListItemComponent_ls_groupContentDescription);
            typedArray.recycle();
        } catch (java.lang.Throwable th) {
            this.attrsTypedArray.recycle();
            throw th;
        }
    }

    public final android.content.res.TypedArray getAttrsTypedArray() {
        return this.attrsTypedArray;
    }

    public final com.zettle.sdk.common.ui.components.listitem.ListItemTypes getListItemType() {
        return this.listItemType;
    }

    public final void setListItemType(com.zettle.sdk.common.ui.components.listitem.ListItemTypes listItemTypes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listItemTypes, "");
        this.listItemType = listItemTypes;
    }

    public final com.zettle.sdk.common.ui.components.listitem.ListItemHorizontalModes getListItemHorizontalMode() {
        return this.listItemHorizontalMode;
    }

    public final void setListItemHorizontalMode(com.zettle.sdk.common.ui.components.listitem.ListItemHorizontalModes listItemHorizontalModes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listItemHorizontalModes, "");
        this.listItemHorizontalMode = listItemHorizontalModes;
    }

    public final com.zettle.sdk.common.ui.components.listitem.ListItemIconSize getListItemLeadingIconSize() {
        return this.listItemLeadingIconSize;
    }

    public final void setListItemLeadingIconSize(com.zettle.sdk.common.ui.components.listitem.ListItemIconSize listItemIconSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listItemIconSize, "");
        this.listItemLeadingIconSize = listItemIconSize;
    }

    public final com.zettle.sdk.common.ui.components.listitem.ListItemLeadingContainerAlignment getListItemLeadingContainerAlignment() {
        return this.listItemLeadingContainerAlignment;
    }

    public final void setListItemLeadingContainerAlignment(com.zettle.sdk.common.ui.components.listitem.ListItemLeadingContainerAlignment listItemLeadingContainerAlignment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listItemLeadingContainerAlignment, "");
        this.listItemLeadingContainerAlignment = listItemLeadingContainerAlignment;
    }

    public final float getLeadingHorizontalWeight() {
        return this.leadingHorizontalWeight;
    }

    public final void setLeadingHorizontalWeight(float f) {
        this.leadingHorizontalWeight = f;
    }

    public final int getLeadingIconDrawableResId() {
        return this.leadingIconDrawableResId;
    }

    public final void setLeadingIconDrawableResId(int i) {
        this.leadingIconDrawableResId = i;
    }

    public final int getLeadingIconDrawableTintResColor() {
        return this.leadingIconDrawableTintResColor;
    }

    public final void setLeadingIconDrawableTintResColor(int i) {
        this.leadingIconDrawableTintResColor = i;
    }

    public final java.lang.String getLeadingText() {
        return this.leadingText;
    }

    public final void setLeadingText(java.lang.String str) {
        this.leadingText = str;
    }

    public final int getLeadingTextResColor() {
        return this.leadingTextResColor;
    }

    public final void setLeadingTextResColor(int i) {
        this.leadingTextResColor = i;
    }

    public final java.lang.String getLeadingPrimaryText() {
        return this.leadingPrimaryText;
    }

    public final void setLeadingPrimaryText(java.lang.String str) {
        this.leadingPrimaryText = str;
    }

    public final int getLeadingPrimaryTextResColor() {
        return this.leadingPrimaryTextResColor;
    }

    public final void setLeadingPrimaryTextResColor(int i) {
        this.leadingPrimaryTextResColor = i;
    }

    public final int getLeadingPrimaryTextAppearance() {
        return this.leadingPrimaryTextAppearance;
    }

    public final void setLeadingPrimaryTextAppearance(int i) {
        this.leadingPrimaryTextAppearance = i;
    }

    public final int getLeadingPrimaryCustomLayout() {
        return this.leadingPrimaryCustomLayout;
    }

    public final void setLeadingPrimaryCustomLayout(int i) {
        this.leadingPrimaryCustomLayout = i;
    }

    public final java.lang.String getLeadingSecondaryText() {
        return this.leadingSecondaryText;
    }

    public final void setLeadingSecondaryText(java.lang.String str) {
        this.leadingSecondaryText = str;
    }

    public final int getLeadingSecondaryTextResColor() {
        return this.leadingSecondaryTextResColor;
    }

    public final void setLeadingSecondaryTextResColor(int i) {
        this.leadingSecondaryTextResColor = i;
    }

    public final int getLeadingSecondaryTextAppearance() {
        return this.leadingSecondaryTextAppearance;
    }

    public final void setLeadingSecondaryTextAppearance(int i) {
        this.leadingSecondaryTextAppearance = i;
    }

    public final int getLeadingSecondaryCustomLayout() {
        return this.leadingSecondaryCustomLayout;
    }

    public final void setLeadingSecondaryCustomLayout(int i) {
        this.leadingSecondaryCustomLayout = i;
    }

    public final java.lang.String getTrailingPrimaryText() {
        return this.trailingPrimaryText;
    }

    public final void setTrailingPrimaryText(java.lang.String str) {
        this.trailingPrimaryText = str;
    }

    public final int getTrailingPrimaryTextResColor() {
        return this.trailingPrimaryTextResColor;
    }

    public final void setTrailingPrimaryTextResColor(int i) {
        this.trailingPrimaryTextResColor = i;
    }

    public final int getTrailingPrimaryTextAppearance() {
        return this.trailingPrimaryTextAppearance;
    }

    public final void setTrailingPrimaryTextAppearance(int i) {
        this.trailingPrimaryTextAppearance = i;
    }

    public final int getTrailingPrimaryCustomLayout() {
        return this.trailingPrimaryCustomLayout;
    }

    public final void setTrailingPrimaryCustomLayout(int i) {
        this.trailingPrimaryCustomLayout = i;
    }

    public final java.lang.String getTrailingSecondaryText() {
        return this.trailingSecondaryText;
    }

    public final void setTrailingSecondaryText(java.lang.String str) {
        this.trailingSecondaryText = str;
    }

    public final int getTrailingSecondaryTextResColor() {
        return this.trailingSecondaryTextResColor;
    }

    public final void setTrailingSecondaryTextResColor(int i) {
        this.trailingSecondaryTextResColor = i;
    }

    public final int getTrailingSecondaryTextAppearance() {
        return this.trailingSecondaryTextAppearance;
    }

    public final void setTrailingSecondaryTextAppearance(int i) {
        this.trailingSecondaryTextAppearance = i;
    }

    public final int getTrailingSecondaryCustomLayout() {
        return this.trailingSecondaryCustomLayout;
    }

    public final void setTrailingSecondaryCustomLayout(int i) {
        this.trailingSecondaryCustomLayout = i;
    }

    public final int getTrailingIconDrawableResId() {
        return this.trailingIconDrawableResId;
    }

    public final void setTrailingIconDrawableResId(int i) {
        this.trailingIconDrawableResId = i;
    }

    public final int getTrailingIconDrawableTintResColor() {
        return this.trailingIconDrawableTintResColor;
    }

    public final void setTrailingIconDrawableTintResColor(int i) {
        this.trailingIconDrawableTintResColor = i;
    }

    public final java.lang.String getLeadingIconContentDescription() {
        return this.leadingIconContentDescription;
    }

    public final void setLeadingIconContentDescription(java.lang.String str) {
        this.leadingIconContentDescription = str;
    }

    public final java.lang.String getLeadingTextContentDescription() {
        return this.leadingTextContentDescription;
    }

    public final void setLeadingTextContentDescription(java.lang.String str) {
        this.leadingTextContentDescription = str;
    }

    public final java.lang.String getLeadingPrimaryTextContentDescription() {
        return this.leadingPrimaryTextContentDescription;
    }

    public final void setLeadingPrimaryTextContentDescription(java.lang.String str) {
        this.leadingPrimaryTextContentDescription = str;
    }

    public final java.lang.String getLeadingSecondaryTextContentDescription() {
        return this.leadingSecondaryTextContentDescription;
    }

    public final void setLeadingSecondaryTextContentDescription(java.lang.String str) {
        this.leadingSecondaryTextContentDescription = str;
    }

    public final java.lang.String getTrailingPrimaryTextContentDescription() {
        return this.trailingPrimaryTextContentDescription;
    }

    public final void setTrailingPrimaryTextContentDescription(java.lang.String str) {
        this.trailingPrimaryTextContentDescription = str;
    }

    public final java.lang.String getTrailingSecondaryTextContentDescription() {
        return this.trailingSecondaryTextContentDescription;
    }

    public final void setTrailingSecondaryTextContentDescription(java.lang.String str) {
        this.trailingSecondaryTextContentDescription = str;
    }

    public final java.lang.String getTrailingIconContentDescription() {
        return this.trailingIconContentDescription;
    }

    public final void setTrailingIconContentDescription(java.lang.String str) {
        this.trailingIconContentDescription = str;
    }

    public final java.lang.String getListItemGroupContentDescription() {
        return this.listItemGroupContentDescription;
    }

    public final void setListItemGroupContentDescription(java.lang.String str) {
        this.listItemGroupContentDescription = str;
    }

    /* renamed from: isAllDuplicatedParentStates, reason: from getter */
    public final boolean getIsAllDuplicatedParentStates() {
        return this.isAllDuplicatedParentStates;
    }

    public final void setAllDuplicatedParentStates(boolean z) {
        this.isAllDuplicatedParentStates = z;
    }

    public final java.lang.String toString() {
        android.content.res.TypedArray typedArray = this.attrsTypedArray;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OttoListItemComponentAttributes(attrsTypedArray=");
        sb.append(typedArray);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.attrsTypedArray.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.zettle.sdk.common.ui.components.listitem.OttoListItemComponentAttributes) && kotlin.jvm.internal.Intrinsics.areEqual(this.attrsTypedArray, ((com.zettle.sdk.common.ui.components.listitem.OttoListItemComponentAttributes) other).attrsTypedArray);
    }

    public final com.zettle.sdk.common.ui.components.listitem.OttoListItemComponentAttributes copy(android.content.res.TypedArray attrsTypedArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attrsTypedArray, "");
        return new com.zettle.sdk.common.ui.components.listitem.OttoListItemComponentAttributes(attrsTypedArray);
    }

    /* renamed from: component1, reason: from getter */
    public final android.content.res.TypedArray getAttrsTypedArray() {
        return this.attrsTypedArray;
    }

    public static /* synthetic */ com.zettle.sdk.common.ui.components.listitem.OttoListItemComponentAttributes copy$default(com.zettle.sdk.common.ui.components.listitem.OttoListItemComponentAttributes ottoListItemComponentAttributes, android.content.res.TypedArray typedArray, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            typedArray = ottoListItemComponentAttributes.attrsTypedArray;
        }
        return ottoListItemComponentAttributes.copy(typedArray);
    }
}
