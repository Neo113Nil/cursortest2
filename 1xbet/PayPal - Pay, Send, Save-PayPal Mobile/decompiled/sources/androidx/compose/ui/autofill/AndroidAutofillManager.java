package androidx.compose.ui.autofill;

@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J#\u0010\u0017\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u001b\u0010&\u001a\u00020\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b*\u0010)J\u001f\u0010-\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b/\u0010)J\u0017\u00100\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b0\u0010)J\u000f\u00101\u001a\u00020\u0010H\u0000¢\u0006\u0004\b1\u0010\u0012R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010?\u001a\u00020B8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u0010CR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020G8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bA\u0010HR\u0016\u0010:\u001a\u00020J8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010K"}, d2 = {"Landroidx/compose/ui/autofill/AndroidAutofillManager;", "Landroidx/compose/ui/autofill/AutofillManager;", "Landroidx/compose/ui/semantics/SemanticsListener;", "Landroidx/compose/ui/focus/FocusListener;", "Landroidx/compose/ui/autofill/PlatformAutofillManager;", "platformAutofillManager", "Landroidx/compose/ui/semantics/SemanticsOwner;", "semanticsOwner", "Landroid/view/View;", "view", "Landroidx/compose/ui/spatial/RectManager;", "rectManager", "", com.visa.cbp.ConsumerInfo.setSignature, "<init>", "(Landroidx/compose/ui/autofill/PlatformAutofillManager;Landroidx/compose/ui/semantics/SemanticsOwner;Landroid/view/View;Landroidx/compose/ui/spatial/RectManager;Ljava/lang/String;)V", "", com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs.QUERY_COMMIT, "()V", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "previous", "current", "onFocusChanged", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;)V", "Landroidx/compose/ui/semantics/SemanticsInfo;", "semanticsInfo", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "previousSemanticsConfiguration", "onSemanticsChanged", "(Landroidx/compose/ui/semantics/SemanticsInfo;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "Landroid/view/ViewStructure;", "rootViewStructure", "populateViewStructure", "(Landroid/view/ViewStructure;)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "performAutofill", "(Landroid/util/SparseArray;)V", "requestAutofill$ui", "(Landroidx/compose/ui/semantics/SemanticsInfo;)V", "onPostAttach$ui", "", "previousSemanticsId", "onPostLayoutNodeReused$ui", "(Landroidx/compose/ui/semantics/SemanticsInfo;I)V", "onLayoutNodeDeactivated$ui", "onDetach$ui", "onEndApplyChanges$ui", "Landroidx/compose/ui/autofill/PlatformAutofillManager;", "getPlatformAutofillManager", "()Landroidx/compose/ui/autofill/PlatformAutofillManager;", "setPlatformAutofillManager", "(Landroidx/compose/ui/autofill/PlatformAutofillManager;)V", "getOutputMinFrameDuration", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getHighSpeedVideoFpsRangesFor", "getInputSizeshNQ4ISI", "Landroid/view/View;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/spatial/RectManager;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "Landroid/view/autofill/AutofillId;", "getOutputFormats", "Landroid/view/autofill/AutofillId;", "Landroidx/collection/MutableIntSet;", "Landroidx/collection/MutableIntSet;", "getHighSpeedVideoSizesFor", "", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidAutofillManager extends androidx.compose.ui.autofill.AutofillManager implements androidx.compose.ui.semantics.SemanticsListener, androidx.compose.ui.focus.FocusListener {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.spatial.RectManager getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.collection.MutableIntSet getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private android.graphics.Rect getHighSpeedVideoFpsRanges = new android.graphics.Rect();

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.view.View Camera2StreamConfigurationMap;
    private android.view.autofill.AutofillId getOutputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.compose.ui.semantics.SemanticsOwner getHighSpeedVideoFpsRangesFor;
    private androidx.compose.ui.autofill.PlatformAutofillManager platformAutofillManager;

    public AndroidAutofillManager(androidx.compose.ui.autofill.PlatformAutofillManager platformAutofillManager, androidx.compose.ui.semantics.SemanticsOwner semanticsOwner, android.view.View view, androidx.compose.ui.spatial.RectManager rectManager, java.lang.String str) {
        this.platformAutofillManager = platformAutofillManager;
        this.getHighSpeedVideoFpsRangesFor = semanticsOwner;
        this.Camera2StreamConfigurationMap = view;
        this.getHighSpeedVideoSizes = rectManager;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        int i = 1;
        view.setImportantForAutofill(1);
        androidx.compose.ui.platform.coreshims.AutofillIdCompat autofillId = androidx.compose.ui.platform.coreshims.ViewCompatShims.getAutofillId(view);
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        android.view.autofill.AutofillId autofillId2 = autofillId != null ? autofillId.toAutofillId() : null;
        if (autofillId2 != null) {
            this.getOutputFormats = autofillId2;
            this.getHighSpeedVideoSizesFor = new androidx.collection.MutableIntSet(0, i, defaultConstructorMarker);
        } else {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
            throw new kotlin.KotlinNothingValueException();
        }
    }

    public final androidx.compose.ui.autofill.PlatformAutofillManager getPlatformAutofillManager() {
        return this.platformAutofillManager;
    }

    public final void setPlatformAutofillManager(androidx.compose.ui.autofill.PlatformAutofillManager platformAutofillManager) {
        this.platformAutofillManager = platformAutofillManager;
    }

    @Override // androidx.compose.ui.autofill.AutofillManager
    public final void commit() {
        this.platformAutofillManager.commit();
    }

    @Override // androidx.compose.ui.autofill.AutofillManager
    public final void cancel() {
        this.platformAutofillManager.cancel();
    }

    @Override // androidx.compose.ui.focus.FocusListener
    public final void onFocusChanged(androidx.compose.ui.focus.FocusTargetModifierNode previous, androidx.compose.ui.focus.FocusTargetModifierNode current) {
        androidx.compose.ui.semantics.SemanticsInfo requireSemanticsInfo;
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration;
        boolean highSpeedVideoFpsRanges;
        androidx.compose.ui.semantics.SemanticsInfo requireSemanticsInfo2;
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration2;
        boolean highSpeedVideoFpsRanges2;
        if (previous != null && (requireSemanticsInfo2 = androidx.compose.ui.node.DelegatableNodeKt.requireSemanticsInfo(previous)) != null && (semanticsConfiguration2 = requireSemanticsInfo2.getSemanticsConfiguration()) != null) {
            highSpeedVideoFpsRanges2 = androidx.compose.ui.autofill.AndroidAutofillManager_androidKt.getHighSpeedVideoFpsRanges(semanticsConfiguration2);
            if (highSpeedVideoFpsRanges2) {
                this.platformAutofillManager.notifyViewExited(this.Camera2StreamConfigurationMap, requireSemanticsInfo2.getSemanticsId());
            }
        }
        if (current == null || (requireSemanticsInfo = androidx.compose.ui.node.DelegatableNodeKt.requireSemanticsInfo(current)) == null || (semanticsConfiguration = requireSemanticsInfo.getSemanticsConfiguration()) == null) {
            return;
        }
        highSpeedVideoFpsRanges = androidx.compose.ui.autofill.AndroidAutofillManager_androidKt.getHighSpeedVideoFpsRanges(semanticsConfiguration);
        if (highSpeedVideoFpsRanges) {
            final int semanticsId = requireSemanticsInfo.getSemanticsId();
            this.getHighSpeedVideoSizes.getRects().withRect(semanticsId, new kotlin.jvm.functions.Function4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$onFocusChanged$2$1
                @Override // kotlin.jvm.functions.Function4
                public final /* synthetic */ kotlin.Unit invoke(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4) {
                    getHighSpeedVideoSizes(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoSizes(int i, int i2, int i3, int i4) {
                    android.view.View view;
                    androidx.compose.ui.autofill.PlatformAutofillManager platformAutofillManager = androidx.compose.ui.autofill.AndroidAutofillManager.this.getPlatformAutofillManager();
                    view = androidx.compose.ui.autofill.AndroidAutofillManager.this.Camera2StreamConfigurationMap;
                    platformAutofillManager.notifyViewEntered(view, semanticsId, new android.graphics.Rect(i, i2, i3, i4));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.semantics.SemanticsListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSemanticsChanged(androidx.compose.ui.semantics.SemanticsInfo semanticsInfo, androidx.compose.ui.semantics.SemanticsConfiguration previousSemanticsConfiguration) {
        boolean z;
        boolean highResolutionOutputSizeshNQ4ISI;
        boolean highResolutionOutputSizeshNQ4ISI2;
        java.lang.Boolean bool;
        androidx.compose.ui.text.AnnotatedString annotatedString;
        androidx.compose.ui.text.AnnotatedString annotatedString2;
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        int semanticsId = semanticsInfo.getSemanticsId();
        java.lang.String text = (previousSemanticsConfiguration == null || (annotatedString2 = (androidx.compose.ui.text.AnnotatedString) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(previousSemanticsConfiguration, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getInputText())) == null) ? null : annotatedString2.getText();
        java.lang.String text2 = (semanticsConfiguration == null || (annotatedString = (androidx.compose.ui.text.AnnotatedString) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsConfiguration, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getInputText())) == null) ? null : annotatedString.getText();
        boolean z2 = false;
        if (text != text2) {
            if (text == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.Camera2StreamConfigurationMap, semanticsId, true);
            } else if (text2 == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.Camera2StreamConfigurationMap, semanticsId, false);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual((androidx.compose.ui.autofill.ContentDataType) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsConfiguration, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDataType()), androidx.compose.ui.autofill.ContentDataType.INSTANCE.getText())) {
                this.platformAutofillManager.notifyValueChanged(this.Camera2StreamConfigurationMap, semanticsId, androidx.compose.ui.autofill.AutofillApi26Helper.INSTANCE.getAutofillTextValue(text2));
            }
        }
        androidx.compose.ui.state.ToggleableState toggleableState = previousSemanticsConfiguration != null ? (androidx.compose.ui.state.ToggleableState) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(previousSemanticsConfiguration, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getToggleableState()) : null;
        androidx.compose.ui.state.ToggleableState toggleableState2 = semanticsConfiguration != null ? (androidx.compose.ui.state.ToggleableState) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsConfiguration, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getToggleableState()) : null;
        if (toggleableState != toggleableState2) {
            if (toggleableState == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.Camera2StreamConfigurationMap, semanticsId, true);
            } else if (toggleableState2 == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.Camera2StreamConfigurationMap, semanticsId, false);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual((androidx.compose.ui.autofill.ContentDataType) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsConfiguration, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getContentDataType()), androidx.compose.ui.autofill.ContentDataType.INSTANCE.getToggle())) {
                int i = androidx.compose.ui.autofill.AndroidAutofillManager.WhenMappings.$EnumSwitchMapping$0[toggleableState2.ordinal()];
                if (i == 1) {
                    bool = java.lang.Boolean.TRUE;
                } else {
                    bool = i != 2 ? null : java.lang.Boolean.FALSE;
                }
                if (bool != null) {
                    this.platformAutofillManager.notifyValueChanged(this.Camera2StreamConfigurationMap, semanticsId, androidx.compose.ui.autofill.AutofillApi26Helper.INSTANCE.getAutofillToggleValue(bool.booleanValue()));
                }
            }
        }
        androidx.compose.ui.autofill.FillableData fillableData = previousSemanticsConfiguration != null ? (androidx.compose.ui.autofill.FillableData) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(previousSemanticsConfiguration, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getFillableData()) : null;
        androidx.compose.ui.autofill.FillableData fillableData2 = semanticsConfiguration != null ? (androidx.compose.ui.autofill.FillableData) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsConfiguration, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getFillableData()) : null;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(fillableData, fillableData2)) {
            if (fillableData == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.Camera2StreamConfigurationMap, semanticsId, true);
            } else if (fillableData2 == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.Camera2StreamConfigurationMap, semanticsId, false);
            } else {
                this.platformAutofillManager.notifyValueChanged(this.Camera2StreamConfigurationMap, semanticsId, ((androidx.compose.ui.autofill.AndroidFillableData) fillableData2).getAutofillValue());
            }
        }
        if (previousSemanticsConfiguration != null) {
            highResolutionOutputSizeshNQ4ISI2 = androidx.compose.ui.autofill.AndroidAutofillManager_androidKt.getHighResolutionOutputSizeshNQ4ISI(previousSemanticsConfiguration);
            if (highResolutionOutputSizeshNQ4ISI2) {
                z = true;
                if (semanticsConfiguration != null) {
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.autofill.AndroidAutofillManager_androidKt.getHighResolutionOutputSizeshNQ4ISI(semanticsConfiguration);
                    if (highResolutionOutputSizeshNQ4ISI) {
                        z2 = true;
                    }
                }
                if (z == z2) {
                    if (z2) {
                        this.getHighSpeedVideoSizesFor.add(semanticsId);
                        return;
                    } else {
                        this.getHighSpeedVideoSizesFor.remove(semanticsId);
                        return;
                    }
                }
                return;
            }
        }
        z = false;
        if (semanticsConfiguration != null) {
        }
        if (z == z2) {
        }
    }

    public final void populateViewStructure(android.view.ViewStructure rootViewStructure) {
        boolean highSpeedVideoFpsRangesFor;
        androidx.compose.ui.autofill.AutofillApi26Helper autofillApi26Helper = androidx.compose.ui.autofill.AutofillApi26Helper.INSTANCE;
        androidx.compose.ui.semantics.SemanticsInfo rootInfo$ui = this.getHighSpeedVideoFpsRangesFor.getRootInfo$ui();
        androidx.compose.ui.autofill.PopulateViewStructure_androidKt.populate(rootViewStructure, rootInfo$ui, this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
        androidx.collection.MutableObjectList mutableObjectListOf = androidx.collection.ObjectListKt.mutableObjectListOf(rootInfo$ui, rootViewStructure);
        while (mutableObjectListOf.isNotEmpty()) {
            androidx.collection.MutableObjectList mutableObjectList = mutableObjectListOf;
            java.lang.Object removeAt = mutableObjectListOf.removeAt(mutableObjectList._size - 1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(removeAt, "");
            android.view.ViewStructure viewStructure = (android.view.ViewStructure) removeAt;
            java.lang.Object removeAt2 = mutableObjectListOf.removeAt(mutableObjectList._size - 1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(removeAt2, "");
            java.util.List<androidx.compose.ui.semantics.SemanticsInfo> childrenInfo = ((androidx.compose.ui.semantics.SemanticsInfo) removeAt2).getChildrenInfo();
            int size = childrenInfo.size();
            for (int i = 0; i < size; i++) {
                androidx.compose.ui.semantics.SemanticsInfo semanticsInfo = childrenInfo.get(i);
                if (!semanticsInfo.getIsDeactivated() && semanticsInfo.isAttached() && semanticsInfo.isPlaced()) {
                    androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
                    if (semanticsConfiguration != null) {
                        highSpeedVideoFpsRangesFor = androidx.compose.ui.autofill.AndroidAutofillManager_androidKt.getHighSpeedVideoFpsRangesFor(semanticsConfiguration);
                        if (highSpeedVideoFpsRangesFor) {
                            android.view.ViewStructure newChild = autofillApi26Helper.newChild(viewStructure, autofillApi26Helper.addChildCount(viewStructure, 1));
                            androidx.compose.ui.autofill.PopulateViewStructure_androidKt.populate(newChild, semanticsInfo, this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
                            mutableObjectListOf.add(semanticsInfo);
                            mutableObjectListOf.add(newChild);
                        }
                    }
                    mutableObjectListOf.add(semanticsInfo);
                    mutableObjectListOf.add(viewStructure);
                }
            }
        }
    }

    public final void requestAutofill$ui(final androidx.compose.ui.semantics.SemanticsInfo semanticsInfo) {
        this.getHighSpeedVideoSizes.getRects().withRect(semanticsInfo.getSemanticsId(), new kotlin.jvm.functions.Function4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$requestAutofill$1
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4) {
                Camera2StreamConfigurationMap(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap(int i, int i2, int i3, int i4) {
                android.graphics.Rect rect;
                android.view.View view;
                android.graphics.Rect rect2;
                rect = androidx.compose.ui.autofill.AndroidAutofillManager.this.getHighSpeedVideoFpsRanges;
                rect.set(i, i2, i3, i4);
                androidx.compose.ui.autofill.PlatformAutofillManager platformAutofillManager = androidx.compose.ui.autofill.AndroidAutofillManager.this.getPlatformAutofillManager();
                view = androidx.compose.ui.autofill.AndroidAutofillManager.this.Camera2StreamConfigurationMap;
                int semanticsId = semanticsInfo.getSemanticsId();
                rect2 = androidx.compose.ui.autofill.AndroidAutofillManager.this.getHighSpeedVideoFpsRanges;
                platformAutofillManager.requestAutofill(view, semanticsId, rect2);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }
        });
    }

    public final void onPostAttach$ui(androidx.compose.ui.semantics.SemanticsInfo semanticsInfo) {
        boolean highResolutionOutputSizeshNQ4ISI;
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        if (semanticsConfiguration != null) {
            highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.autofill.AndroidAutofillManager_androidKt.getHighResolutionOutputSizeshNQ4ISI(semanticsConfiguration);
            if (highResolutionOutputSizeshNQ4ISI) {
                this.getHighSpeedVideoSizesFor.add(semanticsInfo.getSemanticsId());
                this.platformAutofillManager.notifyViewVisibilityChanged(this.Camera2StreamConfigurationMap, semanticsInfo.getSemanticsId(), true);
            }
        }
    }

    public final void onPostLayoutNodeReused$ui(androidx.compose.ui.semantics.SemanticsInfo semanticsInfo, int previousSemanticsId) {
        boolean highResolutionOutputSizeshNQ4ISI;
        if (this.getHighSpeedVideoSizesFor.remove(previousSemanticsId)) {
            this.platformAutofillManager.notifyViewVisibilityChanged(this.Camera2StreamConfigurationMap, previousSemanticsId, false);
        }
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        if (semanticsConfiguration != null) {
            highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.autofill.AndroidAutofillManager_androidKt.getHighResolutionOutputSizeshNQ4ISI(semanticsConfiguration);
            if (highResolutionOutputSizeshNQ4ISI) {
                this.getHighSpeedVideoSizesFor.add(semanticsInfo.getSemanticsId());
                this.platformAutofillManager.notifyViewVisibilityChanged(this.Camera2StreamConfigurationMap, semanticsInfo.getSemanticsId(), true);
            }
        }
    }

    public final void onLayoutNodeDeactivated$ui(androidx.compose.ui.semantics.SemanticsInfo semanticsInfo) {
        if (this.getHighSpeedVideoSizesFor.remove(semanticsInfo.getSemanticsId())) {
            this.platformAutofillManager.notifyViewVisibilityChanged(this.Camera2StreamConfigurationMap, semanticsInfo.getSemanticsId(), false);
        }
    }

    public final void onDetach$ui(androidx.compose.ui.semantics.SemanticsInfo semanticsInfo) {
        if (this.getHighSpeedVideoSizesFor.remove(semanticsInfo.getSemanticsId())) {
            this.platformAutofillManager.notifyViewVisibilityChanged(this.Camera2StreamConfigurationMap, semanticsInfo.getSemanticsId(), false);
        }
    }

    public final void onEndApplyChanges$ui() {
        if (this.getHighSpeedVideoSizesFor.isEmpty() && this.getInputSizeshNQ4ISI) {
            this.platformAutofillManager.commit();
            this.getInputSizeshNQ4ISI = false;
        }
        if (this.getHighSpeedVideoSizesFor.isNotEmpty()) {
            this.getInputSizeshNQ4ISI = true;
        }
    }

    public final void performAutofill(android.util.SparseArray<android.view.autofill.AutofillValue> values) {
        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration;
        kotlin.jvm.functions.Function1 function1;
        kotlin.jvm.functions.Function1 function12;
        int size = values.size();
        for (int i = 0; i < size; i++) {
            int keyAt = values.keyAt(i);
            android.view.autofill.AutofillValue autofillValue = values.get(keyAt);
            androidx.compose.ui.semantics.SemanticsInfo semanticsInfo = this.getHighSpeedVideoFpsRangesFor.get$ui(keyAt);
            if (semanticsInfo != null && (semanticsConfiguration = semanticsInfo.getSemanticsConfiguration()) != null) {
                androidx.compose.ui.semantics.AccessibilityAction accessibilityAction = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsConfiguration, androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnAutofillText());
                if (accessibilityAction != null && (function12 = (kotlin.jvm.functions.Function1) accessibilityAction.getAction()) != null) {
                }
                androidx.compose.ui.semantics.AccessibilityAction accessibilityAction2 = (androidx.compose.ui.semantics.AccessibilityAction) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsConfiguration, androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnFillData());
                if (accessibilityAction2 != null && (function1 = (kotlin.jvm.functions.Function1) accessibilityAction2.getAction()) != null) {
                }
            }
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.state.ToggleableState.values().length];
            try {
                iArr[androidx.compose.ui.state.ToggleableState.On.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.state.ToggleableState.Off.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
