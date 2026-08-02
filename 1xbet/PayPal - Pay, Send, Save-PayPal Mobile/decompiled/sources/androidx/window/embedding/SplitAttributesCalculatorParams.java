package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\n8GX\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u000b\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\u0011"}, d2 = {"Landroidx/window/embedding/SplitAttributesCalculatorParams;", "", "Landroidx/window/layout/WindowMetrics;", "parentWindowMetrics", "Landroid/content/res/Configuration;", "parentConfiguration", "Landroidx/window/layout/WindowLayoutInfo;", "parentWindowLayoutInfo", "Landroidx/window/embedding/SplitAttributes;", "defaultSplitAttributes", "", "areDefaultConstraintsSatisfied", "", "splitRuleTag", "<init>", "(Landroidx/window/layout/WindowMetrics;Landroid/content/res/Configuration;Landroidx/window/layout/WindowLayoutInfo;Landroidx/window/embedding/SplitAttributes;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Landroidx/window/layout/WindowMetrics;", "getParentWindowMetrics", "()Landroidx/window/layout/WindowMetrics;", "Landroid/content/res/Configuration;", "getParentConfiguration", "()Landroid/content/res/Configuration;", "Landroidx/window/layout/WindowLayoutInfo;", "getParentWindowLayoutInfo", "()Landroidx/window/layout/WindowLayoutInfo;", "Landroidx/window/embedding/SplitAttributes;", "getDefaultSplitAttributes", "()Landroidx/window/embedding/SplitAttributes;", "Z", "()Z", "Ljava/lang/String;", "getSplitRuleTag"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SplitAttributesCalculatorParams {
    private final boolean areDefaultConstraintsSatisfied;
    private final androidx.window.embedding.SplitAttributes defaultSplitAttributes;
    private final android.content.res.Configuration parentConfiguration;
    private final androidx.window.layout.WindowLayoutInfo parentWindowLayoutInfo;
    private final androidx.window.layout.WindowMetrics parentWindowMetrics;
    private final java.lang.String splitRuleTag;

    public SplitAttributesCalculatorParams(androidx.window.layout.WindowMetrics windowMetrics, android.content.res.Configuration configuration, androidx.window.layout.WindowLayoutInfo windowLayoutInfo, androidx.window.embedding.SplitAttributes splitAttributes, boolean z, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowMetrics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowLayoutInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitAttributes, "");
        this.parentWindowMetrics = windowMetrics;
        this.parentConfiguration = configuration;
        this.parentWindowLayoutInfo = windowLayoutInfo;
        this.defaultSplitAttributes = splitAttributes;
        this.areDefaultConstraintsSatisfied = z;
        this.splitRuleTag = str;
    }

    public final androidx.window.layout.WindowMetrics getParentWindowMetrics() {
        return this.parentWindowMetrics;
    }

    public final android.content.res.Configuration getParentConfiguration() {
        return this.parentConfiguration;
    }

    public final androidx.window.layout.WindowLayoutInfo getParentWindowLayoutInfo() {
        return this.parentWindowLayoutInfo;
    }

    public final androidx.window.embedding.SplitAttributes getDefaultSplitAttributes() {
        return this.defaultSplitAttributes;
    }

    /* renamed from: areDefaultConstraintsSatisfied, reason: from getter */
    public final boolean getAreDefaultConstraintsSatisfied() {
        return this.areDefaultConstraintsSatisfied;
    }

    public final java.lang.String getSplitRuleTag() {
        return this.splitRuleTag;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SplitAttributesCalculatorParams:{windowMetrics=");
        sb.append(this.parentWindowMetrics);
        sb.append(", configuration=");
        sb.append(this.parentConfiguration);
        sb.append(", windowLayoutInfo=");
        sb.append(this.parentWindowLayoutInfo);
        sb.append(", defaultSplitAttributes=");
        sb.append(this.defaultSplitAttributes);
        sb.append(", areDefaultConstraintsSatisfied=");
        sb.append(this.areDefaultConstraintsSatisfied);
        sb.append(", tag=");
        sb.append(this.splitRuleTag);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
