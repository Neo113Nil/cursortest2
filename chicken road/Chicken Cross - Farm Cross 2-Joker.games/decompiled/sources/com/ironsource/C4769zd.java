package com.ironsource;

import com.ironsource.InterfaceC4654t6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.zd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4769zd {
    public static final a b = new a(null);
    public static final String c = "type";
    public static final String d = "single";
    public static final String e = "onShowSuccess";
    public static final String f = "onLoadSuccess";

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4654t6.c f8796a;

    /* renamed from: com.ironsource.zd$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4769zd(JSONObject features) {
        InterfaceC4654t6.c cVar;
        Intrinsics.checkNotNullParameter(features, "features");
        String optString = features.optString("type");
        if (optString != null) {
            int hashCode = optString.hashCode();
            if (hashCode != -1900843810) {
                if (hashCode != -999907609) {
                    if (hashCode == -902265784 && optString.equals(d)) {
                        cVar = InterfaceC4654t6.c.SINGLE;
                    }
                } else if (optString.equals(e)) {
                    cVar = InterfaceC4654t6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
                }
            } else if (optString.equals(f)) {
                cVar = InterfaceC4654t6.c.PROGRESSIVE_ON_LOAD_SUCCESS;
            }
            this.f8796a = cVar;
        }
        cVar = null;
        this.f8796a = cVar;
    }

    public final InterfaceC4654t6.c a() {
        return this.f8796a;
    }
}
