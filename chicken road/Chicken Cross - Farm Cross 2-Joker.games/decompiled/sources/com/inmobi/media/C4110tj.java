package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.tj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4110tj implements Lb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ej f7398a;
    public final /* synthetic */ Context b;

    public C4110tj(Ej ej, Context context) {
        this.f7398a = ej;
        this.b = context;
    }

    @Override // com.inmobi.media.Lb
    public final void a() {
        this.f7398a.getListener().a();
    }

    @Override // com.inmobi.media.Lb
    public final void b(String str, String str2, String str3) {
        this.f7398a.b(str, str2, str3);
    }

    @Override // com.inmobi.media.Lb
    public final void a(String str, String message, String str2) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f7398a.a(str, message, str2);
    }

    @Override // com.inmobi.media.Lb
    public final void a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        intent.putExtra("creativeId", this.f7398a.getCreativeId());
        intent.putExtra("impressionId", this.f7398a.getImpressionId());
        intent.putExtra("placementId", this.f7398a.getPlacementId());
        intent.putExtra("isImmersive", this.f7398a.Y0);
        SparseArray sparseArray = InMobiAdActivity.t;
        Ej ej = this.f7398a;
        InMobiAdActivity.u = ej;
        if (ej.getPlacementType() == 0) {
            Context context = AbstractC3914mk.f7252a;
            Activity context2 = this.f7398a.getBannerHolderActivity().get();
            if (context2 == null) {
                context2 = this.b;
            }
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (!(context2 instanceof Activity)) {
                intent.setFlags(268435456);
            }
            context2.startActivity(intent);
            return;
        }
        intent.putExtra("supportBrowserLoader", true);
        Context context3 = AbstractC3914mk.f7252a;
        Context context4 = this.f7398a.getContainerContext();
        Intrinsics.checkNotNullParameter(context4, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!(context4 instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context4.startActivity(intent);
    }

    @Override // com.inmobi.media.Lb
    public final void a(String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        Ej ej = this.f7398a;
        if (ej.e) {
            return;
        }
        ej.b(trackerName, macros);
    }
}
