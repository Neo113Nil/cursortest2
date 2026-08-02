package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a2\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u001f\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"(\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000f8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u0014\"&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0012\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001c\u0010\u0014\"\"\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0014\"&\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000f8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0012\u0012\u0004\b$\u0010\u0019\u001a\u0004\b#\u0010\u0014\" \u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0012\u001a\u0004\b'\u0010\u0014\" \u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0012\u001a\u0004\b*\u0010\u0014\" \u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0012\u001a\u0004\b-\u0010\u0014\" \u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0012\u001a\u0004\b0\u0010\u0014\"&\u00102\u001a\b\u0012\u0004\u0012\u0002010\u000f8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010\u0012\u0012\u0004\b4\u0010\u0019\u001a\u0004\b3\u0010\u0014\" \u00106\u001a\b\u0012\u0004\u0012\u0002050\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u0012\u001a\u0004\b7\u0010\u0014\" \u00109\u001a\b\u0012\u0004\u0012\u0002080\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u0012\u001a\u0004\b:\u0010\u0014\" \u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u0012\u001a\u0004\b=\u0010\u0014\" \u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\u0012\u001a\u0004\b@\u0010\u0014\"(\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0\u000f8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010\u0012\u0012\u0004\bD\u0010\u0019\u001a\u0004\bC\u0010\u0014\"\"\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010E0\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010\u0012\u001a\u0004\bG\u0010\u0014\" \u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010\u0012\u001a\u0004\bJ\u0010\u0014\" \u0010K\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010\u0012\u001a\u0004\bL\u0010\u0014\" \u0010N\u001a\b\u0012\u0004\u0012\u00020M0\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010\u0012\u001a\u0004\bO\u0010\u0014\" \u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010\u0012\u001a\u0004\bR\u0010\u0014\"\"\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0\u000f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bT\u0010\u0012\u001a\u0004\bU\u0010\u0014\" \u0010W\u001a\b\u0012\u0004\u0012\u00020V0\u000f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bW\u0010\u0012\u001a\u0004\bX\u0010\u0014\"\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020V0Y8G¢\u0006\u0006\u001a\u0004\bZ\u0010[\" \u0010]\u001a\b\u0012\u0004\u0012\u00020V0\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010\u0012\u001a\u0004\b^\u0010\u0014"}, d2 = {"Landroidx/compose/ui/node/Owner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "Landroidx/compose/ui/platform/UriHandler;", "uriHandler", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "ProvideCommonCompositionLocals", "(Landroidx/compose/ui/node/Owner;Landroidx/compose/ui/platform/UriHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "", "p0", "", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)Ljava/lang/Void;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/platform/AccessibilityManager;", "LocalAccessibilityManager", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAccessibilityManager", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/autofill/Autofill;", "LocalAutofill", "getLocalAutofill", "getLocalAutofill$annotations", "()V", "Landroidx/compose/ui/autofill/AutofillTree;", "LocalAutofillTree", "getLocalAutofillTree", "getLocalAutofillTree$annotations", "Landroidx/compose/ui/autofill/AutofillManager;", "LocalAutofillManager", "getLocalAutofillManager", "Landroidx/compose/ui/platform/ClipboardManager;", "LocalClipboardManager", "getLocalClipboardManager", "getLocalClipboardManager$annotations", "Landroidx/compose/ui/platform/Clipboard;", "LocalClipboard", "getLocalClipboard", "Landroidx/compose/ui/graphics/GraphicsContext;", "LocalGraphicsContext", "getLocalGraphicsContext", "Landroidx/compose/ui/unit/Density;", "LocalDensity", "getLocalDensity", "Landroidx/compose/ui/focus/FocusManager;", "LocalFocusManager", "getLocalFocusManager", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "LocalFontLoader", "getLocalFontLoader", "getLocalFontLoader$annotations", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "LocalFontFamilyResolver", "getLocalFontFamilyResolver", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "LocalHapticFeedback", "getLocalHapticFeedback", "Landroidx/compose/ui/input/InputModeManager;", "LocalInputModeManager", "getLocalInputModeManager", "Landroidx/compose/ui/unit/LayoutDirection;", "LocalLayoutDirection", "getLocalLayoutDirection", "Landroidx/compose/ui/text/input/TextInputService;", "LocalTextInputService", "getLocalTextInputService", "getLocalTextInputService$annotations", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "LocalSoftwareKeyboardController", "getLocalSoftwareKeyboardController", "Landroidx/compose/ui/platform/TextToolbar;", "LocalTextToolbar", "getLocalTextToolbar", "LocalUriHandler", "getLocalUriHandler", "Landroidx/compose/ui/platform/ViewConfiguration;", "LocalViewConfiguration", "getLocalViewConfiguration", "Landroidx/compose/ui/platform/WindowInfo;", "LocalWindowInfo", "getLocalWindowInfo", "Landroidx/compose/ui/input/pointer/PointerIconService;", "LocalPointerIconService", "getLocalPointerIconService", "", "LocalProvidableScrollCaptureInProgress", "getLocalProvidableScrollCaptureInProgress", "Landroidx/compose/runtime/CompositionLocal;", "getLocalScrollCaptureInProgress", "()Landroidx/compose/runtime/CompositionLocal;", "LocalScrollCaptureInProgress", "LocalCursorBlinkEnabled", "getLocalCursorBlinkEnabled"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompositionLocalsKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.AccessibilityManager> LocalAccessibilityManager = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.platform.AccessibilityManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAccessibilityManager$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.platform.AccessibilityManager invoke() {
            return null;
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.autofill.Autofill> LocalAutofill = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.autofill.Autofill>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofill$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.autofill.Autofill invoke() {
            return null;
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.autofill.AutofillTree> LocalAutofillTree = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.autofill.AutofillTree>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofillTree$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.autofill.AutofillTree invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.getHighSpeedVideoFpsRanges("LocalAutofillTree");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.autofill.AutofillManager> LocalAutofillManager = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.autofill.AutofillManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofillManager$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.autofill.AutofillManager invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.getHighSpeedVideoFpsRanges("LocalAutofillManager");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ClipboardManager> LocalClipboardManager = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.platform.ClipboardManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboardManager$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.platform.ClipboardManager invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.getHighSpeedVideoFpsRanges("LocalClipboardManager");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.Clipboard> LocalClipboard = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.platform.Clipboard>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboard$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.platform.Clipboard invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.getHighSpeedVideoFpsRanges("LocalClipboard");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.GraphicsContext> LocalGraphicsContext = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.graphics.GraphicsContext>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalGraphicsContext$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.graphics.GraphicsContext invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.getHighSpeedVideoFpsRanges("LocalGraphicsContext");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> LocalDensity = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.unit.Density>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalDensity$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.unit.Density invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.getHighSpeedVideoFpsRanges("LocalDensity");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.focus.FocusManager> LocalFocusManager = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.focus.FocusManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFocusManager$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.focus.FocusManager invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.getHighSpeedVideoFpsRanges("LocalFocusManager");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.font.Font.ResourceLoader> LocalFontLoader = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.text.font.Font.ResourceLoader>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontLoader$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.font.Font.ResourceLoader invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.getHighSpeedVideoFpsRanges("LocalFontLoader");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.font.FontFamily.Resolver> LocalFontFamilyResolver = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.text.font.FontFamily.Resolver>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontFamilyResolver$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.font.FontFamily.Resolver invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.getHighSpeedVideoFpsRanges("LocalFontFamilyResolver");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.hapticfeedback.HapticFeedback> LocalHapticFeedback = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.hapticfeedback.HapticFeedback>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalHapticFeedback$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.hapticfeedback.HapticFeedback invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.getHighSpeedVideoFpsRanges("LocalHapticFeedback");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.input.InputModeManager> LocalInputModeManager = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.input.InputModeManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalInputModeManager$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.input.InputModeManager invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.getHighSpeedVideoFpsRanges("LocalInputManager");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> LocalLayoutDirection = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.unit.LayoutDirection>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalLayoutDirection$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.unit.LayoutDirection invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.getHighSpeedVideoFpsRanges("LocalLayoutDirection");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.input.TextInputService> LocalTextInputService = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.text.input.TextInputService>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextInputService$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.input.TextInputService invoke() {
            return null;
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.SoftwareKeyboardController> LocalSoftwareKeyboardController = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.platform.SoftwareKeyboardController>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalSoftwareKeyboardController$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.platform.SoftwareKeyboardController invoke() {
            return null;
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.TextToolbar> LocalTextToolbar = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.platform.TextToolbar>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextToolbar$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.platform.TextToolbar invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.getHighSpeedVideoFpsRanges("LocalTextToolbar");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.UriHandler> LocalUriHandler = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.platform.UriHandler>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalUriHandler$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.platform.UriHandler invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.getHighSpeedVideoFpsRanges("LocalUriHandler");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> LocalViewConfiguration = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.platform.ViewConfiguration>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalViewConfiguration$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.platform.ViewConfiguration invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.getHighSpeedVideoFpsRanges("LocalViewConfiguration");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.WindowInfo> LocalWindowInfo = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.platform.WindowInfo>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalWindowInfo$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.platform.WindowInfo invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.getHighSpeedVideoFpsRanges("LocalWindowInfo");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.input.pointer.PointerIconService> LocalPointerIconService = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.input.pointer.PointerIconService>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalPointerIconService$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.input.pointer.PointerIconService invoke() {
            return null;
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Boolean> LocalProvidableScrollCaptureInProgress = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalProvidableScrollCaptureInProgress$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke() {
            return java.lang.Boolean.FALSE;
        }
    }, 1, null);
    private static final androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Boolean> LocalCursorBlinkEnabled = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalCursorBlinkEnabled$1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke() {
            return java.lang.Boolean.TRUE;
        }
    });

    @kotlin.Deprecated(message = "\n        Use the new semantics-based Autofill APIs androidx.compose.ui.autofill.ContentType and\n        androidx.compose.ui.autofill.ContentDataType instead.\n        ")
    public static /* synthetic */ void getLocalAutofill$annotations() {
    }

    @kotlin.Deprecated(message = "\n        Use the new semantics-based Autofill APIs androidx.compose.ui.autofill.ContentType and\n        androidx.compose.ui.autofill.ContentDataType instead.\n        ")
    public static /* synthetic */ void getLocalAutofillTree$annotations() {
    }

    @kotlin.Deprecated(message = "Use LocalClipboard instead which supports suspend functions", replaceWith = @kotlin.ReplaceWith(expression = "LocalClipboard", imports = {"androidx.compose.ui.platform.LocalClipboard"}))
    public static /* synthetic */ void getLocalClipboardManager$annotations() {
    }

    @kotlin.Deprecated(message = "LocalFontLoader is replaced with LocalFontFamilyResolver", replaceWith = @kotlin.ReplaceWith(expression = "LocalFontFamilyResolver", imports = {}))
    public static /* synthetic */ void getLocalFontLoader$annotations() {
    }

    @kotlin.Deprecated(message = "Use PlatformTextInputModifierNode instead.")
    public static /* synthetic */ void getLocalTextInputService$annotations() {
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.AccessibilityManager> getLocalAccessibilityManager() {
        return LocalAccessibilityManager;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.autofill.Autofill> getLocalAutofill() {
        return LocalAutofill;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.autofill.AutofillTree> getLocalAutofillTree() {
        return LocalAutofillTree;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.autofill.AutofillManager> getLocalAutofillManager() {
        return LocalAutofillManager;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ClipboardManager> getLocalClipboardManager() {
        return LocalClipboardManager;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.Clipboard> getLocalClipboard() {
        return LocalClipboard;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.GraphicsContext> getLocalGraphicsContext() {
        return LocalGraphicsContext;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> getLocalDensity() {
        return LocalDensity;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.focus.FocusManager> getLocalFocusManager() {
        return LocalFocusManager;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.font.Font.ResourceLoader> getLocalFontLoader() {
        return LocalFontLoader;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.font.FontFamily.Resolver> getLocalFontFamilyResolver() {
        return LocalFontFamilyResolver;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.hapticfeedback.HapticFeedback> getLocalHapticFeedback() {
        return LocalHapticFeedback;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.input.InputModeManager> getLocalInputModeManager() {
        return LocalInputModeManager;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> getLocalLayoutDirection() {
        return LocalLayoutDirection;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.input.TextInputService> getLocalTextInputService() {
        return LocalTextInputService;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.SoftwareKeyboardController> getLocalSoftwareKeyboardController() {
        return LocalSoftwareKeyboardController;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.TextToolbar> getLocalTextToolbar() {
        return LocalTextToolbar;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.UriHandler> getLocalUriHandler() {
        return LocalUriHandler;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> getLocalViewConfiguration() {
        return LocalViewConfiguration;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.WindowInfo> getLocalWindowInfo() {
        return LocalWindowInfo;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.input.pointer.PointerIconService> getLocalPointerIconService() {
        return LocalPointerIconService;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Boolean> getLocalProvidableScrollCaptureInProgress() {
        return LocalProvidableScrollCaptureInProgress;
    }

    public static final androidx.compose.runtime.CompositionLocal<java.lang.Boolean> getLocalScrollCaptureInProgress() {
        return LocalProvidableScrollCaptureInProgress;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Boolean> getLocalCursorBlinkEnabled() {
        return LocalCursorBlinkEnabled;
    }

    public static final void ProvideCommonCompositionLocals(final androidx.compose.ui.node.Owner owner, final androidx.compose.ui.platform.UriHandler uriHandler, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1925803616);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(owner) : startRestartGroup.changedInstance(owner) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(uriHandler) : startRestartGroup.changedInstance(uriHandler) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1925803616, i2, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:215)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{LocalAccessibilityManager.provides(owner.getAccessibilityManager()), LocalAutofill.provides(owner.getAutofill()), LocalAutofillManager.provides(owner.getAutofillManager()), LocalAutofillTree.provides(owner.getAutofillTree()), LocalClipboardManager.provides(owner.getClipboardManager()), LocalClipboard.provides(owner.getClipboard()), LocalDensity.provides(owner.getDensity()), LocalFocusManager.provides(owner.getFocusOwner()), LocalFontLoader.providesDefault(owner.getFontLoader()), LocalFontFamilyResolver.providesDefault(owner.getFontFamilyResolver()), LocalHapticFeedback.provides(owner.getHapticFeedBack()), LocalInputModeManager.provides(owner.getInputModeManager()), LocalLayoutDirection.provides(owner.getLayoutDirection()), LocalTextInputService.provides(owner.getTextInputService()), LocalSoftwareKeyboardController.provides(owner.getSoftwareKeyboardController()), LocalTextToolbar.provides(owner.getTextToolbar()), LocalUriHandler.provides(uriHandler), LocalViewConfiguration.provides(owner.getViewConfiguration()), LocalWindowInfo.provides(owner.getWindowInfo()), LocalPointerIconService.provides(owner.getPointerIconService()), LocalGraphicsContext.provides(owner.getGraphicsContext()), androidx.compose.runtime.retain.LocalRetainedValuesStoreKt.getLocalRetainedValuesStore().provides(owner.getRetainedValuesStore())}, function2, startRestartGroup, ((i2 >> 3) & 112) | androidx.compose.runtime.ProvidedValue.$stable);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$ProvideCommonCompositionLocals$1
                private void getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.Composer composer2) {
                    androidx.compose.ui.platform.CompositionLocalsKt.ProvideCommonCompositionLocals(androidx.compose.ui.node.Owner.this, uriHandler, function2, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    getHighSpeedVideoFpsRangesFor(composer2);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Void getHighSpeedVideoFpsRanges(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CompositionLocal ");
        sb.append(str);
        sb.append(" not present");
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }
}
