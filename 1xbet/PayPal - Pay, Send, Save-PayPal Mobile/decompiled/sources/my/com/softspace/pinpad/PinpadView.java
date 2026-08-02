package my.com.softspace.pinpad;

/* loaded from: classes17.dex */
public class PinpadView extends android.widget.FrameLayout implements sspog.KeypadViewDelegate {
    private final int Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private android.widget.ImageButton getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private boolean getHighSpeedVideoSizesFor;
    private android.widget.LinearLayout getInputFormats;
    private java.lang.String getInputSizeshNQ4ISI;
    private boolean getOutputFormats;
    private int getOutputMinFrameDuration;
    private android.widget.LinearLayout getOutputMinFrameDurationlomOqCM;
    private android.content.Context getOutputSizes;
    private android.widget.LinearLayout getOutputSizeshNQ4ISI;
    private android.widget.LinearLayout getOutputStallDuration;
    private byte[] getOutputStallDurationlomOqCM;
    private android.widget.TextView getValidOutputFormatsForInputhNQ4ISI;
    private java.lang.String isOutputSupportedFor;
    private int isOutputSupportedForhNQ4ISI;
    private android.text.SpannableString unwrapAs;

    public PinpadView(android.content.Context context) {
        super(context);
        this.getHighSpeedVideoSizes = 20;
        this.getHighResolutionOutputSizeshNQ4ISI = 24;
        this.Camera2StreamConfigurationMap = 40;
        this.getOutputSizes = context;
    }

