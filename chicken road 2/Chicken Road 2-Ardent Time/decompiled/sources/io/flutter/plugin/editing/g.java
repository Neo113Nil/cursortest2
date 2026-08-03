package io.flutter.plugin.editing;

/* loaded from: classes.dex */
public final class g implements android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a, reason: collision with root package name */
    public final Z0.h f7711a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.textservice.TextServicesManager f7712b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.textservice.SpellCheckerSession f7713c;

    /* renamed from: d, reason: collision with root package name */
    public Z0.j f7714d;

    public g(android.view.textservice.TextServicesManager textServicesManager, Z0.h hVar) {
        this.f7712b = textServicesManager;
        this.f7711a = hVar;
        hVar.f1903b = this;
    }

    public final void a(java.lang.String str, java.lang.String str2, Z0.j jVar) {
        if (this.f7714d != null) {
            jVar.a("error", "Previous spell check request still pending.", null);
            return;
        }
        this.f7714d = jVar;
        java.util.Locale a2 = b1.C0094a.a(str);
        if (this.f7713c == null) {
            this.f7713c = this.f7712b.newSpellCheckerSession(null, a2, this, true);
        }
        this.f7713c.getSentenceSuggestions(new android.view.textservice.TextInfo[]{new android.view.textservice.TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSentenceSuggestions(android.view.textservice.SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f7714d.c(new java.util.ArrayList());
            this.f7714d = null;
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.view.textservice.SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f7714d.c(new java.util.ArrayList());
            this.f7714d = null;
            return;
        }
        for (int i2 = 0; i2 < sentenceSuggestionsInfo.getSuggestionsCount(); i2++) {
            android.view.textservice.SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i2);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                java.util.HashMap hashMap = new java.util.HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i2);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i2) + offsetAt;
                hashMap.put("startIndex", java.lang.Integer.valueOf(offsetAt));
                hashMap.put("endIndex", java.lang.Integer.valueOf(lengthAt));
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                boolean z2 = false;
                for (int i3 = 0; i3 < suggestionsCount; i3++) {
                    java.lang.String suggestionAt = suggestionsInfoAt.getSuggestionAt(i3);
                    if (!suggestionAt.isEmpty()) {
                        arrayList2.add(suggestionAt);
                        z2 = true;
                    }
                }
                if (z2) {
                    hashMap.put("suggestions", arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.f7714d.c(arrayList);
        this.f7714d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSuggestions(android.view.textservice.SuggestionsInfo[] suggestionsInfoArr) {
    }
}
