package com.amplitude.core.utilities.http;

import com.amplitude.core.utilities.x;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class g extends a {
    public final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(JSONObject response) {
        super(f.e);
        Intrinsics.checkNotNullParameter(response, "response");
        this.b = x.c(response);
    }
}
