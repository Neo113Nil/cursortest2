package org.betup.services.challenge;

import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.betup.BetUpApp;
import org.betup.model.remote.entity.challenge.ChallengeTourInfo;
import org.betup.utils.SharedPrefs;

/* loaded from: classes2.dex */
public class ChallengeTourInfoProvider {
    public static final String DEFAULT_LANGUAGE = "en";

    public List<ChallengeTourInfo> getTourInfo() {
        String language = Locale.getDefault().getLanguage();
        try {
            Map map = (Map) new Gson().fromJson(FirebaseRemoteConfig.getInstance().getString("challenge_tour_config"), new TypeToken<HashMap<String, ArrayList<ChallengeTourInfo>>>() { // from class: org.betup.services.challenge.ChallengeTourInfoProvider.1
            }.getType());
            if (map.containsKey(language)) {
                return (List) map.get(language);
            }
            if (map.containsKey("en")) {
                return (List) map.get("en");
            }
            if (map.keySet().size() > 0) {
                return (List) map.get(map.keySet().iterator().next());
            }
            return new ArrayList();
        } catch (Exception e) {
            Log.e("Challenge tour", "Error happened during json config parsing", e);
            return new ArrayList();
        }
    }

    public boolean shouldDisplayChallengeTour() {
        return SharedPrefs.shouldShowChallengeTour(BetUpApp.getContext());
    }

    public void saveTourWasShown() {
        SharedPrefs.saveChallengeTourShown(BetUpApp.getContext());
    }
}
