package androidx.fragment.app;

/* loaded from: classes3.dex */
class FragmentLayoutInflaterFactory implements android.view.LayoutInflater.Factory2 {
    final androidx.fragment.app.FragmentManager getHighSpeedVideoFpsRanges;

    FragmentLayoutInflaterFactory(androidx.fragment.app.FragmentManager fragmentManager) {
        this.getHighSpeedVideoFpsRanges = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        final androidx.fragment.app.FragmentStateManager highResolutionOutputSizeshNQ4ISI;
        if (androidx.fragment.app.FragmentContainerView.class.getName().equals(str)) {
            return new androidx.fragment.app.FragmentContainerView(context, attributeSet, this.getHighSpeedVideoFpsRanges);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        java.lang.String attributeValue = attributeSet.getAttributeValue(null, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.CLASS);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.fragment.R.styleable.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(androidx.fragment.R.styleable.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(androidx.fragment.R.styleable.Fragment_android_id, -1);
        java.lang.String string = obtainStyledAttributes.getString(androidx.fragment.R.styleable.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !androidx.fragment.app.FragmentFactory.isFragmentClass(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(attributeValue);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        androidx.fragment.app.Fragment findFragmentById = resourceId != -1 ? this.getHighSpeedVideoFpsRanges.findFragmentById(resourceId) : null;
        if (findFragmentById == null && string != null) {
            findFragmentById = this.getHighSpeedVideoFpsRanges.findFragmentByTag(string);
        }
        if (findFragmentById == null && id != -1) {
            findFragmentById = this.getHighSpeedVideoFpsRanges.findFragmentById(id);
        }
        if (findFragmentById == null) {
            findFragmentById = this.getHighSpeedVideoFpsRanges.getFragmentFactory().instantiate(context.getClassLoader(), attributeValue);
            findFragmentById.mFromLayout = true;
            findFragmentById.mFragmentId = resourceId != 0 ? resourceId : id;
            findFragmentById.mContainerId = id;
            findFragmentById.mTag = string;
            findFragmentById.mInLayout = true;
            findFragmentById.mFragmentManager = this.getHighSpeedVideoFpsRanges;
            findFragmentById.mHost = this.getHighSpeedVideoFpsRanges.getHost();
            findFragmentById.onInflate(this.getHighSpeedVideoFpsRanges.getHost().getContext(), attributeSet, findFragmentById.mSavedFragmentState);
            highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(findFragmentById);
            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
        } else {
            if (findFragmentById.mInLayout) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(attributeSet.getPositionDescription());
                sb2.append(": Duplicate id 0x");
                sb2.append(java.lang.Integer.toHexString(resourceId));
                sb2.append(", tag ");
                sb2.append(string);
                sb2.append(", or parent id 0x");
                sb2.append(java.lang.Integer.toHexString(id));
                sb2.append(" with another fragment for ");
                sb2.append(attributeValue);
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            findFragmentById.mInLayout = true;
            findFragmentById.mFragmentManager = this.getHighSpeedVideoFpsRanges;
            findFragmentById.mHost = this.getHighSpeedVideoFpsRanges.getHost();
            findFragmentById.onInflate(this.getHighSpeedVideoFpsRanges.getHost().getContext(), attributeSet, findFragmentById.mSavedFragmentState);
            highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(findFragmentById);
            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        androidx.fragment.app.strictmode.FragmentStrictMode.onFragmentTagUsage(findFragmentById, viewGroup);
        findFragmentById.mContainer = viewGroup;
        highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges();
        highResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI();
        if (findFragmentById.mView == null) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Fragment ");
            sb3.append(attributeValue);
            sb3.append(" did not create a view.");
            throw new java.lang.IllegalStateException(sb3.toString());
        }
        if (resourceId != 0) {
            findFragmentById.mView.setId(resourceId);
        }
        if (findFragmentById.mView.getTag() == null) {
            findFragmentById.mView.setTag(string);
        }
        findFragmentById.mView.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: androidx.fragment.app.FragmentLayoutInflaterFactory.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(android.view.View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(android.view.View view2) {
                androidx.fragment.app.Fragment Camera2StreamConfigurationMap = highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap();
                highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges();
                androidx.fragment.app.SpecialEffectsController.getOrCreateController((android.view.ViewGroup) Camera2StreamConfigurationMap.mView.getParent(), androidx.fragment.app.FragmentLayoutInflaterFactory.this.getHighSpeedVideoFpsRanges).forceCompleteAllOperations();
            }
        });
        return findFragmentById.mView;
    }
}
