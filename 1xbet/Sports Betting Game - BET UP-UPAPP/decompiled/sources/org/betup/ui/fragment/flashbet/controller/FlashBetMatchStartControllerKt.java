package org.betup.ui.fragment.flashbet.controller;

import io.sentry.SentryReplayEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: FlashBetMatchStartController.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DEFAULT_TEAM_IMAGE_URL", "", "FALLBACK_CAROUSEL_IMAGE_URLS", "", "filterRealTeamUrls", SentryReplayEvent.JsonKeys.URLS, "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetMatchStartControllerKt {
    private static final String DEFAULT_TEAM_IMAGE_URL = "https://www.betup.org/uploads_api/team/default.png";
    private static final List<String> FALLBACK_CAROUSEL_IMAGE_URLS;

    static {
        List listOf = CollectionsKt.listOf((Object[]) new String[]{"https://betup.org/uploads_api/team/2034.png", "https://betup.org/uploads_api/team/102741.png", "https://assets.b365api.com/images/team/m/2817.png", "https://assets.b365api.com/images/team/m/2818.png"});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOf) {
            if (!Intrinsics.areEqual((String) obj, DEFAULT_TEAM_IMAGE_URL)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            arrayList2 = CollectionsKt.listOf("https://betup.org/uploads_api/team/2034.png");
        }
        FALLBACK_CAROUSEL_IMAGE_URLS = arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> filterRealTeamUrls(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str = (String) obj;
            if (!StringsKt.isBlank(str) && !Intrinsics.areEqual(str, DEFAULT_TEAM_IMAGE_URL)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            arrayList2 = FALLBACK_CAROUSEL_IMAGE_URLS;
        }
        return arrayList2;
    }
}
