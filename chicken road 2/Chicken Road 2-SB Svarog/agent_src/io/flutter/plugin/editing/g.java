package io.flutter.plugin.editing;

import F.t;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g implements SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a, reason: collision with root package name */
    public final t f628a;

    /* renamed from: b, reason: collision with root package name */
    public final TextServicesManager f629b;

    /* renamed from: c, reason: collision with root package name */
    public SpellCheckerSession f630c;

    /* renamed from: d, reason: collision with root package name */
    public O.l f631d;

    public g(TextServicesManager textServicesManager, t tVar) {
        this.f629b = textServicesManager;
        this.f628a = tVar;
        tVar.f114c = this;
    }

    public final void a(String str, String str2, O.l lVar) {
        if (this.f631d != null) {
            lVar.a("error", "Previous spell check request still pending.", null);
            return;
        }
        this.f631d = lVar;
        Locale a2 = Q.a.a(str);
        if (this.f630c == null) {
            this.f630c = this.f629b.newSpellCheckerSession(null, a2, this, true);
        }
        this.f630c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f631d.d(new ArrayList());
            this.f631d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f631d.d(new ArrayList());
            this.f631d = null;
            return;
        }
        for (int i2 = 0; i2 < sentenceSuggestionsInfo.getSuggestionsCount(); i2++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i2);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i2);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i2) + offsetAt;
                hashMap.put("startIndex", Integer.valueOf(offsetAt));
                hashMap.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z2 = false;
                for (int i3 = 0; i3 < suggestionsCount; i3++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i3);
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
        this.f631d.d(arrayList);
        this.f631d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
