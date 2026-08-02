package com.microblink.blinkid.fragment.overlay.components.onboarding;

/* loaded from: classes10.dex */
public class OnboardingFragment extends androidx.fragment.app.Fragment {
    public static final java.lang.String ARG_BACKGROUND_COLOR = "ARG_BACKGROUND_COLOR";
    public static final java.lang.String ARG_IMAGE = "ARG_IMAGE";
    public static final java.lang.String ARG_IMAGE_LIST = "ARG_IMAGE_LIST";
    public static final java.lang.String ARG_MESSAGE = "ARG_MESSAGE";
    public static final java.lang.String ARG_MESSAGE_TEXT_APPEARANCE = "ARG_MESSAGE_TEXT_APPEARANCE";
    public static final java.lang.String ARG_TITLE = "ARG_TITLE";
    public static final java.lang.String ARG_TITLE_TEXT_APPEARANCE = "ARG_TITLE_TEXT_APPEARANCE";

    public static com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingFragment newInstance(int i, java.lang.String str, int i2, java.lang.String str2, int i3, int i4) {
        com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingFragment onboardingFragment = new com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingFragment();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(ARG_IMAGE, i);
        bundle.putString(ARG_TITLE, str);
        bundle.putString(ARG_MESSAGE, str2);
        bundle.putInt(ARG_TITLE_TEXT_APPEARANCE, i2);
        bundle.putInt(ARG_MESSAGE_TEXT_APPEARANCE, i3);
        bundle.putInt(ARG_BACKGROUND_COLOR, i4);
        onboardingFragment.setArguments(bundle);
        return onboardingFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.os.Bundle requireArguments = requireArguments();
        android.view.View inflate = layoutInflater.inflate(com.microblink.blinkid.resources.Layouts.IlIIlllIIl, viewGroup, false);
        inflate.setBackgroundColor(requireArguments.getInt(ARG_BACKGROUND_COLOR));
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.microblink.blinkid.library.R.id.instructionsImage);
        int i = requireArguments.getInt(ARG_IMAGE);
        if (i != 0) {
            imageView.setImageResource(i);
        }
        int[] intArray = requireArguments.getIntArray(ARG_IMAGE_LIST);
        if (intArray.length > 0) {
            android.graphics.drawable.Drawable[] drawableArr = new android.graphics.drawable.Drawable[intArray.length];
            for (int i2 = 0; i2 < intArray.length; i2++) {
                drawableArr[i2] = androidx.appcompat.content.res.AppCompatResources.getDrawable(layoutInflater.getContext(), intArray[i2]);
            }
            imageView.setImageDrawable(new android.graphics.drawable.LayerDrawable(drawableArr));
        }
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.microblink.blinkid.library.R.id.instructionsTitle);
        textView.setTextAppearance(viewGroup.getContext(), requireArguments.getInt(ARG_TITLE_TEXT_APPEARANCE));
        textView.setText(requireArguments.getString(ARG_TITLE));
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.microblink.blinkid.library.R.id.instructionsMessage);
        textView2.setTextAppearance(viewGroup.getContext(), requireArguments.getInt(ARG_MESSAGE_TEXT_APPEARANCE));
        textView2.setText(requireArguments.getString(ARG_MESSAGE));
        return inflate;
    }

    public static com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingFragment newInstance(int[] iArr, java.lang.String str, int i, java.lang.String str2, int i2, int i3) {
        com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingFragment onboardingFragment = new com.microblink.blinkid.fragment.overlay.components.onboarding.OnboardingFragment();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putIntArray(ARG_IMAGE_LIST, iArr);
        bundle.putString(ARG_TITLE, str);
        bundle.putString(ARG_MESSAGE, str2);
        bundle.putInt(ARG_TITLE_TEXT_APPEARANCE, i);
        bundle.putInt(ARG_MESSAGE_TEXT_APPEARANCE, i2);
        bundle.putInt(ARG_BACKGROUND_COLOR, i3);
        onboardingFragment.setArguments(bundle);
        return onboardingFragment;
    }
}
