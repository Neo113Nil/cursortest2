package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 12\u00020\u0001:\u00011BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010BG\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0011B;\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0012JU\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014JM\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b(\u0010%R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b)\u0010\u001fR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b*\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100"}, d2 = {"Landroidx/compose/ui/text/input/ImeOptions;", "", "", "singleLine", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "capitalization", "autoCorrect", "Landroidx/compose/ui/text/input/KeyboardType;", "keyboardType", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "Landroidx/compose/ui/text/input/PlatformImeOptions;", "platformImeOptions", "Landroidx/compose/ui/text/intl/LocaleList;", "hintLocales", "<init>", "(ZIZIILandroidx/compose/ui/text/input/PlatformImeOptions;Landroidx/compose/ui/text/intl/LocaleList;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ZIZIILandroidx/compose/ui/text/input/PlatformImeOptions;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ZIZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-wBHncE4", "(ZIZIILandroidx/compose/ui/text/input/PlatformImeOptions;Landroidx/compose/ui/text/intl/LocaleList;)Landroidx/compose/ui/text/input/ImeOptions;", "copy", "copy-YTHSh70", "(ZIZIILandroidx/compose/ui/text/input/PlatformImeOptions;)Landroidx/compose/ui/text/input/ImeOptions;", "copy-uxg59PA", "(ZIZII)Landroidx/compose/ui/text/input/ImeOptions;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getSingleLine", "()Z", com.visa.cbp.getEncExpo.warmup, "getCapitalization-IUNYP9k", "getAutoCorrect", "getKeyboardType-PjHm6EE", "getImeAction-eUduSuo", "Landroidx/compose/ui/text/input/PlatformImeOptions;", "getPlatformImeOptions", "()Landroidx/compose/ui/text/input/PlatformImeOptions;", "Landroidx/compose/ui/text/intl/LocaleList;", "getHintLocales", "()Landroidx/compose/ui/text/intl/LocaleList;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImeOptions {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.input.ImeOptions.Companion INSTANCE = new androidx.compose.ui.text.input.ImeOptions.Companion(null);
    private static final androidx.compose.ui.text.input.ImeOptions Default = new androidx.compose.ui.text.input.ImeOptions(false, 0, false, 0, 0, null, null, 127, null);
    private final boolean autoCorrect;
    private final int capitalization;
    private final androidx.compose.ui.text.intl.LocaleList hintLocales;
    private final int imeAction;
    private final int keyboardType;
    private final androidx.compose.ui.text.input.PlatformImeOptions platformImeOptions;
    private final boolean singleLine;

    private ImeOptions(boolean z, int i, boolean z2, int i2, int i3, androidx.compose.ui.text.input.PlatformImeOptions platformImeOptions, androidx.compose.ui.text.intl.LocaleList localeList) {
        this.singleLine = z;
        this.capitalization = i;
        this.autoCorrect = z2;
        this.keyboardType = i2;
        this.imeAction = i3;
        this.platformImeOptions = platformImeOptions;
        this.hintLocales = localeList;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, androidx.compose.ui.text.input.PlatformImeOptions platformImeOptions, androidx.compose.ui.text.intl.LocaleList localeList, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? androidx.compose.ui.text.input.KeyboardCapitalization.INSTANCE.m8245getNoneIUNYP9k() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8272getTextPjHm6EE() : i2, (i4 & 16) != 0 ? androidx.compose.ui.text.input.ImeAction.INSTANCE.m8213getDefaulteUduSuo() : i3, (i4 & 32) != 0 ? null : platformImeOptions, (i4 & 64) != 0 ? androidx.compose.ui.text.intl.LocaleList.INSTANCE.getEmpty() : localeList, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: getCapitalization-IUNYP9k, reason: not valid java name and from getter */
    public final int getCapitalization() {
        return this.capitalization;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* renamed from: getKeyboardType-PjHm6EE, reason: not valid java name and from getter */
    public final int getKeyboardType() {
        return this.keyboardType;
    }

    /* renamed from: getImeAction-eUduSuo, reason: not valid java name and from getter */
    public final int getImeAction() {
        return this.imeAction;
    }

    public final androidx.compose.ui.text.input.PlatformImeOptions getPlatformImeOptions() {
        return this.platformImeOptions;
    }

    public final androidx.compose.ui.text.intl.LocaleList getHintLocales() {
        return this.hintLocales;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/text/input/ImeOptions$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/ImeOptions;", "Default", "Landroidx/compose/ui/text/input/ImeOptions;", "getDefault", "()Landroidx/compose/ui/text/input/ImeOptions;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.ui.text.input.ImeOptions getDefault() {
            return androidx.compose.ui.text.input.ImeOptions.Default;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, androidx.compose.ui.text.input.PlatformImeOptions platformImeOptions, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? androidx.compose.ui.text.input.KeyboardCapitalization.INSTANCE.m8245getNoneIUNYP9k() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8272getTextPjHm6EE() : i2, (i4 & 16) != 0 ? androidx.compose.ui.text.input.ImeAction.INSTANCE.m8213getDefaulteUduSuo() : i3, (i4 & 32) != 0 ? null : platformImeOptions, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private ImeOptions(boolean z, int i, boolean z2, int i2, int i3, androidx.compose.ui.text.input.PlatformImeOptions platformImeOptions) {
        this(z, i, z2, i2, i3, platformImeOptions, androidx.compose.ui.text.intl.LocaleList.INSTANCE.getEmpty(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? androidx.compose.ui.text.input.KeyboardCapitalization.INSTANCE.m8245getNoneIUNYP9k() : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8272getTextPjHm6EE() : i2, (i4 & 16) != 0 ? androidx.compose.ui.text.input.ImeAction.INSTANCE.m8213getDefaulteUduSuo() : i3, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    private ImeOptions(boolean z, int i, boolean z2, int i2, int i3) {
        this(z, i, z2, i2, i3, null, null, 64, null);
    }

    /* renamed from: copy-wBHncE4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.input.ImeOptions m8224copywBHncE4$default(androidx.compose.ui.text.input.ImeOptions imeOptions, boolean z, int i, boolean z2, int i2, int i3, androidx.compose.ui.text.input.PlatformImeOptions platformImeOptions, androidx.compose.ui.text.intl.LocaleList localeList, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            z = imeOptions.singleLine;
        }
        if ((i4 & 2) != 0) {
            i = imeOptions.capitalization;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            z2 = imeOptions.autoCorrect;
        }
        boolean z3 = z2;
        if ((i4 & 8) != 0) {
            i2 = imeOptions.keyboardType;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = imeOptions.imeAction;
        }
        int i7 = i3;
        if ((i4 & 32) != 0) {
            platformImeOptions = imeOptions.platformImeOptions;
        }
        androidx.compose.ui.text.input.PlatformImeOptions platformImeOptions2 = platformImeOptions;
        if ((i4 & 64) != 0) {
            localeList = imeOptions.hintLocales;
        }
        return imeOptions.m8227copywBHncE4(z, i5, z3, i6, i7, platformImeOptions2, localeList);
    }

    /* renamed from: copy-wBHncE4, reason: not valid java name */
    public final androidx.compose.ui.text.input.ImeOptions m8227copywBHncE4(boolean singleLine, int capitalization, boolean autoCorrect, int keyboardType, int imeAction, androidx.compose.ui.text.input.PlatformImeOptions platformImeOptions, androidx.compose.ui.text.intl.LocaleList hintLocales) {
        return new androidx.compose.ui.text.input.ImeOptions(singleLine, capitalization, autoCorrect, keyboardType, imeAction, platformImeOptions, hintLocales, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: copy-YTHSh70$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.input.ImeOptions m8222copyYTHSh70$default(androidx.compose.ui.text.input.ImeOptions imeOptions, boolean z, int i, boolean z2, int i2, int i3, androidx.compose.ui.text.input.PlatformImeOptions platformImeOptions, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            z = imeOptions.singleLine;
        }
        if ((i4 & 2) != 0) {
            i = imeOptions.capitalization;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            z2 = imeOptions.autoCorrect;
        }
        boolean z3 = z2;
        if ((i4 & 8) != 0) {
            i2 = imeOptions.keyboardType;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = imeOptions.imeAction;
        }
        int i7 = i3;
        if ((i4 & 32) != 0) {
            platformImeOptions = imeOptions.platformImeOptions;
        }
        return imeOptions.m8225copyYTHSh70(z, i5, z3, i6, i7, platformImeOptions);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Please use the new copy function that takes optional hintLocales parameter.")
    /* renamed from: copy-YTHSh70, reason: not valid java name */
    public final /* synthetic */ androidx.compose.ui.text.input.ImeOptions m8225copyYTHSh70(boolean singleLine, int capitalization, boolean autoCorrect, int keyboardType, int imeAction, androidx.compose.ui.text.input.PlatformImeOptions platformImeOptions) {
        return new androidx.compose.ui.text.input.ImeOptions(singleLine, capitalization, autoCorrect, keyboardType, imeAction, platformImeOptions, this.hintLocales, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: copy-uxg59PA$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.input.ImeOptions m8223copyuxg59PA$default(androidx.compose.ui.text.input.ImeOptions imeOptions, boolean z, int i, boolean z2, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            z = imeOptions.singleLine;
        }
        if ((i4 & 2) != 0) {
            i = imeOptions.capitalization;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            z2 = imeOptions.autoCorrect;
        }
        boolean z3 = z2;
        if ((i4 & 8) != 0) {
            i2 = imeOptions.keyboardType;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = imeOptions.imeAction;
        }
        return imeOptions.m8226copyuxg59PA(z, i5, z3, i6, i3);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Please use the new copy function that takes optional platformImeOptions parameter.")
    /* renamed from: copy-uxg59PA, reason: not valid java name */
    public final /* synthetic */ androidx.compose.ui.text.input.ImeOptions m8226copyuxg59PA(boolean singleLine, int capitalization, boolean autoCorrect, int keyboardType, int imeAction) {
        return new androidx.compose.ui.text.input.ImeOptions(singleLine, capitalization, autoCorrect, keyboardType, imeAction, this.platformImeOptions, this.hintLocales, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.input.ImeOptions)) {
            return false;
        }
        androidx.compose.ui.text.input.ImeOptions imeOptions = (androidx.compose.ui.text.input.ImeOptions) other;
        return this.singleLine == imeOptions.singleLine && androidx.compose.ui.text.input.KeyboardCapitalization.m8235equalsimpl0(this.capitalization, imeOptions.capitalization) && this.autoCorrect == imeOptions.autoCorrect && androidx.compose.ui.text.input.KeyboardType.m8251equalsimpl0(this.keyboardType, imeOptions.keyboardType) && androidx.compose.ui.text.input.ImeAction.m8200equalsimpl0(this.imeAction, imeOptions.imeAction) && kotlin.jvm.internal.Intrinsics.areEqual(this.platformImeOptions, imeOptions.platformImeOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.hintLocales, imeOptions.hintLocales);
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.singleLine);
        int m8236hashCodeimpl = androidx.compose.ui.text.input.KeyboardCapitalization.m8236hashCodeimpl(this.capitalization);
        int hashCode2 = java.lang.Boolean.hashCode(this.autoCorrect);
        int m8252hashCodeimpl = androidx.compose.ui.text.input.KeyboardType.m8252hashCodeimpl(this.keyboardType);
        int m8201hashCodeimpl = androidx.compose.ui.text.input.ImeAction.m8201hashCodeimpl(this.imeAction);
        androidx.compose.ui.text.input.PlatformImeOptions platformImeOptions = this.platformImeOptions;
        return (((((((((((hashCode * 31) + m8236hashCodeimpl) * 31) + hashCode2) * 31) + m8252hashCodeimpl) * 31) + m8201hashCodeimpl) * 31) + (platformImeOptions != null ? platformImeOptions.hashCode() : 0)) * 31) + this.hintLocales.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImeOptions(singleLine=");
        sb.append(this.singleLine);
        sb.append(", capitalization=");
        sb.append((java.lang.Object) androidx.compose.ui.text.input.KeyboardCapitalization.m8237toStringimpl(this.capitalization));
        sb.append(", autoCorrect=");
        sb.append(this.autoCorrect);
        sb.append(", keyboardType=");
        sb.append((java.lang.Object) androidx.compose.ui.text.input.KeyboardType.m8253toStringimpl(this.keyboardType));
        sb.append(", imeAction=");
        sb.append((java.lang.Object) androidx.compose.ui.text.input.ImeAction.m8202toStringimpl(this.imeAction));
        sb.append(", platformImeOptions=");
        sb.append(this.platformImeOptions);
        sb.append(", hintLocales=");
        sb.append(this.hintLocales);
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Please use the new constructor that takes optional platformImeOptions parameter.")
    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, z2, i2, i3);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Please use the new constructor that takes optional hintLocales parameter.")
    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, androidx.compose.ui.text.input.PlatformImeOptions platformImeOptions, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, z2, i2, i3, platformImeOptions);
    }

    public /* synthetic */ ImeOptions(boolean z, int i, boolean z2, int i2, int i3, androidx.compose.ui.text.input.PlatformImeOptions platformImeOptions, androidx.compose.ui.text.intl.LocaleList localeList, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, z2, i2, i3, platformImeOptions, localeList);
    }
}
