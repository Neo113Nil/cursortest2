package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes7.dex */
public class DependencyNode implements androidx.constraintlayout.core.widgets.analyzer.Dependency {
    int Camera2StreamConfigurationMap;
    androidx.constraintlayout.core.widgets.analyzer.WidgetRun getHighResolutionOutputSizeshNQ4ISI;
    public int value;
    public androidx.constraintlayout.core.widgets.analyzer.Dependency updateDelegate = null;
    public boolean delegateToWidgetRun = false;
    public boolean readyToSolve = false;
    androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type getOutputFormats = androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.UNKNOWN;
    int getHighSpeedVideoFpsRangesFor = 1;
    androidx.constraintlayout.core.widgets.analyzer.DimensionDependency getHighSpeedVideoFpsRanges = null;
    public boolean resolved = false;
    java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> getHighSpeedVideoSizes = new java.util.ArrayList();
    java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> getHighSpeedVideoSizesFor = new java.util.ArrayList();

    enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun) {
        this.getHighResolutionOutputSizeshNQ4ISI = widgetRun;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor.getDebugName());
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(this.getOutputFormats);
        sb.append("(");
        sb.append(this.resolved ? java.lang.Integer.valueOf(this.value) : "unresolved");
        sb.append(") <t=");
        sb.append(this.getHighSpeedVideoSizesFor.size());
        sb.append(":d=");
        sb.append(this.getHighSpeedVideoSizes.size());
        sb.append(">");
        return sb.toString();
    }

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

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency dependency) {
        java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> it = this.getHighSpeedVideoSizesFor.iterator();
        while (it.hasNext()) {
            if (!it.next().resolved) {
                return;
            }
        }
        this.readyToSolve = true;
        androidx.constraintlayout.core.widgets.analyzer.Dependency dependency2 = this.updateDelegate;
        if (dependency2 != null) {
            dependency2.update(this);
        }
        if (this.delegateToWidgetRun) {
            this.getHighResolutionOutputSizeshNQ4ISI.update(this);
            return;
        }
        androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode = null;
        int i = 0;
        for (androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode2 : this.getHighSpeedVideoSizesFor) {
            if (!(dependencyNode2 instanceof androidx.constraintlayout.core.widgets.analyzer.DimensionDependency)) {
                i++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i == 1 && dependencyNode.resolved) {
            androidx.constraintlayout.core.widgets.analyzer.DimensionDependency dimensionDependency = this.getHighSpeedVideoFpsRanges;
            if (dimensionDependency != null) {
                if (!dimensionDependency.resolved) {
                    return;
                } else {
                    this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor * this.getHighSpeedVideoFpsRanges.value;
                }
            }
            resolve(dependencyNode.value + this.Camera2StreamConfigurationMap);
        }
        androidx.constraintlayout.core.widgets.analyzer.Dependency dependency3 = this.updateDelegate;
        if (dependency3 != null) {
            dependency3.update(this);
        }
    }

    public void addDependency(androidx.constraintlayout.core.widgets.analyzer.Dependency dependency) {
        this.getHighSpeedVideoSizes.add(dependency);
        if (this.resolved) {
            dependency.update(dependency);
        }
    }

    public java.lang.String name() {
        java.lang.String obj;
        java.lang.String debugName = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor.getDebugName();
        if (this.getOutputFormats == androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.LEFT || this.getOutputFormats == androidx.constraintlayout.core.widgets.analyzer.DependencyNode.Type.RIGHT) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(debugName);
            sb.append("_HORIZONTAL");
            obj = sb.toString();
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(debugName);
            sb2.append("_VERTICAL");
            obj = sb2.toString();
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(obj);
        sb3.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb3.append(this.getOutputFormats.name());
        return sb3.toString();
    }

    public void clear() {
        this.getHighSpeedVideoSizesFor.clear();
        this.getHighSpeedVideoSizes.clear();
        this.resolved = false;
        this.value = 0;
        this.readyToSolve = false;
        this.delegateToWidgetRun = false;
    }
}
