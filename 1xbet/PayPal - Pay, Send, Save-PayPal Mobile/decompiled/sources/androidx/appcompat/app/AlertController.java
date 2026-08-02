package androidx.appcompat.app;

/* loaded from: classes3.dex */
class AlertController {
    boolean AMEXKernel;
    android.widget.TextView AMEXKernela;
    android.graphics.drawable.Drawable ArtificialStackFrames;
    android.view.View CoroutineDebuggingKt;
    android.widget.ListView _BOUNDARY;
    int _CREATION;

    /* renamed from: a, reason: collision with root package name */
    java.lang.CharSequence f2660a;
    int b;
    int c;
    android.os.Handler coroutineBoundary;
    final androidx.appcompat.app.AppCompatDialog coroutineCreation;
    androidx.core.widget.NestedScrollView d;
    int exchange;
    android.widget.ImageView getARTIFICIAL_FRAME_PACKAGE_NAME;
    final int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    android.widget.ListAdapter getHighSpeedVideoFpsRangesFor;
    android.widget.Button getHighSpeedVideoSizes;
    android.graphics.drawable.Drawable getHighSpeedVideoSizesFor;
    android.graphics.drawable.Drawable getInputFormats;
    java.lang.CharSequence getInputSizeshNQ4ISI;
    android.widget.Button getOutputFormats;
    android.os.Message getOutputMinFrameDuration;
    android.widget.Button getOutputMinFrameDurationlomOqCM;
    int getOutputSizeshNQ4ISI;
    android.os.Message getOutputStallDuration;
    java.lang.CharSequence getOutputStallDurationlomOqCM;
    android.os.Message getValidOutputFormatsForInputhNQ4ISI;
    android.widget.TextView init;
    final android.content.Context isOutputSupportedFor;
    android.graphics.drawable.Drawable isOutputSupportedForhNQ4ISI;
    int kernelVersion;
    int l;
    android.view.View release;
    int requestGoOnline;
    final android.view.Window requestPINEntry;
    java.lang.CharSequence resetTransaction;
    int startTransaction;
    java.lang.CharSequence toString;
    int updateUI;
    boolean AMEXKernelCallback = false;
    int accessartificialFrame = 0;
    int unwrapAs = -1;
    int getOutputSizes = 0;
    final android.view.View.OnClickListener Camera2StreamConfigurationMap = new android.view.View.OnClickListener() { // from class: androidx.appcompat.app.AlertController.1
        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            android.os.Message obtain;
            if (view == androidx.appcompat.app.AlertController.this.getOutputMinFrameDurationlomOqCM && androidx.appcompat.app.AlertController.this.getValidOutputFormatsForInputhNQ4ISI != null) {
                obtain = android.os.Message.obtain(androidx.appcompat.app.AlertController.this.getValidOutputFormatsForInputhNQ4ISI);
            } else if (view == androidx.appcompat.app.AlertController.this.getHighSpeedVideoSizes && androidx.appcompat.app.AlertController.this.getOutputMinFrameDuration != null) {
                obtain = android.os.Message.obtain(androidx.appcompat.app.AlertController.this.getOutputMinFrameDuration);
            } else {
                obtain = (view != androidx.appcompat.app.AlertController.this.getOutputFormats || androidx.appcompat.app.AlertController.this.getOutputStallDuration == null) ? null : android.os.Message.obtain(androidx.appcompat.app.AlertController.this.getOutputStallDuration);
            }
            if (obtain != null) {
                obtain.sendToTarget();
            }
            androidx.appcompat.app.AlertController.this.coroutineBoundary.obtainMessage(1, androidx.appcompat.app.AlertController.this.coroutineCreation).sendToTarget();
        }
    };

    static final class ButtonHandler extends android.os.Handler {
        private java.lang.ref.WeakReference<android.content.DialogInterface> getHighResolutionOutputSizeshNQ4ISI;

        public ButtonHandler(android.content.DialogInterface dialogInterface) {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.ref.WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((android.content.DialogInterface.OnClickListener) message.obj).onClick(this.getHighResolutionOutputSizeshNQ4ISI.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((android.content.DialogInterface) message.obj).dismiss();
            }
        }
    }

    public AlertController(android.content.Context context, androidx.appcompat.app.AppCompatDialog appCompatDialog, android.view.Window window) {
        this.isOutputSupportedFor = context;
        this.coroutineCreation = appCompatDialog;
        this.requestPINEntry = window;
        this.coroutineBoundary = new androidx.appcompat.app.AlertController.ButtonHandler(appCompatDialog);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, androidx.appcompat.R.styleable.AlertDialog, androidx.appcompat.R.attr.alertDialogStyle, 0);
        this.getHighSpeedVideoFpsRanges = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_android_layout, 0);
        this.getOutputSizeshNQ4ISI = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_buttonPanelSideLayout, 0);
        this._CREATION = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_listLayout, 0);
        this.kernelVersion = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.c = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.b = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.AlertDialog_listItemLayout, 0);
        this.AMEXKernel = obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AlertDialog_showTitle, true);
        this.getHighResolutionOutputSizeshNQ4ISI = obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        appCompatDialog.supportRequestWindowFeature(1);
    }

    static boolean getHighSpeedVideoSizes(android.view.View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return false;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (getHighSpeedVideoSizes(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(android.view.View view, int i, int i2, int i3, int i4) {
        this.release = view;
        this.startTransaction = 0;
        this.AMEXKernelCallback = true;
        this.l = i;
        this.updateUI = i2;
        this.requestGoOnline = i3;
        this.exchange = i4;
    }

    public final void Camera2StreamConfigurationMap(int i, java.lang.CharSequence charSequence, android.content.DialogInterface.OnClickListener onClickListener, android.os.Message message, android.graphics.drawable.Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.coroutineBoundary.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.getOutputStallDurationlomOqCM = charSequence;
            this.getOutputStallDuration = message;
            this.getInputFormats = drawable;
        } else if (i == -2) {
            this.getInputSizeshNQ4ISI = charSequence;
            this.getOutputMinFrameDuration = message;
            this.getHighSpeedVideoSizesFor = drawable;
        } else {
            if (i == -1) {
                this.toString = charSequence;
                this.getValidOutputFormatsForInputhNQ4ISI = message;
                this.isOutputSupportedForhNQ4ISI = drawable;
                return;
            }
            throw new java.lang.IllegalArgumentException("Button does not exist");
        }
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(int i) {
        this.ArtificialStackFrames = null;
        this.accessartificialFrame = i;
        android.widget.ImageView imageView = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        if (imageView != null) {
            if (i != 0) {
                imageView.setVisibility(0);
                this.getARTIFICIAL_FRAME_PACKAGE_NAME.setImageResource(this.accessartificialFrame);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    public final void Camera2StreamConfigurationMap(android.graphics.drawable.Drawable drawable) {
        this.ArtificialStackFrames = drawable;
        this.accessartificialFrame = 0;
        android.widget.ImageView imageView = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.getARTIFICIAL_FRAME_PACKAGE_NAME.setImageDrawable(drawable);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    static android.view.ViewGroup getHighResolutionOutputSizeshNQ4ISI(android.view.View view, android.view.View view2) {
        if (view == null) {
            if (view2 instanceof android.view.ViewStub) {
                view2 = ((android.view.ViewStub) view2).inflate();
            }
            return (android.view.ViewGroup) view2;
        }
        if (view2 != null) {
            android.view.ViewParent parent = view2.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof android.view.ViewStub) {
            view = ((android.view.ViewStub) view).inflate();
        }
        return (android.view.ViewGroup) view;
    }

    /* renamed from: androidx.appcompat.app.AlertController$2, reason: invalid class name */
    class AnonymousClass2 implements androidx.core.widget.NestedScrollView.OnScrollChangeListener {
        final /* synthetic */ android.view.View getHighSpeedVideoFpsRanges;
        final /* synthetic */ android.view.View getHighSpeedVideoFpsRangesFor;

        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        public void onScrollChange(androidx.core.widget.NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            androidx.appcompat.app.AlertController.getHighResolutionOutputSizeshNQ4ISI(nestedScrollView, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$3, reason: invalid class name */
    class AnonymousClass3 implements java.lang.Runnable {
        final /* synthetic */ androidx.appcompat.app.AlertController Camera2StreamConfigurationMap;
        final /* synthetic */ android.view.View getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ android.view.View getHighSpeedVideoSizes;

        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.app.AlertController.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap.d, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$4, reason: invalid class name */
    class AnonymousClass4 implements android.widget.AbsListView.OnScrollListener {
        final /* synthetic */ android.view.View getHighSpeedVideoFpsRanges;
        final /* synthetic */ android.view.View getHighSpeedVideoSizes;

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(android.widget.AbsListView absListView, int i) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(android.widget.AbsListView absListView, int i, int i2, int i3) {
            androidx.appcompat.app.AlertController.getHighResolutionOutputSizeshNQ4ISI(absListView, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$5, reason: invalid class name */
    class AnonymousClass5 implements java.lang.Runnable {
        final /* synthetic */ android.view.View getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.appcompat.app.AlertController getHighSpeedVideoFpsRanges;
        final /* synthetic */ android.view.View getHighSpeedVideoFpsRangesFor;

        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.app.AlertController.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges._BOUNDARY, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI(android.view.View view, android.view.View view2, android.view.View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    static void getHighSpeedVideoFpsRangesFor(android.widget.Button button) {
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static class RecycleListView extends android.widget.ListView {
        private final int getHighResolutionOutputSizeshNQ4ISI;
        private final int getHighSpeedVideoFpsRanges;

        public RecycleListView(android.content.Context context) {
            this(context, null);
        }

        public RecycleListView(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.RecycleListView);
            this.getHighResolutionOutputSizeshNQ4ISI = obtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.RecycleListView_paddingBottomNoButtons, -1);
            this.getHighSpeedVideoFpsRanges = obtainStyledAttributes.getDimensionPixelOffset(androidx.appcompat.R.styleable.RecycleListView_paddingTopNoTitle, -1);
        }

        public void setHasDecor(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.getHighSpeedVideoFpsRanges, getPaddingRight(), z2 ? getPaddingBottom() : this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    public static class AlertParams {
        public android.widget.ListAdapter mAdapter;
        public boolean[] mCheckedItems;
        public final android.content.Context mContext;
        public android.database.Cursor mCursor;
        public android.view.View mCustomTitleView;
        public boolean mForceInverseBackground;
        public android.graphics.drawable.Drawable mIcon;
        public final android.view.LayoutInflater mInflater;
        public java.lang.String mIsCheckedColumn;
        public boolean mIsMultiChoice;
        public boolean mIsSingleChoice;
        public java.lang.CharSequence[] mItems;
        public java.lang.String mLabelColumn;
        public java.lang.CharSequence mMessage;
        public android.graphics.drawable.Drawable mNegativeButtonIcon;
        public android.content.DialogInterface.OnClickListener mNegativeButtonListener;
        public java.lang.CharSequence mNegativeButtonText;
        public android.graphics.drawable.Drawable mNeutralButtonIcon;
        public android.content.DialogInterface.OnClickListener mNeutralButtonListener;
        public java.lang.CharSequence mNeutralButtonText;
        public android.content.DialogInterface.OnCancelListener mOnCancelListener;
        public android.content.DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
        public android.content.DialogInterface.OnClickListener mOnClickListener;
        public android.content.DialogInterface.OnDismissListener mOnDismissListener;
        public android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener;
        public android.content.DialogInterface.OnKeyListener mOnKeyListener;
        public androidx.appcompat.app.AlertController.AlertParams.OnPrepareListViewListener mOnPrepareListViewListener;
        public android.graphics.drawable.Drawable mPositiveButtonIcon;
        public android.content.DialogInterface.OnClickListener mPositiveButtonListener;
        public java.lang.CharSequence mPositiveButtonText;
        public java.lang.CharSequence mTitle;
        public android.view.View mView;
        public int mViewLayoutResId;
        public int mViewSpacingBottom;
        public int mViewSpacingLeft;
        public int mViewSpacingRight;
        public int mViewSpacingTop;
        public int mIconId = 0;
        public int mIconAttrId = 0;
        public boolean mViewSpacingSpecified = false;
        public int mCheckedItem = -1;
        public boolean mRecycleOnMeasure = true;
        public boolean mCancelable = true;

        public interface OnPrepareListViewListener {
            void onPrepareListView(android.widget.ListView listView);
        }

        public AlertParams(android.content.Context context) {
            this.mContext = context;
            this.mInflater = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void apply(final androidx.appcompat.app.AlertController alertController) {
            int i;
            android.widget.ListAdapter listAdapter;
            android.view.View view = this.mCustomTitleView;
            if (view == null) {
                java.lang.CharSequence charSequence = this.mTitle;
                if (charSequence != null) {
                    alertController.resetTransaction = charSequence;
                    android.widget.TextView textView = alertController.AMEXKernela;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                android.graphics.drawable.Drawable drawable = this.mIcon;
                if (drawable != null) {
                    alertController.Camera2StreamConfigurationMap(drawable);
                }
                int i2 = this.mIconId;
                if (i2 != 0) {
                    alertController.getHighResolutionOutputSizeshNQ4ISI(i2);
                }
                int i3 = this.mIconAttrId;
                if (i3 != 0) {
                    android.util.TypedValue typedValue = new android.util.TypedValue();
                    alertController.isOutputSupportedFor.getTheme().resolveAttribute(i3, typedValue, true);
                    alertController.getHighResolutionOutputSizeshNQ4ISI(typedValue.resourceId);
                }
            } else {
                alertController.CoroutineDebuggingKt = view;
            }
            java.lang.CharSequence charSequence2 = this.mMessage;
            if (charSequence2 != null) {
                alertController.f2660a = charSequence2;
                android.widget.TextView textView2 = alertController.init;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            java.lang.CharSequence charSequence3 = this.mPositiveButtonText;
            if (charSequence3 != null || this.mPositiveButtonIcon != null) {
                alertController.Camera2StreamConfigurationMap(-1, charSequence3, this.mPositiveButtonListener, null, this.mPositiveButtonIcon);
            }
            java.lang.CharSequence charSequence4 = this.mNegativeButtonText;
            if (charSequence4 != null || this.mNegativeButtonIcon != null) {
                alertController.Camera2StreamConfigurationMap(-2, charSequence4, this.mNegativeButtonListener, null, this.mNegativeButtonIcon);
            }
            java.lang.CharSequence charSequence5 = this.mNeutralButtonText;
            if (charSequence5 != null || this.mNeutralButtonIcon != null) {
                alertController.Camera2StreamConfigurationMap(-3, charSequence5, this.mNeutralButtonListener, null, this.mNeutralButtonIcon);
            }
            if (this.mItems != null || this.mCursor != null || this.mAdapter != null) {
                final androidx.appcompat.app.AlertController.RecycleListView recycleListView = (androidx.appcompat.app.AlertController.RecycleListView) this.mInflater.inflate(alertController._CREATION, (android.view.ViewGroup) null);
                if (this.mIsMultiChoice) {
                    if (this.mCursor == null) {
                        listAdapter = new android.widget.ArrayAdapter<java.lang.CharSequence>(this.mContext, alertController.kernelVersion, this.mItems) { // from class: androidx.appcompat.app.AlertController.AlertParams.1
                            @Override // android.widget.ArrayAdapter, android.widget.Adapter
                            public android.view.View getView(int i4, android.view.View view2, android.view.ViewGroup viewGroup) {
                                android.view.View view3 = super.getView(i4, view2, viewGroup);
                                if (androidx.appcompat.app.AlertController.AlertParams.this.mCheckedItems != null && androidx.appcompat.app.AlertController.AlertParams.this.mCheckedItems[i4]) {
                                    recycleListView.setItemChecked(i4, true);
                                }
                                return view3;
                            }
                        };
                    } else {
                        listAdapter = new android.widget.CursorAdapter(this.mContext, this.mCursor) { // from class: androidx.appcompat.app.AlertController.AlertParams.2
                            private final int getHighResolutionOutputSizeshNQ4ISI;
                            private final int getHighSpeedVideoSizes;

                            {
                                android.database.Cursor cursor = getCursor();
                                this.getHighSpeedVideoSizes = cursor.getColumnIndexOrThrow(androidx.appcompat.app.AlertController.AlertParams.this.mLabelColumn);
                                this.getHighResolutionOutputSizeshNQ4ISI = cursor.getColumnIndexOrThrow(androidx.appcompat.app.AlertController.AlertParams.this.mIsCheckedColumn);
                            }

                            @Override // android.widget.CursorAdapter
                            public void bindView(android.view.View view2, android.content.Context context, android.database.Cursor cursor) {
                                ((android.widget.CheckedTextView) view2.findViewById(android.R.id.text1)).setText(cursor.getString(this.getHighSpeedVideoSizes));
                                recycleListView.setItemChecked(cursor.getPosition(), cursor.getInt(this.getHighResolutionOutputSizeshNQ4ISI) == 1);
                            }

                            @Override // android.widget.CursorAdapter
                            public android.view.View newView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup viewGroup) {
                                return androidx.appcompat.app.AlertController.AlertParams.this.mInflater.inflate(alertController.kernelVersion, viewGroup, false);
                            }
                        };
                    }
                } else {
                    if (this.mIsSingleChoice) {
                        i = alertController.c;
                    } else {
                        i = alertController.b;
                    }
                    int i4 = i;
                    android.database.Cursor cursor = this.mCursor;
                    if (cursor != null) {
                        listAdapter = new android.widget.SimpleCursorAdapter(this.mContext, i4, cursor, new java.lang.String[]{this.mLabelColumn}, new int[]{android.R.id.text1});
                    } else {
                        listAdapter = this.mAdapter;
                        if (listAdapter == null) {
                            listAdapter = new androidx.appcompat.app.AlertController.CheckedItemAdapter(this.mContext, i4, this.mItems);
                        }
                    }
                }
                androidx.appcompat.app.AlertController.AlertParams.OnPrepareListViewListener onPrepareListViewListener = this.mOnPrepareListViewListener;
                if (onPrepareListViewListener != null) {
                    onPrepareListViewListener.onPrepareListView(recycleListView);
                }
                alertController.getHighSpeedVideoFpsRangesFor = listAdapter;
                alertController.unwrapAs = this.mCheckedItem;
                if (this.mOnClickListener != null) {
                    recycleListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() { // from class: androidx.appcompat.app.AlertController.AlertParams.3
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view2, int i5, long j) {
                            androidx.appcompat.app.AlertController.AlertParams.this.mOnClickListener.onClick(alertController.coroutineCreation, i5);
                            if (androidx.appcompat.app.AlertController.AlertParams.this.mIsSingleChoice) {
                                return;
                            }
                            alertController.coroutineCreation.dismiss();
                        }
                    });
                } else if (this.mOnCheckboxClickListener != null) {
                    recycleListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() { // from class: androidx.appcompat.app.AlertController.AlertParams.4
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view2, int i5, long j) {
                            if (androidx.appcompat.app.AlertController.AlertParams.this.mCheckedItems != null) {
                                androidx.appcompat.app.AlertController.AlertParams.this.mCheckedItems[i5] = recycleListView.isItemChecked(i5);
                            }
                            androidx.appcompat.app.AlertController.AlertParams.this.mOnCheckboxClickListener.onClick(alertController.coroutineCreation, i5, recycleListView.isItemChecked(i5));
                        }
                    });
                }
                android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener = this.mOnItemSelectedListener;
                if (onItemSelectedListener != null) {
                    recycleListView.setOnItemSelectedListener(onItemSelectedListener);
                }
                if (this.mIsSingleChoice) {
                    recycleListView.setChoiceMode(1);
                } else if (this.mIsMultiChoice) {
                    recycleListView.setChoiceMode(2);
                }
                alertController._BOUNDARY = recycleListView;
            }
            android.view.View view2 = this.mView;
            if (view2 != null) {
                if (this.mViewSpacingSpecified) {
                    alertController.getHighResolutionOutputSizeshNQ4ISI(view2, this.mViewSpacingLeft, this.mViewSpacingTop, this.mViewSpacingRight, this.mViewSpacingBottom);
                    return;
                }
                alertController.release = view2;
                alertController.startTransaction = 0;
                alertController.AMEXKernelCallback = false;
                return;
            }
            int i5 = this.mViewLayoutResId;
            if (i5 != 0) {
                alertController.release = null;
                alertController.startTransaction = i5;
                alertController.AMEXKernelCallback = false;
            }
        }
    }

    static class CheckedItemAdapter extends android.widget.ArrayAdapter<java.lang.CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }

        public CheckedItemAdapter(android.content.Context context, int i, java.lang.CharSequence[] charSequenceArr) {
            super(context, i, android.R.id.text1, charSequenceArr);
        }
    }
}
