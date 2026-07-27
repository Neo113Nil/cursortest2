package com.inmobi.media;

import android.webkit.URLUtil;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.inmobi.media.z8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4264z8 implements Yh {

    /* renamed from: a, reason: collision with root package name */
    public final String f7520a;

    public C4264z8(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f7520a = content;
        String str = "HtmlUrlPubContent: " + content;
    }

    @Override // com.inmobi.media.Yh
    public final Object a(Continuation continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.inmobi.media.Yh
    public final Object b() {
        return StringsKt.trim((CharSequence) this.f7520a).toString();
    }

    @Override // com.inmobi.media.Yh
    public final void a() {
        String str = "validateOrThrow: " + this.f7520a;
        if (URLUtil.isValidUrl(StringsKt.trim((CharSequence) this.f7520a).toString())) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2162);
        throw new C3572ai(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C4194wk(hashMap));
    }
}
