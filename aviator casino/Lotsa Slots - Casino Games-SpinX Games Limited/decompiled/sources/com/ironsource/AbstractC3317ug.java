package com.ironsource;

/* renamed from: com.ironsource.ug, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3317ug {

    /* renamed from: com.ironsource.ug$a */
    public static final class a extends com.ironsource.AbstractC3317ug {

        /* renamed from: a, reason: collision with root package name */
        private final com.unity3d.mediation.LevelPlay.AdFormat f6767a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.f6767a = adFormat;
        }

        public final com.unity3d.mediation.LevelPlay.AdFormat a() {
            return this.f6767a;
        }

        public final com.unity3d.mediation.LevelPlay.AdFormat b() {
            return this.f6767a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.AbstractC3317ug.a) && this.f6767a == ((com.ironsource.AbstractC3317ug.a) obj).f6767a;
        }

        public int hashCode() {
            return this.f6767a.hashCode();
        }

        public java.lang.String toString() {
            return "EmptyPlacementsArray(adFormat=" + this.f6767a + ")";
        }

        public final com.ironsource.AbstractC3317ug.a a(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            return new com.ironsource.AbstractC3317ug.a(adFormat);
        }

        public static /* synthetic */ com.ironsource.AbstractC3317ug.a a(com.ironsource.AbstractC3317ug.a aVar, com.unity3d.mediation.LevelPlay.AdFormat adFormat, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                adFormat = aVar.f6767a;
            }
            return aVar.a(adFormat);
        }
    }

    /* renamed from: com.ironsource.ug$b */
    public static final class b extends com.ironsource.AbstractC3317ug {

        /* renamed from: a, reason: collision with root package name */
        private final com.unity3d.mediation.LevelPlay.AdFormat f6768a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.f6768a = adFormat;
        }

        public final com.unity3d.mediation.LevelPlay.AdFormat a() {
            return this.f6768a;
        }

        public final com.unity3d.mediation.LevelPlay.AdFormat b() {
            return this.f6768a;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.ironsource.AbstractC3317ug.b) && this.f6768a == ((com.ironsource.AbstractC3317ug.b) obj).f6768a;
        }

        public int hashCode() {
            return this.f6768a.hashCode();
        }

        public java.lang.String toString() {
            return "MissingPlacements(adFormat=" + this.f6768a + ")";
        }

        public final com.ironsource.AbstractC3317ug.b a(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            return new com.ironsource.AbstractC3317ug.b(adFormat);
        }

        public static /* synthetic */ com.ironsource.AbstractC3317ug.b a(com.ironsource.AbstractC3317ug.b bVar, com.unity3d.mediation.LevelPlay.AdFormat adFormat, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                adFormat = bVar.f6768a;
            }
            return bVar.a(adFormat);
        }
    }

    public /* synthetic */ AbstractC3317ug(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC3317ug() {
    }
}
