package androidx.appcompat.app;

/* loaded from: classes3.dex */
public class AlertDialog extends androidx.appcompat.app.AppCompatDialog implements android.content.DialogInterface {
    final androidx.appcompat.app.AlertController getHighSpeedVideoFpsRangesFor;

    protected AlertDialog(android.content.Context context) {
        this(context, 0);
    }

    protected AlertDialog(android.content.Context context, int i) {
        super(context, getHighSpeedVideoFpsRanges(context, i));
        this.getHighSpeedVideoFpsRangesFor = new androidx.appcompat.app.AlertController(getContext(), this, getWindow());
    }

    protected AlertDialog(android.content.Context context, boolean z, android.content.DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    static int getHighSpeedVideoFpsRanges(android.content.Context context, int i) {
        if (((i >>> 24) & 255) > 0) {
            return i;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(androidx.appcompat.R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public android.widget.Button getButton(int i) {
        androidx.appcompat.app.AlertController alertController = this.getHighSpeedVideoFpsRangesFor;
        if (i == -3) {
            return alertController.getOutputFormats;
        }
        if (i == -2) {
            return alertController.getHighSpeedVideoSizes;
        }
        if (i != -1) {
            return null;
        }
        return alertController.getOutputMinFrameDurationlomOqCM;
    }

    public android.widget.ListView getListView() {
        return this.getHighSpeedVideoFpsRangesFor._BOUNDARY;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setTitle(java.lang.CharSequence charSequence) {
        super.setTitle(charSequence);
        androidx.appcompat.app.AlertController alertController = this.getHighSpeedVideoFpsRangesFor;
        alertController.resetTransaction = charSequence;
        android.widget.TextView textView = alertController.AMEXKernela;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setCustomTitle(android.view.View view) {
        this.getHighSpeedVideoFpsRangesFor.CoroutineDebuggingKt = view;
    }

    public void setMessage(java.lang.CharSequence charSequence) {
        androidx.appcompat.app.AlertController alertController = this.getHighSpeedVideoFpsRangesFor;
        alertController.f2660a = charSequence;
        android.widget.TextView textView = alertController.init;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setView(android.view.View view) {
        androidx.appcompat.app.AlertController alertController = this.getHighSpeedVideoFpsRangesFor;
        alertController.release = view;
        alertController.startTransaction = 0;
        alertController.AMEXKernelCallback = false;
    }

    public void setView(android.view.View view, int i, int i2, int i3, int i4) {
        this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(view, i, i2, i3, i4);
    }

    public void setButton(int i, java.lang.CharSequence charSequence, android.os.Message message) {
        this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(i, charSequence, null, message, null);
    }

    public void setButton(int i, java.lang.CharSequence charSequence, android.content.DialogInterface.OnClickListener onClickListener) {
        this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(i, charSequence, onClickListener, null, null);
    }

    public void setButton(int i, java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, android.content.DialogInterface.OnClickListener onClickListener) {
        this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(i, charSequence, onClickListener, null, drawable);
    }

    public void setIcon(int i) {
        this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(i);
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(drawable);
    }

    public void setIconAttribute(int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(typedValue.resourceId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.app.AppCompatDialog, androidx.view.ComponentDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        int i;
        android.view.View findViewById;
        android.widget.ListAdapter listAdapter;
        android.view.View findViewById2;
        super.onCreate(bundle);
        androidx.appcompat.app.AlertController alertController = this.getHighSpeedVideoFpsRangesFor;
        int i2 = alertController.getOutputSizeshNQ4ISI;
        if (i2 == 0 || alertController.getOutputSizes != 1) {
            i2 = alertController.getHighSpeedVideoFpsRanges;
        }
        alertController.coroutineCreation.setContentView(i2);
        android.view.View findViewById3 = alertController.requestPINEntry.findViewById(androidx.appcompat.R.id.parentPanel);
        android.view.View findViewById4 = findViewById3.findViewById(androidx.appcompat.R.id.topPanel);
        android.view.View findViewById5 = findViewById3.findViewById(androidx.appcompat.R.id.contentPanel);
        android.view.View findViewById6 = findViewById3.findViewById(androidx.appcompat.R.id.buttonPanel);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById3.findViewById(androidx.appcompat.R.id.customPanel);
        android.view.View view = alertController.release;
        if (view == null) {
            view = alertController.startTransaction != 0 ? android.view.LayoutInflater.from(alertController.isOutputSupportedFor).inflate(alertController.startTransaction, viewGroup, false) : null;
        }
        boolean z = view != null;
        if (!z || !androidx.appcompat.app.AlertController.getHighSpeedVideoSizes(view)) {
            alertController.requestPINEntry.setFlags(131072, 131072);
        }
        if (z) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) alertController.requestPINEntry.findViewById(androidx.appcompat.R.id.custom);
            frameLayout.addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
            if (alertController.AMEXKernelCallback) {
                frameLayout.setPadding(alertController.l, alertController.updateUI, alertController.requestGoOnline, alertController.exchange);
            }
            if (alertController._BOUNDARY != null) {
                ((androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams()).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        android.view.View findViewById7 = viewGroup.findViewById(androidx.appcompat.R.id.topPanel);
        android.view.View findViewById8 = viewGroup.findViewById(androidx.appcompat.R.id.contentPanel);
        android.view.View findViewById9 = viewGroup.findViewById(androidx.appcompat.R.id.buttonPanel);
        android.view.ViewGroup highResolutionOutputSizeshNQ4ISI = androidx.appcompat.app.AlertController.getHighResolutionOutputSizeshNQ4ISI(findViewById7, findViewById4);
        android.view.ViewGroup highResolutionOutputSizeshNQ4ISI2 = androidx.appcompat.app.AlertController.getHighResolutionOutputSizeshNQ4ISI(findViewById8, findViewById5);
        android.view.ViewGroup highResolutionOutputSizeshNQ4ISI3 = androidx.appcompat.app.AlertController.getHighResolutionOutputSizeshNQ4ISI(findViewById9, findViewById6);
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) alertController.requestPINEntry.findViewById(androidx.appcompat.R.id.scrollView);
        alertController.d = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.d.setNestedScrollingEnabled(false);
        android.widget.TextView textView = (android.widget.TextView) highResolutionOutputSizeshNQ4ISI2.findViewById(android.R.id.message);
        alertController.init = textView;
        if (textView != null) {
            java.lang.CharSequence charSequence = alertController.f2660a;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.d.removeView(alertController.init);
                if (alertController._BOUNDARY != null) {
                    android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) alertController.d.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.d);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController._BOUNDARY, indexOfChild, new android.view.ViewGroup.LayoutParams(-1, -1));
                } else {
                    highResolutionOutputSizeshNQ4ISI2.setVisibility(8);
                }
            }
        }
        android.widget.Button button = (android.widget.Button) highResolutionOutputSizeshNQ4ISI3.findViewById(android.R.id.button1);
        alertController.getOutputMinFrameDurationlomOqCM = button;
        button.setOnClickListener(alertController.Camera2StreamConfigurationMap);
        if (android.text.TextUtils.isEmpty(alertController.toString) && alertController.isOutputSupportedForhNQ4ISI == null) {
            alertController.getOutputMinFrameDurationlomOqCM.setVisibility(8);
            i = 0;
        } else {
            alertController.getOutputMinFrameDurationlomOqCM.setText(alertController.toString);
            android.graphics.drawable.Drawable drawable = alertController.isOutputSupportedForhNQ4ISI;
            if (drawable != null) {
                int i3 = alertController.getHighResolutionOutputSizeshNQ4ISI;
                drawable.setBounds(0, 0, i3, i3);
                alertController.getOutputMinFrameDurationlomOqCM.setCompoundDrawables(alertController.isOutputSupportedForhNQ4ISI, null, null, null);
            }
            alertController.getOutputMinFrameDurationlomOqCM.setVisibility(0);
            i = 1;
        }
        android.widget.Button button2 = (android.widget.Button) highResolutionOutputSizeshNQ4ISI3.findViewById(android.R.id.button2);
        alertController.getHighSpeedVideoSizes = button2;
        button2.setOnClickListener(alertController.Camera2StreamConfigurationMap);
        if (android.text.TextUtils.isEmpty(alertController.getInputSizeshNQ4ISI) && alertController.getHighSpeedVideoSizesFor == null) {
            alertController.getHighSpeedVideoSizes.setVisibility(8);
        } else {
            alertController.getHighSpeedVideoSizes.setText(alertController.getInputSizeshNQ4ISI);
            android.graphics.drawable.Drawable drawable2 = alertController.getHighSpeedVideoSizesFor;
            if (drawable2 != null) {
                int i4 = alertController.getHighResolutionOutputSizeshNQ4ISI;
                drawable2.setBounds(0, 0, i4, i4);
                alertController.getHighSpeedVideoSizes.setCompoundDrawables(alertController.getHighSpeedVideoSizesFor, null, null, null);
            }
            alertController.getHighSpeedVideoSizes.setVisibility(0);
            i |= 2;
        }
        android.widget.Button button3 = (android.widget.Button) highResolutionOutputSizeshNQ4ISI3.findViewById(android.R.id.button3);
        alertController.getOutputFormats = button3;
        button3.setOnClickListener(alertController.Camera2StreamConfigurationMap);
        if (android.text.TextUtils.isEmpty(alertController.getOutputStallDurationlomOqCM) && alertController.getInputFormats == null) {
            alertController.getOutputFormats.setVisibility(8);
        } else {
            alertController.getOutputFormats.setText(alertController.getOutputStallDurationlomOqCM);
            android.graphics.drawable.Drawable drawable3 = alertController.getInputFormats;
            if (drawable3 != null) {
                int i5 = alertController.getHighResolutionOutputSizeshNQ4ISI;
                drawable3.setBounds(0, 0, i5, i5);
                alertController.getOutputFormats.setCompoundDrawables(alertController.getInputFormats, null, null, null);
            }
            alertController.getOutputFormats.setVisibility(0);
            i |= 4;
        }
        android.content.Context context = alertController.isOutputSupportedFor;
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(androidx.appcompat.R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                androidx.appcompat.app.AlertController.getHighSpeedVideoFpsRangesFor(alertController.getOutputMinFrameDurationlomOqCM);
            } else if (i == 2) {
                androidx.appcompat.app.AlertController.getHighSpeedVideoFpsRangesFor(alertController.getHighSpeedVideoSizes);
            } else if (i == 4) {
                androidx.appcompat.app.AlertController.getHighSpeedVideoFpsRangesFor(alertController.getOutputFormats);
            }
        }
        if (i == 0) {
            highResolutionOutputSizeshNQ4ISI3.setVisibility(8);
        }
        if (alertController.CoroutineDebuggingKt != null) {
            highResolutionOutputSizeshNQ4ISI.addView(alertController.CoroutineDebuggingKt, 0, new android.view.ViewGroup.LayoutParams(-1, -2));
            alertController.requestPINEntry.findViewById(androidx.appcompat.R.id.title_template).setVisibility(8);
        } else {
            alertController.getARTIFICIAL_FRAME_PACKAGE_NAME = (android.widget.ImageView) alertController.requestPINEntry.findViewById(android.R.id.icon);
            if (!android.text.TextUtils.isEmpty(alertController.resetTransaction) && alertController.AMEXKernel) {
                android.widget.TextView textView2 = (android.widget.TextView) alertController.requestPINEntry.findViewById(androidx.appcompat.R.id.alertTitle);
                alertController.AMEXKernela = textView2;
                textView2.setText(alertController.resetTransaction);
                int i6 = alertController.accessartificialFrame;
                if (i6 != 0) {
                    alertController.getARTIFICIAL_FRAME_PACKAGE_NAME.setImageResource(i6);
                } else {
                    android.graphics.drawable.Drawable drawable4 = alertController.ArtificialStackFrames;
                    if (drawable4 != null) {
                        alertController.getARTIFICIAL_FRAME_PACKAGE_NAME.setImageDrawable(drawable4);
                    } else {
                        alertController.AMEXKernela.setPadding(alertController.getARTIFICIAL_FRAME_PACKAGE_NAME.getPaddingLeft(), alertController.getARTIFICIAL_FRAME_PACKAGE_NAME.getPaddingTop(), alertController.getARTIFICIAL_FRAME_PACKAGE_NAME.getPaddingRight(), alertController.getARTIFICIAL_FRAME_PACKAGE_NAME.getPaddingBottom());
                        alertController.getARTIFICIAL_FRAME_PACKAGE_NAME.setVisibility(8);
                    }
                }
            } else {
                alertController.requestPINEntry.findViewById(androidx.appcompat.R.id.title_template).setVisibility(8);
                alertController.getARTIFICIAL_FRAME_PACKAGE_NAME.setVisibility(8);
                highResolutionOutputSizeshNQ4ISI.setVisibility(8);
            }
        }
        boolean z2 = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z3 = (highResolutionOutputSizeshNQ4ISI == null || highResolutionOutputSizeshNQ4ISI.getVisibility() == 8) ? 0 : 1;
        boolean z4 = (highResolutionOutputSizeshNQ4ISI3 == null || highResolutionOutputSizeshNQ4ISI3.getVisibility() == 8) ? false : true;
        if (!z4 && highResolutionOutputSizeshNQ4ISI2 != null && (findViewById2 = highResolutionOutputSizeshNQ4ISI2.findViewById(androidx.appcompat.R.id.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z3 != 0) {
            androidx.core.widget.NestedScrollView nestedScrollView2 = alertController.d;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            android.view.View findViewById10 = (alertController.f2660a == null && alertController._BOUNDARY == null) ? null : highResolutionOutputSizeshNQ4ISI.findViewById(androidx.appcompat.R.id.titleDividerNoCustom);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (highResolutionOutputSizeshNQ4ISI2 != null && (findViewById = highResolutionOutputSizeshNQ4ISI2.findViewById(androidx.appcompat.R.id.textSpacerNoTitle)) != null) {
            findViewById.setVisibility(0);
        }
        android.widget.ListView listView = alertController._BOUNDARY;
        if (listView instanceof androidx.appcompat.app.AlertController.RecycleListView) {
            ((androidx.appcompat.app.AlertController.RecycleListView) listView).setHasDecor(z3, z4);
        }
        if (!z2) {
            android.view.View view2 = alertController._BOUNDARY;
            if (view2 == null) {
                view2 = alertController.d;
            }
            if (view2 != null) {
                int i7 = z3 | (z4 ? 2 : 0);
                android.view.View findViewById11 = alertController.requestPINEntry.findViewById(androidx.appcompat.R.id.scrollIndicatorUp);
                android.view.View findViewById12 = alertController.requestPINEntry.findViewById(androidx.appcompat.R.id.scrollIndicatorDown);
                androidx.core.view.ViewCompat.setScrollIndicators(view2, i7, 3);
                if (findViewById11 != null) {
                    highResolutionOutputSizeshNQ4ISI2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    highResolutionOutputSizeshNQ4ISI2.removeView(findViewById12);
                }
            }
        }
        android.widget.ListView listView2 = alertController._BOUNDARY;
        if (listView2 == null || (listAdapter = alertController.getHighSpeedVideoFpsRangesFor) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i8 = alertController.unwrapAs;
        if (i8 >= 0) {
            listView2.setItemChecked(i8, true);
            listView2.setSelection(i8);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        androidx.core.widget.NestedScrollView nestedScrollView = this.getHighSpeedVideoFpsRangesFor.d;
        if (nestedScrollView == null || !nestedScrollView.executeKeyEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        androidx.core.widget.NestedScrollView nestedScrollView = this.getHighSpeedVideoFpsRangesFor.d;
        if (nestedScrollView == null || !nestedScrollView.executeKeyEvent(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public static class Builder {
        private final androidx.appcompat.app.AlertController.AlertParams P;
        private final int mTheme;

        public Builder(android.content.Context context) {
            this(context, androidx.appcompat.app.AlertDialog.getHighSpeedVideoFpsRanges(context, 0));
        }

        public Builder(android.content.Context context, int i) {
            this.P = new androidx.appcompat.app.AlertController.AlertParams(new android.view.ContextThemeWrapper(context, androidx.appcompat.app.AlertDialog.getHighSpeedVideoFpsRanges(context, i)));
            this.mTheme = i;
        }

        public android.content.Context getContext() {
            return this.P.mContext;
        }

        public androidx.appcompat.app.AlertDialog.Builder setTitle(int i) {
            androidx.appcompat.app.AlertController.AlertParams alertParams = this.P;
            alertParams.mTitle = alertParams.mContext.getText(i);
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setTitle(java.lang.CharSequence charSequence) {
            this.P.mTitle = charSequence;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setCustomTitle(android.view.View view) {
            this.P.mCustomTitleView = view;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setMessage(int i) {
            androidx.appcompat.app.AlertController.AlertParams alertParams = this.P;
            alertParams.mMessage = alertParams.mContext.getText(i);
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setMessage(java.lang.CharSequence charSequence) {
            this.P.mMessage = charSequence;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setIcon(int i) {
            this.P.mIconId = i;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setIcon(android.graphics.drawable.Drawable drawable) {
            this.P.mIcon = drawable;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setIconAttribute(int i) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            this.P.mContext.getTheme().resolveAttribute(i, typedValue, true);
            this.P.mIconId = typedValue.resourceId;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setPositiveButton(int i, android.content.DialogInterface.OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.AlertParams alertParams = this.P;
            alertParams.mPositiveButtonText = alertParams.mContext.getText(i);
            this.P.mPositiveButtonListener = onClickListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setPositiveButton(java.lang.CharSequence charSequence, android.content.DialogInterface.OnClickListener onClickListener) {
            this.P.mPositiveButtonText = charSequence;
            this.P.mPositiveButtonListener = onClickListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setPositiveButtonIcon(android.graphics.drawable.Drawable drawable) {
            this.P.mPositiveButtonIcon = drawable;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setNegativeButton(int i, android.content.DialogInterface.OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.AlertParams alertParams = this.P;
            alertParams.mNegativeButtonText = alertParams.mContext.getText(i);
            this.P.mNegativeButtonListener = onClickListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setNegativeButton(java.lang.CharSequence charSequence, android.content.DialogInterface.OnClickListener onClickListener) {
            this.P.mNegativeButtonText = charSequence;
            this.P.mNegativeButtonListener = onClickListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setNegativeButtonIcon(android.graphics.drawable.Drawable drawable) {
            this.P.mNegativeButtonIcon = drawable;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setNeutralButton(int i, android.content.DialogInterface.OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.AlertParams alertParams = this.P;
            alertParams.mNeutralButtonText = alertParams.mContext.getText(i);
            this.P.mNeutralButtonListener = onClickListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setNeutralButton(java.lang.CharSequence charSequence, android.content.DialogInterface.OnClickListener onClickListener) {
            this.P.mNeutralButtonText = charSequence;
            this.P.mNeutralButtonListener = onClickListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setNeutralButtonIcon(android.graphics.drawable.Drawable drawable) {
            this.P.mNeutralButtonIcon = drawable;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setCancelable(boolean z) {
            this.P.mCancelable = z;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setOnCancelListener(android.content.DialogInterface.OnCancelListener onCancelListener) {
            this.P.mOnCancelListener = onCancelListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setOnDismissListener(android.content.DialogInterface.OnDismissListener onDismissListener) {
            this.P.mOnDismissListener = onDismissListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setOnKeyListener(android.content.DialogInterface.OnKeyListener onKeyListener) {
            this.P.mOnKeyListener = onKeyListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setItems(int i, android.content.DialogInterface.OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = alertParams.mContext.getResources().getTextArray(i);
            this.P.mOnClickListener = onClickListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setItems(java.lang.CharSequence[] charSequenceArr, android.content.DialogInterface.OnClickListener onClickListener) {
            this.P.mItems = charSequenceArr;
            this.P.mOnClickListener = onClickListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setAdapter(android.widget.ListAdapter listAdapter, android.content.DialogInterface.OnClickListener onClickListener) {
            this.P.mAdapter = listAdapter;
            this.P.mOnClickListener = onClickListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setCursor(android.database.Cursor cursor, android.content.DialogInterface.OnClickListener onClickListener, java.lang.String str) {
            this.P.mCursor = cursor;
            this.P.mLabelColumn = str;
            this.P.mOnClickListener = onClickListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setMultiChoiceItems(int i, boolean[] zArr, android.content.DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            androidx.appcompat.app.AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = alertParams.mContext.getResources().getTextArray(i);
            this.P.mOnCheckboxClickListener = onMultiChoiceClickListener;
            this.P.mCheckedItems = zArr;
            this.P.mIsMultiChoice = true;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setMultiChoiceItems(java.lang.CharSequence[] charSequenceArr, boolean[] zArr, android.content.DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            this.P.mItems = charSequenceArr;
            this.P.mOnCheckboxClickListener = onMultiChoiceClickListener;
            this.P.mCheckedItems = zArr;
            this.P.mIsMultiChoice = true;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setMultiChoiceItems(android.database.Cursor cursor, java.lang.String str, java.lang.String str2, android.content.DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            this.P.mCursor = cursor;
            this.P.mOnCheckboxClickListener = onMultiChoiceClickListener;
            this.P.mIsCheckedColumn = str;
            this.P.mLabelColumn = str2;
            this.P.mIsMultiChoice = true;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setSingleChoiceItems(int i, int i2, android.content.DialogInterface.OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = alertParams.mContext.getResources().getTextArray(i);
            this.P.mOnClickListener = onClickListener;
            this.P.mCheckedItem = i2;
            this.P.mIsSingleChoice = true;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setSingleChoiceItems(android.database.Cursor cursor, int i, java.lang.String str, android.content.DialogInterface.OnClickListener onClickListener) {
            this.P.mCursor = cursor;
            this.P.mOnClickListener = onClickListener;
            this.P.mCheckedItem = i;
            this.P.mLabelColumn = str;
            this.P.mIsSingleChoice = true;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setSingleChoiceItems(java.lang.CharSequence[] charSequenceArr, int i, android.content.DialogInterface.OnClickListener onClickListener) {
            this.P.mItems = charSequenceArr;
            this.P.mOnClickListener = onClickListener;
            this.P.mCheckedItem = i;
            this.P.mIsSingleChoice = true;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setSingleChoiceItems(android.widget.ListAdapter listAdapter, int i, android.content.DialogInterface.OnClickListener onClickListener) {
            this.P.mAdapter = listAdapter;
            this.P.mOnClickListener = onClickListener;
            this.P.mCheckedItem = i;
            this.P.mIsSingleChoice = true;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.P.mOnItemSelectedListener = onItemSelectedListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setView(int i) {
            this.P.mView = null;
            this.P.mViewLayoutResId = i;
            this.P.mViewSpacingSpecified = false;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setView(android.view.View view) {
            this.P.mView = view;
            this.P.mViewLayoutResId = 0;
            this.P.mViewSpacingSpecified = false;
            return this;
        }

        @java.lang.Deprecated
        public androidx.appcompat.app.AlertDialog.Builder setView(android.view.View view, int i, int i2, int i3, int i4) {
            this.P.mView = view;
            this.P.mViewLayoutResId = 0;
            this.P.mViewSpacingSpecified = true;
            this.P.mViewSpacingLeft = i;
            this.P.mViewSpacingTop = i2;
            this.P.mViewSpacingRight = i3;
            this.P.mViewSpacingBottom = i4;
            return this;
        }

        @java.lang.Deprecated
        public androidx.appcompat.app.AlertDialog.Builder setInverseBackgroundForced(boolean z) {
            this.P.mForceInverseBackground = z;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setRecycleOnMeasureEnabled(boolean z) {
            this.P.mRecycleOnMeasure = z;
            return this;
        }

        public androidx.appcompat.app.AlertDialog create() {
            androidx.appcompat.app.AlertDialog alertDialog = new androidx.appcompat.app.AlertDialog(this.P.mContext, this.mTheme);
            this.P.apply(alertDialog.getHighSpeedVideoFpsRangesFor);
            alertDialog.setCancelable(this.P.mCancelable);
            if (this.P.mCancelable) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(this.P.mOnCancelListener);
            alertDialog.setOnDismissListener(this.P.mOnDismissListener);
            if (this.P.mOnKeyListener != null) {
                alertDialog.setOnKeyListener(this.P.mOnKeyListener);
            }
            return alertDialog;
        }

        public androidx.appcompat.app.AlertDialog show() {
            androidx.appcompat.app.AlertDialog create = create();
            create.show();
            return create;
        }
    }
}
