package org.betup.model.remote.api.rest.shop;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.entity.share.BetShareInstallLinkResponse;

/* compiled from: GetBetShareInstallLinkInteractorExt.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a<\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00010\u0006\u001a \u0010\n\u001a\u0004\u0018\u00010\t2\u0016\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f¨\u0006\u000e"}, d2 = {"fetchBetInstallUrl", "", "Lorg/betup/model/remote/api/rest/shop/GetBetShareInstallLinkInteractor;", "betlistId", "", "runOnUiThreadIfNeeded", "Lkotlin/Function1;", "Ljava/lang/Runnable;", "onResult", "", "parseBetShareInstallUrl", "msg", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "Lorg/betup/model/remote/entity/share/BetShareInstallLinkResponse;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GetBetShareInstallLinkInteractorExtKt {
    public static final void fetchBetInstallUrl(GetBetShareInstallLinkInteractor getBetShareInstallLinkInteractor, long j, final Function1<? super Runnable, Unit> runOnUiThreadIfNeeded, final Function1<? super String, Unit> onResult) {
        Intrinsics.checkNotNullParameter(getBetShareInstallLinkInteractor, "<this>");
        Intrinsics.checkNotNullParameter(runOnUiThreadIfNeeded, "runOnUiThreadIfNeeded");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        getBetShareInstallLinkInteractor.invalidate(j);
        getBetShareInstallLinkInteractor.load(new BaseCachedSharedInteractor.OnFetchedListener() { // from class: org.betup.model.remote.api.rest.shop.GetBetShareInstallLinkInteractorExtKt$$ExternalSyntheticLambda1
            @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
            public final void onFetched(FetchedResponseMessage fetchedResponseMessage) {
                GetBetShareInstallLinkInteractorExtKt.fetchBetInstallUrl$lambda$1(Function1.this, onResult, fetchedResponseMessage);
            }
        }, Long.valueOf(j), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchBetInstallUrl$lambda$1(Function1 function1, final Function1 function12, FetchedResponseMessage fetchedResponseMessage) {
        final String parseBetShareInstallUrl = parseBetShareInstallUrl(fetchedResponseMessage);
        function1.invoke(new Runnable() { // from class: org.betup.model.remote.api.rest.shop.GetBetShareInstallLinkInteractorExtKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Function1.this.invoke(parseBetShareInstallUrl);
            }
        });
    }

    public static final String parseBetShareInstallUrl(FetchedResponseMessage<BetShareInstallLinkResponse, Long> fetchedResponseMessage) {
        BetShareInstallLinkResponse model;
        String installUrl;
        String obj;
        if ((fetchedResponseMessage != null ? fetchedResponseMessage.getStat() : null) != FetchStat.SUCCESS || fetchedResponseMessage.getModel() == null || (model = fetchedResponseMessage.getModel()) == null || (installUrl = model.getInstallUrl()) == null || (obj = StringsKt.trim((CharSequence) installUrl).toString()) == null || obj.length() <= 0) {
            return null;
        }
        return obj;
    }
}
