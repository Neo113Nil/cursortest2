package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes7.dex */
class RunGroup {
    public static int getHighSpeedVideoFpsRangesFor;
    int Camera2StreamConfigurationMap;
    androidx.constraintlayout.core.widgets.analyzer.WidgetRun getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;
    androidx.constraintlayout.core.widgets.analyzer.WidgetRun getHighSpeedVideoSizesFor;
    public int getOutputFormats = 0;
    public boolean getHighSpeedVideoFpsRanges = false;
    java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> getInputFormats = new java.util.ArrayList<>();

    RunGroup(androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoSizesFor = null;
        int i2 = getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes = i2;
        getHighSpeedVideoFpsRangesFor = i2 + 1;
        this.getHighResolutionOutputSizeshNQ4ISI = widgetRun;
        this.getHighSpeedVideoSizesFor = widgetRun;
        this.Camera2StreamConfigurationMap = i;
    }

    final long Camera2StreamConfigurationMap(androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode, long j) {
        androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun = dependencyNode.getHighResolutionOutputSizeshNQ4ISI;
        if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.HelperReferences) {
            return j;
        }
        int size = dependencyNode.getHighSpeedVideoSizes.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.core.widgets.analyzer.Dependency dependency = dependencyNode.getHighSpeedVideoSizes.get(i);
            if (dependency instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode) {
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) dependency;
                if (dependencyNode2.getHighResolutionOutputSizeshNQ4ISI != widgetRun) {
                    j2 = java.lang.Math.max(j2, Camera2StreamConfigurationMap(dependencyNode2, dependencyNode2.Camera2StreamConfigurationMap + j));
                }
            }
        }
        if (dependencyNode != widgetRun.start) {
            return j2;
        }
        long wrapDimension = j + widgetRun.getWrapDimension();
        return java.lang.Math.max(java.lang.Math.max(j2, Camera2StreamConfigurationMap(widgetRun.end, wrapDimension)), wrapDimension - widgetRun.end.Camera2StreamConfigurationMap);
    }

    final long getHighResolutionOutputSizeshNQ4ISI(androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode, long j) {
        androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun = dependencyNode.getHighResolutionOutputSizeshNQ4ISI;
        if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.HelperReferences) {
            return j;
        }
        int size = dependencyNode.getHighSpeedVideoSizes.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            androidx.constraintlayout.core.widgets.analyzer.Dependency dependency = dependencyNode.getHighSpeedVideoSizes.get(i);
            if (dependency instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode) {
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) dependency;
                if (dependencyNode2.getHighResolutionOutputSizeshNQ4ISI != widgetRun) {
                    j2 = java.lang.Math.min(j2, getHighResolutionOutputSizeshNQ4ISI(dependencyNode2, dependencyNode2.Camera2StreamConfigurationMap + j));
                }
            }
        }
        if (dependencyNode != widgetRun.end) {
            return j2;
        }
        long wrapDimension = j - widgetRun.getWrapDimension();
        return java.lang.Math.min(java.lang.Math.min(j2, getHighResolutionOutputSizeshNQ4ISI(widgetRun.start, wrapDimension)), wrapDimension - widgetRun.start.Camera2StreamConfigurationMap);
    }

    final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.constraintlayout.core.widgets.analyzer.WidgetRun widgetRun, int i) {
        if (!widgetRun.getHighSpeedVideoSizesFor.isTerminalWidget[i]) {
            return false;
        }
        for (androidx.constraintlayout.core.widgets.analyzer.Dependency dependency : widgetRun.start.getHighSpeedVideoSizes) {
            if (dependency instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode) {
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) dependency;
                if (dependencyNode.getHighResolutionOutputSizeshNQ4ISI != widgetRun && dependencyNode == dependencyNode.getHighResolutionOutputSizeshNQ4ISI.start) {
                    if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.ChainRun) {
                        java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> it = ((androidx.constraintlayout.core.widgets.analyzer.ChainRun) widgetRun).getHighSpeedVideoFpsRanges.iterator();
                        while (it.hasNext()) {
                            getHighResolutionOutputSizeshNQ4ISI(it.next(), i);
                        }
                    } else if (!(widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.HelperReferences)) {
                        widgetRun.getHighSpeedVideoSizesFor.isTerminalWidget[i] = false;
                    }
                    getHighResolutionOutputSizeshNQ4ISI(dependencyNode.getHighResolutionOutputSizeshNQ4ISI, i);
                }
            }
        }
        for (androidx.constraintlayout.core.widgets.analyzer.Dependency dependency2 : widgetRun.end.getHighSpeedVideoSizes) {
            if (dependency2 instanceof androidx.constraintlayout.core.widgets.analyzer.DependencyNode) {
                androidx.constraintlayout.core.widgets.analyzer.DependencyNode dependencyNode2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) dependency2;
                if (dependencyNode2.getHighResolutionOutputSizeshNQ4ISI != widgetRun && dependencyNode2 == dependencyNode2.getHighResolutionOutputSizeshNQ4ISI.start) {
                    if (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.ChainRun) {
                        java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> it2 = ((androidx.constraintlayout.core.widgets.analyzer.ChainRun) widgetRun).getHighSpeedVideoFpsRanges.iterator();
                        while (it2.hasNext()) {
                            getHighResolutionOutputSizeshNQ4ISI(it2.next(), i);
                        }
                    } else if (!(widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.HelperReferences)) {
                        widgetRun.getHighSpeedVideoSizesFor.isTerminalWidget[i] = false;
                    }
                    getHighResolutionOutputSizeshNQ4ISI(dependencyNode2.getHighResolutionOutputSizeshNQ4ISI, i);
                }
            }
        }
        return false;
    }
}
