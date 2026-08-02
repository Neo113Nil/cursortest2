package com.microblink.blinkid.fragment.overlay.blinkcard.reticleui;

/* loaded from: classes10.dex */
public class BlinkCardDialogOnboardingView implements com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingView {
    private final boolean Camera2StreamConfigurationMap;
    private android.view.View getHighResolutionOutputSizeshNQ4ISI;
    private androidx.viewpager.widget.ViewPager getHighSpeedVideoFpsRanges;
    private com.microblink.blinkid.fragment.overlay.TooltipManager getHighSpeedVideoFpsRangesFor;
    private android.app.AlertDialog getHighSpeedVideoSizes;
    private final boolean getHighSpeedVideoSizesFor;
    private androidx.appcompat.app.AppCompatActivity getInputFormats;
    private com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayResources getInputSizeshNQ4ISI;
    private android.widget.FrameLayout getOutputFormats;
    private com.microblink.blinkid.fragment.overlay.reticle.PageIndicatorView getOutputMinFrameDuration;
    protected com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings lllIIIlIlI;
    public com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter onboardingPresenter;

    public BlinkCardDialogOnboardingView(boolean z, boolean z2) {
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoSizesFor = z2;
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingView
    public void attachPresenter(com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter onboardingPresenter) {
        this.onboardingPresenter = (com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingPresenter) onboardingPresenter;
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingView
    public void cancelDelayedTooltip() {
        if (this.getHighSpeedVideoSizesFor) {
            this.getHighSpeedVideoFpsRangesFor.hideTooltip();
            this.getHighSpeedVideoFpsRangesFor.cancelDelayedTooltip();
        }
    }

    public void onConfigurationChanged() {
        if (this.Camera2StreamConfigurationMap && this.getHighSpeedVideoSizes.isShowing()) {
            this.getHighSpeedVideoSizes.hide();
            this.onboardingPresenter.overlayWindowClosed();
            showIntroductionDialog(this.getHighSpeedVideoSizes.getContext());
        }
        if (this.getHighSpeedVideoSizesFor) {
            int visibility = this.getOutputFormats.getVisibility();
            int currentItem = this.getHighSpeedVideoFpsRanges.getCurrentItem();
            this.getOutputFormats.removeView(this.getHighResolutionOutputSizeshNQ4ISI.findViewById(com.microblink.blinkid.library.R.id.onboarding));
            if (visibility == 0) {
                this.onboardingPresenter.overlayWindowClosed();
            }
            getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats);
            if (visibility == 0) {
                showOnboarding();
                this.getHighSpeedVideoFpsRanges.setCurrentItem(currentItem);
            }
        }
    }

    public void setupOnboarding(android.view.View view, androidx.appcompat.app.AppCompatActivity appCompatActivity, com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayResources blinkCardReticleOverlayResources, com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings blinkCardReticleOverlayStrings) {
        this.lllIIIlIlI = blinkCardReticleOverlayStrings;
        this.getInputSizeshNQ4ISI = blinkCardReticleOverlayResources;
        this.getHighResolutionOutputSizeshNQ4ISI = view;
        this.getInputFormats = appCompatActivity;
        if (this.getHighSpeedVideoSizesFor) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.microblink.blinkid.library.R.id.onboardingTooltip);
            textView.setText(this.lllIIIlIlI.helpTooltip);
            textView.setTextAppearance(appCompatActivity, this.getInputSizeshNQ4ISI.getOutputFormats);
            android.graphics.drawable.Drawable mutate = androidx.core.graphics.drawable.DrawableCompat.wrap(androidx.core.content.ContextCompat.getDrawable(appCompatActivity, com.microblink.blinkid.library.R.drawable.mb_tooltip_background)).mutate();
            androidx.core.graphics.drawable.DrawableCompat.setTint(mutate, this.getInputSizeshNQ4ISI.isOutputSupportedFor);
            textView.setBackground(mutate);
            this.getHighSpeedVideoFpsRangesFor = new com.microblink.blinkid.fragment.overlay.TooltipManager(textView, 3000L);
            ((com.microblink.blinkid.fragment.overlay.reticle.TouchInterceptRelativeLayout) view.findViewById(com.microblink.blinkid.library.R.id.touchInterceptView)).setTouchListener(new com.microblink.blinkid.fragment.overlay.reticle.TouchInterceptRelativeLayout.TouchListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView$$ExternalSyntheticLambda6
                @Override // com.microblink.blinkid.fragment.overlay.reticle.TouchInterceptRelativeLayout.TouchListener
                public final void onTouch() {
                    com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView.this.getHighSpeedVideoFpsRangesFor.showTooltip();
                }
            });
            getHighResolutionOutputSizeshNQ4ISI(view, appCompatActivity);
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingView
    public void showIntroductionDialog(android.content.Context context) {
        if (!this.Camera2StreamConfigurationMap) {
            com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter onboardingPresenter = this.onboardingPresenter;
            if (onboardingPresenter != null) {
                onboardingPresenter.overlayWindowRefused();
                return;
            }
            return;
        }
        android.view.View inflate = ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.microblink.blinkid.resources.Layouts.llIllIIlll, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.microblink.blinkid.library.R.id.instructionsTitle);
        textView.setText(this.lllIIIlIlI.introductionDialogTitle);
        textView.setTextAppearance(context, this.getInputSizeshNQ4ISI.ArtificialStackFrames);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.microblink.blinkid.library.R.id.instructionsMessage);
        textView2.setText(this.lllIIIlIlI.introductionDialogMessage);
        textView2.setTextAppearance(context, this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.microblink.blinkid.library.R.id.instructionsImage);
        imageView.setImageDrawable(this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor);
        imageView.setVisibility(0);
        this.getHighSpeedVideoSizes = new android.app.AlertDialog.Builder(context, com.microblink.blinkid.library.R.style.MBIntroductionDialog).setView(inflate).setPositiveButton(this.lllIIIlIlI.introductionDoneButton, new android.content.DialogInterface.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView.m10880$r8$lambda$hcJf0Ep8m_bb2ZY8DI05snq324(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView.this, dialogInterface, i);
            }
        }).setCancelable(false).create();
        com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter onboardingPresenter2 = this.onboardingPresenter;
        if (onboardingPresenter2 != null) {
            onboardingPresenter2.overlayWindowDisplayed();
        }
        this.getHighSpeedVideoSizes.show();
        android.widget.Button button = this.getHighSpeedVideoSizes.getButton(-1);
        if (button != null) {
            button.setTextAppearance(context, this.getInputSizeshNQ4ISI.isOutputSupportedForhNQ4ISI);
        }
        this.getHighSpeedVideoSizes.getWindow().getDecorView().getBackground().setColorFilter(this.getInputSizeshNQ4ISI.getHighSpeedVideoSizesFor, android.graphics.PorterDuff.Mode.SRC);
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingView
    public void showOnboarding() {
        if (this.getHighSpeedVideoSizesFor) {
            this.getOutputFormats.setVisibility(0);
            this.getHighSpeedVideoFpsRanges.setCurrentItem(0, false);
            com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter onboardingPresenter = this.onboardingPresenter;
            if (onboardingPresenter != null) {
                onboardingPresenter.overlayWindowDisplayed();
            }
        }
    }

    @Override // com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingView
    public void showOnboardingTooltipDelayed(long j, boolean z) {
        if (this.getHighSpeedVideoSizesFor) {
            this.getHighSpeedVideoFpsRangesFor.showTooltipDelayed(j, z);
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(android.view.View view, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) appCompatActivity.getSystemService("layout_inflater");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view.findViewById(com.microblink.blinkid.library.R.id.onboardingFrame);
        this.getOutputFormats = frameLayout;
        frameLayout.addView(layoutInflater.inflate(com.microblink.blinkid.resources.Layouts.lllllIlIll, (android.view.ViewGroup) view, false), 0);
        androidx.viewpager.widget.ViewPager viewPager = (androidx.viewpager.widget.ViewPager) view.findViewById(com.microblink.blinkid.library.R.id.viewPager);
        this.getHighSpeedVideoFpsRanges = viewPager;
        final int i = viewPager.getResources().getConfiguration().getLayoutDirection() == 1 ? com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE : 0;
        this.getHighSpeedVideoFpsRanges.setRotationY(i);
        this.getHighSpeedVideoFpsRanges.setPageTransformer(false, new androidx.viewpager.widget.ViewPager.PageTransformer() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView$$ExternalSyntheticLambda1
            @Override // androidx.viewpager.widget.ViewPager.PageTransformer
            public final void transformPage(android.view.View view2, float f) {
                view2.setRotationY(i);
            }
        });
        com.microblink.blinkid.fragment.overlay.reticle.PageIndicatorView pageIndicatorView = (com.microblink.blinkid.fragment.overlay.reticle.PageIndicatorView) view.findViewById(com.microblink.blinkid.library.R.id.pageIndicator);
        this.getOutputMinFrameDuration = pageIndicatorView;
        pageIndicatorView.setup(this.getInputSizeshNQ4ISI.coroutineBoundary, this.lllIIIlIlI.onboardingTitles.length);
        final android.widget.Button button = (android.widget.Button) view.findViewById(com.microblink.blinkid.library.R.id.btnSkip);
        button.setText(this.lllIIIlIlI.onboardingSkipButtonText);
        button.setTextAppearance(appCompatActivity, this.getInputSizeshNQ4ISI.isOutputSupportedForhNQ4ISI);
        final android.widget.Button button2 = (android.widget.Button) view.findViewById(com.microblink.blinkid.library.R.id.btnBack);
        button2.setText(this.lllIIIlIlI.onboardingBackButtonText);
        button2.setTextAppearance(appCompatActivity, this.getInputSizeshNQ4ISI.isOutputSupportedForhNQ4ISI);
        final android.widget.Button button3 = (android.widget.Button) view.findViewById(com.microblink.blinkid.library.R.id.btnNext);
        button3.setText(this.lllIIIlIlI.onboardingNextButtonText);
        button3.setTextAppearance(appCompatActivity, this.getInputSizeshNQ4ISI.isOutputSupportedForhNQ4ISI);
        final android.widget.Button button4 = (android.widget.Button) view.findViewById(com.microblink.blinkid.library.R.id.btnDone);
        button4.setText(this.lllIIIlIlI.onboardingDoneButtonText);
        button4.setTextAppearance(appCompatActivity, this.getInputSizeshNQ4ISI.isOutputSupportedForhNQ4ISI);
        androidx.fragment.app.FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayStrings blinkCardReticleOverlayStrings = this.lllIIIlIlI;
        java.lang.String[] strArr = blinkCardReticleOverlayStrings.onboardingTitles;
        java.lang.String[] strArr2 = blinkCardReticleOverlayStrings.onboardingMessages;
        int[][] iArr = {new int[]{com.microblink.blinkid.library.R.drawable.mb_blinkcard_onboarding_card_number}, new int[]{com.microblink.blinkid.library.R.drawable.mb_blinkcard_onboarding_card_big}, new int[]{com.microblink.blinkid.library.R.drawable.mb_blinkcard_onboarding_card_glare}, new int[]{com.microblink.blinkid.library.R.drawable.mb_blinkcard_onboarding_card_blur}};
        com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardReticleOverlayResources blinkCardReticleOverlayResources = this.getInputSizeshNQ4ISI;
        final com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPagerAdapter onboardingPagerAdapter = new com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPagerAdapter(supportFragmentManager, strArr, strArr2, iArr, blinkCardReticleOverlayResources.coroutineCreation, blinkCardReticleOverlayResources.toString, blinkCardReticleOverlayResources.getOutputSizes);
        this.getHighSpeedVideoFpsRanges.setAdapter(onboardingPagerAdapter);
        this.getHighSpeedVideoFpsRanges.addOnPageChangeListener(new androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView.1
            @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i2) {
                if (i2 == 0) {
                    button.setVisibility(0);
                    button3.setVisibility(0);
                    button2.setVisibility(8);
                    button4.setVisibility(8);
                } else if (i2 == onboardingPagerAdapter.getCount() - 1) {
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
                com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView.this.getOutputMinFrameDuration.setActivePage(i2);
                com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView.this.getOutputMinFrameDuration.invalidate();
            }
        });
        button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView.$r8$lambda$szb9fDqNXoO90SoJH7y8xuUMHdc(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView.this, view2);
            }
        });
        button2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView.$r8$lambda$Zq4GqCy9lv6HYWbZqyi6d5eEUjQ(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView.this, view2);
            }
        });
        button3.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView.m10878$r8$lambda$7hd7peed3v1wq_dyW5m_WrDI5s(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView.this, onboardingPagerAdapter, view2);
            }
        });
        button4.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView.$r8$lambda$gTx_ryxivi7cRs_lJXt0ZgyK7s4(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView.this, view2);
            }
        });
    }

    /* renamed from: $r8$lambda$7hd7peed3v1wq_dyW-5m_WrDI5s, reason: not valid java name */
    public static /* synthetic */ void m10878$r8$lambda$7hd7peed3v1wq_dyW5m_WrDI5s(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView blinkCardDialogOnboardingView, androidx.viewpager.widget.PagerAdapter pagerAdapter, android.view.View view) {
        androidx.viewpager.widget.ViewPager viewPager = blinkCardDialogOnboardingView.getHighSpeedVideoFpsRanges;
        viewPager.setCurrentItem((viewPager.getCurrentItem() + 1) % pagerAdapter.getCount(), true);
    }

    public static /* synthetic */ void $r8$lambda$Zq4GqCy9lv6HYWbZqyi6d5eEUjQ(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView blinkCardDialogOnboardingView, android.view.View view) {
        androidx.viewpager.widget.ViewPager viewPager = blinkCardDialogOnboardingView.getHighSpeedVideoFpsRanges;
        viewPager.setCurrentItem(java.lang.Math.max(0, viewPager.getCurrentItem() - 1), true);
    }

    public static /* synthetic */ void $r8$lambda$gTx_ryxivi7cRs_lJXt0ZgyK7s4(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView blinkCardDialogOnboardingView, android.view.View view) {
        blinkCardDialogOnboardingView.getOutputFormats.setVisibility(8);
        blinkCardDialogOnboardingView.onboardingPresenter.overlayWindowClosed();
    }

    /* renamed from: $r8$lambda$hcJf0Ep8m_bb2ZY8DI0-5snq324, reason: not valid java name */
    public static /* synthetic */ void m10880$r8$lambda$hcJf0Ep8m_bb2ZY8DI05snq324(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView blinkCardDialogOnboardingView, android.content.DialogInterface dialogInterface, int i) {
        com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingPresenter onboardingPresenter = blinkCardDialogOnboardingView.onboardingPresenter;
        if (onboardingPresenter != null) {
            onboardingPresenter.overlayWindowClosed();
        }
    }

    public static /* synthetic */ void $r8$lambda$szb9fDqNXoO90SoJH7y8xuUMHdc(com.microblink.blinkid.fragment.overlay.blinkcard.reticleui.BlinkCardDialogOnboardingView blinkCardDialogOnboardingView, android.view.View view) {
        blinkCardDialogOnboardingView.getOutputFormats.setVisibility(8);
        blinkCardDialogOnboardingView.onboardingPresenter.overlayWindowClosed();
    }
}
