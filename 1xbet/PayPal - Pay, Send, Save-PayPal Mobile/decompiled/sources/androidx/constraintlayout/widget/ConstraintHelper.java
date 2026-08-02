package androidx.constraintlayout.widget;

/* loaded from: classes7.dex */
public abstract class ConstraintHelper extends android.view.View {
    protected static final java.lang.String CHILD_TAG = "CONSTRAINT_LAYOUT_HELPER_CHILD";
    private android.view.View[] getHighSpeedVideoSizes;
    protected int mCount;
    protected androidx.constraintlayout.core.widgets.Helper mHelperWidget;
    protected int[] mIds;
    protected java.util.HashMap<java.lang.Integer, java.lang.String> mMap;
    protected java.lang.String mReferenceIds;
    protected java.lang.String mReferenceTags;
    protected boolean mUseViewMeasure;
    protected android.content.Context myContext;

    public void applyHelperParams() {
    }

    protected void applyLayoutFeaturesInConstraintSet(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
    }

    public void resolveRtl(androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget, boolean z) {
    }

    public void updatePostConstraints(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
    }

    public void updatePostLayout(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
    }

    public void updatePostMeasure(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
    }

    public void updatePreDraw(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
    }

    public ConstraintHelper(android.content.Context context) {
        super(context);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.getHighSpeedVideoSizes = null;
        this.mMap = new java.util.HashMap<>();
        this.myContext = context;
        init(null);
    }

    public ConstraintHelper(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.getHighSpeedVideoSizes = null;
        this.mMap = new java.util.HashMap<>();
        this.myContext = context;
        init(attributeSet);
    }

    public ConstraintHelper(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIds = new int[32];
        this.mUseViewMeasure = false;
        this.getHighSpeedVideoSizes = null;
        this.mMap = new java.util.HashMap<>();
        this.myContext = context;
        init(attributeSet);
    }

