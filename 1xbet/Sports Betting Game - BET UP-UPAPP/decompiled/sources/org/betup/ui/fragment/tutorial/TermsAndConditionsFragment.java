package org.betup.ui.fragment.tutorial;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.webkit.ProxyConfig;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.dreierf.materialintroscreen.SlideFragment;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.betup.R;
import org.betup.model.remote.api.config.ApiConfigResolver;
import org.betup.services.analytics.FirebaseAnalyticsHelper;
import org.betup.utils.ExternalBrowserOpener;

/* loaded from: classes4.dex */
public class TermsAndConditionsFragment extends SlideFragment {

    @BindView(R.id.check)
    CheckBox check;

    @BindView(R.id.icon)
    ImageView icon;

    @BindView(R.id.subtitle)
    TextView subtitle;

    @BindView(R.id.title)
    TextView title;

    @Override // io.github.dreierf.materialintroscreen.SlideFragment
    public int backgroundColor() {
        return R.color.intro_back;
    }

    @Override // io.github.dreierf.materialintroscreen.SlideFragment
    public int buttonsColor() {
        return R.color.button_intro;
    }

    @Override // io.github.dreierf.materialintroscreen.SlideFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_terms_conditions, container, false);
        ButterKnife.bind(this, inflate);
        setupSubtitle();
        return inflate;
    }

    public void setupSubtitle() {
        String string = getString(R.string.confirm_privacy_policy_desc);
        Matcher matcher = Pattern.compile("\\*[^*]+\\*").matcher(string);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (matcher.find()) {
            int start = matcher.start() - (i + 1);
            i += 2;
            arrayList.add(new Pair(Integer.valueOf(start), Integer.valueOf(matcher.end() - i)));
        }
        SpannableString spannableString = new SpannableString(string.replace(ProxyConfig.MATCH_ALL_SCHEMES, ""));
        if (arrayList.size() > 0) {
            spannableString.setSpan(new ClickableSpan() { // from class: org.betup.ui.fragment.tutorial.TermsAndConditionsFragment.1
                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    TermsAndConditionsFragment.this.openTermsAndConditions();
                }
            }, ((Integer) ((Pair) arrayList.get(0)).first).intValue(), ((Integer) ((Pair) arrayList.get(0)).second).intValue(), 33);
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R.color.Gold)), ((Integer) ((Pair) arrayList.get(0)).first).intValue(), ((Integer) ((Pair) arrayList.get(0)).second).intValue(), 33);
        }
        if (arrayList.size() > 1) {
            spannableString.setSpan(new ClickableSpan() { // from class: org.betup.ui.fragment.tutorial.TermsAndConditionsFragment.2
                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    TermsAndConditionsFragment.this.openPrivacyPolicy();
                }
            }, ((Integer) ((Pair) arrayList.get(1)).first).intValue(), ((Integer) ((Pair) arrayList.get(1)).second).intValue(), 33);
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getContext(), R.color.Gold)), ((Integer) ((Pair) arrayList.get(1)).first).intValue(), ((Integer) ((Pair) arrayList.get(1)).second).intValue(), 33);
        }
        this.subtitle.setText(spannableString);
        this.subtitle.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        FirebaseAnalyticsHelper.addEvent(getActivity(), FirebaseAnalyticsHelper.Event.ON_BOARD, "Terms and conditions");
    }

    @Override // io.github.dreierf.materialintroscreen.SlideFragment
    public boolean canMoveFurther() {
        return this.check.isChecked();
    }

    @Override // io.github.dreierf.materialintroscreen.SlideFragment
    public String cantMoveFurtherErrorMessage() {
        return getString(R.string.please_accept_to_continue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openTermsAndConditions() {
        ExternalBrowserOpener.open(requireContext(), "https://betup.org/privacy/terms.html");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openPrivacyPolicy() {
        ExternalBrowserOpener.open(requireContext(), ApiConfigResolver.getApiConfig().getPrivacyPolicyUrl());
    }
}
