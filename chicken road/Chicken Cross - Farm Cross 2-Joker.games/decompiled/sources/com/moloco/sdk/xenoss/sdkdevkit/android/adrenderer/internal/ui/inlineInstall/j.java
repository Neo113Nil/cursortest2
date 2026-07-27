package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import com.inmobi.unification.sdk.InitializationStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f11165a = 0;

    public static final class a extends j {
        public static final a b = new a();
        public static final int c = 0;

        public a() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1425206400;
        }

        public String toString() {
            return "Backgrounded";
        }
    }

    public static final class b extends j {
        public static final b b = new b();
        public static final int c = 0;

        public b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -296757611;
        }

        public String toString() {
            return "Fallback";
        }
    }

    public static final class c extends j {
        public static final c b = new c();
        public static final int c = 0;

        public c() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1208562192;
        }

        public String toString() {
            return InitializationStatus.SUCCESS;
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public j() {
    }
}
