package androidx.compose.ui.tooling.data;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/tooling/data/SourceContext;", "", "", "getName", "()Ljava/lang/String;", "name", "Landroidx/compose/ui/unit/IntRect;", "getBounds", "()Landroidx/compose/ui/unit/IntRect;", "bounds", "Landroidx/compose/ui/tooling/data/SourceLocation;", "getLocation", "()Landroidx/compose/ui/tooling/data/SourceLocation;", "location", "", "Landroidx/compose/ui/tooling/data/ParameterInformation;", "getParameters", "()Ljava/util/List;", "parameters", "", "getDepth", "()I", "depth", "", "isInline", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SourceContext {
    androidx.compose.ui.unit.IntRect getBounds();

    int getDepth();

    androidx.compose.ui.tooling.data.SourceLocation getLocation();

    java.lang.String getName();

    java.util.List<androidx.compose.ui.tooling.data.ParameterInformation> getParameters();

    default boolean isInline() {
        return false;
    }
}
