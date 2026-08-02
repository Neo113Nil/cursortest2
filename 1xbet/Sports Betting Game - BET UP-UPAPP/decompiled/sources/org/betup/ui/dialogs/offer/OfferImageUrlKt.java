package org.betup.ui.dialogs.offer;

import com.ironsource.X3;
import io.bidmachine.unified.UnifiedMediationParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;

/* compiled from: OfferImageUrl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, d2 = {"buildOfferImageDisplayUrl", "", UnifiedMediationParams.KEY_ICON_URL, "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OfferImageUrlKt {
    public static final String buildOfferImageDisplayUrl(String iconUrl) {
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        String str = TypeDescription.Generic.OfWildcardType.SYMBOL;
        if (StringsKt.contains$default((CharSequence) iconUrl, (CharSequence) TypeDescription.Generic.OfWildcardType.SYMBOL, false, 2, (Object) null)) {
            str = X3.j.c;
        }
        return iconUrl + str + "t=" + System.currentTimeMillis();
    }
}
