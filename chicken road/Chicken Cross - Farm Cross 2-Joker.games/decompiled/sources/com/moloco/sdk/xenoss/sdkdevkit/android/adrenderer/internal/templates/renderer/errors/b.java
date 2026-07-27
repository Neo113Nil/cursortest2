package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public abstract class b extends g {
    public static final int i = 0;
    public final String h;

    public static final class a extends b {
        public static final a j = new a();
        public static final int k = 0;

        public a() {
            super("net::ERR_CONNECTION_ABORTED", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -262105110;
        }

        public String toString() {
            return "ERR_CONNECTION_ABORTED";
        }
    }

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.b$b, reason: collision with other inner class name */
    public static final class C1558b extends b {
        public static final C1558b j = new C1558b();
        public static final int k = 0;

        public C1558b() {
            super("net::ERR_CONNECTION_CLOSED", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1558b);
        }

        public int hashCode() {
            return -219055663;
        }

        public String toString() {
            return "ERR_CONNECTION_CLOSED";
        }
    }

    public static final class c extends b {
        public static final c j = new c();
        public static final int k = 0;

        public c() {
            super("net::ERR_CONNECTION_REFUSED", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 2018219755;
        }

        public String toString() {
            return "ERR_CONNECTION_REFUSED";
        }
    }

    public static final class d extends b {
        public static final d j = new d();
        public static final int k = 0;

        public d() {
            super("net::ERR_CONNECTION_RESET", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 976412714;
        }

        public String toString() {
            return "ERR_CONNECTION_RESET";
        }
    }

    public static final class e extends b {
        public static final e j = new e();
        public static final int k = 0;

        public e() {
            super("net::ERR_SOCKET_NOT_CONNECTED", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 1961158189;
        }

        public String toString() {
            return "ERR_SOCKET_NOT_CONNECTED";
        }
    }

    public /* synthetic */ b(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g
    public String c() {
        return this.h;
    }

    public b(String str) {
        super(-6, str, true, false, null);
        this.h = str;
    }
}
