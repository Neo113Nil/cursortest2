package com.chartboost.sdk.impl;

import androidx.media3.exoplayer.ExoPlayer;
import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class qe {

    public static final class a extends qe {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f4976a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f4976a = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f4976a, ((a) obj).f4976a);
        }

        public int hashCode() {
            return this.f4976a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f4976a + ")";
        }
    }

    public static final class b extends qe {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4977a = new b();

        public b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 109869544;
        }

        public String toString() {
            return "Idle";
        }
    }

    public static final class c extends qe {

        /* renamed from: a, reason: collision with root package name */
        public final URL f4978a;
        public final ExoPlayer b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(URL url, ExoPlayer player) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(player, "player");
            this.f4978a = url;
            this.b = player;
        }

        @Override // com.chartboost.sdk.impl.qe
        public ExoPlayer a() {
            return this.b;
        }

        public final URL b() {
            return this.f4978a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f4978a, cVar.f4978a) && Intrinsics.areEqual(this.b, cVar.b);
        }

        public int hashCode() {
            return (this.f4978a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Loading(url=" + this.f4978a + ", player=" + this.b + ")";
        }
    }

    public static final class d extends qe {

        /* renamed from: a, reason: collision with root package name */
        public final URL f4979a;
        public final ExoPlayer b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(URL url, ExoPlayer player) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(player, "player");
            this.f4979a = url;
            this.b = player;
        }

        @Override // com.chartboost.sdk.impl.qe
        public ExoPlayer a() {
            return this.b;
        }

        public final URL b() {
            return this.f4979a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f4979a, dVar.f4979a) && Intrinsics.areEqual(this.b, dVar.b);
        }

        public int hashCode() {
            return (this.f4979a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Paused(url=" + this.f4979a + ", player=" + this.b + ")";
        }
    }

    public static final class e extends qe {

        /* renamed from: a, reason: collision with root package name */
        public final URL f4980a;
        public final ExoPlayer b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(URL url, ExoPlayer player) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(player, "player");
            this.f4980a = url;
            this.b = player;
        }

        @Override // com.chartboost.sdk.impl.qe
        public ExoPlayer a() {
            return this.b;
        }

        public final URL b() {
            return this.f4980a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.areEqual(this.f4980a, eVar.f4980a) && Intrinsics.areEqual(this.b, eVar.b);
        }

        public int hashCode() {
            return (this.f4980a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Playing(url=" + this.f4980a + ", player=" + this.b + ")";
        }
    }

    public static final class f extends qe {

        /* renamed from: a, reason: collision with root package name */
        public final URL f4981a;
        public final ExoPlayer b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(URL url, ExoPlayer player) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(player, "player");
            this.f4981a = url;
            this.b = player;
        }

        @Override // com.chartboost.sdk.impl.qe
        public ExoPlayer a() {
            return this.b;
        }

        public final URL b() {
            return this.f4981a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.areEqual(this.f4981a, fVar.f4981a) && Intrinsics.areEqual(this.b, fVar.b);
        }

        public int hashCode() {
            return (this.f4981a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Ready(url=" + this.f4981a + ", player=" + this.b + ")";
        }
    }

    public static final class g extends qe {

        /* renamed from: a, reason: collision with root package name */
        public static final g f4982a = new g();

        public g() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return 1919674705;
        }

        public String toString() {
            return "Released";
        }
    }

    public static final class h extends qe {

        /* renamed from: a, reason: collision with root package name */
        public final URL f4983a;
        public final ExoPlayer b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(URL url, ExoPlayer player) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(player, "player");
            this.f4983a = url;
            this.b = player;
        }

        @Override // com.chartboost.sdk.impl.qe
        public ExoPlayer a() {
            return this.b;
        }

        public final URL b() {
            return this.f4983a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Intrinsics.areEqual(this.f4983a, hVar.f4983a) && Intrinsics.areEqual(this.b, hVar.b);
        }

        public int hashCode() {
            return (this.f4983a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Stopped(url=" + this.f4983a + ", player=" + this.b + ")";
        }
    }

    public /* synthetic */ qe(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public ExoPlayer a() {
        return null;
    }

    public qe() {
    }
}
