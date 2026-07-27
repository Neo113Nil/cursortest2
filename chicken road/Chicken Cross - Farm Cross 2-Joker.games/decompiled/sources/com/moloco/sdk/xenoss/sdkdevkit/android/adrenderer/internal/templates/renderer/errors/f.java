package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public abstract class f extends g {
    public static final int i = 0;
    public final String h;

    public static final class a extends f {
        public static final a j = new a();
        public static final int k = 0;

        public a() {
            super("net::ERR_SSL_BAD_RECORD_MAC_ALERT", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1157822157;
        }

        public String toString() {
            return "ERR_SSL_BAD_RECORD_MAC_ALERT";
        }
    }

    public static final class b extends f {
        public static final b j = new b();
        public static final int k = 0;

        public b() {
            super("net::ERR_SSL_PROTOCOL_ERROR", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -715617482;
        }

        public String toString() {
            return "ERR_SSL_PROTOCOL_ERROR";
        }
    }

    public static final class c extends f {
        public static final c j = new c();
        public static final int k = 0;

        public c() {
            super("net::ERR_SSL_VERSION_OR_CIPHER_MISMATCH", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 516103234;
        }

        public String toString() {
            return "ERR_SSL_VERSION_OR_CIPHER_MISMATCH";
        }
    }

    public /* synthetic */ f(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g
    public String c() {
        return this.h;
    }

    public f(String str) {
        super(-11, str, false, true, null);
        this.h = str;
    }
}
