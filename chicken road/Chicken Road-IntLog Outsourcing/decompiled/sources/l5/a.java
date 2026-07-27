package l5;

import B0.o;
import android.media.AudioAttributes;
import java.util.Objects;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11062a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11063b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11064c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11065d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11066e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11067f;

    public a(boolean z, boolean z5, int i2, int i3, int i6, int i7) {
        this.f11062a = z;
        this.f11063b = z5;
        this.f11064c = i2;
        this.f11065d = i3;
        this.f11066e = i6;
        this.f11067f = i7;
    }

    public static a b(a aVar) {
        boolean z = aVar.f11062a;
        boolean z5 = aVar.f11063b;
        int i2 = aVar.f11064c;
        int i3 = aVar.f11065d;
        int i6 = aVar.f11066e;
        int i7 = aVar.f11067f;
        aVar.getClass();
        return new a(z, z5, i2, i3, i6, i7);
    }

    public final AudioAttributes a() {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(this.f11065d).setContentType(this.f11064c).build();
        i.d(build, "build(...)");
        return build;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f11062a == aVar.f11062a && this.f11063b == aVar.f11063b && this.f11064c == aVar.f11064c && this.f11065d == aVar.f11065d && this.f11066e == aVar.f11066e && this.f11067f == aVar.f11067f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f11062a), Boolean.valueOf(this.f11063b), Integer.valueOf(this.f11064c), Integer.valueOf(this.f11065d), Integer.valueOf(this.f11066e), Integer.valueOf(this.f11067f));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioContextAndroid(isSpeakerphoneOn=");
        sb.append(this.f11062a);
        sb.append(", stayAwake=");
        sb.append(this.f11063b);
        sb.append(", contentType=");
        sb.append(this.f11064c);
        sb.append(", usageType=");
        sb.append(this.f11065d);
        sb.append(", audioFocus=");
        sb.append(this.f11066e);
        sb.append(", audioMode=");
        return o.k(sb, this.f11067f, ')');
    }
}
