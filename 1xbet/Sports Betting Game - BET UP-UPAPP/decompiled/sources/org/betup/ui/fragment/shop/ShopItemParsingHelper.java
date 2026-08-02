package org.betup.ui.fragment.shop;

import android.text.Html;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.betup.R;
import org.betup.model.remote.entity.shop.ShopItemModel;
import org.betup.ui.views.FontText;

/* loaded from: classes4.dex */
public final class ShopItemParsingHelper {
    private static final String patternToHighlight = "X\\d+";
    private static final Pattern compiledPatternToHighlight = Pattern.compile(patternToHighlight);

    private ShopItemParsingHelper() {
    }

    public static String getLocalizedTitle(ShopItemModel itemModel) {
        if (itemModel.getTitleText() == null) {
            return null;
        }
        try {
            JsonObject asJsonObject = JsonParser.parseString(itemModel.getTitleText()).getAsJsonObject();
            String language = Locale.getDefault().getLanguage();
            if (asJsonObject == null) {
                return null;
            }
            if (asJsonObject.has(language)) {
                return asJsonObject.get(language).getAsString();
            }
            if (asJsonObject.has("en")) {
                return asJsonObject.get("en").getAsString();
            }
            return asJsonObject.get(asJsonObject.keySet().iterator().next()).getAsString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static List<View> createBenefitList(LayoutInflater layoutInflater, ViewGroup rootView, ShopItemModel itemModel) {
        ArrayList arrayList = new ArrayList();
        if (itemModel.getShopItemType() != ShopItemType.Banner) {
            return arrayList;
        }
        if (itemModel.getBetcoins() > 0) {
            LinearLayout linearLayout = new LinearLayout(rootView.getContext());
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setGravity(17);
            linearLayout.setBackgroundDrawable(ContextCompat.getDrawable(rootView.getContext(), R.drawable.shop_benefit_container));
            int applyDimension = (int) TypedValue.applyDimension(1, 8.0f, rootView.getResources().getDisplayMetrics());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, applyDimension);
            linearLayout.setLayoutParams(layoutParams);
            TextView textView = new TextView(rootView.getContext());
            textView.setText(String.valueOf(itemModel.getBetcoins()));
            textView.setShadowLayer(5.0f, 5.0f, 5.0f, ContextCompat.getColor(rootView.getContext(), R.color.Black));
            textView.setTextSize(2, 18.0f);
            textView.setTypeface(ResourcesCompat.getFont(rootView.getContext(), R.font.open_sans_bold), 1);
            textView.setAutoSizeTextTypeUniformWithConfiguration(12, 18, 1, 2);
            linearLayout.addView(textView);
            ImageView imageView = new ImageView(rootView.getContext());
            imageView.setImageResource(R.drawable.betcoin);
            int applyDimension2 = (int) TypedValue.applyDimension(1, 25.0f, rootView.getResources().getDisplayMetrics());
            imageView.setLayoutParams(new LinearLayout.LayoutParams(applyDimension2, applyDimension2));
            linearLayout.addView(imageView);
            arrayList.add(linearLayout);
        }
        if (itemModel.getEffect() != null && itemModel.getEffect().getName() != null) {
            FontText fontText = getFontText(layoutInflater, rootView);
            String name = itemModel.getEffect().getName();
            Matcher matcher = compiledPatternToHighlight.matcher(name);
            while (matcher.find()) {
                String group = matcher.group();
                Log.d("FORMAT_SHOP", "FOUND MATCH = " + group);
                String string = rootView.getContext().getString(R.color.colorAccent);
                if (string.length() == 9) {
                    string = "#" + string.substring(3);
                }
                name = name.replace(group, "<font color='" + string + "'>" + group + "</font>");
                Log.d("FORMAT_SHOP", "AFTER " + name);
            }
            if (itemModel.getEffectDuration() != null) {
                name = String.format(name, itemModel.getEffectDuration());
            }
            Log.d("FORMAT_SHOP", "BEFORE HTML = " + name);
            fontText.setText(Html.fromHtml(name));
            arrayList.add(fontText);
        }
        if (itemModel.isNoAds()) {
            FontText fontText2 = getFontText(layoutInflater, rootView);
            fontText2.setText(rootView.getContext().getString(R.string.no_ads_forver));
            fontText2.setTextColor(ContextCompat.getColor(rootView.getContext(), R.color.colorAccent));
            arrayList.add(fontText2);
        }
        if (itemModel.isOpenBets()) {
            FontText fontText3 = getFontText(layoutInflater, rootView);
            fontText3.setText(rootView.getContext().getString(R.string.unlock_all_bets_title));
            fontText3.setTextColor(ContextCompat.getColor(rootView.getContext(), R.color.colorAccent));
            arrayList.add(fontText3);
        }
        return arrayList;
    }

    private static FontText getFontText(LayoutInflater layoutInflater, ViewGroup rootView) {
        return (FontText) layoutInflater.inflate(R.layout.shop_benefit_item, rootView, false);
    }
}
