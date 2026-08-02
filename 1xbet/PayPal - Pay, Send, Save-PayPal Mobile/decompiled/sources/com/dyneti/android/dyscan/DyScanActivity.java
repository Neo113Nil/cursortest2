package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public class DyScanActivity extends androidx.fragment.app.FragmentActivity {
    public static final java.lang.String EXTRA_AWAIT_SCAN_STORAGE = "await_scan_storage";
    public static final java.lang.String EXTRA_BACKGROUND_COLOR = "bg_color";
    public static final java.lang.String EXTRA_BACKGROUND_OPACITY = "bg_opacity";
    public static final java.lang.String EXTRA_CARD_FRAME_CONTENT_DESCRIPTION = "card_frame_content_description";
    public static final java.lang.String EXTRA_CLIENT_FIELD = "client_field";
    public static final java.lang.String EXTRA_CORNER_ACTIVE_COLOR = "corner_active_color";
    public static final java.lang.String EXTRA_CORNER_COMPLETED_COLOR = "corner_completed_color";
    public static final java.lang.String EXTRA_CORNER_INACTIVE_COLOR = "corner_inactive_color";
    public static final java.lang.String EXTRA_CORNER_THICKNESS = "corner_thickness";
    public static final java.lang.String EXTRA_DETECT_WRONG_CARD = "detect_wrong_card";
    public static final java.lang.String EXTRA_EXPECTED_BIN = "expected_bin";
    public static final java.lang.String EXTRA_EXPECTED_LAST_FOUR_DIGITS = "expected_last_four_digits";
    public static final java.lang.String EXTRA_GIFT_CARD_CONFIG_ID = "gift_card_config_id";
    public static final java.lang.String EXTRA_GIFT_CARD_MODE = "gift_card_mode";
    public static final java.lang.String EXTRA_HELPER_TEXT_COLOR = "helper_text_color";
    public static final java.lang.String EXTRA_HELPER_TEXT_FONT_FAMILY = "helper_text_font_family";
    public static final java.lang.String EXTRA_HELPER_TEXT_POSITION = "helper_text_position";
    public static final java.lang.String EXTRA_HELPER_TEXT_SIZE_SP = "helper_text_size_sp";
    public static final java.lang.String EXTRA_HELPER_TEXT_STRING = "helper_text_string";
    public static final java.lang.String EXTRA_IS_CHALLENGE = "is_challenge";
    public static final java.lang.String EXTRA_LIGHT_TORCH_WHEN_DARK = "light_torch_when_dark";
    public static final java.lang.String EXTRA_MANUAL_ENTRY_STRING = "manual_entry_button_string";
    public static final java.lang.String EXTRA_NEEDS_REVIEW = "needs_review";
    public static final java.lang.String EXTRA_OVERLAY_TEXT = "overlay_text";
    public static final java.lang.String EXTRA_OVERLAY_TEXT_COLOR = "overlay_text_color";
    public static final java.lang.String EXTRA_OVERLAY_TEXT_FONT_FAMILY = "overlay_text_font_family";
    public static final java.lang.String EXTRA_OVERLAY_TEXT_FONT_SIZE = "overlay_text_font_size";
    public static final java.lang.String EXTRA_PROMPT_IF_FEW_DIGITS = "prompt_if_few_digits";
    public static final java.lang.String EXTRA_RESULT_OVERLAY_ALWAYS_HORIZONTAL = "result_overlay_always_horizontal";
    public static final java.lang.String EXTRA_SCAN_RESULT = "com.dyneti.android.dyscan.scanResult";
    public static final java.lang.String EXTRA_SHOW_CARD_OVERLAY = "show_card_overlay";
    public static final java.lang.String EXTRA_SHOW_CORNERS = "show_corners";
    public static final java.lang.String EXTRA_SHOW_DYNETI_LOGO = "show_dyneti_logo";
    public static final java.lang.String EXTRA_SHOW_HELPER_TEXT = "show_helper_text";
    public static final java.lang.String EXTRA_SHOW_MANUAL_ENTRY_BUTTON = "show_manual_entry_button";
    public static final java.lang.String EXTRA_SHOW_RESULT_OVERLAY = "show_result_overlay";
    public static final java.lang.String EXTRA_SHOW_ROTATE_BUTTON = "show_rotate_button";
    public static final java.lang.String EXTRA_SIDEWAYS_SCANNING_ENABLED = "sideways_scanning_enabled";
    public static final java.lang.String EXTRA_USER_ID = "user_id";
    public static final java.lang.String EXTRA_VIBRATE_ON_COMPLETION = "vibrate_on_completion";
    public static final int RESULT_AUTH_FAILURE = 2;
    public static final int RESULT_CAMERA_ERROR = 4;
    public static final int RESULT_PERMISSIONS_NOT_GRANTED = 3;
    public static final int RESULT_SCAN_LOG_ERROR = 6;
    public static final int RESULT_USER_REQUESTED_MANUAL_ENTRY = 5;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3282a = true;
    public java.lang.String b = "";
    public int c = -1;
    public float d = 18.0f;
    public android.graphics.Typeface e = null;
    public boolean f = false;
    public boolean g = false;
    public com.dyneti.android.dyscan.DyScanView h;
    public android.widget.ImageButton i;
    public android.widget.ImageButton j;
    public android.widget.ImageButton k;
    public android.widget.TextView l;
    public android.widget.Button m;

    public final void a() {
        this.h.setVertical(!this.h.isVertical());
        android.widget.ImageButton imageButton = this.f != c() ? this.k : this.i;
        if (this.h.isVertical()) {
            imageButton.setImageResource(com.dyneti.android.dyscan.R.drawable.dyscan_vertical);
            imageButton.setContentDescription(getString(com.dyneti.android.dyscan.R.string.dyscan_vertical_button_hint));
        } else {
            imageButton.setImageResource(com.dyneti.android.dyscan.R.drawable.dyscan_horizontal);
            imageButton.setContentDescription(getString(com.dyneti.android.dyscan.R.string.dyscan_horizontal_button_hint));
        }
    }

    public final void b() {
        if (this.f3282a) {
            this.l.setVisibility(0);
            this.l.setTextColor(this.c);
            this.l.setTextSize(2, this.d);
            this.l.setTypeface(this.e);
            if (this.b.equals("")) {
                this.l.setText(com.dyneti.android.dyscan.DyScan.b.f3304a);
            } else {
                this.l.setText(this.b);
            }
        }
        if (this.g) {
            this.m.setVisibility(0);
        }
        if (this.f != c()) {
            this.k.setImageResource(this.f ? com.dyneti.android.dyscan.R.drawable.dyscan_horizontal : com.dyneti.android.dyscan.R.drawable.dyscan_torch);
            this.k.setContentDescription(getString(this.f ? com.dyneti.android.dyscan.R.string.dyscan_horizontal_button_hint : com.dyneti.android.dyscan.R.string.dyscan_flashlight_off_button_hint));
            this.k.setVisibility(0);
        } else {
            if (this.f) {
                this.i.setVisibility(0);
            }
            if (c()) {
                this.j.setVisibility(0);
            }
        }
    }

    public final boolean c() {
        com.dyneti.android.dyscan.t tVar;
        com.dyneti.android.dyscan.DyScanView dyScanView = this.h;
        return (dyScanView.W || (tVar = dyScanView.g) == null || !tVar.b()) ? false : true;
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        this.h.a("back button pressed");
        setResult(0, new android.content.Intent());
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        android.graphics.Typeface typeface;
        super.onCreate(bundle);
        getWindow().setFlags(8192, 8192);
        setContentView(com.dyneti.android.dyscan.R.layout.dyscan_activity_dyscan);
        com.dyneti.android.dyscan.DyScanView dyScanView = (com.dyneti.android.dyscan.DyScanView) findViewById(com.dyneti.android.dyscan.R.id.dyscan_view);
        this.h = dyScanView;
        dyScanView.m = false;
        dyScanView.setResultListener(new com.dyneti.android.dyscan.s0(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.dyneti.android.dyscan.R.id.dyscan_HelperTextView);
        this.l = textView;
        textView.setVisibility(4);
        this.h.D = this.l;
        android.widget.ImageButton imageButton = (android.widget.ImageButton) findViewById(com.dyneti.android.dyscan.R.id.dyscan_RotateButton);
        this.i = imageButton;
        imageButton.setVisibility(4);
        this.i.setOnClickListener(new com.dyneti.android.dyscan.t0(this));
        android.widget.ImageButton imageButton2 = (android.widget.ImageButton) findViewById(com.dyneti.android.dyscan.R.id.dyscan_TorchButton);
        this.j = imageButton2;
        imageButton2.setVisibility(4);
        this.j.setOnClickListener(new com.dyneti.android.dyscan.u0(this));
        android.widget.ImageButton imageButton3 = (android.widget.ImageButton) findViewById(com.dyneti.android.dyscan.R.id.dyscan_RotateOrTorchButton);
        this.k = imageButton3;
        imageButton3.setVisibility(4);
        this.k.setOnClickListener(new com.dyneti.android.dyscan.v0(this));
        android.widget.Button button = (android.widget.Button) findViewById(com.dyneti.android.dyscan.R.id.dyscan_ManualEntryButton);
        this.m = button;
        button.setVisibility(4);
        this.m.setOnClickListener(new com.dyneti.android.dyscan.w0(this));
        android.content.Intent intent = getIntent();
        if (intent.hasExtra(EXTRA_IS_CHALLENGE)) {
            this.h.setIsChallenge(intent.getBooleanExtra(EXTRA_IS_CHALLENGE, false));
        }
        if (intent.hasExtra(EXTRA_VIBRATE_ON_COMPLETION)) {
            this.h.setVibrateOnCompletion(intent.getBooleanExtra(EXTRA_VIBRATE_ON_COMPLETION, true));
        }
        if (intent.hasExtra(EXTRA_HELPER_TEXT_STRING)) {
            java.lang.String stringExtra = intent.getStringExtra(EXTRA_HELPER_TEXT_STRING);
            this.b = stringExtra;
            this.h.y = stringExtra;
            this.l.setText(stringExtra);
        }
        if (intent.hasExtra(EXTRA_HELPER_TEXT_COLOR)) {
            int intExtra = intent.getIntExtra(EXTRA_HELPER_TEXT_COLOR, -1);
            this.c = intExtra;
            this.h.z = intExtra;
            this.l.setTextColor(intExtra);
        }
        if (intent.hasExtra(EXTRA_HELPER_TEXT_SIZE_SP)) {
            float floatExtra = intent.getFloatExtra(EXTRA_HELPER_TEXT_SIZE_SP, 18.0f);
            this.d = floatExtra;
            this.h.A = floatExtra;
            this.l.setTextSize(2, floatExtra);
        }
        if (intent.hasExtra(EXTRA_HELPER_TEXT_FONT_FAMILY)) {
            java.lang.String stringExtra2 = intent.getStringExtra(EXTRA_HELPER_TEXT_FONT_FAMILY);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("fonts/");
            sb.append(stringExtra2);
            sb.append(".ttf");
            java.lang.String obj = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("fonts/");
            sb2.append(stringExtra2);
            sb2.append(".otf");
            java.lang.String[] strArr = {obj, sb2.toString()};
            int i = 0;
            while (true) {
                if (i >= 2) {
                    typeface = null;
                    break;
                }
                try {
                    typeface = android.graphics.Typeface.createFromAsset(getAssets(), strArr[i]);
                    break;
                } catch (java.lang.RuntimeException unused) {
                    i++;
                }
            }
            this.e = typeface;
            this.h.B = stringExtra2;
            this.l.setTypeface(typeface);
        }
        if (intent.hasExtra(EXTRA_SHOW_HELPER_TEXT)) {
            boolean booleanExtra = intent.getBooleanExtra(EXTRA_SHOW_HELPER_TEXT, true);
            this.f3282a = booleanExtra;
            this.h.x = booleanExtra;
        }
        if (intent.hasExtra(EXTRA_HELPER_TEXT_POSITION)) {
            java.lang.String stringExtra3 = intent.getStringExtra(EXTRA_HELPER_TEXT_POSITION);
            com.dyneti.android.dyscan.DyScanView dyScanView2 = this.h;
            dyScanView2.C = stringExtra3;
            dyScanView2.n.b = stringExtra3;
        }
        if (intent.hasExtra(EXTRA_CORNER_THICKNESS)) {
            this.h.setCornerThickness(intent.getFloatExtra(EXTRA_CORNER_THICKNESS, 15.0f));
        }
        if (intent.hasExtra(EXTRA_SHOW_CORNERS)) {
            this.h.setShowCorners(intent.getBooleanExtra(EXTRA_SHOW_CORNERS, true));
        }
        if (intent.hasExtra(EXTRA_CORNER_INACTIVE_COLOR)) {
            this.h.setCornerInactiveColor(intent.getIntExtra(EXTRA_CORNER_INACTIVE_COLOR, com.dyneti.android.dyscan.j0.b));
        }
        if (intent.hasExtra(EXTRA_CORNER_ACTIVE_COLOR)) {
            this.h.setCornerActiveColor(intent.getIntExtra(EXTRA_CORNER_ACTIVE_COLOR, com.dyneti.android.dyscan.j0.c));
        }
        if (intent.hasExtra(EXTRA_CORNER_COMPLETED_COLOR)) {
            this.h.setCornerCompletedColor(intent.getIntExtra(EXTRA_CORNER_COMPLETED_COLOR, com.dyneti.android.dyscan.j0.d));
        }
        if (intent.hasExtra(EXTRA_BACKGROUND_COLOR)) {
            this.h.setBgColor(intent.getIntExtra(EXTRA_BACKGROUND_COLOR, -7829368));
        }
        if (intent.hasExtra(EXTRA_BACKGROUND_OPACITY)) {
            this.h.setBgOpacity(intent.getIntExtra(EXTRA_BACKGROUND_OPACITY, 115));
        }
        if (intent.hasExtra(EXTRA_SHOW_ROTATE_BUTTON)) {
            boolean booleanExtra2 = intent.getBooleanExtra(EXTRA_SHOW_ROTATE_BUTTON, false);
            this.f = booleanExtra2;
            this.h.V = booleanExtra2;
        }
        if (intent.hasExtra(EXTRA_LIGHT_TORCH_WHEN_DARK)) {
            this.h.setLightTorchWhenDark(intent.getBooleanExtra(EXTRA_LIGHT_TORCH_WHEN_DARK, false));
        }
        if (intent.hasExtra(EXTRA_SHOW_MANUAL_ENTRY_BUTTON)) {
            boolean booleanExtra3 = intent.getBooleanExtra(EXTRA_SHOW_MANUAL_ENTRY_BUTTON, false);
            this.g = booleanExtra3;
            this.h.b0 = booleanExtra3;
        }
        if (intent.hasExtra(EXTRA_MANUAL_ENTRY_STRING)) {
            this.h.c0 = intent.getStringExtra(EXTRA_MANUAL_ENTRY_STRING);
        }
        if (intent.hasExtra(EXTRA_SHOW_RESULT_OVERLAY)) {
            com.dyneti.android.dyscan.DyScanView dyScanView3 = this.h;
            com.dyneti.android.dyscan.g0 g0Var = com.dyneti.android.dyscan.DyScan.b;
            dyScanView3.setShowResultOverlay(intent.getBooleanExtra(EXTRA_SHOW_RESULT_OVERLAY, false));
        }
        if (intent.hasExtra(EXTRA_RESULT_OVERLAY_ALWAYS_HORIZONTAL)) {
            com.dyneti.android.dyscan.DyScanView dyScanView4 = this.h;
            com.dyneti.android.dyscan.g0 g0Var2 = com.dyneti.android.dyscan.DyScan.b;
            dyScanView4.setResultOverlayAlwaysHorizontal(intent.getBooleanExtra(EXTRA_RESULT_OVERLAY_ALWAYS_HORIZONTAL, false));
        }
        if (intent.hasExtra(EXTRA_CLIENT_FIELD)) {
            this.h.setClientField(intent.getStringExtra(EXTRA_CLIENT_FIELD));
        }
        if (intent.hasExtra(EXTRA_SHOW_DYNETI_LOGO)) {
            this.h.setShowDynetiLogo(intent.getBooleanExtra(EXTRA_SHOW_DYNETI_LOGO, true));
        }
        if (intent.hasExtra(EXTRA_CARD_FRAME_CONTENT_DESCRIPTION)) {
            this.h.setCardFrameContentDescription(intent.getStringExtra(EXTRA_CARD_FRAME_CONTENT_DESCRIPTION));
        }
        if (intent.hasExtra(EXTRA_SHOW_CARD_OVERLAY)) {
            this.h.setShowCardOverlay(intent.getBooleanExtra(EXTRA_SHOW_CARD_OVERLAY, true));
        }
        if (intent.hasExtra("is_react_native")) {
            this.h.setIsReactNative(intent.getBooleanExtra("is_react_native", false));
        }
        if (intent.hasExtra("user_id")) {
            this.h.setUserId(intent.getStringExtra("user_id"));
        }
        if (intent.hasExtra(EXTRA_SIDEWAYS_SCANNING_ENABLED)) {
            this.h.setSidewaysScanningEnabled(intent.getBooleanExtra(EXTRA_SIDEWAYS_SCANNING_ENABLED, false));
        }
        if (intent.hasExtra(EXTRA_EXPECTED_BIN)) {
            this.h.setExpectedBIN(intent.getStringExtra(EXTRA_EXPECTED_BIN));
        }
        if (intent.hasExtra(EXTRA_EXPECTED_LAST_FOUR_DIGITS)) {
            this.h.setExpectedLastFourDigits(intent.getStringExtra(EXTRA_EXPECTED_LAST_FOUR_DIGITS));
        }
        this.h.setDetectWrongCard(intent.getBooleanExtra(EXTRA_DETECT_WRONG_CARD, false));
        if (intent.hasExtra(EXTRA_AWAIT_SCAN_STORAGE)) {
            this.h.setAwaitScanStorage(java.lang.Boolean.valueOf(intent.getBooleanExtra(EXTRA_AWAIT_SCAN_STORAGE, false)));
        }
        if (intent.hasExtra(EXTRA_NEEDS_REVIEW)) {
            this.h.setNeedsReview(intent.getBooleanExtra(EXTRA_NEEDS_REVIEW, false));
        }
        if (intent.hasExtra(EXTRA_GIFT_CARD_MODE)) {
            this.h.setGiftCardMode(java.lang.Boolean.valueOf(intent.getBooleanExtra(EXTRA_GIFT_CARD_MODE, false)));
        }
        if (intent.hasExtra(EXTRA_GIFT_CARD_CONFIG_ID)) {
            this.h.setGiftCardConfig(intent.getStringExtra(EXTRA_GIFT_CARD_CONFIG_ID));
        }
        if (intent.hasExtra(EXTRA_PROMPT_IF_FEW_DIGITS)) {
            this.h.setPromptIfFewDigits(java.lang.Boolean.valueOf(intent.getBooleanExtra(EXTRA_PROMPT_IF_FEW_DIGITS, false)));
        }
        if (intent.hasExtra(EXTRA_OVERLAY_TEXT)) {
            this.h.setOverlayText(intent.getStringExtra(EXTRA_OVERLAY_TEXT));
        }
        if (intent.hasExtra(EXTRA_OVERLAY_TEXT_COLOR)) {
            this.h.setOverlayTextColor(intent.getIntExtra(EXTRA_OVERLAY_TEXT_COLOR, -1));
        }
        if (intent.hasExtra(EXTRA_OVERLAY_TEXT_FONT_FAMILY)) {
            this.h.setOverlayTextFont(getResources().getIdentifier(intent.getStringExtra(EXTRA_OVERLAY_TEXT_FONT_FAMILY), io.ktor.http.ContentType.Font.TYPE, getApplicationContext().getPackageName()));
        }
        if (intent.hasExtra(EXTRA_OVERLAY_TEXT_FONT_SIZE)) {
            this.h.setOverlayTextFontSize(intent.getFloatExtra(EXTRA_OVERLAY_TEXT_FONT_SIZE, 18.0f));
        }
        if (intent.hasExtra(EXTRA_GIFT_CARD_MODE)) {
            this.h.setGiftCardMode(java.lang.Boolean.valueOf(getIntent().getBooleanExtra(EXTRA_GIFT_CARD_MODE, false)));
        }
        if (androidx.core.content.ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") != 0) {
            androidx.core.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{"android.permission.CAMERA"}, 1);
        } else {
            this.h.onPermissionsGranted();
            b();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.h.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.h.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        if (iArr.length <= 0 || iArr[0] != 0) {
            this.h.a("permissions rejected");
            finish();
        } else {
            b();
            this.h.onPermissionsGranted();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.h.onResume();
    }

    public final void a(boolean z) {
        this.h.setTorchEnabled(z);
        android.widget.ImageButton imageButton = this.f != c() ? this.k : this.j;
        if (this.h.isTorchEnabled()) {
            imageButton.setContentDescription(getString(com.dyneti.android.dyscan.R.string.dyscan_flashlight_on_button_hint));
        } else {
            imageButton.setContentDescription(getString(com.dyneti.android.dyscan.R.string.dyscan_flashlight_off_button_hint));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
