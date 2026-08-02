package com.microblink.blinkid.fragment.overlay.blinkid.reticleui;

/* loaded from: classes10.dex */
public class BlinkIdDialogOnboardingView implements com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingView {
    private com.microblink.blinkid.fragment.overlay.TooltipManager Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String[] getHighSpeedVideoFpsRanges;
    private androidx.viewpager.widget.ViewPager getHighSpeedVideoFpsRangesFor;
    private int[][] getHighSpeedVideoSizes;
    private int[] getHighSpeedVideoSizesFor;
    private android.app.AlertDialog getInputFormats;
    private android.view.View getInputSizeshNQ4ISI;
    private java.lang.String getOutputFormats;
    private final boolean getOutputMinFrameDuration;
    private androidx.appcompat.app.AppCompatActivity getOutputMinFrameDurationlomOqCM;
    private android.widget.FrameLayout getOutputSizes;
    private com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.OnboardingClosedListener getOutputSizeshNQ4ISI;
    private com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayResources getOutputStallDuration;
    private com.microblink.blinkid.fragment.overlay.reticle.PageIndicatorView getOutputStallDurationlomOqCM;
    protected com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings llIIlIIIll;
    public com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter onboardingPresenter;
    private java.lang.String[] toString;
    private java.lang.String unwrapAs;