    public PinpadView(android.content.Context context, my.com.softspace.pinpad.PinpadParam pinpadParam) {
        super(context);
        this.getHighSpeedVideoSizes = 20;
        this.getHighResolutionOutputSizeshNQ4ISI = 24;
        this.Camera2StreamConfigurationMap = 40;
        this.getOutputSizes = context;
        this.unwrapAs = pinpadParam.getSpannableFormattedAmount();
        this.getHighSpeedVideoFpsRangesFor = pinpadParam.getFormattedAmount();
        this.getOutputStallDurationlomOqCM = pinpadParam.getPanToken();
        this.getInputSizeshNQ4ISI = pinpadParam.getCurrency();
        this.getHighSpeedVideoSizesFor = pinpadParam.isCurrencyDisplayBack();
        this.getOutputMinFrameDuration = pinpadParam.getDrawableBtnOKColor();
        this.getOutputFormats = pinpadParam.isFallbackMode();
        this.isOutputSupportedForhNQ4ISI = pinpadParam.getPlaceholderCount();
        this.isOutputSupportedFor = pinpadParam.getPinEntryMessage();
        ((android.view.LayoutInflater) this.getOutputSizes.getSystemService("layout_inflater")).inflate(my.com.softspace.sspog.R.layout.view_pinpad, this);
        this.getInputFormats = (android.widget.LinearLayout) findViewById(my.com.softspace.sspog.R.id.pin_entry_layout_amount);
        this.getOutputMinFrameDurationlomOqCM = (android.widget.LinearLayout) findViewById(my.com.softspace.sspog.R.id.pin_entry_layout_spannable_amount);
        this.getValidOutputFormatsForInputhNQ4ISI = (android.widget.TextView) findViewById(my.com.softspace.sspog.R.id.pin_entry_tv_enter_pin);
        android.text.SpannableString spannableString = this.unwrapAs;
        if (spannableString != null && spannableString.length() > 0) {
            this.getOutputMinFrameDurationlomOqCM.setVisibility(0);
            this.getInputFormats.setVisibility(8);
            ((android.widget.TextView) findViewById(my.com.softspace.sspog.R.id.pin_entry_tv_spannable_amount)).setText(this.unwrapAs);
        } else {
            this.getOutputMinFrameDurationlomOqCM.setVisibility(8);
            this.getInputFormats.setVisibility(0);
            ((android.widget.TextView) findViewById(my.com.softspace.sspog.R.id.pin_entry_tv_amount)).setText(this.getHighSpeedVideoFpsRangesFor);
            if (this.getHighSpeedVideoSizesFor) {
                android.widget.TextView textView = (android.widget.TextView) findViewById(my.com.softspace.sspog.R.id.pin_entry_tv_currency_back);
                textView.setText(this.getInputSizeshNQ4ISI);
                textView.setVisibility(0);
            } else {
                android.widget.TextView textView2 = (android.widget.TextView) findViewById(my.com.softspace.sspog.R.id.pin_entry_tv_currency_front);
                textView2.setText(this.getInputSizeshNQ4ISI);
                textView2.setVisibility(0);
            }
        }
        java.lang.String str = this.isOutputSupportedFor;
        if (str != null && str.length() > 0) {
            this.getValidOutputFormatsForInputhNQ4ISI.setText(this.isOutputSupportedFor);
        }
        android.widget.ImageButton imageButton = (android.widget.ImageButton) findViewById(my.com.softspace.sspog.R.id.pin_entry_cancel_button);
        this.getHighSpeedVideoFpsRanges = imageButton;
        imageButton.setEnabled(true);
        this.getHighSpeedVideoFpsRanges.setOnClickListener(new android.view.View.OnClickListener() { // from class: my.com.softspace.pinpad.PinpadView.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                my.com.softspace.pinpad.PinpadView.this.btnCancelPinClicked(view);
            }
        });
        this.getOutputSizeshNQ4ISI = (android.widget.LinearLayout) findViewById(my.com.softspace.sspog.R.id.pin_entry_layout_pin_display);
        android.widget.LinearLayout.LayoutParams highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        highSpeedVideoFpsRangesFor.setMargins((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.getOutputSizes, 8.0f), 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.getOutputSizes, 8.0f), 0);
        for (int i = 0; i < this.isOutputSupportedForhNQ4ISI; i++) {
            android.widget.ImageView imageView = new android.widget.ImageView(this.getOutputSizes);
            imageView.setLayoutParams(highSpeedVideoFpsRangesFor);
            imageView.setImageDrawable(this.getOutputSizes.getResources().getDrawable(my.com.softspace.sspog.R.drawable.custom_img_dot_placeholder));
            this.getOutputSizeshNQ4ISI.addView(imageView);
        }
        this.getOutputStallDuration = (android.widget.LinearLayout) findViewById(my.com.softspace.sspog.R.id.pin_entry_layout_keypad);
        sspog.SSPinpadLayout sSPinpadLayout = new sspog.SSPinpadLayout(this.getOutputSizes);
        sSPinpadLayout.setDelegate(this);
        sSPinpadLayout.setKeypadViewDrawable(my.com.softspace.sspog.R.drawable.icn_pin_tick, this.getOutputMinFrameDuration, my.com.softspace.sspog.R.drawable.icn_pin_clear, new android.graphics.drawable.ColorDrawable(-1), this.getOutputFormats);
        sSPinpadLayout.drawUI(this.getOutputStallDurationlomOqCM);
        this.getOutputStallDuration.addView(sSPinpadLayout);
    }

    private android.widget.LinearLayout.LayoutParams getHighSpeedVideoFpsRangesFor() {
        if (my.com.softspace.common.util.ScreenUtil.getDeviceScreenInfo(this.getOutputSizes, my.com.softspace.common.util.ScreenUtil.DEVICE_SCREEN_INFO_DP_WIDTH) >= 600.0f) {
            return new android.widget.LinearLayout.LayoutParams((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.getOutputSizes, 40.0f), (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.getOutputSizes, 40.0f), 1.0f);
        }
        if (my.com.softspace.common.util.ScreenUtil.getDeviceScreenInfo(this.getOutputSizes, my.com.softspace.common.util.ScreenUtil.DEVICE_SCREEN_INFO_DP_WIDTH) < 360.0f) {
            return new android.widget.LinearLayout.LayoutParams((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.getOutputSizes, 20.0f), (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.getOutputSizes, 20.0f), 1.0f);
        }
        return new android.widget.LinearLayout.LayoutParams((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.getOutputSizes, 24.0f), (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.getOutputSizes, 24.0f), 1.0f);
    }

    @Override // sspog.KeypadViewDelegate
    public void keypadViewDidOnClicked(int i) {
        this.getOutputSizeshNQ4ISI.removeAllViews();
        this.getOutputSizeshNQ4ISI.setWeightSum(i);
        android.widget.LinearLayout.LayoutParams highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        highSpeedVideoFpsRangesFor.setMargins((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.getOutputSizes, 8.0f), 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.getOutputSizes, 8.0f), 0);
        for (int i2 = 0; i2 < i; i2++) {
            android.widget.ImageView imageView = new android.widget.ImageView(this.getOutputSizes);
            imageView.setLayoutParams(highSpeedVideoFpsRangesFor);
            imageView.setImageDrawable(this.getOutputSizes.getResources().getDrawable(my.com.softspace.sspog.R.drawable.custom_img_dot));
            this.getOutputSizeshNQ4ISI.addView(imageView);
        }
        if (i < this.isOutputSupportedForhNQ4ISI) {
            for (int i3 = 0; i3 < this.isOutputSupportedForhNQ4ISI - i; i3++) {
                android.widget.ImageView imageView2 = new android.widget.ImageView(this.getOutputSizes);
                imageView2.setLayoutParams(highSpeedVideoFpsRangesFor);
                imageView2.setImageDrawable(this.getOutputSizes.getResources().getDrawable(my.com.softspace.sspog.R.drawable.custom_img_dot_placeholder));
                this.getOutputSizeshNQ4ISI.addView(imageView2);
            }
        }
    }

    public void btnCancelPinClicked(android.view.View view) {
        sspog.SSPOGService.getInstance().cancelPinSDK();
    }
}
