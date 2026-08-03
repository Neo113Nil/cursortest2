package androidx.compose.ui.platform;

/* compiled from: CompositionLocals.kt */
@kotlin.Metadata(d1 = {"\u0000¼\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a0\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u0002042\u0011\u0010A\u001a\r\u0012\u0004\u0012\u00020=0B¢\u0006\u0002\bCH\u0001¢\u0006\u0002\u0010D\u001a\u0010\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HH\u0002\"\u0019\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"$\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00018GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0004\"\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\u0004\"\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0004\"\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0004\"\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0004\"\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0004\"\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\b\u001a\u0004\b\u001d\u0010\u0004\"\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0001¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0004\"\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0001¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0004\"\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0001¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0004\"\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0004\"\u0019\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u0001¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0004\"\u0019\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u0001¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0004\"\u0017\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0001¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0004\"\u0017\u00103\u001a\b\u0012\u0004\u0012\u0002040\u0001¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0004\"\u0017\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0001¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0004\"\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u0001¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0004¨\u0006I"}, d2 = {"LocalAccessibilityManager", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/platform/AccessibilityManager;", "getLocalAccessibilityManager", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAutofill", "Landroidx/compose/ui/autofill/Autofill;", "getLocalAutofill$annotations", "()V", "getLocalAutofill", "LocalAutofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "getLocalAutofillTree$annotations", "getLocalAutofillTree", "LocalClipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getLocalClipboardManager", "LocalDensity", "Landroidx/compose/ui/unit/Density;", "getLocalDensity", "LocalFocusManager", "Landroidx/compose/ui/focus/FocusManager;", "getLocalFocusManager", "LocalFontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getLocalFontFamilyResolver", "LocalFontLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getLocalFontLoader$annotations", "getLocalFontLoader", "LocalHapticFeedback", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getLocalHapticFeedback", "LocalInputModeManager", "Landroidx/compose/ui/input/InputModeManager;", "getLocalInputModeManager", "LocalLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLocalLayoutDirection", "LocalPointerIconService", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getLocalPointerIconService", "LocalSoftwareKeyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getLocalSoftwareKeyboardController", "LocalTextInputService", "Landroidx/compose/ui/text/input/TextInputService;", "getLocalTextInputService", "LocalTextToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getLocalTextToolbar", "LocalUriHandler", "Landroidx/compose/ui/platform/UriHandler;", "getLocalUriHandler", "LocalViewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getLocalViewConfiguration", "LocalWindowInfo", "Landroidx/compose/ui/platform/WindowInfo;", "getLocalWindowInfo", "ProvideCommonCompositionLocals", "", "owner", "Landroidx/compose/ui/node/Owner;", "uriHandler", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/node/Owner;Landroidx/compose/ui/platform/UriHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "noLocalProvidedFor", "", "name", "", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CompositionLocalsKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.AccessibilityManager> LocalAccessibilityManager = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.platform.AccessibilityManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAccessibilityManager$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.platform.AccessibilityManager invoke() {
            return null;
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.autofill.Autofill> LocalAutofill = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.autofill.Autofill>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofill$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.autofill.Autofill invoke() {
            return null;
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.autofill.AutofillTree> LocalAutofillTree = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.autofill.AutofillTree>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofillTree$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.autofill.AutofillTree invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.noLocalProvidedFor("LocalAutofillTree");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ClipboardManager> LocalClipboardManager = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.platform.ClipboardManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboardManager$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.platform.ClipboardManager invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.noLocalProvidedFor("LocalClipboardManager");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> LocalDensity = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.unit.Density>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalDensity$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.unit.Density invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.noLocalProvidedFor("LocalDensity");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.focus.FocusManager> LocalFocusManager = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.focus.FocusManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFocusManager$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.focus.FocusManager invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.noLocalProvidedFor("LocalFocusManager");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.font.Font.ResourceLoader> LocalFontLoader = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.text.font.Font.ResourceLoader>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontLoader$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.text.font.Font.ResourceLoader invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.noLocalProvidedFor("LocalFontLoader");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.font.FontFamily.Resolver> LocalFontFamilyResolver = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.text.font.FontFamily.Resolver>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontFamilyResolver$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.text.font.FontFamily.Resolver invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.noLocalProvidedFor("LocalFontFamilyResolver");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.hapticfeedback.HapticFeedback> LocalHapticFeedback = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.hapticfeedback.HapticFeedback>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalHapticFeedback$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.hapticfeedback.HapticFeedback invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.noLocalProvidedFor("LocalHapticFeedback");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.input.InputModeManager> LocalInputModeManager = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.input.InputModeManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalInputModeManager$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.input.InputModeManager invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.noLocalProvidedFor("LocalInputManager");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> LocalLayoutDirection = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.unit.LayoutDirection>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalLayoutDirection$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.unit.LayoutDirection invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.noLocalProvidedFor("LocalLayoutDirection");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.text.input.TextInputService> LocalTextInputService = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.text.input.TextInputService>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextInputService$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.text.input.TextInputService invoke() {
            return null;
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.SoftwareKeyboardController> LocalSoftwareKeyboardController = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.platform.SoftwareKeyboardController>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalSoftwareKeyboardController$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.platform.SoftwareKeyboardController invoke() {
            return null;
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.TextToolbar> LocalTextToolbar = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.platform.TextToolbar>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextToolbar$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.platform.TextToolbar invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.noLocalProvidedFor("LocalTextToolbar");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.UriHandler> LocalUriHandler = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.platform.UriHandler>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalUriHandler$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.platform.UriHandler invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.noLocalProvidedFor("LocalUriHandler");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> LocalViewConfiguration = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.platform.ViewConfiguration>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalViewConfiguration$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.platform.ViewConfiguration invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.noLocalProvidedFor("LocalViewConfiguration");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.WindowInfo> LocalWindowInfo = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.platform.WindowInfo>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalWindowInfo$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.platform.WindowInfo invoke() {
            androidx.compose.ui.platform.CompositionLocalsKt.noLocalProvidedFor("LocalWindowInfo");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.input.pointer.PointerIconService> LocalPointerIconService = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.input.pointer.PointerIconService>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalPointerIconService$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.input.pointer.PointerIconService invoke() {
            return null;
        }
    });

    public static /* synthetic */ void getLocalAutofill$annotations() {
    }

    public static /* synthetic */ void getLocalAutofillTree$annotations() {
    }

    @kotlin.Deprecated(message = "LocalFontLoader is replaced with LocalFontFamilyResolver", replaceWith = @kotlin.ReplaceWith(expression = "LocalFontFamilyResolver", imports = {}))
    public static /* synthetic */ void getLocalFontLoader$annotations() {
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

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ClipboardManager> getLocalClipboardManager() {
        return LocalClipboardManager;
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

    public static final void ProvideCommonCompositionLocals(final androidx.compose.ui.node.Owner owner, final androidx.compose.ui.platform.UriHandler uriHandler, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(874662829);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(ProvideCommonCompositionLocals)P(1,2)185@6194L1195:CompositionLocals.kt#itgzvw");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(owner) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(uriHandler) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(874662829, i2, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:184)");
            }
            function22 = function2;
            composer2 = startRestartGroup;
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{LocalAccessibilityManager.provides(owner.getAccessibilityManager()), LocalAutofill.provides(owner.getAutofill()), LocalAutofillTree.provides(owner.getAutofillTree()), LocalClipboardManager.provides(owner.getClipboardManager()), LocalDensity.provides(owner.getDensity()), LocalFocusManager.provides(owner.getFocusOwner()), LocalFontLoader.providesDefault(owner.getFontLoader()), LocalFontFamilyResolver.providesDefault(owner.getFontFamilyResolver()), LocalHapticFeedback.provides(owner.getHapticFeedBack()), LocalInputModeManager.provides(owner.getInputModeManager()), LocalLayoutDirection.provides(owner.getLayoutDirection()), LocalTextInputService.provides(owner.getTextInputService()), LocalSoftwareKeyboardController.provides(owner.getSoftwareKeyboardController()), LocalTextToolbar.provides(owner.getTextToolbar()), LocalUriHandler.provides(uriHandler), LocalViewConfiguration.provides(owner.getViewConfiguration()), LocalWindowInfo.provides(owner.getWindowInfo()), LocalPointerIconService.provides(owner.getPointerIconService())}, function22, composer2, ((i2 >> 3) & 112) | 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            function22 = function2;
            composer2 = startRestartGroup;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$ProvideCommonCompositionLocals$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    invoke(composer3, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer3, int i3) {
                    androidx.compose.ui.platform.CompositionLocalsKt.ProvideCommonCompositionLocals(androidx.compose.ui.node.Owner.this, uriHandler, function22, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Void noLocalProvidedFor(java.lang.String str) {
        throw new java.lang.IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
