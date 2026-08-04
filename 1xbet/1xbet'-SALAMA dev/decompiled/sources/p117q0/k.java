package p117q0;

import A1.x0;
import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.t;

/* JADX INFO: loaded from: classes.dex */
public final class k extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f15756c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Context context) {
        super(lVar, context);
        this.f15756c = lVar;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        t.Z(bundle);
        l lVar = this.f15756c;
        s sVar = lVar.f15757x;
        h hVar = sVar.f15785c;
        sVar.c(str, new i(lVar, str, new x0(result, 19), bundle), bundle);
        lVar.f15757x.getClass();
    }
}
