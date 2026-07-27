package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public abstract class a extends g {
    public static final int i = 0;
    public final String h;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a$a, reason: collision with other inner class name */
    public static final class C1557a extends a {
        public static final C1557a j = new C1557a();
        public static final int k = 0;

        public C1557a() {
            super("net::ERR_CERT_AUTHORITY_INVALID", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof C1557a);
        }

        public int hashCode() {
            return -932810174;
        }

        public String toString() {
            return "ERR_CERT_AUTHORITY_INVALID";
        }
    }

    public /* synthetic */ a(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g
    public String c() {
        return this.h;
    }

    public a(String str) {
        super(0, str, false, true, null);
        this.h = str;
    }
}
