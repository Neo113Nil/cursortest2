package androidx.compose.foundation.text.input.internal.undo;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0011\u0010'\u001a\u00020$8G¢\u0006\u0006\u001a\u0004\b%\u0010&"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "", "", "index", "", "preText", "postText", "Landroidx/compose/ui/text/TextRange;", "preSelection", "postSelection", "", "timeInMillis", "", "canMerge", "<init>", "(ILjava/lang/String;Ljava/lang/String;JJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", com.visa.cbp.getEncExpo.warmup, "getIndex", "()I", "Ljava/lang/String;", "getPreText", "()Ljava/lang/String;", "getPostText", "J", "getPreSelection-d9O1mEE", "()J", "getPostSelection-d9O1mEE", "getTimeInMillis", "Z", "getCanMerge", "()Z", "Landroidx/compose/foundation/text/input/internal/undo/TextEditType;", "textEditType", "Landroidx/compose/foundation/text/input/internal/undo/TextEditType;", "getTextEditType", "()Landroidx/compose/foundation/text/input/internal/undo/TextEditType;", "Landroidx/compose/foundation/text/input/internal/undo/TextDeleteType;", "getDeletionType", "()Landroidx/compose/foundation/text/input/internal/undo/TextDeleteType;", "deletionType", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextUndoOperation {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.input.internal.undo.TextUndoOperation.Companion INSTANCE = new androidx.compose.foundation.text.input.internal.undo.TextUndoOperation.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.text.input.internal.undo.TextUndoOperation, java.lang.Object> Saver = new androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.text.input.internal.undo.TextUndoOperation, java.lang.Object>() { // from class: androidx.compose.foundation.text.input.internal.undo.TextUndoOperation$Companion$Saver$1
        @Override // androidx.compose.runtime.saveable.Saver
        public final java.lang.Object save(androidx.compose.runtime.saveable.SaverScope saverScope, androidx.compose.foundation.text.input.internal.undo.TextUndoOperation textUndoOperation) {
            int index = textUndoOperation.getIndex();
            return kotlin.collections.CollectionsKt.listOf(java.lang.Integer.valueOf(index), textUndoOperation.getPreText(), textUndoOperation.getPostText(), java.lang.Integer.valueOf(androidx.compose.ui.text.TextRange.m8039getStartimpl(textUndoOperation.getPreSelection())), java.lang.Integer.valueOf(androidx.compose.ui.text.TextRange.m8034getEndimpl(textUndoOperation.getPreSelection())), java.lang.Integer.valueOf(androidx.compose.ui.text.TextRange.m8039getStartimpl(textUndoOperation.getPostSelection())), java.lang.Integer.valueOf(androidx.compose.ui.text.TextRange.m8034getEndimpl(textUndoOperation.getPostSelection())), java.lang.Long.valueOf(textUndoOperation.getTimeInMillis()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.runtime.saveable.Saver
        public final androidx.compose.foundation.text.input.internal.undo.TextUndoOperation restore(java.lang.Object value) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
            java.util.List list = (java.util.List) value;
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            int intValue = ((java.lang.Integer) obj).intValue();
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
            java.lang.String str = (java.lang.String) obj2;
            java.lang.Object obj3 = list.get(2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "");
            java.lang.String str2 = (java.lang.String) obj3;
            java.lang.Object obj4 = list.get(3);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj4, "");
            int intValue2 = ((java.lang.Integer) obj4).intValue();
            java.lang.Object obj5 = list.get(4);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj5, "");
            long TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(intValue2, ((java.lang.Integer) obj5).intValue());
            java.lang.Object obj6 = list.get(5);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj6, "");
            int intValue3 = ((java.lang.Integer) obj6).intValue();
            java.lang.Object obj7 = list.get(6);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj7, "");
            long TextRange2 = androidx.compose.ui.text.TextRangeKt.TextRange(intValue3, ((java.lang.Integer) obj7).intValue());
            java.lang.Object obj8 = list.get(7);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj8, "");
            return new androidx.compose.foundation.text.input.internal.undo.TextUndoOperation(intValue, str, str2, TextRange, TextRange2, ((java.lang.Long) obj8).longValue(), false, 64, null);
        }
    };
    private final boolean canMerge;
    private final int index;
    private final long postSelection;
    private final java.lang.String postText;
    private final long preSelection;
    private final java.lang.String preText;
    private final androidx.compose.foundation.text.input.internal.undo.TextEditType textEditType;
    private final long timeInMillis;

    private TextUndoOperation(int i, java.lang.String str, java.lang.String str2, long j, long j2, long j3, boolean z) {
        androidx.compose.foundation.text.input.internal.undo.TextEditType textEditType;
        this.index = i;
        this.preText = str;
        this.postText = str2;
        this.preSelection = j;
        this.postSelection = j2;
        this.timeInMillis = j3;
        this.canMerge = z;
        java.lang.String str3 = str;
        if (str3.length() == 0 && str2.length() == 0) {
            throw new java.lang.IllegalArgumentException("Either pre or post text must not be empty");
        }
        if (str3.length() != 0 || str2.length() <= 0) {
            textEditType = (str3.length() <= 0 || str2.length() != 0) ? androidx.compose.foundation.text.input.internal.undo.TextEditType.Replace : androidx.compose.foundation.text.input.internal.undo.TextEditType.Delete;
        } else {
            textEditType = androidx.compose.foundation.text.input.internal.undo.TextEditType.Insert;
        }
        this.textEditType = textEditType;
    }

    public final int getIndex() {
        return this.index;
    }

    public final java.lang.String getPreText() {
        return this.preText;
    }

    public final java.lang.String getPostText() {
        return this.postText;
    }

    /* renamed from: getPreSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getPreSelection() {
        return this.preSelection;
    }

    /* renamed from: getPostSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getPostSelection() {
        return this.postSelection;
    }

    public /* synthetic */ TextUndoOperation(int i, java.lang.String str, java.lang.String str2, long j, long j2, long j3, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, j, j2, (i2 & 32) != 0 ? androidx.compose.foundation.text.UndoManager_jvmKt.timeNowMillis() : j3, (i2 & 64) != 0 ? true : z, null);
    }

    public final long getTimeInMillis() {
        return this.timeInMillis;
    }

    public final boolean getCanMerge() {
        return this.canMerge;
    }

    public final androidx.compose.foundation.text.input.internal.undo.TextEditType getTextEditType() {
        return this.textEditType;
    }

    public final androidx.compose.foundation.text.input.internal.undo.TextDeleteType getDeletionType() {
        if (this.textEditType == androidx.compose.foundation.text.input.internal.undo.TextEditType.Delete && androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(this.postSelection)) {
            if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(this.preSelection)) {
                if (androidx.compose.ui.text.TextRange.m8039getStartimpl(this.preSelection) > androidx.compose.ui.text.TextRange.m8039getStartimpl(this.postSelection)) {
                    return androidx.compose.foundation.text.input.internal.undo.TextDeleteType.Start;
                }
                return androidx.compose.foundation.text.input.internal.undo.TextDeleteType.End;
            }
            if (androidx.compose.ui.text.TextRange.m8039getStartimpl(this.preSelection) == androidx.compose.ui.text.TextRange.m8039getStartimpl(this.postSelection) && androidx.compose.ui.text.TextRange.m8039getStartimpl(this.preSelection) == this.index) {
                return androidx.compose.foundation.text.input.internal.undo.TextDeleteType.Inner;
            }
            return androidx.compose.foundation.text.input.internal.undo.TextDeleteType.NotByUser;
        }
        return androidx.compose.foundation.text.input.internal.undo.TextDeleteType.NotByUser;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/input/internal/undo/TextUndoOperation;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.text.input.internal.undo.TextUndoOperation, java.lang.Object> getSaver() {
            return androidx.compose.foundation.text.input.internal.undo.TextUndoOperation.Saver;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TextUndoOperation(int i, java.lang.String str, java.lang.String str2, long j, long j2, long j3, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, j, j2, j3, z);
    }
}
