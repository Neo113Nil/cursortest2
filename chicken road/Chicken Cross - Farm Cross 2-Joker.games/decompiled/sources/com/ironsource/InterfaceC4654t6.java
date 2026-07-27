package com.ironsource;

import android.app.Activity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.t6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4654t6 {

    /* renamed from: com.ironsource.t6$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final c f8673a;

        public a(c strategyType) {
            Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            this.f8673a = strategyType;
        }

        public final c a() {
            return this.f8673a;
        }

        public final c b() {
            return this.f8673a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f8673a == ((a) obj).f8673a;
        }

        public int hashCode() {
            return this.f8673a.hashCode();
        }

        public String toString() {
            return "Config(strategyType=" + this.f8673a + ")";
        }

        public final a a(c strategyType) {
            Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            return new a(strategyType);
        }

        public static /* synthetic */ a a(a aVar, c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = aVar.f8673a;
            }
            return aVar.a(cVar);
        }
    }

    /* renamed from: com.ironsource.t6$b */
    public static final class b {

        /* renamed from: com.ironsource.t6$b$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f8674a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.SINGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_SHOW_SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.PROGRESSIVE_ON_LOAD_SUCCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f8674a = iArr;
            }
        }

        public final InterfaceC4654t6 a(C4577p0 adTools, a config, InterfaceC4583p6 fullscreenAdUnitFactory, InterfaceC4618r6 fullscreenAdUnitListener, InterfaceC4636s6 listener) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
            Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
            Intrinsics.checkNotNullParameter(listener, "listener");
            int i = a.f8674a[config.b().ordinal()];
            if (i == 1) {
                return new H6(adTools, config, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i == 2) {
                return new A6(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            if (i == 3) {
                return new C4672u6(adTools, fullscreenAdUnitFactory, fullscreenAdUnitListener, listener);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: com.ironsource.t6$c */
    public enum c {
        SINGLE("Single"),
        PROGRESSIVE_ON_SHOW_SUCCESS("OnShowSuccess"),
        PROGRESSIVE_ON_LOAD_SUCCESS("OnLoadSuccess");


        /* renamed from: a, reason: collision with root package name */
        private final String f8675a;

        c(String str) {
            this.f8675a = str;
        }

        public final String b() {
            return this.f8675a;
        }
    }

    void a(Activity activity);

    void loadAd();
}
