package Y;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5086c0;
import java.util.List;

/* loaded from: classes8.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final int f34504a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34505b;

    /* renamed from: c, reason: collision with root package name */
    private final List<InterfaceC5086c0.a> f34506c;

    /* renamed from: d, reason: collision with root package name */
    private final List<InterfaceC5086c0.c> f34507d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC5086c0.a f34508e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC5086c0.c f34509f;

    a(int i11, int i12, List<InterfaceC5086c0.a> list, List<InterfaceC5086c0.c> list2, InterfaceC5086c0.a aVar, InterfaceC5086c0.c cVar) {
        this.f34504a = i11;
        this.f34505b = i12;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f34506c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f34507d = list2;
        this.f34508e = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.f34509f = cVar;
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0
    public final int a() {
        return this.f34505b;
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0
    @NonNull
    public final List<InterfaceC5086c0.a> b() {
        return this.f34506c;
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0
    public final int c() {
        return this.f34504a;
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0
    @NonNull
    public final List<InterfaceC5086c0.c> d() {
        return this.f34507d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        a aVar = (a) fVar;
        if (this.f34504a != aVar.f34504a) {
            return false;
        }
        if (this.f34505b != aVar.f34505b || !this.f34506c.equals(aVar.f34506c) || !this.f34507d.equals(aVar.f34507d)) {
            return false;
        }
        InterfaceC5086c0.a aVar2 = this.f34508e;
        if (aVar2 == null) {
            if (fVar.f() != null) {
                return false;
            }
        } else if (!aVar2.equals(fVar.f())) {
            return false;
        }
        return this.f34509f.equals(fVar.g());
    }

    @Override // Y.f
    public final InterfaceC5086c0.a f() {
        return this.f34508e;
    }

    @Override // Y.f
    @NonNull
    public final InterfaceC5086c0.c g() {
        return this.f34509f;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f34504a ^ 1000003) * 1000003) ^ this.f34505b) * 1000003) ^ this.f34506c.hashCode()) * 1000003) ^ this.f34507d.hashCode()) * 1000003;
        InterfaceC5086c0.a aVar = this.f34508e;
        return ((hashCode ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003) ^ this.f34509f.hashCode();
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f34504a + ", recommendedFileFormat=" + this.f34505b + ", audioProfiles=" + this.f34506c + ", videoProfiles=" + this.f34507d + ", defaultAudioProfile=" + this.f34508e + ", defaultVideoProfile=" + this.f34509f + "}";
    }
}
