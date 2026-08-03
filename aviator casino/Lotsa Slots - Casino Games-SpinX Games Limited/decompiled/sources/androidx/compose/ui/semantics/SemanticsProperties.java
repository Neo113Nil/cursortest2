package androidx.compose.ui.semantics;

/* compiled from: SemanticsProperties.kt */
@kotlin.Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R#\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020$0#0\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\"\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\u0007R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b*\u0010\u0002\u001a\u0004\b+\u0010\u0007R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0007R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0007R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0007R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0007R\u0017\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0007R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0007R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0007R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0007R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0007R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0007R\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0007R\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0007R\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\u0007R\u001d\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u0007R\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010\u0007R\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010\u0007R\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010\u0007R\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020T0\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010\u0007R\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010\u0007¨\u0006X"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsProperties;", "", "()V", "CollectionInfo", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/CollectionInfo;", "getCollectionInfo", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "CollectionItemInfo", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "getCollectionItemInfo", "ContentDescription", "", "", "getContentDescription", "Disabled", "", "getDisabled", "EditableText", "Landroidx/compose/ui/text/AnnotatedString;", "getEditableText", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c, "getError", "Focused", "", "getFocused", "Heading", "getHeading", "HorizontalScrollAxisRange", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "getHorizontalScrollAxisRange", "ImeAction", "Landroidx/compose/ui/text/input/ImeAction;", "getImeAction", "IndexForKey", "Lkotlin/Function1;", "", "getIndexForKey", "InvisibleToUser", "getInvisibleToUser$annotations", "getInvisibleToUser", "IsContainer", "getIsContainer$annotations", "getIsContainer", "IsDialog", "getIsDialog", "IsPopup", "getIsPopup", "IsShowingTextSubstitution", "getIsShowingTextSubstitution", "IsTraversalGroup", "getIsTraversalGroup", "LiveRegion", "Landroidx/compose/ui/semantics/LiveRegionMode;", "getLiveRegion", "PaneTitle", "getPaneTitle", "Password", "getPassword", "ProgressBarRangeInfo", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "getProgressBarRangeInfo", "Role", "Landroidx/compose/ui/semantics/Role;", "getRole", "SelectableGroup", "getSelectableGroup", "Selected", "getSelected", "StateDescription", "getStateDescription", "TestTag", "getTestTag", "Text", "getText", "TextSelectionRange", "Landroidx/compose/ui/text/TextRange;", "getTextSelectionRange", "TextSubstitution", "getTextSubstitution", "ToggleableState", "Landroidx/compose/ui/state/ToggleableState;", "getToggleableState", "TraversalIndex", "", "getTraversalIndex", "VerticalScrollAxisRange", "getVerticalScrollAxisRange", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsProperties {
    public static final androidx.compose.ui.semantics.SemanticsProperties INSTANCE = new androidx.compose.ui.semantics.SemanticsProperties();
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<java.util.List<java.lang.String>> ContentDescription = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("ContentDescription", new kotlin.jvm.functions.Function2<java.util.List<? extends java.lang.String>, java.util.List<? extends java.lang.String>, java.util.List<? extends java.lang.String>>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.util.List<? extends java.lang.String> invoke(java.util.List<? extends java.lang.String> list, java.util.List<? extends java.lang.String> list2) {
            return invoke2((java.util.List<java.lang.String>) list, (java.util.List<java.lang.String>) list2);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.util.List<java.lang.String> invoke2(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
            java.util.List<java.lang.String> mutableList;
            if (list == null || (mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) list)) == null) {
                return list2;
            }
            mutableList.addAll(list2);
            return mutableList;
        }
    });
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.String> StateDescription = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("StateDescription");
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.ProgressBarRangeInfo> ProgressBarRangeInfo = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("ProgressBarRangeInfo");
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.String> PaneTitle = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("PaneTitle", new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, java.lang.String>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$PaneTitle$1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.String invoke(java.lang.String str, java.lang.String str2) {
            throw new java.lang.IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    });
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Unit> SelectableGroup = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("SelectableGroup");
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.CollectionInfo> CollectionInfo = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("CollectionInfo");
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.CollectionItemInfo> CollectionItemInfo = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("CollectionItemInfo");
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Unit> Heading = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("Heading");
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Unit> Disabled = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("Disabled");
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.LiveRegionMode> LiveRegion = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("LiveRegion");
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.Boolean> Focused = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("Focused");
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.Boolean> IsTraversalGroup = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("IsTraversalGroup");
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Unit> InvisibleToUser = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("InvisibleToUser", new kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.Unit, kotlin.Unit>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$InvisibleToUser$1
        @Override // kotlin.jvm.functions.Function2
        public final kotlin.Unit invoke(kotlin.Unit unit, kotlin.Unit unit2) {
            return unit;
        }
    });
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.Float> TraversalIndex = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("TraversalIndex", new kotlin.jvm.functions.Function2<java.lang.Float, java.lang.Float, java.lang.Float>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TraversalIndex$1
        public final java.lang.Float invoke(java.lang.Float f, float f2) {
            return f;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Float invoke(java.lang.Float f, java.lang.Float f2) {
            return invoke(f, f2.floatValue());
        }
    });
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.ScrollAxisRange> HorizontalScrollAxisRange = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("HorizontalScrollAxisRange");
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.ScrollAxisRange> VerticalScrollAxisRange = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("VerticalScrollAxisRange");
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Unit> IsPopup = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("IsPopup", new kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.Unit, kotlin.Unit>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1
        @Override // kotlin.jvm.functions.Function2
        public final kotlin.Unit invoke(kotlin.Unit unit, kotlin.Unit unit2) {
            throw new java.lang.IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    });
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Unit> IsDialog = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("IsDialog", new kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.Unit, kotlin.Unit>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsDialog$1
        @Override // kotlin.jvm.functions.Function2
        public final kotlin.Unit invoke(kotlin.Unit unit, kotlin.Unit unit2) {
            throw new java.lang.IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    });
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.Role> Role = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("Role", new kotlin.jvm.functions.Function2<androidx.compose.ui.semantics.Role, androidx.compose.ui.semantics.Role, androidx.compose.ui.semantics.Role>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Role$1
        /* renamed from: invoke-qtA-w6s, reason: not valid java name */
        public final androidx.compose.ui.semantics.Role m3803invokeqtAw6s(androidx.compose.ui.semantics.Role role, int i) {
            return role;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ androidx.compose.ui.semantics.Role invoke(androidx.compose.ui.semantics.Role role, androidx.compose.ui.semantics.Role role2) {
            return m3803invokeqtAw6s(role, role2.getValue());
        }
    });
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.String> TestTag = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("TestTag", false, new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, java.lang.String>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TestTag$1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.String invoke(java.lang.String str, java.lang.String str2) {
            return str;
        }
    });
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<java.util.List<androidx.compose.ui.text.AnnotatedString>> Text = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("Text", new kotlin.jvm.functions.Function2<java.util.List<? extends androidx.compose.ui.text.AnnotatedString>, java.util.List<? extends androidx.compose.ui.text.AnnotatedString>, java.util.List<? extends androidx.compose.ui.text.AnnotatedString>>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Text$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.util.List<? extends androidx.compose.ui.text.AnnotatedString> invoke(java.util.List<? extends androidx.compose.ui.text.AnnotatedString> list, java.util.List<? extends androidx.compose.ui.text.AnnotatedString> list2) {
            return invoke2((java.util.List<androidx.compose.ui.text.AnnotatedString>) list, (java.util.List<androidx.compose.ui.text.AnnotatedString>) list2);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.util.List<androidx.compose.ui.text.AnnotatedString> invoke2(java.util.List<androidx.compose.ui.text.AnnotatedString> list, java.util.List<androidx.compose.ui.text.AnnotatedString> list2) {
            java.util.List<androidx.compose.ui.text.AnnotatedString> mutableList;
            if (list == null || (mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) list)) == null) {
                return list2;
            }
            mutableList.addAll(list2);
            return mutableList;
        }
    });
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.text.AnnotatedString> TextSubstitution = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("TextSubstitution", null, 2, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.Boolean> IsShowingTextSubstitution = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("IsShowingTextSubstitution", null, 2, null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.text.AnnotatedString> EditableText = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("EditableText");
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.text.TextRange> TextSelectionRange = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("TextSelectionRange");
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.text.input.ImeAction> ImeAction = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("ImeAction");
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.Boolean> Selected = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("Selected");
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.state.ToggleableState> ToggleableState = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("ToggleableState");
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Unit> Password = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey("Password");
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.String> Error = androidx.compose.ui.semantics.SemanticsPropertiesKt.AccessibilityKey(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Integer>> IndexForKey = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("IndexForKey", null, 2, null);
    public static final int $stable = 8;

    public static /* synthetic */ void getInvisibleToUser$annotations() {
    }

    @kotlin.Deprecated(message = "Use `isTraversalGroup` instead.", replaceWith = @kotlin.ReplaceWith(expression = "IsTraversalGroup", imports = {}))
    public static /* synthetic */ void getIsContainer$annotations() {
    }

    private SemanticsProperties() {
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<java.util.List<java.lang.String>> getContentDescription() {
        return ContentDescription;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.String> getStateDescription() {
        return StateDescription;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.ProgressBarRangeInfo> getProgressBarRangeInfo() {
        return ProgressBarRangeInfo;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.String> getPaneTitle() {
        return PaneTitle;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Unit> getSelectableGroup() {
        return SelectableGroup;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.CollectionInfo> getCollectionInfo() {
        return CollectionInfo;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.CollectionItemInfo> getCollectionItemInfo() {
        return CollectionItemInfo;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Unit> getHeading() {
        return Heading;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Unit> getDisabled() {
        return Disabled;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.LiveRegionMode> getLiveRegion() {
        return LiveRegion;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.Boolean> getFocused() {
        return Focused;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.Boolean> getIsContainer() {
        return IsTraversalGroup;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.Boolean> getIsTraversalGroup() {
        return IsTraversalGroup;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Unit> getInvisibleToUser() {
        return InvisibleToUser;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.Float> getTraversalIndex() {
        return TraversalIndex;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.ScrollAxisRange> getHorizontalScrollAxisRange() {
        return HorizontalScrollAxisRange;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.ScrollAxisRange> getVerticalScrollAxisRange() {
        return VerticalScrollAxisRange;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Unit> getIsPopup() {
        return IsPopup;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Unit> getIsDialog() {
        return IsDialog;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.semantics.Role> getRole() {
        return Role;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.String> getTestTag() {
        return TestTag;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<java.util.List<androidx.compose.ui.text.AnnotatedString>> getText() {
        return Text;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.text.AnnotatedString> getTextSubstitution() {
        return TextSubstitution;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.Boolean> getIsShowingTextSubstitution() {
        return IsShowingTextSubstitution;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.text.AnnotatedString> getEditableText() {
        return EditableText;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.text.TextRange> getTextSelectionRange() {
        return TextSelectionRange;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.text.input.ImeAction> getImeAction() {
        return ImeAction;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.Boolean> getSelected() {
        return Selected;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.ui.state.ToggleableState> getToggleableState() {
        return ToggleableState;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Unit> getPassword() {
        return Password;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<java.lang.String> getError() {
        return Error;
    }

    public final androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Integer>> getIndexForKey() {
        return IndexForKey;
    }
}
