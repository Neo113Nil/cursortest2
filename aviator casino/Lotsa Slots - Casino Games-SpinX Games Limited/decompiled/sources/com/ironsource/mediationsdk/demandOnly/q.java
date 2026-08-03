package com.ironsource.mediationsdk.demandOnly;

/* loaded from: classes5.dex */
public interface q {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6433a;

        public a(java.lang.String adFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.f6433a = adFormat;
        }

        public final com.ironsource.mediationsdk.logger.IronSourceError a(com.ironsource.mediationsdk.demandOnly.h loadParams) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadParams, "loadParams");
            com.ironsource.mediationsdk.demandOnly.h.b bVar = (com.ironsource.mediationsdk.demandOnly.h.b) loadParams;
            if (bVar.f() == null) {
                return new com.ironsource.mediationsdk.logger.IronSourceError(1060, this.f6433a + " was initialized and loaded without Activity");
            }
            if (bVar.g() == null) {
                return new com.ironsource.mediationsdk.logger.IronSourceError(510, "Missing banner layout");
            }
            if (bVar.g().isDestroyed()) {
                return new com.ironsource.mediationsdk.logger.IronSourceError(510, "Banner layout is destroyed");
            }
            com.ironsource.mediationsdk.ISBannerSize size = bVar.g().getSize();
            if (size == null) {
                return new com.ironsource.mediationsdk.logger.IronSourceError(510, "Missing banner size");
            }
            if (com.ironsource.mediationsdk.j.f == size.getDescription() && (size.getHeight() <= 0 || size.getWidth() <= 0)) {
                return new com.ironsource.mediationsdk.logger.IronSourceError(510, "Unsupported banner size. Height and width must be bigger than 0");
            }
            if (bVar.e() == null) {
                return new com.ironsource.mediationsdk.logger.IronSourceError(510, "Missing instance Id");
            }
            java.lang.String b = bVar.b();
            if ((b == null || b.length() == 0) && loadParams.c()) {
                return new com.ironsource.mediationsdk.logger.IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f6434a;

        public b(java.lang.String adFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.f6434a = adFormat;
        }

        public final com.ironsource.mediationsdk.logger.IronSourceError a(com.ironsource.mediationsdk.demandOnly.h.d loadParams) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadParams, "loadParams");
            if (loadParams.d() == null) {
                return new com.ironsource.mediationsdk.logger.IronSourceError(1060, this.f6434a + " was initialized and loaded without Activity");
            }
            if (loadParams.e() == null) {
                return new com.ironsource.mediationsdk.logger.IronSourceError(510, "Missing instance Id");
            }
            java.lang.String b = loadParams.b();
            if ((b == null || b.length() == 0) && loadParams.c()) {
                return new com.ironsource.mediationsdk.logger.IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    com.ironsource.mediationsdk.logger.IronSourceError a();
}
