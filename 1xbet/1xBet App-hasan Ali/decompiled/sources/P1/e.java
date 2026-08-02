package P1;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4706b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TopicsManager topicsManager, int i) {
        super(topicsManager);
        this.f4706b = i;
    }

    @Override // P1.g
    public GetTopicsRequest a(a aVar) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest.Builder shouldRecordObservation;
        GetTopicsRequest build;
        switch (this.f4706b) {
            case 1:
                l.f("request", aVar);
                adsSdkName = d.d().setAdsSdkName("com.google.android.gms.ads");
                shouldRecordObservation = adsSdkName.setShouldRecordObservation(aVar.f4701a);
                build = shouldRecordObservation.build();
                l.e("Builder()\n            .s…ion)\n            .build()", build);
                return build;
            default:
                return super.a(aVar);
        }
    }
}
