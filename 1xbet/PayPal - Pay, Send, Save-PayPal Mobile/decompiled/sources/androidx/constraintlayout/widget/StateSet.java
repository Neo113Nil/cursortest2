package androidx.constraintlayout.widget;

/* loaded from: classes7.dex */
public class StateSet {
    public static final java.lang.String TAG = "ConstraintLayoutStates";
    int getHighSpeedVideoFpsRangesFor;
    int getHighResolutionOutputSizeshNQ4ISI = -1;
    int getHighSpeedVideoFpsRanges = -1;
    private android.util.SparseArray<androidx.constraintlayout.widget.StateSet.State> Camera2StreamConfigurationMap = new android.util.SparseArray<>();
    private androidx.constraintlayout.widget.ConstraintsChangedListener getHighSpeedVideoSizes = null;

    public StateSet(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        this.getHighSpeedVideoFpsRangesFor = -1;
        androidx.constraintlayout.widget.StateSet.State state = null;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.R.styleable.StateSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == androidx.constraintlayout.widget.R.styleable.StateSet_defaultState) {
                this.getHighSpeedVideoFpsRangesFor = obtainStyledAttributes.getResourceId(index, this.getHighSpeedVideoFpsRangesFor);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    java.lang.String name2 = xmlPullParser.getName();
                    switch (name2.hashCode()) {
                        case 80204913:
                            if (name2.equals("State")) {
                                state = new androidx.constraintlayout.widget.StateSet.State(context, xmlPullParser);
                                this.Camera2StreamConfigurationMap.put(state.Camera2StreamConfigurationMap, state);
                                break;
                            } else {
                                break;
                            }
                        case 1301459538:
                            name2.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name2.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name2.equals("Variant")) {
                                androidx.constraintlayout.widget.StateSet.Variant variant = new androidx.constraintlayout.widget.StateSet.Variant(context, xmlPullParser);
                                if (state != null) {
                                    state.getHighSpeedVideoFpsRangesFor.add(variant);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
        }
    }

    public boolean needsToChange(int i, float f, float f2) {
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 != i) {
            return true;
        }
        androidx.constraintlayout.widget.StateSet.State valueAt = i == -1 ? this.Camera2StreamConfigurationMap.valueAt(0) : this.Camera2StreamConfigurationMap.get(i2);
        return (this.getHighSpeedVideoFpsRanges == -1 || !valueAt.getHighSpeedVideoFpsRangesFor.get(this.getHighSpeedVideoFpsRanges).getHighSpeedVideoSizes(f, f2)) && this.getHighSpeedVideoFpsRanges != valueAt.getHighSpeedVideoFpsRanges(f, f2);
    }

    public void setOnConstraintsChanged(androidx.constraintlayout.widget.ConstraintsChangedListener constraintsChangedListener) {
        this.getHighSpeedVideoSizes = constraintsChangedListener;
    }

    public int stateGetConstraintID(int i, int i2, int i3) {
        return updateConstraints(-1, i, i2, i3);
    }

    public int convertToConstraintSet(int i, int i2, float f, float f2) {
        androidx.constraintlayout.widget.StateSet.State state = this.Camera2StreamConfigurationMap.get(i2);
        if (state == null) {
            return i2;
        }
        if (f == -1.0f || f2 == -1.0f) {
            if (state.getHighSpeedVideoFpsRanges == i) {
                return i;
            }
            java.util.Iterator<androidx.constraintlayout.widget.StateSet.Variant> it = state.getHighSpeedVideoFpsRangesFor.iterator();
            while (it.hasNext()) {
                if (i == it.next().Camera2StreamConfigurationMap) {
                    return i;
                }
            }
            return state.getHighSpeedVideoFpsRanges;
        }
        java.util.Iterator<androidx.constraintlayout.widget.StateSet.Variant> it2 = state.getHighSpeedVideoFpsRangesFor.iterator();
        androidx.constraintlayout.widget.StateSet.Variant variant = null;
        while (it2.hasNext()) {
            androidx.constraintlayout.widget.StateSet.Variant next = it2.next();
            if (next.getHighSpeedVideoSizes(f, f2)) {
                if (i == next.Camera2StreamConfigurationMap) {
                    return i;
                }
                variant = next;
            }
        }
        if (variant != null) {
            return variant.Camera2StreamConfigurationMap;
        }
        return state.getHighSpeedVideoFpsRanges;
    }

