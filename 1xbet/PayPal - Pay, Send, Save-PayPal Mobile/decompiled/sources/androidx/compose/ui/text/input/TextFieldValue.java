package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u0000 #2\u00020\u0001:\u0001#B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB)\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\u000bJ-\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Landroidx/compose/ui/text/TextRange;", "selection", "composition", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "text", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-3r_uNRQ", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "copy", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/AnnotatedString;", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "getText", "J", "getSelection-d9O1mEE", "()J", "Landroidx/compose/ui/text/TextRange;", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldValue {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.input.TextFieldValue.Companion INSTANCE = new androidx.compose.ui.text.input.TextFieldValue.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.ui.text.input.TextFieldValue, java.lang.Object> Saver = androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.ui.text.input.TextFieldValue$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            java.lang.Object highSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRangesFor = androidx.compose.ui.text.input.TextFieldValue.getHighSpeedVideoFpsRangesFor((androidx.compose.runtime.saveable.SaverScope) obj, (androidx.compose.ui.text.input.TextFieldValue) obj2);
            return highSpeedVideoFpsRangesFor;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.text.input.TextFieldValue$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.ui.text.input.TextFieldValue highSpeedVideoSizes;
            highSpeedVideoSizes = androidx.compose.ui.text.input.TextFieldValue.getHighSpeedVideoSizes(obj);
            return highSpeedVideoSizes;
        }
    });
    private final androidx.compose.ui.text.AnnotatedString annotatedString;
    private final androidx.compose.ui.text.TextRange composition;
    private final long selection;

    private TextFieldValue(androidx.compose.ui.text.AnnotatedString annotatedString, long j, androidx.compose.ui.text.TextRange textRange) {
        this.annotatedString = annotatedString;
        this.selection = androidx.compose.ui.text.TextRangeKt.m8045coerceIn8ffj60Q(j, 0, getText().length());
        this.composition = textRange != null ? androidx.compose.ui.text.TextRange.m8027boximpl(androidx.compose.ui.text.TextRangeKt.m8045coerceIn8ffj60Q(textRange.getGetHighResolutionOutputSizeshNQ4ISI(), 0, getText().length())) : null;
    }

    public final androidx.compose.ui.text.AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public /* synthetic */ TextFieldValue(androidx.compose.ui.text.AnnotatedString annotatedString, long j, androidx.compose.ui.text.TextRange textRange, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, (i & 2) != 0 ? androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE() : j, (i & 4) != 0 ? null : textRange, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public /* synthetic */ TextFieldValue(java.lang.String str, long j, androidx.compose.ui.text.TextRange textRange, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE() : j, (i & 4) != 0 ? null : textRange, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldValue(java.lang.String str, long j, androidx.compose.ui.text.TextRange textRange) {
        this(new androidx.compose.ui.text.AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j, textRange, (kotlin.jvm.internal.DefaultConstructorMarker) null);
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
    public static /* synthetic */ androidx.compose.ui.text.input.TextFieldValue m8275copy3r_uNRQ$default(androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.AnnotatedString annotatedString, long j, androidx.compose.ui.text.TextRange textRange, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            annotatedString = textFieldValue.annotatedString;
        }
        if ((i & 2) != 0) {
            j = textFieldValue.selection;
        }
        if ((i & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m8277copy3r_uNRQ(annotatedString, j, textRange);
    }

    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final androidx.compose.ui.text.input.TextFieldValue m8277copy3r_uNRQ(androidx.compose.ui.text.AnnotatedString annotatedString, long selection, androidx.compose.ui.text.TextRange composition) {
        return new androidx.compose.ui.text.input.TextFieldValue(annotatedString, selection, composition, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.text.input.TextFieldValue m8276copy3r_uNRQ$default(androidx.compose.ui.text.input.TextFieldValue textFieldValue, java.lang.String str, long j, androidx.compose.ui.text.TextRange textRange, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = textFieldValue.selection;
        }
        if ((i & 4) != 0) {
            textRange = textFieldValue.composition;
        }
        return textFieldValue.m8278copy3r_uNRQ(str, j, textRange);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final androidx.compose.ui.text.input.TextFieldValue m8278copy3r_uNRQ(java.lang.String text, long selection, androidx.compose.ui.text.TextRange composition) {
        return new androidx.compose.ui.text.input.TextFieldValue(new androidx.compose.ui.text.AnnotatedString(text, null, 2, 0 == true ? 1 : 0), selection, composition, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.input.TextFieldValue)) {
            return false;
        }
        androidx.compose.ui.text.input.TextFieldValue textFieldValue = (androidx.compose.ui.text.input.TextFieldValue) other;
        return androidx.compose.ui.text.TextRange.m8032equalsimpl0(this.selection, textFieldValue.selection) && kotlin.jvm.internal.Intrinsics.areEqual(this.composition, textFieldValue.composition) && kotlin.jvm.internal.Intrinsics.areEqual(this.annotatedString, textFieldValue.annotatedString);
    }

    public final int hashCode() {
        int hashCode = this.annotatedString.hashCode();
        int m8040hashCodeimpl = androidx.compose.ui.text.TextRange.m8040hashCodeimpl(this.selection);
        androidx.compose.ui.text.TextRange textRange = this.composition;
        return (((hashCode * 31) + m8040hashCodeimpl) * 31) + (textRange != null ? androidx.compose.ui.text.TextRange.m8040hashCodeimpl(textRange.getGetHighResolutionOutputSizeshNQ4ISI()) : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextFieldValue(text='");
        sb.append((java.lang.Object) this.annotatedString);
        sb.append("', selection=");
        sb.append((java.lang.Object) androidx.compose.ui.text.TextRange.m8042toStringimpl(this.selection));
        sb.append(", composition=");
        sb.append(this.composition);
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/input/TextFieldValue;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.ui.text.input.TextFieldValue, java.lang.Object> getSaver() {
            return androidx.compose.ui.text.input.TextFieldValue.Saver;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.saveable.SaverScope saverScope, androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        return kotlin.collections.CollectionsKt.arrayListOf(androidx.compose.ui.text.SaversKt.save(textFieldValue.annotatedString, androidx.compose.ui.text.SaversKt.getAnnotatedStringSaver(), saverScope), androidx.compose.ui.text.SaversKt.save(androidx.compose.ui.text.TextRange.m8027boximpl(textFieldValue.selection), androidx.compose.ui.text.SaversKt.getSaver(androidx.compose.ui.text.TextRange.INSTANCE), saverScope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.input.TextFieldValue getHighSpeedVideoSizes(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        java.util.List list = (java.util.List) obj;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.lang.Object obj2 = list.get(0);
        androidx.compose.runtime.saveable.Saver<androidx.compose.ui.text.AnnotatedString, java.lang.Object> annotatedStringSaver = androidx.compose.ui.text.SaversKt.getAnnotatedStringSaver();
        androidx.compose.ui.text.TextRange textRange = null;
        androidx.compose.ui.text.AnnotatedString restore = ((!kotlin.jvm.internal.Intrinsics.areEqual(obj2, bool) || (annotatedStringSaver instanceof androidx.compose.ui.text.NonNullValueClassSaver)) && obj2 != null) ? annotatedStringSaver.restore(obj2) : null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(restore);
        java.lang.Object obj3 = list.get(1);
        androidx.compose.runtime.saveable.Saver<androidx.compose.ui.text.TextRange, java.lang.Object> saver = androidx.compose.ui.text.SaversKt.getSaver(androidx.compose.ui.text.TextRange.INSTANCE);
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(obj3, bool) || (saver instanceof androidx.compose.ui.text.NonNullValueClassSaver)) && obj3 != null) {
            textRange = saver.restore(obj3);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(textRange);
        return new androidx.compose.ui.text.input.TextFieldValue(restore, textRange.getGetHighResolutionOutputSizeshNQ4ISI(), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    public /* synthetic */ TextFieldValue(java.lang.String str, long j, androidx.compose.ui.text.TextRange textRange, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, textRange);
    }

    public /* synthetic */ TextFieldValue(androidx.compose.ui.text.AnnotatedString annotatedString, long j, androidx.compose.ui.text.TextRange textRange, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j, textRange);
    }
}