    /* renamed from: com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ScanRecognitionMode.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ScanRecognitionMode.Barcode.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ScanRecognitionMode.Mrz.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public BlinkIdDialogOnboardingView(boolean z, boolean z2) {
        new android.os.Handler(android.os.Looper.getMainLooper());
        this.getOutputMinFrameDuration = z;
        this.getHighResolutionOutputSizeshNQ4ISI = z2;
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingView
    public void attachPresenter(com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter onboardingPresenter) {
        this.onboardingPresenter = onboardingPresenter;
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingView
    public void cancelDelayedTooltip() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.Camera2StreamConfigurationMap.hideTooltip();
            this.Camera2StreamConfigurationMap.cancelDelayedTooltip();
        }
    }

    public void onConfigurationChanged() {
        android.app.AlertDialog alertDialog;
        if (this.getOutputMinFrameDuration && (alertDialog = this.getInputFormats) != null && alertDialog.isShowing()) {
            this.getInputFormats.hide();
            this.onboardingPresenter.overlayWindowClosed();
            showIntroductionDialog(this.getInputFormats.getContext());
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            int visibility = this.getOutputSizes.getVisibility();
            int currentItem = this.getHighSpeedVideoFpsRangesFor.getCurrentItem();
            this.getOutputSizes.removeView(this.getInputSizeshNQ4ISI.findViewById(com.microblink.blinkid.library.R.id.onboarding));
            if (visibility == 0) {
                this.onboardingPresenter.overlayWindowClosed();
            }
            getHighSpeedVideoFpsRanges(this.getInputSizeshNQ4ISI, this.getOutputMinFrameDurationlomOqCM);
            if (visibility == 0) {
                showOnboarding();
                this.getHighSpeedVideoFpsRangesFor.setCurrentItem(currentItem);
            }
        }
    }

    public void setupOnboarding(android.view.View view, androidx.appcompat.app.AppCompatActivity appCompatActivity, com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayResources reticleOverlayResources, com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayStrings reticleOverlayStrings, com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ScanRecognitionMode scanRecognitionMode, com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.OnboardingClosedListener onboardingClosedListener) {
        this.llIIlIIIll = reticleOverlayStrings;
        this.getOutputStallDuration = reticleOverlayResources;
        this.getInputSizeshNQ4ISI = view;
        this.getOutputMinFrameDurationlomOqCM = appCompatActivity;
        this.getOutputSizeshNQ4ISI = onboardingClosedListener;
        if (scanRecognitionMode != null) {
            int i = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView.AnonymousClass2.getHighSpeedVideoSizes[scanRecognitionMode.ordinal()];
            if (i == 1) {
                com.microblink.blinkid.fragment.overlay.blinkid.reticleui.OnboardingResourcesCreator onboardingResourcesCreator = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.OnboardingResourcesCreator.BARCODE;
                this.getHighSpeedVideoSizesFor = onboardingResourcesCreator.introductionImage;
                this.getHighSpeedVideoSizes = new int[][]{onboardingResourcesCreator.firstOnboardingImage, onboardingResourcesCreator.secondOnboardingImage, onboardingResourcesCreator.thirdOnboardingImage};
                this.unwrapAs = appCompatActivity.getResources().getString(onboardingResourcesCreator.introductionTitle);
                this.getOutputFormats = appCompatActivity.getResources().getString(onboardingResourcesCreator.introductionMessage);
                this.toString = new java.lang.String[]{appCompatActivity.getResources().getString(onboardingResourcesCreator.onboardingTitles[0]), appCompatActivity.getResources().getString(onboardingResourcesCreator.onboardingTitles[1]), appCompatActivity.getResources().getString(onboardingResourcesCreator.onboardingTitles[2])};
                this.getHighSpeedVideoFpsRanges = new java.lang.String[]{appCompatActivity.getResources().getString(onboardingResourcesCreator.onboardingMessages[0]), appCompatActivity.getResources().getString(onboardingResourcesCreator.onboardingMessages[1]), appCompatActivity.getResources().getString(onboardingResourcesCreator.onboardingMessages[2])};
            } else if (i != 2) {
                com.microblink.blinkid.fragment.overlay.blinkid.reticleui.OnboardingResourcesCreator onboardingResourcesCreator2 = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.OnboardingResourcesCreator.ID;
                this.getHighSpeedVideoSizesFor = onboardingResourcesCreator2.introductionImage;
                this.getHighSpeedVideoSizes = new int[][]{onboardingResourcesCreator2.firstOnboardingImage, onboardingResourcesCreator2.secondOnboardingImage, onboardingResourcesCreator2.thirdOnboardingImage};
                this.unwrapAs = appCompatActivity.getResources().getString(onboardingResourcesCreator2.introductionTitle);
                this.getOutputFormats = appCompatActivity.getResources().getString(onboardingResourcesCreator2.introductionMessage);
                this.toString = new java.lang.String[]{appCompatActivity.getResources().getString(onboardingResourcesCreator2.onboardingTitles[0]), appCompatActivity.getResources().getString(onboardingResourcesCreator2.onboardingTitles[1]), appCompatActivity.getResources().getString(onboardingResourcesCreator2.onboardingTitles[2])};
                this.getHighSpeedVideoFpsRanges = new java.lang.String[]{appCompatActivity.getResources().getString(onboardingResourcesCreator2.onboardingMessages[0]), appCompatActivity.getResources().getString(onboardingResourcesCreator2.onboardingMessages[1]), appCompatActivity.getResources().getString(onboardingResourcesCreator2.onboardingMessages[2])};
            } else {
                com.microblink.blinkid.fragment.overlay.blinkid.reticleui.OnboardingResourcesCreator onboardingResourcesCreator3 = com.microblink.blinkid.fragment.overlay.blinkid.reticleui.OnboardingResourcesCreator.MRZ;
                this.getHighSpeedVideoSizesFor = onboardingResourcesCreator3.introductionImage;
                this.getHighSpeedVideoSizes = new int[][]{onboardingResourcesCreator3.firstOnboardingImage, onboardingResourcesCreator3.secondOnboardingImage, onboardingResourcesCreator3.thirdOnboardingImage};
                this.unwrapAs = appCompatActivity.getResources().getString(onboardingResourcesCreator3.introductionTitle);
                this.getOutputFormats = appCompatActivity.getResources().getString(onboardingResourcesCreator3.introductionMessage);
                this.toString = new java.lang.String[]{appCompatActivity.getResources().getString(onboardingResourcesCreator3.onboardingTitles[0]), appCompatActivity.getResources().getString(onboardingResourcesCreator3.onboardingTitles[1]), appCompatActivity.getResources().getString(onboardingResourcesCreator3.onboardingTitles[2])};
                this.getHighSpeedVideoFpsRanges = new java.lang.String[]{appCompatActivity.getResources().getString(onboardingResourcesCreator3.onboardingMessages[0]), appCompatActivity.getResources().getString(onboardingResourcesCreator3.onboardingMessages[1]), appCompatActivity.getResources().getString(onboardingResourcesCreator3.onboardingMessages[2])};
            }
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.microblink.blinkid.library.R.id.onboardingTooltip);
            textView.setText(this.llIIlIIIll.helpTooltip);
            textView.setTextAppearance(appCompatActivity, this.getOutputStallDuration.kernelVersion);
            android.graphics.drawable.Drawable mutate = androidx.core.graphics.drawable.DrawableCompat.wrap(androidx.core.content.ContextCompat.getDrawable(appCompatActivity, com.microblink.blinkid.library.R.drawable.mb_tooltip_background)).mutate();
            androidx.core.graphics.drawable.DrawableCompat.setTint(mutate, this.getOutputStallDuration.CoroutineDebuggingKt);
            textView.setBackground(mutate);
            this.Camera2StreamConfigurationMap = new com.microblink.blinkid.fragment.overlay.TooltipManager(textView, 3000L);
            ((com.microblink.blinkid.fragment.overlay.reticle.TouchInterceptRelativeLayout) view.findViewById(com.microblink.blinkid.library.R.id.touchInterceptView)).setTouchListener(new com.microblink.blinkid.fragment.overlay.reticle.TouchInterceptRelativeLayout.TouchListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView$$ExternalSyntheticLambda4
                @Override // com.microblink.blinkid.fragment.overlay.reticle.TouchInterceptRelativeLayout.TouchListener
                public final void onTouch() {
                    com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView.this.Camera2StreamConfigurationMap.showTooltip();
                }
            });
            getHighSpeedVideoFpsRanges(view, appCompatActivity);
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingView
    public void showIntroductionDialog(android.content.Context context) {
        if (!this.getOutputMinFrameDuration) {
            com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter onboardingPresenter = this.onboardingPresenter;
            if (onboardingPresenter != null) {
                onboardingPresenter.overlayWindowRefused();
                return;
            }
            return;
        }
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) context.getSystemService("layout_inflater");
        android.view.View inflate = layoutInflater.inflate(com.microblink.blinkid.resources.Layouts.llIllIIlll, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.microblink.blinkid.library.R.id.instructionsTitle);
        textView.setText(this.unwrapAs);
        textView.setTextAppearance(context, this.getOutputStallDuration.getHighSpeedVideoSizes);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.microblink.blinkid.library.R.id.instructionsMessage);
        textView2.setText(this.getOutputFormats);
        textView2.setTextAppearance(context, this.getOutputStallDuration.ArtificialStackFrames);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.microblink.blinkid.library.R.id.instructionsImage);
        int[] iArr = this.getHighSpeedVideoSizesFor;
        if (iArr != null) {
            android.graphics.drawable.Drawable[] drawableArr = new android.graphics.drawable.Drawable[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                drawableArr[i] = androidx.appcompat.content.res.AppCompatResources.getDrawable(layoutInflater.getContext(), iArr[i]);
            }
            imageView.setImageDrawable(new android.graphics.drawable.LayerDrawable(drawableArr));
        }
        imageView.setVisibility(0);
        this.getInputFormats = new android.app.AlertDialog.Builder(context, com.microblink.blinkid.library.R.style.MBIntroductionDialog).setView(inflate).setPositiveButton(this.llIIlIIIll.introductionDoneButton, new android.content.DialogInterface.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i2) {
                com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView.m10888$r8$lambda$78XOaLKwDMQtZnWRraSVGJdYCQ(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView.this, dialogInterface, i2);
            }
        }).setCancelable(false).create();
        com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter onboardingPresenter2 = this.onboardingPresenter;
        if (onboardingPresenter2 != null) {
            onboardingPresenter2.overlayWindowDisplayed();
        }
        this.getInputFormats.show();
        android.widget.Button button = this.getInputFormats.getButton(-1);
        if (button != null) {
            button.setTextAppearance(context, this.getOutputStallDuration.b);
        }
        this.getInputFormats.getWindow().getDecorView().getBackground().setColorFilter(this.getOutputStallDuration.getOutputSizes, android.graphics.PorterDuff.Mode.SRC);
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingView
    public void showOnboarding() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getOutputSizes.setVisibility(0);
            this.getHighSpeedVideoFpsRangesFor.setCurrentItem(0, false);
            com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter onboardingPresenter = this.onboardingPresenter;
            if (onboardingPresenter != null) {
                onboardingPresenter.overlayWindowDisplayed();
            }
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingView
    public void showOnboardingTooltipDelayed(long j, boolean z) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.Camera2StreamConfigurationMap.showTooltipDelayed(j, z);
        }
    }

    private void getHighSpeedVideoFpsRanges(final android.view.View view, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) appCompatActivity.getSystemService("layout_inflater");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view.findViewById(com.microblink.blinkid.library.R.id.onboardingFrame);
        this.getOutputSizes = frameLayout;
        frameLayout.addView(layoutInflater.inflate(com.microblink.blinkid.resources.Layouts.lllllIlIll, (android.view.ViewGroup) view, false), 0);
        this.getHighSpeedVideoFpsRangesFor = (androidx.viewpager.widget.ViewPager) view.findViewById(com.microblink.blinkid.library.R.id.viewPager);
        com.microblink.blinkid.fragment.overlay.reticle.PageIndicatorView pageIndicatorView = (com.microblink.blinkid.fragment.overlay.reticle.PageIndicatorView) view.findViewById(com.microblink.blinkid.library.R.id.pageIndicator);
        this.getOutputStallDurationlomOqCM = pageIndicatorView;
        pageIndicatorView.setup(this.getOutputStallDuration.getOutputStallDurationlomOqCM, this.toString.length);
        final android.widget.Button button = (android.widget.Button) view.findViewById(com.microblink.blinkid.library.R.id.btnSkip);
        button.setText(this.llIIlIIIll.onboardingSkipButtonText);
        button.setTextAppearance(appCompatActivity, this.getOutputStallDuration.getHighSpeedVideoFpsRanges);
        final android.widget.Button button2 = (android.widget.Button) view.findViewById(com.microblink.blinkid.library.R.id.btnBack);
        button2.setText(this.llIIlIIIll.onboardingBackButtonText);
        button2.setTextAppearance(appCompatActivity, this.getOutputStallDuration.getHighSpeedVideoFpsRanges);
        final android.widget.Button button3 = (android.widget.Button) view.findViewById(com.microblink.blinkid.library.R.id.btnNext);
        button3.setText(this.llIIlIIIll.onboardingNextButtonText);
        button3.setTextAppearance(appCompatActivity, this.getOutputStallDuration.getHighSpeedVideoFpsRanges);
        final android.widget.Button button4 = (android.widget.Button) view.findViewById(com.microblink.blinkid.library.R.id.btnDone);
        button4.setText(this.llIIlIIIll.introductionDoneButton);
        button4.setTextAppearance(appCompatActivity, this.getOutputStallDuration.getHighSpeedVideoFpsRanges);
        androidx.fragment.app.FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        java.lang.String[] strArr = this.toString;
        java.lang.String[] strArr2 = this.getHighSpeedVideoFpsRanges;
        int[][] iArr = this.getHighSpeedVideoSizes;
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayResources reticleOverlayResources = this.getOutputStallDuration;
        final com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPagerAdapter onboardingPagerAdapter = new com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPagerAdapter(supportFragmentManager, strArr, strArr2, iArr, reticleOverlayResources.getOutputMinFrameDuration, reticleOverlayResources.Camera2StreamConfigurationMap, reticleOverlayResources.accessartificialFrame);
        this.getHighSpeedVideoFpsRangesFor.setAdapter(onboardingPagerAdapter);
        this.getHighSpeedVideoFpsRangesFor.addOnPageChangeListener(new androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView.1
            @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                if (i == 0) {
                    button.setVisibility(0);
                    button3.setVisibility(0);
                    button2.setVisibility(8);
                    button4.setVisibility(8);
                } else if (i == onboardingPagerAdapter.getCount() - 1) {
                    button.setVisibility(8);
                    button3.setVisibility(8);
                    button2.setVisibility(0);
                    button4.setVisibility(0);
                } else {
                    button.setVisibility(8);
                    button3.setVisibility(0);
                    button4.setVisibility(8);
                    button2.setVisibility(0);
                }
                com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView.this.getOutputStallDurationlomOqCM.setActivePage(i);
                com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView.this.getOutputStallDurationlomOqCM.invalidate();
                if (view.findViewById(com.microblink.blinkid.library.R.id.onboardingLinearLayout) == null || view.findViewById(com.microblink.blinkid.library.R.id.onboardingLinearLayout).hasFocus()) {
                    return;
                }
                view.findViewById(com.microblink.blinkid.library.R.id.onboardingLinearLayout).sendAccessibilityEvent(8);
            }
        });
        button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView.$r8$lambda$E0GzNo6wfFKKlUZsN1x60pgZuXk(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView.this, view2);
            }
        });
        button2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView.$r8$lambda$XOTi7V13QQnMZCzqc1xfB1KRWjM(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView.this, view2);
            }
        });
        button3.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView.$r8$lambda$bKX4jNunZyC4o5437eLkz16oWkY(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView.this, onboardingPagerAdapter, view2);
            }
        });
        button4.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView.$r8$lambda$vZpDrJKt7NveGR9M63Lho9h59kM(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView.this, view2);
            }
        });
    }

    /* renamed from: $r8$lambda$78XOaLKwDMQt-ZnWRraSVGJdYCQ, reason: not valid java name */
    public static /* synthetic */ void m10888$r8$lambda$78XOaLKwDMQtZnWRraSVGJdYCQ(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView blinkIdDialogOnboardingView, android.content.DialogInterface dialogInterface, int i) {
        com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter onboardingPresenter = blinkIdDialogOnboardingView.onboardingPresenter;
        if (onboardingPresenter != null) {
            onboardingPresenter.overlayWindowClosed();
        }
    }

