package p170z0;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import io.flutter.plugin.editing.a;
import io.sentry.SentryBaseEvent;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class d extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18438b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TopicsManager topicsManager, int i7) {
        super(topicsManager);
        this.f18438b = i7;
    }

    @Override // p170z0.f
    public GetTopicsRequest a(a aVar) {
        switch (this.f18438b) {
            case 1:
                h.e(aVar, SentryBaseEvent.JsonKeys.REQUEST);
                GetTopicsRequest getTopicsRequestBuild = a.f().setAdsSdkName("com.google.android.gms.ads").setShouldRecordObservation(aVar.f18433a).build();
                h.d(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
                return getTopicsRequestBuild;
            default:
                return super.a(aVar);
        }
    }
}
