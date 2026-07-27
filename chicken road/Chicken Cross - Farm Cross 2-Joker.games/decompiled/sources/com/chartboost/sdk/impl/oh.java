package com.chartboost.sdk.impl;

import com.chartboost.sdk.tracking.TrackAd;
import com.chartboost.sdk.tracking.g;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class oh implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i7 f4945a;

    public oh(i7 eventTracker) {
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f4945a = eventTracker;
    }

    public final String a(File htmlFile, Map allParams, String adTypeName, String location) {
        Intrinsics.checkNotNullParameter(htmlFile, "htmlFile");
        Intrinsics.checkNotNullParameter(allParams, "allParams");
        Intrinsics.checkNotNullParameter(adTypeName, "adTypeName");
        Intrinsics.checkNotNullParameter(location, "location");
        try {
            Regex regex = new Regex("\\{\\{\\s*([^}]+)\\s*\\}\\}|\\{%\\s*([^}]+)\\s*%\\}");
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allParams.entrySet()) {
                String str = (String) entry.getKey();
                if (StringsKt.startsWith$default(str, "{{", false, 2, (Object) null) || StringsKt.startsWith$default(str, "{%", false, 2, (Object) null)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return a(regex.replace(FilesKt.readText(htmlFile, Charsets.UTF_8), new Function1() { // from class: com.chartboost.sdk.impl.oh$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return oh.a(linkedHashMap, (MatchResult) obj);
                }
            }));
        } catch (Exception e) {
            mb.b("Failed to parse template", e);
            a(adTypeName, location, e.toString());
            return null;
        }
    }

    @Override // com.chartboost.sdk.impl.h7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f4945a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f clearFromStorage(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f4945a.clearFromStorage(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f persist(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f4945a.persist(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public fi refresh(fi fiVar) {
        Intrinsics.checkNotNullParameter(fiVar, "<this>");
        return this.f4945a.refresh(fiVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public TrackAd store(TrackAd trackAd) {
        Intrinsics.checkNotNullParameter(trackAd, "<this>");
        return this.f4945a.store(trackAd);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f track(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f4945a.track(fVar);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: clearFromStorage */
    public void mo4755clearFromStorage(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4945a.mo4755clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: persist */
    public void mo4756persist(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4945a.mo4756persist(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: refresh */
    public void mo4757refresh(fi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f4945a.mo4757refresh(config);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: store */
    public void mo4758store(TrackAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f4945a.mo4758store(ad);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: track */
    public void mo4759track(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f4945a.mo4759track(event);
    }

    public static final CharSequence a(Map map, MatchResult matchResult) {
        Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        String value = matchResult.getValue();
        String str = (String) map.get(value);
        return str != null ? str : value;
    }

    public final String a(String str) {
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "{{", false, 2, (Object) null)) {
            throw new IllegalArgumentException("Missing required template parameter " + str);
        }
        return str;
    }

    public final void a(String str, String str2, String str3) {
        track((com.chartboost.sdk.tracking.f) com.chartboost.sdk.tracking.a.m.a(g.i.h, str3, str, str2));
    }
}
