package com.chartboost.sdk.impl;

import android.content.Context;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import java.io.File;
import java.net.URL;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class oe {

    public static final class a extends oe {

        /* renamed from: a, reason: collision with root package name */
        public final Context f4931a;
        public final URL b;
        public final w6 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, URL url, w6 cache) {
            super(null);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(cache, "cache");
            this.f4931a = context;
            this.b = url;
            this.c = cache;
        }

        public final w6 a() {
            return this.c;
        }

        public final Context b() {
            return this.f4931a;
        }

        public final URL c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f4931a, aVar.f4931a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c);
        }

        public int hashCode() {
            return (((this.f4931a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Load(context=" + this.f4931a + ", url=" + this.b + ", cache=" + this.c + ")";
        }
    }

    public static final class b extends oe {

        /* renamed from: a, reason: collision with root package name */
        public final File f4932a;
        public final ExoPlayer b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(File file, ExoPlayer player) {
            super(null);
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(player, "player");
            this.f4932a = file;
            this.b = player;
        }

        public final File a() {
            return this.f4932a;
        }

        public final ExoPlayer b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f4932a, bVar.f4932a) && Intrinsics.areEqual(this.b, bVar.b);
        }

        public int hashCode() {
            return (this.f4932a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "OnAssetCached(file=" + this.f4932a + ", player=" + this.b + ")";
        }
    }

    public static final class c extends oe {

        /* renamed from: a, reason: collision with root package name */
        public static final c f4933a = new c();

        public c() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 2063644930;
        }

        public String toString() {
            return "OnAssetEvicted";
        }
    }

    public static final class d extends oe {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f4934a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f4934a = error;
        }

        public final Throwable a() {
            return this.f4934a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.f4934a, ((d) obj).f4934a);
        }

        public int hashCode() {
            return this.f4934a.hashCode();
        }

        public String toString() {
            return "OnFailed(error=" + this.f4934a + ")";
        }
    }

    public static final class e extends oe {

        /* renamed from: a, reason: collision with root package name */
        public static final e f4935a = new e();

        public e() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 1259040565;
        }

        public String toString() {
            return "OnPlaybackEnded";
        }
    }

    public static final class f extends oe {

        /* renamed from: a, reason: collision with root package name */
        public final PlaybackException f4936a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(PlaybackException error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f4936a = error;
        }

        public final PlaybackException a() {
            return this.f4936a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.areEqual(this.f4936a, ((f) obj).f4936a);
        }

        public int hashCode() {
            return this.f4936a.hashCode();
        }

        public String toString() {
            return "OnPlayerError(error=" + this.f4936a + ")";
        }
    }

    public static final class g extends oe {

        /* renamed from: a, reason: collision with root package name */
        public final ExoPlayer f4937a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ExoPlayer player) {
            super(null);
            Intrinsics.checkNotNullParameter(player, "player");
            this.f4937a = player;
        }

        public final ExoPlayer a() {
            return this.f4937a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Intrinsics.areEqual(this.f4937a, ((g) obj).f4937a);
        }

        public int hashCode() {
            return this.f4937a.hashCode();
        }

        public String toString() {
            return "OnPlayerReady(player=" + this.f4937a + ")";
        }
    }

    public static final class h extends oe {

        /* renamed from: a, reason: collision with root package name */
        public static final h f4938a = new h();

        public h() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public int hashCode() {
            return -1967296085;
        }

        public String toString() {
            return "Pause";
        }
    }

    public static final class i extends oe {

        /* renamed from: a, reason: collision with root package name */
        public static final i f4939a = new i();

        public i() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public int hashCode() {
            return 1322022111;
        }

        public String toString() {
            return "Play";
        }
    }

    public static final class j extends oe {

        /* renamed from: a, reason: collision with root package name */
        public static final j f4940a = new j();

        public j() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return 1094867580;
        }

        public String toString() {
            return "Release";
        }
    }

    public static final class k extends oe {

        /* renamed from: a, reason: collision with root package name */
        public final float f4941a;

        public k(float f) {
            super(null);
            this.f4941a = f;
        }

        public final float a() {
            return this.f4941a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && Float.compare(this.f4941a, ((k) obj).f4941a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f4941a);
        }

        public String toString() {
            return "SetVolume(volume=" + this.f4941a + ")";
        }
    }

    public static final class l extends oe {

        /* renamed from: a, reason: collision with root package name */
        public final gh f4942a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(gh reason) {
            super(null);
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.f4942a = reason;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f4942a == ((l) obj).f4942a;
        }

        public int hashCode() {
            return this.f4942a.hashCode();
        }

        public String toString() {
            return "Stop(reason=" + this.f4942a + ")";
        }
    }

    public /* synthetic */ oe(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public oe() {
    }
}
