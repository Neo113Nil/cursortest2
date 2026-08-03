package androidx.compose.ui.autofill;

/* compiled from: Autofill.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB7\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/autofill/AutofillNode;", "", "autofillTypes", "", "Landroidx/compose/ui/autofill/AutofillType;", "boundingBox", "Landroidx/compose/ui/geometry/Rect;", "onFill", "Lkotlin/Function1;", "", "", "(Ljava/util/List;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)V", "getAutofillTypes", "()Ljava/util/List;", "getBoundingBox", "()Landroidx/compose/ui/geometry/Rect;", "setBoundingBox", "(Landroidx/compose/ui/geometry/Rect;)V", "id", "", "getId", "()I", "getOnFill", "()Lkotlin/jvm/functions/Function1;", "equals", "", "other", "hashCode", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AutofillNode {
    private static int previousId;
    private final java.util.List<androidx.compose.ui.autofill.AutofillType> autofillTypes;
    private androidx.compose.ui.geometry.Rect boundingBox;
    private final int id;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onFill;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.autofill.AutofillNode.Companion INSTANCE = new androidx.compose.ui.autofill.AutofillNode.Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public AutofillNode(java.util.List<? extends androidx.compose.ui.autofill.AutofillType> list, androidx.compose.ui.geometry.Rect rect, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
        this.autofillTypes = list;
        this.boundingBox = rect;
        this.onFill = function1;
        this.id = INSTANCE.generateId();
    }

    public /* synthetic */ AutofillNode(java.util.List list, androidx.compose.ui.geometry.Rect rect, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : rect, function1);
    }

    public final java.util.List<androidx.compose.ui.autofill.AutofillType> getAutofillTypes() {
        return this.autofillTypes;
    }

    public final androidx.compose.ui.geometry.Rect getBoundingBox() {
        return this.boundingBox;
    }

    public final void setBoundingBox(androidx.compose.ui.geometry.Rect rect) {
        this.boundingBox = rect;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnFill() {
        return this.onFill;
    }

    /* compiled from: Autofill.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/autofill/AutofillNode$Companion;", "", "()V", "previousId", "", "generateId", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int generateId() {
            int i;
            synchronized (this) {
                androidx.compose.ui.autofill.AutofillNode.Companion companion = androidx.compose.ui.autofill.AutofillNode.INSTANCE;
                androidx.compose.ui.autofill.AutofillNode.previousId++;
                i = androidx.compose.ui.autofill.AutofillNode.previousId;
            }
            return i;
        }
    }

    public final int getId() {
        return this.id;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.autofill.AutofillNode)) {
            return false;
        }
        androidx.compose.ui.autofill.AutofillNode autofillNode = (androidx.compose.ui.autofill.AutofillNode) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.autofillTypes, autofillNode.autofillTypes) && kotlin.jvm.internal.Intrinsics.areEqual(this.boundingBox, autofillNode.boundingBox) && kotlin.jvm.internal.Intrinsics.areEqual(this.onFill, autofillNode.onFill);
    }

    public int hashCode() {
        int hashCode = this.autofillTypes.hashCode() * 31;
        androidx.compose.ui.geometry.Rect rect = this.boundingBox;
        int hashCode2 = (hashCode + (rect != null ? rect.hashCode() : 0)) * 31;
        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.onFill;
        return hashCode2 + (function1 != null ? function1.hashCode() : 0);
    }
}
