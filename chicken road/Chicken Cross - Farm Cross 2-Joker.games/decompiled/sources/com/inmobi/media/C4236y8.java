package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.y8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4236y8 implements Yh {

    /* renamed from: a, reason: collision with root package name */
    public final String f7496a;

    public C4236y8(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f7496a = content;
        String str = "HtmlPubContent: " + content;
    }

    @Override // com.inmobi.media.Yh
    public final Object a(Continuation continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.inmobi.media.Yh
    public final Object b() {
        return this.f7496a;
    }

    @Override // com.inmobi.media.Yh
    public final void a() {
        String str = "validateOrThrow: " + this.f7496a;
        if (this.f7496a.length() != 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2162);
        throw new C3572ai(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4194wk(hashMap));
    }
}
