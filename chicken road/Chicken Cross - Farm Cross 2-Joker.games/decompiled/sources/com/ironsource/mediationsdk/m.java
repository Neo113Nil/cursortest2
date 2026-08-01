package com.ironsource.mediationsdk;

import com.ironsource.R7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8421a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(ISBannerSize bannerSize, R7 containerParams) {
            Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
            Intrinsics.checkNotNullParameter(containerParams, "containerParams");
            bannerSize.a(containerParams);
        }

        private a() {
        }
    }
}
