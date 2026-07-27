package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.Partner;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class Gg extends Fg {
    public Partner b = Partner.createPartner("Inmobi", a());

    public final String a() {
        return "a" + StringsKt.replace$default("11.4.0", ".", "", false, 4, (Object) null);
    }
}
