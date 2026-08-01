package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.xg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4736xg {

    /* renamed from: com.ironsource.xg$a */
    public static final class a extends AbstractC4736xg {

        /* renamed from: a, reason: collision with root package name */
        private final LevelPlay.AdFormat f8765a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LevelPlay.AdFormat adFormat) {
            super(null);
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.f8765a = adFormat;
        }

        public final LevelPlay.AdFormat a() {
            return this.f8765a;
        }

        public final LevelPlay.AdFormat b() {
            return this.f8765a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f8765a == ((a) obj).f8765a;
        }

        public int hashCode() {
            return this.f8765a.hashCode();
        }

        public String toString() {
            return "EmptyPlacementsArray(adFormat=" + this.f8765a + ")";
        }

        public final a a(LevelPlay.AdFormat adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            return new a(adFormat);
        }

        public static /* synthetic */ a a(a aVar, LevelPlay.AdFormat adFormat, int i, Object obj) {
            if ((i & 1) != 0) {
                adFormat = aVar.f8765a;
            }
            return aVar.a(adFormat);
        }
    }

    /* renamed from: com.ironsource.xg$b */
    public static final class b extends AbstractC4736xg {

        /* renamed from: a, reason: collision with root package name */
        private final LevelPlay.AdFormat f8766a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LevelPlay.AdFormat adFormat) {
            super(null);
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.f8766a = adFormat;
        }

        public final LevelPlay.AdFormat a() {
            return this.f8766a;
        }

        public final LevelPlay.AdFormat b() {
            return this.f8766a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f8766a == ((b) obj).f8766a;
        }

        public int hashCode() {
            return this.f8766a.hashCode();
        }

        public String toString() {
            return "MissingPlacements(adFormat=" + this.f8766a + ")";
        }

        public final b a(LevelPlay.AdFormat adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            return new b(adFormat);
        }

        public static /* synthetic */ b a(b bVar, LevelPlay.AdFormat adFormat, int i, Object obj) {
            if ((i & 1) != 0) {
                adFormat = bVar.f8766a;
            }
            return bVar.a(adFormat);
        }
    }

    public /* synthetic */ AbstractC4736xg(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC4736xg() {
    }
}
