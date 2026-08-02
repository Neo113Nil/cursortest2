package androidx.appcompat.widget;

/* loaded from: classes5.dex */
public class SearchView extends androidx.appcompat.widget.LinearLayoutCompat implements androidx.appcompat.view.CollapsibleActionView {
    static final androidx.appcompat.widget.SearchView.PreQAutoCompleteTextViewReflector getHighSpeedVideoSizes;
    private androidx.appcompat.widget.SearchView.OnQueryTextListener AMEXKernel;
    private android.graphics.Rect AMEXKernelCallback;
    private androidx.appcompat.widget.SearchView.UpdatableTouchDelegate AMEXKernelJNI;
    private boolean AMEXKernelProvider;
    private java.lang.Runnable AMEXKernela;
    private final android.widget.ImageView ArtificialStackFrames;
    final android.widget.ImageView Camera2StreamConfigurationMap;
    private boolean CoroutineDebuggingKt;
    private int _BOUNDARY;
    private final android.widget.TextView.OnEditorActionListener _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private java.lang.CharSequence f2668a;
    private int accessartificialFrame;
    private final android.view.View.OnClickListener b;
    private android.view.View.OnClickListener c;
    private final java.lang.CharSequence coroutineBoundary;
    private boolean coroutineCreation;
    private final android.widget.AdapterView.OnItemClickListener d;
    private boolean exchange;
    private final java.lang.Runnable free;
    private int[] freeTransaction;
    private androidx.appcompat.widget.SearchView.OnCloseListener getARTIFICIAL_FRAME_PACKAGE_NAME;
    final android.view.View getHighResolutionOutputSizeshNQ4ISI;
    final android.widget.ImageView getHighSpeedVideoFpsRanges;
    android.os.Bundle getHighSpeedVideoFpsRangesFor;
    final android.widget.ImageView getHighSpeedVideoSizesFor;
    androidx.appcompat.widget.SearchView.OnSuggestionListener getInputFormats;
    final android.view.View getInputSizeshNQ4ISI;
    android.view.View.OnFocusChangeListener getOutputFormats;
    boolean getOutputMinFrameDuration;
    final androidx.appcompat.widget.SearchView.SearchAutoComplete getOutputMinFrameDurationlomOqCM;
    android.app.SearchableInfo getOutputSizes;
    final int getOutputSizeshNQ4ISI;
    androidx.cursoradapter.widget.CursorAdapter getOutputStallDuration;
    final int getOutputStallDurationlomOqCM;
    final android.content.Intent getValidOutputFormatsForInputhNQ4ISI;
    private final java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> init;
    private boolean isOutputSupportedFor;
    android.view.View.OnKeyListener isOutputSupportedForhNQ4ISI;
    private final android.widget.AdapterView.OnItemSelectedListener kernelVersion;
    private final android.view.View l;
    private java.lang.CharSequence release;
    private int[] requestGoOnline;
    private boolean requestPINEntry;
    private final android.view.View resetTransaction;
    private java.lang.CharSequence rsaCipher;
    private android.text.TextWatcher sha1;
    private final android.graphics.drawable.Drawable startTransaction;
    final android.content.Intent toString;
    final android.widget.ImageView unwrapAs;
    private android.graphics.Rect updateUI;

    public interface OnCloseListener {
        boolean onClose();
    }

    public interface OnQueryTextListener {
        boolean onQueryTextChange(java.lang.String str);

        boolean onQueryTextSubmit(java.lang.String str);
    }

    public interface OnSuggestionListener {
        boolean onSuggestionClick(int i);

        boolean onSuggestionSelect(int i);
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.SearchView> {
        private int Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private boolean getHighSpeedVideoFpsRangesFor = false;
        private int getHighSpeedVideoSizes;

        @Override // android.view.inspector.InspectionCompanion
        public final void mapProperties(android.view.inspector.PropertyMapper propertyMapper) {
            this.getHighResolutionOutputSizeshNQ4ISI = propertyMapper.mapInt("imeOptions", android.R.attr.imeOptions);
            this.getHighSpeedVideoFpsRanges = propertyMapper.mapInt("maxWidth", android.R.attr.maxWidth);
            this.getHighSpeedVideoSizes = propertyMapper.mapBoolean("iconifiedByDefault", androidx.appcompat.R.attr.iconifiedByDefault);
            this.Camera2StreamConfigurationMap = propertyMapper.mapObject("queryHint", androidx.appcompat.R.attr.queryHint);
            this.getHighSpeedVideoFpsRangesFor = true;
        }

        @Override // android.view.inspector.InspectionCompanion
        public final void readProperties(androidx.appcompat.widget.SearchView searchView, android.view.inspector.PropertyReader propertyReader) {
            if (!this.getHighSpeedVideoFpsRangesFor) {
                throw new android.view.inspector.InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readInt(this.getHighResolutionOutputSizeshNQ4ISI, searchView.getImeOptions());
            propertyReader.readInt(this.getHighSpeedVideoFpsRanges, searchView.getMaxWidth());
            propertyReader.readBoolean(this.getHighSpeedVideoSizes, searchView.isIconfiedByDefault());
            propertyReader.readObject(this.Camera2StreamConfigurationMap, searchView.getQueryHint());
        }
    }

    static {
        getHighSpeedVideoSizes = android.os.Build.VERSION.SDK_INT < 29 ? new androidx.appcompat.widget.SearchView.PreQAutoCompleteTextViewReflector() : null;
    }

    public SearchView(android.content.Context context) {
        this(context, null);
    }

    public SearchView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.searchViewStyle);
    }

