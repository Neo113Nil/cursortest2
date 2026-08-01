package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public abstract class i extends g {
    public static final int i = 0;
    public final String h;

    public static final class a extends i {
        public static final a j = new a();
        public static final int k = 0;

        public a() {
            super("net::ERR_CONNECTION_TIMED_OUT", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -56384004;
        }

        public String toString() {
            return "ERR_CONNECTION_TIMED_OUT";
        }
    }

    public static final class b extends i {
        public static final b j = new b();
        public static final int k = 0;

        public b() {
            super("net::ERR_TIMED_OUT", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 389383759;
        }

        public String toString() {
            return "ERR_TIMED_OUT";
        }
    }

    public /* synthetic */ i(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g
    public String c() {
        return this.h;
    }

    public i(String str) {
        super(-8, str, true, false, null);
        this.h = str;
    }
}
