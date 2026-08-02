package org.betup.ui.fragment.tutorial;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.ironsource.X3;
import com.squareup.picasso.Picasso;
import io.bidmachine.unified.UnifiedMediationParams;
import io.github.dreierf.materialintroscreen.SlideFragment;
import org.betup.R;
import org.betup.services.analytics.FirebaseAnalyticsHelper;

/* loaded from: classes4.dex */
public class IntroFragment extends SlideFragment {

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

    @Override // io.github.dreierf.materialintroscreen.SlideFragment
    public boolean canMoveFurther() {
        return true;
    }

    public static IntroFragment newInstance(String title, String subtitle, int icon) {
        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        bundle.putString("subtitle", subtitle);
        bundle.putInt(X3.i.H0, icon);
        IntroFragment introFragment = new IntroFragment();
        introFragment.setArguments(bundle);
        return introFragment;
    }

    public static IntroFragment newInstance(String title, String subtitle, String iconUrl) {
        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        bundle.putString("subtitle", subtitle);
        bundle.putString(UnifiedMediationParams.KEY_ICON_URL, iconUrl);
        IntroFragment introFragment = new IntroFragment();
        introFragment.setArguments(bundle);
        return introFragment;
    }

    @Override // io.github.dreierf.materialintroscreen.SlideFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_intro, container, false);
        ButterKnife.bind(this, inflate);
        String string = getArguments().getString("title");
        if (string == "") {
            this.title.setVisibility(8);
            this.subtitle.setTextColor(ContextCompat.getColor(requireContext(), R.color.Gold));
            this.subtitle.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            this.title.setVisibility(0);
            this.title.setText(string);
            this.title.setTextColor(ContextCompat.getColor(requireContext(), R.color.Gold));
            this.subtitle.setTextColor(ContextCompat.getColor(requireContext(), R.color.White));
        }
        this.subtitle.setText(getArguments().getString("subtitle"));
        int i = getArguments().getInt(X3.i.H0, 0);
        if (i != 0) {
            this.icon.setImageResource(i);
        } else {
            Picasso.get().load(getArguments().getString(UnifiedMediationParams.KEY_ICON_URL)).into(this.icon);
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        FirebaseAnalyticsHelper.addEvent(getActivity(), FirebaseAnalyticsHelper.Event.ON_BOARD, getArguments().getString("title"));
    }
}