    public void init(android.util.AttributeSet attributeSet) {
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    java.lang.String string = obtainStyledAttributes.getString(index);
                    this.mReferenceIds = string;
                    setIds(string);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ConstraintLayout_Layout_constraint_referenced_tags) {
                    java.lang.String string2 = obtainStyledAttributes.getString(index);
                    this.mReferenceTags = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        java.lang.String str = this.mReferenceIds;
        if (str != null) {
            setIds(str);
        }
        java.lang.String str2 = this.mReferenceTags;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void addView(android.view.View view) {
        if (view == this || view.getId() == -1 || view.getParent() == null) {
            return;
        }
        this.mReferenceIds = null;
        Camera2StreamConfigurationMap(view.getId());
        requestLayout();
    }

    public int removeView(android.view.View view) {
        int i;
        int id = view.getId();
        int i2 = -1;
        if (id == -1) {
            return -1;
        }
        this.mReferenceIds = null;
        int i3 = 0;
        while (true) {
            if (i3 >= this.mCount) {
                break;
            }
            if (this.mIds[i3] == id) {
                int i4 = i3;
                while (true) {
                    i = this.mCount - 1;
                    if (i4 >= i) {
                        break;
                    }
                    int[] iArr = this.mIds;
                    int i5 = i4 + 1;
                    iArr[i4] = iArr[i5];
                    i4 = i5;
                }
                this.mIds[i] = 0;
                this.mCount = i;
                i2 = i3;
            } else {
                i3++;
            }
        }
        requestLayout();
        return i2;
    }

    public int[] getReferencedIds() {
        return java.util.Arrays.copyOf(this.mIds, this.mCount);
    }

    public void setReferencedIds(int[] iArr) {
        this.mReferenceIds = null;
        this.mCount = 0;
        for (int i : iArr) {
            Camera2StreamConfigurationMap(i);
        }
    }

    private void Camera2StreamConfigurationMap(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.mCount;
        int[] iArr = this.mIds;
        if (i2 + 1 > iArr.length) {
            this.mIds = java.util.Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.mIds;
        int i3 = this.mCount;
        iArr2[i3] = i;
        this.mCount = i3 + 1;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.mUseViewMeasure) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void validateParams() {
        if (this.mHelperWidget != null) {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) {
                ((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams).coroutineCreation = (androidx.constraintlayout.core.widgets.ConstraintWidget) this.mHelperWidget;
            }
        }
    }

    private void getHighSpeedVideoSizes(java.lang.String str) {
        java.lang.String trim;
        int highSpeedVideoFpsRanges;
        if (str == null || str.length() == 0 || this.myContext == null || (highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges((trim = str.trim()))) == 0) {
            return;
        }
        this.mMap.put(java.lang.Integer.valueOf(highSpeedVideoFpsRanges), trim);
        Camera2StreamConfigurationMap(highSpeedVideoFpsRanges);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        if (str == null || str.length() == 0 || this.myContext == null) {
            return;
        }
        java.lang.String trim = str.trim();
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout ? (androidx.constraintlayout.widget.ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraintLayout.getChildAt(i);
            android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) && trim.equals(((androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams).constraintTag) && childAt.getId() != -1) {
                Camera2StreamConfigurationMap(childAt.getId());
            }
        }
    }

    private int getHighSpeedVideoFpsRanges(java.lang.String str) {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout ? (androidx.constraintlayout.widget.ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            java.lang.Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof java.lang.Integer) {
                i = ((java.lang.Integer) designInformation).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = Camera2StreamConfigurationMap(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = androidx.constraintlayout.widget.R.id.class.getField(str).getInt(null);
            } catch (java.lang.Exception unused) {
            }
        }
        return i == 0 ? this.myContext.getResources().getIdentifier(str, "id", this.myContext.getPackageName()) : i;
    }

    private int Camera2StreamConfigurationMap(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, java.lang.String str) {
        android.content.res.Resources resources;
        java.lang.String str2;
        if (str == null || constraintLayout == null || (resources = this.myContext.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (android.content.res.Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    protected void setIds(java.lang.String str) {
        this.mReferenceIds = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.mCount = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                getHighSpeedVideoSizes(str.substring(i));
                return;
            } else {
                getHighSpeedVideoSizes(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    protected void setReferenceTags(java.lang.String str) {
        this.mReferenceTags = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.mCount = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                getHighResolutionOutputSizeshNQ4ISI(str.substring(i));
                return;
            } else {
                getHighResolutionOutputSizeshNQ4ISI(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    protected void applyLayoutFeatures(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.mCount; i++) {
            android.view.View viewById = constraintLayout.getViewById(this.mIds[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    protected void applyLayoutFeatures() {
        android.view.ViewParent parent = getParent();
        if (parent == null || !(parent instanceof androidx.constraintlayout.widget.ConstraintLayout)) {
            return;
        }
        applyLayoutFeatures((androidx.constraintlayout.widget.ConstraintLayout) parent);
    }

    public void updatePreLayout(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        java.lang.String str;
        int Camera2StreamConfigurationMap;
        if (isInEditMode()) {
            setIds(this.mReferenceIds);
        }
        androidx.constraintlayout.core.widgets.Helper helper = this.mHelperWidget;
        if (helper == null) {
            return;
        }
        helper.removeAllIds();
        for (int i = 0; i < this.mCount; i++) {
            int i2 = this.mIds[i];
            android.view.View viewById = constraintLayout.getViewById(i2);
            if (viewById == null && (Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(constraintLayout, (str = this.mMap.get(java.lang.Integer.valueOf(i2))))) != 0) {
                this.mIds[i] = Camera2StreamConfigurationMap;
                this.mMap.put(java.lang.Integer.valueOf(Camera2StreamConfigurationMap), str);
                viewById = constraintLayout.getViewById(Camera2StreamConfigurationMap);
            }
            if (viewById != null) {
                this.mHelperWidget.add(constraintLayout.getViewWidget(viewById));
            }
        }
        this.mHelperWidget.updateConstraints(constraintLayout.mLayoutWidget);
    }

    public void updatePreLayout(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer constraintWidgetContainer, androidx.constraintlayout.core.widgets.Helper helper, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> sparseArray) {
        helper.removeAllIds();
        for (int i = 0; i < this.mCount; i++) {
            helper.add(sparseArray.get(this.mIds[i]));
        }
    }

    protected android.view.View[] getViews(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        android.view.View[] viewArr = this.getHighSpeedVideoSizes;
        if (viewArr == null || viewArr.length != this.mCount) {
            this.getHighSpeedVideoSizes = new android.view.View[this.mCount];
        }
        for (int i = 0; i < this.mCount; i++) {
            this.getHighSpeedVideoSizes[i] = constraintLayout.getViewById(this.mIds[i]);
        }
        return this.getHighSpeedVideoSizes;
    }

    public void loadParameters(androidx.constraintlayout.widget.ConstraintSet.Constraint constraint, androidx.constraintlayout.core.widgets.HelperWidget helperWidget, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> sparseArray) {
        if (constraint.layout.mReferenceIds != null) {
            setReferencedIds(constraint.layout.mReferenceIds);
        } else if (constraint.layout.mReferenceIdString != null) {
            if (constraint.layout.mReferenceIdString.length() > 0) {
                androidx.constraintlayout.widget.ConstraintSet.Layout layout = constraint.layout;
                java.lang.String[] split = constraint.layout.mReferenceIdString.split(",");
                int[] iArr = new int[split.length];
                int i = 0;
                for (java.lang.String str : split) {
                    int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str.trim());
                    if (highSpeedVideoFpsRanges != 0) {
                        iArr[i] = highSpeedVideoFpsRanges;
                        i++;
                    }
                }
                if (i != split.length) {
                    iArr = java.util.Arrays.copyOf(iArr, i);
                }
                layout.mReferenceIds = iArr;
            } else {
                constraint.layout.mReferenceIds = null;
            }
        }
        if (helperWidget != null) {
            helperWidget.removeAllIds();
            if (constraint.layout.mReferenceIds != null) {
                for (int i2 = 0; i2 < constraint.layout.mReferenceIds.length; i2++) {
                    androidx.constraintlayout.core.widgets.ConstraintWidget constraintWidget = sparseArray.get(constraint.layout.mReferenceIds[i2]);
                    if (constraintWidget != null) {
                        helperWidget.add(constraintWidget);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setTag(int i, java.lang.Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.mReferenceIds == null) {
            Camera2StreamConfigurationMap(i);
        }
    }

    public boolean containsId(int i) {
        for (int i2 : this.mIds) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public int indexFromId(int i) {
        int i2 = -1;
        for (int i3 : this.mIds) {
            i2++;
            if (i3 == i) {
                return i2;
            }
        }
        return i2;
    }

    public static boolean isChildOfHelper(android.view.View view) {
        return CHILD_TAG == view.getTag();
    }
}
