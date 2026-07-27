package G2;

import android.media.AudioAttributes;
import java.util.Objects;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f434a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f435b;

    /* renamed from: c, reason: collision with root package name */
    public final int f436c;

    /* renamed from: d, reason: collision with root package name */
    public final int f437d;

    /* renamed from: e, reason: collision with root package name */
    public final int f438e;
    public final int f;

    public a(boolean z3, boolean z4, int i3, int i4, int i5, int i6) {
        this.f434a = z3;
        this.f435b = z4;
        this.f436c = i3;
        this.f437d = i4;
        this.f438e = i5;
        this.f = i6;
    }

    public static a b(a aVar) {
        boolean z3 = aVar.f434a;
        boolean z4 = aVar.f435b;
        int i3 = aVar.f436c;
        int i4 = aVar.f437d;
        int i5 = aVar.f438e;
        int i6 = aVar.f;
        aVar.getClass();
        return new a(z3, z4, i3, i4, i5, i6);
    }

    public final AudioAttributes a() {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(this.f437d).setContentType(this.f436c).build();
        j.d(build, "build(...)");
        return build;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f434a == aVar.f434a && this.f435b == aVar.f435b && this.f436c == aVar.f436c && this.f437d == aVar.f437d && this.f438e == aVar.f438e && this.f == aVar.f;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f434a), Boolean.valueOf(this.f435b), Integer.valueOf(this.f436c), Integer.valueOf(this.f437d), Integer.valueOf(this.f438e), Integer.valueOf(this.f));
    }

    public final String toString() {
        return "AudioContextAndroid(isSpeakerphoneOn=" + this.f434a + ", stayAwake=" + this.f435b + ", contentType=" + this.f436c + ", usageType=" + this.f437d + ", audioFocus=" + this.f438e + ", audioMode=" + this.f + ')';
    }
}
