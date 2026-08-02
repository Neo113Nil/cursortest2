package org.betup.ui.fragment.shop.promo;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.ArrayList;
import java.util.Locale;
import javax.inject.Inject;
import org.betup.BetUpApp;
import org.betup.R;
import org.betup.bus.OfferMessage;
import org.betup.model.remote.entity.promo.PromoType;
import org.betup.services.offer.PromoService;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.BaseFragment;
import org.betup.ui.fragment.shop.promo.adapter.PromoAdapter;
import org.betup.utils.FormatHelper;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes4.dex */
public class PromoFragment extends BaseFragment implements PromoAdapter.PromoListener {

    @BindView(R.id.balance)
    TextView balance;

    @BindView(R.id.list)
    RecyclerView list;

    @Inject
    UserService userService;

    public static PromoFragment newInstance() {
        return new PromoFragment();
    }

    @Override // org.betup.ui.fragment.BaseFragment
    protected void onFragmentAttached(Context context) {
        super.onFragmentAttached(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((BetUpApp) getActivity().getApplicationContext()).getComponent().inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_promo, container, false);
        ButterKnife.bind(this, inflate);
        return inflate;
    }

    private void updateBalance() {
        this.balance.setText(String.format(Locale.getDefault(), "$ %s", FormatHelper.getTextFormattedMoney(this.userService.getShortProfile().getUserProgressModel().getMoneyBalance())));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        PromoAdapter promoAdapter = new PromoAdapter(getActivity(), new ArrayList(), this);
        updateBalance();
        this.list.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        this.list.setAdapter(promoAdapter);
    }

    @Override // org.betup.ui.fragment.shop.promo.adapter.PromoAdapter.PromoListener
    public void onPromoClick(PromoType promoType) {
        EventBus.getDefault().post(new OfferMessage(promoType, PromoService.PromoPlacement.DEFAULT));
    }
}
