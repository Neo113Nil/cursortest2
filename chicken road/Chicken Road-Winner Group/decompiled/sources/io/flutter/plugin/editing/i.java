package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class i implements SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a, reason: collision with root package name */
    public final b0.i f9205a;

    /* renamed from: b, reason: collision with root package name */
    public final TextServicesManager f9206b;

    /* renamed from: c, reason: collision with root package name */
    public SpellCheckerSession f9207c;

    /* renamed from: d, reason: collision with root package name */
    public S1.i f9208d;

    public i(TextServicesManager textServicesManager, b0.i iVar) {
        this.f9206b = textServicesManager;
        this.f9205a = iVar;
        iVar.f2461b = this;
    }

    public final void a(String str, String str2, S1.i iVar) {
        if (this.f9208d != null) {
            iVar.b("error", "Previous spell check request still pending.", null);
            return;
        }
        this.f9208d = iVar;
        Locale a3 = U1.a.a(str);
        if (this.f9207c == null) {
            this.f9207c = this.f9206b.newSpellCheckerSession(null, a3, this, true);
        }
        this.f9207c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f9208d.success(new ArrayList());
            this.f9208d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f9208d.success(new ArrayList());
            this.f9208d = null;
            return;
        }
        for (int i3 = 0; i3 < sentenceSuggestionsInfo.getSuggestionsCount(); i3++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i3);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i3);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i3) + offsetAt;
                hashMap.put("startIndex", Integer.valueOf(offsetAt));
                hashMap.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z3 = false;
                for (int i4 = 0; i4 < suggestionsCount; i4++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i4);
                    if (!suggestionAt.isEmpty()) {
                        arrayList2.add(suggestionAt);
                        z3 = true;
                    }
                }
                if (z3) {
                    hashMap.put("suggestions", arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.f9208d.success(arrayList);
        this.f9208d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
