package androidx.compose.ui.tooling.data;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/ui/tooling/data/CallGroup;", "Landroidx/compose/ui/tooling/data/Group;", "", "key", "", "name", "Landroidx/compose/ui/unit/IntRect;", "box", "Landroidx/compose/ui/tooling/data/SourceLocation;", "location", "identity", "", "Landroidx/compose/ui/tooling/data/ParameterInformation;", "parameters", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "children", "", "isInline", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/tooling/data/SourceLocation;Ljava/lang/Object;Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;Z)V", "Ljava/util/List;", "getParameters", "()Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CallGroup extends androidx.compose.ui.tooling.data.Group {
    public static final int $stable = 8;
    private final java.util.List<androidx.compose.ui.tooling.data.ParameterInformation> parameters;

    public CallGroup(java.lang.Object obj, java.lang.String str, androidx.compose.ui.unit.IntRect intRect, androidx.compose.ui.tooling.data.SourceLocation sourceLocation, java.lang.Object obj2, java.util.List<androidx.compose.ui.tooling.data.ParameterInformation> list, java.util.Collection<? extends java.lang.Object> collection, java.util.Collection<? extends androidx.compose.ui.tooling.data.Group> collection2, boolean z) {
        super(obj, str, sourceLocation, obj2, intRect, collection, collection2, z, null);
        this.parameters = list;
    }

    @Override // androidx.compose.ui.tooling.data.Group
    public final java.util.List<androidx.compose.ui.tooling.data.ParameterInformation> getParameters() {
        return this.parameters;
    }
}
