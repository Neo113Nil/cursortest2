package androidx.constraintlayout.core.widgets.analyzer;

/* loaded from: classes7.dex */
public class Grouping {
    public static boolean validInGroup(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour2, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour3, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        return (dimensionBehaviour3 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour3 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour3 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) || (dimensionBehaviour4 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour4 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour4 == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT));
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x039e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x039a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean simpleSolvingPass(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer measurer) {
        androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup;
        boolean z;
        androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup2;
        java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> children = constraintWidgetContainer.getChildren();
        int size = children.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = children.get(i2);
            if (!validInGroup(constraintWidgetContainer.getHorizontalDimensionBehaviour(), constraintWidgetContainer.getVerticalDimensionBehaviour(), constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getVerticalDimensionBehaviour()) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.Flow)) {
                return false;
            }
        }
        if (constraintWidgetContainer.mMetrics != null) {
            constraintWidgetContainer.mMetrics.grouping++;
        }
        int i3 = 0;
        java.util.ArrayList arrayList = null;
        java.util.ArrayList arrayList2 = null;
        java.util.ArrayList arrayList3 = null;
        java.util.ArrayList arrayList4 = null;
        java.util.ArrayList arrayList5 = null;
        java.util.ArrayList arrayList6 = null;
        while (i3 < size) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget2 = children.get(i3);
            if (!validInGroup(constraintWidgetContainer.getHorizontalDimensionBehaviour(), constraintWidgetContainer.getVerticalDimensionBehaviour(), constraintWidget2.getHorizontalDimensionBehaviour(), constraintWidget2.getVerticalDimensionBehaviour())) {
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer.measure(i, constraintWidget2, measurer, constraintWidgetContainer.mMeasure, androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure.SELF_DIMENSIONS);
            }
            boolean z2 = constraintWidget2 instanceof androidx.constraintlayout.core.widgets.Guideline;
            if (z2) {
                androidx.constraintlayout.core.widgets.Guideline guideline = (androidx.constraintlayout.core.widgets.Guideline) constraintWidget2;
                if (guideline.getOrientation() == 0) {
                    if (arrayList2 == null) {
                        arrayList2 = new java.util.ArrayList();
                    }
                    arrayList2.add(guideline);
                }
                if (guideline.getOrientation() == 1) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(guideline);
                }
            }
            if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.HelperWidget) {
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.Barrier) {
                    androidx.constraintlayout.core.widgets.Barrier barrier = (androidx.constraintlayout.core.widgets.Barrier) constraintWidget2;
                    if (barrier.getOrientation() == 0) {
                        if (arrayList3 == null) {
                            arrayList3 = new java.util.ArrayList();
                        }
                        arrayList3.add(barrier);
                    }
                    if (barrier.getOrientation() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new java.util.ArrayList();
                        }
                        arrayList4.add(barrier);
                    }
                } else {
                    androidx.constraintlayout.core.widgets.HelperWidget helperWidget = (androidx.constraintlayout.core.widgets.HelperWidget) constraintWidget2;
                    if (arrayList3 == null) {
                        arrayList3 = new java.util.ArrayList();
                    }
                    arrayList3.add(helperWidget);
                    if (arrayList4 == null) {
                        arrayList4 = new java.util.ArrayList();
                    }
                    arrayList4.add(helperWidget);
                }
            }
            if (constraintWidget2.mLeft.mTarget == null && constraintWidget2.mRight.mTarget == null && !z2 && !(constraintWidget2 instanceof androidx.constraintlayout.core.widgets.Barrier)) {
                if (arrayList5 == null) {
                    arrayList5 = new java.util.ArrayList();
                }
                arrayList5.add(constraintWidget2);
            }
            if (constraintWidget2.mTop.mTarget == null && constraintWidget2.mBottom.mTarget == null && constraintWidget2.mBaseline.mTarget == null && !z2 && !(constraintWidget2 instanceof androidx.constraintlayout.core.widgets.Barrier)) {
                if (arrayList6 == null) {
                    arrayList6 = new java.util.ArrayList();
                }
                arrayList6.add(constraintWidget2);
            }
            i3++;
            i = 0;
        }
        java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup> arrayList7 = new java.util.ArrayList<>();
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                findDependents((androidx.constraintlayout.core.widgets.Guideline) it.next(), 0, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup3 = null;
        int i4 = 0;
        if (arrayList3 != null) {
            java.util.Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                androidx.constraintlayout.core.widgets.HelperWidget helperWidget2 = (androidx.constraintlayout.core.widgets.HelperWidget) it2.next();
                androidx.constraintlayout.core.widgets.analyzer.WidgetGroup findDependents = findDependents(helperWidget2, i4, arrayList7, widgetGroup3);
                helperWidget2.addDependents(arrayList7, i4, findDependents);
                findDependents.cleanup(arrayList7);
                widgetGroup3 = null;
                i4 = 0;
            }
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor = constraintWidgetContainer.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT);
        if (anchor.getDependents() != null) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it3 = anchor.getDependents().iterator();
            while (it3.hasNext()) {
                findDependents(it3.next().mOwner, 0, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor2 = constraintWidgetContainer.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT);
        if (anchor2.getDependents() != null) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it4 = anchor2.getDependents().iterator();
            while (it4.hasNext()) {
                findDependents(it4.next().mOwner, 0, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor3 = constraintWidgetContainer.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER);
        if (anchor3.getDependents() != null) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it5 = anchor3.getDependents().iterator();
            while (it5.hasNext()) {
                findDependents(it5.next().mOwner, 0, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup4 = null;
        if (arrayList5 != null) {
            java.util.Iterator it6 = arrayList5.iterator();
            while (it6.hasNext()) {
                findDependents((androidx.constraintlayout.core.widgets.ConstraintWidget) it6.next(), 0, arrayList7, null);
            }
        }
        if (arrayList2 != null) {
            java.util.Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                findDependents((androidx.constraintlayout.core.widgets.Guideline) it7.next(), 1, arrayList7, null);
            }
        }
        int i5 = 1;
        if (arrayList4 != null) {
            java.util.Iterator it8 = arrayList4.iterator();
            while (it8.hasNext()) {
                androidx.constraintlayout.core.widgets.HelperWidget helperWidget3 = (androidx.constraintlayout.core.widgets.HelperWidget) it8.next();
                androidx.constraintlayout.core.widgets.analyzer.WidgetGroup findDependents2 = findDependents(helperWidget3, i5, arrayList7, widgetGroup4);
                helperWidget3.addDependents(arrayList7, i5, findDependents2);
                findDependents2.cleanup(arrayList7);
                widgetGroup4 = null;
                i5 = 1;
            }
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor4 = constraintWidgetContainer.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP);
        if (anchor4.getDependents() != null) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it9 = anchor4.getDependents().iterator();
            while (it9.hasNext()) {
                findDependents(it9.next().mOwner, 1, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor5 = constraintWidgetContainer.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE);
        if (anchor5.getDependents() != null) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it10 = anchor5.getDependents().iterator();
            while (it10.hasNext()) {
                findDependents(it10.next().mOwner, 1, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor6 = constraintWidgetContainer.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM);
        if (anchor6.getDependents() != null) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it11 = anchor6.getDependents().iterator();
            while (it11.hasNext()) {
                findDependents(it11.next().mOwner, 1, arrayList7, null);
            }
        }
        androidx.constraintlayout.core.widgets.ConstraintAnchor anchor7 = constraintWidgetContainer.getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER);
        if (anchor7.getDependents() != null) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.ConstraintAnchor> it12 = anchor7.getDependents().iterator();
            while (it12.hasNext()) {
                findDependents(it12.next().mOwner, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            java.util.Iterator it13 = arrayList6.iterator();
            while (it13.hasNext()) {
                findDependents((androidx.constraintlayout.core.widgets.ConstraintWidget) it13.next(), 1, arrayList7, null);
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget3 = children.get(i6);
            if (constraintWidget3.oppositeDimensionsTied()) {
                androidx.constraintlayout.core.widgets.analyzer.WidgetGroup Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(arrayList7, constraintWidget3.horizontalGroup);
                androidx.constraintlayout.core.widgets.analyzer.WidgetGroup Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(arrayList7, constraintWidget3.verticalGroup);
                if (Camera2StreamConfigurationMap != null && Camera2StreamConfigurationMap2 != null) {
                    Camera2StreamConfigurationMap.moveTo(0, Camera2StreamConfigurationMap2);
                    Camera2StreamConfigurationMap2.setOrientation(2);
                    arrayList7.remove(Camera2StreamConfigurationMap);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (constraintWidgetContainer.getHorizontalDimensionBehaviour() == androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup> it14 = arrayList7.iterator();
            widgetGroup = null;
            int i7 = 0;
            while (it14.hasNext()) {
                androidx.constraintlayout.core.widgets.analyzer.WidgetGroup next = it14.next();
                if (next.getOrientation() != 1) {
                    next.setAuthoritative(false);
                    int measureWrap = next.measureWrap(constraintWidgetContainer.getSystem(), 0);
                    if (measureWrap > i7) {
                        widgetGroup = next;
                        i7 = measureWrap;
                    }
                }
            }
            if (widgetGroup != null) {
                constraintWidgetContainer.setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidgetContainer.setWidth(i7);
                widgetGroup.setAuthoritative(true);
                if (constraintWidgetContainer.getVerticalDimensionBehaviour() != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    java.util.Iterator<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup> it15 = arrayList7.iterator();
                    androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup5 = null;
                    int i8 = 0;
                    while (it15.hasNext()) {
                        androidx.constraintlayout.core.widgets.analyzer.WidgetGroup next2 = it15.next();
                        if (next2.getOrientation() != 0) {
                            next2.setAuthoritative(false);
                            int measureWrap2 = next2.measureWrap(constraintWidgetContainer.getSystem(), 1);
                            if (measureWrap2 > i8) {
                                widgetGroup5 = next2;
                                i8 = measureWrap2;
                            }
                        }
                    }
                    z = true;
                    if (widgetGroup5 != null) {
                        constraintWidgetContainer.setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED);
                        constraintWidgetContainer.setHeight(i8);
                        widgetGroup5.setAuthoritative(true);
                        widgetGroup2 = widgetGroup5;
                        if (widgetGroup == null || widgetGroup2 != null) {
                            return z;
                        }
                        return false;
                    }
                } else {
                    z = true;
                }
                widgetGroup2 = null;
                if (widgetGroup == null) {
                }
                return z;
            }
        }
        widgetGroup = null;
        if (constraintWidgetContainer.getVerticalDimensionBehaviour() != androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
        }
        widgetGroup2 = null;
        if (widgetGroup == null) {
        }
        return z;
    }

    private static androidx.constraintlayout.core.widgets.analyzer.WidgetGroup Camera2StreamConfigurationMap(java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup = arrayList.get(i2);
            if (i == widgetGroup.getId()) {
                return widgetGroup;
            }
        }
        return null;
    }

    public static androidx.constraintlayout.core.widgets.analyzer.WidgetGroup findDependents(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, int i, java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetGroup> arrayList, androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup) {
        int i2;
        int findGroupInDependents;
        if (i == 0) {
            i2 = constraintWidget.horizontalGroup;
        } else {
            i2 = constraintWidget.verticalGroup;
        }
        if (i2 != -1 && (widgetGroup == null || i2 != widgetGroup.getId())) {
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup2 = arrayList.get(i3);
                if (widgetGroup2.getId() == i2) {
                    if (widgetGroup != null) {
                        widgetGroup.moveTo(i, widgetGroup2);
                        arrayList.remove(widgetGroup);
                    }
                    widgetGroup = widgetGroup2;
                } else {
                    i3++;
                }
            }
        } else if (i2 != -1) {
            return widgetGroup;
        }
        if (widgetGroup == null) {
            if ((constraintWidget instanceof androidx.constraintlayout.core.widgets.HelperWidget) && (findGroupInDependents = ((androidx.constraintlayout.core.widgets.HelperWidget) constraintWidget).findGroupInDependents(i)) != -1) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    androidx.constraintlayout.core.widgets.analyzer.WidgetGroup widgetGroup3 = arrayList.get(i4);
                    if (widgetGroup3.getId() == findGroupInDependents) {
                        widgetGroup = widgetGroup3;
                        break;
                    }
                    i4++;
                }
            }
            if (widgetGroup == null) {
                widgetGroup = new androidx.constraintlayout.core.widgets.analyzer.WidgetGroup(i);
            }
            arrayList.add(widgetGroup);
        }
        if (widgetGroup.add(constraintWidget)) {
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.Guideline) {
                androidx.constraintlayout.core.widgets.Guideline guideline = (androidx.constraintlayout.core.widgets.Guideline) constraintWidget;
                guideline.getAnchor().findDependents(guideline.getOrientation() == 0 ? 1 : 0, arrayList, widgetGroup);
            }
            if (i == 0) {
                constraintWidget.horizontalGroup = widgetGroup.getId();
                constraintWidget.mLeft.findDependents(i, arrayList, widgetGroup);
                constraintWidget.mRight.findDependents(i, arrayList, widgetGroup);
            } else {
                constraintWidget.verticalGroup = widgetGroup.getId();
                constraintWidget.mTop.findDependents(i, arrayList, widgetGroup);
                constraintWidget.mBaseline.findDependents(i, arrayList, widgetGroup);
                constraintWidget.mBottom.findDependents(i, arrayList, widgetGroup);
            }
            constraintWidget.mCenter.findDependents(i, arrayList, widgetGroup);
        }
        return widgetGroup;
    }
}