    public static /* synthetic */ void $r8$lambda$E0GzNo6wfFKKlUZsN1x60pgZuXk(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView blinkIdDialogOnboardingView, android.view.View view) {
        blinkIdDialogOnboardingView.getOutputSizes.setVisibility(8);
        blinkIdDialogOnboardingView.onboardingPresenter.overlayWindowClosed();
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.OnboardingClosedListener onboardingClosedListener = blinkIdDialogOnboardingView.getOutputSizeshNQ4ISI;
        if (onboardingClosedListener != null) {
            onboardingClosedListener.onOnboardingClosed();
        }
    }

    public static /* synthetic */ void $r8$lambda$XOTi7V13QQnMZCzqc1xfB1KRWjM(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView blinkIdDialogOnboardingView, android.view.View view) {
        androidx.viewpager.widget.ViewPager viewPager = blinkIdDialogOnboardingView.getHighSpeedVideoFpsRangesFor;
        viewPager.setCurrentItem(java.lang.Math.max(0, viewPager.getCurrentItem() - 1), true);
    }

    public static /* synthetic */ void $r8$lambda$bKX4jNunZyC4o5437eLkz16oWkY(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView blinkIdDialogOnboardingView, androidx.viewpager.widget.PagerAdapter pagerAdapter, android.view.View view) {
        androidx.viewpager.widget.ViewPager viewPager = blinkIdDialogOnboardingView.getHighSpeedVideoFpsRangesFor;
        viewPager.setCurrentItem((viewPager.getCurrentItem() + 1) % pagerAdapter.getCount(), true);
    }

    public static /* synthetic */ void $r8$lambda$vZpDrJKt7NveGR9M63Lho9h59kM(com.microblink.blinkid.fragment.overlay.blinkid.reticleui.BlinkIdDialogOnboardingView blinkIdDialogOnboardingView, android.view.View view) {
        blinkIdDialogOnboardingView.getOutputSizes.setVisibility(8);
        blinkIdDialogOnboardingView.onboardingPresenter.overlayWindowClosed();
        com.microblink.blinkid.fragment.overlay.blinkid.reticleui.ReticleOverlayView.OnboardingClosedListener onboardingClosedListener = blinkIdDialogOnboardingView.getOutputSizeshNQ4ISI;
        if (onboardingClosedListener != null) {
            onboardingClosedListener.onOnboardingClosed();
        }
    }
}
