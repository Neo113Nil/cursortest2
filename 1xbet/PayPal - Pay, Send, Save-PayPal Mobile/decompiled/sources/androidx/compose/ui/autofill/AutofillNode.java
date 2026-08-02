package androidx.compose.ui.autofill;

@kotlin.Deprecated(message = "\n        Use the new semantics-based Autofill APIs androidx.compose.ui.autofill.ContentType and\n        androidx.compose.ui.autofill.ContentDataType instead.\n        ")
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B9\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0013"}, d2 = {"Landroidx/compose/ui/autofill/AutofillNode;", "", "", "Landroidx/compose/ui/autofill/AutofillType;", "autofillTypes", "Landroidx/compose/ui/geometry/Rect;", "boundingBox", "Lkotlin/Function1;", "", "", "onFill", "<init>", "(Ljava/util/List;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/List;", "getAutofillTypes", "()Ljava/util/List;", "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "()Landroidx/compose/ui/geometry/Rect;", "setBoundingBox", "(Landroidx/compose/ui/geometry/Rect;)V", "Lkotlin/jvm/functions/Function1;", "getOnFill", "()Lkotlin/jvm/functions/Function1;", "id", com.visa.cbp.getEncExpo.warmup, "getId", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AutofillNode {
    public static final int $stable;
    private static int Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.autofill.AutofillNode.Companion INSTANCE;
    private static final java.lang.Object getHighSpeedVideoSizes;
    private final java.util.List<androidx.compose.ui.autofill.AutofillType> autofillTypes;
    private androidx.compose.ui.geometry.Rect boundingBox;
    private final int id;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onFill;

    /* JADX WARN: Multi-variable type inference failed */
    public AutofillNode(java.util.List<? extends androidx.compose.ui.autofill.AutofillType> list, androidx.compose.ui.geometry.Rect rect, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1) {
        this.autofillTypes = list;
        this.boundingBox = rect;
        this.onFill = function1;
        this.id = androidx.compose.ui.ComposeUiFlags.isSemanticAutofillEnabled ? androidx.compose.ui.semantics.SemanticsModifierKt.generateSemanticsId() : androidx.compose.ui.autofill.AutofillNode.Companion.access$generateId(INSTANCE);
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

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0018\u0010\u000b\u001a\u00060\u0001j\u0002`\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/autofill/AutofillNode$Companion;", "", "<init>", "()V", "", "Camera2StreamConfigurationMap", "()I", com.visa.cbp.getEncExpo.warmup, "Landroidx/compose/ui/platform/SynchronizedObject;", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ int access$generateId(androidx.compose.ui.autofill.AutofillNode.Companion companion) {
            return Camera2StreamConfigurationMap();
        }

        private static int Camera2StreamConfigurationMap() {
            int i;
            synchronized (androidx.compose.ui.autofill.AutofillNode.getHighSpeedVideoSizes) {
                androidx.compose.ui.autofill.AutofillNode.Companion companion = androidx.compose.ui.autofill.AutofillNode.INSTANCE;
                androidx.compose.ui.autofill.AutofillNode.Camera2StreamConfigurationMap++;
                i = androidx.compose.ui.autofill.AutofillNode.Camera2StreamConfigurationMap;
            }
            return i;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        androidx.compose.ui.autofill.AutofillNode.Companion companion = new androidx.compose.ui.autofill.AutofillNode.Companion(null);
        INSTANCE = companion;
        $stable = 8;
        getHighSpeedVideoSizes = companion;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.autofill.AutofillNode)) {
            return false;
        }
        androidx.compose.ui.autofill.AutofillNode autofillNode = (androidx.compose.ui.autofill.AutofillNode) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.autofillTypes, autofillNode.autofillTypes) && kotlin.jvm.internal.Intrinsics.areEqual(this.boundingBox, autofillNode.boundingBox) && this.onFill == autofillNode.onFill;
    }

    public final int hashCode() {
        int hashCode = this.autofillTypes.hashCode();
        androidx.compose.ui.geometry.Rect rect = this.boundingBox;
        int hashCode2 = rect != null ? rect.hashCode() : 0;
        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.onFill;
        return (((hashCode * 31) + hashCode2) * 31) + (function1 != null ? function1.hashCode() : 0);
    }
}
