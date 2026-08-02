package sspog;

/* loaded from: classes18.dex */
public class SSPinpadLayout extends android.widget.LinearLayout {
    private static final short PINPAD_BACKSPACE_TAG_NUMBER = 56;
    public static final int PINPAD_NUMBER_COUNT = 10;
    private static final short PINPAD_OK_TAG_NUMBER = 55;
    private int btnHeightDefaultInDp;
    private int btnHeightSW360InDp;
    private int btnHeightSW600InDp;
    private android.view.View.OnClickListener btnNumPadClicked;
    private float buttonFontSize;
    private int buttonGapDpValue;
    private android.widget.ImageView buttonR1C1;
    private android.widget.ImageView buttonR1C2;
    private android.widget.ImageView buttonR1C3;
    private android.widget.ImageView buttonR2C1;
    private android.widget.ImageView buttonR2C2;
    private android.widget.ImageView buttonR2C3;
    private android.widget.ImageView buttonR3C1;
    private android.widget.ImageView buttonR3C2;
    private android.widget.ImageView buttonR3C3;
    private android.widget.ImageView buttonR4C1;
    private android.widget.ImageView buttonR4C2;
    private android.widget.ImageView buttonR4C3;
    private sspog.KeypadViewDelegate delegate;
    private android.graphics.drawable.Drawable drawableBtnCorrection;
    private android.graphics.drawable.Drawable drawableBtnOK;
    private int drawableBtnOKColor;
    private android.graphics.drawable.Drawable drawableViewBackground;
    boolean isCpoc;
    private boolean isFallbackMode;
    private int keypadLineColor;
    private android.content.Context layoutContext;

    public void setDelegate(sspog.KeypadViewDelegate keypadViewDelegate) {
        this.delegate = keypadViewDelegate;
    }

