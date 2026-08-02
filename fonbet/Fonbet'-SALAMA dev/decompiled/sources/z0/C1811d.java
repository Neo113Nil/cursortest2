package z0;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import io.sentry.SentryBaseEvent;
import t6.h;

/* renamed from: z0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1811d extends AbstractC1813f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18432b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1811d(TopicsManager topicsManager, int i7) {
        super(topicsManager);
        this.f18432b = i7;
    }

    @Override // z0.AbstractC1813f
    public GetTopicsRequest a(C1808a c1808a) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest.Builder shouldRecordObservation;
        GetTopicsRequest build;
        switch (this.f18432b) {
            case 1:
                h.e(c1808a, SentryBaseEvent.JsonKeys.REQUEST);
                adsSdkName = io.flutter.plugin.editing.a.f().setAdsSdkName("com.google.android.gms.ads");
                shouldRecordObservation = adsSdkName.setShouldRecordObservation(c1808a.f18427a);
                build = shouldRecordObservation.build();
                h.d(build, "Builder()\n            .s…ion)\n            .build()");
                return build;
            default:
                return super.a(c1808a);
        }
    }
}
