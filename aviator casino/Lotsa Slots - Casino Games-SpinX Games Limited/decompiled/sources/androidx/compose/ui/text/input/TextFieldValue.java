package androidx.compose.ui.text.input;

/* compiled from: TextFieldValue.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB'\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007B#\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "text", "", "selection", "Landroidx/compose/ui/text/TextRange;", "composition", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "getSelection-d9O1mEE", "()J", "J", "getText", "()Ljava/lang/String;", "copy", "copy-3r_uNRQ", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "equals", "", "other", "hashCode", "", "toString", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldValue {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.input.TextFieldValue.Companion INSTANCE = new androidx.compose.ui.text.input.TextFieldValue.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.ui.text.input.TextFieldValue, java.lang.Object> Saver = androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2<androidx.compose.runtime.saveable.SaverScope, androidx.compose.ui.text.input.TextFieldValue, java.lang.Object>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(androidx.compose.runtime.saveable.SaverScope saverScope, androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
            return kotlin.collections.CollectionsKt.arrayListOf(androidx.compose.ui.text.SaversKt.save(textFieldValue.getAnnotatedString(), androidx.compose.ui.text.SaversKt.getAnnotatedStringSaver(), saverScope), androidx.compose.ui.text.SaversKt.save(androidx.compose.ui.text.TextRange.m3952boximpl(textFieldValue.getSelection()), androidx.compose.ui.text.SaversKt.getSaver(androidx.compose.ui.text.TextRange.INSTANCE), saverScope));
        }
    }, new kotlin.jvm.functions.Function1<java.lang.Object, androidx.compose.ui.text.input.TextFieldValue>() { // from class: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final androidx.compose.ui.text.input.TextFieldValue invoke(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            java.util.List list = (java.util.List) obj;
            java.lang.Object obj2 = list.get(0);
            androidx.compose.runtime.saveable.Saver<androidx.compose.ui.text.AnnotatedString, java.lang.Object> annotatedStringSaver = androidx.compose.ui.text.SaversKt.getAnnotatedStringSaver();
            androidx.compose.ui.text.TextRange textRange = null;
            androidx.compose.ui.text.AnnotatedString restore = ((!kotlin.jvm.internal.Intrinsics.areEqual(obj2, (java.lang.Object) false) || (annotatedStringSaver instanceof androidx.compose.ui.text.NonNullValueClassSaver)) && obj2 != null) ? annotatedStringSaver.restore(obj2) : null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(restore);
            java.lang.Object obj3 = list.get(1);
            androidx.compose.runtime.saveable.Saver<androidx.compose.ui.text.TextRange, java.lang.Object> saver = androidx.compose.ui.text.SaversKt.getSaver(androidx.compose.ui.text.TextRange.INSTANCE);
            if ((!kotlin.jvm.internal.Intrinsics.areEqual(obj3, (java.lang.Object) false) || (saver instanceof androidx.compose.ui.text.NonNullValueClassSaver)) && obj3 != null) {
                textRange = saver.restore(obj3);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(textRange);
            return new androidx.compose.ui.text.input.TextFieldValue(restore, textRange.getPackedValue(), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    });
    private final androidx.compose.ui.text.AnnotatedString annotatedString;
    private final androidx.compose.ui.text.TextRange composition;
    private final long selection;

    public /* synthetic */ TextFieldValue(androidx.compose.ui.text.AnnotatedString annotatedString, long j, androidx.compose.ui.text.TextRange textRange, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j, textRange);
    }

    public /* synthetic */ TextFieldValue(java.lang.String str, long j, androidx.compose.ui.text.TextRange textRange, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, textRange);
    }

    private TextFieldValue(androidx.compose.ui.text.AnnotatedString annotatedString, long j, androidx.compose.ui.text.TextRange textRange) {
        this.annotatedString = annotatedString;
        this.selection = androidx.compose.ui.text.TextRangeKt.m3970coerceIn8ffj60Q(j, 0, getText().length());
        this.composition = textRange != null ? androidx.compose.ui.text.TextRange.m3952boximpl(androidx.compose.ui.text.TextRangeKt.m3970coerceIn8ffj60Q(textRange.getPackedValue(), 0, getText().length())) : null;
    }

    public final androidx.compose.ui.text.AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public /* synthetic */ TextFieldValue(androidx.compose.ui.text.AnnotatedString annotatedString, long j, androidx.compose.ui.text.TextRange textRange, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, (i & 2) != 0 ? androidx.compose.ui.text.TextRange.INSTANCE.m3969getZerod9O1mEE() : j, (i & 4) != 0 ? null : textRange, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public /* synthetic */ TextFieldValue(java.lang.String str, long j, androidx.compose.ui.text.TextRange textRange, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? androidx.compose.ui.text.TextRange.INSTANCE.m3969getZerod9O1mEE() : j, (i & 4) != 0 ? null : textRange, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private TextFieldValue(java.lang.String str, long j, androidx.compose.ui.text.TextRange textRange) {
        this(new androidx.compose.ui.text.AnnotatedString(str, null, null, 6, r5), j, textRange, r5);
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
    }

    public final java.lang.String getText() {
        return this.annotatedString.getText();
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelection() {
        return this.selection;
    }

    /* renamed from: getComposition-MzsxiRA, reason: not valid java name and from getter */
    public final androidx.compose.ui.text.TextRange getComposition() {
        return this.composition;
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.input.TextFieldValue m4200copy3r_uNRQ$default(androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.AnnotatedString annotatedString, long j, androidx.compose.ui.text.TextRange textRange, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            annotatedString = textFieldValue.annotatedString;
        }
        if ((i & 2) != 0) {
            j = textFieldValue.selection;
        }
        if ((i & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m4202copy3r_uNRQ(annotatedString, j, textRange);
    }

    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final androidx.compose.ui.text.input.TextFieldValue m4202copy3r_uNRQ(androidx.compose.ui.text.AnnotatedString annotatedString, long selection, androidx.compose.ui.text.TextRange composition) {
        return new androidx.compose.ui.text.input.TextFieldValue(annotatedString, selection, composition, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.input.TextFieldValue m4201copy3r_uNRQ$default(androidx.compose.ui.text.input.TextFieldValue textFieldValue, java.lang.String str, long j, androidx.compose.ui.text.TextRange textRange, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = textFieldValue.selection;
        }
        if ((i & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m4203copy3r_uNRQ(str, j, textRange);
    }

    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final androidx.compose.ui.text.input.TextFieldValue m4203copy3r_uNRQ(java.lang.String text, long selection, androidx.compose.ui.text.TextRange composition) {
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        return new androidx.compose.ui.text.input.TextFieldValue(new androidx.compose.ui.text.AnnotatedString(text, null, null, 6, defaultConstructorMarker), selection, composition, defaultConstructorMarker);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.input.TextFieldValue)) {
            return false;
        }
        androidx.compose.ui.text.input.TextFieldValue textFieldValue = (androidx.compose.ui.text.input.TextFieldValue) other;
        return androidx.compose.ui.text.TextRange.m3957equalsimpl0(this.selection, textFieldValue.selection) && kotlin.jvm.internal.Intrinsics.areEqual(this.composition, textFieldValue.composition) && kotlin.jvm.internal.Intrinsics.areEqual(this.annotatedString, textFieldValue.annotatedString);
    }

    public int hashCode() {
        int hashCode = ((this.annotatedString.hashCode() * 31) + androidx.compose.ui.text.TextRange.m3965hashCodeimpl(this.selection)) * 31;
        androidx.compose.ui.text.TextRange textRange = this.composition;
        return hashCode + (textRange != null ? androidx.compose.ui.text.TextRange.m3965hashCodeimpl(textRange.getPackedValue()) : 0);
    }

    public java.lang.String toString() {
        return "TextFieldValue(text='" + ((java.lang.Object) this.annotatedString) + "', selection=" + ((java.lang.Object) androidx.compose.ui.text.TextRange.m3967toStringimpl(this.selection)) + ", composition=" + this.composition + ')';
    }

    /* compiled from: TextFieldValue.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.ui.text.input.TextFieldValue, java.lang.Object> getSaver() {
            return androidx.compose.ui.text.input.TextFieldValue.Saver;
        }
    }
}
