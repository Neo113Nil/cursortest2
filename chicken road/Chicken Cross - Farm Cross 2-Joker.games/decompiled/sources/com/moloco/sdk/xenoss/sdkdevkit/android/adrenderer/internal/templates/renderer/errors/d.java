package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public abstract class d extends g {
    public static final int i = 0;
    public final String h;

    public static final class a extends d {
        public static final a j = new a();
        public static final int k = 0;

        public a() {
            super("net::ERR_PROXY_CONNECTION_FAILED", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 120626217;
        }

        public String toString() {
            return "ERR_PROXY_CONNECTION_FAILED";
        }
    }

    public /* synthetic */ d(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g
    public String c() {
        return this.h;
    }

    public d(String str) {
        super(-5, str, false, true, null);
        this.h = str;
    }
}