    public int updateConstraints(int i, int i2, float f, float f2) {
        androidx.constraintlayout.widget.StateSet.State state;
        int highSpeedVideoFpsRanges;
        if (i != i2) {
            androidx.constraintlayout.widget.StateSet.State state2 = this.Camera2StreamConfigurationMap.get(i2);
            if (state2 == null) {
                return -1;
            }
            int highSpeedVideoFpsRanges2 = state2.getHighSpeedVideoFpsRanges(f, f2);
            return highSpeedVideoFpsRanges2 == -1 ? state2.getHighSpeedVideoFpsRanges : state2.getHighSpeedVideoFpsRangesFor.get(highSpeedVideoFpsRanges2).Camera2StreamConfigurationMap;
        }
        if (i2 == -1) {
            state = this.Camera2StreamConfigurationMap.valueAt(0);
        } else {
            state = this.Camera2StreamConfigurationMap.get(this.getHighResolutionOutputSizeshNQ4ISI);
        }
        if (state == null) {
            return -1;
        }
        return ((this.getHighSpeedVideoFpsRanges == -1 || !state.getHighSpeedVideoFpsRangesFor.get(i).getHighSpeedVideoSizes(f, f2)) && i != (highSpeedVideoFpsRanges = state.getHighSpeedVideoFpsRanges(f, f2))) ? highSpeedVideoFpsRanges == -1 ? state.getHighSpeedVideoFpsRanges : state.getHighSpeedVideoFpsRangesFor.get(highSpeedVideoFpsRanges).Camera2StreamConfigurationMap : i;
    }

    static class State {
        int Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        java.util.ArrayList<androidx.constraintlayout.widget.StateSet.Variant> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList<>();

        State(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            this.getHighSpeedVideoFpsRanges = -1;
            this.getHighResolutionOutputSizeshNQ4ISI = false;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.R.styleable.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.State_android_id) {
                    this.Camera2StreamConfigurationMap = obtainStyledAttributes.getResourceId(index, this.Camera2StreamConfigurationMap);
                } else if (index == androidx.constraintlayout.widget.R.styleable.State_constraints) {
                    this.getHighSpeedVideoFpsRanges = obtainStyledAttributes.getResourceId(index, this.getHighSpeedVideoFpsRanges);
                    java.lang.String resourceTypeName = context.getResources().getResourceTypeName(this.getHighSpeedVideoFpsRanges);
                    context.getResources().getResourceName(this.getHighSpeedVideoFpsRanges);
                    if (androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE.equals(resourceTypeName)) {
                        this.getHighResolutionOutputSizeshNQ4ISI = true;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final int getHighSpeedVideoFpsRanges(float f, float f2) {
            for (int i = 0; i < this.getHighSpeedVideoFpsRangesFor.size(); i++) {
                if (this.getHighSpeedVideoFpsRangesFor.get(i).getHighSpeedVideoSizes(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    static class Variant {
        int Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        float getHighSpeedVideoFpsRanges;
        float getHighSpeedVideoFpsRangesFor;
        float getHighSpeedVideoSizes;
        float getInputFormats;

        Variant(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            this.getInputFormats = Float.NaN;
            this.getHighSpeedVideoFpsRanges = Float.NaN;
            this.getHighSpeedVideoFpsRangesFor = Float.NaN;
            this.getHighSpeedVideoSizes = Float.NaN;
            this.Camera2StreamConfigurationMap = -1;
            this.getHighResolutionOutputSizeshNQ4ISI = false;
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.R.styleable.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.Variant_constraints) {
                    this.Camera2StreamConfigurationMap = obtainStyledAttributes.getResourceId(index, this.Camera2StreamConfigurationMap);
                    java.lang.String resourceTypeName = context.getResources().getResourceTypeName(this.Camera2StreamConfigurationMap);
                    context.getResources().getResourceName(this.Camera2StreamConfigurationMap);
                    if (androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE.equals(resourceTypeName)) {
                        this.getHighResolutionOutputSizeshNQ4ISI = true;
                    }
                } else if (index == androidx.constraintlayout.widget.R.styleable.Variant_region_heightLessThan) {
                    this.getHighSpeedVideoSizes = obtainStyledAttributes.getDimension(index, this.getHighSpeedVideoSizes);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Variant_region_heightMoreThan) {
                    this.getHighSpeedVideoFpsRanges = obtainStyledAttributes.getDimension(index, this.getHighSpeedVideoFpsRanges);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Variant_region_widthLessThan) {
                    this.getHighSpeedVideoFpsRangesFor = obtainStyledAttributes.getDimension(index, this.getHighSpeedVideoFpsRangesFor);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Variant_region_widthMoreThan) {
                    this.getInputFormats = obtainStyledAttributes.getDimension(index, this.getInputFormats);
                }
            }
            obtainStyledAttributes.recycle();
        }

        final boolean getHighSpeedVideoSizes(float f, float f2) {
            if (!java.lang.Float.isNaN(this.getInputFormats) && f < this.getInputFormats) {
                return false;
            }
            if (!java.lang.Float.isNaN(this.getHighSpeedVideoFpsRanges) && f2 < this.getHighSpeedVideoFpsRanges) {
                return false;
            }
            if (java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor) || f <= this.getHighSpeedVideoFpsRangesFor) {
                return java.lang.Float.isNaN(this.getHighSpeedVideoSizes) || f2 <= this.getHighSpeedVideoSizes;
            }
            return false;
        }
    }
}