    public SSPinpadLayout(android.content.Context context) {
        super(context);
        this.isCpoc = true;
        this.buttonGapDpValue = 1;
        this.btnHeightDefaultInDp = 68;
        this.btnHeightSW360InDp = 78;
        this.btnHeightSW600InDp = 98;
        this.buttonFontSize = 24.0f;
        this.keypadLineColor = -16777216;
        this.drawableBtnOKColor = -8033051;
        this.isFallbackMode = false;
        this.delegate = null;
        this.btnNumPadClicked = new android.view.View.OnClickListener() { // from class: sspog.SSPinpadLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                my.com.softspace.common.util.ScreenUtil.dismissKeyboard((android.app.Activity) sspog.SSPinpadLayout.this.layoutContext);
                java.lang.Object tag = view.getTag();
                boolean z = tag instanceof java.lang.Short;
                if (z && ((java.lang.Short) tag).shortValue() == 56) {
                    sspog.SSPOGService.popPin();
                } else if (tag instanceof java.lang.Byte) {
                    sspog.SSPOGService.pushPin(((java.lang.Byte) tag).byteValue());
                }
                if (sspog.SSPinpadLayout.this.drawableBtnOK == null || sspog.SSPOGService.pinLength() <= 3) {
                    if (sspog.SSPinpadLayout.this.drawableBtnOK != null) {
                        sspog.SSPinpadLayout.this.buttonR4C3.setEnabled(false);
                        if (sspog.SSPinpadLayout.this.isCpoc) {
                            sspog.SSPinpadLayout.this.buttonR4C3.setBackground(sspog.SSPinpadLayout.this.layoutContext.getResources().getDrawable(my.com.softspace.sspog.R.drawable.custom_btn_bg_round_disabled));
                        }
                    }
                } else {
                    sspog.SSPinpadLayout.this.buttonR4C3.setEnabled(true);
                    sspog.SSPinpadLayout.this.buttonR4C3.getBackground().setColorFilter(new android.graphics.PorterDuffColorFilter(sspog.SSPinpadLayout.this.drawableBtnOKColor, android.graphics.PorterDuff.Mode.SRC_IN));
                }
                if (sspog.SSPinpadLayout.this.delegate != null) {
                    sspog.SSPinpadLayout.this.delegate.keypadViewDidOnClicked(sspog.SSPOGService.pinLength());
                }
                if (z && ((java.lang.Short) tag).shortValue() == 55) {
                    sspog.SSPOGService.getInstance().confirmPinSDK();
                }
            }
        };
        this.layoutContext = context;
    }

    public SSPinpadLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isCpoc = true;
        this.buttonGapDpValue = 1;
        this.btnHeightDefaultInDp = 68;
        this.btnHeightSW360InDp = 78;
        this.btnHeightSW600InDp = 98;
        this.buttonFontSize = 24.0f;
        this.keypadLineColor = -16777216;
        this.drawableBtnOKColor = -8033051;
        this.isFallbackMode = false;
        this.delegate = null;
        this.btnNumPadClicked = new android.view.View.OnClickListener() { // from class: sspog.SSPinpadLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                my.com.softspace.common.util.ScreenUtil.dismissKeyboard((android.app.Activity) sspog.SSPinpadLayout.this.layoutContext);
                java.lang.Object tag = view.getTag();
                boolean z = tag instanceof java.lang.Short;
                if (z && ((java.lang.Short) tag).shortValue() == 56) {
                    sspog.SSPOGService.popPin();
                } else if (tag instanceof java.lang.Byte) {
                    sspog.SSPOGService.pushPin(((java.lang.Byte) tag).byteValue());
                }
                if (sspog.SSPinpadLayout.this.drawableBtnOK == null || sspog.SSPOGService.pinLength() <= 3) {
                    if (sspog.SSPinpadLayout.this.drawableBtnOK != null) {
                        sspog.SSPinpadLayout.this.buttonR4C3.setEnabled(false);
                        if (sspog.SSPinpadLayout.this.isCpoc) {
                            sspog.SSPinpadLayout.this.buttonR4C3.setBackground(sspog.SSPinpadLayout.this.layoutContext.getResources().getDrawable(my.com.softspace.sspog.R.drawable.custom_btn_bg_round_disabled));
                        }
                    }
                } else {
                    sspog.SSPinpadLayout.this.buttonR4C3.setEnabled(true);
                    sspog.SSPinpadLayout.this.buttonR4C3.getBackground().setColorFilter(new android.graphics.PorterDuffColorFilter(sspog.SSPinpadLayout.this.drawableBtnOKColor, android.graphics.PorterDuff.Mode.SRC_IN));
                }
                if (sspog.SSPinpadLayout.this.delegate != null) {
                    sspog.SSPinpadLayout.this.delegate.keypadViewDidOnClicked(sspog.SSPOGService.pinLength());
                }
                if (z && ((java.lang.Short) tag).shortValue() == 55) {
                    sspog.SSPOGService.getInstance().confirmPinSDK();
                }
            }
        };
        this.layoutContext = context;
    }

    public SSPinpadLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isCpoc = true;
        this.buttonGapDpValue = 1;
        this.btnHeightDefaultInDp = 68;
        this.btnHeightSW360InDp = 78;
        this.btnHeightSW600InDp = 98;
        this.buttonFontSize = 24.0f;
        this.keypadLineColor = -16777216;
        this.drawableBtnOKColor = -8033051;
        this.isFallbackMode = false;
        this.delegate = null;
        this.btnNumPadClicked = new android.view.View.OnClickListener() { // from class: sspog.SSPinpadLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                my.com.softspace.common.util.ScreenUtil.dismissKeyboard((android.app.Activity) sspog.SSPinpadLayout.this.layoutContext);
                java.lang.Object tag = view.getTag();
                boolean z = tag instanceof java.lang.Short;
                if (z && ((java.lang.Short) tag).shortValue() == 56) {
                    sspog.SSPOGService.popPin();
                } else if (tag instanceof java.lang.Byte) {
                    sspog.SSPOGService.pushPin(((java.lang.Byte) tag).byteValue());
                }
                if (sspog.SSPinpadLayout.this.drawableBtnOK == null || sspog.SSPOGService.pinLength() <= 3) {
                    if (sspog.SSPinpadLayout.this.drawableBtnOK != null) {
                        sspog.SSPinpadLayout.this.buttonR4C3.setEnabled(false);
                        if (sspog.SSPinpadLayout.this.isCpoc) {
                            sspog.SSPinpadLayout.this.buttonR4C3.setBackground(sspog.SSPinpadLayout.this.layoutContext.getResources().getDrawable(my.com.softspace.sspog.R.drawable.custom_btn_bg_round_disabled));
                        }
                    }
                } else {
                    sspog.SSPinpadLayout.this.buttonR4C3.setEnabled(true);
                    sspog.SSPinpadLayout.this.buttonR4C3.getBackground().setColorFilter(new android.graphics.PorterDuffColorFilter(sspog.SSPinpadLayout.this.drawableBtnOKColor, android.graphics.PorterDuff.Mode.SRC_IN));
                }
                if (sspog.SSPinpadLayout.this.delegate != null) {
                    sspog.SSPinpadLayout.this.delegate.keypadViewDidOnClicked(sspog.SSPOGService.pinLength());
                }
                if (z && ((java.lang.Short) tag).shortValue() == 55) {
                    sspog.SSPOGService.getInstance().confirmPinSDK();
                }
            }
        };
        this.layoutContext = context;
    }

    public final void setButtonFontSize(float f) {
        this.buttonFontSize = f;
    }

    public final void setKeypadLineColor(int i) {
        this.keypadLineColor = this.layoutContext.getColor(i);
    }

    public final void setKeypadViewDrawable(int i, android.graphics.drawable.Drawable drawable) {
        this.drawableBtnCorrection = this.layoutContext.getResources().getDrawable(i);
        this.drawableViewBackground = drawable;
    }

    public final void setKeypadViewDrawable(int i, int i2, int i3, android.graphics.drawable.Drawable drawable, boolean z) {
        this.drawableBtnOK = this.layoutContext.getResources().getDrawable(i);
        this.drawableBtnCorrection = this.layoutContext.getResources().getDrawable(i3);
        this.drawableViewBackground = drawable;
        this.drawableBtnOKColor = i2;
        this.isFallbackMode = z;
    }

    public final void drawUI(byte[] bArr) {
        if (this.isCpoc) {
            initCpocUI(bArr);
        } else {
            initSpocUI(bArr);
        }
    }

    private void initSpocUI(byte[] bArr) {
        android.widget.ImageView imageView = new android.widget.ImageView(this.layoutContext);
        this.buttonR1C1 = imageView;
        android.widget.ImageView imageView2 = new android.widget.ImageView(this.layoutContext);
        this.buttonR1C2 = imageView2;
        android.widget.ImageView imageView3 = new android.widget.ImageView(this.layoutContext);
        this.buttonR1C3 = imageView3;
        android.widget.ImageView imageView4 = new android.widget.ImageView(this.layoutContext);
        this.buttonR2C1 = imageView4;
        android.widget.ImageView imageView5 = new android.widget.ImageView(this.layoutContext);
        this.buttonR2C2 = imageView5;
        android.widget.ImageView imageView6 = new android.widget.ImageView(this.layoutContext);
        this.buttonR2C3 = imageView6;
        android.widget.ImageView imageView7 = new android.widget.ImageView(this.layoutContext);
        this.buttonR3C1 = imageView7;
        android.widget.ImageView imageView8 = new android.widget.ImageView(this.layoutContext);
        this.buttonR3C2 = imageView8;
        android.widget.ImageView imageView9 = new android.widget.ImageView(this.layoutContext);
        this.buttonR3C3 = imageView9;
        android.widget.ImageView imageView10 = new android.widget.ImageView(this.layoutContext);
        this.buttonR4C2 = imageView10;
        this.buttonR4C1 = new android.widget.ImageView(this.layoutContext);
        this.buttonR4C3 = new android.widget.ImageView(this.layoutContext);
        sspog.SSPOGService.createPinPad(new android.widget.ImageView[]{imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10}, bArr, new sspog.SSPinpadLayout$$ExternalSyntheticLambda0(this));
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        setBackgroundDrawable(this.drawableViewBackground);
        setOrientation(1);
        setPadding((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f));
        setWeightSum(4.0f);
        android.widget.LinearLayout.LayoutParams keypadButtonLayoutParams = setKeypadButtonLayoutParams();
        keypadButtonLayoutParams.setMargins(0, 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, this.buttonGapDpValue / 2), 0);
        android.widget.LinearLayout.LayoutParams keypadButtonLayoutParams2 = setKeypadButtonLayoutParams();
        if (this.buttonGapDpValue == 1) {
            keypadButtonLayoutParams2.setMargins((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0);
        } else {
            keypadButtonLayoutParams2.setMargins((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, r5 / 2), 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, this.buttonGapDpValue / 2), 0);
        }
        android.widget.LinearLayout.LayoutParams keypadButtonLayoutParams3 = setKeypadButtonLayoutParams();
        keypadButtonLayoutParams3.setMargins((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, this.buttonGapDpValue / 2), 0, 0, 0);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0f);
        layoutParams.setMargins(0, 0, 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, this.buttonGapDpValue));
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.layoutContext);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setWeightSum(3.0f);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundColor(this.keypadLineColor);
        linearLayout.setPadding(0, 0, 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f));
        addView(linearLayout);
        this.buttonR1C1.setLayoutParams(keypadButtonLayoutParams);
        this.buttonR1C1.setOnClickListener(this.btnNumPadClicked);
        this.buttonR1C1.setBackground(this.drawableViewBackground);
        this.buttonR1C1.setPadding((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0, 0, 0);
        this.buttonR1C1.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout.addView(this.buttonR1C1);
        this.buttonR1C2.setLayoutParams(keypadButtonLayoutParams2);
        this.buttonR1C2.setOnClickListener(this.btnNumPadClicked);
        this.buttonR1C2.setBackground(this.drawableViewBackground);
        this.buttonR1C2.setPadding(0, 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0);
        this.buttonR1C2.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout.addView(this.buttonR1C2);
        this.buttonR1C3.setLayoutParams(keypadButtonLayoutParams3);
        this.buttonR1C3.setOnClickListener(this.btnNumPadClicked);
        this.buttonR1C3.setBackground(this.drawableViewBackground);
        this.buttonR1C3.setPadding((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0);
        this.buttonR1C3.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout.addView(this.buttonR1C3);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0f);
        layoutParams2.setMargins(0, 0, 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, this.buttonGapDpValue));
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(this.layoutContext);
        linearLayout2.setLayoutParams(layoutParams2);
        linearLayout2.setWeightSum(3.0f);
        linearLayout2.setOrientation(0);
        linearLayout2.setBackgroundColor(this.keypadLineColor);
        linearLayout2.setPadding(0, 0, 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f));
        addView(linearLayout2);
        this.buttonR2C1.setLayoutParams(keypadButtonLayoutParams);
        this.buttonR2C1.setOnClickListener(this.btnNumPadClicked);
        this.buttonR2C1.setBackground(this.drawableViewBackground);
        this.buttonR2C1.setPadding((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0);
        this.buttonR2C1.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout2.addView(this.buttonR2C1);
        this.buttonR2C2.setLayoutParams(keypadButtonLayoutParams2);
        this.buttonR2C2.setOnClickListener(this.btnNumPadClicked);
        this.buttonR2C2.setBackground(this.drawableViewBackground);
        this.buttonR2C2.setPadding((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0);
        this.buttonR2C2.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout2.addView(this.buttonR2C2);
        this.buttonR2C3.setLayoutParams(keypadButtonLayoutParams3);
        this.buttonR2C3.setBackground(this.drawableViewBackground);
        this.buttonR2C3.setOnClickListener(this.btnNumPadClicked);
        this.buttonR2C3.setPadding((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0);
        this.buttonR2C3.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout2.addView(this.buttonR2C3);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0f);
        layoutParams3.setMargins(0, 0, 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, this.buttonGapDpValue));
        android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(this.layoutContext);
        linearLayout3.setLayoutParams(layoutParams3);
        linearLayout3.setWeightSum(3.0f);
        linearLayout3.setOrientation(0);
        linearLayout3.setBackgroundColor(this.keypadLineColor);
        linearLayout3.setPadding(0, 0, 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f));
        addView(linearLayout3);
        this.buttonR3C1.setLayoutParams(keypadButtonLayoutParams);
        this.buttonR3C1.setOnClickListener(this.btnNumPadClicked);
        this.buttonR3C1.setBackground(this.drawableViewBackground);
        this.buttonR3C1.setPadding((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0);
        this.buttonR3C1.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout3.addView(this.buttonR3C1);
        this.buttonR3C2.setLayoutParams(keypadButtonLayoutParams2);
        this.buttonR3C2.setOnClickListener(this.btnNumPadClicked);
        this.buttonR3C2.setBackground(this.drawableViewBackground);
        this.buttonR3C2.setPadding((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0);
        this.buttonR3C2.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout3.addView(this.buttonR3C2);
        this.buttonR3C3.setLayoutParams(keypadButtonLayoutParams3);
        this.buttonR3C3.setBackground(this.drawableViewBackground);
        this.buttonR3C3.setOnClickListener(this.btnNumPadClicked);
        this.buttonR3C3.setPadding((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0);
        this.buttonR3C3.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout3.addView(this.buttonR3C3);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0f);
        android.widget.LinearLayout linearLayout4 = new android.widget.LinearLayout(this.layoutContext);
        linearLayout4.setLayoutParams(layoutParams4);
        linearLayout4.setWeightSum(3.0f);
        linearLayout4.setOrientation(0);
        linearLayout4.setBackgroundColor(this.keypadLineColor);
        addView(linearLayout4);
        this.buttonR4C1.setLayoutParams(keypadButtonLayoutParams);
        this.buttonR4C1.setBackground(this.drawableViewBackground);
        this.buttonR4C1.setPadding((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0);
        this.buttonR4C1.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout4.addView(this.buttonR4C1);
        this.buttonR4C2.setLayoutParams(keypadButtonLayoutParams2);
        this.buttonR4C2.setBackground(this.drawableViewBackground);
        this.buttonR4C2.setPadding((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0, 0, 0);
        this.buttonR4C2.setOnClickListener(this.btnNumPadClicked);
        this.buttonR4C2.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout4.addView(this.buttonR4C2);
        this.buttonR4C3.setLayoutParams(keypadButtonLayoutParams3);
        this.buttonR4C3.setTag(java.lang.Short.valueOf(PINPAD_BACKSPACE_TAG_NUMBER));
        this.buttonR4C3.setPadding((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0, 0, 0);
        android.widget.ImageView imageView11 = this.buttonR4C3;
        android.graphics.drawable.Drawable drawable = this.drawableBtnCorrection;
        imageView11.setImageDrawable(my.com.softspace.common.util.ScreenUtil.getButtonDrawableSelector(drawable, drawable));
        this.buttonR4C3.setBackground(this.drawableViewBackground);
        this.buttonR4C3.setOnClickListener(this.btnNumPadClicked);
        this.buttonR4C3.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout4.addView(this.buttonR4C3);
    }

    private void initCpocUI(byte[] bArr) {
        android.widget.ImageView imageView = new android.widget.ImageView(this.layoutContext);
        this.buttonR1C1 = imageView;
        android.widget.ImageView imageView2 = new android.widget.ImageView(this.layoutContext);
        this.buttonR1C2 = imageView2;
        android.widget.ImageView imageView3 = new android.widget.ImageView(this.layoutContext);
        this.buttonR1C3 = imageView3;
        android.widget.ImageView imageView4 = new android.widget.ImageView(this.layoutContext);
        this.buttonR2C1 = imageView4;
        android.widget.ImageView imageView5 = new android.widget.ImageView(this.layoutContext);
        this.buttonR2C2 = imageView5;
        android.widget.ImageView imageView6 = new android.widget.ImageView(this.layoutContext);
        this.buttonR2C3 = imageView6;
        android.widget.ImageView imageView7 = new android.widget.ImageView(this.layoutContext);
        this.buttonR3C1 = imageView7;
        android.widget.ImageView imageView8 = new android.widget.ImageView(this.layoutContext);
        this.buttonR3C2 = imageView8;
        android.widget.ImageView imageView9 = new android.widget.ImageView(this.layoutContext);
        this.buttonR3C3 = imageView9;
        android.widget.ImageView imageView10 = new android.widget.ImageView(this.layoutContext);
        this.buttonR4C2 = imageView10;
        this.buttonR4C1 = new android.widget.ImageView(this.layoutContext);
        this.buttonR4C3 = new android.widget.ImageView(this.layoutContext);
        sspog.SSPOGService.createPinPad(new android.widget.ImageView[]{imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10}, bArr, new sspog.SSPinpadLayout$$ExternalSyntheticLambda0(this), this.isFallbackMode);
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        setBackgroundColor(0);
        setOrientation(1);
        setPadding((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f));
        setWeightSum(4.0f);
        android.widget.LinearLayout.LayoutParams keypadButtonLayoutParams = setKeypadButtonLayoutParams();
        keypadButtonLayoutParams.setMargins((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 22.0f), 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 22.0f), 0);
        android.widget.LinearLayout.LayoutParams keypadButtonLayoutParams2 = setKeypadButtonLayoutParams();
        keypadButtonLayoutParams2.setMargins((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 22.0f), 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 22.0f), 0);
        android.widget.LinearLayout.LayoutParams keypadButtonLayoutParams3 = setKeypadButtonLayoutParams();
        keypadButtonLayoutParams3.setMargins((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 22.0f), 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 22.0f), 0);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 10.0f), 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 10.0f));
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.layoutContext);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundColor(0);
        addView(linearLayout);
        this.buttonR1C1.setLayoutParams(keypadButtonLayoutParams);
        this.buttonR1C1.setOnClickListener(this.btnNumPadClicked);
        this.buttonR1C1.setBackground(this.layoutContext.getResources().getDrawable(my.com.softspace.sspog.R.drawable.custom_btn_bg_round));
        this.buttonR1C1.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout.addView(this.buttonR1C1);
        this.buttonR1C2.setLayoutParams(keypadButtonLayoutParams2);
        this.buttonR1C2.setOnClickListener(this.btnNumPadClicked);
        this.buttonR1C2.setBackground(this.layoutContext.getResources().getDrawable(my.com.softspace.sspog.R.drawable.custom_btn_bg_round));
        this.buttonR1C2.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout.addView(this.buttonR1C2);
        this.buttonR1C3.setLayoutParams(keypadButtonLayoutParams3);
        this.buttonR1C3.setOnClickListener(this.btnNumPadClicked);
        this.buttonR1C3.setBackground(this.layoutContext.getResources().getDrawable(my.com.softspace.sspog.R.drawable.custom_btn_bg_round));
        this.buttonR1C3.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout.addView(this.buttonR1C3);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 10.0f), 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 10.0f));
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(this.layoutContext);
        linearLayout2.setLayoutParams(layoutParams2);
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(0);
        linearLayout2.setBackgroundColor(0);
        addView(linearLayout2);
        this.buttonR2C1.setLayoutParams(keypadButtonLayoutParams);
        this.buttonR2C1.setOnClickListener(this.btnNumPadClicked);
        this.buttonR2C1.setBackground(this.layoutContext.getResources().getDrawable(my.com.softspace.sspog.R.drawable.custom_btn_bg_round));
        this.buttonR2C1.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout2.addView(this.buttonR2C1);
        this.buttonR2C2.setLayoutParams(keypadButtonLayoutParams2);
        this.buttonR2C2.setOnClickListener(this.btnNumPadClicked);
        this.buttonR2C2.setBackground(this.layoutContext.getResources().getDrawable(my.com.softspace.sspog.R.drawable.custom_btn_bg_round));
        this.buttonR2C2.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout2.addView(this.buttonR2C2);
        this.buttonR2C3.setLayoutParams(keypadButtonLayoutParams3);
        this.buttonR2C3.setBackground(this.layoutContext.getResources().getDrawable(my.com.softspace.sspog.R.drawable.custom_btn_bg_round));
        this.buttonR2C3.setOnClickListener(this.btnNumPadClicked);
        this.buttonR2C3.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout2.addView(this.buttonR2C3);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 10.0f), 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 10.0f));
        android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(this.layoutContext);
        linearLayout3.setLayoutParams(layoutParams3);
        linearLayout3.setGravity(17);
        linearLayout3.setOrientation(0);
        linearLayout3.setBackgroundColor(0);
        addView(linearLayout3);
        this.buttonR3C1.setLayoutParams(keypadButtonLayoutParams);
        this.buttonR3C1.setOnClickListener(this.btnNumPadClicked);
        this.buttonR3C1.setBackground(this.layoutContext.getResources().getDrawable(my.com.softspace.sspog.R.drawable.custom_btn_bg_round));
        this.buttonR3C1.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout3.addView(this.buttonR3C1);
        this.buttonR3C2.setLayoutParams(keypadButtonLayoutParams2);
        this.buttonR3C2.setOnClickListener(this.btnNumPadClicked);
        this.buttonR3C2.setBackground(this.layoutContext.getResources().getDrawable(my.com.softspace.sspog.R.drawable.custom_btn_bg_round));
        this.buttonR3C2.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout3.addView(this.buttonR3C2);
        this.buttonR3C3.setLayoutParams(keypadButtonLayoutParams3);
        this.buttonR3C3.setBackground(this.layoutContext.getResources().getDrawable(my.com.softspace.sspog.R.drawable.custom_btn_bg_round));
        this.buttonR3C3.setOnClickListener(this.btnNumPadClicked);
        this.buttonR3C3.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout3.addView(this.buttonR3C3);
        android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 10.0f), 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 10.0f));
        android.widget.LinearLayout linearLayout4 = new android.widget.LinearLayout(this.layoutContext);
        linearLayout4.setLayoutParams(layoutParams4);
        linearLayout4.setGravity(17);
        linearLayout4.setOrientation(0);
        linearLayout4.setBackgroundColor(0);
        addView(linearLayout4);
        android.graphics.drawable.Drawable drawable = this.drawableBtnOK;
        java.lang.Short valueOf = java.lang.Short.valueOf(PINPAD_BACKSPACE_TAG_NUMBER);
        if (drawable != null) {
            this.buttonR4C1.setLayoutParams(keypadButtonLayoutParams);
            this.buttonR4C1.setTag(valueOf);
            android.widget.ImageView imageView11 = this.buttonR4C1;
            android.graphics.drawable.Drawable drawable2 = this.drawableBtnCorrection;
            imageView11.setImageDrawable(my.com.softspace.common.util.ScreenUtil.getButtonDrawableSelector(drawable2, drawable2));
            this.buttonR4C1.setBackground(this.layoutContext.getResources().getDrawable(my.com.softspace.sspog.R.drawable.custom_btn_bg_round));
            this.buttonR4C1.setPadding(0, 0, (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 2.0f), 0);
            this.buttonR4C1.setOnClickListener(this.btnNumPadClicked);
            this.buttonR4C1.setScaleType(android.widget.ImageView.ScaleType.CENTER);
            linearLayout4.addView(this.buttonR4C1);
            this.buttonR4C2.setLayoutParams(keypadButtonLayoutParams2);
            this.buttonR4C2.setBackground(this.layoutContext.getResources().getDrawable(my.com.softspace.sspog.R.drawable.custom_btn_bg_round));
            this.buttonR4C2.setOnClickListener(this.btnNumPadClicked);
            this.buttonR4C2.setScaleType(android.widget.ImageView.ScaleType.CENTER);
            linearLayout4.addView(this.buttonR4C2);
            this.buttonR4C3.setLayoutParams(keypadButtonLayoutParams3);
            this.buttonR4C3.setTag(java.lang.Short.valueOf(PINPAD_OK_TAG_NUMBER));
            android.widget.ImageView imageView12 = this.buttonR4C3;
            android.graphics.drawable.Drawable drawable3 = this.drawableBtnOK;
            imageView12.setImageDrawable(my.com.softspace.common.util.ScreenUtil.getButtonDrawableSelector(drawable3, drawable3));
            this.buttonR4C3.setBackground(this.layoutContext.getResources().getDrawable(my.com.softspace.sspog.R.drawable.custom_btn_bg_round_disabled));
            this.buttonR4C3.setOnClickListener(this.btnNumPadClicked);
            this.buttonR4C3.setScaleType(android.widget.ImageView.ScaleType.CENTER);
            this.buttonR4C3.setEnabled(false);
            linearLayout4.addView(this.buttonR4C3);
            return;
        }
        this.buttonR4C1.setLayoutParams(keypadButtonLayoutParams);
        this.buttonR4C1.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout4.addView(this.buttonR4C1);
        this.buttonR4C2.setLayoutParams(keypadButtonLayoutParams2);
        this.buttonR4C2.setBackground(this.layoutContext.getResources().getDrawable(my.com.softspace.sspog.R.drawable.custom_btn_bg_round));
        this.buttonR4C2.setOnClickListener(this.btnNumPadClicked);
        this.buttonR4C2.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout4.addView(this.buttonR4C2);
        this.buttonR4C3.setLayoutParams(keypadButtonLayoutParams3);
        this.buttonR4C3.setTag(valueOf);
        android.widget.ImageView imageView13 = this.buttonR4C3;
        android.graphics.drawable.Drawable drawable4 = this.drawableBtnCorrection;
        imageView13.setImageDrawable(my.com.softspace.common.util.ScreenUtil.getButtonDrawableSelector(drawable4, drawable4));
        this.buttonR4C3.setBackground(this.layoutContext.getResources().getDrawable(my.com.softspace.sspog.R.drawable.custom_btn_bg_round));
        this.buttonR4C3.setPadding((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, 1.0f), 0, 0, 0);
        this.buttonR4C3.setOnClickListener(this.btnNumPadClicked);
        this.buttonR4C3.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        linearLayout4.addView(this.buttonR4C3);
    }

    private android.widget.LinearLayout.LayoutParams setKeypadButtonLayoutParams() {
        if (!this.isCpoc) {
            return new android.widget.LinearLayout.LayoutParams(0, -1, 1.0f);
        }
        if (my.com.softspace.common.util.ScreenUtil.getDeviceScreenInfo(this.layoutContext, my.com.softspace.common.util.ScreenUtil.DEVICE_SCREEN_INFO_DP_WIDTH) >= 600.0f) {
            return new android.widget.LinearLayout.LayoutParams((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, this.btnHeightSW600InDp), (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, this.btnHeightSW600InDp));
        }
        if (my.com.softspace.common.util.ScreenUtil.getDeviceScreenInfo(this.layoutContext, my.com.softspace.common.util.ScreenUtil.DEVICE_SCREEN_INFO_DP_WIDTH) <= 360.0f) {
            return new android.widget.LinearLayout.LayoutParams((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, this.btnHeightDefaultInDp), (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, this.btnHeightDefaultInDp));
        }
        return new android.widget.LinearLayout.LayoutParams((int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, this.btnHeightSW360InDp), (int) my.com.softspace.common.util.ScreenUtil.dpToPixels(this.layoutContext, this.btnHeightSW360InDp));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.graphics.Bitmap drawTextAsBitmap(java.lang.Byte b) {
        java.lang.String valueOf = java.lang.String.valueOf(b);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setTextSize(android.util.TypedValue.applyDimension(1, this.buttonFontSize, getResources().getDisplayMetrics()));
        paint.setColor(-16777216);
        paint.setTextAlign(android.graphics.Paint.Align.LEFT);
        float f = -paint.ascent();
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((int) (paint.measureText(valueOf) + 0.5f), (int) (paint.descent() + f + 0.5f), android.graphics.Bitmap.Config.ARGB_8888);
        new android.graphics.Canvas(createBitmap).drawText(valueOf, 0.0f, f, paint);
        return createBitmap;
    }

    private static final float dpToPixels(android.content.Context context, float f) {
        return android.util.TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }
}
