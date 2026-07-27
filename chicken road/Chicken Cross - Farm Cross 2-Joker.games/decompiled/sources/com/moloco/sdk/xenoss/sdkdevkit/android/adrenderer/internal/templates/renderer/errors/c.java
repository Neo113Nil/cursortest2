package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public abstract class c extends g {
    public static final int i = 0;
    public final String h;

    public static final class a extends c {
        public static final a j = new a();
        public static final int k = 0;

        public a() {
            super("net::ERR_ADDRESS_UNREACHABLE", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -557181147;
        }

        public String toString() {
            return "ERR_ADDRESS_UNREACHABLE";
        }
    }

    public static final class b extends c {
        public static final b j = new b();
        public static final int k = 0;

        public b() {
            super("net::ERR_INTERNET_DISCONNECTED", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 909214677;
        }

        public String toString() {
            return "ERR_INTERNET_DISCONNECTED";
        }
    }

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.c$c, reason: collision with other inner class name */
    public static final class C1559c extends c {
        public static final C1559c j = new C1559c();
        public static final int k = 0;

        public C1559c() {
            super("net::ERR_NAME_NOT_RESOLVED", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1559c);
        }

        public int hashCode() {
            return -1297026924;
        }

        public String toString() {
            return "ERR_NAME_NOT_RESOLVED";
        }
    }

    public /* synthetic */ c(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g
    public String c() {
        return this.h;
    }

    public c(String str) {
        super(-2, str, true, false, null);
        this.h = str;
    }
}
