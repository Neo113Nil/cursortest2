package androidx.constraintlayout.widget;

/* loaded from: classes7.dex */
public class ConstraintLayoutStates {
    public static final java.lang.String TAG = "ConstraintLayoutStates";
    androidx.constraintlayout.widget.ConstraintSet getHighSpeedVideoFpsRangesFor;
    private final androidx.constraintlayout.widget.ConstraintLayout getHighSpeedVideoSizes;
    int getHighResolutionOutputSizeshNQ4ISI = -1;
    int Camera2StreamConfigurationMap = -1;
    private android.util.SparseArray<androidx.constraintlayout.widget.ConstraintLayoutStates.State> getInputSizeshNQ4ISI = new android.util.SparseArray<>();
    private android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> getHighSpeedVideoFpsRanges = new android.util.SparseArray<>();
    private androidx.constraintlayout.widget.ConstraintsChangedListener getInputFormats = null;

    ConstraintLayoutStates(android.content.Context context, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, int i) {
        java.lang.String str;
        androidx.constraintlayout.widget.ConstraintLayoutStates.State state = null;
        this.getHighSpeedVideoSizes = constraintLayout;
        android.content.res.XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    java.lang.String name2 = xml.getName();
                    switch (name2.hashCode()) {
                        case -1349929691:
                            if (!name2.equals("ConstraintSet")) {
                                break;
                            } else {
                                androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
                                int attributeCount = xml.getAttributeCount();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= attributeCount) {
                                        break;
                                    } else {
                                        java.lang.String attributeName = xml.getAttributeName(i2);
                                        java.lang.String attributeValue = xml.getAttributeValue(i2);
                                        if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                                            int identifier = attributeValue.contains(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                                            if (identifier == -1 && attributeValue.length() > 1) {
                                                identifier = java.lang.Integer.parseInt(attributeValue.substring(1));
                                            }
                                            constraintSet.load(context, xml);
                                            this.getHighSpeedVideoFpsRanges.put(identifier, constraintSet);
                                            break;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                            }
                            break;
                        case 80204913:
                            if (name2.equals("State")) {
                                androidx.constraintlayout.widget.ConstraintLayoutStates.State state2 = new androidx.constraintlayout.widget.ConstraintLayoutStates.State(context, xml);
                                this.getInputSizeshNQ4ISI.put(state2.getHighSpeedVideoFpsRanges, state2);
                                state = state2;
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name2.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name2.equals(str);
                            break;
                        case 1901439077:
                            if (name2.equals("Variant")) {
                                androidx.constraintlayout.widget.ConstraintLayoutStates.Variant variant = new androidx.constraintlayout.widget.ConstraintLayoutStates.Variant(context, xml);
                                if (state != null) {
                                    state.getHighSpeedVideoSizes.add(variant);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
        }
    }

    public boolean needsToChange(int i, float f, float f2) {
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 != i) {
            return true;
        }
        androidx.constraintlayout.widget.ConstraintLayoutStates.State valueAt = i == -1 ? this.getInputSizeshNQ4ISI.valueAt(0) : this.getInputSizeshNQ4ISI.get(i2);
        return (this.Camera2StreamConfigurationMap == -1 || !valueAt.getHighSpeedVideoSizes.get(this.Camera2StreamConfigurationMap).getHighSpeedVideoFpsRangesFor(f, f2)) && this.Camera2StreamConfigurationMap != valueAt.Camera2StreamConfigurationMap(f, f2);
    }

    public void updateConstraints(int i, float f, float f2) {
        androidx.constraintlayout.widget.ConstraintSet constraintSet;
        int i2;
        androidx.constraintlayout.widget.ConstraintLayoutStates.State state;
        int Camera2StreamConfigurationMap;
        androidx.constraintlayout.widget.ConstraintSet constraintSet2;
        int i3;
        int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i4 == i) {
            if (i == -1) {
                state = this.getInputSizeshNQ4ISI.valueAt(0);
            } else {
                state = this.getInputSizeshNQ4ISI.get(i4);
            }
            if ((this.Camera2StreamConfigurationMap == -1 || !state.getHighSpeedVideoSizes.get(this.Camera2StreamConfigurationMap).getHighSpeedVideoFpsRangesFor(f, f2)) && this.Camera2StreamConfigurationMap != (Camera2StreamConfigurationMap = state.Camera2StreamConfigurationMap(f, f2))) {
                if (Camera2StreamConfigurationMap == -1) {
                    constraintSet2 = this.getHighSpeedVideoFpsRangesFor;
                } else {
                    constraintSet2 = state.getHighSpeedVideoSizes.get(Camera2StreamConfigurationMap).getHighSpeedVideoFpsRangesFor;
                }
                if (Camera2StreamConfigurationMap == -1) {
                    i3 = state.Camera2StreamConfigurationMap;
                } else {
                    i3 = state.getHighSpeedVideoSizes.get(Camera2StreamConfigurationMap).Camera2StreamConfigurationMap;
                }
                if (constraintSet2 != null) {
                    this.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap;
                    androidx.constraintlayout.widget.ConstraintsChangedListener constraintsChangedListener = this.getInputFormats;
                    if (constraintsChangedListener != null) {
                        constraintsChangedListener.preLayoutChange(-1, i3);
                    }
                    constraintSet2.applyTo(this.getHighSpeedVideoSizes);
                    androidx.constraintlayout.widget.ConstraintsChangedListener constraintsChangedListener2 = this.getInputFormats;
                    if (constraintsChangedListener2 != null) {
                        constraintsChangedListener2.postLayoutChange(-1, i3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        androidx.constraintlayout.widget.ConstraintLayoutStates.State state2 = this.getInputSizeshNQ4ISI.get(i);
        int Camera2StreamConfigurationMap2 = state2.Camera2StreamConfigurationMap(f, f2);
        if (Camera2StreamConfigurationMap2 == -1) {
            constraintSet = state2.getHighResolutionOutputSizeshNQ4ISI;
        } else {
            constraintSet = state2.getHighSpeedVideoSizes.get(Camera2StreamConfigurationMap2).getHighSpeedVideoFpsRangesFor;
        }
        if (Camera2StreamConfigurationMap2 == -1) {
            i2 = state2.Camera2StreamConfigurationMap;
        } else {
            i2 = state2.getHighSpeedVideoSizes.get(Camera2StreamConfigurationMap2).Camera2StreamConfigurationMap;
        }
        if (constraintSet == null) {
            return;
        }
        this.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap2;
        androidx.constraintlayout.widget.ConstraintsChangedListener constraintsChangedListener3 = this.getInputFormats;
        if (constraintsChangedListener3 != null) {
            constraintsChangedListener3.preLayoutChange(i, i2);
        }
        constraintSet.applyTo(this.getHighSpeedVideoSizes);
        androidx.constraintlayout.widget.ConstraintsChangedListener constraintsChangedListener4 = this.getInputFormats;
        if (constraintsChangedListener4 != null) {
            constraintsChangedListener4.postLayoutChange(i, i2);
        }
    }

    public void setOnConstraintsChanged(androidx.constraintlayout.widget.ConstraintsChangedListener constraintsChangedListener) {
        this.getInputFormats = constraintsChangedListener;
    }

    static class State {
        int Camera2StreamConfigurationMap;
        androidx.constraintlayout.widget.ConstraintSet getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        java.util.ArrayList<androidx.constraintlayout.widget.ConstraintLayoutStates.Variant> getHighSpeedVideoSizes = new java.util.ArrayList<>();

        State(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            this.Camera2StreamConfigurationMap = -1;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.R.styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.State_android_id) {
                    this.getHighSpeedVideoFpsRanges = obtainStyledAttributes.getResourceId(index, this.getHighSpeedVideoFpsRanges);
                } else if (index == androidx.constraintlayout.widget.R.styleable.State_constraints) {
                    this.Camera2StreamConfigurationMap = obtainStyledAttributes.getResourceId(index, this.Camera2StreamConfigurationMap);
                    java.lang.String resourceTypeName = context.getResources().getResourceTypeName(this.Camera2StreamConfigurationMap);
                    context.getResources().getResourceName(this.Camera2StreamConfigurationMap);
                    if (androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE.equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
                        this.getHighResolutionOutputSizeshNQ4ISI = constraintSet;
                        constraintSet.clone(context, this.Camera2StreamConfigurationMap);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final int Camera2StreamConfigurationMap(float f, float f2) {
            for (int i = 0; i < this.getHighSpeedVideoSizes.size(); i++) {
                if (this.getHighSpeedVideoSizes.get(i).getHighSpeedVideoFpsRangesFor(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    static class Variant {
        int Camera2StreamConfigurationMap;
        float getHighResolutionOutputSizeshNQ4ISI;
        float getHighSpeedVideoFpsRanges;
        androidx.constraintlayout.widget.ConstraintSet getHighSpeedVideoFpsRangesFor;
        float getHighSpeedVideoSizes;
        float getHighSpeedVideoSizesFor;

        Variant(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            this.getHighSpeedVideoSizesFor = Float.NaN;
            this.getHighSpeedVideoSizes = Float.NaN;
            this.getHighSpeedVideoFpsRanges = Float.NaN;
            this.getHighResolutionOutputSizeshNQ4ISI = Float.NaN;
            this.Camera2StreamConfigurationMap = -1;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.R.styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.Variant_constraints) {
                    this.Camera2StreamConfigurationMap = obtainStyledAttributes.getResourceId(index, this.Camera2StreamConfigurationMap);
                    java.lang.String resourceTypeName = context.getResources().getResourceTypeName(this.Camera2StreamConfigurationMap);
                    context.getResources().getResourceName(this.Camera2StreamConfigurationMap);
                    if (androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE.equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
                        this.getHighSpeedVideoFpsRangesFor = constraintSet;
                        constraintSet.clone(context, this.Camera2StreamConfigurationMap);
                    }
                } else if (index == androidx.constraintlayout.widget.R.styleable.Variant_region_heightLessThan) {
                    this.getHighResolutionOutputSizeshNQ4ISI = obtainStyledAttributes.getDimension(index, this.getHighResolutionOutputSizeshNQ4ISI);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Variant_region_heightMoreThan) {
                    this.getHighSpeedVideoSizes = obtainStyledAttributes.getDimension(index, this.getHighSpeedVideoSizes);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Variant_region_widthLessThan) {
                    this.getHighSpeedVideoFpsRanges = obtainStyledAttributes.getDimension(index, this.getHighSpeedVideoFpsRanges);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Variant_region_widthMoreThan) {
                    this.getHighSpeedVideoSizesFor = obtainStyledAttributes.getDimension(index, this.getHighSpeedVideoSizesFor);
                }
            }
            obtainStyledAttributes.recycle();
        }

        final boolean getHighSpeedVideoFpsRangesFor(float f, float f2) {
            if (!java.lang.Float.isNaN(this.getHighSpeedVideoSizesFor) && f < this.getHighSpeedVideoSizesFor) {
                return false;
            }
            if (!java.lang.Float.isNaN(this.getHighSpeedVideoSizes) && f2 < this.getHighSpeedVideoSizes) {
                return false;
            }
            if (java.lang.Float.isNaN(this.getHighSpeedVideoFpsRanges) || f <= this.getHighSpeedVideoFpsRanges) {
                return java.lang.Float.isNaN(this.getHighResolutionOutputSizeshNQ4ISI) || f2 <= this.getHighResolutionOutputSizeshNQ4ISI;
            }
            return false;
        }
    }
}
