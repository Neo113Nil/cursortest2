package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes7.dex */
class DimensionDependency extends androidx.constraintlayout.core.widgets.analyzer.DependencyNode {
    public int getInputSizeshNQ4ISI;

    DimensionDependency(androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun) {
            this.getOutputFormats = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.getOutputFormats = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
    public void resolve(int i) {
        if (this.resolved) {
            return;
        }
        this.resolved = true;
        this.value = i;
        for (androidx.constraintlayout.core.widgets.analyzer.Dependency dependency : this.getHighSpeedVideoSizes) {
            dependency.update(dependency);
        }
    }
}
