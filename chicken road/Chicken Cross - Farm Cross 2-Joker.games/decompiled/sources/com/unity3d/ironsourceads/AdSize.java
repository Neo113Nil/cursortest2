package com.unity3d.ironsourceads;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.ironsource.mediationsdk.j;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class AdSize {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f11649a;
    private final int b;
    private final String c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final AdSize banner() {
            return new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50, j.f8411a, null);
        }

        @JvmStatic
        public final AdSize large() {
            return new AdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90, j.b, null);
        }

        @JvmStatic
        public final AdSize leaderboard() {
            return new AdSize(728, 90, j.d, null);
        }

        @JvmStatic
        public final AdSize mediumRectangle() {
            return new AdSize(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, j.g, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ AdSize(int i, int i2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str);
    }

    @JvmStatic
    public static final AdSize banner() {
        return Companion.banner();
    }

    @JvmStatic
    public static final AdSize large() {
        return Companion.large();
    }

    @JvmStatic
    public static final AdSize leaderboard() {
        return Companion.leaderboard();
    }

    @JvmStatic
    public static final AdSize mediumRectangle() {
        return Companion.mediumRectangle();
    }

    public final int getHeight() {
        return this.b;
    }

    public final String getSizeDescription() {
        return this.c;
    }

    public final int getWidth() {
        return this.f11649a;
    }

    private AdSize(int i, int i2, String str) {
        this.f11649a = i;
        this.b = i2;
        this.c = str;
    }
}
