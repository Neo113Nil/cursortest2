package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\u0094\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 å\u00012\u00020\u0001:\u0004å\u0001æ\u0001J5\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013H&¢\u0006\u0004\b\u0019\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u001b\u0010\u000eJ\u0019\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u0004H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b#\u0010$JO\u0010.\u001a\u00020-2$\u0010)\u001a \u0012\t\u0012\u00070&¢\u0006\u0002\b'\u0012\u000b\u0012\t\u0018\u00010(¢\u0006\u0002\b'\u0012\u0004\u0012\u00020\b0%2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0*2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010(H&¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\bH&¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b2\u0010\u000eJ\u0017\u00103\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b3\u0010\u000eJ\u001f\u00106\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00105\u001a\u000204H&¢\u0006\u0004\b6\u00107J\u001f\u00108\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00105\u001a\u000204H&¢\u0006\u0004\b8\u00107J\u001b\u0010<\u001a\u00020\b2\n\u0010;\u001a\u000609j\u0002`:H&¢\u0006\u0004\b<\u0010=J\u001d\u0010?\u001a\u00020\b2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\b0*H&¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\bH&¢\u0006\u0004\bA\u00101J\u0017\u0010C\u001a\u00020\b2\u0006\u0010>\u001a\u00020BH&¢\u0006\u0004\bC\u0010DJ9\u0010K\u001a\u00020G2'\u0010J\u001a#\b\u0001\u0012\u0004\u0012\u00020E\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0F\u0012\u0006\u0012\u0004\u0018\u00010H0%¢\u0006\u0002\bIH¦@¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\bH&¢\u0006\u0004\bM\u00101J\u000f\u0010N\u001a\u00020\bH&¢\u0006\u0004\bN\u00101J\u000f\u0010O\u001a\u00020\bH&¢\u0006\u0004\bO\u00101J\u000f\u0010P\u001a\u00020\bH&¢\u0006\u0004\bP\u00101J\u0017\u0010S\u001a\u00020\b2\u0006\u0010R\u001a\u00020QH&¢\u0006\u0004\bS\u0010TJ\u0017\u0010X\u001a\u00020\b2\u0006\u0010U\u001a\u00020\u0013H&¢\u0006\u0004\bV\u0010WR\u0014\u0010[\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00020\\8'X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8'X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8'X¦\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8'X¦\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8'X¦\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8'X¦\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8'X¦\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0014\u0010{\u001a\u00020x8'X¦\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010\u007f\u001a\u00020|8'X¦\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018'X¦\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018'X¦\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001a\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u00018'X¦\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001a\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u00018'X¦\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018'X¦\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018'X¦\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u0098\u00018'X¦\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009c\u00018'X¦\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0018\u0010£\u0001\u001a\u00030 \u00018'X¦\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010§\u0001\u001a\u00030¤\u00018'X¦\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010«\u0001\u001a\u00030¨\u00018'X¦\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R\u0018\u0010¯\u0001\u001a\u00030¬\u00018'X¦\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0018\u0010³\u0001\u001a\u00030°\u00018'X¦\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u001f\u0010¸\u0001\u001a\u00030´\u00018'X§\u0004¢\u0006\u000f\u0012\u0005\b·\u0001\u00101\u001a\u0006\bµ\u0001\u0010¶\u0001R\u0018\u0010¼\u0001\u001a\u00030¹\u00018'X¦\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001R\u0018\u0010À\u0001\u001a\u00030½\u00018'X¦\u0004¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001R \u0010Ä\u0001\u001a\u00020\u00048'@'X¦\u000e¢\u0006\u000f\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0005\bÃ\u0001\u0010\u001eR\u0018\u0010È\u0001\u001a\u00030Å\u00018'X¦\u0004¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ç\u0001R\u0018\u0010Ì\u0001\u001a\u00030É\u00018'X¦\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u0018\u0010Ð\u0001\u001a\u00030Í\u00018'X¦\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u0018\u0010Ô\u0001\u001a\u00030Ñ\u00018'X¦\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u0018\u0010Ø\u0001\u001a\u00030Õ\u00018'X¦\u0004¢\u0006\b\u001a\u0006\bÖ\u0001\u0010×\u0001R\u0018\u0010Ü\u0001\u001a\u00030Ù\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÚ\u0001\u0010Û\u0001R\u0018\u0010à\u0001\u001a\u00030Ý\u00018'X¦\u0004¢\u0006\b\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u001a\u0010ä\u0001\u001a\u0005\u0018\u00010á\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bâ\u0001\u0010ã\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "affectsLookahead", "forceRequest", "scheduleMeasureAndLayout", "", "onRequestMeasure", "(Landroidx/compose/ui/node/LayoutNode;ZZZ)V", "onRequestRelayout", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "requestOnPositionedCallback", "(Landroidx/compose/ui/node/LayoutNode;)V", "node", "onPreAttach", "onPostAttach", "onDetach", "Landroidx/compose/ui/geometry/Offset;", "localPosition", "calculatePositionInWindow-MK-Hz9U", "(J)J", "calculatePositionInWindow", "positionInWindow", "calculateLocalPosition-MK-Hz9U", "calculateLocalPosition", "requestAutofill", "sendPointerUpdate", "measureAndLayout", "(Z)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "forceMeasureTheSubtree", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "explicitLayer", "Landroidx/compose/ui/node/OwnedLayer;", "createLayer", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)Landroidx/compose/ui/node/OwnedLayer;", "onSemanticsChange", "()V", "onLayoutChange", "onLayoutNodeDeactivated", "", "oldSemanticsId", "onPreLayoutNodeReused", "(Landroidx/compose/ui/node/LayoutNode;I)V", "onPostLayoutNodeReused", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/Camera2StreamConfigurationMap;", "view", "onInteropViewLayoutChange", "(Landroid/view/View;)V", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerOnEndApplyChangesListener", "(Lkotlin/jvm/functions/Function0;)V", "onEndApplyChanges", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "registerOnLayoutCompletedListener", "(Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;)V", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "session", "textInputSession", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "incrementSensitiveComponentCount", "decrementSensitiveComponentCount", "incrementKeepScreenOnCount", "decrementKeepScreenOnCount", "", "frameRate", "voteFrameRate", "(F)V", "delta", "dispatchOnScrollChanged-k-4lQ0M", "(J)V", "dispatchOnScrollChanged", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/collection/IntObjectMap;", "getLayoutNodes", "()Landroidx/collection/IntObjectMap;", "layoutNodes", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "sharedDrawScope", "Landroidx/compose/ui/node/RootForTest;", "getRootForTest", "()Landroidx/compose/ui/node/RootForTest;", "rootForTest", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/input/InputModeManager;", "getInputModeManager", "()Landroidx/compose/ui/input/InputModeManager;", "inputModeManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/ClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/Clipboard;", "getClipboard", "()Landroidx/compose/ui/platform/Clipboard;", "clipboard", "Landroidx/compose/ui/platform/AccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AccessibilityManager;", "accessibilityManager", "Landroidx/compose/ui/graphics/GraphicsContext;", "getGraphicsContext", "()Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "autofillTree", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "autofill", "Landroidx/compose/ui/autofill/AutofillManager;", "getAutofillManager", "()Landroidx/compose/ui/autofill/AutofillManager;", "autofillManager", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "softwareKeyboardController", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "pointerIconService", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/SemanticsOwner;", "semanticsOwner", "Landroidx/compose/ui/focus/FocusOwner;", "getFocusOwner", "()Landroidx/compose/ui/focus/FocusOwner;", "focusOwner", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "windowInfo", "Landroidx/compose/runtime/retain/RetainedValuesStore;", "getRetainedValuesStore", "()Landroidx/compose/runtime/retain/RetainedValuesStore;", "retainedValuesStore", "Landroidx/compose/ui/spatial/RectManager;", "getRectManager", "()Landroidx/compose/ui/spatial/RectManager;", "rectManager", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader$annotations", "fontLoader", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "showLayoutBounds", "", "getMeasureIteration", "()J", "measureIteration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "modifierLocalManager", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getPlacementScope", "()Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementScope", "Landroidx/compose/ui/draganddrop/DragAndDropManager;", "getDragAndDropManager", "()Landroidx/compose/ui/draganddrop/DragAndDropManager;", "dragAndDropManager", "Landroidx/compose/ui/node/OutOfFrameExecutor;", "getOutOfFrameExecutor", "()Landroidx/compose/ui/node/OutOfFrameExecutor;", "outOfFrameExecutor", "Companion", "OnLayoutCompletedListener"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Owner extends androidx.compose.ui.input.pointer.PositionCalculator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.node.Owner.Companion INSTANCE = androidx.compose.ui.node.Owner.Companion.getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "", "", "onLayoutComplete", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnLayoutCompletedListener {
        void onLayoutComplete();
    }

    @kotlin.Deprecated(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @kotlin.ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    static /* synthetic */ void getFontLoader$annotations() {
    }

    /* renamed from: calculateLocalPosition-MK-Hz9U, reason: not valid java name */
    long mo7685calculateLocalPositionMKHz9U(long positionInWindow);

    /* renamed from: calculatePositionInWindow-MK-Hz9U, reason: not valid java name */
    long mo7686calculatePositionInWindowMKHz9U(long localPosition);

    androidx.compose.ui.node.OwnedLayer createLayer(kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.Canvas, ? super androidx.compose.ui.graphics.layer.GraphicsLayer, kotlin.Unit> drawBlock, kotlin.jvm.functions.Function0<kotlin.Unit> invalidateParentLayer, androidx.compose.ui.graphics.layer.GraphicsLayer explicitLayer);

    default void decrementKeepScreenOnCount() {
    }

    default void decrementSensitiveComponentCount() {
    }

    /* renamed from: dispatchOnScrollChanged-k-4lQ0M, reason: not valid java name */
    default void mo7687dispatchOnScrollChangedk4lQ0M(long delta) {
    }

    void forceMeasureTheSubtree(androidx.compose.ui.node.LayoutNode layoutNode, boolean affectsLookahead);

    androidx.compose.ui.platform.AccessibilityManager getAccessibilityManager();

    androidx.compose.ui.autofill.Autofill getAutofill();

    androidx.compose.ui.autofill.AutofillManager getAutofillManager();

    androidx.compose.ui.autofill.AutofillTree getAutofillTree();

    androidx.compose.ui.platform.Clipboard getClipboard();

    androidx.compose.ui.platform.ClipboardManager getClipboardManager();

    kotlin.coroutines.CoroutineContext getCoroutineContext();

    androidx.compose.ui.unit.Density getDensity();

    androidx.compose.ui.draganddrop.DragAndDropManager getDragAndDropManager();

    androidx.compose.ui.focus.FocusOwner getFocusOwner();

    androidx.compose.ui.text.font.FontFamily.Resolver getFontFamilyResolver();

    androidx.compose.ui.text.font.Font.ResourceLoader getFontLoader();

    androidx.compose.ui.graphics.GraphicsContext getGraphicsContext();

    androidx.compose.ui.hapticfeedback.HapticFeedback getHapticFeedBack();

    androidx.compose.ui.input.InputModeManager getInputModeManager();

    androidx.compose.ui.unit.LayoutDirection getLayoutDirection();

    androidx.collection.IntObjectMap<androidx.compose.ui.node.LayoutNode> getLayoutNodes();

    long getMeasureIteration();

    androidx.compose.ui.modifier.ModifierLocalManager getModifierLocalManager();

    default androidx.compose.ui.node.OutOfFrameExecutor getOutOfFrameExecutor() {
        return null;
    }

    androidx.compose.ui.input.pointer.PointerIconService getPointerIconService();

    androidx.compose.ui.spatial.RectManager getRectManager();

    androidx.compose.runtime.retain.RetainedValuesStore getRetainedValuesStore();

    androidx.compose.ui.node.LayoutNode getRoot();

    androidx.compose.ui.node.RootForTest getRootForTest();

    androidx.compose.ui.semantics.SemanticsOwner getSemanticsOwner();

    androidx.compose.ui.node.LayoutNodeDrawScope getSharedDrawScope();

    boolean getShowLayoutBounds();

    androidx.compose.ui.node.OwnerSnapshotObserver getSnapshotObserver();

    androidx.compose.ui.platform.SoftwareKeyboardController getSoftwareKeyboardController();

    androidx.compose.ui.text.input.TextInputService getTextInputService();

    androidx.compose.ui.platform.TextToolbar getTextToolbar();

    androidx.compose.ui.platform.ViewConfiguration getViewConfiguration();

    androidx.compose.ui.platform.WindowInfo getWindowInfo();

    default void incrementKeepScreenOnCount() {
    }

    default void incrementSensitiveComponentCount() {
    }

    void measureAndLayout(boolean sendPointerUpdate);

    /* renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    void mo7688measureAndLayout0kLqBqw(androidx.compose.ui.node.LayoutNode layoutNode, long constraints);

    void onDetach(androidx.compose.ui.node.LayoutNode node);

    void onEndApplyChanges();

    void onInteropViewLayoutChange(android.view.View view);

    void onLayoutChange(androidx.compose.ui.node.LayoutNode layoutNode);

    void onLayoutNodeDeactivated(androidx.compose.ui.node.LayoutNode layoutNode);

    void onPostAttach(androidx.compose.ui.node.LayoutNode node);

    default void onPostLayoutNodeReused(androidx.compose.ui.node.LayoutNode layoutNode, int oldSemanticsId) {
    }

    void onPreAttach(androidx.compose.ui.node.LayoutNode node);

    default void onPreLayoutNodeReused(androidx.compose.ui.node.LayoutNode layoutNode, int oldSemanticsId) {
    }

    void onRequestMeasure(androidx.compose.ui.node.LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest, boolean scheduleMeasureAndLayout);

    void onRequestRelayout(androidx.compose.ui.node.LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest);

    void onSemanticsChange();

    void registerOnEndApplyChangesListener(kotlin.jvm.functions.Function0<kotlin.Unit> listener);

    void registerOnLayoutCompletedListener(androidx.compose.ui.node.Owner.OnLayoutCompletedListener listener);

    void requestAutofill(androidx.compose.ui.node.LayoutNode node);

    void requestOnPositionedCallback(androidx.compose.ui.node.LayoutNode layoutNode);

    void setShowLayoutBounds(boolean z);

    java.lang.Object textInputSession(kotlin.jvm.functions.Function2<? super androidx.compose.ui.platform.PlatformTextInputSessionScope, ? super kotlin.coroutines.Continuation<?>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<?> continuation);

    default void voteFrameRate(float frameRate) {
    }

    static /* synthetic */ void onRequestMeasure$default(androidx.compose.ui.node.Owner owner, androidx.compose.ui.node.LayoutNode layoutNode, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        owner.onRequestMeasure(layoutNode, z, z2, z3);
    }

    static /* synthetic */ void onRequestRelayout$default(androidx.compose.ui.node.Owner owner, androidx.compose.ui.node.LayoutNode layoutNode, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        owner.onRequestRelayout(layoutNode, z, z2);
    }

    static /* synthetic */ void measureAndLayout$default(androidx.compose.ui.node.Owner owner, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        owner.measureAndLayout(z);
    }

    static /* synthetic */ void forceMeasureTheSubtree$default(androidx.compose.ui.node.Owner owner, androidx.compose.ui.node.LayoutNode layoutNode, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        owner.forceMeasureTheSubtree(layoutNode, z);
    }

    static /* synthetic */ androidx.compose.ui.node.OwnedLayer createLayer$default(androidx.compose.ui.node.Owner owner, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if ((i & 4) != 0) {
            graphicsLayer = null;
        }
        return owner.createLayer(function2, function0, graphicsLayer);
    }

    default androidx.compose.ui.layout.Placeable.PlacementScope getPlacementScope() {
        return androidx.compose.ui.layout.PlaceableKt.PlacementScope(this);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/node/Owner$Companion;", "", "<init>", "()V", "", "enableExtraAssertions", "Z", "getEnableExtraAssertions", "()Z", "setEnableExtraAssertions", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static boolean enableExtraAssertions;
        static final /* synthetic */ androidx.compose.ui.node.Owner.Companion getHighSpeedVideoSizes = new androidx.compose.ui.node.Owner.Companion();

        private Companion() {
        }

        public final boolean getEnableExtraAssertions() {
            return enableExtraAssertions;
        }

        public final void setEnableExtraAssertions(boolean z) {
            enableExtraAssertions = z;
        }
    }
}
