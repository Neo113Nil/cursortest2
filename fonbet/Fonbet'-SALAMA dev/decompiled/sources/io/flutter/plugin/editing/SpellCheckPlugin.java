package io.flutter.plugin.editing;

import A5.r;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import z5.m;

/* loaded from: classes2.dex */
public class SpellCheckPlugin implements SpellCheckerSession.SpellCheckerSessionListener {
    public static final String END_INDEX_KEY = "endIndex";
    private static final int MAX_SPELL_CHECK_SUGGESTIONS = 5;
    public static final String START_INDEX_KEY = "startIndex";
    public static final String SUGGESTIONS_KEY = "suggestions";
    private final m mSpellCheckChannel;
    private SpellCheckerSession mSpellCheckerSession;
    private final TextServicesManager mTextServicesManager;
    r pendingResult;

    public SpellCheckPlugin(TextServicesManager textServicesManager, m mVar) {
        this.mTextServicesManager = textServicesManager;
        this.mSpellCheckChannel = mVar;
        mVar.f18500a = this;
    }

    public void destroy() {
        this.mSpellCheckChannel.f18500a = null;
        SpellCheckerSession spellCheckerSession = this.mSpellCheckerSession;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    public void initiateSpellCheck(String str, String str2, r rVar) {
        if (this.pendingResult != null) {
            rVar.error("error", "Previous spell check request still pending.", null);
        } else {
            this.pendingResult = rVar;
            performSpellCheck(str, str2);
        }
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.pendingResult.success(new ArrayList());
            this.pendingResult = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.pendingResult.success(new ArrayList());
            this.pendingResult = null;
            return;
        }
        for (int i7 = 0; i7 < sentenceSuggestionsInfo.getSuggestionsCount(); i7++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i7);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i7);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i7) + offsetAt;
                hashMap.put(START_INDEX_KEY, Integer.valueOf(offsetAt));
                hashMap.put(END_INDEX_KEY, Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z4 = false;
                for (int i8 = 0; i8 < suggestionsCount; i8++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i8);
                    if (!suggestionAt.equals("")) {
                        arrayList2.add(suggestionAt);
                        z4 = true;
                    }
                }
                if (z4) {
                    hashMap.put(SUGGESTIONS_KEY, arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.pendingResult.success(arrayList);
        this.pendingResult = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }

    public void performSpellCheck(String str, String str2) {
        Locale a2 = B5.a.a(str);
        if (this.mSpellCheckerSession == null) {
            this.mSpellCheckerSession = this.mTextServicesManager.newSpellCheckerSession(null, a2, this, true);
        }
        this.mSpellCheckerSession.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }
}
