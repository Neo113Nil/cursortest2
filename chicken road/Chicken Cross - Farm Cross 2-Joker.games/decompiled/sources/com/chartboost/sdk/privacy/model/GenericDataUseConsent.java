package com.chartboost.sdk.privacy.model;

import androidx.core.app.NotificationCompat;
import com.chartboost.sdk.impl.fi;
import com.chartboost.sdk.impl.i7;
import com.chartboost.sdk.impl.yh;
import com.chartboost.sdk.tracking.TrackAd;
import com.chartboost.sdk.tracking.a;
import com.chartboost.sdk.tracking.f;
import com.chartboost.sdk.tracking.g;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.U3;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\b\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0004¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\f\u001a\u00020\u000b*\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\f\u0010\u000fJ\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0014J\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u000b*\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\rJ\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0014\u0010\u001b\u001a\u00020\u000b*\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\rJ\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u000fJ \u0010\u001e\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b \u0010\nR\"\u0010*\u001a\u00020%8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b\t\u0010(\"\u0004\b\t\u0010)R\u0014\u0010,\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010#¨\u0006-"}, d2 = {"Lcom/chartboost/sdk/privacy/model/GenericDataUseConsent;", "Lcom/chartboost/sdk/privacy/model/DataUseConsent;", "Lcom/chartboost/sdk/impl/i7;", "eventTracker", "<init>", "(Lcom/chartboost/sdk/impl/i7;)V", "", "msg", "", "a", "(Ljava/lang/String;)V", "Lcom/chartboost/sdk/tracking/f;", "track", "(Lcom/chartboost/sdk/tracking/f;)Lcom/chartboost/sdk/tracking/f;", NotificationCompat.CATEGORY_EVENT, "(Lcom/chartboost/sdk/tracking/f;)V", "Lcom/chartboost/sdk/tracking/TrackAd;", U3.i.U, "(Lcom/chartboost/sdk/tracking/TrackAd;)Lcom/chartboost/sdk/tracking/TrackAd;", "ad", "(Lcom/chartboost/sdk/tracking/TrackAd;)V", "Lcom/chartboost/sdk/impl/fi;", ToolBar.REFRESH, "(Lcom/chartboost/sdk/impl/fi;)Lcom/chartboost/sdk/impl/fi;", "config", "(Lcom/chartboost/sdk/impl/fi;)V", "persist", "clearFromStorage", "type", FirebaseAnalytics.Param.LOCATION, "clear", "(Ljava/lang/String;Ljava/lang/String;)V", "b", "Ljava/lang/String;", "getPrivacyStandardName", "()Ljava/lang/String;", "privacyStandardName", "", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "consentValue", "getPrivacyStandard", "privacyStandard", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class GenericDataUseConsent implements DataUseConsent, i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i7 f5132a;

    /* renamed from: b, reason: from kotlin metadata */
    public String privacyStandardName;

    /* renamed from: c, reason: from kotlin metadata */
    public Object consentValue;

    /* JADX WARN: Multi-variable type inference failed */
    public GenericDataUseConsent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: a, reason: from getter */
    public final Object getConsentValue() {
        return this.consentValue;
    }

    public final void b(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.privacyStandardName = str;
    }

    @Override // com.chartboost.sdk.impl.h7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f5132a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.i7
    public f clearFromStorage(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f5132a.clearFromStorage(fVar);
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    /* renamed from: getPrivacyStandard, reason: from getter */
    public String getPrivacyStandardName() {
        return this.privacyStandardName;
    }

    @Override // com.chartboost.sdk.impl.i7
    public f persist(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f5132a.persist(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public fi refresh(fi fiVar) {
        Intrinsics.checkNotNullParameter(fiVar, "<this>");
        return this.f5132a.refresh(fiVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public TrackAd store(TrackAd trackAd) {
        Intrinsics.checkNotNullParameter(trackAd, "<this>");
        return this.f5132a.store(trackAd);
    }

    @Override // com.chartboost.sdk.impl.i7
    public f track(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.f5132a.track(fVar);
    }

    public GenericDataUseConsent(i7 eventTracker) {
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f5132a = eventTracker;
        this.privacyStandardName = "";
        this.consentValue = "";
    }

    public final void a(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.consentValue = obj;
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: clearFromStorage */
    public void mo4755clearFromStorage(f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f5132a.mo4755clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: persist */
    public void mo4756persist(f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f5132a.mo4756persist(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: refresh */
    public void mo4757refresh(fi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f5132a.mo4757refresh(config);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: store */
    public void mo4758store(TrackAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.f5132a.mo4758store(ad);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: track */
    public void mo4759track(f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f5132a.mo4759track(event);
    }

    public final void a(String msg) {
        try {
            track((f) new a(g.d.e, msg == null ? "no message" : msg, "", "", null, null, 48, null));
            throw new Exception(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public /* synthetic */ GenericDataUseConsent(i7 i7Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yh.a() : i7Var);
    }
}
