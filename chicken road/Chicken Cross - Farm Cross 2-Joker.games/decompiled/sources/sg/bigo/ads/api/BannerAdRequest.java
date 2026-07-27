package sg.bigo.ads.api;

import com.google.android.gms.games.GamesActivityResultCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.N.d;

/* loaded from: classes3.dex */
public class BannerAdRequest extends d {
    public final ArrayList i;

    public static class Builder extends AdRequestBuilder<Builder, BannerAdRequest> {
        private List<AdSize> mAdSizes;

        public Builder withAdSizes(AdSize... adSizeArr) {
            this.mAdSizes = Arrays.asList(adSizeArr);
            return this;
        }

        @Override // sg.bigo.ads.api.AdRequestBuilder
        public BannerAdRequest createAdRequest() {
            return new BannerAdRequest(this.mSlotId, this.mAdSizes, this.mServerBidPayload);
        }
    }

    public BannerAdRequest(String str, List list, String str2) {
        super(str, str2);
        this.i = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AdSize adSize = (AdSize) it.next();
                if (adSize != null) {
                    this.i.add(adSize);
                }
            }
        }
    }

    @Override // sg.bigo.ads.N.d
    public int a() {
        return 2;
    }

    @Override // sg.bigo.ads.N.d
    public final Map b() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = this.i;
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AdSize adSize = (AdSize) it.next();
            if (adSize != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("w", adSize.getWidth());
                    jSONObject.put("h", adSize.getHeight());
                    jSONObject.put("t", AdSize.ADAPTIVE.equals(adSize.c) ? 1 : 0);
                } catch (JSONException unused) {
                }
                jSONArray.put(jSONObject);
            }
        }
        hashMap.put("ad_size", jSONArray);
        return hashMap;
    }

    @Override // sg.bigo.ads.N.d
    public final sg.bigo.ads.P.d e() {
        sg.bigo.ads.P.d e = super.e();
        if (e != null) {
            return e;
        }
        if (this.i.isEmpty()) {
            return new sg.bigo.ads.P.d(1001, GamesActivityResultCodes.RESULT_LICENSE_FAILED, "Ad sizes cannot be empty.");
        }
        return null;
    }

    @Override // sg.bigo.ads.N.d
    public final d f() {
        BannerAdRequest bannerAdRequest = new BannerAdRequest(d(), new ArrayList(this.i), this.b);
        bannerAdRequest.h.f12464a = this.h.f12464a;
        bannerAdRequest.c = this.c;
        bannerAdRequest.g = this.g;
        return bannerAdRequest;
    }
}
