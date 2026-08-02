package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class StateFarmClient extends com.knotapi.knot.webview.KnotViewClient {
    private int MAX_RETRIES;
    private java.util.List<com.knotapi.knot.utilities.Cookie> cookies;
    private int foundCookieCount;
    private java.util.List<java.lang.String> requiredCookieNames;
    private int retryCount;

    public StateFarmClient(com.knotapi.knot.webview.KnotView knotView) {
        super(knotView);
        this.MAX_RETRIES = 3;
        this.cookies = new java.util.ArrayList();
        this.retryCount = 0;
        this.foundCookieCount = 0;
    }

    private java.util.List<java.lang.String> getCookieNames() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.gson.JsonElement jsonElement = this.bot.getAllSettings().get("cookieName");
        if (jsonElement != null && jsonElement.isJsonArray()) {
            java.util.Iterator<com.google.gson.JsonElement> it = jsonElement.getAsJsonArray().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getAsString());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add("sf-cauth1");
        }
        return arrayList;
    }

    public boolean isCookiePresent(java.util.List<com.knotapi.knot.utilities.Cookie> list, java.lang.String str, boolean z) {
        for (com.knotapi.knot.utilities.Cookie cookie : list) {
            if (cookie.getName().equals(str)) {
                if (!z) {
                    return true;
                }
                this.knotView.getCookies().add(cookie);
                return true;
            }
        }
        return false;
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public void onStorageDetails(java.lang.String str, java.lang.String str2) {
        java.util.List<java.lang.String> cookieNames = getCookieNames();
        this.requiredCookieNames = cookieNames;
        this.foundCookieCount = 0;
        java.util.Iterator<java.lang.String> it = cookieNames.iterator();
        while (it.hasNext()) {
            if (isCookiePresent(this.knotView.getCookies(), it.next(), false)) {
                this.foundCookieCount++;
            }
        }
        if (this.foundCookieCount == this.requiredCookieNames.size() || this.retryCount >= this.MAX_RETRIES) {
            super.onStorageDetails(str, str2);
        } else {
            startFetchingCookie(str, str2);
        }
    }

    private void startFetchingCookie(java.lang.String str, java.lang.String str2) {
        int i;
        do {
            com.google.gson.JsonElement jsonElement = this.bot.getAllSettings().get("cookieFetchUrl");
            java.lang.String asString = (jsonElement == null || jsonElement.getAsString().isEmpty()) ? "https://apps.statefarm.com" : jsonElement.getAsString();
            this.foundCookieCount = 0;
            for (int i2 = 0; i2 < this.requiredCookieNames.size(); i2++) {
                boolean z = false;
                int i3 = 0;
                while (true) {
                    if (i3 >= this.MAX_RETRIES || z) {
                        break;
                    }
                    this.cookies.addAll(getCookies(asString));
                    z = isCookiePresent(this.cookies, this.requiredCookieNames.get(i2), true);
                    if (z) {
                        this.foundCookieCount++;
                        break;
                    }
                    i3++;
                }
                if (!z) {
                    break;
                }
            }
            if (this.foundCookieCount >= this.requiredCookieNames.size()) {
                this.knotView.getViewClient().onStorageDetails(str, str2);
                return;
            } else {
                i = this.retryCount + 1;
                this.retryCount = i;
            }
        } while (i < this.MAX_RETRIES);
        this.knotView.getViewClient().onStorageDetails(str, str2);
    }
}