    public SearchView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AMEXKernelCallback = new android.graphics.Rect();
        this.updateUI = new android.graphics.Rect();
        this.requestGoOnline = new int[2];
        this.freeTransaction = new int[2];
        this.free = new java.lang.Runnable() { // from class: androidx.appcompat.widget.SearchView.1
            @Override // java.lang.Runnable
            public void run() {
                androidx.appcompat.widget.SearchView.this.getOutputMinFrameDuration();
            }
        };
        this.AMEXKernela = new java.lang.Runnable() { // from class: androidx.appcompat.widget.SearchView.2
            @Override // java.lang.Runnable
            public void run() {
                if (androidx.appcompat.widget.SearchView.this.getOutputStallDuration instanceof androidx.appcompat.widget.SuggestionsAdapter) {
                    androidx.appcompat.widget.SearchView.this.getOutputStallDuration.changeCursor(null);
                }
            }
        };
        this.init = new java.util.WeakHashMap<>();
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: androidx.appcompat.widget.SearchView.5
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                java.lang.String str;
                if (view == androidx.appcompat.widget.SearchView.this.getHighSpeedVideoSizesFor) {
                    androidx.appcompat.widget.SearchView.this.getHighSpeedVideoFpsRangesFor();
                    return;
                }
                if (view == androidx.appcompat.widget.SearchView.this.Camera2StreamConfigurationMap) {
                    androidx.appcompat.widget.SearchView.this.getHighResolutionOutputSizeshNQ4ISI();
                    return;
                }
                if (view == androidx.appcompat.widget.SearchView.this.getHighSpeedVideoFpsRanges) {
                    androidx.appcompat.widget.SearchView.this.getHighSpeedVideoFpsRanges();
                    return;
                }
                if (view == androidx.appcompat.widget.SearchView.this.unwrapAs) {
                    androidx.appcompat.widget.SearchView searchView = androidx.appcompat.widget.SearchView.this;
                    android.app.SearchableInfo searchableInfo = searchView.getOutputSizes;
                    if (searchableInfo != null) {
                        try {
                            java.lang.String str2 = null;
                            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                                    android.content.Intent intent = searchView.toString;
                                    android.content.ComponentName searchActivity = searchableInfo.getSearchActivity();
                                    android.content.Intent intent2 = new android.content.Intent("android.intent.action.SEARCH");
                                    intent2.setComponent(searchActivity);
                                    android.app.PendingIntent activity = android.app.PendingIntent.getActivity(searchView.getContext(), 0, intent2, 1107296256);
                                    android.os.Bundle bundle = new android.os.Bundle();
                                    android.os.Bundle bundle2 = searchView.getHighSpeedVideoFpsRangesFor;
                                    if (bundle2 != null) {
                                        bundle.putParcelable("app_data", bundle2);
                                    }
                                    android.content.Intent intent3 = new android.content.Intent(intent);
                                    android.content.res.Resources resources = searchView.getResources();
                                    if (searchableInfo.getVoiceLanguageModeId() == 0) {
                                        str = "free_form";
                                    } else {
                                        str = resources.getString(searchableInfo.getVoiceLanguageModeId());
                                    }
                                    java.lang.String string = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
                                    java.lang.String string2 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
                                    int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
                                    intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
                                    intent3.putExtra("android.speech.extra.PROMPT", string);
                                    intent3.putExtra("android.speech.extra.LANGUAGE", string2);
                                    intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
                                    if (searchActivity != null) {
                                        str2 = searchActivity.flattenToShortString();
                                    }
                                    intent3.putExtra("calling_package", str2);
                                    intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                                    intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
                                    searchView.getContext().startActivity(intent3);
                                    return;
                                }
                                return;
                            }
                            android.content.Intent intent4 = new android.content.Intent(searchView.getValidOutputFormatsForInputhNQ4ISI);
                            android.content.ComponentName searchActivity2 = searchableInfo.getSearchActivity();
                            if (searchActivity2 != null) {
                                str2 = searchActivity2.flattenToShortString();
                            }
                            intent4.putExtra("calling_package", str2);
                            searchView.getContext().startActivity(intent4);
                            return;
                        } catch (android.content.ActivityNotFoundException unused) {
                            return;
                        }
                    }
                    return;
                }
                if (view == androidx.appcompat.widget.SearchView.this.getOutputMinFrameDurationlomOqCM) {
                    androidx.appcompat.widget.SearchView.this.getHighSpeedVideoSizes();
                }
            }
        };
        this.b = onClickListener;
        this.isOutputSupportedForhNQ4ISI = new android.view.View.OnKeyListener() { // from class: androidx.appcompat.widget.SearchView.6
            @Override // android.view.View.OnKeyListener
            public boolean onKey(android.view.View view, int i2, android.view.KeyEvent keyEvent) {
                if (androidx.appcompat.widget.SearchView.this.getOutputSizes == null) {
                    return false;
                }
                if (androidx.appcompat.widget.SearchView.this.getOutputMinFrameDurationlomOqCM.isPopupShowing() && androidx.appcompat.widget.SearchView.this.getOutputMinFrameDurationlomOqCM.getListSelection() != -1) {
                    androidx.appcompat.widget.SearchView searchView = androidx.appcompat.widget.SearchView.this;
                    if (searchView.getOutputSizes != null && searchView.getOutputStallDuration != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                        if (i2 == 66 || i2 == 84 || i2 == 61) {
                            return searchView.getHighSpeedVideoFpsRanges(searchView.getOutputMinFrameDurationlomOqCM.getListSelection());
                        }
                        if (i2 == 21 || i2 == 22) {
                            searchView.getOutputMinFrameDurationlomOqCM.setSelection(i2 == 21 ? 0 : searchView.getOutputMinFrameDurationlomOqCM.length());
                            searchView.getOutputMinFrameDurationlomOqCM.setListSelection(0);
                            searchView.getOutputMinFrameDurationlomOqCM.clearListSelection();
                            searchView.getOutputMinFrameDurationlomOqCM.Camera2StreamConfigurationMap();
                            return true;
                        }
                        if (i2 == 19) {
                            searchView.getOutputMinFrameDurationlomOqCM.getListSelection();
                        }
                    }
                    return false;
                }
                if (android.text.TextUtils.getTrimmedLength(androidx.appcompat.widget.SearchView.this.getOutputMinFrameDurationlomOqCM.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                    return false;
                }
                view.cancelLongPress();
                androidx.appcompat.widget.SearchView searchView2 = androidx.appcompat.widget.SearchView.this;
                searchView2.getContext().startActivity(searchView2.getHighSpeedVideoFpsRanges("android.intent.action.SEARCH", null, null, searchView2.getOutputMinFrameDurationlomOqCM.getText().toString(), 0, null));
                return true;
            }
        };
        android.widget.TextView.OnEditorActionListener onEditorActionListener = new android.widget.TextView.OnEditorActionListener() { // from class: androidx.appcompat.widget.SearchView.7
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(android.widget.TextView textView, int i2, android.view.KeyEvent keyEvent) {
                androidx.appcompat.widget.SearchView.this.getHighSpeedVideoFpsRanges();
                return true;
            }
        };
        this._CREATION = onEditorActionListener;
        android.widget.AdapterView.OnItemClickListener onItemClickListener = new android.widget.AdapterView.OnItemClickListener() { // from class: androidx.appcompat.widget.SearchView.8
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i2, long j) {
                androidx.appcompat.widget.SearchView.this.getHighSpeedVideoFpsRanges(i2);
            }
        };
        this.d = onItemClickListener;
        android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener = new android.widget.AdapterView.OnItemSelectedListener() { // from class: androidx.appcompat.widget.SearchView.9
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(android.widget.AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int i2, long j) {
                androidx.appcompat.widget.SearchView searchView = androidx.appcompat.widget.SearchView.this;
                androidx.appcompat.widget.SearchView.OnSuggestionListener onSuggestionListener = searchView.getInputFormats;
                if (onSuggestionListener == null || !onSuggestionListener.onSuggestionSelect(i2)) {
                    android.text.Editable text = searchView.getOutputMinFrameDurationlomOqCM.getText();
                    android.database.Cursor cursor = searchView.getOutputStallDuration.getCursor();
                    if (cursor != null) {
                        if (cursor.moveToPosition(i2)) {
                            java.lang.CharSequence convertToString = searchView.getOutputStallDuration.convertToString(cursor);
                            if (convertToString != null) {
                                searchView.getHighResolutionOutputSizeshNQ4ISI(convertToString);
                                return;
                            } else {
                                searchView.getHighResolutionOutputSizeshNQ4ISI(text);
                                return;
                            }
                        }
                        searchView.getHighResolutionOutputSizeshNQ4ISI(text);
                    }
                }
            }
        };
        this.kernelVersion = onItemSelectedListener;
        this.sha1 = new android.text.TextWatcher() { // from class: androidx.appcompat.widget.SearchView.10
            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i2, int i3, int i4) {
                androidx.appcompat.widget.SearchView.this.getHighSpeedVideoFpsRanges(charSequence);
            }
        };
        androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, attributeSet, androidx.appcompat.R.styleable.SearchView, i, 0);
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(this, context, androidx.appcompat.R.styleable.SearchView, attributeSet, obtainStyledAttributes.getWrappedTypeArray(), i, 0);
        android.view.LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.SearchView_layout, androidx.appcompat.R.layout.abc_search_view), (android.view.ViewGroup) this, true);
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = (androidx.appcompat.widget.SearchView.SearchAutoComplete) findViewById(androidx.appcompat.R.id.search_src_text);
        this.getOutputMinFrameDurationlomOqCM = searchAutoComplete;
        searchAutoComplete.getHighResolutionOutputSizeshNQ4ISI = this;
        this.resetTransaction = findViewById(androidx.appcompat.R.id.search_edit_frame);
        android.view.View findViewById = findViewById(androidx.appcompat.R.id.search_plate);
        this.getInputSizeshNQ4ISI = findViewById;
        android.view.View findViewById2 = findViewById(androidx.appcompat.R.id.submit_area);
        this.l = findViewById2;
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(androidx.appcompat.R.id.search_button);
        this.getHighSpeedVideoSizesFor = imageView;
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(androidx.appcompat.R.id.search_go_btn);
        this.getHighSpeedVideoFpsRanges = imageView2;
        android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById(androidx.appcompat.R.id.search_close_btn);
        this.Camera2StreamConfigurationMap = imageView3;
        android.widget.ImageView imageView4 = (android.widget.ImageView) findViewById(androidx.appcompat.R.id.search_voice_btn);
        this.unwrapAs = imageView4;
        android.widget.ImageView imageView5 = (android.widget.ImageView) findViewById(androidx.appcompat.R.id.search_mag_icon);
        this.ArtificialStackFrames = imageView5;
        androidx.core.view.ViewCompat.setBackground(findViewById, obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SearchView_queryBackground));
        androidx.core.view.ViewCompat.setBackground(findViewById2, obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SearchView_submitBackground));
        imageView.setImageDrawable(obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SearchView_searchIcon));
        imageView2.setImageDrawable(obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SearchView_goIcon));
        imageView3.setImageDrawable(obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SearchView_closeIcon));
        imageView4.setImageDrawable(obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SearchView_voiceIcon));
        imageView5.setImageDrawable(obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SearchView_searchIcon));
        this.startTransaction = obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SearchView_searchHintIcon);
        androidx.appcompat.widget.TooltipCompat.setTooltipText(imageView, getResources().getString(androidx.appcompat.R.string.abc_searchview_description_search));
        this.getOutputStallDurationlomOqCM = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.SearchView_suggestionRowLayout, androidx.appcompat.R.layout.abc_search_dropdown_item_icons_2line);
        this.getOutputSizeshNQ4ISI = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.SearchView_commitIcon, 0);
        imageView.setOnClickListener(onClickListener);
        imageView3.setOnClickListener(onClickListener);
        imageView2.setOnClickListener(onClickListener);
        imageView4.setOnClickListener(onClickListener);
        searchAutoComplete.setOnClickListener(onClickListener);
        searchAutoComplete.addTextChangedListener(this.sha1);
        searchAutoComplete.setOnEditorActionListener(onEditorActionListener);
        searchAutoComplete.setOnItemClickListener(onItemClickListener);
        searchAutoComplete.setOnItemSelectedListener(onItemSelectedListener);
        searchAutoComplete.setOnKeyListener(this.isOutputSupportedForhNQ4ISI);
        searchAutoComplete.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: androidx.appcompat.widget.SearchView.3
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(android.view.View view, boolean z) {
                if (androidx.appcompat.widget.SearchView.this.getOutputFormats != null) {
                    androidx.appcompat.widget.SearchView.this.getOutputFormats.onFocusChange(androidx.appcompat.widget.SearchView.this, z);
                }
            }
        });
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.SearchView_iconifiedByDefault, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.SearchView_android_maxWidth, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.coroutineBoundary = obtainStyledAttributes.getText(androidx.appcompat.R.styleable.SearchView_defaultQueryHint);
        this.release = obtainStyledAttributes.getText(androidx.appcompat.R.styleable.SearchView_queryHint);
        int i2 = obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.SearchView_android_imeOptions, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.SearchView_android_inputType, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.SearchView_android_focusable, true));
        obtainStyledAttributes.recycle();
        android.content.Intent intent = new android.content.Intent("android.speech.action.WEB_SEARCH");
        this.getValidOutputFormatsForInputhNQ4ISI = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        android.content.Intent intent2 = new android.content.Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.toString = intent2;
        intent2.addFlags(268435456);
        android.view.View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.getHighResolutionOutputSizeshNQ4ISI = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() { // from class: androidx.appcompat.widget.SearchView.4
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(android.view.View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                    int i12;
                    androidx.appcompat.widget.SearchView searchView = androidx.appcompat.widget.SearchView.this;
                    if (searchView.getHighResolutionOutputSizeshNQ4ISI.getWidth() > 1) {
                        android.content.res.Resources resources = searchView.getContext().getResources();
                        int paddingLeft = searchView.getInputSizeshNQ4ISI.getPaddingLeft();
                        android.graphics.Rect rect = new android.graphics.Rect();
                        boolean isLayoutRtl = androidx.appcompat.widget.ViewUtils.isLayoutRtl(searchView);
                        int dimensionPixelSize2 = searchView.getOutputMinFrameDuration ? resources.getDimensionPixelSize(androidx.appcompat.R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(androidx.appcompat.R.dimen.abc_dropdownitem_text_padding_left) : 0;
                        searchView.getOutputMinFrameDurationlomOqCM.getDropDownBackground().getPadding(rect);
                        if (isLayoutRtl) {
                            i12 = -rect.left;
                        } else {
                            i12 = paddingLeft - (rect.left + dimensionPixelSize2);
                        }
                        searchView.getOutputMinFrameDurationlomOqCM.setDropDownHorizontalOffset(i12);
                        searchView.getOutputMinFrameDurationlomOqCM.setDropDownWidth((((searchView.getHighResolutionOutputSizeshNQ4ISI.getWidth() + rect.left) + rect.right) + dimensionPixelSize2) - paddingLeft);
                    }
                }
            });
        }
        Camera2StreamConfigurationMap(this.getOutputMinFrameDuration);
        java.lang.String queryHint = getQueryHint();
        searchAutoComplete.setHint(Camera2StreamConfigurationMap(queryHint == null ? "" : queryHint));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r0, 65536) != null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(android.app.SearchableInfo searchableInfo) {
        this.getOutputSizes = searchableInfo;
        android.content.Intent intent = null;
        boolean z = true;
        if (searchableInfo != null) {
            this.getOutputMinFrameDurationlomOqCM.setThreshold(searchableInfo.getSuggestThreshold());
            this.getOutputMinFrameDurationlomOqCM.setImeOptions(this.getOutputSizes.getImeOptions());
            int inputType = this.getOutputSizes.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.getOutputSizes.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            this.getOutputMinFrameDurationlomOqCM.setInputType(inputType);
            androidx.cursoradapter.widget.CursorAdapter cursorAdapter = this.getOutputStallDuration;
            if (cursorAdapter != null) {
                cursorAdapter.changeCursor(null);
            }
            if (this.getOutputSizes.getSuggestAuthority() != null) {
                androidx.appcompat.widget.SuggestionsAdapter suggestionsAdapter = new androidx.appcompat.widget.SuggestionsAdapter(getContext(), this, this.getOutputSizes, this.init);
                this.getOutputStallDuration = suggestionsAdapter;
                this.getOutputMinFrameDurationlomOqCM.setAdapter(suggestionsAdapter);
                ((androidx.appcompat.widget.SuggestionsAdapter) this.getOutputStallDuration).Camera2StreamConfigurationMap = this.exchange ? 2 : 1;
            }
            java.lang.CharSequence queryHint = getQueryHint();
            androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.getOutputMinFrameDurationlomOqCM;
            if (queryHint == null) {
                queryHint = "";
            }
            searchAutoComplete.setHint(Camera2StreamConfigurationMap(queryHint));
        }
        android.app.SearchableInfo searchableInfo2 = this.getOutputSizes;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.getOutputSizes.getVoiceSearchLaunchWebSearch()) {
                intent = this.getValidOutputFormatsForInputhNQ4ISI;
            } else if (this.getOutputSizes.getVoiceSearchLaunchRecognizer()) {
                intent = this.toString;
            }
            if (intent != null) {
            }
        }
        z = false;
        this.AMEXKernelProvider = z;
        if (z) {
            this.getOutputMinFrameDurationlomOqCM.setPrivateImeOptions("nm");
        }
        Camera2StreamConfigurationMap(isIconified());
    }

    public void setAppSearchData(android.os.Bundle bundle) {
        this.getHighSpeedVideoFpsRangesFor = bundle;
    }

    public void setImeOptions(int i) {
        this.getOutputMinFrameDurationlomOqCM.setImeOptions(i);
    }

    public int getImeOptions() {
        return this.getOutputMinFrameDurationlomOqCM.getImeOptions();
    }

    public void setInputType(int i) {
        this.getOutputMinFrameDurationlomOqCM.setInputType(i);
    }

    public int getInputType() {
        return this.getOutputMinFrameDurationlomOqCM.getInputType();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, android.graphics.Rect rect) {
        if (this.isOutputSupportedFor || !isFocusable()) {
            return false;
        }
        if (!isIconified()) {
            boolean requestFocus = this.getOutputMinFrameDurationlomOqCM.requestFocus(i, rect);
            if (requestFocus) {
                Camera2StreamConfigurationMap(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.isOutputSupportedFor = true;
        super.clearFocus();
        this.getOutputMinFrameDurationlomOqCM.clearFocus();
        this.getOutputMinFrameDurationlomOqCM.getHighResolutionOutputSizeshNQ4ISI(false);
        this.isOutputSupportedFor = false;
    }

    public void setOnQueryTextListener(androidx.appcompat.widget.SearchView.OnQueryTextListener onQueryTextListener) {
        this.AMEXKernel = onQueryTextListener;
    }

    public void setOnCloseListener(androidx.appcompat.widget.SearchView.OnCloseListener onCloseListener) {
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = onCloseListener;
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.getOutputFormats = onFocusChangeListener;
    }

    public void setOnSuggestionListener(androidx.appcompat.widget.SearchView.OnSuggestionListener onSuggestionListener) {
        this.getInputFormats = onSuggestionListener;
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    public java.lang.CharSequence getQuery() {
        return this.getOutputMinFrameDurationlomOqCM.getText();
    }

    public void setQuery(java.lang.CharSequence charSequence, boolean z) {
        this.getOutputMinFrameDurationlomOqCM.setText(charSequence);
        if (charSequence != null) {
            androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.getOutputMinFrameDurationlomOqCM;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.rsaCipher = charSequence;
        }
        if (!z || android.text.TextUtils.isEmpty(charSequence)) {
            return;
        }
        getHighSpeedVideoFpsRanges();
    }

    public void setQueryHint(java.lang.CharSequence charSequence) {
        this.release = charSequence;
        java.lang.CharSequence queryHint = getQueryHint();
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.getOutputMinFrameDurationlomOqCM;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(Camera2StreamConfigurationMap(queryHint));
    }

    public java.lang.CharSequence getQueryHint() {
        java.lang.CharSequence charSequence = this.release;
        if (charSequence != null) {
            return charSequence;
        }
        android.app.SearchableInfo searchableInfo = this.getOutputSizes;
        if (searchableInfo != null && searchableInfo.getHintId() != 0) {
            return getContext().getText(this.getOutputSizes.getHintId());
        }
        return this.coroutineBoundary;
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.getOutputMinFrameDuration == z) {
            return;
        }
        this.getOutputMinFrameDuration = z;
        Camera2StreamConfigurationMap(z);
        java.lang.CharSequence queryHint = getQueryHint();
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.getOutputMinFrameDurationlomOqCM;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(Camera2StreamConfigurationMap(queryHint));
    }

    public boolean isIconfiedByDefault() {
        return this.getOutputMinFrameDuration;
    }

    public void setIconified(boolean z) {
        if (z) {
            getHighResolutionOutputSizeshNQ4ISI();
        } else {
            getHighSpeedVideoFpsRangesFor();
        }
    }

    public boolean isIconified() {
        return this.coroutineCreation;
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.requestPINEntry = z;
        Camera2StreamConfigurationMap(isIconified());
    }

    public boolean isSubmitButtonEnabled() {
        return this.requestPINEntry;
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.exchange = z;
        androidx.cursoradapter.widget.CursorAdapter cursorAdapter = this.getOutputStallDuration;
        if (cursorAdapter instanceof androidx.appcompat.widget.SuggestionsAdapter) {
            ((androidx.appcompat.widget.SuggestionsAdapter) cursorAdapter).Camera2StreamConfigurationMap = z ? 2 : 1;
        }
    }

    public boolean isQueryRefinementEnabled() {
        return this.exchange;
    }

    public void setSuggestionsAdapter(androidx.cursoradapter.widget.CursorAdapter cursorAdapter) {
        this.getOutputStallDuration = cursorAdapter;
        this.getOutputMinFrameDurationlomOqCM.setAdapter(cursorAdapter);
    }

    public androidx.cursoradapter.widget.CursorAdapter getSuggestionsAdapter() {
        return this.getOutputStallDuration;
    }

    public void setMaxWidth(int i) {
        this._BOUNDARY = i;
        requestLayout();
    }

    public int getMaxWidth() {
        return this._BOUNDARY;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        if (isIconified()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this._BOUNDARY;
            size = i4 > 0 ? java.lang.Math.min(i4, size) : java.lang.Math.min(getContext().getResources().getDimensionPixelSize(androidx.appcompat.R.dimen.abc_search_view_preferred_width), size);
        } else if (mode == 0) {
            size = this._BOUNDARY;
            if (size <= 0) {
                size = getContext().getResources().getDimensionPixelSize(androidx.appcompat.R.dimen.abc_search_view_preferred_width);
            }
        } else if (mode == 1073741824 && (i3 = this._BOUNDARY) > 0) {
            size = java.lang.Math.min(i3, size);
        }
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = java.lang.Math.min(getContext().getResources().getDimensionPixelSize(androidx.appcompat.R.dimen.abc_search_view_preferred_height), size2);
        } else if (mode2 == 0) {
            size2 = getContext().getResources().getDimensionPixelSize(androidx.appcompat.R.dimen.abc_search_view_preferred_height);
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.getOutputMinFrameDurationlomOqCM;
            android.graphics.Rect rect = this.AMEXKernelCallback;
            searchAutoComplete.getLocationInWindow(this.requestGoOnline);
            getLocationInWindow(this.freeTransaction);
            int[] iArr = this.requestGoOnline;
            int i5 = iArr[1];
            int[] iArr2 = this.freeTransaction;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            this.updateUI.set(this.AMEXKernelCallback.left, 0, this.AMEXKernelCallback.right, i4 - i2);
            androidx.appcompat.widget.SearchView.UpdatableTouchDelegate updatableTouchDelegate = this.AMEXKernelJNI;
            if (updatableTouchDelegate == null) {
                androidx.appcompat.widget.SearchView.UpdatableTouchDelegate updatableTouchDelegate2 = new androidx.appcompat.widget.SearchView.UpdatableTouchDelegate(this.updateUI, this.AMEXKernelCallback, this.getOutputMinFrameDurationlomOqCM);
                this.AMEXKernelJNI = updatableTouchDelegate2;
                setTouchDelegate(updatableTouchDelegate2);
                return;
            }
            updatableTouchDelegate.getHighSpeedVideoFpsRanges(this.updateUI, this.AMEXKernelCallback);
        }
    }

    private void Camera2StreamConfigurationMap(boolean z) {
        this.coroutineCreation = z;
        int i = z ? 0 : 8;
        boolean isEmpty = android.text.TextUtils.isEmpty(this.getOutputMinFrameDurationlomOqCM.getText());
        this.getHighSpeedVideoSizesFor.setVisibility(i);
        getHighSpeedVideoFpsRanges(!isEmpty);
        this.resetTransaction.setVisibility(z ? 8 : 0);
        this.ArtificialStackFrames.setVisibility((this.ArtificialStackFrames.getDrawable() == null || this.getOutputMinFrameDuration) ? 8 : 0);
        getInputSizeshNQ4ISI();
        getHighSpeedVideoFpsRangesFor(isEmpty);
        getOutputFormats();
    }

    private void getHighSpeedVideoFpsRanges(boolean z) {
        boolean z2 = this.requestPINEntry;
        this.getHighSpeedVideoFpsRanges.setVisibility((!z2 || !(z2 || this.AMEXKernelProvider) || isIconified() || !hasFocus() || (!z && this.AMEXKernelProvider)) ? 8 : 0);
    }

    private void getInputSizeshNQ4ISI() {
        boolean isEmpty = android.text.TextUtils.isEmpty(this.getOutputMinFrameDurationlomOqCM.getText());
        this.Camera2StreamConfigurationMap.setVisibility(!isEmpty || (this.getOutputMinFrameDuration && !this.CoroutineDebuggingKt) ? 0 : 8);
        android.graphics.drawable.Drawable drawable = this.Camera2StreamConfigurationMap.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    final void getOutputMinFrameDuration() {
        int[] iArr = this.getOutputMinFrameDurationlomOqCM.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        android.graphics.drawable.Drawable background = this.getInputSizeshNQ4ISI.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        android.graphics.drawable.Drawable background2 = this.l.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.free);
        post(this.AMEXKernela);
        super.onDetachedFromWindow();
    }

    protected void onQueryRefine(java.lang.CharSequence charSequence) {
        getHighResolutionOutputSizeshNQ4ISI(charSequence);
    }

    private java.lang.CharSequence Camera2StreamConfigurationMap(java.lang.CharSequence charSequence) {
        if (!this.getOutputMinFrameDuration || this.startTransaction == null) {
            return charSequence;
        }
        int textSize = (int) (this.getOutputMinFrameDurationlomOqCM.getTextSize() * 1.25d);
        this.startTransaction.setBounds(0, 0, textSize, textSize);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new android.text.style.ImageSpan(this.startTransaction), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private void getHighSpeedVideoFpsRangesFor(boolean z) {
        int i = 8;
        if (this.AMEXKernelProvider && !isIconified() && z) {
            this.getHighSpeedVideoFpsRanges.setVisibility(8);
            i = 0;
        }
        this.unwrapAs.setVisibility(i);
    }

    final void getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence) {
        android.text.Editable text = this.getOutputMinFrameDurationlomOqCM.getText();
        this.rsaCipher = text;
        boolean isEmpty = android.text.TextUtils.isEmpty(text);
        getHighSpeedVideoFpsRanges(!isEmpty);
        getHighSpeedVideoFpsRangesFor(isEmpty);
        getInputSizeshNQ4ISI();
        getOutputFormats();
        if (this.AMEXKernel != null && !android.text.TextUtils.equals(charSequence, this.f2668a)) {
            this.AMEXKernel.onQueryTextChange(charSequence.toString());
        }
        this.f2668a = charSequence.toString();
    }

    final void getHighSpeedVideoFpsRanges() {
        android.text.Editable text = this.getOutputMinFrameDurationlomOqCM.getText();
        if (text == null || android.text.TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        androidx.appcompat.widget.SearchView.OnQueryTextListener onQueryTextListener = this.AMEXKernel;
        if (onQueryTextListener == null || !onQueryTextListener.onQueryTextSubmit(text.toString())) {
            if (this.getOutputSizes != null) {
                getContext().startActivity(getHighSpeedVideoFpsRanges("android.intent.action.SEARCH", null, null, text.toString(), 0, null));
            }
            this.getOutputMinFrameDurationlomOqCM.getHighResolutionOutputSizeshNQ4ISI(false);
            this.getOutputMinFrameDurationlomOqCM.dismissDropDown();
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        if (android.text.TextUtils.isEmpty(this.getOutputMinFrameDurationlomOqCM.getText())) {
            if (this.getOutputMinFrameDuration) {
                androidx.appcompat.widget.SearchView.OnCloseListener onCloseListener = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
                if (onCloseListener == null || !onCloseListener.onClose()) {
                    clearFocus();
                    Camera2StreamConfigurationMap(true);
                    return;
                }
                return;
            }
            return;
        }
        this.getOutputMinFrameDurationlomOqCM.setText("");
        this.getOutputMinFrameDurationlomOqCM.requestFocus();
        this.getOutputMinFrameDurationlomOqCM.getHighResolutionOutputSizeshNQ4ISI(true);
    }

    final void getHighSpeedVideoFpsRangesFor() {
        Camera2StreamConfigurationMap(false);
        this.getOutputMinFrameDurationlomOqCM.requestFocus();
        this.getOutputMinFrameDurationlomOqCM.getHighResolutionOutputSizeshNQ4ISI(true);
        android.view.View.OnClickListener onClickListener = this.c;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    final void Camera2StreamConfigurationMap() {
        Camera2StreamConfigurationMap(isIconified());
        post(this.free);
        if (this.getOutputMinFrameDurationlomOqCM.hasFocus()) {
            getHighSpeedVideoSizes();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.free);
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        Camera2StreamConfigurationMap(true);
        this.getOutputMinFrameDurationlomOqCM.setImeOptions(this.accessartificialFrame);
        this.CoroutineDebuggingKt = false;
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public void onActionViewExpanded() {
        if (this.CoroutineDebuggingKt) {
            return;
        }
        this.CoroutineDebuggingKt = true;
        int imeOptions = this.getOutputMinFrameDurationlomOqCM.getImeOptions();
        this.accessartificialFrame = imeOptions;
        this.getOutputMinFrameDurationlomOqCM.setImeOptions(imeOptions | 33554432);
        this.getOutputMinFrameDurationlomOqCM.setText("");
        setIconified(false);
    }

    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.SearchView.SavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<androidx.appcompat.widget.SearchView.SavedState>() { // from class: androidx.appcompat.widget.SearchView.SavedState.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
                return new androidx.appcompat.widget.SearchView.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* synthetic */ androidx.appcompat.widget.SearchView.SavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                return new androidx.appcompat.widget.SearchView.SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int i) {
                return new androidx.appcompat.widget.SearchView.SavedState[i];
            }
        };
        boolean getHighSpeedVideoSizes;

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.getHighSpeedVideoSizes = ((java.lang.Boolean) parcel.readValue(null)).booleanValue();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(java.lang.Boolean.valueOf(this.getHighSpeedVideoSizes));
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchView.SavedState{");
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
            sb.append(" isIconified=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append("}");
            return sb.toString();
        }
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        androidx.appcompat.widget.SearchView.SavedState savedState = new androidx.appcompat.widget.SearchView.SavedState(super.onSaveInstanceState());
        savedState.getHighSpeedVideoSizes = isIconified();
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof androidx.appcompat.widget.SearchView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.appcompat.widget.SearchView.SavedState savedState = (androidx.appcompat.widget.SearchView.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        Camera2StreamConfigurationMap(savedState.getHighSpeedVideoSizes);
        requestLayout();
    }

    final boolean getHighSpeedVideoFpsRanges(int i) {
        androidx.appcompat.widget.SearchView.OnSuggestionListener onSuggestionListener = this.getInputFormats;
        if (onSuggestionListener != null && onSuggestionListener.onSuggestionClick(i)) {
            return false;
        }
        getHighSpeedVideoFpsRangesFor(i);
        this.getOutputMinFrameDurationlomOqCM.getHighResolutionOutputSizeshNQ4ISI(false);
        this.getOutputMinFrameDurationlomOqCM.dismissDropDown();
        return true;
    }

    private boolean getHighSpeedVideoFpsRangesFor(int i) {
        android.database.Cursor cursor = this.getOutputStallDuration.getCursor();
        if (cursor == null || !cursor.moveToPosition(i)) {
            return false;
        }
        android.content.Intent highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(cursor, 0, null);
        if (highResolutionOutputSizeshNQ4ISI == null) {
            return true;
        }
        try {
            getContext().startActivity(highResolutionOutputSizeshNQ4ISI);
            return true;
        } catch (java.lang.RuntimeException unused) {
            return true;
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI(java.lang.CharSequence charSequence) {
        this.getOutputMinFrameDurationlomOqCM.setText(charSequence);
        this.getOutputMinFrameDurationlomOqCM.setSelection(android.text.TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    final android.content.Intent getHighSpeedVideoFpsRanges(java.lang.String str, android.net.Uri uri, java.lang.String str2, java.lang.String str3, int i, java.lang.String str4) {
        android.content.Intent intent = new android.content.Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.rsaCipher);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        android.os.Bundle bundle = this.getHighSpeedVideoFpsRangesFor;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.getOutputSizes.getSearchActivity());
        return intent;
    }

    private android.content.Intent getHighResolutionOutputSizeshNQ4ISI(android.database.Cursor cursor, int i, java.lang.String str) {
        java.lang.String highSpeedVideoFpsRanges;
        try {
            try {
                java.lang.String highSpeedVideoFpsRanges2 = androidx.appcompat.widget.SuggestionsAdapter.getHighSpeedVideoFpsRanges(cursor, "suggest_intent_action");
                if (highSpeedVideoFpsRanges2 == null) {
                    highSpeedVideoFpsRanges2 = this.getOutputSizes.getSuggestIntentAction();
                }
                if (highSpeedVideoFpsRanges2 == null) {
                    highSpeedVideoFpsRanges2 = "android.intent.action.SEARCH";
                }
                java.lang.String str2 = highSpeedVideoFpsRanges2;
                java.lang.String highSpeedVideoFpsRanges3 = androidx.appcompat.widget.SuggestionsAdapter.getHighSpeedVideoFpsRanges(cursor, "suggest_intent_data");
                if (highSpeedVideoFpsRanges3 == null) {
                    highSpeedVideoFpsRanges3 = this.getOutputSizes.getSuggestIntentData();
                }
                if (highSpeedVideoFpsRanges3 != null && (highSpeedVideoFpsRanges = androidx.appcompat.widget.SuggestionsAdapter.getHighSpeedVideoFpsRanges(cursor, "suggest_intent_data_id")) != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(highSpeedVideoFpsRanges3);
                    sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                    sb.append(android.net.Uri.encode(highSpeedVideoFpsRanges));
                    highSpeedVideoFpsRanges3 = sb.toString();
                }
                return getHighSpeedVideoFpsRanges(str2, highSpeedVideoFpsRanges3 == null ? null : android.net.Uri.parse(highSpeedVideoFpsRanges3), androidx.appcompat.widget.SuggestionsAdapter.getHighSpeedVideoFpsRanges(cursor, "suggest_intent_extra_data"), androidx.appcompat.widget.SuggestionsAdapter.getHighSpeedVideoFpsRanges(cursor, "suggest_intent_query"), 0, null);
            } catch (java.lang.RuntimeException unused) {
                cursor.getPosition();
                return null;
            }
        } catch (java.lang.RuntimeException unused2) {
            return null;
        }
    }

    final void getHighSpeedVideoSizes() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.appcompat.widget.SearchView.Api29Impl.getHighResolutionOutputSizeshNQ4ISI(this.getOutputMinFrameDurationlomOqCM);
            return;
        }
        androidx.appcompat.widget.SearchView.PreQAutoCompleteTextViewReflector preQAutoCompleteTextViewReflector = getHighSpeedVideoSizes;
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = this.getOutputMinFrameDurationlomOqCM;
        androidx.appcompat.widget.SearchView.PreQAutoCompleteTextViewReflector.getHighSpeedVideoFpsRangesFor();
        java.lang.reflect.Method method = preQAutoCompleteTextViewReflector.getHighSpeedVideoFpsRangesFor;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new java.lang.Object[0]);
            } catch (java.lang.Exception unused) {
            }
        }
        androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete2 = this.getOutputMinFrameDurationlomOqCM;
        androidx.appcompat.widget.SearchView.PreQAutoCompleteTextViewReflector.getHighSpeedVideoFpsRangesFor();
        java.lang.reflect.Method method2 = preQAutoCompleteTextViewReflector.Camera2StreamConfigurationMap;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new java.lang.Object[0]);
            } catch (java.lang.Exception unused2) {
            }
        }
    }

    static boolean Camera2StreamConfigurationMap(android.content.Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    static class UpdatableTouchDelegate extends android.view.TouchDelegate {
        private final android.graphics.Rect Camera2StreamConfigurationMap;
        private boolean getHighResolutionOutputSizeshNQ4ISI;
        private final android.view.View getHighSpeedVideoFpsRanges;
        private final int getHighSpeedVideoFpsRangesFor;
        private final android.graphics.Rect getHighSpeedVideoSizes;
        private final android.graphics.Rect getInputFormats;

        public UpdatableTouchDelegate(android.graphics.Rect rect, android.graphics.Rect rect2, android.view.View view) {
            super(rect, view);
            this.getHighSpeedVideoFpsRangesFor = android.view.ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.getInputFormats = new android.graphics.Rect();
            this.getHighSpeedVideoSizes = new android.graphics.Rect();
            this.Camera2StreamConfigurationMap = new android.graphics.Rect();
            getHighSpeedVideoFpsRanges(rect, rect2);
            this.getHighSpeedVideoFpsRanges = view;
        }

        public final void getHighSpeedVideoFpsRanges(android.graphics.Rect rect, android.graphics.Rect rect2) {
            this.getInputFormats.set(rect);
            this.getHighSpeedVideoSizes.set(rect);
            android.graphics.Rect rect3 = this.getHighSpeedVideoSizes;
            int i = -this.getHighSpeedVideoFpsRangesFor;
            rect3.inset(i, i);
            this.Camera2StreamConfigurationMap.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (z2 && !this.getHighSpeedVideoSizes.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        this.getHighResolutionOutputSizeshNQ4ISI = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.getInputFormats.contains(x, y)) {
                    this.getHighResolutionOutputSizeshNQ4ISI = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (z && !this.Camera2StreamConfigurationMap.contains(x, y)) {
                motionEvent.setLocation(this.getHighSpeedVideoFpsRanges.getWidth() / 2, this.getHighSpeedVideoFpsRanges.getHeight() / 2);
            } else {
                motionEvent.setLocation(x - this.Camera2StreamConfigurationMap.left, y - this.Camera2StreamConfigurationMap.top);
            }
            return this.getHighSpeedVideoFpsRanges.dispatchTouchEvent(motionEvent);
        }
    }

    public static class SearchAutoComplete extends androidx.appcompat.widget.AppCompatAutoCompleteTextView {
        androidx.appcompat.widget.SearchView getHighResolutionOutputSizeshNQ4ISI;
        final java.lang.Runnable getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(java.lang.CharSequence charSequence) {
        }

        public SearchAutoComplete(android.content.Context context) {
            this(context, null);
        }

        public SearchAutoComplete(android.content.Context context, android.util.AttributeSet attributeSet) {
            this(context, attributeSet, androidx.appcompat.R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.getHighSpeedVideoFpsRanges = new java.lang.Runnable() { // from class: androidx.appcompat.widget.SearchView.SearchAutoComplete.1
                @Override // java.lang.Runnable
                public void run() {
                    androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete = androidx.appcompat.widget.SearchView.SearchAutoComplete.this;
                    if (searchAutoComplete.getHighSpeedVideoSizes) {
                        ((android.view.inputmethod.InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                        searchAutoComplete.getHighSpeedVideoSizes = false;
                    }
                }
            };
            this.getHighSpeedVideoFpsRangesFor = getThreshold();
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            android.content.res.Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            setMinWidth((int) android.util.TypedValue.applyDimension(1, (i < 960 || i2 < 720 || configuration.orientation != 2) ? (i >= 600 || (i >= 640 && i2 >= 480)) ? 192 : 160 : 256, displayMetrics));
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.getHighResolutionOutputSizeshNQ4ISI.hasFocus() && getVisibility() == 0) {
                this.getHighSpeedVideoSizes = true;
                if (androidx.appcompat.widget.SearchView.Camera2StreamConfigurationMap(getContext())) {
                    Camera2StreamConfigurationMap();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap();
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.getHighSpeedVideoFpsRangesFor <= 0 || super.enoughToFilter();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, android.view.KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    android.view.KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    android.view.KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.getHighResolutionOutputSizeshNQ4ISI.clearFocus();
                        getHighResolutionOutputSizeshNQ4ISI(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
            android.view.inputmethod.InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.getHighSpeedVideoSizes) {
                removeCallbacks(this.getHighSpeedVideoFpsRanges);
                post(this.getHighSpeedVideoFpsRanges);
            }
            return onCreateInputConnection;
        }

        final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.getHighSpeedVideoSizes = false;
                removeCallbacks(this.getHighSpeedVideoFpsRanges);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (inputMethodManager.isActive(this)) {
                    this.getHighSpeedVideoSizes = false;
                    removeCallbacks(this.getHighSpeedVideoFpsRanges);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                this.getHighSpeedVideoSizes = true;
            }
        }

        final void Camera2StreamConfigurationMap() {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                androidx.appcompat.widget.SearchView.Api29Impl.getHighSpeedVideoFpsRangesFor(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            androidx.appcompat.widget.SearchView.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(this);
        }
    }

    static class PreQAutoCompleteTextViewReflector {
        java.lang.reflect.Method Camera2StreamConfigurationMap;
        java.lang.reflect.Method getHighSpeedVideoFpsRangesFor;
        private java.lang.reflect.Method getHighSpeedVideoSizes;

        PreQAutoCompleteTextViewReflector() {
            this.getHighSpeedVideoFpsRangesFor = null;
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoSizes = null;
            if (android.os.Build.VERSION.SDK_INT < 29) {
                try {
                    java.lang.reflect.Method declaredMethod = android.widget.AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new java.lang.Class[0]);
                    this.getHighSpeedVideoFpsRangesFor = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (java.lang.NoSuchMethodException unused) {
                }
                try {
                    java.lang.reflect.Method declaredMethod2 = android.widget.AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new java.lang.Class[0]);
                    this.Camera2StreamConfigurationMap = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (java.lang.NoSuchMethodException unused2) {
                }
                try {
                    java.lang.reflect.Method method = android.widget.AutoCompleteTextView.class.getMethod("ensureImeVisible", java.lang.Boolean.TYPE);
                    this.getHighSpeedVideoSizes = method;
                    method.setAccessible(true);
                    return;
                } catch (java.lang.NoSuchMethodException unused3) {
                    return;
                }
            }
            throw new java.lang.UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }

        static void getHighSpeedVideoFpsRangesFor() {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                throw new java.lang.UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        final void getHighSpeedVideoFpsRangesFor(android.widget.AutoCompleteTextView autoCompleteTextView) {
            if (android.os.Build.VERSION.SDK_INT < 29) {
                java.lang.reflect.Method method = this.getHighSpeedVideoSizes;
                if (method != null) {
                    try {
                        method.invoke(autoCompleteTextView, java.lang.Boolean.TRUE);
                        return;
                    } catch (java.lang.Exception unused) {
                        return;
                    }
                }
                return;
            }
            throw new java.lang.UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void getHighSpeedVideoFpsRangesFor(androidx.appcompat.widget.SearchView.SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.widget.AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }
    }

    private void getOutputFormats() {
        this.l.setVisibility(((this.requestPINEntry || this.AMEXKernelProvider) && !isIconified() && (this.getHighSpeedVideoFpsRanges.getVisibility() == 0 || this.unwrapAs.getVisibility() == 0)) ? 0 : 8);
    }
}
