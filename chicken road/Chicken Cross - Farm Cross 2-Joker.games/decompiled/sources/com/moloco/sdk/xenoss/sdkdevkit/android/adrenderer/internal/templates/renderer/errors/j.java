package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public abstract class j extends g {
    public static final int i = 0;
    public final String h;

    public static final class a extends j {
        public static final a j = new a();
        public static final int k = 0;

        public a() {
            super("net::ERR_UNKNOWN_URL_SCHEME", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 284504500;
        }

        public String toString() {
            return "ERR_UNKNOWN_URL_SCHEME";
        }
    }

    public /* synthetic */ j(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g
    public String c() {
        return this.h;
    }

    public j(String str) {
        super(-10, str, false, true, null);
        this.h = str;
    }
}
