package androidx.fragment.app;

/* loaded from: classes7.dex */
public class ListFragment extends androidx.fragment.app.Fragment {
    android.view.View Camera2StreamConfigurationMap;
    java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI;
    android.widget.ListAdapter getHighSpeedVideoFpsRanges;
    android.widget.ListView getHighSpeedVideoFpsRangesFor;
    android.view.View getHighSpeedVideoSizes;
    boolean getInputFormats;
    android.widget.TextView getOutputFormats;
    android.view.View getOutputMinFrameDuration;
    private final android.os.Handler getInputSizeshNQ4ISI = new android.os.Handler();
    private final java.lang.Runnable getOutputSizes = new java.lang.Runnable() { // from class: androidx.fragment.app.ListFragment.1
        @Override // java.lang.Runnable
        public void run() {
            androidx.fragment.app.ListFragment.this.getHighSpeedVideoFpsRangesFor.focusableViewAvailable(androidx.fragment.app.ListFragment.this.getHighSpeedVideoFpsRangesFor);
        }
    };
    private final android.widget.AdapterView.OnItemClickListener getHighSpeedVideoSizesFor = new android.widget.AdapterView.OnItemClickListener() { // from class: androidx.fragment.app.ListFragment.2
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long j) {
            androidx.fragment.app.ListFragment.this.onListItemClick((android.widget.ListView) adapterView, view, i, j);
        }
    };

    public void onListItemClick(android.widget.ListView listView, android.view.View view, int i, long j) {
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.content.Context requireContext = requireContext();
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(requireContext);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(requireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new android.widget.ProgressBar(requireContext, null, android.R.attr.progressBarStyleLarge), new android.widget.FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(requireContext);
        frameLayout2.setId(16711683);
        android.widget.TextView textView = new android.widget.TextView(requireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.ListView listView = new android.widget.ListView(requireContext);
        listView.setId(android.R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        Camera2StreamConfigurationMap();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.getInputSizeshNQ4ISI.removeCallbacks(this.getOutputSizes);
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getInputFormats = false;
        this.getHighSpeedVideoSizes = null;
        this.getOutputMinFrameDuration = null;
        this.Camera2StreamConfigurationMap = null;
        this.getOutputFormats = null;
        super.onDestroyView();
    }

    public void setListAdapter(android.widget.ListAdapter listAdapter) {
        boolean z = this.getHighSpeedVideoFpsRanges != null;
        this.getHighSpeedVideoFpsRanges = listAdapter;
        android.widget.ListView listView = this.getHighSpeedVideoFpsRangesFor;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.getInputFormats || z) {
                return;
            }
            getHighResolutionOutputSizeshNQ4ISI(true, requireView().getWindowToken() != null);
        }
    }

    public void setSelection(int i) {
        Camera2StreamConfigurationMap();
        this.getHighSpeedVideoFpsRangesFor.setSelection(i);
    }

    public int getSelectedItemPosition() {
        Camera2StreamConfigurationMap();
        return this.getHighSpeedVideoFpsRangesFor.getSelectedItemPosition();
    }

    public long getSelectedItemId() {
        Camera2StreamConfigurationMap();
        return this.getHighSpeedVideoFpsRangesFor.getSelectedItemId();
    }

    public android.widget.ListView getListView() {
        Camera2StreamConfigurationMap();
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setEmptyText(java.lang.CharSequence charSequence) {
        Camera2StreamConfigurationMap();
        android.widget.TextView textView = this.getOutputFormats;
        if (textView == null) {
            throw new java.lang.IllegalStateException("Can't be used with a custom content view");
        }
        textView.setText(charSequence);
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighSpeedVideoFpsRangesFor.setEmptyView(this.getOutputFormats);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = charSequence;
    }

    public void setListShown(boolean z) {
        getHighResolutionOutputSizeshNQ4ISI(z, true);
    }

    public void setListShownNoAnimation(boolean z) {
        getHighResolutionOutputSizeshNQ4ISI(z, false);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(boolean z, boolean z2) {
        Camera2StreamConfigurationMap();
        android.view.View view = this.getOutputMinFrameDuration;
        if (view == null) {
            throw new java.lang.IllegalStateException("Can't be used with a custom content view");
        }
        if (this.getInputFormats == z) {
            return;
        }
        this.getInputFormats = z;
        if (z) {
            if (z2) {
                view.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_out));
                this.getHighSpeedVideoSizes.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.getHighSpeedVideoSizes.clearAnimation();
            }
            this.getOutputMinFrameDuration.setVisibility(8);
            this.getHighSpeedVideoSizes.setVisibility(0);
            return;
        }
        if (z2) {
            view.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_in));
            this.getHighSpeedVideoSizes.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.getHighSpeedVideoSizes.clearAnimation();
        }
        this.getOutputMinFrameDuration.setVisibility(0);
        this.getHighSpeedVideoSizes.setVisibility(8);
    }

    public android.widget.ListAdapter getListAdapter() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final android.widget.ListAdapter requireListAdapter() {
        android.widget.ListAdapter listAdapter = getListAdapter();
        if (listAdapter != null) {
            return listAdapter;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ListFragment ");
        sb.append(this);
        sb.append(" does not have a ListAdapter.");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    private void Camera2StreamConfigurationMap() {
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return;
        }
        android.view.View view = getView();
        if (view == null) {
            throw new java.lang.IllegalStateException("Content view not yet created");
        }
        if (view instanceof android.widget.ListView) {
            this.getHighSpeedVideoFpsRangesFor = (android.widget.ListView) view;
        } else {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(16711681);
            this.getOutputFormats = textView;
            if (textView == null) {
                this.Camera2StreamConfigurationMap = view.findViewById(android.R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.getOutputMinFrameDuration = view.findViewById(16711682);
            this.getHighSpeedVideoSizes = view.findViewById(16711683);
            android.view.View findViewById = view.findViewById(android.R.id.list);
            if (!(findViewById instanceof android.widget.ListView)) {
                if (findViewById == null) {
                    throw new java.lang.RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                }
                throw new java.lang.RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
            }
            android.widget.ListView listView = (android.widget.ListView) findViewById;
            this.getHighSpeedVideoFpsRangesFor = listView;
            android.view.View view2 = this.Camera2StreamConfigurationMap;
            if (view2 != null) {
                listView.setEmptyView(view2);
            } else {
                java.lang.CharSequence charSequence = this.getHighResolutionOutputSizeshNQ4ISI;
                if (charSequence != null) {
                    this.getOutputFormats.setText(charSequence);
                    this.getHighSpeedVideoFpsRangesFor.setEmptyView(this.getOutputFormats);
                }
            }
        }
        this.getInputFormats = true;
        this.getHighSpeedVideoFpsRangesFor.setOnItemClickListener(this.getHighSpeedVideoSizesFor);
        android.widget.ListAdapter listAdapter = this.getHighSpeedVideoFpsRanges;
        if (listAdapter != null) {
            this.getHighSpeedVideoFpsRanges = null;
            setListAdapter(listAdapter);
        } else if (this.getOutputMinFrameDuration != null) {
            getHighResolutionOutputSizeshNQ4ISI(false, false);
        }
        this.getInputSizeshNQ4ISI.post(this.getOutputSizes);
    }
}
